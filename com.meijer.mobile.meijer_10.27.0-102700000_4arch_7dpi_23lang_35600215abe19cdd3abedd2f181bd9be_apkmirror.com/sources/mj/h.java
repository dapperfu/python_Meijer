package mj;

import com.meijer.mobile.cart.model.hybris.orderdetails.TipDetailsResponse;
import gj.TipDetails;
import gj.p;
import j$.time.OffsetDateTime;
import jj.r;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import vk.C17590a;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/meijer/mobile/cart/model/hybris/orderdetails/TipDetailsResponse;", "Lgj/o;", "b", "(Lcom/meijer/mobile/cart/model/hybris/orderdetails/TipDetailsResponse;)Lgj/o;", "", "status", "Lgj/p;", "a", "(Ljava/lang/String;)Lgj/p;", "hybris_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class h {
    public static final TipDetails b(TipDetailsResponse tipDetailsResponse) {
        Intrinsics.j(tipDetailsResponse, "<this>");
        String tipOrderCode = tipDetailsResponse.getTipOrderCode();
        boolean tipped = tipDetailsResponse.getTipped();
        boolean preTip = tipDetailsResponse.getPreTip();
        p pVarA = a(tipDetailsResponse.getPreTipStatus());
        p pVarA2 = a(tipDetailsResponse.getStatus());
        String authCode = tipDetailsResponse.getAuthCode();
        mk.b bVarA = Lo.b.a(tipDetailsResponse.getTipAmount());
        double percent = tipDetailsResponse.getPercent();
        String date = tipDetailsResponse.getDate();
        return new TipDetails(tipOrderCode, tipped, preTip, pVarA, pVarA2, authCode, bVarA, percent, date != null ? (OffsetDateTime) vk.d.b(date, C17590a.f164803a.s(), new r()) : null);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    private static final p a(String str) {
        switch (str.hashCode()) {
            case -1757359925:
                if (str.equals("INITIATED")) {
                    return p.f133691f;
                }
                break;
            case -1149187101:
                if (str.equals("SUCCESS")) {
                    return p.f133687b;
                }
                break;
            case 514782683:
                if (str.equals("PAYMENT_AUTH_FAILED")) {
                    return p.f133688c;
                }
                break;
            case 821551855:
                if (str.equals("PAYMENT_CAPTURE_FAILED")) {
                    return p.f133689d;
                }
                break;
            case 2066319421:
                if (str.equals("FAILED")) {
                    return p.f133686a;
                }
                break;
        }
        return p.f133690e;
    }
}
