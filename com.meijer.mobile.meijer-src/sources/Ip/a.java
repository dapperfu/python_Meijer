package Ip;

import Kk.AppVersion;
import Kp.g;
import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import com.bazaarvoice.bvandroidsdk.BVConfig;
import com.bazaarvoice.bvandroidsdk.BVConversationsClient;
import com.bazaarvoice.bvandroidsdk.BVLogLevel;
import com.bazaarvoice.bvandroidsdk.BVPixel;
import com.bazaarvoice.bvandroidsdk.BVSDK;
import com.bazaarvoice.bvandroidsdk.BazaarEnvironment;
import com.meijer.mobile.weeklyad.service.flipp.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\rJ+\u0010\u0014\u001a\u00020\t2\b\b\u0001\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"LIp/a;", "", "<init>", "()V", "Lcom/meijer/mobile/reviews/service/a;", "bazaarVoiceReviewManager", "LKp/g;", "d", "(Lcom/meijer/mobile/reviews/service/a;)LKp/g;", "Lcom/bazaarvoice/bvandroidsdk/BVConversationsClient;", "bvClient", "Lcom/bazaarvoice/bvandroidsdk/BVSDK;", "e", "(Lcom/bazaarvoice/bvandroidsdk/BVConversationsClient;)Lcom/bazaarvoice/bvandroidsdk/BVSDK;", "Landroid/content/Context;", "context", "", "bazaarVoiceKey", "LKk/a;", "appVersion", "c", "(Landroid/content/Context;Ljava/lang/String;LKk/a;)Lcom/bazaarvoice/bvandroidsdk/BVConversationsClient;", "bvConversation", "Lcom/bazaarvoice/bvandroidsdk/BVPixel;", "b", "(Lcom/bazaarvoice/bvandroidsdk/BVConversationsClient;)Lcom/bazaarvoice/bvandroidsdk/BVPixel;", "bvPixel", "LHp/c;", "a", "(Lcom/bazaarvoice/bvandroidsdk/BVPixel;)LHp/c;", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f15213a = new a();

    public final g d(com.meijer.mobile.reviews.service.a bazaarVoiceReviewManager) {
        Intrinsics.j(bazaarVoiceReviewManager, "bazaarVoiceReviewManager");
        return bazaarVoiceReviewManager;
    }

    @SuppressLint({"BVMultipleInstantiations"})
    public final Hp.c a(BVPixel bvPixel) {
        Intrinsics.j(bvPixel, "bvPixel");
        return new Hp.c(bvPixel);
    }

    @SuppressLint({"BVMultipleInstantiations"})
    public final BVPixel b(BVConversationsClient bvConversation) {
        Intrinsics.j(bvConversation, "bvConversation");
        BVPixel bVPixel = BVPixel.getInstance();
        Intrinsics.i(bVPixel, "getInstance(...)");
        return bVPixel;
    }

    @SuppressLint({"BVMultipleInstantiations"})
    public final BVConversationsClient c(Context context, String bazaarVoiceKey, AppVersion appVersion) {
        Intrinsics.j(context, "context");
        Intrinsics.j(bazaarVoiceKey, "bazaarVoiceKey");
        Intrinsics.j(appVersion, "appVersion");
        BVConversationsClient bVConversationsClientBuild = new BVConversationsClient.Builder(BVSDK.builderWithConfig((Application) context, (appVersion.getIsInternalProdBuild() || appVersion.getIsProdBuild() || appVersion.getIsPlayStore()) ? BazaarEnvironment.PRODUCTION : BazaarEnvironment.STAGING, new BVConfig.Builder().clientId(BuildConfig.FLIPP_MERCHANT_ID).dryRunAnalytics(false).apiKeyConversations(bazaarVoiceKey).build()).logLevel(BVLogLevel.VERBOSE).build()).build();
        Intrinsics.i(bVConversationsClientBuild, "build(...)");
        return bVConversationsClientBuild;
    }

    @SuppressLint({"BVMultipleInstantiations"})
    public final BVSDK e(BVConversationsClient bvClient) {
        Intrinsics.j(bvClient, "bvClient");
        BVSDK bvsdk = BVSDK.getInstance();
        Intrinsics.i(bvsdk, "getInstance(...)");
        return bvsdk;
    }

    private a() {
    }
}
