package Nn;

import android.view.View;

/* loaded from: classes9.dex */
public final class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final InterfaceC0367a f22552a;

    /* renamed from: b, reason: collision with root package name */
    final int f22553b;

    /* renamed from: Nn.a$a, reason: collision with other inner class name */
    public interface InterfaceC0367a {
        void b(int i10, View view);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.f22552a.b(this.f22553b, view);
    }

    public a(InterfaceC0367a interfaceC0367a, int i10) {
        this.f22552a = interfaceC0367a;
        this.f22553b = i10;
    }
}
