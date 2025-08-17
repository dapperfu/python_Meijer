package com.meijer.mobile.mperks.networking.domain.models;

import io.ExpiringPoints;
import io.MperksPointsExpiry;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/meijer/mobile/mperks/networking/domain/models/MperksPointsExpiryResponse;", "Lio/c;", "toDomain", "(Lcom/meijer/mobile/mperks/networking/domain/models/MperksPointsExpiryResponse;)Lio/c;", "networking_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class MperksPointsExpiryResponseKt {
    public static final MperksPointsExpiry toDomain(MperksPointsExpiryResponse mperksPointsExpiryResponse) {
        Intrinsics.j(mperksPointsExpiryResponse, "<this>");
        boolean success = mperksPointsExpiryResponse.getSuccess();
        List<ExpiringPointsResponse> payload = mperksPointsExpiryResponse.getPayload();
        ArrayList arrayList = new ArrayList();
        for (ExpiringPointsResponse expiringPointsResponse : payload) {
            ExpiringPoints domain = expiringPointsResponse != null ? ExpiringPointsResponseKt.toDomain(expiringPointsResponse) : null;
            if (domain != null) {
                arrayList.add(domain);
            }
        }
        return new MperksPointsExpiry(success, arrayList);
    }
}
