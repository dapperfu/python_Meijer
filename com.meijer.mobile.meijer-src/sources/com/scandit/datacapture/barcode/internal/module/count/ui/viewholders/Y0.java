package com.scandit.datacapture.barcode.internal.module.count.ui.viewholders;

import android.view.ViewGroup;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class Y0 extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Z0 f122899a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f122900b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function0 f122901c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y0(Z0 z02, boolean z10, Function0 function0) {
        super(1);
        this.f122899a = z02;
        this.f122900b = z10;
        this.f122901c = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ViewGroup it = (ViewGroup) obj;
        Intrinsics.j(it, "it");
        com.scandit.datacapture.barcode.internal.module.count.ui.q qVar = this.f122899a.f122906d;
        if (qVar != null) {
            qVar.setEnabled(this.f122900b);
        }
        this.f122901c.invoke();
        return Unit.f143329a;
    }
}
