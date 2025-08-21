package m5;

import androidx.view.AbstractC6165l;
import androidx.view.InterfaceC6171r;
import androidx.view.InterfaceC6172s;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import mv.C0;
import o5.InterfaceC16074d;
import r5.C16843g;
import r5.C16846j;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0010J\u0017\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0019R\u0018\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lm5/s;", "Lm5/n;", "La5/h;", "imageLoader", "Lm5/h;", "initialRequest", "Lo5/d;", "target", "Landroidx/lifecycle/l;", "lifecycle", "Lmv/C0;", "job", "<init>", "(La5/h;Lm5/h;Lo5/d;Landroidx/lifecycle/l;Lmv/C0;)V", "", "b", "()V", "z", "start", "a", "Landroidx/lifecycle/s;", "owner", "onDestroy", "(Landroidx/lifecycle/s;)V", "La5/h;", "Lm5/h;", "c", "Lo5/d;", "d", "Landroidx/lifecycle/l;", "e", "Lmv/C0;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class s implements InterfaceC15675n {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final a5.h imageLoader;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C15669h initialRequest;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16074d<?> target;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final AbstractC6165l lifecycle;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final C0 job;

    public void a() {
        C0.a.a(this.job, null, 1, null);
        InterfaceC16074d<?> interfaceC16074d = this.target;
        if (interfaceC16074d instanceof InterfaceC6171r) {
            this.lifecycle.d((InterfaceC6171r) interfaceC16074d);
        }
        this.lifecycle.d(this);
    }

    public final void b() {
        this.imageLoader.d(this.initialRequest);
    }

    @Override // androidx.view.InterfaceC6157f
    public void onDestroy(InterfaceC6172s owner) {
        C16846j.m(this.target.getView()).a();
    }

    @Override // m5.InterfaceC15675n
    public void start() {
        this.lifecycle.a(this);
        InterfaceC16074d<?> interfaceC16074d = this.target;
        if (interfaceC16074d instanceof InterfaceC6171r) {
            C16843g.b(this.lifecycle, (InterfaceC6171r) interfaceC16074d);
        }
        C16846j.m(this.target.getView()).d(this);
    }

    @Override // m5.InterfaceC15675n
    public void z() {
        if (this.target.getView().isAttachedToWindow()) {
            return;
        }
        C16846j.m(this.target.getView()).d(this);
        throw new CancellationException("'ViewTarget.view' must be attached to a window.");
    }

    public s(a5.h hVar, C15669h c15669h, InterfaceC16074d<?> interfaceC16074d, AbstractC6165l abstractC6165l, C0 c02) {
        this.imageLoader = hVar;
        this.initialRequest = c15669h;
        this.target = interfaceC16074d;
        this.lifecycle = abstractC6165l;
        this.job = c02;
    }
}
