package D5;

import D5.g;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.t1;
import androidx.compose.runtime.z1;
import androidx.view.c0;
import com.adobe.marketing.mobile.assurance.internal.C6548e;
import com.adobe.marketing.mobile.assurance.internal.E;
import com.adobe.marketing.mobile.assurance.internal.EnumC6550g;
import com.adobe.marketing.mobile.assurance.internal.EnumC6551h;
import com.adobe.marketing.mobile.assurance.internal.N;
import com.adobe.marketing.mobile.assurance.internal.V;
import com.adobe.marketing.mobile.assurance.internal.X;
import com.adobe.marketing.mobile.assurance.internal.Y;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import w5.AbstractC17844c;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B'\b\u0012\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u000bB/\b\u0011\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u000eB'\b\u0011\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u001e8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"LD5/k;", "Landroidx/lifecycle/c0;", "Lcom/adobe/marketing/mobile/assurance/internal/E;", "assuranceStateManager", "Lcom/adobe/marketing/mobile/assurance/internal/h;", "environment", "<init>", "(Lcom/adobe/marketing/mobile/assurance/internal/E;Lcom/adobe/marketing/mobile/assurance/internal/h;)V", "Landroidx/compose/runtime/l0;", "Lw5/c;", "state", "(Landroidx/compose/runtime/l0;Lcom/adobe/marketing/mobile/assurance/internal/E;Lcom/adobe/marketing/mobile/assurance/internal/h;)V", "LD5/b;", "assuranceStatusListenerWrapper", "(Landroidx/compose/runtime/l0;LD5/b;Lcom/adobe/marketing/mobile/assurance/internal/E;Lcom/adobe/marketing/mobile/assurance/internal/h;)V", "Lcom/adobe/marketing/mobile/assurance/internal/V;", "quickConnectManager", "(Landroidx/compose/runtime/l0;Lcom/adobe/marketing/mobile/assurance/internal/V;Lcom/adobe/marketing/mobile/assurance/internal/h;)V", "LD5/g;", "quickConnectScreenAction", "", "n", "(LD5/g;)V", "a", "Lcom/adobe/marketing/mobile/assurance/internal/V;", "b", "Lcom/adobe/marketing/mobile/assurance/internal/h;", "c", "Landroidx/compose/runtime/l0;", "_state", "Landroidx/compose/runtime/z1;", "m", "()Landroidx/compose/runtime/z1;", "assurance_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class k extends c0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final V quickConnectManager;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final EnumC6551h environment;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5872l0<AbstractC17844c> _state;

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"D5/k$a", "Lcom/adobe/marketing/mobile/assurance/internal/N;", "Lcom/adobe/marketing/mobile/assurance/internal/g;", "error", "", "b", "(Lcom/adobe/marketing/mobile/assurance/internal/g;)V", "", "sessionUUID", "token", "a", "(Ljava/lang/String;Ljava/lang/String;)V", "assurance_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a implements N {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<AbstractC17844c> f5965a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ EnumC6551h f5966b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ b f5967c;

        a(InterfaceC5872l0<AbstractC17844c> interfaceC5872l0, EnumC6551h enumC6551h, b bVar) {
            this.f5965a = interfaceC5872l0;
            this.f5966b = enumC6551h;
            this.f5967c = bVar;
        }

        @Override // com.adobe.marketing.mobile.assurance.internal.N
        public void a(String sessionUUID, String token) {
            Intrinsics.j(sessionUUID, "sessionUUID");
            Intrinsics.j(token, "token");
            Y yB = C6548e.f63072a.b();
            if (yB != null) {
                yB.b(sessionUUID, token, this.f5966b, this.f5967c, X.QUICK_CONNECT);
            }
        }

        @Override // com.adobe.marketing.mobile.assurance.internal.N
        public void b(EnumC6550g error) {
            Intrinsics.j(error, "error");
            this.f5965a.setValue(new AbstractC17844c.Disconnected(error));
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k(E assuranceStateManager, EnumC6551h environment) {
        this((InterfaceC5872l0<AbstractC17844c>) t1.e(new AbstractC17844c.Disconnected(null), null, 2, null), assuranceStateManager, environment);
        Intrinsics.j(assuranceStateManager, "assuranceStateManager");
        Intrinsics.j(environment, "environment");
    }

    public final z1<AbstractC17844c> m() {
        return this._state;
    }

    public final void n(g quickConnectScreenAction) {
        Intrinsics.j(quickConnectScreenAction, "quickConnectScreenAction");
        if (quickConnectScreenAction instanceof g.a) {
            this._state.setValue(new AbstractC17844c.Disconnected(null));
            this.quickConnectManager.c();
            Y yB = C6548e.f63072a.b();
            if (yB != null) {
                yB.a();
                return;
            }
            return;
        }
        if (quickConnectScreenAction instanceof g.c) {
            this._state.setValue(AbstractC17844c.b.f166942a);
            this.quickConnectManager.i();
        } else if (quickConnectScreenAction instanceof g.b) {
            this._state.setValue(AbstractC17844c.b.f166942a);
            this.quickConnectManager.i();
        }
    }

    private k(InterfaceC5872l0<AbstractC17844c> interfaceC5872l0, E e10, EnumC6551h enumC6551h) {
        this(interfaceC5872l0, new b(interfaceC5872l0), e10, enumC6551h);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public k(InterfaceC5872l0<AbstractC17844c> state, b assuranceStatusListenerWrapper, E assuranceStateManager, EnumC6551h environment) {
        Intrinsics.j(state, "state");
        Intrinsics.j(assuranceStatusListenerWrapper, "assuranceStatusListenerWrapper");
        Intrinsics.j(assuranceStateManager, "assuranceStateManager");
        Intrinsics.j(environment, "environment");
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        Intrinsics.i(scheduledExecutorServiceNewSingleThreadScheduledExecutor, "newSingleThreadScheduledExecutor()");
        this(state, new V(assuranceStateManager, scheduledExecutorServiceNewSingleThreadScheduledExecutor, new a(state, environment, assuranceStatusListenerWrapper)), EnumC6551h.PROD);
    }

    public k(InterfaceC5872l0<AbstractC17844c> state, V quickConnectManager, EnumC6551h environment) {
        Intrinsics.j(state, "state");
        Intrinsics.j(quickConnectManager, "quickConnectManager");
        Intrinsics.j(environment, "environment");
        this._state = state;
        this.quickConnectManager = quickConnectManager;
        this.environment = environment;
    }
}
