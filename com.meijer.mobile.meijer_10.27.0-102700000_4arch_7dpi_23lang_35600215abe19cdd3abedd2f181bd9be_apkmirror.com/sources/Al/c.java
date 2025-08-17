package Al;

import Fq.ShoppingListItem;
import Rk.CouponOptions;
import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ=\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J1\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u00102\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0007¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"LAl/c;", "", "<init>", "()V", "Landroid/content/Context;", "context", "LPk/c;", "activeCouponPage", "LRk/a;", "couponOptions", "Landroid/content/Intent;", "a", "(Landroid/content/Context;LPk/c;LRk/a;)Landroid/content/Intent;", "", "hatId", "hatName", "", "isLaunchedFromDeeplink", "isNewCouponListPageEnabled", "b", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZZ)Landroid/content/Intent;", "", "LFq/c;", "shoppingList", "c", "(Landroid/content/Context;ZLjava/util/List;)Landroid/content/Intent;", "featurenavigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f663a = new c();

    @JvmStatic
    public static final Intent a(Context context, Pk.c activeCouponPage, CouponOptions couponOptions) {
        Intrinsics.j(context, "context");
        Intrinsics.j(activeCouponPage, "activeCouponPage");
        Intrinsics.j(couponOptions, "couponOptions");
        Intent intentPutExtra = new Intent("action.com.meijer.mobile.coupon.filter").setPackage(context.getPackageName()).putExtra("com.meijer.intent.extra.EXTRA_COUPON_ACTIVE_PAGE", activeCouponPage).putExtra("com.meijer.intent.extra.EXTRA_COUPON_OPTIONS", couponOptions);
        Intrinsics.i(intentPutExtra, "putExtra(...)");
        return intentPutExtra;
    }

    @JvmStatic
    public static final Intent b(Context context, String hatId, String hatName, boolean isLaunchedFromDeeplink, boolean isNewCouponListPageEnabled) {
        Intrinsics.j(context, "context");
        Intent intentPutExtra = (isNewCouponListPageEnabled ? new Intent("action.com.meijer.mobile.coupon.list") : new Intent("action.com.meijer.mobile.coupon.coupons_feature")).setPackage(context.getPackageName()).putExtra("com.meijer.intent.extra.EXTRA_COUPON_ACTIVE_PAGE", Pk.c.f28335k).putExtra("com.meijer.intent.extra.EXTRA_COUPON_OPTIONS", new CouponOptions(null, null, null, false, false, 0L, hatId == null ? "" : hatId, hatName == null ? "" : hatName, false, null, null, false, false, 7999, null)).putExtra("com.meijer.intent.extra.EXTRA_COUPON_IS_LAUNCHED_FROM_DEEPLINK", isLaunchedFromDeeplink);
        Intrinsics.i(intentPutExtra, "putExtra(...)");
        return intentPutExtra;
    }

    @JvmStatic
    public static final Intent c(Context context, boolean isNewCouponListPageEnabled, List<ShoppingListItem> shoppingList) {
        Intrinsics.j(context, "context");
        Intrinsics.j(shoppingList, "shoppingList");
        if (isNewCouponListPageEnabled) {
            Intent intentPutParcelableArrayListExtra = new Intent("action.com.meijer.mobile.coupon.list").setPackage(context.getPackageName()).putExtra("com.meijer.intent.extra.EXTRA_COUPON_OPTIONS", new CouponOptions(null, null, null, false, false, 0L, null, null, false, null, null, false, false, 8191, null)).putExtra("com.meijer.intent.extra.EXTRA_COUPON_ACTIVE_PAGE", Pk.c.f28337m).putParcelableArrayListExtra("com.meijer.intent.extra.EXTRA_SHOPPING_LIST", new ArrayList<>(shoppingList));
            Intrinsics.g(intentPutParcelableArrayListExtra);
            return intentPutParcelableArrayListExtra;
        }
        Intent intent = new Intent("action.com.meijer.mobile.coupon.related_shopping_list").setPackage(context.getPackageName());
        Intrinsics.g(intent);
        return intent;
    }

    private c() {
    }
}
