package com.scandit.datacapture.barcode.internal.module.count.ui.viewholders;

import android.content.Context;
import android.view.View;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class I extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ K f121883a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(K k10) {
        super(0);
        this.f121883a = k10;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        K k10 = this.f121883a;
        z1 z1Var = k10.f121908d;
        H action = new H(k10);
        z1Var.getClass();
        Intrinsics.j(action, "action");
        Context context = z1Var.f122115a.getContext();
        Intrinsics.i(context, "getContext(...)");
        return (View) action.invoke(context);
    }
}
