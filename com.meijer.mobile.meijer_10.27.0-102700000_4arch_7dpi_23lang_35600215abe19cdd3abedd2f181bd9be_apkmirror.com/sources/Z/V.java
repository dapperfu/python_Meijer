package Z;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMutableIterator;
import kotlin.jvm.internal.markers.KMutableSet;
import kotlin.sequences.SequenceScope;
import kotlin.sequences.SequencesKt;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\b\b\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000e\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0016\u0010\u000bJ\u001d\u0010\u0017\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016¢\u0006\u0004\b\u0017\u0010\u000fJ\u001d\u0010\u0018\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016¢\u0006\u0004\b\u0018\u0010\u000fR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"LZ/V;", "E", "LZ/g0;", "", "LZ/U;", "parent", "<init>", "(LZ/U;)V", "element", "", "add", "(Ljava/lang/Object;)Z", "", "elements", "addAll", "(Ljava/util/Collection;)Z", "", "clear", "()V", "", "iterator", "()Ljava/util/Iterator;", "remove", "retainAll", "removeAll", "b", "LZ/U;", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class V<E> extends g0<E> implements Set<E>, KMutableSet {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final U<E> parent;

    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0010)\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010(\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\"\u0010\u0010\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000b\u0010\u000fR\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Z/V$a", "", "", "hasNext", "()Z", "next", "()Ljava/lang/Object;", "", "remove", "()V", "", "a", "I", "getCurrent", "()I", "(I)V", "current", "", "b", "Ljava/util/Iterator;", "getIterator", "()Ljava/util/Iterator;", "iterator", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Iterator<E>, KMutableIterator {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private int current = -1;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Iterator<E> iterator;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ V<E> f42051c;

        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "E", "Lkotlin/sequences/SequenceScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "androidx.collection.MutableOrderedSetWrapper$iterator$1$iterator$1", f = "OrderedScatterSet.kt", l = {1489}, m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: Z.V$a$a, reason: collision with other inner class name */
        static final class C0891a extends RestrictedSuspendLambda implements Function2<SequenceScope<? super E>, Continuation<? super Unit>, Object> {

            /* renamed from: b, reason: collision with root package name */
            Object f42052b;

            /* renamed from: c, reason: collision with root package name */
            Object f42053c;

            /* renamed from: d, reason: collision with root package name */
            Object f42054d;

            /* renamed from: e, reason: collision with root package name */
            int f42055e;

            /* renamed from: f, reason: collision with root package name */
            int f42056f;

            /* renamed from: g, reason: collision with root package name */
            private /* synthetic */ Object f42057g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ V<E> f42058h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ a f42059i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0891a(V<E> v10, a aVar, Continuation<? super C0891a> continuation) {
                super(2, continuation);
                this.f42058h = v10;
                this.f42059i = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C0891a c0891a = new C0891a(this.f42058h, this.f42059i, continuation);
                c0891a.f42057g = obj;
                return c0891a;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(SequenceScope<? super E> sequenceScope, Continuation<? super Unit> continuation) {
                return ((C0891a) create(sequenceScope, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                V<E> v10;
                int i10;
                a aVar;
                long[] jArr;
                SequenceScope sequenceScope;
                Object objF = IntrinsicsKt.f();
                int i11 = this.f42056f;
                if (i11 != 0) {
                    if (i11 == 1) {
                        i10 = this.f42055e;
                        jArr = (long[]) this.f42054d;
                        v10 = (V) this.f42053c;
                        aVar = (a) this.f42052b;
                        sequenceScope = (SequenceScope) this.f42057g;
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    SequenceScope sequenceScope2 = (SequenceScope) this.f42057g;
                    U u10 = ((V) this.f42058h).parent;
                    a aVar2 = this.f42059i;
                    v10 = this.f42058h;
                    long[] jArr2 = u10.nodes;
                    i10 = u10.tail;
                    aVar = aVar2;
                    jArr = jArr2;
                    sequenceScope = sequenceScope2;
                }
                while (i10 != Integer.MAX_VALUE) {
                    int i12 = (int) ((jArr[i10] >> 31) & 2147483647L);
                    aVar.a(i10);
                    Object obj2 = ((V) v10).parent.elements[i10];
                    this.f42057g = sequenceScope;
                    this.f42052b = aVar;
                    this.f42053c = v10;
                    this.f42054d = jArr;
                    this.f42055e = i12;
                    this.f42056f = 1;
                    if (sequenceScope.c(obj2, this) == objF) {
                        return objF;
                    }
                    i10 = i12;
                }
                return Unit.f142422a;
            }
        }

        a(V<E> v10) {
            this.f42051c = v10;
            this.iterator = SequencesKt.a(new C0891a(v10, this, null));
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
                ((V) this.f42051c).parent.z(this.current);
                this.current = -1;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(U<E> parent) {
        super(parent);
        Intrinsics.j(parent, "parent");
        this.parent = parent;
    }

    @Override // Z.g0, java.util.Set, java.util.Collection
    public boolean add(E element) {
        return this.parent.g(element);
    }

    @Override // Z.g0, java.util.Set, java.util.Collection
    public boolean addAll(Collection<? extends E> elements) {
        Intrinsics.j(elements, "elements");
        return this.parent.h(elements);
    }

    @Override // Z.g0, java.util.Set, java.util.Collection
    public void clear() {
        this.parent.k();
    }

    @Override // Z.g0, java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return new a(this);
    }

    @Override // Z.g0, java.util.Set, java.util.Collection
    public boolean remove(Object element) {
        return this.parent.x(element);
    }

    @Override // Z.g0, java.util.Set, java.util.Collection
    public boolean removeAll(Collection<? extends Object> elements) {
        Intrinsics.j(elements, "elements");
        return this.parent.y(elements);
    }

    @Override // Z.g0, java.util.Set, java.util.Collection
    public boolean retainAll(Collection<? extends Object> elements) {
        Intrinsics.j(elements, "elements");
        return this.parent.B(elements);
    }
}
