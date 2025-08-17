package com.medallia.digital.mobilesdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.medallia.digital.mobilesdk.Broadcasts;
import org.json.JSONException;

/* loaded from: classes7.dex */
class e4 extends d0 {

    /* renamed from: a, reason: collision with root package name */
    private MDInterceptListener f91888a;

    /* renamed from: b, reason: collision with root package name */
    private final BroadcastReceiver f91889b = new a();

    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || !e4.this.a().equals(intent.getAction())) {
                return;
            }
            try {
                String stringExtra = intent.getStringExtra("com.medallia.digital.mobilesdk.extra_id");
                long longExtra = intent.getLongExtra("com.medallia.digital.mobilesdk.extra_timestamp", 0L);
                e3 e3Var = (e3) intent.getSerializableExtra("com.medallia.digital.mobilesdk.extra_reason");
                String stringExtra2 = intent.getStringExtra("com.medallia.digital.mobilesdk.extra_invite_type");
                MDEngagementType mDEngagementType = (MDEngagementType) intent.getSerializableExtra("com.medallia.digital.mobilesdk.extra_engagement_type");
                MDAppearanceMode mDAppearanceMode = (MDAppearanceMode) intent.getSerializableExtra("com.medallia.digital.mobilesdk.extra_intercept_appearance_set");
                MDAppearanceMode mDAppearanceMode2 = (MDAppearanceMode) intent.getSerializableExtra("com.medallia.digital.mobilesdk.extra_intercept_appearance_display");
                Broadcasts.e.a aVar = (Broadcasts.e.a) intent.getSerializableExtra("com.medallia.digital.mobilesdk.extra_intercept_command");
                if (e4.this.f91888a != null) {
                    if (Broadcasts.e.a.interceptAccepted == aVar) {
                        e4.this.f91888a.onInterceptAccepted(new MDInterceptListenerData(longExtra, stringExtra, mDEngagementType));
                    } else if (Broadcasts.e.a.interceptDeclined == aVar) {
                        e4.this.f91888a.onInterceptDeclined(new MDInterceptListenerData(longExtra, stringExtra, mDEngagementType));
                    } else if (Broadcasts.e.a.interceptDeferred == aVar) {
                        MDInterceptListener mDInterceptListener = e4.this.f91888a;
                        MDInterceptListenerData mDInterceptListenerData = new MDInterceptListenerData(longExtra, stringExtra, e3Var != null ? e3Var.a() : null, mDEngagementType);
                        mDEngagementType = mDEngagementType;
                        mDInterceptListener.onInterceptDeferred(mDInterceptListenerData);
                    } else if (Broadcasts.e.a.interceptDisplayed == aVar) {
                        e4.this.f91888a.onInterceptDisplayed(new MDInterceptListenerData(longExtra, stringExtra, mDEngagementType, mDAppearanceMode, mDAppearanceMode2));
                    } else if (Broadcasts.e.a.interceptClosed == aVar) {
                        e4.this.f91888a.onInterceptClosed(new MDInterceptListenerData(longExtra, stringExtra, mDEngagementType));
                    } else if (Broadcasts.e.a.interceptTriggered == aVar) {
                        e4.this.f91888a.onInterceptTriggerInAppReview(new MDInterceptListenerData(longExtra, stringExtra));
                    }
                }
                e4.this.a(aVar, stringExtra, stringExtra2, mDEngagementType, e3Var);
            } catch (Exception e10) {
                a4.c(e10.getMessage());
            }
        }
    }

    class b extends v4 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Broadcasts.e.a f91891a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f91892b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f91893c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ MDEngagementType f91894d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ e3 f91895e;

        b(Broadcasts.e.a aVar, String str, String str2, MDEngagementType mDEngagementType, e3 e3Var) {
            this.f91891a = aVar;
            this.f91892b = str;
            this.f91893c = str2;
            this.f91894d = mDEngagementType;
            this.f91895e = e3Var;
        }

        @Override // com.medallia.digital.mobilesdk.v4
        public void a() throws JSONException {
            if (e4.this.f91888a != null) {
                AnalyticsBridge analyticsBridge = AnalyticsBridge.getInstance();
                String strName = this.f91891a.name();
                String str = this.f91892b;
                String str2 = this.f91893c;
                MDEngagementType mDEngagementType = this.f91894d;
                analyticsBridge.reportSetInterceptCallbackEvent(strName, str, str2, mDEngagementType != null ? mDEngagementType.toString() : null, this.f91895e);
            }
        }
    }

    e4() {
    }

    @Override // com.medallia.digital.mobilesdk.d0
    protected Object b() {
        return this.f91888a;
    }

    @Override // com.medallia.digital.mobilesdk.d0
    protected BroadcastReceiver c() {
        return this.f91889b;
    }

    @Override // com.medallia.digital.mobilesdk.d0
    protected String a() {
        return "com.medallia.digital.mobilesdk.intercept_action";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Broadcasts.e.a aVar, String str, String str2, MDEngagementType mDEngagementType, e3 e3Var) {
        w7.b().a().execute(new b(aVar, str, str2, mDEngagementType, e3Var));
    }

    @Override // com.medallia.digital.mobilesdk.d0
    protected void a(Object obj) {
        if (this.f91888a != null && obj == null) {
            e();
            this.f91888a = null;
        }
        if (obj instanceof MDInterceptListener) {
            this.f91888a = (MDInterceptListener) obj;
        }
        d();
    }
}
