package k8;

import g8.w;
import k8.u;

/* loaded from: classes4.dex */
public class n {

    /* renamed from: b, reason: collision with root package name */
    public static final n f141689b = new n(new u.b().h(EnumC15124j.USER_BEHAVIOR).g(true).f(false).i(null).e());

    /* renamed from: c, reason: collision with root package name */
    public static final u f141690c = new u.b().h(EnumC15124j.OFF).e();

    /* renamed from: a, reason: collision with root package name */
    private final u f141691a;

    public boolean a() {
        return this.f141691a.b() == EnumC15124j.USER_BEHAVIOR;
    }

    public boolean b() {
        return this.f141691a.b().ordinal() >= EnumC15124j.PERFORMANCE.ordinal();
    }

    public u c() {
        return this.f141691a;
    }

    public boolean d() {
        return this.f141691a.b() == EnumC15124j.USER_BEHAVIOR;
    }

    public boolean e(w wVar) {
        return wVar == w.f133184q ? this.f141691a.c() : wVar == w.f133172e ? this.f141691a.b() == EnumC15124j.OFF : wVar.b().ordinal() <= this.f141691a.b().ordinal();
    }

    public n(u uVar) {
        this.f141691a = uVar;
    }
}
