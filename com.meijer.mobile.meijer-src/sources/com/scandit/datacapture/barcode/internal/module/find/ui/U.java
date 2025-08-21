package com.scandit.datacapture.barcode.internal.module.find.ui;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class U extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u0 f123117a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f123118b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(u0 u0Var, boolean z10) {
        super(1);
        this.f123117a = u0Var;
        this.f123118b = z10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C13285a it = (C13285a) obj;
        Intrinsics.j(it, "it");
        C13285a c13285a = this.f123117a.f123236d;
        boolean z10 = this.f123118b;
        c13285a.f123132g = z10;
        int childCount = c13285a.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = c13285a.getChildAt(i10);
            C13301m c13301m = childAt instanceof C13301m ? (C13301m) childAt : null;
            if (c13301m != null) {
                if (!z10 || c13301m.f123199e) {
                    c13301m.f123198d.stop();
                } else {
                    c13301m.f123198d.start();
                }
            }
        }
        return Unit.f143329a;
    }
}
