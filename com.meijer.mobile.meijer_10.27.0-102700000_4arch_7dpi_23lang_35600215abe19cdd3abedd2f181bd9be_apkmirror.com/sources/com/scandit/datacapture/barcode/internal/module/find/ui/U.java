package com.scandit.datacapture.barcode.internal.module.find.ui;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class U extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u0 f122165a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f122166b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(u0 u0Var, boolean z10) {
        super(1);
        this.f122165a = u0Var;
        this.f122166b = z10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C13152a it = (C13152a) obj;
        Intrinsics.j(it, "it");
        C13152a c13152a = this.f122165a.f122284d;
        boolean z10 = this.f122166b;
        c13152a.f122180g = z10;
        int childCount = c13152a.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = c13152a.getChildAt(i10);
            C13168m c13168m = childAt instanceof C13168m ? (C13168m) childAt : null;
            if (c13168m != null) {
                if (!z10 || c13168m.f122247e) {
                    c13168m.f122246d.stop();
                } else {
                    c13168m.f122246d.start();
                }
            }
        }
        return Unit.f142422a;
    }
}
