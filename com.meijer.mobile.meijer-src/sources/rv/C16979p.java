package rv;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0010\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\r\u0010\u000eR\u0011\u0010\u0012\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R!\u0010\u0015\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u00000\u0013j\b\u0012\u0004\u0012\u00028\u0000`\u00140\u00018\u0002X\u0082\u0004¨\u0006\u0016"}, d2 = {"Lrv/p;", "", "E", "", "singleConsumer", "<init>", "(Z)V", "", "b", "()V", "element", "a", "(Ljava/lang/Object;)Z", "e", "()Ljava/lang/Object;", "", "c", "()I", "size", "Lrv/q;", "Lkotlinx/coroutines/internal/Core;", "_cur", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: rv.p, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C16979p<E> {

    /* renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f159663a = AtomicReferenceFieldUpdater.newUpdater(C16979p.class, Object.class, "_cur$volatile");
    private volatile /* synthetic */ Object _cur$volatile;

    public C16979p(boolean z10) {
        this._cur$volatile = new C16980q(8, z10);
    }

    public final boolean a(E element) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f159663a;
        while (true) {
            C16980q c16980q = (C16980q) atomicReferenceFieldUpdater.get(this);
            int iA = c16980q.a(element);
            if (iA == 0) {
                return true;
            }
            if (iA != 1) {
                if (iA == 2) {
                    return false;
                }
            } else {
                androidx.concurrent.futures.b.a(f159663a, this, c16980q, c16980q.l());
            }
        }
    }

    public final void b() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f159663a;
        while (true) {
            C16980q c16980q = (C16980q) atomicReferenceFieldUpdater.get(this);
            if (c16980q.d()) {
                return;
            } else {
                androidx.concurrent.futures.b.a(f159663a, this, c16980q, c16980q.l());
            }
        }
    }

    public final int c() {
        return ((C16980q) f159663a.get(this)).g();
    }

    public final E e() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f159663a;
        while (true) {
            C16980q c16980q = (C16980q) atomicReferenceFieldUpdater.get(this);
            E e10 = (E) c16980q.m();
            if (e10 != C16980q.f159667h) {
                return e10;
            }
            androidx.concurrent.futures.b.a(f159663a, this, c16980q, c16980q.l());
        }
    }
}
