package ul;

import com.meijer.mobile.digitalshopping.api.timeslots.model.ValidateReservationSlotOmsResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import tl.ReservationSlotValidation;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/meijer/mobile/digitalshopping/api/timeslots/model/ValidateReservationSlotOmsResponse;", "Ltl/e;", "a", "(Lcom/meijer/mobile/digitalshopping/api/timeslots/model/ValidateReservationSlotOmsResponse;)Ltl/e;", "digitalshopping_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: ul.h, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C17277h {
    public static final ReservationSlotValidation a(ValidateReservationSlotOmsResponse validateReservationSlotOmsResponse) {
        Intrinsics.j(validateReservationSlotOmsResponse, "<this>");
        return new ReservationSlotValidation(validateReservationSlotOmsResponse.getIsReservationSlotAvailable());
    }
}
