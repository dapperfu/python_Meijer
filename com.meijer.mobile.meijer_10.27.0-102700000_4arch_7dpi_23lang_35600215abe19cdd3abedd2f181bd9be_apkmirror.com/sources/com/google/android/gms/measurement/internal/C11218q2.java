package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import android.util.Log;

/* renamed from: com.google.android.gms.measurement.internal.q2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C11218q2 extends B3 {

    /* renamed from: c, reason: collision with root package name */
    private char f85765c;

    /* renamed from: d, reason: collision with root package name */
    private long f85766d;

    /* renamed from: e, reason: collision with root package name */
    private String f85767e;

    /* renamed from: f, reason: collision with root package name */
    private final C11204o2 f85768f;

    /* renamed from: g, reason: collision with root package name */
    private final C11204o2 f85769g;

    /* renamed from: h, reason: collision with root package name */
    private final C11204o2 f85770h;

    /* renamed from: i, reason: collision with root package name */
    private final C11204o2 f85771i;

    /* renamed from: j, reason: collision with root package name */
    private final C11204o2 f85772j;

    /* renamed from: k, reason: collision with root package name */
    private final C11204o2 f85773k;

    /* renamed from: l, reason: collision with root package name */
    private final C11204o2 f85774l;

    /* renamed from: m, reason: collision with root package name */
    private final C11204o2 f85775m;

    /* renamed from: n, reason: collision with root package name */
    private final C11204o2 f85776n;

    protected static Object v(String str) {
        if (str == null) {
            return null;
        }
        return new C11211p2(str);
    }

    final /* synthetic */ char B() {
        return this.f85765c;
    }

    final /* synthetic */ void C(char c10) {
        this.f85765c = c10;
    }

    final /* synthetic */ long D() {
        return this.f85766d;
    }

    final /* synthetic */ void E(long j10) {
        this.f85766d = 133005L;
    }

    @Override // com.google.android.gms.measurement.internal.B3
    protected final boolean g() {
        return false;
    }

    public final C11204o2 m() {
        return this.f85768f;
    }

    public final C11204o2 n() {
        return this.f85769g;
    }

    public final C11204o2 o() {
        return this.f85770h;
    }

    public final C11204o2 p() {
        return this.f85771i;
    }

    public final C11204o2 q() {
        return this.f85772j;
    }

    public final C11204o2 r() {
        return this.f85773k;
    }

    public final C11204o2 s() {
        return this.f85774l;
    }

    public final C11204o2 t() {
        return this.f85775m;
    }

    public final C11204o2 u() {
        return this.f85776n;
    }

    protected final String x() {
        String str;
        synchronized (this) {
            try {
                if (this.f85767e == null) {
                    this.f85767e = this.f84868a.u().s();
                }
                com.google.android.gms.common.internal.r.l(this.f85767e);
                str = this.f85767e;
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
            return obj instanceof C11211p2 ? ((C11211p2) obj).a() : z10 ? "-" : obj.toString();
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
        T2 t2Y = this.f84868a.y();
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
            t2Y.r(new RunnableC11197n2(this, i10, str, obj, obj2, obj3));
        }
    }

    C11218q2(X2 x22) {
        super(x22);
        this.f85765c = (char) 0;
        this.f85766d = -1L;
        this.f85768f = new C11204o2(this, 6, false, false);
        this.f85769g = new C11204o2(this, 6, true, false);
        this.f85770h = new C11204o2(this, 6, false, true);
        this.f85771i = new C11204o2(this, 5, false, false);
        this.f85772j = new C11204o2(this, 5, true, false);
        this.f85773k = new C11204o2(this, 5, false, true);
        this.f85774l = new C11204o2(this, 4, false, false);
        this.f85775m = new C11204o2(this, 3, false, false);
        this.f85776n = new C11204o2(this, 2, false, false);
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
