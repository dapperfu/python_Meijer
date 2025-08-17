package nb;

import Ib.f;
import Ib.h;
import cb.C6382c;
import cb.C6383d;
import nt.InterfaceC15945c;

/* renamed from: nb.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C15787b {

    /* renamed from: d, reason: collision with root package name */
    private static final C6382c f151118d = C6383d.a(C15787b.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private Bb.b f151119a;

    /* renamed from: b, reason: collision with root package name */
    f f151120b;

    /* renamed from: c, reason: collision with root package name */
    h f151121c;

    /* renamed from: nb.b$a */
    final class a implements InterfaceC15945c<Ob.b> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC15945c f151122a;

        @Override // nt.InterfaceC15945c
        public final /* synthetic */ void a(Ob.b bVar) {
            C15787b.f151118d.d("Successfully updated application configuration", new Object[0]);
            C15787b.this.f151119a.h(bVar);
            Bb.b bVar2 = C15787b.this.f151119a;
            System.currentTimeMillis();
            bVar2.B();
            InterfaceC15945c interfaceC15945c = this.f151122a;
            if (interfaceC15945c != null) {
                interfaceC15945c.a(null);
            }
        }

        a(InterfaceC15945c interfaceC15945c) {
            this.f151122a = interfaceC15945c;
        }

        @Override // nt.InterfaceC15945c
        public final void a(int i10, String str) {
            C15787b.f151118d.g("Error refreshing application configuration, statusCode [{}], errorMessage", Integer.valueOf(i10), str);
            InterfaceC15945c interfaceC15945c = this.f151122a;
            if (interfaceC15945c != null) {
                interfaceC15945c.a(i10, str);
            }
        }
    }

    public C15787b(f fVar, Bb.b bVar, h hVar) {
        this.f151120b = fVar;
        this.f151121c = hVar;
        this.f151119a = bVar;
    }
}
