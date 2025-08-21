package androidx.view;

import android.os.Bundle;
import androidx.view.AbstractC6165l;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import x4.C18086f;
import x4.InterfaceC18089i;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u0012B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Landroidx/lifecycle/k;", "", "<init>", "()V", "Lx4/f;", "registry", "Landroidx/lifecycle/l;", "lifecycle", "", "key", "Landroid/os/Bundle;", "defaultArgs", "Landroidx/lifecycle/N;", "b", "(Lx4/f;Landroidx/lifecycle/l;Ljava/lang/String;Landroid/os/Bundle;)Landroidx/lifecycle/N;", "Landroidx/lifecycle/c0;", "viewModel", "", "a", "(Landroidx/lifecycle/c0;Lx4/f;Landroidx/lifecycle/l;)V", "c", "(Lx4/f;Landroidx/lifecycle/l;)V", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: androidx.lifecycle.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6164k {

    /* renamed from: a, reason: collision with root package name */
    public static final C6164k f55495a = new C6164k();

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/lifecycle/k$a;", "Lx4/f$a;", "<init>", "()V", "Lx4/i;", "owner", "", "a", "(Lx4/i;)V", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: androidx.lifecycle.k$a */
    public static final class a implements C18086f.a {
        @Override // x4.C18086f.a
        public void a(InterfaceC18089i owner) throws NoSuchMethodException, SecurityException {
            Intrinsics.j(owner, "owner");
            if (!(owner instanceof h0)) {
                throw new IllegalStateException(("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: " + owner).toString());
            }
            g0 g0Var = ((h0) owner).getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
            C18086f savedStateRegistry = owner.getSavedStateRegistry();
            Iterator<String> it = g0Var.c().iterator();
            while (it.hasNext()) {
                c0 c0VarB = g0Var.b(it.next());
                if (c0VarB != null) {
                    C6164k.a(c0VarB, savedStateRegistry, owner.getLifecycle());
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
    public static final class b implements InterfaceC6169p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC6165l f55496a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C18086f f55497b;

        b(AbstractC6165l abstractC6165l, C18086f c18086f) {
            this.f55496a = abstractC6165l;
            this.f55497b = c18086f;
        }

        @Override // androidx.view.InterfaceC6169p
        public void onStateChanged(InterfaceC6172s source, AbstractC6165l.a event) throws NoSuchMethodException, SecurityException {
            Intrinsics.j(source, "source");
            Intrinsics.j(event, "event");
            if (event == AbstractC6165l.a.ON_START) {
                this.f55496a.d(this);
                this.f55497b.d(a.class);
            }
        }
    }

    @JvmStatic
    public static final void a(c0 viewModel, C18086f registry, AbstractC6165l lifecycle) {
        Intrinsics.j(viewModel, "viewModel");
        Intrinsics.j(registry, "registry");
        Intrinsics.j(lifecycle, "lifecycle");
        C6140N c6140n = (C6140N) viewModel.getCloseable("androidx.lifecycle.savedstate.vm.tag");
        if (c6140n == null || c6140n.getIsAttached()) {
            return;
        }
        c6140n.a(registry, lifecycle);
        f55495a.c(registry, lifecycle);
    }

    @JvmStatic
    public static final C6140N b(C18086f registry, AbstractC6165l lifecycle, String key, Bundle defaultArgs) {
        Intrinsics.j(registry, "registry");
        Intrinsics.j(lifecycle, "lifecycle");
        Intrinsics.g(key);
        C6140N c6140n = new C6140N(key, C6138L.INSTANCE.a(registry.a(key), defaultArgs));
        c6140n.a(registry, lifecycle);
        f55495a.c(registry, lifecycle);
        return c6140n;
    }

    private C6164k() {
    }

    private final void c(C18086f registry, AbstractC6165l lifecycle) throws NoSuchMethodException, SecurityException {
        AbstractC6165l.b state = lifecycle.getState();
        if (state != AbstractC6165l.b.f55500b && !state.b(AbstractC6165l.b.f55502d)) {
            lifecycle.a(new b(lifecycle, registry));
        } else {
            registry.d(a.class);
        }
    }
}
