package com.scandit.datacapture.barcode.batch.capture;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class C extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BarcodeBatch f121389a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(BarcodeBatch barcodeBatch) {
        super(0);
        this.f121389a = barcodeBatch;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.f121389a;
    }
}
