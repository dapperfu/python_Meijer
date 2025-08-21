package Ee;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

/* loaded from: classes6.dex */
final class C<T> extends g0<T> implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    final Comparator<? super T>[] f7153a;

    @Override // Ee.g0, java.util.Comparator
    public int compare(T t10, T t11) {
        int i10 = 0;
        while (true) {
            Comparator<? super T>[] comparatorArr = this.f7153a;
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
            return Arrays.equals(this.f7153a, ((C) obj).f7153a);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f7153a);
    }

    public String toString() {
        return "Ordering.compound(" + Arrays.toString(this.f7153a) + ")";
    }

    C(Comparator<? super T> comparator, Comparator<? super T> comparator2) {
        this.f7153a = new Comparator[]{comparator, comparator2};
    }
}
