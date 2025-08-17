package iq;

import ak.AbstractC5607a;
import androidx.recyclerview.widget.RecyclerView;
import hq.ShopAndScanCartTotalsDecorator;
import hq.ShopAndScanItemDecorator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b/\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u001dB·\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t\u0012\b\b\u0002\u0010\u000f\u001a\u00020\t\u0012\b\b\u0002\u0010\u0010\u001a\u00020\t\u0012\b\b\u0002\u0010\u0011\u001a\u00020\t\u0012\b\b\u0002\u0010\u0012\u001a\u00020\t\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0017¢\u0006\u0004\b\u001b\u0010\u001cJÀ\u0001\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\t2\b\b\u0002\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u0017HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010$\u001a\u00020\t2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010&\u001a\u0004\b'\u0010(R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b-\u0010/R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b4\u00101\u001a\u0004\b5\u00103R\u0017\u0010\f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b6\u00101\u001a\u0004\b7\u00103R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b7\u00101\u001a\u0004\b8\u00103R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b9\u00101\u001a\u0004\b:\u00103R\u0017\u0010\u000f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b;\u00101\u001a\u0004\b6\u00103R\u0017\u0010\u0010\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b+\u00101\u001a\u0004\b4\u00103R\u0017\u0010\u0011\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b<\u00101\u001a\u0004\b0\u00103R\u0017\u0010\u0012\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b=\u00101\u001a\u0004\b>\u00103R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\b?\u0010AR\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b'\u0010B\u001a\u0004\b=\u0010 R\u0017\u0010\u0018\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b:\u0010C\u001a\u0004\b9\u0010\"R\u0017\u0010\u0019\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\bD\u0010C\u001a\u0004\b;\u0010\"R\u0017\u0010\u001a\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b2\u0010C\u001a\u0004\b<\u0010\"R\u0011\u0010E\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bD\u00103¨\u0006F"}, d2 = {"Liq/E;", "", "Lak/a;", "storeName", "", "Lhq/f;", "items", "Lhq/c;", "cartTotals", "", "isGreenville", "displayCancelTripDialog", "displayUnclippedCouponsDialog", "unclippedCouponsDialogAcknowledged", "unclippedCoupons", "displayCheckOutConfirmDialog", "checkOutConfirmDialogAcknowledged", "checkOutConfirmDialog", "isRefreshing", "Liq/E$a;", "refreshMessage", "", "quantityStepperSelected", "", "firstVisibleIndex", "firstVisibleItemScrollOffset", "previousItemCount", "<init>", "(Lak/a;Ljava/util/List;Lhq/c;ZZZZZZZZZLiq/E$a;Ljava/lang/String;III)V", "a", "(Lak/a;Ljava/util/List;Lhq/c;ZZZZZZZZZLiq/E$a;Ljava/lang/String;III)Liq/E;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lak/a;", "n", "()Lak/a;", "b", "Ljava/util/List;", "j", "()Ljava/util/List;", "c", "Lhq/c;", "()Lhq/c;", "d", "Z", "q", "()Z", "e", "getDisplayCancelTripDialog", "f", "g", "getUnclippedCouponsDialogAcknowledged", "h", "o", "i", "k", "l", "r", "m", "Liq/E$a;", "()Liq/E$a;", "Ljava/lang/String;", "I", "p", "isCartEmpty", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: iq.E, reason: from toString */
/* loaded from: classes11.dex */
public final /* data */ class ShopAndScanCartViewState {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC5607a storeName;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<ShopAndScanItemDecorator> items;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final ShopAndScanCartTotalsDecorator cartTotals;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isGreenville;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean displayCancelTripDialog;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean displayUnclippedCouponsDialog;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean unclippedCouponsDialogAcknowledged;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean unclippedCoupons;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean displayCheckOutConfirmDialog;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean checkOutConfirmDialogAcknowledged;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean checkOutConfirmDialog;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isRefreshing;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final a refreshMessage;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final String quantityStepperSelected;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private final int firstVisibleIndex;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    private final int firstVisibleItemScrollOffset;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
    private final int previousItemCount;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Liq/E$a;", "", "<init>", "()V", "a", "b", "Liq/E$a$a;", "Liq/E$a$b;", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: iq.E$a */
    public static abstract class a {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Liq/E$a$a;", "Liq/E$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: iq.E$a$a, reason: collision with other inner class name */
        public static final /* data */ class C2183a extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final C2183a f138362a = new C2183a();

            private C2183a() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C2183a);
            }

            public String toString() {
                return "None";
            }

            public int hashCode() {
                return 437597637;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Liq/E$a$b;", "Liq/E$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: iq.E$a$b */
        public static final /* data */ class b extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final b f138363a = new b();

            private b() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof b);
            }

            public String toString() {
                return "Success";
            }

            public int hashCode() {
                return 1549668950;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public ShopAndScanCartViewState() {
        this(null, null, null, false, false, false, false, false, false, false, false, false, null, null, 0, 0, 0, 131071, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShopAndScanCartViewState)) {
            return false;
        }
        ShopAndScanCartViewState shopAndScanCartViewState = (ShopAndScanCartViewState) other;
        return Intrinsics.e(this.storeName, shopAndScanCartViewState.storeName) && Intrinsics.e(this.items, shopAndScanCartViewState.items) && Intrinsics.e(this.cartTotals, shopAndScanCartViewState.cartTotals) && this.isGreenville == shopAndScanCartViewState.isGreenville && this.displayCancelTripDialog == shopAndScanCartViewState.displayCancelTripDialog && this.displayUnclippedCouponsDialog == shopAndScanCartViewState.displayUnclippedCouponsDialog && this.unclippedCouponsDialogAcknowledged == shopAndScanCartViewState.unclippedCouponsDialogAcknowledged && this.unclippedCoupons == shopAndScanCartViewState.unclippedCoupons && this.displayCheckOutConfirmDialog == shopAndScanCartViewState.displayCheckOutConfirmDialog && this.checkOutConfirmDialogAcknowledged == shopAndScanCartViewState.checkOutConfirmDialogAcknowledged && this.checkOutConfirmDialog == shopAndScanCartViewState.checkOutConfirmDialog && this.isRefreshing == shopAndScanCartViewState.isRefreshing && Intrinsics.e(this.refreshMessage, shopAndScanCartViewState.refreshMessage) && Intrinsics.e(this.quantityStepperSelected, shopAndScanCartViewState.quantityStepperSelected) && this.firstVisibleIndex == shopAndScanCartViewState.firstVisibleIndex && this.firstVisibleItemScrollOffset == shopAndScanCartViewState.firstVisibleItemScrollOffset && this.previousItemCount == shopAndScanCartViewState.previousItemCount;
    }

    public ShopAndScanCartViewState(AbstractC5607a storeName, List<ShopAndScanItemDecorator> items, ShopAndScanCartTotalsDecorator cartTotals, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, a refreshMessage, String quantityStepperSelected, int i10, int i11, int i12) {
        Intrinsics.j(storeName, "storeName");
        Intrinsics.j(items, "items");
        Intrinsics.j(cartTotals, "cartTotals");
        Intrinsics.j(refreshMessage, "refreshMessage");
        Intrinsics.j(quantityStepperSelected, "quantityStepperSelected");
        this.storeName = storeName;
        this.items = items;
        this.cartTotals = cartTotals;
        this.isGreenville = z10;
        this.displayCancelTripDialog = z11;
        this.displayUnclippedCouponsDialog = z12;
        this.unclippedCouponsDialogAcknowledged = z13;
        this.unclippedCoupons = z14;
        this.displayCheckOutConfirmDialog = z15;
        this.checkOutConfirmDialogAcknowledged = z16;
        this.checkOutConfirmDialog = z17;
        this.isRefreshing = z18;
        this.refreshMessage = refreshMessage;
        this.quantityStepperSelected = quantityStepperSelected;
        this.firstVisibleIndex = i10;
        this.firstVisibleItemScrollOffset = i11;
        this.previousItemCount = i12;
    }

    public static /* synthetic */ ShopAndScanCartViewState b(ShopAndScanCartViewState shopAndScanCartViewState, AbstractC5607a abstractC5607a, List list, ShopAndScanCartTotalsDecorator shopAndScanCartTotalsDecorator, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, a aVar, String str, int i10, int i11, int i12, int i13, Object obj) {
        int i14;
        int i15;
        AbstractC5607a abstractC5607a2;
        ShopAndScanCartViewState shopAndScanCartViewState2;
        int i16;
        List list2;
        ShopAndScanCartTotalsDecorator shopAndScanCartTotalsDecorator2;
        boolean z19;
        boolean z20;
        boolean z21;
        boolean z22;
        boolean z23;
        boolean z24;
        boolean z25;
        boolean z26;
        boolean z27;
        a aVar2;
        String str2;
        AbstractC5607a abstractC5607a3 = (i13 & 1) != 0 ? shopAndScanCartViewState.storeName : abstractC5607a;
        List list3 = (i13 & 2) != 0 ? shopAndScanCartViewState.items : list;
        ShopAndScanCartTotalsDecorator shopAndScanCartTotalsDecorator3 = (i13 & 4) != 0 ? shopAndScanCartViewState.cartTotals : shopAndScanCartTotalsDecorator;
        boolean z28 = (i13 & 8) != 0 ? shopAndScanCartViewState.isGreenville : z10;
        boolean z29 = (i13 & 16) != 0 ? shopAndScanCartViewState.displayCancelTripDialog : z11;
        boolean z30 = (i13 & 32) != 0 ? shopAndScanCartViewState.displayUnclippedCouponsDialog : z12;
        boolean z31 = (i13 & 64) != 0 ? shopAndScanCartViewState.unclippedCouponsDialogAcknowledged : z13;
        boolean z32 = (i13 & 128) != 0 ? shopAndScanCartViewState.unclippedCoupons : z14;
        boolean z33 = (i13 & 256) != 0 ? shopAndScanCartViewState.displayCheckOutConfirmDialog : z15;
        boolean z34 = (i13 & 512) != 0 ? shopAndScanCartViewState.checkOutConfirmDialogAcknowledged : z16;
        boolean z35 = (i13 & 1024) != 0 ? shopAndScanCartViewState.checkOutConfirmDialog : z17;
        boolean z36 = (i13 & RecyclerView.m.FLAG_MOVED) != 0 ? shopAndScanCartViewState.isRefreshing : z18;
        a aVar3 = (i13 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? shopAndScanCartViewState.refreshMessage : aVar;
        String str3 = (i13 & 8192) != 0 ? shopAndScanCartViewState.quantityStepperSelected : str;
        AbstractC5607a abstractC5607a4 = abstractC5607a3;
        int i17 = (i13 & 16384) != 0 ? shopAndScanCartViewState.firstVisibleIndex : i10;
        int i18 = (i13 & 32768) != 0 ? shopAndScanCartViewState.firstVisibleItemScrollOffset : i11;
        if ((i13 & 65536) != 0) {
            i15 = i18;
            i14 = shopAndScanCartViewState.previousItemCount;
            i16 = i17;
            list2 = list3;
            shopAndScanCartTotalsDecorator2 = shopAndScanCartTotalsDecorator3;
            z19 = z28;
            z20 = z29;
            z21 = z30;
            z22 = z31;
            z23 = z32;
            z24 = z33;
            z25 = z34;
            z26 = z35;
            z27 = z36;
            aVar2 = aVar3;
            str2 = str3;
            abstractC5607a2 = abstractC5607a4;
            shopAndScanCartViewState2 = shopAndScanCartViewState;
        } else {
            i14 = i12;
            i15 = i18;
            abstractC5607a2 = abstractC5607a4;
            shopAndScanCartViewState2 = shopAndScanCartViewState;
            i16 = i17;
            list2 = list3;
            shopAndScanCartTotalsDecorator2 = shopAndScanCartTotalsDecorator3;
            z19 = z28;
            z20 = z29;
            z21 = z30;
            z22 = z31;
            z23 = z32;
            z24 = z33;
            z25 = z34;
            z26 = z35;
            z27 = z36;
            aVar2 = aVar3;
            str2 = str3;
        }
        return shopAndScanCartViewState2.a(abstractC5607a2, list2, shopAndScanCartTotalsDecorator2, z19, z20, z21, z22, z23, z24, z25, z26, z27, aVar2, str2, i16, i15, i14);
    }

    public final ShopAndScanCartViewState a(AbstractC5607a storeName, List<ShopAndScanItemDecorator> items, ShopAndScanCartTotalsDecorator cartTotals, boolean isGreenville, boolean displayCancelTripDialog, boolean displayUnclippedCouponsDialog, boolean unclippedCouponsDialogAcknowledged, boolean unclippedCoupons, boolean displayCheckOutConfirmDialog, boolean checkOutConfirmDialogAcknowledged, boolean checkOutConfirmDialog, boolean isRefreshing, a refreshMessage, String quantityStepperSelected, int firstVisibleIndex, int firstVisibleItemScrollOffset, int previousItemCount) {
        Intrinsics.j(storeName, "storeName");
        Intrinsics.j(items, "items");
        Intrinsics.j(cartTotals, "cartTotals");
        Intrinsics.j(refreshMessage, "refreshMessage");
        Intrinsics.j(quantityStepperSelected, "quantityStepperSelected");
        return new ShopAndScanCartViewState(storeName, items, cartTotals, isGreenville, displayCancelTripDialog, displayUnclippedCouponsDialog, unclippedCouponsDialogAcknowledged, unclippedCoupons, displayCheckOutConfirmDialog, checkOutConfirmDialogAcknowledged, checkOutConfirmDialog, isRefreshing, refreshMessage, quantityStepperSelected, firstVisibleIndex, firstVisibleItemScrollOffset, previousItemCount);
    }

    /* renamed from: c, reason: from getter */
    public final ShopAndScanCartTotalsDecorator getCartTotals() {
        return this.cartTotals;
    }

    /* renamed from: d, reason: from getter */
    public final boolean getCheckOutConfirmDialog() {
        return this.checkOutConfirmDialog;
    }

    /* renamed from: e, reason: from getter */
    public final boolean getCheckOutConfirmDialogAcknowledged() {
        return this.checkOutConfirmDialogAcknowledged;
    }

    /* renamed from: f, reason: from getter */
    public final boolean getDisplayCheckOutConfirmDialog() {
        return this.displayCheckOutConfirmDialog;
    }

    /* renamed from: g, reason: from getter */
    public final boolean getDisplayUnclippedCouponsDialog() {
        return this.displayUnclippedCouponsDialog;
    }

    /* renamed from: h, reason: from getter */
    public final int getFirstVisibleIndex() {
        return this.firstVisibleIndex;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((this.storeName.hashCode() * 31) + this.items.hashCode()) * 31) + this.cartTotals.hashCode()) * 31) + Boolean.hashCode(this.isGreenville)) * 31) + Boolean.hashCode(this.displayCancelTripDialog)) * 31) + Boolean.hashCode(this.displayUnclippedCouponsDialog)) * 31) + Boolean.hashCode(this.unclippedCouponsDialogAcknowledged)) * 31) + Boolean.hashCode(this.unclippedCoupons)) * 31) + Boolean.hashCode(this.displayCheckOutConfirmDialog)) * 31) + Boolean.hashCode(this.checkOutConfirmDialogAcknowledged)) * 31) + Boolean.hashCode(this.checkOutConfirmDialog)) * 31) + Boolean.hashCode(this.isRefreshing)) * 31) + this.refreshMessage.hashCode()) * 31) + this.quantityStepperSelected.hashCode()) * 31) + Integer.hashCode(this.firstVisibleIndex)) * 31) + Integer.hashCode(this.firstVisibleItemScrollOffset)) * 31) + Integer.hashCode(this.previousItemCount);
    }

    /* renamed from: i, reason: from getter */
    public final int getFirstVisibleItemScrollOffset() {
        return this.firstVisibleItemScrollOffset;
    }

    public final List<ShopAndScanItemDecorator> j() {
        return this.items;
    }

    /* renamed from: k, reason: from getter */
    public final int getPreviousItemCount() {
        return this.previousItemCount;
    }

    /* renamed from: l, reason: from getter */
    public final String getQuantityStepperSelected() {
        return this.quantityStepperSelected;
    }

    /* renamed from: m, reason: from getter */
    public final a getRefreshMessage() {
        return this.refreshMessage;
    }

    /* renamed from: n, reason: from getter */
    public final AbstractC5607a getStoreName() {
        return this.storeName;
    }

    /* renamed from: o, reason: from getter */
    public final boolean getUnclippedCoupons() {
        return this.unclippedCoupons;
    }

    public final boolean p() {
        return this.items.isEmpty();
    }

    /* renamed from: q, reason: from getter */
    public final boolean getIsGreenville() {
        return this.isGreenville;
    }

    /* renamed from: r, reason: from getter */
    public final boolean getIsRefreshing() {
        return this.isRefreshing;
    }

    public String toString() {
        return "ShopAndScanCartViewState(storeName=" + this.storeName + ", items=" + this.items + ", cartTotals=" + this.cartTotals + ", isGreenville=" + this.isGreenville + ", displayCancelTripDialog=" + this.displayCancelTripDialog + ", displayUnclippedCouponsDialog=" + this.displayUnclippedCouponsDialog + ", unclippedCouponsDialogAcknowledged=" + this.unclippedCouponsDialogAcknowledged + ", unclippedCoupons=" + this.unclippedCoupons + ", displayCheckOutConfirmDialog=" + this.displayCheckOutConfirmDialog + ", checkOutConfirmDialogAcknowledged=" + this.checkOutConfirmDialogAcknowledged + ", checkOutConfirmDialog=" + this.checkOutConfirmDialog + ", isRefreshing=" + this.isRefreshing + ", refreshMessage=" + this.refreshMessage + ", quantityStepperSelected=" + this.quantityStepperSelected + ", firstVisibleIndex=" + this.firstVisibleIndex + ", firstVisibleItemScrollOffset=" + this.firstVisibleItemScrollOffset + ", previousItemCount=" + this.previousItemCount + ')';
    }

    public /* synthetic */ ShopAndScanCartViewState(AbstractC5607a abstractC5607a, List list, ShopAndScanCartTotalsDecorator shopAndScanCartTotalsDecorator, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, a aVar, String str, int i10, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? AbstractC5607a.INSTANCE.d(com.meijer.mobile.shopandscan.e.f116945V0, new Object[0]) : abstractC5607a, (i13 & 2) != 0 ? CollectionsKt.m() : list, (i13 & 4) != 0 ? new ShopAndScanCartTotalsDecorator(null, null, 3, null) : shopAndScanCartTotalsDecorator, (i13 & 8) != 0 ? false : z10, (i13 & 16) != 0 ? false : z11, (i13 & 32) != 0 ? false : z12, (i13 & 64) != 0 ? false : z13, (i13 & 128) != 0 ? true : z14, (i13 & 256) != 0 ? false : z15, (i13 & 512) != 0 ? false : z16, (i13 & 1024) == 0 ? z17 : true, (i13 & RecyclerView.m.FLAG_MOVED) != 0 ? false : z18, (i13 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? a.C2183a.f138362a : aVar, (i13 & 8192) != 0 ? "" : str, (i13 & 16384) != 0 ? 0 : i10, (i13 & 32768) != 0 ? 0 : i11, (i13 & 65536) != 0 ? 0 : i12);
    }
}
