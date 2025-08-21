package p2;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import com.fullstory.FS;

/* renamed from: p2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC16344a {

    /* renamed from: a, reason: collision with root package name */
    private final Context f156030a;

    /* renamed from: b, reason: collision with root package name */
    private InterfaceC2415a f156031b;

    /* renamed from: c, reason: collision with root package name */
    private b f156032c;

    /* renamed from: p2.a$a, reason: collision with other inner class name */
    public interface InterfaceC2415a {
    }

    /* renamed from: p2.a$b */
    public interface b {
        void onActionProviderVisibilityChanged(boolean z10);
    }

    public boolean a() {
        return false;
    }

    public boolean b() {
        return true;
    }

    public abstract View c();

    public boolean e() {
        return false;
    }

    public void f(SubMenu subMenu) {
    }

    public boolean g() {
        return false;
    }

    public void h() {
        this.f156032c = null;
        this.f156031b = null;
    }

    public void i(InterfaceC2415a interfaceC2415a) {
        this.f156031b = interfaceC2415a;
    }

    public void j(b bVar) {
        if (this.f156032c != null && bVar != null) {
            FS.log_w("ActionProvider(support)", "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.f156032c = bVar;
    }

    public AbstractC16344a(Context context) {
        this.f156030a = context;
    }

    public View d(MenuItem menuItem) {
        return c();
    }
}
