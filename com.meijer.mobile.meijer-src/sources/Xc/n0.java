package Xc;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes4.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    private final Zc.a f41988a;

    /* renamed from: b, reason: collision with root package name */
    private final String f41989b;

    /* renamed from: c, reason: collision with root package name */
    private final long f41990c;

    /* renamed from: d, reason: collision with root package name */
    private final int f41991d;

    /* renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f41992e = new AtomicBoolean(false);

    public final int a() {
        return this.f41991d;
    }

    public final Zc.a b() {
        return this.f41988a;
    }

    public final String c() {
        return this.f41989b;
    }

    public final void d() {
        this.f41992e.set(true);
    }

    public final boolean f() {
        return this.f41992e.get();
    }

    public n0(Zc.a aVar, String str, long j10, int i10) {
        this.f41988a = aVar;
        this.f41989b = str;
        this.f41990c = j10;
        this.f41991d = i10;
    }

    public final boolean e() {
        if (this.f41990c <= Nc.v.c().a()) {
            return true;
        }
        return false;
    }
}
