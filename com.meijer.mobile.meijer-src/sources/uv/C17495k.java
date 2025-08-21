package uv;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import mv.AbstractC15779K;
import rv.C16975l;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0017¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016¢\u0006\u0004\b\f\u0010\u000bJ!\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Luv/k;", "Lmv/K;", "<init>", "()V", "Lkotlin/coroutines/CoroutineContext;", "context", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "", "K0", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", "J0", "", "parallelism", "", "name", "S0", "(ILjava/lang/String;)Lmv/K;", "toString", "()Ljava/lang/String;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: uv.k, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final class C17495k extends AbstractC15779K {

    /* renamed from: c, reason: collision with root package name */
    public static final C17495k f164649c = new C17495k();

    @Override // mv.AbstractC15779K
    public void J0(CoroutineContext context, Runnable block) {
        C17487c.f164633i.X0(block, true, false);
    }

    @Override // mv.AbstractC15779K
    public void K0(CoroutineContext context, Runnable block) {
        C17487c.f164633i.X0(block, true, true);
    }

    @Override // mv.AbstractC15779K
    /* renamed from: toString */
    public String getName() {
        return "Dispatchers.IO";
    }

    private C17495k() {
    }

    @Override // mv.AbstractC15779K
    public AbstractC15779K S0(int parallelism, String name) {
        C16975l.a(parallelism);
        if (parallelism >= C17494j.f164646d) {
            return C16975l.b(this, name);
        }
        return super.S0(parallelism, name);
    }
}
