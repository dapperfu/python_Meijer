package Al;

import android.content.Context;
import android.content.Intent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\r\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0012\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0010J\u0015\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0010J\u0017\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0015\u0010\u0010J\u001d\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u000e¨\u0006\u0018"}, d2 = {"LAl/a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "isFromPaymentsScreen", "isEditBasicInfo", "Landroid/content/Intent;", "d", "(Landroid/content/Context;ZZ)Landroid/content/Intent;", "isAccountOverviewScreenAlphaEnabled", "h", "(Landroid/content/Context;Z)Landroid/content/Intent;", "j", "(Landroid/content/Context;)Landroid/content/Intent;", "i", "f", "b", "a", "g", "fromCart", "c", "featurenavigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f661a = new a();

    public static /* synthetic */ Intent e(a aVar, Context context, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        return aVar.d(context, z10, z11);
    }

    public final Intent a(Context context) {
        Intrinsics.j(context, "context");
        return j.a(context, "action.com.meijer.mobile.accounts.addresses");
    }

    public final Intent b(Context context) {
        Intrinsics.j(context, "context");
        return j.a(context, "action.com.meijer.mobile.accounts.payments");
    }

    public final Intent c(Context context, boolean fromCart) {
        Intrinsics.j(context, "context");
        Intent intentPutExtra = j.a(context, "action.com.meijer.mobile.settings.help").putExtra("EXTRA_FROM_CART_PAGE", fromCart);
        Intrinsics.i(intentPutExtra, "putExtra(...)");
        return intentPutExtra;
    }

    public final Intent d(Context context, boolean isFromPaymentsScreen, boolean isEditBasicInfo) {
        Intrinsics.j(context, "context");
        Intent intentPutExtra = j.a(context, "action.com.meijer.mobile.accounts.profile").putExtra("EXTRA_FROM_PAYMENTS_PAGE", isFromPaymentsScreen).putExtra("EXTRA_IS_EDIT_BASIC_INFO", isEditBasicInfo);
        Intrinsics.i(intentPutExtra, "putExtra(...)");
        return intentPutExtra;
    }

    public final Intent f(Context context) {
        Intrinsics.j(context, "context");
        return j.a(context, "action.com.meijer.mobile.receipts.receipts_savings");
    }

    public final Intent g(Context context) {
        Intrinsics.j(context, "context");
        return j.a(context, "action.com.meijer.mobile.settings.walkthrough");
    }

    public final Intent h(Context context, boolean isAccountOverviewScreenAlphaEnabled) {
        Intrinsics.j(context, "context");
        return j.a(context, isAccountOverviewScreenAlphaEnabled ? "action.com.meijer.mobile.accounts.overview" : "action.com.meijer.mobile.accounts.main");
    }

    public final Intent i(Context context) {
        Intrinsics.j(context, "context");
        return j.a(context, "action.com.meijer.mobile.accounts.preferences");
    }

    public final Intent j(Context context) {
        Intrinsics.j(context, "context");
        return j.a(context, "action.com.meijer.mobile.wic.main");
    }

    private a() {
    }
}
