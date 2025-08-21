package com.medallia.digital.mobilesdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.medallia.digital.mobilesdk.Broadcasts;
import org.json.JSONException;

/* loaded from: classes8.dex */
class f4 extends d0 {

    /* renamed from: a, reason: collision with root package name */
    private MDTouchListener f92869a;

    /* renamed from: b, reason: collision with root package name */
    private final BroadcastReceiver f92870b = new a();

    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || !f4.this.a().equals(intent.getAction())) {
                return;
            }
            try {
                Broadcasts.j.a aVar = (Broadcasts.j.a) intent.getSerializableExtra("com.medallia.digital.mobilesdk.extra_touch_event_command");
                int intExtra = intent.getIntExtra("com.medallia.digital.mobilesdk.extra_motion_event_action", 0);
                if (f4.this.f92869a != null && Broadcasts.j.a.TouchEvent == aVar) {
                    f4.this.f92869a.onMDTouchEvent(new MDTouchListenerData(intExtra));
                    a4.e("MDTouchListener - onMDTouchEvent was fired");
                }
                f4.this.a(intExtra);
            } catch (Exception e10) {
                a4.c(e10.getMessage());
            }
        }
    }

    class b extends v4 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f92872a;

        b(int i10) {
            this.f92872a = i10;
        }

        @Override // com.medallia.digital.mobilesdk.v4
        public void a() throws JSONException {
            if (f4.this.f92869a != null) {
                a4.e("reportTouchEventCallbackEvent");
                AnalyticsBridge.getInstance().reportTouchEventCallbackEvent(this.f92872a);
            }
        }
    }

    f4() {
    }

    @Override // com.medallia.digital.mobilesdk.d0
    protected Object b() {
        return this.f92869a;
    }

    @Override // com.medallia.digital.mobilesdk.d0
    protected BroadcastReceiver c() {
        return this.f92870b;
    }

    @Override // com.medallia.digital.mobilesdk.d0
    protected String a() {
        return "com.medallia.digital.mobilesdk.touch_event_action";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10) {
        w7.b().a().execute(new b(i10));
    }

    @Override // com.medallia.digital.mobilesdk.d0
    protected void a(Object obj) {
        if (this.f92869a != null && obj == null) {
            e();
            this.f92869a = null;
        }
        if (obj instanceof MDTouchListener) {
            this.f92869a = (MDTouchListener) obj;
        }
        d();
    }
}
