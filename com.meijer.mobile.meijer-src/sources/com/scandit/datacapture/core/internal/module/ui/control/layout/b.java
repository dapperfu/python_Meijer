package com.scandit.datacapture.core.internal.module.ui.control.layout;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class b extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ControlLayout f126152a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f126153b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ControlLayout controlLayout, View view) {
        super(1);
        this.f126152a = controlLayout;
        this.f126153b = view;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ControlLayout it = (ControlLayout) obj;
        Intrinsics.j(it, "it");
        this.f126152a.removeView(this.f126153b);
        return Unit.f143329a;
    }
}
