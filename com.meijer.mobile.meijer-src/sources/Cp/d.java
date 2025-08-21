package Cp;

import com.meijer.mobile.receipt.service.api.models.MonthSavingsSummaryJson;
import j$.time.YearMonth;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import zp.MonthSavingsSummary;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/meijer/mobile/receipt/service/api/models/MonthSavingsSummaryJson;", "Lzp/e;", "a", "(Lcom/meijer/mobile/receipt/service/api/models/MonthSavingsSummaryJson;)Lzp/e;", "service_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class d {
    public static final MonthSavingsSummary a(MonthSavingsSummaryJson monthSavingsSummaryJson) {
        Intrinsics.j(monthSavingsSummaryJson, "<this>");
        YearMonth yearMonthOf = YearMonth.of(monthSavingsSummaryJson.getYear(), monthSavingsSummaryJson.getMonth());
        Intrinsics.i(yearMonthOf, "of(...)");
        return new MonthSavingsSummary(yearMonthOf, monthSavingsSummaryJson.getSavingsTotal(), monthSavingsSummaryJson.getSavingsPercentage(), monthSavingsSummaryJson.getSpendingAmount(), monthSavingsSummaryJson.getMPerksAmount(), monthSavingsSummaryJson.getSpecialsAmount(), monthSavingsSummaryJson.getCouponsAmount(), monthSavingsSummaryJson.getTeamMemberAmount());
    }
}
