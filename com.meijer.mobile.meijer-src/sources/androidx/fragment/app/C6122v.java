package androidx.fragment.app;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;

/* renamed from: androidx.fragment.app.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6122v {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC6124x<?> f55336a;

    public static C6122v b(AbstractC6124x<?> abstractC6124x) {
        return new C6122v((AbstractC6124x) o2.i.h(abstractC6124x, "callbacks == null"));
    }

    public void a(Fragment fragment) {
        FragmentManager fragmentManagerG = this.f55336a.getFragmentManager();
        AbstractC6124x<?> abstractC6124x = this.f55336a;
        fragmentManagerG.attachController(abstractC6124x, abstractC6124x, fragment);
    }

    public void c() {
        this.f55336a.getFragmentManager().dispatchActivityCreated();
    }

    public boolean d(MenuItem menuItem) {
        return this.f55336a.getFragmentManager().dispatchContextItemSelected(menuItem);
    }

    public void e() {
        this.f55336a.getFragmentManager().dispatchCreate();
    }

    public void f() {
        this.f55336a.getFragmentManager().dispatchDestroy();
    }

    public void g() {
        this.f55336a.getFragmentManager().dispatchPause();
    }

    public void h() {
        this.f55336a.getFragmentManager().dispatchResume();
    }

    public void i() {
        this.f55336a.getFragmentManager().dispatchStart();
    }

    public void j() {
        this.f55336a.getFragmentManager().dispatchStop();
    }

    public boolean k() {
        return this.f55336a.getFragmentManager().execPendingActions(true);
    }

    public FragmentManager l() {
        return this.f55336a.getFragmentManager();
    }

    public void m() {
        this.f55336a.getFragmentManager().noteStateNotSaved();
    }

    public View n(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f55336a.getFragmentManager().getLayoutInflaterFactory().onCreateView(view, str, context, attributeSet);
    }

    private C6122v(AbstractC6124x<?> abstractC6124x) {
        this.f55336a = abstractC6124x;
    }
}
