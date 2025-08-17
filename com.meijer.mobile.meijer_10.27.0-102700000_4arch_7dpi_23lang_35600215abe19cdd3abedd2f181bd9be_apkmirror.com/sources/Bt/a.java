package Bt;

import Dt.b;
import Za.e;
import java.util.GregorianCalendar;
import java.util.List;
import ut.C17324j;
import ut.InterfaceC17325k;
import ut.InterfaceRunnableC17328n;

/* loaded from: classes11.dex */
public final class a implements InterfaceC17325k {

    /* renamed from: a, reason: collision with root package name */
    public InterfaceRunnableC17328n f3260a;

    /* renamed from: b, reason: collision with root package name */
    private final e f3261b;

    /* renamed from: c, reason: collision with root package name */
    private final b f3262c;

    @Override // ut.InterfaceC17325k
    public final boolean b(At.a aVar, List<C17324j> list) {
        return true;
    }

    @Override // ut.InterfaceC17325k
    public final void c(At.a aVar) {
    }

    @Override // ut.InterfaceC17325k
    public final void f(At.a aVar) {
        if (this.f3262c.b()) {
            return;
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(this.f3261b.b());
        gregorianCalendar.setTimeInMillis(this.f3261b.a());
        int i10 = gregorianCalendar.get(11);
        if (i10 >= 22 || i10 < 6) {
            this.f3260a.v0(1.5d);
        }
    }

    public a(e eVar, b bVar) {
        this.f3261b = eVar;
        this.f3262c = bVar;
    }
}
