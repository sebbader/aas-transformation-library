/* Copyright (C)2021 SAP SE or an affiliate company and aas-transformation-library contributors. All rights reserved. */
package com.sap.dsc.aas.lib.aml.exceptions;

public abstract class InvalidConfigException extends IllegalStateException {

    private static final long serialVersionUID = 1675163389134334330L;

    public InvalidConfigException(String message) {
        super(message);
    }

}