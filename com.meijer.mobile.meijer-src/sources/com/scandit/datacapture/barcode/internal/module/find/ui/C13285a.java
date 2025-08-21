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
/* loaded from: classes12.dex */
public final class C13285a extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public Function1 f123126a;

    /* renamed from: b, reason: collision with root package name */
    public List f123127b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayDeque f123128c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayDeque f123129d;

    /* renamed from: e, reason: collision with root package name */
    public int f123130e;

    /* renamed from: f, reason: collision with root package name */
    public int f123131f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f123132g;

    public final void a(ArrayList value) {
        C13301m c13301mA;
        BarcodeFindItemSearchOptions searchOptions;
        Brush brush;
        Intrinsics.j(value, "value");
        this.f123127b = value;
        this.f123129d.clear();
        this.f123128c.clear();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            Intrinsics.h(childAt, "null cannot be cast to non-null type com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindDotView");
            C13301m c13301m = (C13301m) childAt;
            if (c13301m.f123199e) {
                this.f123129d.addLast(c13301m);
            } else {
                this.f123128c.addLast(c13301m);
            }
        }
        Iterator it = value.iterator();
        while (it.hasNext()) {
            y0 y0Var = (y0) it.next();
            if (y0Var.f123345b == null) {
                c13301mA = (C13301m) this.f123129d.x();
                if (c13301mA == null) {
                    c13301mA = a();
                    if (true != c13301mA.f123199e) {
                        c13301mA.f123199e = true;
                        ViewExtensionsKt.runOnMainThread(c13301mA, new C13298j(c13301mA));
                    }
                }
            } else {
                c13301mA = (C13301m) this.f123128c.x();
                if (c13301mA == null) {
                    c13301mA = a();
                    if (this.f123132g) {
                        c13301mA.f123198d.start();
                    }
                }
            }
            c13301mA.setVisibility(0);
            boolean z10 = y0Var.f123345b == null;
            if (z10 != c13301mA.f123199e) {
                c13301mA.f123199e = z10;
                ViewExtensionsKt.runOnMainThread(c13301mA, new C13298j(c13301mA));
            }
            BarcodeFindItem barcodeFindItem = y0Var.f123345b;
            int fillColor = (barcodeFindItem == null || (searchOptions = barcodeFindItem.getSearchOptions()) == null || (brush = searchOptions.getBrush()) == null) ? this.f123130e : brush.getFillColor();
            if (fillColor != c13301mA.f123195a.getColor()) {
                c13301mA.f123195a.setColor(fillColor);
                PulsingView pulsingView = c13301mA.f123198d;
                Lazy lazy = C13301m.f123189f;
                pulsingView.a(new int[]{com.scandit.datacapture.barcode.internal.module.extensions.a.a(fillColor, 0), com.scandit.datacapture.barcode.internal.module.extensions.a.a(fillColor, 230)});
                if (!c13301mA.f123199e) {
                    ViewExtensionsKt.runOnMainThread(c13301mA, new C13300l(c13301mA));
                }
            }
            int i11 = this.f123131f;
            if (i11 != c13301mA.f123197c.getColor()) {
                c13301mA.f123197c.setColor(i11);
                if (c13301mA.f123199e) {
                    ViewExtensionsKt.runOnMainThread(c13301mA, new C13299k(c13301mA));
                }
            }
            float f10 = y0Var.f123344a.x;
            Lazy lazy2 = C13301m.f123189f;
            c13301mA.setTranslationX(f10 - (C13297i.a() / 2.0f));
            c13301mA.setTranslationY(y0Var.f123344a.y - (C13297i.a() / 2.0f));
            c13301mA.setTag(y0Var);
            c13301mA.setContentDescription(getContext().getString(R.string.sc_barcode_find_indicator_content_description, y0Var.f123346c));
        }
        while (this.f123128c.size() > 2) {
            removeView((View) this.f123128c.removeLast());
        }
        while (this.f123129d.size() > 2) {
            removeView((View) this.f123129d.removeLast());
        }
        Iterator<E> it2 = this.f123128c.iterator();
        while (it2.hasNext()) {
            ((C13301m) it2.next()).setVisibility(8);
        }
        Iterator<E> it3 = this.f123129d.iterator();
        while (it3.hasNext()) {
            ((C13301m) it3.next()).setVisibility(8);
        }
        this.f123128c.clear();
        this.f123129d.clear();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13285a(Context context) {
        super(context, null, 0);
        Intrinsics.j(context, "context");
        setClipChildren(false);
        this.f123127b = CollectionsKt.m();
        this.f123128c = new ArrayDeque();
        this.f123129d = new ArrayDeque();
        this.f123130e = -1;
        this.f123131f = -16776961;
        this.f123132g = true;
    }

    public final C13301m a() {
        Context context = getContext();
        Intrinsics.i(context, "getContext(...)");
        C13301m c13301m = new C13301m(context);
        c13301m.setOnClickListener(new View.OnClickListener() { // from class: com.scandit.datacapture.barcode.internal.module.find.ui.A0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C13285a.a(this.f123103a, view);
            }
        });
        addView(c13301m);
        return c13301m;
    }

    public static final void a(C13285a this$0, View view) {
        Intrinsics.j(this$0, "this$0");
        Object tag = view.getTag();
        y0 y0Var = tag instanceof y0 ? (y0) tag : null;
        BarcodeFindItem barcodeFindItem = y0Var != null ? y0Var.f123345b : null;
        Function1 function1 = this$0.f123126a;
        if (function1 != null) {
            function1.invoke(barcodeFindItem);
        }
    }
}
