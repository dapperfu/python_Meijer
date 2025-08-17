package l5;

import kotlin.Metadata;
import qv.C0;
import qv.W;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Ll5/k;", "Ll5/e;", "Lqv/W;", "Ll5/i;", "job", "<init>", "(Lqv/W;)V", "", "dispose", "()V", "a", "Lqv/W;", "()Lqv/W;", "", "isDisposed", "()Z", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: l5.k, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C15375k implements InterfaceC15369e {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final W<AbstractC15373i> job;

    public W<AbstractC15373i> a() {
        return this.job;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C15375k(W<? extends AbstractC15373i> w10) {
        this.job = w10;
    }

    @Override // l5.InterfaceC15369e
    public void dispose() {
        if (isDisposed()) {
            return;
        }
        C0.a.a(a(), null, 1, null);
    }

    @Override // l5.InterfaceC15369e
    public boolean isDisposed() {
        return !a().a();
    }
}
