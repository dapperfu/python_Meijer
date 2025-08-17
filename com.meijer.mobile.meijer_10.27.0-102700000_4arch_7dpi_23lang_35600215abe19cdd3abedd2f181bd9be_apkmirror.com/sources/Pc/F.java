package Pc;

import com.google.android.gms.common.internal.C6535q;

/* loaded from: classes4.dex */
public final class F {

    /* renamed from: a, reason: collision with root package name */
    public final String f25093a;

    /* renamed from: b, reason: collision with root package name */
    public final double f25094b;

    /* renamed from: c, reason: collision with root package name */
    public final double f25095c;

    /* renamed from: d, reason: collision with root package name */
    public final double f25096d;

    /* renamed from: e, reason: collision with root package name */
    public final int f25097e;

    public final boolean equals(Object obj) {
        if (!(obj instanceof F)) {
            return false;
        }
        F f10 = (F) obj;
        return C6535q.a(this.f25093a, f10.f25093a) && this.f25094b == f10.f25094b && this.f25095c == f10.f25095c && this.f25097e == f10.f25097e && Double.compare(this.f25096d, f10.f25096d) == 0;
    }

    public final int hashCode() {
        return C6535q.b(this.f25093a, Double.valueOf(this.f25094b), Double.valueOf(this.f25095c), Double.valueOf(this.f25096d), Integer.valueOf(this.f25097e));
    }

    public F(String str, double d10, double d11, double d12, int i10) {
        this.f25093a = str;
        this.f25095c = d10;
        this.f25094b = d11;
        this.f25096d = d12;
        this.f25097e = i10;
    }

    public final String toString() {
        return C6535q.c(this).a("name", this.f25093a).a("minBound", Double.valueOf(this.f25095c)).a("maxBound", Double.valueOf(this.f25094b)).a("percent", Double.valueOf(this.f25096d)).a("count", Integer.valueOf(this.f25097e)).toString();
    }
}
