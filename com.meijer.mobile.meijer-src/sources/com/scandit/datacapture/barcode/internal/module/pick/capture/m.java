package com.scandit.datacapture.barcode.internal.module.pick.capture;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class m extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BarcodePickInternal f123392a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(BarcodePickInternal barcodePickInternal) {
        super(0);
        this.f123392a = barcodePickInternal;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.f123392a.c();
    }
}
