package com.medallia.digital.mobilesdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes7.dex */
class z3 extends d0 {

    /* renamed from: a, reason: collision with root package name */
    private MDCallback f93651a;

    /* renamed from: b, reason: collision with root package name */
    private final BroadcastReceiver f93652b = new a();

    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || !"com.medallia.digital.mobilesdk.localization_action".equals(intent.getAction()) || z3.this.f93651a == null) {
                return;
            }
            MDExternalError mDExternalError = (MDExternalError) intent.getSerializableExtra("com.medallia.digital.mobilesdk.extra_error");
            String stringExtra = intent.getStringExtra("com.medallia.digital.mobilesdk.extra_success");
            if (mDExternalError != null) {
                z3.this.f93651a.onError(mDExternalError);
            } else {
                z3.this.f93651a.onSuccess(stringExtra);
            }
        }
    }

    z3() {
    }

    @Override // com.medallia.digital.mobilesdk.d0
    protected Object b() {
        return this.f93651a;
    }

    @Override // com.medallia.digital.mobilesdk.d0
    protected BroadcastReceiver c() {
        return this.f93652b;
    }

    @Override // com.medallia.digital.mobilesdk.d0
    protected String a() {
        return "com.medallia.digital.mobilesdk.localization_action";
    }

    @Override // com.medallia.digital.mobilesdk.d0
    protected void a(Object obj) {
        if (this.f93651a != null && obj == null) {
            e();
            this.f93651a = null;
        }
        if (obj instanceof MDCallback) {
            this.f93651a = (MDCallback) obj;
        }
    }
}
