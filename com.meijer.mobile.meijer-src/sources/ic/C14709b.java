package ic;

import java.util.List;
import kc.C15116a;

/* renamed from: ic.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C14709b {

    /* renamed from: a, reason: collision with root package name */
    private String f137491a;

    /* renamed from: b, reason: collision with root package name */
    private List<C15116a> f137492b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C14709b c14709b = (C14709b) obj;
        String str = this.f137491a;
        if (str == null) {
            if (c14709b.f137491a != null) {
                return false;
            }
        } else if (!str.equals(c14709b.f137491a)) {
            return false;
        }
        List<C15116a> list = this.f137492b;
        if (list == null) {
            if (c14709b.f137492b != null) {
                return false;
            }
        } else if (!list.equals(c14709b.f137492b)) {
            return false;
        }
        return true;
    }

    public void a(String str) {
        this.f137491a = str;
    }

    public void b(List<C15116a> list) {
        this.f137492b = list;
    }

    public int hashCode() {
        String str = this.f137491a;
        int iHashCode = ((str == null ? 0 : str.hashCode()) + 31) * 31;
        List<C15116a> list = this.f137492b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return String.format("PostSightingsRequest [receiver_uuid=%s, sightings=%s]", this.f137491a, this.f137492b);
    }
}
