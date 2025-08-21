package J3;

import De.C3106c;
import Je.f;
import a3.x;
import a3.y;

@Deprecated
/* loaded from: classes4.dex */
public class b implements y.a {

    /* renamed from: a, reason: collision with root package name */
    public final String f15415a;

    /* renamed from: b, reason: collision with root package name */
    public final String f15416b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f15415a.equals(bVar.f15415a) && this.f15416b.equals(bVar.f15416b)) {
                return true;
            }
        }
        return false;
    }

    @Override // a3.y.a
    public void b(x.b bVar) {
        String str = this.f15415a;
        str.getClass();
        switch (str) {
            case "TOTALTRACKS":
                Integer numM = f.m(this.f15416b);
                if (numM != null) {
                    bVar.r0(numM);
                    break;
                }
                break;
            case "TOTALDISCS":
                Integer numM2 = f.m(this.f15416b);
                if (numM2 != null) {
                    bVar.q0(numM2);
                    break;
                }
                break;
            case "TRACKNUMBER":
                Integer numM3 = f.m(this.f15416b);
                if (numM3 != null) {
                    bVar.s0(numM3);
                    break;
                }
                break;
            case "ALBUM":
                bVar.P(this.f15416b);
                break;
            case "GENRE":
                bVar.c0(this.f15416b);
                break;
            case "TITLE":
                bVar.p0(this.f15416b);
                break;
            case "DESCRIPTION":
                bVar.W(this.f15416b);
                break;
            case "DISCNUMBER":
                Integer numM4 = f.m(this.f15416b);
                if (numM4 != null) {
                    bVar.X(numM4);
                    break;
                }
                break;
            case "ALBUMARTIST":
                bVar.O(this.f15416b);
                break;
            case "ARTIST":
                bVar.Q(this.f15416b);
                break;
        }
    }

    public int hashCode() {
        return ((527 + this.f15415a.hashCode()) * 31) + this.f15416b.hashCode();
    }

    public String toString() {
        return "VC: " + this.f15415a + "=" + this.f15416b;
    }

    public b(String str, String str2) {
        this.f15415a = C3106c.f(str);
        this.f15416b = str2;
    }
}
