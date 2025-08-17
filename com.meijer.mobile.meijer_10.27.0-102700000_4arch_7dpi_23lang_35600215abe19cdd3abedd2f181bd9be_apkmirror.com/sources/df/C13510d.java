package df;

import If.a;
import Ze.a;
import android.os.Bundle;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import mf.C15611c;
import mf.C15612d;
import mf.C15613e;
import mf.C15614f;
import mf.InterfaceC15609a;
import nf.InterfaceC15793a;
import nf.InterfaceC15794b;

/* renamed from: df.d, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C13510d {

    /* renamed from: a, reason: collision with root package name */
    private final If.a<Ze.a> f127370a;

    /* renamed from: b, reason: collision with root package name */
    private volatile InterfaceC15609a f127371b;

    /* renamed from: c, reason: collision with root package name */
    private volatile InterfaceC15794b f127372c;

    /* renamed from: d, reason: collision with root package name */
    private final List<InterfaceC15793a> f127373d;

    public C13510d(If.a<Ze.a> aVar) {
        this(aVar, new nf.c(), new C15614f());
    }

    public static /* synthetic */ void c(C13510d c13510d, InterfaceC15793a interfaceC15793a) {
        synchronized (c13510d) {
            try {
                if (c13510d.f127372c instanceof nf.c) {
                    c13510d.f127373d.add(interfaceC15793a);
                }
                c13510d.f127372c.a(interfaceC15793a);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public C13510d(If.a<Ze.a> aVar, InterfaceC15794b interfaceC15794b, InterfaceC15609a interfaceC15609a) {
        this.f127370a = aVar;
        this.f127372c = interfaceC15794b;
        this.f127373d = new ArrayList();
        this.f127371b = interfaceC15609a;
        f();
    }

    private void f() {
        this.f127370a.a(new a.InterfaceC0219a() { // from class: df.c
            @Override // If.a.InterfaceC0219a
            public final void a(If.b bVar) {
                C13510d.a(this.f127369a, bVar);
            }
        });
    }

    private static a.InterfaceC0912a g(Ze.a aVar, C13511e c13511e) {
        a.InterfaceC0912a interfaceC0912aF = aVar.f("clx", c13511e);
        if (interfaceC0912aF != null) {
            return interfaceC0912aF;
        }
        lf.g.f().b("Could not register AnalyticsConnectorListener with Crashlytics origin.");
        a.InterfaceC0912a interfaceC0912aF2 = aVar.f("crash", c13511e);
        if (interfaceC0912aF2 != null) {
            lf.g.f().k("A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.");
        }
        return interfaceC0912aF2;
    }

    public InterfaceC15609a d() {
        return new InterfaceC15609a() { // from class: df.b
            @Override // mf.InterfaceC15609a
            public final void a(String str, Bundle bundle) {
                this.f127368a.f127371b.a(str, bundle);
            }
        };
    }

    public InterfaceC15794b e() {
        return new InterfaceC15794b() { // from class: df.a
            @Override // nf.InterfaceC15794b
            public final void a(InterfaceC15793a interfaceC15793a) {
                C13510d.c(this.f127367a, interfaceC15793a);
            }
        };
    }

    public static /* synthetic */ void a(C13510d c13510d, If.b bVar) {
        c13510d.getClass();
        lf.g.f().b("AnalyticsConnector now available.");
        Ze.a aVar = (Ze.a) bVar.get();
        C15613e c15613e = new C15613e(aVar);
        C13511e c13511e = new C13511e();
        if (g(aVar, c13511e) != null) {
            lf.g.f().b("Registered Firebase Analytics listener.");
            C15612d c15612d = new C15612d();
            C15611c c15611c = new C15611c(c15613e, HttpResponseStatus.ERROR_INTERNAL_SERVER_ERROR, TimeUnit.MILLISECONDS);
            synchronized (c13510d) {
                try {
                    Iterator<InterfaceC15793a> it = c13510d.f127373d.iterator();
                    while (it.hasNext()) {
                        c15612d.a(it.next());
                    }
                    c13511e.d(c15612d);
                    c13511e.e(c15611c);
                    c13510d.f127372c = c15612d;
                    c13510d.f127371b = c15611c;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return;
        }
        lf.g.f().k("Could not register Firebase Analytics listener; a listener is already registered.");
    }
}
