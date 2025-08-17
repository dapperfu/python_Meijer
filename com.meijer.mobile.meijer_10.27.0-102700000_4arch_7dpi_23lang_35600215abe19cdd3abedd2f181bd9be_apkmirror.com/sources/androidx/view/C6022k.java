package androidx.view;

import android.os.Bundle;
import androidx.view.AbstractC6023l;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import x4.f;
import x4.i;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u0012B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Landroidx/lifecycle/k;", "", "<init>", "()V", "Lx4/f;", "registry", "Landroidx/lifecycle/l;", "lifecycle", "", "key", "Landroid/os/Bundle;", "defaultArgs", "Landroidx/lifecycle/N;", "b", "(Lx4/f;Landroidx/lifecycle/l;Ljava/lang/String;Landroid/os/Bundle;)Landroidx/lifecycle/N;", "Landroidx/lifecycle/c0;", "viewModel", "", "a", "(Landroidx/lifecycle/c0;Lx4/f;Landroidx/lifecycle/l;)V", "c", "(Lx4/f;Landroidx/lifecycle/l;)V", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: androidx.lifecycle.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6022k {

    /* renamed from: a, reason: collision with root package name */
    public static final C6022k f55271a = new C6022k();

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/lifecycle/k$a;", "Lx4/f$a;", "<init>", "()V", "Lx4/i;", "owner", "", "a", "(Lx4/i;)V", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: androidx.lifecycle.k$a */
    public static final class a implements f.a {
        @Override // x4.f.a
        public void a(i owner) throws NoSuchMethodException, SecurityException {
            Intrinsics.j(owner, "owner");
            if (!(owner instanceof h0)) {
                throw new IllegalStateException(("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: " + owner).toString());
            }
            g0 g0Var = ((h0) owner).getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
            f savedStateRegistry = owner.getSavedStateRegistry();
            Iterator<String> it = g0Var.c().iterator();
            while (it.hasNext()) {
                c0 c0VarB = g0Var.b(it.next());
                if (c0VarB != null) {
                    C6022k.a(c0VarB, savedStateRegistry, owner.getLifecycle());
                }
            }
            if (g0Var.c().isEmpty()) {
                return;
            }
            savedStateRegistry.d(a.class);
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"androidx/lifecycle/k$b", "Landroidx/lifecycle/p;", "Landroidx/lifecycle/s;", "source", "Landroidx/lifecycle/l$a;", "event", "", "onStateChanged", "(Landroidx/lifecycle/s;Landroidx/lifecycle/l$a;)V", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: androidx.lifecycle.k$b */
    public static final class b implements InterfaceC6027p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC6023l f55272a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ f f55273b;

        b(AbstractC6023l abstractC6023l, f fVar) {
            this.f55272a = abstractC6023l;
            this.f55273b = fVar;
        }

        @Override // androidx.view.InterfaceC6027p
        public void onStateChanged(InterfaceC6030s source, AbstractC6023l.a event) throws NoSuchMethodException, SecurityException {
            Intrinsics.j(source, "source");
            Intrinsics.j(event, "event");
            if (event == AbstractC6023l.a.ON_START) {
                this.f55272a.d(this);
                this.f55273b.d(a.class);
            }
        }
    }

    @JvmStatic
    public static final void a(c0 viewModel, f registry, AbstractC6023l lifecycle) {
        Intrinsics.j(viewModel, "viewModel");
        Intrinsics.j(registry, "registry");
        Intrinsics.j(lifecycle, "lifecycle");
        C5998N c5998n = (C5998N) viewModel.getCloseable("androidx.lifecycle.savedstate.vm.tag");
        if (c5998n == null || c5998n.getIsAttached()) {
            return;
        }
        c5998n.a(registry, lifecycle);
        f55271a.c(registry, lifecycle);
    }

    @JvmStatic
    public static final C5998N b(f registry, AbstractC6023l lifecycle, String key, Bundle defaultArgs) {
        Intrinsics.j(registry, "registry");
        Intrinsics.j(lifecycle, "lifecycle");
        Intrinsics.g(key);
        C5998N c5998n = new C5998N(key, C5996L.INSTANCE.a(registry.a(key), defaultArgs));
        c5998n.a(registry, lifecycle);
        f55271a.c(registry, lifecycle);
        return c5998n;
    }

    private C6022k() {
    }

    private final void c(f registry, AbstractC6023l lifecycle) throws NoSuchMethodException, SecurityException {
        AbstractC6023l.b state = lifecycle.getState();
        if (state != AbstractC6023l.b.f55276b && !state.b(AbstractC6023l.b.f55278d)) {
            lifecycle.a(new b(lifecycle, registry));
        } else {
            registry.d(a.class);
        }
    }
}
