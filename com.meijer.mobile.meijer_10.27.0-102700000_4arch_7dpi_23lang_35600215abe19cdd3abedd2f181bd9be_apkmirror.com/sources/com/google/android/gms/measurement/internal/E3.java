package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes6.dex */
public final class E3 {

    /* renamed from: c, reason: collision with root package name */
    public static final E3 f84995c = new E3(null, null, 100);

    /* renamed from: a, reason: collision with root package name */
    private final EnumMap f84996a;

    /* renamed from: b, reason: collision with root package name */
    private final int f84997b;

    public E3(Boolean bool, Boolean bool2, int i10) {
        EnumMap enumMap = new EnumMap(Od.v.class);
        this.f84996a = enumMap;
        enumMap.put((EnumMap) Od.v.AD_STORAGE, (Od.v) h(null));
        enumMap.put((EnumMap) Od.v.ANALYTICS_STORAGE, (Od.v) h(null));
        this.f84997b = i10;
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
        return this.f84997b;
    }

    public static E3 a(Od.u uVar, Od.u uVar2, int i10) {
        EnumMap enumMap = new EnumMap(Od.v.class);
        enumMap.put((EnumMap) Od.v.AD_STORAGE, (Od.v) uVar);
        enumMap.put((EnumMap) Od.v.ANALYTICS_STORAGE, (Od.v) uVar2);
        return new E3(enumMap, -10);
    }

    public static E3 e(Bundle bundle, int i10) {
        if (bundle == null) {
            return new E3(null, null, i10);
        }
        EnumMap enumMap = new EnumMap(Od.v.class);
        for (Od.v vVar : D3.STORAGE.b()) {
            enumMap.put((EnumMap) vVar, (Od.v) g(bundle.getString(vVar.f23585a)));
        }
        return new E3(enumMap, i10);
    }

    public static E3 f(String str, int i10) {
        EnumMap enumMap = new EnumMap(Od.v.class);
        Od.v[] vVarArrA = D3.STORAGE.a();
        for (int i11 = 0; i11 < vVarArrA.length; i11++) {
            String str2 = str == null ? "" : str;
            Od.v vVar = vVarArrA[i11];
            int i12 = i11 + 2;
            if (i12 < str2.length()) {
                enumMap.put((EnumMap) vVar, (Od.v) j(str2.charAt(i12)));
            } else {
                enumMap.put((EnumMap) vVar, (Od.v) Od.u.UNINITIALIZED);
            }
        }
        return new E3(enumMap, i10);
    }

    static Od.u g(String str) {
        return str == null ? Od.u.UNINITIALIZED : str.equals("granted") ? Od.u.GRANTED : str.equals("denied") ? Od.u.DENIED : Od.u.UNINITIALIZED;
    }

    static Od.u h(Boolean bool) {
        return bool == null ? Od.u.UNINITIALIZED : bool.booleanValue() ? Od.u.GRANTED : Od.u.DENIED;
    }

    static Od.u j(char c10) {
        return c10 != '+' ? c10 != '0' ? c10 != '1' ? Od.u.UNINITIALIZED : Od.u.GRANTED : Od.u.DENIED : Od.u.POLICY;
    }

    static char m(Od.u uVar) {
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
        Iterator it = this.f84996a.values().iterator();
        while (it.hasNext()) {
            if (((Od.u) it.next()) != Od.u.UNINITIALIZED) {
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
        for (Od.v vVar : D3.STORAGE.b()) {
            if (this.f84996a.get(vVar) != e32.f84996a.get(vVar)) {
                return false;
            }
        }
        return this.f84997b == e32.f84997b;
    }

    public final int hashCode() {
        Iterator it = this.f84996a.values().iterator();
        int iHashCode = this.f84997b * 17;
        while (it.hasNext()) {
            iHashCode = (iHashCode * 31) + ((Od.u) it.next()).hashCode();
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
            Od.v[] r1 = r1.a()
            int r2 = r1.length
            r3 = 0
        Lf:
            if (r3 >= r2) goto L3a
            r4 = r1[r3]
            java.util.EnumMap r5 = r7.f84996a
            java.lang.Object r4 = r5.get(r4)
            Od.u r4 = (Od.u) r4
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
        for (Od.v vVar : D3.STORAGE.a()) {
            sb2.append(m((Od.u) this.f84996a.get(vVar)));
        }
        return sb2.toString();
    }

    public final Bundle n() {
        Bundle bundle = new Bundle();
        for (Map.Entry entry : this.f84996a.entrySet()) {
            String strI = i((Od.u) entry.getValue());
            if (strI != null) {
                bundle.putString(((Od.v) entry.getKey()).f23585a, strI);
            }
        }
        return bundle;
    }

    public final boolean o(Od.v vVar) {
        return ((Od.u) this.f84996a.get(vVar)) != Od.u.DENIED;
    }

    public final Od.u p() {
        Od.u uVar = (Od.u) this.f84996a.get(Od.v.AD_STORAGE);
        return uVar == null ? Od.u.UNINITIALIZED : uVar;
    }

    public final Od.u q() {
        Od.u uVar = (Od.u) this.f84996a.get(Od.v.ANALYTICS_STORAGE);
        return uVar == null ? Od.u.UNINITIALIZED : uVar;
    }

    public final boolean r(E3 e32) {
        EnumMap enumMap = this.f84996a;
        for (Od.v vVar : (Od.v[]) enumMap.keySet().toArray(new Od.v[0])) {
            Od.u uVar = (Od.u) enumMap.get(vVar);
            Od.u uVar2 = (Od.u) e32.f84996a.get(vVar);
            Od.u uVar3 = Od.u.DENIED;
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
            java.lang.Class<Od.v> r1 = Od.v.class
            r0.<init>(r1)
            com.google.android.gms.measurement.internal.D3 r1 = com.google.android.gms.measurement.internal.D3.STORAGE
            Od.v[] r1 = r1.b()
            int r2 = r1.length
            r3 = 0
        Lf:
            if (r3 >= r2) goto L4a
            r4 = r1[r3]
            java.util.EnumMap r5 = r8.f84996a
            java.lang.Object r5 = r5.get(r4)
            Od.u r5 = (Od.u) r5
            java.util.EnumMap r6 = r9.f84996a
            java.lang.Object r6 = r6.get(r4)
            Od.u r6 = (Od.u) r6
            if (r5 != 0) goto L26
            goto L33
        L26:
            if (r6 == 0) goto L42
            Od.u r7 = Od.u.UNINITIALIZED
            if (r5 != r7) goto L2d
            goto L33
        L2d:
            if (r6 == r7) goto L42
            Od.u r7 = Od.u.POLICY
            if (r5 != r7) goto L35
        L33:
            r5 = r6
            goto L42
        L35:
            if (r6 == r7) goto L42
            Od.u r7 = Od.u.DENIED
            if (r5 == r7) goto L41
            if (r6 != r7) goto L3e
            goto L41
        L3e:
            Od.u r5 = Od.u.GRANTED
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
        EnumMap enumMap = new EnumMap(Od.v.class);
        for (Od.v vVar : D3.STORAGE.b()) {
            Od.u uVar = (Od.u) this.f84996a.get(vVar);
            if (uVar == Od.u.UNINITIALIZED) {
                uVar = (Od.u) e32.f84996a.get(vVar);
            }
            if (uVar != null) {
                enumMap.put((EnumMap) vVar, (Od.v) uVar);
            }
        }
        return new E3(enumMap, this.f84997b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("source=");
        sb2.append(d(this.f84997b));
        for (Od.v vVar : D3.STORAGE.b()) {
            sb2.append(",");
            sb2.append(vVar.f23585a);
            sb2.append("=");
            Od.u uVar = (Od.u) this.f84996a.get(vVar);
            if (uVar == null) {
                uVar = Od.u.UNINITIALIZED;
            }
            sb2.append(uVar);
        }
        return sb2.toString();
    }

    static String i(Od.u uVar) {
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
        EnumMap enumMap2 = new EnumMap(Od.v.class);
        this.f84996a = enumMap2;
        enumMap2.putAll(enumMap);
        this.f84997b = i10;
    }
}
