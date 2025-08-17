package el;

import Ok.Coupon;
import ak.AbstractC5607a;
import android.content.Context;
import android.content.res.Resources;
import j$.time.LocalDateTime;
import j$.time.ZonedDateTime;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import vk.C17590a;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0001*\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u001b\u0010\b\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t\u001a#\u0010\f\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\r\"\u0017\u0010\u0010\u001a\u0004\u0018\u00010\u0007*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"LOk/a;", "", "f", "(LOk/a;)Z", "g", "j$/time/ZonedDateTime", "now", "Lak/a;", "d", "(LOk/a;Lj$/time/ZonedDateTime;)Lak/a;", "Landroid/content/Context;", "context", "a", "(LOk/a;Landroid/content/Context;Lj$/time/ZonedDateTime;)Lak/a;", "c", "(LOk/a;)Lak/a;", "redemptionDateFormatted", "coupons_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: el.c, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C13686c {
    public static final AbstractC5607a a(Coupon coupon, Context context, ZonedDateTime now) throws Resources.NotFoundException {
        Intrinsics.j(coupon, "<this>");
        Intrinsics.j(context, "context");
        Intrinsics.j(now, "now");
        String string = context.getResources().getString(coupon.getIsManufacturerCoupon() ? Yk.a.f40283b : Yk.a.f40290i);
        Intrinsics.i(string, "getString(...)");
        String strB = d(coupon, now).b(context);
        Locale locale = Locale.getDefault();
        Intrinsics.i(locale, "getDefault(...)");
        String lowerCase = strB.toLowerCase(locale);
        Intrinsics.i(lowerCase, "toLowerCase(...)");
        return AbstractC5607a.INSTANCE.d(Yk.a.f40289h, string, m2.b.a(lowerCase, 0, null, null).toString());
    }

    public static /* synthetic */ AbstractC5607a b(Coupon coupon, Context context, ZonedDateTime zonedDateTime, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            zonedDateTime = ZonedDateTime.now();
        }
        return a(coupon, context, zonedDateTime);
    }

    public static final AbstractC5607a c(Coupon coupon) {
        Intrinsics.j(coupon, "<this>");
        LocalDateTime redemptionDate = coupon.getRedemptionDate();
        if (redemptionDate != null) {
            return AbstractC5607a.INSTANCE.d(Yk.a.f40280A, redemptionDate.format(C17590a.DATE_SLASHES_SHORT));
        }
        return null;
    }

    public static final AbstractC5607a d(Coupon coupon, ZonedDateTime now) {
        Intrinsics.j(coupon, "<this>");
        Intrinsics.j(now, "now");
        if (coupon.getValidThrough() != null) {
            AbstractC5607a.Companion companion = AbstractC5607a.INSTANCE;
            String validThrough = coupon.getValidThrough();
            Intrinsics.g(validThrough);
            return companion.c(validThrough);
        }
        C13685b c13685b = C13685b.f129031a;
        LocalDateTime redemptionStartDate = coupon.getRedemptionStartDate();
        String str = redemptionStartDate != null ? redemptionStartDate.format(C17590a.ISO_LOCAL_DATE_TIME) : null;
        LocalDateTime redemptionEndDate = coupon.getRedemptionEndDate();
        return c13685b.a(str, redemptionEndDate != null ? redemptionEndDate.format(C17590a.ISO_LOCAL_DATE_TIME) : null, false, now);
    }

    public static /* synthetic */ AbstractC5607a e(Coupon coupon, ZonedDateTime zonedDateTime, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            zonedDateTime = ZonedDateTime.now();
        }
        return d(coupon, zonedDateTime);
    }

    public static final boolean f(Coupon coupon) {
        Intrinsics.j(coupon, "<this>");
        return coupon.getRedemptionDate() != null;
    }

    public static final boolean g(Coupon coupon) {
        if (coupon != null) {
            return (coupon.getIsMeijerBuck() && coupon.x()) || f(coupon);
        }
        return true;
    }
}
