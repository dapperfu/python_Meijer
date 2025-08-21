package zt;

import eb.C13784a;
import eb.C13785b;
import eb.C13786c;
import eb.C13787d;
import java.util.List;
import kt.C15422h;
import pt.InterfaceC16542b;
import ut.C17476j;
import ut.InterfaceC17477k;
import ut.InterfaceRunnableC17480n;

/* loaded from: classes13.dex */
public class m implements InterfaceC16542b, InterfaceC17477k {

    /* renamed from: f, reason: collision with root package name */
    private static final C13784a f173257f = C13785b.a(m.class.getName());

    /* renamed from: g, reason: collision with root package name */
    private static final C13786c f173258g = C13787d.a("PLACE");

    /* renamed from: a, reason: collision with root package name */
    private final C18548b f173259a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceRunnableC17480n f173260b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f173261c;

    /* renamed from: d, reason: collision with root package name */
    private final Db.e f173262d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f173263e = false;

    @Override // ut.InterfaceC17477k
    public final void c(At.a aVar) {
    }

    @Override // ut.InterfaceC17477k
    public final void f(At.a aVar) {
    }

    @Override // pt.InterfaceC16542b
    public final void a(List<C15422h> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        if (this.f173261c && this.f173262d.e()) {
            f173258g.d("Place definitions were updated", new Object[0]);
        }
        this.f173263e = true;
        this.f173260b.c();
    }

    @Override // ut.InterfaceC17477k
    public final boolean b(At.a aVar, List<C17476j> list) {
        if (!this.f173263e) {
            return true;
        }
        if (this.f173261c && this.f173262d.e()) {
            f173258g.d("Place definitions were updated", new Object[0]);
        }
        this.f173263e = false;
        return this.f173259a.b(aVar, list);
    }

    public m(C18548b c18548b, Nb.g gVar, Db.e eVar) {
        this.f173259a = c18548b;
        this.f173261c = gVar.f20765b;
        this.f173262d = eVar;
    }
}
