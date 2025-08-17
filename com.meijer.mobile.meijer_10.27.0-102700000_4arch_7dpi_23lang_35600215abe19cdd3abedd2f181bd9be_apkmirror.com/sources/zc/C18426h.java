package zc;

import android.content.Context;
import kv.InterfaceC15323a;
import tc.C17080d;
import tc.InterfaceC17078b;

/* renamed from: zc.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C18426h implements InterfaceC17078b<String> {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC15323a<Context> f171772a;

    public static C18426h a(InterfaceC15323a<Context> interfaceC15323a) {
        return new C18426h(interfaceC15323a);
    }

    @Override // kv.InterfaceC15323a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public String get() {
        return c(this.f171772a.get());
    }

    public C18426h(InterfaceC15323a<Context> interfaceC15323a) {
        this.f171772a = interfaceC15323a;
    }

    public static String c(Context context) {
        return (String) C17080d.d(AbstractC18424f.b(context));
    }
}
