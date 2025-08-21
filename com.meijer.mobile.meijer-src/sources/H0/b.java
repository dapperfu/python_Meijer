package H0;

import E0.g;
import G0.d;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.AbstractSet;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010(\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u0000 $*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001%B/\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R&\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010#\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006&"}, d2 = {"LH0/b;", "E", "Lkotlin/collections/AbstractSet;", "LE0/g;", "", "firstElement", "lastElement", "LG0/d;", "LH0/a;", "hashMap", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;LG0/d;)V", "element", "", "contains", "(Ljava/lang/Object;)Z", "add", "(Ljava/lang/Object;)LE0/g;", "remove", "", "iterator", "()Ljava/util/Iterator;", "b", "Ljava/lang/Object;", "getFirstElement$runtime_release", "()Ljava/lang/Object;", "c", "getLastElement$runtime_release", "d", "LG0/d;", "getHashMap$runtime_release", "()LG0/d;", "", "f", "()I", "size", "e", "a", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class b<E> extends AbstractSet<E> implements g<E> {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: f, reason: collision with root package name */
    public static final int f13297f = 8;

    /* renamed from: g, reason: collision with root package name */
    private static final b f13298g;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Object firstElement;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Object lastElement;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final d<E, a> hashMap;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005\"\u0004\b\u0001\u0010\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LH0/b$a;", "", "<init>", "()V", "E", "LE0/g;", "a", "()LE0/g;", "LH0/b;", "", "EMPTY", "LH0/b;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: H0.b$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final <E> g<E> a() {
            return b.f13298g;
        }
    }

    static {
        I0.c cVar = I0.c.f14118a;
        f13298g = new b(cVar, cVar, d.INSTANCE.a());
    }

    @Override // java.util.Collection, java.util.Set, E0.g
    public g<E> add(E element) {
        if (this.hashMap.containsKey(element)) {
            return this;
        }
        if (isEmpty()) {
            return new b(element, element, this.hashMap.y(element, new a()));
        }
        Object obj = this.lastElement;
        Object obj2 = this.hashMap.get(obj);
        Intrinsics.g(obj2);
        return new b(this.firstElement, element, this.hashMap.y(obj, ((a) obj2).e(element)).y(element, new a(obj)));
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object element) {
        return this.hashMap.containsKey(element);
    }

    @Override // kotlin.collections.AbstractCollection
    /* renamed from: f */
    public int getSize() {
        return this.hashMap.size();
    }

    @Override // kotlin.collections.AbstractSet, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return new c(this.firstElement, this.hashMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Collection, java.util.Set, E0.g
    public g<E> remove(E element) {
        a aVar = this.hashMap.get(element);
        if (aVar == null) {
            return this;
        }
        d dVarA = this.hashMap.A(element);
        if (aVar.b()) {
            V v10 = dVarA.get(aVar.getPrevious());
            Intrinsics.g(v10);
            dVarA = dVarA.y(aVar.getPrevious(), ((a) v10).e(aVar.getNext()));
        }
        if (aVar.a()) {
            V v11 = dVarA.get(aVar.getNext());
            Intrinsics.g(v11);
            dVarA = dVarA.y(aVar.getNext(), ((a) v11).f(aVar.getPrevious()));
        }
        return new b(!aVar.b() ? aVar.getNext() : this.firstElement, !aVar.a() ? aVar.getPrevious() : this.lastElement, dVarA);
    }

    public b(Object obj, Object obj2, d<E, a> dVar) {
        this.firstElement = obj;
        this.lastElement = obj2;
        this.hashMap = dVar;
    }
}
