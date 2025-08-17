package Ju;

import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes7.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    private static final Logger f16157a = Logger.getLogger(m.class.getName());

    /* renamed from: b, reason: collision with root package name */
    private static final n f16158b = c(n.class.getClassLoader());

    public static o a() {
        return f16158b.a();
    }

    public static q b() {
        return f16158b.b();
    }

    static n c(ClassLoader classLoader) {
        try {
            return (n) Iu.a.a(Class.forName("io.opencensus.impl.stats.StatsComponentImpl", true, classLoader), n.class);
        } catch (ClassNotFoundException e10) {
            f16157a.log(Level.FINE, "Couldn't load full implementation for StatsComponent, now trying to load lite implementation.", (Throwable) e10);
            try {
                return (n) Iu.a.a(Class.forName("io.opencensus.impllite.stats.StatsComponentImplLite", true, classLoader), n.class);
            } catch (ClassNotFoundException e11) {
                f16157a.log(Level.FINE, "Couldn't load lite implementation for StatsComponent, now using default implementation for StatsComponent.", (Throwable) e11);
                return l.c();
            }
        }
    }

    private m() {
    }
}
