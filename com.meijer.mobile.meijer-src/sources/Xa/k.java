package Xa;

/* loaded from: classes4.dex */
public class k implements Pb.a {

    /* renamed from: a, reason: collision with root package name */
    private String f41754a;

    /* renamed from: b, reason: collision with root package name */
    private String f41755b;

    /* renamed from: c, reason: collision with root package name */
    private a f41756c;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        k kVar = (k) obj;
        String str = this.f41754a;
        if (str == null) {
            if (kVar.f41754a != null) {
                return false;
            }
        } else if (!str.equals(kVar.f41754a)) {
            return false;
        }
        return true;
    }

    public a a() {
        return this.f41756c;
    }

    public String b() {
        return this.f41755b;
    }

    public String toString() {
        return "Place [identifier=" + this.f41754a + ", name=" + this.f41755b + ", attributes=" + this.f41756c + "]";
    }
}
