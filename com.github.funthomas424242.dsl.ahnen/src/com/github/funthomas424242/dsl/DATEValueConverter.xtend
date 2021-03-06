package com.github.funthomas424242.dsl;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.conversion.impl.AbstractLexerBasedConverter;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.parser.ParseException;

public class DATEValueConverter extends AbstractLexerBasedConverter<Date> {

	override
	public String toEscapedString(Date value) {
		return value.toString();
	}

	override
	protected void assertValidValue(Date value) {
		super.assertValidValue(value);
	}

	override
	public Date toValue(String string, INode node) {
		// val String stripped = string.substring(1, string.length() - 1);
		val String stripped = string;
		try {
			return new SimpleDateFormat("dd.MM.yyyy").parse(stripped);
		} catch (ParseException e) {
			//System.out.println("HIER");
			throw new ValueConverterException(string, node, e);
		}
	}

}
