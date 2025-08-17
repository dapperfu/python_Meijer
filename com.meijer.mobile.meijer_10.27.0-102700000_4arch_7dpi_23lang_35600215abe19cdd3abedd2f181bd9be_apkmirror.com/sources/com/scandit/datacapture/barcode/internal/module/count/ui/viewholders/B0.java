package com.scandit.datacapture.barcode.internal.module.count.ui.viewholders;

import android.content.Context;
import android.view.View;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class B0 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ J0 f121857a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B0(J0 j02) {
        super(0);
        this.f121857a = j02;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        J0 j02 = this.f121857a;
        z1 z1Var = j02.f121896f;
        A0 action = new A0(j02);
        z1Var.getClass();
        Intrinsics.j(action, "action");
        Context context = z1Var.f122115a.getContext();
        Intrinsics.i(context, "getContext(...)");
        return (View) action.invoke(context);
    }
}
