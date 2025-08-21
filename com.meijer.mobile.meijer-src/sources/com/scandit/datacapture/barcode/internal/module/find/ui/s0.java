package com.scandit.datacapture.barcode.internal.module.find.ui;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class s0 extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u0 f123228a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f123229b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(u0 u0Var, ArrayList arrayList) {
        super(1);
        this.f123228a = u0Var;
        this.f123229b = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C13285a it = (C13285a) obj;
        Intrinsics.j(it, "it");
        this.f123228a.f123236d.a((ArrayList) this.f123229b);
        return Unit.f143329a;
    }
}
