package yv;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import qv.AbstractC16618K;
import vv.C17656l;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0017¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016¢\u0006\u0004\b\f\u0010\u000bJ!\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lyv/k;", "Lqv/K;", "<init>", "()V", "Lkotlin/coroutines/CoroutineContext;", "context", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "", "N0", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", "L0", "", "parallelism", "", "name", "U0", "(ILjava/lang/String;)Lqv/K;", "toString", "()Ljava/lang/String;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: yv.k, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
final class C18316k extends AbstractC16618K {

    /* renamed from: c, reason: collision with root package name */
    public static final C18316k f171363c = new C18316k();

    @Override // qv.AbstractC16618K
    public void L0(CoroutineContext context, Runnable block) {
        C18308c.f171347i.Y0(block, true, false);
    }

    @Override // qv.AbstractC16618K
    public void N0(CoroutineContext context, Runnable block) {
        C18308c.f171347i.Y0(block, true, true);
    }

    @Override // qv.AbstractC16618K
    /* renamed from: toString */
    public String getName() {
        return "Dispatchers.IO";
    }

    private C18316k() {
    }

    @Override // qv.AbstractC16618K
    public AbstractC16618K U0(int parallelism, String name) {
        C17656l.a(parallelism);
        if (parallelism >= C18315j.f171360d) {
            return C17656l.b(this, name);
        }
        return super.U0(parallelism, name);
    }
}
