package com.google.firebase;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C6535q;
import com.google.android.gms.common.internal.C6538u;
import com.google.android.gms.common.internal.r;

/* loaded from: classes7.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    private final String f88761a;

    /* renamed from: b, reason: collision with root package name */
    private final String f88762b;

    /* renamed from: c, reason: collision with root package name */
    private final String f88763c;

    /* renamed from: d, reason: collision with root package name */
    private final String f88764d;

    /* renamed from: e, reason: collision with root package name */
    private final String f88765e;

    /* renamed from: f, reason: collision with root package name */
    private final String f88766f;

    /* renamed from: g, reason: collision with root package name */
    private final String f88767g;

    public static m a(Context context) {
        C6538u c6538u = new C6538u(context);
        String strA = c6538u.a("google_app_id");
        if (TextUtils.isEmpty(strA)) {
            return null;
        }
        return new m(strA, c6538u.a("google_api_key"), c6538u.a("firebase_database_url"), c6538u.a("ga_trackingId"), c6538u.a("gcm_defaultSenderId"), c6538u.a("google_storage_bucket"), c6538u.a("project_id"));
    }

    public String b() {
        return this.f88761a;
    }

    public String c() {
        return this.f88762b;
    }

    public String d() {
        return this.f88765e;
    }

    public String e() {
        return this.f88767g;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return C6535q.a(this.f88762b, mVar.f88762b) && C6535q.a(this.f88761a, mVar.f88761a) && C6535q.a(this.f88763c, mVar.f88763c) && C6535q.a(this.f88764d, mVar.f88764d) && C6535q.a(this.f88765e, mVar.f88765e) && C6535q.a(this.f88766f, mVar.f88766f) && C6535q.a(this.f88767g, mVar.f88767g);
    }

    public int hashCode() {
        return C6535q.b(this.f88762b, this.f88761a, this.f88763c, this.f88764d, this.f88765e, this.f88766f, this.f88767g);
    }

    private m(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        r.q(!com.google.android.gms.common.util.r.a(str), "ApplicationId must be set.");
        this.f88762b = str;
        this.f88761a = str2;
        this.f88763c = str3;
        this.f88764d = str4;
        this.f88765e = str5;
        this.f88766f = str6;
        this.f88767g = str7;
    }

    public String toString() {
        return C6535q.c(this).a("applicationId", this.f88762b).a("apiKey", this.f88761a).a("databaseUrl", this.f88763c).a("gcmSenderId", this.f88765e).a("storageBucket", this.f88766f).a("projectId", this.f88767g).toString();
    }
}
