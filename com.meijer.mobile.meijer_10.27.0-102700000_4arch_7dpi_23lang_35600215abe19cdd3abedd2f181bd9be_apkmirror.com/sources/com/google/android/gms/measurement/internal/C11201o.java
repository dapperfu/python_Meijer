package com.google.android.gms.measurement.internal;

import java.util.EnumMap;

/* renamed from: com.google.android.gms.measurement.internal.o, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C11201o {

    /* renamed from: a, reason: collision with root package name */
    private final EnumMap f85726a;

    C11201o() {
        this.f85726a = new EnumMap(Od.v.class);
    }

    private C11201o(EnumMap enumMap) {
        EnumMap enumMap2 = new EnumMap(Od.v.class);
        this.f85726a = enumMap2;
        enumMap2.putAll(enumMap);
    }

    public static C11201o d(String str) {
        EnumMap enumMap = new EnumMap(Od.v.class);
        if (str.length() >= Od.v.values().length) {
            int i10 = 0;
            if (str.charAt(0) == '1') {
                Od.v[] vVarArrValues = Od.v.values();
                int length = vVarArrValues.length;
                int i11 = 1;
                while (i10 < length) {
                    enumMap.put((EnumMap) vVarArrValues[i10], (Od.v) EnumC11194n.a(str.charAt(i11)));
                    i10++;
                    i11++;
                }
                return new C11201o(enumMap);
            }
        }
        return new C11201o();
    }

    public final EnumC11194n a(Od.v vVar) {
        EnumC11194n enumC11194n = (EnumC11194n) this.f85726a.get(vVar);
        return enumC11194n == null ? EnumC11194n.UNSET : enumC11194n;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(Od.v r3, int r4) {
        /*
            r2 = this;
            com.google.android.gms.measurement.internal.n r0 = com.google.android.gms.measurement.internal.EnumC11194n.UNSET
            r1 = -30
            if (r4 == r1) goto L1e
            r1 = -20
            if (r4 == r1) goto L1b
            r1 = -10
            if (r4 == r1) goto L18
            if (r4 == 0) goto L1b
            r1 = 30
            if (r4 == r1) goto L15
            goto L20
        L15:
            com.google.android.gms.measurement.internal.n r0 = com.google.android.gms.measurement.internal.EnumC11194n.INITIALIZATION
            goto L20
        L18:
            com.google.android.gms.measurement.internal.n r0 = com.google.android.gms.measurement.internal.EnumC11194n.MANIFEST
            goto L20
        L1b:
            com.google.android.gms.measurement.internal.n r0 = com.google.android.gms.measurement.internal.EnumC11194n.API
            goto L20
        L1e:
            com.google.android.gms.measurement.internal.n r0 = com.google.android.gms.measurement.internal.EnumC11194n.TCF
        L20:
            java.util.EnumMap r4 = r2.f85726a
            r4.put(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C11201o.b(Od.v, int):void");
    }

    public final void c(Od.v vVar, EnumC11194n enumC11194n) {
        this.f85726a.put((EnumMap) vVar, (Od.v) enumC11194n);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("1");
        for (Od.v vVar : Od.v.values()) {
            EnumC11194n enumC11194n = (EnumC11194n) this.f85726a.get(vVar);
            if (enumC11194n == null) {
                enumC11194n = EnumC11194n.UNSET;
            }
            sb2.append(enumC11194n.b());
        }
        return sb2.toString();
    }
}
