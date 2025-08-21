package com.scandit.datacapture.barcode.internal.module.count.ui.viewholders;

import android.content.Context;
import android.view.View;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.m, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13258m extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C13266q f122988a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13258m(C13266q c13266q) {
        super(0);
        this.f122988a = c13266q;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        C13266q c13266q = this.f122988a;
        z1 z1Var = c13266q.f123015g;
        C13256l action = new C13256l(c13266q);
        z1Var.getClass();
        Intrinsics.j(action, "action");
        Context context = z1Var.f123067a.getContext();
        Intrinsics.i(context, "getContext(...)");
        return (View) action.invoke(context);
    }
}
