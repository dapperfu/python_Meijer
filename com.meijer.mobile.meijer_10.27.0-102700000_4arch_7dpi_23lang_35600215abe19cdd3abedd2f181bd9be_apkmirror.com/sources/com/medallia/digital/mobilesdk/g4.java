package com.medallia.digital.mobilesdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes7.dex */
class g4 extends d0 {

    /* renamed from: a, reason: collision with root package name */
    private u8 f92092a;

    /* renamed from: b, reason: collision with root package name */
    private final BroadcastReceiver f92093b = new a();

    class a extends BroadcastReceiver {

        /* renamed from: com.medallia.digital.mobilesdk.g4$a$a, reason: collision with other inner class name */
        class C1306a extends v4 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Intent f92095a;

            C1306a(Intent intent) {
                this.f92095a = intent;
            }

            @Override // com.medallia.digital.mobilesdk.v4
            public void a() {
                Intent intent = this.f92095a;
                if (intent == null || !"com.medallia.digital.mobilesdk.sync_userjourney_action".equals(intent.getAction()) || g4.this.f92092a == null) {
                    return;
                }
                g4.this.f92092a.a(this.f92095a.getStringExtra("com.medallia.digital.mobilesdk.extra_trigger"));
            }
        }

        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            w7.b().a().execute(new C1306a(intent));
        }
    }

    g4() {
    }

    @Override // com.medallia.digital.mobilesdk.d0
    protected Object b() {
        return this.f92092a;
    }

    @Override // com.medallia.digital.mobilesdk.d0
    protected BroadcastReceiver c() {
        return this.f92093b;
    }

    @Override // com.medallia.digital.mobilesdk.d0
    protected String a() {
        return "com.medallia.digital.mobilesdk.sync_userjourney_action";
    }

    @Override // com.medallia.digital.mobilesdk.d0
    protected void a(Object obj) {
        if (this.f92092a != null && obj == null) {
            e();
            this.f92092a = null;
        }
        if (obj instanceof u8) {
            this.f92092a = (u8) obj;
        }
        d();
    }
}
