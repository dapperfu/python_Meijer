package Kh;

import Fh.a;
import Hh.A;
import Hh.C3668a;
import Hh.OrdersCardViewState;
import Hh.e;
import Hh.o;
import Hh.s;
import Ji.LocalThemeScope;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import bi.SubscriptionCardViewState;
import com.meijer.mobile.accounts.ux.basescreen.p;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0081\u0001\u0010\u001a\u001a\u00020\u0018*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u00142\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0016H\u0007¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001f²\u0006\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001e\u001a\u00020\u001c8\n@\nX\u008a\u008e\u0002"}, d2 = {"LJi/M;", "Lcom/meijer/mobile/accounts/ux/basescreen/p$a;", "accountOverviewViewState", "LHh/s$b;", "profileCardViewState", "LHh/a$a;", "addressesCardViewState", "LHh/o$a;", "paymentsCardViewState", "LHh/e$a;", "communicationsCardViewState", "LHh/A$a;", "yourMeijerStoreCardViewState", "LHh/n;", "ordersCardViewState", "Lbi/a;", "subscriptionCardViewState", "", "isAccountsBetaEnabled", "isProductSubscriptionFlagEnabled", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "LFh/a;", "", "onNavigationRequest", "c", "(LJi/M;Lcom/meijer/mobile/accounts/ux/basescreen/p$a;LHh/s$b;LHh/a$a;LHh/o$a;LHh/e$a;LHh/A$a;LHh/n;Lbi/a;ZZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "", "lastAction", "state", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: Kh.p, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C4012p {
    /* JADX WARN: Removed duplicated region for block: B:143:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x04a2  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0504  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0561  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0563  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0572  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x059b  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x05dc  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x05e7  */
    /* JADX WARN: Removed duplicated region for block: B:217:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(final Ji.LocalThemeScope r42, final com.meijer.mobile.accounts.ux.basescreen.p.AccountOverviewViewState r43, final Hh.s.ProfileCardViewState r44, final Hh.C3668a.AddressesCardViewState r45, final Hh.o.PaymentsCardViewState r46, final Hh.e.CommunicationsCardViewState r47, final Hh.A.YourMeijerStoreCardViewState r48, final Hh.OrdersCardViewState r49, final bi.SubscriptionCardViewState r50, final boolean r51, final boolean r52, androidx.compose.ui.Modifier r53, final kotlin.jvm.functions.Function1<? super Fh.a, kotlin.Unit> r54, androidx.compose.runtime.Composer r55, final int r56, final int r57, final int r58) {
        /*
            Method dump skipped, instructions count: 1553
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Kh.C4012p.c(Ji.M, com.meijer.mobile.accounts.ux.basescreen.p$a, Hh.s$b, Hh.a$a, Hh.o$a, Hh.e$a, Hh.A$a, Hh.n, bi.a, boolean, boolean, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(Function1 function1) {
        function1.invoke(a.t.f10433a);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(LocalThemeScope localThemeScope, p.AccountOverviewViewState accountOverviewViewState, s.ProfileCardViewState profileCardViewState, C3668a.AddressesCardViewState addressesCardViewState, o.PaymentsCardViewState paymentsCardViewState, e.CommunicationsCardViewState communicationsCardViewState, A.YourMeijerStoreCardViewState yourMeijerStoreCardViewState, OrdersCardViewState ordersCardViewState, SubscriptionCardViewState subscriptionCardViewState, boolean z10, boolean z11, Modifier modifier, Function1 function1, int i10, int i11, int i12, Composer composer, int i13) {
        c(localThemeScope, accountOverviewViewState, profileCardViewState, addressesCardViewState, paymentsCardViewState, communicationsCardViewState, yourMeijerStoreCardViewState, ordersCardViewState, subscriptionCardViewState, z10, z11, modifier, function1, composer, androidx.compose.runtime.J0.a(i10 | 1), androidx.compose.runtime.J0.a(i11), i12);
        return Unit.f142422a;
    }
}
