package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.I0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
final class G0<T extends I0<T>> {

    /* renamed from: d, reason: collision with root package name */
    private static final G0 f85139d = new G0(true);

    /* renamed from: a, reason: collision with root package name */
    final S1<T, Object> f85140a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f85141b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f85142c;

    private G0() {
        this.f85140a = S1.b(16);
    }

    public final void f(G0<T> g02) {
        for (int i10 = 0; i10 < g02.f85140a.k(); i10++) {
            k(g02.f85140a.i(i10));
        }
        Iterator it = g02.f85140a.r().iterator();
        while (it.hasNext()) {
            k((Map.Entry) it.next());
        }
    }

    public final boolean r() {
        for (int i10 = 0; i10 < this.f85140a.k(); i10++) {
            if (!h(this.f85140a.i(i10))) {
                return false;
            }
        }
        Iterator it = this.f85140a.r().iterator();
        while (it.hasNext()) {
            if (!h((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final int s() {
        int iM = 0;
        for (int i10 = 0; i10 < this.f85140a.k(); i10++) {
            iM += m(this.f85140a.i(i10));
        }
        Iterator it = this.f85140a.r().iterator();
        while (it.hasNext()) {
            iM += m((Map.Entry) it.next());
        }
        return iM;
    }

    private static int b(w2 w2Var, Object obj) {
        switch (F0.f85135b[w2Var.ordinal()]) {
            case 1:
                return zzii.z(((Double) obj).doubleValue());
            case 2:
                return zzii.A(((Float) obj).floatValue());
            case 3:
                return zzii.d0(((Long) obj).longValue());
            case 4:
                return zzii.i0(((Long) obj).longValue());
            case 5:
                return zzii.k0(((Integer) obj).intValue());
            case 6:
                return zzii.r0(((Long) obj).longValue());
            case 7:
                return zzii.w0(((Integer) obj).intValue());
            case 8:
                return zzii.L(((Boolean) obj).booleanValue());
            case 9:
                return zzii.V((InterfaceC11208w1) obj);
            case 10:
                return obj instanceof C11134a1 ? zzii.d((C11134a1) obj) : zzii.J((InterfaceC11208w1) obj);
            case 11:
                return obj instanceof AbstractC11161h0 ? zzii.I((AbstractC11161h0) obj) : zzii.K((String) obj);
            case 12:
                return obj instanceof AbstractC11161h0 ? zzii.I((AbstractC11161h0) obj) : zzii.M((byte[]) obj);
            case 13:
                return zzii.o0(((Integer) obj).intValue());
            case 14:
                return zzii.z0(((Integer) obj).intValue());
            case 15:
                return zzii.v0(((Long) obj).longValue());
            case 16:
                return zzii.s0(((Integer) obj).intValue());
            case 17:
                return zzii.n0(((Long) obj).longValue());
            case 18:
                return obj instanceof R0 ? zzii.B0(((R0) obj).zza()) : zzii.B0(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static <T extends I0<T>> G0<T> c() {
        return f85139d;
    }

    private static Object e(Object obj) {
        if (obj instanceof E1) {
            return ((E1) obj).zza();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        G0 g02 = new G0();
        for (int i10 = 0; i10 < this.f85140a.k(); i10++) {
            Map.Entry<K, Object> entryI = this.f85140a.i(i10);
            g02.g((I0) entryI.getKey(), entryI.getValue());
        }
        Iterator it = this.f85140a.r().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            g02.g((I0) entry.getKey(), entry.getValue());
        }
        g02.f85142c = this.f85142c;
        return g02;
    }

    public final Object d(T t10) {
        Object obj = this.f85140a.get(t10);
        return obj instanceof C11134a1 ? C11134a1.e() : obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof G0) {
            return this.f85140a.equals(((G0) obj).f85140a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f85140a.hashCode();
    }

    public final void i() {
        if (this.f85141b) {
            return;
        }
        this.f85140a.f();
        this.f85141b = true;
    }

    public final boolean n() {
        return this.f85141b;
    }

    public final Iterator<Map.Entry<T, Object>> o() {
        return this.f85142c ? new C11138b1(this.f85140a.entrySet().iterator()) : this.f85140a.entrySet().iterator();
    }

    final Iterator<Map.Entry<T, Object>> q() {
        return this.f85142c ? new C11138b1(this.f85140a.t().iterator()) : this.f85140a.t().iterator();
    }

    private G0(boolean z10) {
        this(S1.b(0));
        i();
    }

    static int a(w2 w2Var, int i10, Object obj) {
        int iG0 = zzii.g0(i10);
        if (w2Var == w2.f85508l) {
            S0.g((InterfaceC11208w1) obj);
            iG0 <<= 1;
        }
        return iG0 + b(w2Var, obj);
    }

    private static <T extends I0<T>> boolean h(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.zzc() == z2.MESSAGE) {
            if (key.zzd()) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (!((InterfaceC11208w1) it.next()).zzk()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (value instanceof InterfaceC11208w1) {
                    if (!((InterfaceC11208w1) value).zzk()) {
                        return false;
                    }
                } else {
                    if (value instanceof C11134a1) {
                        return true;
                    }
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
            }
        }
        return true;
    }

    private final void k(Map.Entry<T, Object> entry) {
        InterfaceC11208w1 interfaceC11208w1Zzf;
        T key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof C11134a1) {
            value = C11134a1.e();
        }
        if (key.zzd()) {
            Object objD = d(key);
            if (objD == null) {
                objD = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) objD).add(e(it.next()));
            }
            this.f85140a.put(key, objD);
            return;
        }
        if (key.zzc() == z2.MESSAGE) {
            Object objD2 = d(key);
            if (objD2 == null) {
                this.f85140a.put(key, e(value));
                return;
            }
            if (objD2 instanceof E1) {
                interfaceC11208w1Zzf = key.n((E1) objD2, (E1) value);
            } else {
                interfaceC11208w1Zzf = key.A(((InterfaceC11208w1) objD2).zzp(), (InterfaceC11208w1) value).zzf();
            }
            this.f85140a.put(key, interfaceC11208w1Zzf);
            return;
        }
        this.f85140a.put(key, e(value));
    }

    public static int l(I0<?> i02, Object obj) {
        w2 w2VarZzb = i02.zzb();
        int iZza = i02.zza();
        if (i02.zzd()) {
            int iA = 0;
            if (i02.zze()) {
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    iA += b(w2VarZzb, it.next());
                }
                return zzii.g0(iZza) + iA + zzii.D0(iA);
            }
            Iterator it2 = ((List) obj).iterator();
            while (it2.hasNext()) {
                iA += a(w2VarZzb, iZza, it2.next());
            }
            return iA;
        }
        return a(w2VarZzb, iZza, obj);
    }

    private static int m(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (key.zzc() == z2.MESSAGE && !key.zzd() && !key.zze()) {
            if (value instanceof C11134a1) {
                return zzii.D(entry.getKey().zza(), (C11134a1) value);
            }
            return zzii.E(entry.getKey().zza(), (InterfaceC11208w1) value);
        }
        return l(key, value);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void p(T r3, java.lang.Object r4) {
        /*
            com.google.android.gms.internal.vision.w2 r0 = r3.zzb()
            com.google.android.gms.internal.vision.S0.d(r4)
            int[] r1 = com.google.android.gms.internal.vision.F0.f85134a
            com.google.android.gms.internal.vision.z2 r0 = r0.a()
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            r2 = 0
            switch(r0) {
                case 1: goto L44;
                case 2: goto L41;
                case 3: goto L3e;
                case 4: goto L3b;
                case 5: goto L38;
                case 6: goto L35;
                case 7: goto L2c;
                case 8: goto L23;
                case 9: goto L1a;
                default: goto L18;
            }
        L18:
            r1 = r2
            goto L46
        L1a:
            boolean r0 = r4 instanceof com.google.android.gms.internal.vision.InterfaceC11208w1
            if (r0 != 0) goto L46
            boolean r0 = r4 instanceof com.google.android.gms.internal.vision.C11134a1
            if (r0 == 0) goto L18
            goto L46
        L23:
            boolean r0 = r4 instanceof java.lang.Integer
            if (r0 != 0) goto L46
            boolean r0 = r4 instanceof com.google.android.gms.internal.vision.R0
            if (r0 == 0) goto L18
            goto L46
        L2c:
            boolean r0 = r4 instanceof com.google.android.gms.internal.vision.AbstractC11161h0
            if (r0 != 0) goto L46
            boolean r0 = r4 instanceof byte[]
            if (r0 == 0) goto L18
            goto L46
        L35:
            boolean r1 = r4 instanceof java.lang.String
            goto L46
        L38:
            boolean r1 = r4 instanceof java.lang.Boolean
            goto L46
        L3b:
            boolean r1 = r4 instanceof java.lang.Double
            goto L46
        L3e:
            boolean r1 = r4 instanceof java.lang.Float
            goto L46
        L41:
            boolean r1 = r4 instanceof java.lang.Long
            goto L46
        L44:
            boolean r1 = r4 instanceof java.lang.Integer
        L46:
            if (r1 == 0) goto L49
            return
        L49:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            int r1 = r3.zza()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            com.google.android.gms.internal.vision.w2 r3 = r3.zzb()
            com.google.android.gms.internal.vision.z2 r3 = r3.a()
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getName()
            java.lang.Object[] r3 = new java.lang.Object[]{r1, r3, r4}
            java.lang.String r4 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r3 = java.lang.String.format(r4, r3)
            r0.<init>(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.G0.p(com.google.android.gms.internal.vision.I0, java.lang.Object):void");
    }

    public final void g(T t10, Object obj) {
        if (t10.zzd()) {
            if (obj instanceof List) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll((List) obj);
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj2 = arrayList.get(i10);
                    i10++;
                    p(t10, obj2);
                }
                obj = arrayList;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        } else {
            p(t10, obj);
        }
        if (obj instanceof C11134a1) {
            this.f85142c = true;
        }
        this.f85140a.put(t10, obj);
    }

    public final void j(T t10, Object obj) {
        List arrayList;
        if (t10.zzd()) {
            p(t10, obj);
            Object objD = d(t10);
            if (objD == null) {
                arrayList = new ArrayList();
                this.f85140a.put(t10, arrayList);
            } else {
                arrayList = (List) objD;
            }
            arrayList.add(obj);
            return;
        }
        throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
    }

    private G0(S1<T, Object> s12) {
        this.f85140a = s12;
        i();
    }
}
