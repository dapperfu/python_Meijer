package n7;

import X6.j;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private final List<a<?>> f152097a = new ArrayList();

    private static final class a<T> {

        /* renamed from: a, reason: collision with root package name */
        private final Class<T> f152098a;

        /* renamed from: b, reason: collision with root package name */
        final j<T> f152099b;

        boolean a(Class<?> cls) {
            return this.f152098a.isAssignableFrom(cls);
        }

        a(Class<T> cls, j<T> jVar) {
            this.f152098a = cls;
            this.f152099b = jVar;
        }
    }

    public synchronized <Z> void a(Class<Z> cls, j<Z> jVar) {
        this.f152097a.add(new a<>(cls, jVar));
    }

    public synchronized <Z> j<Z> b(Class<Z> cls) {
        int size = this.f152097a.size();
        for (int i10 = 0; i10 < size; i10++) {
            a<?> aVar = this.f152097a.get(i10);
            if (aVar.a(cls)) {
                return (j<Z>) aVar.f152099b;
            }
        }
        return null;
    }
}
