package com.scandit.datacapture.core.internal.module.ui.hint;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.fullstory.FS;
import com.scandit.datacapture.core.R;
import com.scandit.datacapture.core.common.geometry.MarginsF;
import com.scandit.datacapture.core.common.geometry.Rect;
import com.scandit.datacapture.core.internal.module.ui.NativeHintAlignment;
import com.scandit.datacapture.core.internal.module.ui.NativeHintAnchor;
import com.scandit.datacapture.core.internal.module.ui.NativeHintIcon;
import com.scandit.datacapture.core.internal.module.ui.NativeHintStyle;
import com.scandit.datacapture.core.internal.module.ui.hint.HintView;
import com.scandit.datacapture.core.internal.sdk.common.graphics.NativeColor;
import com.scandit.datacapture.core.internal.sdk.ui.hint.GuidanceHint;
import com.scandit.datacapture.core.internal.sdk.ui.hint.HintHolderV2Impl;
import com.scandit.datacapture.core.internal.sdk.utils.PixelExtensionsKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

/* loaded from: classes12.dex */
public final class HintView extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    private final TextView f126197a;

    /* renamed from: b, reason: collision with root package name */
    private final ImageView f126198b;

    /* renamed from: c, reason: collision with root package name */
    private Function0 f126199c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f126200d;

    /* renamed from: e, reason: collision with root package name */
    private float f126201e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f126202f;

    public final void a(Function0 function0) {
        this.f126199c = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HintView(Context context) {
        super(context);
        Intrinsics.j(context, "context");
        View.inflate(context, R.layout.sc_hint_view_v2, this);
        View viewFindViewById = findViewById(R.id.textView);
        Intrinsics.i(viewFindViewById, "findViewById(...)");
        this.f126197a = (TextView) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.iconView);
        Intrinsics.i(viewFindViewById2, "findViewById(...)");
        this.f126198b = (ImageView) viewFindViewById2;
        setBackgroundResource(R.drawable.sc_hint_view_background);
        setAlpha(0.0f);
        setFocusable(true);
        if (Build.VERSION.SDK_INT >= 28) {
            setScreenReaderFocusable(true);
        }
    }

    private final void a() {
        animate().translationX(getX() < 0.0f ? -getWidth() : getWidth()).alpha(0.0f).setDuration(200L).withEndAction(new Runnable() { // from class: fu.d
            @Override // java.lang.Runnable
            public final void run() {
                HintView.a(this.f133649a);
            }
        }).start();
    }

    public final void b(NativeHintStyle hintStyle, Rect rect, boolean z10) {
        Intrinsics.j(hintStyle, "hintStyle");
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        Intrinsics.h(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        a(layoutParams2, hintStyle, rect, z10, layoutParams2.leftMargin);
        setLayoutParams(layoutParams2);
    }

    public final void c(NativeHintStyle hintStyle, Rect rect, boolean z10) {
        int i10;
        int i11;
        Intrinsics.j(hintStyle, "hintStyle");
        int i12 = hintStyle.getFitToText() ? -2 : -1;
        Object parent = getParent();
        Intrinsics.h(parent, "null cannot be cast to non-null type android.view.View");
        int width = ((View) parent).getWidth();
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        int iMin = Math.min(width, Math.min(displayMetrics.heightPixels, displayMetrics.widthPixels));
        Intrinsics.h(getParent(), "null cannot be cast to non-null type android.view.View");
        int iD = MathKt.d(PixelExtensionsKt.pxFromDp$default(hintStyle.getHorizontalMargin(), (Context) null, 1, (Object) null) + ((((View) r5).getWidth() - (hintStyle.getMaxWidthFraction() * iMin)) / 2.0f));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i12, -2);
        layoutParams.addRule(14);
        a(layoutParams, hintStyle, rect, z10, iD);
        setLayoutParams(layoutParams);
        MarginsF padding = hintStyle.getPadding();
        Intrinsics.i(padding, "getPadding(...)");
        setPadding(MathKt.d(PixelExtensionsKt.pxFromDp$default(padding.getLeft(), (Context) null, 1, (Object) null)), MathKt.d(PixelExtensionsKt.pxFromDp$default(padding.getTop(), (Context) null, 1, (Object) null)), MathKt.d(PixelExtensionsKt.pxFromDp$default(padding.getRight(), (Context) null, 1, (Object) null)), MathKt.d(PixelExtensionsKt.pxFromDp$default(padding.getBottom(), (Context) null, 1, (Object) null)));
        TextView textView = this.f126197a;
        textView.setTextSize(2, hintStyle.getTextSize());
        NativeColor textColor = hintStyle.getTextColor();
        Intrinsics.i(textColor, "getTextColor(...)");
        textView.setTextColor(Color.argb((int) ((textColor.getA() * 255.0f) + 0.5f), (int) ((textColor.getR() * 255.0f) + 0.5f), (int) ((textColor.getG() * 255.0f) + 0.5f), (int) ((textColor.getB() * 255.0f) + 0.5f)));
        NativeHintAlignment textAlignment = hintStyle.getTextAlignment();
        Intrinsics.g(textAlignment);
        int i13 = A.f126185a[textAlignment.ordinal()];
        if (i13 == 1) {
            i10 = 8388627;
        } else if (i13 == 2) {
            i10 = 17;
        } else {
            if (i13 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i10 = 8388629;
        }
        textView.setGravity(i10);
        textView.setMaxLines(hintStyle.getMaxLines());
        textView.setLineSpacing(PixelExtensionsKt.pxFromSp$default((hintStyle.getLineHeight() >= 0.0f ? hintStyle.getLineHeight() : hintStyle.getTextSize()) - hintStyle.getTextSize(), null, 1, null), 1.0f);
        int textWeight = hintStyle.getTextWeight();
        int iF = 0;
        textView.setTypeface(Build.VERSION.SDK_INT >= 28 ? Typeface.create(null, textWeight, false) : textWeight >= 600 ? Typeface.DEFAULT_BOLD : Typeface.DEFAULT);
        float cornerRadius = hintStyle.getCornerRadius();
        NativeColor backgroundColor = hintStyle.getBackgroundColor();
        Intrinsics.i(backgroundColor, "getBackgroundColor(...)");
        Drawable background = getBackground();
        Intrinsics.h(background, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        GradientDrawable gradientDrawable = (GradientDrawable) background;
        gradientDrawable.setCornerRadius(PixelExtensionsKt.pxFromDp$default(cornerRadius, (Context) null, 1, (Object) null));
        gradientDrawable.setTint(Color.argb((int) ((backgroundColor.getA() * 255.0f) + 0.5f), (int) ((backgroundColor.getR() * 255.0f) + 0.5f), (int) ((backgroundColor.getG() * 255.0f) + 0.5f), (int) ((backgroundColor.getB() * 255.0f) + 0.5f)));
        NativeHintIcon hintIcon = hintStyle.getHintIcon();
        int i14 = hintIcon != null ? A.f126186b[hintIcon.ordinal()] : -1;
        if (i14 == 1) {
            this.f126198b.setVisibility(8);
        } else if (i14 != 2) {
            this.f126198b.setVisibility(0);
            NativeHintIcon hintIcon2 = hintStyle.getHintIcon();
            Intrinsics.i(hintIcon2, "getHintIcon(...)");
            int i15 = C.f126189a[hintIcon2.ordinal()];
            if (i15 == 1) {
                i11 = 0;
                FS.Resources_setImageResource(this.f126198b, i11);
                ImageView imageView = this.f126198b;
                NativeColor iconColor = hintStyle.getIconColor();
                Intrinsics.i(iconColor, "getIconColor(...)");
                imageView.setImageTintList(ColorStateList.valueOf(Color.argb((int) ((iconColor.getA() * 255.0f) + 0.5f), (int) ((iconColor.getR() * 255.0f) + 0.5f), (int) ((iconColor.getG() * 255.0f) + 0.5f), (int) ((iconColor.getB() * 255.0f) + 0.5f))));
            } else {
                if (i15 == 2) {
                    i11 = R.drawable.sc_ic_hint_check;
                } else if (i15 != 3) {
                    if (i15 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i11 = 0;
                } else {
                    i11 = R.drawable.sc_ic_hint_exclamation_mark;
                }
                FS.Resources_setImageResource(this.f126198b, i11);
                ImageView imageView2 = this.f126198b;
                NativeColor iconColor2 = hintStyle.getIconColor();
                Intrinsics.i(iconColor2, "getIconColor(...)");
                imageView2.setImageTintList(ColorStateList.valueOf(Color.argb((int) ((iconColor2.getA() * 255.0f) + 0.5f), (int) ((iconColor2.getR() * 255.0f) + 0.5f), (int) ((iconColor2.getG() * 255.0f) + 0.5f), (int) ((iconColor2.getB() * 255.0f) + 0.5f))));
            }
        } else if (Intrinsics.e(hintStyle.getIconResource(), "user-swipe")) {
            ImageView iconView = this.f126198b;
            Intrinsics.j(iconView, "iconView");
            Context context = iconView.getContext();
            Drawable drawable = context.getResources().getDrawable(R.drawable.sc_ic_user_swipe, context.getTheme());
            Intrinsics.h(drawable, "null cannot be cast to non-null type android.graphics.drawable.AnimatedVectorDrawable");
            AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable;
            iconView.setImageDrawable(animatedVectorDrawable);
            iconView.setImageTintList(null);
            animatedVectorDrawable.registerAnimationCallback(new B(iconView, animatedVectorDrawable));
            animatedVectorDrawable.start();
        } else {
            this.f126198b.setVisibility(8);
        }
        NativeHintIcon hintIcon3 = hintStyle.getHintIcon();
        Intrinsics.i(hintIcon3, "getHintIcon(...)");
        if (A.f126186b[hintIcon3.ordinal()] != 1) {
            this.f126197a.onPreDraw();
            iF = RangesKt.f(this.f126197a.getLayout().getTopPadding() + ((PixelExtensionsKt.pxFromDp$default(24, (Context) null, 1, (Object) null) - this.f126197a.getLayout().getLineBaseline(0)) / 2), 0);
        }
        ViewGroup.LayoutParams layoutParams2 = this.f126197a.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.topMargin = iF;
            marginLayoutParams.bottomMargin = iF;
            this.f126197a.setLayoutParams(marginLayoutParams);
        }
        this.f126200d = hintStyle.getCanBeDismissed();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            java.lang.String r0 = "event"
            kotlin.jvm.internal.Intrinsics.j(r6, r0)
            int r0 = r6.getAction()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L71
            r3 = 2
            if (r0 == r2) goto L34
            if (r0 == r3) goto L16
            r4 = 3
            if (r0 == r4) goto L34
            goto L6c
        L16:
            boolean r0 = r5.f126202f
            if (r0 == 0) goto L6c
            float r6 = r6.getRawX()
            float r0 = r5.f126201e
            float r6 = r6 - r0
            r5.setTranslationX(r6)
            float r0 = (float) r2
            float r6 = java.lang.Math.abs(r6)
            int r1 = r5.getWidth()
            float r1 = (float) r1
            float r6 = r6 / r1
            float r0 = r0 - r6
            r5.setAlpha(r0)
            return r2
        L34:
            boolean r0 = r5.f126202f
            if (r0 == 0) goto L6c
            r5.f126202f = r1
            float r6 = r6.getRawX()
            float r0 = r5.f126201e
            float r6 = r6 - r0
            float r6 = java.lang.Math.abs(r6)
            int r0 = r5.getWidth()
            int r0 = r0 / r3
            float r0 = (float) r0
            int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r6 <= 0) goto L53
            r5.a()
            goto L6b
        L53:
            android.view.ViewPropertyAnimator r6 = r5.animate()
            r0 = 0
            android.view.ViewPropertyAnimator r6 = r6.translationX(r0)
            r0 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r6 = r6.alpha(r0)
            r0 = 200(0xc8, double:9.9E-322)
            android.view.ViewPropertyAnimator r6 = r6.setDuration(r0)
            r6.start()
        L6b:
            return r2
        L6c:
            boolean r6 = super.onTouchEvent(r6)
            return r6
        L71:
            boolean r0 = r5.f126200d
            if (r0 != 0) goto L76
            return r1
        L76:
            float r6 = r6.getRawX()
            r5.f126201e = r6
            r5.f126202f = r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scandit.datacapture.core.internal.module.ui.hint.HintView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(HintView this$0) {
        Intrinsics.j(this$0, "this$0");
        Function0 function0 = this$0.f126199c;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void a(String text) {
        Intrinsics.j(text, "text");
        this.f126197a.setText(text);
    }

    public final void a(GuidanceHint guidance, Rect rect) {
        Intrinsics.j(guidance, "guidance");
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        Intrinsics.h(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        final RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        if (layoutParams2.getRule(10) != -1) {
            return;
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(layoutParams2.topMargin, a(guidance.getHintStyle(), rect, true));
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: fu.c
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                HintView.a(layoutParams2, this, valueAnimator);
            }
        });
        valueAnimatorOfInt.setDuration(100L);
        valueAnimatorOfInt.setInterpolator(new DecelerateInterpolator());
        valueAnimatorOfInt.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(RelativeLayout.LayoutParams params, HintView this$0, ValueAnimator it) {
        Intrinsics.j(params, "$params");
        Intrinsics.j(this$0, "this$0");
        Intrinsics.j(it, "it");
        int i10 = params.leftMargin;
        Object animatedValue = it.getAnimatedValue();
        Intrinsics.h(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        params.setMargins(i10, ((Integer) animatedValue).intValue(), params.rightMargin, params.bottomMargin);
        this$0.setLayoutParams(params);
    }

    private final void a(RelativeLayout.LayoutParams layoutParams, NativeHintStyle nativeHintStyle, Rect rect, boolean z10, int i10) {
        layoutParams.removeRule(10);
        layoutParams.removeRule(12);
        int iA = a(nativeHintStyle, rect, z10);
        int iD = MathKt.d(PixelExtensionsKt.pxFromDp$default(nativeHintStyle.getHintAnchorOffset(), (Context) null, 1, (Object) null));
        int height = 0;
        if (nativeHintStyle.getHintAnchor() != NativeHintAnchor.TOP && rect != null) {
            if (nativeHintStyle.getHintAnchor() == NativeHintAnchor.ABOVE_VIEW_FINDER) {
                Object parent = getParent();
                Intrinsics.h(parent, "null cannot be cast to non-null type android.view.View");
                height = (((View) parent).getHeight() - MathKt.d(PixelExtensionsKt.pxFromDp$default(rect.getOrigin().getY(), (Context) null, 1, (Object) null))) + iD;
                layoutParams.addRule(12);
            } else if (nativeHintStyle.getHintAnchor() == NativeHintAnchor.BELOW_VIEW_FINDER) {
                layoutParams.addRule(10);
            } else {
                throw new UnsupportedOperationException("Unsupported anchor " + nativeHintStyle.getHintAnchor());
            }
        } else {
            layoutParams.addRule(10);
        }
        layoutParams.setMargins(i10, iA, i10, height);
    }

    private final int a(NativeHintStyle nativeHintStyle, Rect rect, boolean z10) {
        ViewParent parent = getParent();
        HintHolderV2Impl hintHolderV2Impl = parent instanceof HintHolderV2Impl ? (HintHolderV2Impl) parent : null;
        HintView hintViewAnyToastView$scandit_capture_core = hintHolderV2Impl != null ? hintHolderV2Impl.anyToastView$scandit_capture_core() : null;
        int iD = MathKt.d(PixelExtensionsKt.pxFromDp$default(nativeHintStyle.getHintAnchorOffset(), (Context) null, 1, (Object) null));
        int y10 = (!z10 || hintViewAnyToastView$scandit_capture_core == null) ? 0 : ((int) (hintViewAnyToastView$scandit_capture_core.getY() + hintViewAnyToastView$scandit_capture_core.getHeight())) + iD;
        if (nativeHintStyle.getHintAnchor() != NativeHintAnchor.TOP && rect != null) {
            if (nativeHintStyle.getHintAnchor() == NativeHintAnchor.ABOVE_VIEW_FINDER) {
                return 0;
            }
            if (nativeHintStyle.getHintAnchor() == NativeHintAnchor.BELOW_VIEW_FINDER) {
                return Math.max(MathKt.d(PixelExtensionsKt.pxFromDp$default(rect.getSize().getHeight() + rect.getOrigin().getY(), (Context) null, 1, (Object) null)) + iD, y10);
            }
            throw new UnsupportedOperationException("Unsupported anchor " + nativeHintStyle.getHintAnchor());
        }
        return Math.max(iD, y10);
    }
}
