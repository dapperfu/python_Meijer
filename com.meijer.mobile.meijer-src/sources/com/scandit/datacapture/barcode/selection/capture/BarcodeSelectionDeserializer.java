package com.scandit.datacapture.barcode.selection.capture;

import com.scandit.datacapture.barcode.selection.internal.module.serialization.NativeBarcodeSelectionDeserializer;
import com.scandit.datacapture.barcode.selection.ui.overlay.BarcodeSelectionBasicOverlay;
import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.capture.serialization.DataCaptureModeDeserializer;
import com.scandit.datacapture.core.internal.module.serialization.NativeDataCaptureModeDeserializer;
import com.scandit.datacapture.core.ui.viewfinder.serialization.ViewfinderDeserializer;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import com.scandit.datacapture.tools.internal.sdk.ProxyGetter;
import com.scandit.datacapture.tools.internal.sdk.ProxyGetterKind;
import com.scandit.datacapture.tools.internal.sdk.ProxySetter;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002:\u0002@AB\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004J \u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0097\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0000H\u0097\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u0097\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011H\u0097\u0001¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\b\u001a\u00020\u0007H\u0097\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0000H\u0097\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\b\u001a\u00020\u0007H\u0097\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ \u0010 \u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0097\u0001¢\u0006\u0004\b \u0010!J \u0010\"\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0097\u0001¢\u0006\u0004\b\"\u0010#J \u0010%\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020\u001c2\u0006\u0010\b\u001a\u00020\u0007H\u0097\u0001¢\u0006\u0004\b%\u0010&J\u001d\u0010'\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b'\u0010\u0017J\u0015\u0010(\u001a\u00020\u001c2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b(\u0010\u001eJ\u001d\u0010)\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b)\u0010\u000bR\u001a\u0010/\u001a\u00020*8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R$\u00107\u001a\u0004\u0018\u0001008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u0014\u0010;\u001a\u0002088WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b9\u0010:R\u001a\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00070<8WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b=\u0010>¨\u0006B"}, d2 = {"Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionDeserializer;", "Lcom/scandit/datacapture/core/capture/serialization/DataCaptureModeDeserializer;", "Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionDeserializerProxy;", "<init>", "()V", "Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelection;", "mode", "", "jsonData", "Lcom/scandit/datacapture/barcode/selection/ui/overlay/BarcodeSelectionBasicOverlay;", "_basicOverlayFromJson", "(Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelection;Ljava/lang/String;)Lcom/scandit/datacapture/barcode/selection/ui/overlay/BarcodeSelectionBasicOverlay;", "_deserializer", "()Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionDeserializer;", "Lcom/scandit/datacapture/barcode/selection/internal/module/serialization/NativeBarcodeSelectionDeserializer;", "_impl", "()Lcom/scandit/datacapture/barcode/selection/internal/module/serialization/NativeBarcodeSelectionDeserializer;", "Lcom/scandit/datacapture/core/internal/module/serialization/NativeDataCaptureModeDeserializer;", "_modeDeserializerImpl", "()Lcom/scandit/datacapture/core/internal/module/serialization/NativeDataCaptureModeDeserializer;", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "dataCaptureContext", "_modeFromJson", "(Lcom/scandit/datacapture/core/capture/DataCaptureContext;Ljava/lang/String;)Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelection;", "deserializer", "", "_setDeserializer", "(Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionDeserializer;)V", "Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionSettings;", "_settingsFromJson", "(Ljava/lang/String;)Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionSettings;", "overlay", "updateBasicOverlayFromJson", "(Lcom/scandit/datacapture/barcode/selection/ui/overlay/BarcodeSelectionBasicOverlay;Ljava/lang/String;)Lcom/scandit/datacapture/barcode/selection/ui/overlay/BarcodeSelectionBasicOverlay;", "updateModeFromJson", "(Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelection;Ljava/lang/String;)Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelection;", "settings", "updateSettingsFromJson", "(Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionSettings;Ljava/lang/String;)Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionSettings;", "modeFromJson", "settingsFromJson", "basicOverlayFromJson", "Lcom/scandit/datacapture/core/ui/viewfinder/serialization/ViewfinderDeserializer;", "a", "Lcom/scandit/datacapture/core/ui/viewfinder/serialization/ViewfinderDeserializer;", "getViewfinderDeserializer$scandit_barcode_capture", "()Lcom/scandit/datacapture/core/ui/viewfinder/serialization/ViewfinderDeserializer;", "viewfinderDeserializer", "Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionDeserializerListener;", "d", "Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionDeserializerListener;", "getListener", "()Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionDeserializerListener;", "setListener", "(Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionDeserializerListener;)V", "listener", "Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionDeserializerHelper;", "get_helper", "()Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionDeserializerHelper;", "_helper", "", "getWarnings", "()Ljava/util/List;", "warnings", "com/scandit/datacapture/barcode/selection/capture/f", "com/scandit/datacapture/barcode/selection/capture/g", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class BarcodeSelectionDeserializer implements DataCaptureModeDeserializer, BarcodeSelectionDeserializerProxy {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ViewfinderDeserializer viewfinderDeserializer;

    /* renamed from: b, reason: collision with root package name */
    private final C13406g f124716b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ BarcodeSelectionDeserializerProxyAdapter f124717c;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private BarcodeSelectionDeserializerListener listener;

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionDeserializerProxy
    @ProxyFunction(nativeName = "barcodeSelectionBasicOverlayFromJson")
    public BarcodeSelectionBasicOverlay _basicOverlayFromJson(BarcodeSelection mode, String jsonData) {
        Intrinsics.j(mode, "mode");
        Intrinsics.j(jsonData, "jsonData");
        return this.f124717c._basicOverlayFromJson(mode, jsonData);
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionDeserializerProxy
    @ProxyGetter(ProxyGetterKind.WITH_SETTER)
    public BarcodeSelectionDeserializer _deserializer() {
        return this.f124717c._deserializer();
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionDeserializerProxy
    @NativeImpl
    /* renamed from: _impl */
    public NativeBarcodeSelectionDeserializer getF124724a() {
        return this.f124717c.getF124724a();
    }

    @Override // com.scandit.datacapture.core.capture.serialization.DataCaptureModeDeserializer
    @NativeImpl
    /* renamed from: _modeDeserializerImpl */
    public NativeDataCaptureModeDeserializer getF124726c() {
        return this.f124717c.getF124726c();
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionDeserializerProxy
    @ProxyFunction(nativeName = "barcodeSelectionFromJson")
    public BarcodeSelection _modeFromJson(DataCaptureContext dataCaptureContext, String jsonData) {
        Intrinsics.j(dataCaptureContext, "dataCaptureContext");
        Intrinsics.j(jsonData, "jsonData");
        return this.f124717c._modeFromJson(dataCaptureContext, jsonData);
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionDeserializerProxy
    @ProxySetter
    public void _setDeserializer(BarcodeSelectionDeserializer deserializer) {
        Intrinsics.j(deserializer, "deserializer");
        this.f124717c._setDeserializer(deserializer);
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionDeserializerProxy
    @ProxyFunction(nativeName = "settingsFromJson")
    public BarcodeSelectionSettings _settingsFromJson(String jsonData) {
        Intrinsics.j(jsonData, "jsonData");
        return this.f124717c._settingsFromJson(jsonData);
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionDeserializerProxy
    @ProxyFunction(property = "warnings")
    public List<String> getWarnings() {
        return this.f124717c.getWarnings();
    }

    @Override // com.scandit.datacapture.core.capture.serialization.DataCaptureModeDeserializer
    @ProxyFunction(nativeName = "getHelper", property = "_helper")
    public BarcodeSelectionDeserializerHelper get_helper() {
        return this.f124717c.get_helper();
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionDeserializerProxy
    @ProxyFunction(nativeName = "updateBarcodeSelectionBasicOverlayFromJson")
    public BarcodeSelectionBasicOverlay updateBasicOverlayFromJson(BarcodeSelectionBasicOverlay overlay, String jsonData) {
        Intrinsics.j(overlay, "overlay");
        Intrinsics.j(jsonData, "jsonData");
        return this.f124717c.updateBasicOverlayFromJson(overlay, jsonData);
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionDeserializerProxy
    @ProxyFunction(nativeName = "updateBarcodeSelectionFromJson")
    public BarcodeSelection updateModeFromJson(BarcodeSelection mode, String jsonData) {
        Intrinsics.j(mode, "mode");
        Intrinsics.j(jsonData, "jsonData");
        return this.f124717c.updateModeFromJson(mode, jsonData);
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionDeserializerProxy
    @ProxyFunction
    public BarcodeSelectionSettings updateSettingsFromJson(BarcodeSelectionSettings settings, String jsonData) {
        Intrinsics.j(settings, "settings");
        Intrinsics.j(jsonData, "jsonData");
        return this.f124717c.updateSettingsFromJson(settings, jsonData);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BarcodeSelectionDeserializer() {
        ViewfinderDeserializer viewfinderDeserializer = new ViewfinderDeserializer();
        C13406g c13406g = new C13406g();
        BarcodeSelectionDeserializerHelperReversedAdapter barcodeSelectionDeserializerHelperReversedAdapter = new BarcodeSelectionDeserializerHelperReversedAdapter(c13406g, null, 2, null);
        NativeBarcodeSelectionDeserializer nativeBarcodeSelectionDeserializerCreate = NativeBarcodeSelectionDeserializer.create(viewfinderDeserializer._impl(), barcodeSelectionDeserializerHelperReversedAdapter);
        Intrinsics.i(nativeBarcodeSelectionDeserializerCreate, "create(...)");
        this.viewfinderDeserializer = viewfinderDeserializer;
        this.f124716b = c13406g;
        this.f124717c = new BarcodeSelectionDeserializerProxyAdapter(nativeBarcodeSelectionDeserializerCreate, null, 2, 0 == true ? 1 : 0);
        ProxyCacheKt.getGlobalProxyCache().getOrPut(Reflection.b(BarcodeSelectionDeserializerHelper.class), null, c13406g, new C13404e(barcodeSelectionDeserializerHelperReversedAdapter));
        _setDeserializer(this);
        nativeBarcodeSelectionDeserializerCreate.setListener(new BarcodeSelectionDeserializerListenerReversedAdapter(new C13405f(this), this, null, 4, null));
        WeakReference weakReference = new WeakReference(this);
        Intrinsics.j(weakReference, "<set-?>");
        c13406g.f124764a = weakReference;
    }

    public final BarcodeSelectionBasicOverlay basicOverlayFromJson(BarcodeSelection mode, String jsonData) {
        Intrinsics.j(mode, "mode");
        Intrinsics.j(jsonData, "jsonData");
        BarcodeSelectionBasicOverlay barcodeSelectionBasicOverlay_basicOverlayFromJson = _basicOverlayFromJson(mode, jsonData);
        C13406g c13406g = this.f124716b;
        c13406g.f124765b = null;
        c13406g.f124766c = null;
        return barcodeSelectionBasicOverlay_basicOverlayFromJson;
    }

    public final BarcodeSelectionDeserializerListener getListener() {
        return this.listener;
    }

    /* renamed from: getViewfinderDeserializer$scandit_barcode_capture, reason: from getter */
    public final ViewfinderDeserializer getViewfinderDeserializer() {
        return this.viewfinderDeserializer;
    }

    public final BarcodeSelection modeFromJson(DataCaptureContext dataCaptureContext, String jsonData) {
        Intrinsics.j(dataCaptureContext, "dataCaptureContext");
        Intrinsics.j(jsonData, "jsonData");
        BarcodeSelection barcodeSelection_modeFromJson = _modeFromJson(dataCaptureContext, jsonData);
        C13406g c13406g = this.f124716b;
        c13406g.f124765b = null;
        c13406g.f124766c = null;
        return barcodeSelection_modeFromJson;
    }

    public final void setListener(BarcodeSelectionDeserializerListener barcodeSelectionDeserializerListener) {
        this.listener = barcodeSelectionDeserializerListener;
    }

    public final BarcodeSelectionSettings settingsFromJson(String jsonData) {
        Intrinsics.j(jsonData, "jsonData");
        BarcodeSelectionSettings barcodeSelectionSettings_settingsFromJson = _settingsFromJson(jsonData);
        C13406g c13406g = this.f124716b;
        c13406g.f124765b = null;
        c13406g.f124766c = null;
        return barcodeSelectionSettings_settingsFromJson;
    }
}
