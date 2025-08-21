package e;

import androidx.compose.runtime.z1;
import g.AbstractC14276c;
import h.AbstractC14427a;
import kotlin.Deprecated;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B1\b\u0000\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0018\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00028\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R&\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0015¨\u0006\u0016"}, d2 = {"Le/i;", "I", "O", "Lg/c;", "Le/a;", "launcher", "Landroidx/compose/runtime/z1;", "Lh/a;", "currentContract", "<init>", "(Le/a;Landroidx/compose/runtime/z1;)V", "", "c", "()V", "input", "Landroidx/core/app/d;", "options", "b", "(Ljava/lang/Object;Landroidx/core/app/d;)V", "a", "Le/a;", "Landroidx/compose/runtime/z1;", "activity-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: e.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13741i<I, O> extends AbstractC14276c<I> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C13733a<I> launcher;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final z1<AbstractC14427a<I, O>> currentContract;

    @Override // g.AbstractC14276c
    public void b(I input, androidx.core.app.d options) {
        this.launcher.a(input, options);
    }

    @Override // g.AbstractC14276c
    @Deprecated
    public void c() {
        throw new UnsupportedOperationException("Registration is automatically handled by rememberLauncherForActivityResult");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C13741i(C13733a<I> c13733a, z1<? extends AbstractC14427a<I, O>> z1Var) {
        this.launcher = c13733a;
        this.currentContract = z1Var;
    }
}
