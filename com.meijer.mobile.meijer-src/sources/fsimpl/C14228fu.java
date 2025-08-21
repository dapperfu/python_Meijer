package fsimpl;

import android.os.Looper;

/* renamed from: fsimpl.fu, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C14228fu {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f133537a = false;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f133538b = false;

    public static void a(Object obj, Object obj2, String str, Object... objArr) {
        if (f133537a && !fu$$ExternalSyntheticBackport0.m(obj, obj2)) {
            a("The Object value should have been '" + obj + "' but was '" + obj2 + "'.", str, objArr);
        }
    }

    private static void a(String str, String str2, Object... objArr) {
        throw new RuntimeException(str + d(str2, objArr));
    }

    public static void a(String str, Object... objArr) {
        if (f133537a && Looper.myLooper() != Looper.getMainLooper()) {
            a("This thread should be the UI thread.", str, objArr);
        }
    }

    public static void a(boolean z10, String str, Object... objArr) {
        a(false, z10, str, objArr);
    }

    public static void a(boolean z10, boolean z11, String str, Object... objArr) {
        if (f133537a && z10 != z11) {
            a("The boolean value should have been '" + z10 + "' but was '" + z11 + "'.", str, objArr);
        }
    }

    public static void b(String str, Object... objArr) {
        if (f133537a && Looper.myLooper() == Looper.getMainLooper()) {
            a("This thread should not be the UI thread.", str, objArr);
        }
    }

    public static void b(boolean z10, String str, Object... objArr) {
        a(true, z10, str, objArr);
    }

    public static void c(String str, Object... objArr) {
        if (f133537a) {
            a("", str, objArr);
        }
    }

    private static String d(String str, Object... objArr) {
        if (fY.b(str)) {
            return "";
        }
        return " " + String.format(str, objArr);
    }
}
