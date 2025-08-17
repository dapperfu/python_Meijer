package Hp;

import Gp.ProductRatings;
import Kp.ProductReviewDetails;
import Kp.ProductReviewFullDetails;
import Kp.ProductReviewOptionsDetails;
import Kp.RatingsDistribution;
import com.bazaarvoice.bvandroidsdk.BulkRatingsResponse;
import com.bazaarvoice.bvandroidsdk.Photo;
import com.bazaarvoice.bvandroidsdk.Product;
import com.bazaarvoice.bvandroidsdk.ProductDisplayPageResponse;
import com.bazaarvoice.bvandroidsdk.RatingDistribution;
import com.bazaarvoice.bvandroidsdk.Review;
import com.bazaarvoice.bvandroidsdk.ReviewResponse;
import com.bazaarvoice.bvandroidsdk.ReviewStatistics;
import com.bazaarvoice.bvandroidsdk.Statistics;
import j$.time.Instant;
import j$.util.DateRetargetClass;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u000f2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"LHp/d;", "", "<init>", "()V", "Lcom/bazaarvoice/bvandroidsdk/Review;", "LKp/b;", "a", "(Lcom/bazaarvoice/bvandroidsdk/Review;)LKp/b;", "Lcom/bazaarvoice/bvandroidsdk/ProductDisplayPageResponse;", "response", "LKp/c;", "b", "(Lcom/bazaarvoice/bvandroidsdk/ProductDisplayPageResponse;)LKp/c;", "Lcom/bazaarvoice/bvandroidsdk/ReviewResponse;", "reviewResponse", "", "d", "(Lcom/bazaarvoice/bvandroidsdk/ReviewResponse;)Ljava/util/List;", "Lcom/bazaarvoice/bvandroidsdk/BulkRatingsResponse;", "bulkRatingsResponse", "LGp/c;", "c", "(Lcom/bazaarvoice/bvandroidsdk/BulkRatingsResponse;)Ljava/util/List;", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class d {
    public final ProductReviewFullDetails b(ProductDisplayPageResponse response) throws NumberFormatException {
        List<Review> listM;
        double d10;
        Integer recommendedCount;
        RatingDistribution ratingDistribution;
        Integer fiveStarCount;
        RatingDistribution ratingDistribution2;
        Integer fourStarCount;
        RatingDistribution ratingDistribution3;
        Integer threeStarCount;
        RatingDistribution ratingDistribution4;
        Integer twoStarCount;
        RatingDistribution ratingDistribution5;
        Integer oneStarCount;
        Integer totalReviewCount;
        Float averageOverallRating;
        Product product;
        Product product2;
        Intrinsics.j(response, "response");
        List results = response.getResults();
        if (results == null || (product2 = (Product) CollectionsKt.u0(results)) == null || (listM = product2.getReviews()) == null) {
            listM = CollectionsKt.m();
        }
        List results2 = response.getResults();
        ReviewStatistics reviewStatistics = (results2 == null || (product = (Product) CollectionsKt.u0(results2)) == null) ? null : product.getReviewStatistics();
        List<Review> list = listM;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(a((Review) it.next()));
        }
        if (reviewStatistics == null || (averageOverallRating = reviewStatistics.getAverageOverallRating()) == null) {
            d10 = 0.0d;
        } else {
            double dFloatValue = averageOverallRating.floatValue();
            StringCompanionObject stringCompanionObject = StringCompanionObject.f142841a;
            String str = String.format("%.1f", Arrays.copyOf(new Object[]{Double.valueOf(dFloatValue)}, 1));
            Intrinsics.i(str, "format(...)");
            d10 = Double.parseDouble(str);
        }
        double d11 = d10;
        int iIntValue = 0;
        int iIntValue2 = (reviewStatistics == null || (totalReviewCount = reviewStatistics.getTotalReviewCount()) == null) ? 0 : totalReviewCount.intValue();
        RatingsDistribution ratingsDistribution = new RatingsDistribution((reviewStatistics == null || (ratingDistribution5 = reviewStatistics.getRatingDistribution()) == null || (oneStarCount = ratingDistribution5.getOneStarCount()) == null) ? 0 : oneStarCount.intValue(), (reviewStatistics == null || (ratingDistribution4 = reviewStatistics.getRatingDistribution()) == null || (twoStarCount = ratingDistribution4.getTwoStarCount()) == null) ? 0 : twoStarCount.intValue(), (reviewStatistics == null || (ratingDistribution3 = reviewStatistics.getRatingDistribution()) == null || (threeStarCount = ratingDistribution3.getThreeStarCount()) == null) ? 0 : threeStarCount.intValue(), (reviewStatistics == null || (ratingDistribution2 = reviewStatistics.getRatingDistribution()) == null || (fourStarCount = ratingDistribution2.getFourStarCount()) == null) ? 0 : fourStarCount.intValue(), (reviewStatistics == null || (ratingDistribution = reviewStatistics.getRatingDistribution()) == null || (fiveStarCount = ratingDistribution.getFiveStarCount()) == null) ? 0 : fiveStarCount.intValue());
        if (reviewStatistics != null && (recommendedCount = reviewStatistics.getRecommendedCount()) != null) {
            iIntValue = recommendedCount.intValue();
        }
        return new ProductReviewFullDetails(arrayList, new ProductReviewOptionsDetails(d11, iIntValue2, ratingsDistribution, iIntValue, null, null, 48, null));
    }

    public final List<ProductRatings> c(BulkRatingsResponse bulkRatingsResponse) {
        Intrinsics.j(bulkRatingsResponse, "bulkRatingsResponse");
        List<Statistics> results = bulkRatingsResponse.getResults();
        Intrinsics.i(results, "getResults(...)");
        List<Statistics> list = results;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
        for (Statistics statistics : list) {
            ReviewStatistics reviewStatistics = statistics.getProductStatistics().getReviewStatistics();
            double dFloatValue = reviewStatistics.getAverageOverallRating().floatValue();
            Integer totalReviewCount = reviewStatistics.getTotalReviewCount();
            Intrinsics.i(totalReviewCount, "getTotalReviewCount(...)");
            int iIntValue = totalReviewCount.intValue();
            String productId = statistics.getProductStatistics().getProductId();
            Intrinsics.i(productId, "getProductId(...)");
            arrayList.add(new ProductRatings(dFloatValue, iIntValue, productId));
        }
        return arrayList;
    }

    public final List<ProductReviewDetails> d(ReviewResponse reviewResponse) {
        Intrinsics.j(reviewResponse, "reviewResponse");
        List results = reviewResponse.getResults();
        Intrinsics.g(results);
        List<Review> list = results;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
        for (Review review : list) {
            Intrinsics.g(review);
            arrayList.add(a(review));
        }
        return arrayList;
    }

    private final ProductReviewDetails a(Review review) {
        String str;
        String str2;
        int iIntValue;
        String str3;
        String str4;
        int iIntValue2;
        Photo photo;
        String normalUrl;
        Photo.Content content;
        String id2 = review.getId();
        if (id2 == null) {
            str = "";
        } else {
            str = id2;
        }
        Instant instant = DateRetargetClass.toInstant(review.getSubmissionDate());
        Intrinsics.i(instant, "toInstant(...)");
        String userNickname = review.getUserNickname();
        if (userNickname == null) {
            str2 = "";
        } else {
            str2 = userNickname;
        }
        Integer rating = review.getRating();
        int iIntValue3 = 0;
        if (rating != null) {
            iIntValue = rating.intValue();
        } else {
            iIntValue = 0;
        }
        String title = review.getTitle();
        if (title == null) {
            str3 = "";
        } else {
            str3 = title;
        }
        String reviewText = review.getReviewText();
        if (reviewText == null) {
            str4 = "";
        } else {
            str4 = reviewText;
        }
        Boolean recommended = review.getRecommended();
        Integer totalPositiveFeedbackCount = review.getTotalPositiveFeedbackCount();
        if (totalPositiveFeedbackCount != null) {
            iIntValue2 = totalPositiveFeedbackCount.intValue();
        } else {
            iIntValue2 = 0;
        }
        Integer totalNegativeFeedbackCount = review.getTotalNegativeFeedbackCount();
        if (totalNegativeFeedbackCount != null) {
            iIntValue3 = totalNegativeFeedbackCount.intValue();
        }
        int i10 = iIntValue3;
        List photos = review.getPhotos();
        List listM = null;
        if (photos != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : photos) {
                if (obj instanceof Photo) {
                    photo = (Photo) obj;
                } else {
                    photo = null;
                }
                if (photo != null && (content = photo.getContent()) != null) {
                    normalUrl = content.getNormalUrl();
                } else {
                    normalUrl = null;
                }
                if (normalUrl != null) {
                    arrayList.add(normalUrl);
                }
            }
            listM = arrayList;
        }
        if (listM == null) {
            listM = CollectionsKt.m();
        }
        return new ProductReviewDetails(str, instant, str2, iIntValue, str3, str4, recommended, iIntValue2, i10, listM);
    }
}
