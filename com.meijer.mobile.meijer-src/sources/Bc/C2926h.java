package Bc;

import android.content.Context;
import gv.InterfaceC14411a;
import vc.C17655d;
import vc.InterfaceC17653b;

/* renamed from: Bc.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2926h implements InterfaceC17653b<String> {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC14411a<Context> f2686a;

    public static C2926h a(InterfaceC14411a<Context> interfaceC14411a) {
        return new C2926h(interfaceC14411a);
    }

    @Override // gv.InterfaceC14411a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public String get() {
        return c(this.f2686a.get());
    }

    public C2926h(InterfaceC14411a<Context> interfaceC14411a) {
        this.f2686a = interfaceC14411a;
    }

    public static String c(Context context) {
        return (String) C17655d.d(AbstractC2924f.b(context));
    }
}
