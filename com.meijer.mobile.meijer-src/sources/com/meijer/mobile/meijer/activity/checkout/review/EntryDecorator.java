package com.meijer.mobile.meijer.activity.checkout.review;

import Co.Image;
import fj.AllDiscountDetails;
import fj.Entry;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0015\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0001\u0018BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\u0010\u0006\u001a\u00060\u0002j\u0002`\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0011R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001b\u0010\u0011R\u001b\u0010\u0006\u001a\u00060\u0002j\u0002`\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u001c\u0010\u0011R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b \u0010\u001fR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001c\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\"\u0010$\u001a\u0004\b\u0018\u0010%¨\u0006'"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/review/P1;", "", "", "name", "imageUrl", "Lcom/meijer/mobile/core/model/common/ResourceId;", "upc", "", "quantity", "totalPrice", "", "isAlcohol", "Lfj/a;", "discountDetails", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDZLfj/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "f", "d", "D", "()D", "e", "Z", "g", "()Z", "Lfj/a;", "()Lfj/a;", "h", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.meijer.activity.checkout.review.P1, reason: from toString */
/* loaded from: classes10.dex */
public final /* data */ class EntryDecorator {

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: i, reason: collision with root package name */
    public static final int f105450i = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String imageUrl;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String upc;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final double quantity;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final double totalPrice;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isAlcohol;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final AllDiscountDetails discountDetails;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/review/P1$a;", "", "<init>", "()V", "Lfj/i;", "entry", "Lcom/meijer/mobile/meijer/activity/checkout/review/P1;", "a", "(Lfj/i;)Lcom/meijer/mobile/meijer/activity/checkout/review/P1;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.checkout.review.P1$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final EntryDecorator a(Entry entry) {
            Intrinsics.j(entry, "entry");
            Image image = (Image) CollectionsKt.u0(entry.m().j());
            return new EntryDecorator(entry.m().getName(), image != null ? image.getUrl() : null, entry.m().getCode(), entry.getActualQuantity(), entry.getTotalPrice().getValue(), entry.m().getIsAlcohol(), entry.getAllDiscountDetails());
        }
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EntryDecorator)) {
            return false;
        }
        EntryDecorator entryDecorator = (EntryDecorator) other;
        return Intrinsics.e(this.name, entryDecorator.name) && Intrinsics.e(this.imageUrl, entryDecorator.imageUrl) && Intrinsics.e(this.upc, entryDecorator.upc) && Double.compare(this.quantity, entryDecorator.quantity) == 0 && Double.compare(this.totalPrice, entryDecorator.totalPrice) == 0 && this.isAlcohol == entryDecorator.isAlcohol && Intrinsics.e(this.discountDetails, entryDecorator.discountDetails);
    }

    public int hashCode() {
        int iHashCode = this.name.hashCode() * 31;
        String str = this.imageUrl;
        return ((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.upc.hashCode()) * 31) + Double.hashCode(this.quantity)) * 31) + Double.hashCode(this.totalPrice)) * 31) + Boolean.hashCode(this.isAlcohol)) * 31) + this.discountDetails.hashCode();
    }

    public String toString() {
        return "EntryDecorator(name=" + this.name + ", imageUrl=" + this.imageUrl + ", upc=" + this.upc + ", quantity=" + this.quantity + ", totalPrice=" + this.totalPrice + ", isAlcohol=" + this.isAlcohol + ", discountDetails=" + this.discountDetails + ')';
    }

    public EntryDecorator(String name, String str, String upc, double d10, double d11, boolean z10, AllDiscountDetails discountDetails) {
        Intrinsics.j(name, "name");
        Intrinsics.j(upc, "upc");
        Intrinsics.j(discountDetails, "discountDetails");
        this.name = name;
        this.imageUrl = str;
        this.upc = upc;
        this.quantity = d10;
        this.totalPrice = d11;
        this.isAlcohol = z10;
        this.discountDetails = discountDetails;
    }

    /* renamed from: a, reason: from getter */
    public final AllDiscountDetails getDiscountDetails() {
        return this.discountDetails;
    }

    /* renamed from: b, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* renamed from: c, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: d, reason: from getter */
    public final double getQuantity() {
        return this.quantity;
    }

    /* renamed from: e, reason: from getter */
    public final double getTotalPrice() {
        return this.totalPrice;
    }

    /* renamed from: f, reason: from getter */
    public final String getUpc() {
        return this.upc;
    }

    /* renamed from: g, reason: from getter */
    public final boolean getIsAlcohol() {
        return this.isAlcohol;
    }
}
