package com.google.firebase.remoteconfig.internal;

import Td.AbstractC5232j;
import Td.C5235m;
import Td.InterfaceC5225c;
import com.fullstory.FS;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import com.google.firebase.remoteconfig.internal.m;
import dg.AbstractC13514b;
import dg.InterfaceC13515c;
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

/* loaded from: classes7.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private final Set<InterfaceC13515c> f89194a;

    /* renamed from: b, reason: collision with root package name */
    private final HttpURLConnection f89195b;

    /* renamed from: c, reason: collision with root package name */
    private final m f89196c;

    /* renamed from: d, reason: collision with root package name */
    private final f f89197d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC13515c f89198e;

    /* renamed from: f, reason: collision with root package name */
    private final ScheduledExecutorService f89199f;

    /* renamed from: i, reason: collision with root package name */
    private final t f89202i;

    /* renamed from: g, reason: collision with root package name */
    private final Random f89200g = new Random();

    /* renamed from: j, reason: collision with root package name */
    private boolean f89203j = false;

    /* renamed from: h, reason: collision with root package name */
    private final com.google.android.gms.common.util.f f89201h = com.google.android.gms.common.util.i.d();

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f89204a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f89205b;

        a(int i10, long j10) {
            this.f89204a = i10;
            this.f89205b = j10;
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            b.this.d(this.f89204a, this.f89205b);
        }
    }

    private synchronized void c(AbstractC13514b abstractC13514b) {
        Iterator<InterfaceC13515c> it = this.f89194a.iterator();
        while (it.hasNext()) {
            it.next().a(abstractC13514b);
        }
    }

    private synchronized boolean g() {
        return this.f89194a.isEmpty();
    }

    private synchronized void j(FirebaseRemoteConfigException firebaseRemoteConfigException) {
        Iterator<InterfaceC13515c> it = this.f89194a.iterator();
        while (it.hasNext()) {
            it.next().b(firebaseRemoteConfigException);
        }
    }

    private synchronized void l(int i10) {
        this.f89202i.o(new Date(new Date(this.f89201h.a()).getTime() + (i10 * 1000)));
    }

    public synchronized AbstractC5232j<Void> d(int i10, final long j10) throws Throwable {
        final int i11 = i10 - 1;
        try {
            try {
                final AbstractC5232j<m.a> abstractC5232jN = this.f89196c.n(m.b.REALTIME, 3 - i11);
                final AbstractC5232j<g> abstractC5232jE = this.f89197d.e();
                return C5235m.k(abstractC5232jN, abstractC5232jE).l(this.f89199f, new InterfaceC5225c() { // from class: com.google.firebase.remoteconfig.internal.a
                    @Override // Td.InterfaceC5225c
                    public final Object then(AbstractC5232j abstractC5232j) {
                        return b.a(this.f89189a, abstractC5232jN, abstractC5232jE, j10, i11, abstractC5232j);
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
            this.f89199f.schedule(new a(i10, j10), this.f89200g.nextInt(4), TimeUnit.SECONDS);
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
    
        r10.f89198e.b(new com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException("The server is temporarily unavailable. Try again in a few minutes.", com.google.firebase.remoteconfig.FirebaseRemoteConfigException.a.CONFIG_UPDATE_UNAVAILABLE));
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0063, code lost:
    
        if (g() == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006a, code lost:
    
        if (r5.has("latestTemplateVersionNumber") == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006c, code lost:
    
        r6 = r10.f89196c.r();
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
            dg.c r4 = r10.f89198e     // Catch: org.json.JSONException -> L5d
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
            com.google.firebase.remoteconfig.internal.m r4 = r10.f89196c     // Catch: org.json.JSONException -> L5d
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
        HttpURLConnection httpURLConnection = this.f89195b;
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
                if (!this.f89203j) {
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
        this.f89203j = z10;
    }

    public b(HttpURLConnection httpURLConnection, m mVar, f fVar, Set<InterfaceC13515c> set, InterfaceC13515c interfaceC13515c, ScheduledExecutorService scheduledExecutorService, t tVar) {
        this.f89195b = httpURLConnection;
        this.f89196c = mVar;
        this.f89197d = fVar;
        this.f89194a = set;
        this.f89198e = interfaceC13515c;
        this.f89199f = scheduledExecutorService;
        this.f89202i = tVar;
    }

    public static /* synthetic */ AbstractC5232j a(b bVar, AbstractC5232j abstractC5232j, AbstractC5232j abstractC5232j2, long j10, int i10, AbstractC5232j abstractC5232j3) throws JSONException {
        bVar.getClass();
        if (!abstractC5232j.r()) {
            return C5235m.e(new FirebaseRemoteConfigClientException("Failed to auto-fetch config update.", abstractC5232j.m()));
        }
        if (!abstractC5232j2.r()) {
            return C5235m.e(new FirebaseRemoteConfigClientException("Failed to get activated config for auto-fetch", abstractC5232j2.m()));
        }
        m.a aVar = (m.a) abstractC5232j.n();
        g gVarA = (g) abstractC5232j2.n();
        if (!e(aVar, j10).booleanValue()) {
            FS.log_d("FirebaseRemoteConfig", "Fetched template version is the same as SDK's current version. Retrying fetch.");
            bVar.b(i10, j10);
            return C5235m.f(null);
        }
        if (aVar.d() == null) {
            FS.log_d("FirebaseRemoteConfig", "The fetch succeeded, but the backend had no updates.");
            return C5235m.f(null);
        }
        if (gVarA == null) {
            gVarA = g.l().a();
        }
        Set<String> setF = gVarA.f(aVar.d());
        if (setF.isEmpty()) {
            FS.log_d("FirebaseRemoteConfig", "Config was fetched, but no params changed.");
            return C5235m.f(null);
        }
        bVar.c(AbstractC13514b.a(setF));
        return C5235m.f(null);
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
