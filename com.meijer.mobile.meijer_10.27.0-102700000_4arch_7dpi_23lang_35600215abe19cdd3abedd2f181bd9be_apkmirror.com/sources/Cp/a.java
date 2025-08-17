package Cp;

import com.meijer.mobile.receipt.service.api.models.CustomerSavingsResponseJson;
import j$.time.LocalDateTime;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import th.j;
import vk.C17590a;
import zp.CustomerSavings;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/meijer/mobile/receipt/service/api/models/CustomerSavingsResponseJson;", "Lzp/a;", "a", "(Lcom/meijer/mobile/receipt/service/api/models/CustomerSavingsResponseJson;)Lzp/a;", "service_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a {
    public static final CustomerSavings a(CustomerSavingsResponseJson customerSavingsResponseJson) {
        Intrinsics.j(customerSavingsResponseJson, "<this>");
        double spendingTotal = customerSavingsResponseJson.getSpendingTotal();
        double mPerksTotal = customerSavingsResponseJson.getMPerksTotal();
        double specialsTotal = customerSavingsResponseJson.getSpecialsTotal();
        double couponsTotal = customerSavingsResponseJson.getCouponsTotal();
        double teamMemberTotal = customerSavingsResponseJson.getTeamMemberTotal();
        double savingsTotal = customerSavingsResponseJson.getSavingsTotal();
        int savingsPercentage = customerSavingsResponseJson.getSavingsPercentage();
        Object objA = vk.d.a(customerSavingsResponseJson.getSavingsSinceDate(), C17590a.f164803a.s(), new j());
        Intrinsics.i(objA, "toDateTime(...)");
        return new CustomerSavings(spendingTotal, mPerksTotal, specialsTotal, couponsTotal, teamMemberTotal, savingsTotal, savingsPercentage, (LocalDateTime) objA);
    }
}
