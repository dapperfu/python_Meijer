package com.google.android.gms.internal.atv_ads_framework;

import io.constructor.BuildConfig;
import java.util.Arrays;
import java.util.Set;

/* loaded from: classes6.dex */
public abstract class J extends C implements Set {

    /* renamed from: b, reason: collision with root package name */
    private transient F f80833b;

    static int n(int i10) {
        int iMax = Math.max(i10, 2);
        if (iMax >= 751619276) {
            if (iMax < 1073741824) {
                return 1073741824;
            }
            throw new IllegalArgumentException("collection too large");
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1);
        do {
            iHighestOneBit += iHighestOneBit;
        } while (iHighestOneBit * 0.7d < iMax);
        return iHighestOneBit;
    }

    public static J q(Object obj, Object obj2) {
        return u(2, obj, obj2);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof J) && t() && ((J) obj).t() && hashCode() != obj.hashCode()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    return containsAll(set);
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.C, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: k */
    public abstract W iterator();

    boolean t() {
        return false;
    }

    public static J p() {
        return T.f80879i;
    }

    public static J r(Object obj, Object obj2, Object obj3, Object obj4) {
        return u(4, "http", BuildConfig.SERVICE_SCHEME, "mailto", "ftp");
    }

    @SafeVarargs
    public static J s(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        Object[] objArr2 = new Object[29];
        objArr2[0] = "audio/3gpp2";
        objArr2[1] = "audio/3gpp";
        objArr2[2] = "audio/aac";
        objArr2[3] = "audio/midi";
        objArr2[4] = "audio/mp3";
        objArr2[5] = "audio/mp4";
        System.arraycopy(objArr, 0, objArr2, 6, 23);
        return u(29, objArr2);
    }

    private static J u(int i10, Object... objArr) {
        if (i10 == 0) {
            return T.f80879i;
        }
        if (i10 == 1) {
            Object obj = objArr[0];
            obj.getClass();
            return new V(obj);
        }
        int iN = n(i10);
        Object[] objArr2 = new Object[iN];
        int i11 = iN - 1;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < i10; i14++) {
            Object obj2 = objArr[i14];
            L.a(obj2, i14);
            int iHashCode = obj2.hashCode();
            int iA = B.a(iHashCode);
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
            obj4.getClass();
            return new V(obj4);
        }
        if (n(i13) < iN / 2) {
            return u(i13, objArr);
        }
        int length = objArr.length;
        if (i13 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i13);
        }
        return new T(objArr, i12, objArr2, i11, i13);
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.C
    public F h() {
        F f10 = this.f80833b;
        if (f10 != null) {
            return f10;
        }
        F fO = o();
        this.f80833b = fO;
        return fO;
    }

    J() {
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return U.a(this);
    }

    F o() {
        Object[] array = toArray();
        int i10 = F.f80755c;
        return F.o(array, array.length);
    }
}
