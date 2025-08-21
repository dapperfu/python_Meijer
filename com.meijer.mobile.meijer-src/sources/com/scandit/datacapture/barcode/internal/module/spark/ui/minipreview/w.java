package com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview;

import android.content.Context;
import android.graphics.PointF;
import android.os.Handler;
import android.os.Looper;
import android.util.Size;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.scandit.datacapture.barcode.internal.module.spark.data.SparkScanStateManager;
import com.scandit.datacapture.barcode.internal.module.spark.ui.C13342b;
import com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.w;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KFunction;

/* loaded from: classes12.dex */
public final class w implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final SparkScanStateManager f124173a;

    /* renamed from: b, reason: collision with root package name */
    public final View f124174b;

    /* renamed from: c, reason: collision with root package name */
    public Function1 f124175c;

    /* renamed from: d, reason: collision with root package name */
    public final C13342b f124176d;

    /* renamed from: e, reason: collision with root package name */
    public float f124177e;

    /* renamed from: f, reason: collision with root package name */
    public float f124178f;

    /* renamed from: g, reason: collision with root package name */
    public final PointF f124179g;

    /* renamed from: h, reason: collision with root package name */
    public final PointF f124180h;

    /* renamed from: i, reason: collision with root package name */
    public long f124181i;

    /* renamed from: j, reason: collision with root package name */
    public MotionEvent f124182j;

    /* renamed from: k, reason: collision with root package name */
    public final int f124183k;

    /* renamed from: l, reason: collision with root package name */
    public final Handler f124184l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f124185m;

    /* renamed from: n, reason: collision with root package name */
    public final v f124186n;

    public final PointF a(int i10, int i11, Pair sizes) {
        Intrinsics.j(sizes, "sizes");
        Size size = (Size) sizes.c();
        Size size2 = (Size) sizes.d();
        Lazy lazy = com.scandit.datacapture.barcode.internal.module.spark.ui.E.f123930h;
        float fIntValue = ((Number) lazy.getValue()).intValue() + 0.0f;
        Lazy lazy2 = com.scandit.datacapture.barcode.internal.module.spark.ui.E.f123931i;
        float fIntValue2 = ((Number) lazy2.getValue()).intValue() + 0.0f;
        float width = (i10 - size2.getWidth()) - ((Number) lazy2.getValue()).intValue();
        float height = (i11 - size2.getHeight()) - ((Number) lazy.getValue()).intValue();
        int iK = 0;
        boolean z10 = size2.getWidth() > size.getWidth();
        float fM = this.f124173a.m() > 0.0f ? this.f124173a.m() : this.f124174b.getX();
        float fN = this.f124173a.n() > 0.0f ? this.f124173a.n() : this.f124174b.getY();
        int width2 = (!z10 || (fM - ((float) (size2.getWidth() - size.getWidth()))) - ((float) ((Number) lazy2.getValue()).intValue()) >= 0.0f) ? (z10 || this.f124173a.j() <= 0.0f) ? size.getWidth() - size2.getWidth() : (int) (this.f124173a.j() - fM) : 0;
        if (!z10 && this.f124173a.k() > 0.0f) {
            iK = (int) (this.f124173a.k() - fN);
        }
        float fN2 = RangesKt.n(fN + iK, fIntValue, height);
        float fN3 = RangesKt.n(fM + width2, fIntValue2, width);
        this.f124173a.c(fN3);
        this.f124173a.d(fN2);
        return new PointF(fN3, fN2);
    }

    public w(Context context, SparkScanStateManager stateManager, View movingTarget) {
        Intrinsics.j(context, "context");
        Intrinsics.j(stateManager, "stateManager");
        Intrinsics.j(movingTarget, "movingTarget");
        this.f124173a = stateManager;
        this.f124174b = movingTarget;
        this.f124175c = u.f124172a;
        this.f124176d = new C13342b(context);
        this.f124179g = new PointF(0.0f, 0.0f);
        this.f124180h = new PointF(stateManager.m(), stateManager.n());
        this.f124183k = ViewConfiguration.getLongPressTimeout();
        this.f124184l = new Handler(Looper.getMainLooper());
        this.f124186n = new v(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0056  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r9, android.view.MotionEvent r10) {
        /*
            Method dump skipped, instructions count: 385
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.w.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public final void a(MotionEvent motionEvent) {
        this.f124181i = System.currentTimeMillis();
        this.f124177e = this.f124174b.getX() - motionEvent.getRawX();
        this.f124178f = this.f124174b.getY() - motionEvent.getRawY();
        this.f124179g.x = motionEvent.getRawX() + this.f124177e;
        this.f124179g.y = motionEvent.getRawY() + this.f124178f;
        this.f124185m = false;
        this.f124184l.removeCallbacksAndMessages(null);
        Handler handler = this.f124184l;
        final v vVar = this.f124186n;
        handler.postDelayed(new Runnable() { // from class: Ut.q
            @Override // java.lang.Runnable
            public final void run() {
                w.a(vVar);
            }
        }, this.f124183k);
    }

    public static final void a(KFunction tmp0) {
        Intrinsics.j(tmp0, "$tmp0");
        ((Function0) tmp0).invoke();
    }
}
