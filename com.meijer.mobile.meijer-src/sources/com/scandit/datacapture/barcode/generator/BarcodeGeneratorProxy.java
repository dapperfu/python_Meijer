package com.scandit.datacapture.barcode.generator;

import com.scandit.datacapture.barcode.internal.module.generator.NativeBarcodeGenerator;
import com.scandit.datacapture.core.component.DataCaptureComponent;
import com.scandit.datacapture.core.internal.sdk.component.NativeDataCaptureComponent;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyAdapter;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import io.constructor.data.local.PreferencesHelper;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\ba\u0018\u00002\u00020\u0001J\b\u0010\u0006\u001a\u00020\u0007H'J\b\u0010\b\u001a\u00020\tH'R\u0014\u0010\u0002\u001a\u00020\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\n"}, d2 = {"Lcom/scandit/datacapture/barcode/generator/BarcodeGeneratorProxy;", "Lcom/scandit/datacapture/core/component/DataCaptureComponent;", PreferencesHelper.PREF_ID, "", "getId", "()Ljava/lang/String;", "_dataCaptureComponentImpl", "Lcom/scandit/datacapture/core/internal/sdk/component/NativeDataCaptureComponent;", "_impl", "Lcom/scandit/datacapture/barcode/internal/module/generator/NativeBarcodeGenerator;", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ProxyAdapter(NativeBarcodeGenerator.class)
/* loaded from: classes12.dex */
public interface BarcodeGeneratorProxy extends DataCaptureComponent {
    @NativeImpl
    NativeDataCaptureComponent _dataCaptureComponentImpl();

    @NativeImpl
    NativeBarcodeGenerator _impl();

    @ProxyFunction(nativeName = "getIdentifier", property = PreferencesHelper.PREF_ID)
    String getId();
}
