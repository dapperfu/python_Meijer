package com.scandit.datacapture.barcode.internal.module.count.ui.viewholders;

import android.content.Context;
import android.view.View;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class u1 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y1 f123034a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(y1 y1Var) {
        super(0);
        this.f123034a = y1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        y1 y1Var = this.f123034a;
        z1 z1Var = y1Var.f123064c;
        t1 action = new t1(y1Var);
        z1Var.getClass();
        Intrinsics.j(action, "action");
        Context context = z1Var.f123067a.getContext();
        Intrinsics.i(context, "getContext(...)");
        return (View) action.invoke(context);
    }
}
