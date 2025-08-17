package w6;

import android.util.Log;

/* loaded from: classes4.dex */
public final class r {

    /* renamed from: b, reason: collision with root package name */
    public static final r f165943b = new r();

    /* renamed from: a, reason: collision with root package name */
    public int f165944a = 5;

    private static void a(int i10, String str, String str2) {
        String strConcat = "BMP:".concat(String.valueOf(str));
        if (str2.length() <= 4000) {
            Log.println(i10, strConcat, str2);
            return;
        }
        int length = str2.length() / 4000;
        int i11 = 0;
        while (i11 <= length) {
            int i12 = i11 + 1;
            int i13 = i12 * 4000;
            if (i13 >= str2.length()) {
                Log.println(i10, strConcat, "Part " + i11 + ": " + str2.substring(i11 * 4000));
            } else {
                Log.println(i10, strConcat, "Part " + i11 + ": " + str2.substring(i11 * 4000, i13));
            }
            i11 = i12;
        }
    }

    private void b(int i10, String str, String str2, Throwable... thArr) {
        if (i10 < this.f165944a) {
            return;
        }
        if (thArr.length <= 0) {
            a(i10, str, str2);
            return;
        }
        a(i10, str, str2 + '\n' + Log.getStackTraceString(thArr[0]));
    }

    public static void c(String str, String str2, Throwable... thArr) {
        f165943b.b(4, str, str2, thArr);
    }

    public static void d(String str, String str2, Throwable... thArr) {
        f165943b.b(5, str, str2, thArr);
    }

    public static void e(String str, String str2, Throwable... thArr) {
        f165943b.b(6, str, str2, thArr);
    }
}
