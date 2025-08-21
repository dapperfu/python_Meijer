package com.scandit.datacapture.core.ui.overlay;

import com.scandit.datacapture.core.internal.module.ui.NativeColorFillOverlay;
import com.scandit.datacapture.core.internal.sdk.common.graphics.NativeColor;
import com.scandit.datacapture.core.internal.sdk.extensions.NativeColorExtensionsKt;
import com.scandit.datacapture.core.internal.sdk.ui.overlay.NativeDataCaptureOverlay;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00112\u00020\u00012\u00020\u0002:\u0001\u0011B\u0007\b\u0016¢\u0006\u0002\u0010\u0003B\u000f\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u000f\b\u0000\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u000e\u001a\u00020\u000fH\u0097\u0001J\t\u0010\u0010\u001a\u00020\bH\u0097\u0001R$\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00058W@WX\u0096\u000f¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u0006¨\u0006\u0012"}, d2 = {"Lcom/scandit/datacapture/core/ui/overlay/ColorFillOverlay;", "Lcom/scandit/datacapture/core/ui/overlay/DataCaptureOverlay;", "Lcom/scandit/datacapture/core/ui/overlay/ColorFillOverlayProxy;", "()V", "color", "", "(I)V", "impl", "Lcom/scandit/datacapture/core/internal/module/ui/NativeColorFillOverlay;", "(Lcom/scandit/datacapture/core/internal/module/ui/NativeColorFillOverlay;)V", "<set-?>", "getColor", "()I", "setColor", "_dataCaptureOverlayImpl", "Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/NativeDataCaptureOverlay;", "_impl", "Companion", "scandit-capture-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ColorFillOverlay implements DataCaptureOverlay, ColorFillOverlayProxy {

    /* renamed from: b, reason: collision with root package name */
    private static final NativeColor f127082b = NativeColorExtensionsKt.toNativeColor(0);

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ ColorFillOverlayProxyAdapter f127083a;

    public ColorFillOverlay(NativeColorFillOverlay impl) {
        Intrinsics.j(impl, "impl");
        this.f127083a = new ColorFillOverlayProxyAdapter(impl, null, 2, null);
    }

    @Override // com.scandit.datacapture.core.ui.overlay.DataCaptureOverlay, com.scandit.datacapture.barcode.batch.ui.overlay.BarcodeBatchAdvancedOverlayProxy
    @NativeImpl
    /* renamed from: _dataCaptureOverlayImpl */
    public NativeDataCaptureOverlay getF127086c() {
        return this.f127083a.getF127086c();
    }

    @Override // com.scandit.datacapture.core.ui.overlay.ColorFillOverlayProxy
    @NativeImpl
    /* renamed from: _impl */
    public NativeColorFillOverlay getF127084a() {
        return this.f127083a.getF127084a();
    }

    @Override // com.scandit.datacapture.core.ui.overlay.ColorFillOverlayProxy
    @ProxyFunction(property = "color")
    public int getColor() {
        return this.f127083a.getColor();
    }

    @Override // com.scandit.datacapture.core.ui.overlay.ColorFillOverlayProxy
    @ProxyFunction(property = "color")
    public void setColor(int i10) {
        this.f127083a.setColor(i10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ColorFillOverlay() {
        NativeColorFillOverlay nativeColorFillOverlayCreate = NativeColorFillOverlay.create(f127082b);
        Intrinsics.i(nativeColorFillOverlayCreate, "create(...)");
        this(nativeColorFillOverlayCreate);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ColorFillOverlay(int i10) {
        NativeColorFillOverlay nativeColorFillOverlayCreate = NativeColorFillOverlay.create(NativeColorExtensionsKt.toNativeColor(i10));
        Intrinsics.i(nativeColorFillOverlayCreate, "create(...)");
        this(nativeColorFillOverlayCreate);
    }
}
