package kotlin.reflect.jvm.internal.impl.util;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* loaded from: classes14.dex */
public final class OneElementArrayMap<T> extends ArrayMap<T> {

    /* renamed from: a, reason: collision with root package name */
    private final T f147979a;

    /* renamed from: b, reason: collision with root package name */
    private final int f147980b;

    /* renamed from: kotlin.reflect.jvm.internal.impl.util.OneElementArrayMap$iterator$1, reason: invalid class name */
    public static final class AnonymousClass1 implements Iterator<T>, KMappedMarker {

        /* renamed from: a, reason: collision with root package name */
        private boolean f147981a = true;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ OneElementArrayMap<T> f147982b;

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        AnonymousClass1(OneElementArrayMap<T> oneElementArrayMap) {
            this.f147982b = oneElementArrayMap;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f147981a;
        }

        @Override // java.util.Iterator
        public T next() {
            if (!this.f147981a) {
                throw new NoSuchElementException();
            }
            this.f147981a = false;
            return this.f147982b.k();
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap
    public int a() {
        return 1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneElementArrayMap(T value, int i10) {
        super(null);
        Intrinsics.j(value, "value");
        this.f147979a = value;
        this.f147980b = i10;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap
    public void f(int i10, T value) {
        Intrinsics.j(value, "value");
        throw new IllegalStateException();
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap
    public T get(int i10) {
        if (i10 == this.f147980b) {
            return this.f147979a;
        }
        return null;
    }

    public final int h() {
        return this.f147980b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap, java.lang.Iterable
    public Iterator<T> iterator() {
        return new AnonymousClass1(this);
    }

    public final T k() {
        return this.f147979a;
    }
}
