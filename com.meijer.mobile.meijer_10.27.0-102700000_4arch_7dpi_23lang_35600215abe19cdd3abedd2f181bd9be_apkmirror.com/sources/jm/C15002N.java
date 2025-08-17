package jm;

import Ji.LocalThemeScope;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import bo.ClaimReward;
import bo.RewardDetail;
import em.AbstractC13689c;
import fm.HomeMperksDecorator;
import hi.C14475b;
import hi.TrackingData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a9\u0010\t\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0001¢\u0006\u0004\b\t\u0010\n\u001a9\u0010\f\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0001¢\u0006\u0004\b\f\u0010\n\u001a1\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u00012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\u000f\u0010\u0010\u001a1\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u00012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\u0012\u0010\u0013\u001a)\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0018²\u0006\u000e\u0010\u0017\u001a\u00020\u00168\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0017\u001a\u00020\u00168\n@\nX\u008a\u008e\u0002"}, d2 = {"LJi/M;", "Lfm/b;", "decorator", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "Lem/c;", "", "onAction", "x", "(LJi/M;Lfm/b;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "mperksDecorator", "p", "Lbo/b;", "reward", "E", "(Lbo/b;Lfm/b;Lkotlin/jvm/functions/Function1;)V", "LVl/f;", "D", "(LVl/f;Lfm/b;Lkotlin/jvm/functions/Function1;)V", "H", "(Lfm/b;Lkotlin/jvm/functions/Function1;)V", "", "lastAction", "ux_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: jm.N, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C15002N {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit A(Function1 function1, HomeMperksDecorator homeMperksDecorator) {
        function1.invoke(C14475b.a(new AbstractC13689c.RedeemMPerksViewAllClicked(homeMperksDecorator, null, 2, null), new Function1() { // from class: jm.C
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C15002N.B((TrackingData) obj);
            }
        }));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit B(TrackingData trackWith) {
        Intrinsics.j(trackWith, "$this$trackWith");
        trackWith.v("mPerks 4.0");
        trackWith.o("mPerks: Claim");
        trackWith.p("mPerks redeem carousel: View All Rewards");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit C(LocalThemeScope localThemeScope, HomeMperksDecorator homeMperksDecorator, Modifier modifier, Function1 function1, int i10, int i11, Composer composer, int i12) {
        x(localThemeScope, homeMperksDecorator, modifier, function1, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    public static final void D(Vl.f reward, HomeMperksDecorator mperksDecorator, Function1<? super AbstractC13689c, Unit> onAction) {
        Intrinsics.j(reward, "reward");
        Intrinsics.j(mperksDecorator, "mperksDecorator");
        Intrinsics.j(onAction, "onAction");
        onAction.invoke(C14475b.a(new AbstractC13689c.RewardsMPerksClicked(new RewardDetail(null, reward.getImageUrl(), reward.getName(), null, reward.getDescription(), reward.getExpirationDate(), reward.getTermsAndConditions(), null, null, null, null, null, 3977, null), true, reward.getCouponId(), reward.getExpirationDate(), mperksDecorator.getPointBalance(), null, 32, null), new Function1() { // from class: jm.E
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C15002N.G((TrackingData) obj);
            }
        }));
    }

    public static final void E(ClaimReward reward, HomeMperksDecorator mperksDecorator, Function1<? super AbstractC13689c, Unit> onAction) {
        Intrinsics.j(reward, "reward");
        Intrinsics.j(mperksDecorator, "mperksDecorator");
        Intrinsics.j(onAction, "onAction");
        onAction.invoke(C14475b.a(new AbstractC13689c.RewardsMPerksClicked(new RewardDetail(null, reward.getImageUrl(), reward.getName(), null, reward.getDescription(), reward.getDisplayEnd(), reward.getTermsAndConditions(), null, null, null, null, null, 3977, null), true, reward.getCouponId(), reward.getDisplayEnd(), mperksDecorator.getPointBalance(), null, 32, null), new Function1() { // from class: jm.A
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C15002N.F((TrackingData) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit F(TrackingData trackWith) {
        Intrinsics.j(trackWith, "$this$trackWith");
        trackWith.p("mPerks rewards carousel: Reward clicked");
        trackWith.o("mPerks: Claim");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit G(TrackingData trackWith) {
        Intrinsics.j(trackWith, "$this$trackWith");
        trackWith.p("mPerks rewards carousel: Reward clicked");
        trackWith.o("mPerks: Rewards");
        return Unit.f142422a;
    }

    public static final void H(HomeMperksDecorator mperksDecorator, Function1<? super AbstractC13689c, Unit> onAction) {
        Intrinsics.j(mperksDecorator, "mperksDecorator");
        Intrinsics.j(onAction, "onAction");
        onAction.invoke(C14475b.a(new AbstractC13689c.YourRewardsMPerksViewAllClicked(mperksDecorator, null, 2, null), new Function1() { // from class: jm.y
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C15002N.I((TrackingData) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit I(TrackingData trackWith) {
        Intrinsics.j(trackWith, "$this$trackWith");
        trackWith.v("mPerks 4.0");
        trackWith.o("mPerks: Rewards");
        trackWith.p("mPerks rewards carousel: View All Rewards");
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0262  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void p(final Ji.LocalThemeScope r27, final fm.HomeMperksDecorator r28, androidx.compose.ui.Modifier r29, final kotlin.jvm.functions.Function1<? super em.AbstractC13689c, kotlin.Unit> r30, androidx.compose.runtime.Composer r31, final int r32, final int r33) {
        /*
            Method dump skipped, instructions count: 825
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jm.C15002N.p(Ji.M, fm.b, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(HomeMperksDecorator homeMperksDecorator, Function1 function1, ClaimReward it) {
        Intrinsics.j(it, "it");
        E(it, homeMperksDecorator, function1);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r(Function1 function1, long j10) {
        function1.invoke(new AbstractC13689c.OnClaimRewardClicked(j10));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s(Function1 function1, HomeMperksDecorator homeMperksDecorator) {
        function1.invoke(C14475b.a(new AbstractC13689c.RedeemMPerksViewAllClicked(homeMperksDecorator, null, 2, null), new Function1() { // from class: jm.D
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C15002N.t((TrackingData) obj);
            }
        }));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(TrackingData trackWith) {
        Intrinsics.j(trackWith, "$this$trackWith");
        trackWith.v("mPerks 4.0");
        trackWith.o("mPerks: Claim");
        trackWith.p("mPerks redeem carousel: View All Rewards");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u(Function1 function1, HomeMperksDecorator homeMperksDecorator, ClaimReward it) {
        Intrinsics.j(it, "it");
        function1.invoke(C14475b.a(new AbstractC13689c.OnClaimForButtonClicked(it, homeMperksDecorator.getPointBalance(), null, null, 12, null), new Function1() { // from class: jm.B
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C15002N.v((TrackingData) obj);
            }
        }));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v(TrackingData trackWith) {
        Intrinsics.j(trackWith, "$this$trackWith");
        trackWith.v("mPerks 4.0");
        trackWith.o("home");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit w(LocalThemeScope localThemeScope, HomeMperksDecorator homeMperksDecorator, Modifier modifier, Function1 function1, int i10, int i11, Composer composer, int i12) {
        p(localThemeScope, homeMperksDecorator, modifier, function1, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x022a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void x(final Ji.LocalThemeScope r22, final fm.HomeMperksDecorator r23, androidx.compose.ui.Modifier r24, final kotlin.jvm.functions.Function1<? super em.AbstractC13689c, kotlin.Unit> r25, androidx.compose.runtime.Composer r26, final int r27, final int r28) {
        /*
            Method dump skipped, instructions count: 656
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jm.C15002N.x(Ji.M, fm.b, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit y(HomeMperksDecorator homeMperksDecorator, Function1 function1, Vl.f it) {
        Intrinsics.j(it, "it");
        D(it, homeMperksDecorator, function1);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit z(HomeMperksDecorator homeMperksDecorator, Function1 function1) {
        H(homeMperksDecorator, function1);
        return Unit.f142422a;
    }
}
