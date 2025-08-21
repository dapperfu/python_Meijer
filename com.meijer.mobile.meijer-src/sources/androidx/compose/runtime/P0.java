package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.InterfaceC15769A;
import mv.InterfaceC15783O;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\t\b\u0000\u0018\u0000 \r2\u00020\u00012\u00020\u0002:\u0001\tB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\nJ\u000f\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\nR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u000eR\u0014\u0010\u0017\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Landroidx/compose/runtime/P0;", "Lmv/O;", "Landroidx/compose/runtime/N0;", "Lkotlin/coroutines/CoroutineContext;", "parentContext", "overlayContext", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;)V", "", "a", "()V", "b", "f", "e", "Lkotlin/coroutines/CoroutineContext;", "", "c", "Ljava/lang/Object;", "lock", "d", "_coroutineContext", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class P0 implements InterfaceC15783O, N0 {

    /* renamed from: f, reason: collision with root package name */
    public static final int f50246f = 8;

    /* renamed from: g, reason: collision with root package name */
    @JvmField
    public static final CoroutineContext f50247g = new C5853d();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final CoroutineContext parentContext;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final CoroutineContext overlayContext;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Object lock = this;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private volatile CoroutineContext _coroutineContext;

    @Override // androidx.compose.runtime.N0
    public void b() {
    }

    public final void a() {
        synchronized (this.lock) {
            try {
                CoroutineContext coroutineContext = this._coroutineContext;
                if (coroutineContext == null) {
                    this._coroutineContext = f50247g;
                } else {
                    mv.E0.c(coroutineContext, new L());
                }
                Unit unit = Unit.f143329a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // mv.InterfaceC15783O
    public CoroutineContext getCoroutineContext() {
        CoroutineContext coroutineContextN0;
        CoroutineContext coroutineContext = this._coroutineContext;
        if (coroutineContext == null || coroutineContext == f50247g) {
            synchronized (this.lock) {
                try {
                    coroutineContextN0 = this._coroutineContext;
                    if (coroutineContextN0 == null) {
                        CoroutineContext coroutineContext2 = this.parentContext;
                        coroutineContextN0 = coroutineContext2.n0(mv.E0.a((mv.C0) coroutineContext2.g(mv.C0.INSTANCE))).n0(this.overlayContext);
                    } else if (coroutineContextN0 == f50247g) {
                        CoroutineContext coroutineContext3 = this.parentContext;
                        InterfaceC15769A interfaceC15769AA = mv.E0.a((mv.C0) coroutineContext3.g(mv.C0.INSTANCE));
                        interfaceC15769AA.d(new L());
                        coroutineContextN0 = coroutineContext3.n0(interfaceC15769AA).n0(this.overlayContext);
                    }
                    this._coroutineContext = coroutineContextN0;
                    Unit unit = Unit.f143329a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            coroutineContext = coroutineContextN0;
        }
        Intrinsics.g(coroutineContext);
        return coroutineContext;
    }

    public P0(CoroutineContext coroutineContext, CoroutineContext coroutineContext2) {
        this.parentContext = coroutineContext;
        this.overlayContext = coroutineContext2;
    }

    @Override // androidx.compose.runtime.N0
    public void e() {
        a();
    }

    @Override // androidx.compose.runtime.N0
    public void f() {
        a();
    }
}
