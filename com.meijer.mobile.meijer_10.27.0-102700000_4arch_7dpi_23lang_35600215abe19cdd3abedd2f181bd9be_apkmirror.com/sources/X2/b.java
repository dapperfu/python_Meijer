package X2;

import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import qv.C16639f0;
import qv.InterfaceC16622O;
import qv.X0;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0013\u0010\u0004\u001a\u00020\u0000*\u00020\u0003H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LX2/a;", "b", "()LX2/a;", "Lqv/O;", "a", "(Lqv/O;)LX2/a;", "lifecycle-viewmodel_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class b {
    public static final a a(InterfaceC16622O interfaceC16622O) {
        Intrinsics.j(interfaceC16622O, "<this>");
        return new a(interfaceC16622O);
    }

    public static final a b() {
        CoroutineContext coroutineContextW0;
        try {
            coroutineContextW0 = C16639f0.c().W0();
        } catch (IllegalStateException unused) {
            coroutineContextW0 = EmptyCoroutineContext.f142646a;
        } catch (NotImplementedError unused2) {
            coroutineContextW0 = EmptyCoroutineContext.f142646a;
        }
        return new a(coroutineContextW0.m0(X0.b(null, 1, null)));
    }
}
