package com.scandit.datacapture.barcode.internal.module.count.ui.viewholders;

import android.content.Context;
import android.view.View;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.a0, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13235a0 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C13243e0 f122909a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13235a0(C13243e0 c13243e0) {
        super(0);
        this.f122909a = c13243e0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        C13243e0 c13243e0 = this.f122909a;
        z1 z1Var = c13243e0.f122940f;
        Z action = new Z(c13243e0);
        z1Var.getClass();
        Intrinsics.j(action, "action");
        Context context = z1Var.f123067a.getContext();
        Intrinsics.i(context, "getContext(...)");
        return (View) action.invoke(context);
    }
}
