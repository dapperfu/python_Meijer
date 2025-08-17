package com.scandit.datacapture.barcode.internal.sdk;

import com.scandit.datacapture.barcode.data.Barcode;
import com.scandit.datacapture.barcode.internal.sdk.data.NativeBarcode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class c extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NativeBarcode f123436a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(NativeBarcode nativeBarcode) {
        super(0);
        this.f123436a = nativeBarcode;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new Barcode(this.f123436a);
    }
}
