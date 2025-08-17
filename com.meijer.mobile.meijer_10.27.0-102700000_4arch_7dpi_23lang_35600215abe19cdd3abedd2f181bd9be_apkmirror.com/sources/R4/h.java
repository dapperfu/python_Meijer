package R4;

import N4.AbstractC4333v;
import R4.b;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ;\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u00152\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0016\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\b0\u0011j\u0002`\u0013¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR0\u0010\u001e\u001a\u001e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\b0\u0011j\u0002`\u0013\u0012\u0004\u0012\u00020\u000f0\u001c8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001d¨\u0006\u001f"}, d2 = {"LR4/h;", "Landroid/net/ConnectivityManager$NetworkCallback;", "<init>", "()V", "Landroid/net/Network;", "network", "Landroid/net/NetworkCapabilities;", "networkCapabilities", "", "onCapabilitiesChanged", "(Landroid/net/Network;Landroid/net/NetworkCapabilities;)V", "onLost", "(Landroid/net/Network;)V", "Landroid/net/ConnectivityManager;", "connManager", "Landroid/net/NetworkRequest;", "networkRequest", "Lkotlin/Function1;", "LR4/b;", "Landroidx/work/impl/constraints/OnConstraintState;", "onConstraintState", "Lkotlin/Function0;", "c", "(Landroid/net/ConnectivityManager;Landroid/net/NetworkRequest;Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function0;", "", "b", "Ljava/lang/Object;", "requestsLock", "", "Ljava/util/Map;", "requests", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
final class h extends ConnectivityManager.NetworkCallback {

    /* renamed from: a, reason: collision with root package name */
    public static final h f31883a = new h();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final Object requestsLock = new Object();

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final Map<Function1<b, Unit>, NetworkRequest> requests = new LinkedHashMap();

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends Lambda implements Function0<Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1<b, Unit> f31886f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ConnectivityManager f31887g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ h f31888h;

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f142422a;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Function1<? super b, Unit> function1, ConnectivityManager connectivityManager, h hVar) {
            super(0);
            this.f31886f = function1;
            this.f31887g = connectivityManager;
            this.f31888h = hVar;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            Object obj = h.requestsLock;
            Function1<b, Unit> function1 = this.f31886f;
            ConnectivityManager connectivityManager = this.f31887g;
            h hVar = this.f31888h;
            synchronized (obj) {
                try {
                    h.requests.remove(function1);
                    if (h.requests.isEmpty()) {
                        AbstractC4333v.e().a(j.f31896a, "NetworkRequestConstraintController unregister shared callback");
                        connectivityManager.unregisterNetworkCallback(hVar);
                    }
                    Unit unit = Unit.f142422a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final Function0<Unit> c(ConnectivityManager connManager, NetworkRequest networkRequest, Function1<? super b, Unit> onConstraintState) {
        Intrinsics.j(connManager, "connManager");
        Intrinsics.j(networkRequest, "networkRequest");
        Intrinsics.j(onConstraintState, "onConstraintState");
        synchronized (requestsLock) {
            try {
                Map<Function1<b, Unit>, NetworkRequest> map = requests;
                boolean zIsEmpty = map.isEmpty();
                map.put(onConstraintState, networkRequest);
                if (zIsEmpty) {
                    AbstractC4333v.e().a(j.f31896a, "NetworkRequestConstraintController register shared callback");
                    connManager.registerDefaultNetworkCallback(this);
                }
                Unit unit = Unit.f142422a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return new a(onConstraintState, connManager, this);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        List<Map.Entry> listJ1;
        Intrinsics.j(network, "network");
        Intrinsics.j(networkCapabilities, "networkCapabilities");
        AbstractC4333v.e().a(j.f31896a, "NetworkRequestConstraintController onCapabilitiesChanged callback");
        synchronized (requestsLock) {
            listJ1 = CollectionsKt.j1(requests.entrySet());
        }
        for (Map.Entry entry : listJ1) {
            ((Function1) entry.getKey()).invoke(((NetworkRequest) entry.getValue()).canBeSatisfiedBy(networkCapabilities) ? b.a.f31860a : new b.ConstraintsNotMet(7));
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLost(Network network) {
        List listJ1;
        Intrinsics.j(network, "network");
        AbstractC4333v.e().a(j.f31896a, "NetworkRequestConstraintController onLost callback");
        synchronized (requestsLock) {
            listJ1 = CollectionsKt.j1(requests.keySet());
        }
        Iterator it = listJ1.iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke(new b.ConstraintsNotMet(7));
        }
    }

    private h() {
    }
}
