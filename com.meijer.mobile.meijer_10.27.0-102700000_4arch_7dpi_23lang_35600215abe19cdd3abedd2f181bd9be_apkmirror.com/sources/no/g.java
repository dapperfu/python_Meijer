package no;

import com.meijer.mobile.mperks.networking.domain.models.CouponDetails;
import com.meijer.mobile.mperks.networking.domain.models.MperkTransaction;
import com.meijer.mobile.mperks.networking.domain.models.SaleDetails;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import ro.C16825a;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004*\b\u0012\u0004\u0012\u00020\u00000\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0019\u0010\b\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020\u00000\u0004H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\u000b\u001a\u00020\n*\u00020\u0000H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0013\u0010\r\u001a\u00020\n*\u00020\u0000H\u0000¢\u0006\u0004\b\r\u0010\f\u001a\u0015\u0010\u000e\u001a\u0004\u0018\u00010\n*\u00020\u0000H\u0000¢\u0006\u0004\b\u000e\u0010\f\u001a\u0013\u0010\u0010\u001a\u00020\u000f*\u00020\u0000H\u0000¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/meijer/mobile/mperks/networking/domain/models/MperkTransaction;", "Lno/b;", "g", "(Lcom/meijer/mobile/mperks/networking/domain/models/MperkTransaction;)Lno/b;", "", "e", "(Ljava/util/List;)Ljava/util/List;", "", "c", "(Ljava/util/List;)I", "", "d", "(Lcom/meijer/mobile/mperks/networking/domain/models/MperkTransaction;)Ljava/lang/String;", "a", "b", "Lno/f;", "f", "(Lcom/meijer/mobile/mperks/networking/domain/models/MperkTransaction;)Lno/f;", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class g {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return ComparisonsKt.d(((ExpandableTransactionDetailItem) t11).getPostedDateInZone(), ((ExpandableTransactionDetailItem) t10).getPostedDateInZone());
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MperkTransaction.RewardAccountTransactionReason.values().length];
            try {
                iArr[MperkTransaction.RewardAccountTransactionReason.OnlineSale.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MperkTransaction.RewardAccountTransactionReason.InStoreSale.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MperkTransaction.RewardAccountTransactionReason.PartnerSale.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MperkTransaction.RewardAccountTransactionReason.BuyCoupon.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final String a(MperkTransaction mperkTransaction) {
        Intrinsics.j(mperkTransaction, "<this>");
        if (mperkTransaction.getReason() == MperkTransaction.RewardAccountTransactionReason.OnlineSale) {
            SaleDetails saleDetails = mperkTransaction.getSaleDetails();
            if ((saleDetails != null ? saleDetails.getSaleId() : null) != null) {
                SaleDetails saleDetails2 = mperkTransaction.getSaleDetails();
                if ((saleDetails2 != null ? saleDetails2.getDigitalOrderId() : null) != null) {
                    return "Purchase Earnings";
                }
            }
        }
        if (mperkTransaction.getReason() == MperkTransaction.RewardAccountTransactionReason.InStoreSale) {
            SaleDetails saleDetails3 = mperkTransaction.getSaleDetails();
            if ((saleDetails3 != null ? saleDetails3.getSaleId() : null) != null) {
                SaleDetails saleDetails4 = mperkTransaction.getSaleDetails();
                if ((saleDetails4 != null ? saleDetails4.getDigitalOrderId() : null) == null) {
                    SaleDetails saleDetails5 = mperkTransaction.getSaleDetails();
                    if ((saleDetails5 != null ? saleDetails5.getPartner() : null) == null) {
                        return "Purchase Earnings";
                    }
                }
            }
        }
        if (mperkTransaction.getReason() == MperkTransaction.RewardAccountTransactionReason.PartnerSale) {
            SaleDetails saleDetails6 = mperkTransaction.getSaleDetails();
            if ((saleDetails6 != null ? saleDetails6.getSaleId() : null) != null) {
                SaleDetails saleDetails7 = mperkTransaction.getSaleDetails();
                if ((saleDetails7 != null ? saleDetails7.getPartner() : null) != null) {
                    return "Purchase Earnings";
                }
            }
        }
        String label = mperkTransaction.getLabel();
        return label == null ? "Description Pending" : label;
    }

    public static final String b(MperkTransaction mperkTransaction) {
        Intrinsics.j(mperkTransaction, "<this>");
        if (mperkTransaction.getReason() == MperkTransaction.RewardAccountTransactionReason.OnlineSale) {
            SaleDetails saleDetails = mperkTransaction.getSaleDetails();
            if ((saleDetails != null ? saleDetails.getSaleId() : null) != null) {
                SaleDetails saleDetails2 = mperkTransaction.getSaleDetails();
                if ((saleDetails2 != null ? saleDetails2.getDigitalOrderId() : null) != null) {
                    SaleDetails saleDetails3 = mperkTransaction.getSaleDetails();
                    Intrinsics.g(saleDetails3);
                    return saleDetails3.getDigitalOrderId();
                }
            }
        }
        if (mperkTransaction.getReason() == MperkTransaction.RewardAccountTransactionReason.PartnerSale) {
            SaleDetails saleDetails4 = mperkTransaction.getSaleDetails();
            if ((saleDetails4 != null ? saleDetails4.getSaleId() : null) != null) {
                SaleDetails saleDetails5 = mperkTransaction.getSaleDetails();
                if ((saleDetails5 != null ? saleDetails5.getPartner() : null) != null) {
                    SaleDetails saleDetails6 = mperkTransaction.getSaleDetails();
                    Intrinsics.g(saleDetails6);
                    return saleDetails6.getPartnerOrderId();
                }
            }
        }
        return null;
    }

    public static final int c(List<MperkTransaction> list) {
        Intrinsics.j(list, "<this>");
        int points = 0;
        for (MperkTransaction mperkTransaction : list) {
            points = Intrinsics.e(mperkTransaction.getTransactionType(), "Credit") ? points + mperkTransaction.getPoints() : points - mperkTransaction.getPoints();
        }
        return points;
    }

    public static final String d(MperkTransaction mperkTransaction) {
        String clipSourceTitle;
        Intrinsics.j(mperkTransaction, "<this>");
        MperkTransaction.RewardAccountTransactionReason reason = mperkTransaction.getReason();
        int i10 = reason == null ? -1 : a.$EnumSwitchMapping$0[reason.ordinal()];
        if (i10 == 1) {
            return "Online Purchase";
        }
        if (i10 == 2) {
            return "In-Store Purchase";
        }
        if (i10 == 3) {
            return "Partner Purchase";
        }
        if (i10 != 4) {
            String label = mperkTransaction.getLabel();
            return label == null ? "Description Pending" : label;
        }
        CouponDetails couponDetails = mperkTransaction.getCouponDetails();
        return (couponDetails == null || (clipSourceTitle = couponDetails.getClipSourceTitle()) == null) ? "Reward Claimed" : clipSourceTitle;
    }

    public static final List<ExpandableTransactionDetailItem> e(List<MperkTransaction> list) {
        LinkedHashMap linkedHashMap;
        Collection collectionM;
        Intrinsics.j(list, "<this>");
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            SaleDetails saleDetails = ((MperkTransaction) next).getSaleDetails();
            String saleId = saleDetails != null ? saleDetails.getSaleId() : null;
            Object arrayList = linkedHashMap2.get(saleId);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap2.put(saleId, arrayList);
            }
            ((List) arrayList).add(next);
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap2.entrySet()) {
            if (entry.getKey() == null) {
                linkedHashMap3.put(entry.getKey(), entry.getValue());
            }
        }
        List list2 = (List) CollectionsKt.t0(linkedHashMap3.values());
        if (list2 != null) {
            linkedHashMap = new LinkedHashMap();
            for (Object obj : list2) {
                String transactionId = ((MperkTransaction) obj).getTransactionId();
                Object arrayList2 = linkedHashMap.get(transactionId);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    linkedHashMap.put(transactionId, arrayList2);
                }
                ((List) arrayList2).add(obj);
            }
        } else {
            linkedHashMap = null;
        }
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            if (((String) entry2.getKey()) != null) {
                linkedHashMap4.put(entry2.getKey(), entry2.getValue());
            }
        }
        ArrayList arrayList3 = new ArrayList(linkedHashMap4.size());
        for (Map.Entry entry3 : linkedHashMap4.entrySet()) {
            String strA = C16825a.a(((MperkTransaction) CollectionsKt.s0((List) entry3.getValue())).getPostedAt());
            String postedAt = ((MperkTransaction) CollectionsKt.s0((List) entry3.getValue())).getPostedAt();
            String strA2 = a((MperkTransaction) CollectionsKt.s0((List) entry3.getValue()));
            int iC = c((List) entry3.getValue());
            String strD = d((MperkTransaction) CollectionsKt.s0((List) entry3.getValue()));
            String strB = b((MperkTransaction) CollectionsKt.s0((List) entry3.getValue()));
            CouponDetails couponDetails = ((MperkTransaction) CollectionsKt.s0((List) entry3.getValue())).getCouponDetails();
            ExpandTransactionHeader expandTransactionHeader = new ExpandTransactionHeader(strD, strB, couponDetails != null ? couponDetails.getClipLabel() : null);
            Iterable iterable = (Iterable) entry3.getValue();
            ArrayList arrayList4 = new ArrayList(CollectionsKt.x(iterable, 10));
            Iterator it2 = iterable.iterator();
            while (it2.hasNext()) {
                arrayList4.add(f((MperkTransaction) it2.next()));
            }
            arrayList3.add(new ExpandableTransactionDetailItem(null, strA, postedAt, strA2, iC, expandTransactionHeader, arrayList4));
        }
        if (linkedHashMap != null) {
            collectionM = new ArrayList(linkedHashMap.size());
            Iterator it3 = linkedHashMap.entrySet().iterator();
            while (it3.hasNext()) {
                collectionM.add(g((MperkTransaction) CollectionsKt.s0((List) ((Map.Entry) it3.next()).getValue())));
            }
        } else {
            collectionM = CollectionsKt.m();
        }
        return CollectionsKt.Z0(CollectionsKt.P0(arrayList3, collectionM), new b());
    }

    public static final TransactionDetail f(MperkTransaction mperkTransaction) {
        Intrinsics.j(mperkTransaction, "<this>");
        String transactionType = mperkTransaction.getTransactionType();
        int points = mperkTransaction.getPoints();
        String label = mperkTransaction.getLabel();
        if (label == null) {
            label = "Description Pending";
        }
        return new TransactionDetail(transactionType, points, label);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final no.ExpandableTransactionDetailItem g(com.meijer.mobile.mperks.networking.domain.models.MperkTransaction r9) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.j(r9, r0)
            no.b r1 = new no.b
            java.lang.String r2 = r9.getTransactionType()
            java.lang.String r0 = r9.getPostedAt()
            java.lang.String r3 = ro.C16825a.a(r0)
            java.lang.String r4 = r9.getPostedAt()
            java.lang.String r5 = r9.getLabel()
            int r6 = r9.getPoints()
            com.meijer.mobile.mperks.networking.domain.models.MperkTransaction$RewardAccountTransactionReason r0 = r9.getReason()
            com.meijer.mobile.mperks.networking.domain.models.MperkTransaction$RewardAccountTransactionReason r7 = com.meijer.mobile.mperks.networking.domain.models.MperkTransaction.RewardAccountTransactionReason.BuyCoupon
            r8 = 0
            if (r0 != r7) goto L54
            com.meijer.mobile.mperks.networking.domain.models.CouponDetails r0 = r9.getCouponDetails()
            if (r0 == 0) goto L33
            java.lang.String r0 = r0.getClipSource()
            goto L34
        L33:
            r0 = r8
        L34:
            if (r0 == 0) goto L54
            int r0 = r0.length()
            if (r0 != 0) goto L3d
            goto L54
        L3d:
            no.a r0 = new no.a
            java.lang.String r7 = d(r9)
            com.meijer.mobile.mperks.networking.domain.models.CouponDetails r9 = r9.getCouponDetails()
            if (r9 == 0) goto L4e
            java.lang.String r9 = r9.getClipLabel()
            goto L4f
        L4e:
            r9 = r8
        L4f:
            r0.<init>(r7, r8, r9)
            r7 = r0
            goto L55
        L54:
            r7 = r8
        L55:
            r8 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: no.g.g(com.meijer.mobile.mperks.networking.domain.models.MperkTransaction):no.b");
    }
}
