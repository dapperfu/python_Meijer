package Bl;

import android.content.Context;
import android.content.Intent;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import zp.CustomerSavings;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u000fJ\u001d\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u000fJ\u001d\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"LBl/d;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "isFromMPerks4", "", "mperksPoints", "Landroid/content/Intent;", "i", "(Landroid/content/Context;ZI)Landroid/content/Intent;", "a", "e", "(Landroid/content/Context;)Landroid/content/Intent;", "d", "Lzp/g;", "receipt", "f", "(Landroid/content/Context;Lzp/g;)Landroid/content/Intent;", "c", "LVj/a;", "helpType", "g", "(Landroid/content/Context;LVj/a;)Landroid/content/Intent;", "Lzp/a;", "savingsDetail", "h", "(Landroid/content/Context;Lzp/a;)Landroid/content/Intent;", "featurenavigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f3122a = new d();

    @JvmStatic
    public static final Intent a(Context context, boolean isFromMPerks4, int mperksPoints) {
        Intrinsics.j(context, "context");
        Intent intentPutExtra = j.a(context, "action.com.meijer.mobile.receipts.add_receipt").putExtra("com.meijer.intent.extra.EXTRA_IS_FROM_MPERKS4", isFromMPerks4).putExtra("com.meijer.intent.extra.EXTRA_POINTS_BALANCE_MPERKS4", mperksPoints);
        Intrinsics.i(intentPutExtra, "putExtra(...)");
        return intentPutExtra;
    }

    public static /* synthetic */ Intent b(Context context, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return a(context, z10, i10);
    }

    @JvmStatic
    public static final Intent e(Context context) {
        Intrinsics.j(context, "context");
        return j.a(context, "action.com.meijer.mobile.receipts.add_fuel_receipt_form");
    }

    @JvmStatic
    public static final Intent i(Context context, boolean isFromMPerks4, int mperksPoints) {
        Intrinsics.j(context, "context");
        Intent intentPutExtra = j.a(context, "action.com.meijer.mobile.receipts.self_remediation_host").putExtra("com.meijer.intent.extra.EXTRA_IS_FROM_MPERKS4", isFromMPerks4).putExtra("com.meijer.intent.extra.EXTRA_POINTS_BALANCE_MPERKS4", mperksPoints);
        Intrinsics.i(intentPutExtra, "putExtra(...)");
        return intentPutExtra;
    }

    public final Intent c(Context context) {
        Intrinsics.j(context, "context");
        Intent intentPutExtra = j.a(context, "action.com.meijer.mobile.receipts.receipt_detail").putExtra("com.meijer.intent.extra.EXTRA_CUSTOMER_RESUBMIT_RECEIPT_TYPE_TAG", true);
        Intrinsics.i(intentPutExtra, "putExtra(...)");
        return intentPutExtra;
    }

    public final Intent d(Context context) {
        Intrinsics.j(context, "context");
        return j.a(context, "action.com.meijer.mobile.receipts.receipts_savings");
    }

    public final Intent f(Context context, zp.g receipt) {
        Intrinsics.j(context, "context");
        Intrinsics.j(receipt, "receipt");
        Intent intentA = j.a(context, "action.com.meijer.mobile.receipts.receipt_detail");
        String strB = receipt.getIdentifier().getUuid();
        if (strB != null && !StringsKt.s0(strB)) {
            intentA.putExtra("com.meijer.intent.extra.EXTRA_NEXT_GEN_RECEIPT_ID_TAG", receipt.getIdentifier().getUuid());
            return intentA;
        }
        if (receipt.getIdentifier().getReceiptId() == null) {
            throw new IllegalStateException("Cannot load details for receipt without an ID.");
        }
        intentA.putExtra("com.meijer.intent.extra.EXTRA_RECEIPT_ID_TAG", receipt.getIdentifier().getReceiptId());
        return intentA;
    }

    public final Intent g(Context context, Vj.a helpType) {
        Intrinsics.j(context, "context");
        Intrinsics.j(helpType, "helpType");
        Intent intentPutExtra = j.a(context, "action.com.meijer.mobile.receipts.remediation_help").putExtra("com.meijer.intent.extra.REMEDIATION_HELP_TYPE_TAG", helpType);
        Intrinsics.i(intentPutExtra, "putExtra(...)");
        return intentPutExtra;
    }

    public final Intent h(Context context, CustomerSavings savingsDetail) {
        Intrinsics.j(context, "context");
        Intent intentPutExtra = j.a(context, "action.com.meijer.mobile.receipts.savings_detail").putExtra("savingsDetailsTag", savingsDetail);
        Intrinsics.i(intentPutExtra, "putExtra(...)");
        return intentPutExtra;
    }

    private d() {
    }
}
