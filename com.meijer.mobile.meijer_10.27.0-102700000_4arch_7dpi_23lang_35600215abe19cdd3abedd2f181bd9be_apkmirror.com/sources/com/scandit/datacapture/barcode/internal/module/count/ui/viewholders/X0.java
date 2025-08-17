package com.scandit.datacapture.barcode.internal.module.count.ui.viewholders;

import android.view.ViewGroup;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class X0 extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Z0 f121944a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f121945b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function0 f121946c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X0(Z0 z02, boolean z10, Function0 function0) {
        super(1);
        this.f121944a = z02;
        this.f121945b = z10;
        this.f121946c = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ViewGroup it = (ViewGroup) obj;
        Intrinsics.j(it, "it");
        com.scandit.datacapture.barcode.internal.module.count.ui.q qVar = this.f121944a.f121954d;
        if (qVar != null) {
            qVar.a(this.f121945b);
        }
        this.f121946c.invoke();
        return Unit.f142422a;
    }
}
