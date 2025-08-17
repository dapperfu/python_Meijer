package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
final class U4 {

    /* renamed from: d, reason: collision with root package name */
    private static final U4 f82004d = new U4(true);

    /* renamed from: a, reason: collision with root package name */
    final C10388d6 f82005a = new Z5();

    /* renamed from: b, reason: collision with root package name */
    private boolean f82006b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f82007c;

    private U4() {
    }

    public static U4 a() {
        return f82004d;
    }

    private U4(boolean z10) {
        b();
        b();
    }

    static void f(K4 k42, EnumC10513r6 enumC10513r6, int i10, Object obj) throws IOException {
        if (enumC10513r6 == EnumC10513r6.f82372l) {
            K5 k52 = (K5) obj;
            C10486o5.d(k52);
            k42.i(i10, 3);
            k52.c(k42);
            k42.i(i10, 4);
            return;
        }
        k42.i(i10, enumC10513r6.b());
        EnumC10522s6 enumC10522s6 = EnumC10522s6.INT;
        switch (enumC10513r6.ordinal()) {
            case 0:
                k42.C(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                k42.A(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                k42.B(((Long) obj).longValue());
                break;
            case 3:
                k42.B(((Long) obj).longValue());
                break;
            case 4:
                k42.y(((Integer) obj).intValue());
                break;
            case 5:
                k42.C(((Long) obj).longValue());
                break;
            case 6:
                k42.A(((Integer) obj).intValue());
                break;
            case 7:
                k42.x(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof G4)) {
                    k42.E((String) obj);
                    break;
                } else {
                    k42.r((G4) obj);
                    break;
                }
            case 9:
                ((K5) obj).c(k42);
                break;
            case 10:
                k42.w((K5) obj);
                break;
            case 11:
                if (!(obj instanceof G4)) {
                    byte[] bArr = (byte[]) obj;
                    k42.s(bArr, 0, bArr.length);
                    break;
                } else {
                    k42.r((G4) obj);
                    break;
                }
            case 12:
                k42.z(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof InterfaceC10432i5)) {
                    k42.y(((Integer) obj).intValue());
                    break;
                } else {
                    k42.y(((InterfaceC10432i5) obj).zza());
                    break;
                }
            case 14:
                k42.A(((Integer) obj).intValue());
                break;
            case 15:
                k42.C(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                k42.z((iIntValue >> 31) ^ (iIntValue + iIntValue));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                k42.B((jLongValue >> 63) ^ (jLongValue + jLongValue));
                break;
        }
    }

    static int h(EnumC10513r6 enumC10513r6, int i10, Object obj) {
        int iG = K4.G(i10 << 3);
        if (enumC10513r6 == EnumC10513r6.f82372l) {
            C10486o5.d((K5) obj);
            iG += iG;
        }
        return iG + i(enumC10513r6, obj);
    }

    static int i(EnumC10513r6 enumC10513r6, Object obj) {
        int iF;
        int iG;
        EnumC10513r6 enumC10513r62 = EnumC10513r6.f82363c;
        EnumC10522s6 enumC10522s6 = EnumC10522s6.INT;
        switch (enumC10513r6.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                int i10 = K4.f81816d;
                return 8;
            case 1:
                ((Float) obj).getClass();
                int i11 = K4.f81816d;
                return 4;
            case 2:
                return K4.a(((Long) obj).longValue());
            case 3:
                return K4.a(((Long) obj).longValue());
            case 4:
                return K4.a(((Integer) obj).intValue());
            case 5:
                ((Long) obj).getClass();
                int i12 = K4.f81816d;
                return 8;
            case 6:
                ((Integer) obj).getClass();
                int i13 = K4.f81816d;
                return 4;
            case 7:
                ((Boolean) obj).getClass();
                int i14 = K4.f81816d;
                return 1;
            case 8:
                if (!(obj instanceof G4)) {
                    return K4.b((String) obj);
                }
                int i15 = K4.f81816d;
                iF = ((G4) obj).f();
                iG = K4.G(iF);
                break;
            case 9:
                return ((K5) obj).a();
            case 10:
                if (!(obj instanceof C10521s5)) {
                    return K4.c((K5) obj);
                }
                int i16 = K4.f81816d;
                iF = ((C10521s5) obj).b();
                iG = K4.G(iF);
                break;
            case 11:
                if (!(obj instanceof G4)) {
                    int i17 = K4.f81816d;
                    iF = ((byte[]) obj).length;
                    iG = K4.G(iF);
                    break;
                } else {
                    int i18 = K4.f81816d;
                    iF = ((G4) obj).f();
                    iG = K4.G(iF);
                    break;
                }
            case 12:
                return K4.G(((Integer) obj).intValue());
            case 13:
                return obj instanceof InterfaceC10432i5 ? K4.a(((InterfaceC10432i5) obj).zza()) : K4.a(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).getClass();
                int i19 = K4.f81816d;
                return 4;
            case 15:
                ((Long) obj).getClass();
                int i20 = K4.f81816d;
                return 8;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                return K4.G((iIntValue >> 31) ^ (iIntValue + iIntValue));
            case 17:
                long jLongValue = ((Long) obj).longValue();
                return K4.a((jLongValue >> 63) ^ (jLongValue + jLongValue));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        return iG + iF;
    }

    private static boolean l(Object obj) {
        if (obj instanceof L5) {
            return ((L5) obj).e();
        }
        if (obj instanceof C10521s5) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    public final void b() {
        if (this.f82006b) {
            return;
        }
        C10388d6 c10388d6 = this.f82005a;
        int iC = c10388d6.c();
        for (int i10 = 0; i10 < iC; i10++) {
            Object value = c10388d6.d(i10).getValue();
            if (value instanceof AbstractC10396e5) {
                ((AbstractC10396e5) value).o();
            }
        }
        Iterator it = c10388d6.f().iterator();
        while (it.hasNext()) {
            Object value2 = ((Map.Entry) it.next()).getValue();
            if (value2 instanceof AbstractC10396e5) {
                ((AbstractC10396e5) value2).o();
            }
        }
        c10388d6.a();
        this.f82006b = true;
    }

    public final Iterator c() {
        C10388d6 c10388d6 = this.f82005a;
        return c10388d6.isEmpty() ? Collections.emptyIterator() : this.f82007c ? new C10512r5(c10388d6.entrySet().iterator()) : c10388d6.entrySet().iterator();
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        U4 u42 = new U4();
        C10388d6 c10388d6 = this.f82005a;
        int iC = c10388d6.c();
        for (int i10 = 0; i10 < iC; i10++) {
            Map.Entry entryD = c10388d6.d(i10);
            u42.d((T4) ((C10361a6) entryD).a(), entryD.getValue());
        }
        for (Map.Entry entry : c10388d6.f()) {
            u42.d((T4) entry.getKey(), entry.getValue());
        }
        u42.f82007c = this.f82007c;
        return u42;
    }

    public final boolean e() {
        C10388d6 c10388d6 = this.f82005a;
        int iC = c10388d6.c();
        for (int i10 = 0; i10 < iC; i10++) {
            if (!k(c10388d6.d(i10))) {
                return false;
            }
        }
        Iterator it = c10388d6.f().iterator();
        while (it.hasNext()) {
            if (!k((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof U4) {
            return this.f82005a.equals(((U4) obj).f82005a);
        }
        return false;
    }

    public final int g() {
        C10388d6 c10388d6 = this.f82005a;
        int iC = c10388d6.c();
        int iM = 0;
        for (int i10 = 0; i10 < iC; i10++) {
            iM += m(c10388d6.d(i10));
        }
        Iterator it = c10388d6.f().iterator();
        while (it.hasNext()) {
            iM += m((Map.Entry) it.next());
        }
        return iM;
    }

    public final int hashCode() {
        return this.f82005a.hashCode();
    }

    public static int j(T4 t42, Object obj) {
        EnumC10513r6 enumC10513r6Zzb = t42.zzb();
        int iZza = t42.zza();
        if (t42.zzd()) {
            List list = (List) obj;
            int size = list.size();
            int i10 = 0;
            if (t42.zze()) {
                if (list.isEmpty()) {
                    return 0;
                }
                int i11 = 0;
                while (i10 < size) {
                    i11 += i(enumC10513r6Zzb, list.get(i10));
                    i10++;
                }
                return K4.G(iZza << 3) + i11 + K4.G(i11);
            }
            int iH = 0;
            while (i10 < size) {
                iH += h(enumC10513r6Zzb, iZza, list.get(i10));
                i10++;
            }
            return iH;
        }
        return h(enumC10513r6Zzb, iZza, obj);
    }

    private static boolean k(Map.Entry entry) {
        T4 t42 = (T4) entry.getKey();
        if (t42.zzc() == EnumC10522s6.MESSAGE) {
            if (t42.zzd()) {
                List list = (List) entry.getValue();
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (!l(list.get(i10))) {
                        return false;
                    }
                }
                return true;
            }
            return l(entry.getValue());
        }
        return true;
    }

    private static final int m(Map.Entry entry) {
        int i10;
        int iG;
        int iG2;
        T4 t42 = (T4) entry.getKey();
        Object value = entry.getValue();
        if (t42.zzc() == EnumC10522s6.MESSAGE && !t42.zzd() && !t42.zze()) {
            if (value instanceof C10521s5) {
                int iZza = ((T4) entry.getKey()).zza();
                int iG3 = K4.G(8);
                i10 = iG3 + iG3;
                iG = K4.G(16) + K4.G(iZza);
                int iG4 = K4.G(24);
                int iB = ((C10521s5) value).b();
                iG2 = iG4 + K4.G(iB) + iB;
            } else {
                int iZza2 = ((T4) entry.getKey()).zza();
                int iG5 = K4.G(8);
                i10 = iG5 + iG5;
                iG = K4.G(16) + K4.G(iZza2);
                iG2 = K4.G(24) + K4.c((K5) value);
            }
            return i10 + iG + iG2;
        }
        return j(t42, value);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0047 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void n(com.google.android.gms.internal.measurement.T4 r2, java.lang.Object r3) {
        /*
            com.google.android.gms.internal.measurement.r6 r0 = r2.zzb()
            byte[] r1 = com.google.android.gms.internal.measurement.C10486o5.f82316b
            r3.getClass()
            com.google.android.gms.internal.measurement.r6 r1 = com.google.android.gms.internal.measurement.EnumC10513r6.f82363c
            com.google.android.gms.internal.measurement.s6 r1 = com.google.android.gms.internal.measurement.EnumC10522s6.INT
            com.google.android.gms.internal.measurement.s6 r0 = r0.a()
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L43;
                case 1: goto L40;
                case 2: goto L3d;
                case 3: goto L3a;
                case 4: goto L37;
                case 5: goto L34;
                case 6: goto L2b;
                case 7: goto L22;
                case 8: goto L19;
                default: goto L18;
            }
        L18:
            goto L48
        L19:
            boolean r0 = r3 instanceof com.google.android.gms.internal.measurement.K5
            if (r0 != 0) goto L21
            boolean r0 = r3 instanceof com.google.android.gms.internal.measurement.C10521s5
            if (r0 == 0) goto L48
        L21:
            return
        L22:
            boolean r0 = r3 instanceof java.lang.Integer
            if (r0 != 0) goto L2a
            boolean r0 = r3 instanceof com.google.android.gms.internal.measurement.InterfaceC10432i5
            if (r0 == 0) goto L48
        L2a:
            return
        L2b:
            boolean r0 = r3 instanceof com.google.android.gms.internal.measurement.G4
            if (r0 != 0) goto L33
            boolean r0 = r3 instanceof byte[]
            if (r0 == 0) goto L48
        L33:
            return
        L34:
            boolean r0 = r3 instanceof java.lang.String
            goto L45
        L37:
            boolean r0 = r3 instanceof java.lang.Boolean
            goto L45
        L3a:
            boolean r0 = r3 instanceof java.lang.Double
            goto L45
        L3d:
            boolean r0 = r3 instanceof java.lang.Float
            goto L45
        L40:
            boolean r0 = r3 instanceof java.lang.Long
            goto L45
        L43:
            boolean r0 = r3 instanceof java.lang.Integer
        L45:
            if (r0 == 0) goto L48
            return
        L48:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            int r1 = r2.zza()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            com.google.android.gms.internal.measurement.r6 r2 = r2.zzb()
            com.google.android.gms.internal.measurement.s6 r2 = r2.a()
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getName()
            java.lang.Object[] r2 = new java.lang.Object[]{r1, r2, r3}
            java.lang.String r3 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.U4.n(com.google.android.gms.internal.measurement.T4, java.lang.Object):void");
    }

    public final void d(T4 t42, Object obj) {
        if (t42.zzd()) {
            if (obj instanceof List) {
                List list = (List) obj;
                int size = list.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i10 = 0; i10 < size; i10++) {
                    Object obj2 = list.get(i10);
                    n(t42, obj2);
                    arrayList.add(obj2);
                }
                obj = arrayList;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        } else {
            n(t42, obj);
        }
        if (obj instanceof C10521s5) {
            this.f82007c = true;
        }
        this.f82005a.put(t42, obj);
    }
}
