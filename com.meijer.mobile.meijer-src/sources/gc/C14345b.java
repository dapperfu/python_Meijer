package gc;

import Db.e;
import Fb.d;
import hc.C14500a;
import hc.C14501b;
import hc.C14502c;
import ic.C14708a;
import ic.C14709b;
import ic.c;
import java.util.List;
import ub.C17367c;
import vb.C17651a;
import vb.h;
import vb.n;
import xb.C18150d;

/* renamed from: gc.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C14345b implements InterfaceC14344a {

    /* renamed from: a, reason: collision with root package name */
    private Jb.a f134124a;

    /* renamed from: b, reason: collision with root package name */
    private C17367c f134125b;

    /* renamed from: c, reason: collision with root package name */
    private C18150d f134126c;

    /* renamed from: d, reason: collision with root package name */
    private e f134127d;

    /* renamed from: e, reason: collision with root package name */
    private String f134128e;

    /* renamed from: f, reason: collision with root package name */
    private d f134129f;

    @Override // gc.InterfaceC14344a
    public final void a(C14709b c14709b, Tb.a<C14708a> aVar) {
        new C14502c(this.f134124a).d(c14709b, aVar, this.f134125b, this.f134126c);
    }

    @Override // gc.InterfaceC14344a
    public final void b(ic.d dVar, Tb.a<ic.e> aVar) {
        new C14501b(this.f134124a).d(dVar, aVar, this.f134125b, this.f134126c);
    }

    @Override // gc.InterfaceC14344a
    public final void c(String str, Integer num, Integer num2, Tb.a<List<Sb.b>> aVar) {
        c cVar = new c();
        cVar.g(str);
        cVar.e(num);
        cVar.f(num2);
        new h(this.f134124a, this.f134127d, this.f134128e, this.f134129f).d(cVar, aVar, this.f134125b, this.f134126c);
    }

    @Override // gc.InterfaceC14344a
    public final void d(ic.d dVar, Tb.a<ic.e> aVar) {
        new C14500a(this.f134124a).d(dVar, aVar, this.f134125b, this.f134126c);
    }

    @Override // gc.InterfaceC14344a
    public final void e(C17651a c17651a, Tb.a<C14708a> aVar) {
        new n(this.f134124a).d(c17651a, aVar, this.f134125b, this.f134126c);
    }

    public C14345b(C17367c c17367c, Jb.a aVar, C18150d c18150d, e eVar, String str, d dVar) {
        this.f134125b = c17367c;
        this.f134124a = aVar;
        this.f134126c = c18150d;
        this.f134127d = eVar;
        this.f134128e = str;
        this.f134129f = dVar;
    }
}
