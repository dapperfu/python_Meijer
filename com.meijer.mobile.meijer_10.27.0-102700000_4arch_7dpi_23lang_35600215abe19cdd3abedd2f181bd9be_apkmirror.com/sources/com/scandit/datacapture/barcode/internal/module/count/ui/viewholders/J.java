package com.scandit.datacapture.barcode.internal.module.count.ui.viewholders;

import android.view.ViewGroup;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class J extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ K f121887a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f121888b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f121889c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(K k10, int i10, int i11) {
        super(1);
        this.f121887a = k10;
        this.f121888b = i10;
        this.f121889c = i11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ViewGroup it = (ViewGroup) obj;
        Intrinsics.j(it, "it");
        com.scandit.datacapture.barcode.internal.module.ui.d dVar = this.f121887a.f121907c;
        if (dVar != null) {
            dVar.f123306b = this.f121888b;
            dVar.b();
        }
        com.scandit.datacapture.barcode.internal.module.ui.d dVar2 = this.f121887a.f121907c;
        if (dVar2 != null) {
            dVar2.f123305a = this.f121889c;
            dVar2.b();
        }
        return Unit.f142422a;
    }
}
