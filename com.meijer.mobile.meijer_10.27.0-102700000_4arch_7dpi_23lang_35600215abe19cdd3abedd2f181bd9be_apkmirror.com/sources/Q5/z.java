package Q5;

import android.net.ConnectivityManager;
import com.google.maps.internal.HttpHeaders;
import io.constructor.BuildConfig;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
class z implements A {

    /* renamed from: b, reason: collision with root package name */
    private static final String f29840b = "z";

    /* renamed from: a, reason: collision with root package name */
    private final ExecutorService f29841a = new ThreadPoolExecutor(0, 32, 60, TimeUnit.SECONDS, new SynchronousQueue());

    private Map<String, String> d() {
        HashMap map = new HashMap();
        InterfaceC5078j interfaceC5078jE = K.f().e();
        if (interfaceC5078jE != null) {
            String strU = interfaceC5078jE.u();
            if (!e(strU)) {
                map.put(HttpHeaders.USER_AGENT, strU);
            }
            String strJ = interfaceC5078jE.j();
            if (!e(strJ)) {
                map.put("Accept-Language", strJ);
            }
        }
        return map;
    }

    private boolean e(String str) {
        return str == null || str.trim().isEmpty();
    }

    z() {
    }

    public static /* synthetic */ void b(z zVar, x xVar, w wVar) {
        o oVarC = zVar.c(xVar);
        if (wVar != null) {
            wVar.a(oVarC);
        } else if (oVarC != null) {
            oVarC.close();
        }
    }

    private o c(x xVar) {
        String message;
        if (xVar.f() != null && xVar.f().contains(BuildConfig.SERVICE_SCHEME)) {
            Map<String, String> mapD = d();
            if (xVar.c() != null) {
                mapD.putAll(xVar.c());
            }
            try {
                URL url = new URL(xVar.f());
                String protocol = url.getProtocol();
                if (protocol == null || !BuildConfig.SERVICE_SCHEME.equalsIgnoreCase(protocol)) {
                    return null;
                }
                try {
                    q qVar = new q(url);
                    if (!qVar.b(xVar.d())) {
                        return null;
                    }
                    qVar.e(mapD);
                    qVar.c(xVar.b() * 1000);
                    qVar.d(xVar.e() * 1000);
                    return qVar.a(xVar.a());
                } catch (IOException | SecurityException e10) {
                    String str = f29840b;
                    String strF = xVar.f();
                    if (e10.getLocalizedMessage() != null) {
                        message = e10.getLocalizedMessage();
                    } else {
                        message = e10.getMessage();
                    }
                    t.f("Services", str, String.format("Could not create a connection to URL (%s) [%s]", strF, message), new Object[0]);
                    return null;
                }
            } catch (MalformedURLException e11) {
                t.f("Services", f29840b, String.format("Could not connect, invalid URL (%s) [%s]!!", xVar.f(), e11), new Object[0]);
                return null;
            }
        }
        t.f("Services", f29840b, String.format("Invalid URL (%s), only HTTPS protocol is supported", xVar.f()), new Object[0]);
        return null;
    }

    @Override // Q5.A
    public void a(final x xVar, final w wVar) {
        String message;
        ConnectivityManager connectivityManagerD = K.f().a().d();
        if (connectivityManagerD != null) {
            if (!L5.l.a(connectivityManagerD)) {
                t.e("Services", f29840b, "The Android device is offline.", new Object[0]);
                wVar.a(null);
                return;
            }
        } else {
            t.a("Services", f29840b, "ConnectivityManager instance is null. Unable to the check the network condition.", new Object[0]);
        }
        try {
            this.f29841a.submit(new Runnable() { // from class: Q5.y
                @Override // java.lang.Runnable
                public final void run() {
                    z.b(this.f29837a, xVar, wVar);
                }
            });
        } catch (Exception e10) {
            String str = f29840b;
            String strF = xVar.f();
            if (e10.getLocalizedMessage() != null) {
                message = e10.getLocalizedMessage();
            } else {
                message = e10.getMessage();
            }
            t.f("Services", str, String.format("Failed to send request for (%s) [%s]", strF, message), new Object[0]);
            if (wVar != null) {
                wVar.a(null);
            }
        }
    }
}
