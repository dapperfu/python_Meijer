package gh;

/* loaded from: classes8.dex */
public class q implements Comparable<q> {

    /* renamed from: a, reason: collision with root package name */
    public final int f134232a;

    /* renamed from: b, reason: collision with root package name */
    public final int f134233b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            q qVar = (q) obj;
            if (this.f134232a == qVar.f134232a && this.f134233b == qVar.f134233b) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(q qVar) {
        int i10 = this.f134233b * this.f134232a;
        int i11 = qVar.f134233b * qVar.f134232a;
        if (i11 < i10) {
            return 1;
        }
        return i11 > i10 ? -1 : 0;
    }

    public q b() {
        return new q(this.f134233b, this.f134232a);
    }

    public q e(q qVar) {
        int i10 = this.f134232a;
        int i11 = qVar.f134233b;
        int i12 = i10 * i11;
        int i13 = qVar.f134232a;
        int i14 = this.f134233b;
        return i12 <= i13 * i14 ? new q(i13, (i14 * i13) / i10) : new q((i10 * i11) / i14, i11);
    }

    public int hashCode() {
        return (this.f134232a * 31) + this.f134233b;
    }

    public q l(q qVar) {
        int i10 = this.f134232a;
        int i11 = qVar.f134233b;
        int i12 = i10 * i11;
        int i13 = qVar.f134232a;
        int i14 = this.f134233b;
        return i12 >= i13 * i14 ? new q(i13, (i14 * i13) / i10) : new q((i10 * i11) / i14, i11);
    }

    public String toString() {
        return this.f134232a + "x" + this.f134233b;
    }

    public q(int i10, int i11) {
        this.f134232a = i10;
        this.f134233b = i11;
    }
}
