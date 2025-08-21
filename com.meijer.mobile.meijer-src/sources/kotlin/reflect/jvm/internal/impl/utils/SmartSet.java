package kotlin.reflect.jvm.internal.impl.utils;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.collections.AbstractMutableSet;
import kotlin.collections.ArraysKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.jvm.internal.markers.KMutableIterator;

@SourceDebugExtension
/* loaded from: classes14.dex */
public final class SmartSet<T> extends AbstractMutableSet<T> {

    /* renamed from: c, reason: collision with root package name */
    public static final Companion f148085c = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private Object f148086a;

    /* renamed from: b, reason: collision with root package name */
    private int f148087b;

    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final <T> SmartSet<T> a() {
            return new SmartSet<>(null);
        }

        @JvmStatic
        public final <T> SmartSet<T> b(Collection<? extends T> set) {
            Intrinsics.j(set, "set");
            SmartSet<T> smartSet = new SmartSet<>(null);
            smartSet.addAll(set);
            return smartSet;
        }
    }

    private static final class a<T> implements Iterator<T>, KMutableIterator {

        /* renamed from: a, reason: collision with root package name */
        private final Iterator<T> f148088a;

        public a(T[] array) {
            Intrinsics.j(array, "array");
            this.f148088a = ArrayIteratorKt.a(array);
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f148088a.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            return this.f148088a.next();
        }
    }

    private static final class b<T> implements Iterator<T>, KMutableIterator {

        /* renamed from: a, reason: collision with root package name */
        private final T f148089a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f148090b = true;

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f148090b;
        }

        @Override // java.util.Iterator
        public T next() {
            if (!this.f148090b) {
                throw new NoSuchElementException();
            }
            this.f148090b = false;
            return this.f148089a;
        }

        public b(T t10) {
            this.f148089a = t10;
        }
    }

    public /* synthetic */ SmartSet(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @JvmStatic
    public static final <T> SmartSet<T> f() {
        return f148085c.a();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f148086a = null;
        h(0);
    }

    private SmartSet() {
    }

    @Override // kotlin.collections.AbstractMutableSet
    public int a() {
        return this.f148087b;
    }

    public void h(int i10) {
        this.f148087b = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.AbstractCollection, java.util.LinkedHashSet] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(T t10) {
        Object[] objArr;
        if (size() == 0) {
            this.f148086a = t10;
        } else if (size() == 1) {
            if (Intrinsics.e(this.f148086a, t10)) {
                return false;
            }
            this.f148086a = new Object[]{this.f148086a, t10};
        } else if (size() < 5) {
            Object obj = this.f148086a;
            Intrinsics.h(obj, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            Object[] objArr2 = (Object[]) obj;
            if (ArraysKt.Y(objArr2, t10)) {
                return false;
            }
            if (size() == 4) {
                ?? F10 = SetsKt.f(Arrays.copyOf(objArr2, objArr2.length));
                F10.add(t10);
                objArr = F10;
            } else {
                Object[] objArrCopyOf = Arrays.copyOf(objArr2, size() + 1);
                Intrinsics.i(objArrCopyOf, "copyOf(...)");
                objArrCopyOf[objArrCopyOf.length - 1] = t10;
                objArr = objArrCopyOf;
            }
            this.f148086a = objArr;
        } else {
            Object obj2 = this.f148086a;
            Intrinsics.h(obj2, "null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>");
            if (!TypeIntrinsics.e(obj2).add(t10)) {
                return false;
            }
        }
        h(size() + 1);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (size() == 0) {
            return false;
        }
        if (size() == 1) {
            return Intrinsics.e(this.f148086a, obj);
        }
        if (size() < 5) {
            Object obj2 = this.f148086a;
            Intrinsics.h(obj2, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            return ArraysKt.Y((Object[]) obj2, obj);
        }
        Object obj3 = this.f148086a;
        Intrinsics.h(obj3, "null cannot be cast to non-null type kotlin.collections.Set<T of org.jetbrains.kotlin.utils.SmartSet>");
        return ((Set) obj3).contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<T> iterator() {
        if (size() == 0) {
            return Collections.EMPTY_SET.iterator();
        }
        if (size() == 1) {
            return new b(this.f148086a);
        }
        if (size() < 5) {
            Object obj = this.f148086a;
            Intrinsics.h(obj, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            return new a((Object[]) obj);
        }
        Object obj2 = this.f148086a;
        Intrinsics.h(obj2, "null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>");
        return TypeIntrinsics.e(obj2).iterator();
    }
}
