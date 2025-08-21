package com.scandit.datacapture.barcode.internal.module.spark.ui.button;

import android.content.Context;
import android.graphics.PointF;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.BounceInterpolator;
import com.scandit.datacapture.barcode.internal.module.spark.data.SparkScanStateManager;
import com.scandit.datacapture.barcode.internal.module.spark.ui.C13342b;
import com.scandit.datacapture.barcode.internal.module.spark.ui.E;
import com.scandit.datacapture.barcode.internal.module.spark.ui.EnumC13341a;
import com.scandit.datacapture.core.common.geometry.Point;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KFunction;

/* loaded from: classes12.dex */
public final class h implements SparkScanViewScanButtonTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final SparkScanStateManager f124044a;

    /* renamed from: b, reason: collision with root package name */
    public final C13342b f124045b;

    /* renamed from: c, reason: collision with root package name */
    public final int f124046c;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f124047d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f124048e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f124049f;

    /* renamed from: g, reason: collision with root package name */
    public final g f124050g;

    /* renamed from: h, reason: collision with root package name */
    public final int f124051h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f124052i;

    /* renamed from: j, reason: collision with root package name */
    public float f124053j;

    /* renamed from: k, reason: collision with root package name */
    public float f124054k;

    /* renamed from: l, reason: collision with root package name */
    public int f124055l;

    /* renamed from: m, reason: collision with root package name */
    public Pair f124056m;

    /* renamed from: n, reason: collision with root package name */
    public final PointF f124057n;

    /* renamed from: o, reason: collision with root package name */
    public PointF f124058o;

    /* renamed from: p, reason: collision with root package name */
    public long f124059p;

    /* renamed from: q, reason: collision with root package name */
    public Function1 f124060q;

    /* renamed from: r, reason: collision with root package name */
    public View f124061r;

    public static float a(int i10, boolean z10) {
        return i10 - (z10 ? ((Number) E.f123943u.getValue()).intValue() : ((Number) E.f123936n.getValue()).intValue() - ((Number) E.f123940r.getValue()).floatValue());
    }

    public static float b(int i10, boolean z10) {
        return i10 - (z10 ? ((Number) E.f123944v.getValue()).intValue() : ((Number) E.f123937o.getValue()).intValue() - ((Number) E.f123941s.getValue()).floatValue());
    }

    public h(Context context, SparkScanStateManager stateManager) {
        Intrinsics.j(context, "context");
        Intrinsics.j(stateManager, "stateManager");
        this.f124044a = stateManager;
        this.f124045b = new C13342b(context);
        this.f124046c = ViewConfiguration.getLongPressTimeout();
        this.f124047d = new Handler(Looper.getMainLooper());
        this.f124050g = new g(this);
        this.f124051h = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f124055l = -1;
        this.f124057n = new PointF(0.0f, 0.0f);
        this.f124058o = new PointF(stateManager.w(), stateManager.x());
        this.f124060q = f.f124043a;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0115  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r10, android.view.MotionEvent r11) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scandit.datacapture.barcode.internal.module.spark.ui.button.h.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public final Point a(int i10, int i11, boolean z10) {
        int iIntValue;
        int iIntValue2;
        if (z10) {
            iIntValue = ((Number) E.f123943u.getValue()).intValue();
        } else {
            iIntValue = ((Number) E.f123936n.getValue()).intValue();
        }
        if (z10) {
            iIntValue2 = ((Number) E.f123944v.getValue()).intValue();
        } else {
            iIntValue2 = ((Number) E.f123937o.getValue()).intValue();
        }
        PointF pointF = this.f124058o;
        float f10 = iIntValue / 2;
        float f11 = pointF.x - f10;
        float f12 = iIntValue2 / 2;
        float f13 = pointF.y - f12;
        Pair pair = this.f124056m;
        MotionEvent motionEvent = pair != null ? (MotionEvent) pair.c() : null;
        Pair pair2 = this.f124056m;
        View view = pair2 != null ? (View) pair2.d() : null;
        if (this.f124044a.h() && motionEvent != null && view != null) {
            float rawX = ((motionEvent.getRawX() + this.f124053j) - f10) + (((Number) E.f123943u.getValue()).intValue() / 2);
            float rawY = ((motionEvent.getRawY() + this.f124054k) - f12) + (((Number) E.f123944v.getValue()).intValue() / 2);
            this.f124053j = rawX - motionEvent.getRawX();
            this.f124054k = rawY - motionEvent.getRawY();
            this.f124060q.invoke(EnumC13341a.f124001i);
            return new Point(rawX, rawY);
        }
        return new Point(RangesKt.n(f11, 0.0f - (z10 ? 0.0f : ((Number) E.f123940r.getValue()).floatValue()), a(i10, z10)), RangesKt.n(f13, 0.0f - (z10 ? 0.0f : ((Number) E.f123941s.getValue()).floatValue()), b(i11, z10)));
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.ui.button.SparkScanViewScanButtonTouchListener
    public final void b(float f10) {
        this.f124058o.x = f10;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.ui.button.SparkScanViewScanButtonTouchListener
    public final Point b(int i10, int i11) {
        return a(i10, i11, false);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.ui.button.SparkScanViewScanButtonTouchListener
    public final void b() {
        this.f124047d.removeCallbacksAndMessages(null);
    }

    public final void b(View view) {
        MotionEvent motionEvent;
        MotionEvent motionEvent2;
        this.f124044a.a(false);
        this.f124060q.invoke(EnumC13341a.f124003k);
        this.f124055l = -1;
        if (System.currentTimeMillis() - this.f124059p < 200) {
            Pair pair = this.f124056m;
            float rawY = -1.0f;
            float rawX = ((pair == null || (motionEvent2 = (MotionEvent) pair.c()) == null) ? -1.0f : motionEvent2.getRawX()) + this.f124053j;
            Pair pair2 = this.f124056m;
            if (pair2 != null && (motionEvent = (MotionEvent) pair2.c()) != null) {
                rawY = motionEvent.getRawY();
            }
            this.f124060q.invoke(this.f124045b.a(this.f124057n, new PointF(rawX, rawY + this.f124054k)));
        }
        if (this.f124048e) {
            this.f124060q.invoke(EnumC13341a.f124000h);
        }
        this.f124047d.removeCallbacksAndMessages(null);
        if (this.f124052i) {
            this.f124052i = false;
            this.f124060q.invoke(EnumC13341a.f124002j);
            Intrinsics.j(view, "<this>");
            boolean z10 = view instanceof c;
            float fFloatValue = 0.0f - (z10 ? 0.0f : ((Number) E.f123941s.getValue()).floatValue());
            Intrinsics.j(view, "<this>");
            float fFloatValue2 = 0.0f - (z10 ? 0.0f : ((Number) E.f123940r.getValue()).floatValue());
            Object parent = view.getParent();
            Intrinsics.h(parent, "null cannot be cast to non-null type android.view.View");
            int width = ((View) parent).getWidth();
            Intrinsics.j(view, "<this>");
            float fA = a(width, z10);
            Object parent2 = view.getParent();
            Intrinsics.h(parent2, "null cannot be cast to non-null type android.view.View");
            int height = ((View) parent2).getHeight();
            Intrinsics.j(view, "<this>");
            float fB = b(height, z10);
            PointF pointF = this.f124058o;
            pointF.x = RangesKt.n(pointF.x, fFloatValue2, fA);
            PointF pointF2 = this.f124058o;
            pointF2.y = RangesKt.n(pointF2.y, fFloatValue, fB);
            view.animate().x(this.f124058o.x).y(this.f124058o.y).setDuration(300L).setInterpolator(new BounceInterpolator()).start();
            this.f124058o.x += view.getWidth() / 2;
            this.f124058o.y += view.getHeight() / 2;
            this.f124044a.e(this.f124058o.x);
            this.f124044a.f(this.f124058o.y);
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.ui.button.SparkScanViewScanButtonTouchListener
    public final void a(float f10) {
        this.f124058o.y = f10;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.ui.button.SparkScanViewScanButtonTouchListener
    public final Point a(int i10, int i11) {
        return a(i10, i11, true);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.ui.button.SparkScanViewScanButtonTouchListener
    public final void a() {
        this.f124058o = new PointF(this.f124044a.w(), this.f124044a.x());
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.ui.button.SparkScanViewScanButtonTouchListener
    public final void a(Function1 function1) {
        Intrinsics.j(function1, "<set-?>");
        this.f124060q = function1;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.ui.button.SparkScanViewScanButtonTouchListener
    public final void a(View view) {
        this.f124061r = view;
    }

    public final void a(View view, MotionEvent motionEvent) {
        this.f124044a.a(true);
        this.f124055l = motionEvent.getPointerId(0);
        this.f124056m = TuplesKt.a(motionEvent, view);
        this.f124060q.invoke(EnumC13341a.f123993a);
        this.f124059p = System.currentTimeMillis();
        this.f124053j = view.getX() - motionEvent.getRawX();
        this.f124054k = view.getY() - motionEvent.getRawY();
        this.f124057n.x = motionEvent.getRawX() + this.f124053j;
        this.f124057n.y = motionEvent.getRawY() + this.f124054k;
        Intrinsics.j(view, "<this>");
        if (view instanceof c) {
            this.f124060q.invoke(EnumC13341a.f124001i);
        }
        this.f124048e = false;
        this.f124049f = false;
        this.f124047d.removeCallbacksAndMessages(null);
        Handler handler = this.f124047d;
        final g gVar = this.f124050g;
        handler.postDelayed(new Runnable() { // from class: com.scandit.datacapture.barcode.internal.module.spark.ui.button.m
            @Override // java.lang.Runnable
            public final void run() {
                h.a(gVar);
            }
        }, this.f124046c);
    }

    public static final void a(KFunction tmp0) {
        Intrinsics.j(tmp0, "$tmp0");
        ((Function0) tmp0).invoke();
    }
}
