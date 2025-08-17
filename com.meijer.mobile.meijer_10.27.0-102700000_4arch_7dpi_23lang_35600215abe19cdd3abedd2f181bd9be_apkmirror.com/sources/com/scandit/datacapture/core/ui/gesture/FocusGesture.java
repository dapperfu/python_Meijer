package com.scandit.datacapture.core.ui.gesture;

import com.scandit.datacapture.core.common.geometry.PointWithUnit;
import com.scandit.datacapture.core.internal.module.ui.NativeFocusGesture;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyBaseClass;
import kotlin.Metadata;

@ProxyBaseClass(NativeFocusGesture.class)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\b\u001a\u00020\tH'J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH&J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH&J\b\u0010\u000f\u001a\u00020\u0010H&J\u0010\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0013H&R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/scandit/datacapture/core/ui/gesture/FocusGesture;", "", "showUIIndicator", "", "getShowUIIndicator", "()Z", "setShowUIIndicator", "(Z)V", "_focusGestureImpl", "Lcom/scandit/datacapture/core/internal/module/ui/NativeFocusGesture;", "addListener", "", "listener", "Lcom/scandit/datacapture/core/ui/gesture/FocusGestureListener;", "removeListener", "toJson", "", "triggerFocus", "point", "Lcom/scandit/datacapture/core/common/geometry/PointWithUnit;", "scandit-capture-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface FocusGesture {
    @NativeImpl
    NativeFocusGesture _focusGestureImpl();

    void addListener(FocusGestureListener listener);

    boolean getShowUIIndicator();

    void removeListener(FocusGestureListener listener);

    void setShowUIIndicator(boolean z10);

    String toJson();

    void triggerFocus(PointWithUnit point);
}
