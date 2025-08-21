package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import com.google.maps.android.BuildConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* renamed from: com.google.android.gms.internal.ads.t70, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9590t70 implements InterfaceC9483s70 {

    /* renamed from: a, reason: collision with root package name */
    private final Object[] f79330a;

    private static String a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        while (it.hasNext()) {
            Object obj = bundle.get((String) it.next());
            sb2.append(obj == null ? BuildConfig.TRAVIS : obj instanceof Bundle ? a((Bundle) obj) : obj.toString());
        }
        return sb2.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C9590t70) {
            return Arrays.equals(this.f79330a, ((C9590t70) obj).f79330a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f79330a);
    }

    public final String toString() {
        Object[] objArr = this.f79330a;
        return "[PoolKey#" + Arrays.hashCode(objArr) + " " + Arrays.toString(objArr) + "]";
    }

    public C9590t70(Oc.Y1 y12, String str, int i10, String str2, Oc.j2 j2Var) {
        HashSet hashSet = new HashSet(Arrays.asList(str2.split(",")));
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        arrayList.add(str);
        if (hashSet.contains("networkType")) {
            arrayList.add(Integer.valueOf(i10));
        }
        if (hashSet.contains("birthday")) {
            arrayList.add(Long.valueOf(y12.f23355b));
        }
        if (hashSet.contains("extras")) {
            arrayList.add(a(y12.f23356c));
        } else if (hashSet.contains("npa")) {
            arrayList.add(y12.f23356c.getString("npa"));
        }
        if (hashSet.contains("gender")) {
            arrayList.add(Integer.valueOf(y12.f23357d));
        }
        if (hashSet.contains("keywords")) {
            List list = y12.f23358e;
            if (list != null) {
                arrayList.add(list.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("isTestDevice")) {
            arrayList.add(Boolean.valueOf(y12.f23359f));
        }
        if (hashSet.contains("tagForChildDirectedTreatment")) {
            arrayList.add(Integer.valueOf(y12.f23360g));
        }
        if (hashSet.contains("manualImpressionsEnabled")) {
            arrayList.add(Boolean.valueOf(y12.f23361h));
        }
        if (hashSet.contains("publisherProvidedId")) {
            arrayList.add(y12.f23362i);
        }
        if (hashSet.contains("location")) {
            Location location = y12.f23364k;
            if (location != null) {
                arrayList.add(location.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("contentUrl")) {
            arrayList.add(y12.f23365l);
        }
        if (hashSet.contains("networkExtras")) {
            arrayList.add(a(y12.f23366m));
        }
        if (hashSet.contains("customTargeting")) {
            arrayList.add(a(y12.f23367n));
        }
        if (hashSet.contains("categoryExclusions")) {
            List list2 = y12.f23368o;
            if (list2 != null) {
                arrayList.add(list2.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("requestAgent")) {
            arrayList.add(y12.f23369p);
        }
        if (hashSet.contains("requestPackage")) {
            arrayList.add(y12.f23370q);
        }
        if (hashSet.contains("isDesignedForFamilies")) {
            arrayList.add(Boolean.valueOf(y12.f23371r));
        }
        if (hashSet.contains("tagForUnderAgeOfConsent")) {
            arrayList.add(Integer.valueOf(y12.f23373t));
        }
        if (hashSet.contains("maxAdContentRating")) {
            arrayList.add(y12.f23374u);
        }
        if (hashSet.contains("orientation")) {
            if (j2Var != null) {
                arrayList.add(Integer.valueOf(j2Var.f23481a));
            } else {
                arrayList.add(null);
            }
        }
        this.f79330a = arrayList.toArray();
    }
}
