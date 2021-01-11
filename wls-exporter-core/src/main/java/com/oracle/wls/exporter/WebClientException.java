// Copyright (c) 2017, 2020, Oracle and/or its affiliates.
// Licensed under the Universal Permissive License v 1.0 as shown at https://oss.oracle.com/licenses/upl.

package com.oracle.wls.exporter;

/**
 * An exception generated by the web client.
 */
public class WebClientException extends RuntimeException {
    WebClientException() {}

    public WebClientException(String message) {
        super(message);
    }

    WebClientException(Throwable cause, String message, Object... args) {
        super(formatMessage(message, args), cause);
    }

    private static String formatMessage(String message, Object... args) {
        return String.format(message, args);
    }
}
