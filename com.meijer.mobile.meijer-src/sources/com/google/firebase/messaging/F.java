package com.google.firebase.messaging;

import Vd.AbstractC5516j;
import Vd.C5519m;
import Vd.InterfaceC5509c;
import android.os.Bundle;
import android.util.Base64;
import com.fullstory.FS;
import hd.C14504a;
import hd.C14506c;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;

/* loaded from: classes8.dex */
class F {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.firebase.f f89616a;

    /* renamed from: b, reason: collision with root package name */
    private final K f89617b;

    /* renamed from: c, reason: collision with root package name */
    private final C14506c f89618c;

    /* renamed from: d, reason: collision with root package name */
    private final Kf.b<eg.i> f89619d;

    /* renamed from: e, reason: collision with root package name */
    private final Kf.b<If.j> f89620e;

    /* renamed from: f, reason: collision with root package name */
    private final Lf.e f89621f;

    F(com.google.firebase.f fVar, K k10, Kf.b<eg.i> bVar, Kf.b<If.j> bVar2, Lf.e eVar) {
        this(fVar, k10, new C14506c(fVar.k()), bVar, bVar2, eVar);
    }

    private static String b(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    private AbstractC5516j<String> c(AbstractC5516j<Bundle> abstractC5516j) {
        return abstractC5516j.j(new androidx.privacysandbox.ads.adservices.measurement.k(), new InterfaceC5509c() { // from class: com.google.firebase.messaging.E
            @Override // Vd.InterfaceC5509c
            public final Object then(AbstractC5516j abstractC5516j2) {
                return F.a(this.f89615a, abstractC5516j2);
            }
        });
    }

    private String d() {
        try {
            return b(MessageDigest.getInstance("SHA-1").digest(this.f89616a.m().getBytes()));
        } catch (NoSuchAlgorithmException unused) {
            return "[HASH-ERROR]";
        }
    }

    private String g(Bundle bundle) throws IOException {
        if (bundle == null) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        String string = bundle.getString("registration_id");
        if (string != null) {
            return string;
        }
        String string2 = bundle.getString("unregistered");
        if (string2 != null) {
            return string2;
        }
        String string3 = bundle.getString("error");
        if ("RST".equals(string3)) {
            throw new IOException("INSTANCE_ID_RESET");
        }
        if (string3 != null) {
            throw new IOException(string3);
        }
        FS.log_w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }

    static boolean h(String str) {
        return "SERVICE_NOT_AVAILABLE".equals(str) || "INTERNAL_SERVER_ERROR".equals(str) || "InternalServerError".equals(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00c0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void i(java.lang.String r3, java.lang.String r4, android.os.Bundle r5) throws java.util.concurrent.ExecutionException, java.lang.InterruptedException {
        /*
            r2 = this;
            java.lang.String r0 = "FirebaseMessaging"
            java.lang.String r1 = "scope"
            r5.putString(r1, r4)
            java.lang.String r4 = "sender"
            r5.putString(r4, r3)
            java.lang.String r4 = "subtype"
            r5.putString(r4, r3)
            com.google.firebase.f r3 = r2.f89616a
            com.google.firebase.m r3 = r3.n()
            java.lang.String r3 = r3.c()
            java.lang.String r4 = "gmp_app_id"
            r5.putString(r4, r3)
            com.google.firebase.messaging.K r3 = r2.f89617b
            int r3 = r3.d()
            java.lang.String r3 = java.lang.Integer.toString(r3)
            java.lang.String r4 = "gmsv"
            r5.putString(r4, r3)
            int r3 = android.os.Build.VERSION.SDK_INT
            java.lang.String r3 = java.lang.Integer.toString(r3)
            java.lang.String r4 = "osv"
            r5.putString(r4, r3)
            com.google.firebase.messaging.K r3 = r2.f89617b
            java.lang.String r3 = r3.a()
            java.lang.String r4 = "app_ver"
            r5.putString(r4, r3)
            com.google.firebase.messaging.K r3 = r2.f89617b
            java.lang.String r3 = r3.b()
            java.lang.String r4 = "app_ver_name"
            r5.putString(r4, r3)
            java.lang.String r3 = "firebase-app-name-hash"
            java.lang.String r4 = r2.d()
            r5.putString(r3, r4)
            Lf.e r3 = r2.f89621f     // Catch: java.lang.InterruptedException -> L76 java.util.concurrent.ExecutionException -> L78
            r4 = 0
            Vd.j r3 = r3.a(r4)     // Catch: java.lang.InterruptedException -> L76 java.util.concurrent.ExecutionException -> L78
            java.lang.Object r3 = Vd.C5519m.a(r3)     // Catch: java.lang.InterruptedException -> L76 java.util.concurrent.ExecutionException -> L78
            com.google.firebase.installations.f r3 = (com.google.firebase.installations.f) r3     // Catch: java.lang.InterruptedException -> L76 java.util.concurrent.ExecutionException -> L78
            java.lang.String r3 = r3.b()     // Catch: java.lang.InterruptedException -> L76 java.util.concurrent.ExecutionException -> L78
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.InterruptedException -> L76 java.util.concurrent.ExecutionException -> L78
            if (r4 != 0) goto L7a
            java.lang.String r4 = "Goog-Firebase-Installations-Auth"
            r5.putString(r4, r3)     // Catch: java.lang.InterruptedException -> L76 java.util.concurrent.ExecutionException -> L78
            goto L85
        L76:
            r3 = move-exception
            goto L80
        L78:
            r3 = move-exception
            goto L80
        L7a:
            java.lang.String r3 = "FIS auth token is empty"
            com.fullstory.FS.log_w(r0, r3)     // Catch: java.lang.InterruptedException -> L76 java.util.concurrent.ExecutionException -> L78
            goto L85
        L80:
            java.lang.String r4 = "Failed to get FIS auth token"
            com.fullstory.FS.log_e(r0, r4, r3)
        L85:
            Lf.e r3 = r2.f89621f
            Vd.j r3 = r3.getId()
            java.lang.Object r3 = Vd.C5519m.a(r3)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = "appid"
            r5.putString(r4, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "fcm-"
            r3.append(r4)
            java.lang.String r4 = "25.0.0"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "cliv"
            r5.putString(r4, r3)
            Kf.b<If.j> r3 = r2.f89620e
            java.lang.Object r3 = r3.get()
            If.j r3 = (If.j) r3
            Kf.b<eg.i> r4 = r2.f89619d
            java.lang.Object r4 = r4.get()
            eg.i r4 = (eg.i) r4
            if (r3 == 0) goto Le2
            if (r4 == 0) goto Le2
            java.lang.String r0 = "fire-iid"
            If.j$a r3 = r3.b(r0)
            If.j$a r0 = If.j.a.NONE
            if (r3 == r0) goto Le2
            int r3 = r3.b()
            java.lang.String r3 = java.lang.Integer.toString(r3)
            java.lang.String r0 = "Firebase-Client-Log-Type"
            r5.putString(r0, r3)
            java.lang.String r3 = "Firebase-Client"
            java.lang.String r4 = r4.a()
            r5.putString(r3, r4)
        Le2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.F.i(java.lang.String, java.lang.String, android.os.Bundle):void");
    }

    AbstractC5516j<C14504a> e() {
        return this.f89618c.a();
    }

    AbstractC5516j<String> f() {
        return c(k(K.c(this.f89616a), "*", new Bundle()));
    }

    AbstractC5516j<Void> j(boolean z10) {
        return this.f89618c.d(z10);
    }

    AbstractC5516j<?> l(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str2);
        return c(k(str, "/topics/" + str2, bundle));
    }

    AbstractC5516j<?> m(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str2);
        bundle.putString("delete", "1");
        return c(k(str, "/topics/" + str2, bundle));
    }

    public static /* synthetic */ String a(F f10, AbstractC5516j abstractC5516j) {
        f10.getClass();
        return f10.g((Bundle) abstractC5516j.o(IOException.class));
    }

    private AbstractC5516j<Bundle> k(String str, String str2, Bundle bundle) {
        try {
            i(str, str2, bundle);
            return this.f89618c.c(bundle);
        } catch (InterruptedException | ExecutionException e10) {
            return C5519m.e(e10);
        }
    }

    F(com.google.firebase.f fVar, K k10, C14506c c14506c, Kf.b<eg.i> bVar, Kf.b<If.j> bVar2, Lf.e eVar) {
        this.f89616a = fVar;
        this.f89617b = k10;
        this.f89618c = c14506c;
        this.f89619d = bVar;
        this.f89620e = bVar2;
        this.f89621f = eVar;
    }
}
