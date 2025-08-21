package com.medallia.digital.mobilesdk;

import android.text.TextUtils;
import com.medallia.digital.mobilesdk.h4;

/* loaded from: classes8.dex */
class w2 implements m8 {

    /* renamed from: c, reason: collision with root package name */
    private static w2 f94048c;

    /* renamed from: a, reason: collision with root package name */
    private n f94049a;

    /* renamed from: b, reason: collision with root package name */
    private C11691b f94050b;

    w2() {
    }

    protected static w2 c() {
        if (f94048c == null) {
            f94048c = new w2();
        }
        return f94048c;
    }

    public C11691b a() {
        return this.f94050b;
    }

    protected n b() {
        return this.f94049a;
    }

    @Override // com.medallia.digital.mobilesdk.m8
    public void clearAndDisconnect() {
        this.f94049a = null;
        this.f94050b = null;
        f94048c = null;
    }

    protected h4.a a(String str) {
        if (TextUtils.isEmpty(str)) {
            this.f94050b = null;
            return h4.a.f93008t;
        }
        C11691b c11691bCreateAccessToken = ModelFactory.getInstance().createAccessToken(str);
        this.f94050b = c11691bCreateAccessToken;
        if (c11691bCreateAccessToken == null) {
            return h4.a.f93002n;
        }
        return null;
    }

    public void a(C11691b c11691b) {
        this.f94050b = c11691b;
    }

    protected void a(n nVar) {
        this.f94049a = nVar;
    }
}
