package yo;

import android.content.SharedPreferences;
import com.medallia.digital.mobilesdk.l8;
import j$.time.Instant;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\"\n\u0002\b\u0015\b\u0007\u0018\u0000 52\u00020\u0001:\u0001\u0007B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u000e¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u000e¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010\"\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u0015\u0010%\u001a\u00020\u00062\u0006\u0010$\u001a\u00020 ¢\u0006\u0004\b%\u0010&J\r\u0010'\u001a\u00020\u000e¢\u0006\u0004\b'\u0010\u0018J\r\u0010(\u001a\u00020\u0006¢\u0006\u0004\b(\u0010\bJ\u0015\u0010*\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u000e¢\u0006\u0004\b*\u0010\u0016J\u0015\u0010,\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u001a¢\u0006\u0004\b,\u0010-J\u0015\u0010.\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u001a¢\u0006\u0004\b.\u0010-J\u0019\u00100\u001a\u00020\u00062\b\b\u0002\u0010/\u001a\u00020 H\u0007¢\u0006\u0004\b0\u0010&J\u0015\u00101\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u001a¢\u0006\u0004\b1\u0010-J\u0019\u00102\u001a\u00020\u00062\b\b\u0002\u0010/\u001a\u00020 H\u0007¢\u0006\u0004\b2\u0010&J\u0019\u00105\u001a\u00020\u00062\n\u00104\u001a\u00060\tj\u0002`3¢\u0006\u0004\b5\u0010\fJ\u0015\u00107\u001a\u00020\u00062\u0006\u00106\u001a\u00020\u000e¢\u0006\u0004\b7\u0010\u0016J\r\u00108\u001a\u00020\u000e¢\u0006\u0004\b8\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00109R\u0014\u0010;\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b:\u0010\u0018R$\u0010@\u001a\u00020 2\u0006\u0010<\u001a\u00020 8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b=\u0010>\"\u0004\b?\u0010&R$\u0010C\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020\u000e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bA\u0010\u0018\"\u0004\bB\u0010\u0016R\u0011\u0010E\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\bD\u0010\u0018R\u0011\u0010H\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\bF\u0010GR$\u0010J\u001a\u00020\u000e2\u0006\u0010I\u001a\u00020\u000e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bJ\u0010\u0018\"\u0004\bK\u0010\u0016R\u0011\u0010M\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\bL\u0010GR\u0011\u0010O\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\bN\u0010GR\u0011\u0010Q\u001a\u00020 8F¢\u0006\u0006\u001a\u0004\bP\u0010>R\u0011\u0010S\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\bR\u0010GR\u0011\u0010U\u001a\u00020 8F¢\u0006\u0006\u001a\u0004\bT\u0010>R0\u0010\\\u001a\b\u0012\u0004\u0012\u00020\t0V2\f\u0010W\u001a\b\u0012\u0004\u0012\u00020\t0V8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R$\u0010_\u001a\u00020\u000e2\u0006\u0010<\u001a\u00020\u000e8F@GX\u0086\u000e¢\u0006\f\u001a\u0004\b]\u0010\u0018\"\u0004\b^\u0010\u0016R\u0011\u0010!\u001a\u00020 8F¢\u0006\u0006\u001a\u0004\b`\u0010>R\u0011\u0010b\u001a\u00020 8F¢\u0006\u0006\u001a\u0004\ba\u0010>R$\u0010f\u001a\u00020\u000e2\u0006\u0010c\u001a\u00020\u000e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bd\u0010\u0018\"\u0004\be\u0010\u0016R$\u0010j\u001a\u00020\u000e2\u0006\u0010g\u001a\u00020\u000e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bh\u0010\u0018\"\u0004\bi\u0010\u0016¨\u0006k"}, d2 = {"Lyo/a;", "", "Landroid/content/SharedPreferences;", "sharedPreferences", "<init>", "(Landroid/content/SharedPreferences;)V", "", "a", "()V", "", "loginID", "N", "(Ljava/lang/String;)V", "tutorial", "", "hasSeen", "M", "(Ljava/lang/String;Z)V", "o", "(Ljava/lang/String;)Z", "couponNoThanksSeen", "K", "(Z)V", "n", "()Z", "enableRatingsPrompt", "", "percentChanceOfLoggingRatingsPromptEvent", "ratingsPromptClippedCouponsCount", "O", "(ZII)V", "updateAvailable", "", "lastTimeAppUpdateChecked", "P", "(ZJ)V", "dismissTime", "L", "(J)V", "Q", "t", "enabled", "v", "appVersionCode", "C", "(I)V", "z", "currentTimeInMillis", "A", "y", "D", "Lcom/meijer/mobile/core/model/common/ResourceId;", "orderId", "b", "emailVerificationSpiffSuccess", "G", "J", "Landroid/content/SharedPreferences;", "r", "isTwentyFourHoursBannerDismissTimeActive", "value", "f", "()J", "x", "notificationPermissionRationaleShownTime", "getUserNotificationsEnabled", "I", "userNotificationsEnabled", "p", "isConfigRateAppPromptingEnabled", "k", "()I", "rateAppPromptPercent", "requested", "isRateAppTriggerRequested", "F", "j", "rateAppPerformedVersion", "h", "rateAppEmailSentVersion", "i", "rateAppNeverPromptAgainTime", "g", "rateAppDoNotPromptVersion", "l", "rateAppRemindLaterTimePrompted", "", "dismissedOrders", "c", "()Ljava/util/Set;", "u", "(Ljava/util/Set;)V", "dismissedHomeOrderCards", "s", "setUpdateAvailable", "isUpdateAvailable", "e", "d", "emailVerificationBannerDismissTime", "shouldShow", "m", "H", "showMPerksWalkThruBanner", "acknowledged", "q", "w", "isMPerks4Acknowledged", "persistence_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: yo.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C18335a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final SharedPreferences sharedPreferences;

    @JvmOverloads
    public final void A(long currentTimeInMillis) {
        F(false);
        a();
        SharedPreferences.Editor editorEdit = this.sharedPreferences.edit();
        editorEdit.putLong("rate_app_never_prompt", currentTimeInMillis);
        editorEdit.apply();
    }

    public final void C(int appVersionCode) {
        F(false);
        a();
        SharedPreferences.Editor editorEdit = this.sharedPreferences.edit();
        editorEdit.putInt("rate_app_performed", appVersionCode);
        editorEdit.apply();
    }

    public final void y(int appVersionCode) {
        F(false);
        a();
        SharedPreferences.Editor editorEdit = this.sharedPreferences.edit();
        editorEdit.putInt("rate_app_selection_do_not_prompt", appVersionCode);
        editorEdit.apply();
    }

    public final void z(int appVersionCode) {
        F(false);
        a();
        SharedPreferences.Editor editorEdit = this.sharedPreferences.edit();
        editorEdit.putInt("rate_app_email_feedback", appVersionCode);
        editorEdit.apply();
    }

    public C18335a(SharedPreferences sharedPreferences) {
        Intrinsics.j(sharedPreferences, "sharedPreferences");
        this.sharedPreferences = sharedPreferences;
    }

    public static /* synthetic */ void B(C18335a c18335a, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = System.currentTimeMillis();
        }
        c18335a.A(j10);
    }

    public static /* synthetic */ void E(C18335a c18335a, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = System.currentTimeMillis();
        }
        c18335a.D(j10);
    }

    @JvmOverloads
    public final void D(long currentTimeInMillis) {
        SharedPreferences.Editor editorEdit = this.sharedPreferences.edit();
        editorEdit.putLong("rate_app_selection_remind_later_prompted", currentTimeInMillis);
        editorEdit.apply();
    }

    public final void F(boolean z10) {
        SharedPreferences.Editor editorEdit = this.sharedPreferences.edit();
        editorEdit.putBoolean("rate_app_requested", z10);
        editorEdit.apply();
    }

    public final void G(boolean emailVerificationSpiffSuccess) {
        SharedPreferences.Editor editorEdit = this.sharedPreferences.edit();
        editorEdit.putBoolean("pref_has_enrollment_spiff", emailVerificationSpiffSuccess && !r());
        editorEdit.apply();
    }

    public final void H(boolean z10) {
        SharedPreferences.Editor editorEdit = this.sharedPreferences.edit();
        editorEdit.putBoolean("mperks_4.0_walk_through_banner", z10);
        editorEdit.apply();
    }

    public final void I(boolean z10) {
        SharedPreferences.Editor editorEdit = this.sharedPreferences.edit();
        editorEdit.putBoolean("userNotificationPref", z10);
        editorEdit.apply();
    }

    public final boolean J() {
        return this.sharedPreferences.getBoolean("pref_has_enrollment_spiff", true);
    }

    public final void K(boolean couponNoThanksSeen) {
        SharedPreferences.Editor editorEdit = this.sharedPreferences.edit();
        editorEdit.putBoolean("mperks_coupons_no_thanks_seen", couponNoThanksSeen);
        editorEdit.apply();
    }

    public final void L(long dismissTime) {
        SharedPreferences.Editor editorEdit = this.sharedPreferences.edit();
        editorEdit.putLong("email_verification_banner_dismiss_time", dismissTime);
        editorEdit.apply();
    }

    public final void M(String tutorial, boolean hasSeen) {
        Intrinsics.j(tutorial, "tutorial");
        SharedPreferences.Editor editorEdit = this.sharedPreferences.edit();
        editorEdit.putBoolean(tutorial, hasSeen);
        editorEdit.apply();
    }

    public final void N(String loginID) {
        SharedPreferences.Editor editorEdit = this.sharedPreferences.edit();
        editorEdit.putString("user_login_id", loginID);
        editorEdit.apply();
    }

    public final void O(boolean enableRatingsPrompt, int percentChanceOfLoggingRatingsPromptEvent, int ratingsPromptClippedCouponsCount) {
        SharedPreferences.Editor editorEdit = this.sharedPreferences.edit();
        editorEdit.putBoolean("mma_config_rate_app_enabled", enableRatingsPrompt);
        editorEdit.putInt("mma_config_rate_app_event_percent", percentChanceOfLoggingRatingsPromptEvent);
        editorEdit.putInt("mma_config_rate_app_clipped_coupons_count", ratingsPromptClippedCouponsCount);
        editorEdit.apply();
    }

    public final void P(boolean updateAvailable, long lastTimeAppUpdateChecked) {
        SharedPreferences.Editor editorEdit = this.sharedPreferences.edit();
        editorEdit.putBoolean("mma_config_update_available", updateAvailable);
        editorEdit.putLong("mma_config_last_check_time", lastTimeAppUpdateChecked);
        editorEdit.apply();
    }

    public final boolean Q() {
        return this.sharedPreferences.getBoolean("messages_notifications_enabled_dialog_seen", false);
    }

    public final void b(String orderId) {
        Intrinsics.j(orderId, "orderId");
        u(CollectionsKt.o1(CollectionsKt.Q0(CollectionsKt.c1(CollectionsKt.j1(c()), 20), orderId)));
    }

    public final Set<String> c() {
        Set<String> stringSet = this.sharedPreferences.getStringSet("dismissed_orders", SetsKt.e());
        return stringSet == null ? SetsKt.e() : stringSet;
    }

    public final long d() {
        return this.sharedPreferences.getLong("email_verification_banner_dismiss_time", 0L);
    }

    public final long e() {
        return this.sharedPreferences.getLong("mma_config_last_check_time", 0L);
    }

    public final long f() {
        return this.sharedPreferences.getLong("prefs_notification_permission_rationale_shown_time", 0L);
    }

    public final int g() {
        return this.sharedPreferences.getInt("rate_app_selection_do_not_prompt", 0);
    }

    public final int h() {
        return this.sharedPreferences.getInt("rate_app_email_feedback", 0);
    }

    public final long i() {
        return this.sharedPreferences.getLong("rate_app_never_prompt", 0L);
    }

    public final int j() {
        return this.sharedPreferences.getInt("rate_app_performed", 0);
    }

    public final int k() {
        return this.sharedPreferences.getInt("mma_config_rate_app_event_percent", 0);
    }

    public final long l() {
        try {
            return this.sharedPreferences.getLong("rate_app_selection_remind_later_prompted", 0L);
        } catch (ClassCastException unused) {
            int i10 = this.sharedPreferences.getInt("rate_app_selection_remind_later_prompted", 0);
            SharedPreferences.Editor editorEdit = this.sharedPreferences.edit();
            editorEdit.putLong("rate_app_selection_remind_later_prompted", i10);
            editorEdit.apply();
            return this.sharedPreferences.getLong("rate_app_selection_remind_later_prompted", 0L);
        }
    }

    public final boolean m() {
        return this.sharedPreferences.getBoolean("mperks_4.0_walk_through_banner", true);
    }

    public final boolean n() {
        return this.sharedPreferences.getBoolean("mperks_coupons_no_thanks_seen", false);
    }

    public final boolean o(String tutorial) {
        Intrinsics.j(tutorial, "tutorial");
        return this.sharedPreferences.getBoolean(tutorial, false);
    }

    public final boolean p() {
        return this.sharedPreferences.getBoolean("mma_config_rate_app_enabled", false);
    }

    public final boolean q() {
        return this.sharedPreferences.getBoolean("mperks4_acknowledgement", false);
    }

    public final boolean s() {
        return this.sharedPreferences.getBoolean("mma_config_update_available", false);
    }

    public final void t() {
        SharedPreferences.Editor editorEdit = this.sharedPreferences.edit();
        editorEdit.putBoolean("messages_notifications_enabled_dialog_seen", true);
        editorEdit.apply();
    }

    public final void u(Set<String> dismissedOrders) {
        Intrinsics.j(dismissedOrders, "dismissedOrders");
        SharedPreferences.Editor editorEdit = this.sharedPreferences.edit();
        editorEdit.putStringSet("dismissed_orders", dismissedOrders);
        editorEdit.apply();
    }

    public final void v(boolean enabled) {
        SharedPreferences.Editor editorEdit = this.sharedPreferences.edit();
        editorEdit.putBoolean("userUnauthNotificationPref", enabled);
        editorEdit.apply();
    }

    public final void w(boolean z10) {
        SharedPreferences.Editor editorEdit = this.sharedPreferences.edit();
        editorEdit.putBoolean("mperks4_acknowledgement", z10);
        editorEdit.apply();
    }

    public final void x(long j10) {
        SharedPreferences.Editor editorEdit = this.sharedPreferences.edit();
        editorEdit.putLong("prefs_notification_permission_rationale_shown_time", j10);
        editorEdit.apply();
    }

    private final void a() {
        if (l() != 0) {
            SharedPreferences.Editor editorEdit = this.sharedPreferences.edit();
            editorEdit.putLong("rate_app_selection_remind_later_prompted", 0L);
            editorEdit.apply();
        }
    }

    private final boolean r() {
        if (Instant.now().toEpochMilli() - d() < l8.b.f93366d) {
            return true;
        }
        return false;
    }
}
