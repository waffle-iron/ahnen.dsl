/*
 * generated by Xtext 2.10.0
 */
package com.github.funthomas424242.dsl.generator

import com.github.funthomas424242.dsl.ahnen.Familienbuch
import com.github.funthomas424242.dsl.generator.database.DataXMLGenerator
import com.github.funthomas424242.dsl.generator.docbook.BookGenerator
import com.github.funthomas424242.dsl.generator.docbook.POMGenerator
import java.io.File
import java.io.FileInputStream
import java.nio.file.Files
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class AhnenGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		for (buch : resource.allContents.toIterable.filter(Familienbuch)) {
		    // generate gramps database
			fsa.generateFile(Helper.getGrampsDBFileName(buch),DataXMLGenerator.createGrampsDBContent(buch));
			var URI grampsDbfileURI=fsa.getURI(Helper.getGrampsDBFileName(buch));
			var File grampsDbfileFile = Helper.convertURI2File(buch,grampsDbfileURI);
			var File mediaFolderFile = Helper.getMediaFolderFile(buch,fsa);
			mediaFolderFile.mkdirs();
			var File grampsArchiveFileTmp = Files.createTempFile("gramps",null).toFile();
		    Helper.createTarGZ(grampsArchiveFileTmp, grampsDbfileFile ,mediaFolderFile);
		    var FileInputStream fIn = new FileInputStream(grampsArchiveFileTmp);
		    fsa.generateFile(Helper.getGrampsArchiveFileName(buch),fIn);
		    // generate docbook project
			fsa.generateFile(Helper.getPOMFileName(buch), POMGenerator.createPOMContent(buch))
			fsa.generateFile(Helper.getDbkFileName(buch, "book.dbk"), BookGenerator.createBookContent(fsa, buch))
		}
	}
}
