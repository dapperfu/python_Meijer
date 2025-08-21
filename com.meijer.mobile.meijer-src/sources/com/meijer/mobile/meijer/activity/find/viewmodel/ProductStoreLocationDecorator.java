package com.meijer.mobile.meijer.activity.find.viewmodel;

import Co.ItemLocation;
import Co.ProductFullDetails;
import bk.AbstractC6392a;
import com.google.android.libraries.places.api.model.PlaceTypes;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u0013B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0013\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001c"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/m1;", "", "Lbk/a;", "storeName", "storeSection", "storeLocation", "", "isFromSisterStore", "<init>", "(Lbk/a;Lbk/a;Lbk/a;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lbk/a;", "b", "()Lbk/a;", "c", "d", "Z", "()Z", "e", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.m1, reason: case insensitive filesystem and from toString */
/* loaded from: classes10.dex */
public final /* data */ class ProductStoreLocationDecorator {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: f, reason: collision with root package name */
    public static final int f109799f = AbstractC6392a.f60445b;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a storeName;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a storeSection;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a storeLocation;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isFromSisterStore;

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\n\u0010\bJ)\u0010\u0010\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/m1$a;", "", "<init>", "()V", "", "storeName", "Lbk/a;", "c", "(Ljava/lang/String;)Lbk/a;", "section", "d", "LCo/g;", "location", "department", "", "isNewILC", "b", "(LCo/g;Ljava/lang/String;Z)Lbk/a;", "LCo/h;", "product", "LTq/k;", PlaceTypes.STORE, "Lcom/meijer/mobile/meijer/activity/find/viewmodel/m1;", "a", "(LCo/h;LTq/k;)Lcom/meijer/mobile/meijer/activity/find/viewmodel/m1;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.m1$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        private final AbstractC6392a b(ItemLocation location, String department, boolean isNewILC) {
            ItemLocation.Zone zone;
            String name;
            String aisle;
            if (location != null && (aisle = location.getAisle()) != null) {
                AbstractC6392a abstractC6392aD = isNewILC ? AbstractC6392a.INSTANCE.d(com.meijer.mobile.meijer.Y.f100610P8, location.getZoneCode(), aisle) : AbstractC6392a.INSTANCE.d(com.meijer.mobile.meijer.Y.f100759X5, department, aisle);
                if (abstractC6392aD != null) {
                    return abstractC6392aD;
                }
            }
            AbstractC6392a.Companion companion = AbstractC6392a.INSTANCE;
            if (location != null && (zone = location.getZone()) != null && (name = zone.getName()) != null) {
                department = name;
            }
            return companion.c(department);
        }

        private final AbstractC6392a c(String storeName) {
            AbstractC6392a abstractC6392aD;
            return (storeName == null || (abstractC6392aD = AbstractC6392a.INSTANCE.d(com.meijer.mobile.meijer.Y.f100778Y5, storeName)) == null) ? AbstractC6392a.INSTANCE.a() : abstractC6392aD;
        }

        private final AbstractC6392a d(String section) {
            AbstractC6392a.Companion companion = AbstractC6392a.INSTANCE;
            int i10 = com.meijer.mobile.meijer.Y.f100591O8;
            if (section == null) {
                section = "";
            }
            return companion.d(i10, section);
        }

        public final ProductStoreLocationDecorator a(ProductFullDetails product, Tq.k store) {
            Intrinsics.j(product, "product");
            Intrinsics.j(store, "store");
            if (product.getStockInfo().getIlcPrimary() != null) {
                AbstractC6392a abstractC6392aC = c(store.getName());
                ItemLocation ilcPrimary = product.getStockInfo().getIlcPrimary();
                return new ProductStoreLocationDecorator(abstractC6392aC, d(ilcPrimary != null ? ilcPrimary.getSection() : null), b(product.getStockInfo().getIlcPrimary(), product.getDepartment(), product.getStockInfo().getIsNewILC()), Intrinsics.e(product.getStockInfo().getEligibility(), "SISTER"));
            }
            AbstractC6392a abstractC6392aC2 = c(store.getName());
            ItemLocation ilcPrimary2 = product.getStockInfo().getIlcPrimary();
            return new ProductStoreLocationDecorator(abstractC6392aC2, d(ilcPrimary2 != null ? ilcPrimary2.getSection() : null), b(product.getStockInfo().getIlcPrimary(), product.getDepartment(), false), Intrinsics.e(product.getStockInfo().getEligibility(), "SISTER"));
        }
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductStoreLocationDecorator)) {
            return false;
        }
        ProductStoreLocationDecorator productStoreLocationDecorator = (ProductStoreLocationDecorator) other;
        return Intrinsics.e(this.storeName, productStoreLocationDecorator.storeName) && Intrinsics.e(this.storeSection, productStoreLocationDecorator.storeSection) && Intrinsics.e(this.storeLocation, productStoreLocationDecorator.storeLocation) && this.isFromSisterStore == productStoreLocationDecorator.isFromSisterStore;
    }

    public int hashCode() {
        return (((((this.storeName.hashCode() * 31) + this.storeSection.hashCode()) * 31) + this.storeLocation.hashCode()) * 31) + Boolean.hashCode(this.isFromSisterStore);
    }

    public String toString() {
        return "ProductStoreLocationDecorator(storeName=" + this.storeName + ", storeSection=" + this.storeSection + ", storeLocation=" + this.storeLocation + ", isFromSisterStore=" + this.isFromSisterStore + ')';
    }

    public ProductStoreLocationDecorator(AbstractC6392a storeName, AbstractC6392a storeSection, AbstractC6392a storeLocation, boolean z10) {
        Intrinsics.j(storeName, "storeName");
        Intrinsics.j(storeSection, "storeSection");
        Intrinsics.j(storeLocation, "storeLocation");
        this.storeName = storeName;
        this.storeSection = storeSection;
        this.storeLocation = storeLocation;
        this.isFromSisterStore = z10;
    }

    /* renamed from: a, reason: from getter */
    public final AbstractC6392a getStoreLocation() {
        return this.storeLocation;
    }

    /* renamed from: b, reason: from getter */
    public final AbstractC6392a getStoreName() {
        return this.storeName;
    }

    /* renamed from: c, reason: from getter */
    public final AbstractC6392a getStoreSection() {
        return this.storeSection;
    }

    /* renamed from: d, reason: from getter */
    public final boolean getIsFromSisterStore() {
        return this.isFromSisterStore;
    }
}
