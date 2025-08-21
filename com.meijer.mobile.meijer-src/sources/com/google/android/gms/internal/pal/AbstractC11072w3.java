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
public abstract class AbstractC11072w3 implements InterfaceC11056v3 {

    /* renamed from: t, reason: collision with root package name */
    protected static volatile X3 f85006t;

    /* renamed from: a, reason: collision with root package name */
    protected MotionEvent f85007a;

    /* renamed from: j, reason: collision with root package name */
    protected double f85016j;

    /* renamed from: k, reason: collision with root package name */
    private double f85017k;

    /* renamed from: l, reason: collision with root package name */
    private double f85018l;

    /* renamed from: m, reason: collision with root package name */
    protected float f85019m;

    /* renamed from: n, reason: collision with root package name */
    protected float f85020n;

    /* renamed from: o, reason: collision with root package name */
    protected float f85021o;

    /* renamed from: p, reason: collision with root package name */
    protected float f85022p;

    /* renamed from: s, reason: collision with root package name */
    protected DisplayMetrics f85025s;

    /* renamed from: b, reason: collision with root package name */
    protected final LinkedList f85008b = new LinkedList();

    /* renamed from: c, reason: collision with root package name */
    protected long f85009c = 0;

    /* renamed from: d, reason: collision with root package name */
    protected long f85010d = 0;

    /* renamed from: e, reason: collision with root package name */
    protected long f85011e = 0;

    /* renamed from: f, reason: collision with root package name */
    protected long f85012f = 0;

    /* renamed from: g, reason: collision with root package name */
    protected long f85013g = 0;

    /* renamed from: h, reason: collision with root package name */
    protected long f85014h = 0;

    /* renamed from: i, reason: collision with root package name */
    protected long f85015i = 0;

    /* renamed from: q, reason: collision with root package name */
    private boolean f85023q = false;

    /* renamed from: r, reason: collision with root package name */
    protected boolean f85024r = false;

    @Override // com.google.android.gms.internal.pal.InterfaceC11056v3
    public final String c(Context context, View view, Activity activity) {
        return l(context, null, 2, view, activity, null);
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC11056v3
    public final String d(Context context, String str, View view, Activity activity) {
        return l(context, str, 3, view, activity, null);
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC11056v3
    public void e(View view) {
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC11056v3
    public final synchronized void f(MotionEvent motionEvent) {
        Long l10;
        try {
            if (this.f85023q) {
                this.f85013g = 0L;
                this.f85009c = 0L;
                this.f85010d = 0L;
                this.f85011e = 0L;
                this.f85012f = 0L;
                this.f85014h = 0L;
                this.f85015i = 0L;
                if (this.f85008b.size() > 0) {
                    Iterator it = this.f85008b.iterator();
                    while (it.hasNext()) {
                        ((MotionEvent) it.next()).recycle();
                    }
                    this.f85008b.clear();
                } else {
                    MotionEvent motionEvent2 = this.f85007a;
                    if (motionEvent2 != null) {
                        motionEvent2.recycle();
                    }
                }
                this.f85007a = null;
                this.f85023q = false;
            }
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f85016j = 0.0d;
                this.f85017k = motionEvent.getRawX();
                this.f85018l = motionEvent.getRawY();
            } else if (action == 1 || action == 2) {
                double rawX = motionEvent.getRawX();
                double rawY = motionEvent.getRawY();
                double d10 = rawX - this.f85017k;
                double d11 = rawY - this.f85018l;
                this.f85016j += Math.sqrt((d10 * d10) + (d11 * d11));
                this.f85017k = rawX;
                this.f85018l = rawY;
            }
            int action2 = motionEvent.getAction();
            if (action2 != 0) {
                try {
                    if (action2 == 1) {
                        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                        this.f85007a = motionEventObtain;
                        this.f85008b.add(motionEventObtain);
                        if (this.f85008b.size() > 6) {
                            ((MotionEvent) this.f85008b.remove()).recycle();
                        }
                        this.f85011e++;
                        this.f85013g = g(new Throwable().getStackTrace());
                    } else if (action2 == 2) {
                        this.f85010d += motionEvent.getHistorySize() + 1;
                        Z3 z3K = k(motionEvent);
                        Long l11 = z3K.f83848e;
                        if (l11 != null && z3K.f83851h != null) {
                            this.f85014h += l11.longValue() + z3K.f83851h.longValue();
                        }
                        if (this.f85025s != null && (l10 = z3K.f83849f) != null && z3K.f83852i != null) {
                            this.f85015i += l10.longValue() + z3K.f83852i.longValue();
                        }
                    } else if (action2 == 3) {
                        this.f85012f++;
                    }
                } catch (zzdm unused) {
                }
            } else {
                this.f85019m = motionEvent.getX();
                this.f85020n = motionEvent.getY();
                this.f85021o = motionEvent.getRawX();
                this.f85022p = motionEvent.getRawY();
                this.f85009c++;
            }
            this.f85024r = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    protected abstract long g(StackTraceElement[] stackTraceElementArr) throws zzdm;

    protected abstract Ya h(Context context, View view, Activity activity);

    protected abstract Ya i(Context context, C10804f6 c10804f6);

    protected abstract Ya j(Context context, View view, Activity activity);

    protected abstract Z3 k(MotionEvent motionEvent) throws zzdm;

    private final String l(Context context, String str, int i10, View view, Activity activity, byte[] bArr) {
        C10804f6 c10804f6U;
        C11040u3 c11040u3D;
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
            c10804f6U = null;
        } else {
            try {
                c10804f6U = C10804f6.u(bArr, C10958p0.a());
            } catch (zzadi unused) {
            } catch (NullPointerException unused2) {
                return Integer.toString(3);
            }
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean zBooleanValue = ((Boolean) C10718a5.c().b(C10979q5.f84417d2)).booleanValue();
        if (zBooleanValue) {
            c11040u3D = f85006t != null ? f85006t.d() : null;
            str2 = true != ((Boolean) C10718a5.c().b(C10979q5.f84607w2)).booleanValue() ? "te" : "be";
        } else {
            c11040u3D = null;
            str2 = null;
        }
        try {
            if (i15 == 3) {
                yaH = h(context, view, activity);
                this.f85023q = true;
                i14 = 1002;
            } else {
                if (i15 == 2) {
                    yaI = j(context, view, activity);
                    i13 = 1008;
                } else {
                    yaI = i(context, c10804f6U);
                    i13 = 1000;
                }
                yaH = yaI;
                i14 = i13;
            }
            if (zBooleanValue && c11040u3D != null) {
                c11040u3D.c(i14, -1, System.currentTimeMillis() - jCurrentTimeMillis, str2, null);
            }
        } catch (Exception e10) {
            if (zBooleanValue && c11040u3D != null) {
                if (i15 == 3) {
                    i12 = 1003;
                } else if (i15 == 2) {
                    i12 = 1009;
                } else {
                    i11 = 1001;
                    i15 = 1;
                    c11040u3D.c(i11, -1, System.currentTimeMillis() - jCurrentTimeMillis, str2, e10);
                }
                i11 = i12;
                c11040u3D.c(i11, -1, System.currentTimeMillis() - jCurrentTimeMillis, str2, e10);
            }
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        if (yaH != null) {
            try {
                if (((B1) yaH.j()).D() == 0) {
                    strA = Integer.toString(5);
                } else {
                    strA = R2.a((B1) yaH.j(), str);
                    if (zBooleanValue && c11040u3D != null) {
                        c11040u3D.c(i15 == 3 ? 1006 : i15 == 2 ? 1010 : 1004, -1, System.currentTimeMillis() - jCurrentTimeMillis2, str2, null);
                    }
                }
            } catch (Exception e11) {
                strA = Integer.toString(7);
                if (zBooleanValue && c11040u3D != null) {
                    c11040u3D.c(i15 == 3 ? 1007 : i15 == 2 ? 1011 : 1005, -1, System.currentTimeMillis() - jCurrentTimeMillis2, str2, e11);
                }
            }
        } else {
            strA = Integer.toString(5);
        }
        return strA;
    }

    protected AbstractC11072w3(Context context) {
        try {
            if (((Boolean) C10718a5.c().b(C10979q5.f84607w2)).booleanValue()) {
                R2.d();
            } else {
                Y3.a(f85006t);
            }
            this.f85025s = context.getResources().getDisplayMetrics();
        } catch (Throwable unused) {
        }
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC11056v3
    public final String a(Context context) {
        if (!C10717a4.f()) {
            return l(context, null, 1, null, null, null);
        }
        throw new IllegalStateException("The caller must not be called from the UI thread.");
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC11056v3
    public final String b(Context context, byte[] bArr) {
        if (!C10717a4.f()) {
            return l(context, null, 1, null, null, bArr);
        }
        throw new IllegalStateException("The caller must not be called from the UI thread.");
    }
}
