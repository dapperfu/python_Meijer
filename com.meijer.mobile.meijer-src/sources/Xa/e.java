package Xa;

/* loaded from: classes4.dex */
public class e implements Pb.a {

    /* renamed from: a, reason: collision with root package name */
    private String f41732a;

    /* renamed from: b, reason: collision with root package name */
    private String f41733b;

    /* renamed from: c, reason: collision with root package name */
    private String f41734c;

    /* renamed from: d, reason: collision with root package name */
    private String f41735d;

    /* renamed from: e, reason: collision with root package name */
    private long f41736e;

    /* renamed from: f, reason: collision with root package name */
    private a f41737f;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        String str = this.f41735d;
        if (str == null) {
            if (eVar.f41735d != null) {
                return false;
            }
        } else if (!str.equals(eVar.f41735d)) {
            return false;
        }
        a aVar = this.f41737f;
        if (aVar == null) {
            if (eVar.f41737f != null) {
                return false;
            }
        } else if (!aVar.equals(eVar.f41737f)) {
            return false;
        }
        String str2 = this.f41734c;
        if (str2 == null) {
            if (eVar.f41734c != null) {
                return false;
            }
        } else if (!str2.equals(eVar.f41734c)) {
            return false;
        }
        if (this.f41736e != eVar.f41736e) {
            return false;
        }
        String str3 = this.f41732a;
        if (str3 == null) {
            if (eVar.f41732a != null) {
                return false;
            }
        } else if (!str3.equals(eVar.f41732a)) {
            return false;
        }
        String str4 = this.f41733b;
        if (str4 == null) {
            if (eVar.f41733b != null) {
                return false;
            }
        } else if (!str4.equals(eVar.f41733b)) {
            return false;
        }
        return true;
    }

    public String toString() {
        return "Communication [identifier=" + this.f41732a + ", title=" + this.f41733b + ", description=" + this.f41734c + ", URL=" + this.f41735d + ", expiryTimeInMillis=" + this.f41736e + ", attributes=" + this.f41737f + "]";
    }
}
