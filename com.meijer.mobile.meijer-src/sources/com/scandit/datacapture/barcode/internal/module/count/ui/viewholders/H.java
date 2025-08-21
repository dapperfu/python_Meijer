package com.scandit.datacapture.barcode.internal.module.count.ui.viewholders;

import android.content.Context;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class H extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ K f122831a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(K k10) {
        super(1);
        this.f122831a = k10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Context it = (Context) obj;
        Intrinsics.j(it, "it");
        K k10 = this.f122831a;
        int i10 = K.f122855e;
        k10.getClass();
        com.scandit.datacapture.barcode.internal.module.ui.d dVar = new com.scandit.datacapture.barcode.internal.module.ui.d(it);
        dVar.setLayoutParams(k10.c());
        dVar.setVisibility(4);
        k10.f122859c = dVar;
        return dVar;
    }
}
