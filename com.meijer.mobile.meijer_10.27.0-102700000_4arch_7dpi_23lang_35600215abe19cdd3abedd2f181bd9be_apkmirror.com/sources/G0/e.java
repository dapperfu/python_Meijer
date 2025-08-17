package G0;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0010\b \u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u00028\u00020\u0004B;\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u001e\u0010\t\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00028\u0002H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u0015R2\u0010\t\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\b0\u00078\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\"\u0010#\u001a\u00020\f8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001c\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b\u0014\u0010$\u0012\u0004\b%\u0010\u0012¨\u0006&"}, d2 = {"LG0/e;", "K", "V", "T", "", "LG0/t;", "node", "", "LG0/u;", "path", "<init>", "(LG0/t;[LG0/u;)V", "", "pathIndex", "g", "(I)I", "", "d", "()V", "a", "c", "()Ljava/lang/Object;", "", "hasNext", "()Z", "next", "[LG0/u;", "f", "()[LG0/u;", "b", "I", "getPathLastIndex", "()I", "h", "(I)V", "pathLastIndex", "Z", "getHasNext$annotations", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class e<K, V, T> implements Iterator<T>, KMappedMarker {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final u<K, V, T>[] path;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int pathLastIndex;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean hasNext = true;

    private final void d() {
        if (this.path[this.pathLastIndex].g()) {
            return;
        }
        for (int i10 = this.pathLastIndex; -1 < i10; i10--) {
            int iG = g(i10);
            if (iG == -1 && this.path[i10].h()) {
                this.path[i10].k();
                iG = g(i10);
            }
            if (iG != -1) {
                this.pathLastIndex = iG;
                return;
            }
            if (i10 > 0) {
                this.path[i10 - 1].k();
            }
            this.path[i10].n(t.INSTANCE.a().getBuffer(), 0);
        }
        this.hasNext = false;
    }

    private final int g(int pathIndex) {
        if (this.path[pathIndex].g()) {
            return pathIndex;
        }
        if (!this.path[pathIndex].h()) {
            return -1;
        }
        t<? extends K, ? extends V> tVarC = this.path[pathIndex].c();
        if (pathIndex == 6) {
            this.path[pathIndex + 1].n(tVarC.getBuffer(), tVarC.getBuffer().length);
        } else {
            this.path[pathIndex + 1].n(tVarC.getBuffer(), tVarC.m() * 2);
        }
        return g(pathIndex + 1);
    }

    protected final u<K, V, T>[] f() {
        return this.path;
    }

    protected final void h(int i10) {
        this.pathLastIndex = i10;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.hasNext;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public e(t<K, V> tVar, u<K, V, T>[] uVarArr) {
        this.path = uVarArr;
        uVarArr[0].n(tVar.getBuffer(), tVar.m() * 2);
        this.pathLastIndex = 0;
        d();
    }

    private final void a() {
        if (hasNext()) {
        } else {
            throw new NoSuchElementException();
        }
    }

    protected final K c() {
        a();
        return this.path[this.pathLastIndex].a();
    }

    @Override // java.util.Iterator
    public T next() {
        a();
        T next = this.path[this.pathLastIndex].next();
        d();
        return next;
    }
}
