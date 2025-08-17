package Dd;

import com.google.android.gms.common.internal.C6535q;

/* renamed from: Dd.f1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3131f1 {

    /* renamed from: a, reason: collision with root package name */
    private final Y6 f6045a;

    /* renamed from: c, reason: collision with root package name */
    private final Boolean f6047c;

    /* renamed from: e, reason: collision with root package name */
    private final C3334w9 f6049e;

    /* renamed from: f, reason: collision with root package name */
    private final AbstractC3178j0 f6050f;

    /* renamed from: g, reason: collision with root package name */
    private final AbstractC3178j0 f6051g;

    /* renamed from: b, reason: collision with root package name */
    private final Boolean f6046b = null;

    /* renamed from: d, reason: collision with root package name */
    private final G6 f6048d = null;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3131f1)) {
            return false;
        }
        C3131f1 c3131f1 = (C3131f1) obj;
        return C6535q.a(this.f6045a, c3131f1.f6045a) && C6535q.a(null, null) && C6535q.a(this.f6047c, c3131f1.f6047c) && C6535q.a(null, null) && C6535q.a(this.f6049e, c3131f1.f6049e) && C6535q.a(this.f6050f, c3131f1.f6050f) && C6535q.a(this.f6051g, c3131f1.f6051g);
    }

    @Q0(zza = 6)
    public final AbstractC3178j0 a() {
        return this.f6050f;
    }

    @Q0(zza = 7)
    public final AbstractC3178j0 b() {
        return this.f6051g;
    }

    @Q0(zza = 1)
    public final Y6 c() {
        return this.f6045a;
    }

    @Q0(zza = 5)
    public final C3334w9 d() {
        return this.f6049e;
    }

    @Q0(zza = 3)
    public final Boolean e() {
        return this.f6047c;
    }

    public final int hashCode() {
        return C6535q.b(this.f6045a, null, this.f6047c, null, this.f6049e, this.f6050f, this.f6051g);
    }

    /* synthetic */ C3131f1(C3107d1 c3107d1, C3119e1 c3119e1) {
        this.f6045a = c3107d1.f6029a;
        this.f6047c = c3107d1.f6030b;
        this.f6049e = c3107d1.f6031c;
        this.f6050f = c3107d1.f6032d;
        this.f6051g = c3107d1.f6033e;
    }
}
