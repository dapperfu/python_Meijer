package l7;

import V6.j;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private final List<a<?>> f148700a = new ArrayList();

    private static final class a<T> {

        /* renamed from: a, reason: collision with root package name */
        private final Class<T> f148701a;

        /* renamed from: b, reason: collision with root package name */
        final j<T> f148702b;

        boolean a(Class<?> cls) {
            return this.f148701a.isAssignableFrom(cls);
        }

        a(Class<T> cls, j<T> jVar) {
            this.f148701a = cls;
            this.f148702b = jVar;
        }
    }

    public synchronized <Z> void a(Class<Z> cls, j<Z> jVar) {
        this.f148700a.add(new a<>(cls, jVar));
    }

    public synchronized <Z> j<Z> b(Class<Z> cls) {
        int size = this.f148700a.size();
        for (int i10 = 0; i10 < size; i10++) {
            a<?> aVar = this.f148700a.get(i10);
            if (aVar.a(cls)) {
                return (j<Z>) aVar.f148702b;
            }
        }
        return null;
    }
}
