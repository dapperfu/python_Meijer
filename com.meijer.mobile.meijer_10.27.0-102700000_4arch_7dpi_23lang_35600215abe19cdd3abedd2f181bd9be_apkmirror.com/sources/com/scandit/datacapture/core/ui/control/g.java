package com.scandit.datacapture.core.ui.control;

import android.view.View;
import android.widget.LinearLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class g extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LinearLayout f126073a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f126074b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(LinearLayout linearLayout, View view) {
        super(1);
        this.f126073a = linearLayout;
        this.f126074b = view;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        LinearLayout it = (LinearLayout) obj;
        Intrinsics.j(it, "it");
        this.f126073a.addView(this.f126074b);
        return Unit.f142422a;
    }
}
