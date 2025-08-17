package com.scandit.datacapture.barcode.count.capture.map;

import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeSpatialGridEditorViewSettings;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\f\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003R$\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048W@WX\u0096\u000f¢\u0006\f\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048W@WX\u0096\u000f¢\u0006\f\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR$\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048W@WX\u0096\u000f¢\u0006\f\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR$\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00118W@WX\u0096\u000f¢\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00118W@WX\u0096\u000f¢\u0006\f\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R$\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048W@WX\u0096\u000f¢\u0006\f\u001a\u0004\b\u001a\u0010\u0007\"\u0004\b\u001b\u0010\t¨\u0006\u001d"}, d2 = {"Lcom/scandit/datacapture/barcode/count/capture/map/BarcodeSpatialGridEditorViewSettings;", "Lcom/scandit/datacapture/barcode/count/capture/map/BarcodeSpatialGridEditorViewSettingsProxy;", "<init>", "()V", "", "<set-?>", "getCancelMappingButtonText", "()Ljava/lang/String;", "setCancelMappingButtonText", "(Ljava/lang/String;)V", "cancelMappingButtonText", "getFinishMappingButtonText", "setFinishMappingButtonText", "finishMappingButtonText", "getReorderHintText", "setReorderHintText", "reorderHintText", "", "getSubColor", "()I", "setSubColor", "(I)V", "subColor", "getToteColor", "setToteColor", "toteColor", "getToteTextFormat", "setToteTextFormat", "toteTextFormat", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class BarcodeSpatialGridEditorViewSettings implements BarcodeSpatialGridEditorViewSettingsProxy {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ BarcodeSpatialGridEditorViewSettingsProxyAdapter f120685a;

    @Override // com.scandit.datacapture.barcode.count.capture.map.BarcodeSpatialGridEditorViewSettingsProxy
    @ProxyFunction(nativeName = "getCancelMappingButtonText", property = "cancelMappingButtonText")
    public String getCancelMappingButtonText() {
        return this.f120685a.getCancelMappingButtonText();
    }

    @Override // com.scandit.datacapture.barcode.count.capture.map.BarcodeSpatialGridEditorViewSettingsProxy
    @ProxyFunction(nativeName = "getFinishMappingButtonText", property = "finishMappingButtonText")
    public String getFinishMappingButtonText() {
        return this.f120685a.getFinishMappingButtonText();
    }

    @Override // com.scandit.datacapture.barcode.count.capture.map.BarcodeSpatialGridEditorViewSettingsProxy
    @ProxyFunction(nativeName = "getReorderHintText", property = "reorderHintText")
    public String getReorderHintText() {
        return this.f120685a.getReorderHintText();
    }

    @Override // com.scandit.datacapture.barcode.count.capture.map.BarcodeSpatialGridEditorViewSettingsProxy
    @ProxyFunction(nativeName = "getSubColor", property = "subColor")
    public int getSubColor() {
        return this.f120685a.getSubColor();
    }

    @Override // com.scandit.datacapture.barcode.count.capture.map.BarcodeSpatialGridEditorViewSettingsProxy
    @ProxyFunction(nativeName = "getToteColor", property = "toteColor")
    public int getToteColor() {
        return this.f120685a.getToteColor();
    }

    @Override // com.scandit.datacapture.barcode.count.capture.map.BarcodeSpatialGridEditorViewSettingsProxy
    @ProxyFunction(nativeName = "getToteTextFormat", property = "toteTextFormat")
    public String getToteTextFormat() {
        return this.f120685a.getToteTextFormat();
    }

    @Override // com.scandit.datacapture.barcode.count.capture.map.BarcodeSpatialGridEditorViewSettingsProxy
    @ProxyFunction(nativeName = "setCancelMappingButtonText", property = "cancelMappingButtonText")
    public void setCancelMappingButtonText(String str) {
        Intrinsics.j(str, "<set-?>");
        this.f120685a.setCancelMappingButtonText(str);
    }

    @Override // com.scandit.datacapture.barcode.count.capture.map.BarcodeSpatialGridEditorViewSettingsProxy
    @ProxyFunction(nativeName = "setFinishMappingButtonText", property = "finishMappingButtonText")
    public void setFinishMappingButtonText(String str) {
        Intrinsics.j(str, "<set-?>");
        this.f120685a.setFinishMappingButtonText(str);
    }

    @Override // com.scandit.datacapture.barcode.count.capture.map.BarcodeSpatialGridEditorViewSettingsProxy
    @ProxyFunction(nativeName = "setReorderHintText", property = "reorderHintText")
    public void setReorderHintText(String str) {
        Intrinsics.j(str, "<set-?>");
        this.f120685a.setReorderHintText(str);
    }

    @Override // com.scandit.datacapture.barcode.count.capture.map.BarcodeSpatialGridEditorViewSettingsProxy
    @ProxyFunction(nativeName = "setSubColor", property = "subColor")
    public void setSubColor(int i10) {
        this.f120685a.setSubColor(i10);
    }

    @Override // com.scandit.datacapture.barcode.count.capture.map.BarcodeSpatialGridEditorViewSettingsProxy
    @ProxyFunction(nativeName = "setToteColor", property = "toteColor")
    public void setToteColor(int i10) {
        this.f120685a.setToteColor(i10);
    }

    @Override // com.scandit.datacapture.barcode.count.capture.map.BarcodeSpatialGridEditorViewSettingsProxy
    @ProxyFunction(nativeName = "setToteTextFormat", property = "toteTextFormat")
    public void setToteTextFormat(String str) {
        Intrinsics.j(str, "<set-?>");
        this.f120685a.setToteTextFormat(str);
    }

    public BarcodeSpatialGridEditorViewSettings() {
        NativeBarcodeSpatialGridEditorViewSettings nativeBarcodeSpatialGridEditorViewSettingsCreate = NativeBarcodeSpatialGridEditorViewSettings.create();
        Intrinsics.i(nativeBarcodeSpatialGridEditorViewSettingsCreate, "create(...)");
        this.f120685a = new BarcodeSpatialGridEditorViewSettingsProxyAdapter(nativeBarcodeSpatialGridEditorViewSettingsCreate, null, 2, null);
    }
}
