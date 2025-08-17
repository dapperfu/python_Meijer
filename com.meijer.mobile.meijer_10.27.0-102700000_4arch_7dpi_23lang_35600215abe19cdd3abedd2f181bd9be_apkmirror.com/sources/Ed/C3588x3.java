package Ed;

import com.google.android.gms.common.api.a;

/* renamed from: Ed.x3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3588x3 {

    /* renamed from: a, reason: collision with root package name */
    private Long f8891a;

    /* renamed from: b, reason: collision with root package name */
    private EnumC3595y3 f8892b;

    /* renamed from: c, reason: collision with root package name */
    private EnumC3553s3 f8893c;

    /* renamed from: d, reason: collision with root package name */
    private Integer f8894d;

    /* renamed from: e, reason: collision with root package name */
    private Integer f8895e;

    /* renamed from: f, reason: collision with root package name */
    private Integer f8896f;

    /* renamed from: g, reason: collision with root package name */
    private Integer f8897g;

    public final C3588x3 d(EnumC3553s3 enumC3553s3) {
        this.f8893c = enumC3553s3;
        return this;
    }

    public final C3588x3 f(EnumC3595y3 enumC3595y3) {
        this.f8892b = enumC3595y3;
        return this;
    }

    public final A3 j() {
        return new A3(this, null);
    }

    public final C3588x3 b(Long l10) {
        this.f8891a = Long.valueOf(l10.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final C3588x3 c(Integer num) {
        this.f8894d = Integer.valueOf(num.intValue() & a.e.API_PRIORITY_OTHER);
        return this;
    }

    public final C3588x3 e(Integer num) {
        this.f8896f = Integer.valueOf(num.intValue() & a.e.API_PRIORITY_OTHER);
        return this;
    }

    public final C3588x3 g(Integer num) {
        this.f8895e = Integer.valueOf(num.intValue() & a.e.API_PRIORITY_OTHER);
        return this;
    }

    public final C3588x3 h(Integer num) {
        this.f8897g = Integer.valueOf(num.intValue() & a.e.API_PRIORITY_OTHER);
        return this;
    }
}
