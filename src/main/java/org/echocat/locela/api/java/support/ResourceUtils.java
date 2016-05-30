/*****************************************************************************************
 * *** BEGIN LICENSE BLOCK *****
 *
 * Version: MPL 2.0
 *
 * echocat Locela - API for Java, Copyright (c) 2014-2016 echocat
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 *
 * *** END LICENSE BLOCK *****
 ****************************************************************************************/

package org.echocat.locela.api.java.support;

import javax.annotation.Nullable;

public class ResourceUtils {

    public static void closeQuietlyIfAutoCloseable(@Nullable Object autoCloseable) {
        try {
            if (autoCloseable instanceof AutoCloseable) {
                ((AutoCloseable)autoCloseable).close();
            }
        } catch (final Exception ignored) {}
    }

    public static void closeQuietly(@Nullable AutoCloseable autoCloseable) {
        closeQuietlyIfAutoCloseable(autoCloseable);
    }

    public static void closeQuietlyIfAutoCloseable(@Nullable Iterable<?> elements) {
        try {
            if (elements != null) {
                for (final Object element : elements) {
                    closeQuietlyIfAutoCloseable(element);
                }
            }
        } catch (final Exception ignored) {}
    }

    public static void closeQuietly(@Nullable Iterable<? extends AutoCloseable> elements) {
        closeQuietlyIfAutoCloseable(elements);
    }

    public static void closeQuietlyIfAutoCloseable(@Nullable Object... elements) {
        try {
            if (elements != null) {
                for (final Object element : elements) {
                    closeQuietlyIfAutoCloseable(element);
                }
            }
        } catch (final Exception ignored) {}
    }

    public static void closeQuietly(@Nullable AutoCloseable... elements) {
        //noinspection ConfusingArgumentToVarargsMethod
        closeQuietlyIfAutoCloseable(elements);
    }

    private ResourceUtils() {}
}
