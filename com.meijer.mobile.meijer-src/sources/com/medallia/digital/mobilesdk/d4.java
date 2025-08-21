package com.medallia.digital.mobilesdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.medallia.digital.mobilesdk.Broadcasts;
import org.json.JSONException;

/* loaded from: classes8.dex */
class d4 extends d0 {

    /* renamed from: a, reason: collision with root package name */
    private MDFormListener f92620a;

    /* renamed from: b, reason: collision with root package name */
    private final BroadcastReceiver f92621b = new a();

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
                if (d4.this.f92620a == null) {
                    str = stringExtra3;
                } else {
                    if (aVar == Broadcasts.d.a.codeFormReady) {
                        d4.this.f92620a.onCodeFormReady(new MDFormListenerData(longExtra, stringExtra, formTriggerType));
                    } else if (aVar == Broadcasts.d.a.formSubmitted) {
                        d4.this.f92620a.onFormSubmitted(new MDFormListenerData(longExtra, stringExtra, formTriggerType));
                    } else if (aVar == Broadcasts.d.a.formDismissed) {
                        d4.this.f92620a.onFormDismissed(new MDFormListenerData(longExtra, stringExtra, formTriggerType));
                    } else if (aVar == Broadcasts.d.a.formClosed) {
                        d4.this.f92620a.onFormClosed(new MDFormListenerData(longExtra, stringExtra, formTriggerType));
                    } else if (aVar == Broadcasts.d.a.formDisplayed) {
                        MDFormListener mDFormListener2 = d4.this.f92620a;
                        MDFormListenerData mDFormListenerData2 = new MDFormListenerData(longExtra, stringExtra, formTriggerType, stringExtra3, stringExtra4, mDAppearanceMode, mDAppearanceMode2);
                        stringExtra4 = stringExtra4;
                        mDAppearanceMode = mDAppearanceMode;
                        str = stringExtra3;
                        mDFormListener2.onFormDisplayed(mDFormListenerData2);
                    } else {
                        str = stringExtra3;
                        if (aVar == Broadcasts.d.a.formBlockedUrl) {
                            mDFormListener = d4.this.f92620a;
                            mDFormListenerData = new MDFormListenerData(longExtra, stringExtra, formTriggerType, stringExtra2, true);
                        } else if (aVar == Broadcasts.d.a.formLinkSelected) {
                            mDFormListener = d4.this.f92620a;
                            mDFormListenerData = new MDFormListenerData(longExtra, stringExtra, formTriggerType, stringExtra2, false);
                        } else if (aVar == Broadcasts.d.a.formThankYouPrompt) {
                            MDFormListener mDFormListener3 = d4.this.f92620a;
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
        final /* synthetic */ Broadcasts.d.a f92623a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f92624b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ FormTriggerType f92625c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ FormViewType f92626d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f92627e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f92628f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f92629g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f92630h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ MDAppearanceMode f92631i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ boolean f92632j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ boolean f92633k;

        b(Broadcasts.d.a aVar, String str, FormTriggerType formTriggerType, FormViewType formViewType, long j10, long j11, String str2, String str3, MDAppearanceMode mDAppearanceMode, boolean z10, boolean z11) {
            this.f92623a = aVar;
            this.f92624b = str;
            this.f92625c = formTriggerType;
            this.f92626d = formViewType;
            this.f92627e = j10;
            this.f92628f = j11;
            this.f92629g = str2;
            this.f92630h = str3;
            this.f92631i = mDAppearanceMode;
            this.f92632j = z10;
            this.f92633k = z11;
        }

        @Override // com.medallia.digital.mobilesdk.v4
        public void a() throws JSONException {
            Broadcasts.d.a aVar = this.f92623a;
            if (aVar == Broadcasts.d.a.codeFormReady) {
                AnalyticsBridge.getInstance().reportCodeFormReadyEvent(this.f92624b, this.f92625c, this.f92626d);
            } else if (aVar == Broadcasts.d.a.formSubmitted) {
                AnalyticsBridge.getInstance().reportFormSubmittedEvent(this.f92624b, this.f92625c, this.f92627e, this.f92626d);
            } else if (aVar == Broadcasts.d.a.formDismissed) {
                AnalyticsBridge.getInstance().reportFormDismissedEvent(this.f92624b, this.f92625c, this.f92626d);
            } else if (aVar == Broadcasts.d.a.formClosed) {
                AnalyticsBridge.getInstance().reportFormClosedEvent(this.f92624b, this.f92625c, this.f92626d);
            } else if (aVar == Broadcasts.d.a.formDisplayed) {
                AnalyticsBridge.getInstance().reportFormDisplayedEvent(this.f92624b, this.f92625c, this.f92626d, this.f92628f, this.f92629g, this.f92630h, this.f92631i);
                Broadcasts.h.a(Broadcasts.h.a.formDisplayed);
            } else if (aVar == Broadcasts.d.a.formThankYouPrompt) {
                AnalyticsBridge.getInstance().reportFormThankYouPromptEvent(this.f92624b, this.f92625c, this.f92626d, this.f92632j, this.f92633k, this.f92631i);
            }
            if (d4.this.f92620a != null) {
                AnalyticsBridge.getInstance().reportSetFormCallbackEvent(this.f92623a.name(), this.f92624b, this.f92625c);
            }
        }
    }

    d4() {
    }

    @Override // com.medallia.digital.mobilesdk.d0
    protected Object b() {
        return this.f92620a;
    }

    @Override // com.medallia.digital.mobilesdk.d0
    protected BroadcastReceiver c() {
        return this.f92621b;
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
        if (this.f92620a != null && obj == null) {
            e();
            this.f92620a = null;
        }
        if (obj instanceof MDFormListener) {
            this.f92620a = (MDFormListener) obj;
        }
        d();
    }
}
