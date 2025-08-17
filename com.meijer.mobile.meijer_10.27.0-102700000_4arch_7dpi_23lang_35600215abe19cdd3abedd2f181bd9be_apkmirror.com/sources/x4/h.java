package x4;

import android.os.Bundle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import x4.h;
import y4.C18161b;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00072\u00020\u0001:\u0001\u0010B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u00062\u000e\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\nH\u0007¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000f\u001a\u00020\u00062\n\u0010\u000e\u001a\u00060\tj\u0002`\nH\u0007¢\u0006\u0004\b\u000f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0016\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0017"}, d2 = {"Lx4/h;", "", "Ly4/b;", "impl", "<init>", "(Ly4/b;)V", "", "c", "()V", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "savedState", "d", "(Landroid/os/Bundle;)V", "outBundle", "e", "a", "Ly4/b;", "Lx4/f;", "b", "Lx4/f;", "()Lx4/f;", "savedStateRegistry", "savedstate_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class h {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C18161b impl;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final f savedStateRegistry;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lx4/h$a;", "", "<init>", "()V", "Lx4/i;", "owner", "Lx4/h;", "b", "(Lx4/i;)Lx4/h;", "savedstate_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: x4.h$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final h b(final i owner) {
            Intrinsics.j(owner, "owner");
            return new h(new C18161b(owner, new Function0() { // from class: x4.g
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return h.Companion.c(owner);
                }
            }), null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(i iVar) {
            iVar.getLifecycle().a(new C18016b(iVar));
            return Unit.f142422a;
        }
    }

    public /* synthetic */ h(C18161b c18161b, DefaultConstructorMarker defaultConstructorMarker) {
        this(c18161b);
    }

    @JvmStatic
    public static final h a(i iVar) {
        return INSTANCE.b(iVar);
    }

    private h(C18161b c18161b) {
        this.impl = c18161b;
        this.savedStateRegistry = new f(c18161b);
    }

    /* renamed from: b, reason: from getter */
    public final f getSavedStateRegistry() {
        return this.savedStateRegistry;
    }

    public final void c() {
        this.impl.f();
    }

    public final void d(Bundle savedState) {
        this.impl.h(savedState);
    }

    public final void e(Bundle outBundle) {
        Intrinsics.j(outBundle, "outBundle");
        this.impl.i(outBundle);
    }
}
