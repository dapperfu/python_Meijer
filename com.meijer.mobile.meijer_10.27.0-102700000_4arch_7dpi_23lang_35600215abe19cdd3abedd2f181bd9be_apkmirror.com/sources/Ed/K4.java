package Ed;

import com.google.android.gms.common.api.a;

/* loaded from: classes6.dex */
public final class K4 {

    /* renamed from: a, reason: collision with root package name */
    private String f8194a;

    /* renamed from: b, reason: collision with root package name */
    private String f8195b;

    /* renamed from: c, reason: collision with root package name */
    private String f8196c;

    /* renamed from: d, reason: collision with root package name */
    private String f8197d;

    /* renamed from: e, reason: collision with root package name */
    private N5 f8198e;

    /* renamed from: f, reason: collision with root package name */
    private String f8199f;

    /* renamed from: g, reason: collision with root package name */
    private Boolean f8200g;

    /* renamed from: h, reason: collision with root package name */
    private Boolean f8201h;

    /* renamed from: i, reason: collision with root package name */
    private Boolean f8202i;

    /* renamed from: j, reason: collision with root package name */
    private Integer f8203j;

    /* renamed from: k, reason: collision with root package name */
    private Integer f8204k;

    public final K4 b(String str) {
        this.f8194a = str;
        return this;
    }

    public final K4 c(String str) {
        this.f8195b = str;
        return this;
    }

    public final K4 e(Boolean bool) {
        this.f8200g = bool;
        return this;
    }

    public final K4 f(Boolean bool) {
        this.f8202i = bool;
        return this;
    }

    public final K4 g(Boolean bool) {
        this.f8201h = bool;
        return this;
    }

    public final K4 h(N5 n52) {
        this.f8198e = n52;
        return this;
    }

    public final K4 i(String str) {
        this.f8199f = str;
        return this;
    }

    public final K4 j(String str) {
        this.f8196c = str;
        return this;
    }

    public final K4 k(Integer num) {
        this.f8204k = num;
        return this;
    }

    public final K4 l(String str) {
        this.f8197d = str;
        return this;
    }

    public final N4 m() {
        return new N4(this, null);
    }

    public final K4 d(Integer num) {
        this.f8203j = Integer.valueOf(num.intValue() & a.e.API_PRIORITY_OTHER);
        return this;
    }
}
