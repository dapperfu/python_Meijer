package X2;

import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import mv.C15800f0;
import mv.InterfaceC15783O;
import mv.X0;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0013\u0010\u0004\u001a\u00020\u0000*\u00020\u0003H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LX2/a;", "b", "()LX2/a;", "Lmv/O;", "a", "(Lmv/O;)LX2/a;", "lifecycle-viewmodel_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class b {
    public static final a a(InterfaceC15783O interfaceC15783O) {
        Intrinsics.j(interfaceC15783O, "<this>");
        return new a(interfaceC15783O);
    }

    public static final a b() {
        CoroutineContext coroutineContextU0;
        try {
            coroutineContextU0 = C15800f0.c().U0();
        } catch (IllegalStateException unused) {
            coroutineContextU0 = EmptyCoroutineContext.f143553a;
        } catch (NotImplementedError unused2) {
            coroutineContextU0 = EmptyCoroutineContext.f143553a;
        }
        return new a(coroutineContextU0.n0(X0.b(null, 1, null)));
    }
}
