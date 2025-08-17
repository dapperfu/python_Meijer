package Dd;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes6.dex */
final class Z extends AbstractMap implements Serializable {

    /* renamed from: j, reason: collision with root package name */
    private static final Object f5672j = new Object();

    /* renamed from: a, reason: collision with root package name */
    private transient Object f5673a;

    /* renamed from: b, reason: collision with root package name */
    transient int[] f5674b;

    /* renamed from: c, reason: collision with root package name */
    transient Object[] f5675c;

    /* renamed from: d, reason: collision with root package name */
    transient Object[] f5676d;

    /* renamed from: e, reason: collision with root package name */
    private transient int f5677e;

    /* renamed from: f, reason: collision with root package name */
    private transient int f5678f;

    /* renamed from: g, reason: collision with root package name */
    private transient Set f5679g;

    /* renamed from: h, reason: collision with root package name */
    private transient Set f5680h;

    /* renamed from: i, reason: collision with root package name */
    private transient Collection f5681i;

    final void B(int i10) {
        this.f5677e = J0.a(i10, 1, 1073741823);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int H() {
        return (1 << (this.f5677e & 31)) - 1;
    }

    private final int J(int i10, int i11, int i12, int i13) {
        int i14 = i11 - 1;
        Object objD = C3070a0.d(i11);
        if (i13 != 0) {
            C3070a0.e(objD, i12 & i14, i13 + 1);
        }
        Object obj = this.f5673a;
        Objects.requireNonNull(obj);
        int[] iArrA = a();
        for (int i15 = 0; i15 <= i10; i15++) {
            int iC = C3070a0.c(obj, i15);
            while (iC != 0) {
                int i16 = iC - 1;
                int i17 = iArrA[i16];
                int i18 = ((~i10) & i17) | i15;
                int i19 = i18 & i14;
                int iC2 = C3070a0.c(objD, i19);
                C3070a0.e(objD, i19, iC);
                iArrA[i16] = ((~i14) & i18) | (iC2 & i14);
                iC = i17 & i10;
            }
        }
        this.f5673a = objD;
        L(i14);
        return i14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int[] a() {
        int[] iArr = this.f5674b;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object[] b() {
        Object[] objArr = this.f5675c;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object[] c() {
        Object[] objArr = this.f5676d;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    static /* synthetic */ Object q(Z z10) {
        Object obj = z10.f5673a;
        Objects.requireNonNull(obj);
        return obj;
    }

    final void A() {
        this.f5677e += 32;
    }

    final void C(int i10, int i11) {
        Object obj = this.f5673a;
        Objects.requireNonNull(obj);
        int[] iArrA = a();
        Object[] objArrB = b();
        Object[] objArrC = c();
        int size = size();
        int i12 = size - 1;
        if (i10 >= i12) {
            objArrB[i10] = null;
            objArrC[i10] = null;
            iArrA[i10] = 0;
            return;
        }
        int i13 = i10 + 1;
        Object obj2 = objArrB[i12];
        objArrB[i10] = obj2;
        objArrC[i10] = objArrC[i12];
        objArrB[i12] = null;
        objArrC[i12] = null;
        iArrA[i10] = iArrA[i12];
        iArrA[i12] = 0;
        int iA = C3082b0.a(obj2) & i11;
        int iC = C3070a0.c(obj, iA);
        if (iC == size) {
            C3070a0.e(obj, iA, i13);
            return;
        }
        while (true) {
            int i14 = iC - 1;
            int i15 = iArrA[i14];
            int i16 = i15 & i11;
            if (i16 == size) {
                iArrA[i14] = (i15 & (~i11)) | (i11 & i13);
                return;
            }
            iC = i16;
        }
    }

    final boolean D() {
        return this.f5673a == null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.f5680h;
        if (set != null) {
            return set;
        }
        T t10 = new T(this);
        this.f5680h = t10;
        return t10;
    }

    final int j(int i10) {
        int i11 = i10 + 1;
        if (i11 < this.f5678f) {
            return i11;
        }
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        Set set = this.f5679g;
        if (set != null) {
            return set;
        }
        W w10 = new W(this);
        this.f5679g = w10;
        return w10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int i10;
        if (D()) {
            C3291t.e(D(), "Arrays already allocated");
            int i11 = this.f5677e;
            int iMax = Math.max(i11 + 1, 2);
            int iHighestOneBit = Integer.highestOneBit(iMax);
            if (iMax > iHighestOneBit && (iHighestOneBit = iHighestOneBit + iHighestOneBit) <= 0) {
                iHighestOneBit = 1073741824;
            }
            int iMax2 = Math.max(4, iHighestOneBit);
            this.f5673a = C3070a0.d(iMax2);
            L(iMax2 - 1);
            this.f5674b = new int[i11];
            this.f5675c = new Object[i11];
            this.f5676d = new Object[i11];
        }
        Map mapV = v();
        if (mapV != null) {
            return mapV.put(obj, obj2);
        }
        int[] iArrA = a();
        Object[] objArrB = b();
        Object[] objArrC = c();
        int i12 = this.f5678f;
        int i13 = i12 + 1;
        int iA = C3082b0.a(obj);
        int iH = H();
        int i14 = iA & iH;
        Object obj3 = this.f5673a;
        Objects.requireNonNull(obj3);
        int iC = C3070a0.c(obj3, i14);
        if (iC == 0) {
            if (i13 > iH) {
                iH = J(iH, C3070a0.a(iH), iA, i12);
            } else {
                Object obj4 = this.f5673a;
                Objects.requireNonNull(obj4);
                C3070a0.e(obj4, i14, i13);
            }
            i10 = 1;
        } else {
            int i15 = ~iH;
            int i16 = iA & i15;
            int i17 = 0;
            while (true) {
                int i18 = iC - 1;
                int i19 = iArrA[i18];
                i10 = 1;
                int i20 = i19 & i15;
                if (i20 == i16 && r.a(obj, objArrB[i18])) {
                    Object obj5 = objArrC[i18];
                    objArrC[i18] = obj2;
                    return obj5;
                }
                int i21 = i19 & iH;
                i17++;
                if (i21 != 0) {
                    iC = i21;
                } else {
                    if (i17 >= 9) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(H() + 1, 1.0f);
                        int i22 = i();
                        while (i22 >= 0) {
                            linkedHashMap.put(b()[i22], c()[i22]);
                            i22 = j(i22);
                        }
                        this.f5673a = linkedHashMap;
                        this.f5674b = null;
                        this.f5675c = null;
                        this.f5676d = null;
                        A();
                        return linkedHashMap.put(obj, obj2);
                    }
                    if (i13 > iH) {
                        iH = J(iH, C3070a0.a(iH), iA, i12);
                    } else {
                        iArrA[i18] = (i13 & iH) | i20;
                    }
                }
            }
        }
        int length = a().length;
        if (i13 > length) {
            int i23 = i10;
            int iMin = Math.min(1073741823, (Math.max(i23, length >>> 1) + length) | i23);
            if (iMin != length) {
                this.f5674b = Arrays.copyOf(a(), iMin);
                this.f5675c = Arrays.copyOf(b(), iMin);
                this.f5676d = Arrays.copyOf(c(), iMin);
            }
        }
        a()[i12] = (~iH) & iA;
        b()[i12] = obj;
        c()[i12] = obj2;
        this.f5678f = i13;
        A();
        return null;
    }

    final Map v() {
        Object obj = this.f5673a;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.f5681i;
        if (collection != null) {
            return collection;
        }
        Y y10 = new Y(this);
        this.f5681i = y10;
        return y10;
    }

    Z(int i10) {
        B(12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int I(Object obj) {
        if (D()) {
            return -1;
        }
        int iA = C3082b0.a(obj);
        int iH = H();
        Object obj2 = this.f5673a;
        Objects.requireNonNull(obj2);
        int iC = C3070a0.c(obj2, iA & iH);
        if (iC != 0) {
            int i10 = ~iH;
            int i11 = iA & i10;
            do {
                int i12 = iC - 1;
                int i13 = a()[i12];
                if ((i13 & i10) == i11 && r.a(obj, b()[i12])) {
                    return i12;
                }
                iC = i13 & iH;
            } while (iC != 0);
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object K(Object obj) {
        if (!D()) {
            int iH = H();
            Object obj2 = this.f5673a;
            Objects.requireNonNull(obj2);
            int iB = C3070a0.b(obj, null, iH, obj2, a(), b(), null);
            if (iB != -1) {
                Object obj3 = c()[iB];
                C(iB, iH);
                this.f5678f--;
                A();
                return obj3;
            }
        }
        return f5672j;
    }

    private final void L(int i10) {
        this.f5677e = ((32 - Integer.numberOfLeadingZeros(i10)) & 31) | (this.f5677e & (-32));
    }

    static /* synthetic */ Object k(Z z10, int i10) {
        return z10.b()[i10];
    }

    static /* synthetic */ Object r(Z z10, int i10) {
        return z10.c()[i10];
    }

    static /* synthetic */ void y(Z z10, int i10, Object obj) {
        z10.c()[i10] = obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (D()) {
            return;
        }
        A();
        Map mapV = v();
        if (mapV != null) {
            this.f5677e = J0.a(size(), 3, 1073741823);
            mapV.clear();
            this.f5673a = null;
            this.f5678f = 0;
            return;
        }
        Arrays.fill(b(), 0, this.f5678f, (Object) null);
        Arrays.fill(c(), 0, this.f5678f, (Object) null);
        Object obj = this.f5673a;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(a(), 0, this.f5678f, 0);
        this.f5678f = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map mapV = v();
        if (mapV != null) {
            return mapV.containsKey(obj);
        }
        if (I(obj) == -1) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map mapV = v();
        if (mapV == null) {
            for (int i10 = 0; i10 < this.f5678f; i10++) {
                if (r.a(obj, c()[i10])) {
                    return true;
                }
            }
            return false;
        }
        return mapV.containsValue(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map mapV = v();
        if (mapV != null) {
            return mapV.get(obj);
        }
        int I10 = I(obj);
        if (I10 == -1) {
            return null;
        }
        return c()[I10];
    }

    final int i() {
        if (isEmpty()) {
            return -1;
        }
        return 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map mapV = v();
        if (mapV != null) {
            return mapV.remove(obj);
        }
        Object objK = K(obj);
        if (objK == f5672j) {
            return null;
        }
        return objK;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map mapV = v();
        if (mapV != null) {
            return mapV.size();
        }
        return this.f5678f;
    }
}
