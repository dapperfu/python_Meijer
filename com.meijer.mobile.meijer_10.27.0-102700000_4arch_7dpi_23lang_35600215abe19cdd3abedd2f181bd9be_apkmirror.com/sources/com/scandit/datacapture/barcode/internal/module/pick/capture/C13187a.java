package com.scandit.datacapture.barcode.internal.module.pick.capture;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.barcode.internal.module.pick.capture.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13187a extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NativeBarcodePick f122428a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13187a(NativeBarcodePick nativeBarcodePick) {
        super(0);
        this.f122428a = nativeBarcodePick;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        NativeBarcodePickSession session = this.f122428a.getSession();
        Intrinsics.i(session, "getSession(...)");
        return session;
    }
}
