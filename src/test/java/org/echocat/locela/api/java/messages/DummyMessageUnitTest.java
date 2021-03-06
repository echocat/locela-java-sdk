/*****************************************************************************************
 * *** BEGIN LICENSE BLOCK *****
 *
 * Version: MPL 2.0
 *
 * echocat Locela - API for Java, Copyright (c) 2014-2015 echocat
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 *
 * *** END LICENSE BLOCK *****
 ****************************************************************************************/

package org.echocat.locela.api.java.messages;

import org.junit.Test;

import java.io.StringWriter;

import static java.util.Locale.GERMANY;
import static java.util.Locale.US;
import static org.echocat.locela.api.java.testing.Assert.assertThat;
import static org.echocat.locela.api.java.testing.BaseMatchers.is;

public class DummyMessageUnitTest {

    @Test
    public void testGet() throws Exception {
        assertThat(new DummyMessage(US, "foo").get(), is(""));
        assertThat(new DummyMessage("foo").get(), is(""));
    }

    @Test
    public void testFormat() throws Exception {
        try (final StringWriter writer = new StringWriter()) {
            new DummyMessage(US, "foo").format(new Object(), writer);
            assertThat(writer.toString(), is(""));
        }
    }

    @Test
    public void testGetLocale() throws Exception {
        assertThat(new DummyMessage("foo").getLocale(), is(null));
        assertThat(new DummyMessage(null, "foo").getLocale(), is(null));
        assertThat(new DummyMessage(GERMANY, "foo").getLocale(), is(GERMANY));
    }

    @Test
    public void testGetId() throws Exception {
        assertThat(new DummyMessage(US, "foo").getId(), is("foo"));
        assertThat(new DummyMessage("foo").getId(), is("foo"));
    }
}