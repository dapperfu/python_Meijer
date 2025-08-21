package Rc;

import com.google.android.gms.common.internal.C6660q;

/* loaded from: classes4.dex */
public final class F {

    /* renamed from: a, reason: collision with root package name */
    public final String f32307a;

    /* renamed from: b, reason: collision with root package name */
    public final double f32308b;

    /* renamed from: c, reason: collision with root package name */
    public final double f32309c;

    /* renamed from: d, reason: collision with root package name */
    public final double f32310d;

    /* renamed from: e, reason: collision with root package name */
    public final int f32311e;

    public final boolean equals(Object obj) {
        if (!(obj instanceof F)) {
            return false;
        }
        F f10 = (F) obj;
        return C6660q.a(this.f32307a, f10.f32307a) && this.f32308b == f10.f32308b && this.f32309c == f10.f32309c && this.f32311e == f10.f32311e && Double.compare(this.f32310d, f10.f32310d) == 0;
    }

    public final int hashCode() {
        return C6660q.b(this.f32307a, Double.valueOf(this.f32308b), Double.valueOf(this.f32309c), Double.valueOf(this.f32310d), Integer.valueOf(this.f32311e));
    }

    public F(String str, double d10, double d11, double d12, int i10) {
        this.f32307a = str;
        this.f32309c = d10;
        this.f32308b = d11;
        this.f32310d = d12;
        this.f32311e = i10;
    }

    public final String toString() {
        return C6660q.c(this).a("name", this.f32307a).a("minBound", Double.valueOf(this.f32309c)).a("maxBound", Double.valueOf(this.f32308b)).a("percent", Double.valueOf(this.f32310d)).a("count", Integer.valueOf(this.f32311e)).toString();
    }
}
