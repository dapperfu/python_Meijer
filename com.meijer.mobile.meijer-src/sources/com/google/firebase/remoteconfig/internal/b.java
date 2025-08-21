package com.google.firebase.remoteconfig.internal;

import Vd.AbstractC5516j;
import Vd.C5519m;
import Vd.InterfaceC5509c;
import com.fullstory.FS;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import com.google.firebase.remoteconfig.internal.m;
import fg.AbstractC13987b;
import fg.InterfaceC13988c;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.Date;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;

/* loaded from: classes8.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private final Set<InterfaceC13988c> f90036a;

    /* renamed from: b, reason: collision with root package name */
    private final HttpURLConnection f90037b;

    /* renamed from: c, reason: collision with root package name */
    private final m f90038c;

    /* renamed from: d, reason: collision with root package name */
    private final f f90039d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC13988c f90040e;

    /* renamed from: f, reason: collision with root package name */
    private final ScheduledExecutorService f90041f;

    /* renamed from: i, reason: collision with root package name */
    private final t f90044i;

    /* renamed from: g, reason: collision with root package name */
    private final Random f90042g = new Random();

    /* renamed from: j, reason: collision with root package name */
    private boolean f90045j = false;

    /* renamed from: h, reason: collision with root package name */
    private final com.google.android.gms.common.util.f f90043h = com.google.android.gms.common.util.i.d();

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f90046a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f90047b;

        a(int i10, long j10) {
            this.f90046a = i10;
            this.f90047b = j10;
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            b.this.d(this.f90046a, this.f90047b);
        }
    }

    private synchronized void c(AbstractC13987b abstractC13987b) {
        Iterator<InterfaceC13988c> it = this.f90036a.iterator();
        while (it.hasNext()) {
            it.next().a(abstractC13987b);
        }
    }

    private synchronized boolean g() {
        return this.f90036a.isEmpty();
    }

    private synchronized void j(FirebaseRemoteConfigException firebaseRemoteConfigException) {
        Iterator<InterfaceC13988c> it = this.f90036a.iterator();
        while (it.hasNext()) {
            it.next().b(firebaseRemoteConfigException);
        }
    }

    private synchronized void l(int i10) {
        this.f90044i.o(new Date(new Date(this.f90043h.a()).getTime() + (i10 * 1000)));
    }

    public synchronized AbstractC5516j<Void> d(int i10, final long j10) throws Throwable {
        final int i11 = i10 - 1;
        try {
            try {
                final AbstractC5516j<m.a> abstractC5516jN = this.f90038c.n(m.b.REALTIME, 3 - i11);
                final AbstractC5516j<g> abstractC5516jE = this.f90039d.e();
                return C5519m.k(abstractC5516jN, abstractC5516jE).l(this.f90041f, new InterfaceC5509c() { // from class: com.google.firebase.remoteconfig.internal.a
                    @Override // Vd.InterfaceC5509c
                    public final Object then(AbstractC5516j abstractC5516j) {
                        return b.a(this.f90031a, abstractC5516jN, abstractC5516jE, j10, i11, abstractC5516j);
                    }
                });
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    private void b(int i10, long j10) {
        if (i10 == 0) {
            j(new FirebaseRemoteConfigServerException("Unable to fetch the latest version of the template.", FirebaseRemoteConfigException.a.CONFIG_UPDATE_NOT_FETCHED));
        } else {
            this.f90041f.schedule(new a(i10, j10), this.f90042g.nextInt(4), TimeUnit.SECONDS);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003d, code lost:
    
        r5 = new org.json.JSONObject(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0046, code lost:
    
        if (r5.has("featureDisabled") == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
    
        if (r5.getBoolean("featureDisabled") == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004e, code lost:
    
        r10.f90040e.b(new com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException("The server is temporarily unavailable. Try again in a few minutes.", com.google.firebase.remoteconfig.FirebaseRemoteConfigException.a.CONFIG_UPDATE_UNAVAILABLE));
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0063, code lost:
    
        if (g() == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006a, code lost:
    
        if (r5.has("latestTemplateVersionNumber") == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006c, code lost:
    
        r6 = r10.f90038c.r();
        r8 = r5.getLong("latestTemplateVersionNumber");
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0078, code lost:
    
        if (r8 <= r6) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007a, code lost:
    
        b(3, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0082, code lost:
    
        if (r5.has("retryIntervalSeconds") == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0084, code lost:
    
        l(r5.getInt("retryIntervalSeconds"));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void f(java.io.InputStream r11) throws org.json.JSONException, java.io.IOException {
        /*
            r10 = this;
            java.lang.String r0 = "retryIntervalSeconds"
            java.lang.String r1 = "latestTemplateVersionNumber"
            java.lang.String r2 = "featureDisabled"
            java.io.BufferedReader r3 = new java.io.BufferedReader
            java.io.InputStreamReader r4 = new java.io.InputStreamReader
            java.lang.String r5 = "utf-8"
            r4.<init>(r11, r5)
            r3.<init>(r4)
            java.lang.String r11 = ""
        L14:
            r4 = r11
        L15:
            java.lang.String r5 = r3.readLine()
            if (r5 == 0) goto La5
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            r6.append(r5)
            java.lang.String r4 = r6.toString()
            java.lang.String r6 = "}"
            boolean r5 = r5.contains(r6)
            if (r5 == 0) goto L15
            java.lang.String r4 = r10.i(r4)
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto L3d
            goto L15
        L3d:
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: org.json.JSONException -> L5d
            r5.<init>(r4)     // Catch: org.json.JSONException -> L5d
            boolean r4 = r5.has(r2)     // Catch: org.json.JSONException -> L5d
            if (r4 == 0) goto L5f
            boolean r4 = r5.getBoolean(r2)     // Catch: org.json.JSONException -> L5d
            if (r4 == 0) goto L5f
            fg.c r4 = r10.f90040e     // Catch: org.json.JSONException -> L5d
            com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException r5 = new com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException     // Catch: org.json.JSONException -> L5d
            java.lang.String r6 = "The server is temporarily unavailable. Try again in a few minutes."
            com.google.firebase.remoteconfig.FirebaseRemoteConfigException$a r7 = com.google.firebase.remoteconfig.FirebaseRemoteConfigException.a.CONFIG_UPDATE_UNAVAILABLE     // Catch: org.json.JSONException -> L5d
            r5.<init>(r6, r7)     // Catch: org.json.JSONException -> L5d
            r4.b(r5)     // Catch: org.json.JSONException -> L5d
            goto La5
        L5d:
            r4 = move-exception
            goto L8c
        L5f:
            boolean r4 = r10.g()     // Catch: org.json.JSONException -> L5d
            if (r4 == 0) goto L66
            goto La5
        L66:
            boolean r4 = r5.has(r1)     // Catch: org.json.JSONException -> L5d
            if (r4 == 0) goto L7e
            com.google.firebase.remoteconfig.internal.m r4 = r10.f90038c     // Catch: org.json.JSONException -> L5d
            long r6 = r4.r()     // Catch: org.json.JSONException -> L5d
            long r8 = r5.getLong(r1)     // Catch: org.json.JSONException -> L5d
            int r4 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r4 <= 0) goto L7e
            r4 = 3
            r10.b(r4, r8)     // Catch: org.json.JSONException -> L5d
        L7e:
            boolean r4 = r5.has(r0)     // Catch: org.json.JSONException -> L5d
            if (r4 == 0) goto L14
            int r4 = r5.getInt(r0)     // Catch: org.json.JSONException -> L5d
            r10.l(r4)     // Catch: org.json.JSONException -> L5d
            goto L14
        L8c:
            com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException r5 = new com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException
            java.lang.Throwable r6 = r4.getCause()
            com.google.firebase.remoteconfig.FirebaseRemoteConfigException$a r7 = com.google.firebase.remoteconfig.FirebaseRemoteConfigException.a.CONFIG_UPDATE_MESSAGE_INVALID
            java.lang.String r8 = "Unable to parse config update message."
            r5.<init>(r8, r6, r7)
            r10.j(r5)
            java.lang.String r5 = "FirebaseRemoteConfig"
            java.lang.String r6 = "Unable to parse latest config update message."
            com.fullstory.FS.log_e(r5, r6, r4)
            goto L14
        La5:
            r3.close()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.b.f(java.io.InputStream):void");
    }

    private String i(String str) {
        int iIndexOf = str.indexOf(123);
        int iLastIndexOf = str.lastIndexOf(125);
        return (iIndexOf < 0 || iLastIndexOf < 0 || iIndexOf >= iLastIndexOf) ? "" : str.substring(iIndexOf, iLastIndexOf + 1);
    }

    public void h() throws IOException {
        HttpURLConnection httpURLConnection = this.f90037b;
        if (httpURLConnection == null) {
            return;
        }
        InputStream inputStream = null;
        try {
            try {
                try {
                    inputStream = httpURLConnection.getInputStream();
                    f(inputStream);
                    if (inputStream != null) {
                        inputStream.close();
                    }
                } catch (IOException e10) {
                    FS.log_d("FirebaseRemoteConfig", "Exception thrown when closing connection stream. Retrying connection...", e10);
                }
            } catch (IOException e11) {
                if (!this.f90045j) {
                    FS.log_d("FirebaseRemoteConfig", "Real-time connection was closed due to an exception.", e11);
                }
                if (inputStream != null) {
                    inputStream.close();
                }
            }
        } catch (Throwable th2) {
            if (0 != 0) {
                try {
                    inputStream.close();
                } catch (IOException e12) {
                    FS.log_d("FirebaseRemoteConfig", "Exception thrown when closing connection stream. Retrying connection...", e12);
                }
            }
            throw th2;
        }
    }

    public void k(boolean z10) {
        this.f90045j = z10;
    }

    public b(HttpURLConnection httpURLConnection, m mVar, f fVar, Set<InterfaceC13988c> set, InterfaceC13988c interfaceC13988c, ScheduledExecutorService scheduledExecutorService, t tVar) {
        this.f90037b = httpURLConnection;
        this.f90038c = mVar;
        this.f90039d = fVar;
        this.f90036a = set;
        this.f90040e = interfaceC13988c;
        this.f90041f = scheduledExecutorService;
        this.f90044i = tVar;
    }

    public static /* synthetic */ AbstractC5516j a(b bVar, AbstractC5516j abstractC5516j, AbstractC5516j abstractC5516j2, long j10, int i10, AbstractC5516j abstractC5516j3) throws JSONException {
        bVar.getClass();
        if (!abstractC5516j.r()) {
            return C5519m.e(new FirebaseRemoteConfigClientException("Failed to auto-fetch config update.", abstractC5516j.m()));
        }
        if (!abstractC5516j2.r()) {
            return C5519m.e(new FirebaseRemoteConfigClientException("Failed to get activated config for auto-fetch", abstractC5516j2.m()));
        }
        m.a aVar = (m.a) abstractC5516j.n();
        g gVarA = (g) abstractC5516j2.n();
        if (!e(aVar, j10).booleanValue()) {
            FS.log_d("FirebaseRemoteConfig", "Fetched template version is the same as SDK's current version. Retrying fetch.");
            bVar.b(i10, j10);
            return C5519m.f(null);
        }
        if (aVar.d() == null) {
            FS.log_d("FirebaseRemoteConfig", "The fetch succeeded, but the backend had no updates.");
            return C5519m.f(null);
        }
        if (gVarA == null) {
            gVarA = g.l().a();
        }
        Set<String> setF = gVarA.f(aVar.d());
        if (setF.isEmpty()) {
            FS.log_d("FirebaseRemoteConfig", "Config was fetched, but no params changed.");
            return C5519m.f(null);
        }
        bVar.c(AbstractC13987b.a(setF));
        return C5519m.f(null);
    }

    private static Boolean e(m.a aVar, long j10) {
        boolean z10 = false;
        if (aVar.d() != null) {
            if (aVar.d().k() >= j10) {
                z10 = true;
            }
            return Boolean.valueOf(z10);
        }
        if (aVar.f() == 1) {
            z10 = true;
        }
        return Boolean.valueOf(z10);
    }
}
