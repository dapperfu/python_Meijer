package x8;

import android.app.Application;
import i8.l;
import l8.InterfaceC15473a;
import l8.InterfaceC15474b;
import m8.q;
import okhttp3.d;
import u7.OneAgentConfiguration;
import u8.InterfaceC17360a;
import v7.C17645b;
import y7.InterfaceC18294a;
import y8.InterfaceC18295a;

/* renamed from: x8.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C18134b implements InterfaceC18133a {

    /* renamed from: a, reason: collision with root package name */
    private final OneAgentConfiguration f170633a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC18294a f170634b;

    /* renamed from: c, reason: collision with root package name */
    private final Application f170635c;

    /* renamed from: d, reason: collision with root package name */
    private final d.a f170636d;

    /* renamed from: e, reason: collision with root package name */
    private final K7.h f170637e;

    /* renamed from: x8.b$a */
    class a implements InterfaceC15474b {
        a() {
        }

        @Override // l8.InterfaceC15474b
        public void a(A7.a aVar) {
            l.e(aVar);
        }

        @Override // l8.InterfaceC15474b
        public void b(q qVar) {
            l.f(qVar);
        }
    }

    @Override // x8.InterfaceC18133a
    public u7.h a() {
        return K7.c.INSTANCE.a().getRumEventDispatcher();
    }

    @Override // x8.InterfaceC18133a
    public InterfaceC18295a b() {
        return K7.c.INSTANCE.a().getOneAgentUserInteractionManagerBridge();
    }

    @Override // x8.InterfaceC18133a
    public InterfaceC15473a c() {
        return K7.c.INSTANCE.a().getCommunicationManagerBridge();
    }

    @Override // x8.InterfaceC18133a
    public C17645b d() {
        return K7.c.INSTANCE.a().getOneAgentFacade();
    }

    @Override // x8.InterfaceC18133a
    public X7.b e() {
        K7.c cVarA = K7.c.INSTANCE.a();
        if (cVarA != null) {
            return cVarA.getMetricsCache();
        }
        return null;
    }

    @Override // x8.InterfaceC18133a
    public u7.e f() {
        return K7.c.INSTANCE.a().getOneAgentStartup();
    }

    @Override // x8.InterfaceC18133a
    public InterfaceC17360a g() {
        return K7.c.INSTANCE.a().getOneAgentLifecycleManagerBridge();
    }

    @Override // x8.InterfaceC18133a
    public void init() {
        z8.f.a("dtxStartStop", "initialize OneAgent, oneAgentConfiguration: " + this.f170633a + " httpFactory: " + this.f170636d);
        K7.c.INSTANCE.b(this.f170633a, this.f170634b, new a(), this.f170636d, this.f170635c, this.f170637e);
    }

    @Override // x8.InterfaceC18133a
    public void shutdown() {
        K7.c.INSTANCE.c();
    }

    public C18134b(OneAgentConfiguration oneAgentConfiguration, InterfaceC18294a interfaceC18294a, Application application, d.a aVar, K7.h hVar) {
        this.f170633a = oneAgentConfiguration;
        this.f170634b = interfaceC18294a;
        this.f170635c = application;
        this.f170636d = aVar;
        this.f170637e = hVar;
    }
}
