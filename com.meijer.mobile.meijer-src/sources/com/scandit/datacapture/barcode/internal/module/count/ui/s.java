package com.scandit.datacapture.barcode.internal.module.count.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.scandit.datacapture.barcode.internal.module.count.ui.s;
import com.scandit.datacapture.core.internal.sdk.utils.PixelExtensionsKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class s extends LinearLayout {

    /* renamed from: h, reason: collision with root package name */
    public static final int f122730h = PixelExtensionsKt.pxFromDp$default(-2, (Context) null, 1, (Object) null);

    /* renamed from: i, reason: collision with root package name */
    public static final int f122731i = PixelExtensionsKt.pxFromDp$default(-5, (Context) null, 1, (Object) null);

    /* renamed from: a, reason: collision with root package name */
    public r f122732a;

    /* renamed from: b, reason: collision with root package name */
    public final ImageView f122733b;

    /* renamed from: c, reason: collision with root package name */
    public final ImageView f122734c;

    /* renamed from: d, reason: collision with root package name */
    public final ImageView f122735d;

    /* renamed from: e, reason: collision with root package name */
    public ViewPropertyAnimator f122736e;

    /* renamed from: f, reason: collision with root package name */
    public ViewPropertyAnimator f122737f;

    /* renamed from: g, reason: collision with root package name */
    public ViewPropertyAnimator f122738g;

    public final void a() {
        ViewPropertyAnimator viewPropertyAnimator = this.f122736e;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator viewPropertyAnimator2 = this.f122737f;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.cancel();
        }
        ViewPropertyAnimator viewPropertyAnimator3 = this.f122738g;
        if (viewPropertyAnimator3 != null) {
            viewPropertyAnimator3.cancel();
        }
        int iOrdinal = this.f122732a.ordinal();
        long j10 = 667;
        long j11 = 0;
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            j11 = 667;
            j10 = 0;
        }
        this.f122736e = a(this.f122733b, j10);
        this.f122737f = a(this.f122734c, 333L);
        this.f122738g = a(this.f122735d, j11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(Context context) {
        super(context, null, 0);
        Intrinsics.j(context, "context");
        Intrinsics.j(context, "context");
        this.f122732a = r.f122727a;
        setOrientation(1);
        ImageView imageView = new ImageView(context);
        addView(imageView);
        this.f122733b = imageView;
        ImageView imageView2 = new ImageView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, f122730h, 0, 0);
        imageView2.setLayoutParams(layoutParams);
        addView(imageView2);
        this.f122734c = imageView2;
        ImageView imageView3 = new ImageView(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(0, f122731i, 0, 0);
        imageView3.setLayoutParams(layoutParams2);
        addView(imageView3);
        this.f122735d = imageView3;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ViewPropertyAnimator viewPropertyAnimator = this.f122736e;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator viewPropertyAnimator2 = this.f122737f;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.cancel();
        }
        ViewPropertyAnimator viewPropertyAnimator3 = this.f122738g;
        if (viewPropertyAnimator3 != null) {
            viewPropertyAnimator3.cancel();
        }
        this.f122736e = null;
        this.f122737f = null;
        this.f122738g = null;
    }

    public final ViewPropertyAnimator a(final View view, long j10) {
        view.setAlpha(1.0f);
        ViewPropertyAnimator viewPropertyAnimatorWithEndAction = view.animate().setDuration(1667L).setInterpolator(new LinearInterpolator()).alpha(0.0f).setStartDelay(j10).withEndAction(new Runnable() { // from class: Jt.e
            @Override // java.lang.Runnable
            public final void run() {
                s.a(this.f16232a, view);
            }
        });
        viewPropertyAnimatorWithEndAction.start();
        Intrinsics.i(viewPropertyAnimatorWithEndAction, "with(...)");
        return viewPropertyAnimatorWithEndAction;
    }

    public static final void a(s this$0, View this_with) {
        Intrinsics.j(this$0, "this$0");
        Intrinsics.j(this_with, "$this_with");
        this$0.a(this_with, 0L);
    }
}
