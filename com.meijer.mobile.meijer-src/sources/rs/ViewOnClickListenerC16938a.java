package rs;

import android.view.View;

/* renamed from: rs.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class ViewOnClickListenerC16938a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final InterfaceC2488a f159612a;

    /* renamed from: b, reason: collision with root package name */
    final int f159613b;

    /* renamed from: rs.a$a, reason: collision with other inner class name */
    public interface InterfaceC2488a {
        void b(int i10, View view);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.f159612a.b(this.f159613b, view);
    }

    public ViewOnClickListenerC16938a(InterfaceC2488a interfaceC2488a, int i10) {
        this.f159612a = interfaceC2488a;
        this.f159613b = i10;
    }
}
