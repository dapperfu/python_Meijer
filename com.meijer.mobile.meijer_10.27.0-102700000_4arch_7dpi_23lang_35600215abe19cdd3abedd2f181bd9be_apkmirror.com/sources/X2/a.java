package X2;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import qv.F0;
import qv.InterfaceC16622O;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"LX2/a;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "Lqv/O;", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "<init>", "(Lkotlin/coroutines/CoroutineContext;)V", "coroutineScope", "(Lqv/O;)V", "", "close", "()V", "a", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "lifecycle-viewmodel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class a implements AutoCloseable, InterfaceC16622O {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final CoroutineContext coroutineContext;

    public a(CoroutineContext coroutineContext) {
        Intrinsics.j(coroutineContext, "coroutineContext");
        this.coroutineContext = coroutineContext;
    }

    @Override // qv.InterfaceC16622O
    public CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(InterfaceC16622O coroutineScope) {
        this(coroutineScope.getCoroutineContext());
        Intrinsics.j(coroutineScope, "coroutineScope");
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        F0.e(getCoroutineContext(), null, 1, null);
    }
}
