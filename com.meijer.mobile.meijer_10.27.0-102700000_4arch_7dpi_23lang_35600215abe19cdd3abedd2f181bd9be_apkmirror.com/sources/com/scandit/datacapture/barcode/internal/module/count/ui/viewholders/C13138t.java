package com.scandit.datacapture.barcode.internal.module.count.ui.viewholders;

import android.content.Context;
import android.view.View;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.t, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13138t extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C13146x f122072a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13138t(C13146x c13146x) {
        super(0);
        this.f122072a = c13146x;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        C13146x c13146x = this.f122072a;
        z1 z1Var = c13146x.f122103g;
        C13136s action = new C13136s(c13146x);
        z1Var.getClass();
        Intrinsics.j(action, "action");
        Context context = z1Var.f122115a.getContext();
        Intrinsics.i(context, "getContext(...)");
        return (View) action.invoke(context);
    }
}
