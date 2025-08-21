package j2;

import android.os.Build;
import android.os.Trace;
import com.fullstory.FS;
import java.lang.reflect.Method;

@Deprecated
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    private static long f139770a;

    /* renamed from: b, reason: collision with root package name */
    private static Method f139771b;

    /* renamed from: c, reason: collision with root package name */
    private static Method f139772c;

    /* renamed from: d, reason: collision with root package name */
    private static Method f139773d;

    /* renamed from: e, reason: collision with root package name */
    private static Method f139774e;

    static {
        if (Build.VERSION.SDK_INT < 29) {
            try {
                f139770a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                Class cls = Long.TYPE;
                f139771b = Trace.class.getMethod("isTagEnabled", cls);
                Class cls2 = Integer.TYPE;
                f139772c = Trace.class.getMethod("asyncTraceBegin", cls, String.class, cls2);
                f139773d = Trace.class.getMethod("asyncTraceEnd", cls, String.class, cls2);
                f139774e = Trace.class.getMethod("traceCounter", cls, String.class, cls2);
            } catch (Exception e10) {
                FS.log_i("TraceCompat", "Unable to initialize via reflection.", e10);
            }
        }
    }

    public static void a(String str) {
        Trace.beginSection(str);
    }

    public static void b() {
        Trace.endSection();
    }
}
