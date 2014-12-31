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

package org.echocat.locela.api.java.messages;

import org.junit.Test;

import static java.util.Locale.GERMANY;
import static java.util.Locale.US;
import static org.echocat.jomon.testing.BaseMatchers.is;
import static org.echocat.locela.api.java.messages.PropertyMessage.messageFor;
import static org.echocat.locela.api.java.properties.StandardProperty.property;
import static org.junit.Assert.assertThat;

public class PropertyMessageUnitTest {

    @Test
    public void testGetLocale() throws Exception {
        assertThat(messageFor(US, property("foo")).getLocale(), is(US));
        assertThat(messageFor(GERMANY, property("foo")).getLocale(), is(GERMANY));
    }

    @Test
    public void testGet() throws Exception {
        assertThat(messageFor(US, property("foo").set("bar")).get(), is("bar"));
        assertThat(messageFor(GERMANY, property("foo").set("bar")).get(), is("bar"));

        assertThat(messageFor(US, property("foo")).get(), is(""));
        assertThat(messageFor(GERMANY, property("foo")).get(), is(""));
    }

    @Test
    public void testGetId() throws Exception {
        assertThat(messageFor(US, property("foo")).getId(), is("foo"));
        assertThat(messageFor(GERMANY, property("foo")).getId(), is("foo"));
    }
}