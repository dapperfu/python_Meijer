package com.fullstory.instrumentation.frameworks.compose;

import java.util.List;

/* loaded from: classes14.dex */
public interface FSComposeSemanticsConfiguration {
    List _fsGetContentDescription();

    FSComposeAnnotatedString _fsGetEditableText();

    FSComposeRole _fsGetRole();

    Object _fsGetTestTag();

    List _fsGetText();

    boolean _fsIsDisabled();

    boolean _fsIsFocused();

    boolean _fsIsPassword();

    boolean _fsIsTextField();
}
