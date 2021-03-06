/*****************************************************************************************
 * *** BEGIN LICENSE BLOCK *****
 *
 * Version: MPL 2.0
 *
 * echocat Locela - API for Java, Copyright (c) 2014 echocat
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 *
 * *** END LICENSE BLOCK *****
 ****************************************************************************************/

package org.echocat.locela.api.java.format;

import javax.annotation.Nullable;
import javax.annotation.concurrent.ThreadSafe;
import java.util.Locale;

@ThreadSafe
public abstract class FormatterSupport implements Formatter {

    @Nullable
    private final Locale _locale;

    public FormatterSupport(@Nullable Locale locale) {
        _locale = locale;
    }

    @Override
    @Nullable
    public Locale getLocale() {
        return _locale;
    }

}
