package x6;

import android.os.Handler;
import android.os.Looper;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONObject;
import x6.C18124t;

/* renamed from: x6.G, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C18101G {

    /* renamed from: a, reason: collision with root package name */
    C18124t.a f170447a;

    /* renamed from: b, reason: collision with root package name */
    ExecutorService f170448b = Executors.newSingleThreadExecutor();

    /* renamed from: c, reason: collision with root package name */
    private Handler f170449c = new Handler(Looper.getMainLooper());

    /* renamed from: x6.G$a */
    final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ URL f170450a;

        a(URL url) {
            this.f170450a = url;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00d5  */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void run() throws java.lang.Throwable {
            /*
                r7 = this;
                java.lang.String r0 = "CYFNetworkServiceTask"
                r1 = 0
                r2 = 0
                java.net.URL r3 = r7.f170450a     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L86 org.json.JSONException -> L89
                java.net.URLConnection r3 = r3.openConnection()     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L86 org.json.JSONException -> L89
                java.net.URLConnection r3 = com.fullstory.FS.urlconnection_wrapInstance(r3)     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L86 org.json.JSONException -> L89
                java.lang.Object r3 = com.google.firebase.perf.network.FirebasePerfUrlConnection.instrument(r3)     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L86 org.json.JSONException -> L89
                java.net.URLConnection r3 = (java.net.URLConnection) r3     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L86 org.json.JSONException -> L89
                java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L86 org.json.JSONException -> L89
                r4 = 10000(0x2710, float:1.4013E-41)
                r3.setReadTimeout(r4)     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4c org.json.JSONException -> L4e
                r4 = 15000(0x3a98, float:2.102E-41)
                r3.setConnectTimeout(r4)     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4c org.json.JSONException -> L4e
                java.lang.String r4 = "GET"
                r3.setRequestMethod(r4)     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4c org.json.JSONException -> L4e
                r3.setUseCaches(r1)     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4c org.json.JSONException -> L4e
                java.lang.String r4 = "User-Agent"
                java.lang.String r5 = x6.T.d()     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4c org.json.JSONException -> L4e
                r3.setRequestProperty(r4, r5)     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4c org.json.JSONException -> L4e
                int r4 = r3.getResponseCode()     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4c org.json.JSONException -> L4e
                r5 = 200(0xc8, float:2.8E-43)
                if (r4 == r5) goto L50
                java.lang.String r5 = "Failed to get PoW Params, HTTP response code: "
                java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4c org.json.JSONException -> L4e
                java.lang.String r4 = r5.concat(r4)     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4c org.json.JSONException -> L4e
                java.lang.Throwable[] r5 = new java.lang.Throwable[r1]     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4c org.json.JSONException -> L4e
                x6.r.e(r0, r4, r5)     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4c org.json.JSONException -> L4e
                goto L7a
            L49:
                r0 = move-exception
                goto Ld3
            L4c:
                r4 = move-exception
                goto L8c
            L4e:
                r4 = move-exception
                goto Lb1
            L50:
                java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4c org.json.JSONException -> L4e
                java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4c org.json.JSONException -> L4e
                java.io.InputStream r6 = r3.getInputStream()     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4c org.json.JSONException -> L4e
                r5.<init>(r6)     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4c org.json.JSONException -> L4e
                r4.<init>(r5)     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4c org.json.JSONException -> L4e
                java.lang.StringBuffer r5 = new java.lang.StringBuffer     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4c org.json.JSONException -> L4e
                r5.<init>()     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4c org.json.JSONException -> L4e
            L63:
                java.lang.String r6 = r4.readLine()     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4c org.json.JSONException -> L4e
                if (r6 == 0) goto L6d
                r5.append(r6)     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4c org.json.JSONException -> L4e
                goto L63
            L6d:
                r4.close()     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4c org.json.JSONException -> L4e
                org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4c org.json.JSONException -> L4e
                java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4c org.json.JSONException -> L4e
                r4.<init>(r5)     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4c org.json.JSONException -> L4e
                r2 = r4
            L7a:
                r3.disconnect()
                x6.G r0 = x6.C18101G.this
                r0.a(r2)
                return
            L83:
                r0 = move-exception
                r3 = r2
                goto Ld3
            L86:
                r4 = move-exception
                r3 = r2
                goto L8c
            L89:
                r4 = move-exception
                r3 = r2
                goto Lb1
            L8c:
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L49
                java.lang.String r6 = "Exception:"
                r5.<init>(r6)     // Catch: java.lang.Throwable -> L49
                java.lang.String r6 = r4.toString()     // Catch: java.lang.Throwable -> L49
                r5.append(r6)     // Catch: java.lang.Throwable -> L49
                java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L49
                java.lang.Throwable[] r1 = new java.lang.Throwable[r1]     // Catch: java.lang.Throwable -> L49
                x6.r.e(r0, r5, r1)     // Catch: java.lang.Throwable -> L49
                r4.printStackTrace()     // Catch: java.lang.Throwable -> L49
                if (r3 == 0) goto Lab
                r3.disconnect()
            Lab:
                x6.G r0 = x6.C18101G.this
                r0.a(r2)
                return
            Lb1:
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L49
                java.lang.String r6 = "JSONException:"
                r5.<init>(r6)     // Catch: java.lang.Throwable -> L49
                java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L49
                r5.append(r4)     // Catch: java.lang.Throwable -> L49
                java.lang.String r4 = r5.toString()     // Catch: java.lang.Throwable -> L49
                java.lang.Throwable[] r1 = new java.lang.Throwable[r1]     // Catch: java.lang.Throwable -> L49
                x6.r.e(r0, r4, r1)     // Catch: java.lang.Throwable -> L49
                if (r3 == 0) goto Lcd
                r3.disconnect()
            Lcd:
                x6.G r0 = x6.C18101G.this
                r0.a(r2)
                return
            Ld3:
                if (r3 == 0) goto Ld8
                r3.disconnect()
            Ld8:
                x6.G r1 = x6.C18101G.this
                r1.a(r2)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: x6.C18101G.a.run():void");
        }
    }

    /* renamed from: x6.G$b */
    final class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ JSONObject f170452a;

        b(JSONObject jSONObject) {
            this.f170452a = jSONObject;
        }

        @Override // java.lang.Runnable
        public final void run() {
            JSONObject jSONObject = this.f170452a;
            if (jSONObject != null) {
                C18101G.this.f170447a.a(jSONObject);
            } else {
                C18101G.this.f170447a.a();
            }
        }
    }

    final void a(JSONObject jSONObject) {
        this.f170449c.post(new b(jSONObject));
    }

    C18101G(C18124t.a aVar) {
        this.f170447a = aVar;
    }
}
