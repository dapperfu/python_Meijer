package com.scandit.datacapture.barcode.internal.module.count.ui.viewholders;

import android.content.Context;
import android.view.View;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.h0, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13116h0 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C13124l0 f122012a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13116h0(C13124l0 c13124l0) {
        super(0);
        this.f122012a = c13124l0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        C13124l0 c13124l0 = this.f122012a;
        z1 z1Var = c13124l0.f122034f;
        C13114g0 action = new C13114g0(c13124l0);
        z1Var.getClass();
        Intrinsics.j(action, "action");
        Context context = z1Var.f122115a.getContext();
        Intrinsics.i(context, "getContext(...)");
        return (View) action.invoke(context);
    }
}
