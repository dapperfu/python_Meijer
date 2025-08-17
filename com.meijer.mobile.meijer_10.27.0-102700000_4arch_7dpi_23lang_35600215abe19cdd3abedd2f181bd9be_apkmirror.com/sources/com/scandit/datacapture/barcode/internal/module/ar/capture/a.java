package com.scandit.datacapture.barcode.internal.module.ar.capture;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class a extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NativeBarcodeAr f121058a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(NativeBarcodeAr nativeBarcodeAr) {
        super(0);
        this.f121058a = nativeBarcodeAr;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        NativeBarcodeArSession session = this.f121058a.getSession();
        Intrinsics.i(session, "getSession(...)");
        return session;
    }
}
