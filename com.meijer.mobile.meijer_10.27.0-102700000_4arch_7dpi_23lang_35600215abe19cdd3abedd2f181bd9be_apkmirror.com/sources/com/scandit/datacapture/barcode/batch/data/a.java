package com.scandit.datacapture.barcode.batch.data;

import com.scandit.datacapture.barcode.batch.internal.module.data.NativeTrackedBarcode;
import com.scandit.datacapture.barcode.data.Barcode;
import com.scandit.datacapture.barcode.internal.sdk.data.NativeBarcode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class a extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NativeTrackedBarcode f120475a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(NativeTrackedBarcode nativeTrackedBarcode) {
        super(0);
        this.f120475a = nativeTrackedBarcode;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        NativeBarcode barcode = this.f120475a.getBarcode();
        Intrinsics.i(barcode, "getBarcode(...)");
        return new Barcode(barcode);
    }
}
