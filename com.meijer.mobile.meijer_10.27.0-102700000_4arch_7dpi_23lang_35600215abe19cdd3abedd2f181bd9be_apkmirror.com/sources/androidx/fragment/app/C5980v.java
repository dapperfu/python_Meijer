package androidx.fragment.app;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;

/* renamed from: androidx.fragment.app.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5980v {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC5982x<?> f55112a;

    public static C5980v b(AbstractC5982x<?> abstractC5982x) {
        return new C5980v((AbstractC5982x) o2.i.h(abstractC5982x, "callbacks == null"));
    }

    public void a(Fragment fragment) {
        FragmentManager fragmentManagerG = this.f55112a.getFragmentManager();
        AbstractC5982x<?> abstractC5982x = this.f55112a;
        fragmentManagerG.attachController(abstractC5982x, abstractC5982x, fragment);
    }

    public void c() {
        this.f55112a.getFragmentManager().dispatchActivityCreated();
    }

    public boolean d(MenuItem menuItem) {
        return this.f55112a.getFragmentManager().dispatchContextItemSelected(menuItem);
    }

    public void e() {
        this.f55112a.getFragmentManager().dispatchCreate();
    }

    public void f() {
        this.f55112a.getFragmentManager().dispatchDestroy();
    }

    public void g() {
        this.f55112a.getFragmentManager().dispatchPause();
    }

    public void h() {
        this.f55112a.getFragmentManager().dispatchResume();
    }

    public void i() {
        this.f55112a.getFragmentManager().dispatchStart();
    }

    public void j() {
        this.f55112a.getFragmentManager().dispatchStop();
    }

    public boolean k() {
        return this.f55112a.getFragmentManager().execPendingActions(true);
    }

    public FragmentManager l() {
        return this.f55112a.getFragmentManager();
    }

    public void m() {
        this.f55112a.getFragmentManager().noteStateNotSaved();
    }

    public View n(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f55112a.getFragmentManager().getLayoutInflaterFactory().onCreateView(view, str, context, attributeSet);
    }

    private C5980v(AbstractC5982x<?> abstractC5982x) {
        this.f55112a = abstractC5982x;
    }
}
