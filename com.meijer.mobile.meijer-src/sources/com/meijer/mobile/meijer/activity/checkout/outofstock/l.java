package com.meijer.mobile.meijer.activity.checkout.outofstock;

import Co.Image;
import Co.ProductFullDetails;
import fj.EntryChange;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import vs.CartProductListDecorator;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/outofstock/l;", "", "<init>", "()V", "c", "b", "d", "a", "Lcom/meijer/mobile/meijer/activity/checkout/outofstock/l$a;", "Lcom/meijer/mobile/meijer/activity/checkout/outofstock/l$b;", "Lcom/meijer/mobile/meijer/activity/checkout/outofstock/l$c;", "Lcom/meijer/mobile/meijer/activity/checkout/outofstock/l$d;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public abstract class l {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/outofstock/l$a;", "Lcom/meijer/mobile/meijer/activity/checkout/outofstock/l;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class a extends l {

        /* renamed from: a, reason: collision with root package name */
        public static final a f104353a = new a();

        private a() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof a);
        }

        public int hashCode() {
            return 529672909;
        }

        public String toString() {
            return "Close";
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/outofstock/l$b;", "Lcom/meijer/mobile/meijer/activity/checkout/outofstock/l;", "<init>", "()V", "a", "b", "Lcom/meijer/mobile/meijer/activity/checkout/outofstock/l$b$a;", "Lcom/meijer/mobile/meijer/activity/checkout/outofstock/l$b$b;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class b extends l {

        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/outofstock/l$b$a;", "Lcom/meijer/mobile/meijer/activity/checkout/outofstock/l$b;", "", "Lcom/meijer/mobile/meijer/activity/checkout/outofstock/l$b$b;", "itemStates", "", "cartId", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "Ljava/lang/String;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.checkout.outofstock.l$b$a, reason: from toString */
        public static final /* data */ class OutOfStockAdapterState extends b {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final List<OutOfStockItemState> itemStates;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final String cartId;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof OutOfStockAdapterState)) {
                    return false;
                }
                OutOfStockAdapterState outOfStockAdapterState = (OutOfStockAdapterState) other;
                return Intrinsics.e(this.itemStates, outOfStockAdapterState.itemStates) && Intrinsics.e(this.cartId, outOfStockAdapterState.cartId);
            }

            public int hashCode() {
                return (this.itemStates.hashCode() * 31) + this.cartId.hashCode();
            }

            public String toString() {
                return "OutOfStockAdapterState(itemStates=" + this.itemStates + ", cartId=" + this.cartId + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OutOfStockAdapterState(List<OutOfStockItemState> itemStates, String cartId) {
                super(null);
                Intrinsics.j(itemStates, "itemStates");
                Intrinsics.j(cartId, "cartId");
                this.itemStates = itemStates;
                this.cartId = cartId;
            }

            /* renamed from: a, reason: from getter */
            public final String getCartId() {
                return this.cartId;
            }

            public final List<OutOfStockItemState> b() {
                return this.itemStates;
            }
        }

        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001f\u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b \u0010\u0012R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b\u001b\u0010\u0012R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001c\u001a\u0004\b$\u0010\u0012R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b\u001e\u0010'¨\u0006("}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/outofstock/l$b$b;", "Lcom/meijer/mobile/meijer/activity/checkout/outofstock/l$b;", "", "name", "oldQuantity", "Lfj/j$c;", "stockStatus", "imageUrl", "code", "newQuantity", "LCo/h;", "fullDetails", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lfj/j$c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LCo/h;)V", "Lvs/b;", "f", "()Lvs/b;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "d", "b", "e", "c", "Lfj/j$c;", "getStockStatus", "()Lfj/j$c;", "getNewQuantity", "g", "LCo/h;", "()LCo/h;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.checkout.outofstock.l$b$b, reason: collision with other inner class name and from toString */
        public static final /* data */ class OutOfStockItemState extends b {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String name;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final String oldQuantity;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final EntryChange.c stockStatus;

            /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final String imageUrl;

            /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final String code;

            /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final String newQuantity;

            /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            private final ProductFullDetails fullDetails;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof OutOfStockItemState)) {
                    return false;
                }
                OutOfStockItemState outOfStockItemState = (OutOfStockItemState) other;
                return Intrinsics.e(this.name, outOfStockItemState.name) && Intrinsics.e(this.oldQuantity, outOfStockItemState.oldQuantity) && this.stockStatus == outOfStockItemState.stockStatus && Intrinsics.e(this.imageUrl, outOfStockItemState.imageUrl) && Intrinsics.e(this.code, outOfStockItemState.code) && Intrinsics.e(this.newQuantity, outOfStockItemState.newQuantity) && Intrinsics.e(this.fullDetails, outOfStockItemState.fullDetails);
            }

            public int hashCode() {
                return (((((((((((this.name.hashCode() * 31) + this.oldQuantity.hashCode()) * 31) + this.stockStatus.hashCode()) * 31) + this.imageUrl.hashCode()) * 31) + this.code.hashCode()) * 31) + this.newQuantity.hashCode()) * 31) + this.fullDetails.hashCode();
            }

            public String toString() {
                return "OutOfStockItemState(name=" + this.name + ", oldQuantity=" + this.oldQuantity + ", stockStatus=" + this.stockStatus + ", imageUrl=" + this.imageUrl + ", code=" + this.code + ", newQuantity=" + this.newQuantity + ", fullDetails=" + this.fullDetails + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OutOfStockItemState(String name, String oldQuantity, EntryChange.c stockStatus, String imageUrl, String code, String newQuantity, ProductFullDetails fullDetails) {
                super(null);
                Intrinsics.j(name, "name");
                Intrinsics.j(oldQuantity, "oldQuantity");
                Intrinsics.j(stockStatus, "stockStatus");
                Intrinsics.j(imageUrl, "imageUrl");
                Intrinsics.j(code, "code");
                Intrinsics.j(newQuantity, "newQuantity");
                Intrinsics.j(fullDetails, "fullDetails");
                this.name = name;
                this.oldQuantity = oldQuantity;
                this.stockStatus = stockStatus;
                this.imageUrl = imageUrl;
                this.code = code;
                this.newQuantity = newQuantity;
                this.fullDetails = fullDetails;
            }

            /* renamed from: a, reason: from getter */
            public final String getCode() {
                return this.code;
            }

            /* renamed from: b, reason: from getter */
            public final ProductFullDetails getFullDetails() {
                return this.fullDetails;
            }

            /* renamed from: c, reason: from getter */
            public final String getImageUrl() {
                return this.imageUrl;
            }

            /* renamed from: d, reason: from getter */
            public final String getName() {
                return this.name;
            }

            /* renamed from: e, reason: from getter */
            public final String getOldQuantity() {
                return this.oldQuantity;
            }

            public final CartProductListDecorator f() {
                return new CartProductListDecorator(0, this.name, null, this.fullDetails, new Image(this.imageUrl, null, null, null, null, 30, null), false, false, 0.0d, false, null, null, null, this.oldQuantity, 0.0d, null, null, false, 126949, null);
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/outofstock/l$c;", "Lcom/meijer/mobile/meijer/activity/checkout/outofstock/l;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class c extends l {

        /* renamed from: a, reason: collision with root package name */
        public static final c f104363a = new c();

        private c() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof c);
        }

        public int hashCode() {
            return 1679641809;
        }

        public String toString() {
            return "Loading";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/outofstock/l$d;", "Lcom/meijer/mobile/meijer/activity/checkout/outofstock/l;", "Lcom/meijer/mobile/meijer/activity/checkout/outofstock/l$b$b;", "itemToSubstitute", "<init>", "(Lcom/meijer/mobile/meijer/activity/checkout/outofstock/l$b$b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/meijer/mobile/meijer/activity/checkout/outofstock/l$b$b;", "()Lcom/meijer/mobile/meijer/activity/checkout/outofstock/l$b$b;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.checkout.outofstock.l$d, reason: from toString */
    public static final /* data */ class OpenFindSubstitution extends l {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final b.OutOfStockItemState itemToSubstitute;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OpenFindSubstitution) && Intrinsics.e(this.itemToSubstitute, ((OpenFindSubstitution) other).itemToSubstitute);
        }

        public int hashCode() {
            return this.itemToSubstitute.hashCode();
        }

        public String toString() {
            return "OpenFindSubstitution(itemToSubstitute=" + this.itemToSubstitute + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OpenFindSubstitution(b.OutOfStockItemState itemToSubstitute) {
            super(null);
            Intrinsics.j(itemToSubstitute, "itemToSubstitute");
            this.itemToSubstitute = itemToSubstitute;
        }

        /* renamed from: a, reason: from getter */
        public final b.OutOfStockItemState getItemToSubstitute() {
            return this.itemToSubstitute;
        }
    }

    public /* synthetic */ l(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private l() {
    }
}
