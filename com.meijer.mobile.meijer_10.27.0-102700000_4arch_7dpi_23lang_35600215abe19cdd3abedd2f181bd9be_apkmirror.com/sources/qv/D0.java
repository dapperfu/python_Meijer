package qv;

import kotlin.Metadata;
import kotlin.PublishedApi;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\t\b\u0011\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0010\u001a\u00020\u00078\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\f\u0010\u000e\u001a\u0004\b\u000f\u0010\tR\u0014\u0010\u0012\u001a\u00020\u00078PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\t¨\u0006\u0013"}, d2 = {"Lqv/D0;", "Lqv/H0;", "Lqv/A;", "Lqv/C0;", "parent", "<init>", "(Lqv/C0;)V", "", "f1", "()Z", "", "exception", "c", "(Ljava/lang/Throwable;)Z", "Z", "k0", "handlesException", "o0", "onCancelComplete", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
@PublishedApi
/* loaded from: classes13.dex */
public class D0 extends H0 implements InterfaceC16608A {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean handlesException;

    public D0(C0 c02) {
        super(true);
        A0(c02);
        this.handlesException = f1();
    }

    @Override // qv.H0
    public boolean o0() {
        return true;
    }

    @Override // qv.InterfaceC16608A
    public boolean c(Throwable exception) {
        return H0(new C16610C(exception, false, 2, null));
    }

    @Override // qv.H0
    /* renamed from: k0, reason: from getter */
    public boolean getHandlesException() {
        return this.handlesException;
    }

    private final boolean f1() {
        C16670v c16670v;
        H0 h0U;
        C16670v c16670v2;
        InterfaceC16668u interfaceC16668uT0 = t0();
        if (interfaceC16668uT0 instanceof C16670v) {
            c16670v = (C16670v) interfaceC16668uT0;
        } else {
            c16670v = null;
        }
        if (c16670v != null && (h0U = c16670v.u()) != null) {
            while (!h0U.getHandlesException()) {
                InterfaceC16668u interfaceC16668uT02 = h0U.t0();
                if (interfaceC16668uT02 instanceof C16670v) {
                    c16670v2 = (C16670v) interfaceC16668uT02;
                } else {
                    c16670v2 = null;
                }
                if (c16670v2 == null || (h0U = c16670v2.u()) == null) {
                }
            }
            return true;
        }
        return false;
    }
}
