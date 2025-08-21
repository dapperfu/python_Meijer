package Co;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nk.n;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u001a\b\u0087\b\u0018\u0000 42\u00020\u0001:\u0001\u001fBK\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0017J\u001a\u0010\u001d\u001a\u00020\f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b!\u0010*R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\n8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b(\u00101R\u0011\u00102\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b+\u00101R\u0011\u00103\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b$\u00101¨\u00065"}, d2 = {"LCo/o;", "Landroid/os/Parcelable;", "", "eligibility", "", "level", "Lnk/n;", "stockLevel", "LCo/g;", "ilcPrimary", "", "ilcs", "", "isNewILC", "<init>", "(Ljava/lang/String;ILnk/n;LCo/g;Ljava/util/List;Z)V", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "I", "getLevel", "c", "Lnk/n;", "Q1", "()Lnk/n;", "d", "LCo/g;", "()LCo/g;", "e", "Ljava/util/List;", "getIlcs", "()Ljava/util/List;", "f", "Z", "()Z", "isOutOfStock", "isLowStock", "g", "fulldetails_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Co.o, reason: from toString */
/* loaded from: classes12.dex */
public final /* data */ class StockInfo implements Parcelable {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String eligibility;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int level;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final nk.n stockLevel;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final ItemLocation ilcPrimary;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<ItemLocation> ilcs;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isNewILC;
    public static final Parcelable.Creator<StockInfo> CREATOR = new b();

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Co.o$b */
    public static final class b implements Parcelable.Creator<StockInfo> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final StockInfo createFromParcel(Parcel parcel) {
            Intrinsics.j(parcel, "parcel");
            String string = parcel.readString();
            int i10 = parcel.readInt();
            nk.n nVar = (nk.n) parcel.readParcelable(StockInfo.class.getClassLoader());
            ItemLocation gVarCreateFromParcel = parcel.readInt() == 0 ? null : ItemLocation.CREATOR.createFromParcel(parcel);
            int i11 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i11);
            for (int i12 = 0; i12 != i11; i12++) {
                arrayList.add(ItemLocation.CREATOR.createFromParcel(parcel));
            }
            return new StockInfo(string, i10, nVar, gVarCreateFromParcel, arrayList, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final StockInfo[] newArray(int i10) {
            return new StockInfo[i10];
        }
    }

    public StockInfo() {
        this(null, 0, null, null, null, false, 63, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StockInfo)) {
            return false;
        }
        StockInfo stockInfo = (StockInfo) other;
        return Intrinsics.e(this.eligibility, stockInfo.eligibility) && this.level == stockInfo.level && Intrinsics.e(this.stockLevel, stockInfo.stockLevel) && Intrinsics.e(this.ilcPrimary, stockInfo.ilcPrimary) && Intrinsics.e(this.ilcs, stockInfo.ilcs) && this.isNewILC == stockInfo.isNewILC;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.j(dest, "dest");
        dest.writeString(this.eligibility);
        dest.writeInt(this.level);
        dest.writeParcelable(this.stockLevel, flags);
        ItemLocation gVar = this.ilcPrimary;
        if (gVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            gVar.writeToParcel(dest, flags);
        }
        List<ItemLocation> list = this.ilcs;
        dest.writeInt(list.size());
        Iterator<ItemLocation> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
        dest.writeInt(this.isNewILC ? 1 : 0);
    }

    public StockInfo(String eligibility, int i10, nk.n stockLevel, ItemLocation gVar, List<ItemLocation> ilcs, boolean z10) {
        Intrinsics.j(eligibility, "eligibility");
        Intrinsics.j(stockLevel, "stockLevel");
        Intrinsics.j(ilcs, "ilcs");
        this.eligibility = eligibility;
        this.level = i10;
        this.stockLevel = stockLevel;
        this.ilcPrimary = gVar;
        this.ilcs = ilcs;
        this.isNewILC = z10;
    }

    /* renamed from: Q1, reason: from getter */
    public final nk.n getStockLevel() {
        return this.stockLevel;
    }

    /* renamed from: a, reason: from getter */
    public final String getEligibility() {
        return this.eligibility;
    }

    /* renamed from: b, reason: from getter */
    public final ItemLocation getIlcPrimary() {
        return this.ilcPrimary;
    }

    public final boolean c() {
        return this.stockLevel instanceof n.LowStock;
    }

    /* renamed from: d, reason: from getter */
    public final boolean getIsNewILC() {
        return this.isNewILC;
    }

    public final boolean e() {
        return Intrinsics.e(this.stockLevel, n.d.f152513a);
    }

    public int hashCode() {
        int iHashCode = ((((this.eligibility.hashCode() * 31) + Integer.hashCode(this.level)) * 31) + this.stockLevel.hashCode()) * 31;
        ItemLocation gVar = this.ilcPrimary;
        return ((((iHashCode + (gVar == null ? 0 : gVar.hashCode())) * 31) + this.ilcs.hashCode()) * 31) + Boolean.hashCode(this.isNewILC);
    }

    public String toString() {
        return "StockInfo(eligibility=" + this.eligibility + ", level=" + this.level + ", stockLevel=" + this.stockLevel + ", ilcPrimary=" + this.ilcPrimary + ", ilcs=" + this.ilcs + ", isNewILC=" + this.isNewILC + ')';
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ StockInfo(java.lang.String r2, int r3, nk.n r4, Co.ItemLocation r5, java.util.List r6, boolean r7, int r8, kotlin.jvm.internal.DefaultConstructorMarker r9) {
        /*
            r1 = this;
            r9 = r8 & 1
            if (r9 == 0) goto L6
            java.lang.String r2 = "OWN"
        L6:
            r9 = r8 & 2
            r0 = 0
            if (r9 == 0) goto Lc
            r3 = r0
        Lc:
            r9 = r8 & 4
            if (r9 == 0) goto L15
            nk.n$a r4 = new nk.n$a
            r4.<init>(r3)
        L15:
            r9 = r8 & 8
            if (r9 == 0) goto L1a
            r5 = 0
        L1a:
            r9 = r8 & 16
            if (r9 == 0) goto L22
            java.util.List r6 = kotlin.collections.CollectionsKt.m()
        L22:
            r8 = r8 & 32
            if (r8 == 0) goto L2e
            r9 = r0
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            goto L35
        L2e:
            r9 = r7
            r8 = r6
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
        L35:
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Co.StockInfo.<init>(java.lang.String, int, nk.n, Co.g, java.util.List, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
