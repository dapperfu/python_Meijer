package m8;

import i8.w;
import m8.u;

/* loaded from: classes4.dex */
public class n {

    /* renamed from: b, reason: collision with root package name */
    public static final n f150835b = new n(new u.b().h(EnumC15695j.USER_BEHAVIOR).g(true).f(false).i(null).e());

    /* renamed from: c, reason: collision with root package name */
    public static final u f150836c = new u.b().h(EnumC15695j.OFF).e();

    /* renamed from: a, reason: collision with root package name */
    private final u f150837a;

    public boolean a() {
        return this.f150837a.b() == EnumC15695j.USER_BEHAVIOR;
    }

    public boolean b() {
        return this.f150837a.b().ordinal() >= EnumC15695j.PERFORMANCE.ordinal();
    }

    public u c() {
        return this.f150837a;
    }

    public boolean d() {
        return this.f150837a.b() == EnumC15695j.USER_BEHAVIOR;
    }

    public boolean e(w wVar) {
        return wVar == w.f137400q ? this.f150837a.c() : wVar == w.f137388e ? this.f150837a.b() == EnumC15695j.OFF : wVar.b().ordinal() <= this.f150837a.b().ordinal();
    }

    public n(u uVar) {
        this.f150837a = uVar;
    }
}
