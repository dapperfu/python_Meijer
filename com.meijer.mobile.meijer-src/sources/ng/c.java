package ng;

import android.os.Trace;

/* loaded from: classes8.dex */
public final class c {
    public static void a() {
        Trace.endSection();
    }

    public static void b(String str) {
        Trace.beginSection(str);
    }
}
