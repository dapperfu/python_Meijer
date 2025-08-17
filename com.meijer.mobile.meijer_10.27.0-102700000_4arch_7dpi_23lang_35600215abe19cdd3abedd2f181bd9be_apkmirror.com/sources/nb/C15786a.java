package nb;

import Ib.j;
import Ib.k;
import Za.c;
import Za.e;
import nb.C15787b.a;
import rb.C16742a;

/* renamed from: nb.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C15786a extends Ya.b {

    /* renamed from: n, reason: collision with root package name */
    private C15787b f151116n;

    /* renamed from: o, reason: collision with root package name */
    private Bb.b f151117o;

    public C15786a(c cVar, e eVar, C15787b c15787b, Bb.b bVar) {
        super(cVar, eVar, "ApplicationConfigurationJob", bVar.n());
        this.f151116n = c15787b;
        this.f151117o = bVar;
    }

    @Override // Ya.c
    public final void x() throws Exception {
        C16742a c16742a = new C16742a();
        C15787b c15787b = this.f151116n;
        new k(c15787b.f151121c).i(c15787b.f151120b.e(j.f13788g), Ob.b.class, c15787b.new a(c16742a));
        c16742a.b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Ya.b, Ya.g
    public final long z() {
        return this.f151117o.n();
    }
}
