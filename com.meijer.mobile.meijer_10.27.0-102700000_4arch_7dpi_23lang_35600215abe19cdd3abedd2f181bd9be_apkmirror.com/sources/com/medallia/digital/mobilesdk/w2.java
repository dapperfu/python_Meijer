package com.medallia.digital.mobilesdk;

import android.text.TextUtils;
import com.medallia.digital.mobilesdk.h4;

/* loaded from: classes7.dex */
class w2 implements m8 {

    /* renamed from: c, reason: collision with root package name */
    private static w2 f93209c;

    /* renamed from: a, reason: collision with root package name */
    private n f93210a;

    /* renamed from: b, reason: collision with root package name */
    private C11566b f93211b;

    w2() {
    }

    protected static w2 c() {
        if (f93209c == null) {
            f93209c = new w2();
        }
        return f93209c;
    }

    public C11566b a() {
        return this.f93211b;
    }

    protected n b() {
        return this.f93210a;
    }

    @Override // com.medallia.digital.mobilesdk.m8
    public void clearAndDisconnect() {
        this.f93210a = null;
        this.f93211b = null;
        f93209c = null;
    }

    protected h4.a a(String str) {
        if (TextUtils.isEmpty(str)) {
            this.f93211b = null;
            return h4.a.f92169t;
        }
        C11566b c11566bCreateAccessToken = ModelFactory.getInstance().createAccessToken(str);
        this.f93211b = c11566bCreateAccessToken;
        if (c11566bCreateAccessToken == null) {
            return h4.a.f92163n;
        }
        return null;
    }

    public void a(C11566b c11566b) {
        this.f93211b = c11566b;
    }

    protected void a(n nVar) {
        this.f93210a = nVar;
    }
}
