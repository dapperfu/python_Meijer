package com.google.firebase.messaging;

import Td.AbstractC5232j;
import Td.C5235m;
import Td.InterfaceC5225c;
import android.os.Bundle;
import android.util.Base64;
import com.fullstory.FS;
import fd.C13874a;
import fd.C13876c;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;

/* loaded from: classes7.dex */
class D {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.firebase.f f88771a;

    /* renamed from: b, reason: collision with root package name */
    private final I f88772b;

    /* renamed from: c, reason: collision with root package name */
    private final C13876c f88773c;

    /* renamed from: d, reason: collision with root package name */
    private final If.b<cg.i> f88774d;

    /* renamed from: e, reason: collision with root package name */
    private final If.b<Gf.j> f88775e;

    /* renamed from: f, reason: collision with root package name */
    private final Jf.e f88776f;

    D(com.google.firebase.f fVar, I i10, If.b<cg.i> bVar, If.b<Gf.j> bVar2, Jf.e eVar) {
        this(fVar, i10, new C13876c(fVar.k()), bVar, bVar2, eVar);
    }

    private static String b(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    private AbstractC5232j<String> c(AbstractC5232j<Bundle> abstractC5232j) {
        return abstractC5232j.j(new androidx.privacysandbox.ads.adservices.measurement.k(), new InterfaceC5225c() { // from class: com.google.firebase.messaging.C
            @Override // Td.InterfaceC5225c
            public final Object then(AbstractC5232j abstractC5232j2) {
                return D.a(this.f88770a, abstractC5232j2);
            }
        });
    }

    private String d() {
        try {
            return b(MessageDigest.getInstance("SHA-1").digest(this.f88771a.m().getBytes()));
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
            com.google.firebase.f r3 = r2.f88771a
            com.google.firebase.m r3 = r3.n()
            java.lang.String r3 = r3.c()
            java.lang.String r4 = "gmp_app_id"
            r5.putString(r4, r3)
            com.google.firebase.messaging.I r3 = r2.f88772b
            int r3 = r3.d()
            java.lang.String r3 = java.lang.Integer.toString(r3)
            java.lang.String r4 = "gmsv"
            r5.putString(r4, r3)
            int r3 = android.os.Build.VERSION.SDK_INT
            java.lang.String r3 = java.lang.Integer.toString(r3)
            java.lang.String r4 = "osv"
            r5.putString(r4, r3)
            com.google.firebase.messaging.I r3 = r2.f88772b
            java.lang.String r3 = r3.a()
            java.lang.String r4 = "app_ver"
            r5.putString(r4, r3)
            com.google.firebase.messaging.I r3 = r2.f88772b
            java.lang.String r3 = r3.b()
            java.lang.String r4 = "app_ver_name"
            r5.putString(r4, r3)
            java.lang.String r3 = "firebase-app-name-hash"
            java.lang.String r4 = r2.d()
            r5.putString(r3, r4)
            Jf.e r3 = r2.f88776f     // Catch: java.lang.InterruptedException -> L76 java.util.concurrent.ExecutionException -> L78
            r4 = 0
            Td.j r3 = r3.a(r4)     // Catch: java.lang.InterruptedException -> L76 java.util.concurrent.ExecutionException -> L78
            java.lang.Object r3 = Td.C5235m.a(r3)     // Catch: java.lang.InterruptedException -> L76 java.util.concurrent.ExecutionException -> L78
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
            Jf.e r3 = r2.f88776f
            Td.j r3 = r3.getId()
            java.lang.Object r3 = Td.C5235m.a(r3)
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
            If.b<Gf.j> r3 = r2.f88775e
            java.lang.Object r3 = r3.get()
            Gf.j r3 = (Gf.j) r3
            If.b<cg.i> r4 = r2.f88774d
            java.lang.Object r4 = r4.get()
            cg.i r4 = (cg.i) r4
            if (r3 == 0) goto Le2
            if (r4 == 0) goto Le2
            java.lang.String r0 = "fire-iid"
            Gf.j$a r3 = r3.b(r0)
            Gf.j$a r0 = Gf.j.a.NONE
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.D.i(java.lang.String, java.lang.String, android.os.Bundle):void");
    }

    AbstractC5232j<C13874a> e() {
        return this.f88773c.a();
    }

    AbstractC5232j<String> f() {
        return c(k(I.c(this.f88771a), "*", new Bundle()));
    }

    AbstractC5232j<Void> j(boolean z10) {
        return this.f88773c.d(z10);
    }

    AbstractC5232j<?> l(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str2);
        return c(k(str, "/topics/" + str2, bundle));
    }

    AbstractC5232j<?> m(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str2);
        bundle.putString("delete", "1");
        return c(k(str, "/topics/" + str2, bundle));
    }

    public static /* synthetic */ String a(D d10, AbstractC5232j abstractC5232j) {
        d10.getClass();
        return d10.g((Bundle) abstractC5232j.o(IOException.class));
    }

    private AbstractC5232j<Bundle> k(String str, String str2, Bundle bundle) {
        try {
            i(str, str2, bundle);
            return this.f88773c.c(bundle);
        } catch (InterruptedException | ExecutionException e10) {
            return C5235m.e(e10);
        }
    }

    D(com.google.firebase.f fVar, I i10, C13876c c13876c, If.b<cg.i> bVar, If.b<Gf.j> bVar2, Jf.e eVar) {
        this.f88771a = fVar;
        this.f88772b = i10;
        this.f88773c = c13876c;
        this.f88774d = bVar;
        this.f88775e = bVar2;
        this.f88776f = eVar;
    }
}
