package androidx.view;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.view.AbstractC6023l;
import androidx.view.C6019i0;
import androidx.view.C6032u;
import androidx.view.InterfaceC6030s;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import x4.f;
import x4.h;
import x4.i;
import x4.m;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u001b\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0003\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000bH\u0015¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0015¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000fH\u0015¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u000fH\u0017¢\u0006\u0004\b\u0015\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u0017\u0010\u001bJ!\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u0017\u0010\u001eJ!\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u001f\u0010\u001eJ\u000f\u0010 \u001a\u00020\u000fH\u0017¢\u0006\u0004\b \u0010\u0013R\u0018\u0010$\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001d\u0010.\u001a\u00020)8\u0006¢\u0006\u0012\n\u0004\b \u0010*\u0012\u0004\b-\u0010\u0013\u001a\u0004\b+\u0010,R\u0014\u00100\u001a\u00020!8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b&\u0010/R\u0014\u00104\u001a\u0002018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u00103R\u0014\u00108\u001a\u0002058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u00107¨\u00069"}, d2 = {"Landroidx/activity/q;", "Landroid/app/Dialog;", "Landroidx/lifecycle/s;", "Landroidx/activity/J;", "Lx4/i;", "Landroid/content/Context;", "context", "", "themeResId", "<init>", "(Landroid/content/Context;I)V", "Landroid/os/Bundle;", "onSaveInstanceState", "()Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "onStart", "()V", "onStop", "onBackPressed", "layoutResID", "setContentView", "(I)V", "Landroid/view/View;", "view", "(Landroid/view/View;)V", "Landroid/view/ViewGroup$LayoutParams;", "params", "(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V", "addContentView", "c", "Landroidx/lifecycle/u;", "a", "Landroidx/lifecycle/u;", "_lifecycleRegistry", "Lx4/h;", "b", "Lx4/h;", "savedStateRegistryController", "Landroidx/activity/G;", "Landroidx/activity/G;", "getOnBackPressedDispatcher", "()Landroidx/activity/G;", "getOnBackPressedDispatcher$annotations", "onBackPressedDispatcher", "()Landroidx/lifecycle/u;", "lifecycleRegistry", "Lx4/f;", "getSavedStateRegistry", "()Lx4/f;", "savedStateRegistry", "Landroidx/lifecycle/l;", "getLifecycle", "()Landroidx/lifecycle/l;", "lifecycle", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public class q extends Dialog implements InterfaceC6030s, J, i {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private C6032u _lifecycleRegistry;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final h savedStateRegistryController;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final G onBackPressedDispatcher;

    public /* synthetic */ q(Context context, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? 0 : i10);
    }

    @Override // android.app.Dialog
    public void setContentView(int layoutResID) {
        c();
        super.setContentView(layoutResID);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public q(Context context, int i10) {
        super(context, i10);
        Intrinsics.j(context, "context");
        this.savedStateRegistryController = h.INSTANCE.b(this);
        this.onBackPressedDispatcher = new G(new Runnable() { // from class: androidx.activity.p
            @Override // java.lang.Runnable
            public final void run() {
                q.d(this.f45725a);
            }
        });
    }

    private final C6032u b() {
        C6032u c6032u = this._lifecycleRegistry;
        if (c6032u != null) {
            return c6032u;
        }
        C6032u c6032u2 = new C6032u(this);
        this._lifecycleRegistry = c6032u2;
        return c6032u2;
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams params) {
        Intrinsics.j(view, "view");
        c();
        super.addContentView(view, params);
    }

    @Override // androidx.view.J
    /* renamed from: getOnBackPressedDispatcher, reason: from getter */
    public final G getDispatcher() {
        return this.onBackPressedDispatcher;
    }

    @Override // x4.i
    public f getSavedStateRegistry() {
        return this.savedStateRegistryController.getSavedStateRegistry();
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        this.onBackPressedDispatcher.l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(q qVar) {
        super.onBackPressed();
    }

    public void c() {
        Window window = getWindow();
        Intrinsics.g(window);
        View decorView = window.getDecorView();
        Intrinsics.i(decorView, "window!!.decorView");
        C6019i0.b(decorView, this);
        Window window2 = getWindow();
        Intrinsics.g(window2);
        View decorView2 = window2.getDecorView();
        Intrinsics.i(decorView2, "window!!.decorView");
        C5612N.b(decorView2, this);
        Window window3 = getWindow();
        Intrinsics.g(window3);
        View decorView3 = window3.getDecorView();
        Intrinsics.i(decorView3, "window!!.decorView");
        m.b(decorView3, this);
    }

    @Override // androidx.view.InterfaceC6030s
    public AbstractC6023l getLifecycle() {
        return b();
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (Build.VERSION.SDK_INT >= 33) {
            G g10 = this.onBackPressedDispatcher;
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            Intrinsics.i(onBackInvokedDispatcher, "onBackInvokedDispatcher");
            g10.o(onBackInvokedDispatcher);
        }
        this.savedStateRegistryController.d(savedInstanceState);
        b().i(AbstractC6023l.a.ON_CREATE);
    }

    @Override // android.app.Dialog
    public Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        Intrinsics.i(bundleOnSaveInstanceState, "super.onSaveInstanceState()");
        this.savedStateRegistryController.e(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    protected void onStart() {
        super.onStart();
        b().i(AbstractC6023l.a.ON_RESUME);
    }

    @Override // android.app.Dialog
    protected void onStop() {
        b().i(AbstractC6023l.a.ON_DESTROY);
        this._lifecycleRegistry = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        Intrinsics.j(view, "view");
        c();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams params) {
        Intrinsics.j(view, "view");
        c();
        super.setContentView(view, params);
    }
}
