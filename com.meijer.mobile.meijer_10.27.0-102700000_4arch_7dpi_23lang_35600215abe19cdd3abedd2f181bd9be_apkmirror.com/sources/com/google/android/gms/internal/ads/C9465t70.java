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
public final class C9465t70 implements InterfaceC9358s70 {

    /* renamed from: a, reason: collision with root package name */
    private final Object[] f78490a;

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
        if (obj instanceof C9465t70) {
            return Arrays.equals(this.f78490a, ((C9465t70) obj).f78490a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f78490a);
    }

    public final String toString() {
        Object[] objArr = this.f78490a;
        return "[PoolKey#" + Arrays.hashCode(objArr) + " " + Arrays.toString(objArr) + "]";
    }

    public C9465t70(Mc.Y1 y12, String str, int i10, String str2, Mc.j2 j2Var) {
        HashSet hashSet = new HashSet(Arrays.asList(str2.split(",")));
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        arrayList.add(str);
        if (hashSet.contains("networkType")) {
            arrayList.add(Integer.valueOf(i10));
        }
        if (hashSet.contains("birthday")) {
            arrayList.add(Long.valueOf(y12.f19168b));
        }
        if (hashSet.contains("extras")) {
            arrayList.add(a(y12.f19169c));
        } else if (hashSet.contains("npa")) {
            arrayList.add(y12.f19169c.getString("npa"));
        }
        if (hashSet.contains("gender")) {
            arrayList.add(Integer.valueOf(y12.f19170d));
        }
        if (hashSet.contains("keywords")) {
            List list = y12.f19171e;
            if (list != null) {
                arrayList.add(list.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("isTestDevice")) {
            arrayList.add(Boolean.valueOf(y12.f19172f));
        }
        if (hashSet.contains("tagForChildDirectedTreatment")) {
            arrayList.add(Integer.valueOf(y12.f19173g));
        }
        if (hashSet.contains("manualImpressionsEnabled")) {
            arrayList.add(Boolean.valueOf(y12.f19174h));
        }
        if (hashSet.contains("publisherProvidedId")) {
            arrayList.add(y12.f19175i);
        }
        if (hashSet.contains("location")) {
            Location location = y12.f19177k;
            if (location != null) {
                arrayList.add(location.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("contentUrl")) {
            arrayList.add(y12.f19178l);
        }
        if (hashSet.contains("networkExtras")) {
            arrayList.add(a(y12.f19179m));
        }
        if (hashSet.contains("customTargeting")) {
            arrayList.add(a(y12.f19180n));
        }
        if (hashSet.contains("categoryExclusions")) {
            List list2 = y12.f19181o;
            if (list2 != null) {
                arrayList.add(list2.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("requestAgent")) {
            arrayList.add(y12.f19182p);
        }
        if (hashSet.contains("requestPackage")) {
            arrayList.add(y12.f19183q);
        }
        if (hashSet.contains("isDesignedForFamilies")) {
            arrayList.add(Boolean.valueOf(y12.f19184r));
        }
        if (hashSet.contains("tagForUnderAgeOfConsent")) {
            arrayList.add(Integer.valueOf(y12.f19186t));
        }
        if (hashSet.contains("maxAdContentRating")) {
            arrayList.add(y12.f19187u);
        }
        if (hashSet.contains("orientation")) {
            if (j2Var != null) {
                arrayList.add(Integer.valueOf(j2Var.f19294a));
            } else {
                arrayList.add(null);
            }
        }
        this.f78490a = arrayList.toArray();
    }
}
