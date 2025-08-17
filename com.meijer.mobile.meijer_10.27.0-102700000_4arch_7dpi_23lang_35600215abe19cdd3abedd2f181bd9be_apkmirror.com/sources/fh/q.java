package fh;

/* loaded from: classes7.dex */
public class q implements Comparable<q> {

    /* renamed from: a, reason: collision with root package name */
    public final int f131133a;

    /* renamed from: b, reason: collision with root package name */
    public final int f131134b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            q qVar = (q) obj;
            if (this.f131133a == qVar.f131133a && this.f131134b == qVar.f131134b) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(q qVar) {
        int i10 = this.f131134b * this.f131133a;
        int i11 = qVar.f131134b * qVar.f131133a;
        if (i11 < i10) {
            return 1;
        }
        return i11 > i10 ? -1 : 0;
    }

    public q b() {
        return new q(this.f131134b, this.f131133a);
    }

    public q e(q qVar) {
        int i10 = this.f131133a;
        int i11 = qVar.f131134b;
        int i12 = i10 * i11;
        int i13 = qVar.f131133a;
        int i14 = this.f131134b;
        return i12 <= i13 * i14 ? new q(i13, (i14 * i13) / i10) : new q((i10 * i11) / i14, i11);
    }

    public int hashCode() {
        return (this.f131133a * 31) + this.f131134b;
    }

    public q l(q qVar) {
        int i10 = this.f131133a;
        int i11 = qVar.f131134b;
        int i12 = i10 * i11;
        int i13 = qVar.f131133a;
        int i14 = this.f131134b;
        return i12 >= i13 * i14 ? new q(i13, (i14 * i13) / i10) : new q((i10 * i11) / i14, i11);
    }

    public String toString() {
        return this.f131133a + "x" + this.f131134b;
    }

    public q(int i10, int i11) {
        this.f131133a = i10;
        this.f131134b = i11;
    }
}
