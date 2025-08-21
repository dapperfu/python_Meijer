package Gd;

import com.google.android.gms.common.api.a;

/* loaded from: classes6.dex */
public final class K4 {

    /* renamed from: a, reason: collision with root package name */
    private String f11746a;

    /* renamed from: b, reason: collision with root package name */
    private String f11747b;

    /* renamed from: c, reason: collision with root package name */
    private String f11748c;

    /* renamed from: d, reason: collision with root package name */
    private String f11749d;

    /* renamed from: e, reason: collision with root package name */
    private N5 f11750e;

    /* renamed from: f, reason: collision with root package name */
    private String f11751f;

    /* renamed from: g, reason: collision with root package name */
    private Boolean f11752g;

    /* renamed from: h, reason: collision with root package name */
    private Boolean f11753h;

    /* renamed from: i, reason: collision with root package name */
    private Boolean f11754i;

    /* renamed from: j, reason: collision with root package name */
    private Integer f11755j;

    /* renamed from: k, reason: collision with root package name */
    private Integer f11756k;

    public final K4 b(String str) {
        this.f11746a = str;
        return this;
    }

    public final K4 c(String str) {
        this.f11747b = str;
        return this;
    }

    public final K4 e(Boolean bool) {
        this.f11752g = bool;
        return this;
    }

    public final K4 f(Boolean bool) {
        this.f11754i = bool;
        return this;
    }

    public final K4 g(Boolean bool) {
        this.f11753h = bool;
        return this;
    }

    public final K4 h(N5 n52) {
        this.f11750e = n52;
        return this;
    }

    public final K4 i(String str) {
        this.f11751f = str;
        return this;
    }

    public final K4 j(String str) {
        this.f11748c = str;
        return this;
    }

    public final K4 k(Integer num) {
        this.f11756k = num;
        return this;
    }

    public final K4 l(String str) {
        this.f11749d = str;
        return this;
    }

    public final N4 m() {
        return new N4(this, null);
    }

    public final K4 d(Integer num) {
        this.f11755j = Integer.valueOf(num.intValue() & a.e.API_PRIORITY_OTHER);
        return this;
    }
}
