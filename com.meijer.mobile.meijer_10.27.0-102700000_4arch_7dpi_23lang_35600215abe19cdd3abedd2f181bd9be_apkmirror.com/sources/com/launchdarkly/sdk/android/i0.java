package com.launchdarkly.sdk.android;

import android.util.Base64;
import com.launchdarkly.sdk.LDContext;
import com.medallia.digital.mobilesdk.q2;
import ih.AbstractC14726e;
import ih.C14724c;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
import mh.C15620a;
import mh.C15622c;
import mh.C15629j;
import mh.InterfaceC15621b;
import ph.C16305c;

/* loaded from: classes7.dex */
public class i0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f91214a = Pattern.compile("^[-a-zA-Z0-9._]+$");

    static void c(C14724c c14724c, Throwable th2, String str, Object... objArr) {
        b(c14724c, th2, true, str, objArr);
    }

    static void d(C14724c c14724c, Throwable th2, String str, Object... objArr) {
        b(c14724c, th2, false, str, objArr);
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    class a<T> implements InterfaceC15621b<T> {
        @Override // mh.InterfaceC15621b
        public void onError(Throwable th2) {
        }

        @Override // mh.InterfaceC15621b
        public void onSuccess(T t10) {
        }

        a() {
        }
    }

    static String a(C15620a c15620a, C14724c c14724c) {
        String[][] strArr = {new String[]{"applicationId", "application-id", c15620a.a()}, new String[]{"applicationName", "application-name", c15620a.b()}, new String[]{"applicationVersion", "application-version", c15620a.c()}, new String[]{"applicationVersionName", "application-version-name", c15620a.d()}};
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < 4; i10++) {
            String[] strArr2 = strArr[i10];
            String str = strArr2[0];
            String str2 = strArr2[1];
            String str3 = strArr2[2];
            if (str3 != null) {
                Object objL = l(str3);
                if (objL != null) {
                    c14724c.p("Value of ApplicationInfo.{} was invalid. {}", str, objL);
                } else {
                    arrayList.add(str2 + q2.f92724c + str3);
                }
            }
        }
        return F.k0.a(" ", arrayList);
    }

    private static void b(C14724c c14724c, Throwable th2, boolean z10, String str, Object... objArr) {
        String str2 = str + " - {}";
        Object objB = AbstractC14726e.b(th2);
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + 1);
        objArrCopyOf[objArr.length] = objB;
        if (z10) {
            c14724c.h(str2, objArrCopyOf);
        } else {
            c14724c.q(str2, objArrCopyOf);
        }
        c14724c.a(AbstractC14726e.c(th2));
    }

    static <T> InterfaceC15621b<T> f() {
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

    static C16305c e(C15622c c15622c) {
        C15629j c15629jG = c15622c.g();
        HashMap map = new HashMap();
        for (Map.Entry<String, String> entry : c15629jG.b()) {
            map.put(entry.getKey(), entry.getValue());
        }
        c15629jG.c();
        return new C16305c(c15629jG.a(), map, null, null, null, null, c15629jG.a(), null, null);
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
        if (!f91214a.matcher(str).matches()) {
            return "Contains invalid characters.";
        }
        return null;
    }
}
