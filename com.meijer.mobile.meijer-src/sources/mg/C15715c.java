package mg;

import android.content.Context;
import gv.InterfaceC14411a;
import lg.InterfaceC15490b;

/* renamed from: mg.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C15715c implements InterfaceC15490b<C15714b> {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC14411a<Context> f150999a;

    public static C15715c a(InterfaceC14411a<Context> interfaceC14411a) {
        return new C15715c(interfaceC14411a);
    }

    public static C15714b c(Context context) {
        return new C15714b(context);
    }

    @Override // gv.InterfaceC14411a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C15714b get() {
        return c(this.f150999a.get());
    }

    public C15715c(InterfaceC14411a<Context> interfaceC14411a) {
        this.f150999a = interfaceC14411a;
    }
}
