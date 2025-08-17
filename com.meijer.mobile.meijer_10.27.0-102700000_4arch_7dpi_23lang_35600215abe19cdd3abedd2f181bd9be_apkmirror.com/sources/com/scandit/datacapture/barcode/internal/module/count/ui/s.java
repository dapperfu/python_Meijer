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

/* loaded from: classes11.dex */
public final class s extends LinearLayout {

    /* renamed from: h, reason: collision with root package name */
    public static final int f121778h = PixelExtensionsKt.pxFromDp$default(-2, (Context) null, 1, (Object) null);

    /* renamed from: i, reason: collision with root package name */
    public static final int f121779i = PixelExtensionsKt.pxFromDp$default(-5, (Context) null, 1, (Object) null);

    /* renamed from: a, reason: collision with root package name */
    public r f121780a;

    /* renamed from: b, reason: collision with root package name */
    public final ImageView f121781b;

    /* renamed from: c, reason: collision with root package name */
    public final ImageView f121782c;

    /* renamed from: d, reason: collision with root package name */
    public final ImageView f121783d;

    /* renamed from: e, reason: collision with root package name */
    public ViewPropertyAnimator f121784e;

    /* renamed from: f, reason: collision with root package name */
    public ViewPropertyAnimator f121785f;

    /* renamed from: g, reason: collision with root package name */
    public ViewPropertyAnimator f121786g;

    public final void a() {
        ViewPropertyAnimator viewPropertyAnimator = this.f121784e;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator viewPropertyAnimator2 = this.f121785f;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.cancel();
        }
        ViewPropertyAnimator viewPropertyAnimator3 = this.f121786g;
        if (viewPropertyAnimator3 != null) {
            viewPropertyAnimator3.cancel();
        }
        int iOrdinal = this.f121780a.ordinal();
        long j10 = 667;
        long j11 = 0;
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            j11 = 667;
            j10 = 0;
        }
        this.f121784e = a(this.f121781b, j10);
        this.f121785f = a(this.f121782c, 333L);
        this.f121786g = a(this.f121783d, j11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(Context context) {
        super(context, null, 0);
        Intrinsics.j(context, "context");
        Intrinsics.j(context, "context");
        this.f121780a = r.f121775a;
        setOrientation(1);
        ImageView imageView = new ImageView(context);
        addView(imageView);
        this.f121781b = imageView;
        ImageView imageView2 = new ImageView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, f121778h, 0, 0);
        imageView2.setLayoutParams(layoutParams);
        addView(imageView2);
        this.f121782c = imageView2;
        ImageView imageView3 = new ImageView(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(0, f121779i, 0, 0);
        imageView3.setLayoutParams(layoutParams2);
        addView(imageView3);
        this.f121783d = imageView3;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ViewPropertyAnimator viewPropertyAnimator = this.f121784e;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator viewPropertyAnimator2 = this.f121785f;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.cancel();
        }
        ViewPropertyAnimator viewPropertyAnimator3 = this.f121786g;
        if (viewPropertyAnimator3 != null) {
            viewPropertyAnimator3.cancel();
        }
        this.f121784e = null;
        this.f121785f = null;
        this.f121786g = null;
    }

    public final ViewPropertyAnimator a(final View view, long j10) {
        view.setAlpha(1.0f);
        ViewPropertyAnimator viewPropertyAnimatorWithEndAction = view.animate().setDuration(1667L).setInterpolator(new LinearInterpolator()).alpha(0.0f).setStartDelay(j10).withEndAction(new Runnable() { // from class: Jt.e
            @Override // java.lang.Runnable
            public final void run() {
                s.a(this.f16134a, view);
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
