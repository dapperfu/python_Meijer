package Al;

import Js.WeeklyAdPublication;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import gk.EbtPaymentOption;
import gk.EnumC14271a;
import hi.AbstractC14482i;
import hi.C14476c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import mk.l;
import tp.Builder;
import tp.EnumC17127a;
import yl.AbstractC18227f;

@Metadata(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 o2\u00020\u0001:\u0001RB\u001b\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u000eJ\r\u0010\u0010\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u000eJ\u0015\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\n¢\u0006\u0004\b\u0015\u0010\u000eJ+\u0010\u001a\u001a\u00020\n2\u001c\b\u0002\u0010\u0019\u001a\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016j\n\u0012\u0004\u0012\u00020\u0017\u0018\u0001`\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ-\u0010\u001f\u001a\u00020\n2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u001d\u001a\u00020\u00112\b\b\u0002\u0010\u001e\u001a\u00020\u0011¢\u0006\u0004\b\u001f\u0010 J!\u0010$\u001a\u00020\n2\b\b\u0002\u0010\"\u001a\u00020!2\b\b\u0002\u0010#\u001a\u00020!¢\u0006\u0004\b$\u0010%J\r\u0010&\u001a\u00020\n¢\u0006\u0004\b&\u0010\u000eJ\r\u0010'\u001a\u00020\n¢\u0006\u0004\b'\u0010\u000eJ\r\u0010(\u001a\u00020\n¢\u0006\u0004\b(\u0010\u000eJ\u0015\u0010+\u001a\u00020\n2\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b+\u0010,J\u0015\u0010/\u001a\u00020\n2\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b/\u00100J?\u00104\u001a\u00020\n2\b\b\u0002\u0010#\u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020!2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010-2\u000e\b\u0002\u00103\u001a\b\u0012\u0004\u0012\u00020201H\u0007¢\u0006\u0004\b4\u00105J\u0015\u00108\u001a\u00020\n2\u0006\u00107\u001a\u000206¢\u0006\u0004\b8\u00109Jc\u0010B\u001a\u00020\n2\u0006\u0010:\u001a\u0002062\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\b2(\b\u0002\u0010>\u001a\"\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010<j\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u0001`=2\n\b\u0002\u0010@\u001a\u0004\u0018\u00010?2\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\b¢\u0006\u0004\bB\u0010CJ3\u0010I\u001a\u00020\n2\u0006\u0010E\u001a\u00020D2\u0006\u0010F\u001a\u00020\u00112\b\b\u0002\u0010G\u001a\u00020\u00112\n\b\u0002\u0010H\u001a\u0004\u0018\u00010\b¢\u0006\u0004\bI\u0010JJ\u0017\u0010L\u001a\u00020\n2\b\b\u0002\u0010K\u001a\u00020?¢\u0006\u0004\bL\u0010MJ\u0017\u0010O\u001a\u00020\n2\b\b\u0002\u0010N\u001a\u00020\u0011¢\u0006\u0004\bO\u0010\u0014J\r\u0010P\u001a\u00020\n¢\u0006\u0004\bP\u0010\u000eJ\r\u0010Q\u001a\u00020\n¢\u0006\u0004\bQ\u0010\u000eJ\r\u0010R\u001a\u00020\n¢\u0006\u0004\bR\u0010\u000eJI\u0010[\u001a\u00020\n2\u0006\u0010T\u001a\u00020S2\b\b\u0002\u0010U\u001a\u00020\u00112\b\b\u0002\u0010V\u001a\u00020\u00112\b\b\u0002\u0010W\u001a\u00020\u00112\b\b\u0002\u0010X\u001a\u00020\u00112\n\b\u0002\u0010Z\u001a\u0004\u0018\u00010Y¢\u0006\u0004\b[\u0010\\J\u001f\u0010a\u001a\u00020\n2\u0006\u0010^\u001a\u00020]2\b\b\u0002\u0010`\u001a\u00020_¢\u0006\u0004\ba\u0010bJ\u001b\u0010f\u001a\b\u0012\u0004\u0012\u00020e012\u0006\u0010d\u001a\u00020c¢\u0006\u0004\bf\u0010gJ\r\u0010h\u001a\u00020\n¢\u0006\u0004\bh\u0010\u000eJ\u0015\u0010i\u001a\u00020\n2\u0006\u0010E\u001a\u00020D¢\u0006\u0004\bi\u0010jJ\r\u0010k\u001a\u00020\n¢\u0006\u0004\bk\u0010\u000eJ\r\u0010l\u001a\u00020\n¢\u0006\u0004\bl\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010mR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010n¨\u0006p"}, d2 = {"LAl/g;", "", "Landroid/content/Context;", "context", "Lyl/k;", "featureManager", "<init>", "(Landroid/content/Context;Lyl/k;)V", "", "action", "Landroid/content/Intent;", "o", "(Ljava/lang/String;)Landroid/content/Intent;", "w", "()Landroid/content/Intent;", "z", "p", "", "shouldClearBackStack", "L", "(Z)Landroid/content/Intent;", "r", "Ljava/util/ArrayList;", "Landroid/os/Parcelable;", "Lkotlin/collections/ArrayList;", "clippedRewards", "J", "(Ljava/util/ArrayList;)Landroid/content/Intent;", "rewardDescription", "isFromInProgressRewards", "isFromAvailableRewards", "H", "(Landroid/os/Parcelable;ZZ)Landroid/content/Intent;", "", "publicationId", "productId", "F", "(II)Landroid/content/Intent;", "h", "e", "g", "LOk/c;", "coupon", "f", "(LOk/c;)Landroid/content/Intent;", "LJs/e;", "weeklyAdPublication", "E", "(LJs/e;)Landroid/content/Intent;", "", "", "meijerOfferIds", "C", "(IILJs/e;Ljava/util/List;)Landroid/content/Intent;", "Lmk/l;", "productQueryTrackingType", "K", "(Lmk/l;)Landroid/content/Intent;", "productQueryIntent", "cmpId", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "departmentBreadcrumb", "Landroid/net/Uri;", "filteredDeeplink", "departmentCarouselAnalytics", "j", "(Lmk/l;Ljava/lang/String;Ljava/util/HashMap;Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;", "Lmk/f;", "product", "hasTransition", "isFromCLP", "previousTrackAction", "s", "(Lmk/f;ZZLjava/lang/String;)Landroid/content/Intent;", "deeplinkUri", "A", "(Landroid/net/Uri;)Landroid/content/Intent;", "isAuthenticated", "l", "d", "i", "a", "Lgk/a;", "addCardUseCase", "isEnrolledInMperksCardLinking", "fromCheckoutFlow", "fromOrderReview", "hasCardsOnFile", "Lgk/d;", "ebtPaymentOption", "b", "(Lgk/a;ZZZZLgk/d;)Landroid/content/Intent;", "Ltp/b;", "rateAndTip", "Ltp/a;", "flowType", "v", "(Ltp/b;Ltp/a;)Landroid/content/Intent;", "Landroid/os/Bundle;", "extras", "Lhi/i$b;", "u", "(Landroid/os/Bundle;)Ljava/util/List;", "q", "y", "(Lmk/f;)Landroid/content/Intent;", "x", "n", "Landroid/content/Context;", "Lyl/k;", "c", "featurenavigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final yl.k featureManager;

    public static /* synthetic */ Intent m(g gVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return gVar.l(z10);
    }

    public g(Context context, yl.k featureManager) {
        Intrinsics.j(context, "context");
        Intrinsics.j(featureManager, "featureManager");
        this.context = context;
        this.featureManager = featureManager;
    }

    public static /* synthetic */ Intent B(g gVar, Uri uri, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            uri = Uri.parse("meijerapp://shopdepartments");
        }
        return gVar.A(uri);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Intent D(g gVar, int i10, int i11, WeeklyAdPublication eVar, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        if ((i12 & 4) != 0) {
            eVar = null;
        }
        if ((i12 & 8) != 0) {
            list = new ArrayList();
        }
        return gVar.C(i10, i11, eVar, list);
    }

    public static /* synthetic */ Intent G(g gVar, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return gVar.F(i10, i11);
    }

    public static /* synthetic */ Intent I(g gVar, Parcelable parcelable, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            parcelable = null;
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        return gVar.H(parcelable, z10, z11);
    }

    public static /* synthetic */ Intent c(g gVar, EnumC14271a enumC14271a, boolean z10, boolean z11, boolean z12, boolean z13, EbtPaymentOption dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        if ((i10 & 8) != 0) {
            z12 = false;
        }
        if ((i10 & 16) != 0) {
            z13 = false;
        }
        if ((i10 & 32) != 0) {
            dVar = null;
        }
        return gVar.b(enumC14271a, z10, z11, z12, z13, dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Intent k(g gVar, mk.l lVar, String str, HashMap map, Uri uri, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = null;
        }
        if ((i10 & 4) != 0) {
            map = null;
        }
        if ((i10 & 8) != 0) {
            uri = null;
        }
        if ((i10 & 16) != 0) {
            str2 = null;
        }
        return gVar.j(lVar, str, map, uri, str2);
    }

    private final Intent o(String action) {
        Intent intent = new Intent(action).setPackage(this.context.getPackageName());
        Intrinsics.i(intent, "setPackage(...)");
        return intent;
    }

    public static /* synthetic */ Intent t(g gVar, mk.f fVar, boolean z10, boolean z11, String str, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        if ((i10 & 8) != 0) {
            str = null;
        }
        return gVar.s(fVar, z10, z11, str);
    }

    public final Intent A(Uri deeplinkUri) {
        String path;
        String path2;
        String path3;
        String query;
        Intrinsics.j(deeplinkUri, "deeplinkUri");
        Intent intentO = o("action.com.meijer.mobile.tier_departments");
        String queryParameter = deeplinkUri.getQueryParameter("departmentId");
        String strP = queryParameter != null ? StringsKt.P(queryParameter, 'T', 'L', false, 4, null) : null;
        String queryParameter2 = deeplinkUri.getQueryParameter("department");
        if (Intrinsics.e(deeplinkUri.getAuthority(), "shopdepartments") && (((path3 = deeplinkUri.getPath()) == null || StringsKt.r0(path3)) && ((query = deeplinkUri.getQuery()) == null || StringsKt.r0(query)))) {
            intentO.putExtra("com.meijer.mobile.meijer.activity.find.viewmodel.DepartmentTierActivity.EXTRA_DEPARTMENT_TIER_ROOT", true);
        } else if (Intrinsics.e(deeplinkUri.getAuthority(), "shopdepartments") && (((path2 = deeplinkUri.getPath()) == null || StringsKt.r0(path2)) && strP != null)) {
            intentO.putExtra("com.meijer.mobile.meijer.activity.find.viewmodel.DepartmentTierActivity.EXTRA_LOAD_SUBDEPARTMENT", new l.Department(strP, ""));
        } else if (Intrinsics.e(deeplinkUri.getAuthority(), "departments") && (((path = deeplinkUri.getPath()) == null || StringsKt.r0(path)) && queryParameter2 != null)) {
            intentO.putExtra("com.meijer.mobile.meijer.activity.find.viewmodel.TierDepartmentsActivity.EXTRA_MARKETING_DEEPLINK", deeplinkUri.getQuery());
        }
        if (deeplinkUri.getQueryParameter("sort_order") != null) {
            intentO.putExtra("product_sort_filter_deeplink", deeplinkUri);
        }
        return intentO;
    }

    @JvmOverloads
    public final Intent C(int productId, int publicationId, WeeklyAdPublication weeklyAdPublication, List<Long> meijerOfferIds) {
        Intrinsics.j(meijerOfferIds, "meijerOfferIds");
        Intent intentO = o("action.com.meijer.mobile.weeklyad.detailview");
        intentO.putExtra("com.meijer.mobile.meijer.activity.weeklyad.product", productId);
        intentO.putExtra("com.meijer.mobile.meijer.activity.weeklyad.publication.id", publicationId);
        intentO.putExtra("com.meijer.mobile.meijer.activity.weeklyad.publication", weeklyAdPublication);
        Long[] lArr = (Long[]) meijerOfferIds.toArray(new Long[0]);
        intentO.putExtra("com.meijer.mobile.meijer.activity.weeklyad.related.coupons", CollectionsKt.g(Arrays.copyOf(lArr, lArr.length)));
        return intentO;
    }

    public final Intent E(WeeklyAdPublication weeklyAdPublication) {
        Intrinsics.j(weeklyAdPublication, "weeklyAdPublication");
        Intent intentO = o("action.com.meijer.mobile.weeklyad.printview");
        intentO.putExtra("com.meijer.mobile.meijer.activity.weeklyad.publication", weeklyAdPublication);
        return intentO;
    }

    public final Intent F(int publicationId, int productId) {
        Intent intentO = o("action.com.meijer.mobile.weeklyad.selection");
        intentO.putExtra("com.meijer.mobile.meijer.activity.weeklyad.publication.id", publicationId);
        intentO.putExtra("com.meijer.mobile.meijer.activity.weeklyad.product", productId);
        return intentO;
    }

    public final Intent H(Parcelable rewardDescription, boolean isFromInProgressRewards, boolean isFromAvailableRewards) {
        Intent intentO = o("action.com.meijer.mobile.mperks.ux.reward_details");
        intentO.putExtra("com.meijer.intent.extra.EXTRA_REWARD_COUPON", rewardDescription);
        intentO.putExtra("com.meijer.intent.extra.EXTRA_IS_FROM_IN_PROGRESS_REWARDS", isFromInProgressRewards);
        intentO.putExtra("com.meijer.intent.extra.EXTRA_IS_FROM_AVAILABLE_REWARDS", isFromAvailableRewards);
        return intentO;
    }

    public final Intent J(ArrayList<Parcelable> clippedRewards) {
        Intent intentO = o("action.com.meijer.mobile.mperks.ux.view_all_rewards");
        intentO.putParcelableArrayListExtra("com.meijer.intent.extra.EXTRA_REWARD_COUPON_LIST", clippedRewards);
        return intentO;
    }

    public final Intent K(mk.l productQueryTrackingType) {
        Intrinsics.j(productQueryTrackingType, "productQueryTrackingType");
        Intent intentA = j.a(this.context, "action.com.meijer.mobile.personalized_shoppinglist");
        intentA.putExtra("personalizedShoppingListProductType", productQueryTrackingType);
        return intentA;
    }

    public final Intent L(boolean shouldClearBackStack) {
        Intent intentO = o("action.com.meijer.mobile.shopandscan");
        if (!shouldClearBackStack) {
            intentO.addFlags(67108864);
        }
        return intentO;
    }

    public final Intent a() {
        return o("action.com.meijer.mobile.androidacres.showcase");
    }

    public final Intent b(EnumC14271a addCardUseCase, boolean isEnrolledInMperksCardLinking, boolean fromCheckoutFlow, boolean fromOrderReview, boolean hasCardsOnFile, EbtPaymentOption ebtPaymentOption) {
        Intrinsics.j(addCardUseCase, "addCardUseCase");
        Intent intentO = o("action.com.meijer.mobile.add_aurus_card");
        intentO.putExtra("com.meijer.mobile.meijer.activity.settings.billing.AddCardAurusActivity.UseCase", addCardUseCase);
        intentO.putExtra("com.meijer.mobile.meijer.activity.settings.billing.AddCardAurusActivity.IsEnrolledInMperksCardLinking", isEnrolledInMperksCardLinking);
        intentO.putExtra("com.meijer.mobile.meijer.activity.settings.billing.AddCardAurusActivity.IsFromCheckoutFlow", fromCheckoutFlow);
        intentO.putExtra("com.meijer.mobile.meijer.activity.settings.billing.AddCardAurusActivity.IsFromOrderReview", fromOrderReview);
        intentO.putExtra("com.meijer.mobile.meijer.activity.settings.billing.AddCardAurusActivity.HasCardsOnFile", hasCardsOnFile);
        intentO.putExtra("com.meijer.mobile.meijer.activity.settings.billing.AddCardAurusActivity.EbtPaymentOption", ebtPaymentOption);
        return intentO;
    }

    public final Intent d() {
        return o("action.com.meijer.mobile.cart");
    }

    public final Intent e() {
        return o("action.com.meijer.mobile.coupon.dashboard");
    }

    public final Intent f(Ok.c coupon) {
        Intrinsics.j(coupon, "coupon");
        Intent intentO = o("action.com.meijer.mobile.coupon.detail");
        intentO.putExtra("com.meijer.intent.extra.COUPON", coupon);
        return intentO;
    }

    public final Intent g() {
        return o("action.com.meijer.mobile.coupon.list");
    }

    public final Intent h() {
        return o("action.com.meijer.mobile.coupon.tabs.list");
    }

    public final Intent i() {
        return o("action.com.meijer.mobile.debug_options");
    }

    public final Intent j(mk.l productQueryIntent, String cmpId, HashMap<String, String> departmentBreadcrumb, Uri filteredDeeplink, String departmentCarouselAnalytics) {
        Intrinsics.j(productQueryIntent, "productQueryIntent");
        Intent intentA = j.a(this.context, "action.com.meijer.mobile.filtered_products");
        intentA.putExtra("com.meijer.mobile.meijer.activity.find.FilteredProductsActivity.EXTRA_PRODUCT_QUERY_INTENT", productQueryIntent);
        intentA.putExtra("cmpid", cmpId);
        intentA.putExtra("DEPARTMENT_BREADCRUMBS", departmentBreadcrumb);
        if (filteredDeeplink != null) {
            intentA.putExtra("product_sort_filter_deeplink", filteredDeeplink);
        }
        if (departmentCarouselAnalytics != null) {
            intentA.putExtra("broseDepartmentCarouselAnalytics", departmentCarouselAnalytics);
        }
        return intentA;
    }

    public final Intent l(boolean isAuthenticated) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("action.com.meijer.mobile.home");
        sb2.append(this.featureManager.e(AbstractC18227f.C18240n.f170591h) ? ".compose" : "");
        Intent intentPutExtra = o(sb2.toString()).putExtra("HOME_EXTRA_AUTHENTICATED", isAuthenticated);
        Intrinsics.i(intentPutExtra, "putExtra(...)");
        return intentPutExtra;
    }

    public final Intent n() {
        return o("action.com.meijer.subscription.ux.subscription.how_subscriptions_works");
    }

    public final Intent p() {
        return o("action.com.meijer.mobile.shoppinglist.legacy_activity");
    }

    public final Intent q() {
        return o("action.com.meijer.mobile.rewards.available_mcc_detail");
    }

    public final Intent r() {
        return o("action.com.meijer.mobile.barcode");
    }

    public final Intent s(mk.f product, boolean hasTransition, boolean isFromCLP, String previousTrackAction) {
        Intrinsics.j(product, "product");
        Intent intentPutExtra = j.a(this.context, this.featureManager.e(AbstractC18227f.C18241o.f170592h) ? "action.com.meijer.mobile.product_detail_compose" : "action.com.meijer.mobile.product_detail").putExtra("com.meijer.intent.extra.PRODUCT", product).putExtra("com.meijer.intent.extra.HAS_TRANSITION", hasTransition).putExtra("com.meijer.intent.extra.IS_FROM_CLP", isFromCLP).putExtra("com.meijer.intent.extra.PREVIOUS_TRACK_ACTION", previousTrackAction);
        Intrinsics.i(intentPutExtra, "putExtra(...)");
        return intentPutExtra;
    }

    public final List<AbstractC14482i.Extra> u(Bundle extras) {
        Intrinsics.j(extras, "extras");
        return CollectionsKt.p(C14476c.b("broadlogId", extras.getString("adobe_push_notification_data_broadlogid_extra", "")), C14476c.b("deliveryId", extras.getString("adobe_push_notification_data_deliveryid_extra", "")), C14476c.b("action", "2"));
    }

    public final Intent v(Builder rateAndTip, EnumC17127a flowType) {
        Intrinsics.j(rateAndTip, "rateAndTip");
        Intrinsics.j(flowType, "flowType");
        Intent intentO = o("com.meijer.mobile.rate_and_tip");
        intentO.putExtra("com.meijer.mobile.rateandtip.ux.rate_and_tip_builder", rateAndTip);
        intentO.putExtra("com.meijer.mobile.rateandtip.ux.flow_type", flowType);
        return intentO;
    }

    public final Intent w() {
        return o("action.com.meijer.mobile.shoppinglist.activity");
    }

    public final Intent x() {
        return o("action.com.meijer.mobile.subscription.ux.subscription.subscribed_item");
    }

    public final Intent y(mk.f product) {
        Intrinsics.j(product, "product");
        Intent intentPutExtra = o("action.com.meijer.mobile.subscription.activity").putExtra("com.meijer.intent.extra.PRODUCT", product);
        Intrinsics.i(intentPutExtra, "putExtra(...)");
        return intentPutExtra;
    }

    public final Intent z() {
        return o("action.com.meijer.mobile.meijer.teacherlists.activity");
    }
}
