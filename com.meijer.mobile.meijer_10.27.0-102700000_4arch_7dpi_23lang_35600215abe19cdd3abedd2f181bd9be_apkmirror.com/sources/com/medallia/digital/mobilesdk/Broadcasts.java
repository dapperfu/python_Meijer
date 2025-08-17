package com.medallia.digital.mobilesdk;

import android.content.Intent;

/* loaded from: classes7.dex */
final class Broadcasts {
    protected static final String PROPERTY_ID_CHANGE = "com.medallia.digital.mobilesdk.PROPERTY_ID_CHANGE";
    protected static final String PROPERTY_ID_VALUE = "com.medallia.digital.mobilesdk.PROPERTY_ID_VALUE";

    protected static class a {

        /* renamed from: a, reason: collision with root package name */
        protected static final String f91415a = "com.medallia.digital.mobilesdk.MedalliaFullFormActivity";

        /* renamed from: b, reason: collision with root package name */
        protected static final String f91416b = "com.medallia.digital.mobilesdk.MedalliaModalFormActivity";

        /* renamed from: c, reason: collision with root package name */
        protected static final String f91417c = "com.medallia.digital.mobilesdk.form_data";

        /* renamed from: d, reason: collision with root package name */
        protected static final String f91418d = "com.medallia.digital.mobilesdk.is_show_form";

        /* renamed from: e, reason: collision with root package name */
        protected static final String f91419e = "com.medallia.digital.mobilesdk.is_form_available";

        /* renamed from: f, reason: collision with root package name */
        protected static final String f91420f = "com.medallia.digital.mobilesdk.spinner_delay";

        /* renamed from: g, reason: collision with root package name */
        protected static final String f91421g = "com.medallia.digital.mobilesdk.vuln_enabled";

        /* renamed from: h, reason: collision with root package name */
        protected static final String f91422h = "com.medallia.digital.mobilesdk.FinishInvitationActivity";

        /* renamed from: i, reason: collision with root package name */
        protected static final String f91423i = "com.medallia.digital.mobilesdk.show_invitation_start_time";

        /* renamed from: j, reason: collision with root package name */
        protected static final String f91424j = "com.medallia.digital.mobilesdk.inherit_orientation";

        /* renamed from: k, reason: collision with root package name */
        protected static final String f91425k = "com.medallia.digital.mobilesdk.remove_task";

        /* renamed from: l, reason: collision with root package name */
        protected static final String f91426l = "com.medallia.digital.mobilesdk.form_preview_data";

        /* renamed from: m, reason: collision with root package name */
        protected static final String f91427m = "com.medallia.digital.mobilesdk.form_is_preview_app";

        /* renamed from: n, reason: collision with root package name */
        protected static final String f91428n = "com.medallia.digital.mobilesdk.form_header_palette";

        /* renamed from: o, reason: collision with root package name */
        protected static final String f91429o = "com.medallia.digital.mobilesdk.user_media_capture_conf";

        protected a() {
        }
    }

    protected static class b {

        /* renamed from: a, reason: collision with root package name */
        protected static final String f91430a = "com.medallia.digital.mobilesdk.custom_intercept_action";

        /* renamed from: b, reason: collision with root package name */
        protected static final String f91431b = "com.medallia.digital.mobilesdk.extra_form_preload_timestamp";

        /* renamed from: c, reason: collision with root package name */
        protected static final String f91432c = "com.medallia.digital.mobilesdk.extra_engagement_id";

        /* renamed from: d, reason: collision with root package name */
        protected static final String f91433d = "com.medallia.digital.mobilesdk.extra_target_evaluation_timestamp";

        /* renamed from: e, reason: collision with root package name */
        protected static final String f91434e = "com.medallia.digital.mobilesdk.extra_custom_intercept_command";

        /* renamed from: f, reason: collision with root package name */
        protected static final String f91435f = "com.medallia.digital.mobilesdk.extra_engagement_type";

        /* renamed from: g, reason: collision with root package name */
        protected static final String f91436g = "com.medallia.digital.mobilesdk.extra_payload";

        protected enum a {
            TargetEvaluationSuccess
        }

        protected b() {
        }

        protected static void a(a aVar, String str, long j10, long j11, MDEngagementType mDEngagementType, MDCustomInterceptPayload mDCustomInterceptPayload) {
            Intent intent = new Intent(f91430a);
            intent.putExtra(f91434e, aVar);
            intent.putExtra(f91432c, str);
            intent.putExtra(f91431b, j10);
            intent.putExtra(f91433d, j11);
            intent.putExtra(f91435f, mDEngagementType);
            intent.putExtra(f91436g, mDCustomInterceptPayload);
            q4.a(i4.c().b()).a(intent);
        }
    }

    protected static class c {

        /* renamed from: a, reason: collision with root package name */
        protected static final String f91439a = "com.medallia.digital.mobilesdk.file_action";

        /* renamed from: b, reason: collision with root package name */
        protected static final String f91440b = "com.medallia.digital.mobilesdk.extra_file_path";

        /* renamed from: c, reason: collision with root package name */
        protected static final String f91441c = "com.medallia.digital.mobilesdk.extra_IS_DELETED";

        /* renamed from: d, reason: collision with root package name */
        protected static final String f91442d = "com.medallia.digital.mobilesdk.extra_files_command";

        protected enum a {
            fileDeleted
        }

        protected c() {
        }

        protected static void a(a aVar, String str, boolean z10) {
            Intent intent = new Intent(f91439a);
            intent.putExtra(f91442d, aVar);
            intent.putExtra(f91440b, str);
            intent.putExtra(f91441c, z10);
            q4.a(i4.c().b()).a(intent);
        }
    }

    protected static class d {

        /* renamed from: a, reason: collision with root package name */
        protected static final String f91445a = "com.medallia.digital.mobilesdk.form_action";

        /* renamed from: b, reason: collision with root package name */
        protected static final String f91446b = "com.medallia.digital.mobilesdk.feedback_action";

        /* renamed from: c, reason: collision with root package name */
        protected static final String f91447c = "com.medallia.digital.mobilesdk.invitation_action";

        /* renamed from: d, reason: collision with root package name */
        protected static final String f91448d = "com.medallia.digital.mobilesdk.feedback_preview_action";

        /* renamed from: e, reason: collision with root package name */
        protected static final String f91449e = "com.medallia.digital.mobilesdk.extra_option";

        /* renamed from: f, reason: collision with root package name */
        protected static final String f91450f = "com.medallia.digital.mobilesdk.extra_timestamp";

        /* renamed from: g, reason: collision with root package name */
        protected static final String f91451g = "com.medallia.digital.mobilesdk.extra_form_id";

        /* renamed from: h, reason: collision with root package name */
        protected static final String f91452h = "com.medallia.digital.mobilesdk.extra_form_view_type";

        /* renamed from: i, reason: collision with root package name */
        protected static final String f91453i = "com.medallia.digital.mobilesdk.extra_form_locale_set";

        /* renamed from: j, reason: collision with root package name */
        protected static final String f91454j = "com.medallia.digital.mobilesdk.extra_form_locale_display";

        /* renamed from: k, reason: collision with root package name */
        protected static final String f91455k = "com.medallia.digital.mobilesdk.extra_form_trigger_type";

        /* renamed from: l, reason: collision with root package name */
        protected static final String f91456l = "com.medallia.digital.mobilesdk.extra_reason";

        /* renamed from: m, reason: collision with root package name */
        protected static final String f91457m = "com.medallia.digital.mobilesdk.extra_form_url";

        /* renamed from: n, reason: collision with root package name */
        protected static final String f91458n = "com.medallia.digital.mobilesdk.extra_form_time_to_display";

        /* renamed from: o, reason: collision with root package name */
        protected static final String f91459o = "com.medallia.digital.mobilesdk.extra_feedback_payload";

        /* renamed from: p, reason: collision with root package name */
        protected static final String f91460p = "com.medallia.digital.mobilesdk.extra_feedback_id";

        /* renamed from: q, reason: collision with root package name */
        protected static final String f91461q = "com.medallia.digital.mobilesdk.extra_thank_you_prompt_button_display";

        /* renamed from: r, reason: collision with root package name */
        protected static final String f91462r = "com.medallia.digital.mobilesdk.extra_thank_you_prompt_image_display";

        /* renamed from: s, reason: collision with root package name */
        protected static final String f91463s = "com.medallia.digital.mobilesdk.extra_form_header_appearance_set";

        /* renamed from: t, reason: collision with root package name */
        protected static final String f91464t = "com.medallia.digital.mobilesdk.extra_form_header_appearance_display";

        protected enum a {
            codeFormReady,
            formSubmitted,
            formDismissed,
            formClosed,
            formDisplayed,
            formLinkSelected,
            formBlockedUrl,
            feedbackPayload,
            formThankYouPrompt
        }

        protected enum b {
            invitationDisplayed,
            invitationAccepted,
            invitationDeclined,
            invitationDeferred
        }

        protected d() {
        }

        protected static void a(a aVar, String str) {
            Intent intent = new Intent(f91448d);
            intent.putExtra(f91449e, aVar);
            intent.putExtra(f91451g, str);
            if (i4.c().b() != null && i4.c().b().getPackageName() != null) {
                intent.setPackage(i4.c().b().getPackageName());
            }
            i4.c().b().sendBroadcast(intent);
        }

        protected static void a(a aVar, String str, FormTriggerType formTriggerType) {
            a(aVar, str, formTriggerType, null, 0L, null, null, null, null);
        }

        protected static void a(a aVar, String str, FormTriggerType formTriggerType, long j10) {
            a(aVar, str, formTriggerType, null, j10, null, null, null, null);
        }

        protected static void a(a aVar, String str, FormTriggerType formTriggerType, FormViewType formViewType) {
            a(aVar, str, formTriggerType, formViewType, 0L, null, null, null, null);
        }

        protected static void a(a aVar, String str, FormTriggerType formTriggerType, FormViewType formViewType, long j10, String str2, String str3, MDAppearanceMode mDAppearanceMode, MDAppearanceMode mDAppearanceMode2) {
            a(aVar, str, formTriggerType, formViewType, null, j10, str2, str3, null, null, mDAppearanceMode, mDAppearanceMode2);
        }

        protected static void a(a aVar, String str, FormTriggerType formTriggerType, FormViewType formViewType, String str2, long j10, String str3, String str4, Boolean bool, Boolean bool2, MDAppearanceMode mDAppearanceMode, MDAppearanceMode mDAppearanceMode2) {
            Intent intent = new Intent(f91445a);
            intent.putExtra(f91449e, aVar);
            intent.putExtra(f91451g, str);
            intent.putExtra(f91455k, formTriggerType);
            intent.putExtra(f91450f, System.currentTimeMillis());
            intent.putExtra(f91458n, j10);
            intent.putExtra(f91452h, formViewType);
            intent.putExtra(f91453i, str3);
            intent.putExtra(f91454j, str4);
            if (str2 != null) {
                intent.putExtra(f91457m, str2);
            }
            if (aVar == a.formThankYouPrompt) {
                intent.putExtra(f91461q, bool);
                intent.putExtra(f91462r, bool2);
                intent.putExtra(f91463s, mDAppearanceMode);
                intent.putExtra(f91464t, mDAppearanceMode2);
            }
            if (aVar == a.formDisplayed && mDAppearanceMode != null && mDAppearanceMode2 != null) {
                intent.putExtra(f91463s, mDAppearanceMode);
                intent.putExtra(f91464t, mDAppearanceMode2);
            }
            q4.a(i4.c().b()).a(intent);
        }

        public static void a(a aVar, String str, FormTriggerType formTriggerType, FormViewType formViewType, boolean z10, boolean z11, MDAppearanceMode mDAppearanceMode, MDAppearanceMode mDAppearanceMode2) {
            a(aVar, str, formTriggerType, formViewType, null, 0L, null, null, Boolean.valueOf(z10), Boolean.valueOf(z11), mDAppearanceMode, mDAppearanceMode2);
        }

        protected static void a(a aVar, String str, FormTriggerType formTriggerType, String str2) {
            a(aVar, str, formTriggerType, null, str2, 0L, null, null, null, null, null, null);
        }

        protected static void a(a aVar, String str, FormTriggerType formTriggerType, String str2, String str3) {
            Intent intent = new Intent(f91446b);
            intent.putExtra(f91449e, aVar);
            intent.putExtra(f91451g, str);
            intent.putExtra(f91455k, formTriggerType);
            intent.putExtra(f91450f, System.currentTimeMillis());
            intent.putExtra(f91460p, str2);
            intent.putExtra(f91459o, str3);
            q4.a(i4.c().b()).a(intent);
        }
    }

    protected static class e {

        /* renamed from: a, reason: collision with root package name */
        protected static final String f91480a = "com.medallia.digital.mobilesdk.intercept_action";

        /* renamed from: b, reason: collision with root package name */
        protected static final String f91481b = "com.medallia.digital.mobilesdk.extra_timestamp";

        /* renamed from: c, reason: collision with root package name */
        protected static final String f91482c = "com.medallia.digital.mobilesdk.extra_id";

        /* renamed from: d, reason: collision with root package name */
        protected static final String f91483d = "com.medallia.digital.mobilesdk.extra_reason";

        /* renamed from: e, reason: collision with root package name */
        protected static final String f91484e = "com.medallia.digital.mobilesdk.extra_intercept_command";

        /* renamed from: f, reason: collision with root package name */
        protected static final String f91485f = "com.medallia.digital.mobilesdk.extra_engagement_type";

        /* renamed from: g, reason: collision with root package name */
        protected static final String f91486g = "com.medallia.digital.mobilesdk.extra_invite_type";

        /* renamed from: h, reason: collision with root package name */
        protected static final String f91487h = "com.medallia.digital.mobilesdk.extra_intercept_appearance_set";

        /* renamed from: i, reason: collision with root package name */
        protected static final String f91488i = "com.medallia.digital.mobilesdk.extra_intercept_appearance_display";

        protected enum a {
            interceptDisplayed,
            interceptAccepted,
            interceptDeclined,
            interceptDeferred,
            interceptClosed,
            interceptTriggered
        }

        protected e() {
        }

        public static void a(a aVar, String str) {
            a(aVar, str, null, null, null, null, null);
        }

        public static void a(a aVar, String str, String str2, MDEngagementType mDEngagementType, e3 e3Var) {
            a(aVar, str, str2, mDEngagementType, e3Var, null, null);
        }

        protected static void a(a aVar, String str, String str2, MDEngagementType mDEngagementType, e3 e3Var, MDAppearanceMode mDAppearanceMode, MDAppearanceMode mDAppearanceMode2) {
            Intent intent = new Intent(f91480a);
            intent.putExtra(f91484e, aVar);
            intent.putExtra(f91482c, str);
            intent.putExtra(f91481b, System.currentTimeMillis());
            intent.putExtra(f91485f, mDEngagementType);
            intent.putExtra(f91486g, str2);
            if (e3Var != null) {
                intent.putExtra(f91483d, e3Var);
            }
            if (aVar == a.interceptDisplayed && mDAppearanceMode != null && mDAppearanceMode2 != null) {
                intent.putExtra(f91487h, mDAppearanceMode);
                intent.putExtra(f91488i, mDAppearanceMode2);
            }
            q4.a(i4.c().b()).a(intent);
        }
    }

    protected static class f {

        /* renamed from: a, reason: collision with root package name */
        protected static final String f91496a = "com.medallia.digital.mobilesdk.localization_action";

        /* renamed from: b, reason: collision with root package name */
        protected static final String f91497b = "com.medallia.digital.mobilesdk.extra_error";

        /* renamed from: c, reason: collision with root package name */
        protected static final String f91498c = "com.medallia.digital.mobilesdk.extra_success";

        protected f() {
        }

        protected static void a() {
            Intent intent = new Intent(f91496a);
            intent.putExtra(f91498c, "");
            q4.a(i4.c().b()).a(intent);
        }

        protected static void a(MDExternalError mDExternalError) {
            Intent intent = new Intent(f91496a);
            intent.putExtra(f91497b, mDExternalError);
            q4.a(i4.c().b()).a(intent);
        }

        protected static void a(String str) {
            Intent intent = new Intent(f91496a);
            intent.putExtra(f91498c, str);
            q4.a(i4.c().b()).a(intent);
        }
    }

    protected static class g {

        /* renamed from: a, reason: collision with root package name */
        protected static final String f91499a = "com.medallia.digital.mobilesdk.SESSION_STARTED";

        /* renamed from: b, reason: collision with root package name */
        protected static final String f91500b = "com.medallia.digital.mobilesdk.SESSION_NUMBER_VALUE";

        /* renamed from: c, reason: collision with root package name */
        protected static final String f91501c = "com.medallia.digital.mobilesdk.SESSION_ID_VALUE";

        protected g() {
        }
    }

    protected static class h {

        /* renamed from: a, reason: collision with root package name */
        protected static final String f91502a = "com.medallia.digital.mobilesdk.sync_userjourney_action";

        /* renamed from: b, reason: collision with root package name */
        protected static final String f91503b = "com.medallia.digital.mobilesdk.extra_trigger";

        protected enum a {
            submitFeedback,
            invitationDisplayed,
            promptDisplayed,
            promptAccepted,
            formDisplayed
        }

        protected h() {
        }

        protected static void a(a aVar) {
            Intent intent = new Intent(f91502a);
            intent.putExtra(f91503b, aVar.toString());
            q4.a(i4.c().b()).a(intent);
        }
    }

    protected static class i {

        /* renamed from: a, reason: collision with root package name */
        protected static final String f91510a = "com.medallia.digital.mobilesdk.EvaluateReceiverFilter";

        /* renamed from: b, reason: collision with root package name */
        protected static final String f91511b = "com.medallia.digital.mobilesdk.EvaluateReceiverInitiator";

        protected i() {
        }
    }

    protected static class j {

        /* renamed from: a, reason: collision with root package name */
        protected static final String f91512a = "com.medallia.digital.mobilesdk.extra_touch_event_command";

        /* renamed from: b, reason: collision with root package name */
        protected static final String f91513b = "com.medallia.digital.mobilesdk.extra_motion_event_action";

        /* renamed from: c, reason: collision with root package name */
        protected static final String f91514c = "com.medallia.digital.mobilesdk.touch_event_action";

        protected enum a {
            TouchEvent
        }

        protected j() {
        }

        protected static void a(a aVar, int i10) {
            Intent intent = new Intent(f91514c);
            intent.putExtra(f91512a, aVar);
            intent.putExtra(f91513b, i10);
            q4.a(i4.c().b()).a(intent);
        }
    }

    Broadcasts() {
    }
}
