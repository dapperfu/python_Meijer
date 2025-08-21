package bm;

import Vl.MarketingBanner;
import com.meijer.mobile.home.service.models.contentManagementSystem.CMSBanner;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/meijer/mobile/home/service/models/contentManagementSystem/CMSBanner;", "LVl/i;", "a", "(Lcom/meijer/mobile/home/service/models/contentManagementSystem/CMSBanner;)LVl/i;", "service_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: bm.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C6395a {
    public static final MarketingBanner a(CMSBanner cMSBanner) {
        Intrinsics.j(cMSBanner, "<this>");
        String bannerURL = cMSBanner.getBannerURL();
        if (bannerURL == null || bannerURL.length() == 0) {
            return null;
        }
        String bannerURL2 = cMSBanner.getBannerURL();
        String deeplinkURL = cMSBanner.getDeeplinkURL();
        if (deeplinkURL == null || deeplinkURL.length() == 0) {
            deeplinkURL = null;
        }
        Pair pairA = TuplesKt.a("position", String.valueOf(cMSBanner.getLocationIndex()));
        String analyticsTag = cMSBanner.getAnalyticsTag();
        if (analyticsTag == null) {
            analyticsTag = "";
        }
        return new MarketingBanner(null, bannerURL2, deeplinkURL, MapsKt.o(pairA, TuplesKt.a("campaignId", analyticsTag)));
    }
}
