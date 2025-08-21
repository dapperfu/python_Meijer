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

/* loaded from: classes12.dex */
public final class e extends FrameLayout {

    /* renamed from: g, reason: collision with root package name */
    public static final int f122665g = PixelExtensionsKt.pxFromDp$default(-20, (Context) null, 1, (Object) null);

    /* renamed from: h, reason: collision with root package name */
    public static final int f122666h = PixelExtensionsKt.pxFromDp$default(-8, (Context) null, 1, (Object) null);

    /* renamed from: i, reason: collision with root package name */
    public static final int f122667i = PixelExtensionsKt.pxFromDp$default(4, (Context) null, 1, (Object) null);

    /* renamed from: j, reason: collision with root package name */
    public static final int f122668j = PixelExtensionsKt.pxFromDp$default(28, (Context) null, 1, (Object) null);

    /* renamed from: k, reason: collision with root package name */
    public static final int f122669k = PixelExtensionsKt.pxFromDp$default(320, (Context) null, 1, (Object) null);

    /* renamed from: l, reason: collision with root package name */
    public static final int f122670l = PixelExtensionsKt.pxFromDp$default(460, (Context) null, 1, (Object) null);

    /* renamed from: m, reason: collision with root package name */
    public static final int f122671m = Integer.MIN_VALUE;

    /* renamed from: a, reason: collision with root package name */
    public int f122672a;

    /* renamed from: b, reason: collision with root package name */
    public final View f122673b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f122674c;

    /* renamed from: d, reason: collision with root package name */
    public final ImageView f122675d;

    /* renamed from: e, reason: collision with root package name */
    public final List f122676e;

    /* renamed from: f, reason: collision with root package name */
    public ValueAnimator f122677f;

    public final void a(int i10) {
        if (this.f122672a == i10 || i10 >= this.f122676e.size()) {
            return;
        }
        this.f122672a = i10;
        c cVar = (c) this.f122676e.get(i10);
        Rect rect = cVar.f122663b;
        ViewGroup.LayoutParams layoutParams = this.f122675d.getLayoutParams();
        Intrinsics.h(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        ViewExtensionsKt.removeAllRules(layoutParams2);
        layoutParams2.setMargins(rect.left, rect.top, rect.right, rect.bottom);
        for (b bVar : cVar.f122662a) {
            Integer num = bVar.f122661b;
            if (num == null) {
                layoutParams2.addRule(bVar.f122660a);
            } else {
                layoutParams2.addRule(bVar.f122660a, num.intValue());
            }
        }
        this.f122675d.setLayoutParams(layoutParams2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context) {
        super(context);
        Intrinsics.j(context, "context");
        this.f122672a = -1;
        setBackgroundColor(f122671m);
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.sc_barcode_count_grid_splash, (ViewGroup) this, false);
        addView(viewInflate, new FrameLayout.LayoutParams(f122669k, f122670l));
        this.f122673b = viewInflate;
        this.f122674c = (TextView) findViewById(R.id.sc_textview);
        View viewFindViewById = findViewById(R.id.sc_phone);
        Intrinsics.i(viewFindViewById, "findViewById(...)");
        this.f122675d = (ImageView) viewFindViewById;
        List listP = CollectionsKt.p(new b(6, Integer.valueOf(R.id.sc_grid)), new b(5, Integer.valueOf(R.id.sc_grid)));
        int i10 = f122666h;
        int i11 = f122665g;
        c cVar = new c(listP, new Rect(i10, i11, 0, 0));
        c cVar2 = new c(CollectionsKt.p(new b(6, Integer.valueOf(R.id.sc_grid)), new b(7, Integer.valueOf(R.id.sc_grid))), new Rect(0, i11, i10, 0));
        List listP2 = CollectionsKt.p(new b(), new b(5, Integer.valueOf(R.id.sc_grid)));
        int i12 = f122668j;
        int i13 = f122667i;
        this.f122676e = CollectionsKt.p(cVar, cVar2, new c(listP2, new Rect(i12, i13, 0, 0)), new c(CollectionsKt.p(new b(), new b(7, Integer.valueOf(R.id.sc_grid))), new Rect(0, i13, i12, 0)), new c(CollectionsKt.p(new b(8, Integer.valueOf(R.id.sc_grid)), new b(5, Integer.valueOf(R.id.sc_grid))), new Rect(i10, 0, 0, i11)), new c(CollectionsKt.p(new b(8, Integer.valueOf(R.id.sc_grid)), new b(7, Integer.valueOf(R.id.sc_grid))), new Rect(0, 0, i10, i11)));
        a(0);
    }

    public final void a(com.scandit.datacapture.barcode.internal.module.count.ui.mode.c onFinish) {
        Intrinsics.j(onFinish, "onFinish");
        a();
        a(0);
        int size = this.f122676e.size() + 1;
        int[] iArr = new int[size];
        for (int i10 = 0; i10 < size; i10++) {
            iArr[i10] = i10;
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(Arrays.copyOf(iArr, size));
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: Mt.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                e.a(this.f20429a, valueAnimator);
            }
        });
        valueAnimatorOfInt.setDuration(5000L);
        valueAnimatorOfInt.setInterpolator(new LinearInterpolator());
        valueAnimatorOfInt.addListener(new d(onFinish));
        valueAnimatorOfInt.start();
        this.f122677f = valueAnimatorOfInt;
    }

    public static final void a(e this$0, ValueAnimator it) {
        Intrinsics.j(this$0, "this$0");
        Intrinsics.j(it, "it");
        Object animatedValue = it.getAnimatedValue();
        Intrinsics.h(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        this$0.a(((Integer) animatedValue).intValue());
    }

    public final void a() {
        ValueAnimator valueAnimator = this.f122677f;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f122677f = null;
    }

    public final void a(Size previewSize, int i10) {
        Intrinsics.j(previewSize, "previewSize");
        View view = this.f122673b;
        Intrinsics.i(view, "subview");
        Size viewDesiredSize = new Size(f122669k, f122670l);
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
