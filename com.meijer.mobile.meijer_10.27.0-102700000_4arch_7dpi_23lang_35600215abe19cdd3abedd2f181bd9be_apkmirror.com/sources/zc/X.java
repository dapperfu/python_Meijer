package zc;

import android.content.Context;
import kv.InterfaceC15323a;
import tc.InterfaceC17078b;

/* loaded from: classes4.dex */
public final class X implements InterfaceC17078b<W> {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC15323a<Context> f171754a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC15323a<String> f171755b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC15323a<Integer> f171756c;

    public static X a(InterfaceC15323a<Context> interfaceC15323a, InterfaceC15323a<String> interfaceC15323a2, InterfaceC15323a<Integer> interfaceC15323a3) {
        return new X(interfaceC15323a, interfaceC15323a2, interfaceC15323a3);
    }

    public static W c(Context context, String str, int i10) {
        return new W(context, str, i10);
    }

    @Override // kv.InterfaceC15323a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public W get() {
        return c(this.f171754a.get(), this.f171755b.get(), this.f171756c.get().intValue());
    }

    public X(InterfaceC15323a<Context> interfaceC15323a, InterfaceC15323a<String> interfaceC15323a2, InterfaceC15323a<Integer> interfaceC15323a3) {
        this.f171754a = interfaceC15323a;
        this.f171755b = interfaceC15323a2;
        this.f171756c = interfaceC15323a3;
    }
}
