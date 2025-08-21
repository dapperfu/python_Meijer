package com.scandit.datacapture.barcode.internal.module.count.ui.viewholders;

import android.content.Context;
import android.view.View;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.o0, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13263o0 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C13272t0 f123003a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13263o0(C13272t0 c13272t0) {
        super(0);
        this.f123003a = c13272t0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        C13272t0 c13272t0 = this.f123003a;
        z1 z1Var = c13272t0.f123031g;
        C13261n0 action = new C13261n0(c13272t0);
        z1Var.getClass();
        Intrinsics.j(action, "action");
        Context context = z1Var.f123067a.getContext();
        Intrinsics.i(context, "getContext(...)");
        return (View) action.invoke(context);
    }
}
