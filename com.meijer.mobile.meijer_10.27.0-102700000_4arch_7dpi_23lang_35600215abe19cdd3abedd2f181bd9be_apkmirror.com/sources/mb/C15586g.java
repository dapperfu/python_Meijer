package mb;

import Ab.a;
import cb.C6380a;
import cb.C6381b;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import lb.C15392a;
import mt.C15708b;
import nt.InterfaceC15945c;

/* renamed from: mb.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C15586g {

    /* renamed from: e, reason: collision with root package name */
    private static final C6380a f150020e = C6381b.a(C15586g.class.getName());

    /* renamed from: a, reason: collision with root package name */
    Ib.h f150021a;

    /* renamed from: b, reason: collision with root package name */
    Ib.f f150022b;

    /* renamed from: c, reason: collision with root package name */
    public Bb.e f150023c;

    /* renamed from: d, reason: collision with root package name */
    C15587h f150024d;

    /* renamed from: mb.g$a */
    final class a implements InterfaceC15945c<C15708b[]> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C15392a.EnumC2285a f150025a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Ab.a f150026b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC15945c f150027c;

        @Override // nt.InterfaceC15945c
        public final /* synthetic */ void a(C15708b[] c15708bArr) {
            List<C15392a> listB = C15585f.b(c15708bArr, this.f150025a, this.f150026b);
            C15587h c15587h = C15586g.this.f150024d;
            String strJ = this.f150026b.j();
            a.b bVarC = this.f150026b.c();
            if (bVarC != null) {
                try {
                    Iterator<C15581b> itB = c15587h.f150032b.b();
                    while (itB.hasNext()) {
                        C15581b next = itB.next();
                        if (next.b().startsWith(strJ) && next.c().c() == C15587h.a(bVarC)) {
                            try {
                                next.a();
                                c15587h.f150032b.k(next.b());
                            } catch (IOException unused) {
                                C15587h.f150030i.g("Unable to limit communication {}", next.a());
                            }
                        }
                    }
                } catch (IOException unused2) {
                    C15587h.f150030i.g("Unable to cancel potential scheduled communications {}", new Object[0]);
                }
            }
            C15586g.this.f150024d.b(listB);
            this.f150027c.a(listB);
        }

        a(C15392a.EnumC2285a enumC2285a, Ab.a aVar, InterfaceC15945c interfaceC15945c) {
            this.f150025a = enumC2285a;
            this.f150026b = aVar;
            this.f150027c = interfaceC15945c;
        }

        @Override // nt.InterfaceC15945c
        public final void a(int i10, String str) {
            this.f150027c.a(i10, str);
            C6380a unused = C15586g.f150020e;
        }
    }

    public final synchronized void c() {
        this.f150023c.y(true);
    }

    public final synchronized void d() {
        this.f150023c.y(false);
    }

    static String a(Boolean bool) {
        return "?filter=" + bool;
    }

    public C15586g(Ib.f fVar, Ib.h hVar, Bb.e eVar, C15587h c15587h) {
        this.f150021a = hVar;
        this.f150022b = fVar;
        this.f150023c = eVar;
        this.f150024d = c15587h;
    }
}
