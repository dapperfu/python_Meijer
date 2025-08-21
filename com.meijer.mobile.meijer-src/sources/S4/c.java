package S4;

import O4.AbstractC4373v;
import S4.b;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0003\u0018\u0000 \u00132\u00020\u0001:\u0001\u0011B!\b\u0002\u0012\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R$\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"LS4/c;", "Landroid/net/ConnectivityManager$NetworkCallback;", "Lkotlin/Function1;", "LS4/b;", "", "Landroidx/work/impl/constraints/OnConstraintState;", "onConstraintState", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroid/net/Network;", "network", "Landroid/net/NetworkCapabilities;", "networkCapabilities", "onCapabilitiesChanged", "(Landroid/net/Network;Landroid/net/NetworkCapabilities;)V", "onLost", "(Landroid/net/Network;)V", "a", "Lkotlin/jvm/functions/Function1;", "b", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
final class c extends ConnectivityManager.NetworkCallback {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Function1<b, Unit> onConstraintState;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J;\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bj\u0002`\u000b¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"LS4/c$a;", "", "<init>", "()V", "Landroid/net/ConnectivityManager;", "connManager", "Landroid/net/NetworkRequest;", "networkRequest", "Lkotlin/Function1;", "LS4/b;", "", "Landroidx/work/impl/constraints/OnConstraintState;", "onConstraintState", "Lkotlin/Function0;", "a", "(Landroid/net/ConnectivityManager;Landroid/net/NetworkRequest;Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function0;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: S4.c$a, reason: from kotlin metadata */
    public static final class Companion {

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: S4.c$a$a, reason: collision with other inner class name */
        static final class C0767a extends Lambda implements Function0<Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Ref.BooleanRef f34402f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ ConnectivityManager f34403g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ c f34404h;

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f143329a;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0767a(Ref.BooleanRef booleanRef, ConnectivityManager connectivityManager, c cVar) {
                super(0);
                this.f34402f = booleanRef;
                this.f34403g = connectivityManager;
                this.f34404h = cVar;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                if (this.f34402f.f143735a) {
                    AbstractC4373v.e().a(j.f34434a, "NetworkRequestConstraintController unregister callback");
                    this.f34403g.unregisterNetworkCallback(this.f34404h);
                }
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Function0<Unit> a(ConnectivityManager connManager, NetworkRequest networkRequest, Function1<? super b, Unit> onConstraintState) {
            Intrinsics.j(connManager, "connManager");
            Intrinsics.j(networkRequest, "networkRequest");
            Intrinsics.j(onConstraintState, "onConstraintState");
            c cVar = new c(onConstraintState, null);
            Ref.BooleanRef booleanRef = new Ref.BooleanRef();
            try {
                AbstractC4373v.e().a(j.f34434a, "NetworkRequestConstraintController register callback");
                connManager.registerNetworkCallback(networkRequest, cVar);
                booleanRef.f143735a = true;
            } catch (RuntimeException e10) {
                String name = e10.getClass().getName();
                Intrinsics.i(name, "ex.javaClass.name");
                if (!StringsKt.G(name, "TooManyRequestsException", false, 2, null)) {
                    throw e10;
                }
                AbstractC4373v.e().b(j.f34434a, "NetworkRequestConstraintController couldn't register callback", e10);
                onConstraintState.invoke(new b.ConstraintsNotMet(7));
            }
            return new C0767a(booleanRef, connManager, cVar);
        }
    }

    public /* synthetic */ c(Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private c(Function1<? super b, Unit> function1) {
        this.onConstraintState = function1;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        Intrinsics.j(network, "network");
        Intrinsics.j(networkCapabilities, "networkCapabilities");
        AbstractC4373v.e().a(j.f34434a, "NetworkRequestConstraintController onCapabilitiesChanged callback");
        this.onConstraintState.invoke(b.a.f34398a);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLost(Network network) {
        Intrinsics.j(network, "network");
        AbstractC4373v.e().a(j.f34434a, "NetworkRequestConstraintController onLost callback");
        this.onConstraintState.invoke(new b.ConstraintsNotMet(7));
    }
}
