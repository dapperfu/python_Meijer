package F;

import android.util.Size;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class P implements InterfaceC3627y {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3627y f9915a;

    @Override // C.InterfaceC2971n
    public int a() {
        return this.f9915a.a();
    }

    @Override // F.InterfaceC3627y
    public String b() {
        return this.f9915a.b();
    }

    @Override // F.InterfaceC3627y
    public List<Size> c(int i10) {
        return this.f9915a.c(i10);
    }

    @Override // F.InterfaceC3627y
    public l0 d() {
        return this.f9915a.d();
    }

    @Override // F.InterfaceC3627y
    public List<Size> e(int i10) {
        return this.f9915a.e(i10);
    }

    @Override // F.InterfaceC3627y
    public void f(AbstractC3611h abstractC3611h) {
        this.f9915a.f(abstractC3611h);
    }

    @Override // C.InterfaceC2971n
    public String g() {
        return this.f9915a.g();
    }

    @Override // F.InterfaceC3627y
    public InterfaceC3627y getImplementation() {
        return this.f9915a.getImplementation();
    }

    @Override // C.InterfaceC2971n
    public int getLensFacing() {
        return this.f9915a.getLensFacing();
    }

    @Override // C.InterfaceC2971n
    public int h(int i10) {
        return this.f9915a.h(i10);
    }

    @Override // F.InterfaceC3627y
    public void i(Executor executor, AbstractC3611h abstractC3611h) {
        this.f9915a.i(executor, abstractC3611h);
    }

    public P(InterfaceC3627y interfaceC3627y) {
        this.f9915a = interfaceC3627y;
    }
}
