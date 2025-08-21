package com.scandit.datacapture.barcode.internal.module.ui.viewpositioner;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class f {

    /* renamed from: e, reason: collision with root package name */
    public static final e f124380e = new e();

    /* renamed from: a, reason: collision with root package name */
    public final d f124381a;

    /* renamed from: b, reason: collision with root package name */
    public final Function1 f124382b;

    /* renamed from: c, reason: collision with root package name */
    public View f124383c;

    /* renamed from: d, reason: collision with root package name */
    public ViewGroup f124384d;

    public final ViewGroup a() {
        ViewGroup viewGroup = this.f124384d;
        if (viewGroup != null) {
            return viewGroup;
        }
        Intrinsics.x("parent");
        return null;
    }

    public f(d positioner, Function1 factory) {
        Intrinsics.j(positioner, "positioner");
        Intrinsics.j(factory, "factory");
        this.f124381a = positioner;
        this.f124382b = factory;
    }

    public final void a(ViewGroup parent) {
        Intrinsics.j(parent, "parent");
        Function1 function1 = this.f124382b;
        Context context = parent.getContext();
        Intrinsics.i(context, "getContext(...)");
        View view = (View) function1.invoke(context);
        Intrinsics.j(view, "<set-?>");
        this.f124383c = view;
        parent.addView(b());
        Intrinsics.j(parent, "<set-?>");
        this.f124384d = parent;
        this.f124381a.a(b(), a());
    }

    public final View b() {
        View view = this.f124383c;
        if (view != null) {
            return view;
        }
        Intrinsics.x("view");
        return null;
    }
}
