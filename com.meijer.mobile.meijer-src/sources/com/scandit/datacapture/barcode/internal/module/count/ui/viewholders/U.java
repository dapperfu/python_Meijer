package com.scandit.datacapture.barcode.internal.module.count.ui.viewholders;

import android.view.ViewGroup;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class U extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ X f122879a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f122880b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f122881c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function0 f122882d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(X x10, boolean z10, String str, Function0 function0) {
        super(1);
        this.f122879a = x10;
        this.f122880b = z10;
        this.f122881c = str;
        this.f122882d = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ViewGroup it = (ViewGroup) obj;
        Intrinsics.j(it, "it");
        X x10 = this.f122879a;
        boolean z10 = this.f122880b;
        String str = this.f122881c;
        com.scandit.datacapture.barcode.internal.module.count.ui.l lVar = x10.f122894c;
        if (lVar != null) {
            lVar.setVisibility(z10 ? 0 : 4);
            lVar.f122651b.setText(str);
        }
        this.f122882d.invoke();
        return Unit.f143329a;
    }
}
