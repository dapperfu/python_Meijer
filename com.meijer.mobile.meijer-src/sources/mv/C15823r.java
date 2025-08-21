package mv;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.SourceDebugExtension;
import rv.C16971h;

@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a)\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u0004\b\u0000\u0010\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u001f\u0010\u000e\u001a\u00020\u0004*\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"T", "Lmv/n;", "Lmv/m;", "handler", "", "c", "(Lmv/n;Lmv/m;)V", "Lkotlin/coroutines/Continuation;", "delegate", "Lmv/p;", "b", "(Lkotlin/coroutines/Continuation;)Lmv/p;", "Lmv/h0;", "handle", "a", "(Lmv/n;Lmv/h0;)V", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: mv.r, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C15823r {
    public static final void a(InterfaceC15815n<?> interfaceC15815n, InterfaceC15804h0 interfaceC15804h0) {
        c(interfaceC15815n, new C15806i0(interfaceC15804h0));
    }

    public static final <T> C15819p<T> b(Continuation<? super T> continuation) {
        if (!(continuation instanceof C16971h)) {
            return new C15819p<>(continuation, 1);
        }
        C15819p<T> c15819pK = ((C16971h) continuation).k();
        if (c15819pK != null) {
            if (!c15819pK.P()) {
                c15819pK = null;
            }
            if (c15819pK != null) {
                return c15819pK;
            }
        }
        return new C15819p<>(continuation, 2);
    }

    public static final <T> void c(InterfaceC15815n<? super T> interfaceC15815n, InterfaceC15813m interfaceC15813m) {
        if (!(interfaceC15815n instanceof C15819p)) {
            throw new UnsupportedOperationException("third-party implementation of CancellableContinuation is not supported");
        }
        ((C15819p) interfaceC15815n).G(interfaceC15813m);
    }
}
