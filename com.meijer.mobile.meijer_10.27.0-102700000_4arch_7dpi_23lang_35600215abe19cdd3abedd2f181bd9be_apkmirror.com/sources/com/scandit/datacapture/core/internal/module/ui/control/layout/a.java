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

/* loaded from: classes11.dex */
public final class a extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Control f125196a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ControlLayout f125197b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Anchor f125198c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ PointWithUnit f125199d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Control control, ControlLayout controlLayout, Anchor anchor, PointWithUnit pointWithUnit) {
        super(1);
        this.f125196a = control;
        this.f125197b = controlLayout;
        this.f125198c = anchor;
        this.f125199d = pointWithUnit;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ControlLayout it = (ControlLayout) obj;
        Intrinsics.j(it, "it");
        View view = this.f125196a.get_view();
        ((d) this.f125197b.f125194a).a(view, this.f125198c, this.f125199d, new Size2(this.f125197b.getWidth(), this.f125197b.getHeight()));
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        this.f125197b.addView(view, view.getLayoutParams());
        return Unit.f142422a;
    }
}
