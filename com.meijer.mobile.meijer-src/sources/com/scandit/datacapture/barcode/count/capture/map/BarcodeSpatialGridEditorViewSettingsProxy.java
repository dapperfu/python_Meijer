package com.scandit.datacapture.barcode.count.capture.map;

import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeSpatialGridEditorViewSettings;
import com.scandit.datacapture.tools.internal.sdk.ProxyAdapter;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\f\ba\u0018\u00002\u00020\u0001R$\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00038g@gX¦\u000e¢\u0006\f\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00038g@gX¦\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR$\u0010\f\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00038g@gX¦\u000e¢\u0006\f\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR$\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u000f8g@gX¦\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u000f8g@gX¦\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R$\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00038g@gX¦\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\b¨\u0006\u001b"}, d2 = {"Lcom/scandit/datacapture/barcode/count/capture/map/BarcodeSpatialGridEditorViewSettingsProxy;", "", "<set-?>", "", "cancelMappingButtonText", "getCancelMappingButtonText", "()Ljava/lang/String;", "setCancelMappingButtonText", "(Ljava/lang/String;)V", "finishMappingButtonText", "getFinishMappingButtonText", "setFinishMappingButtonText", "reorderHintText", "getReorderHintText", "setReorderHintText", "", "subColor", "getSubColor", "()I", "setSubColor", "(I)V", "toteColor", "getToteColor", "setToteColor", "toteTextFormat", "getToteTextFormat", "setToteTextFormat", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ProxyAdapter(NativeBarcodeSpatialGridEditorViewSettings.class)
/* loaded from: classes12.dex */
public interface BarcodeSpatialGridEditorViewSettingsProxy {
    @ProxyFunction(nativeName = "getCancelMappingButtonText", property = "cancelMappingButtonText")
    String getCancelMappingButtonText();

    @ProxyFunction(nativeName = "getFinishMappingButtonText", property = "finishMappingButtonText")
    String getFinishMappingButtonText();

    @ProxyFunction(nativeName = "getReorderHintText", property = "reorderHintText")
    String getReorderHintText();

    @ProxyFunction(nativeName = "getSubColor", property = "subColor")
    int getSubColor();

    @ProxyFunction(nativeName = "getToteColor", property = "toteColor")
    int getToteColor();

    @ProxyFunction(nativeName = "getToteTextFormat", property = "toteTextFormat")
    String getToteTextFormat();

    @ProxyFunction(nativeName = "setCancelMappingButtonText", property = "cancelMappingButtonText")
    void setCancelMappingButtonText(String str);

    @ProxyFunction(nativeName = "setFinishMappingButtonText", property = "finishMappingButtonText")
    void setFinishMappingButtonText(String str);

    @ProxyFunction(nativeName = "setReorderHintText", property = "reorderHintText")
    void setReorderHintText(String str);

    @ProxyFunction(nativeName = "setSubColor", property = "subColor")
    void setSubColor(int i10);

    @ProxyFunction(nativeName = "setToteColor", property = "toteColor")
    void setToteColor(int i10);

    @ProxyFunction(nativeName = "setToteTextFormat", property = "toteTextFormat")
    void setToteTextFormat(String str);
}
