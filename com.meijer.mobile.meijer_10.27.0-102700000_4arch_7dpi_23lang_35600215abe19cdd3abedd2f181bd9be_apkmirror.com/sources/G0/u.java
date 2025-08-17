package G0;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\b \u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u0001*\u0006\b\u0002\u0010\u0003 \u00012\b\u0012\u0004\u0012\u00028\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J-\u0010\u000e\u001a\u00020\r2\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0010\u001a\u00020\r2\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00028\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\r¢\u0006\u0004\b\u0017\u0010\u0006J\r\u0010\u0018\u001a\u00020\u0012¢\u0006\u0004\b\u0018\u0010\u0014J\u001d\u0010\u001a\u001a\u0012\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00028\u00010\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\r¢\u0006\u0004\b\u001c\u0010\u0006J\u0010\u0010\u001d\u001a\u00020\u0012H\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u0014R4\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u000e\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00078\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\b\u0015\u0010\u001f\u001a\u0004\b \u0010!R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\"\u0010\f\u001a\u00020\n8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u0006("}, d2 = {"LG0/u;", "K", "V", "T", "", "<init>", "()V", "", "", "buffer", "", "dataSize", "index", "", "o", "([Ljava/lang/Object;II)V", "n", "([Ljava/lang/Object;I)V", "", "g", "()Z", "a", "()Ljava/lang/Object;", "j", "h", "LG0/t;", "c", "()LG0/t;", "k", "hasNext", "<set-?>", "[Ljava/lang/Object;", "d", "()[Ljava/lang/Object;", "b", "I", "f", "()I", "p", "(I)V", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class u<K, V, T> implements Iterator<T>, KMappedMarker {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private Object[] buffer = t.INSTANCE.a().getBuffer();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int dataSize;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int index;

    public final void n(Object[] buffer, int dataSize) {
        o(buffer, dataSize, 0);
    }

    /* renamed from: d, reason: from getter */
    protected final Object[] getBuffer() {
        return this.buffer;
    }

    /* renamed from: f, reason: from getter */
    protected final int getIndex() {
        return this.index;
    }

    public final boolean g() {
        return this.index < this.dataSize;
    }

    public final boolean h() {
        I0.a.a(this.index >= this.dataSize);
        return this.index < this.buffer.length;
    }

    public final void o(Object[] buffer, int dataSize, int index) {
        this.buffer = buffer;
        this.dataSize = dataSize;
        this.index = index;
    }

    protected final void p(int i10) {
        this.index = i10;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final K a() {
        I0.a.a(g());
        return (K) this.buffer[this.index];
    }

    public final t<? extends K, ? extends V> c() {
        I0.a.a(h());
        Object obj = this.buffer[this.index];
        Intrinsics.h(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>");
        return (t) obj;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return g();
    }

    public final void j() {
        I0.a.a(g());
        this.index += 2;
    }

    public final void k() {
        I0.a.a(h());
        this.index++;
    }
}
