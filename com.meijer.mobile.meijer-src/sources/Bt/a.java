package Bt;

import Dt.b;
import bb.e;
import java.util.GregorianCalendar;
import java.util.List;
import ut.C17476j;
import ut.InterfaceC17477k;
import ut.InterfaceRunnableC17480n;

/* loaded from: classes12.dex */
public final class a implements InterfaceC17477k {

    /* renamed from: a, reason: collision with root package name */
    public InterfaceRunnableC17480n f3666a;

    /* renamed from: b, reason: collision with root package name */
    private final e f3667b;

    /* renamed from: c, reason: collision with root package name */
    private final b f3668c;

    @Override // ut.InterfaceC17477k
    public final boolean b(At.a aVar, List<C17476j> list) {
        return true;
    }

    @Override // ut.InterfaceC17477k
    public final void c(At.a aVar) {
    }

    @Override // ut.InterfaceC17477k
    public final void f(At.a aVar) {
        if (this.f3668c.b()) {
            return;
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(this.f3667b.b());
        gregorianCalendar.setTimeInMillis(this.f3667b.a());
        int i10 = gregorianCalendar.get(11);
        if (i10 >= 22 || i10 < 6) {
            this.f3666a.s0(1.5d);
        }
    }

    public a(e eVar, b bVar) {
        this.f3667b = eVar;
        this.f3668c = bVar;
    }
}
