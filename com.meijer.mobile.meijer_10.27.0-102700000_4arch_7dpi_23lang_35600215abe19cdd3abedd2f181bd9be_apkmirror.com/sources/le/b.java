package le;

import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final View f148845a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f148846b = false;

    /* renamed from: c, reason: collision with root package name */
    private int f148847c = 0;

    private void a() {
        ViewParent parent = this.f148845a.getParent();
        if (parent instanceof CoordinatorLayout) {
            ((CoordinatorLayout) parent).g(this.f148845a);
        }
    }

    public int b() {
        return this.f148847c;
    }

    public boolean c() {
        return this.f148846b;
    }

    public void d(Bundle bundle) {
        this.f148846b = bundle.getBoolean("expanded", false);
        this.f148847c = bundle.getInt("expandedComponentIdHint", 0);
        if (this.f148846b) {
            a();
        }
    }

    public Bundle e() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", this.f148846b);
        bundle.putInt("expandedComponentIdHint", this.f148847c);
        return bundle;
    }

    public boolean f(boolean z10) {
        if (this.f148846b == z10) {
            return false;
        }
        this.f148846b = z10;
        a();
        return true;
    }

    public void g(int i10) {
        this.f148847c = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(InterfaceC15403a interfaceC15403a) {
        this.f148845a = (View) interfaceC15403a;
    }
}
