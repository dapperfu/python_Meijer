package go;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/meijer/mobile/mperks/networking/api/models/AvailableRewardCouponJson;", "Lcom/meijer/mobile/mperks/networking/domain/models/AvailableRewardCoupon;", "a", "(Lcom/meijer/mobile/mperks/networking/api/models/AvailableRewardCouponJson;)Lcom/meijer/mobile/mperks/networking/domain/models/AvailableRewardCoupon;", "networking_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: go.c, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C14397c {
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.meijer.mobile.mperks.networking.domain.models.AvailableRewardCoupon a(com.meijer.mobile.mperks.networking.api.models.AvailableRewardCouponJson r12) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.j(r12, r0)
            com.meijer.mobile.mperks.networking.domain.models.AvailableRewardCoupon r1 = new com.meijer.mobile.mperks.networking.domain.models.AvailableRewardCoupon
            long r2 = r12.getCouponId()
            java.lang.String r4 = r12.getImageUrl()
            java.lang.String r5 = r12.getName()
            java.lang.String r6 = r12.getDescription()
            java.lang.String r0 = r12.getDisplayStart()
            r7 = 0
            if (r0 == 0) goto L42
            wk.a r8 = wk.C17898a.f167225a
            j$.time.format.DateTimeFormatter r8 = r8.s()
            uh.j r9 = new uh.j
            r9.<init>()
            java.lang.Object r0 = wk.d.b(r0, r8, r9)
            j$.time.LocalDateTime r0 = (j$.time.LocalDateTime) r0
            if (r0 == 0) goto L42
            j$.time.ZoneId r8 = wk.e.EASTERN
            j$.time.ZonedDateTime r0 = r0.N(r8)
            if (r0 == 0) goto L42
            j$.time.ZoneId r8 = j$.time.ZoneId.systemDefault()
            j$.time.ZonedDateTime r0 = r0.n(r8)
            goto L43
        L42:
            r0 = r7
        L43:
            java.lang.String r8 = r12.getDisplayEnd()
            if (r8 == 0) goto L6c
            wk.a r9 = wk.C17898a.f167225a
            j$.time.format.DateTimeFormatter r9 = r9.s()
            uh.j r10 = new uh.j
            r10.<init>()
            java.lang.Object r8 = wk.d.b(r8, r9, r10)
            j$.time.LocalDateTime r8 = (j$.time.LocalDateTime) r8
            if (r8 == 0) goto L6c
            j$.time.ZoneId r9 = wk.e.EASTERN
            j$.time.ZonedDateTime r8 = r8.N(r9)
            if (r8 == 0) goto L6c
            j$.time.ZoneId r7 = j$.time.ZoneId.systemDefault()
            j$.time.ZonedDateTime r7 = r8.n(r7)
        L6c:
            r8 = r7
            java.lang.String r9 = r12.getTermsAndConditions()
            int r10 = r12.getPointCost()
            java.lang.String r12 = r12.getRewardCouponType()
            if (r12 == 0) goto Lb5
            int r7 = r12.hashCode()
            r11 = -627305886(0xffffffffda9c1262, float:-2.1965154E16)
            if (r7 == r11) goto La9
            r11 = 2198156(0x218a8c, float:3.080273E-39)
            if (r7 == r11) goto L9d
            r11 = 2201046(0x2195d6, float:3.084322E-39)
            if (r7 == r11) goto L8f
            goto Lb5
        L8f:
            java.lang.String r7 = "Fuel"
            boolean r12 = r12.equals(r7)
            if (r12 != 0) goto L98
            goto Lb5
        L98:
            co.d r12 = co.EnumC6532d.f62701c
        L9a:
            r11 = r12
            r7 = r0
            goto Lb8
        L9d:
            java.lang.String r7 = "Free"
            boolean r12 = r12.equals(r7)
            if (r12 != 0) goto La6
            goto Lb5
        La6:
            co.d r12 = co.EnumC6532d.f62700b
            goto L9a
        La9:
            java.lang.String r7 = "Total Basket"
            boolean r12 = r12.equals(r7)
            if (r12 != 0) goto Lb2
            goto Lb5
        Lb2:
            co.d r12 = co.EnumC6532d.f62702d
            goto L9a
        Lb5:
            co.d r12 = co.EnumC6532d.f62699a
            goto L9a
        Lb8:
            r1.<init>(r2, r4, r5, r6, r7, r8, r9, r10, r11)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: go.C14397c.a(com.meijer.mobile.mperks.networking.api.models.AvailableRewardCouponJson):com.meijer.mobile.mperks.networking.domain.models.AvailableRewardCoupon");
    }
}
