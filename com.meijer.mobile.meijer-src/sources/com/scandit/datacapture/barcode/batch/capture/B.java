package com.scandit.datacapture.barcode.batch.capture;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class B extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BarcodeBatch f121356a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(BarcodeBatch barcodeBatch) {
        super(0);
        this.f121356a = barcodeBatch;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.f121356a;
    }
}
