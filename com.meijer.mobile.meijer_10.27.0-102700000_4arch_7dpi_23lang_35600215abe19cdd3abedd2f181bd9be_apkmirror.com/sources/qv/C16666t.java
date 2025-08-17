package qv;

import kotlin.Metadata;
import kotlin.jvm.JvmField;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0018\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lqv/t;", "Lqv/G0;", "Lqv/p;", "child", "<init>", "(Lqv/p;)V", "", "cause", "", "w", "(Ljava/lang/Throwable;)V", "e", "Lqv/p;", "", "v", "()Z", "onCancelling", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: qv.t, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
final class C16666t extends G0 {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public final C16658p<?> child;

    @Override // qv.G0
    public boolean v() {
        return true;
    }

    @Override // qv.G0
    public void w(Throwable cause) {
        C16658p<?> c16658p = this.child;
        c16658p.L(c16658p.t(u()));
    }

    public C16666t(C16658p<?> c16658p) {
        this.child = c16658p;
    }
}
