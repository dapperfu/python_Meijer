package com.scandit.datacapture.barcode.internal.module.find.ui;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class V extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u0 f122167a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f122168b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f122169c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(u0 u0Var, int i10, int i11) {
        super(1);
        this.f122167a = u0Var;
        this.f122168b = i10;
        this.f122169c = i11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        com.scandit.datacapture.barcode.internal.module.ui.d it = (com.scandit.datacapture.barcode.internal.module.ui.d) obj;
        Intrinsics.j(it, "it");
        com.scandit.datacapture.barcode.internal.module.ui.d dVar = this.f122167a.f122288h;
        dVar.f123305a = this.f122168b;
        dVar.b();
        com.scandit.datacapture.barcode.internal.module.ui.d dVar2 = this.f122167a.f122288h;
        dVar2.f123306b = this.f122169c;
        dVar2.b();
        return Unit.f142422a;
    }
}
