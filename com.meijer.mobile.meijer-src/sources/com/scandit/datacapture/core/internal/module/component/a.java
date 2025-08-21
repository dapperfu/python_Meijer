package com.scandit.datacapture.core.internal.module.component;

import com.scandit.datacapture.core.component.DataCaptureComponent;
import com.scandit.datacapture.core.internal.sdk.component.NativeDataCaptureComponent;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class a implements DataCaptureComponent {

    /* renamed from: a, reason: collision with root package name */
    public final NativeDataCaptureComponent f125163a;

    /* renamed from: b, reason: collision with root package name */
    public final String f125164b;

    public a(NativeDataCaptureComponent impl) {
        Intrinsics.j(impl, "impl");
        this.f125163a = impl;
        String identifier = impl.getIdentifier();
        Intrinsics.i(identifier, "getIdentifier(...)");
        this.f125164b = identifier;
    }

    @Override // com.scandit.datacapture.core.component.DataCaptureComponent, com.scandit.datacapture.barcode.generator.BarcodeGeneratorProxy
    public final NativeDataCaptureComponent _dataCaptureComponentImpl() {
        return this.f125163a;
    }

    @Override // com.scandit.datacapture.core.component.DataCaptureComponent, com.scandit.datacapture.barcode.generator.BarcodeGeneratorProxy
    public final String getId() {
        return this.f125164b;
    }
}
