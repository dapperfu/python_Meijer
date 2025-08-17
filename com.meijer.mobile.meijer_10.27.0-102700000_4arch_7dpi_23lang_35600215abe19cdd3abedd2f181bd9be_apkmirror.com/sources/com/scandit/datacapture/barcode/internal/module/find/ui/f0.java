package com.scandit.datacapture.barcode.internal.module.find.ui;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class f0 extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u0 f122215a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(u0 u0Var) {
        super(1);
        this.f122215a = u0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        com.scandit.datacapture.barcode.internal.module.ui.d it = (com.scandit.datacapture.barcode.internal.module.ui.d) obj;
        Intrinsics.j(it, "it");
        this.f122215a.f122291k.b();
        return Unit.f142422a;
    }
}
