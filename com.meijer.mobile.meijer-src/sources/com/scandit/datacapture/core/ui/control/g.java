package com.scandit.datacapture.core.ui.control;

import android.view.View;
import android.widget.LinearLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class g extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LinearLayout f127025a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f127026b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(LinearLayout linearLayout, View view) {
        super(1);
        this.f127025a = linearLayout;
        this.f127026b = view;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        LinearLayout it = (LinearLayout) obj;
        Intrinsics.j(it, "it");
        this.f127025a.addView(this.f127026b);
        return Unit.f143329a;
    }
}
