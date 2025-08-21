package com.scandit.datacapture.barcode.internal.module.pick.ui.guidances;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class c extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f123479a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(g gVar) {
        super(1);
        this.f123479a = gVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        g it = (g) obj;
        Intrinsics.j(it, "it");
        g gVar = this.f123479a;
        if (gVar.f123489c) {
            gVar.removeView((View) gVar.f123488b.getValue());
            this.f123479a.f123489c = false;
        }
        return Unit.f143329a;
    }
}
