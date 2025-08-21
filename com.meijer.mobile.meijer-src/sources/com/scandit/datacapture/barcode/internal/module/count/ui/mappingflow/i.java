package com.scandit.datacapture.barcode.internal.module.count.ui.mappingflow;

import android.content.Context;
import android.view.View;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.z1;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class i extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f122680a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar) {
        super(0);
        this.f122680a = jVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        j jVar = this.f122680a;
        z1 z1Var = jVar.f122683c;
        h action = new h(jVar);
        z1Var.getClass();
        Intrinsics.j(action, "action");
        Context context = z1Var.f123067a.getContext();
        Intrinsics.i(context, "getContext(...)");
        return (View) action.invoke(context);
    }
}
