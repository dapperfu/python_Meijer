package Al;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\nJQ\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00062\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0004\b\u0015\u0010\u0016JQ\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00062\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0004\b\u0017\u0010\u0016J/\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u001d\u0010\nJ\u000f\u0010\u001e\u001a\u00020\bH\u0007¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"LAl/h;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "fromScan", "Landroid/content/Intent;", "h", "(Landroid/content/Context;Z)Landroid/content/Intent;", "d", "LPp/b;", "searchType", "Landroid/os/Bundle;", "bundle", "", "searchTerm", "isDeepLink", "Landroid/net/Uri;", "deeplink", "f", "(Landroid/content/Context;LPp/b;Landroid/os/Bundle;Ljava/lang/String;ZLandroid/net/Uri;)Landroid/content/Intent;", "b", "singleScanMode", "allowCountIncrement", "isNewBarCodeScanEnabled", "k", "(Landroid/content/Context;ZZZ)Landroid/content/Intent;", "j", "a", "()Landroid/content/Intent;", "featurenavigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final h f670a = new h();

    @JvmStatic
    public static final Intent a() {
        return new Intent("android.settings.LOCATION_SOURCE_SETTINGS");
    }

    @JvmStatic
    @JvmOverloads
    public static final Intent b(Context context, Pp.b searchType, Bundle bundle, String searchTerm, boolean isDeepLink, Uri deeplink) {
        Intrinsics.j(context, "context");
        Intent intentA = j.a(context, "action.com.meijer.mobile.search_product_compose");
        intentA.putExtra("com.meijer.intent.extra.SEARCH_TYPE", searchType);
        intentA.putExtra("com.meijer.intent.extra.IS_DEEPLINK", isDeepLink);
        if (!StringsKt.r0(searchTerm == null ? "" : searchTerm)) {
            intentA.putExtra("unauth_search_term", searchTerm);
        }
        if (deeplink != null) {
            intentA.putExtra("product_sort_filter_deeplink", deeplink);
        }
        return intentA;
    }

    public static /* synthetic */ Intent c(Context context, Pp.b bVar, Bundle bundle, String str, boolean z10, Uri uri, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            bVar = null;
        }
        if ((i10 & 4) != 0) {
            bundle = null;
        }
        if ((i10 & 8) != 0) {
            str = bundle != null ? bundle.getString("unauth_search_term") : null;
            if (str == null) {
                str = "";
            }
        }
        if ((i10 & 16) != 0) {
            z10 = false;
        }
        if ((i10 & 32) != 0) {
            uri = null;
        }
        return b(context, bVar, bundle, str, z10, uri);
    }

    @JvmStatic
    public static final Intent d(Context context, boolean fromScan) {
        Intrinsics.j(context, "context");
        Intent intentA = j.a(context, "action.com.meijer.mobile.search_product_compose");
        intentA.putExtra("com.meijer.intent.extra.PRODUCT_SCAN", fromScan);
        return intentA;
    }

    public static /* synthetic */ Intent e(Context context, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return d(context, z10);
    }

    @JvmStatic
    @JvmOverloads
    public static final Intent f(Context context, Pp.b searchType, Bundle bundle, String searchTerm, boolean isDeepLink, Uri deeplink) {
        Intrinsics.j(context, "context");
        Intent intentA = j.a(context, "action.com.meijer.mobile.search_product");
        intentA.putExtra("com.meijer.intent.extra.SEARCH_TYPE", searchType);
        intentA.putExtra("com.meijer.intent.extra.IS_DEEPLINK", isDeepLink);
        if (!StringsKt.r0(searchTerm == null ? "" : searchTerm)) {
            intentA.putExtra("unauth_search_term", searchTerm);
        }
        if (deeplink != null) {
            intentA.putExtra("product_sort_filter_deeplink", deeplink);
        }
        return intentA;
    }

    public static /* synthetic */ Intent g(Context context, Pp.b bVar, Bundle bundle, String str, boolean z10, Uri uri, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            bVar = null;
        }
        if ((i10 & 4) != 0) {
            bundle = null;
        }
        if ((i10 & 8) != 0) {
            str = bundle != null ? bundle.getString("unauth_search_term") : null;
            if (str == null) {
                str = "";
            }
        }
        if ((i10 & 16) != 0) {
            z10 = false;
        }
        if ((i10 & 32) != 0) {
            uri = null;
        }
        return f(context, bVar, bundle, str, z10, uri);
    }

    @JvmStatic
    public static final Intent h(Context context, boolean fromScan) {
        Intrinsics.j(context, "context");
        Intent intentA = j.a(context, "action.com.meijer.mobile.search_product");
        intentA.putExtra("com.meijer.intent.extra.PRODUCT_SCAN", fromScan);
        return intentA;
    }

    public static /* synthetic */ Intent i(Context context, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return h(context, z10);
    }

    @JvmStatic
    public static final Intent j(Context context, boolean isNewBarCodeScanEnabled) {
        Intrinsics.j(context, "context");
        if (isNewBarCodeScanEnabled) {
            return j.a(context, "action.com.meijer.mobile.scanner.receiptscanactivity");
        }
        Intent intentPutExtra = k(context, false, false, isNewBarCodeScanEnabled).putExtra("receipt_scanner", true);
        Intrinsics.g(intentPutExtra);
        return intentPutExtra;
    }

    @JvmStatic
    public static final Intent k(Context context, boolean singleScanMode, boolean allowCountIncrement, boolean isNewBarCodeScanEnabled) {
        Intrinsics.j(context, "context");
        if (isNewBarCodeScanEnabled) {
            Intent intentA = j.a(context, "action.com.meijer.mobile.scanner.productscanactivity");
            intentA.putExtra("single_scan_mode", singleScanMode);
            intentA.putExtra("allow_count_increment_mode", allowCountIncrement);
            return intentA;
        }
        Intent intentA2 = j.a(context, "action.com.meijer.mobile.scan");
        intentA2.putExtra("single_scan_mode", singleScanMode);
        intentA2.putExtra("allow_count_increment_mode", allowCountIncrement);
        return intentA2;
    }

    private h() {
    }
}
