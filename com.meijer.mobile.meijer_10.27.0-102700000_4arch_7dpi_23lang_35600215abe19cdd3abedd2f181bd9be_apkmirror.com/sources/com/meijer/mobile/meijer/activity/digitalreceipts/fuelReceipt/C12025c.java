package com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt;

import j$.time.LocalDate;
import j$.time.LocalTime;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import vk.C17590a;
import zp.TransactionDetails;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/meijer/mobile/meijer/activity/digitalreceipts/fuelReceipt/b;", "Lzp/i;", "a", "(Lcom/meijer/mobile/meijer/activity/digitalreceipts/fuelReceipt/b;)Lzp/i;", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt.c, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C12025c {
    public static final TransactionDetails a(FuelReceiptDecorator fuelReceiptDecorator) {
        Intrinsics.j(fuelReceiptDecorator, "<this>");
        int i10 = Integer.parseInt(fuelReceiptDecorator.getTxNumber().c().e());
        int i11 = Integer.parseInt(fuelReceiptDecorator.getTmNumber().c().e());
        int i12 = Integer.parseInt(fuelReceiptDecorator.getStNumber().c().e());
        LocalDate localDate = LocalDate.parse(fuelReceiptDecorator.getDate().c().e(), C17590a.MONTH_DAY_YEAR_SHORT);
        Intrinsics.i(localDate, "parse(...)");
        LocalTime localTime = LocalTime.parse(fuelReceiptDecorator.getTime().c().e(), C17590a.HOUR_MINUTE_SECOND_SHORT);
        Intrinsics.i(localTime, "parse(...)");
        return new TransactionDetails(i10, i11, i12, localDate, localTime);
    }
}
