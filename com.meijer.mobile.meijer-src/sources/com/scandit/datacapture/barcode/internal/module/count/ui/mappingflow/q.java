package com.scandit.datacapture.barcode.internal.module.count.ui.mappingflow;

import android.content.Context;
import android.view.View;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.z1;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class q extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f122692a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(r rVar) {
        super(0);
        this.f122692a = rVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        r rVar = this.f122692a;
        z1 z1Var = rVar.f122696c;
        p action = new p(rVar);
        z1Var.getClass();
        Intrinsics.j(action, "action");
        Context context = z1Var.f123067a.getContext();
        Intrinsics.i(context, "getContext(...)");
        return (View) action.invoke(context);
    }
}
