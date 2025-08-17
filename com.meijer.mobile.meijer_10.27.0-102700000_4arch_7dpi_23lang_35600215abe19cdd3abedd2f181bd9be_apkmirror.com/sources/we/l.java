package we;

import Td.AbstractC5232j;
import Td.C5233k;
import Td.C5235m;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import com.google.android.play.core.review.ReviewException;
import xe.t;
import xe.v;

@SuppressLint({"RestrictedApi"})
/* loaded from: classes4.dex */
public final class l {

    /* renamed from: c, reason: collision with root package name */
    private static final xe.i f166053c = new xe.i("ReviewService");

    /* renamed from: a, reason: collision with root package name */
    t f166054a;

    /* renamed from: b, reason: collision with root package name */
    private final String f166055b;

    public final AbstractC5232j a() {
        xe.i iVar = f166053c;
        iVar.d("requestInAppReview (%s)", this.f166055b);
        if (this.f166054a == null) {
            iVar.b("Play Store app is either not installed or not the official version", new Object[0]);
            return C5235m.e(new ReviewException(-1));
        }
        C5233k c5233k = new C5233k();
        this.f166054a.p(new i(this, c5233k, c5233k), c5233k);
        return c5233k.a();
    }

    public l(Context context) {
        this.f166055b = context.getPackageName();
        if (v.a(context)) {
            this.f166054a = new t(context, f166053c, "com.google.android.finsky.inappreviewservice.InAppReviewService", new Intent("com.google.android.finsky.BIND_IN_APP_REVIEW_SERVICE").setPackage("com.android.vending"), h.f166046a, null, null);
        }
    }
}
