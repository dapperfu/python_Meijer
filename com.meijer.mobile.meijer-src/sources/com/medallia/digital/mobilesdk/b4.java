package com.medallia.digital.mobilesdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.medallia.digital.mobilesdk.Broadcasts;
import org.json.JSONException;

/* loaded from: classes8.dex */
class b4 extends d0 {

    /* renamed from: a, reason: collision with root package name */
    private MDCustomInterceptListener f92487a;

    /* renamed from: b, reason: collision with root package name */
    private final BroadcastReceiver f92488b = new a();

    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || !b4.this.a().equals(intent.getAction())) {
                return;
            }
            try {
                Broadcasts.b.a aVar = (Broadcasts.b.a) intent.getSerializableExtra("com.medallia.digital.mobilesdk.extra_custom_intercept_command");
                long longExtra = intent.getLongExtra("com.medallia.digital.mobilesdk.extra_form_preload_timestamp", 0L);
                long longExtra2 = intent.getLongExtra("com.medallia.digital.mobilesdk.extra_target_evaluation_timestamp", 0L);
                String stringExtra = intent.getStringExtra("com.medallia.digital.mobilesdk.extra_engagement_id");
                MDEngagementType mDEngagementType = (MDEngagementType) intent.getSerializableExtra("com.medallia.digital.mobilesdk.extra_engagement_type");
                MDCustomInterceptPayload mDCustomInterceptPayload = (MDCustomInterceptPayload) intent.getSerializableExtra("com.medallia.digital.mobilesdk.extra_payload");
                if (b4.this.f92488b != null && Broadcasts.b.a.TargetEvaluationSuccess == aVar) {
                    b4.this.f92487a.onTargetEvaluationSuccess(new MDCustomInterceptListenerData(longExtra, longExtra2, stringExtra, mDEngagementType, mDCustomInterceptPayload));
                    a4.e("MDCustomInterceptListener - onTargetEvaluationSuccess was fired");
                }
                b4.this.a(stringExtra, mDEngagementType);
            } catch (Exception e10) {
                a4.c(e10.getMessage());
            }
        }
    }

    class b extends v4 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f92490a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ MDEngagementType f92491b;

        b(String str, MDEngagementType mDEngagementType) {
            this.f92490a = str;
            this.f92491b = mDEngagementType;
        }

        @Override // com.medallia.digital.mobilesdk.v4
        public void a() throws JSONException {
            if (b4.this.f92487a != null) {
                AnalyticsBridge.getInstance().reportSetCustomInterceptCallbackEvent(this.f92490a, this.f92491b.toString());
            }
        }
    }

    b4() {
    }

    @Override // com.medallia.digital.mobilesdk.d0
    protected BroadcastReceiver c() {
        return this.f92488b;
    }

    @Override // com.medallia.digital.mobilesdk.d0
    protected String a() {
        return "com.medallia.digital.mobilesdk.custom_intercept_action";
    }

    @Override // com.medallia.digital.mobilesdk.d0
    protected Object b() {
        return this.f92487a;
    }

    @Override // com.medallia.digital.mobilesdk.d0
    protected void a(Object obj) {
        if (this.f92487a != null && obj == null) {
            e();
            this.f92487a = null;
        }
        if (obj instanceof MDCustomInterceptListener) {
            this.f92487a = (MDCustomInterceptListener) obj;
        }
        d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, MDEngagementType mDEngagementType) {
        w7.b().a().execute(new b(str, mDEngagementType));
    }
}
