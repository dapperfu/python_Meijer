package Km;

import Pk.Coupon;
import Pk.CouponCategory;
import Ur.d;
import fl.C14018c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJC\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00100\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"LKm/v;", "", "<init>", "()V", "", "LPk/a;", "coupons", "", "a", "(Ljava/util/List;)Z", "showCategoryHeaders", "showSpecialOfferBanner", "", "specialOffersUrl", "Ldl/d;", "couponsRepository", "LUr/d$j;", "b", "(Ljava/util/List;ZZLjava/lang/String;Ldl/d;)Ljava/util/List;", "", "sectionName", "c", "(Ljava/util/List;I)Ljava/util/List;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public static final v f17576a = new v();

    /* JADX WARN: Removed duplicated region for block: B:18:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<Ur.d.j> b(java.util.List<Pk.Coupon> r9, boolean r10, boolean r11, java.lang.String r12, dl.C13702d r13) {
        /*
            r8 = this;
            java.lang.String r0 = "coupons"
            kotlin.jvm.internal.Intrinsics.j(r9, r0)
            java.lang.String r0 = "couponsRepository"
            kotlin.jvm.internal.Intrinsics.j(r13, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r11 == 0) goto L1e
            Ur.d$j r11 = new Ur.d$j
            Vr.e r1 = new Vr.e
            r1.<init>(r12, r13)
            r11.<init>(r1)
            r0.add(r11)
        L1e:
            if (r10 == 0) goto L7c
            boolean r10 = r8.a(r9)
            if (r10 == 0) goto L7c
            java.util.Iterator r9 = r9.iterator()
            r10 = 0
            r11 = r10
            r12 = r11
        L2d:
            boolean r13 = r9.hasNext()
            if (r13 == 0) goto La3
            java.lang.Object r13 = r9.next()
            Pk.a r13 = (Pk.Coupon) r13
            Pk.b r1 = r13.getCategory()
            if (r11 == 0) goto L4d
            if (r1 == 0) goto L46
            java.lang.String r2 = r1.getSegmentID()
            goto L47
        L46:
            r2 = r10
        L47:
            boolean r2 = kotlin.jvm.internal.Intrinsics.e(r11, r2)
            if (r2 != 0) goto L70
        L4d:
            if (r1 == 0) goto L54
            java.lang.String r11 = r1.getSegmentID()
            goto L55
        L54:
            r11 = r10
        L55:
            Ur.d$m r2 = new Ur.d$m
            if (r1 == 0) goto L5f
            java.lang.String r12 = r1.getSegmentName()
            r3 = r12
            goto L60
        L5f:
            r3 = r10
        L60:
            r6 = 6
            r7 = 0
            r4 = 0
            r5 = 0
            r2.<init>(r3, r4, r5, r6, r7)
            Ur.d$j r12 = new Ur.d$j
            r12.<init>(r2)
            r0.add(r12)
            r12 = r2
        L70:
            Ur.d$j r1 = new Ur.d$j
            kotlin.jvm.internal.Intrinsics.g(r12)
            r1.<init>(r12, r13)
            r0.add(r1)
            goto L2d
        L7c:
            r10 = r9
            java.util.Collection r10 = (java.util.Collection) r10
            kotlin.ranges.IntRange r10 = kotlin.collections.CollectionsKt.n(r10)
            java.util.Iterator r10 = r10.iterator()
        L87:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto La3
            r11 = r10
            kotlin.collections.IntIterator r11 = (kotlin.collections.IntIterator) r11
            int r11 = r11.nextInt()
            Ur.d$j r12 = new Ur.d$j
            java.lang.Object r13 = r9.get(r11)
            Pk.a r13 = (Pk.Coupon) r13
            r12.<init>(r13, r11)
            r0.add(r12)
            goto L87
        La3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Km.v.b(java.util.List, boolean, boolean, java.lang.String, dl.d):java.util.List");
    }

    public final List<d.j> c(List<Coupon> coupons, int sectionName) {
        Intrinsics.j(coupons, "coupons");
        ArrayList arrayList = new ArrayList();
        int size = coupons.size();
        d.Section section = null;
        for (int i10 = 0; i10 < size; i10++) {
            Coupon coupon = coupons.get(i10);
            if (C14018c.f(coupon)) {
                if (section == null) {
                    section = new d.Section(sectionName);
                    arrayList.add(new d.j(section));
                }
                arrayList.add(new d.j(section, coupon));
            } else {
                arrayList.add(new d.j(coupon, i10));
            }
        }
        return arrayList;
    }

    private v() {
    }

    private final boolean a(List<Coupon> coupons) {
        String segmentID;
        if (coupons.isEmpty()) {
            return false;
        }
        Iterator<T> it = coupons.iterator();
        while (it.hasNext()) {
            CouponCategory category = ((Coupon) it.next()).getCategory();
            if (category != null) {
                segmentID = category.getSegmentID();
            } else {
                segmentID = null;
            }
            if (segmentID == null) {
                return false;
            }
        }
        return true;
    }
}
