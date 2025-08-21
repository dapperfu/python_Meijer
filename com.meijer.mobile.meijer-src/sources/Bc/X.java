package Bc;

import android.content.Context;
import gv.InterfaceC14411a;
import vc.InterfaceC17653b;

/* loaded from: classes4.dex */
public final class X implements InterfaceC17653b<W> {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC14411a<Context> f2668a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC14411a<String> f2669b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC14411a<Integer> f2670c;

    public static X a(InterfaceC14411a<Context> interfaceC14411a, InterfaceC14411a<String> interfaceC14411a2, InterfaceC14411a<Integer> interfaceC14411a3) {
        return new X(interfaceC14411a, interfaceC14411a2, interfaceC14411a3);
    }

    public static W c(Context context, String str, int i10) {
        return new W(context, str, i10);
    }

    @Override // gv.InterfaceC14411a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public W get() {
        return c(this.f2668a.get(), this.f2669b.get(), this.f2670c.get().intValue());
    }

    public X(InterfaceC14411a<Context> interfaceC14411a, InterfaceC14411a<String> interfaceC14411a2, InterfaceC14411a<Integer> interfaceC14411a3) {
        this.f2668a = interfaceC14411a;
        this.f2669b = interfaceC14411a2;
        this.f2670c = interfaceC14411a3;
    }
}
