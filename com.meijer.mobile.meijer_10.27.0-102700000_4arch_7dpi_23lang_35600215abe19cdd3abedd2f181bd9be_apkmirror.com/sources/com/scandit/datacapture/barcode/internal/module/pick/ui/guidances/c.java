package com.scandit.datacapture.barcode.internal.module.pick.ui.guidances;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class c extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f122527a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(g gVar) {
        super(1);
        this.f122527a = gVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        g it = (g) obj;
        Intrinsics.j(it, "it");
        g gVar = this.f122527a;
        if (gVar.f122537c) {
            gVar.removeView((View) gVar.f122536b.getValue());
            this.f122527a.f122537c = false;
        }
        return Unit.f142422a;
    }
}
