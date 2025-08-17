package Va;

/* loaded from: classes4.dex */
public class k implements Nb.a {

    /* renamed from: a, reason: collision with root package name */
    private String f37042a;

    /* renamed from: b, reason: collision with root package name */
    private String f37043b;

    /* renamed from: c, reason: collision with root package name */
    private a f37044c;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        k kVar = (k) obj;
        String str = this.f37042a;
        if (str == null) {
            if (kVar.f37042a != null) {
                return false;
            }
        } else if (!str.equals(kVar.f37042a)) {
            return false;
        }
        return true;
    }

    public a a() {
        return this.f37044c;
    }

    public String b() {
        return this.f37043b;
    }

    public String toString() {
        return "Place [identifier=" + this.f37042a + ", name=" + this.f37043b + ", attributes=" + this.f37044c + "]";
    }
}
