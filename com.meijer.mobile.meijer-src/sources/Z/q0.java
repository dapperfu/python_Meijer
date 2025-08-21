package Z;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0003\u001a\u001d\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a#\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"T", "LZ/o0;", "Lkotlin/collections/IntIterator;", "a", "(LZ/o0;)Lkotlin/collections/IntIterator;", "", "b", "(LZ/o0;)Ljava/util/Iterator;", "collection"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class q0 {

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\r\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Z/q0$a", "Lkotlin/collections/IntIterator;", "", "hasNext", "()Z", "", "nextInt", "()I", "a", "I", "getIndex", "setIndex", "(I)V", "index", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends IntIterator {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private int index;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ o0<T> f43524b;

        a(o0<T> o0Var) {
            this.f43524b = o0Var;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.index < this.f43524b.m();
        }

        @Override // kotlin.collections.IntIterator
        public int nextInt() {
            o0<T> o0Var = this.f43524b;
            int i10 = this.index;
            this.index = i10 + 1;
            return o0Var.i(i10);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0010(\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Z/q0$b", "", "", "hasNext", "()Z", "next", "()Ljava/lang/Object;", "", "a", "I", "getIndex", "()I", "setIndex", "(I)V", "index", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b<T> implements Iterator<T>, KMappedMarker {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private int index;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ o0<T> f43526b;

        b(o0<T> o0Var) {
            this.f43526b = o0Var;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.index < this.f43526b.m();
        }

        @Override // java.util.Iterator
        public T next() {
            o0<T> o0Var = this.f43526b;
            int i10 = this.index;
            this.index = i10 + 1;
            return o0Var.n(i10);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public static final <T> IntIterator a(o0<T> o0Var) {
        Intrinsics.j(o0Var, "<this>");
        return new a(o0Var);
    }

    public static final <T> Iterator<T> b(o0<T> o0Var) {
        Intrinsics.j(o0Var, "<this>");
        return new b(o0Var);
    }
}
