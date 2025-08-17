package O;

import kotlin.jvm.internal.Intrinsics;
import o2.InterfaceC15993a;

/* renamed from: O.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4434u<T> implements InterfaceC15993a<T> {

    /* renamed from: a, reason: collision with root package name */
    private InterfaceC15993a<T> f22920a;

    public void a(InterfaceC15993a<T> interfaceC15993a) {
        this.f22920a = interfaceC15993a;
    }

    @Override // o2.InterfaceC15993a
    public void accept(T t10) {
        Intrinsics.h(this.f22920a, "Listener is not set.");
        this.f22920a.accept(t10);
    }
}
