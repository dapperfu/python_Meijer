package Y8;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0017\u0018\u0000 ,2\u00020\u0001:\u0001\u0013B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0018\u001a\n \u0015*\u0004\u0018\u00010\u00020\u00028\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00198\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010\t\u001a\u00020\b8\u0012@\u0012X\u0092.¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010(\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010'R\u0014\u0010+\u001a\u00020)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010*¨\u0006-"}, d2 = {"LY8/e;", "Landroid/net/ConnectivityManager$NetworkCallback;", "Landroid/content/Context;", "inputContext", "Ll9/b;", "concurrentHandlerHolder", "<init>", "(Landroid/content/Context;Ll9/b;)V", "LY8/a;", "connectionChangeListener", "", "c", "(LY8/a;)V", "Landroid/net/Network;", "network", "Landroid/net/NetworkCapabilities;", "networkCapabilities", "onCapabilitiesChanged", "(Landroid/net/Network;Landroid/net/NetworkCapabilities;)V", "a", "Ll9/b;", "kotlin.jvm.PlatformType", "b", "Landroid/content/Context;", "context", "Landroid/content/IntentFilter;", "Landroid/content/IntentFilter;", "intentFilter", "Landroid/net/ConnectivityManager;", "d", "Landroid/net/ConnectivityManager;", "connectivityManager", "Landroid/net/NetworkRequest;", "e", "Landroid/net/NetworkRequest;", "networkRequest", "f", "LY8/a;", "LY8/c;", "()LY8/c;", "connectionState", "", "()Z", "isConnected", "g", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public class e extends ConnectivityManager.NetworkCallback {

    /* renamed from: g, reason: collision with root package name */
    private static final a f40182g = new a(null);

    /* renamed from: h, reason: collision with root package name */
    private static BroadcastReceiver f40183h;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final l9.b concurrentHandlerHolder;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final IntentFilter intentFilter;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ConnectivityManager connectivityManager;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final NetworkRequest networkRequest;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private Y8.a connectionChangeListener;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LY8/e$a;", "", "<init>", "()V", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public boolean b() {
        Network activeNetwork;
        NetworkCapabilities networkCapabilities;
        try {
            activeNetwork = this.connectivityManager.getActiveNetwork();
        } catch (Exception unused) {
        }
        if (activeNetwork == null || (networkCapabilities = this.connectivityManager.getNetworkCapabilities(activeNetwork)) == null) {
            return false;
        }
        if (networkCapabilities.hasTransport(1) || networkCapabilities.hasTransport(0) || networkCapabilities.hasTransport(4)) {
            return true;
        }
        return networkCapabilities.hasTransport(3);
    }

    public e(Context inputContext, l9.b concurrentHandlerHolder) {
        Intrinsics.j(inputContext, "inputContext");
        Intrinsics.j(concurrentHandlerHolder, "concurrentHandlerHolder");
        this.concurrentHandlerHolder = concurrentHandlerHolder;
        Context applicationContext = inputContext.getApplicationContext();
        this.context = applicationContext;
        this.intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
        Object systemService = applicationContext.getSystemService("connectivity");
        Intrinsics.h(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.connectivityManager = (ConnectivityManager) systemService;
        NetworkRequest networkRequestBuild = new NetworkRequest.Builder().addTransportType(1).addTransportType(3).addTransportType(4).addTransportType(0).build();
        Intrinsics.i(networkRequestBuild, "build(...)");
        this.networkRequest = networkRequestBuild;
    }

    public c a() {
        try {
            Network activeNetwork = this.connectivityManager.getActiveNetwork();
            if (activeNetwork == null) {
                return c.f40179c;
            }
            NetworkCapabilities networkCapabilities = this.connectivityManager.getNetworkCapabilities(activeNetwork);
            return networkCapabilities == null ? c.f40179c : networkCapabilities.hasTransport(1) ? c.f40177a : networkCapabilities.hasTransport(4) ? c.f40177a : networkCapabilities.hasTransport(3) ? c.f40177a : networkCapabilities.hasTransport(0) ? c.f40178b : c.f40179c;
        } catch (Exception unused) {
            return c.f40179c;
        }
    }

    public void c(Y8.a connectionChangeListener) {
        Intrinsics.j(connectionChangeListener, "connectionChangeListener");
        try {
            if (G9.a.f11285a.e()) {
                this.connectionChangeListener = connectionChangeListener;
                this.connectivityManager.registerNetworkCallback(this.networkRequest, this, this.concurrentHandlerHolder.getCoreHandler().getHandler());
            } else if (f40183h != null) {
                g gVar = new g(connectionChangeListener, this, this.concurrentHandlerHolder);
                f40183h = gVar;
                this.context.registerReceiver(gVar, this.intentFilter);
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        Intrinsics.j(network, "network");
        Intrinsics.j(networkCapabilities, "networkCapabilities");
        super.onCapabilitiesChanged(network, networkCapabilities);
        c cVarA = a();
        boolean zB = b();
        Y8.a aVar = this.connectionChangeListener;
        if (aVar == null) {
            Intrinsics.y("connectionChangeListener");
            aVar = null;
        }
        aVar.a(cVarA, zB);
    }
}
