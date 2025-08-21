package Lv;

import Vl.MarketingBanner;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import mobile.meijer.com.target.models.TargetBannerResponse;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lmobile/meijer/com/target/models/TargetBannerResponse;", "LVl/i;", "a", "(Lmobile/meijer/com/target/models/TargetBannerResponse;)LVl/i;", "target_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class a {
    public static final MarketingBanner a(TargetBannerResponse targetBannerResponse) {
        if (targetBannerResponse == null || targetBannerResponse.getBannerImg().length() == 0) {
            return null;
        }
        String bannerImgAltText = targetBannerResponse.getBannerImgAltText();
        if (bannerImgAltText.length() == 0) {
            bannerImgAltText = null;
        }
        String bannerImg = targetBannerResponse.getBannerImg();
        String mmaDeepLink = targetBannerResponse.getMmaDeepLink();
        if (mmaDeepLink.length() == 0) {
            mmaDeepLink = targetBannerResponse.getLinkDestinationURL();
        }
        String str = mmaDeepLink.length() != 0 ? mmaDeepLink : null;
        Pair pairA = TuplesKt.a("position", "0");
        String analyticsTag = targetBannerResponse.getAnalyticsTag();
        if (analyticsTag == null) {
            analyticsTag = "";
        }
        return new MarketingBanner(bannerImgAltText, bannerImg, str, MapsKt.o(pairA, TuplesKt.a("campaignId", analyticsTag)));
    }
}
