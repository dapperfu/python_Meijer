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
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.sequences.SequenceScope;
import kotlin.sequences.SequencesKt;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0012\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\t2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u000eJ\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0019¨\u0006!"}, d2 = {"LZ/g0;", "E", "", "LZ/e0;", "parent", "<init>", "(LZ/e0;)V", "", "elements", "", "containsAll", "(Ljava/util/Collection;)Z", "element", "contains", "(Ljava/lang/Object;)Z", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "", "other", "equals", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "LZ/e0;", "f", "size", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
class g0<E> implements Set<E>, KMappedMarker {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final e0<E> parent;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "E", "Lkotlin/sequences/SequenceScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.collection.OrderedSetWrapper$iterator$1", f = "OrderedScatterSet.kt", l = {1454}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class a extends RestrictedSuspendLambda implements Function2<SequenceScope<? super E>, Continuation<? super Unit>, Object> {

        /* renamed from: b, reason: collision with root package name */
        Object f43450b;

        /* renamed from: c, reason: collision with root package name */
        Object f43451c;

        /* renamed from: d, reason: collision with root package name */
        int f43452d;

        /* renamed from: e, reason: collision with root package name */
        int f43453e;

        /* renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f43454f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ g0<E> f43455g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(g0<E> g0Var, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f43455g = g0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.f43455g, continuation);
            aVar.f43454f = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(SequenceScope<? super E> sequenceScope, Continuation<? super Unit> continuation) {
            return ((a) create(sequenceScope, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i10;
            Object[] objArr;
            long[] jArr;
            SequenceScope sequenceScope;
            Object objF = IntrinsicsKt.f();
            int i11 = this.f43453e;
            if (i11 != 0) {
                if (i11 == 1) {
                    i10 = this.f43452d;
                    jArr = (long[]) this.f43451c;
                    objArr = (Object[]) this.f43450b;
                    sequenceScope = (SequenceScope) this.f43454f;
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                SequenceScope sequenceScope2 = (SequenceScope) this.f43454f;
                e0 e0Var = ((g0) this.f43455g).parent;
                Object[] objArr2 = e0Var.elements;
                long[] jArr2 = e0Var.nodes;
                i10 = e0Var.tail;
                objArr = objArr2;
                jArr = jArr2;
                sequenceScope = sequenceScope2;
            }
            while (i10 != Integer.MAX_VALUE) {
                int i12 = (int) ((jArr[i10] >> 31) & 2147483647L);
                Object obj2 = objArr[i10];
                this.f43454f = sequenceScope;
                this.f43450b = objArr;
                this.f43451c = jArr;
                this.f43452d = i12;
                this.f43453e = 1;
                if (sequenceScope.c(obj2, this) == objF) {
                    return objF;
                }
                i10 = i12;
            }
            return Unit.f143329a;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return CollectionToArray.a(this);
    }

    public g0(e0<E> parent) {
        Intrinsics.j(parent, "parent");
        this.parent = parent;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean add(E e10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object element) {
        return this.parent.a(element);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection<? extends Object> elements) {
        Intrinsics.j(elements, "elements");
        Iterator<T> it = elements.iterator();
        while (it.hasNext()) {
            if (!this.parent.a(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || getClass() != other.getClass()) {
            return false;
        }
        return Intrinsics.e(this.parent, ((g0) other).parent);
    }

    public int f() {
        return this.parent._size;
    }

    @Override // java.util.Set, java.util.Collection
    public int hashCode() {
        return this.parent.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.parent.d();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return SequencesKt.a(new a(this, null));
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public <T> T[] toArray(T[] array) {
        Intrinsics.j(array, "array");
        return (T[]) CollectionToArray.b(this, array);
    }

    public String toString() {
        return this.parent.toString();
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return f();
    }
}
