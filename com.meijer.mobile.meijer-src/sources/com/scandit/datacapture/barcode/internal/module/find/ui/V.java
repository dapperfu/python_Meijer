package com.scandit.datacapture.barcode.internal.module.find.ui;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class V extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u0 f123119a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f123120b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f123121c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(u0 u0Var, int i10, int i11) {
        super(1);
        this.f123119a = u0Var;
        this.f123120b = i10;
        this.f123121c = i11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        com.scandit.datacapture.barcode.internal.module.ui.d it = (com.scandit.datacapture.barcode.internal.module.ui.d) obj;
        Intrinsics.j(it, "it");
        com.scandit.datacapture.barcode.internal.module.ui.d dVar = this.f123119a.f123240h;
        dVar.f124257a = this.f123120b;
        dVar.b();
        com.scandit.datacapture.barcode.internal.module.ui.d dVar2 = this.f123119a.f123240h;
        dVar2.f124258b = this.f123121c;
        dVar2.b();
        return Unit.f143329a;
    }
}
