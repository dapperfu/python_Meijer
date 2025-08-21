package O;

import kotlin.jvm.internal.Intrinsics;
import o2.InterfaceC16068a;

/* renamed from: O.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4347u<T> implements InterfaceC16068a<T> {

    /* renamed from: a, reason: collision with root package name */
    private InterfaceC16068a<T> f22913a;

    public void a(InterfaceC16068a<T> interfaceC16068a) {
        this.f22913a = interfaceC16068a;
    }

    @Override // o2.InterfaceC16068a
    public void accept(T t10) {
        Intrinsics.h(this.f22913a, "Listener is not set.");
        this.f22913a.accept(t10);
    }
}
