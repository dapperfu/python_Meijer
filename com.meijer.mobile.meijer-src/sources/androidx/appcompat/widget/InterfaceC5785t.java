package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.j;

/* renamed from: androidx.appcompat.widget.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC5785t {
    void A(Drawable drawable);

    boolean a();

    boolean b();

    boolean c();

    void collapseActionView();

    void d(Menu menu, j.a aVar);

    boolean e();

    void f();

    boolean g();

    Context getContext();

    CharSequence getTitle();

    boolean h();

    void i(int i10);

    void j(CharSequence charSequence);

    Menu k();

    int l();

    androidx.core.view.h m(int i10, long j10);

    ViewGroup n();

    void o(boolean z10);

    void p(int i10);

    void q();

    void r(boolean z10);

    void s();

    void setIcon(int i10);

    void setIcon(Drawable drawable);

    void setTitle(CharSequence charSequence);

    void setWindowCallback(Window.Callback callback);

    void setWindowTitle(CharSequence charSequence);

    void t(ScrollingTabContainerView scrollingTabContainerView);

    void u(int i10);

    void v(int i10);

    void w(j.a aVar, f.a aVar2);

    void x(int i10);

    int y();

    void z();
}
