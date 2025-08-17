package com.bugsnag.android;

import java.io.BufferedOutputStream;
import java.security.DigestOutputStream;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0002\b\u0003\u001a%\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001d\u0010\t\u001a\u00020\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0000¢\u0006\u0004\b\t\u0010\n\u001a%\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0001\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/bugsnag/android/Y;", "payload", "", "", "b", "(Lcom/bugsnag/android/Y;)Ljava/util/Map;", "", "Lcom/bugsnag/android/ErrorType;", "errorTypes", "c", "(Ljava/util/Set;)Ljava/lang/String;", "apiKey", "d", "(Ljava/lang/String;)Ljava/util/Map;", "", "a", "([B)Ljava/lang/String;", "bugsnag-android-core_release"}, k = 2, mv = {1, 4, 2})
/* loaded from: classes4.dex */
public final class F {
    public static final String a(byte[] bArr) {
        try {
            Result.Companion companion = Result.INSTANCE;
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            StringBuilder sb2 = new StringBuilder("sha1 ");
            DigestOutputStream digestOutputStream = new DigestOutputStream(new C0(), messageDigest);
            try {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(digestOutputStream, 8192);
                try {
                    bufferedOutputStream.write(bArr);
                    Unit unit = Unit.f142422a;
                    CloseableKt.a(bufferedOutputStream, null);
                    byte[] bArrDigest = messageDigest.digest();
                    Intrinsics.f(bArrDigest, "shaDigest.digest()");
                    for (byte b10 : bArrDigest) {
                        StringCompanionObject stringCompanionObject = StringCompanionObject.f142841a;
                        String str = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b10)}, 1));
                        Intrinsics.i(str, "java.lang.String.format(format, *args)");
                        sb2.append(str);
                    }
                    Unit unit2 = Unit.f142422a;
                    CloseableKt.a(digestOutputStream, null);
                    return sb2.toString();
                } finally {
                }
            } finally {
            }
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.e(Result.b(ResultKt.a(th2))).getClass();
            return null;
        }
    }

    public static final Map<String, String> b(Y y10) {
        Pair pairA = TuplesKt.a("Bugsnag-Payload-Version", "4.0");
        String strA = y10.getApiKey();
        if (strA == null) {
            strA = "";
        }
        Map mapR = MapsKt.r(pairA, TuplesKt.a("Bugsnag-Api-Key", strA), TuplesKt.a("Bugsnag-Sent-At", Q6.d.c(new Date())), TuplesKt.a("Content-Type", "application/json"));
        Set<ErrorType> setB = y10.b();
        if (!setB.isEmpty()) {
            mapR.put("Bugsnag-Stacktrace-Types", c(setB));
        }
        return MapsKt.A(mapR);
    }

    public static final Map<String, String> d(String str) {
        return MapsKt.o(TuplesKt.a("Bugsnag-Payload-Version", "1.0"), TuplesKt.a("Bugsnag-Api-Key", str), TuplesKt.a("Content-Type", "application/json"), TuplesKt.a("Bugsnag-Sent-At", Q6.d.c(new Date())));
    }

    public static final String c(Set<? extends ErrorType> set) {
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
