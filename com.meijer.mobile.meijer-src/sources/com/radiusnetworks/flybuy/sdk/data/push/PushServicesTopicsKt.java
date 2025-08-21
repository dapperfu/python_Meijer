package com.radiusnetworks.flybuy.sdk.data.push;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"toPushServicesTopics", "Lcom/radiusnetworks/flybuy/sdk/data/push/PushServicesTopics;", "Lcom/radiusnetworks/flybuy/api/model/PushServicesTopics;", "core_defaultRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PushServicesTopicsKt {
    public static final PushServicesTopics toPushServicesTopics(com.radiusnetworks.flybuy.api.model.PushServicesTopics pushServicesTopics) {
        Intrinsics.j(pushServicesTopics, "<this>");
        return new PushServicesTopics(pushServicesTopics.getFcmTopic(), pushServicesTopics.getAirshipTag(), pushServicesTopics.getOneSignal().getTagKey(), pushServicesTopics.getOneSignal().getTagValue());
    }
}
