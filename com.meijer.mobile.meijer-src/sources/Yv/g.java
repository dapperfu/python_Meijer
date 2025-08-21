package Yv;

import android.util.Log;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.OkHttpClient;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ3\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00042\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\n¢\u0006\u0004\b\u0014\u0010\u0003R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0017R \u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001a¨\u0006\u001c"}, d2 = {"LYv/g;", "", "<init>", "()V", "", "loggerName", "d", "(Ljava/lang/String;)Ljava/lang/String;", "logger", "tag", "", "c", "(Ljava/lang/String;Ljava/lang/String;)V", "", "logLevel", "message", "", "t", "a", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Throwable;)V", "b", "Ljava/util/concurrent/CopyOnWriteArraySet;", "Ljava/util/logging/Logger;", "Ljava/util/concurrent/CopyOnWriteArraySet;", "configuredLoggers", "", "Ljava/util/Map;", "knownLoggers", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final g f43312a = new g();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final CopyOnWriteArraySet<Logger> configuredLoggers = new CopyOnWriteArraySet<>();

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final Map<String, String> knownLoggers;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r22 = OkHttpClient.class.getPackage();
        String name = r22 != null ? r22.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        linkedHashMap.put(OkHttpClient.class.getName(), "okhttp.OkHttpClient");
        linkedHashMap.put(Uv.e.class.getName(), "okhttp.Http2");
        linkedHashMap.put(Qv.d.class.getName(), "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        knownLoggers = MapsKt.A(linkedHashMap);
    }

    private final String d(String loggerName) {
        String str = knownLoggers.get(loggerName);
        return str == null ? StringsKt.N1(loggerName, 23) : str;
    }

    public final void a(String loggerName, int logLevel, String message, Throwable t10) {
        int iMin;
        Intrinsics.j(loggerName, "loggerName");
        Intrinsics.j(message, "message");
        String strD = d(loggerName);
        if (Log.isLoggable(strD, logLevel)) {
            if (t10 != null) {
                message = message + '\n' + Log.getStackTraceString(t10);
            }
            String str = message;
            int length = str.length();
            int i10 = 0;
            while (i10 < length) {
                int iP0 = StringsKt.p0(str, '\n', i10, false, 4, null);
                if (iP0 == -1) {
                    iP0 = length;
                }
                while (true) {
                    iMin = Math.min(iP0, i10 + 4000);
                    String strSubstring = str.substring(i10, iMin);
                    Intrinsics.i(strSubstring, "substring(...)");
                    Log.println(logLevel, strD, strSubstring);
                    if (iMin >= iP0) {
                        break;
                    } else {
                        i10 = iMin;
                    }
                }
                i10 = iMin + 1;
            }
        }
    }

    public final void b() {
        try {
            for (Map.Entry<String, String> entry : knownLoggers.entrySet()) {
                c(entry.getKey(), entry.getValue());
            }
        } catch (RuntimeException e10) {
            e10.printStackTrace();
        }
    }

    private g() {
    }

    private final void c(String logger, String tag) throws SecurityException {
        Level level;
        Logger logger2 = Logger.getLogger(logger);
        if (configuredLoggers.add(logger2)) {
            logger2.setUseParentHandlers(false);
            if (Log.isLoggable(tag, 3)) {
                level = Level.FINE;
            } else if (Log.isLoggable(tag, 4)) {
                level = Level.INFO;
            } else {
                level = Level.WARNING;
            }
            logger2.setLevel(level);
            logger2.addHandler(h.f43315a);
        }
    }
}
