package com.radiusnetworks.flybuy.sdk.data.push;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0000\u001a\u0015\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0002\u0010\u0003\u001a\u000e\u0010\u0004\u001a\u0004\u0018\u00010\u0005*\u00020\u0006H\u0000\u001a\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u0005*\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0007H\u0000¨\u0006\b"}, d2 = {"toBooleanFromPush", "", "", "(Ljava/lang/String;)Ljava/lang/Boolean;", "toFlybuyPushData", "Lcom/radiusnetworks/flybuy/sdk/data/push/FlybuyPushData;", "Lcom/radiusnetworks/flybuy/sdk/data/push/PushMessagePayload;", "", "core_defaultRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FlybuyPushDataKt {
    public static final FlybuyPushData toFlybuyPushData(PushMessagePayload pushMessagePayload) {
        Intrinsics.j(pushMessagePayload, "<this>");
        if (Intrinsics.e(pushMessagePayload.getMessageSource(), FlybuyPushData.MESSAGE_SOURCE_FLYBUY)) {
            return new FlybuyPushData(pushMessagePayload.getFlybuyMessageType(), pushMessagePayload.getId(), pushMessagePayload.getOrderState(), pushMessagePayload.getCustomerState(), pushMessagePayload.getEtaAt(), toBooleanFromPush(pushMessagePayload.getLocationTrackingEnabled()), toBooleanFromPush(pushMessagePayload.getForceSyncAppConfig()), toBooleanFromPush(pushMessagePayload.getForceSyncNotifyCampaigns()), pushMessagePayload.getWrongSiteId(), pushMessagePayload.getEstimatedReadyAt(), pushMessagePayload.getOrderFiredAt(), pushMessagePayload.getPickupType(), pushMessagePayload.getCustomerCarColor(), pushMessagePayload.getCustomerCarType(), pushMessagePayload.getCustomerLicensePlate(), pushMessagePayload.getHandoffVehicleLocation());
        }
        return null;
    }

    public static final Boolean toBooleanFromPush(String str) {
        if (str == null) {
            return null;
        }
        boolean z10 = true;
        if (!Intrinsics.e(str, "1") && !StringsKt.H(str, "true", true)) {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }

    public static final FlybuyPushData toFlybuyPushData(Map<String, String> map) {
        Intrinsics.j(map, "<this>");
        PushMessagePayload pushMessagePayload = PushMessagePayloadKt.toPushMessagePayload(map);
        if (pushMessagePayload != null) {
            return toFlybuyPushData(pushMessagePayload);
        }
        return null;
    }
}
