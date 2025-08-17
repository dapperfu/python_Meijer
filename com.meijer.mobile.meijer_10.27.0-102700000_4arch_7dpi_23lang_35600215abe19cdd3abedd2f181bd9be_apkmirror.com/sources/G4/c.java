package G4;

import android.os.Trace;

/* loaded from: classes4.dex */
final class c {
    public static void d(String str, int i10) {
        Trace.setCounter(str, i10);
    }

    public static void a(String str, int i10) {
        Trace.beginAsyncSection(str, i10);
    }

    public static void b(String str, int i10) {
        Trace.endAsyncSection(str, i10);
    }

    public static boolean c() {
        return Trace.isEnabled();
    }
}
