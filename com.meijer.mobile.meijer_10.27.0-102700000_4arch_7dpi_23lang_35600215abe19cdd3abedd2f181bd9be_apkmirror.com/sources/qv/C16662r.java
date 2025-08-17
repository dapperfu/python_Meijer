package qv;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.SourceDebugExtension;
import vv.C17652h;

@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a)\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u0004\b\u0000\u0010\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u001f\u0010\u000e\u001a\u00020\u0004*\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"T", "Lqv/n;", "Lqv/m;", "handler", "", "c", "(Lqv/n;Lqv/m;)V", "Lkotlin/coroutines/Continuation;", "delegate", "Lqv/p;", "b", "(Lkotlin/coroutines/Continuation;)Lqv/p;", "Lqv/h0;", "handle", "a", "(Lqv/n;Lqv/h0;)V", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: qv.r, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C16662r {
    public static final void a(InterfaceC16654n<?> interfaceC16654n, InterfaceC16643h0 interfaceC16643h0) {
        c(interfaceC16654n, new C16645i0(interfaceC16643h0));
    }

    public static final <T> C16658p<T> b(Continuation<? super T> continuation) {
        if (!(continuation instanceof C17652h)) {
            return new C16658p<>(continuation, 1);
        }
        C16658p<T> c16658pL = ((C17652h) continuation).l();
        if (c16658pL != null) {
            if (!c16658pL.P()) {
                c16658pL = null;
            }
            if (c16658pL != null) {
                return c16658pL;
            }
        }
        return new C16658p<>(continuation, 2);
    }

    public static final <T> void c(InterfaceC16654n<? super T> interfaceC16654n, InterfaceC16652m interfaceC16652m) {
        if (!(interfaceC16654n instanceof C16658p)) {
            throw new UnsupportedOperationException("third-party implementation of CancellableContinuation is not supported");
        }
        ((C16658p) interfaceC16654n).G(interfaceC16652m);
    }
}
