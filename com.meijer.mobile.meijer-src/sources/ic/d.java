package ic;

import kc.C15116a;

/* loaded from: classes4.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private String f137497a;

    /* renamed from: b, reason: collision with root package name */
    private String f137498b;

    /* renamed from: c, reason: collision with root package name */
    private String f137499c;

    /* renamed from: d, reason: collision with root package name */
    private C15116a f137500d;

    public String a() {
        return this.f137498b;
    }

    public C15116a b() {
        return this.f137500d;
    }

    public void c(String str) {
        this.f137498b = str;
    }

    public void d(String str) {
        this.f137497a = str;
    }

    public void e(C15116a c15116a) {
        this.f137500d = c15116a;
    }

    public String toString() {
        return String.format("PostSightingsRequest [receiver_uuid=%s, payload=%s, oauthToken=%s]", this.f137497a, this.f137498b, this.f137499c);
    }
}
