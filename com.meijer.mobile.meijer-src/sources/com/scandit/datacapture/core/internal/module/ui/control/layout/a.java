package com.scandit.datacapture.core.internal.module.ui.control.layout;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.scandit.datacapture.core.common.geometry.Anchor;
import com.scandit.datacapture.core.common.geometry.PointWithUnit;
import com.scandit.datacapture.core.common.geometry.Size2;
import com.scandit.datacapture.core.ui.control.Control;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class a extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Control f126148a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ControlLayout f126149b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Anchor f126150c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ PointWithUnit f126151d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Control control, ControlLayout controlLayout, Anchor anchor, PointWithUnit pointWithUnit) {
        super(1);
        this.f126148a = control;
        this.f126149b = controlLayout;
        this.f126150c = anchor;
        this.f126151d = pointWithUnit;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ControlLayout it = (ControlLayout) obj;
        Intrinsics.j(it, "it");
        View view = this.f126148a.get_view();
        ((d) this.f126149b.f126146a).a(view, this.f126150c, this.f126151d, new Size2(this.f126149b.getWidth(), this.f126149b.getHeight()));
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        this.f126149b.addView(view, view.getLayoutParams());
        return Unit.f143329a;
    }
}
