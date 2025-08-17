package com.radiusnetworks.flybuy.sdk.data.site;

import com.radiusnetworks.flybuy.api.model.GetSitesResponse;
import com.radiusnetworks.flybuy.api.model.PickupConfig;
import com.radiusnetworks.flybuy.api.model.Site;
import com.radiusnetworks.flybuy.api.model.SitesIncluded;
import com.radiusnetworks.flybuy.sdk.data.common.PaginationKt;
import com.radiusnetworks.flybuy.sdk.data.pickup_config.PickupConfigKt;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"toPaginatedSites", "Lcom/radiusnetworks/flybuy/sdk/data/site/PaginatedSites;", "Lcom/radiusnetworks/flybuy/api/model/GetSitesResponse;", "core_defaultRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class PaginatedSitesKt {
    public static final PaginatedSites toPaginatedSites(GetSitesResponse getSitesResponse) {
        List listM;
        List<PickupConfig> pickupConfigs;
        Intrinsics.j(getSitesResponse, "<this>");
        SitesIncluded included = getSitesResponse.getIncluded();
        Map<Integer, com.radiusnetworks.flybuy.sdk.data.pickup_config.PickupConfig> pickupConfigs2 = (included == null || (pickupConfigs = included.getPickupConfigs()) == null) ? null : PickupConfigKt.toPickupConfigs(pickupConfigs);
        List<Site> data = getSitesResponse.getData();
        if (data != null) {
            listM = new ArrayList(CollectionsKt.x(data, 10));
            for (Site site : data) {
                listM.add(new com.radiusnetworks.flybuy.sdk.data.room.domain.Site(site, pickupConfigs2 != null ? pickupConfigs2.get(site.getPickupConfigId()) : null));
            }
        } else {
            listM = CollectionsKt.m();
        }
        return new PaginatedSites(listM, PaginationKt.toPagination(getSitesResponse.getPages()));
    }
}
