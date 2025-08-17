package com.scandit.datacapture.barcode.internal.module.find.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.scandit.datacapture.barcode.R;
import com.scandit.datacapture.barcode.find.capture.BarcodeFindItem;
import com.scandit.datacapture.barcode.find.capture.BarcodeFindItemSearchOptions;
import com.scandit.datacapture.barcode.internal.module.ui.animation.PulsingView;
import com.scandit.datacapture.core.internal.sdk.extensions.ViewExtensionsKt;
import com.scandit.datacapture.core.ui.style.Brush;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.internal.module.find.ui.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13152a extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public Function1 f122174a;

    /* renamed from: b, reason: collision with root package name */
    public List f122175b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayDeque f122176c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayDeque f122177d;

    /* renamed from: e, reason: collision with root package name */
    public int f122178e;

    /* renamed from: f, reason: collision with root package name */
    public int f122179f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f122180g;

    public final void a(ArrayList value) {
        C13168m c13168mA;
        BarcodeFindItemSearchOptions searchOptions;
        Brush brush;
        Intrinsics.j(value, "value");
        this.f122175b = value;
        this.f122177d.clear();
        this.f122176c.clear();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            Intrinsics.h(childAt, "null cannot be cast to non-null type com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindDotView");
            C13168m c13168m = (C13168m) childAt;
            if (c13168m.f122247e) {
                this.f122177d.addLast(c13168m);
            } else {
                this.f122176c.addLast(c13168m);
            }
        }
        Iterator it = value.iterator();
        while (it.hasNext()) {
            y0 y0Var = (y0) it.next();
            if (y0Var.f122393b == null) {
                c13168mA = (C13168m) this.f122177d.y();
                if (c13168mA == null) {
                    c13168mA = a();
                    if (true != c13168mA.f122247e) {
                        c13168mA.f122247e = true;
                        ViewExtensionsKt.runOnMainThread(c13168mA, new C13165j(c13168mA));
                    }
                }
            } else {
                c13168mA = (C13168m) this.f122176c.y();
                if (c13168mA == null) {
                    c13168mA = a();
                    if (this.f122180g) {
                        c13168mA.f122246d.start();
                    }
                }
            }
            c13168mA.setVisibility(0);
            boolean z10 = y0Var.f122393b == null;
            if (z10 != c13168mA.f122247e) {
                c13168mA.f122247e = z10;
                ViewExtensionsKt.runOnMainThread(c13168mA, new C13165j(c13168mA));
            }
            BarcodeFindItem barcodeFindItem = y0Var.f122393b;
            int fillColor = (barcodeFindItem == null || (searchOptions = barcodeFindItem.getSearchOptions()) == null || (brush = searchOptions.getBrush()) == null) ? this.f122178e : brush.getFillColor();
            if (fillColor != c13168mA.f122243a.getColor()) {
                c13168mA.f122243a.setColor(fillColor);
                PulsingView pulsingView = c13168mA.f122246d;
                Lazy lazy = C13168m.f122237f;
                pulsingView.a(new int[]{com.scandit.datacapture.barcode.internal.module.extensions.a.a(fillColor, 0), com.scandit.datacapture.barcode.internal.module.extensions.a.a(fillColor, 230)});
                if (!c13168mA.f122247e) {
                    ViewExtensionsKt.runOnMainThread(c13168mA, new C13167l(c13168mA));
                }
            }
            int i11 = this.f122179f;
            if (i11 != c13168mA.f122245c.getColor()) {
                c13168mA.f122245c.setColor(i11);
                if (c13168mA.f122247e) {
                    ViewExtensionsKt.runOnMainThread(c13168mA, new C13166k(c13168mA));
                }
            }
            float f10 = y0Var.f122392a.x;
            Lazy lazy2 = C13168m.f122237f;
            c13168mA.setTranslationX(f10 - (C13164i.a() / 2.0f));
            c13168mA.setTranslationY(y0Var.f122392a.y - (C13164i.a() / 2.0f));
            c13168mA.setTag(y0Var);
            c13168mA.setContentDescription(getContext().getString(R.string.sc_barcode_find_indicator_content_description, y0Var.f122394c));
        }
        while (this.f122176c.size() > 2) {
            removeView((View) this.f122176c.removeLast());
        }
        while (this.f122177d.size() > 2) {
            removeView((View) this.f122177d.removeLast());
        }
        Iterator<E> it2 = this.f122176c.iterator();
        while (it2.hasNext()) {
            ((C13168m) it2.next()).setVisibility(8);
        }
        Iterator<E> it3 = this.f122177d.iterator();
        while (it3.hasNext()) {
            ((C13168m) it3.next()).setVisibility(8);
        }
        this.f122176c.clear();
        this.f122177d.clear();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13152a(Context context) {
        super(context, null, 0);
        Intrinsics.j(context, "context");
        setClipChildren(false);
        this.f122175b = CollectionsKt.m();
        this.f122176c = new ArrayDeque();
        this.f122177d = new ArrayDeque();
        this.f122178e = -1;
        this.f122179f = -16776961;
        this.f122180g = true;
    }

    public final C13168m a() {
        Context context = getContext();
        Intrinsics.i(context, "getContext(...)");
        C13168m c13168m = new C13168m(context);
        c13168m.setOnClickListener(new View.OnClickListener() { // from class: com.scandit.datacapture.barcode.internal.module.find.ui.A0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C13152a.a(this.f122151a, view);
            }
        });
        addView(c13168m);
        return c13168m;
    }

    public static final void a(C13152a this$0, View view) {
        Intrinsics.j(this$0, "this$0");
        Object tag = view.getTag();
        y0 y0Var = tag instanceof y0 ? (y0) tag : null;
        BarcodeFindItem barcodeFindItem = y0Var != null ? y0Var.f122393b : null;
        Function1 function1 = this$0.f122174a;
        if (function1 != null) {
            function1.invoke(barcodeFindItem);
        }
    }
}
