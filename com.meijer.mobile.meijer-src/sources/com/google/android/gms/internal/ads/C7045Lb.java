package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.Lb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7045Lb {

    /* renamed from: a, reason: collision with root package name */
    private final int f69233a;

    /* renamed from: b, reason: collision with root package name */
    private final int f69234b;

    /* renamed from: c, reason: collision with root package name */
    private final int f69235c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f69236d;

    /* renamed from: e, reason: collision with root package name */
    private final C7712bc f69237e;

    /* renamed from: f, reason: collision with root package name */
    private final C8564jc f69238f;

    /* renamed from: n, reason: collision with root package name */
    private int f69246n;

    /* renamed from: g, reason: collision with root package name */
    private final Object f69239g = new Object();

    /* renamed from: h, reason: collision with root package name */
    private final ArrayList f69240h = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    private final ArrayList f69241i = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    private final ArrayList f69242j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    private int f69243k = 0;

    /* renamed from: l, reason: collision with root package name */
    private int f69244l = 0;

    /* renamed from: m, reason: collision with root package name */
    private int f69245m = 0;

    /* renamed from: o, reason: collision with root package name */
    private String f69247o = "";

    /* renamed from: p, reason: collision with root package name */
    private String f69248p = "";

    /* renamed from: q, reason: collision with root package name */
    private String f69249q = "";

    final int a(int i10, int i11) {
        return this.f69236d ? this.f69234b : (i10 * this.f69233a) + (i11 * this.f69234b);
    }

    final int b() {
        return this.f69243k;
    }

    public final String c() {
        return this.f69247o;
    }

    public final String d() {
        return this.f69249q;
    }

    public final void g(int i10) {
        this.f69244l = i10;
    }

    private final void m(String str, boolean z10, float f10, float f11, float f12, float f13) {
        if (str != null) {
            if (str.length() < this.f69235c) {
                return;
            }
            synchronized (this.f69239g) {
                try {
                    this.f69240h.add(str);
                    this.f69243k += str.length();
                    if (z10) {
                        this.f69241i.add(str);
                        this.f69242j.add(new C7449Xb(f10, f11, f12, f13, this.f69241i.size() - 1));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final void e() {
        synchronized (this.f69239g) {
            this.f69245m--;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C7045Lb)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        String str = ((C7045Lb) obj).f69247o;
        return str != null && str.equals(this.f69247o);
    }

    public final void f() {
        synchronized (this.f69239g) {
            this.f69245m++;
        }
    }

    public final int hashCode() {
        return this.f69247o.hashCode();
    }

    public final void j() {
        synchronized (this.f69239g) {
            try {
                int iA = a(this.f69243k, this.f69244l);
                if (iA > this.f69246n) {
                    this.f69246n = iA;
                    if (!Nc.v.s().j().n()) {
                        this.f69247o = this.f69237e.a(this.f69240h);
                        this.f69248p = this.f69237e.a(this.f69241i);
                    }
                    if (!Nc.v.s().j().l()) {
                        this.f69249q = this.f69238f.a(this.f69241i, this.f69242j);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void k() {
        synchronized (this.f69239g) {
            try {
                int iA = a(this.f69243k, this.f69244l);
                if (iA > this.f69246n) {
                    this.f69246n = iA;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean l() {
        boolean z10;
        synchronized (this.f69239g) {
            z10 = this.f69245m == 0;
        }
        return z10;
    }

    public final String toString() {
        ArrayList arrayList = this.f69240h;
        return "ActivityContent fetchId: " + this.f69244l + " score:" + this.f69246n + " total_length:" + this.f69243k + "\n text: " + n(arrayList, 100) + "\n viewableText" + n(this.f69241i, 100) + "\n signture: " + this.f69247o + "\n viewableSignture: " + this.f69248p + "\n viewableSignatureForVertical: " + this.f69249q;
    }

    public C7045Lb(int i10, int i11, int i12, int i13, int i14, int i15, int i16, boolean z10) {
        this.f69233a = i10;
        this.f69234b = i11;
        this.f69235c = i12;
        this.f69236d = z10;
        this.f69237e = new C7712bc(i13);
        this.f69238f = new C8564jc(i14, i15, i16);
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
        synchronized (this.f69239g) {
            try {
                if (this.f69245m < 0) {
                    Sc.p.b("ActivityContent: negative number of WebViews.");
                }
                j();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
