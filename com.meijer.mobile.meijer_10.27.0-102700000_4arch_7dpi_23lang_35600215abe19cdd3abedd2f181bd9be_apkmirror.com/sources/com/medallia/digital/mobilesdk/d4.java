package com.medallia.digital.mobilesdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.medallia.digital.mobilesdk.Broadcasts;
import org.json.JSONException;

/* loaded from: classes7.dex */
class d4 extends d0 {

    /* renamed from: a, reason: collision with root package name */
    private MDFormListener f91781a;

    /* renamed from: b, reason: collision with root package name */
    private final BroadcastReceiver f91782b = new a();

    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String str;
            MDFormListener mDFormListener;
            MDFormListenerData mDFormListenerData;
            if (intent == null || !"com.medallia.digital.mobilesdk.form_action".equals(intent.getAction())) {
                return;
            }
            try {
                long longExtra = intent.getLongExtra("com.medallia.digital.mobilesdk.extra_timestamp", 0L);
                String stringExtra = intent.getStringExtra("com.medallia.digital.mobilesdk.extra_form_id");
                FormViewType formViewType = (FormViewType) intent.getSerializableExtra("com.medallia.digital.mobilesdk.extra_form_view_type");
                if (formViewType == null) {
                    formViewType = FormViewType.none;
                }
                FormTriggerType formTriggerType = (FormTriggerType) intent.getSerializableExtra("com.medallia.digital.mobilesdk.extra_form_trigger_type");
                long longExtra2 = intent.getLongExtra("com.medallia.digital.mobilesdk.extra_form_time_to_display", 0L);
                Broadcasts.d.a aVar = (Broadcasts.d.a) intent.getSerializableExtra("com.medallia.digital.mobilesdk.extra_option");
                String stringExtra2 = intent.getStringExtra("com.medallia.digital.mobilesdk.extra_form_url");
                String stringExtra3 = intent.getStringExtra("com.medallia.digital.mobilesdk.extra_form_locale_set");
                String stringExtra4 = intent.getStringExtra("com.medallia.digital.mobilesdk.extra_form_locale_display");
                boolean booleanExtra = intent.getBooleanExtra("com.medallia.digital.mobilesdk.extra_thank_you_prompt_button_display", false);
                boolean booleanExtra2 = intent.getBooleanExtra("com.medallia.digital.mobilesdk.extra_thank_you_prompt_image_display", false);
                MDAppearanceMode mDAppearanceMode = (MDAppearanceMode) intent.getSerializableExtra("com.medallia.digital.mobilesdk.extra_form_header_appearance_set");
                MDAppearanceMode mDAppearanceMode2 = (MDAppearanceMode) intent.getSerializableExtra("com.medallia.digital.mobilesdk.extra_form_header_appearance_display");
                if (d4.this.f91781a == null) {
                    str = stringExtra3;
                } else {
                    if (aVar == Broadcasts.d.a.codeFormReady) {
                        d4.this.f91781a.onCodeFormReady(new MDFormListenerData(longExtra, stringExtra, formTriggerType));
                    } else if (aVar == Broadcasts.d.a.formSubmitted) {
                        d4.this.f91781a.onFormSubmitted(new MDFormListenerData(longExtra, stringExtra, formTriggerType));
                    } else if (aVar == Broadcasts.d.a.formDismissed) {
                        d4.this.f91781a.onFormDismissed(new MDFormListenerData(longExtra, stringExtra, formTriggerType));
                    } else if (aVar == Broadcasts.d.a.formClosed) {
                        d4.this.f91781a.onFormClosed(new MDFormListenerData(longExtra, stringExtra, formTriggerType));
                    } else if (aVar == Broadcasts.d.a.formDisplayed) {
                        MDFormListener mDFormListener2 = d4.this.f91781a;
                        MDFormListenerData mDFormListenerData2 = new MDFormListenerData(longExtra, stringExtra, formTriggerType, stringExtra3, stringExtra4, mDAppearanceMode, mDAppearanceMode2);
                        stringExtra4 = stringExtra4;
                        mDAppearanceMode = mDAppearanceMode;
                        str = stringExtra3;
                        mDFormListener2.onFormDisplayed(mDFormListenerData2);
                    } else {
                        str = stringExtra3;
                        if (aVar == Broadcasts.d.a.formBlockedUrl) {
                            mDFormListener = d4.this.f91781a;
                            mDFormListenerData = new MDFormListenerData(longExtra, stringExtra, formTriggerType, stringExtra2, true);
                        } else if (aVar == Broadcasts.d.a.formLinkSelected) {
                            mDFormListener = d4.this.f91781a;
                            mDFormListenerData = new MDFormListenerData(longExtra, stringExtra, formTriggerType, stringExtra2, false);
                        } else if (aVar == Broadcasts.d.a.formThankYouPrompt) {
                            MDFormListener mDFormListener3 = d4.this.f91781a;
                            MDFormListenerData mDFormListenerData3 = new MDFormListenerData(longExtra, stringExtra, formTriggerType, mDAppearanceMode, mDAppearanceMode2);
                            mDAppearanceMode = mDAppearanceMode;
                            mDFormListener3.onFormThankYouPrompt(mDFormListenerData3);
                        }
                        mDFormListener.onFormLinkSelected(mDFormListenerData);
                    }
                    str = stringExtra3;
                }
                d4.this.a(aVar, stringExtra, formTriggerType, formViewType, longExtra, longExtra2, str, stringExtra4, booleanExtra, booleanExtra2, mDAppearanceMode);
            } catch (Exception e10) {
                a4.c(e10.getMessage());
            }
        }
    }

    class b extends v4 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Broadcasts.d.a f91784a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f91785b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ FormTriggerType f91786c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ FormViewType f91787d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f91788e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f91789f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f91790g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f91791h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ MDAppearanceMode f91792i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ boolean f91793j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ boolean f91794k;

        b(Broadcasts.d.a aVar, String str, FormTriggerType formTriggerType, FormViewType formViewType, long j10, long j11, String str2, String str3, MDAppearanceMode mDAppearanceMode, boolean z10, boolean z11) {
            this.f91784a = aVar;
            this.f91785b = str;
            this.f91786c = formTriggerType;
            this.f91787d = formViewType;
            this.f91788e = j10;
            this.f91789f = j11;
            this.f91790g = str2;
            this.f91791h = str3;
            this.f91792i = mDAppearanceMode;
            this.f91793j = z10;
            this.f91794k = z11;
        }

        @Override // com.medallia.digital.mobilesdk.v4
        public void a() throws JSONException {
            Broadcasts.d.a aVar = this.f91784a;
            if (aVar == Broadcasts.d.a.codeFormReady) {
                AnalyticsBridge.getInstance().reportCodeFormReadyEvent(this.f91785b, this.f91786c, this.f91787d);
            } else if (aVar == Broadcasts.d.a.formSubmitted) {
                AnalyticsBridge.getInstance().reportFormSubmittedEvent(this.f91785b, this.f91786c, this.f91788e, this.f91787d);
            } else if (aVar == Broadcasts.d.a.formDismissed) {
                AnalyticsBridge.getInstance().reportFormDismissedEvent(this.f91785b, this.f91786c, this.f91787d);
            } else if (aVar == Broadcasts.d.a.formClosed) {
                AnalyticsBridge.getInstance().reportFormClosedEvent(this.f91785b, this.f91786c, this.f91787d);
            } else if (aVar == Broadcasts.d.a.formDisplayed) {
                AnalyticsBridge.getInstance().reportFormDisplayedEvent(this.f91785b, this.f91786c, this.f91787d, this.f91789f, this.f91790g, this.f91791h, this.f91792i);
                Broadcasts.h.a(Broadcasts.h.a.formDisplayed);
            } else if (aVar == Broadcasts.d.a.formThankYouPrompt) {
                AnalyticsBridge.getInstance().reportFormThankYouPromptEvent(this.f91785b, this.f91786c, this.f91787d, this.f91793j, this.f91794k, this.f91792i);
            }
            if (d4.this.f91781a != null) {
                AnalyticsBridge.getInstance().reportSetFormCallbackEvent(this.f91784a.name(), this.f91785b, this.f91786c);
            }
        }
    }

    d4() {
    }

    @Override // com.medallia.digital.mobilesdk.d0
    protected Object b() {
        return this.f91781a;
    }

    @Override // com.medallia.digital.mobilesdk.d0
    protected BroadcastReceiver c() {
        return this.f91782b;
    }

    @Override // com.medallia.digital.mobilesdk.d0
    protected String a() {
        return "com.medallia.digital.mobilesdk.form_action";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Broadcasts.d.a aVar, String str, FormTriggerType formTriggerType, FormViewType formViewType, long j10, long j11, String str2, String str3, boolean z10, boolean z11, MDAppearanceMode mDAppearanceMode) {
        w7.b().a().execute(new b(aVar, str, formTriggerType, formViewType, j10, j11, str2, str3, mDAppearanceMode, z10, z11));
    }

    @Override // com.medallia.digital.mobilesdk.d0
    protected void a(Object obj) {
        if (this.f91781a != null && obj == null) {
            e();
            this.f91781a = null;
        }
        if (obj instanceof MDFormListener) {
            this.f91781a = (MDFormListener) obj;
        }
        d();
    }
}
