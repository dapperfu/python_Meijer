package zc;

import tc.C17080d;
import tc.InterfaceC17078b;

/* renamed from: zc.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C18428j implements InterfaceC17078b<AbstractC18423e> {

    /* renamed from: zc.j$a */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private static final C18428j f171774a = new C18428j();
    }

    public static C18428j a() {
        return a.f171774a;
    }

    public static AbstractC18423e c() {
        return (AbstractC18423e) C17080d.d(AbstractC18424f.d());
    }

    @Override // kv.InterfaceC15323a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public AbstractC18423e get() {
        return c();
    }
}
