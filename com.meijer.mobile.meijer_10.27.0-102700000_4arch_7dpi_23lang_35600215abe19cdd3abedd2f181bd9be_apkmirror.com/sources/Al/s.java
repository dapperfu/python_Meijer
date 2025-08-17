package Al;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import ok.StoreDetails;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\b\u001a\u00060\u0006j\u0002`\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011Jc\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u0013\u001a\u00020\r2\b\b\u0002\u0010\u0014\u001a\u00020\r2\b\b\u0002\u0010\u0015\u001a\u00020\u00062\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0018\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ-\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u001b\u0010\u001cJ9\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"LAl/s;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "Lcom/meijer/mobile/core/model/common/StoreId;", "storeID", "", "storeName", "Lok/i;", "storeSearchType", "", "isFromGasStationDetails", "Landroid/content/Intent;", "a", "(Landroid/content/Context;ILjava/lang/String;Lok/i;Z)Landroid/content/Intent;", "title", "returnHome", "exitSearch", "deeplinkCode", "Landroid/net/Uri;", "uri", "isPickUpMode", "e", "(Landroid/content/Context;Lok/i;Ljava/lang/String;ZZILandroid/net/Uri;Z)Landroid/content/Intent;", "b", "(Landroid/content/Context;ILok/i;Z)Landroid/content/Intent;", "Lok/h;", "storeDetails", "c", "(Landroid/content/Context;Lok/h;Lok/i;ILandroid/net/Uri;)Landroid/content/Intent;", "featurenavigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public static final s f693a = new s();

    @JvmStatic
    public static final Intent a(Context context, int storeID, String storeName, ok.i storeSearchType, boolean isFromGasStationDetails) {
        Intrinsics.j(context, "context");
        Intrinsics.j(storeSearchType, "storeSearchType");
        Intent intentPutExtra = new Intent("action.com.meijer.mobile.store_details_compose").setPackage(context.getPackageName()).putExtra("com.meijer.intent.extra.STORE_ID", storeID).putExtra("com.meijer.intent.extra.STORE_NAME", storeName).putExtra("extra_launch_activity", context.getClass().getName()).putExtra("com.meijer.intent.extra.STORE_SEARCH_TYPE", storeSearchType).putExtra("com.meijer.intent.extra.IS_FROM_GAS_STATION_DETAILS", isFromGasStationDetails);
        Intrinsics.i(intentPutExtra, "putExtra(...)");
        return intentPutExtra;
    }

    public static /* synthetic */ Intent d(Context context, int i10, String str, ok.i iVar, boolean z10, int i11, Object obj) {
        if ((i11 & 16) != 0) {
            z10 = false;
        }
        return a(context, i10, str, iVar, z10);
    }

    @JvmStatic
    public static final Intent e(Context context, ok.i storeSearchType, String title, boolean returnHome, boolean exitSearch, int deeplinkCode, Uri uri, boolean isPickUpMode) {
        Intrinsics.j(context, "context");
        Intent intentA = j.a(context, "action.com.meijer.mobile.find");
        intentA.putExtra("com.meijer.intent.extra.TOOLBAR_TITLE", title);
        intentA.putExtra("com.meijer.intent.extra.SEARCH_TYPE", storeSearchType);
        intentA.putExtra("com.meijer.intent.extra.RETURN_HOME", returnHome);
        intentA.putExtra("com.meijer.intent.extra.EXIT_SEARCH", exitSearch);
        intentA.putExtra("com.meijer.intent.extra.DASHBOARD_LINK", deeplinkCode);
        intentA.putExtra("com.meijer.intent.extra.DEEP_LINK_URI", uri);
        intentA.putExtra("com.meijer.intent.extra.IS_PICK_UP_MODE", isPickUpMode);
        return intentA;
    }

    public static /* synthetic */ Intent f(Context context, ok.i iVar, String str, boolean z10, boolean z11, int i10, Uri uri, boolean z12, int i11, Object obj) {
        boolean z13;
        Uri uri2;
        boolean z14;
        int i12;
        String str2;
        boolean z15;
        Context context2;
        ok.i iVar2;
        if ((i11 & 2) != 0) {
            iVar = ok.i.f153985c;
        }
        if ((i11 & 4) != 0) {
            str = null;
        }
        if ((i11 & 8) != 0) {
            z10 = true;
        }
        if ((i11 & 16) != 0) {
            z11 = false;
        }
        if ((i11 & 32) != 0) {
            i10 = 0;
        }
        if ((i11 & 64) != 0) {
            uri = null;
        }
        if ((i11 & 128) != 0) {
            z13 = true;
            i12 = i10;
            uri2 = uri;
            z15 = z10;
            z14 = z11;
            iVar2 = iVar;
            str2 = str;
            context2 = context;
        } else {
            z13 = z12;
            uri2 = uri;
            z14 = z11;
            i12 = i10;
            str2 = str;
            z15 = z10;
            context2 = context;
            iVar2 = iVar;
        }
        return e(context2, iVar2, str2, z15, z14, i12, uri2, z13);
    }

    public final Intent b(Context context, int storeID, ok.i storeSearchType, boolean isFromGasStationDetails) {
        Intrinsics.j(context, "context");
        Intrinsics.j(storeSearchType, "storeSearchType");
        return a(context, storeID, null, storeSearchType, isFromGasStationDetails);
    }

    public final Intent c(Context context, StoreDetails storeDetails, ok.i storeSearchType, int deeplinkCode, Uri uri) {
        Intrinsics.j(context, "context");
        Intrinsics.j(storeSearchType, "storeSearchType");
        Intent intentPutExtra = new Intent("action.com.meijer.mobile.store_details_compose").setPackage(context.getPackageName()).putExtra("com.meijer.intent.extra.STORE_DETAILS", storeDetails).putExtra("com.meijer.intent.extra.STORE_SEARCH_TYPE", storeSearchType).putExtra("com.meijer.intent.extra.DASHBOARD_LINK", deeplinkCode).putExtra("com.meijer.intent.extra.DEEP_LINK_URI", uri);
        Intrinsics.i(intentPutExtra, "putExtra(...)");
        return intentPutExtra;
    }

    private s() {
    }
}
