package com.scandit.datacapture.barcode.ar.ui;

import com.scandit.datacapture.barcode.internal.module.ar.ui.NativeBarcodeArViewSettings;
import com.scandit.datacapture.core.json.JsonValue;
import com.scandit.datacapture.core.source.CameraPosition;
import com.scandit.datacapture.core.source.CameraPositionSerializer;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u000f\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\t\u0010\u0016\u001a\u00020\u0004H\u0097\u0001J\u0011\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0097\u0001J\r\u0010\u001b\u001a\u00020\u0000H\u0000¢\u0006\u0002\b\u001cJ\u0013\u0010\u001d\u001a\u00020\r2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0096\u0002J\b\u0010 \u001a\u00020!H\u0016J\u0006\u0010\"\u001a\u00020#R$\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00078W@WX\u0096\u000f¢\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR$\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\r8W@WX\u0096\u000f¢\u0006\f\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\r8W@WX\u0096\u000f¢\u0006\f\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012¨\u0006$"}, d2 = {"Lcom/scandit/datacapture/barcode/ar/ui/BarcodeArViewSettings;", "Lcom/scandit/datacapture/barcode/ar/ui/BarcodeArViewSettingsProxy;", "()V", "impl", "Lcom/scandit/datacapture/barcode/internal/module/ar/ui/NativeBarcodeArViewSettings;", "(Lcom/scandit/datacapture/barcode/internal/module/ar/ui/NativeBarcodeArViewSettings;)V", "<set-?>", "Lcom/scandit/datacapture/core/source/CameraPosition;", "defaultCameraPosition", "getDefaultCameraPosition", "()Lcom/scandit/datacapture/core/source/CameraPosition;", "setDefaultCameraPosition", "(Lcom/scandit/datacapture/core/source/CameraPosition;)V", "", "hapticEnabled", "getHapticEnabled", "()Z", "setHapticEnabled", "(Z)V", "soundEnabled", "getSoundEnabled", "setSoundEnabled", "_impl", "_updateFromJson", "", "json", "Lcom/scandit/datacapture/core/json/JsonValue;", "clone", "clone$scandit_barcode_capture", "equals", "other", "", "hashCode", "", "toJson", "", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BarcodeArViewSettings implements BarcodeArViewSettingsProxy {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ BarcodeArViewSettingsProxyAdapter f120192a;

    /* JADX WARN: Multi-variable type inference failed */
    public BarcodeArViewSettings(NativeBarcodeArViewSettings impl) {
        Intrinsics.j(impl, "impl");
        this.f120192a = new BarcodeArViewSettingsProxyAdapter(impl, null, 2, 0 == true ? 1 : 0);
    }

    @Override // com.scandit.datacapture.barcode.ar.ui.BarcodeArViewSettingsProxy
    @NativeImpl
    /* renamed from: _impl */
    public NativeBarcodeArViewSettings getF120193a() {
        return this.f120192a.getF120193a();
    }

    @Override // com.scandit.datacapture.barcode.ar.ui.BarcodeArViewSettingsProxy
    @ProxyFunction(nativeName = "updateFromJson")
    public void _updateFromJson(JsonValue json) {
        Intrinsics.j(json, "json");
        this.f120192a._updateFromJson(json);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.e(BarcodeArViewSettings.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.h(other, "null cannot be cast to non-null type com.scandit.datacapture.barcode.ar.ui.BarcodeArViewSettings");
        BarcodeArViewSettings barcodeArViewSettings = (BarcodeArViewSettings) other;
        return getSoundEnabled() == barcodeArViewSettings.getSoundEnabled() && getHapticEnabled() == barcodeArViewSettings.getHapticEnabled() && getDefaultCameraPosition() == barcodeArViewSettings.getDefaultCameraPosition();
    }

    @Override // com.scandit.datacapture.barcode.ar.ui.BarcodeArViewSettingsProxy
    @ProxyFunction(nativeName = "getCameraPosition", property = "defaultCameraPosition")
    public CameraPosition getDefaultCameraPosition() {
        return this.f120192a.getDefaultCameraPosition();
    }

    @Override // com.scandit.datacapture.barcode.ar.ui.BarcodeArViewSettingsProxy
    @ProxyFunction(property = "hapticEnabled")
    public boolean getHapticEnabled() {
        return this.f120192a.getHapticEnabled();
    }

    @Override // com.scandit.datacapture.barcode.ar.ui.BarcodeArViewSettingsProxy
    @ProxyFunction(property = "soundEnabled")
    public boolean getSoundEnabled() {
        return this.f120192a.getSoundEnabled();
    }

    @Override // com.scandit.datacapture.barcode.ar.ui.BarcodeArViewSettingsProxy
    @ProxyFunction(nativeName = "setCameraPosition", property = "defaultCameraPosition")
    public void setDefaultCameraPosition(CameraPosition cameraPosition) {
        Intrinsics.j(cameraPosition, "<set-?>");
        this.f120192a.setDefaultCameraPosition(cameraPosition);
    }

    @Override // com.scandit.datacapture.barcode.ar.ui.BarcodeArViewSettingsProxy
    @ProxyFunction(property = "hapticEnabled")
    public void setHapticEnabled(boolean z10) {
        this.f120192a.setHapticEnabled(z10);
    }

    @Override // com.scandit.datacapture.barcode.ar.ui.BarcodeArViewSettingsProxy
    @ProxyFunction(property = "soundEnabled")
    public void setSoundEnabled(boolean z10) {
        this.f120192a.setSoundEnabled(z10);
    }

    public final /* synthetic */ BarcodeArViewSettings clone$scandit_barcode_capture() {
        BarcodeArViewSettings barcodeArViewSettings = new BarcodeArViewSettings();
        barcodeArViewSettings.setSoundEnabled(getSoundEnabled());
        barcodeArViewSettings.setHapticEnabled(getHapticEnabled());
        barcodeArViewSettings.setDefaultCameraPosition(getDefaultCameraPosition());
        return barcodeArViewSettings;
    }

    public final String toJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("soundEnabled", getSoundEnabled());
        jSONObject.put("hapticEnabled", getHapticEnabled());
        jSONObject.put("defaultCameraPosition", CameraPositionSerializer.toJson(getDefaultCameraPosition()));
        String string = jSONObject.toString();
        Intrinsics.i(string, "toString(...)");
        return string;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BarcodeArViewSettings() {
        NativeBarcodeArViewSettings nativeBarcodeArViewSettingsCreate = NativeBarcodeArViewSettings.create();
        Intrinsics.i(nativeBarcodeArViewSettingsCreate, "create(...)");
        this(nativeBarcodeArViewSettingsCreate);
    }

    public int hashCode() {
        return getDefaultCameraPosition().hashCode() + ((Boolean.hashCode(getHapticEnabled()) + (Boolean.hashCode(getSoundEnabled()) * 31)) * 31);
    }
}
