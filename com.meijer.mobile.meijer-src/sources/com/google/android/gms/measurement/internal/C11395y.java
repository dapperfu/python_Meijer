package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.y, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C11395y {

    /* renamed from: f, reason: collision with root package name */
    public static final C11395y f86875f = new C11395y((Boolean) null, 100, (Boolean) null, (String) null);

    /* renamed from: a, reason: collision with root package name */
    private final int f86876a;

    /* renamed from: b, reason: collision with root package name */
    private final String f86877b;

    /* renamed from: c, reason: collision with root package name */
    private final Boolean f86878c;

    /* renamed from: d, reason: collision with root package name */
    private final String f86879d;

    /* renamed from: e, reason: collision with root package name */
    private final EnumMap f86880e;

    C11395y(Boolean bool, int i10, Boolean bool2, String str) {
        EnumMap enumMap = new EnumMap(Qd.v.class);
        this.f86880e = enumMap;
        enumMap.put((EnumMap) Qd.v.AD_USER_DATA, (Qd.v) E3.h(bool));
        this.f86876a = i10;
        this.f86877b = l();
        this.f86878c = bool2;
        this.f86879d = str;
    }

    public static C11395y h(Bundle bundle, int i10) {
        if (bundle == null) {
            return new C11395y((Boolean) null, i10, (Boolean) null, (String) null);
        }
        EnumMap enumMap = new EnumMap(Qd.v.class);
        for (Qd.v vVar : D3.DMA.a()) {
            enumMap.put((EnumMap) vVar, (Qd.v) E3.g(bundle.getString(vVar.f28073a)));
        }
        return new C11395y(enumMap, i10, bundle.containsKey("is_dma_region") ? Boolean.valueOf(bundle.getString("is_dma_region")) : null, bundle.getString("cps_display_str"));
    }

    public final int b() {
        return this.f86876a;
    }

    public final String e() {
        return this.f86877b;
    }

    public final Boolean j() {
        return this.f86878c;
    }

    public final String k() {
        return this.f86879d;
    }

    static C11395y a(Qd.u uVar, int i10) {
        EnumMap enumMap = new EnumMap(Qd.v.class);
        enumMap.put((EnumMap) Qd.v.AD_USER_DATA, (Qd.v) uVar);
        return new C11395y(enumMap, -10, (Boolean) null, (String) null);
    }

    public static C11395y g(String str) throws NumberFormatException {
        if (str == null || str.length() <= 0) {
            return f86875f;
        }
        String[] strArrSplit = str.split(":");
        int i10 = Integer.parseInt(strArrSplit[0]);
        EnumMap enumMap = new EnumMap(Qd.v.class);
        Qd.v[] vVarArrA = D3.DMA.a();
        int length = vVarArrA.length;
        int i11 = 1;
        int i12 = 0;
        while (i12 < length) {
            enumMap.put((EnumMap) vVarArrA[i12], (Qd.v) E3.j(strArrSplit[i11].charAt(0)));
            i12++;
            i11++;
        }
        return new C11395y(enumMap, i10, (Boolean) null, (String) null);
    }

    public static Boolean i(Bundle bundle) {
        Qd.u uVarG;
        if (bundle == null || (uVarG = E3.g(bundle.getString("ad_personalization"))) == null) {
            return null;
        }
        int iOrdinal = uVarG.ordinal();
        if (iOrdinal == 2) {
            return Boolean.FALSE;
        }
        if (iOrdinal != 3) {
            return null;
        }
        return Boolean.TRUE;
    }

    private final String l() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f86876a);
        for (Qd.v vVar : D3.DMA.a()) {
            sb2.append(":");
            sb2.append(E3.m((Qd.u) this.f86880e.get(vVar)));
        }
        return sb2.toString();
    }

    public final Qd.u c() {
        Qd.u uVar = (Qd.u) this.f86880e.get(Qd.v.AD_USER_DATA);
        return uVar == null ? Qd.u.UNINITIALIZED : uVar;
    }

    public final boolean d() {
        Iterator it = this.f86880e.values().iterator();
        while (it.hasNext()) {
            if (((Qd.u) it.next()) != Qd.u.UNINITIALIZED) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C11395y)) {
            return false;
        }
        C11395y c11395y = (C11395y) obj;
        if (this.f86877b.equalsIgnoreCase(c11395y.f86877b) && Objects.equals(this.f86878c, c11395y.f86878c)) {
            return Objects.equals(this.f86879d, c11395y.f86879d);
        }
        return false;
    }

    public final Bundle f() {
        Bundle bundle = new Bundle();
        for (Map.Entry entry : this.f86880e.entrySet()) {
            String strI = E3.i((Qd.u) entry.getValue());
            if (strI != null) {
                bundle.putString(((Qd.v) entry.getKey()).f28073a, strI);
            }
        }
        Boolean bool = this.f86878c;
        if (bool != null) {
            bundle.putString("is_dma_region", bool.toString());
        }
        String str = this.f86879d;
        if (str != null) {
            bundle.putString("cps_display_str", str);
        }
        return bundle;
    }

    public final int hashCode() {
        Boolean bool = this.f86878c;
        int i10 = bool == null ? 3 : true != bool.booleanValue() ? 13 : 7;
        String str = this.f86879d;
        return this.f86877b.hashCode() + (i10 * 29) + ((str == null ? 17 : str.hashCode()) * 137);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("source=");
        sb2.append(E3.d(this.f86876a));
        for (Qd.v vVar : D3.DMA.a()) {
            sb2.append(",");
            sb2.append(vVar.f28073a);
            sb2.append("=");
            Qd.u uVar = (Qd.u) this.f86880e.get(vVar);
            if (uVar == null) {
                sb2.append("uninitialized");
            } else {
                int iOrdinal = uVar.ordinal();
                if (iOrdinal == 0) {
                    sb2.append("uninitialized");
                } else if (iOrdinal == 1) {
                    sb2.append("eu_consent_policy");
                } else if (iOrdinal == 2) {
                    sb2.append("denied");
                } else if (iOrdinal == 3) {
                    sb2.append("granted");
                }
            }
        }
        Boolean bool = this.f86878c;
        if (bool != null) {
            sb2.append(",isDmaRegion=");
            sb2.append(bool);
        }
        String str = this.f86879d;
        if (str != null) {
            sb2.append(",cpsDisplayStr=");
            sb2.append(str);
        }
        return sb2.toString();
    }

    private C11395y(EnumMap enumMap, int i10, Boolean bool, String str) {
        EnumMap enumMap2 = new EnumMap(Qd.v.class);
        this.f86880e = enumMap2;
        enumMap2.putAll(enumMap);
        this.f86876a = i10;
        this.f86877b = l();
        this.f86878c = bool;
        this.f86879d = str;
    }
}
