package com.launchdarkly.sdk.android;

import android.util.Base64;
import com.launchdarkly.sdk.LDContext;
import com.medallia.digital.mobilesdk.q2;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
import jh.AbstractC15036e;
import jh.C15034c;
import nh.C15943a;
import nh.C15945c;
import nh.C15952j;
import nh.InterfaceC15944b;
import qh.C16669c;

/* loaded from: classes8.dex */
public class i0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f92053a = Pattern.compile("^[-a-zA-Z0-9._]+$");

    static void c(C15034c c15034c, Throwable th2, String str, Object... objArr) {
        b(c15034c, th2, true, str, objArr);
    }

    static void d(C15034c c15034c, Throwable th2, String str, Object... objArr) {
        b(c15034c, th2, false, str, objArr);
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    class a<T> implements InterfaceC15944b<T> {
        @Override // nh.InterfaceC15944b
        public void onError(Throwable th2) {
        }

        @Override // nh.InterfaceC15944b
        public void onSuccess(T t10) {
        }

        a() {
        }
    }

    static String a(C15943a c15943a, C15034c c15034c) {
        String[][] strArr = {new String[]{"applicationId", "application-id", c15943a.a()}, new String[]{"applicationName", "application-name", c15943a.b()}, new String[]{"applicationVersion", "application-version", c15943a.c()}, new String[]{"applicationVersionName", "application-version-name", c15943a.d()}};
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < 4; i10++) {
            String[] strArr2 = strArr[i10];
            String str = strArr2[0];
            String str2 = strArr2[1];
            String str3 = strArr2[2];
            if (str3 != null) {
                Object objL = l(str3);
                if (objL != null) {
                    c15034c.p("Value of ApplicationInfo.{} was invalid. {}", str, objL);
                } else {
                    arrayList.add(str2 + q2.f93563c + str3);
                }
            }
        }
        return F.k0.a(" ", arrayList);
    }

    private static void b(C15034c c15034c, Throwable th2, boolean z10, String str, Object... objArr) {
        String str2 = str + " - {}";
        Object objB = AbstractC15036e.b(th2);
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + 1);
        objArrCopyOf[objArr.length] = objB;
        if (z10) {
            c15034c.h(str2, objArrCopyOf);
        } else {
            c15034c.q(str2, objArrCopyOf);
        }
        c15034c.a(AbstractC15036e.c(th2));
    }

    static <T> InterfaceC15944b<T> f() {
        return new a();
    }

    public static String g(String str) {
        return str.replace(' ', '-');
    }

    static String j(String str) {
        try {
            return Base64.encodeToString(MessageDigest.getInstance("SHA-256").digest(str.getBytes(Charset.forName("UTF-8"))), 10);
        } catch (NoSuchAlgorithmException e10) {
            throw new RuntimeException(e10);
        }
    }

    static C16669c e(C15945c c15945c) {
        C15952j c15952jG = c15945c.g();
        HashMap map = new HashMap();
        for (Map.Entry<String, String> entry : c15952jG.b()) {
            map.put(entry.getKey(), entry.getValue());
        }
        c15952jG.c();
        return new C16669c(c15952jG.a(), map, null, null, null, null, c15952jG.a(), null, null);
    }

    static String h(LDContext lDContext) {
        return Base64.encodeToString(com.launchdarkly.sdk.json.d.d(lDContext).getBytes(), 10);
    }

    static String i(LDContext lDContext) {
        return j(com.launchdarkly.sdk.json.d.d(lDContext));
    }

    public static String k(LDContext lDContext) {
        return j(lDContext.j());
    }

    public static String l(String str) {
        if (str.isEmpty()) {
            return "Empty string.";
        }
        if (str.length() > 64) {
            return "Longer than 64 characters.";
        }
        if (!f92053a.matcher(str).matches()) {
            return "Contains invalid characters.";
        }
        return null;
    }
}
