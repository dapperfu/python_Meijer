package com.meijer.mobile.mperks.networking.domain.models;

import Ch.a;
import io.ExpiringPoints;
import j$.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import vk.C17590a;
import vk.d;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/meijer/mobile/mperks/networking/domain/models/ExpiringPointsResponse;", "Lio/a;", "toDomain", "(Lcom/meijer/mobile/mperks/networking/domain/models/ExpiringPointsResponse;)Lio/a;", "networking_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ExpiringPointsResponseKt {
    public static final ExpiringPoints toDomain(ExpiringPointsResponse expiringPointsResponse) {
        Intrinsics.j(expiringPointsResponse, "<this>");
        int points = expiringPointsResponse.getPoints();
        String expiresOnString$networking_release = expiringPointsResponse.getExpiresOnString$networking_release();
        return new ExpiringPoints(points, expiresOnString$networking_release != null ? (LocalDate) d.b(expiresOnString$networking_release, C17590a.ISO_LOCAL_DATE, new a()) : null);
    }
}
