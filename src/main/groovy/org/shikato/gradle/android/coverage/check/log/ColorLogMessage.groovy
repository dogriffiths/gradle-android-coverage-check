package org.shikato.gradle.android.coverage.check.log

import org.shikato.gradle.android.coverage.check.util.ErrorValue

/**
 * ColorLogMessage.groovy
 *
 * Copyright (c) 2016 shikato
 *
 * This software is released under the MIT license.
 * http://opensource.org/licenses/mit-license.html
 */

class ColorLogMessage {

    private static final String RELEASE = "\u001b[m";
    private static final String RED_BOLD_CHAR = "\u001b[31;1m";
    private static final String GREEN_BOLD_CHAR = "\u001b[32;1m";
    private static final String YELLOW_BOLD_CHAR = "\u001b[33;1m";
    private static final String WHITE_BOLD_CHAR = "\u001b[1m";

    public static String boldWhite(String message) {
        if (message == null) return ErrorValue.STRING;
        return WHITE_BOLD_CHAR + message + RELEASE;
    }

    public static String boldRed(String message) {
        if (message == null) return ErrorValue.STRING;
        return RED_BOLD_CHAR + message + RELEASE;
    }

    public static String boldGreen(String message) {
        if (message == null) return ErrorValue.STRING;
        return GREEN_BOLD_CHAR + message + RELEASE;
    }

    public static String boldYellow(String message) {
        if (message == null) return ErrorValue.STRING;
        return YELLOW_BOLD_CHAR + message + RELEASE;
    }
}

