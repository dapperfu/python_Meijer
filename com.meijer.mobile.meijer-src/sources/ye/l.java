package ye;

import Vd.AbstractC5516j;
import Vd.C5517k;
import Vd.C5519m;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import com.google.android.play.core.review.ReviewException;
import ze.t;
import ze.v;

@SuppressLint({"RestrictedApi"})
/* loaded from: classes4.dex */
public final class l {

    /* renamed from: c, reason: collision with root package name */
    private static final ze.i f171375c = new ze.i("ReviewService");

    /* renamed from: a, reason: collision with root package name */
    t f171376a;

    /* renamed from: b, reason: collision with root package name */
    private final String f171377b;

    public final AbstractC5516j a() {
        ze.i iVar = f171375c;
        iVar.d("requestInAppReview (%s)", this.f171377b);
        if (this.f171376a == null) {
            iVar.b("Play Store app is either not installed or not the official version", new Object[0]);
            return C5519m.e(new ReviewException(-1));
        }
        C5517k c5517k = new C5517k();
        this.f171376a.p(new i(this, c5517k, c5517k), c5517k);
        return c5517k.a();
    }

    public l(Context context) {
        this.f171377b = context.getPackageName();
        if (v.a(context)) {
            this.f171376a = new t(context, f171375c, "com.google.android.finsky.inappreviewservice.InAppReviewService", new Intent("com.google.android.finsky.BIND_IN_APP_REVIEW_SERVICE").setPackage("com.android.vending"), h.f171368a, null, null);
        }
    }
}
