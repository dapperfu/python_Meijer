package Bl;

import Gp.ProductInfoForReviewSubmit;
import Gp.ProductInformation;
import Gp.ReviewItem;
import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"LBl/o;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "selectedIndex", "", "", "listOfImages", "Landroid/content/Intent;", "b", "(Landroid/content/Context;ILjava/util/List;)Landroid/content/Intent;", "LGp/e;", "review", "a", "(Landroid/content/Context;LGp/e;)Landroid/content/Intent;", "LGp/b;", "productInfo", "c", "(Landroid/content/Context;LGp/b;)Landroid/content/Intent;", "rating", "d", "(Landroid/content/Context;LGp/b;I)Landroid/content/Intent;", "LGp/a;", "e", "(Landroid/content/Context;LGp/a;)Landroid/content/Intent;", "featurenavigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public static final o f3147a = new o();

    @JvmStatic
    public static final Intent a(Context context, ReviewItem review) {
        Intrinsics.j(context, "context");
        Intrinsics.j(review, "review");
        Intent intentPutExtra = j.a(context, "com.meijer.mobile.review_detail").putExtra("com.meijer.intent.extra.REVIEW", review);
        Intrinsics.i(intentPutExtra, "putExtra(...)");
        return intentPutExtra;
    }

    @JvmStatic
    public static final Intent b(Context context, int selectedIndex, List<String> listOfImages) {
        Intrinsics.j(context, "context");
        Intrinsics.j(listOfImages, "listOfImages");
        Intent intentPutExtra = j.a(context, "com.meijer.mobile.review_gallery").putStringArrayListExtra("com.meijer.intent.extra.IMAGES_LIST_REVIEW", new ArrayList<>(listOfImages)).putExtra("com.meijer.intent.extra.IMAGE_POSITION_REVIEW", selectedIndex);
        Intrinsics.i(intentPutExtra, "putExtra(...)");
        return intentPutExtra;
    }

    public static /* synthetic */ Intent f(o oVar, Context context, ProductInfoForReviewSubmit aVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            aVar = null;
        }
        return oVar.e(context, aVar);
    }

    public final Intent c(Context context, ProductInformation productInfo) {
        Intrinsics.j(context, "context");
        Intrinsics.j(productInfo, "productInfo");
        Intent intentPutExtra = j.a(context, "com.meijer.mobile.review_list").putExtra("com.meijer.intent.extra.PRODUCT_INFORMATION", productInfo);
        Intrinsics.i(intentPutExtra, "putExtra(...)");
        return intentPutExtra;
    }

    public final Intent d(Context context, ProductInformation productInfo, int rating) {
        Intrinsics.j(context, "context");
        Intrinsics.j(productInfo, "productInfo");
        Intent intentPutExtra = j.a(context, "com.meijer.mobile.review_list").putExtra("com.meijer.mobile.reviews.ux.productreview.filter_and_sort.FILTER_BY_RATING", rating).putExtra("com.meijer.intent.extra.PRODUCT_INFORMATION", productInfo);
        Intrinsics.i(intentPutExtra, "putExtra(...)");
        return intentPutExtra;
    }

    public final Intent e(Context context, ProductInfoForReviewSubmit productInfo) {
        Intrinsics.j(context, "context");
        Intent intentPutExtra = j.a(context, "com.meijer.mobile.review_submit").putExtra("product_info", productInfo);
        Intrinsics.i(intentPutExtra, "putExtra(...)");
        return intentPutExtra;
    }

    private o() {
    }
}
