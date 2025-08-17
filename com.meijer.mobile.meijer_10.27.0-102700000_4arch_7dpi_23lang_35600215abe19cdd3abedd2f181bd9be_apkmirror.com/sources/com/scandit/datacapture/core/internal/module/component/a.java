package com.scandit.datacapture.core.internal.module.component;

import com.scandit.datacapture.core.component.DataCaptureComponent;
import com.scandit.datacapture.core.internal.sdk.component.NativeDataCaptureComponent;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class a implements DataCaptureComponent {

    /* renamed from: a, reason: collision with root package name */
    public final NativeDataCaptureComponent f124211a;

    /* renamed from: b, reason: collision with root package name */
    public final String f124212b;

    public a(NativeDataCaptureComponent impl) {
        Intrinsics.j(impl, "impl");
        this.f124211a = impl;
        String identifier = impl.getIdentifier();
        Intrinsics.i(identifier, "getIdentifier(...)");
        this.f124212b = identifier;
    }

    @Override // com.scandit.datacapture.core.component.DataCaptureComponent, com.scandit.datacapture.barcode.generator.BarcodeGeneratorProxy
    public final NativeDataCaptureComponent _dataCaptureComponentImpl() {
        return this.f124211a;
    }

    @Override // com.scandit.datacapture.core.component.DataCaptureComponent, com.scandit.datacapture.barcode.generator.BarcodeGeneratorProxy
    public final String getId() {
        return this.f124212b;
    }
}
