package bf;

import Qd.H;
import Qd.t;
import android.content.Context;
import android.os.Bundle;
import bf.InterfaceC6375a;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.internal.measurement.C10669v1;
import com.google.firebase.f;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: bf.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C6376b implements InterfaceC6375a {

    /* renamed from: c, reason: collision with root package name */
    private static volatile InterfaceC6375a f60308c;

    /* renamed from: a, reason: collision with root package name */
    final Pd.a f60309a;

    /* renamed from: b, reason: collision with root package name */
    final Map f60310b;

    /* renamed from: bf.b$a */
    class a implements InterfaceC6375a.InterfaceC1201a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f60311a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C6376b f60312b;

        a(C6376b c6376b, String str) {
            this.f60311a = str;
            Objects.requireNonNull(c6376b);
            this.f60312b = c6376b;
        }
    }

    @Override // bf.InterfaceC6375a
    public void a(String str, String str2, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (com.google.firebase.analytics.connector.internal.b.a(str) && com.google.firebase.analytics.connector.internal.b.b(str2, bundle) && com.google.firebase.analytics.connector.internal.b.e(str, str2, bundle)) {
            if ("clx".equals(str) && "_ae".equals(str2)) {
                bundle.putLong("_r", 1L);
            }
            this.f60309a.n(str, str2, bundle);
        }
    }

    @Override // bf.InterfaceC6375a
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        if (str2 == null || com.google.firebase.analytics.connector.internal.b.b(str2, bundle)) {
            this.f60309a.b(str, str2, bundle);
        }
    }

    @Override // bf.InterfaceC6375a
    public void d(InterfaceC6375a.c cVar) {
        String str;
        int i10 = com.google.firebase.analytics.connector.internal.b.f89457g;
        if (cVar == null || (str = cVar.f60293a) == null || str.isEmpty()) {
            return;
        }
        Object obj = cVar.f60295c;
        if ((obj == null || H.b(obj) != null) && com.google.firebase.analytics.connector.internal.b.a(str) && com.google.firebase.analytics.connector.internal.b.d(str, cVar.f60294b)) {
            String str2 = cVar.f60303k;
            if (str2 == null || (com.google.firebase.analytics.connector.internal.b.b(str2, cVar.f60304l) && com.google.firebase.analytics.connector.internal.b.e(str, cVar.f60303k, cVar.f60304l))) {
                String str3 = cVar.f60300h;
                if (str3 == null || (com.google.firebase.analytics.connector.internal.b.b(str3, cVar.f60301i) && com.google.firebase.analytics.connector.internal.b.e(str, cVar.f60300h, cVar.f60301i))) {
                    String str4 = cVar.f60298f;
                    if (str4 == null || (com.google.firebase.analytics.connector.internal.b.b(str4, cVar.f60299g) && com.google.firebase.analytics.connector.internal.b.e(str, cVar.f60298f, cVar.f60299g))) {
                        Pd.a aVar = this.f60309a;
                        Bundle bundle = new Bundle();
                        String str5 = cVar.f60293a;
                        if (str5 != null) {
                            bundle.putString("origin", str5);
                        }
                        String str6 = cVar.f60294b;
                        if (str6 != null) {
                            bundle.putString("name", str6);
                        }
                        Object obj2 = cVar.f60295c;
                        if (obj2 != null) {
                            t.a(bundle, obj2);
                        }
                        String str7 = cVar.f60296d;
                        if (str7 != null) {
                            bundle.putString("trigger_event_name", str7);
                        }
                        bundle.putLong("trigger_timeout", cVar.f60297e);
                        String str8 = cVar.f60298f;
                        if (str8 != null) {
                            bundle.putString("timed_out_event_name", str8);
                        }
                        Bundle bundle2 = cVar.f60299g;
                        if (bundle2 != null) {
                            bundle.putBundle("timed_out_event_params", bundle2);
                        }
                        String str9 = cVar.f60300h;
                        if (str9 != null) {
                            bundle.putString("triggered_event_name", str9);
                        }
                        Bundle bundle3 = cVar.f60301i;
                        if (bundle3 != null) {
                            bundle.putBundle("triggered_event_params", bundle3);
                        }
                        bundle.putLong("time_to_live", cVar.f60302j);
                        String str10 = cVar.f60303k;
                        if (str10 != null) {
                            bundle.putString("expired_event_name", str10);
                        }
                        Bundle bundle4 = cVar.f60304l;
                        if (bundle4 != null) {
                            bundle.putBundle("expired_event_params", bundle4);
                        }
                        bundle.putLong("creation_timestamp", cVar.f60305m);
                        bundle.putBoolean("active", cVar.f60306n);
                        bundle.putLong("triggered_timestamp", cVar.f60307o);
                        aVar.r(bundle);
                    }
                }
            }
        }
    }

    @Override // bf.InterfaceC6375a
    public Map<String, Object> e(boolean z10) {
        return this.f60309a.m(null, null, z10);
    }

    @Override // bf.InterfaceC6375a
    public int f(String str) {
        return this.f60309a.l(str);
    }

    @Override // bf.InterfaceC6375a
    public List<InterfaceC6375a.c> g(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : this.f60309a.g(str, str2)) {
            int i10 = com.google.firebase.analytics.connector.internal.b.f89457g;
            r.l(bundle);
            InterfaceC6375a.c cVar = new InterfaceC6375a.c();
            cVar.f60293a = (String) r.l((String) t.b(bundle, "origin", String.class, null));
            cVar.f60294b = (String) r.l((String) t.b(bundle, "name", String.class, null));
            cVar.f60295c = t.b(bundle, "value", Object.class, null);
            cVar.f60296d = (String) t.b(bundle, "trigger_event_name", String.class, null);
            cVar.f60297e = ((Long) t.b(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            cVar.f60298f = (String) t.b(bundle, "timed_out_event_name", String.class, null);
            cVar.f60299g = (Bundle) t.b(bundle, "timed_out_event_params", Bundle.class, null);
            cVar.f60300h = (String) t.b(bundle, "triggered_event_name", String.class, null);
            cVar.f60301i = (Bundle) t.b(bundle, "triggered_event_params", Bundle.class, null);
            cVar.f60302j = ((Long) t.b(bundle, "time_to_live", Long.class, 0L)).longValue();
            cVar.f60303k = (String) t.b(bundle, "expired_event_name", String.class, null);
            cVar.f60304l = (Bundle) t.b(bundle, "expired_event_params", Bundle.class, null);
            cVar.f60306n = ((Boolean) t.b(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            cVar.f60305m = ((Long) t.b(bundle, "creation_timestamp", Long.class, 0L)).longValue();
            cVar.f60307o = ((Long) t.b(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
            arrayList.add(cVar);
        }
        return arrayList;
    }

    C6376b(Pd.a aVar) {
        r.l(aVar);
        this.f60309a = aVar;
        this.f60310b = new ConcurrentHashMap();
    }

    public static InterfaceC6375a h(f fVar, Context context, Hf.d dVar) {
        r.l(fVar);
        r.l(context);
        r.l(dVar);
        r.l(context.getApplicationContext());
        if (f60308c == null) {
            synchronized (C6376b.class) {
                try {
                    if (f60308c == null) {
                        Bundle bundle = new Bundle(1);
                        if (fVar.u()) {
                            dVar.c(com.google.firebase.b.class, ExecutorC6378d.f60314a, C6377c.f60313a);
                            bundle.putBoolean("dataCollectionDefaultEnabled", fVar.t());
                        }
                        f60308c = new C6376b(C10669v1.r(context, bundle).s());
                    }
                } finally {
                }
            }
        }
        return f60308c;
    }

    static /* synthetic */ void i(Hf.a aVar) {
        boolean z10 = ((com.google.firebase.b) aVar.a()).f89467a;
        synchronized (C6376b.class) {
            ((C6376b) r.l(f60308c)).f60309a.v(z10);
        }
    }

    private final boolean j(String str) {
        if (!str.isEmpty()) {
            Map map = this.f60310b;
            if (map.containsKey(str) && map.get(str) != null) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // bf.InterfaceC6375a
    public void b(String str, String str2, Object obj) {
        if (com.google.firebase.analytics.connector.internal.b.a(str) && com.google.firebase.analytics.connector.internal.b.d(str, str2)) {
            this.f60309a.u(str, str2, obj);
        }
    }

    @Override // bf.InterfaceC6375a
    public InterfaceC6375a.InterfaceC1201a c(String str, InterfaceC6375a.b bVar) {
        Object fVar;
        r.l(bVar);
        if (com.google.firebase.analytics.connector.internal.b.a(str) && !j(str)) {
            Pd.a aVar = this.f60309a;
            if ("fiam".equals(str)) {
                fVar = new com.google.firebase.analytics.connector.internal.d(aVar, bVar);
            } else if ("clx".equals(str)) {
                fVar = new com.google.firebase.analytics.connector.internal.f(aVar, bVar);
            } else {
                fVar = null;
            }
            if (fVar != null) {
                this.f60310b.put(str, fVar);
                return new a(this, str);
            }
        }
        return null;
    }
}
