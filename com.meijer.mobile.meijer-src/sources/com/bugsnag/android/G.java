package com.bugsnag.android;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.security.DigestOutputStream;
import java.security.MessageDigest;
import java.util.Arrays;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/bugsnag/android/G;", "", "", "a", "()[B", "bugsnag-android-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public interface G {

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class a {
        public static String a(G g10) {
            try {
                Result.Companion companion = Result.INSTANCE;
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
                StringBuilder sb2 = new StringBuilder("sha1 ");
                DigestOutputStream digestOutputStream = new DigestOutputStream(new N0(), messageDigest);
                try {
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(digestOutputStream, 8192);
                    try {
                        bufferedOutputStream.write(g10.a());
                        Unit unit = Unit.f143329a;
                        CloseableKt.a(bufferedOutputStream, null);
                        byte[] bArrDigest = messageDigest.digest();
                        int length = bArrDigest.length;
                        int i10 = 0;
                        while (i10 < length) {
                            byte b10 = bArrDigest[i10];
                            i10++;
                            StringCompanionObject stringCompanionObject = StringCompanionObject.f143748a;
                            String str = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b10)}, 1));
                            Intrinsics.i(str, "format(format, *args)");
                            sb2.append(str);
                        }
                        Unit unit2 = Unit.f143329a;
                        CloseableKt.a(digestOutputStream, null);
                        return sb2.toString();
                    } finally {
                    }
                } finally {
                }
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                if (Result.e(Result.b(ResultKt.a(th2))) != null) {
                    return null;
                }
                throw new KotlinNothingValueException();
            }
        }
    }

    byte[] a() throws IOException;
}
