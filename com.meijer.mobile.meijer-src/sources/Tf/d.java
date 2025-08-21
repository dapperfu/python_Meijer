package Tf;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import bg.k;
import com.fullstory.FS;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.session.SessionManager;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import rc.InterfaceC16890j;

/* loaded from: classes8.dex */
public class d {

    /* renamed from: i, reason: collision with root package name */
    private static final Wf.a f36207i = Wf.a.e();

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, String> f36208a = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    private final com.google.firebase.perf.config.a f36209b;

    /* renamed from: c, reason: collision with root package name */
    private final cg.f f36210c;

    /* renamed from: d, reason: collision with root package name */
    private Boolean f36211d;

    /* renamed from: e, reason: collision with root package name */
    private final com.google.firebase.f f36212e;

    /* renamed from: f, reason: collision with root package name */
    private final Kf.b<com.google.firebase.remoteconfig.c> f36213f;

    /* renamed from: g, reason: collision with root package name */
    private final Lf.e f36214g;

    /* renamed from: h, reason: collision with root package name */
    private final Kf.b<InterfaceC16890j> f36215h;

    public Map<String, String> b() {
        return new HashMap(this.f36208a);
    }

    public boolean d() {
        Boolean bool = this.f36211d;
        return bool != null ? bool.booleanValue() : com.google.firebase.f.l().t();
    }

    d(com.google.firebase.f fVar, Kf.b<com.google.firebase.remoteconfig.c> bVar, Lf.e eVar, Kf.b<InterfaceC16890j> bVar2, RemoteConfigManager remoteConfigManager, com.google.firebase.perf.config.a aVar, SessionManager sessionManager) {
        this.f36211d = null;
        this.f36212e = fVar;
        this.f36213f = bVar;
        this.f36214g = eVar;
        this.f36215h = bVar2;
        if (fVar == null) {
            this.f36211d = Boolean.FALSE;
            this.f36209b = aVar;
            this.f36210c = new cg.f(new Bundle());
            return;
        }
        k.k().r(fVar, eVar, bVar2);
        Context contextK = fVar.k();
        cg.f fVarA = a(contextK);
        this.f36210c = fVarA;
        remoteConfigManager.setFirebaseRemoteConfigProvider(bVar);
        this.f36209b = aVar;
        aVar.P(fVarA);
        aVar.O(contextK);
        sessionManager.setApplicationContext(contextK);
        this.f36211d = aVar.j();
        Wf.a aVar2 = f36207i;
        if (aVar2.h() && d()) {
            aVar2.f(String.format("Firebase Performance Monitoring is successfully initialized! In a minute, visit the Firebase console to view your data: %s", Wf.b.b(fVar.n().e(), contextK.getPackageName())));
        }
    }

    private static cg.f a(Context context) {
        Bundle bundle;
        cg.f fVar;
        try {
            bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException | NullPointerException e10) {
            FS.log_d("isEnabled", "No perf enable meta data found " + e10.getMessage());
            bundle = null;
        }
        if (bundle != null) {
            fVar = new cg.f(bundle);
        } else {
            fVar = new cg.f();
        }
        return fVar;
    }

    public static d c() {
        return (d) com.google.firebase.f.l().j(d.class);
    }

    public Trace e(String str) {
        return Trace.c(str);
    }
}
