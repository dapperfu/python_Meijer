package j2;

import android.os.Build;
import android.os.Trace;
import com.fullstory.FS;
import java.lang.reflect.Method;

@Deprecated
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    private static long f139180a;

    /* renamed from: b, reason: collision with root package name */
    private static Method f139181b;

    /* renamed from: c, reason: collision with root package name */
    private static Method f139182c;

    /* renamed from: d, reason: collision with root package name */
    private static Method f139183d;

    /* renamed from: e, reason: collision with root package name */
    private static Method f139184e;

    static {
        if (Build.VERSION.SDK_INT < 29) {
            try {
                f139180a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                Class cls = Long.TYPE;
                f139181b = Trace.class.getMethod("isTagEnabled", cls);
                Class cls2 = Integer.TYPE;
                f139182c = Trace.class.getMethod("asyncTraceBegin", cls, String.class, cls2);
                f139183d = Trace.class.getMethod("asyncTraceEnd", cls, String.class, cls2);
                f139184e = Trace.class.getMethod("traceCounter", cls, String.class, cls2);
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
