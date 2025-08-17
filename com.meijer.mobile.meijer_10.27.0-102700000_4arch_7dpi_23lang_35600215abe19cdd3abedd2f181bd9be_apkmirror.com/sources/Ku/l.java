package Ku;

import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes7.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    private static final Logger f17575a = Logger.getLogger(l.class.getName());

    /* renamed from: b, reason: collision with root package name */
    private static final m f17576b = b(m.class.getClassLoader());

    public static k a() {
        return f17576b.a();
    }

    static m b(ClassLoader classLoader) {
        try {
            return (m) Iu.a.a(Class.forName("io.opencensus.impl.tags.TagsComponentImpl", true, classLoader), m.class);
        } catch (ClassNotFoundException e10) {
            f17575a.log(Level.FINE, "Couldn't load full implementation for TagsComponent, now trying to load lite implementation.", (Throwable) e10);
            try {
                return (m) Iu.a.a(Class.forName("io.opencensus.impllite.tags.TagsComponentImplLite", true, classLoader), m.class);
            } catch (ClassNotFoundException e11) {
                f17575a.log(Level.FINE, "Couldn't load lite implementation for TagsComponent, now using default implementation for TagsComponent.", (Throwable) e11);
                return d.d();
            }
        }
    }

    private l() {
    }
}
