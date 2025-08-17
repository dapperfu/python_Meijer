package com.scandit.datacapture.barcode.internal.module.count.ui.viewholders;

import android.content.Context;
import android.view.View;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.m, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13125m extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C13133q f122036a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13125m(C13133q c13133q) {
        super(0);
        this.f122036a = c13133q;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        C13133q c13133q = this.f122036a;
        z1 z1Var = c13133q.f122063g;
        C13123l action = new C13123l(c13133q);
        z1Var.getClass();
        Intrinsics.j(action, "action");
        Context context = z1Var.f122115a.getContext();
        Intrinsics.i(context, "getContext(...)");
        return (View) action.invoke(context);
    }
}
