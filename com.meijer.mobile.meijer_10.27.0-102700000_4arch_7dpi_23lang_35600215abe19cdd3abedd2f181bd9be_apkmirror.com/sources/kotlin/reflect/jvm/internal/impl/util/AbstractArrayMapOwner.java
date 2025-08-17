package kotlin.reflect.jvm.internal.impl.util;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.reflect.KClass;

/* loaded from: classes13.dex */
public abstract class AbstractArrayMapOwner<K, V> implements Iterable<V>, KMappedMarker {

    public static abstract class AbstractArrayMapAccessor<K, V, T extends V> {

        /* renamed from: a, reason: collision with root package name */
        private final int f147048a;

        protected final T a(AbstractArrayMapOwner<K, V> thisRef) {
            Intrinsics.j(thisRef, "thisRef");
            return thisRef.a().get(this.f147048a);
        }

        public AbstractArrayMapAccessor(int i10) {
            this.f147048a = i10;
        }
    }

    protected abstract ArrayMap<V> a();

    protected abstract TypeRegistry<K, V> f();

    protected abstract void h(String str, V v10);

    protected final void k(KClass<? extends K> tClass, V value) {
        Intrinsics.j(tClass, "tClass");
        Intrinsics.j(value, "value");
        String strT = tClass.t();
        Intrinsics.g(strT);
        h(strT, value);
    }

    public final boolean isEmpty() {
        if (a().a() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Iterable
    public final Iterator<V> iterator() {
        return a().iterator();
    }
}
