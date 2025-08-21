package com.medallia.digital.mobilesdk;

import android.app.Application;
import android.content.Context;
import android.content.MutableContextWrapper;

/* loaded from: classes8.dex */
class i4 implements m8 {

    /* renamed from: c, reason: collision with root package name */
    private static i4 f93073c;

    /* renamed from: a, reason: collision with root package name */
    private Application f93074a;

    /* renamed from: b, reason: collision with root package name */
    private MutableContextWrapper f93075b;

    i4() {
    }

    protected static i4 c() {
        if (f93073c == null) {
            f93073c = new i4();
        }
        return f93073c;
    }

    protected Application a() {
        return this.f93074a;
    }

    protected Context b() {
        Application application = this.f93074a;
        if (application != null) {
            return application.getApplicationContext();
        }
        return null;
    }

    @Override // com.medallia.digital.mobilesdk.m8
    public void clearAndDisconnect() {
        f93073c = null;
        this.f93075b = null;
        this.f93074a = null;
    }

    protected MutableContextWrapper d() {
        return this.f93075b;
    }

    protected static void a(Application application) {
        c().b(application);
    }

    private void b(Application application) {
        if (this.f93074a == null) {
            this.f93074a = application;
            this.f93075b = application == null ? null : new MutableContextWrapper(application.getApplicationContext());
        }
    }

    protected void a(Context context) {
        MutableContextWrapper mutableContextWrapper = this.f93075b;
        if (context == null) {
            Application application = this.f93074a;
            context = application != null ? application.getApplicationContext() : null;
        }
        mutableContextWrapper.setBaseContext(context);
    }
}
