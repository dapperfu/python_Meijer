package kotlin.reflect.jvm.internal.impl.util;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* loaded from: classes13.dex */
public final class EmptyArrayMap extends ArrayMap {

    /* renamed from: a, reason: collision with root package name */
    public static final EmptyArrayMap f147067a = new EmptyArrayMap();

    /* renamed from: kotlin.reflect.jvm.internal.impl.util.EmptyArrayMap$iterator$1, reason: invalid class name */
    public static final class AnonymousClass1 implements Iterator, KMappedMarker {
        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void next() {
            throw new NoSuchElementException();
        }

        AnonymousClass1() {
        }
    }

    private EmptyArrayMap() {
        super(null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap
    public int a() {
        return 0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public Void get(int i10) {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap, java.lang.Iterable
    public Iterator iterator() {
        return new AnonymousClass1();
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public void f(int i10, Void value) {
        Intrinsics.j(value, "value");
        throw new IllegalStateException();
    }
}
