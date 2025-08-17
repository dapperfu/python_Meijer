package J3;

import Be.C2957c;
import He.f;
import a3.x;
import a3.y;

@Deprecated
/* loaded from: classes4.dex */
public class b implements y.a {

    /* renamed from: a, reason: collision with root package name */
    public final String f14568a;

    /* renamed from: b, reason: collision with root package name */
    public final String f14569b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f14568a.equals(bVar.f14568a) && this.f14569b.equals(bVar.f14569b)) {
                return true;
            }
        }
        return false;
    }

    @Override // a3.y.a
    public void b(x.b bVar) {
        String str = this.f14568a;
        str.getClass();
        switch (str) {
            case "TOTALTRACKS":
                Integer numM = f.m(this.f14569b);
                if (numM != null) {
                    bVar.r0(numM);
                    break;
                }
                break;
            case "TOTALDISCS":
                Integer numM2 = f.m(this.f14569b);
                if (numM2 != null) {
                    bVar.q0(numM2);
                    break;
                }
                break;
            case "TRACKNUMBER":
                Integer numM3 = f.m(this.f14569b);
                if (numM3 != null) {
                    bVar.s0(numM3);
                    break;
                }
                break;
            case "ALBUM":
                bVar.P(this.f14569b);
                break;
            case "GENRE":
                bVar.c0(this.f14569b);
                break;
            case "TITLE":
                bVar.p0(this.f14569b);
                break;
            case "DESCRIPTION":
                bVar.W(this.f14569b);
                break;
            case "DISCNUMBER":
                Integer numM4 = f.m(this.f14569b);
                if (numM4 != null) {
                    bVar.X(numM4);
                    break;
                }
                break;
            case "ALBUMARTIST":
                bVar.O(this.f14569b);
                break;
            case "ARTIST":
                bVar.Q(this.f14569b);
                break;
        }
    }

    public int hashCode() {
        return ((527 + this.f14568a.hashCode()) * 31) + this.f14569b.hashCode();
    }

    public String toString() {
        return "VC: " + this.f14568a + "=" + this.f14569b;
    }

    public b(String str, String str2) {
        this.f14568a = C2957c.f(str);
        this.f14569b = str2;
    }
}
