package Va;

/* loaded from: classes4.dex */
public class e implements Nb.a {

    /* renamed from: a, reason: collision with root package name */
    private String f37020a;

    /* renamed from: b, reason: collision with root package name */
    private String f37021b;

    /* renamed from: c, reason: collision with root package name */
    private String f37022c;

    /* renamed from: d, reason: collision with root package name */
    private String f37023d;

    /* renamed from: e, reason: collision with root package name */
    private long f37024e;

    /* renamed from: f, reason: collision with root package name */
    private a f37025f;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        String str = this.f37023d;
        if (str == null) {
            if (eVar.f37023d != null) {
                return false;
            }
        } else if (!str.equals(eVar.f37023d)) {
            return false;
        }
        a aVar = this.f37025f;
        if (aVar == null) {
            if (eVar.f37025f != null) {
                return false;
            }
        } else if (!aVar.equals(eVar.f37025f)) {
            return false;
        }
        String str2 = this.f37022c;
        if (str2 == null) {
            if (eVar.f37022c != null) {
                return false;
            }
        } else if (!str2.equals(eVar.f37022c)) {
            return false;
        }
        if (this.f37024e != eVar.f37024e) {
            return false;
        }
        String str3 = this.f37020a;
        if (str3 == null) {
            if (eVar.f37020a != null) {
                return false;
            }
        } else if (!str3.equals(eVar.f37020a)) {
            return false;
        }
        String str4 = this.f37021b;
        if (str4 == null) {
            if (eVar.f37021b != null) {
                return false;
            }
        } else if (!str4.equals(eVar.f37021b)) {
            return false;
        }
        return true;
    }

    public String toString() {
        return "Communication [identifier=" + this.f37020a + ", title=" + this.f37021b + ", description=" + this.f37022c + ", URL=" + this.f37023d + ", expiryTimeInMillis=" + this.f37024e + ", attributes=" + this.f37025f + "]";
    }
}
