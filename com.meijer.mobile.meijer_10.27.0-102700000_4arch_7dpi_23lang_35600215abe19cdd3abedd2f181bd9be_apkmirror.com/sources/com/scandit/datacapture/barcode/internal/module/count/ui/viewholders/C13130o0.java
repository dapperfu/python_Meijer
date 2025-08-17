package com.scandit.datacapture.barcode.internal.module.count.ui.viewholders;

import android.content.Context;
import android.view.View;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.o0, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13130o0 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C13139t0 f122051a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13130o0(C13139t0 c13139t0) {
        super(0);
        this.f122051a = c13139t0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        C13139t0 c13139t0 = this.f122051a;
        z1 z1Var = c13139t0.f122079g;
        C13128n0 action = new C13128n0(c13139t0);
        z1Var.getClass();
        Intrinsics.j(action, "action");
        Context context = z1Var.f122115a.getContext();
        Intrinsics.i(context, "getContext(...)");
        return (View) action.invoke(context);
    }
}
