package Ce;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

/* loaded from: classes6.dex */
final class C<T> extends g0<T> implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    final Comparator<? super T>[] f3841a;

    @Override // Ce.g0, java.util.Comparator
    public int compare(T t10, T t11) {
        int i10 = 0;
        while (true) {
            Comparator<? super T>[] comparatorArr = this.f3841a;
            if (i10 >= comparatorArr.length) {
                return 0;
            }
            int iCompare = comparatorArr[i10].compare(t10, t11);
            if (iCompare != 0) {
                return iCompare;
            }
            i10++;
        }
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C) {
            return Arrays.equals(this.f3841a, ((C) obj).f3841a);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f3841a);
    }

    public String toString() {
        return "Ordering.compound(" + Arrays.toString(this.f3841a) + ")";
    }

    C(Comparator<? super T> comparator, Comparator<? super T> comparator2) {
        this.f3841a = new Comparator[]{comparator, comparator2};
    }
}
