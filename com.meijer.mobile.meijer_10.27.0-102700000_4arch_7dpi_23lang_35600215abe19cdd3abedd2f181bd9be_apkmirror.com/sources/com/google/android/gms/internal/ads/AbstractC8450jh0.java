package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* renamed from: com.google.android.gms.internal.ads.jh0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC8450jh0 extends AbstractC7401Zg0 implements Set {

    /* renamed from: b, reason: collision with root package name */
    private transient AbstractC7917eh0 f75508b;

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean D(int i10, int i11) {
        return i10 < (i11 >> 1) + (i11 >> 2);
    }

    static int n(int i10) {
        int iMax = Math.max(i10, 2);
        if (iMax >= 751619276) {
            C6657Df0.f(iMax < 1073741824, "collection too large");
            return 1073741824;
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1);
        do {
            iHighestOneBit += iHighestOneBit;
        } while (iHighestOneBit * 0.7d < iMax);
        return iHighestOneBit;
    }

    public static AbstractC8450jh0 s(Object[] objArr) {
        int length = objArr.length;
        return length != 0 ? length != 1 ? C(length, (Object[]) objArr.clone()) : new C8240hi0(objArr[0]) : Wh0.f71138i;
    }

    public static AbstractC8450jh0 v(Object obj, Object obj2) {
        return C(2, obj, obj2);
    }

    public static AbstractC8450jh0 x(Object obj, Object obj2, Object obj3) {
        return C(3, obj, obj2, obj3);
    }

    public static AbstractC8450jh0 y(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return C(5, obj, obj2, obj3, obj4, obj5);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7401Zg0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: k */
    public abstract AbstractC8559ki0 iterator();

    boolean zzu() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static AbstractC8450jh0 C(int i10, Object... objArr) {
        if (i10 == 0) {
            return Wh0.f71138i;
        }
        if (i10 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new C8240hi0(obj);
        }
        int iN = n(i10);
        Object[] objArr2 = new Object[iN];
        int i11 = iN - 1;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < i10; i14++) {
            Object obj2 = objArr[i14];
            C7034Oh0.a(obj2, i14);
            int iHashCode = obj2.hashCode();
            int iA = C7302Wg0.a(iHashCode);
            while (true) {
                int i15 = iA & i11;
                Object obj3 = objArr2[i15];
                if (obj3 == null) {
                    objArr[i13] = obj2;
                    objArr2[i15] = obj2;
                    i12 += iHashCode;
                    i13++;
                    break;
                }
                if (!obj3.equals(obj2)) {
                    iA++;
                }
            }
        }
        Arrays.fill(objArr, i13, i10, (Object) null);
        if (i13 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new C8240hi0(obj4);
        }
        if (n(i13) < iN / 2) {
            return C(i13, objArr);
        }
        if (D(i13, objArr.length)) {
            objArr = Arrays.copyOf(objArr, i13);
        }
        return new Wh0(objArr, i12, objArr2, i11, i13);
    }

    public static C8344ih0 p(int i10) {
        return new C8344ih0(i10, true);
    }

    public static AbstractC8450jh0 r(Collection collection) {
        if ((collection instanceof AbstractC8450jh0) && !(collection instanceof SortedSet)) {
            AbstractC8450jh0 abstractC8450jh0 = (AbstractC8450jh0) collection;
            if (!abstractC8450jh0.l()) {
                return abstractC8450jh0;
            }
        }
        Object[] array = collection.toArray();
        return C(array.length, array);
    }

    public static AbstractC8450jh0 t() {
        return Wh0.f71138i;
    }

    public static AbstractC8450jh0 u(Object obj) {
        return new C8240hi0(obj);
    }

    @SafeVarargs
    public static AbstractC8450jh0 z(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        Object[] objArr2 = new Object[9];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        System.arraycopy(objArr, 0, objArr2, 6, 3);
        return C(9, objArr2);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof AbstractC8450jh0) && zzu() && ((AbstractC8450jh0) obj).zzu() && hashCode() != obj.hashCode()) {
            return false;
        }
        return C8133gi0.d(this, obj);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7401Zg0
    public AbstractC7917eh0 h() {
        AbstractC7917eh0 abstractC7917eh0 = this.f75508b;
        if (abstractC7917eh0 != null) {
            return abstractC7917eh0;
        }
        AbstractC7917eh0 abstractC7917eh0O = o();
        this.f75508b = abstractC7917eh0O;
        return abstractC7917eh0O;
    }

    AbstractC8450jh0() {
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return C8133gi0.a(this);
    }

    AbstractC7917eh0 o() {
        Object[] array = toArray();
        int i10 = AbstractC7917eh0.f73925c;
        return AbstractC7917eh0.p(array, array.length);
    }
}
