package gc;

import ic.C14713a;
import java.util.List;

/* renamed from: gc.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C14233b {

    /* renamed from: a, reason: collision with root package name */
    private String f133275a;

    /* renamed from: b, reason: collision with root package name */
    private List<C14713a> f133276b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C14233b c14233b = (C14233b) obj;
        String str = this.f133275a;
        if (str == null) {
            if (c14233b.f133275a != null) {
                return false;
            }
        } else if (!str.equals(c14233b.f133275a)) {
            return false;
        }
        List<C14713a> list = this.f133276b;
        if (list == null) {
            if (c14233b.f133276b != null) {
                return false;
            }
        } else if (!list.equals(c14233b.f133276b)) {
            return false;
        }
        return true;
    }

    public void a(String str) {
        this.f133275a = str;
    }

    public void b(List<C14713a> list) {
        this.f133276b = list;
    }

    public int hashCode() {
        String str = this.f133275a;
        int iHashCode = ((str == null ? 0 : str.hashCode()) + 31) * 31;
        List<C14713a> list = this.f133276b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return String.format("PostSightingsRequest [receiver_uuid=%s, sightings=%s]", this.f133275a, this.f133276b);
    }
}
