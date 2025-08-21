package Gd;

import com.google.android.gms.common.api.a;

/* renamed from: Gd.x3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3780x3 {

    /* renamed from: a, reason: collision with root package name */
    private Long f12443a;

    /* renamed from: b, reason: collision with root package name */
    private EnumC3787y3 f12444b;

    /* renamed from: c, reason: collision with root package name */
    private EnumC3745s3 f12445c;

    /* renamed from: d, reason: collision with root package name */
    private Integer f12446d;

    /* renamed from: e, reason: collision with root package name */
    private Integer f12447e;

    /* renamed from: f, reason: collision with root package name */
    private Integer f12448f;

    /* renamed from: g, reason: collision with root package name */
    private Integer f12449g;

    public final C3780x3 d(EnumC3745s3 enumC3745s3) {
        this.f12445c = enumC3745s3;
        return this;
    }

    public final C3780x3 f(EnumC3787y3 enumC3787y3) {
        this.f12444b = enumC3787y3;
        return this;
    }

    public final A3 j() {
        return new A3(this, null);
    }

    public final C3780x3 b(Long l10) {
        this.f12443a = Long.valueOf(l10.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final C3780x3 c(Integer num) {
        this.f12446d = Integer.valueOf(num.intValue() & a.e.API_PRIORITY_OTHER);
        return this;
    }

    public final C3780x3 e(Integer num) {
        this.f12448f = Integer.valueOf(num.intValue() & a.e.API_PRIORITY_OTHER);
        return this;
    }

    public final C3780x3 g(Integer num) {
        this.f12447e = Integer.valueOf(num.intValue() & a.e.API_PRIORITY_OTHER);
        return this;
    }

    public final C3780x3 h(Integer num) {
        this.f12449g = Integer.valueOf(num.intValue() & a.e.API_PRIORITY_OTHER);
        return this;
    }
}
