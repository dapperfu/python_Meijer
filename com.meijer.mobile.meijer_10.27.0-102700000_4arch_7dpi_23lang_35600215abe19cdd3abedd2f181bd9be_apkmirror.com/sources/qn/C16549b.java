package qn;

import ej.H;
import ej.PaymentRefundDetailInfo;
import ej.Tender;
import ej.TendersItem;
import ej.TransactionDetail;
import ej.TransactionDetails;
import gj.EbtTransaction;
import gn.C14282c;
import gn.EbtTransactionItemDecorator;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a+\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0004\b\b\u0010\t\u001a!\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00022\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0002¢\u0006\u0004\b\r\u0010\t¨\u0006\u000e"}, d2 = {"Lej/G;", "tenderDetails", "", "Lgj/b;", "ebtTransactionList", "Lgn/d;", "c", "(Lej/G;Ljava/util/List;)Ljava/util/List;", "a", "(Ljava/util/List;)Ljava/util/List;", "Lej/F;", "creditCardTransactionList", "Lgn/c;", "b", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: qn.b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C16549b {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: qn.b$b, reason: collision with other inner class name */
    public static final class C2439b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return ComparisonsKt.d(Integer.valueOf(Integer.parseInt(((EbtTransaction) t11).getEbtDetails().getCartID())), Integer.valueOf(Integer.parseInt(((EbtTransaction) t10).getEbtDetails().getCartID())));
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: qn.b$c */
    public static final class c<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            H type = ((TransactionDetail) t10).getType();
            int[] iArr = a.$EnumSwitchMapping$0;
            int i10 = iArr[type.ordinal()];
            int i11 = 4;
            Integer numValueOf = Integer.valueOf(i10 != 1 ? i10 != 2 ? i10 != 3 ? 4 : 3 : 2 : 1);
            int i12 = iArr[((TransactionDetail) t11).getType().ordinal()];
            if (i12 == 1) {
                i11 = 1;
            } else if (i12 == 2) {
                i11 = 2;
            } else if (i12 == 3) {
                i11 = 3;
            }
            return ComparisonsKt.d(numValueOf, Integer.valueOf(i11));
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: qn.b$d */
    public static final class d<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return ComparisonsKt.d(((PaymentRefundDetailInfo) t11).getSequence(), ((PaymentRefundDetailInfo) t10).getSequence());
        }
    }

    private static final List<EbtTransactionItemDecorator> a(List<EbtTransaction> list) {
        List listP;
        Iterable<IndexedValue> iterableS1 = CollectionsKt.s1(CollectionsKt.Z0(list, new C2439b()));
        ArrayList arrayList = new ArrayList();
        for (IndexedValue indexedValue : iterableS1) {
            int index = indexedValue.getIndex();
            EbtTransaction ebtTransaction = (EbtTransaction) indexedValue.b();
            if (index == CollectionsKt.o(list)) {
                EbtTransactionItemDecorator.Companion companion = EbtTransactionItemDecorator.INSTANCE;
                listP = CollectionsKt.p(EbtTransactionItemDecorator.Companion.d(companion, ebtTransaction, true, false, 2, null), companion.c(ebtTransaction, false, true));
            } else {
                EbtTransactionItemDecorator.Companion companion2 = EbtTransactionItemDecorator.INSTANCE;
                listP = CollectionsKt.p(EbtTransactionItemDecorator.Companion.d(companion2, ebtTransaction, true, false, 2, null), EbtTransactionItemDecorator.Companion.d(companion2, ebtTransaction, false, false, 2, null));
            }
            CollectionsKt.C(arrayList, listP);
        }
        return arrayList;
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: qn.b$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[H.values().length];
            try {
                iArr[H.f128849d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[H.f128848c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[H.f128847b.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final List<C14282c> b(List<Tender> creditCardTransactionList) {
        Intrinsics.j(creditCardTransactionList, "creditCardTransactionList");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = creditCardTransactionList.iterator();
        while (it.hasNext()) {
            CollectionsKt.C(arrayList, ((Tender) it.next()).a());
        }
        List listZ0 = CollectionsKt.Z0(arrayList, new c());
        ArrayList arrayList2 = new ArrayList(CollectionsKt.x(listZ0, 10));
        Iterator it2 = listZ0.iterator();
        while (it2.hasNext()) {
            arrayList2.add(C14282c.INSTANCE.a((TransactionDetail) it2.next()));
        }
        return arrayList2;
    }

    public static final List<EbtTransactionItemDecorator> c(TendersItem tendersItem, List<EbtTransaction> ebtTransactionList) {
        TransactionDetails transactionDetails;
        TransactionDetails transactionDetails2;
        Intrinsics.j(ebtTransactionList, "ebtTransactionList");
        ArrayList arrayList = new ArrayList();
        List<PaymentRefundDetailInfo> listG = (tendersItem == null || (transactionDetails2 = tendersItem.getTransactionDetails()) == null) ? null : transactionDetails2.g();
        if (listG == null) {
            listG = CollectionsKt.m();
        }
        List listZ0 = CollectionsKt.Z0(listG, new d());
        ArrayList arrayList2 = new ArrayList(CollectionsKt.x(listZ0, 10));
        Iterator it = listZ0.iterator();
        while (it.hasNext()) {
            arrayList2.add(EbtTransactionItemDecorator.INSTANCE.a((PaymentRefundDetailInfo) it.next()));
        }
        arrayList.addAll(arrayList2);
        if (tendersItem != null && (transactionDetails = tendersItem.getTransactionDetails()) != null) {
            arrayList.add(EbtTransactionItemDecorator.INSTANCE.b(transactionDetails, ebtTransactionList.isEmpty()));
        }
        arrayList.addAll(a(ebtTransactionList));
        return arrayList;
    }
}
