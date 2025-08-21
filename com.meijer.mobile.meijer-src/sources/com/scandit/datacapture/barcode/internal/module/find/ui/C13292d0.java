package com.scandit.datacapture.barcode.internal.module.find.ui;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.barcode.internal.module.find.ui.d0, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13292d0 extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u0 f123163a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13292d0(u0 u0Var) {
        super(1);
        this.f123163a = u0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        com.scandit.datacapture.barcode.internal.module.ui.exitbutton.c it = (com.scandit.datacapture.barcode.internal.module.ui.exitbutton.c) obj;
        Intrinsics.j(it, "it");
        this.f123163a.f123243k.b();
        return Unit.f143329a;
    }
}
