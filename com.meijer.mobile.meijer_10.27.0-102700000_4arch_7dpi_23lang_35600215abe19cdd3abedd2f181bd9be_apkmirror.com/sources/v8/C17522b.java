package v8;

import android.app.Application;
import g8.l;
import j8.InterfaceC14874a;
import j8.InterfaceC14875b;
import k8.q;
import okhttp3.d;
import s7.OneAgentConfiguration;
import s8.InterfaceC16913a;
import t7.C17070b;
import w7.InterfaceC17801a;
import w8.InterfaceC17802a;
import y7.AbstractC18186a;

/* renamed from: v8.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C17522b implements InterfaceC17521a {

    /* renamed from: a, reason: collision with root package name */
    private final OneAgentConfiguration f164597a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC17801a f164598b;

    /* renamed from: c, reason: collision with root package name */
    private final Application f164599c;

    /* renamed from: d, reason: collision with root package name */
    private final d.a f164600d;

    /* renamed from: e, reason: collision with root package name */
    private final I7.h f164601e;

    /* renamed from: v8.b$a */
    class a implements InterfaceC14875b {
        a() {
        }

        @Override // j8.InterfaceC14875b
        public void a(q qVar) {
            l.f(qVar);
        }

        @Override // j8.InterfaceC14875b
        public void b(AbstractC18186a abstractC18186a) {
            l.e(abstractC18186a);
        }
    }

    @Override // v8.InterfaceC17521a
    public s7.h a() {
        return I7.c.INSTANCE.a().getRumEventDispatcher();
    }

    @Override // v8.InterfaceC17521a
    public InterfaceC17802a b() {
        return I7.c.INSTANCE.a().getOneAgentUserInteractionManagerBridge();
    }

    @Override // v8.InterfaceC17521a
    public InterfaceC14874a c() {
        return I7.c.INSTANCE.a().getCommunicationManagerBridge();
    }

    @Override // v8.InterfaceC17521a
    public C17070b d() {
        return I7.c.INSTANCE.a().getOneAgentFacade();
    }

    @Override // v8.InterfaceC17521a
    public V7.b e() {
        I7.c cVarA = I7.c.INSTANCE.a();
        if (cVarA != null) {
            return cVarA.getMetricsCache();
        }
        return null;
    }

    @Override // v8.InterfaceC17521a
    public s7.e f() {
        return I7.c.INSTANCE.a().getOneAgentStartup();
    }

    @Override // v8.InterfaceC17521a
    public InterfaceC16913a g() {
        return I7.c.INSTANCE.a().getOneAgentLifecycleManagerBridge();
    }

    @Override // v8.InterfaceC17521a
    public void init() {
        x8.f.a("dtxStartStop", "initialize OneAgent, oneAgentConfiguration: " + this.f164597a + " httpFactory: " + this.f164600d);
        I7.c.INSTANCE.b(this.f164597a, this.f164598b, new a(), this.f164600d, this.f164599c, this.f164601e);
    }

    @Override // v8.InterfaceC17521a
    public void shutdown() {
        I7.c.INSTANCE.c();
    }

    public C17522b(OneAgentConfiguration oneAgentConfiguration, InterfaceC17801a interfaceC17801a, Application application, d.a aVar, I7.h hVar) {
        this.f164597a = oneAgentConfiguration;
        this.f164598b = interfaceC17801a;
        this.f164599c = application;
        this.f164600d = aVar;
        this.f164601e = hVar;
    }
}
