package com.google.firebase.remoteconfig.internal;

import com.fullstory.FS;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import org.json.JSONException;

/* loaded from: classes8.dex */
public class o {

    /* renamed from: e, reason: collision with root package name */
    public static final Charset f90110e = Charset.forName("UTF-8");

    /* renamed from: f, reason: collision with root package name */
    static final Pattern f90111f = Pattern.compile("^(1|true|t|yes|y|on)$", 2);

    /* renamed from: g, reason: collision with root package name */
    static final Pattern f90112g = Pattern.compile("^(0|false|f|no|n|off|)$", 2);

    /* renamed from: a, reason: collision with root package name */
    private final Set<com.google.android.gms.common.util.d<String, g>> f90113a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    private final Executor f90114b;

    /* renamed from: c, reason: collision with root package name */
    private final f f90115c;

    /* renamed from: d, reason: collision with root package name */
    private final f f90116d;

    private void c(final String str, final g gVar) {
        if (gVar == null) {
            return;
        }
        synchronized (this.f90113a) {
            try {
                for (final com.google.android.gms.common.util.d<String, g> dVar : this.f90113a) {
                    this.f90114b.execute(new Runnable() { // from class: com.google.firebase.remoteconfig.internal.n
                        @Override // java.lang.Runnable
                        public final void run() {
                            dVar.accept(str, gVar);
                        }
                    });
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static Set<String> f(f fVar) {
        HashSet hashSet = new HashSet();
        g gVarE = e(fVar);
        if (gVarE != null) {
            Iterator<String> itKeys = gVarE.g().keys();
            while (itKeys.hasNext()) {
                hashSet.add(itKeys.next());
            }
        }
        return hashSet;
    }

    private static void i(String str, String str2) {
        FS.log_w("FirebaseRemoteConfig", String.format("No value of type '%s' exists for parameter key '%s'.", str2, str));
    }

    public void b(com.google.android.gms.common.util.d<String, g> dVar) {
        synchronized (this.f90113a) {
            this.f90113a.add(dVar);
        }
    }

    public Map<String, fg.j> d() {
        HashSet<String> hashSet = new HashSet();
        hashSet.addAll(f(this.f90115c));
        hashSet.addAll(f(this.f90116d));
        HashMap map = new HashMap();
        for (String str : hashSet) {
            map.put(str, h(str));
        }
        return map;
    }

    public fg.j h(String str) {
        String strG = g(this.f90115c, str);
        if (strG != null) {
            c(str, e(this.f90115c));
            return new w(strG, 2);
        }
        String strG2 = g(this.f90116d, str);
        if (strG2 != null) {
            return new w(strG2, 1);
        }
        i(str, "FirebaseRemoteConfigValue");
        return new w("", 0);
    }

    public o(Executor executor, f fVar, f fVar2) {
        this.f90114b = executor;
        this.f90115c = fVar;
        this.f90116d = fVar2;
    }

    private static g e(f fVar) {
        return fVar.f();
    }

    private static String g(f fVar, String str) {
        g gVarE = e(fVar);
        if (gVarE == null) {
            return null;
        }
        try {
            return gVarE.g().getString(str);
        } catch (JSONException unused) {
            return null;
        }
    }
}
