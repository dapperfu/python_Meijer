package Ho;

import android.os.Parcel;
import android.os.Parcelable;
import com.medallia.digital.mobilesdk.l3;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0016J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0018R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b'\u0010%R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010 \u001a\u0004\b)\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010 \u001a\u0004\b(\u0010\u0018R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010 \u001a\u0004\b\u001f\u0010\u0018R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b&\u0010\u0018R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010 \u001a\u0004\b\"\u0010\u0018¨\u0006*"}, d2 = {"LHo/c;", "Landroid/os/Parcelable;", "", "upc", "", "onViewBeacon", "onClickBeacon", "onLoadBeacon", "onBasketChangeBeacon", "formatLevelOnClickBeacon", "formatLevelOnViewBeacon", "formatLevelOnLoadBeacon", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "h", "b", "Ljava/util/List;", "g", "()Ljava/util/List;", "c", "e", "d", "f", "fulldetails_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Ho.c, reason: from toString */
/* loaded from: classes11.dex */
public final /* data */ class SponsoredData implements Parcelable {
    public static final Parcelable.Creator<SponsoredData> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String upc;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<String> onViewBeacon;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<String> onClickBeacon;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String onLoadBeacon;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String onBasketChangeBeacon;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String formatLevelOnClickBeacon;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String formatLevelOnViewBeacon;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final String formatLevelOnLoadBeacon;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Ho.c$a */
    public static final class a implements Parcelable.Creator<SponsoredData> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SponsoredData createFromParcel(Parcel parcel) {
            Intrinsics.j(parcel, "parcel");
            return new SponsoredData(parcel.readString(), parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final SponsoredData[] newArray(int i10) {
            return new SponsoredData[i10];
        }
    }

    public SponsoredData() {
        this(null, null, null, null, null, null, null, null, l3.f92484c, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SponsoredData)) {
            return false;
        }
        SponsoredData sponsoredData = (SponsoredData) other;
        return Intrinsics.e(this.upc, sponsoredData.upc) && Intrinsics.e(this.onViewBeacon, sponsoredData.onViewBeacon) && Intrinsics.e(this.onClickBeacon, sponsoredData.onClickBeacon) && Intrinsics.e(this.onLoadBeacon, sponsoredData.onLoadBeacon) && Intrinsics.e(this.onBasketChangeBeacon, sponsoredData.onBasketChangeBeacon) && Intrinsics.e(this.formatLevelOnClickBeacon, sponsoredData.formatLevelOnClickBeacon) && Intrinsics.e(this.formatLevelOnViewBeacon, sponsoredData.formatLevelOnViewBeacon) && Intrinsics.e(this.formatLevelOnLoadBeacon, sponsoredData.formatLevelOnLoadBeacon);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.j(dest, "dest");
        dest.writeString(this.upc);
        dest.writeStringList(this.onViewBeacon);
        dest.writeStringList(this.onClickBeacon);
        dest.writeString(this.onLoadBeacon);
        dest.writeString(this.onBasketChangeBeacon);
        dest.writeString(this.formatLevelOnClickBeacon);
        dest.writeString(this.formatLevelOnViewBeacon);
        dest.writeString(this.formatLevelOnLoadBeacon);
    }

    public SponsoredData(String upc, List<String> onViewBeacon, List<String> onClickBeacon, String onLoadBeacon, String onBasketChangeBeacon, String formatLevelOnClickBeacon, String formatLevelOnViewBeacon, String formatLevelOnLoadBeacon) {
        Intrinsics.j(upc, "upc");
        Intrinsics.j(onViewBeacon, "onViewBeacon");
        Intrinsics.j(onClickBeacon, "onClickBeacon");
        Intrinsics.j(onLoadBeacon, "onLoadBeacon");
        Intrinsics.j(onBasketChangeBeacon, "onBasketChangeBeacon");
        Intrinsics.j(formatLevelOnClickBeacon, "formatLevelOnClickBeacon");
        Intrinsics.j(formatLevelOnViewBeacon, "formatLevelOnViewBeacon");
        Intrinsics.j(formatLevelOnLoadBeacon, "formatLevelOnLoadBeacon");
        this.upc = upc;
        this.onViewBeacon = onViewBeacon;
        this.onClickBeacon = onClickBeacon;
        this.onLoadBeacon = onLoadBeacon;
        this.onBasketChangeBeacon = onBasketChangeBeacon;
        this.formatLevelOnClickBeacon = formatLevelOnClickBeacon;
        this.formatLevelOnViewBeacon = formatLevelOnViewBeacon;
        this.formatLevelOnLoadBeacon = formatLevelOnLoadBeacon;
    }

    /* renamed from: a, reason: from getter */
    public final String getFormatLevelOnClickBeacon() {
        return this.formatLevelOnClickBeacon;
    }

    /* renamed from: b, reason: from getter */
    public final String getFormatLevelOnLoadBeacon() {
        return this.formatLevelOnLoadBeacon;
    }

    /* renamed from: c, reason: from getter */
    public final String getFormatLevelOnViewBeacon() {
        return this.formatLevelOnViewBeacon;
    }

    /* renamed from: d, reason: from getter */
    public final String getOnBasketChangeBeacon() {
        return this.onBasketChangeBeacon;
    }

    public final List<String> e() {
        return this.onClickBeacon;
    }

    /* renamed from: f, reason: from getter */
    public final String getOnLoadBeacon() {
        return this.onLoadBeacon;
    }

    public final List<String> g() {
        return this.onViewBeacon;
    }

    /* renamed from: h, reason: from getter */
    public final String getUpc() {
        return this.upc;
    }

    public int hashCode() {
        return (((((((((((((this.upc.hashCode() * 31) + this.onViewBeacon.hashCode()) * 31) + this.onClickBeacon.hashCode()) * 31) + this.onLoadBeacon.hashCode()) * 31) + this.onBasketChangeBeacon.hashCode()) * 31) + this.formatLevelOnClickBeacon.hashCode()) * 31) + this.formatLevelOnViewBeacon.hashCode()) * 31) + this.formatLevelOnLoadBeacon.hashCode();
    }

    public String toString() {
        return "SponsoredData(upc=" + this.upc + ", onViewBeacon=" + this.onViewBeacon + ", onClickBeacon=" + this.onClickBeacon + ", onLoadBeacon=" + this.onLoadBeacon + ", onBasketChangeBeacon=" + this.onBasketChangeBeacon + ", formatLevelOnClickBeacon=" + this.formatLevelOnClickBeacon + ", formatLevelOnViewBeacon=" + this.formatLevelOnViewBeacon + ", formatLevelOnLoadBeacon=" + this.formatLevelOnLoadBeacon + ')';
    }

    public /* synthetic */ SponsoredData(String str, List list, List list2, String str2, String str3, String str4, String str5, String str6, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? CollectionsKt.m() : list, (i10 & 4) != 0 ? CollectionsKt.m() : list2, (i10 & 8) != 0 ? "" : str2, (i10 & 16) != 0 ? "" : str3, (i10 & 32) != 0 ? "" : str4, (i10 & 64) != 0 ? "" : str5, (i10 & 128) != 0 ? "" : str6);
    }
}
