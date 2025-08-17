package com.medallia.digital.mobilesdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.medallia.digital.mobilesdk.Broadcasts;

/* loaded from: classes7.dex */
class c4 extends d0 {

    /* renamed from: a, reason: collision with root package name */
    private MDFeedbackListener f91696a;

    /* renamed from: b, reason: collision with root package name */
    private final BroadcastReceiver f91697b = new a();

    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || !"com.medallia.digital.mobilesdk.feedback_action".equals(intent.getAction())) {
                return;
            }
            try {
                long longExtra = intent.getLongExtra("com.medallia.digital.mobilesdk.extra_timestamp", 0L);
                String stringExtra = intent.getStringExtra("com.medallia.digital.mobilesdk.extra_form_id");
                FormTriggerType formTriggerType = (FormTriggerType) intent.getSerializableExtra("com.medallia.digital.mobilesdk.extra_form_trigger_type");
                Broadcasts.d.a aVar = (Broadcasts.d.a) intent.getSerializableExtra("com.medallia.digital.mobilesdk.extra_option");
                String stringExtra2 = intent.getStringExtra("com.medallia.digital.mobilesdk.extra_feedback_payload");
                String stringExtra3 = intent.getStringExtra("com.medallia.digital.mobilesdk.extra_feedback_id");
                if (aVar == Broadcasts.d.a.feedbackPayload && c4.this.f91696a != null) {
                    c4.this.f91696a.onFeedbackSubmitted(new MDFeedbackListenerData(stringExtra3, longExtra, stringExtra2, stringExtra));
                }
                if (c4.this.f91696a != null) {
                    AnalyticsBridge.getInstance().reportSetFeedbackCallbackEvent(aVar != null ? aVar.name() : null, stringExtra, formTriggerType, stringExtra3);
                }
            } catch (Exception e10) {
                a4.c(e10.getMessage());
            }
        }
    }

    c4() {
    }

    @Override // com.medallia.digital.mobilesdk.d0
    protected Object b() {
        return this.f91696a;
    }

    @Override // com.medallia.digital.mobilesdk.d0
    protected BroadcastReceiver c() {
        return this.f91697b;
    }

    @Override // com.medallia.digital.mobilesdk.d0
    protected String a() {
        return "com.medallia.digital.mobilesdk.feedback_action";
    }

    @Override // com.medallia.digital.mobilesdk.d0
    protected void a(Object obj) {
        if (this.f91696a != null && obj == null) {
            e();
            this.f91696a = null;
        }
        if (obj instanceof MDFeedbackListener) {
            this.f91696a = (MDFeedbackListener) obj;
        }
    }
}
