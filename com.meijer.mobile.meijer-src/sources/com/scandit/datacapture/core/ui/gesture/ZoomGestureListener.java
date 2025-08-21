package com.scandit.datacapture.core.ui.gesture;

import com.scandit.datacapture.core.internal.module.ui.NativeZoomGestureListener;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import com.scandit.datacapture.tools.internal.sdk.ProxyReversedAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@ProxyReversedAdapter(owner = ZoomGesture.class, value = NativeZoomGestureListener.class)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0017J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0017¨\u0006\u0007"}, d2 = {"Lcom/scandit/datacapture/core/ui/gesture/ZoomGestureListener;", "", "onZoomInGesture", "", "zoomGesture", "Lcom/scandit/datacapture/core/ui/gesture/ZoomGesture;", "onZoomOutGesture", "scandit-capture-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface ZoomGestureListener {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        @ProxyFunction(nativeName = "onZoomInGesture")
        public static void onZoomInGesture(ZoomGestureListener zoomGestureListener, ZoomGesture zoomGesture) {
            Intrinsics.j(zoomGesture, "zoomGesture");
        }

        @ProxyFunction(nativeName = "onZoomOutGesture")
        public static void onZoomOutGesture(ZoomGestureListener zoomGestureListener, ZoomGesture zoomGesture) {
            Intrinsics.j(zoomGesture, "zoomGesture");
        }
    }

    @ProxyFunction(nativeName = "onZoomInGesture")
    void onZoomInGesture(ZoomGesture zoomGesture);

    @ProxyFunction(nativeName = "onZoomOutGesture")
    void onZoomOutGesture(ZoomGesture zoomGesture);
}
