package com.scandit.datacapture.barcode.internal.module.count.ui.viewholders;

import android.content.Context;
import android.view.View;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class T extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ X f122877a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(X x10) {
        super(0);
        this.f122877a = x10;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        X x10 = this.f122877a;
        z1 z1Var = x10.f122895d;
        S action = new S(x10);
        z1Var.getClass();
        Intrinsics.j(action, "action");
        Context context = z1Var.f123067a.getContext();
        Intrinsics.i(context, "getContext(...)");
        return (View) action.invoke(context);
    }
}
