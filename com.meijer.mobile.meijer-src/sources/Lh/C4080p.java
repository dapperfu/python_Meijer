package Lh;

import Gh.a;
import Ih.A;
import Ih.C3834a;
import Ih.OrdersCardViewState;
import Ih.e;
import Ih.o;
import Ih.s;
import Ki.LocalThemeScope;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import ci.SubscriptionCardViewState;
import com.meijer.mobile.accounts.ux.basescreen.p;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0081\u0001\u0010\u001a\u001a\u00020\u0018*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u00142\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0016H\u0007¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001f²\u0006\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001e\u001a\u00020\u001c8\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "Lcom/meijer/mobile/accounts/ux/basescreen/p$a;", "accountOverviewViewState", "LIh/s$b;", "profileCardViewState", "LIh/a$a;", "addressesCardViewState", "LIh/o$a;", "paymentsCardViewState", "LIh/e$a;", "communicationsCardViewState", "LIh/A$a;", "yourMeijerStoreCardViewState", "LIh/n;", "ordersCardViewState", "Lci/a;", "subscriptionCardViewState", "", "isAccountsBetaEnabled", "isProductSubscriptionFlagEnabled", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "LGh/a;", "", "onNavigationRequest", "c", "(LKi/M;Lcom/meijer/mobile/accounts/ux/basescreen/p$a;LIh/s$b;LIh/a$a;LIh/o$a;LIh/e$a;LIh/A$a;LIh/n;Lci/a;ZZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "", "lastAction", "state", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: Lh.p, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4080p {
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
    public static final void c(final Ki.LocalThemeScope r42, final com.meijer.mobile.accounts.ux.basescreen.p.AccountOverviewViewState r43, final Ih.s.ProfileCardViewState r44, final Ih.C3834a.AddressesCardViewState r45, final Ih.o.PaymentsCardViewState r46, final Ih.e.CommunicationsCardViewState r47, final Ih.A.YourMeijerStoreCardViewState r48, final Ih.OrdersCardViewState r49, final ci.SubscriptionCardViewState r50, final boolean r51, final boolean r52, androidx.compose.ui.Modifier r53, final kotlin.jvm.functions.Function1<? super Gh.a, kotlin.Unit> r54, androidx.compose.runtime.Composer r55, final int r56, final int r57, final int r58) {
        /*
            Method dump skipped, instructions count: 1553
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Lh.C4080p.c(Ki.M, com.meijer.mobile.accounts.ux.basescreen.p$a, Ih.s$b, Ih.a$a, Ih.o$a, Ih.e$a, Ih.A$a, Ih.n, ci.a, boolean, boolean, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(Function1 function1) {
        function1.invoke(a.t.f12624a);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(LocalThemeScope localThemeScope, p.AccountOverviewViewState accountOverviewViewState, s.ProfileCardViewState profileCardViewState, C3834a.AddressesCardViewState addressesCardViewState, o.PaymentsCardViewState paymentsCardViewState, e.CommunicationsCardViewState communicationsCardViewState, A.YourMeijerStoreCardViewState yourMeijerStoreCardViewState, OrdersCardViewState ordersCardViewState, SubscriptionCardViewState subscriptionCardViewState, boolean z10, boolean z11, Modifier modifier, Function1 function1, int i10, int i11, int i12, Composer composer, int i13) {
        c(localThemeScope, accountOverviewViewState, profileCardViewState, addressesCardViewState, paymentsCardViewState, communicationsCardViewState, yourMeijerStoreCardViewState, ordersCardViewState, subscriptionCardViewState, z10, z11, modifier, function1, composer, androidx.compose.runtime.J0.a(i10 | 1), androidx.compose.runtime.J0.a(i11), i12);
        return Unit.f143329a;
    }
}
