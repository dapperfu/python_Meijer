package com.scandit.datacapture.barcode.internal.module.count.ui.mappingflow;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.scandit.datacapture.barcode.R;
import com.scandit.datacapture.barcode.internal.module.count.ui.mappingflow.e;
import com.scandit.datacapture.core.internal.sdk.extensions.ViewExtensionsKt;
import com.scandit.datacapture.core.internal.sdk.utils.PixelExtensionsKt;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* loaded from: classes11.dex */
public final class e extends FrameLayout {

    /* renamed from: g, reason: collision with root package name */
    public static final int f121713g = PixelExtensionsKt.pxFromDp$default(-20, (Context) null, 1, (Object) null);

    /* renamed from: h, reason: collision with root package name */
    public static final int f121714h = PixelExtensionsKt.pxFromDp$default(-8, (Context) null, 1, (Object) null);

    /* renamed from: i, reason: collision with root package name */
    public static final int f121715i = PixelExtensionsKt.pxFromDp$default(4, (Context) null, 1, (Object) null);

    /* renamed from: j, reason: collision with root package name */
    public static final int f121716j = PixelExtensionsKt.pxFromDp$default(28, (Context) null, 1, (Object) null);

    /* renamed from: k, reason: collision with root package name */
    public static final int f121717k = PixelExtensionsKt.pxFromDp$default(320, (Context) null, 1, (Object) null);

    /* renamed from: l, reason: collision with root package name */
    public static final int f121718l = PixelExtensionsKt.pxFromDp$default(460, (Context) null, 1, (Object) null);

    /* renamed from: m, reason: collision with root package name */
    public static final int f121719m = Integer.MIN_VALUE;

    /* renamed from: a, reason: collision with root package name */
    public int f121720a;

    /* renamed from: b, reason: collision with root package name */
    public final View f121721b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f121722c;

    /* renamed from: d, reason: collision with root package name */
    public final ImageView f121723d;

    /* renamed from: e, reason: collision with root package name */
    public final List f121724e;

    /* renamed from: f, reason: collision with root package name */
    public ValueAnimator f121725f;

    public final void a(int i10) {
        if (this.f121720a == i10 || i10 >= this.f121724e.size()) {
            return;
        }
        this.f121720a = i10;
        c cVar = (c) this.f121724e.get(i10);
        Rect rect = cVar.f121711b;
        ViewGroup.LayoutParams layoutParams = this.f121723d.getLayoutParams();
        Intrinsics.h(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        ViewExtensionsKt.removeAllRules(layoutParams2);
        layoutParams2.setMargins(rect.left, rect.top, rect.right, rect.bottom);
        for (b bVar : cVar.f121710a) {
            Integer num = bVar.f121709b;
            if (num == null) {
                layoutParams2.addRule(bVar.f121708a);
            } else {
                layoutParams2.addRule(bVar.f121708a, num.intValue());
            }
        }
        this.f121723d.setLayoutParams(layoutParams2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context) {
        super(context);
        Intrinsics.j(context, "context");
        this.f121720a = -1;
        setBackgroundColor(f121719m);
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.sc_barcode_count_grid_splash, (ViewGroup) this, false);
        addView(viewInflate, new FrameLayout.LayoutParams(f121717k, f121718l));
        this.f121721b = viewInflate;
        this.f121722c = (TextView) findViewById(R.id.sc_textview);
        View viewFindViewById = findViewById(R.id.sc_phone);
        Intrinsics.i(viewFindViewById, "findViewById(...)");
        this.f121723d = (ImageView) viewFindViewById;
        List listP = CollectionsKt.p(new b(6, Integer.valueOf(R.id.sc_grid)), new b(5, Integer.valueOf(R.id.sc_grid)));
        int i10 = f121714h;
        int i11 = f121713g;
        c cVar = new c(listP, new Rect(i10, i11, 0, 0));
        c cVar2 = new c(CollectionsKt.p(new b(6, Integer.valueOf(R.id.sc_grid)), new b(7, Integer.valueOf(R.id.sc_grid))), new Rect(0, i11, i10, 0));
        List listP2 = CollectionsKt.p(new b(), new b(5, Integer.valueOf(R.id.sc_grid)));
        int i12 = f121716j;
        int i13 = f121715i;
        this.f121724e = CollectionsKt.p(cVar, cVar2, new c(listP2, new Rect(i12, i13, 0, 0)), new c(CollectionsKt.p(new b(), new b(7, Integer.valueOf(R.id.sc_grid))), new Rect(0, i13, i12, 0)), new c(CollectionsKt.p(new b(8, Integer.valueOf(R.id.sc_grid)), new b(5, Integer.valueOf(R.id.sc_grid))), new Rect(i10, 0, 0, i11)), new c(CollectionsKt.p(new b(8, Integer.valueOf(R.id.sc_grid)), new b(7, Integer.valueOf(R.id.sc_grid))), new Rect(0, 0, i10, i11)));
        a(0);
    }

    public final void a(com.scandit.datacapture.barcode.internal.module.count.ui.mode.c onFinish) {
        Intrinsics.j(onFinish, "onFinish");
        a();
        a(0);
        int size = this.f121724e.size() + 1;
        int[] iArr = new int[size];
        for (int i10 = 0; i10 < size; i10++) {
            iArr[i10] = i10;
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(Arrays.copyOf(iArr, size));
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: Mt.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                e.a(this.f21230a, valueAnimator);
            }
        });
        valueAnimatorOfInt.setDuration(5000L);
        valueAnimatorOfInt.setInterpolator(new LinearInterpolator());
        valueAnimatorOfInt.addListener(new d(onFinish));
        valueAnimatorOfInt.start();
        this.f121725f = valueAnimatorOfInt;
    }

    public static final void a(e this$0, ValueAnimator it) {
        Intrinsics.j(this$0, "this$0");
        Intrinsics.j(it, "it");
        Object animatedValue = it.getAnimatedValue();
        Intrinsics.h(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        this$0.a(((Integer) animatedValue).intValue());
    }

    public final void a() {
        ValueAnimator valueAnimator = this.f121725f;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f121725f = null;
    }

    public final void a(Size previewSize, int i10) {
        Intrinsics.j(previewSize, "previewSize");
        View view = this.f121721b;
        Intrinsics.i(view, "subview");
        Size viewDesiredSize = new Size(f121717k, f121718l);
        Intrinsics.j(view, "view");
        Intrinsics.j(viewDesiredSize, "viewDesiredSize");
        Intrinsics.j(previewSize, "previewSize");
        float fN = RangesKt.n(i10 / viewDesiredSize.getHeight(), 0.0f, 1.0f);
        view.setPivotX(0.0f);
        view.setPivotY(0.0f);
        view.setScaleX(fN);
        view.setScaleY(fN);
        view.setY(((previewSize.getHeight() - (viewDesiredSize.getHeight() * fN)) / 2.0f) + (-RangesKt.e((previewSize.getHeight() - i10) / 2.0f, 0.0f)));
        view.setX((previewSize.getWidth() - (viewDesiredSize.getWidth() * fN)) / 2.0f);
    }
}
