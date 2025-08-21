package com.scandit.datacapture.core.ui.viewfinder;

import com.scandit.datacapture.core.common.geometry.FloatWithUnit;
import com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeRectangularViewfinder;
import com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeViewfinder;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyAdapter;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\ba\u0018\u00002\u00020\u0001J\b\u0010#\u001a\u00020$H'J\b\u0010%\u001a\u00020&H\u0017J\u0018\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u000fH'J\u0018\u0010,\u001a\u00020(2\u0006\u0010-\u001a\u00020\u000f2\u0006\u0010.\u001a\u00020\u000fH'J\u0018\u0010/\u001a\u00020(2\u0006\u00100\u001a\u00020*2\u0006\u00101\u001a\u00020\u000fH'R(\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u00038g@gX¦\u000e¢\u0006\f\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\n\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\t8g@gX¦\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u000f8g@gX¦\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\t8g@gX¦\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR$\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u000f8g@gX¦\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u0014R\u0014\u0010\u001b\u001a\u00020\u001c8gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020 8gX¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u00062"}, d2 = {"Lcom/scandit/datacapture/core/ui/viewfinder/RectangularViewfinderProxy;", "Lcom/scandit/datacapture/core/ui/viewfinder/Viewfinder;", "<set-?>", "Lcom/scandit/datacapture/core/ui/viewfinder/RectangularViewfinderAnimation;", "animation", "getAnimation", "()Lcom/scandit/datacapture/core/ui/viewfinder/RectangularViewfinderAnimation;", "setAnimation", "(Lcom/scandit/datacapture/core/ui/viewfinder/RectangularViewfinderAnimation;)V", "", "color", "getColor", "()I", "setColor", "(I)V", "", "dimming", "getDimming", "()F", "setDimming", "(F)V", "disabledColor", "getDisabledColor", "setDisabledColor", "disabledDimming", "getDisabledDimming", "setDisabledDimming", "lineStyle", "Lcom/scandit/datacapture/core/ui/viewfinder/RectangularViewfinderLineStyle;", "getLineStyle", "()Lcom/scandit/datacapture/core/ui/viewfinder/RectangularViewfinderLineStyle;", "style", "Lcom/scandit/datacapture/core/ui/viewfinder/RectangularViewfinderStyle;", "getStyle", "()Lcom/scandit/datacapture/core/ui/viewfinder/RectangularViewfinderStyle;", "_impl", "Lcom/scandit/datacapture/core/internal/sdk/ui/viewfinder/NativeRectangularViewfinder;", "_viewfinderImpl", "Lcom/scandit/datacapture/core/internal/sdk/ui/viewfinder/NativeViewfinder;", "setHeightAndAspectRatio", "", "height", "Lcom/scandit/datacapture/core/common/geometry/FloatWithUnit;", "widthToHeightAspect", "setShorterDimensionAndAspectRatio", "shorterDimension", "aspect", "setWidthAndAspectRatio", "width", "heightToWidthAspect", "scandit-capture-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ProxyAdapter(NativeRectangularViewfinder.class)
/* loaded from: classes12.dex */
public interface RectangularViewfinderProxy extends Viewfinder {
    @NativeImpl
    NativeRectangularViewfinder _impl();

    @Override // com.scandit.datacapture.core.ui.viewfinder.Viewfinder
    @NativeImpl
    /* renamed from: _viewfinderImpl */
    NativeViewfinder getF127129c();

    @ProxyFunction(property = "animation")
    RectangularViewfinderAnimation getAnimation();

    @ProxyFunction(property = "color")
    int getColor();

    @ProxyFunction(property = "dimming")
    float getDimming();

    @ProxyFunction(property = "disabledColor")
    int getDisabledColor();

    @ProxyFunction(property = "disabledDimming")
    float getDisabledDimming();

    @ProxyFunction(property = "lineStyle")
    RectangularViewfinderLineStyle getLineStyle();

    @ProxyFunction(property = "style")
    RectangularViewfinderStyle getStyle();

    @ProxyFunction(property = "animation")
    void setAnimation(RectangularViewfinderAnimation rectangularViewfinderAnimation);

    @ProxyFunction(property = "color")
    void setColor(int i10);

    @ProxyFunction(property = "dimming")
    void setDimming(float f10);

    @ProxyFunction(property = "disabledColor")
    void setDisabledColor(int i10);

    @ProxyFunction(property = "disabledDimming")
    void setDisabledDimming(float f10);

    @ProxyFunction
    void setHeightAndAspectRatio(FloatWithUnit height, float widthToHeightAspect);

    @ProxyFunction
    void setShorterDimensionAndAspectRatio(float shorterDimension, float aspect);

    @ProxyFunction
    void setWidthAndAspectRatio(FloatWithUnit width, float heightToWidthAspect);

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        @NativeImpl
        public static NativeViewfinder _viewfinderImpl(RectangularViewfinderProxy rectangularViewfinderProxy) {
            NativeViewfinder nativeViewfinderAsViewfinder = rectangularViewfinderProxy._impl().asViewfinder();
            Intrinsics.i(nativeViewfinderAsViewfinder, "asViewfinder(...)");
            return nativeViewfinderAsViewfinder;
        }
    }
}
