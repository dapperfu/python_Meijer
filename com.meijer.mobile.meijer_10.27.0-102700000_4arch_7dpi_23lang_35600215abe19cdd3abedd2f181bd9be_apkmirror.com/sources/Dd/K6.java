package Dd;

/* loaded from: classes6.dex */
public final class K6 {

    /* renamed from: a, reason: collision with root package name */
    private Long f5272a;

    /* renamed from: b, reason: collision with root package name */
    private Y6 f5273b;

    /* renamed from: c, reason: collision with root package name */
    private Boolean f5274c;

    /* renamed from: d, reason: collision with root package name */
    private Boolean f5275d;

    /* renamed from: e, reason: collision with root package name */
    private Boolean f5276e;

    public final K6 a(Boolean bool) {
        this.f5275d = bool;
        return this;
    }

    public final K6 b(Boolean bool) {
        this.f5276e = bool;
        return this;
    }

    public final K6 d(Y6 y62) {
        this.f5273b = y62;
        return this;
    }

    public final K6 e(Boolean bool) {
        this.f5274c = bool;
        return this;
    }

    public final M6 f() {
        return new M6(this, null);
    }

    public final K6 c(Long l10) {
        this.f5272a = Long.valueOf(l10.longValue() & Long.MAX_VALUE);
        return this;
    }
}
