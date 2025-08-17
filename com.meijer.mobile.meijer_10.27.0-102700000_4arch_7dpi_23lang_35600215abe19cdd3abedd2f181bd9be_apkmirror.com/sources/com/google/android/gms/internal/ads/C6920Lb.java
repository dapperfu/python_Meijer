package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.Lb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6920Lb {

    /* renamed from: a, reason: collision with root package name */
    private final int f68393a;

    /* renamed from: b, reason: collision with root package name */
    private final int f68394b;

    /* renamed from: c, reason: collision with root package name */
    private final int f68395c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f68396d;

    /* renamed from: e, reason: collision with root package name */
    private final C7587bc f68397e;

    /* renamed from: f, reason: collision with root package name */
    private final C8439jc f68398f;

    /* renamed from: n, reason: collision with root package name */
    private int f68406n;

    /* renamed from: g, reason: collision with root package name */
    private final Object f68399g = new Object();

    /* renamed from: h, reason: collision with root package name */
    private final ArrayList f68400h = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    private final ArrayList f68401i = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    private final ArrayList f68402j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    private int f68403k = 0;

    /* renamed from: l, reason: collision with root package name */
    private int f68404l = 0;

    /* renamed from: m, reason: collision with root package name */
    private int f68405m = 0;

    /* renamed from: o, reason: collision with root package name */
    private String f68407o = "";

    /* renamed from: p, reason: collision with root package name */
    private String f68408p = "";

    /* renamed from: q, reason: collision with root package name */
    private String f68409q = "";

    final int a(int i10, int i11) {
        return this.f68396d ? this.f68394b : (i10 * this.f68393a) + (i11 * this.f68394b);
    }

    final int b() {
        return this.f68403k;
    }

    public final String c() {
        return this.f68407o;
    }

    public final String d() {
        return this.f68409q;
    }

    public final void g(int i10) {
        this.f68404l = i10;
    }

    private final void m(String str, boolean z10, float f10, float f11, float f12, float f13) {
        if (str != null) {
            if (str.length() < this.f68395c) {
                return;
            }
            synchronized (this.f68399g) {
                try {
                    this.f68400h.add(str);
                    this.f68403k += str.length();
                    if (z10) {
                        this.f68401i.add(str);
                        this.f68402j.add(new C7324Xb(f10, f11, f12, f13, this.f68401i.size() - 1));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final void e() {
        synchronized (this.f68399g) {
            this.f68405m--;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C6920Lb)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        String str = ((C6920Lb) obj).f68407o;
        return str != null && str.equals(this.f68407o);
    }

    public final void f() {
        synchronized (this.f68399g) {
            this.f68405m++;
        }
    }

    public final int hashCode() {
        return this.f68407o.hashCode();
    }

    public final void j() {
        synchronized (this.f68399g) {
            try {
                int iA = a(this.f68403k, this.f68404l);
                if (iA > this.f68406n) {
                    this.f68406n = iA;
                    if (!Lc.v.s().j().n()) {
                        this.f68407o = this.f68397e.a(this.f68400h);
                        this.f68408p = this.f68397e.a(this.f68401i);
                    }
                    if (!Lc.v.s().j().l()) {
                        this.f68409q = this.f68398f.a(this.f68401i, this.f68402j);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void k() {
        synchronized (this.f68399g) {
            try {
                int iA = a(this.f68403k, this.f68404l);
                if (iA > this.f68406n) {
                    this.f68406n = iA;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean l() {
        boolean z10;
        synchronized (this.f68399g) {
            z10 = this.f68405m == 0;
        }
        return z10;
    }

    public final String toString() {
        ArrayList arrayList = this.f68400h;
        return "ActivityContent fetchId: " + this.f68404l + " score:" + this.f68406n + " total_length:" + this.f68403k + "\n text: " + n(arrayList, 100) + "\n viewableText" + n(this.f68401i, 100) + "\n signture: " + this.f68407o + "\n viewableSignture: " + this.f68408p + "\n viewableSignatureForVertical: " + this.f68409q;
    }

    public C6920Lb(int i10, int i11, int i12, int i13, int i14, int i15, int i16, boolean z10) {
        this.f68393a = i10;
        this.f68394b = i11;
        this.f68395c = i12;
        this.f68396d = z10;
        this.f68397e = new C7587bc(i13);
        this.f68398f = new C8439jc(i14, i15, i16);
    }

    private static final String n(ArrayList arrayList, int i10) {
        if (arrayList.isEmpty()) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            sb2.append((String) arrayList.get(i11));
            sb2.append(' ');
            i11++;
            if (sb2.length() > 100) {
                break;
            }
        }
        sb2.deleteCharAt(sb2.length() - 1);
        String string = sb2.toString();
        if (string.length() < 100) {
            return string;
        }
        return string.substring(0, 100);
    }

    public final void h(String str, boolean z10, float f10, float f11, float f12, float f13) {
        m(str, z10, f10, f11, f12, f13);
    }

    public final void i(String str, boolean z10, float f10, float f11, float f12, float f13) {
        m(str, z10, f10, f11, f12, f13);
        synchronized (this.f68399g) {
            try {
                if (this.f68405m < 0) {
                    Qc.p.b("ActivityContent: negative number of WebViews.");
                }
                j();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
