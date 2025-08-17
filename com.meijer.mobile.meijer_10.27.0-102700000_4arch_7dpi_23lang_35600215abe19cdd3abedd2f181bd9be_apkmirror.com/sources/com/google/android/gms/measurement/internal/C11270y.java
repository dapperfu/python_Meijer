package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.y, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C11270y {

    /* renamed from: f, reason: collision with root package name */
    public static final C11270y f86035f = new C11270y((Boolean) null, 100, (Boolean) null, (String) null);

    /* renamed from: a, reason: collision with root package name */
    private final int f86036a;

    /* renamed from: b, reason: collision with root package name */
    private final String f86037b;

    /* renamed from: c, reason: collision with root package name */
    private final Boolean f86038c;

    /* renamed from: d, reason: collision with root package name */
    private final String f86039d;

    /* renamed from: e, reason: collision with root package name */
    private final EnumMap f86040e;

    C11270y(Boolean bool, int i10, Boolean bool2, String str) {
        EnumMap enumMap = new EnumMap(Od.v.class);
        this.f86040e = enumMap;
        enumMap.put((EnumMap) Od.v.AD_USER_DATA, (Od.v) E3.h(bool));
        this.f86036a = i10;
        this.f86037b = l();
        this.f86038c = bool2;
        this.f86039d = str;
    }

    public static C11270y h(Bundle bundle, int i10) {
        if (bundle == null) {
            return new C11270y((Boolean) null, i10, (Boolean) null, (String) null);
        }
        EnumMap enumMap = new EnumMap(Od.v.class);
        for (Od.v vVar : D3.DMA.a()) {
            enumMap.put((EnumMap) vVar, (Od.v) E3.g(bundle.getString(vVar.f23585a)));
        }
        return new C11270y(enumMap, i10, bundle.containsKey("is_dma_region") ? Boolean.valueOf(bundle.getString("is_dma_region")) : null, bundle.getString("cps_display_str"));
    }

    public final int b() {
        return this.f86036a;
    }

    public final String e() {
        return this.f86037b;
    }

    public final Boolean j() {
        return this.f86038c;
    }

    public final String k() {
        return this.f86039d;
    }

    static C11270y a(Od.u uVar, int i10) {
        EnumMap enumMap = new EnumMap(Od.v.class);
        enumMap.put((EnumMap) Od.v.AD_USER_DATA, (Od.v) uVar);
        return new C11270y(enumMap, -10, (Boolean) null, (String) null);
    }

    public static C11270y g(String str) throws NumberFormatException {
        if (str == null || str.length() <= 0) {
            return f86035f;
        }
        String[] strArrSplit = str.split(":");
        int i10 = Integer.parseInt(strArrSplit[0]);
        EnumMap enumMap = new EnumMap(Od.v.class);
        Od.v[] vVarArrA = D3.DMA.a();
        int length = vVarArrA.length;
        int i11 = 1;
        int i12 = 0;
        while (i12 < length) {
            enumMap.put((EnumMap) vVarArrA[i12], (Od.v) E3.j(strArrSplit[i11].charAt(0)));
            i12++;
            i11++;
        }
        return new C11270y(enumMap, i10, (Boolean) null, (String) null);
    }

    public static Boolean i(Bundle bundle) {
        Od.u uVarG;
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
        sb2.append(this.f86036a);
        for (Od.v vVar : D3.DMA.a()) {
            sb2.append(":");
            sb2.append(E3.m((Od.u) this.f86040e.get(vVar)));
        }
        return sb2.toString();
    }

    public final Od.u c() {
        Od.u uVar = (Od.u) this.f86040e.get(Od.v.AD_USER_DATA);
        return uVar == null ? Od.u.UNINITIALIZED : uVar;
    }

    public final boolean d() {
        Iterator it = this.f86040e.values().iterator();
        while (it.hasNext()) {
            if (((Od.u) it.next()) != Od.u.UNINITIALIZED) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C11270y)) {
            return false;
        }
        C11270y c11270y = (C11270y) obj;
        if (this.f86037b.equalsIgnoreCase(c11270y.f86037b) && Objects.equals(this.f86038c, c11270y.f86038c)) {
            return Objects.equals(this.f86039d, c11270y.f86039d);
        }
        return false;
    }

    public final Bundle f() {
        Bundle bundle = new Bundle();
        for (Map.Entry entry : this.f86040e.entrySet()) {
            String strI = E3.i((Od.u) entry.getValue());
            if (strI != null) {
                bundle.putString(((Od.v) entry.getKey()).f23585a, strI);
            }
        }
        Boolean bool = this.f86038c;
        if (bool != null) {
            bundle.putString("is_dma_region", bool.toString());
        }
        String str = this.f86039d;
        if (str != null) {
            bundle.putString("cps_display_str", str);
        }
        return bundle;
    }

    public final int hashCode() {
        Boolean bool = this.f86038c;
        int i10 = bool == null ? 3 : true != bool.booleanValue() ? 13 : 7;
        String str = this.f86039d;
        return this.f86037b.hashCode() + (i10 * 29) + ((str == null ? 17 : str.hashCode()) * 137);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("source=");
        sb2.append(E3.d(this.f86036a));
        for (Od.v vVar : D3.DMA.a()) {
            sb2.append(",");
            sb2.append(vVar.f23585a);
            sb2.append("=");
            Od.u uVar = (Od.u) this.f86040e.get(vVar);
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
        Boolean bool = this.f86038c;
        if (bool != null) {
            sb2.append(",isDmaRegion=");
            sb2.append(bool);
        }
        String str = this.f86039d;
        if (str != null) {
            sb2.append(",cpsDisplayStr=");
            sb2.append(str);
        }
        return sb2.toString();
    }

    private C11270y(EnumMap enumMap, int i10, Boolean bool, String str) {
        EnumMap enumMap2 = new EnumMap(Od.v.class);
        this.f86040e = enumMap2;
        enumMap2.putAll(enumMap);
        this.f86036a = i10;
        this.f86037b = l();
        this.f86038c = bool;
        this.f86039d = str;
    }
}
