package cg;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes7.dex */
public class d {

    /* renamed from: b, reason: collision with root package name */
    private static volatile d f61779b;

    /* renamed from: a, reason: collision with root package name */
    private final Set<f> f61780a = new HashSet();

    public static d a() {
        d dVar;
        d dVar2 = f61779b;
        if (dVar2 != null) {
            return dVar2;
        }
        synchronized (d.class) {
            try {
                dVar = f61779b;
                if (dVar == null) {
                    dVar = new d();
                    f61779b = dVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return dVar;
    }

    Set<f> b() {
        Set<f> setUnmodifiableSet;
        synchronized (this.f61780a) {
            setUnmodifiableSet = Collections.unmodifiableSet(this.f61780a);
        }
        return setUnmodifiableSet;
    }

    d() {
    }
}
