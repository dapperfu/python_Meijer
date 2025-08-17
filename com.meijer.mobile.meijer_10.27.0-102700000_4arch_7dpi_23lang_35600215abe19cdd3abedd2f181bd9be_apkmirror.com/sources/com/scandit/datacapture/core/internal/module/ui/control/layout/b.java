package com.scandit.datacapture.core.internal.module.ui.control.layout;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class b extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ControlLayout f125200a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f125201b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ControlLayout controlLayout, View view) {
        super(1);
        this.f125200a = controlLayout;
        this.f125201b = view;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ControlLayout it = (ControlLayout) obj;
        Intrinsics.j(it, "it");
        this.f125200a.removeView(this.f125201b);
        return Unit.f142422a;
    }
}
