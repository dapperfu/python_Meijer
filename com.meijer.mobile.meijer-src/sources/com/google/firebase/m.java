package com.google.firebase;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C6660q;
import com.google.android.gms.common.internal.C6663u;
import com.google.android.gms.common.internal.r;
import com.radiusnetworks.flybuy.sdk.manager.NotificationsManager;

/* loaded from: classes8.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    private final String f89601a;

    /* renamed from: b, reason: collision with root package name */
    private final String f89602b;

    /* renamed from: c, reason: collision with root package name */
    private final String f89603c;

    /* renamed from: d, reason: collision with root package name */
    private final String f89604d;

    /* renamed from: e, reason: collision with root package name */
    private final String f89605e;

    /* renamed from: f, reason: collision with root package name */
    private final String f89606f;

    /* renamed from: g, reason: collision with root package name */
    private final String f89607g;

    public static m a(Context context) {
        C6663u c6663u = new C6663u(context);
        String strA = c6663u.a("google_app_id");
        if (TextUtils.isEmpty(strA)) {
            return null;
        }
        return new m(strA, c6663u.a("google_api_key"), c6663u.a("firebase_database_url"), c6663u.a("ga_trackingId"), c6663u.a("gcm_defaultSenderId"), c6663u.a("google_storage_bucket"), c6663u.a(NotificationsManager.INTENT_EXTRA_PROJECT_ID));
    }

    public String b() {
        return this.f89601a;
    }

    public String c() {
        return this.f89602b;
    }

    public String d() {
        return this.f89605e;
    }

    public String e() {
        return this.f89607g;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return C6660q.a(this.f89602b, mVar.f89602b) && C6660q.a(this.f89601a, mVar.f89601a) && C6660q.a(this.f89603c, mVar.f89603c) && C6660q.a(this.f89604d, mVar.f89604d) && C6660q.a(this.f89605e, mVar.f89605e) && C6660q.a(this.f89606f, mVar.f89606f) && C6660q.a(this.f89607g, mVar.f89607g);
    }

    public int hashCode() {
        return C6660q.b(this.f89602b, this.f89601a, this.f89603c, this.f89604d, this.f89605e, this.f89606f, this.f89607g);
    }

    private m(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        r.q(!com.google.android.gms.common.util.r.a(str), "ApplicationId must be set.");
        this.f89602b = str;
        this.f89601a = str2;
        this.f89603c = str3;
        this.f89604d = str4;
        this.f89605e = str5;
        this.f89606f = str6;
        this.f89607g = str7;
    }

    public String toString() {
        return C6660q.c(this).a("applicationId", this.f89602b).a("apiKey", this.f89601a).a("databaseUrl", this.f89603c).a("gcmSenderId", this.f89605e).a("storageBucket", this.f89606f).a("projectId", this.f89607g).toString();
    }
}
