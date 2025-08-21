package com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.viewholder;

import android.animation.ValueAnimator;
import android.graphics.Typeface;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TextView;
import com.scandit.datacapture.barcode.R;
import com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.viewholder.h;
import com.scandit.datacapture.barcode.pick.capture.BarcodePickState;
import com.scandit.datacapture.core.internal.sdk.ui.interpolators.EaseInOutSineInterpolator;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

/* loaded from: classes12.dex */
public final class h implements c {

    /* renamed from: p, reason: collision with root package name */
    public static final Lazy f123671p = LazyKt.b(d.f123667a);

    /* renamed from: a, reason: collision with root package name */
    public final Function2 f123672a;

    /* renamed from: b, reason: collision with root package name */
    public final View f123673b;

    /* renamed from: c, reason: collision with root package name */
    public final View f123674c;

    /* renamed from: d, reason: collision with root package name */
    public final View f123675d;

    /* renamed from: e, reason: collision with root package name */
    public final ImageView f123676e;

    /* renamed from: f, reason: collision with root package name */
    public final ImageView f123677f;

    /* renamed from: g, reason: collision with root package name */
    public final ImageView f123678g;

    /* renamed from: h, reason: collision with root package name */
    public final TextView f123679h;

    /* renamed from: i, reason: collision with root package name */
    public int f123680i;

    /* renamed from: j, reason: collision with root package name */
    public int f123681j;

    /* renamed from: k, reason: collision with root package name */
    public com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.drawdata.a f123682k;

    /* renamed from: l, reason: collision with root package name */
    public BarcodePickState f123683l;

    /* renamed from: m, reason: collision with root package name */
    public Function2 f123684m;

    /* renamed from: n, reason: collision with root package name */
    public Function1 f123685n;

    /* renamed from: o, reason: collision with root package name */
    public a f123686o;

    public final void a() {
        a aVar = a.f123662a;
        Intrinsics.j(aVar, "<set-?>");
        this.f123686o = aVar;
        this.f123681j = 0;
        TextView textView = this.f123679h;
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        Intrinsics.h(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.width = 0;
        marginLayoutParams.setMarginStart(0);
        marginLayoutParams.setMarginEnd(0);
        textView.setLayoutParams(marginLayoutParams);
    }

    public h(View container, com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.drawdata.a initialDrawData, com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.a layoutRefresher) {
        Intrinsics.j(container, "container");
        Intrinsics.j(initialDrawData, "initialDrawData");
        Intrinsics.j(layoutRefresher, "layoutRefresher");
        this.f123672a = layoutRefresher;
        this.f123682k = initialDrawData;
        this.f123684m = g.f123670a;
        this.f123686o = a.f123662a;
        View viewInflate = LayoutInflater.from(container.getContext()).inflate(R.layout.sc_pick_status, (ViewGroup) null, false);
        Intrinsics.i(viewInflate, "inflate(...)");
        this.f123673b = viewInflate;
        View viewFindViewById = viewInflate.findViewById(R.id.bubble);
        Intrinsics.i(viewFindViewById, "findViewById(...)");
        this.f123674c = viewFindViewById;
        View viewFindViewById2 = viewInflate.findViewById(R.id.arrow);
        Intrinsics.i(viewFindViewById2, "findViewById(...)");
        this.f123676e = (ImageView) viewFindViewById2;
        View viewFindViewById3 = viewInflate.findViewById(R.id.iconContainer);
        Intrinsics.i(viewFindViewById3, "findViewById(...)");
        this.f123675d = viewFindViewById3;
        View viewFindViewById4 = viewInflate.findViewById(R.id.icon);
        Intrinsics.i(viewFindViewById4, "findViewById(...)");
        this.f123678g = (ImageView) viewFindViewById4;
        View viewFindViewById5 = viewInflate.findViewById(R.id.iconBackground);
        Intrinsics.i(viewFindViewById5, "findViewById(...)");
        this.f123677f = (ImageView) viewFindViewById5;
        View viewFindViewById6 = viewInflate.findViewById(R.id.text);
        Intrinsics.i(viewFindViewById6, "findViewById(...)");
        TextView textView = (TextView) viewFindViewById6;
        this.f123679h = textView;
        viewInflate.setOnTouchListener(new f(this));
        if (Build.VERSION.SDK_INT >= 28) {
            textView.setTypeface(Typeface.create(null, 600, false));
        } else {
            textView.setTypeface(Typeface.DEFAULT_BOLD);
        }
        textView.setPadding(0, 0, 0, 0);
        a();
    }

    public final void a(int i10, int i11) {
        this.f123673b.setX(i10);
        this.f123673b.setY(i11);
    }

    public final void a(String str) {
        if (str != null && !StringsKt.s0(str)) {
            TextView textView = this.f123679h;
            if (str.length() > 20) {
                StringBuilder sb2 = new StringBuilder();
                String strSubstring = str.substring(0, 20);
                Intrinsics.i(strSubstring, "substring(...)");
                sb2.append(strSubstring);
                sb2.append((char) 8230);
                str = sb2.toString();
            }
            textView.setText(str);
            return;
        }
        this.f123679h.setText((CharSequence) null);
    }

    public final void a(a aVar, final Function0 function0) {
        final int iK;
        int iK2;
        this.f123673b.bringToFront();
        a aVar2 = a.f123664c;
        Intrinsics.j(aVar2, "<set-?>");
        this.f123686o = aVar2;
        final boolean z10 = aVar == a.f123663b;
        if (z10) {
            iK = 0;
        } else {
            int iMeasureText = (int) this.f123679h.getPaint().measureText(this.f123679h.getText().toString());
            ViewParent parent = this.f123673b.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            iK = RangesKt.k(iMeasureText, ((viewGroup != null ? viewGroup.getWidth() : 0) - this.f123680i) - ((Number) f123671p.getValue()).intValue());
        }
        if (z10) {
            int iMeasureText2 = (int) this.f123679h.getPaint().measureText(this.f123679h.getText().toString());
            ViewParent parent2 = this.f123673b.getParent();
            ViewGroup viewGroup2 = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
            iK2 = RangesKt.k(iMeasureText2, ((viewGroup2 != null ? viewGroup2.getWidth() : 0) - this.f123680i) - ((Number) f123671p.getValue()).intValue());
        } else {
            iK2 = 0;
        }
        final int i10 = iK2 - iK;
        final int iIntValue = z10 ? 0 : ((Number) f123671p.getValue()).intValue();
        final int iIntValue2 = (z10 ? ((Number) f123671p.getValue()).intValue() : 0) - iIntValue;
        final float f10 = z10 ? 0.0f : 1.0f;
        final float f11 = (z10 ? 1.0f : 0.0f) - f10;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: St.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                h.a(iK, i10, iIntValue, iIntValue2, f10, f11, this, z10, function0, valueAnimator);
            }
        });
        valueAnimatorOfFloat.setDuration(250L);
        valueAnimatorOfFloat.setInterpolator(new EaseInOutSineInterpolator());
        valueAnimatorOfFloat.start();
    }

    public static final void a(int i10, int i11, int i12, int i13, float f10, float f11, h this$0, boolean z10, Function0 onFinished, ValueAnimator valueAnimator) {
        a aVar;
        Intrinsics.j(this$0, "this$0");
        Intrinsics.j(onFinished, "$onFinished");
        Intrinsics.j(valueAnimator, "valueAnimator");
        Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.h(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float fFloatValue = ((Float) animatedValue).floatValue();
        int i14 = (int) ((i11 * fFloatValue) + i10);
        int i15 = (int) ((i13 * fFloatValue) + i12);
        TextView textView = this$0.f123679h;
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        Intrinsics.h(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.width = i14;
        marginLayoutParams.leftMargin = i15;
        textView.setLayoutParams(marginLayoutParams);
        this$0.f123679h.setAlpha((f11 * fFloatValue) + f10);
        this$0.f123681j = i14 + i15;
        this$0.f123672a.invoke(this$0, this$0.f123682k);
        if (fFloatValue == 1.0f) {
            if (z10) {
                aVar = a.f123663b;
            } else {
                aVar = a.f123662a;
            }
            Intrinsics.j(aVar, "<set-?>");
            this$0.f123686o = aVar;
            onFinished.invoke();
        }
    }
}
