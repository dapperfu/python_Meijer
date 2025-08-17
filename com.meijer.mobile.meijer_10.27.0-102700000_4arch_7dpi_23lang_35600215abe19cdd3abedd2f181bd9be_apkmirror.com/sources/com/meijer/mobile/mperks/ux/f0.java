package com.meijer.mobile.mperks.ux;

import android.content.Context;
import android.content.Intent;
import bo.AutoClaimReward;
import bo.ClippedReward;
import bo.RewardDetail;
import com.meijer.mobile.mperks.ux.claim.autoClaim.AutoClaimDetailsActivity;
import com.meijer.mobile.mperks.ux.rewardDetail.RewardsDetailsActivity;
import com.meijer.mobile.mperks.ux.rewards.ViewAllRewardsActivity;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import nk.MccProgram;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J/\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010!\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lcom/meijer/mobile/mperks/ux/f0;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lbo/i;", "navigateToTab", "Landroid/content/Intent;", "b", "(Landroid/content/Context;Lbo/i;)Landroid/content/Intent;", "Lbo/a;", "autoClaimReward", "a", "(Landroid/content/Context;Lbo/a;)Landroid/content/Intent;", "Lbo/j;", "rewardDetail", "", "navigatedFrom", "", "isShoppableReward", "e", "(Landroid/content/Context;Lbo/j;Ljava/lang/String;Z)Landroid/content/Intent;", "", "Lbo/d;", "clippedRewardsCoupons", "mperksPoints", "f", "(Landroid/content/Context;Ljava/util/List;Ljava/lang/String;)Landroid/content/Intent;", "d", "(Landroid/content/Context;)Landroid/content/Intent;", "Lnk/b;", "mccProgram", "c", "(Landroid/content/Context;Lnk/b;)Landroid/content/Intent;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public static final f0 f114022a = new f0();

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[bo.i.values().length];
            try {
                iArr[bo.i.f60581a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[bo.i.f60582b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[bo.i.f60583c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final Intent a(Context context, AutoClaimReward autoClaimReward) {
        Intrinsics.j(context, "context");
        Intrinsics.j(autoClaimReward, "autoClaimReward");
        Intent intentPutExtra = new Intent(context, (Class<?>) AutoClaimDetailsActivity.class).putExtra("com.meijer.intent.extra.EXTRA_AUTO_CLAIM", autoClaimReward);
        Intrinsics.i(intentPutExtra, "putExtra(...)");
        return intentPutExtra;
    }

    public final Intent b(Context context, bo.i navigateToTab) {
        Intrinsics.j(context, "context");
        Intrinsics.j(navigateToTab, "navigateToTab");
        Intent intent = new Intent(context, (Class<?>) MperksDashBoardActivity.class);
        int i10 = a.$EnumSwitchMapping$0[navigateToTab.ordinal()];
        if (i10 == 1) {
            intent.putExtra("com.meijer.mobile.mperks.EXTRA_IS_FROM_EARN_REWARDS", true);
        } else if (i10 == 2) {
            intent.putExtra("com.meijer.mobile.mperks.EXTRA_IS_FROM_CLAIM_REWARDS", true);
        } else {
            if (i10 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            intent.putExtra("com.meijer.mobile.mperks.EXTRA_IS_FROM_VIEW_REWARDS", true);
        }
        intent.putExtra("com.meijer.mobile.mperks.EXTRA_IS_LEARN_TO_EARN", true);
        return intent;
    }

    public final Intent c(Context context, MccProgram mccProgram) {
        Intrinsics.j(context, "context");
        Intrinsics.j(mccProgram, "mccProgram");
        Intent intentPutExtra = Al.j.a(context, "action.com.meijer.mobile.rewards.inprogress_mcc_detail").putExtra("com.meijer.intent.extra.EXTRA_MCC_PROGRAM", mccProgram);
        Intrinsics.i(intentPutExtra, "putExtra(...)");
        return intentPutExtra;
    }

    public final Intent d(Context context) {
        Intrinsics.j(context, "context");
        return Al.j.a(context, "action.com.meijer.mobile.rewards.available_mcc_detail");
    }

    public final Intent e(Context context, RewardDetail rewardDetail, String navigatedFrom, boolean isShoppableReward) {
        Intrinsics.j(context, "context");
        Intrinsics.j(rewardDetail, "rewardDetail");
        Intrinsics.j(navigatedFrom, "navigatedFrom");
        Intent intentPutExtra = new Intent(context, (Class<?>) RewardsDetailsActivity.class).putExtra("com.meijer.intent.extra.EXTRA_REWARD_COUPON", rewardDetail).putExtra("com.meijer.intent.extra.EXTRA_NAVIGATED_FROM", navigatedFrom).putExtra("com.meijer.intent.extra.IS_SHOPPABLE_REWARD", isShoppableReward);
        Intrinsics.i(intentPutExtra, "putExtra(...)");
        return intentPutExtra;
    }

    public final Intent f(Context context, List<ClippedReward> clippedRewardsCoupons, String mperksPoints) {
        Intrinsics.j(context, "context");
        Intrinsics.j(clippedRewardsCoupons, "clippedRewardsCoupons");
        Intent intent = new Intent(context, (Class<?>) ViewAllRewardsActivity.class);
        List listP0 = CollectionsKt.p0(clippedRewardsCoupons);
        Intrinsics.h(listP0, "null cannot be cast to non-null type java.util.ArrayList<com.meijer.mobile.mperks.model.common.ClippedReward>");
        Intent intentPutExtra = intent.putParcelableArrayListExtra("com.meijer.intent.extra.EXTRA_REWARD_COUPON_lIST_FROM_MPERKS_DASHBOARD", (ArrayList) listP0).putExtra("com.meijer.intent.extra.EXTRA_REWARD_MPERKS_BALANCE", mperksPoints);
        Intrinsics.i(intentPutExtra, "putExtra(...)");
        return intentPutExtra;
    }

    private f0() {
    }
}
