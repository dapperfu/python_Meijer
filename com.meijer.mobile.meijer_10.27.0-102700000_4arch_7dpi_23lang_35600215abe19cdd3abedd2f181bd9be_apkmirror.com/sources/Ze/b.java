package Ze;

import Od.H;
import Od.t;
import Ze.a;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.internal.measurement.C10544v1;
import com.google.firebase.f;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes7.dex */
public class b implements Ze.a {

    /* renamed from: c, reason: collision with root package name */
    private static volatile Ze.a f42641c;

    /* renamed from: a, reason: collision with root package name */
    final Nd.a f42642a;

    /* renamed from: b, reason: collision with root package name */
    final Map f42643b;

    class a implements a.InterfaceC0912a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f42644a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f42645b;

        a(b bVar, String str) {
            this.f42644a = str;
            Objects.requireNonNull(bVar);
            this.f42645b = bVar;
        }
    }

    @Override // Ze.a
    public void a(String str, String str2, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (com.google.firebase.analytics.connector.internal.b.a(str) && com.google.firebase.analytics.connector.internal.b.b(str2, bundle) && com.google.firebase.analytics.connector.internal.b.e(str, str2, bundle)) {
            if ("clx".equals(str) && "_ae".equals(str2)) {
                bundle.putLong("_r", 1L);
            }
            this.f42642a.n(str, str2, bundle);
        }
    }

    @Override // Ze.a
    public void c(a.c cVar) {
        String str;
        int i10 = com.google.firebase.analytics.connector.internal.b.f88617g;
        if (cVar == null || (str = cVar.f42626a) == null || str.isEmpty()) {
            return;
        }
        Object obj = cVar.f42628c;
        if ((obj == null || H.b(obj) != null) && com.google.firebase.analytics.connector.internal.b.a(str) && com.google.firebase.analytics.connector.internal.b.d(str, cVar.f42627b)) {
            String str2 = cVar.f42636k;
            if (str2 == null || (com.google.firebase.analytics.connector.internal.b.b(str2, cVar.f42637l) && com.google.firebase.analytics.connector.internal.b.e(str, cVar.f42636k, cVar.f42637l))) {
                String str3 = cVar.f42633h;
                if (str3 == null || (com.google.firebase.analytics.connector.internal.b.b(str3, cVar.f42634i) && com.google.firebase.analytics.connector.internal.b.e(str, cVar.f42633h, cVar.f42634i))) {
                    String str4 = cVar.f42631f;
                    if (str4 == null || (com.google.firebase.analytics.connector.internal.b.b(str4, cVar.f42632g) && com.google.firebase.analytics.connector.internal.b.e(str, cVar.f42631f, cVar.f42632g))) {
                        Nd.a aVar = this.f42642a;
                        Bundle bundle = new Bundle();
                        String str5 = cVar.f42626a;
                        if (str5 != null) {
                            bundle.putString("origin", str5);
                        }
                        String str6 = cVar.f42627b;
                        if (str6 != null) {
                            bundle.putString("name", str6);
                        }
                        Object obj2 = cVar.f42628c;
                        if (obj2 != null) {
                            t.a(bundle, obj2);
                        }
                        String str7 = cVar.f42629d;
                        if (str7 != null) {
                            bundle.putString("trigger_event_name", str7);
                        }
                        bundle.putLong("trigger_timeout", cVar.f42630e);
                        String str8 = cVar.f42631f;
                        if (str8 != null) {
                            bundle.putString("timed_out_event_name", str8);
                        }
                        Bundle bundle2 = cVar.f42632g;
                        if (bundle2 != null) {
                            bundle.putBundle("timed_out_event_params", bundle2);
                        }
                        String str9 = cVar.f42633h;
                        if (str9 != null) {
                            bundle.putString("triggered_event_name", str9);
                        }
                        Bundle bundle3 = cVar.f42634i;
                        if (bundle3 != null) {
                            bundle.putBundle("triggered_event_params", bundle3);
                        }
                        bundle.putLong("time_to_live", cVar.f42635j);
                        String str10 = cVar.f42636k;
                        if (str10 != null) {
                            bundle.putString("expired_event_name", str10);
                        }
                        Bundle bundle4 = cVar.f42637l;
                        if (bundle4 != null) {
                            bundle.putBundle("expired_event_params", bundle4);
                        }
                        bundle.putLong("creation_timestamp", cVar.f42638m);
                        bundle.putBoolean("active", cVar.f42639n);
                        bundle.putLong("triggered_timestamp", cVar.f42640o);
                        aVar.r(bundle);
                    }
                }
            }
        }
    }

    @Override // Ze.a
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        if (str2 == null || com.google.firebase.analytics.connector.internal.b.b(str2, bundle)) {
            this.f42642a.b(str, str2, bundle);
        }
    }

    @Override // Ze.a
    public Map<String, Object> d(boolean z10) {
        return this.f42642a.m(null, null, z10);
    }

    @Override // Ze.a
    public int e(String str) {
        return this.f42642a.l(str);
    }

    @Override // Ze.a
    public List<a.c> g(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : this.f42642a.g(str, str2)) {
            int i10 = com.google.firebase.analytics.connector.internal.b.f88617g;
            r.l(bundle);
            a.c cVar = new a.c();
            cVar.f42626a = (String) r.l((String) t.b(bundle, "origin", String.class, null));
            cVar.f42627b = (String) r.l((String) t.b(bundle, "name", String.class, null));
            cVar.f42628c = t.b(bundle, "value", Object.class, null);
            cVar.f42629d = (String) t.b(bundle, "trigger_event_name", String.class, null);
            cVar.f42630e = ((Long) t.b(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            cVar.f42631f = (String) t.b(bundle, "timed_out_event_name", String.class, null);
            cVar.f42632g = (Bundle) t.b(bundle, "timed_out_event_params", Bundle.class, null);
            cVar.f42633h = (String) t.b(bundle, "triggered_event_name", String.class, null);
            cVar.f42634i = (Bundle) t.b(bundle, "triggered_event_params", Bundle.class, null);
            cVar.f42635j = ((Long) t.b(bundle, "time_to_live", Long.class, 0L)).longValue();
            cVar.f42636k = (String) t.b(bundle, "expired_event_name", String.class, null);
            cVar.f42637l = (Bundle) t.b(bundle, "expired_event_params", Bundle.class, null);
            cVar.f42639n = ((Boolean) t.b(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            cVar.f42638m = ((Long) t.b(bundle, "creation_timestamp", Long.class, 0L)).longValue();
            cVar.f42640o = ((Long) t.b(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
            arrayList.add(cVar);
        }
        return arrayList;
    }

    b(Nd.a aVar) {
        r.l(aVar);
        this.f42642a = aVar;
        this.f42643b = new ConcurrentHashMap();
    }

    public static Ze.a h(f fVar, Context context, Ff.d dVar) {
        r.l(fVar);
        r.l(context);
        r.l(dVar);
        r.l(context.getApplicationContext());
        if (f42641c == null) {
            synchronized (b.class) {
                try {
                    if (f42641c == null) {
                        Bundle bundle = new Bundle(1);
                        if (fVar.u()) {
                            dVar.b(com.google.firebase.b.class, d.f42647a, c.f42646a);
                            bundle.putBoolean("dataCollectionDefaultEnabled", fVar.t());
                        }
                        f42641c = new b(C10544v1.r(context, bundle).s());
                    }
                } finally {
                }
            }
        }
        return f42641c;
    }

    static /* synthetic */ void i(Ff.a aVar) {
        boolean z10 = ((com.google.firebase.b) aVar.a()).f88627a;
        synchronized (b.class) {
            ((b) r.l(f42641c)).f42642a.v(z10);
        }
    }

    private final boolean j(String str) {
        if (!str.isEmpty()) {
            Map map = this.f42643b;
            if (map.containsKey(str) && map.get(str) != null) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // Ze.a
    public void b(String str, String str2, Object obj) {
        if (com.google.firebase.analytics.connector.internal.b.a(str) && com.google.firebase.analytics.connector.internal.b.d(str, str2)) {
            this.f42642a.u(str, str2, obj);
        }
    }

    @Override // Ze.a
    public a.InterfaceC0912a f(String str, a.b bVar) {
        Object fVar;
        r.l(bVar);
        if (com.google.firebase.analytics.connector.internal.b.a(str) && !j(str)) {
            Nd.a aVar = this.f42642a;
            if ("fiam".equals(str)) {
                fVar = new com.google.firebase.analytics.connector.internal.d(aVar, bVar);
            } else if ("clx".equals(str)) {
                fVar = new com.google.firebase.analytics.connector.internal.f(aVar, bVar);
            } else {
                fVar = null;
            }
            if (fVar != null) {
                this.f42643b.put(str, fVar);
                return new a(this, str);
            }
        }
        return null;
    }
}
