package com.fullstory.instrumentation.frameworks.compose;

import android.graphics.Canvas;

/* loaded from: classes14.dex */
public interface FSComposeLayoutNode {
    FSComposeSemanticsConfiguration _fsGetCollapsedSemantics();

    FSComposeLayoutCoordinates _fsGetCoordinates();

    int _fsGetHeight();

    FSComposeModifier _fsGetModifier();

    FSComposeNodeCoordinator _fsGetOuterCoordinator();

    Object _fsGetOwner();

    FSComposeLayoutNode _fsGetParent();

    FSComposeSemanticsConfiguration _fsGetSemanticsConfiguration(FSComposeSemanticsModifier fSComposeSemanticsModifier);

    int _fsGetSemanticsId();

    int _fsGetWidth();

    boolean _fsIsAttached();

    boolean _fsIsDeactivated();

    FSComposeCanvas _fsWrapCanvas(Canvas canvas);
}
