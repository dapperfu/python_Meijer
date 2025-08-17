package p2;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import com.fullstory.FS;

/* renamed from: p2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC16199a {

    /* renamed from: a, reason: collision with root package name */
    private final Context f155356a;

    /* renamed from: b, reason: collision with root package name */
    private InterfaceC2411a f155357b;

    /* renamed from: c, reason: collision with root package name */
    private b f155358c;

    /* renamed from: p2.a$a, reason: collision with other inner class name */
    public interface InterfaceC2411a {
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
        this.f155358c = null;
        this.f155357b = null;
    }

    public void i(InterfaceC2411a interfaceC2411a) {
        this.f155357b = interfaceC2411a;
    }

    public void j(b bVar) {
        if (this.f155358c != null && bVar != null) {
            FS.log_w("ActionProvider(support)", "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.f155358c = bVar;
    }

    public AbstractC16199a(Context context) {
        this.f155356a = context;
    }

    public View d(MenuItem menuItem) {
        return c();
    }
}
