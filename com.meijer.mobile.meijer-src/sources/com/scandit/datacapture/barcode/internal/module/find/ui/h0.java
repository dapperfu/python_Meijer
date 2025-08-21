package com.scandit.datacapture.barcode.internal.module.find.ui;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class h0 extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u0 f123171a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f123172b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(u0 u0Var, boolean z10) {
        super(1);
        this.f123171a = u0Var;
        this.f123172b = z10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        com.scandit.datacapture.barcode.internal.module.ui.l it = (com.scandit.datacapture.barcode.internal.module.ui.l) obj;
        Intrinsics.j(it, "it");
        this.f123171a.f123237e.setVisibility(this.f123172b ? 0 : 8);
        return Unit.f143329a;
    }
}
