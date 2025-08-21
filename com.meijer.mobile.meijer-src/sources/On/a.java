package On;

import android.view.View;

/* loaded from: classes10.dex */
public final class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final InterfaceC0406a f24797a;

    /* renamed from: b, reason: collision with root package name */
    final int f24798b;

    /* renamed from: On.a$a, reason: collision with other inner class name */
    public interface InterfaceC0406a {
        void b(int i10, View view);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.f24797a.b(this.f24798b, view);
    }

    public a(InterfaceC0406a interfaceC0406a, int i10) {
        this.f24797a = interfaceC0406a;
        this.f24798b = i10;
    }
}
