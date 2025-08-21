package rv;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference0Impl;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.C15787T;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\t\u001a\u00060\u0000j\u0002`\u00072\n\u0010\b\u001a\u00060\u0000j\u0002`\u0007H\u0082\u0010¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\r\u001a\u00020\f2\n\u0010\u000b\u001a\u00060\u0000j\u0002`\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u000f\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u0007H\u0082\u0010¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\u00122\n\u0010\u0011\u001a\u00060\u0000j\u0002`\u0007¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0017\u001a\u00020\u00122\n\u0010\u0011\u001a\u00060\u0000j\u0002`\u00072\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u0015¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\u001c\u001a\u00020\u00122\n\u0010\u0011\u001a\u00060\u0000j\u0002`\u00072\n\u0010\u000b\u001a\u00060\u0000j\u0002`\u0007H\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u0007H\u0001¢\u0006\u0004\b \u0010\u0010J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\u001fR\u0011\u0010\u000b\u001a\u00020\u00018F¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0015\u0010)\u001a\u00060\u0000j\u0002`\u00078F¢\u0006\u0006\u001a\u0004\b(\u0010\u0010R\u0015\u0010+\u001a\u00060\u0000j\u0002`\u00078F¢\u0006\u0006\u001a\u0004\b*\u0010\u0010R\u0011\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00010\u00018\u0002X\u0082\u0004R\u0011\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00000\u00018\u0002X\u0082\u0004R\u0013\u0010.\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00018\u0002X\u0082\u0004¨\u0006/"}, d2 = {"Lrv/o;", "", "<init>", "()V", "Lrv/y;", "t", "()Lrv/y;", "Lkotlinx/coroutines/internal/Node;", "current", "i", "(Lrv/o;)Lrv/o;", "next", "", "j", "(Lrv/o;)V", "h", "()Lrv/o;", "node", "", "f", "(Lrv/o;)Z", "", "permissionsBitmask", "d", "(Lrv/o;I)Z", "forbiddenElementsBit", "g", "(I)V", "e", "(Lrv/o;Lrv/o;)Z", "r", "()Z", "s", "", "toString", "()Ljava/lang/String;", "q", "isRemoved", "k", "()Ljava/lang/Object;", "l", "nextNode", "m", "prevNode", "_next", "_prev", "_removedRef", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: rv.o, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C16978o {

    /* renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f159660a = AtomicReferenceFieldUpdater.newUpdater(C16978o.class, Object.class, "_next$volatile");

    /* renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f159661b = AtomicReferenceFieldUpdater.newUpdater(C16978o.class, Object.class, "_prev$volatile");

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f159662c = AtomicReferenceFieldUpdater.newUpdater(C16978o.class, Object.class, "_removedRef$volatile");
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    public final void g(int forbiddenElementsBit) {
        d(new C16976m(forbiddenElementsBit), forbiddenElementsBit);
    }

    public String toString() {
        return new PropertyReference0Impl(this) { // from class: rv.o.a
            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return C15787T.a(this.receiver);
            }
        } + '@' + C15787T.b(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003f, code lost:
    
        if (androidx.concurrent.futures.b.a(rv.C16978o.f159660a, r3, r2, ((rv.y) r4).f159681a) != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final rv.C16978o h() {
        /*
            r7 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = o()
            java.lang.Object r0 = r0.get(r7)
            rv.o r0 = (rv.C16978o) r0
            r1 = 0
            r2 = r0
        Lc:
            r3 = r1
        Ld:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = n()
            java.lang.Object r4 = r4.get(r2)
            if (r4 != r7) goto L26
            if (r0 != r2) goto L1a
            goto L25
        L1a:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = o()
            boolean r0 = androidx.concurrent.futures.b.a(r1, r7, r0, r2)
            if (r0 != 0) goto L25
            goto L0
        L25:
            return r2
        L26:
            boolean r5 = r7.q()
            if (r5 == 0) goto L2d
            return r1
        L2d:
            boolean r5 = r4 instanceof rv.y
            if (r5 == 0) goto L4f
            if (r3 == 0) goto L44
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = n()
            rv.y r4 = (rv.y) r4
            rv.o r4 = r4.ref
            boolean r2 = androidx.concurrent.futures.b.a(r5, r3, r2, r4)
            if (r2 != 0) goto L42
            goto L0
        L42:
            r2 = r3
            goto Lc
        L44:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = o()
            java.lang.Object r2 = r4.get(r2)
            rv.o r2 = (rv.C16978o) r2
            goto Ld
        L4f:
            java.lang.String r3 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode"
            kotlin.jvm.internal.Intrinsics.h(r4, r3)
            r3 = r4
            rv.o r3 = (rv.C16978o) r3
            r6 = r3
            r3 = r2
            r2 = r6
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: rv.C16978o.h():rv.o");
    }

    private final C16978o i(C16978o current) {
        while (current.q()) {
            current = (C16978o) f159661b.get(current);
        }
        return current;
    }

    private final void j(C16978o next) {
        C16978o c16978o;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f159661b;
        do {
            c16978o = (C16978o) atomicReferenceFieldUpdater.get(next);
            if (k() != next) {
                return;
            }
        } while (!androidx.concurrent.futures.b.a(f159661b, next, c16978o, this));
        if (q()) {
            next.h();
        }
    }

    private final y t() {
        y yVar = (y) f159662c.get(this);
        if (yVar == null) {
            y yVar2 = new y(this);
            f159662c.set(this, yVar2);
            return yVar2;
        }
        return yVar;
    }

    public final boolean d(C16978o node, int permissionsBitmask) {
        C16978o c16978oM;
        do {
            c16978oM = m();
            if (c16978oM instanceof C16976m) {
                if ((((C16976m) c16978oM).forbiddenElementsBitmask & permissionsBitmask) == 0 && c16978oM.d(node, permissionsBitmask)) {
                    return true;
                }
                return false;
            }
        } while (!c16978oM.e(node, this));
        return true;
    }

    @PublishedApi
    public final boolean e(C16978o node, C16978o next) {
        f159661b.set(node, this);
        f159660a.set(node, next);
        if (!androidx.concurrent.futures.b.a(f159660a, this, next, node)) {
            return false;
        }
        node.j(next);
        return true;
    }

    public final boolean f(C16978o node) {
        f159661b.set(node, this);
        f159660a.set(node, this);
        while (k() == this) {
            if (androidx.concurrent.futures.b.a(f159660a, this, this, node)) {
                node.j(this);
                return true;
            }
        }
        return false;
    }

    public final Object k() {
        return f159660a.get(this);
    }

    public final C16978o l() {
        y yVar;
        C16978o c16978o;
        Object objK = k();
        if (objK instanceof y) {
            yVar = (y) objK;
        } else {
            yVar = null;
        }
        if (yVar != null && (c16978o = yVar.ref) != null) {
            return c16978o;
        }
        Intrinsics.h(objK, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        return (C16978o) objK;
    }

    public final C16978o m() {
        C16978o c16978oH = h();
        if (c16978oH == null) {
            return i((C16978o) f159661b.get(this));
        }
        return c16978oH;
    }

    public boolean q() {
        return k() instanceof y;
    }

    public boolean r() {
        if (s() == null) {
            return true;
        }
        return false;
    }

    @PublishedApi
    public final C16978o s() {
        Object objK;
        C16978o c16978o;
        do {
            objK = k();
            if (objK instanceof y) {
                return ((y) objK).ref;
            }
            if (objK == this) {
                return (C16978o) objK;
            }
            Intrinsics.h(objK, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
            c16978o = (C16978o) objK;
        } while (!androidx.concurrent.futures.b.a(f159660a, this, objK, c16978o.t()));
        c16978o.h();
        return null;
    }
}
