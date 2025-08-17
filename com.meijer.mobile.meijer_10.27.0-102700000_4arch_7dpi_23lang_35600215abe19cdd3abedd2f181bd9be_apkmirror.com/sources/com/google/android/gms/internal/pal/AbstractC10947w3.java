package com.google.android.gms.internal.pal;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: com.google.android.gms.internal.pal.w3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC10947w3 implements InterfaceC10931v3 {

    /* renamed from: t, reason: collision with root package name */
    protected static volatile X3 f84166t;

    /* renamed from: a, reason: collision with root package name */
    protected MotionEvent f84167a;

    /* renamed from: j, reason: collision with root package name */
    protected double f84176j;

    /* renamed from: k, reason: collision with root package name */
    private double f84177k;

    /* renamed from: l, reason: collision with root package name */
    private double f84178l;

    /* renamed from: m, reason: collision with root package name */
    protected float f84179m;

    /* renamed from: n, reason: collision with root package name */
    protected float f84180n;

    /* renamed from: o, reason: collision with root package name */
    protected float f84181o;

    /* renamed from: p, reason: collision with root package name */
    protected float f84182p;

    /* renamed from: s, reason: collision with root package name */
    protected DisplayMetrics f84185s;

    /* renamed from: b, reason: collision with root package name */
    protected final LinkedList f84168b = new LinkedList();

    /* renamed from: c, reason: collision with root package name */
    protected long f84169c = 0;

    /* renamed from: d, reason: collision with root package name */
    protected long f84170d = 0;

    /* renamed from: e, reason: collision with root package name */
    protected long f84171e = 0;

    /* renamed from: f, reason: collision with root package name */
    protected long f84172f = 0;

    /* renamed from: g, reason: collision with root package name */
    protected long f84173g = 0;

    /* renamed from: h, reason: collision with root package name */
    protected long f84174h = 0;

    /* renamed from: i, reason: collision with root package name */
    protected long f84175i = 0;

    /* renamed from: q, reason: collision with root package name */
    private boolean f84183q = false;

    /* renamed from: r, reason: collision with root package name */
    protected boolean f84184r = false;

    @Override // com.google.android.gms.internal.pal.InterfaceC10931v3
    public final String c(Context context, View view, Activity activity) {
        return l(context, null, 2, view, activity, null);
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC10931v3
    public final String d(Context context, String str, View view, Activity activity) {
        return l(context, str, 3, view, activity, null);
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC10931v3
    public void e(View view) {
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC10931v3
    public final synchronized void f(MotionEvent motionEvent) {
        Long l10;
        try {
            if (this.f84183q) {
                this.f84173g = 0L;
                this.f84169c = 0L;
                this.f84170d = 0L;
                this.f84171e = 0L;
                this.f84172f = 0L;
                this.f84174h = 0L;
                this.f84175i = 0L;
                if (this.f84168b.size() > 0) {
                    Iterator it = this.f84168b.iterator();
                    while (it.hasNext()) {
                        ((MotionEvent) it.next()).recycle();
                    }
                    this.f84168b.clear();
                } else {
                    MotionEvent motionEvent2 = this.f84167a;
                    if (motionEvent2 != null) {
                        motionEvent2.recycle();
                    }
                }
                this.f84167a = null;
                this.f84183q = false;
            }
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f84176j = 0.0d;
                this.f84177k = motionEvent.getRawX();
                this.f84178l = motionEvent.getRawY();
            } else if (action == 1 || action == 2) {
                double rawX = motionEvent.getRawX();
                double rawY = motionEvent.getRawY();
                double d10 = rawX - this.f84177k;
                double d11 = rawY - this.f84178l;
                this.f84176j += Math.sqrt((d10 * d10) + (d11 * d11));
                this.f84177k = rawX;
                this.f84178l = rawY;
            }
            int action2 = motionEvent.getAction();
            if (action2 != 0) {
                try {
                    if (action2 == 1) {
                        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                        this.f84167a = motionEventObtain;
                        this.f84168b.add(motionEventObtain);
                        if (this.f84168b.size() > 6) {
                            ((MotionEvent) this.f84168b.remove()).recycle();
                        }
                        this.f84171e++;
                        this.f84173g = g(new Throwable().getStackTrace());
                    } else if (action2 == 2) {
                        this.f84170d += motionEvent.getHistorySize() + 1;
                        Z3 z3K = k(motionEvent);
                        Long l11 = z3K.f83008e;
                        if (l11 != null && z3K.f83011h != null) {
                            this.f84174h += l11.longValue() + z3K.f83011h.longValue();
                        }
                        if (this.f84185s != null && (l10 = z3K.f83009f) != null && z3K.f83012i != null) {
                            this.f84175i += l10.longValue() + z3K.f83012i.longValue();
                        }
                    } else if (action2 == 3) {
                        this.f84172f++;
                    }
                } catch (zzdm unused) {
                }
            } else {
                this.f84179m = motionEvent.getX();
                this.f84180n = motionEvent.getY();
                this.f84181o = motionEvent.getRawX();
                this.f84182p = motionEvent.getRawY();
                this.f84169c++;
            }
            this.f84184r = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    protected abstract long g(StackTraceElement[] stackTraceElementArr) throws zzdm;

    protected abstract Ya h(Context context, View view, Activity activity);

    protected abstract Ya i(Context context, C10679f6 c10679f6);

    protected abstract Ya j(Context context, View view, Activity activity);

    protected abstract Z3 k(MotionEvent motionEvent) throws zzdm;

    private final String l(Context context, String str, int i10, View view, Activity activity, byte[] bArr) {
        C10679f6 c10679f6U;
        C10915u3 c10915u3D;
        String str2;
        int i11;
        int i12;
        String strA;
        Ya yaI;
        int i13;
        int i14;
        int i15 = i10;
        Ya yaH = null;
        if (bArr == null || bArr.length <= 0) {
            c10679f6U = null;
        } else {
            try {
                c10679f6U = C10679f6.u(bArr, C10833p0.a());
            } catch (zzadi unused) {
            } catch (NullPointerException unused2) {
                return Integer.toString(3);
            }
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean zBooleanValue = ((Boolean) C10593a5.c().b(C10854q5.f83577d2)).booleanValue();
        if (zBooleanValue) {
            c10915u3D = f84166t != null ? f84166t.d() : null;
            str2 = true != ((Boolean) C10593a5.c().b(C10854q5.f83767w2)).booleanValue() ? "te" : "be";
        } else {
            c10915u3D = null;
            str2 = null;
        }
        try {
            if (i15 == 3) {
                yaH = h(context, view, activity);
                this.f84183q = true;
                i14 = 1002;
            } else {
                if (i15 == 2) {
                    yaI = j(context, view, activity);
                    i13 = 1008;
                } else {
                    yaI = i(context, c10679f6U);
                    i13 = 1000;
                }
                yaH = yaI;
                i14 = i13;
            }
            if (zBooleanValue && c10915u3D != null) {
                c10915u3D.c(i14, -1, System.currentTimeMillis() - jCurrentTimeMillis, str2, null);
            }
        } catch (Exception e10) {
            if (zBooleanValue && c10915u3D != null) {
                if (i15 == 3) {
                    i12 = 1003;
                } else if (i15 == 2) {
                    i12 = 1009;
                } else {
                    i11 = 1001;
                    i15 = 1;
                    c10915u3D.c(i11, -1, System.currentTimeMillis() - jCurrentTimeMillis, str2, e10);
                }
                i11 = i12;
                c10915u3D.c(i11, -1, System.currentTimeMillis() - jCurrentTimeMillis, str2, e10);
            }
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        if (yaH != null) {
            try {
                if (((B1) yaH.j()).D() == 0) {
                    strA = Integer.toString(5);
                } else {
                    strA = R2.a((B1) yaH.j(), str);
                    if (zBooleanValue && c10915u3D != null) {
                        c10915u3D.c(i15 == 3 ? 1006 : i15 == 2 ? 1010 : 1004, -1, System.currentTimeMillis() - jCurrentTimeMillis2, str2, null);
                    }
                }
            } catch (Exception e11) {
                strA = Integer.toString(7);
                if (zBooleanValue && c10915u3D != null) {
                    c10915u3D.c(i15 == 3 ? 1007 : i15 == 2 ? 1011 : 1005, -1, System.currentTimeMillis() - jCurrentTimeMillis2, str2, e11);
                }
            }
        } else {
            strA = Integer.toString(5);
        }
        return strA;
    }

    protected AbstractC10947w3(Context context) {
        try {
            if (((Boolean) C10593a5.c().b(C10854q5.f83767w2)).booleanValue()) {
                R2.d();
            } else {
                Y3.a(f84166t);
            }
            this.f84185s = context.getResources().getDisplayMetrics();
        } catch (Throwable unused) {
        }
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC10931v3
    public final String a(Context context) {
        if (!C10592a4.f()) {
            return l(context, null, 1, null, null, null);
        }
        throw new IllegalStateException("The caller must not be called from the UI thread.");
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC10931v3
    public final String b(Context context, byte[] bArr) {
        if (!C10592a4.f()) {
            return l(context, null, 1, null, null, bArr);
        }
        throw new IllegalStateException("The caller must not be called from the UI thread.");
    }
}
