package com.scandit.datacapture.barcode.internal.module.ui.viewpositioner;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class f {

    /* renamed from: e, reason: collision with root package name */
    public static final e f123428e = new e();

    /* renamed from: a, reason: collision with root package name */
    public final d f123429a;

    /* renamed from: b, reason: collision with root package name */
    public final Function1 f123430b;

    /* renamed from: c, reason: collision with root package name */
    public View f123431c;

    /* renamed from: d, reason: collision with root package name */
    public ViewGroup f123432d;

    public final ViewGroup a() {
        ViewGroup viewGroup = this.f123432d;
        if (viewGroup != null) {
            return viewGroup;
        }
        Intrinsics.y("parent");
        return null;
    }

    public f(d positioner, Function1 factory) {
        Intrinsics.j(positioner, "positioner");
        Intrinsics.j(factory, "factory");
        this.f123429a = positioner;
        this.f123430b = factory;
    }

    public final void a(ViewGroup parent) {
        Intrinsics.j(parent, "parent");
        Function1 function1 = this.f123430b;
        Context context = parent.getContext();
        Intrinsics.i(context, "getContext(...)");
        View view = (View) function1.invoke(context);
        Intrinsics.j(view, "<set-?>");
        this.f123431c = view;
        parent.addView(b());
        Intrinsics.j(parent, "<set-?>");
        this.f123432d = parent;
        this.f123429a.a(b(), a());
    }

    public final View b() {
        View view = this.f123431c;
        if (view != null) {
            return view;
        }
        Intrinsics.y("view");
        return null;
    }
}
