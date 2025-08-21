package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.Mg0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7089Mg0 extends AbstractMap implements Serializable {

    /* renamed from: j, reason: collision with root package name */
    private static final Object f69533j = new Object();

    /* renamed from: a, reason: collision with root package name */
    private transient Object f69534a;

    /* renamed from: b, reason: collision with root package name */
    transient int[] f69535b;

    /* renamed from: c, reason: collision with root package name */
    transient Object[] f69536c;

    /* renamed from: d, reason: collision with root package name */
    transient Object[] f69537d;

    /* renamed from: e, reason: collision with root package name */
    private transient int f69538e;

    /* renamed from: f, reason: collision with root package name */
    private transient int f69539f;

    /* renamed from: g, reason: collision with root package name */
    private transient Set f69540g;

    /* renamed from: h, reason: collision with root package name */
    private transient Set f69541h;

    /* renamed from: i, reason: collision with root package name */
    private transient Collection f69542i;

    /* JADX INFO: Access modifiers changed from: private */
    public final int H() {
        return (1 << (this.f69538e & 31)) - 1;
    }

    final void A(int i10) {
        this.f69538e = Ii0.c(i10, 1, 1073741823);
    }

    final boolean D() {
        return this.f69534a == null;
    }

    final int j(int i10) {
        int i11 = i10 + 1;
        if (i11 < this.f69539f) {
            return i11;
        }
        return -1;
    }

    final void y() {
        this.f69538e += 32;
    }

    private final int J(int i10, int i11, int i12, int i13) {
        int i14 = i11 - 1;
        Object objD = C7123Ng0.d(i11);
        if (i13 != 0) {
            C7123Ng0.e(objD, i12 & i14, i13 + 1);
        }
        Object obj = this.f69534a;
        Objects.requireNonNull(obj);
        int[] iArrA = a();
        for (int i15 = 0; i15 <= i10; i15++) {
            int iC = C7123Ng0.c(obj, i15);
            while (iC != 0) {
                int i16 = iC - 1;
                int i17 = iArrA[i16];
                int i18 = ((~i10) & i17) | i15;
                int i19 = i18 & i14;
                int iC2 = C7123Ng0.c(objD, i19);
                C7123Ng0.e(objD, i19, iC);
                iArrA[i16] = ((~i14) & i18) | (iC2 & i14);
                iC = i17 & i10;
            }
        }
        this.f69534a = objD;
        L(i14);
        return i14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int[] a() {
        int[] iArr = this.f69535b;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object[] b() {
        Object[] objArr = this.f69536c;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object[] c() {
        Object[] objArr = this.f69537d;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    static /* synthetic */ Object q(C7089Mg0 c7089Mg0) {
        Object obj = c7089Mg0.f69534a;
        Objects.requireNonNull(obj);
        return obj;
    }

    final void B(int i10, int i11) {
        Object obj = this.f69534a;
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
        int iB = C7427Wg0.b(obj2) & i11;
        int iC = C7123Ng0.c(obj, iB);
        if (iC == size) {
            C7123Ng0.e(obj, iB, i13);
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

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.f69541h;
        if (set != null) {
            return set;
        }
        C6886Gg0 c6886Gg0 = new C6886Gg0(this);
        this.f69541h = c6886Gg0;
        return c6886Gg0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        Set set = this.f69540g;
        if (set != null) {
            return set;
        }
        C6954Ig0 c6954Ig0 = new C6954Ig0(this);
        this.f69540g = c6954Ig0;
        return c6954Ig0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int i10;
        if (D()) {
            C6782Df0.m(D(), "Arrays already allocated");
            int i11 = this.f69538e;
            int iMax = Math.max(i11 + 1, 2);
            int iHighestOneBit = Integer.highestOneBit(iMax);
            if (iMax > iHighestOneBit && (iHighestOneBit = iHighestOneBit + iHighestOneBit) <= 0) {
                iHighestOneBit = 1073741824;
            }
            int iMax2 = Math.max(4, iHighestOneBit);
            this.f69534a = C7123Ng0.d(iMax2);
            L(iMax2 - 1);
            this.f69535b = new int[i11];
            this.f69536c = new Object[i11];
            this.f69537d = new Object[i11];
        }
        Map mapT = t();
        if (mapT != null) {
            return mapT.put(obj, obj2);
        }
        int[] iArrA = a();
        Object[] objArrB = b();
        Object[] objArrC = c();
        int i12 = this.f69539f;
        int i13 = i12 + 1;
        int iB = C7427Wg0.b(obj);
        int iH = H();
        int i14 = iB & iH;
        Object obj3 = this.f69534a;
        Objects.requireNonNull(obj3);
        int iC = C7123Ng0.c(obj3, i14);
        if (iC == 0) {
            if (i13 > iH) {
                iH = J(iH, C7123Ng0.a(iH), iB, i12);
            } else {
                Object obj4 = this.f69534a;
                Objects.requireNonNull(obj4);
                C7123Ng0.e(obj4, i14, i13);
            }
            i10 = 1;
        } else {
            int i15 = ~iH;
            int i16 = iB & i15;
            int i17 = 0;
            while (true) {
                int i18 = iC - 1;
                int i19 = iArrA[i18];
                i10 = 1;
                int i20 = i19 & i15;
                if (i20 == i16 && C6680Af0.a(obj, objArrB[i18])) {
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
                        this.f69534a = linkedHashMap;
                        this.f69535b = null;
                        this.f69536c = null;
                        this.f69537d = null;
                        y();
                        return linkedHashMap.put(obj, obj2);
                    }
                    if (i13 > iH) {
                        iH = J(iH, C7123Ng0.a(iH), iB, i12);
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
                this.f69535b = Arrays.copyOf(a(), iMin);
                this.f69536c = Arrays.copyOf(b(), iMin);
                this.f69537d = Arrays.copyOf(c(), iMin);
            }
        }
        a()[i12] = (~iH) & iB;
        b()[i12] = obj;
        c()[i12] = obj2;
        this.f69539f = i13;
        y();
        return null;
    }

    final Map t() {
        Object obj = this.f69534a;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.f69542i;
        if (collection != null) {
            return collection;
        }
        C7022Kg0 c7022Kg0 = new C7022Kg0(this);
        this.f69542i = c7022Kg0;
        return c7022Kg0;
    }

    C7089Mg0(int i10) {
        A(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int I(Object obj) {
        if (D()) {
            return -1;
        }
        int iB = C7427Wg0.b(obj);
        int iH = H();
        Object obj2 = this.f69534a;
        Objects.requireNonNull(obj2);
        int iC = C7123Ng0.c(obj2, iB & iH);
        if (iC != 0) {
            int i10 = ~iH;
            int i11 = iB & i10;
            do {
                int i12 = iC - 1;
                int i13 = a()[i12];
                if ((i13 & i10) == i11 && C6680Af0.a(obj, b()[i12])) {
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
            Object obj2 = this.f69534a;
            Objects.requireNonNull(obj2);
            int iB = C7123Ng0.b(obj, null, iH, obj2, a(), b(), null);
            if (iB != -1) {
                Object obj3 = c()[iB];
                B(iB, iH);
                this.f69539f--;
                y();
                return obj3;
            }
        }
        return f69533j;
    }

    private final void L(int i10) {
        this.f69538e = ((32 - Integer.numberOfLeadingZeros(i10)) & 31) | (this.f69538e & (-32));
    }

    static /* synthetic */ Object k(C7089Mg0 c7089Mg0, int i10) {
        return c7089Mg0.b()[i10];
    }

    static /* synthetic */ Object r(C7089Mg0 c7089Mg0, int i10) {
        return c7089Mg0.c()[i10];
    }

    static /* synthetic */ void x(C7089Mg0 c7089Mg0, int i10, Object obj) {
        c7089Mg0.c()[i10] = obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (D()) {
            return;
        }
        y();
        Map mapT = t();
        if (mapT != null) {
            this.f69538e = Ii0.c(size(), 3, 1073741823);
            mapT.clear();
            this.f69534a = null;
            this.f69539f = 0;
            return;
        }
        Arrays.fill(b(), 0, this.f69539f, (Object) null);
        Arrays.fill(c(), 0, this.f69539f, (Object) null);
        Object obj = this.f69534a;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(a(), 0, this.f69539f, 0);
        this.f69539f = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map mapT = t();
        if (mapT != null) {
            return mapT.containsKey(obj);
        }
        if (I(obj) == -1) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map mapT = t();
        if (mapT == null) {
            for (int i10 = 0; i10 < this.f69539f; i10++) {
                if (C6680Af0.a(obj, c()[i10])) {
                    return true;
                }
            }
            return false;
        }
        return mapT.containsValue(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map mapT = t();
        if (mapT != null) {
            return mapT.get(obj);
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
        Map mapT = t();
        if (mapT != null) {
            return mapT.remove(obj);
        }
        Object objK = K(obj);
        if (objK == f69533j) {
            return null;
        }
        return objK;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map mapT = t();
        if (mapT != null) {
            return mapT.size();
        }
        return this.f69539f;
    }
}
