package Qk;

import Ok.Coupon;
import Ok.f;
import hi.AbstractC14482i;
import hi.C14476c;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0010J\r\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010#\u001a\u00020\u00062\n\u0010\"\u001a\u00060 j\u0002`!¢\u0006\u0004\b#\u0010$¨\u0006%"}, d2 = {"LQk/b;", "", "<init>", "()V", "LOk/f;", "coupon", "Lhi/i;", "e", "(LOk/f;)Lhi/i;", "", "coupons", "f", "(Ljava/util/List;)Lhi/i;", "", "isApplied", "c", "(Z)Lhi/i;", "isAvailable", "d", "b", "()Lhi/i;", "", "count", "k", "(I)Lhi/i;", "LOk/a;", "j", "(LOk/a;)Lhi/i;", "", "pageType", "h", "(Ljava/lang/String;)Lhi/i;", "", "Lcom/meijer/mobile/coupon/model/common/OfferId;", "offerId", "i", "(J)Lhi/i;", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f30831a = new b();

    public final AbstractC14482i h(String pageType) {
        if (pageType != null) {
            if (StringsKt.r0(pageType)) {
                pageType = null;
            }
            if (pageType != null) {
                return C14476c.b("couponLocation", pageType);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence g(f coupon) {
        Intrinsics.j(coupon, "coupon");
        return new Regex("[,;|]").k(coupon.getOfferId() + ": " + coupon.getTitle(), "");
    }

    public final AbstractC14482i b() {
        return C14476c.b("CDPfromsearch", "1");
    }

    public final AbstractC14482i c(boolean isApplied) {
        return C14476c.b("couponApplied", isApplied ? "yes" : "no");
    }

    public final AbstractC14482i d(boolean isAvailable) {
        return C14476c.b("couponAvailable", isAvailable ? "yes" : "no");
    }

    public final AbstractC14482i e(f coupon) {
        Intrinsics.j(coupon, "coupon");
        return C14476c.b("couponID", coupon.getOfferId() + ": " + coupon.getTitle());
    }

    public final AbstractC14482i f(List<? extends f> coupons) {
        Intrinsics.j(coupons, "coupons");
        if (coupons.isEmpty()) {
            coupons = null;
        }
        return C14476c.b("couponID", coupons != null ? CollectionsKt.B0(coupons, "& ", null, null, 0, null, new Function1() { // from class: Qk.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return b.g((f) obj);
            }
        }, 30, null) : null);
    }

    public final AbstractC14482i i(long offerId) {
        return C14476c.b("couponPromoId", String.valueOf(offerId));
    }

    public final AbstractC14482i j(Coupon coupon) {
        Intrinsics.j(coupon, "coupon");
        return C14476c.b("HandPickedOffer", String.valueOf(coupon.getIsSpecialOffer()));
    }

    public final AbstractC14482i k(int count) {
        return C14476c.b("numberOfCoupons", String.valueOf(count));
    }

    private b() {
    }
}
