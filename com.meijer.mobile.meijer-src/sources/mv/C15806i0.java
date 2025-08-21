package mv;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lmv/i0;", "Lmv/m;", "Lmv/h0;", "handle", "<init>", "(Lmv/h0;)V", "", "cause", "", "c", "(Ljava/lang/Throwable;)V", "", "toString", "()Ljava/lang/String;", "a", "Lmv/h0;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: mv.i0, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final class C15806i0 implements InterfaceC15813m {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC15804h0 handle;

    @Override // mv.InterfaceC15813m
    public void c(Throwable cause) {
        this.handle.dispose();
    }

    public String toString() {
        return "DisposeOnCancel[" + this.handle + ']';
    }

    public C15806i0(InterfaceC15804h0 interfaceC15804h0) {
        this.handle = interfaceC15804h0;
    }
}
