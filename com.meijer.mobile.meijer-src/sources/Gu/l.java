package Gu;

import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes8.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    private static final Logger f13258a = Logger.getLogger(l.class.getName());

    /* renamed from: b, reason: collision with root package name */
    private static final m f13259b = b(m.class.getClassLoader());

    public static k a() {
        return f13259b.a();
    }

    static m b(ClassLoader classLoader) {
        try {
            return (m) Eu.a.a(Class.forName("io.opencensus.impl.tags.TagsComponentImpl", true, classLoader), m.class);
        } catch (ClassNotFoundException e10) {
            f13258a.log(Level.FINE, "Couldn't load full implementation for TagsComponent, now trying to load lite implementation.", (Throwable) e10);
            try {
                return (m) Eu.a.a(Class.forName("io.opencensus.impllite.tags.TagsComponentImplLite", true, classLoader), m.class);
            } catch (ClassNotFoundException e11) {
                f13258a.log(Level.FINE, "Couldn't load lite implementation for TagsComponent, now using default implementation for TagsComponent.", (Throwable) e11);
                return d.d();
            }
        }
    }

    private l() {
    }
}
