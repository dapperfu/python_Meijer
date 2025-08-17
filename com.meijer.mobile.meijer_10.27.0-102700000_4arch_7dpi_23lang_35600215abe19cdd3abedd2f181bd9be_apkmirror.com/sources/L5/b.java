package L5;

import android.view.View;
import androidx.view.AbstractC6023l;
import androidx.view.C5612N;
import androidx.view.C6019i0;
import androidx.view.C6021j0;
import androidx.view.C6032u;
import androidx.view.G;
import androidx.view.InterfaceC6030s;
import androidx.view.J;
import androidx.view.g0;
import androidx.view.h0;
import com.google.android.libraries.places.api.model.PlaceTypes;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\t\u0010\u0006J\u0019\u0010\f\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0000¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000e\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0000¢\u0006\u0004\b\u000e\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010#\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010*\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006+"}, d2 = {"LL5/b;", "Landroidx/lifecycle/s;", "Landroidx/lifecycle/h0;", "Lx4/i;", "Landroidx/activity/J;", "<init>", "()V", "", "e", "f", "Landroid/view/View;", "view", "b", "(Landroid/view/View;)V", "c", "Landroidx/lifecycle/u;", "a", "Landroidx/lifecycle/u;", "lifecycleRegistry", "Landroidx/lifecycle/g0;", "Landroidx/lifecycle/g0;", PlaceTypes.STORE, "Lx4/h;", "Lx4/h;", "savedStateRegistryController", "Landroidx/activity/G;", "d", "Landroidx/activity/G;", "dispatcher", "Landroidx/lifecycle/l;", "getLifecycle", "()Landroidx/lifecycle/l;", "lifecycle", "getViewModelStore", "()Landroidx/lifecycle/g0;", "viewModelStore", "Lx4/f;", "getSavedStateRegistry", "()Lx4/f;", "savedStateRegistry", "getOnBackPressedDispatcher", "()Landroidx/activity/G;", "onBackPressedDispatcher", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class b implements InterfaceC6030s, h0, x4.i, J {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C6032u lifecycleRegistry = new C6032u(this);

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final g0 store = new g0();

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final x4.h savedStateRegistryController = x4.h.INSTANCE.b(this);

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final G dispatcher = new G(new Runnable() { // from class: L5.a
        @Override // java.lang.Runnable
        public final void run() {
            b.d();
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d() {
    }

    public final void b(View view) {
        if (view != null) {
            C6019i0.b(view, this);
            C6021j0.b(view, this);
            x4.m.b(view, this);
            C5612N.b(view, this);
        }
    }

    public final void c(View view) {
        if (view != null) {
            C6019i0.b(view, null);
            C6021j0.b(view, null);
            x4.m.b(view, null);
        }
    }

    public final void e() {
        this.savedStateRegistryController.d(null);
        this.lifecycleRegistry.i(AbstractC6023l.a.ON_CREATE);
    }

    public final void f() {
        this.lifecycleRegistry.i(AbstractC6023l.a.ON_DESTROY);
        this.store.a();
    }

    @Override // androidx.view.InterfaceC6030s
    public AbstractC6023l getLifecycle() {
        return this.lifecycleRegistry;
    }

    @Override // androidx.view.J
    /* renamed from: getOnBackPressedDispatcher, reason: from getter */
    public G getDispatcher() {
        return this.dispatcher;
    }

    @Override // x4.i
    public x4.f getSavedStateRegistry() {
        return this.savedStateRegistryController.getSavedStateRegistry();
    }

    @Override // androidx.view.h0
    /* renamed from: getViewModelStore, reason: from getter */
    public g0 getStore() {
        return this.store;
    }
}
