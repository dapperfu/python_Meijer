package com.scandit.datacapture.barcode.internal.module.count.ui.viewholders;

import android.view.ViewGroup;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class E0 extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ J0 f122817a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f122818b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function0 f122819c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E0(J0 j02, boolean z10, Function0 function0) {
        super(1);
        this.f122817a = j02;
        this.f122818b = z10;
        this.f122819c = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ViewGroup it = (ViewGroup) obj;
        Intrinsics.j(it, "it");
        com.scandit.datacapture.barcode.internal.module.count.ui.o oVar = this.f122817a.f122851i;
        if (oVar != null) {
            oVar.setEnabled(this.f122818b);
        }
        this.f122819c.invoke();
        return Unit.f143329a;
    }
}
