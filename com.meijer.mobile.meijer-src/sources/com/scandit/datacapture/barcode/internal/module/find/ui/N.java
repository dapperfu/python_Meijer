package com.scandit.datacapture.barcode.internal.module.find.ui;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class N extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u0 f123108a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(u0 u0Var) {
        super(1);
        this.f123108a = u0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        com.scandit.datacapture.barcode.internal.module.ui.l it = (com.scandit.datacapture.barcode.internal.module.ui.l) obj;
        Intrinsics.j(it, "it");
        com.scandit.datacapture.barcode.internal.module.ui.l lVar = this.f123108a.f123237e;
        com.scandit.datacapture.barcode.internal.module.ui.j jVar = com.scandit.datacapture.barcode.internal.module.ui.j.f124291a;
        lVar.a();
        return Unit.f143329a;
    }
}
