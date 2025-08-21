package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import android.util.Log;

/* renamed from: com.google.android.gms.measurement.internal.q2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C11343q2 extends B3 {

    /* renamed from: c, reason: collision with root package name */
    private char f86605c;

    /* renamed from: d, reason: collision with root package name */
    private long f86606d;

    /* renamed from: e, reason: collision with root package name */
    private String f86607e;

    /* renamed from: f, reason: collision with root package name */
    private final C11329o2 f86608f;

    /* renamed from: g, reason: collision with root package name */
    private final C11329o2 f86609g;

    /* renamed from: h, reason: collision with root package name */
    private final C11329o2 f86610h;

    /* renamed from: i, reason: collision with root package name */
    private final C11329o2 f86611i;

    /* renamed from: j, reason: collision with root package name */
    private final C11329o2 f86612j;

    /* renamed from: k, reason: collision with root package name */
    private final C11329o2 f86613k;

    /* renamed from: l, reason: collision with root package name */
    private final C11329o2 f86614l;

    /* renamed from: m, reason: collision with root package name */
    private final C11329o2 f86615m;

    /* renamed from: n, reason: collision with root package name */
    private final C11329o2 f86616n;

    protected static Object v(String str) {
        if (str == null) {
            return null;
        }
        return new C11336p2(str);
    }

    final /* synthetic */ char B() {
        return this.f86605c;
    }

    final /* synthetic */ void C(char c10) {
        this.f86605c = c10;
    }

    final /* synthetic */ long D() {
        return this.f86606d;
    }

    final /* synthetic */ void E(long j10) {
        this.f86606d = 133005L;
    }

    @Override // com.google.android.gms.measurement.internal.B3
    protected final boolean g() {
        return false;
    }

    public final C11329o2 m() {
        return this.f86608f;
    }

    public final C11329o2 n() {
        return this.f86609g;
    }

    public final C11329o2 o() {
        return this.f86610h;
    }

    public final C11329o2 p() {
        return this.f86611i;
    }

    public final C11329o2 q() {
        return this.f86612j;
    }

    public final C11329o2 r() {
        return this.f86613k;
    }

    public final C11329o2 s() {
        return this.f86614l;
    }

    public final C11329o2 t() {
        return this.f86615m;
    }

    public final C11329o2 u() {
        return this.f86616n;
    }

    protected final String x() {
        String str;
        synchronized (this) {
            try {
                if (this.f86607e == null) {
                    this.f86607e = this.f85708a.u().s();
                }
                com.google.android.gms.common.internal.r.l(this.f86607e);
                str = this.f86607e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }

    static String z(boolean z10, Object obj) {
        String className;
        if (obj == null) {
            return "";
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        int i10 = 0;
        if (obj instanceof Long) {
            if (!z10) {
                return obj.toString();
            }
            Long l10 = (Long) obj;
            if (Math.abs(l10.longValue()) < 100) {
                return obj.toString();
            }
            char cCharAt = obj.toString().charAt(0);
            String strValueOf = String.valueOf(Math.abs(l10.longValue()));
            long jRound = Math.round(Math.pow(10.0d, strValueOf.length() - 1));
            long jRound2 = Math.round(Math.pow(10.0d, strValueOf.length()) - 1.0d);
            int length = String.valueOf(jRound).length();
            String str = cCharAt == '-' ? "-" : "";
            StringBuilder sb2 = new StringBuilder(str.length() + length + 3 + str.length() + String.valueOf(jRound2).length());
            sb2.append(str);
            sb2.append(jRound);
            sb2.append("...");
            sb2.append(str);
            sb2.append(jRound2);
            return sb2.toString();
        }
        if (obj instanceof Boolean) {
            return obj.toString();
        }
        if (!(obj instanceof Throwable)) {
            return obj instanceof C11336p2 ? ((C11336p2) obj).a() : z10 ? "-" : obj.toString();
        }
        Throwable th2 = (Throwable) obj;
        StringBuilder sb3 = new StringBuilder(z10 ? th2.getClass().getName() : th2.toString());
        String strA = A(X2.class.getCanonicalName());
        StackTraceElement[] stackTrace = th2.getStackTrace();
        int length2 = stackTrace.length;
        while (true) {
            if (i10 >= length2) {
                break;
            }
            StackTraceElement stackTraceElement = stackTrace[i10];
            if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && A(className).equals(strA)) {
                sb3.append(": ");
                sb3.append(stackTraceElement);
                break;
            }
            i10++;
        }
        return sb3.toString();
    }

    protected final void w(int i10, boolean z10, boolean z11, String str, Object obj, Object obj2, Object obj3) throws IllegalStateException {
        if (!z10 && Log.isLoggable(x(), i10)) {
            Log.println(i10, x(), y(false, str, obj, obj2, obj3));
        }
        if (z11 || i10 < 5) {
            return;
        }
        com.google.android.gms.common.internal.r.l(str);
        T2 t2Y = this.f85708a.y();
        if (t2Y == null) {
            Log.println(6, x(), "Scheduler not set. Not logging error/warn");
        } else {
            if (!t2Y.i()) {
                Log.println(6, x(), "Scheduler not initialized. Not logging error/warn");
                return;
            }
            if (i10 >= 9) {
                i10 = 8;
            }
            t2Y.r(new RunnableC11322n2(this, i10, str, obj, obj2, obj3));
        }
    }

    C11343q2(X2 x22) {
        super(x22);
        this.f86605c = (char) 0;
        this.f86606d = -1L;
        this.f86608f = new C11329o2(this, 6, false, false);
        this.f86609g = new C11329o2(this, 6, true, false);
        this.f86610h = new C11329o2(this, 6, false, true);
        this.f86611i = new C11329o2(this, 5, false, false);
        this.f86612j = new C11329o2(this, 5, true, false);
        this.f86613k = new C11329o2(this, 5, false, true);
        this.f86614l = new C11329o2(this, 4, false, false);
        this.f86615m = new C11329o2(this, 3, false, false);
        this.f86616n = new C11329o2(this, 2, false, false);
    }

    static String A(String str) {
        int iLastIndexOf;
        if (TextUtils.isEmpty(str) || (iLastIndexOf = str.lastIndexOf(46)) == -1) {
            return "";
        }
        return str.substring(0, iLastIndexOf);
    }

    static String y(boolean z10, String str, Object obj, Object obj2, Object obj3) {
        String strZ = z(z10, obj);
        String strZ2 = z(z10, obj2);
        String strZ3 = z(z10, obj3);
        StringBuilder sb2 = new StringBuilder();
        String str2 = "";
        if (str == null) {
            str = "";
        }
        if (!TextUtils.isEmpty(str)) {
            sb2.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(strZ)) {
            sb2.append(str2);
            sb2.append(strZ);
            str2 = ", ";
        }
        if (!TextUtils.isEmpty(strZ2)) {
            sb2.append(str2);
            sb2.append(strZ2);
        } else {
            str3 = str2;
        }
        if (!TextUtils.isEmpty(strZ3)) {
            sb2.append(str3);
            sb2.append(strZ3);
        }
        return sb2.toString();
    }
}
