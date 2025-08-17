package com.scandit.datacapture.barcode.internal.module.pick.capture;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class p extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BarcodePickInternal f122443a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(BarcodePickInternal barcodePickInternal) {
        super(0);
        this.f122443a = barcodePickInternal;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.f122443a.c();
    }
}
