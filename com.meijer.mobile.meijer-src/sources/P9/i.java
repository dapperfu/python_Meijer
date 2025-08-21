package P9;

import a9.C5673e;
import a9.EnumC5671c;
import a9.InterfaceC5669a;
import com.emarsys.core.request.RequestExpiredException;
import h9.C14489a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import z9.InterfaceC18462a;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b$\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002BC\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0011\u0010\u0013\u001a\u0004\u0018\u00010\u0004H\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0004H\u0012¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0004H\u0012¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001f\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001aH\u0016¢\u0006\u0004\b \u0010\u001eJ!\u0010$\u001a\u00020\u001a2\b\u0010\"\u001a\u0004\u0018\u00010!2\u0006\u0010#\u001a\u00020\u0016H\u0016¢\u0006\u0004\b$\u0010%R.\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b$\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u0010\b\u001a\u00020\u00078\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u00101\u001a\u0004\b2\u00103R\"\u0010\f\u001a\u00020\u000b8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b2\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010\u000e\u001a\u00020\r8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b-\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u0010>\u001a\u0004\b?\u0010@R$\u0010C\u001a\u00020\u00162\u0006\u0010A\u001a\u00020\u00168\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b?\u0010B\u001a\u0004\bC\u0010D¨\u0006E"}, d2 = {"LP9/i;", "La9/a;", "LP9/p;", "Lg9/c;", "LA9/c;", "Lg9/d;", "requestRepository", "La9/e;", "connectionWatchDog", "Ln9/b;", "concurrentHandlerHolder", "LS8/a;", "coreCompletionHandler", "Ly9/f;", "restClient", "Lz9/a;", "proxyProvider", "<init>", "(Lg9/c;La9/e;Ln9/b;LS8/a;Ly9/f;Lz9/a;)V", "c", "()LA9/c;", "model", "", "l", "(LA9/c;)Z", "expiredModel", "", "j", "(LA9/c;)V", "m", "()V", "unlock", "run", "La9/c;", "connectionState", "isConnected", "a", "(La9/c;Z)V", "Lg9/c;", "h", "()Lg9/c;", "setRequestRepository", "(Lg9/c;)V", "b", "La9/e;", "e", "()La9/e;", "setConnectionWatchDog", "(La9/e;)V", "Ln9/b;", "d", "()Ln9/b;", "LS8/a;", "f", "()LS8/a;", "setCoreCompletionHandler", "(LS8/a;)V", "Ly9/f;", "i", "()Ly9/f;", "setRestClient", "(Ly9/f;)V", "Lz9/a;", "g", "()Lz9/a;", "value", "Z", "isLocked", "()Z", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public class i implements InterfaceC5669a, p {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private g9.c<A9.c, g9.d> requestRepository;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private C5673e connectionWatchDog;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final n9.b concurrentHandlerHolder;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private S8.a coreCompletionHandler;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private y9.f restClient;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC18462a proxyProvider;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean isLocked;

    public void m() {
        this.isLocked = true;
    }

    @Override // P9.o
    public void unlock() {
        this.isLocked = false;
    }

    public i(g9.c<A9.c, g9.d> requestRepository, C5673e connectionWatchDog, n9.b concurrentHandlerHolder, S8.a coreCompletionHandler, y9.f restClient, InterfaceC18462a proxyProvider) {
        Intrinsics.j(requestRepository, "requestRepository");
        Intrinsics.j(connectionWatchDog, "connectionWatchDog");
        Intrinsics.j(concurrentHandlerHolder, "concurrentHandlerHolder");
        Intrinsics.j(coreCompletionHandler, "coreCompletionHandler");
        Intrinsics.j(restClient, "restClient");
        Intrinsics.j(proxyProvider, "proxyProvider");
        this.requestRepository = requestRepository;
        this.connectionWatchDog = connectionWatchDog;
        this.concurrentHandlerHolder = concurrentHandlerHolder;
        this.coreCompletionHandler = coreCompletionHandler;
        this.restClient = restClient;
        this.proxyProvider = proxyProvider;
        getConnectionWatchDog().c(this);
    }

    @Override // a9.InterfaceC5669a
    public void a(EnumC5671c connectionState, boolean isConnected) {
        if (isConnected) {
            K9.e.INSTANCE.a(new L9.h(h().b(new C14489a()).size()), false);
            run();
        }
    }

    /* renamed from: d, reason: from getter */
    public n9.b getConcurrentHandlerHolder() {
        return this.concurrentHandlerHolder;
    }

    /* renamed from: e, reason: from getter */
    public C5673e getConnectionWatchDog() {
        return this.connectionWatchDog;
    }

    /* renamed from: f, reason: from getter */
    public S8.a getCoreCompletionHandler() {
        return this.coreCompletionHandler;
    }

    /* renamed from: g, reason: from getter */
    public InterfaceC18462a getProxyProvider() {
        return this.proxyProvider;
    }

    public g9.c<A9.c, g9.d> h() {
        return this.requestRepository;
    }

    /* renamed from: i, reason: from getter */
    public y9.f getRestClient() {
        return this.restClient;
    }

    @Override // P9.p
    public void run() {
        if (this.isLocked || !getConnectionWatchDog().b() || h().isEmpty()) {
            return;
        }
        m();
        A9.c cVarC = c();
        if (cVarC != null) {
            getRestClient().c(cVarC, getProxyProvider().a(this, getCoreCompletionHandler()));
        } else {
            unlock();
        }
    }

    private A9.c c() {
        while (!h().isEmpty()) {
            List<A9.c> listB = h().b(new B9.c());
            if (!listB.isEmpty()) {
                A9.c cVar = listB.get(0);
                if (l(cVar)) {
                    j(cVar);
                } else {
                    return cVar;
                }
            } else {
                return null;
            }
        }
        return null;
    }

    private void j(final A9.c expiredModel) {
        h().remove(new B9.a(new String[]{expiredModel.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String()}));
        getConcurrentHandlerHolder().h(new Runnable() { // from class: P9.h
            @Override // java.lang.Runnable
            public final void run() {
                i.k(this.f25732a, expiredModel);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(i iVar, A9.c cVar) {
        iVar.getCoreCompletionHandler().a(cVar.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String(), new RequestExpiredException("Request expired", cVar.getUrl().getPath()));
    }

    private boolean l(A9.c model) {
        if (System.currentTimeMillis() - model.getTimestamp() > model.getTtl()) {
            return true;
        }
        return false;
    }
}
