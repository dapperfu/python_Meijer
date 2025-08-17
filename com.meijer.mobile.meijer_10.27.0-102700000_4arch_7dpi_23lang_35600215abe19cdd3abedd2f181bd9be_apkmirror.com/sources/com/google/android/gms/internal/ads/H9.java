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
    protected static volatile C8863na f67383u;

    /* renamed from: a, reason: collision with root package name */
    protected MotionEvent f67384a;

    /* renamed from: j, reason: collision with root package name */
    protected double f67393j;

    /* renamed from: k, reason: collision with root package name */
    private double f67394k;

    /* renamed from: l, reason: collision with root package name */
    private double f67395l;

    /* renamed from: m, reason: collision with root package name */
    protected float f67396m;

    /* renamed from: n, reason: collision with root package name */
    protected float f67397n;

    /* renamed from: o, reason: collision with root package name */
    protected float f67398o;

    /* renamed from: p, reason: collision with root package name */
    protected float f67399p;

    /* renamed from: s, reason: collision with root package name */
    protected DisplayMetrics f67402s;

    /* renamed from: t, reason: collision with root package name */
    protected C7902ea f67403t;

    /* renamed from: b, reason: collision with root package name */
    protected final LinkedList f67385b = new LinkedList();

    /* renamed from: c, reason: collision with root package name */
    protected long f67386c = 0;

    /* renamed from: d, reason: collision with root package name */
    protected long f67387d = 0;

    /* renamed from: e, reason: collision with root package name */
    protected long f67388e = 0;

    /* renamed from: f, reason: collision with root package name */
    protected long f67389f = 0;

    /* renamed from: g, reason: collision with root package name */
    protected long f67390g = 0;

    /* renamed from: h, reason: collision with root package name */
    protected long f67391h = 0;

    /* renamed from: i, reason: collision with root package name */
    protected long f67392i = 0;

    /* renamed from: q, reason: collision with root package name */
    private boolean f67400q = false;

    /* renamed from: r, reason: collision with root package name */
    protected boolean f67401r = false;

    @Override // com.google.android.gms.internal.ads.G9
    public final String b(Context context) {
        return "19";
    }

    @Override // com.google.android.gms.internal.ads.G9
    public final String d(Context context, String str, View view) {
        return k(context, str, 3, view, null, null);
    }

    protected abstract long e(StackTraceElement[] stackTraceElementArr) throws zzavt;

    protected abstract C8611l8 f(Context context, View view, Activity activity);

    protected abstract C8611l8 g(Context context, X7 x72);

    protected abstract C8611l8 h(Context context, View view, Activity activity);

    protected abstract C9077pa i(MotionEvent motionEvent) throws zzavt;

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
            if (this.f67400q) {
                j();
                this.f67400q = false;
            }
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f67393j = 0.0d;
                this.f67394k = motionEvent.getRawX();
                this.f67395l = motionEvent.getRawY();
            } else if (action == 1 || action == 2) {
                double rawX = motionEvent.getRawX();
                double rawY = motionEvent.getRawY();
                double d10 = rawX - this.f67394k;
                double d11 = rawY - this.f67395l;
                this.f67393j += Math.sqrt((d10 * d10) + (d11 * d11));
                this.f67394k = rawX;
                this.f67395l = rawY;
            }
            int action2 = motionEvent.getAction();
            if (action2 != 0) {
                try {
                    if (action2 == 1) {
                        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                        this.f67384a = motionEventObtain;
                        this.f67385b.add(motionEventObtain);
                        if (this.f67385b.size() > 6) {
                            ((MotionEvent) this.f67385b.remove()).recycle();
                        }
                        this.f67388e++;
                        this.f67390g = e(new Throwable().getStackTrace());
                    } else if (action2 == 2) {
                        this.f67387d += motionEvent.getHistorySize() + 1;
                        C9077pa c9077paI = i(motionEvent);
                        Long l11 = c9077paI.f77607e;
                        if (l11 != null && c9077paI.f77610h != null) {
                            this.f67391h += l11.longValue() + c9077paI.f77610h.longValue();
                        }
                        if (this.f67402s != null && (l10 = c9077paI.f77608f) != null && c9077paI.f77611i != null) {
                            this.f67392i += l10.longValue() + c9077paI.f77611i.longValue();
                        }
                    } else if (action2 == 3) {
                        this.f67389f++;
                    }
                } catch (zzavt unused) {
                }
            } else {
                this.f67396m = motionEvent.getX();
                this.f67397n = motionEvent.getY();
                this.f67398o = motionEvent.getRawX();
                this.f67399p = motionEvent.getRawY();
                this.f67386c++;
            }
            this.f67401r = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private final void j() {
        this.f67390g = 0L;
        this.f67386c = 0L;
        this.f67387d = 0L;
        this.f67388e = 0L;
        this.f67389f = 0L;
        this.f67391h = 0L;
        this.f67392i = 0L;
        if (this.f67385b.isEmpty()) {
            MotionEvent motionEvent = this.f67384a;
            if (motionEvent != null) {
                motionEvent.recycle();
            }
        } else {
            Iterator it = this.f67385b.iterator();
            while (it.hasNext()) {
                ((MotionEvent) it.next()).recycle();
            }
            this.f67385b.clear();
        }
        this.f67384a = null;
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
        C7902ea c7902ea;
        if (!((Boolean) Mc.A.c().a(C8659lf.f76155T2)).booleanValue() || (c7902ea = this.f67403t) == null) {
            return;
        }
        c7902ea.b(Arrays.asList(stackTraceElementArr));
    }

    @Override // com.google.android.gms.internal.ads.G9
    public final synchronized void zzl(int i10, int i11, int i12) {
        try {
            if (this.f67384a != null) {
                if (((Boolean) Mc.A.c().a(C8659lf.f75945E2)).booleanValue()) {
                    j();
                } else {
                    this.f67384a.recycle();
                }
            }
            DisplayMetrics displayMetrics = this.f67402s;
            if (displayMetrics != null) {
                float f10 = displayMetrics.density;
                this.f67384a = MotionEvent.obtain(0L, i12, 1, i10 * f10, i11 * f10, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
            } else {
                this.f67384a = null;
            }
            this.f67401r = false;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    protected H9(Context context) {
        try {
            C8294i9.e();
            this.f67402s = context.getResources().getDisplayMetrics();
            if (((Boolean) Mc.A.c().a(C8659lf.f76155T2)).booleanValue()) {
                this.f67403t = new C7902ea();
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.G9
    public final String zzf(Context context) {
        if (!C9184qa.c()) {
            return k(context, null, 1, null, null, null);
        }
        throw new IllegalStateException("The caller must not be called from the UI thread.");
    }
}
