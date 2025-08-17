package com.scandit.datacapture.core.ui.gesture;

import com.scandit.datacapture.core.common.geometry.PointWithUnit;
import com.scandit.datacapture.core.internal.module.ui.NativeFocusGestureListener;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import com.scandit.datacapture.tools.internal.sdk.ProxyReversedAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@ProxyReversedAdapter(owner = FocusGesture.class, value = NativeFocusGestureListener.class)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0017¨\u0006\b"}, d2 = {"Lcom/scandit/datacapture/core/ui/gesture/FocusGestureListener;", "", "onFocusGesture", "", "focusGesture", "Lcom/scandit/datacapture/core/ui/gesture/FocusGesture;", "point", "Lcom/scandit/datacapture/core/common/geometry/PointWithUnit;", "scandit-capture-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface FocusGestureListener {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        @ProxyFunction(nativeName = "onFocusGesture")
        public static void onFocusGesture(FocusGestureListener focusGestureListener, FocusGesture focusGesture, PointWithUnit point) {
            Intrinsics.j(focusGesture, "focusGesture");
            Intrinsics.j(point, "point");
        }
    }

    @ProxyFunction(nativeName = "onFocusGesture")
    void onFocusGesture(FocusGesture focusGesture, PointWithUnit point);
}
