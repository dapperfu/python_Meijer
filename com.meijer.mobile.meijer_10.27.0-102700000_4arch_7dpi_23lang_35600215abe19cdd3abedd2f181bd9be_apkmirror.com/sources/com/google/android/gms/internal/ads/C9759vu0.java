package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.vu0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9759vu0 {

    /* renamed from: d, reason: collision with root package name */
    private static final C9759vu0 f79148d = new C9759vu0(true);

    /* renamed from: a, reason: collision with root package name */
    final Rv0 f79149a = new Kv0();

    /* renamed from: b, reason: collision with root package name */
    private boolean f79150b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f79151c;

    private C9759vu0() {
    }

    public static C9759vu0 e() {
        return f79148d;
    }

    private C9759vu0(boolean z10) {
        g();
        g();
    }

    static int a(EnumC8268hw0 enumC8268hw0, int i10, Object obj) {
        int iE = AbstractC8583ku0.e(i10 << 3);
        if (enumC8268hw0 == EnumC8268hw0.f74826k) {
            byte[] bArr = Tu0.f70473b;
            if (((InterfaceC9120pv0) obj) instanceof It0) {
                throw null;
            }
            iE += iE;
        }
        return iE + b(enumC8268hw0, obj);
    }

    static int b(EnumC8268hw0 enumC8268hw0, Object obj) {
        int iK;
        int iE;
        EnumC8268hw0 enumC8268hw02 = EnumC8268hw0.f74817b;
        EnumC8373iw0 enumC8373iw0 = EnumC8373iw0.INT;
        switch (enumC8268hw0.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                int i10 = AbstractC8583ku0.f75713d;
                return 8;
            case 1:
                ((Float) obj).getClass();
                int i11 = AbstractC8583ku0.f75713d;
                return 4;
            case 2:
                return AbstractC8583ku0.f(((Long) obj).longValue());
            case 3:
                return AbstractC8583ku0.f(((Long) obj).longValue());
            case 4:
                return AbstractC8583ku0.f(((Integer) obj).intValue());
            case 5:
                ((Long) obj).getClass();
                int i12 = AbstractC8583ku0.f75713d;
                return 8;
            case 6:
                ((Integer) obj).getClass();
                int i13 = AbstractC8583ku0.f75713d;
                return 4;
            case 7:
                ((Boolean) obj).getClass();
                int i14 = AbstractC8583ku0.f75713d;
                return 1;
            case 8:
                if (!(obj instanceof Zt0)) {
                    return AbstractC8583ku0.d((String) obj);
                }
                int i15 = AbstractC8583ku0.f75713d;
                iK = ((Zt0) obj).k();
                iE = AbstractC8583ku0.e(iK);
                break;
            case 9:
                int i16 = AbstractC8583ku0.f75713d;
                return ((InterfaceC9120pv0) obj).zzaY();
            case 10:
                if (!(obj instanceof Zu0)) {
                    return AbstractC8583ku0.E((InterfaceC9120pv0) obj);
                }
                int i17 = AbstractC8583ku0.f75713d;
                iK = ((Zu0) obj).a();
                iE = AbstractC8583ku0.e(iK);
                break;
            case 11:
                if (!(obj instanceof Zt0)) {
                    int i18 = AbstractC8583ku0.f75713d;
                    iK = ((byte[]) obj).length;
                    iE = AbstractC8583ku0.e(iK);
                    break;
                } else {
                    int i19 = AbstractC8583ku0.f75713d;
                    iK = ((Zt0) obj).k();
                    iE = AbstractC8583ku0.e(iK);
                    break;
                }
            case 12:
                return AbstractC8583ku0.e(((Integer) obj).intValue());
            case 13:
                return obj instanceof Ku0 ? AbstractC8583ku0.f(((Ku0) obj).zza()) : AbstractC8583ku0.f(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).getClass();
                int i20 = AbstractC8583ku0.f75713d;
                return 4;
            case 15:
                ((Long) obj).getClass();
                int i21 = AbstractC8583ku0.f75713d;
                return 8;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                return AbstractC8583ku0.e((iIntValue >> 31) ^ (iIntValue + iIntValue));
            case 17:
                long jLongValue = ((Long) obj).longValue();
                return AbstractC8583ku0.f((jLongValue >> 63) ^ (jLongValue + jLongValue));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        return iE + iK;
    }

    private static boolean k(Object obj) {
        if (obj instanceof InterfaceC9227qv0) {
            return ((InterfaceC9227qv0) obj).C();
        }
        if (obj instanceof Zu0) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        C9759vu0 c9759vu0 = new C9759vu0();
        int iC = this.f79149a.c();
        for (int i10 = 0; i10 < iC; i10++) {
            Map.Entry entryH = this.f79149a.h(i10);
            c9759vu0.h((InterfaceC9652uu0) ((Lv0) entryH).a(), entryH.getValue());
        }
        for (Map.Entry entry : this.f79149a.d()) {
            c9759vu0.h((InterfaceC9652uu0) entry.getKey(), entry.getValue());
        }
        c9759vu0.f79151c = this.f79151c;
        return c9759vu0;
    }

    public final int d() {
        int iC = this.f79149a.c();
        int iL = 0;
        for (int i10 = 0; i10 < iC; i10++) {
            iL += l(this.f79149a.h(i10));
        }
        Iterator it = this.f79149a.d().iterator();
        while (it.hasNext()) {
            iL += l((Map.Entry) it.next());
        }
        return iL;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C9759vu0) {
            return this.f79149a.equals(((C9759vu0) obj).f79149a);
        }
        return false;
    }

    public final Iterator f() {
        return this.f79149a.isEmpty() ? Collections.emptyIterator() : this.f79151c ? new Xu0(this.f79149a.entrySet().iterator()) : this.f79149a.entrySet().iterator();
    }

    public final void g() {
        if (this.f79150b) {
            return;
        }
        int iC = this.f79149a.c();
        for (int i10 = 0; i10 < iC; i10++) {
            Object value = this.f79149a.h(i10).getValue();
            if (value instanceof Gu0) {
                ((Gu0) value).B();
            }
        }
        Iterator it = this.f79149a.d().iterator();
        while (it.hasNext()) {
            Object value2 = ((Map.Entry) it.next()).getValue();
            if (value2 instanceof Gu0) {
                ((Gu0) value2).B();
            }
        }
        this.f79149a.a();
        this.f79150b = true;
    }

    public final int hashCode() {
        return this.f79149a.hashCode();
    }

    public final boolean i() {
        int iC = this.f79149a.c();
        for (int i10 = 0; i10 < iC; i10++) {
            if (!j(this.f79149a.h(i10))) {
                return false;
            }
        }
        Iterator it = this.f79149a.d().iterator();
        while (it.hasNext()) {
            if (!j((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public static int c(InterfaceC9652uu0 interfaceC9652uu0, Object obj) {
        EnumC8268hw0 enumC8268hw0Zzb = interfaceC9652uu0.zzb();
        int iZza = interfaceC9652uu0.zza();
        if (interfaceC9652uu0.zze()) {
            List list = (List) obj;
            int size = list.size();
            int i10 = 0;
            if (interfaceC9652uu0.zzd()) {
                if (list.isEmpty()) {
                    return 0;
                }
                int iB = 0;
                while (i10 < size) {
                    iB += b(enumC8268hw0Zzb, list.get(i10));
                    i10++;
                }
                return AbstractC8583ku0.e(iZza << 3) + iB + AbstractC8583ku0.e(iB);
            }
            int iA = 0;
            while (i10 < size) {
                iA += a(enumC8268hw0Zzb, iZza, list.get(i10));
                i10++;
            }
            return iA;
        }
        return a(enumC8268hw0Zzb, iZza, obj);
    }

    private static boolean j(Map.Entry entry) {
        InterfaceC9652uu0 interfaceC9652uu0 = (InterfaceC9652uu0) entry.getKey();
        if (interfaceC9652uu0.zzc() == EnumC8373iw0.MESSAGE) {
            if (interfaceC9652uu0.zze()) {
                List list = (List) entry.getValue();
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (!k(list.get(i10))) {
                        return false;
                    }
                }
                return true;
            }
            return k(entry.getValue());
        }
        return true;
    }

    private static final int l(Map.Entry entry) {
        int i10;
        int iE;
        int iE2;
        InterfaceC9652uu0 interfaceC9652uu0 = (InterfaceC9652uu0) entry.getKey();
        Object value = entry.getValue();
        if (interfaceC9652uu0.zzc() == EnumC8373iw0.MESSAGE && !interfaceC9652uu0.zze() && !interfaceC9652uu0.zzd()) {
            if (value instanceof Zu0) {
                int iZza = ((InterfaceC9652uu0) entry.getKey()).zza();
                int iE3 = AbstractC8583ku0.e(8);
                i10 = iE3 + iE3;
                iE = AbstractC8583ku0.e(16) + AbstractC8583ku0.e(iZza);
                int iE4 = AbstractC8583ku0.e(24);
                int iA = ((Zu0) value).a();
                iE2 = iE4 + AbstractC8583ku0.e(iA) + iA;
            } else {
                int iZza2 = ((InterfaceC9652uu0) entry.getKey()).zza();
                int iE5 = AbstractC8583ku0.e(8);
                i10 = iE5 + iE5;
                iE = AbstractC8583ku0.e(16) + AbstractC8583ku0.e(iZza2);
                iE2 = AbstractC8583ku0.e(24) + AbstractC8583ku0.E((InterfaceC9120pv0) value);
            }
            return i10 + iE + iE2;
        }
        return c(interfaceC9652uu0, value);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0047 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void m(com.google.android.gms.internal.ads.InterfaceC9652uu0 r2, java.lang.Object r3) {
        /*
            com.google.android.gms.internal.ads.hw0 r0 = r2.zzb()
            byte[] r1 = com.google.android.gms.internal.ads.Tu0.f70473b
            r3.getClass()
            com.google.android.gms.internal.ads.hw0 r1 = com.google.android.gms.internal.ads.EnumC8268hw0.f74817b
            com.google.android.gms.internal.ads.iw0 r1 = com.google.android.gms.internal.ads.EnumC8373iw0.INT
            com.google.android.gms.internal.ads.iw0 r0 = r0.a()
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
            boolean r0 = r3 instanceof com.google.android.gms.internal.ads.InterfaceC9120pv0
            if (r0 != 0) goto L21
            boolean r0 = r3 instanceof com.google.android.gms.internal.ads.Zu0
            if (r0 == 0) goto L48
        L21:
            return
        L22:
            boolean r0 = r3 instanceof java.lang.Integer
            if (r0 != 0) goto L2a
            boolean r0 = r3 instanceof com.google.android.gms.internal.ads.Ku0
            if (r0 == 0) goto L48
        L2a:
            return
        L2b:
            boolean r0 = r3 instanceof com.google.android.gms.internal.ads.Zt0
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
            com.google.android.gms.internal.ads.hw0 r2 = r2.zzb()
            com.google.android.gms.internal.ads.iw0 r2 = r2.a()
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getName()
            java.lang.Object[] r2 = new java.lang.Object[]{r1, r2, r3}
            java.lang.String r3 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C9759vu0.m(com.google.android.gms.internal.ads.uu0, java.lang.Object):void");
    }

    public final void h(InterfaceC9652uu0 interfaceC9652uu0, Object obj) {
        if (interfaceC9652uu0.zze()) {
            if (obj instanceof List) {
                List list = (List) obj;
                int size = list.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i10 = 0; i10 < size; i10++) {
                    Object obj2 = list.get(i10);
                    m(interfaceC9652uu0, obj2);
                    arrayList.add(obj2);
                }
                obj = arrayList;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        } else {
            m(interfaceC9652uu0, obj);
        }
        if (obj instanceof Zu0) {
            this.f79151c = true;
        }
        this.f79149a.put(interfaceC9652uu0, obj);
    }
}
