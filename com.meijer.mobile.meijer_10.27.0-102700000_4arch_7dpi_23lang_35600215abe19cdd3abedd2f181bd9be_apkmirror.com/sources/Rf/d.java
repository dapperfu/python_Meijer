package Rf;

import Zf.k;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.fullstory.FS;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.session.SessionManager;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import pc.InterfaceC16286j;

/* loaded from: classes7.dex */
public class d {

    /* renamed from: i, reason: collision with root package name */
    private static final Uf.a f32207i = Uf.a.e();

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, String> f32208a = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    private final com.google.firebase.perf.config.a f32209b;

    /* renamed from: c, reason: collision with root package name */
    private final ag.f f32210c;

    /* renamed from: d, reason: collision with root package name */
    private Boolean f32211d;

    /* renamed from: e, reason: collision with root package name */
    private final com.google.firebase.f f32212e;

    /* renamed from: f, reason: collision with root package name */
    private final If.b<com.google.firebase.remoteconfig.c> f32213f;

    /* renamed from: g, reason: collision with root package name */
    private final Jf.e f32214g;

    /* renamed from: h, reason: collision with root package name */
    private final If.b<InterfaceC16286j> f32215h;

    public Map<String, String> b() {
        return new HashMap(this.f32208a);
    }

    public boolean d() {
        Boolean bool = this.f32211d;
        return bool != null ? bool.booleanValue() : com.google.firebase.f.l().t();
    }

    d(com.google.firebase.f fVar, If.b<com.google.firebase.remoteconfig.c> bVar, Jf.e eVar, If.b<InterfaceC16286j> bVar2, RemoteConfigManager remoteConfigManager, com.google.firebase.perf.config.a aVar, SessionManager sessionManager) {
        this.f32211d = null;
        this.f32212e = fVar;
        this.f32213f = bVar;
        this.f32214g = eVar;
        this.f32215h = bVar2;
        if (fVar == null) {
            this.f32211d = Boolean.FALSE;
            this.f32209b = aVar;
            this.f32210c = new ag.f(new Bundle());
            return;
        }
        k.k().r(fVar, eVar, bVar2);
        Context contextK = fVar.k();
        ag.f fVarA = a(contextK);
        this.f32210c = fVarA;
        remoteConfigManager.setFirebaseRemoteConfigProvider(bVar);
        this.f32209b = aVar;
        aVar.P(fVarA);
        aVar.O(contextK);
        sessionManager.setApplicationContext(contextK);
        this.f32211d = aVar.j();
        Uf.a aVar2 = f32207i;
        if (aVar2.h() && d()) {
            aVar2.f(String.format("Firebase Performance Monitoring is successfully initialized! In a minute, visit the Firebase console to view your data: %s", Uf.b.b(fVar.n().e(), contextK.getPackageName())));
        }
    }

    private static ag.f a(Context context) {
        Bundle bundle;
        ag.f fVar;
        try {
            bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException | NullPointerException e10) {
            FS.log_d("isEnabled", "No perf enable meta data found " + e10.getMessage());
            bundle = null;
        }
        if (bundle != null) {
            fVar = new ag.f(bundle);
        } else {
            fVar = new ag.f();
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
