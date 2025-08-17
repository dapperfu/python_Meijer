package C1;

import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.t1;
import androidx.compose.runtime.z1;
import androidx.emoji2.text.f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0007¨\u0006\f"}, d2 = {"LC1/n;", "LC1/q;", "<init>", "()V", "Landroidx/compose/runtime/z1;", "", "c", "()Landroidx/compose/runtime/z1;", "a", "Landroidx/compose/runtime/z1;", "loadState", "fontLoaded", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class n implements q {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private z1<Boolean> loadState;

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"C1/n$a", "Landroidx/emoji2/text/f$f;", "", "b", "()V", "", "throwable", "a", "(Ljava/lang/Throwable;)V", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends f.AbstractC1107f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<Boolean> f3584a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ n f3585b;

        a(InterfaceC5730l0<Boolean> interfaceC5730l0, n nVar) {
            this.f3584a = interfaceC5730l0;
            this.f3585b = nVar;
        }

        @Override // androidx.emoji2.text.f.AbstractC1107f
        public void a(Throwable throwable) {
            this.f3585b.loadState = r.f3590a;
        }

        @Override // androidx.emoji2.text.f.AbstractC1107f
        public void b() {
            this.f3584a.setValue(Boolean.TRUE);
            this.f3585b.loadState = new s(true);
        }
    }

    @Override // C1.q
    public z1<Boolean> a() {
        z1<Boolean> z1Var = this.loadState;
        if (z1Var != null) {
            Intrinsics.g(z1Var);
            return z1Var;
        }
        if (!androidx.emoji2.text.f.k()) {
            return r.f3590a;
        }
        z1<Boolean> z1VarC = c();
        this.loadState = z1VarC;
        Intrinsics.g(z1VarC);
        return z1VarC;
    }

    public n() {
        z1<Boolean> z1VarC;
        if (androidx.emoji2.text.f.k()) {
            z1VarC = c();
        } else {
            z1VarC = null;
        }
        this.loadState = z1VarC;
    }

    private final z1<Boolean> c() {
        androidx.emoji2.text.f fVarC = androidx.emoji2.text.f.c();
        if (fVarC.g() != 1) {
            InterfaceC5730l0 interfaceC5730l0E = t1.e(Boolean.FALSE, null, 2, null);
            fVarC.v(new a(interfaceC5730l0E, this));
            return interfaceC5730l0E;
        }
        return new s(true);
    }
}
