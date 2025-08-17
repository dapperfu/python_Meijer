package com.scandit.datacapture.core.ui.viewfinder;

import com.scandit.datacapture.core.common.geometry.FloatWithUnit;
import com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeLaserlineViewfinder;
import com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeViewfinder;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyAdapter;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\ba\u0018\u00002\u00020\u0001J\b\u0010\u0012\u001a\u00020\u0013H'J\b\u0010\u0014\u001a\u00020\u0015H\u0017R$\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00038g@gX¦\u000e¢\u0006\f\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00038g@gX¦\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR$\u0010\r\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\f8g@gX¦\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/scandit/datacapture/core/ui/viewfinder/LaserlineViewfinderProxy;", "Lcom/scandit/datacapture/core/ui/viewfinder/Viewfinder;", "<set-?>", "", "disabledColor", "getDisabledColor", "()I", "setDisabledColor", "(I)V", "enabledColor", "getEnabledColor", "setEnabledColor", "Lcom/scandit/datacapture/core/common/geometry/FloatWithUnit;", "width", "getWidth", "()Lcom/scandit/datacapture/core/common/geometry/FloatWithUnit;", "setWidth", "(Lcom/scandit/datacapture/core/common/geometry/FloatWithUnit;)V", "_impl", "Lcom/scandit/datacapture/core/internal/sdk/ui/viewfinder/NativeLaserlineViewfinder;", "_viewfinderImpl", "Lcom/scandit/datacapture/core/internal/sdk/ui/viewfinder/NativeViewfinder;", "scandit-capture-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ProxyAdapter(NativeLaserlineViewfinder.class)
/* loaded from: classes11.dex */
public interface LaserlineViewfinderProxy extends Viewfinder {
    @NativeImpl
    NativeLaserlineViewfinder _impl();

    @Override // com.scandit.datacapture.core.ui.viewfinder.Viewfinder
    @NativeImpl
    NativeViewfinder _viewfinderImpl();

    @ProxyFunction(property = "disabledColor")
    int getDisabledColor();

    @ProxyFunction(property = "enabledColor")
    int getEnabledColor();

    @ProxyFunction(property = "width")
    FloatWithUnit getWidth();

    @ProxyFunction(property = "disabledColor")
    void setDisabledColor(int i10);

    @ProxyFunction(property = "enabledColor")
    void setEnabledColor(int i10);

    @ProxyFunction(property = "width")
    void setWidth(FloatWithUnit floatWithUnit);

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        @NativeImpl
        public static NativeViewfinder _viewfinderImpl(LaserlineViewfinderProxy laserlineViewfinderProxy) {
            NativeViewfinder nativeViewfinderAsViewfinder = laserlineViewfinderProxy._impl().asViewfinder();
            Intrinsics.i(nativeViewfinderAsViewfinder, "asViewfinder(...)");
            return nativeViewfinderAsViewfinder;
        }
    }
}
