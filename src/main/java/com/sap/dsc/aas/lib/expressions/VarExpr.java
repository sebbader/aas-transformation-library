package com.sap.dsc.aas.lib.expressions;

import com.sap.dsc.aas.lib.mapping.TransformationContext;

/**
 * Represents the value of a named variable.
 */
public class VarExpr implements Expression {
	/**
	 * The variable's name.
	 */
	protected final String name;

	public VarExpr(String name) {
		this.name = name;
	}

	public String name() {
		return name;
	}

	@Override
	public Object evaluate(TransformationContext ctx) {
		return ctx.getVariables().get(name);
	}
}