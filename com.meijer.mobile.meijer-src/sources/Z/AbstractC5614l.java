package Z;

import a0.C5640d;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMutableIterator;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010)\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b \u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u0003H$¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0003H$¢\u0006\u0004\b\u000b\u0010\u0006J\u0010\u0010\r\u001a\u00020\fH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0013R\u0016\u0010\u0007\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u0016\u0010\u0017\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0016¨\u0006\u0018"}, d2 = {"LZ/l;", "T", "", "", "startingSize", "<init>", "(I)V", "index", "a", "(I)Ljava/lang/Object;", "", "c", "", "hasNext", "()Z", "next", "()Ljava/lang/Object;", "remove", "()V", "I", "size", "b", "Z", "canRemove", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: Z.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5614l<T> implements Iterator<T>, KMutableIterator {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int size;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int index;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean canRemove;

    protected abstract T a(int index);

    protected abstract void c(int index);

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.index < this.size;
    }

    @Override // java.util.Iterator
    public void remove() {
        if (!this.canRemove) {
            C5640d.b("Call next() before removing an element.");
        }
        int i10 = this.index - 1;
        this.index = i10;
        c(i10);
        this.size--;
        this.canRemove = false;
    }

    public AbstractC5614l(int i10) {
        this.size = i10;
    }

    @Override // java.util.Iterator
    public T next() {
        if (hasNext()) {
            T tA = a(this.index);
            this.index++;
            this.canRemove = true;
            return tA;
        }
        throw new NoSuchElementException();
    }
}
