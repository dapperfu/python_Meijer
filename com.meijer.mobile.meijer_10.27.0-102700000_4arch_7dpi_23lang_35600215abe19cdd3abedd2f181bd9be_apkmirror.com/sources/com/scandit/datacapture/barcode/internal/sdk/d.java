package com.scandit.datacapture.barcode.internal.sdk;

import com.scandit.datacapture.barcode.batch.data.TrackedBarcode;
import com.scandit.datacapture.barcode.batch.internal.module.data.NativeTrackedBarcode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class d extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NativeTrackedBarcode f123542a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(NativeTrackedBarcode nativeTrackedBarcode) {
        super(0);
        this.f123542a = nativeTrackedBarcode;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new TrackedBarcode(this.f123542a);
    }
}
