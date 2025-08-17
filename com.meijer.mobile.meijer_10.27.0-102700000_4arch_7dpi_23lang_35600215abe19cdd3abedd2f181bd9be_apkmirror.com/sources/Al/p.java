package Al;

import android.content.Context;
import android.content.Intent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ=\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0017¨\u0006\u0019"}, d2 = {"LAl/p;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "isLoggedIn", "", "code", "Landroid/content/Intent;", "c", "(Landroid/content/Context;ZI)Landroid/content/Intent;", "isFromEarnRewards", "isFromClaimRewards", "isFromViewRewards", "isFromEarnRewardsAvailablePill", "e", "(Landroid/content/Context;ZZZZ)Landroid/content/Intent;", "shouldClearBackStack", "d", "(Landroid/content/Context;Z)Landroid/content/Intent;", "a", "(Landroid/content/Context;)Landroid/content/Intent;", "b", "featurenavigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public static final p f690a = new p();

    public static /* synthetic */ Intent f(p pVar, Context context, boolean z10, boolean z11, boolean z12, boolean z13, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        if ((i10 & 8) != 0) {
            z12 = false;
        }
        if ((i10 & 16) != 0) {
            z13 = false;
        }
        return pVar.e(context, z10, z11, z12, z13);
    }

    public final Intent a(Context context) {
        Intrinsics.j(context, "context");
        return j.a(context, "action.com.meijer.mobile.mperks.ux.learn_to_earn");
    }

    public final Intent b(Context context) {
        Intrinsics.j(context, "context");
        return j.a(context, "action.com.meijer.mobile.rewards.mcc_opt_out");
    }

    public final Intent c(Context context, boolean isLoggedIn, int code) {
        Intrinsics.j(context, "context");
        return isLoggedIn ? code != 160 ? code != 168 ? code != 164 ? code != 165 ? f(this, context, false, false, true, false, 22, null) : f(this, context, false, true, false, false, 26, null) : f(this, context, true, false, false, false, 28, null) : f(this, context, true, false, false, true, 12, null) : f(this, context, false, false, true, false, 22, null) : a(context);
    }

    public final Intent d(Context context, boolean shouldClearBackStack) {
        Intrinsics.j(context, "context");
        Intent intentA = j.a(context, "action.com.meijer.mobile.mperks.ux");
        if (!shouldClearBackStack) {
            intentA.addFlags(67108864);
        }
        return intentA;
    }

    public final Intent e(Context context, boolean isFromEarnRewards, boolean isFromClaimRewards, boolean isFromViewRewards, boolean isFromEarnRewardsAvailablePill) {
        Intrinsics.j(context, "context");
        Intent intentD = d(context, false);
        intentD.putExtra("com.meijer.mobile.mperks.EXTRA_IS_FROM_EARN_REWARDS", isFromEarnRewards);
        intentD.putExtra("com.meijer.mobile.mperks.EXTRA_IS_FROM_CLAIM_REWARDS", isFromClaimRewards);
        intentD.putExtra("com.meijer.mobile.mperks.EXTRA_IS_FROM_VIEW_REWARDS", isFromViewRewards);
        intentD.putExtra("com.meijer.mobile.mperks.EXTRA_IS_FROM_EARN_REWARDS_AVAILABLE_PILL", isFromEarnRewardsAvailablePill);
        intentD.putExtra("com.meijer.mobile.mperks.EXTRA_IS_LEARN_TO_EARN", false);
        return intentD;
    }

    private p() {
    }
}
