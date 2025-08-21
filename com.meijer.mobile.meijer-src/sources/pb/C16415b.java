package pb;

import Kb.f;
import Kb.h;
import eb.C13786c;
import eb.C13787d;
import nt.InterfaceC16021c;

/* renamed from: pb.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C16415b {

    /* renamed from: d, reason: collision with root package name */
    private static final C13786c f156249d = C13787d.a(C16415b.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private Db.b f156250a;

    /* renamed from: b, reason: collision with root package name */
    f f156251b;

    /* renamed from: c, reason: collision with root package name */
    h f156252c;

    /* renamed from: pb.b$a */
    final class a implements InterfaceC16021c<Qb.b> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC16021c f156253a;

        @Override // nt.InterfaceC16021c
        public final /* synthetic */ void a(Qb.b bVar) {
            C16415b.f156249d.d("Successfully updated application configuration", new Object[0]);
            C16415b.this.f156250a.h(bVar);
            Db.b bVar2 = C16415b.this.f156250a;
            System.currentTimeMillis();
            bVar2.B();
            InterfaceC16021c interfaceC16021c = this.f156253a;
            if (interfaceC16021c != null) {
                interfaceC16021c.a(null);
            }
        }

        a(InterfaceC16021c interfaceC16021c) {
            this.f156253a = interfaceC16021c;
        }

        @Override // nt.InterfaceC16021c
        public final void a(int i10, String str) {
            C16415b.f156249d.g("Error refreshing application configuration, statusCode [{}], errorMessage", Integer.valueOf(i10), str);
            InterfaceC16021c interfaceC16021c = this.f156253a;
            if (interfaceC16021c != null) {
                interfaceC16021c.a(i10, str);
            }
        }
    }

    public C16415b(f fVar, Db.b bVar, h hVar) {
        this.f156251b = fVar;
        this.f156252c = hVar;
        this.f156250a = bVar;
    }
}
