package com.medallia.digital.mobilesdk;

import android.app.Application;
import android.content.Context;
import android.content.MutableContextWrapper;

/* loaded from: classes7.dex */
class i4 implements m8 {

    /* renamed from: c, reason: collision with root package name */
    private static i4 f92234c;

    /* renamed from: a, reason: collision with root package name */
    private Application f92235a;

    /* renamed from: b, reason: collision with root package name */
    private MutableContextWrapper f92236b;

    i4() {
    }

    protected static i4 c() {
        if (f92234c == null) {
            f92234c = new i4();
        }
        return f92234c;
    }

    protected Application a() {
        return this.f92235a;
    }

    protected Context b() {
        Application application = this.f92235a;
        if (application != null) {
            return application.getApplicationContext();
        }
        return null;
    }

    @Override // com.medallia.digital.mobilesdk.m8
    public void clearAndDisconnect() {
        f92234c = null;
        this.f92236b = null;
        this.f92235a = null;
    }

    protected MutableContextWrapper d() {
        return this.f92236b;
    }

    protected static void a(Application application) {
        c().b(application);
    }

    private void b(Application application) {
        if (this.f92235a == null) {
            this.f92235a = application;
            this.f92236b = application == null ? null : new MutableContextWrapper(application.getApplicationContext());
        }
    }

    protected void a(Context context) {
        MutableContextWrapper mutableContextWrapper = this.f92236b;
        if (context == null) {
            Application application = this.f92235a;
            context = application != null ? application.getApplicationContext() : null;
        }
        mutableContextWrapper.setBaseContext(context);
    }
}
