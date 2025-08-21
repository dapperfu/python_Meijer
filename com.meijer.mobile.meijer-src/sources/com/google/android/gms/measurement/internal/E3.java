package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes6.dex */
public final class E3 {

    /* renamed from: c, reason: collision with root package name */
    public static final E3 f85835c = new E3(null, null, 100);

    /* renamed from: a, reason: collision with root package name */
    private final EnumMap f85836a;

    /* renamed from: b, reason: collision with root package name */
    private final int f85837b;

    public E3(Boolean bool, Boolean bool2, int i10) {
        EnumMap enumMap = new EnumMap(Qd.v.class);
        this.f85836a = enumMap;
        enumMap.put((EnumMap) Qd.v.AD_STORAGE, (Qd.v) h(null));
        enumMap.put((EnumMap) Qd.v.ANALYTICS_STORAGE, (Qd.v) h(null));
        this.f85837b = i10;
    }

    static String d(int i10) {
        return i10 != -30 ? i10 != -20 ? i10 != -10 ? i10 != 0 ? i10 != 30 ? i10 != 90 ? i10 != 100 ? "OTHER" : "UNKNOWN" : "REMOTE_CONFIG" : "1P_INIT" : "1P_API" : "MANIFEST" : "API" : "TCF";
    }

    public static boolean u(int i10, int i11) {
        int i12 = -30;
        if (i10 == -20) {
            if (i11 == -30) {
                return true;
            }
            i10 = -20;
        }
        if (i10 != -30) {
            i12 = i10;
        } else if (i11 == -20) {
            return true;
        }
        return i12 == i11 || i10 < i11;
    }

    public final int b() {
        return this.f85837b;
    }

    public static E3 a(Qd.u uVar, Qd.u uVar2, int i10) {
        EnumMap enumMap = new EnumMap(Qd.v.class);
        enumMap.put((EnumMap) Qd.v.AD_STORAGE, (Qd.v) uVar);
        enumMap.put((EnumMap) Qd.v.ANALYTICS_STORAGE, (Qd.v) uVar2);
        return new E3(enumMap, -10);
    }

    public static E3 e(Bundle bundle, int i10) {
        if (bundle == null) {
            return new E3(null, null, i10);
        }
        EnumMap enumMap = new EnumMap(Qd.v.class);
        for (Qd.v vVar : D3.STORAGE.b()) {
            enumMap.put((EnumMap) vVar, (Qd.v) g(bundle.getString(vVar.f28073a)));
        }
        return new E3(enumMap, i10);
    }

    public static E3 f(String str, int i10) {
        EnumMap enumMap = new EnumMap(Qd.v.class);
        Qd.v[] vVarArrA = D3.STORAGE.a();
        for (int i11 = 0; i11 < vVarArrA.length; i11++) {
            String str2 = str == null ? "" : str;
            Qd.v vVar = vVarArrA[i11];
            int i12 = i11 + 2;
            if (i12 < str2.length()) {
                enumMap.put((EnumMap) vVar, (Qd.v) j(str2.charAt(i12)));
            } else {
                enumMap.put((EnumMap) vVar, (Qd.v) Qd.u.UNINITIALIZED);
            }
        }
        return new E3(enumMap, i10);
    }

    static Qd.u g(String str) {
        return str == null ? Qd.u.UNINITIALIZED : str.equals("granted") ? Qd.u.GRANTED : str.equals("denied") ? Qd.u.DENIED : Qd.u.UNINITIALIZED;
    }

    static Qd.u h(Boolean bool) {
        return bool == null ? Qd.u.UNINITIALIZED : bool.booleanValue() ? Qd.u.GRANTED : Qd.u.DENIED;
    }

    static Qd.u j(char c10) {
        return c10 != '+' ? c10 != '0' ? c10 != '1' ? Qd.u.UNINITIALIZED : Qd.u.GRANTED : Qd.u.DENIED : Qd.u.POLICY;
    }

    static char m(Qd.u uVar) {
        if (uVar == null) {
            return '-';
        }
        int iOrdinal = uVar.ordinal();
        if (iOrdinal == 1) {
            return '+';
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? '-' : '1';
        }
        return '0';
    }

    public final boolean c() {
        Iterator it = this.f85836a.values().iterator();
        while (it.hasNext()) {
            if (((Qd.u) it.next()) != Qd.u.UNINITIALIZED) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof E3)) {
            return false;
        }
        E3 e32 = (E3) obj;
        for (Qd.v vVar : D3.STORAGE.b()) {
            if (this.f85836a.get(vVar) != e32.f85836a.get(vVar)) {
                return false;
            }
        }
        return this.f85837b == e32.f85837b;
    }

    public final int hashCode() {
        Iterator it = this.f85836a.values().iterator();
        int iHashCode = this.f85837b * 17;
        while (it.hasNext()) {
            iHashCode = (iHashCode * 31) + ((Qd.u) it.next()).hashCode();
        }
        return iHashCode;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String k() {
        /*
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "G1"
            r0.<init>(r1)
            com.google.android.gms.measurement.internal.D3 r1 = com.google.android.gms.measurement.internal.D3.STORAGE
            Qd.v[] r1 = r1.a()
            int r2 = r1.length
            r3 = 0
        Lf:
            if (r3 >= r2) goto L3a
            r4 = r1[r3]
            java.util.EnumMap r5 = r7.f85836a
            java.lang.Object r4 = r5.get(r4)
            Qd.u r4 = (Qd.u) r4
            r5 = 45
            if (r4 == 0) goto L34
            int r4 = r4.ordinal()
            if (r4 == 0) goto L34
            r6 = 1
            if (r4 == r6) goto L32
            r6 = 2
            if (r4 == r6) goto L2f
            r6 = 3
            if (r4 == r6) goto L32
            goto L34
        L2f:
            r5 = 48
            goto L34
        L32:
            r5 = 49
        L34:
            r0.append(r5)
            int r3 = r3 + 1
            goto Lf
        L3a:
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.E3.k():java.lang.String");
    }

    public final String l() {
        StringBuilder sb2 = new StringBuilder("G1");
        for (Qd.v vVar : D3.STORAGE.a()) {
            sb2.append(m((Qd.u) this.f85836a.get(vVar)));
        }
        return sb2.toString();
    }

    public final Bundle n() {
        Bundle bundle = new Bundle();
        for (Map.Entry entry : this.f85836a.entrySet()) {
            String strI = i((Qd.u) entry.getValue());
            if (strI != null) {
                bundle.putString(((Qd.v) entry.getKey()).f28073a, strI);
            }
        }
        return bundle;
    }

    public final boolean o(Qd.v vVar) {
        return ((Qd.u) this.f85836a.get(vVar)) != Qd.u.DENIED;
    }

    public final Qd.u p() {
        Qd.u uVar = (Qd.u) this.f85836a.get(Qd.v.AD_STORAGE);
        return uVar == null ? Qd.u.UNINITIALIZED : uVar;
    }

    public final Qd.u q() {
        Qd.u uVar = (Qd.u) this.f85836a.get(Qd.v.ANALYTICS_STORAGE);
        return uVar == null ? Qd.u.UNINITIALIZED : uVar;
    }

    public final boolean r(E3 e32) {
        EnumMap enumMap = this.f85836a;
        for (Qd.v vVar : (Qd.v[]) enumMap.keySet().toArray(new Qd.v[0])) {
            Qd.u uVar = (Qd.u) enumMap.get(vVar);
            Qd.u uVar2 = (Qd.u) e32.f85836a.get(vVar);
            Qd.u uVar3 = Qd.u.DENIED;
            if (uVar == uVar3 && uVar2 != uVar3) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.E3 s(com.google.android.gms.measurement.internal.E3 r9) {
        /*
            r8 = this;
            java.util.EnumMap r0 = new java.util.EnumMap
            java.lang.Class<Qd.v> r1 = Qd.v.class
            r0.<init>(r1)
            com.google.android.gms.measurement.internal.D3 r1 = com.google.android.gms.measurement.internal.D3.STORAGE
            Qd.v[] r1 = r1.b()
            int r2 = r1.length
            r3 = 0
        Lf:
            if (r3 >= r2) goto L4a
            r4 = r1[r3]
            java.util.EnumMap r5 = r8.f85836a
            java.lang.Object r5 = r5.get(r4)
            Qd.u r5 = (Qd.u) r5
            java.util.EnumMap r6 = r9.f85836a
            java.lang.Object r6 = r6.get(r4)
            Qd.u r6 = (Qd.u) r6
            if (r5 != 0) goto L26
            goto L33
        L26:
            if (r6 == 0) goto L42
            Qd.u r7 = Qd.u.UNINITIALIZED
            if (r5 != r7) goto L2d
            goto L33
        L2d:
            if (r6 == r7) goto L42
            Qd.u r7 = Qd.u.POLICY
            if (r5 != r7) goto L35
        L33:
            r5 = r6
            goto L42
        L35:
            if (r6 == r7) goto L42
            Qd.u r7 = Qd.u.DENIED
            if (r5 == r7) goto L41
            if (r6 != r7) goto L3e
            goto L41
        L3e:
            Qd.u r5 = Qd.u.GRANTED
            goto L42
        L41:
            r5 = r7
        L42:
            if (r5 == 0) goto L47
            r0.put(r4, r5)
        L47:
            int r3 = r3 + 1
            goto Lf
        L4a:
            com.google.android.gms.measurement.internal.E3 r9 = new com.google.android.gms.measurement.internal.E3
            r1 = 100
            r9.<init>(r0, r1)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.E3.s(com.google.android.gms.measurement.internal.E3):com.google.android.gms.measurement.internal.E3");
    }

    public final E3 t(E3 e32) {
        EnumMap enumMap = new EnumMap(Qd.v.class);
        for (Qd.v vVar : D3.STORAGE.b()) {
            Qd.u uVar = (Qd.u) this.f85836a.get(vVar);
            if (uVar == Qd.u.UNINITIALIZED) {
                uVar = (Qd.u) e32.f85836a.get(vVar);
            }
            if (uVar != null) {
                enumMap.put((EnumMap) vVar, (Qd.v) uVar);
            }
        }
        return new E3(enumMap, this.f85837b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("source=");
        sb2.append(d(this.f85837b));
        for (Qd.v vVar : D3.STORAGE.b()) {
            sb2.append(",");
            sb2.append(vVar.f28073a);
            sb2.append("=");
            Qd.u uVar = (Qd.u) this.f85836a.get(vVar);
            if (uVar == null) {
                uVar = Qd.u.UNINITIALIZED;
            }
            sb2.append(uVar);
        }
        return sb2.toString();
    }

    static String i(Qd.u uVar) {
        int iOrdinal = uVar.ordinal();
        if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                return null;
            }
            return "granted";
        }
        return "denied";
    }

    private E3(EnumMap enumMap, int i10) {
        EnumMap enumMap2 = new EnumMap(Qd.v.class);
        this.f85836a = enumMap2;
        enumMap2.putAll(enumMap);
        this.f85837b = i10;
    }
}
