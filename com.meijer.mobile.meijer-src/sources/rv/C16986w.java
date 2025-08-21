package rv;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import mv.AbstractC15779K;
import mv.InterfaceC15804h0;
import mv.InterfaceC15815n;
import mv.V;
import mv.Y;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\b2\n\u0010\u000f\u001a\u00060\rj\u0002`\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0013\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\b2\n\u0010\u000f\u001a\u00060\rj\u0002`\u000eH\u0017¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J&\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00162\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00100\u0018H\u0096\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ,\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00162\n\u0010\u000f\u001a\u00060\rj\u0002`\u000e2\u0006\u0010\t\u001a\u00020\bH\u0096\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lrv/w;", "Lmv/K;", "Lmv/Y;", "dispatcher", "", "name", "<init>", "(Lmv/K;Ljava/lang/String;)V", "Lkotlin/coroutines/CoroutineContext;", "context", "", "P0", "(Lkotlin/coroutines/CoroutineContext;)Z", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "", "J0", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", "K0", "toString", "()Ljava/lang/String;", "", "timeMillis", "Lmv/n;", "continuation", "H0", "(JLmv/n;)V", "Lmv/h0;", "w", "(JLjava/lang/Runnable;Lkotlin/coroutines/CoroutineContext;)Lmv/h0;", "d", "Lmv/K;", "e", "Ljava/lang/String;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: rv.w, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C16986w extends AbstractC15779K implements Y {

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ Y f159678c;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final AbstractC15779K dispatcher;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final String name;

    @Override // mv.Y
    public void H0(long timeMillis, InterfaceC15815n<? super Unit> continuation) {
        this.f159678c.H0(timeMillis, continuation);
    }

    @Override // mv.AbstractC15779K
    public void J0(CoroutineContext context, Runnable block) {
        this.dispatcher.J0(context, block);
    }

    @Override // mv.AbstractC15779K
    public void K0(CoroutineContext context, Runnable block) {
        this.dispatcher.K0(context, block);
    }

    @Override // mv.AbstractC15779K
    public boolean P0(CoroutineContext context) {
        return this.dispatcher.P0(context);
    }

    @Override // mv.AbstractC15779K
    /* renamed from: toString, reason: from getter */
    public String getName() {
        return this.name;
    }

    @Override // mv.Y
    public InterfaceC15804h0 w(long timeMillis, Runnable block, CoroutineContext context) {
        return this.f159678c.w(timeMillis, block, context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C16986w(AbstractC15779K abstractC15779K, String str) {
        Y y10;
        if (abstractC15779K instanceof Y) {
            y10 = (Y) abstractC15779K;
        } else {
            y10 = null;
        }
        this.f159678c = y10 == null ? V.a() : y10;
        this.dispatcher = abstractC15779K;
        this.name = str;
    }
}
