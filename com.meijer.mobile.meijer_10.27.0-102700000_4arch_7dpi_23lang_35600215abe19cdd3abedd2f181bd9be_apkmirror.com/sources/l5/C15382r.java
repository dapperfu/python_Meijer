package l5;

import android.view.View;
import kotlin.Metadata;
import q5.C16458j;
import qv.W;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR(\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\f\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Ll5/r;", "Ll5/e;", "Landroid/view/View;", "view", "Lqv/W;", "Ll5/i;", "job", "<init>", "(Landroid/view/View;Lqv/W;)V", "", "dispose", "()V", "a", "Landroid/view/View;", "b", "Lqv/W;", "getJob", "()Lqv/W;", "(Lqv/W;)V", "", "isDisposed", "()Z", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: l5.r, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C15382r implements InterfaceC15369e {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final View view;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private volatile W<? extends AbstractC15373i> job;

    public void a(W<? extends AbstractC15373i> w10) {
        this.job = w10;
    }

    @Override // l5.InterfaceC15369e
    public boolean isDisposed() {
        return C16458j.m(this.view).c(this);
    }

    public C15382r(View view, W<? extends AbstractC15373i> w10) {
        this.view = view;
        this.job = w10;
    }

    @Override // l5.InterfaceC15369e
    public void dispose() {
        if (isDisposed()) {
            return;
        }
        C16458j.m(this.view).a();
    }
}
