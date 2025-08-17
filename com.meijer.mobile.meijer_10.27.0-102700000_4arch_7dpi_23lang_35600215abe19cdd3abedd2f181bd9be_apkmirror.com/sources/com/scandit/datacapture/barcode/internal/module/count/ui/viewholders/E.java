package com.scandit.datacapture.barcode.internal.module.count.ui.viewholders;

import android.view.ViewGroup;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class E extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ F f121862a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f121863b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function0 f121864c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(F f10, int i10, Function0 function0) {
        super(1);
        this.f121862a = f10;
        this.f121863b = i10;
        this.f121864c = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ViewGroup it = (ViewGroup) obj;
        Intrinsics.j(it, "it");
        com.scandit.datacapture.barcode.internal.module.count.ui.j jVar = this.f121862a.f121871d;
        if (jVar != null) {
            jVar.a(this.f121863b);
        }
        this.f121864c.invoke();
        return Unit.f142422a;
    }
}
