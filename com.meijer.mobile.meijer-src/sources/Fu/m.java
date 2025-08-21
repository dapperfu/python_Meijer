package Fu;

import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes8.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    private static final Logger f10956a = Logger.getLogger(m.class.getName());

    /* renamed from: b, reason: collision with root package name */
    private static final n f10957b = c(n.class.getClassLoader());

    public static o a() {
        return f10957b.a();
    }

    public static q b() {
        return f10957b.b();
    }

    static n c(ClassLoader classLoader) {
        try {
            return (n) Eu.a.a(Class.forName("io.opencensus.impl.stats.StatsComponentImpl", true, classLoader), n.class);
        } catch (ClassNotFoundException e10) {
            f10956a.log(Level.FINE, "Couldn't load full implementation for StatsComponent, now trying to load lite implementation.", (Throwable) e10);
            try {
                return (n) Eu.a.a(Class.forName("io.opencensus.impllite.stats.StatsComponentImplLite", true, classLoader), n.class);
            } catch (ClassNotFoundException e11) {
                f10956a.log(Level.FINE, "Couldn't load lite implementation for StatsComponent, now using default implementation for StatsComponent.", (Throwable) e11);
                return l.c();
            }
        }
    }

    private m() {
    }
}
