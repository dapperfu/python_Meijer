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
import com.scandit.datacapture.barcode.internal.module.spark.ui.C13209b;
import com.scandit.datacapture.barcode.internal.module.spark.ui.E;
import com.scandit.datacapture.barcode.internal.module.spark.ui.EnumC13208a;
import com.scandit.datacapture.core.common.geometry.Point;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KFunction;

/* loaded from: classes11.dex */
public final class h implements SparkScanViewScanButtonTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final SparkScanStateManager f123092a;

    /* renamed from: b, reason: collision with root package name */
    public final C13209b f123093b;

    /* renamed from: c, reason: collision with root package name */
    public final int f123094c;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f123095d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f123096e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f123097f;

    /* renamed from: g, reason: collision with root package name */
    public final g f123098g;

    /* renamed from: h, reason: collision with root package name */
    public final int f123099h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f123100i;

    /* renamed from: j, reason: collision with root package name */
    public float f123101j;

    /* renamed from: k, reason: collision with root package name */
    public float f123102k;

    /* renamed from: l, reason: collision with root package name */
    public int f123103l;

    /* renamed from: m, reason: collision with root package name */
    public Pair f123104m;

    /* renamed from: n, reason: collision with root package name */
    public final PointF f123105n;

    /* renamed from: o, reason: collision with root package name */
    public PointF f123106o;

    /* renamed from: p, reason: collision with root package name */
    public long f123107p;

    /* renamed from: q, reason: collision with root package name */
    public Function1 f123108q;

    /* renamed from: r, reason: collision with root package name */
    public View f123109r;

    public static float a(int i10, boolean z10) {
        return i10 - (z10 ? ((Number) E.f122991u.getValue()).intValue() : ((Number) E.f122984n.getValue()).intValue() - ((Number) E.f122988r.getValue()).floatValue());
    }

    public static float b(int i10, boolean z10) {
        return i10 - (z10 ? ((Number) E.f122992v.getValue()).intValue() : ((Number) E.f122985o.getValue()).intValue() - ((Number) E.f122989s.getValue()).floatValue());
    }

    public h(Context context, SparkScanStateManager stateManager) {
        Intrinsics.j(context, "context");
        Intrinsics.j(stateManager, "stateManager");
        this.f123092a = stateManager;
        this.f123093b = new C13209b(context);
        this.f123094c = ViewConfiguration.getLongPressTimeout();
        this.f123095d = new Handler(Looper.getMainLooper());
        this.f123098g = new g(this);
        this.f123099h = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f123103l = -1;
        this.f123105n = new PointF(0.0f, 0.0f);
        this.f123106o = new PointF(stateManager.w(), stateManager.x());
        this.f123108q = f.f123091a;
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
            iIntValue = ((Number) E.f122991u.getValue()).intValue();
        } else {
            iIntValue = ((Number) E.f122984n.getValue()).intValue();
        }
        if (z10) {
            iIntValue2 = ((Number) E.f122992v.getValue()).intValue();
        } else {
            iIntValue2 = ((Number) E.f122985o.getValue()).intValue();
        }
        PointF pointF = this.f123106o;
        float f10 = iIntValue / 2;
        float f11 = pointF.x - f10;
        float f12 = iIntValue2 / 2;
        float f13 = pointF.y - f12;
        Pair pair = this.f123104m;
        MotionEvent motionEvent = pair != null ? (MotionEvent) pair.c() : null;
        Pair pair2 = this.f123104m;
        View view = pair2 != null ? (View) pair2.d() : null;
        if (this.f123092a.h() && motionEvent != null && view != null) {
            float rawX = ((motionEvent.getRawX() + this.f123101j) - f10) + (((Number) E.f122991u.getValue()).intValue() / 2);
            float rawY = ((motionEvent.getRawY() + this.f123102k) - f12) + (((Number) E.f122992v.getValue()).intValue() / 2);
            this.f123101j = rawX - motionEvent.getRawX();
            this.f123102k = rawY - motionEvent.getRawY();
            this.f123108q.invoke(EnumC13208a.f123049i);
            return new Point(rawX, rawY);
        }
        return new Point(RangesKt.n(f11, 0.0f - (z10 ? 0.0f : ((Number) E.f122988r.getValue()).floatValue()), a(i10, z10)), RangesKt.n(f13, 0.0f - (z10 ? 0.0f : ((Number) E.f122989s.getValue()).floatValue()), b(i11, z10)));
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.ui.button.SparkScanViewScanButtonTouchListener
    public final void b(float f10) {
        this.f123106o.x = f10;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.ui.button.SparkScanViewScanButtonTouchListener
    public final Point b(int i10, int i11) {
        return a(i10, i11, false);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.ui.button.SparkScanViewScanButtonTouchListener
    public final void b() {
        this.f123095d.removeCallbacksAndMessages(null);
    }

    public final void b(View view) {
        MotionEvent motionEvent;
        MotionEvent motionEvent2;
        this.f123092a.a(false);
        this.f123108q.invoke(EnumC13208a.f123051k);
        this.f123103l = -1;
        if (System.currentTimeMillis() - this.f123107p < 200) {
            Pair pair = this.f123104m;
            float rawY = -1.0f;
            float rawX = ((pair == null || (motionEvent2 = (MotionEvent) pair.c()) == null) ? -1.0f : motionEvent2.getRawX()) + this.f123101j;
            Pair pair2 = this.f123104m;
            if (pair2 != null && (motionEvent = (MotionEvent) pair2.c()) != null) {
                rawY = motionEvent.getRawY();
            }
            this.f123108q.invoke(this.f123093b.a(this.f123105n, new PointF(rawX, rawY + this.f123102k)));
        }
        if (this.f123096e) {
            this.f123108q.invoke(EnumC13208a.f123048h);
        }
        this.f123095d.removeCallbacksAndMessages(null);
        if (this.f123100i) {
            this.f123100i = false;
            this.f123108q.invoke(EnumC13208a.f123050j);
            Intrinsics.j(view, "<this>");
            boolean z10 = view instanceof c;
            float fFloatValue = 0.0f - (z10 ? 0.0f : ((Number) E.f122989s.getValue()).floatValue());
            Intrinsics.j(view, "<this>");
            float fFloatValue2 = 0.0f - (z10 ? 0.0f : ((Number) E.f122988r.getValue()).floatValue());
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
            PointF pointF = this.f123106o;
            pointF.x = RangesKt.n(pointF.x, fFloatValue2, fA);
            PointF pointF2 = this.f123106o;
            pointF2.y = RangesKt.n(pointF2.y, fFloatValue, fB);
            view.animate().x(this.f123106o.x).y(this.f123106o.y).setDuration(300L).setInterpolator(new BounceInterpolator()).start();
            this.f123106o.x += view.getWidth() / 2;
            this.f123106o.y += view.getHeight() / 2;
            this.f123092a.e(this.f123106o.x);
            this.f123092a.f(this.f123106o.y);
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.ui.button.SparkScanViewScanButtonTouchListener
    public final void a(float f10) {
        this.f123106o.y = f10;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.ui.button.SparkScanViewScanButtonTouchListener
    public final Point a(int i10, int i11) {
        return a(i10, i11, true);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.ui.button.SparkScanViewScanButtonTouchListener
    public final void a() {
        this.f123106o = new PointF(this.f123092a.w(), this.f123092a.x());
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.ui.button.SparkScanViewScanButtonTouchListener
    public final void a(Function1 function1) {
        Intrinsics.j(function1, "<set-?>");
        this.f123108q = function1;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.ui.button.SparkScanViewScanButtonTouchListener
    public final void a(View view) {
        this.f123109r = view;
    }

    public final void a(View view, MotionEvent motionEvent) {
        this.f123092a.a(true);
        this.f123103l = motionEvent.getPointerId(0);
        this.f123104m = TuplesKt.a(motionEvent, view);
        this.f123108q.invoke(EnumC13208a.f123041a);
        this.f123107p = System.currentTimeMillis();
        this.f123101j = view.getX() - motionEvent.getRawX();
        this.f123102k = view.getY() - motionEvent.getRawY();
        this.f123105n.x = motionEvent.getRawX() + this.f123101j;
        this.f123105n.y = motionEvent.getRawY() + this.f123102k;
        Intrinsics.j(view, "<this>");
        if (view instanceof c) {
            this.f123108q.invoke(EnumC13208a.f123049i);
        }
        this.f123096e = false;
        this.f123097f = false;
        this.f123095d.removeCallbacksAndMessages(null);
        Handler handler = this.f123095d;
        final g gVar = this.f123098g;
        handler.postDelayed(new Runnable() { // from class: com.scandit.datacapture.barcode.internal.module.spark.ui.button.m
            @Override // java.lang.Runnable
            public final void run() {
                h.a(gVar);
            }
        }, this.f123094c);
    }

    public static final void a(KFunction tmp0) {
        Intrinsics.j(tmp0, "$tmp0");
        ((Function0) tmp0).invoke();
    }
}
