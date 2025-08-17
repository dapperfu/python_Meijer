package l5;

import androidx.view.AbstractC6023l;
import androidx.view.InterfaceC6029r;
import androidx.view.InterfaceC6030s;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import n5.InterfaceC15780d;
import q5.C16455g;
import q5.C16458j;
import qv.C0;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0010J\u0017\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0019R\u0018\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Ll5/s;", "Ll5/n;", "LZ4/h;", "imageLoader", "Ll5/h;", "initialRequest", "Ln5/d;", "target", "Landroidx/lifecycle/l;", "lifecycle", "Lqv/C0;", "job", "<init>", "(LZ4/h;Ll5/h;Ln5/d;Landroidx/lifecycle/l;Lqv/C0;)V", "", "b", "()V", "z", "start", "a", "Landroidx/lifecycle/s;", "owner", "onDestroy", "(Landroidx/lifecycle/s;)V", "LZ4/h;", "Ll5/h;", "c", "Ln5/d;", "d", "Landroidx/lifecycle/l;", "e", "Lqv/C0;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class s implements InterfaceC15378n {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Z4.h imageLoader;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C15372h initialRequest;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC15780d<?> target;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final AbstractC6023l lifecycle;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final C0 job;

    public void a() {
        C0.a.a(this.job, null, 1, null);
        InterfaceC15780d<?> interfaceC15780d = this.target;
        if (interfaceC15780d instanceof InterfaceC6029r) {
            this.lifecycle.d((InterfaceC6029r) interfaceC15780d);
        }
        this.lifecycle.d(this);
    }

    public final void b() {
        this.imageLoader.b(this.initialRequest);
    }

    @Override // androidx.view.InterfaceC6015f
    public void onDestroy(InterfaceC6030s owner) {
        C16458j.m(this.target.getView()).a();
    }

    @Override // l5.InterfaceC15378n
    public void start() {
        this.lifecycle.a(this);
        InterfaceC15780d<?> interfaceC15780d = this.target;
        if (interfaceC15780d instanceof InterfaceC6029r) {
            C16455g.b(this.lifecycle, (InterfaceC6029r) interfaceC15780d);
        }
        C16458j.m(this.target.getView()).d(this);
    }

    @Override // l5.InterfaceC15378n
    public void z() {
        if (this.target.getView().isAttachedToWindow()) {
            return;
        }
        C16458j.m(this.target.getView()).d(this);
        throw new CancellationException("'ViewTarget.view' must be attached to a window.");
    }

    public s(Z4.h hVar, C15372h c15372h, InterfaceC15780d<?> interfaceC15780d, AbstractC6023l abstractC6023l, C0 c02) {
        this.imageLoader = hVar;
        this.initialRequest = c15372h;
        this.target = interfaceC15780d;
        this.lifecycle = abstractC6023l;
        this.job = c02;
    }
}
