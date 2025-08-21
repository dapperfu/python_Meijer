package x6;

import android.util.Log;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;

/* renamed from: x6.A, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C18095A {
    static void a(Exception exc) {
        try {
            if (z.f170622b.length() < 10000) {
                z.f170622b += ";" + S.c(b(exc));
            }
        } catch (Exception unused) {
        }
    }

    private static String b(Exception exc) {
        String stackTraceString = Log.getStackTraceString(exc);
        if (stackTraceString != null && stackTraceString.length() > 500) {
            return stackTraceString.substring(0, HttpResponseStatus.ERROR_INTERNAL_SERVER_ERROR);
        }
        return stackTraceString;
    }
}
