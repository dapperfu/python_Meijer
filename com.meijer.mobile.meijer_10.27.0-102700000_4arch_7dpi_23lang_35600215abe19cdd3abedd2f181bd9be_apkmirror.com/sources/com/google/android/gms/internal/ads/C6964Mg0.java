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
final class C6964Mg0 extends AbstractMap implements Serializable {

    /* renamed from: j, reason: collision with root package name */
    private static final Object f68693j = new Object();

    /* renamed from: a, reason: collision with root package name */
    private transient Object f68694a;

    /* renamed from: b, reason: collision with root package name */
    transient int[] f68695b;

    /* renamed from: c, reason: collision with root package name */
    transient Object[] f68696c;

    /* renamed from: d, reason: collision with root package name */
    transient Object[] f68697d;

    /* renamed from: e, reason: collision with root package name */
    private transient int f68698e;

    /* renamed from: f, reason: collision with root package name */
    private transient int f68699f;

    /* renamed from: g, reason: collision with root package name */
    private transient Set f68700g;

    /* renamed from: h, reason: collision with root package name */
    private transient Set f68701h;

    /* renamed from: i, reason: collision with root package name */
    private transient Collection f68702i;

    /* JADX INFO: Access modifiers changed from: private */
    public final int H() {
        return (1 << (this.f68698e & 31)) - 1;
    }

    final void A() {
        this.f68698e += 32;
    }

    final void B(int i10) {
        this.f68698e = Ii0.c(i10, 1, 1073741823);
    }

    final boolean D() {
        return this.f68694a == null;
    }

    final int j(int i10) {
        int i11 = i10 + 1;
        if (i11 < this.f68699f) {
            return i11;
        }
        return -1;
    }

    private final int J(int i10, int i11, int i12, int i13) {
        int i14 = i11 - 1;
        Object objD = C6998Ng0.d(i11);
        if (i13 != 0) {
            C6998Ng0.e(objD, i12 & i14, i13 + 1);
        }
        Object obj = this.f68694a;
        Objects.requireNonNull(obj);
        int[] iArrA = a();
        for (int i15 = 0; i15 <= i10; i15++) {
            int iC = C6998Ng0.c(obj, i15);
            while (iC != 0) {
                int i16 = iC - 1;
                int i17 = iArrA[i16];
                int i18 = ((~i10) & i17) | i15;
                int i19 = i18 & i14;
                int iC2 = C6998Ng0.c(objD, i19);
                C6998Ng0.e(objD, i19, iC);
                iArrA[i16] = ((~i14) & i18) | (iC2 & i14);
                iC = i17 & i10;
            }
        }
        this.f68694a = objD;
        L(i14);
        return i14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int[] a() {
        int[] iArr = this.f68695b;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object[] b() {
        Object[] objArr = this.f68696c;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object[] c() {
        Object[] objArr = this.f68697d;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    static /* synthetic */ Object q(C6964Mg0 c6964Mg0) {
        Object obj = c6964Mg0.f68694a;
        Objects.requireNonNull(obj);
        return obj;
    }

    final void C(int i10, int i11) {
        Object obj = this.f68694a;
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
        int iB = C7302Wg0.b(obj2) & i11;
        int iC = C6998Ng0.c(obj, iB);
        if (iC == size) {
            C6998Ng0.e(obj, iB, i13);
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
        Set set = this.f68701h;
        if (set != null) {
            return set;
        }
        C6761Gg0 c6761Gg0 = new C6761Gg0(this);
        this.f68701h = c6761Gg0;
        return c6761Gg0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        Set set = this.f68700g;
        if (set != null) {
            return set;
        }
        C6829Ig0 c6829Ig0 = new C6829Ig0(this);
        this.f68700g = c6829Ig0;
        return c6829Ig0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int i10;
        if (D()) {
            C6657Df0.m(D(), "Arrays already allocated");
            int i11 = this.f68698e;
            int iMax = Math.max(i11 + 1, 2);
            int iHighestOneBit = Integer.highestOneBit(iMax);
            if (iMax > iHighestOneBit && (iHighestOneBit = iHighestOneBit + iHighestOneBit) <= 0) {
                iHighestOneBit = 1073741824;
            }
            int iMax2 = Math.max(4, iHighestOneBit);
            this.f68694a = C6998Ng0.d(iMax2);
            L(iMax2 - 1);
            this.f68695b = new int[i11];
            this.f68696c = new Object[i11];
            this.f68697d = new Object[i11];
        }
        Map mapV = v();
        if (mapV != null) {
            return mapV.put(obj, obj2);
        }
        int[] iArrA = a();
        Object[] objArrB = b();
        Object[] objArrC = c();
        int i12 = this.f68699f;
        int i13 = i12 + 1;
        int iB = C7302Wg0.b(obj);
        int iH = H();
        int i14 = iB & iH;
        Object obj3 = this.f68694a;
        Objects.requireNonNull(obj3);
        int iC = C6998Ng0.c(obj3, i14);
        if (iC == 0) {
            if (i13 > iH) {
                iH = J(iH, C6998Ng0.a(iH), iB, i12);
            } else {
                Object obj4 = this.f68694a;
                Objects.requireNonNull(obj4);
                C6998Ng0.e(obj4, i14, i13);
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
                if (i20 == i16 && C6555Af0.a(obj, objArrB[i18])) {
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
                        this.f68694a = linkedHashMap;
                        this.f68695b = null;
                        this.f68696c = null;
                        this.f68697d = null;
                        A();
                        return linkedHashMap.put(obj, obj2);
                    }
                    if (i13 > iH) {
                        iH = J(iH, C6998Ng0.a(iH), iB, i12);
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
                this.f68695b = Arrays.copyOf(a(), iMin);
                this.f68696c = Arrays.copyOf(b(), iMin);
                this.f68697d = Arrays.copyOf(c(), iMin);
            }
        }
        a()[i12] = (~iH) & iB;
        b()[i12] = obj;
        c()[i12] = obj2;
        this.f68699f = i13;
        A();
        return null;
    }

    final Map v() {
        Object obj = this.f68694a;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.f68702i;
        if (collection != null) {
            return collection;
        }
        C6897Kg0 c6897Kg0 = new C6897Kg0(this);
        this.f68702i = c6897Kg0;
        return c6897Kg0;
    }

    C6964Mg0(int i10) {
        B(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int I(Object obj) {
        if (D()) {
            return -1;
        }
        int iB = C7302Wg0.b(obj);
        int iH = H();
        Object obj2 = this.f68694a;
        Objects.requireNonNull(obj2);
        int iC = C6998Ng0.c(obj2, iB & iH);
        if (iC != 0) {
            int i10 = ~iH;
            int i11 = iB & i10;
            do {
                int i12 = iC - 1;
                int i13 = a()[i12];
                if ((i13 & i10) == i11 && C6555Af0.a(obj, b()[i12])) {
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
            Object obj2 = this.f68694a;
            Objects.requireNonNull(obj2);
            int iB = C6998Ng0.b(obj, null, iH, obj2, a(), b(), null);
            if (iB != -1) {
                Object obj3 = c()[iB];
                C(iB, iH);
                this.f68699f--;
                A();
                return obj3;
            }
        }
        return f68693j;
    }

    private final void L(int i10) {
        this.f68698e = ((32 - Integer.numberOfLeadingZeros(i10)) & 31) | (this.f68698e & (-32));
    }

    static /* synthetic */ Object k(C6964Mg0 c6964Mg0, int i10) {
        return c6964Mg0.b()[i10];
    }

    static /* synthetic */ Object r(C6964Mg0 c6964Mg0, int i10) {
        return c6964Mg0.c()[i10];
    }

    static /* synthetic */ void y(C6964Mg0 c6964Mg0, int i10, Object obj) {
        c6964Mg0.c()[i10] = obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (D()) {
            return;
        }
        A();
        Map mapV = v();
        if (mapV != null) {
            this.f68698e = Ii0.c(size(), 3, 1073741823);
            mapV.clear();
            this.f68694a = null;
            this.f68699f = 0;
            return;
        }
        Arrays.fill(b(), 0, this.f68699f, (Object) null);
        Arrays.fill(c(), 0, this.f68699f, (Object) null);
        Object obj = this.f68694a;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(a(), 0, this.f68699f, 0);
        this.f68699f = 0;
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
            for (int i10 = 0; i10 < this.f68699f; i10++) {
                if (C6555Af0.a(obj, c()[i10])) {
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
        if (objK == f68693j) {
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
        return this.f68699f;
    }
}
