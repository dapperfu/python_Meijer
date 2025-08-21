package com.google.android.gms.measurement.internal;

import java.util.EnumMap;

/* renamed from: com.google.android.gms.measurement.internal.o, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C11326o {

    /* renamed from: a, reason: collision with root package name */
    private final EnumMap f86566a;

    C11326o() {
        this.f86566a = new EnumMap(Qd.v.class);
    }

    private C11326o(EnumMap enumMap) {
        EnumMap enumMap2 = new EnumMap(Qd.v.class);
        this.f86566a = enumMap2;
        enumMap2.putAll(enumMap);
    }

    public static C11326o d(String str) {
        EnumMap enumMap = new EnumMap(Qd.v.class);
        if (str.length() >= Qd.v.values().length) {
            int i10 = 0;
            if (str.charAt(0) == '1') {
                Qd.v[] vVarArrValues = Qd.v.values();
                int length = vVarArrValues.length;
                int i11 = 1;
                while (i10 < length) {
                    enumMap.put((EnumMap) vVarArrValues[i10], (Qd.v) EnumC11319n.a(str.charAt(i11)));
                    i10++;
                    i11++;
                }
                return new C11326o(enumMap);
            }
        }
        return new C11326o();
    }

    public final EnumC11319n a(Qd.v vVar) {
        EnumC11319n enumC11319n = (EnumC11319n) this.f86566a.get(vVar);
        return enumC11319n == null ? EnumC11319n.UNSET : enumC11319n;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(Qd.v r3, int r4) {
        /*
            r2 = this;
            com.google.android.gms.measurement.internal.n r0 = com.google.android.gms.measurement.internal.EnumC11319n.UNSET
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
            com.google.android.gms.measurement.internal.n r0 = com.google.android.gms.measurement.internal.EnumC11319n.INITIALIZATION
            goto L20
        L18:
            com.google.android.gms.measurement.internal.n r0 = com.google.android.gms.measurement.internal.EnumC11319n.MANIFEST
            goto L20
        L1b:
            com.google.android.gms.measurement.internal.n r0 = com.google.android.gms.measurement.internal.EnumC11319n.API
            goto L20
        L1e:
            com.google.android.gms.measurement.internal.n r0 = com.google.android.gms.measurement.internal.EnumC11319n.TCF
        L20:
            java.util.EnumMap r4 = r2.f86566a
            r4.put(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C11326o.b(Qd.v, int):void");
    }

    public final void c(Qd.v vVar, EnumC11319n enumC11319n) {
        this.f86566a.put((EnumMap) vVar, (Qd.v) enumC11319n);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("1");
        for (Qd.v vVar : Qd.v.values()) {
            EnumC11319n enumC11319n = (EnumC11319n) this.f86566a.get(vVar);
            if (enumC11319n == null) {
                enumC11319n = EnumC11319n.UNSET;
            }
            sb2.append(enumC11319n.b());
        }
        return sb2.toString();
    }
}
