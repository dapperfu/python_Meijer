package mc;

import eb.C13784a;
import eb.C13785b;
import kc.C15116a;

/* loaded from: classes4.dex */
public class f implements d {

    /* renamed from: b, reason: collision with root package name */
    private static final C13784a f150988b = C13785b.a(f.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private ec.e f150989a;

    @Override // mc.d
    public final boolean a(C15116a c15116a, String str) {
        if (!this.f150989a.a(c15116a).booleanValue()) {
            return false;
        }
        c15116a.g();
        this.f150989a.b(c15116a);
        return true;
    }

    public f(ec.e eVar) {
        this.f150989a = eVar;
    }
}
