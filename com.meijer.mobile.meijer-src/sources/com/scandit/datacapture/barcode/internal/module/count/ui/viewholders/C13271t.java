package com.scandit.datacapture.barcode.internal.module.count.ui.viewholders;

import android.content.Context;
import android.view.View;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.t, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13271t extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C13279x f123024a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13271t(C13279x c13279x) {
        super(0);
        this.f123024a = c13279x;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        C13279x c13279x = this.f123024a;
        z1 z1Var = c13279x.f123055g;
        C13269s action = new C13269s(c13279x);
        z1Var.getClass();
        Intrinsics.j(action, "action");
        Context context = z1Var.f123067a.getContext();
        Intrinsics.i(context, "getContext(...)");
        return (View) action.invoke(context);
    }
}
