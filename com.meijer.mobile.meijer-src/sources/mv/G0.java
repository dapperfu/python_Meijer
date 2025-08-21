package mv;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import rv.C16978o;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\u0005J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u000bH&¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0016\u001a\u00020\u000f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0019R\u0016\u0010 \u001a\u0004\u0018\u00010\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lmv/G0;", "Lrv/o;", "Lmv/h0;", "Lmv/x0;", "<init>", "()V", "", "dispose", "", "toString", "()Ljava/lang/String;", "", "cause", "w", "(Ljava/lang/Throwable;)V", "Lmv/H0;", "d", "Lmv/H0;", "u", "()Lmv/H0;", "x", "(Lmv/H0;)V", "job", "", "v", "()Z", "onCancelling", "a", "isActive", "Lmv/M0;", "c", "()Lmv/M0;", "list", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class G0 extends C16978o implements InterfaceC15804h0, InterfaceC15836x0 {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public H0 job;

    @Override // mv.InterfaceC15836x0
    /* renamed from: a */
    public boolean getIsActive() {
        return true;
    }

    @Override // mv.InterfaceC15836x0
    /* renamed from: c */
    public M0 getList() {
        return null;
    }

    public abstract boolean v();

    public abstract void w(Throwable cause);

    @Override // rv.C16978o
    public String toString() {
        return C15787T.a(this) + '@' + C15787T.b(this) + "[job@" + C15787T.b(u()) + ']';
    }

    public final H0 u() {
        H0 h02 = this.job;
        if (h02 != null) {
            return h02;
        }
        Intrinsics.x("job");
        return null;
    }

    public final void x(H0 h02) {
        this.job = h02;
    }

    @Override // mv.InterfaceC15804h0
    public void dispose() {
        u().T0(this);
    }
}
