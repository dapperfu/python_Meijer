package com.bazaarvoice.bvandroidsdk;

import com.bazaarvoice.bvandroidsdk.BVEventValues;
import com.bazaarvoice.bvandroidsdk.BVTransaction;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class BVTransactionEvent extends BVPiiEvent {
    private final BVTransaction transaction;

    public BVTransactionEvent(BVTransaction bVTransaction) {
        super(BVEventValues.BVEventClass.CONVERSION, BVEventValues.BVEventType.TRANSACTION);
        BVAnalyticsUtils.warnShouldNotBeEmpty("transaction", bVTransaction);
        this.transaction = bVTransaction;
    }

    @Override // com.bazaarvoice.bvandroidsdk.BVPiiEvent
    protected void getPIIEvent(Map<String, Object> map) {
        BVTransactionEvent bVTransactionEvent = new BVTransactionEvent(this.transaction);
        bVTransactionEvent.setAdditionalParams(map);
        bVTransactionEvent.setHadPiiConversion(true);
        BVPixel.getInstance().track(bVTransactionEvent);
    }

    @Override // com.bazaarvoice.bvandroidsdk.BVPiiEvent
    protected Map<String, Object> getPiiUnrelatedParams() {
        HashMap map = new HashMap();
        BVAnalyticsUtils.mapPutAllSafe(map, new BVTransaction.Mapper(this.transaction).toRaw());
        return map;
    }
}
