package qv;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lqv/j0;", "Lqv/G0;", "Lqv/h0;", "handle", "<init>", "(Lqv/h0;)V", "", "cause", "", "w", "(Ljava/lang/Throwable;)V", "e", "Lqv/h0;", "", "v", "()Z", "onCancelling", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: qv.j0, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
final class C16647j0 extends G0 {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16643h0 handle;

    @Override // qv.G0
    public boolean v() {
        return false;
    }

    @Override // qv.G0
    public void w(Throwable cause) {
        this.handle.dispose();
    }

    public C16647j0(InterfaceC16643h0 interfaceC16643h0) {
        this.handle = interfaceC16643h0;
    }
}
