package com.bugsnag.android;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a%\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001d\u0010\t\u001a\u00020\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0000¢\u0006\u0004\b\t\u0010\n\u001a%\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/bugsnag/android/e0;", "payload", "", "", "a", "(Lcom/bugsnag/android/e0;)Ljava/util/Map;", "", "Lcom/bugsnag/android/ErrorType;", "errorTypes", "b", "(Ljava/util/Set;)Ljava/lang/String;", "apiKey", "c", "(Ljava/lang/String;)Ljava/util/Map;", "bugsnag-android-core_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class J {
    public static final Map<String, String> a(C6591e0 c6591e0) {
        Pair pairA = TuplesKt.a("Bugsnag-Payload-Version", "4.0");
        String strC = c6591e0.getApiKey();
        if (strC == null) {
            strC = "";
        }
        Map mapR = MapsKt.r(pairA, TuplesKt.a("Bugsnag-Api-Key", strC), TuplesKt.a("Bugsnag-Sent-At", R6.g.c(new Date())), TuplesKt.a("Content-Type", "application/json"));
        Set<ErrorType> setD = c6591e0.d();
        if (!setD.isEmpty()) {
            mapR.put("Bugsnag-Stacktrace-Types", b(setD));
        }
        return MapsKt.A(mapR);
    }

    public static final Map<String, String> c(String str) {
        return MapsKt.o(TuplesKt.a("Bugsnag-Payload-Version", "1.0"), TuplesKt.a("Bugsnag-Api-Key", str), TuplesKt.a("Content-Type", "application/json"), TuplesKt.a("Bugsnag-Sent-At", R6.g.c(new Date())));
    }

    public static final String b(Set<? extends ErrorType> set) {
        if (set.isEmpty()) {
            return "";
        }
        Set<? extends ErrorType> set2 = set;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(set2, 10));
        Iterator<T> it = set2.iterator();
        while (it.hasNext()) {
            arrayList.add(((ErrorType) it.next()).getDesc());
        }
        Iterator it2 = arrayList.iterator();
        if (it2.hasNext()) {
            Object next = it2.next();
            while (it2.hasNext()) {
                next = ((String) next) + ',' + ((String) it2.next());
            }
            return (String) next;
        }
        throw new UnsupportedOperationException("Empty collection can't be reduced.");
    }
}
