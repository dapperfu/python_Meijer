package eg;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes8.dex */
public class d {

    /* renamed from: b, reason: collision with root package name */
    private static volatile d f130161b;

    /* renamed from: a, reason: collision with root package name */
    private final Set<f> f130162a = new HashSet();

    public static d a() {
        d dVar;
        d dVar2 = f130161b;
        if (dVar2 != null) {
            return dVar2;
        }
        synchronized (d.class) {
            try {
                dVar = f130161b;
                if (dVar == null) {
                    dVar = new d();
                    f130161b = dVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return dVar;
    }

    Set<f> b() {
        Set<f> setUnmodifiableSet;
        synchronized (this.f130162a) {
            setUnmodifiableSet = Collections.unmodifiableSet(this.f130162a);
        }
        return setUnmodifiableSet;
    }

    d() {
    }
}
