package Du;

/* loaded from: classes8.dex */
public abstract class c implements Comparable<c> {
    public abstract int e();

    public abstract long l();

    c() {
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(c cVar) {
        int iA = b.a(l(), cVar.l());
        if (iA != 0) {
            return iA;
        }
        return b.a(e(), cVar.e());
    }

    public static c b(long j10, int i10) {
        if (j10 >= -315576000000L) {
            if (j10 <= 315576000000L) {
                if (i10 >= 0) {
                    if (i10 <= 999999999) {
                        return new a(j10, i10);
                    }
                    throw new IllegalArgumentException("'nanos' is greater than maximum (999999999): " + i10);
                }
                throw new IllegalArgumentException("'nanos' is less than zero: " + i10);
            }
            throw new IllegalArgumentException("'seconds' is greater than maximum (315576000000): " + j10);
        }
        throw new IllegalArgumentException("'seconds' is less than minimum (-315576000000): " + j10);
    }
}
