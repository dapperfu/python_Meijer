package com.scandit.datacapture.core.ui.gesture;

import com.scandit.datacapture.core.internal.module.ui.NativeSwipeToZoom;
import com.scandit.datacapture.core.internal.module.ui.NativeZoomGesture;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyAdapter;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H'J\b\u0010\u0004\u001a\u00020\u0005H'J\b\u0010\u0006\u001a\u00020\u0007H'J\b\u0010\b\u001a\u00020\tH'J\b\u0010\n\u001a\u00020\tH'¨\u0006\u000b"}, d2 = {"Lcom/scandit/datacapture/core/ui/gesture/SwipeToZoomProxy;", "", "_impl", "Lcom/scandit/datacapture/core/internal/module/ui/NativeSwipeToZoom;", "_zoomGestureImpl", "Lcom/scandit/datacapture/core/internal/module/ui/NativeZoomGesture;", "toJson", "", "triggerZoomIn", "", "triggerZoomOut", "scandit-capture-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ProxyAdapter(NativeSwipeToZoom.class)
/* loaded from: classes11.dex */
public interface SwipeToZoomProxy {
    @NativeImpl
    NativeSwipeToZoom _impl();

    @NativeImpl
    NativeZoomGesture _zoomGestureImpl();

    @ProxyFunction(nativeName = "toJson")
    String toJson();

    @ProxyFunction(nativeName = "triggerZoomIn")
    void triggerZoomIn();

    @ProxyFunction(nativeName = "triggerZoomOut")
    void triggerZoomOut();
}
