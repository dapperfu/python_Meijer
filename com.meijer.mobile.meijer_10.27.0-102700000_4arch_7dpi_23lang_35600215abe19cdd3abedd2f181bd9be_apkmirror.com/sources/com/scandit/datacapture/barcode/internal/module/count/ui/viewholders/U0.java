package com.scandit.datacapture.barcode.internal.module.count.ui.viewholders;

import android.content.Context;
import android.view.View;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class U0 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Z0 f121931a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U0(Z0 z02) {
        super(0);
        this.f121931a = z02;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Z0 z02 = this.f121931a;
        z1 z1Var = z02.f121955e;
        T0 action = new T0(z02);
        z1Var.getClass();
        Intrinsics.j(action, "action");
        Context context = z1Var.f122115a.getContext();
        Intrinsics.i(context, "getContext(...)");
        return (View) action.invoke(context);
    }
}
