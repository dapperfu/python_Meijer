package ne;

import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final View f152242a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f152243b = false;

    /* renamed from: c, reason: collision with root package name */
    private int f152244c = 0;

    private void a() {
        ViewParent parent = this.f152242a.getParent();
        if (parent instanceof CoordinatorLayout) {
            ((CoordinatorLayout) parent).g(this.f152242a);
        }
    }

    public int b() {
        return this.f152244c;
    }

    public boolean c() {
        return this.f152243b;
    }

    public void d(Bundle bundle) {
        this.f152243b = bundle.getBoolean("expanded", false);
        this.f152244c = bundle.getInt("expandedComponentIdHint", 0);
        if (this.f152243b) {
            a();
        }
    }

    public Bundle e() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", this.f152243b);
        bundle.putInt("expandedComponentIdHint", this.f152244c);
        return bundle;
    }

    public boolean f(boolean z10) {
        if (this.f152243b == z10) {
            return false;
        }
        this.f152243b = z10;
        a();
        return true;
    }

    public void g(int i10) {
        this.f152244c = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(InterfaceC15937a interfaceC15937a) {
        this.f152242a = (View) interfaceC15937a;
    }
}
