package mv;

import kotlin.Metadata;
import kotlin.jvm.JvmField;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lmv/v;", "Lmv/G0;", "Lmv/u;", "Lmv/w;", "childJob", "<init>", "(Lmv/w;)V", "", "cause", "", "w", "(Ljava/lang/Throwable;)V", "", "b", "(Ljava/lang/Throwable;)Z", "e", "Lmv/w;", "Lmv/C0;", "getParent", "()Lmv/C0;", "parent", "v", "()Z", "onCancelling", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: mv.v, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final class C15831v extends G0 implements InterfaceC15829u {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public final InterfaceC15833w childJob;

    @Override // mv.G0
    public boolean v() {
        return true;
    }

    @Override // mv.G0
    public void w(Throwable cause) {
        this.childJob.K(u());
    }

    public C15831v(InterfaceC15833w interfaceC15833w) {
        this.childJob = interfaceC15833w;
    }

    @Override // mv.InterfaceC15829u
    public boolean b(Throwable cause) {
        return u().Z(cause);
    }

    @Override // mv.InterfaceC15829u
    public C0 getParent() {
        return u();
    }
}
