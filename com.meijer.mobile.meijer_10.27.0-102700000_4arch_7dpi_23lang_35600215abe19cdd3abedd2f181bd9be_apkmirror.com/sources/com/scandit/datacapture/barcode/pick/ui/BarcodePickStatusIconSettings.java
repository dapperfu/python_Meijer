package com.scandit.datacapture.barcode.pick.ui;

import com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickStatusIconSettings;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u000f\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\t\u0010\u0016\u001a\u00020\u0004H\u0097\u0001R$\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00078W@WX\u0096\u000f¢\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR$\u0010\r\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00078W@WX\u0096\u000f¢\u0006\f\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u000f\u0010\fR$\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u00108W@WX\u0096\u000f¢\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickStatusIconSettings;", "Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickStatusIconSettingsProxy;", "()V", "impl", "Lcom/scandit/datacapture/barcode/internal/module/pick/ui/NativeBarcodePickStatusIconSettings;", "(Lcom/scandit/datacapture/barcode/internal/module/pick/ui/NativeBarcodePickStatusIconSettings;)V", "<set-?>", "", "maxSize", "getMaxSize", "()I", "setMaxSize", "(I)V", "minSize", "getMinSize", "setMinSize", "", "ratioToHighlightSize", "getRatioToHighlightSize", "()F", "setRatioToHighlightSize", "(F)V", "_impl", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BarcodePickStatusIconSettings implements BarcodePickStatusIconSettingsProxy {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ BarcodePickStatusIconSettingsProxyAdapter f123643a;

    public BarcodePickStatusIconSettings(NativeBarcodePickStatusIconSettings impl) {
        Intrinsics.j(impl, "impl");
        this.f123643a = new BarcodePickStatusIconSettingsProxyAdapter(impl, null, 2, null);
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickStatusIconSettingsProxy
    @NativeImpl
    /* renamed from: _impl */
    public NativeBarcodePickStatusIconSettings getF123644a() {
        return this.f123643a.getF123644a();
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickStatusIconSettingsProxy
    @ProxyFunction(property = "maxSize")
    public int getMaxSize() {
        return this.f123643a.getMaxSize();
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickStatusIconSettingsProxy
    @ProxyFunction(property = "minSize")
    public int getMinSize() {
        return this.f123643a.getMinSize();
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickStatusIconSettingsProxy
    @ProxyFunction(nativeName = "getSizeToHighlightSizeRatio", property = "ratioToHighlightSize")
    public float getRatioToHighlightSize() {
        return this.f123643a.getRatioToHighlightSize();
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickStatusIconSettingsProxy
    @ProxyFunction(property = "maxSize")
    public void setMaxSize(int i10) {
        this.f123643a.setMaxSize(i10);
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickStatusIconSettingsProxy
    @ProxyFunction(property = "minSize")
    public void setMinSize(int i10) {
        this.f123643a.setMinSize(i10);
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickStatusIconSettingsProxy
    @ProxyFunction(nativeName = "setSizeToHighlightSizeRatio", property = "ratioToHighlightSize")
    public void setRatioToHighlightSize(float f10) {
        this.f123643a.setRatioToHighlightSize(f10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BarcodePickStatusIconSettings() {
        NativeBarcodePickStatusIconSettings nativeBarcodePickStatusIconSettingsCreate = NativeBarcodePickStatusIconSettings.create();
        Intrinsics.i(nativeBarcodePickStatusIconSettingsCreate, "create(...)");
        this(nativeBarcodePickStatusIconSettingsCreate);
    }
}
