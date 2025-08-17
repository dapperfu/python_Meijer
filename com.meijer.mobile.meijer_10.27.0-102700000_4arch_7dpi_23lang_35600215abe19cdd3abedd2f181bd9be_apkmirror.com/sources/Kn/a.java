package Kn;

import Jd.C3778l;
import Jd.InterfaceC3769c;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.location.Geocoder;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.net.wifi.WifiManager;
import androidx.view.C5992H;
import androidx.view.InterfaceC6030s;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import qv.AbstractC16618K;
import qv.C16623P;
import qv.InterfaceC16622O;
import qv.X0;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\f\u001a\u00020\t2\b\b\u0001\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\f\u0010\u000bJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\b\u0001\u0010\u000e\u001a\u00020\rH\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0001\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0001\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0019\u001a\u00020\u00182\b\b\u0001\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001c\u001a\u00020\u001b2\b\b\u0001\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u001b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\b\u0001\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u001f\u0010 J\u001b\u0010\"\u001a\u0004\u0018\u00010!2\b\b\u0001\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\"\u0010#¨\u0006$"}, d2 = {"LKn/a;", "", "<init>", "()V", "Landroidx/lifecycle/s;", "h", "()Landroidx/lifecycle/s;", "Landroid/content/Context;", "context", "Landroid/content/SharedPreferences;", "i", "(Landroid/content/Context;)Landroid/content/SharedPreferences;", "b", "Lqv/K;", "defaultDispatcher", "Lqv/O;", "a", "(Lqv/K;)Lqv/O;", "Landroid/net/ConnectivityManager;", "f", "(Landroid/content/Context;)Landroid/net/ConnectivityManager;", "Landroid/location/LocationManager;", "e", "(Landroid/content/Context;)Landroid/location/LocationManager;", "LJd/c;", "c", "(Landroid/content/Context;)LJd/c;", "Landroid/location/Geocoder;", "d", "(Landroid/content/Context;)Landroid/location/Geocoder;", "Landroid/app/NotificationManager;", "g", "(Landroid/content/Context;)Landroid/app/NotificationManager;", "Landroid/net/wifi/WifiManager;", "j", "(Landroid/content/Context;)Landroid/net/wifi/WifiManager;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f17427a = new a();

    public final InterfaceC16622O a(AbstractC16618K defaultDispatcher) {
        Intrinsics.j(defaultDispatcher, "defaultDispatcher");
        return C16623P.a(X0.b(null, 1, null).m0(defaultDispatcher));
    }

    public final SharedPreferences b(Context context) {
        Intrinsics.j(context, "context");
        SharedPreferences sharedPreferences = context.getSharedPreferences("application_prefs", 0);
        Intrinsics.i(sharedPreferences, "getSharedPreferences(...)");
        return sharedPreferences;
    }

    public final InterfaceC3769c c(Context context) {
        Intrinsics.j(context, "context");
        InterfaceC3769c interfaceC3769cB = C3778l.b(context);
        Intrinsics.i(interfaceC3769cB, "getFusedLocationProviderClient(...)");
        return interfaceC3769cB;
    }

    public final Geocoder d(Context context) {
        Intrinsics.j(context, "context");
        return new Geocoder(context);
    }

    public final LocationManager e(Context context) {
        Intrinsics.j(context, "context");
        return (LocationManager) Z1.b.j(context, LocationManager.class);
    }

    public final ConnectivityManager f(Context context) {
        Intrinsics.j(context, "context");
        return (ConnectivityManager) Z1.b.j(context, ConnectivityManager.class);
    }

    public final NotificationManager g(Context context) {
        Intrinsics.j(context, "context");
        return (NotificationManager) Z1.b.j(context, NotificationManager.class);
    }

    public final InterfaceC6030s h() {
        return C5992H.INSTANCE.a();
    }

    public final SharedPreferences i(Context context) {
        Intrinsics.j(context, "context");
        SharedPreferences sharedPreferences = context.getSharedPreferences("user_account", 0);
        Intrinsics.i(sharedPreferences, "getSharedPreferences(...)");
        return sharedPreferences;
    }

    public final WifiManager j(Context context) {
        Intrinsics.j(context, "context");
        return (WifiManager) Z1.b.j(context, WifiManager.class);
    }

    private a() {
    }
}
