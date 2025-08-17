package Al;

import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import uo.OrderOutOfStockItem;
import vo.OrderSubstitutionItem;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ7\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\r\u001a\u00060\u000bj\u0002`\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013Je\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\n\u0010\r\u001a\u00060\u000bj\u0002`\f2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00062\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u000b2\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0014¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"LAl/l;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "startInStoreReceipts", "Landroid/content/Intent;", "e", "(Landroid/content/Context;Z)Landroid/content/Intent;", "", "Lcom/meijer/mobile/core/model/common/ResourceId;", "orderId", "previousTrackAction", "shortCode", "a", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;", "c", "(Landroid/content/Context;)Landroid/content/Intent;", "", "Lvo/a;", "listSubstitutedItems", "Lvo/b;", "screenType", "isOnMyWayClicked", "orderType", "pickupPerson", "Luo/a;", "listOutOfStockItems", "d", "(Landroid/content/Context;Ljava/util/List;Ljava/lang/String;Lvo/b;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;)Landroid/content/Intent;", "featurenavigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final l f673a = new l();

    public static /* synthetic */ Intent b(l lVar, Context context, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str2 = "";
        }
        if ((i10 & 8) != 0) {
            str3 = null;
        }
        return lVar.a(context, str, str2, str3);
    }

    public static /* synthetic */ Intent f(l lVar, Context context, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return lVar.e(context, z10);
    }

    public final Intent a(Context context, String orderId, String previousTrackAction, String shortCode) {
        Intrinsics.j(context, "context");
        Intrinsics.j(orderId, "orderId");
        Intrinsics.j(previousTrackAction, "previousTrackAction");
        Intent intentA = j.a(context, "action.com.meijer.mobile.order_detail");
        intentA.putExtra("orderID", orderId);
        intentA.putExtra("previousTrackAction", previousTrackAction);
        intentA.putExtra("shortCode", shortCode);
        return intentA;
    }

    public final Intent c(Context context) {
        Intrinsics.j(context, "context");
        return j.a(context, "action.com.meijer.mobile.order_options");
    }

    public final Intent d(Context context, List<OrderSubstitutionItem> listSubstitutedItems, String orderId, vo.b screenType, boolean isOnMyWayClicked, String orderType, String pickupPerson, List<OrderOutOfStockItem> listOutOfStockItems) {
        Intrinsics.j(context, "context");
        Intrinsics.j(listSubstitutedItems, "listSubstitutedItems");
        Intrinsics.j(orderId, "orderId");
        Intrinsics.j(screenType, "screenType");
        Intrinsics.j(listOutOfStockItems, "listOutOfStockItems");
        Intent intentA = j.a(context, "action.com.meijer.mobile.order_substitutions");
        intentA.putParcelableArrayListExtra("substitutedItems", new ArrayList<>(listSubstitutedItems));
        intentA.putExtra("substitutionScreenType", screenType);
        intentA.putExtra("orderId", orderId);
        intentA.putExtra("isOnMyWayClicked", isOnMyWayClicked);
        intentA.putExtra("orderType", orderType);
        intentA.putExtra("pickUpPerson", pickupPerson);
        intentA.putParcelableArrayListExtra("oosItems", new ArrayList<>(listOutOfStockItems));
        return intentA;
    }

    public final Intent e(Context context, boolean startInStoreReceipts) {
        Intrinsics.j(context, "context");
        Intent intentA = j.a(context, "action.com.meijer.mobile.orders");
        intentA.putExtra("action.com.meijer.mobile.orders.start_in_store_receipts", startInStoreReceipts);
        return intentA;
    }

    private l() {
    }
}
