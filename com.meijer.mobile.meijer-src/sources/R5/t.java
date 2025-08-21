package R5;

import com.medallia.digital.mobilesdk.q2;

/* loaded from: classes4.dex */
public class t {

    /* renamed from: a, reason: collision with root package name */
    private static com.adobe.marketing.mobile.A f31941a = com.adobe.marketing.mobile.A.ERROR;

    public static com.adobe.marketing.mobile.A c() {
        return f31941a;
    }

    public static void d(com.adobe.marketing.mobile.A a10) {
        f31941a = a10;
    }

    public static void a(String str, String str2, String str3, Object... objArr) {
        u uVarG = K.f().g();
        if (uVarG != null && f31941a.f62820a >= com.adobe.marketing.mobile.A.DEBUG.f62820a) {
            try {
                uVarG.a(str + q2.f93563c + str2, String.format(str3, objArr));
            } catch (Exception unused) {
                uVarG.a(str2, str3);
            }
        }
    }

    public static void b(String str, String str2, String str3, Object... objArr) {
        u uVarG = K.f().g();
        if (uVarG != null && f31941a.ordinal() >= com.adobe.marketing.mobile.A.ERROR.f62820a) {
            try {
                uVarG.c(str + q2.f93563c + str2, String.format(str3, objArr));
            } catch (Exception unused) {
                uVarG.c(str2, str3);
            }
        }
    }

    public static void e(String str, String str2, String str3, Object... objArr) {
        u uVarG = K.f().g();
        if (uVarG != null && f31941a.f62820a >= com.adobe.marketing.mobile.A.VERBOSE.f62820a) {
            try {
                uVarG.b(str + q2.f93563c + str2, String.format(str3, objArr));
            } catch (Exception unused) {
                uVarG.b(str2, str3);
            }
        }
    }

    public static void f(String str, String str2, String str3, Object... objArr) {
        u uVarG = K.f().g();
        if (uVarG != null && f31941a.ordinal() >= com.adobe.marketing.mobile.A.WARNING.f62820a) {
            try {
                uVarG.d(str + q2.f93563c + str2, String.format(str3, objArr));
            } catch (Exception unused) {
                uVarG.d(str2, str3);
            }
        }
    }
}
