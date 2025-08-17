package com.scandit.datacapture.barcode.internal.module.count.ui.viewholders;

import android.view.ViewGroup;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class Y0 extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Z0 f121947a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f121948b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function0 f121949c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y0(Z0 z02, boolean z10, Function0 function0) {
        super(1);
        this.f121947a = z02;
        this.f121948b = z10;
        this.f121949c = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ViewGroup it = (ViewGroup) obj;
        Intrinsics.j(it, "it");
        com.scandit.datacapture.barcode.internal.module.count.ui.q qVar = this.f121947a.f121954d;
        if (qVar != null) {
            qVar.setEnabled(this.f121948b);
        }
        this.f121949c.invoke();
        return Unit.f142422a;
    }
}
