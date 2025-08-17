package Vc;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes4.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    private final Xc.a f37276a;

    /* renamed from: b, reason: collision with root package name */
    private final String f37277b;

    /* renamed from: c, reason: collision with root package name */
    private final long f37278c;

    /* renamed from: d, reason: collision with root package name */
    private final int f37279d;

    /* renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f37280e = new AtomicBoolean(false);

    public final int a() {
        return this.f37279d;
    }

    public final Xc.a b() {
        return this.f37276a;
    }

    public final String c() {
        return this.f37277b;
    }

    public final void d() {
        this.f37280e.set(true);
    }

    public final boolean f() {
        return this.f37280e.get();
    }

    public n0(Xc.a aVar, String str, long j10, int i10) {
        this.f37276a = aVar;
        this.f37277b = str;
        this.f37278c = j10;
        this.f37279d = i10;
    }

    public final boolean e() {
        if (this.f37278c <= Lc.v.c().a()) {
            return true;
        }
        return false;
    }
}
