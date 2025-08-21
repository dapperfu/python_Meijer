package com.scandit.datacapture.barcode.internal.module.ar.capture;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class a extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NativeBarcodeAr f122010a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(NativeBarcodeAr nativeBarcodeAr) {
        super(0);
        this.f122010a = nativeBarcodeAr;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        NativeBarcodeArSession session = this.f122010a.getSession();
        Intrinsics.i(session, "getSession(...)");
        return session;
    }
}
