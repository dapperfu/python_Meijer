package com.bazaarvoice.bvandroidsdk;

import com.bazaarvoice.bvandroidsdk.BVEventValues;
import java.util.HashMap;

/* loaded from: classes4.dex */
public class CurationsAnalyticsManager {
    private final BVPixel bvPixel;
    private final BVEventValues.BVProductType bvProductType = BVEventValues.BVProductType.CURATIONS;

    private String externalIdToProductId(String str) {
        return (str == null || str.isEmpty()) ? "none" : str;
    }

    public void sendBvViewGroupAddedToHierarchyEvent(String str, ReportingGroup reportingGroup) {
        BVFeatureUsedEvent bVFeatureUsedEvent = new BVFeatureUsedEvent("none", this.bvProductType, BVEventValues.BVFeatureUsedEventType.IN_VIEW, null);
        HashMap map = new HashMap();
        map.put("component", reportingGroup.toString());
        map.put("detail1", str);
        bVFeatureUsedEvent.setAdditionalParams(map);
        this.bvPixel.track(bVFeatureUsedEvent);
    }

    public void sendUGCImpressionEvent(CurationsFeedItem curationsFeedItem) {
        if ((curationsFeedItem == null || !curationsFeedItem.impressed) && curationsFeedItem != null) {
            curationsFeedItem.impressed = true;
            BVImpressionEvent bVImpressionEvent = new BVImpressionEvent(curationsFeedItem.getExternalIdInQuery() != null ? curationsFeedItem.getExternalIdInQuery() : "none", curationsFeedItem.getId() != null ? String.valueOf(curationsFeedItem.getId()) : "none", this.bvProductType, BVEventValues.BVImpressionContentType.CURATIONS_FEED_ITEM, null, null);
            HashMap map = new HashMap();
            map.put("syndicationSource", curationsFeedItem.getSourceClient());
            bVImpressionEvent.setAdditionalParams(map);
            this.bvPixel.track(bVImpressionEvent);
        }
    }

    public void sendUsedFeatureEventTapped(CurationsFeedItem curationsFeedItem) {
        if (curationsFeedItem == null) {
            return;
        }
        String channel = curationsFeedItem.getChannel();
        BVFeatureUsedEvent bVFeatureUsedEvent = new BVFeatureUsedEvent(externalIdToProductId(curationsFeedItem.getExternalIdInQuery()), this.bvProductType, BVEventValues.BVFeatureUsedEventType.CONTENT_CLICK, null);
        HashMap map = new HashMap();
        map.put("detail1", channel);
        map.put("interaction", Boolean.TRUE);
        bVFeatureUsedEvent.setAdditionalParams(map);
        this.bvPixel.track(bVFeatureUsedEvent);
    }

    public CurationsAnalyticsManager(BVSDK bvsdk) {
        this.bvPixel = bvsdk.getBvPixel();
    }

    public void sendEmbeddedPageView(String str, ReportingGroup reportingGroup) {
        BVPageViewEvent bVPageViewEvent = new BVPageViewEvent(externalIdToProductId(str), this.bvProductType, null);
        HashMap map = new HashMap();
        map.put("reportingGroup", reportingGroup.toString());
        bVPageViewEvent.setAdditionalParams(map);
        this.bvPixel.track(bVPageViewEvent);
    }

    public void sendUploadPhotoFeatureEvent(String str) {
        this.bvPixel.track(new BVFeatureUsedEvent(externalIdToProductId(str), this.bvProductType, BVEventValues.BVFeatureUsedEventType.PHOTO, null));
    }

    public void sendUsedFeatureEventScrolled(String str) {
        this.bvPixel.track(new BVFeatureUsedEvent(externalIdToProductId(str), BVEventValues.BVProductType.CURATIONS, BVEventValues.BVFeatureUsedEventType.SCROLLED, null));
    }
}
