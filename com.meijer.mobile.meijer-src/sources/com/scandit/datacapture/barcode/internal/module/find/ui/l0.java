package com.scandit.datacapture.barcode.internal.module.find.ui;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class l0 extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u0 f123181a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f123182b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(u0 u0Var, String str) {
        super(1);
        this.f123181a = u0Var;
        this.f123182b = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        com.scandit.datacapture.barcode.internal.module.ui.l it = (com.scandit.datacapture.barcode.internal.module.ui.l) obj;
        Intrinsics.j(it, "it");
        this.f123181a.f123237e.a(com.scandit.datacapture.barcode.internal.module.ui.j.f124294d, this.f123182b);
        return Unit.f143329a;
    }
}
