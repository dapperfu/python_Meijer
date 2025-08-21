package ib;

import Kb.h;
import eb.C13784a;
import eb.C13785b;
import eb.C13786c;
import eb.C13787d;
import nt.InterfaceC16021c;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: c, reason: collision with root package name */
    private static final C13786c f137477c = C13787d.a("AdIdProcessor");

    /* renamed from: d, reason: collision with root package name */
    private static final C13784a f137478d = C13785b.a("AdIdProcessor");

    /* renamed from: a, reason: collision with root package name */
    Kb.f f137479a;

    /* renamed from: b, reason: collision with root package name */
    h f137480b;

    final class a implements InterfaceC16021c<Object> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC16021c f137481a;

        @Override // nt.InterfaceC16021c
        public final void a(Object obj) {
            C13784a unused = b.f137478d;
            InterfaceC16021c interfaceC16021c = this.f137481a;
            if (interfaceC16021c != null) {
                interfaceC16021c.a(null);
            }
        }

        a(InterfaceC16021c interfaceC16021c) {
            this.f137481a = interfaceC16021c;
        }

        @Override // nt.InterfaceC16021c
        public final void a(int i10, String str) {
            b.f137477c.g("Error sending advertising identifier, statusCode [{}], errorMessage", Integer.valueOf(i10), str);
            InterfaceC16021c interfaceC16021c = this.f137481a;
            if (interfaceC16021c != null) {
                interfaceC16021c.a(i10, str);
            }
        }
    }

    public b(Kb.f fVar, h hVar) {
        this.f137479a = fVar;
        this.f137480b = hVar;
    }
}
