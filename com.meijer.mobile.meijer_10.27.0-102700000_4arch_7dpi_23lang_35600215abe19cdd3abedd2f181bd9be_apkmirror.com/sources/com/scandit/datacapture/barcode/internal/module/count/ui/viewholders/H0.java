package com.scandit.datacapture.barcode.internal.module.count.ui.viewholders;

import android.view.ViewGroup;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class H0 extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ J0 f121880a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f121881b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function0 f121882c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H0(J0 j02, boolean z10, I0 i02) {
        super(1);
        this.f121880a = j02;
        this.f121881b = z10;
        this.f121882c = i02;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ViewGroup it = (ViewGroup) obj;
        Intrinsics.j(it, "it");
        com.scandit.datacapture.barcode.internal.module.count.ui.o oVar = this.f121880a.f121898h;
        if (oVar != null) {
            oVar.setEnabled(this.f121881b);
        }
        this.f121882c.invoke();
        return Unit.f142422a;
    }
}
