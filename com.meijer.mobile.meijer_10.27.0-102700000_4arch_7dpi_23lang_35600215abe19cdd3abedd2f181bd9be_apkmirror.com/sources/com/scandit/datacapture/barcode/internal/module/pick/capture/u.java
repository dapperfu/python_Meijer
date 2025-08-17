package com.scandit.datacapture.barcode.internal.module.pick.capture;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class u extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v f122452a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(v vVar) {
        super(0);
        this.f122452a = vVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new w((NativeBarcodePickSession) this.f122452a.f122453a.invoke());
    }
}
