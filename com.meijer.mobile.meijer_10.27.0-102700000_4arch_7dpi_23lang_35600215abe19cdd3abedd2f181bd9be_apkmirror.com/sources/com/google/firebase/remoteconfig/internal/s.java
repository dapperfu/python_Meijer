package com.google.firebase.remoteconfig.internal;

import Td.AbstractC5232j;
import Td.C5235m;
import Td.InterfaceC5225c;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.fullstory.FS;
import com.google.firebase.remoteconfig.BuildConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.maps.internal.HttpHeaders;
import dg.AbstractC13514b;
import dg.InterfaceC13515c;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class s {

    /* renamed from: t, reason: collision with root package name */
    static final int[] f89290t = {2, 4, 8, 16, 32, 64, 128, 256};

    /* renamed from: u, reason: collision with root package name */
    private static final Pattern f89291u = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");

    /* renamed from: a, reason: collision with root package name */
    private final Set<InterfaceC13515c> f89292a;

    /* renamed from: c, reason: collision with root package name */
    private int f89294c;

    /* renamed from: f, reason: collision with root package name */
    private HttpURLConnection f89297f;

    /* renamed from: g, reason: collision with root package name */
    private com.google.firebase.remoteconfig.internal.b f89298g;

    /* renamed from: i, reason: collision with root package name */
    private final ScheduledExecutorService f89300i;

    /* renamed from: j, reason: collision with root package name */
    private final m f89301j;

    /* renamed from: k, reason: collision with root package name */
    private final com.google.firebase.f f89302k;

    /* renamed from: l, reason: collision with root package name */
    private final Jf.e f89303l;

    /* renamed from: m, reason: collision with root package name */
    f f89304m;

    /* renamed from: n, reason: collision with root package name */
    private final Context f89305n;

    /* renamed from: o, reason: collision with root package name */
    private final String f89306o;

    /* renamed from: r, reason: collision with root package name */
    private final t f89309r;

    /* renamed from: h, reason: collision with root package name */
    private final int f89299h = 8;

    /* renamed from: b, reason: collision with root package name */
    private boolean f89293b = false;

    /* renamed from: p, reason: collision with root package name */
    private final Random f89307p = new Random();

    /* renamed from: q, reason: collision with root package name */
    private final com.google.android.gms.common.util.f f89308q = com.google.android.gms.common.util.i.d();

    /* renamed from: d, reason: collision with root package name */
    private boolean f89295d = false;

    /* renamed from: e, reason: collision with root package name */
    private boolean f89296e = false;

    /* renamed from: s, reason: collision with root package name */
    private final Object f89310s = new Object();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            s.this.e();
        }
    }

    class b implements InterfaceC13515c {
        @Override // dg.InterfaceC13515c
        public void a(AbstractC13514b abstractC13514b) {
        }

        b() {
        }

        @Override // dg.InterfaceC13515c
        public void b(FirebaseRemoteConfigException firebaseRemoteConfigException) {
            s.this.l();
            s.this.u(firebaseRemoteConfigException);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private synchronized boolean f() {
        /*
            r1 = this;
            monitor-enter(r1)
            java.util.Set<dg.c> r0 = r1.f89292a     // Catch: java.lang.Throwable -> L17
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L19
            boolean r0 = r1.f89293b     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L19
            boolean r0 = r1.f89295d     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L19
            boolean r0 = r1.f89296e     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L19
            r0 = 1
            goto L1a
        L17:
            r0 = move-exception
            goto L1c
        L19:
            r0 = 0
        L1a:
            monitor-exit(r1)
            return r0
        L1c:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L17
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.s.f():boolean");
    }

    private synchronized boolean g() {
        boolean zF;
        zF = f();
        if (zF) {
            y(true);
        }
        return zF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void l() {
        this.f89295d = true;
    }

    private boolean r(int i10) {
        return i10 == 408 || i10 == 429 || i10 == 502 || i10 == 503 || i10 == 504;
    }

    private synchronized void s(long j10) {
        try {
            if (f()) {
                int i10 = this.f89294c;
                if (i10 > 0) {
                    this.f89294c = i10 - 1;
                    this.f89300i.schedule(new a(), j10, TimeUnit.MILLISECONDS);
                } else if (!this.f89296e) {
                    u(new FirebaseRemoteConfigClientException("Unable to connect to the server. Check your connection and try again.", FirebaseRemoteConfigException.a.CONFIG_UPDATE_STREAM_ERROR));
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void u(FirebaseRemoteConfigException firebaseRemoteConfigException) {
        Iterator<InterfaceC13515c> it = this.f89292a.iterator();
        while (it.hasNext()) {
            it.next().b(firebaseRemoteConfigException);
        }
    }

    private synchronized void v() {
        this.f89294c = 8;
    }

    private synchronized void y(boolean z10) {
        this.f89293b = z10;
    }

    @SuppressLint({"VisibleForTests"})
    public synchronized com.google.firebase.remoteconfig.internal.b B(HttpURLConnection httpURLConnection) {
        return new com.google.firebase.remoteconfig.internal.b(httpURLConnection, this.f89301j, this.f89304m, this.f89292a, new b(), this.f89300i, this.f89309r);
    }

    @SuppressLint({"VisibleForTests"})
    public synchronized void w() {
        s(Math.max(0L, this.f89309r.i().a().getTime() - new Date(this.f89308q.a()).getTime()));
    }

    private void D(Date date) {
        int iB = this.f89309r.i().b() + 1;
        this.f89309r.p(iB, new Date(date.getTime() + o(iB)));
    }

    private void h(InputStream inputStream) throws IOException {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e10) {
                FS.log_d("FirebaseRemoteConfig", "Error closing connection stream.", e10);
            }
        }
    }

    private JSONObject k(String str) {
        HashMap map = new HashMap();
        map.put("project", m(this.f89302k.n().c()));
        map.put("namespace", this.f89306o);
        map.put("lastKnownVersionNumber", Long.toString(this.f89301j.r()));
        map.put("appId", this.f89302k.n().c());
        map.put("sdkVersion", BuildConfig.VERSION_NAME);
        map.put("appInstanceId", str);
        return new JSONObject(map);
    }

    private static String m(String str) {
        Matcher matcher = f89291u.matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return null;
    }

    private String n() {
        try {
            Context context = this.f89305n;
            byte[] bArrA = com.google.android.gms.common.util.a.a(context, context.getPackageName());
            if (bArrA != null) {
                return com.google.android.gms.common.util.k.b(bArrA, false);
            }
            FS.log_e("FirebaseRemoteConfig", "Could not get fingerprint hash for package: " + this.f89305n.getPackageName());
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            FS.log_i("FirebaseRemoteConfig", "No such package: " + this.f89305n.getPackageName());
            return null;
        }
    }

    private long o(int i10) {
        int length = f89290t.length;
        if (i10 >= length) {
            i10 = length;
        }
        return (TimeUnit.MINUTES.toMillis(r0[i10 - 1]) / 2) + this.f89307p.nextInt((int) r0);
    }

    private String p(String str) {
        return String.format("https://firebaseremoteconfigrealtime.googleapis.com/v1/projects/%s/namespaces/%s:streamFetchInvalidations", m(this.f89302k.n().c()), str);
    }

    private URL q() {
        try {
            return new URL(p(this.f89306o));
        } catch (MalformedURLException unused) {
            FS.log_e("FirebaseRemoteConfig", "URL is malformed");
            return null;
        }
    }

    private String t(InputStream inputStream) throws IOException {
        StringBuilder sb2 = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                sb2.append(line);
            }
        } catch (IOException unused) {
            if (sb2.length() == 0) {
                return "Unable to connect to the server, access is forbidden. HTTP status code: 403";
            }
        }
        return sb2.toString();
    }

    private void x(HttpURLConnection httpURLConnection, String str) {
        httpURLConnection.setRequestProperty("X-Goog-Firebase-Installations-Auth", str);
        httpURLConnection.setRequestProperty("X-Goog-Api-Key", this.f89302k.n().b());
        httpURLConnection.setRequestProperty(HttpHeaders.X_ANDROID_PACKAGE, this.f89305n.getPackageName());
        httpURLConnection.setRequestProperty(HttpHeaders.X_ANDROID_CERT, n());
        httpURLConnection.setRequestProperty("X-Google-GFE-Can-Retry", "yes");
        httpURLConnection.setRequestProperty("X-Accept-Response-Streaming", "true");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept", "application/json");
    }

    @SuppressLint({"VisibleForTests"})
    public void A(HttpURLConnection httpURLConnection, String str, String str2) throws IOException {
        httpURLConnection.setRequestMethod("POST");
        x(httpURLConnection, str2);
        byte[] bytes = k(str).toString().getBytes("utf-8");
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
        bufferedOutputStream.write(bytes);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }

    public void C() {
        s(0L);
    }

    public void i(InputStream inputStream, InputStream inputStream2) throws IOException {
        HttpURLConnection httpURLConnection = this.f89297f;
        if (httpURLConnection != null && !this.f89296e) {
            httpURLConnection.disconnect();
        }
        h(inputStream);
        h(inputStream2);
    }

    @SuppressLint({"VisibleForTests"})
    public AbstractC5232j<HttpURLConnection> j() {
        final AbstractC5232j<com.google.firebase.installations.f> abstractC5232jA = this.f89303l.a(false);
        final AbstractC5232j<String> id2 = this.f89303l.getId();
        return C5235m.k(abstractC5232jA, id2).l(this.f89300i, new InterfaceC5225c() { // from class: com.google.firebase.remoteconfig.internal.r
            @Override // Td.InterfaceC5225c
            public final Object then(AbstractC5232j abstractC5232j) {
                return s.b(this.f89287a, abstractC5232jA, id2, abstractC5232j);
            }
        });
    }

    public void z(boolean z10) {
        HttpURLConnection httpURLConnection;
        synchronized (this.f89310s) {
            try {
                this.f89296e = z10;
                com.google.firebase.remoteconfig.internal.b bVar = this.f89298g;
                if (bVar != null) {
                    bVar.k(z10);
                }
                if (Build.VERSION.SDK_INT >= 26 && z10 && (httpURLConnection = this.f89297f) != null) {
                    httpURLConnection.disconnect();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public s(com.google.firebase.f fVar, Jf.e eVar, m mVar, f fVar2, Context context, String str, Set<InterfaceC13515c> set, t tVar, ScheduledExecutorService scheduledExecutorService) {
        this.f89292a = set;
        this.f89300i = scheduledExecutorService;
        this.f89294c = Math.max(8 - tVar.i().b(), 1);
        this.f89302k = fVar;
        this.f89301j = mVar;
        this.f89303l = eVar;
        this.f89304m = fVar2;
        this.f89305n = context;
        this.f89306o = str;
        this.f89309r = tVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c1 A[Catch: all -> 0x0044, TryCatch #1 {all -> 0x0044, blocks: (B:9:0x0030, B:47:0x00bd, B:49:0x00c1, B:50:0x00c5), top: B:88:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c5 A[Catch: all -> 0x0044, TRY_LEAVE, TryCatch #1 {all -> 0x0044, blocks: (B:9:0x0030, B:47:0x00bd, B:49:0x00c1, B:50:0x00c5), top: B:88:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x010b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ Td.AbstractC5232j a(com.google.firebase.remoteconfig.internal.s r10, Td.AbstractC5232j r11, Td.AbstractC5232j r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.s.a(com.google.firebase.remoteconfig.internal.s, Td.j, Td.j):Td.j");
    }

    public static /* synthetic */ AbstractC5232j b(s sVar, AbstractC5232j abstractC5232j, AbstractC5232j abstractC5232j2, AbstractC5232j abstractC5232j3) {
        sVar.getClass();
        if (!abstractC5232j.r()) {
            return C5235m.e(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation auth token for config update listener connection.", abstractC5232j.m()));
        }
        if (!abstractC5232j2.r()) {
            return C5235m.e(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation ID for config update listener connection.", abstractC5232j2.m()));
        }
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) FS.urlconnection_wrapInstance(sVar.q().openConnection());
            sVar.A(httpURLConnection, (String) abstractC5232j2.n(), ((com.google.firebase.installations.f) abstractC5232j.n()).b());
            return C5235m.f(httpURLConnection);
        } catch (IOException e10) {
            return C5235m.e(new FirebaseRemoteConfigClientException("Failed to open HTTP stream connection", e10));
        }
    }

    @SuppressLint({"VisibleForTests", "DefaultLocale"})
    public void e() {
        if (!g()) {
            return;
        }
        if (new Date(this.f89308q.a()).before(this.f89309r.i().a())) {
            w();
        } else {
            final AbstractC5232j<HttpURLConnection> abstractC5232jJ = j();
            C5235m.k(abstractC5232jJ).j(this.f89300i, new InterfaceC5225c() { // from class: com.google.firebase.remoteconfig.internal.q
                @Override // Td.InterfaceC5225c
                public final Object then(AbstractC5232j abstractC5232j) {
                    return s.a(this.f89285a, abstractC5232jJ, abstractC5232j);
                }
            });
        }
    }
}
