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

package org.echocat.locela.api.java.properties;

import org.echocat.locela.api.java.annotations.AnnotationContainer;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public interface Property<V> extends AnnotationContainer {

    @Nonnull
    public String getId();

    @Nullable
    public V get();

    public Property<V> set(@Nullable V content) throws IllegalArgumentException;

    public Class<V> getType();

}
