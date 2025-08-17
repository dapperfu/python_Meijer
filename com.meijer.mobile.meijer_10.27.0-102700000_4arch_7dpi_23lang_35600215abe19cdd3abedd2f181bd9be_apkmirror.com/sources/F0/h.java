package F0;

import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableListIterator;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010+\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001d\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\fJ\u000f\u0010\u000f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\fJ\u000f\u0010\u0010\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0016\u0010\fJ\u0017\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0017\u0010\u0015R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001c\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001e\u0010 \u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010\"\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\u001b¨\u0006#"}, d2 = {"LF0/h;", "T", "", "LF0/a;", "LF0/f;", "builder", "", "index", "<init>", "(LF0/f;I)V", "", "n", "()V", "o", "j", "k", "previous", "()Ljava/lang/Object;", "next", "element", "add", "(Ljava/lang/Object;)V", "remove", "set", "c", "LF0/f;", "d", "I", "expectedModCount", "LF0/k;", "e", "LF0/k;", "trieIterator", "f", "lastIteratedIndex", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class h<T> extends a<T> implements ListIterator<T>, KMutableListIterator {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final f<T> builder;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int expectedModCount;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private k<? extends T> trieIterator;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int lastIteratedIndex;

    private final void j() {
        if (this.expectedModCount != this.builder.n()) {
            throw new ConcurrentModificationException();
        }
    }

    private final void k() {
        if (this.lastIteratedIndex == -1) {
            throw new IllegalStateException();
        }
    }

    private final void n() {
        h(this.builder.size());
        this.expectedModCount = this.builder.n();
        this.lastIteratedIndex = -1;
        o();
    }

    private final void o() {
        Object[] objArrO = this.builder.getRoot();
        if (objArrO == null) {
            this.trieIterator = null;
            return;
        }
        int iD = l.d(this.builder.size());
        int iK = RangesKt.k(getIndex(), iD);
        int iP = (this.builder.getRootShift() / 5) + 1;
        k<? extends T> kVar = this.trieIterator;
        if (kVar == null) {
            this.trieIterator = new k<>(objArrO, iK, iD, iP);
        } else {
            Intrinsics.g(kVar);
            kVar.o(objArrO, iK, iD, iP);
        }
    }

    public h(f<T> fVar, int i10) {
        super(i10, fVar.size());
        this.builder = fVar;
        this.expectedModCount = fVar.n();
        this.lastIteratedIndex = -1;
        o();
    }

    @Override // F0.a, java.util.ListIterator
    public void add(T element) {
        j();
        this.builder.add(getIndex(), element);
        g(getIndex() + 1);
        n();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public T next() {
        j();
        a();
        this.lastIteratedIndex = getIndex();
        k<? extends T> kVar = this.trieIterator;
        if (kVar == null) {
            Object[] objArrQ = this.builder.getTail();
            int index = getIndex();
            g(index + 1);
            return (T) objArrQ[index];
        }
        if (kVar.hasNext()) {
            g(getIndex() + 1);
            return kVar.next();
        }
        Object[] objArrQ2 = this.builder.getTail();
        int index2 = getIndex();
        g(index2 + 1);
        return (T) objArrQ2[index2 - kVar.getSize()];
    }

    @Override // java.util.ListIterator
    public T previous() {
        j();
        c();
        this.lastIteratedIndex = getIndex() - 1;
        k<? extends T> kVar = this.trieIterator;
        if (kVar == null) {
            Object[] objArrQ = this.builder.getTail();
            g(getIndex() - 1);
            return (T) objArrQ[getIndex()];
        }
        if (getIndex() > kVar.getSize()) {
            Object[] objArrQ2 = this.builder.getTail();
            g(getIndex() - 1);
            return (T) objArrQ2[getIndex() - kVar.getSize()];
        }
        g(getIndex() - 1);
        return kVar.previous();
    }

    @Override // F0.a, java.util.ListIterator, java.util.Iterator
    public void remove() {
        j();
        k();
        this.builder.remove(this.lastIteratedIndex);
        if (this.lastIteratedIndex < getIndex()) {
            g(this.lastIteratedIndex);
        }
        n();
    }

    @Override // F0.a, java.util.ListIterator
    public void set(T element) {
        j();
        k();
        this.builder.set(this.lastIteratedIndex, element);
        this.expectedModCount = this.builder.n();
        o();
    }
}
