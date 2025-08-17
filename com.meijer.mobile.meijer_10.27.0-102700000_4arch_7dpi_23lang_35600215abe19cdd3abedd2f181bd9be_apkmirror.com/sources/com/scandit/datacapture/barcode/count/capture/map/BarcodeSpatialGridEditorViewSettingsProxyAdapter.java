package com.scandit.datacapture.barcode.count.capture.map;

import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeSpatialGridEditorViewSettings;
import com.scandit.datacapture.core.internal.sdk.CoreNativeTypeFactory;
import com.scandit.datacapture.core.internal.sdk.common.graphics.NativeColor;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR$\u0010\u0012\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0015\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R$\u0010\u0018\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0011R$\u0010\u001b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u000f\"\u0004\b\u001a\u0010\u0011R$\u0010!\u001a\u00020\u001c2\u0006\u0010\r\u001a\u00020\u001c8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010$\u001a\u00020\u001c2\u0006\u0010\r\u001a\u00020\u001c8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\"\u0010\u001e\"\u0004\b#\u0010 ¨\u0006%"}, d2 = {"Lcom/scandit/datacapture/barcode/count/capture/map/BarcodeSpatialGridEditorViewSettingsProxyAdapter;", "Lcom/scandit/datacapture/barcode/count/capture/map/BarcodeSpatialGridEditorViewSettingsProxy;", "Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeSpatialGridEditorViewSettings;", "_NativeBarcodeSpatialGridEditorViewSettings", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "<init>", "(Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeSpatialGridEditorViewSettings;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_barcode_capture", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "", "p0", "getReorderHintText", "()Ljava/lang/String;", "setReorderHintText", "(Ljava/lang/String;)V", "reorderHintText", "getToteTextFormat", "setToteTextFormat", "toteTextFormat", "getFinishMappingButtonText", "setFinishMappingButtonText", "finishMappingButtonText", "getCancelMappingButtonText", "setCancelMappingButtonText", "cancelMappingButtonText", "", "getToteColor", "()I", "setToteColor", "(I)V", "toteColor", "getSubColor", "setSubColor", "subColor", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class BarcodeSpatialGridEditorViewSettingsProxyAdapter implements BarcodeSpatialGridEditorViewSettingsProxy {

    /* renamed from: a, reason: collision with root package name */
    private final NativeBarcodeSpatialGridEditorViewSettings f120686a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ProxyCache proxyCache;

    public BarcodeSpatialGridEditorViewSettingsProxyAdapter(NativeBarcodeSpatialGridEditorViewSettings _NativeBarcodeSpatialGridEditorViewSettings, ProxyCache proxyCache) {
        Intrinsics.j(_NativeBarcodeSpatialGridEditorViewSettings, "_NativeBarcodeSpatialGridEditorViewSettings");
        Intrinsics.j(proxyCache, "proxyCache");
        this.f120686a = _NativeBarcodeSpatialGridEditorViewSettings;
        this.proxyCache = proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.count.capture.map.BarcodeSpatialGridEditorViewSettingsProxy
    public String getCancelMappingButtonText() {
        String cancelMappingButtonText = this.f120686a.getCancelMappingButtonText();
        Intrinsics.g(cancelMappingButtonText);
        return cancelMappingButtonText;
    }

    @Override // com.scandit.datacapture.barcode.count.capture.map.BarcodeSpatialGridEditorViewSettingsProxy
    public String getFinishMappingButtonText() {
        String finishMappingButtonText = this.f120686a.getFinishMappingButtonText();
        Intrinsics.g(finishMappingButtonText);
        return finishMappingButtonText;
    }

    /* renamed from: getProxyCache$scandit_barcode_capture, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.count.capture.map.BarcodeSpatialGridEditorViewSettingsProxy
    public String getReorderHintText() {
        String reorderHintText = this.f120686a.getReorderHintText();
        Intrinsics.g(reorderHintText);
        return reorderHintText;
    }

    @Override // com.scandit.datacapture.barcode.count.capture.map.BarcodeSpatialGridEditorViewSettingsProxy
    public int getSubColor() {
        NativeColor subColor = this.f120686a.getSubColor();
        CoreNativeTypeFactory coreNativeTypeFactory = CoreNativeTypeFactory.INSTANCE;
        Intrinsics.g(subColor);
        return coreNativeTypeFactory.convert(subColor);
    }

    @Override // com.scandit.datacapture.barcode.count.capture.map.BarcodeSpatialGridEditorViewSettingsProxy
    public int getToteColor() {
        NativeColor toteColor = this.f120686a.getToteColor();
        CoreNativeTypeFactory coreNativeTypeFactory = CoreNativeTypeFactory.INSTANCE;
        Intrinsics.g(toteColor);
        return coreNativeTypeFactory.convert(toteColor);
    }

    @Override // com.scandit.datacapture.barcode.count.capture.map.BarcodeSpatialGridEditorViewSettingsProxy
    public String getToteTextFormat() {
        String toteTextFormat = this.f120686a.getToteTextFormat();
        Intrinsics.g(toteTextFormat);
        return toteTextFormat;
    }

    @Override // com.scandit.datacapture.barcode.count.capture.map.BarcodeSpatialGridEditorViewSettingsProxy
    public void setCancelMappingButtonText(String p02) {
        Intrinsics.j(p02, "p0");
        this.f120686a.setCancelMappingButtonText(p02);
    }

    @Override // com.scandit.datacapture.barcode.count.capture.map.BarcodeSpatialGridEditorViewSettingsProxy
    public void setFinishMappingButtonText(String p02) {
        Intrinsics.j(p02, "p0");
        this.f120686a.setFinishMappingButtonText(p02);
    }

    @Override // com.scandit.datacapture.barcode.count.capture.map.BarcodeSpatialGridEditorViewSettingsProxy
    public void setReorderHintText(String p02) {
        Intrinsics.j(p02, "p0");
        this.f120686a.setReorderHintText(p02);
    }

    @Override // com.scandit.datacapture.barcode.count.capture.map.BarcodeSpatialGridEditorViewSettingsProxy
    public void setSubColor(int i10) {
        this.f120686a.setSubColor(CoreNativeTypeFactory.INSTANCE.convert(i10));
    }

    @Override // com.scandit.datacapture.barcode.count.capture.map.BarcodeSpatialGridEditorViewSettingsProxy
    public void setToteColor(int i10) {
        this.f120686a.setToteColor(CoreNativeTypeFactory.INSTANCE.convert(i10));
    }

    @Override // com.scandit.datacapture.barcode.count.capture.map.BarcodeSpatialGridEditorViewSettingsProxy
    public void setToteTextFormat(String p02) {
        Intrinsics.j(p02, "p0");
        this.f120686a.setToteTextFormat(p02);
    }

    public /* synthetic */ BarcodeSpatialGridEditorViewSettingsProxyAdapter(NativeBarcodeSpatialGridEditorViewSettings nativeBarcodeSpatialGridEditorViewSettings, ProxyCache proxyCache, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeBarcodeSpatialGridEditorViewSettings, (i10 & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
