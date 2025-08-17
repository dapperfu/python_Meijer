package rs;

import android.view.View;

/* renamed from: rs.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class ViewOnClickListenerC16832a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final InterfaceC2492a f159784a;

    /* renamed from: b, reason: collision with root package name */
    final int f159785b;

    /* renamed from: rs.a$a, reason: collision with other inner class name */
    public interface InterfaceC2492a {
        void b(int i10, View view);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.f159784a.b(this.f159785b, view);
    }

    public ViewOnClickListenerC16832a(InterfaceC2492a interfaceC2492a, int i10) {
        this.f159784a = interfaceC2492a;
        this.f159785b = i10;
    }
}
