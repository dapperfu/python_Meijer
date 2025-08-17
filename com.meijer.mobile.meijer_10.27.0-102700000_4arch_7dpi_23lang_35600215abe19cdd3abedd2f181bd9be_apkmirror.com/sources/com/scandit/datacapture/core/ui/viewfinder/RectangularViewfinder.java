package com.scandit.datacapture.core.ui.viewfinder;

import com.scandit.datacapture.core.common.geometry.FloatWithUnit;
import com.scandit.datacapture.core.common.geometry.SizeWithUnit;
import com.scandit.datacapture.core.common.geometry.SizeWithUnitAndAspect;
import com.scandit.datacapture.core.internal.sdk.common.geometry.NativeSizeWithUnitAndAspect;
import com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeRectangularViewfinder;
import com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeViewfinder;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\u000f\b\u0000\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010,\u001a\u00020\tH\u0097\u0001J\t\u0010-\u001a\u00020.H\u0097\u0001J\u0019\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\u0018H\u0097\u0001J\u0019\u00104\u001a\u0002002\u0006\u00105\u001a\u00020\u00182\u0006\u00106\u001a\u00020\u0018H\u0097\u0001J\u000e\u00107\u001a\u0002002\u0006\u00108\u001a\u000209J\u0019\u0010:\u001a\u0002002\u0006\u0010;\u001a\u0002022\u0006\u0010<\u001a\u00020\u0018H\u0097\u0001R(\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\f8W@WX\u0096\u000f¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\u00128W@WX\u0096\u000f¢\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000b\u001a\u00020\u00188W@WX\u0096\u000f¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\u00128W@WX\u0096\u000f¢\u0006\f\u001a\u0004\b\u001f\u0010\u0015\"\u0004\b \u0010\u0017R$\u0010!\u001a\u00020\u00182\u0006\u0010\u000b\u001a\u00020\u00188W@WX\u0096\u000f¢\u0006\f\u001a\u0004\b\"\u0010\u001b\"\u0004\b#\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00068WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0011\u0010&\u001a\u00020'8F¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0014\u0010\u0003\u001a\u00020\u00048WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u0006="}, d2 = {"Lcom/scandit/datacapture/core/ui/viewfinder/RectangularViewfinder;", "Lcom/scandit/datacapture/core/ui/viewfinder/Viewfinder;", "Lcom/scandit/datacapture/core/ui/viewfinder/RectangularViewfinderProxy;", "style", "Lcom/scandit/datacapture/core/ui/viewfinder/RectangularViewfinderStyle;", "lineStyle", "Lcom/scandit/datacapture/core/ui/viewfinder/RectangularViewfinderLineStyle;", "(Lcom/scandit/datacapture/core/ui/viewfinder/RectangularViewfinderStyle;Lcom/scandit/datacapture/core/ui/viewfinder/RectangularViewfinderLineStyle;)V", "impl", "Lcom/scandit/datacapture/core/internal/sdk/ui/viewfinder/NativeRectangularViewfinder;", "(Lcom/scandit/datacapture/core/internal/sdk/ui/viewfinder/NativeRectangularViewfinder;)V", "<set-?>", "Lcom/scandit/datacapture/core/ui/viewfinder/RectangularViewfinderAnimation;", "animation", "getAnimation", "()Lcom/scandit/datacapture/core/ui/viewfinder/RectangularViewfinderAnimation;", "setAnimation", "(Lcom/scandit/datacapture/core/ui/viewfinder/RectangularViewfinderAnimation;)V", "", "color", "getColor", "()I", "setColor", "(I)V", "", "dimming", "getDimming", "()F", "setDimming", "(F)V", "disabledColor", "getDisabledColor", "setDisabledColor", "disabledDimming", "getDisabledDimming", "setDisabledDimming", "getLineStyle", "()Lcom/scandit/datacapture/core/ui/viewfinder/RectangularViewfinderLineStyle;", "sizeWithUnitAndAspect", "Lcom/scandit/datacapture/core/common/geometry/SizeWithUnitAndAspect;", "getSizeWithUnitAndAspect", "()Lcom/scandit/datacapture/core/common/geometry/SizeWithUnitAndAspect;", "getStyle", "()Lcom/scandit/datacapture/core/ui/viewfinder/RectangularViewfinderStyle;", "_impl", "_viewfinderImpl", "Lcom/scandit/datacapture/core/internal/sdk/ui/viewfinder/NativeViewfinder;", "setHeightAndAspectRatio", "", "height", "Lcom/scandit/datacapture/core/common/geometry/FloatWithUnit;", "widthToHeightAspect", "setShorterDimensionAndAspectRatio", "shorterDimension", "aspect", "setSize", "size", "Lcom/scandit/datacapture/core/common/geometry/SizeWithUnit;", "setWidthAndAspectRatio", "width", "heightToWidthAspect", "scandit-capture-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class RectangularViewfinder implements Viewfinder, RectangularViewfinderProxy {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ RectangularViewfinderProxyAdapter f126182a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public RectangularViewfinder(RectangularViewfinderStyle style) {
        this(style, null, 2, 0 == true ? 1 : 0);
        Intrinsics.j(style, "style");
    }

    @Override // com.scandit.datacapture.core.ui.viewfinder.RectangularViewfinderProxy
    @NativeImpl
    /* renamed from: _impl */
    public NativeRectangularViewfinder getF126188a() {
        return this.f126182a.getF126188a();
    }

    @Override // com.scandit.datacapture.core.ui.viewfinder.Viewfinder
    @NativeImpl
    /* renamed from: _viewfinderImpl */
    public NativeViewfinder getF126190c() {
        return this.f126182a.getF126190c();
    }

    @Override // com.scandit.datacapture.core.ui.viewfinder.RectangularViewfinderProxy
    @ProxyFunction(property = "animation")
    public RectangularViewfinderAnimation getAnimation() {
        return this.f126182a.getAnimation();
    }

    @Override // com.scandit.datacapture.core.ui.viewfinder.RectangularViewfinderProxy
    @ProxyFunction(property = "color")
    public int getColor() {
        return this.f126182a.getColor();
    }

    @Override // com.scandit.datacapture.core.ui.viewfinder.RectangularViewfinderProxy
    @ProxyFunction(property = "dimming")
    public float getDimming() {
        return this.f126182a.getDimming();
    }

    @Override // com.scandit.datacapture.core.ui.viewfinder.RectangularViewfinderProxy
    @ProxyFunction(property = "disabledColor")
    public int getDisabledColor() {
        return this.f126182a.getDisabledColor();
    }

    @Override // com.scandit.datacapture.core.ui.viewfinder.RectangularViewfinderProxy
    @ProxyFunction(property = "disabledDimming")
    public float getDisabledDimming() {
        return this.f126182a.getDisabledDimming();
    }

    @Override // com.scandit.datacapture.core.ui.viewfinder.RectangularViewfinderProxy
    @ProxyFunction(property = "lineStyle")
    public RectangularViewfinderLineStyle getLineStyle() {
        return this.f126182a.getLineStyle();
    }

    @Override // com.scandit.datacapture.core.ui.viewfinder.RectangularViewfinderProxy
    @ProxyFunction(property = "style")
    public RectangularViewfinderStyle getStyle() {
        return this.f126182a.getStyle();
    }

    @Override // com.scandit.datacapture.core.ui.viewfinder.RectangularViewfinderProxy
    @ProxyFunction(property = "animation")
    public void setAnimation(RectangularViewfinderAnimation rectangularViewfinderAnimation) {
        this.f126182a.setAnimation(rectangularViewfinderAnimation);
    }

    @Override // com.scandit.datacapture.core.ui.viewfinder.RectangularViewfinderProxy
    @ProxyFunction(property = "color")
    public void setColor(int i10) {
        this.f126182a.setColor(i10);
    }

    @Override // com.scandit.datacapture.core.ui.viewfinder.RectangularViewfinderProxy
    @ProxyFunction(property = "dimming")
    public void setDimming(float f10) {
        this.f126182a.setDimming(f10);
    }

    @Override // com.scandit.datacapture.core.ui.viewfinder.RectangularViewfinderProxy
    @ProxyFunction(property = "disabledColor")
    public void setDisabledColor(int i10) {
        this.f126182a.setDisabledColor(i10);
    }

    @Override // com.scandit.datacapture.core.ui.viewfinder.RectangularViewfinderProxy
    @ProxyFunction(property = "disabledDimming")
    public void setDisabledDimming(float f10) {
        this.f126182a.setDisabledDimming(f10);
    }

    @Override // com.scandit.datacapture.core.ui.viewfinder.RectangularViewfinderProxy
    @ProxyFunction
    public void setHeightAndAspectRatio(FloatWithUnit height, float widthToHeightAspect) {
        Intrinsics.j(height, "height");
        this.f126182a.setHeightAndAspectRatio(height, widthToHeightAspect);
    }

    @Override // com.scandit.datacapture.core.ui.viewfinder.RectangularViewfinderProxy
    @ProxyFunction
    public void setShorterDimensionAndAspectRatio(float shorterDimension, float aspect) {
        this.f126182a.setShorterDimensionAndAspectRatio(shorterDimension, aspect);
    }

    @Override // com.scandit.datacapture.core.ui.viewfinder.RectangularViewfinderProxy
    @ProxyFunction
    public void setWidthAndAspectRatio(FloatWithUnit width, float heightToWidthAspect) {
        Intrinsics.j(width, "width");
        this.f126182a.setWidthAndAspectRatio(width, heightToWidthAspect);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RectangularViewfinder(NativeRectangularViewfinder impl) {
        Intrinsics.j(impl, "impl");
        this.f126182a = new RectangularViewfinderProxyAdapter(impl, null, 2, 0 == true ? 1 : 0);
    }

    public final SizeWithUnitAndAspect getSizeWithUnitAndAspect() {
        NativeSizeWithUnitAndAspect sizeWithUnitAndAspect = getF126188a().getSizeWithUnitAndAspect();
        Intrinsics.i(sizeWithUnitAndAspect, "getSizeWithUnitAndAspect(...)");
        return new SizeWithUnitAndAspect(sizeWithUnitAndAspect);
    }

    public final void setSize(SizeWithUnit size) {
        Intrinsics.j(size, "size");
        getF126188a().setWidthAndHeight(size.getWidth(), size.getHeight());
    }

    public /* synthetic */ RectangularViewfinder(RectangularViewfinderStyle rectangularViewfinderStyle, RectangularViewfinderLineStyle rectangularViewfinderLineStyle, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(rectangularViewfinderStyle, (i10 & 2) != 0 ? RectangularViewfinderLineStyle.LIGHT : rectangularViewfinderLineStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @JvmOverloads
    public RectangularViewfinder(RectangularViewfinderStyle style, RectangularViewfinderLineStyle lineStyle) {
        Intrinsics.j(style, "style");
        Intrinsics.j(lineStyle, "lineStyle");
        NativeRectangularViewfinder nativeRectangularViewfinderCreateForStyles = NativeRectangularViewfinder.createForStyles(RectangularViewfinderStyleKt.toNative(style), RectangularViewfinderLineStyleKt.toNative(lineStyle));
        Intrinsics.i(nativeRectangularViewfinderCreateForStyles, "createForStyles(...)");
        this(nativeRectangularViewfinderCreateForStyles);
    }
}
