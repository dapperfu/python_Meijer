package zc;

import tc.C17080d;
import tc.InterfaceC17078b;

/* renamed from: zc.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C18425g implements InterfaceC17078b<String> {

    /* renamed from: zc.g$a */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private static final C18425g f171771a = new C18425g();
    }

    public static C18425g a() {
        return a.f171771a;
    }

    public static String b() {
        return (String) C17080d.d(AbstractC18424f.a());
    }

    @Override // kv.InterfaceC15323a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public String get() {
        return b();
    }
}
