package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes6.dex */
public abstract class H9 implements G9 {

    /* renamed from: u, reason: collision with root package name */
    protected static volatile C8988na f68223u;

    /* renamed from: a, reason: collision with root package name */
    protected MotionEvent f68224a;

    /* renamed from: j, reason: collision with root package name */
    protected double f68233j;

    /* renamed from: k, reason: collision with root package name */
    private double f68234k;

    /* renamed from: l, reason: collision with root package name */
    private double f68235l;

    /* renamed from: m, reason: collision with root package name */
    protected float f68236m;

    /* renamed from: n, reason: collision with root package name */
    protected float f68237n;

    /* renamed from: o, reason: collision with root package name */
    protected float f68238o;

    /* renamed from: p, reason: collision with root package name */
    protected float f68239p;

    /* renamed from: s, reason: collision with root package name */
    protected DisplayMetrics f68242s;

    /* renamed from: t, reason: collision with root package name */
    protected C8027ea f68243t;

    /* renamed from: b, reason: collision with root package name */
    protected final LinkedList f68225b = new LinkedList();

    /* renamed from: c, reason: collision with root package name */
    protected long f68226c = 0;

    /* renamed from: d, reason: collision with root package name */
    protected long f68227d = 0;

    /* renamed from: e, reason: collision with root package name */
    protected long f68228e = 0;

    /* renamed from: f, reason: collision with root package name */
    protected long f68229f = 0;

    /* renamed from: g, reason: collision with root package name */
    protected long f68230g = 0;

    /* renamed from: h, reason: collision with root package name */
    protected long f68231h = 0;

    /* renamed from: i, reason: collision with root package name */
    protected long f68232i = 0;

    /* renamed from: q, reason: collision with root package name */
    private boolean f68240q = false;

    /* renamed from: r, reason: collision with root package name */
    protected boolean f68241r = false;

    @Override // com.google.android.gms.internal.ads.G9
    public final String b(Context context) {
        return "19";
    }

    @Override // com.google.android.gms.internal.ads.G9
    public final String d(Context context, String str, View view) {
        return k(context, str, 3, view, null, null);
    }

    protected abstract long e(StackTraceElement[] stackTraceElementArr) throws zzavt;

    protected abstract C8736l8 f(Context context, View view, Activity activity);

    protected abstract C8736l8 g(Context context, X7 x72);

    protected abstract C8736l8 h(Context context, View view, Activity activity);

    protected abstract C9202pa i(MotionEvent motionEvent) throws zzavt;

    @Override // com.google.android.gms.internal.ads.G9
    public final String zze(Context context, String str, View view, Activity activity) {
        return k(context, str, 3, view, activity, null);
    }

    @Override // com.google.android.gms.internal.ads.G9
    public final String zzh(Context context, View view, Activity activity) {
        return k(context, null, 2, view, activity, null);
    }

    @Override // com.google.android.gms.internal.ads.G9
    public final synchronized void zzk(MotionEvent motionEvent) {
        Long l10;
        try {
            if (this.f68240q) {
                j();
                this.f68240q = false;
            }
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f68233j = 0.0d;
                this.f68234k = motionEvent.getRawX();
                this.f68235l = motionEvent.getRawY();
            } else if (action == 1 || action == 2) {
                double rawX = motionEvent.getRawX();
                double rawY = motionEvent.getRawY();
                double d10 = rawX - this.f68234k;
                double d11 = rawY - this.f68235l;
                this.f68233j += Math.sqrt((d10 * d10) + (d11 * d11));
                this.f68234k = rawX;
                this.f68235l = rawY;
            }
            int action2 = motionEvent.getAction();
            if (action2 != 0) {
                try {
                    if (action2 == 1) {
                        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                        this.f68224a = motionEventObtain;
                        this.f68225b.add(motionEventObtain);
                        if (this.f68225b.size() > 6) {
                            ((MotionEvent) this.f68225b.remove()).recycle();
                        }
                        this.f68228e++;
                        this.f68230g = e(new Throwable().getStackTrace());
                    } else if (action2 == 2) {
                        this.f68227d += motionEvent.getHistorySize() + 1;
                        C9202pa c9202paI = i(motionEvent);
                        Long l11 = c9202paI.f78447e;
                        if (l11 != null && c9202paI.f78450h != null) {
                            this.f68231h += l11.longValue() + c9202paI.f78450h.longValue();
                        }
                        if (this.f68242s != null && (l10 = c9202paI.f78448f) != null && c9202paI.f78451i != null) {
                            this.f68232i += l10.longValue() + c9202paI.f78451i.longValue();
                        }
                    } else if (action2 == 3) {
                        this.f68229f++;
                    }
                } catch (zzavt unused) {
                }
            } else {
                this.f68236m = motionEvent.getX();
                this.f68237n = motionEvent.getY();
                this.f68238o = motionEvent.getRawX();
                this.f68239p = motionEvent.getRawY();
                this.f68226c++;
            }
            this.f68241r = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private final void j() {
        this.f68230g = 0L;
        this.f68226c = 0L;
        this.f68227d = 0L;
        this.f68228e = 0L;
        this.f68229f = 0L;
        this.f68231h = 0L;
        this.f68232i = 0L;
        if (this.f68225b.isEmpty()) {
            MotionEvent motionEvent = this.f68224a;
            if (motionEvent != null) {
                motionEvent.recycle();
            }
        } else {
            Iterator it = this.f68225b.iterator();
            while (it.hasNext()) {
                ((MotionEvent) it.next()).recycle();
            }
            this.f68225b.clear();
        }
        this.f68224a = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00dc A[Catch: Exception -> 0x00d8, TRY_LEAVE, TryCatch #2 {Exception -> 0x00d8, blocks: (B:44:0x009a, B:47:0x00a7, B:56:0x00cb, B:59:0x00dc), top: B:77:0x009a }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x009a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String k(android.content.Context r19, java.lang.String r20, int r21, android.view.View r22, android.app.Activity r23, byte[] r24) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.H9.k(android.content.Context, java.lang.String, int, android.view.View, android.app.Activity, byte[]):java.lang.String");
    }

    @Override // com.google.android.gms.internal.ads.G9
    public final void c(StackTraceElement[] stackTraceElementArr) {
        C8027ea c8027ea;
        if (!((Boolean) Oc.A.c().a(C8784lf.f76995T2)).booleanValue() || (c8027ea = this.f68243t) == null) {
            return;
        }
        c8027ea.b(Arrays.asList(stackTraceElementArr));
    }

    @Override // com.google.android.gms.internal.ads.G9
    public final synchronized void zzl(int i10, int i11, int i12) {
        try {
            if (this.f68224a != null) {
                if (((Boolean) Oc.A.c().a(C8784lf.f76785E2)).booleanValue()) {
                    j();
                } else {
                    this.f68224a.recycle();
                }
            }
            DisplayMetrics displayMetrics = this.f68242s;
            if (displayMetrics != null) {
                float f10 = displayMetrics.density;
                this.f68224a = MotionEvent.obtain(0L, i12, 1, i10 * f10, i11 * f10, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
            } else {
                this.f68224a = null;
            }
            this.f68241r = false;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    protected H9(Context context) {
        try {
            C8419i9.e();
            this.f68242s = context.getResources().getDisplayMetrics();
            if (((Boolean) Oc.A.c().a(C8784lf.f76995T2)).booleanValue()) {
                this.f68243t = new C8027ea();
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.G9
    public final String zzf(Context context) {
        if (!C9309qa.c()) {
            return k(context, null, 1, null, null, null);
        }
        throw new IllegalStateException("The caller must not be called from the UI thread.");
    }
}
