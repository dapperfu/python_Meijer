package com.scandit.datacapture.barcode.internal.module.count.ui.viewholders;

import android.content.Context;
import android.view.View;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class M0 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ O0 f121911a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M0(O0 o02) {
        super(0);
        this.f121911a = o02;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        O0 o02 = this.f121911a;
        z1 z1Var = o02.f121919f;
        L0 action = new L0(o02);
        z1Var.getClass();
        Intrinsics.j(action, "action");
        Context context = z1Var.f122115a.getContext();
        Intrinsics.i(context, "getContext(...)");
        return (View) action.invoke(context);
    }
}
