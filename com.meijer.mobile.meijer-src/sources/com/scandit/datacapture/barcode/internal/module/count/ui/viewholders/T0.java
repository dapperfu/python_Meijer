package com.scandit.datacapture.barcode.internal.module.count.ui.viewholders;

import android.content.Context;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class T0 extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Z0 f122878a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T0(Z0 z02) {
        super(1);
        this.f122878a = z02;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Context it = (Context) obj;
        Intrinsics.j(it, "it");
        Z0 z02 = this.f122878a;
        z02.getClass();
        com.scandit.datacapture.barcode.internal.module.count.ui.q qVar = new com.scandit.datacapture.barcode.internal.module.count.ui.q(it, new V0(z02));
        qVar.setLayoutParams(z02.c());
        qVar.setVisibility(4);
        qVar.setEnabled(false);
        qVar.setId(AbstractC13236b.f122926l);
        z02.f122906d = qVar;
        return qVar;
    }
}
