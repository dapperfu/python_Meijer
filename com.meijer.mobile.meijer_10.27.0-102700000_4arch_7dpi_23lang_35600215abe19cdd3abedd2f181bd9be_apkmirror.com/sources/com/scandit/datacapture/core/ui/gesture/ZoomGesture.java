package com.scandit.datacapture.core.ui.gesture;

import com.scandit.datacapture.core.internal.module.ui.NativeZoomGesture;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyBaseClass;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import kotlin.Metadata;

@ProxyBaseClass(NativeZoomGesture.class)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H'J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\t\u001a\u00020\nH'J\b\u0010\u000b\u001a\u00020\u0005H&J\b\u0010\f\u001a\u00020\u0005H&¨\u0006\r"}, d2 = {"Lcom/scandit/datacapture/core/ui/gesture/ZoomGesture;", "", "_zoomGestureImpl", "Lcom/scandit/datacapture/core/internal/module/ui/NativeZoomGesture;", "addListener", "", "listener", "Lcom/scandit/datacapture/core/ui/gesture/ZoomGestureListener;", "removeListener", "toJson", "", "triggerZoomIn", "triggerZoomOut", "scandit-capture-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface ZoomGesture {
    @NativeImpl
    NativeZoomGesture _zoomGestureImpl();

    void addListener(ZoomGestureListener listener);

    void removeListener(ZoomGestureListener listener);

    @ProxyFunction(nativeName = "toJson")
    String toJson();

    void triggerZoomIn();

    void triggerZoomOut();
}
