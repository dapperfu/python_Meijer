package com.scandit.datacapture.barcode.internal.module.count.ui.viewholders;

import android.content.Context;
import android.view.View;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class C extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ F f121858a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(F f10) {
        super(0);
        this.f121858a = f10;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        F f10 = this.f121858a;
        z1 z1Var = f10.f121872e;
        B action = new B(f10);
        z1Var.getClass();
        Intrinsics.j(action, "action");
        Context context = z1Var.f122115a.getContext();
        Intrinsics.i(context, "getContext(...)");
        return (View) action.invoke(context);
    }
}
