package Uh;

import ak.AbstractC5607a;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001Bw\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\f\b\u0002\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\u000b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0015R\u001b\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0017R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b$\u0010#R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\"\u0010!\u001a\u0004\b \u0010#R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b(\u0010'R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b&\u0010%\u001a\u0004\b)\u0010'R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b\u001b\u0010+¨\u0006,"}, d2 = {"LUh/e;", "", "", "name", "", "Lcom/meijer/mobile/core/model/common/StoreId;", "storeId", "Lak/a;", "storeHours", "pharmacyInStoreHours", "pharmacyDriveThruHours", "", "isPharmacyInStoreOpen", "isPharmacyDriveThruOpen", "isStoreOpen", "", "LUh/a;", "gasPriceItems", "<init>", "(Ljava/lang/String;ILak/a;Lak/a;Lak/a;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "I", "f", "c", "Lak/a;", "e", "()Lak/a;", "d", "Ljava/lang/Boolean;", "h", "()Ljava/lang/Boolean;", "g", "i", "Ljava/util/List;", "()Ljava/util/List;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Uh.e, reason: from toString */
/* loaded from: classes7.dex */
public final /* data */ class StoreCardDecorator {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int storeId;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC5607a storeHours;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC5607a pharmacyInStoreHours;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC5607a pharmacyDriveThruHours;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final Boolean isPharmacyInStoreOpen;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final Boolean isPharmacyDriveThruOpen;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final Boolean isStoreOpen;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<GasPriceItem> gasPriceItems;

    public StoreCardDecorator() {
        this(null, 0, null, null, null, null, null, null, null, 511, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StoreCardDecorator)) {
            return false;
        }
        StoreCardDecorator storeCardDecorator = (StoreCardDecorator) other;
        return Intrinsics.e(this.name, storeCardDecorator.name) && this.storeId == storeCardDecorator.storeId && Intrinsics.e(this.storeHours, storeCardDecorator.storeHours) && Intrinsics.e(this.pharmacyInStoreHours, storeCardDecorator.pharmacyInStoreHours) && Intrinsics.e(this.pharmacyDriveThruHours, storeCardDecorator.pharmacyDriveThruHours) && Intrinsics.e(this.isPharmacyInStoreOpen, storeCardDecorator.isPharmacyInStoreOpen) && Intrinsics.e(this.isPharmacyDriveThruOpen, storeCardDecorator.isPharmacyDriveThruOpen) && Intrinsics.e(this.isStoreOpen, storeCardDecorator.isStoreOpen) && Intrinsics.e(this.gasPriceItems, storeCardDecorator.gasPriceItems);
    }

    public StoreCardDecorator(String name, int i10, AbstractC5607a abstractC5607a, AbstractC5607a abstractC5607a2, AbstractC5607a abstractC5607a3, Boolean bool, Boolean bool2, Boolean bool3, List<GasPriceItem> gasPriceItems) {
        Intrinsics.j(name, "name");
        Intrinsics.j(gasPriceItems, "gasPriceItems");
        this.name = name;
        this.storeId = i10;
        this.storeHours = abstractC5607a;
        this.pharmacyInStoreHours = abstractC5607a2;
        this.pharmacyDriveThruHours = abstractC5607a3;
        this.isPharmacyInStoreOpen = bool;
        this.isPharmacyDriveThruOpen = bool2;
        this.isStoreOpen = bool3;
        this.gasPriceItems = gasPriceItems;
    }

    public final List<GasPriceItem> a() {
        return this.gasPriceItems;
    }

    /* renamed from: b, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: c, reason: from getter */
    public final AbstractC5607a getPharmacyDriveThruHours() {
        return this.pharmacyDriveThruHours;
    }

    /* renamed from: d, reason: from getter */
    public final AbstractC5607a getPharmacyInStoreHours() {
        return this.pharmacyInStoreHours;
    }

    /* renamed from: e, reason: from getter */
    public final AbstractC5607a getStoreHours() {
        return this.storeHours;
    }

    /* renamed from: f, reason: from getter */
    public final int getStoreId() {
        return this.storeId;
    }

    /* renamed from: g, reason: from getter */
    public final Boolean getIsPharmacyDriveThruOpen() {
        return this.isPharmacyDriveThruOpen;
    }

    /* renamed from: h, reason: from getter */
    public final Boolean getIsPharmacyInStoreOpen() {
        return this.isPharmacyInStoreOpen;
    }

    public int hashCode() {
        int iHashCode = ((this.name.hashCode() * 31) + Integer.hashCode(this.storeId)) * 31;
        AbstractC5607a abstractC5607a = this.storeHours;
        int iHashCode2 = (iHashCode + (abstractC5607a == null ? 0 : abstractC5607a.hashCode())) * 31;
        AbstractC5607a abstractC5607a2 = this.pharmacyInStoreHours;
        int iHashCode3 = (iHashCode2 + (abstractC5607a2 == null ? 0 : abstractC5607a2.hashCode())) * 31;
        AbstractC5607a abstractC5607a3 = this.pharmacyDriveThruHours;
        int iHashCode4 = (iHashCode3 + (abstractC5607a3 == null ? 0 : abstractC5607a3.hashCode())) * 31;
        Boolean bool = this.isPharmacyInStoreOpen;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isPharmacyDriveThruOpen;
        int iHashCode6 = (iHashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isStoreOpen;
        return ((iHashCode6 + (bool3 != null ? bool3.hashCode() : 0)) * 31) + this.gasPriceItems.hashCode();
    }

    /* renamed from: i, reason: from getter */
    public final Boolean getIsStoreOpen() {
        return this.isStoreOpen;
    }

    public String toString() {
        return "StoreCardDecorator(name=" + this.name + ", storeId=" + this.storeId + ", storeHours=" + this.storeHours + ", pharmacyInStoreHours=" + this.pharmacyInStoreHours + ", pharmacyDriveThruHours=" + this.pharmacyDriveThruHours + ", isPharmacyInStoreOpen=" + this.isPharmacyInStoreOpen + ", isPharmacyDriveThruOpen=" + this.isPharmacyDriveThruOpen + ", isStoreOpen=" + this.isStoreOpen + ", gasPriceItems=" + this.gasPriceItems + ')';
    }

    public /* synthetic */ StoreCardDecorator(String str, int i10, AbstractC5607a abstractC5607a, AbstractC5607a abstractC5607a2, AbstractC5607a abstractC5607a3, Boolean bool, Boolean bool2, Boolean bool3, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? 0 : i10, (i11 & 4) != 0 ? null : abstractC5607a, (i11 & 8) != 0 ? null : abstractC5607a2, (i11 & 16) != 0 ? null : abstractC5607a3, (i11 & 32) != 0 ? null : bool, (i11 & 64) != 0 ? null : bool2, (i11 & 128) != 0 ? null : bool3, (i11 & 256) != 0 ? CollectionsKt.m() : list);
    }
}
