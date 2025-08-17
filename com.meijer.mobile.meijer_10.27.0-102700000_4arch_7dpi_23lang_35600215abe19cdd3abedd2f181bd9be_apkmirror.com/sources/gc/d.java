package gc;

import ic.C14713a;

/* loaded from: classes4.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private String f133281a;

    /* renamed from: b, reason: collision with root package name */
    private String f133282b;

    /* renamed from: c, reason: collision with root package name */
    private String f133283c;

    /* renamed from: d, reason: collision with root package name */
    private C14713a f133284d;

    public String a() {
        return this.f133282b;
    }

    public C14713a b() {
        return this.f133284d;
    }

    public void c(String str) {
        this.f133282b = str;
    }

    public void d(String str) {
        this.f133281a = str;
    }

    public void e(C14713a c14713a) {
        this.f133284d = c14713a;
    }

    public String toString() {
        return String.format("PostSightingsRequest [receiver_uuid=%s, payload=%s, oauthToken=%s]", this.f133281a, this.f133282b, this.f133283c);
    }
}
