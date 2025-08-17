package w6;

import org.json.JSONObject;

/* renamed from: w6.t, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C17797t {

    /* renamed from: a, reason: collision with root package name */
    private static final C17797t f165948a = new C17797t();

    /* renamed from: w6.t$a */
    public interface a {
        void a();

        void a(JSONObject jSONObject);
    }

    public static C17797t a() {
        return f165948a;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(android.app.Application r3, java.lang.String r4, int r5, w6.C17797t.a r6) {
        /*
            w6.x r0 = new w6.x     // Catch: java.lang.Exception -> Lab
            r1 = 0
            r0.<init>(r3, r1)     // Catch: java.lang.Exception -> Lab
            android.net.Uri r3 = android.net.Uri.parse(r4)     // Catch: java.lang.Exception -> Lab
            android.net.Uri$Builder r3 = r3.buildUpon()     // Catch: java.lang.Exception -> Lab
            java.lang.String r4 = "_bm"
            r3.appendPath(r4)     // Catch: java.lang.Exception -> Lab
            java.lang.String r4 = "get_params"
            r3.appendPath(r4)     // Catch: java.lang.Exception -> Lab
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lab
            java.lang.String r2 = "type="
            r4.<init>(r2)     // Catch: java.lang.Exception -> Lab
            if (r5 == 0) goto L39
            r2 = 1
            if (r5 != r2) goto L27
            java.lang.String r5 = "sdk-cca"
            goto L3b
        L27:
            r2 = 2
            if (r5 != r2) goto L2d
            java.lang.String r5 = "sdk-dci"
            goto L3b
        L2d:
            r2 = 3
            if (r5 != r2) goto L33
            java.lang.String r5 = "sdk-pow,sdk-dci"
            goto L3b
        L33:
            r2 = 4
            if (r5 != r2) goto L39
            java.lang.String r5 = "sdk-cca,sdk-dci"
            goto L3b
        L39:
            java.lang.String r5 = "sdk-pow"
        L3b:
            r4.append(r5)     // Catch: java.lang.Exception -> Lab
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Exception -> Lab
            r3.encodedQuery(r4)     // Catch: java.lang.Exception -> Lab
            java.lang.String r4 = "starttime"
            java.lang.String r5 = r0.startTime()     // Catch: java.lang.Exception -> Lab
            r3.appendQueryParameter(r4, r5)     // Catch: java.lang.Exception -> Lab
            java.lang.String r4 = "systemVersion"
            java.lang.String r5 = r0.systemVersion()     // Catch: java.lang.Exception -> Lab
            r3.appendQueryParameter(r4, r5)     // Catch: java.lang.Exception -> Lab
            java.lang.String r4 = "model"
            java.lang.String r5 = r0.model()     // Catch: java.lang.Exception -> Lab
            r3.appendQueryParameter(r4, r5)     // Catch: java.lang.Exception -> Lab
            java.lang.String r4 = "deviceHardwareType"
            java.lang.String r5 = r0.hardWareType()     // Catch: java.lang.Exception -> Lab
            r3.appendQueryParameter(r4, r5)     // Catch: java.lang.Exception -> Lab
            java.lang.String r4 = "appIdentifier"
            java.lang.String r5 = r0.appIdentifier()     // Catch: java.lang.Exception -> Lab
            r3.appendQueryParameter(r4, r5)     // Catch: java.lang.Exception -> Lab
            java.lang.String r4 = "deviceId"
            java.lang.String r5 = r0.androidId()     // Catch: java.lang.Exception -> Lab
            r3.appendQueryParameter(r4, r5)     // Catch: java.lang.Exception -> Lab
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> Lab
            w6.G r4 = new w6.G     // Catch: java.lang.Exception -> Lab
            r4.<init>(r6)     // Catch: java.lang.Exception -> Lab
            java.net.URL r5 = new java.net.URL     // Catch: java.lang.Exception -> Lab
            r5.<init>(r3)     // Catch: java.lang.Exception -> Lab
            java.util.concurrent.ExecutorService r3 = r4.f165803b     // Catch: java.lang.Exception -> L94
            w6.G$a r0 = new w6.G$a     // Catch: java.lang.Exception -> L94
            r0.<init>(r5)     // Catch: java.lang.Exception -> L94
            r3.execute(r0)     // Catch: java.lang.Exception -> L94
            return
        L94:
            r3 = move-exception
            java.lang.String r5 = "CYFNetworkServiceTask"
            java.lang.String r0 = "Exception:"
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.Exception -> Lab
            java.lang.String r3 = r0.concat(r3)     // Catch: java.lang.Exception -> Lab
            r0 = 0
            java.lang.Throwable[] r0 = new java.lang.Throwable[r0]     // Catch: java.lang.Exception -> Lab
            w6.r.e(r5, r3, r0)     // Catch: java.lang.Exception -> Lab
            r4.a(r1)     // Catch: java.lang.Exception -> Lab
            return
        Lab:
            r6.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w6.C17797t.b(android.app.Application, java.lang.String, int, w6.t$a):void");
    }
}
