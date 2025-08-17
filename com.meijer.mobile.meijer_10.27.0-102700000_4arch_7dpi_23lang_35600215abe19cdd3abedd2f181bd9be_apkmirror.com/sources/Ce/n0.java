package Ce;

import Ce.M;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes6.dex */
final class n0<K, V> extends M<K, V> {

    /* renamed from: h, reason: collision with root package name */
    static final M<Object, Object> f4084h = new n0(null, new Object[0], 0);

    /* renamed from: e, reason: collision with root package name */
    private final transient Object f4085e;

    /* renamed from: f, reason: collision with root package name */
    final transient Object[] f4086f;

    /* renamed from: g, reason: collision with root package name */
    private final transient int f4087g;

    static class a<K, V> extends O<Map.Entry<K, V>> {

        /* renamed from: c, reason: collision with root package name */
        private final transient M<K, V> f4088c;

        /* renamed from: d, reason: collision with root package name */
        private final transient Object[] f4089d;

        /* renamed from: e, reason: collision with root package name */
        private final transient int f4090e;

        /* renamed from: f, reason: collision with root package name */
        private final transient int f4091f;

        /* renamed from: Ce.n0$a$a, reason: collision with other inner class name */
        class C0072a extends L<Map.Entry<K, V>> {
            @Override // Ce.J
            public boolean l() {
                return true;
            }

            C0072a() {
            }

            @Override // java.util.List
            /* renamed from: L, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, V> get(int i10) {
                Be.p.o(i10, a.this.f4091f);
                int i11 = i10 * 2;
                Object obj = a.this.f4089d[a.this.f4090e + i11];
                Objects.requireNonNull(obj);
                Object obj2 = a.this.f4089d[i11 + (a.this.f4090e ^ 1)];
                Objects.requireNonNull(obj2);
                return new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return a.this.f4091f;
            }
        }

        @Override // Ce.J
        boolean l() {
            return true;
        }

        @Override // Ce.J, java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Object value = entry.getValue();
                if (value != null && value.equals(this.f4088c.get(key))) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f4091f;
        }

        @Override // Ce.O
        L<Map.Entry<K, V>> u() {
            return new C0072a();
        }

        a(M<K, V> m10, Object[] objArr, int i10, int i11) {
            this.f4088c = m10;
            this.f4089d = objArr;
            this.f4090e = i10;
            this.f4091f = i11;
        }

        @Override // Ce.J
        int e(Object[] objArr, int i10) {
            return a().e(objArr, i10);
        }

        @Override // Ce.O, Ce.J, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        /* renamed from: m */
        public y0<Map.Entry<K, V>> iterator() {
            return a().iterator();
        }
    }

    static final class b<K> extends O<K> {

        /* renamed from: c, reason: collision with root package name */
        private final transient M<K, ?> f4093c;

        /* renamed from: d, reason: collision with root package name */
        private final transient L<K> f4094d;

        @Override // Ce.J
        boolean l() {
            return true;
        }

        @Override // Ce.O, Ce.J
        public L<K> a() {
            return this.f4094d;
        }

        @Override // Ce.J, java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return this.f4093c.get(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f4093c.size();
        }

        b(M<K, ?> m10, L<K> l10) {
            this.f4093c = m10;
            this.f4094d = l10;
        }

        @Override // Ce.J
        int e(Object[] objArr, int i10) {
            return a().e(objArr, i10);
        }

        @Override // Ce.O, Ce.J, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        /* renamed from: m */
        public y0<K> iterator() {
            return a().iterator();
        }
    }

    static final class c extends L<Object> {

        /* renamed from: c, reason: collision with root package name */
        private final transient Object[] f4095c;

        /* renamed from: d, reason: collision with root package name */
        private final transient int f4096d;

        /* renamed from: e, reason: collision with root package name */
        private final transient int f4097e;

        @Override // Ce.J
        boolean l() {
            return true;
        }

        @Override // java.util.List
        public Object get(int i10) {
            Be.p.o(i10, this.f4097e);
            Object obj = this.f4095c[(i10 * 2) + this.f4096d];
            Objects.requireNonNull(obj);
            return obj;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f4097e;
        }

        c(Object[] objArr, int i10, int i11) {
            this.f4095c = objArr;
            this.f4096d = i10;
            this.f4097e = i11;
        }
    }

    static <K, V> n0<K, V> A(int i10, Object[] objArr) {
        return B(i10, objArr, null);
    }

    static Object D(Object obj, Object[] objArr, int i10, int i11, Object obj2) {
        if (obj2 == null) {
            return null;
        }
        if (i10 == 1) {
            Object obj3 = objArr[i11];
            Objects.requireNonNull(obj3);
            if (!obj3.equals(obj2)) {
                return null;
            }
            Object obj4 = objArr[i11 ^ 1];
            Objects.requireNonNull(obj4);
            return obj4;
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length - 1;
            int iB = I.b(obj2.hashCode());
            while (true) {
                int i12 = iB & length;
                int i13 = bArr[i12] & 255;
                if (i13 == 255) {
                    return null;
                }
                if (obj2.equals(objArr[i13])) {
                    return objArr[i13 ^ 1];
                }
                iB = i12 + 1;
            }
        } else if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            int length2 = sArr.length - 1;
            int iB2 = I.b(obj2.hashCode());
            while (true) {
                int i14 = iB2 & length2;
                int i15 = sArr[i14] & 65535;
                if (i15 == 65535) {
                    return null;
                }
                if (obj2.equals(objArr[i15])) {
                    return objArr[i15 ^ 1];
                }
                iB2 = i14 + 1;
            }
        } else {
            int[] iArr = (int[]) obj;
            int length3 = iArr.length - 1;
            int iB3 = I.b(obj2.hashCode());
            while (true) {
                int i16 = iB3 & length3;
                int i17 = iArr[i16];
                if (i17 == -1) {
                    return null;
                }
                if (obj2.equals(objArr[i17])) {
                    return objArr[i17 ^ 1];
                }
                iB3 = i16 + 1;
            }
        }
    }

    @Override // Ce.M
    boolean j() {
        return false;
    }

    static <K, V> n0<K, V> B(int i10, Object[] objArr, M.a<K, V> aVar) {
        if (i10 == 0) {
            return (n0) f4084h;
        }
        if (i10 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            Object obj2 = objArr[1];
            Objects.requireNonNull(obj2);
            C3030w.a(obj, obj2);
            return new n0<>(null, objArr, 1);
        }
        Be.p.t(i10, objArr.length >> 1);
        Object objC = C(objArr, i10, O.q(i10), 0);
        if (objC instanceof Object[]) {
            Object[] objArr2 = (Object[]) objC;
            M.a.C0068a c0068a = (M.a.C0068a) objArr2[2];
            if (aVar == null) {
                throw c0068a.a();
            }
            aVar.f3901e = c0068a;
            Object obj3 = objArr2[0];
            int iIntValue = ((Integer) objArr2[1]).intValue();
            objArr = Arrays.copyOf(objArr, iIntValue * 2);
            objC = obj3;
            i10 = iIntValue;
        }
        return new n0<>(objC, objArr, i10);
    }

    private static Object C(Object[] objArr, int i10, int i11, int i12) {
        int i13;
        M.a.C0068a c0068a = null;
        int i14 = 1;
        if (i10 == 1) {
            Object obj = objArr[i12];
            Objects.requireNonNull(obj);
            Object obj2 = objArr[i12 ^ 1];
            Objects.requireNonNull(obj2);
            C3030w.a(obj, obj2);
            return null;
        }
        int i15 = i11 - 1;
        if (i11 <= 128) {
            byte[] bArr = new byte[i11];
            Arrays.fill(bArr, (byte) -1);
            int i16 = 0;
            for (int i17 = 0; i17 < i10; i17++) {
                int i18 = (i17 * 2) + i12;
                int i19 = (i16 * 2) + i12;
                Object obj3 = objArr[i18];
                Objects.requireNonNull(obj3);
                Object obj4 = objArr[i18 ^ 1];
                Objects.requireNonNull(obj4);
                C3030w.a(obj3, obj4);
                int iB = I.b(obj3.hashCode());
                while (true) {
                    int i20 = iB & i15;
                    int i21 = bArr[i20] & 255;
                    if (i21 == 255) {
                        bArr[i20] = (byte) i19;
                        if (i16 < i17) {
                            objArr[i19] = obj3;
                            objArr[i19 ^ 1] = obj4;
                        }
                        i16++;
                    } else {
                        if (obj3.equals(objArr[i21])) {
                            int i22 = i21 ^ 1;
                            Object obj5 = objArr[i22];
                            Objects.requireNonNull(obj5);
                            c0068a = new M.a.C0068a(obj3, obj4, obj5);
                            objArr[i22] = obj4;
                            break;
                        }
                        iB = i20 + 1;
                    }
                }
            }
            return i16 == i10 ? bArr : new Object[]{bArr, Integer.valueOf(i16), c0068a};
        }
        if (i11 <= 32768) {
            short[] sArr = new short[i11];
            Arrays.fill(sArr, (short) -1);
            int i23 = 0;
            for (int i24 = 0; i24 < i10; i24++) {
                int i25 = (i24 * 2) + i12;
                int i26 = (i23 * 2) + i12;
                Object obj6 = objArr[i25];
                Objects.requireNonNull(obj6);
                Object obj7 = objArr[i25 ^ 1];
                Objects.requireNonNull(obj7);
                C3030w.a(obj6, obj7);
                int iB2 = I.b(obj6.hashCode());
                while (true) {
                    int i27 = iB2 & i15;
                    int i28 = sArr[i27] & 65535;
                    if (i28 == 65535) {
                        sArr[i27] = (short) i26;
                        if (i23 < i24) {
                            objArr[i26] = obj6;
                            objArr[i26 ^ 1] = obj7;
                        }
                        i23++;
                    } else {
                        if (obj6.equals(objArr[i28])) {
                            int i29 = i28 ^ 1;
                            Object obj8 = objArr[i29];
                            Objects.requireNonNull(obj8);
                            c0068a = new M.a.C0068a(obj6, obj7, obj8);
                            objArr[i29] = obj7;
                            break;
                        }
                        iB2 = i27 + 1;
                    }
                }
            }
            return i23 == i10 ? sArr : new Object[]{sArr, Integer.valueOf(i23), c0068a};
        }
        int[] iArr = new int[i11];
        Arrays.fill(iArr, -1);
        int i30 = 0;
        int i31 = 0;
        while (i30 < i10) {
            int i32 = (i30 * 2) + i12;
            int i33 = (i31 * 2) + i12;
            Object obj9 = objArr[i32];
            Objects.requireNonNull(obj9);
            Object obj10 = objArr[i32 ^ i14];
            Objects.requireNonNull(obj10);
            C3030w.a(obj9, obj10);
            int iB3 = I.b(obj9.hashCode());
            while (true) {
                int i34 = iB3 & i15;
                int i35 = iArr[i34];
                if (i35 == -1) {
                    iArr[i34] = i33;
                    if (i31 < i30) {
                        objArr[i33] = obj9;
                        objArr[i33 ^ 1] = obj10;
                    }
                    i31++;
                    i13 = i14;
                } else {
                    i13 = i14;
                    if (obj9.equals(objArr[i35])) {
                        int i36 = i35 ^ 1;
                        Object obj11 = objArr[i36];
                        Objects.requireNonNull(obj11);
                        c0068a = new M.a.C0068a(obj9, obj10, obj11);
                        objArr[i36] = obj10;
                        break;
                    }
                    iB3 = i34 + 1;
                    i14 = i13;
                }
            }
            i30++;
            i14 = i13;
        }
        int i37 = i14;
        if (i31 == i10) {
            return iArr;
        }
        Object[] objArr2 = new Object[3];
        objArr2[0] = iArr;
        objArr2[i37] = Integer.valueOf(i31);
        objArr2[2] = c0068a;
        return objArr2;
    }

    @Override // Ce.M
    O<Map.Entry<K, V>> f() {
        return new a(this, this.f4086f, 0, this.f4087g);
    }

    @Override // Ce.M
    O<K> g() {
        return new b(this, new c(this.f4086f, 0, this.f4087g));
    }

    @Override // Ce.M, java.util.Map
    public V get(Object obj) {
        V v10 = (V) D(this.f4085e, this.f4086f, this.f4087g, 0, obj);
        if (v10 == null) {
            return null;
        }
        return v10;
    }

    @Override // Ce.M
    J<V> h() {
        return new c(this.f4086f, 1, this.f4087g);
    }

    @Override // java.util.Map
    public int size() {
        return this.f4087g;
    }

    private n0(Object obj, Object[] objArr, int i10) {
        this.f4085e = obj;
        this.f4086f = objArr;
        this.f4087g = i10;
    }
}
