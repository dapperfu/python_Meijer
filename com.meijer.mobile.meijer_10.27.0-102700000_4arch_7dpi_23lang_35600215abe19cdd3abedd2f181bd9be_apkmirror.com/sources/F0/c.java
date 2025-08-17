package F0;

import java.util.NoSuchElementException;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\f\u0010\u000bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\bX\u0088\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LF0/c;", "T", "LF0/a;", "", "buffer", "", "index", "size", "<init>", "([Ljava/lang/Object;II)V", "next", "()Ljava/lang/Object;", "previous", "c", "[Ljava/lang/Object;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class c<T> extends a<T> {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final T[] buffer;

    public c(T[] tArr, int i10, int i11) {
        super(i10, i11);
        this.buffer = tArr;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public T next() {
        if (hasNext()) {
            T[] tArr = this.buffer;
            int index = getIndex();
            g(index + 1);
            return tArr[index];
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public T previous() {
        if (hasPrevious()) {
            T[] tArr = this.buffer;
            g(getIndex() - 1);
            return tArr[getIndex()];
        }
        throw new NoSuchElementException();
    }
}
