package no;

import com.meijer.mobile.mperks.networking.domain.models.ClipSource;
import com.meijer.mobile.mperks.networking.domain.models.MperksTransaction;
import com.meijer.mobile.mperks.networking.domain.models.ReasonDetails;
import com.meijer.mobile.mperks.networking.domain.models.RewardAccountTransactionReason;
import j$.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import ro.C16931a;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004*\b\u0012\u0004\u0012\u00020\u00000\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0019\u0010\b\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020\u00000\u0004H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\u000b\u001a\u00020\n*\u00020\u0000H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0013\u0010\r\u001a\u00020\n*\u00020\u0000H\u0000¢\u0006\u0004\b\r\u0010\f\u001a\u001f\u0010\u0011\u001a\u0004\u0018\u00010\n*\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0015\u0010\u0013\u001a\u0004\u0018\u00010\n*\u00020\u0000H\u0000¢\u0006\u0004\b\u0013\u0010\f\u001a\u001f\u0010\u0014\u001a\u0004\u0018\u00010\n*\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0014\u0010\u0012\u001a\u0013\u0010\u0016\u001a\u00020\u0015*\u00020\u0000H\u0000¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/meijer/mobile/mperks/networking/domain/models/MperksTransaction;", "Lno/b;", "i", "(Lcom/meijer/mobile/mperks/networking/domain/models/MperksTransaction;)Lno/b;", "", "g", "(Ljava/util/List;)Ljava/util/List;", "", "e", "(Ljava/util/List;)I", "", "f", "(Lcom/meijer/mobile/mperks/networking/domain/models/MperksTransaction;)Ljava/lang/String;", "a", "Lcom/meijer/mobile/mperks/networking/domain/models/ReasonDetails$SaleDetails;", "Lcom/meijer/mobile/mperks/networking/domain/models/RewardAccountTransactionReason;", "reason", "b", "(Lcom/meijer/mobile/mperks/networking/domain/models/ReasonDetails$SaleDetails;Lcom/meijer/mobile/mperks/networking/domain/models/RewardAccountTransactionReason;)Ljava/lang/String;", "c", "d", "Lno/f;", "h", "(Lcom/meijer/mobile/mperks/networking/domain/models/MperksTransaction;)Lno/f;", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
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
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ClipSource.values().length];
            try {
                iArr[ClipSource.Customer.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ClipSource.SystemAutoClaim.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ClipSource.CallCenterAgent.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[RewardAccountTransactionReason.values().length];
            try {
                iArr2[RewardAccountTransactionReason.OnlineSale.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[RewardAccountTransactionReason.InStoreSale.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[RewardAccountTransactionReason.PartnerSale.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[RewardAccountTransactionReason.BuyCoupon.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final String a(MperksTransaction mperksTransaction) {
        Intrinsics.j(mperksTransaction, "<this>");
        ReasonDetails reasonDetails = mperksTransaction.getReasonDetails();
        if (!(reasonDetails instanceof ReasonDetails.SaleDetails)) {
            String label = mperksTransaction.getLabel();
            return label == null ? "Description Pending" : label;
        }
        ReasonDetails.SaleDetails saleDetails = (ReasonDetails.SaleDetails) reasonDetails;
        ReasonDetails reasonDetails2 = mperksTransaction.getReasonDetails();
        String strB = b(saleDetails, reasonDetails2 != null ? reasonDetails2.getReason() : null);
        if (strB != null) {
            return strB;
        }
        String label2 = mperksTransaction.getLabel();
        return label2 == null ? "Description Pending" : label2;
    }

    private static final String b(ReasonDetails.SaleDetails saleDetails, RewardAccountTransactionReason rewardAccountTransactionReason) {
        if (rewardAccountTransactionReason == RewardAccountTransactionReason.OnlineSale && saleDetails.getSaleId() != null && saleDetails.getDigitalOrderId() != null) {
            return "Purchase Earnings";
        }
        if (rewardAccountTransactionReason == RewardAccountTransactionReason.InStoreSale && saleDetails.getSaleId() != null && saleDetails.getDigitalOrderId() == null && saleDetails.getPartner() == null) {
            return "Purchase Earnings";
        }
        if (rewardAccountTransactionReason != RewardAccountTransactionReason.PartnerSale || saleDetails.getSaleId() == null || saleDetails.getPartner() == null) {
            return null;
        }
        return "Purchase Earnings";
    }

    public static final String c(MperksTransaction mperksTransaction) {
        Intrinsics.j(mperksTransaction, "<this>");
        ReasonDetails reasonDetails = mperksTransaction.getReasonDetails();
        if (!(reasonDetails instanceof ReasonDetails.SaleDetails)) {
            return null;
        }
        ReasonDetails.SaleDetails saleDetails = (ReasonDetails.SaleDetails) reasonDetails;
        ReasonDetails reasonDetails2 = mperksTransaction.getReasonDetails();
        return d(saleDetails, reasonDetails2 != null ? reasonDetails2.getReason() : null);
    }

    private static final String d(ReasonDetails.SaleDetails saleDetails, RewardAccountTransactionReason rewardAccountTransactionReason) {
        if (rewardAccountTransactionReason == RewardAccountTransactionReason.OnlineSale && saleDetails.getSaleId() != null && saleDetails.getDigitalOrderId() != null) {
            return saleDetails.getDigitalOrderId();
        }
        if (rewardAccountTransactionReason != RewardAccountTransactionReason.PartnerSale || saleDetails.getSaleId() == null || saleDetails.getPartner() == null) {
            return null;
        }
        return saleDetails.getPartnerOrderId();
    }

    public static final int e(List<MperksTransaction> list) {
        Intrinsics.j(list, "<this>");
        int points = 0;
        for (MperksTransaction mperksTransaction : list) {
            points = mperksTransaction.getTransactionType() == MperksTransaction.TransactionType.CREDIT ? points + mperksTransaction.getPoints() : points - mperksTransaction.getPoints();
        }
        return points;
    }

    public static final String f(MperksTransaction mperksTransaction) {
        Intrinsics.j(mperksTransaction, "<this>");
        ReasonDetails reasonDetails = mperksTransaction.getReasonDetails();
        RewardAccountTransactionReason reason = reasonDetails != null ? reasonDetails.getReason() : null;
        int i10 = reason == null ? -1 : a.$EnumSwitchMapping$1[reason.ordinal()];
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
            String label = mperksTransaction.getLabel();
            return label == null ? "Description Pending" : label;
        }
        ReasonDetails reasonDetails2 = mperksTransaction.getReasonDetails();
        if (reasonDetails2 instanceof ReasonDetails.CouponDetails) {
            ClipSource clipSource = ((ReasonDetails.CouponDetails) reasonDetails2).getClipSource();
            int i11 = clipSource == null ? -1 : a.$EnumSwitchMapping$0[clipSource.ordinal()];
            if (i11 != -1) {
                if (i11 == 1) {
                    return "Claimed by You";
                }
                if (i11 == 2) {
                    return "Auto Claimed";
                }
                if (i11 == 3) {
                    return "Claimed by Meijer Team Member";
                }
                throw new NoWhenBranchMatchedException();
            }
        }
        return "Reward Claimed";
    }

    public static final List<ExpandableTransactionDetailItem> g(List<MperksTransaction> list) {
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
            ReasonDetails reasonDetails = ((MperksTransaction) next).getReasonDetails();
            String saleId = reasonDetails instanceof ReasonDetails.SaleDetails ? ((ReasonDetails.SaleDetails) reasonDetails).getSaleId() : null;
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
                String transactionId = ((MperksTransaction) obj).getTransactionId();
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
            String strA = C16931a.a(((MperksTransaction) CollectionsKt.s0((List) entry3.getValue())).getPostedAt());
            ZonedDateTime postedAt = ((MperksTransaction) CollectionsKt.s0((List) entry3.getValue())).getPostedAt();
            String strA2 = a((MperksTransaction) CollectionsKt.s0((List) entry3.getValue()));
            int iE = e((List) entry3.getValue());
            ExpandTransactionHeader expandTransactionHeader = new ExpandTransactionHeader(f((MperksTransaction) CollectionsKt.s0((List) entry3.getValue())), c((MperksTransaction) CollectionsKt.s0((List) entry3.getValue())), null);
            Iterable iterable = (Iterable) entry3.getValue();
            ArrayList arrayList4 = new ArrayList(CollectionsKt.x(iterable, 10));
            Iterator it2 = iterable.iterator();
            while (it2.hasNext()) {
                arrayList4.add(h((MperksTransaction) it2.next()));
            }
            arrayList3.add(new ExpandableTransactionDetailItem(null, strA, postedAt, strA2, iE, expandTransactionHeader, arrayList4));
        }
        if (linkedHashMap != null) {
            collectionM = new ArrayList(linkedHashMap.size());
            Iterator it3 = linkedHashMap.entrySet().iterator();
            while (it3.hasNext()) {
                collectionM.add(i((MperksTransaction) CollectionsKt.s0((List) ((Map.Entry) it3.next()).getValue())));
            }
        } else {
            collectionM = CollectionsKt.m();
        }
        return CollectionsKt.Z0(CollectionsKt.P0(arrayList3, collectionM), new b());
    }

    public static final TransactionDetail h(MperksTransaction mperksTransaction) {
        Intrinsics.j(mperksTransaction, "<this>");
        MperksTransaction.TransactionType transactionType = mperksTransaction.getTransactionType();
        int points = mperksTransaction.getPoints();
        String label = mperksTransaction.getLabel();
        if (label == null) {
            label = "Description Pending";
        }
        return new TransactionDetail(transactionType, points, label);
    }

    public static final ExpandableTransactionDetailItem i(MperksTransaction mperksTransaction) {
        Intrinsics.j(mperksTransaction, "<this>");
        MperksTransaction.TransactionType transactionType = mperksTransaction.getTransactionType();
        String strA = C16931a.a(mperksTransaction.getPostedAt());
        ZonedDateTime postedAt = mperksTransaction.getPostedAt();
        String label = mperksTransaction.getLabel();
        int points = mperksTransaction.getPoints();
        ReasonDetails reasonDetails = mperksTransaction.getReasonDetails();
        ExpandTransactionHeader expandTransactionHeader = null;
        if (reasonDetails instanceof ReasonDetails.CouponDetails) {
            ReasonDetails.CouponDetails couponDetails = (ReasonDetails.CouponDetails) reasonDetails;
            if (couponDetails.getClipSource() != null) {
                expandTransactionHeader = new ExpandTransactionHeader(f(mperksTransaction), null, couponDetails.getClipLabel());
            }
        }
        return new ExpandableTransactionDetailItem(transactionType, strA, postedAt, label, points, expandTransactionHeader, CollectionsKt.m());
    }
}
