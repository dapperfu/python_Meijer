package com.scandit.datacapture.barcode.internal.module.count.ui.viewholders;

import android.view.ViewGroup;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class V extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ X f122884a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f122885b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(X x10, float f10) {
        super(1);
        this.f122884a = x10;
        this.f122885b = f10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ViewGroup it = (ViewGroup) obj;
        Intrinsics.j(it, "it");
        com.scandit.datacapture.barcode.internal.module.count.ui.l lVar = this.f122884a.f122893b;
        if (lVar != null) {
            lVar.f122650a.a(this.f122885b);
        }
        return Unit.f143329a;
    }
}
