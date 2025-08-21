package Fd;

/* loaded from: classes6.dex */
public final class K6 {

    /* renamed from: a, reason: collision with root package name */
    private Long f9305a;

    /* renamed from: b, reason: collision with root package name */
    private Y6 f9306b;

    /* renamed from: c, reason: collision with root package name */
    private Boolean f9307c;

    /* renamed from: d, reason: collision with root package name */
    private Boolean f9308d;

    /* renamed from: e, reason: collision with root package name */
    private Boolean f9309e;

    public final K6 a(Boolean bool) {
        this.f9308d = bool;
        return this;
    }

    public final K6 b(Boolean bool) {
        this.f9309e = bool;
        return this;
    }

    public final K6 d(Y6 y62) {
        this.f9306b = y62;
        return this;
    }

    public final K6 e(Boolean bool) {
        this.f9307c = bool;
        return this;
    }

    public final M6 f() {
        return new M6(this, null);
    }

    public final K6 c(Long l10) {
        this.f9305a = Long.valueOf(l10.longValue() & Long.MAX_VALUE);
        return this;
    }
}
