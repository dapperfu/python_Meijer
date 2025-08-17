package gb;

import Ib.h;
import cb.C6380a;
import cb.C6381b;
import cb.C6382c;
import cb.C6383d;
import nt.InterfaceC15945c;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: c, reason: collision with root package name */
    private static final C6382c f133261c = C6383d.a("AdIdProcessor");

    /* renamed from: d, reason: collision with root package name */
    private static final C6380a f133262d = C6381b.a("AdIdProcessor");

    /* renamed from: a, reason: collision with root package name */
    Ib.f f133263a;

    /* renamed from: b, reason: collision with root package name */
    h f133264b;

    final class a implements InterfaceC15945c<Object> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC15945c f133265a;

        @Override // nt.InterfaceC15945c
        public final void a(Object obj) {
            C6380a unused = b.f133262d;
            InterfaceC15945c interfaceC15945c = this.f133265a;
            if (interfaceC15945c != null) {
                interfaceC15945c.a(null);
            }
        }

        a(InterfaceC15945c interfaceC15945c) {
            this.f133265a = interfaceC15945c;
        }

        @Override // nt.InterfaceC15945c
        public final void a(int i10, String str) {
            b.f133261c.g("Error sending advertising identifier, statusCode [{}], errorMessage", Integer.valueOf(i10), str);
            InterfaceC15945c interfaceC15945c = this.f133265a;
            if (interfaceC15945c != null) {
                interfaceC15945c.a(i10, str);
            }
        }
    }

    public b(Ib.f fVar, h hVar) {
        this.f133263a = fVar;
        this.f133264b = hVar;
    }
}
