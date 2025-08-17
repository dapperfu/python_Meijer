package com.scandit.datacapture.core.ui.control;

import android.view.ViewGroup;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class e extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LinearControlGroup f126070a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Control f126071b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(LinearControlGroup linearControlGroup, Control control) {
        super(1);
        this.f126070a = linearControlGroup;
        this.f126071b = control;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ViewGroup it = (ViewGroup) obj;
        Intrinsics.j(it, "it");
        this.f126070a.get_view().removeView(this.f126071b.get_view());
        return Unit.f142422a;
    }
}
