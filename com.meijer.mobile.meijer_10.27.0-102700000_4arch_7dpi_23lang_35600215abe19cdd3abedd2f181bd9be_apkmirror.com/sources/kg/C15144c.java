package kg;

import android.content.Context;
import jg.InterfaceC14891b;
import kv.InterfaceC15323a;

/* renamed from: kg.c, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C15144c implements InterfaceC14891b<C15143b> {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC15323a<Context> f141853a;

    public static C15144c a(InterfaceC15323a<Context> interfaceC15323a) {
        return new C15144c(interfaceC15323a);
    }

    public static C15143b c(Context context) {
        return new C15143b(context);
    }

    @Override // kv.InterfaceC15323a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C15143b get() {
        return c(this.f141853a.get());
    }

    public C15144c(InterfaceC15323a<Context> interfaceC15323a) {
        this.f141853a = interfaceC15323a;
    }
}
