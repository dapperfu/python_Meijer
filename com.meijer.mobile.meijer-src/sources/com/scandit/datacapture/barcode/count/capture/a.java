package com.scandit.datacapture.barcode.count.capture;

import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCount;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountSession;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class a extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NativeBarcodeCount f121583a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(NativeBarcodeCount nativeBarcodeCount) {
        super(0);
        this.f121583a = nativeBarcodeCount;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        NativeBarcodeCountSession session = this.f121583a.getSession();
        Intrinsics.i(session, "getSession(...)");
        return session;
    }
}
