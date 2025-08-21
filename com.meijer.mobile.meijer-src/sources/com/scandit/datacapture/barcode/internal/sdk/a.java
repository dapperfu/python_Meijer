package com.scandit.datacapture.barcode.internal.sdk;

import com.scandit.datacapture.barcode.data.LocalizedOnlyBarcode;
import com.scandit.datacapture.barcode.internal.sdk.data.NativeLocalizedOnlyBarcode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class a extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NativeLocalizedOnlyBarcode f124385a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(NativeLocalizedOnlyBarcode nativeLocalizedOnlyBarcode) {
        super(0);
        this.f124385a = nativeLocalizedOnlyBarcode;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new LocalizedOnlyBarcode(this.f124385a);
    }
}
