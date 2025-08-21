package Z;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMutableIterator;
import kotlin.jvm.internal.markers.KMutableSet;
import kotlin.sequences.SequenceScope;
import kotlin.sequences.SequencesKt;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\b\b\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000e\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0016\u0010\u000bJ\u001d\u0010\u0017\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016¢\u0006\u0004\b\u0017\u0010\u000fJ\u001d\u0010\u0018\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016¢\u0006\u0004\b\u0018\u0010\u000fR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"LZ/Y;", "E", "LZ/l0;", "", "LZ/X;", "parent", "<init>", "(LZ/X;)V", "element", "", "add", "(Ljava/lang/Object;)Z", "", "elements", "addAll", "(Ljava/util/Collection;)Z", "", "clear", "()V", "", "iterator", "()Ljava/util/Iterator;", "remove", "retainAll", "removeAll", "b", "LZ/X;", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class Y<E> extends l0<E> implements Set<E>, KMutableSet {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final X<E> parent;

    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0010)\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010(\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\"\u0010\u0010\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000b\u0010\u000fR\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Z/Y$a", "", "", "hasNext", "()Z", "next", "()Ljava/lang/Object;", "", "remove", "()V", "", "a", "I", "getCurrent", "()I", "(I)V", "current", "", "b", "Ljava/util/Iterator;", "getIterator", "()Ljava/util/Iterator;", "iterator", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Iterator<E>, KMutableIterator {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private int current = -1;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Iterator<E> iterator;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Y<E> f43386c;

        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "E", "Lkotlin/sequences/SequenceScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "androidx.collection.MutableSetWrapper$iterator$1$iterator$1", f = "ScatterSet.kt", l = {1188}, m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: Z.Y$a$a, reason: collision with other inner class name */
        static final class C0919a extends RestrictedSuspendLambda implements Function2<SequenceScope<? super E>, Continuation<? super Unit>, Object> {

            /* renamed from: b, reason: collision with root package name */
            Object f43387b;

            /* renamed from: c, reason: collision with root package name */
            Object f43388c;

            /* renamed from: d, reason: collision with root package name */
            Object f43389d;

            /* renamed from: e, reason: collision with root package name */
            int f43390e;

            /* renamed from: f, reason: collision with root package name */
            int f43391f;

            /* renamed from: g, reason: collision with root package name */
            int f43392g;

            /* renamed from: h, reason: collision with root package name */
            int f43393h;

            /* renamed from: i, reason: collision with root package name */
            long f43394i;

            /* renamed from: j, reason: collision with root package name */
            int f43395j;

            /* renamed from: k, reason: collision with root package name */
            private /* synthetic */ Object f43396k;

            /* renamed from: l, reason: collision with root package name */
            final /* synthetic */ Y<E> f43397l;

            /* renamed from: m, reason: collision with root package name */
            final /* synthetic */ a f43398m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0919a(Y<E> y10, a aVar, Continuation<? super C0919a> continuation) {
                super(2, continuation);
                this.f43397l = y10;
                this.f43398m = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C0919a c0919a = new C0919a(this.f43397l, this.f43398m, continuation);
                c0919a.f43396k = obj;
                return c0919a;
            }

            /* JADX WARN: Removed duplicated region for block: B:13:0x005f  */
            /* JADX WARN: Removed duplicated region for block: B:15:0x0075  */
            /* JADX WARN: Removed duplicated region for block: B:21:0x00aa  */
            /* JADX WARN: Removed duplicated region for block: B:24:0x00b5  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x005d -> B:23:0x00b3). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x005f -> B:14:0x0073). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x007c -> B:20:0x00a7). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x00a4 -> B:20:0x00a7). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r22) {
                /*
                    Method dump skipped, instructions count: 187
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: Z.Y.a.C0919a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(SequenceScope<? super E> sequenceScope, Continuation<? super Unit> continuation) {
                return ((C0919a) create(sequenceScope, continuation)).invokeSuspend(Unit.f143329a);
            }
        }

        a(Y<E> y10) {
            this.f43386c = y10;
            this.iterator = SequencesKt.a(new C0919a(y10, this, null));
        }

        public final void a(int i10) {
            this.current = i10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.iterator.hasNext();
        }

        @Override // java.util.Iterator
        public E next() {
            return this.iterator.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (this.current != -1) {
                ((Y) this.f43386c).parent.A(this.current);
                this.current = -1;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(X<E> parent) {
        super(parent);
        Intrinsics.j(parent, "parent");
        this.parent = parent;
    }

    @Override // Z.l0, java.util.Set, java.util.Collection
    public boolean add(E element) {
        return this.parent.h(element);
    }

    @Override // Z.l0, java.util.Set, java.util.Collection
    public boolean addAll(Collection<? extends E> elements) {
        Intrinsics.j(elements, "elements");
        return this.parent.j(elements);
    }

    @Override // Z.l0, java.util.Set, java.util.Collection
    public void clear() {
        this.parent.m();
    }

    @Override // Z.l0, java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return new a(this);
    }

    @Override // Z.l0, java.util.Set, java.util.Collection
    public boolean remove(Object element) {
        return this.parent.y(element);
    }

    @Override // Z.l0, java.util.Set, java.util.Collection
    public boolean removeAll(Collection<? extends Object> elements) {
        Intrinsics.j(elements, "elements");
        return this.parent.z(elements);
    }

    @Override // Z.l0, java.util.Set, java.util.Collection
    public boolean retainAll(Collection<? extends Object> elements) {
        Intrinsics.j(elements, "elements");
        return this.parent.C(elements);
    }
}
