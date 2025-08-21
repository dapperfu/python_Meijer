package com.medallia.digital.mobilesdk;

import android.content.Intent;

/* loaded from: classes8.dex */
final class Broadcasts {
    protected static final String PROPERTY_ID_CHANGE = "com.medallia.digital.mobilesdk.PROPERTY_ID_CHANGE";
    protected static final String PROPERTY_ID_VALUE = "com.medallia.digital.mobilesdk.PROPERTY_ID_VALUE";

    protected static class a {

        /* renamed from: a, reason: collision with root package name */
        protected static final String f92254a = "com.medallia.digital.mobilesdk.MedalliaFullFormActivity";

        /* renamed from: b, reason: collision with root package name */
        protected static final String f92255b = "com.medallia.digital.mobilesdk.MedalliaModalFormActivity";

        /* renamed from: c, reason: collision with root package name */
        protected static final String f92256c = "com.medallia.digital.mobilesdk.form_data";

        /* renamed from: d, reason: collision with root package name */
        protected static final String f92257d = "com.medallia.digital.mobilesdk.is_show_form";

        /* renamed from: e, reason: collision with root package name */
        protected static final String f92258e = "com.medallia.digital.mobilesdk.is_form_available";

        /* renamed from: f, reason: collision with root package name */
        protected static final String f92259f = "com.medallia.digital.mobilesdk.spinner_delay";

        /* renamed from: g, reason: collision with root package name */
        protected static final String f92260g = "com.medallia.digital.mobilesdk.vuln_enabled";

        /* renamed from: h, reason: collision with root package name */
        protected static final String f92261h = "com.medallia.digital.mobilesdk.FinishInvitationActivity";

        /* renamed from: i, reason: collision with root package name */
        protected static final String f92262i = "com.medallia.digital.mobilesdk.show_invitation_start_time";

        /* renamed from: j, reason: collision with root package name */
        protected static final String f92263j = "com.medallia.digital.mobilesdk.inherit_orientation";

        /* renamed from: k, reason: collision with root package name */
        protected static final String f92264k = "com.medallia.digital.mobilesdk.remove_task";

        /* renamed from: l, reason: collision with root package name */
        protected static final String f92265l = "com.medallia.digital.mobilesdk.form_preview_data";

        /* renamed from: m, reason: collision with root package name */
        protected static final String f92266m = "com.medallia.digital.mobilesdk.form_is_preview_app";

        /* renamed from: n, reason: collision with root package name */
        protected static final String f92267n = "com.medallia.digital.mobilesdk.form_header_palette";

        /* renamed from: o, reason: collision with root package name */
        protected static final String f92268o = "com.medallia.digital.mobilesdk.user_media_capture_conf";

        protected a() {
        }
    }

    protected static class b {

        /* renamed from: a, reason: collision with root package name */
        protected static final String f92269a = "com.medallia.digital.mobilesdk.custom_intercept_action";

        /* renamed from: b, reason: collision with root package name */
        protected static final String f92270b = "com.medallia.digital.mobilesdk.extra_form_preload_timestamp";

        /* renamed from: c, reason: collision with root package name */
        protected static final String f92271c = "com.medallia.digital.mobilesdk.extra_engagement_id";

        /* renamed from: d, reason: collision with root package name */
        protected static final String f92272d = "com.medallia.digital.mobilesdk.extra_target_evaluation_timestamp";

        /* renamed from: e, reason: collision with root package name */
        protected static final String f92273e = "com.medallia.digital.mobilesdk.extra_custom_intercept_command";

        /* renamed from: f, reason: collision with root package name */
        protected static final String f92274f = "com.medallia.digital.mobilesdk.extra_engagement_type";

        /* renamed from: g, reason: collision with root package name */
        protected static final String f92275g = "com.medallia.digital.mobilesdk.extra_payload";

        protected enum a {
            TargetEvaluationSuccess
        }

        protected b() {
        }

        protected static void a(a aVar, String str, long j10, long j11, MDEngagementType mDEngagementType, MDCustomInterceptPayload mDCustomInterceptPayload) {
            Intent intent = new Intent(f92269a);
            intent.putExtra(f92273e, aVar);
            intent.putExtra(f92271c, str);
            intent.putExtra(f92270b, j10);
            intent.putExtra(f92272d, j11);
            intent.putExtra(f92274f, mDEngagementType);
            intent.putExtra(f92275g, mDCustomInterceptPayload);
            q4.a(i4.c().b()).a(intent);
        }
    }

    protected static class c {

        /* renamed from: a, reason: collision with root package name */
        protected static final String f92278a = "com.medallia.digital.mobilesdk.file_action";

        /* renamed from: b, reason: collision with root package name */
        protected static final String f92279b = "com.medallia.digital.mobilesdk.extra_file_path";

        /* renamed from: c, reason: collision with root package name */
        protected static final String f92280c = "com.medallia.digital.mobilesdk.extra_IS_DELETED";

        /* renamed from: d, reason: collision with root package name */
        protected static final String f92281d = "com.medallia.digital.mobilesdk.extra_files_command";

        protected enum a {
            fileDeleted
        }

        protected c() {
        }

        protected static void a(a aVar, String str, boolean z10) {
            Intent intent = new Intent(f92278a);
            intent.putExtra(f92281d, aVar);
            intent.putExtra(f92279b, str);
            intent.putExtra(f92280c, z10);
            q4.a(i4.c().b()).a(intent);
        }
    }

    protected static class d {

        /* renamed from: a, reason: collision with root package name */
        protected static final String f92284a = "com.medallia.digital.mobilesdk.form_action";

        /* renamed from: b, reason: collision with root package name */
        protected static final String f92285b = "com.medallia.digital.mobilesdk.feedback_action";

        /* renamed from: c, reason: collision with root package name */
        protected static final String f92286c = "com.medallia.digital.mobilesdk.invitation_action";

        /* renamed from: d, reason: collision with root package name */
        protected static final String f92287d = "com.medallia.digital.mobilesdk.feedback_preview_action";

        /* renamed from: e, reason: collision with root package name */
        protected static final String f92288e = "com.medallia.digital.mobilesdk.extra_option";

        /* renamed from: f, reason: collision with root package name */
        protected static final String f92289f = "com.medallia.digital.mobilesdk.extra_timestamp";

        /* renamed from: g, reason: collision with root package name */
        protected static final String f92290g = "com.medallia.digital.mobilesdk.extra_form_id";

        /* renamed from: h, reason: collision with root package name */
        protected static final String f92291h = "com.medallia.digital.mobilesdk.extra_form_view_type";

        /* renamed from: i, reason: collision with root package name */
        protected static final String f92292i = "com.medallia.digital.mobilesdk.extra_form_locale_set";

        /* renamed from: j, reason: collision with root package name */
        protected static final String f92293j = "com.medallia.digital.mobilesdk.extra_form_locale_display";

        /* renamed from: k, reason: collision with root package name */
        protected static final String f92294k = "com.medallia.digital.mobilesdk.extra_form_trigger_type";

        /* renamed from: l, reason: collision with root package name */
        protected static final String f92295l = "com.medallia.digital.mobilesdk.extra_reason";

        /* renamed from: m, reason: collision with root package name */
        protected static final String f92296m = "com.medallia.digital.mobilesdk.extra_form_url";

        /* renamed from: n, reason: collision with root package name */
        protected static final String f92297n = "com.medallia.digital.mobilesdk.extra_form_time_to_display";

        /* renamed from: o, reason: collision with root package name */
        protected static final String f92298o = "com.medallia.digital.mobilesdk.extra_feedback_payload";

        /* renamed from: p, reason: collision with root package name */
        protected static final String f92299p = "com.medallia.digital.mobilesdk.extra_feedback_id";

        /* renamed from: q, reason: collision with root package name */
        protected static final String f92300q = "com.medallia.digital.mobilesdk.extra_thank_you_prompt_button_display";

        /* renamed from: r, reason: collision with root package name */
        protected static final String f92301r = "com.medallia.digital.mobilesdk.extra_thank_you_prompt_image_display";

        /* renamed from: s, reason: collision with root package name */
        protected static final String f92302s = "com.medallia.digital.mobilesdk.extra_form_header_appearance_set";

        /* renamed from: t, reason: collision with root package name */
        protected static final String f92303t = "com.medallia.digital.mobilesdk.extra_form_header_appearance_display";

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
            Intent intent = new Intent(f92287d);
            intent.putExtra(f92288e, aVar);
            intent.putExtra(f92290g, str);
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
            Intent intent = new Intent(f92284a);
            intent.putExtra(f92288e, aVar);
            intent.putExtra(f92290g, str);
            intent.putExtra(f92294k, formTriggerType);
            intent.putExtra(f92289f, System.currentTimeMillis());
            intent.putExtra(f92297n, j10);
            intent.putExtra(f92291h, formViewType);
            intent.putExtra(f92292i, str3);
            intent.putExtra(f92293j, str4);
            if (str2 != null) {
                intent.putExtra(f92296m, str2);
            }
            if (aVar == a.formThankYouPrompt) {
                intent.putExtra(f92300q, bool);
                intent.putExtra(f92301r, bool2);
                intent.putExtra(f92302s, mDAppearanceMode);
                intent.putExtra(f92303t, mDAppearanceMode2);
            }
            if (aVar == a.formDisplayed && mDAppearanceMode != null && mDAppearanceMode2 != null) {
                intent.putExtra(f92302s, mDAppearanceMode);
                intent.putExtra(f92303t, mDAppearanceMode2);
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
            Intent intent = new Intent(f92285b);
            intent.putExtra(f92288e, aVar);
            intent.putExtra(f92290g, str);
            intent.putExtra(f92294k, formTriggerType);
            intent.putExtra(f92289f, System.currentTimeMillis());
            intent.putExtra(f92299p, str2);
            intent.putExtra(f92298o, str3);
            q4.a(i4.c().b()).a(intent);
        }
    }

    protected static class e {

        /* renamed from: a, reason: collision with root package name */
        protected static final String f92319a = "com.medallia.digital.mobilesdk.intercept_action";

        /* renamed from: b, reason: collision with root package name */
        protected static final String f92320b = "com.medallia.digital.mobilesdk.extra_timestamp";

        /* renamed from: c, reason: collision with root package name */
        protected static final String f92321c = "com.medallia.digital.mobilesdk.extra_id";

        /* renamed from: d, reason: collision with root package name */
        protected static final String f92322d = "com.medallia.digital.mobilesdk.extra_reason";

        /* renamed from: e, reason: collision with root package name */
        protected static final String f92323e = "com.medallia.digital.mobilesdk.extra_intercept_command";

        /* renamed from: f, reason: collision with root package name */
        protected static final String f92324f = "com.medallia.digital.mobilesdk.extra_engagement_type";

        /* renamed from: g, reason: collision with root package name */
        protected static final String f92325g = "com.medallia.digital.mobilesdk.extra_invite_type";

        /* renamed from: h, reason: collision with root package name */
        protected static final String f92326h = "com.medallia.digital.mobilesdk.extra_intercept_appearance_set";

        /* renamed from: i, reason: collision with root package name */
        protected static final String f92327i = "com.medallia.digital.mobilesdk.extra_intercept_appearance_display";

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
            Intent intent = new Intent(f92319a);
            intent.putExtra(f92323e, aVar);
            intent.putExtra(f92321c, str);
            intent.putExtra(f92320b, System.currentTimeMillis());
            intent.putExtra(f92324f, mDEngagementType);
            intent.putExtra(f92325g, str2);
            if (e3Var != null) {
                intent.putExtra(f92322d, e3Var);
            }
            if (aVar == a.interceptDisplayed && mDAppearanceMode != null && mDAppearanceMode2 != null) {
                intent.putExtra(f92326h, mDAppearanceMode);
                intent.putExtra(f92327i, mDAppearanceMode2);
            }
            q4.a(i4.c().b()).a(intent);
        }
    }

    protected static class f {

        /* renamed from: a, reason: collision with root package name */
        protected static final String f92335a = "com.medallia.digital.mobilesdk.localization_action";

        /* renamed from: b, reason: collision with root package name */
        protected static final String f92336b = "com.medallia.digital.mobilesdk.extra_error";

        /* renamed from: c, reason: collision with root package name */
        protected static final String f92337c = "com.medallia.digital.mobilesdk.extra_success";

        protected f() {
        }

        protected static void a() {
            Intent intent = new Intent(f92335a);
            intent.putExtra(f92337c, "");
            q4.a(i4.c().b()).a(intent);
        }

        protected static void a(MDExternalError mDExternalError) {
            Intent intent = new Intent(f92335a);
            intent.putExtra(f92336b, mDExternalError);
            q4.a(i4.c().b()).a(intent);
        }

        protected static void a(String str) {
            Intent intent = new Intent(f92335a);
            intent.putExtra(f92337c, str);
            q4.a(i4.c().b()).a(intent);
        }
    }

    protected static class g {

        /* renamed from: a, reason: collision with root package name */
        protected static final String f92338a = "com.medallia.digital.mobilesdk.SESSION_STARTED";

        /* renamed from: b, reason: collision with root package name */
        protected static final String f92339b = "com.medallia.digital.mobilesdk.SESSION_NUMBER_VALUE";

        /* renamed from: c, reason: collision with root package name */
        protected static final String f92340c = "com.medallia.digital.mobilesdk.SESSION_ID_VALUE";

        protected g() {
        }
    }

    protected static class h {

        /* renamed from: a, reason: collision with root package name */
        protected static final String f92341a = "com.medallia.digital.mobilesdk.sync_userjourney_action";

        /* renamed from: b, reason: collision with root package name */
        protected static final String f92342b = "com.medallia.digital.mobilesdk.extra_trigger";

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
            Intent intent = new Intent(f92341a);
            intent.putExtra(f92342b, aVar.toString());
            q4.a(i4.c().b()).a(intent);
        }
    }

    protected static class i {

        /* renamed from: a, reason: collision with root package name */
        protected static final String f92349a = "com.medallia.digital.mobilesdk.EvaluateReceiverFilter";

        /* renamed from: b, reason: collision with root package name */
        protected static final String f92350b = "com.medallia.digital.mobilesdk.EvaluateReceiverInitiator";

        protected i() {
        }
    }

    protected static class j {

        /* renamed from: a, reason: collision with root package name */
        protected static final String f92351a = "com.medallia.digital.mobilesdk.extra_touch_event_command";

        /* renamed from: b, reason: collision with root package name */
        protected static final String f92352b = "com.medallia.digital.mobilesdk.extra_motion_event_action";

        /* renamed from: c, reason: collision with root package name */
        protected static final String f92353c = "com.medallia.digital.mobilesdk.touch_event_action";

        protected enum a {
            TouchEvent
        }

        protected j() {
        }

        protected static void a(a aVar, int i10) {
            Intent intent = new Intent(f92353c);
            intent.putExtra(f92351a, aVar);
            intent.putExtra(f92352b, i10);
            q4.a(i4.c().b()).a(intent);
        }
    }

    Broadcasts() {
    }
}
