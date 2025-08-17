package Rm;

import Lm.a;
import ak.AbstractC5607a;
import com.meijer.mobile.meijer.Y;
import hi.C14476c;
import hi.C14480g;
import hi.TrackingData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import sk.C16981a;
import vk.C17590a;
import wo.C17842a;
import zp.DigitalReceipt;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0001\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u001b\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001d\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0017R\u0011\u0010\u001f\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0017R\u0011\u0010#\u001a\u00020 8F¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0011\u0010%\u001a\u00020 8F¢\u0006\u0006\u001a\u0004\b$\u0010\"R\u0011\u0010'\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b&\u0010\u001aR\u0011\u0010)\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b(\u0010\u001aR\u0011\u0010+\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b*\u0010\u001aR\u0011\u0010-\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b,\u0010\u001aR\u0011\u0010/\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b.\u0010\u001aR\u0011\u00101\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b0\u0010\u001a¨\u00062"}, d2 = {"LRm/d;", "", "", "receiptPosition", "", "isLastChild", "Lzp/b;", "receipt", "<init>", "(IZLzp/b;)V", "LLm/a;", "f", "()LLm/a;", "a", "I", "b", "Z", "c", "Lzp/b;", "getReceipt", "()Lzp/b;", "", "e", "()Ljava/lang/String;", "cityStateZip", "n", "()Z", "isBottomDividerVisible", "k", "receiptDate", "d", "amountSpent", "Lak/a;", "j", "()Lak/a;", "itemsCount", "l", "storeAddressInfo", "o", "isCustomerResubmit", "q", "isOnlineOrder", "p", "isInStorePurchase", "r", "isReceiptTotalVisible", "s", "isStoreAddressInfoVisible", "m", "isAccepted", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Rm.d, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C5184d {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int receiptPosition;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean isLastChild;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final DigitalReceipt receipt;

    public C5184d(int i10, boolean z10, DigitalReceipt receipt) {
        Intrinsics.j(receipt, "receipt");
        this.receiptPosition = i10;
        this.isLastChild = z10;
        this.receipt = receipt;
    }

    private final String e() {
        DigitalReceipt digitalReceipt = this.receipt;
        return C16981a.f160555a.c(digitalReceipt.getStoreCity(), digitalReceipt.getStoreState(), digitalReceipt.getStoreZipCode());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(TrackingData TrackingData) {
        Intrinsics.j(TrackingData, "$this$TrackingData");
        TrackingData.n("receipts and savings");
        TrackingData.v("receipt and savings");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(TrackingData TrackingData) {
        Intrinsics.j(TrackingData, "$this$TrackingData");
        TrackingData.n("receipts and savings");
        TrackingData.v("receipt and savings");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(TrackingData TrackingData) {
        Intrinsics.j(TrackingData, "$this$TrackingData");
        TrackingData.n("receipts and savings");
        TrackingData.v("receipt and savings");
        return Unit.f142422a;
    }

    public final String d() {
        return Fk.g.c(this.receipt.getTotalSpent());
    }

    public final AbstractC5607a j() {
        return AbstractC5607a.INSTANCE.b(C17842a.f166237a, this.receipt.getNumberOfItems(), new Object[0]);
    }

    public final String k() {
        String str = this.receipt.getTransactionDateTime().format(C17590a.f164803a.c());
        Intrinsics.i(str, "format(...)");
        return str;
    }

    public final AbstractC5607a l() {
        AbstractC5607a.Companion companion = AbstractC5607a.INSTANCE;
        int i10 = Y.f99546Ef;
        String storeName = this.receipt.getStoreName();
        Intrinsics.g(storeName);
        String storeAddress = this.receipt.getStoreAddress();
        Intrinsics.g(storeAddress);
        return companion.d(i10, storeName, storeAddress, e());
    }

    public final boolean m() {
        return this.receipt.getProcessingStatus() == DigitalReceipt.EnumC2799b.f173162c;
    }

    public final boolean n() {
        return !this.isLastChild;
    }

    public final boolean o() {
        return this.receipt.getTransactionType() == DigitalReceipt.c.f173167c;
    }

    public final boolean p() {
        return this.receipt.getTransactionType() == DigitalReceipt.c.f173166b;
    }

    public final boolean q() {
        return this.receipt.getTransactionType() == DigitalReceipt.c.f173168d;
    }

    public final Lm.a f() {
        if (q()) {
            return new a.DisplayOrderDetails(this.receipt.getOnlineOrderId(), C14480g.a(C14476c.a("event: receipts and savings: view shipt receipt"), new Function1() { // from class: Rm.a
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C5184d.g((TrackingData) obj);
                }
            }));
        }
        if (o() && m()) {
            return new a.ResubmitCustomerDetail(C14480g.a(C14476c.a("event: receipts and savings: accepted receipt"), new Function1() { // from class: Rm.b
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C5184d.h((TrackingData) obj);
                }
            }));
        }
        if (p()) {
            return new a.DisplayReceiptsDetail(this.receipt, C14480g.a(C14476c.a("event: receipts and savings: accepted receipt"), new Function1() { // from class: Rm.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C5184d.i((TrackingData) obj);
                }
            }));
        }
        return null;
    }

    public final boolean r() {
        if ((m() && o()) || p()) {
            return true;
        }
        return false;
    }

    public final boolean s() {
        return p();
    }
}
