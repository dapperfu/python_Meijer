package com.scandit.datacapture.barcode.internal.module.find.ui;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class N extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u0 f122156a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(u0 u0Var) {
        super(1);
        this.f122156a = u0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        com.scandit.datacapture.barcode.internal.module.ui.l it = (com.scandit.datacapture.barcode.internal.module.ui.l) obj;
        Intrinsics.j(it, "it");
        com.scandit.datacapture.barcode.internal.module.ui.l lVar = this.f122156a.f122285e;
        com.scandit.datacapture.barcode.internal.module.ui.j jVar = com.scandit.datacapture.barcode.internal.module.ui.j.f123339a;
        lVar.a();
        return Unit.f142422a;
    }
}
