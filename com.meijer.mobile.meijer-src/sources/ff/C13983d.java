package ff;

import Kf.a;
import android.os.Bundle;
import bf.InterfaceC6375a;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import of.C16121c;
import of.C16122d;
import of.C16123e;
import of.C16124f;
import of.InterfaceC16119a;
import pf.InterfaceC16421a;
import pf.InterfaceC16422b;

/* renamed from: ff.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C13983d {

    /* renamed from: a, reason: collision with root package name */
    private final Kf.a<InterfaceC6375a> f131699a;

    /* renamed from: b, reason: collision with root package name */
    private volatile InterfaceC16119a f131700b;

    /* renamed from: c, reason: collision with root package name */
    private volatile InterfaceC16422b f131701c;

    /* renamed from: d, reason: collision with root package name */
    private final List<InterfaceC16421a> f131702d;

    public C13983d(Kf.a<InterfaceC6375a> aVar) {
        this(aVar, new pf.c(), new C16124f());
    }

    public static /* synthetic */ void c(C13983d c13983d, InterfaceC16421a interfaceC16421a) {
        synchronized (c13983d) {
            try {
                if (c13983d.f131701c instanceof pf.c) {
                    c13983d.f131702d.add(interfaceC16421a);
                }
                c13983d.f131701c.a(interfaceC16421a);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public C13983d(Kf.a<InterfaceC6375a> aVar, InterfaceC16422b interfaceC16422b, InterfaceC16119a interfaceC16119a) {
        this.f131699a = aVar;
        this.f131701c = interfaceC16422b;
        this.f131702d = new ArrayList();
        this.f131700b = interfaceC16119a;
        f();
    }

    private void f() {
        this.f131699a.a(new a.InterfaceC0279a() { // from class: ff.c
            @Override // Kf.a.InterfaceC0279a
            public final void a(Kf.b bVar) {
                C13983d.a(this.f131698a, bVar);
            }
        });
    }

    private static InterfaceC6375a.InterfaceC1201a g(InterfaceC6375a interfaceC6375a, C13984e c13984e) {
        InterfaceC6375a.InterfaceC1201a interfaceC1201aC = interfaceC6375a.c("clx", c13984e);
        if (interfaceC1201aC != null) {
            return interfaceC1201aC;
        }
        nf.g.f().b("Could not register AnalyticsConnectorListener with Crashlytics origin.");
        InterfaceC6375a.InterfaceC1201a interfaceC1201aC2 = interfaceC6375a.c("crash", c13984e);
        if (interfaceC1201aC2 != null) {
            nf.g.f().k("A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.");
        }
        return interfaceC1201aC2;
    }

    public InterfaceC16119a d() {
        return new InterfaceC16119a() { // from class: ff.b
            @Override // of.InterfaceC16119a
            public final void a(String str, Bundle bundle) {
                this.f131697a.f131700b.a(str, bundle);
            }
        };
    }

    public InterfaceC16422b e() {
        return new InterfaceC16422b() { // from class: ff.a
            @Override // pf.InterfaceC16422b
            public final void a(InterfaceC16421a interfaceC16421a) {
                C13983d.c(this.f131696a, interfaceC16421a);
            }
        };
    }

    public static /* synthetic */ void a(C13983d c13983d, Kf.b bVar) {
        c13983d.getClass();
        nf.g.f().b("AnalyticsConnector now available.");
        InterfaceC6375a interfaceC6375a = (InterfaceC6375a) bVar.get();
        C16123e c16123e = new C16123e(interfaceC6375a);
        C13984e c13984e = new C13984e();
        if (g(interfaceC6375a, c13984e) != null) {
            nf.g.f().b("Registered Firebase Analytics listener.");
            C16122d c16122d = new C16122d();
            C16121c c16121c = new C16121c(c16123e, HttpResponseStatus.ERROR_INTERNAL_SERVER_ERROR, TimeUnit.MILLISECONDS);
            synchronized (c13983d) {
                try {
                    Iterator<InterfaceC16421a> it = c13983d.f131702d.iterator();
                    while (it.hasNext()) {
                        c16122d.a(it.next());
                    }
                    c13984e.d(c16122d);
                    c13984e.e(c16121c);
                    c13983d.f131701c = c16122d;
                    c13983d.f131700b = c16121c;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return;
        }
        nf.g.f().k("Could not register Firebase Analytics listener; a listener is already registered.");
    }
}
