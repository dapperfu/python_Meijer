package com.scandit.datacapture.barcode.internal.module.count.ui.viewholders;

import android.view.ViewGroup;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class E0 extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ J0 f121865a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f121866b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function0 f121867c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E0(J0 j02, boolean z10, Function0 function0) {
        super(1);
        this.f121865a = j02;
        this.f121866b = z10;
        this.f121867c = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ViewGroup it = (ViewGroup) obj;
        Intrinsics.j(it, "it");
        com.scandit.datacapture.barcode.internal.module.count.ui.o oVar = this.f121865a.f121899i;
        if (oVar != null) {
            oVar.setEnabled(this.f121866b);
        }
        this.f121867c.invoke();
        return Unit.f142422a;
    }
}
