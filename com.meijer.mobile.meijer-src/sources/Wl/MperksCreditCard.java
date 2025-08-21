package Wl;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0012J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b\u001e\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b\u001d\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b\u001f\u0010\u0014R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010\u0014¨\u0006#"}, d2 = {"LWl/d;", "Landroid/os/Parcelable;", "", "availableRewardSummary", "availableRewardTitle", "clippedRewardSummary", "clippedRewardTitle", "summary", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "getAvailableRewardTitle", "c", "d", "e", "getSummary", "models_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Wl.d, reason: from toString */
/* loaded from: classes10.dex */
public final /* data */ class MperksCreditCard implements Parcelable {
    public static final Parcelable.Creator<MperksCreditCard> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String availableRewardSummary;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String availableRewardTitle;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String clippedRewardSummary;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String clippedRewardTitle;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String summary;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Wl.d$a */
    public static final class a implements Parcelable.Creator<MperksCreditCard> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MperksCreditCard createFromParcel(Parcel parcel) {
            Intrinsics.j(parcel, "parcel");
            return new MperksCreditCard(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final MperksCreditCard[] newArray(int i10) {
            return new MperksCreditCard[i10];
        }
    }

    public MperksCreditCard() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MperksCreditCard)) {
            return false;
        }
        MperksCreditCard mperksCreditCard = (MperksCreditCard) other;
        return Intrinsics.e(this.availableRewardSummary, mperksCreditCard.availableRewardSummary) && Intrinsics.e(this.availableRewardTitle, mperksCreditCard.availableRewardTitle) && Intrinsics.e(this.clippedRewardSummary, mperksCreditCard.clippedRewardSummary) && Intrinsics.e(this.clippedRewardTitle, mperksCreditCard.clippedRewardTitle) && Intrinsics.e(this.summary, mperksCreditCard.summary);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.j(dest, "dest");
        dest.writeString(this.availableRewardSummary);
        dest.writeString(this.availableRewardTitle);
        dest.writeString(this.clippedRewardSummary);
        dest.writeString(this.clippedRewardTitle);
        dest.writeString(this.summary);
    }

    public MperksCreditCard(String str, String availableRewardTitle, String str2, String clippedRewardTitle, String str3) {
        Intrinsics.j(availableRewardTitle, "availableRewardTitle");
        Intrinsics.j(clippedRewardTitle, "clippedRewardTitle");
        this.availableRewardSummary = str;
        this.availableRewardTitle = availableRewardTitle;
        this.clippedRewardSummary = str2;
        this.clippedRewardTitle = clippedRewardTitle;
        this.summary = str3;
    }

    /* renamed from: a, reason: from getter */
    public final String getAvailableRewardSummary() {
        return this.availableRewardSummary;
    }

    /* renamed from: b, reason: from getter */
    public final String getClippedRewardSummary() {
        return this.clippedRewardSummary;
    }

    /* renamed from: c, reason: from getter */
    public final String getClippedRewardTitle() {
        return this.clippedRewardTitle;
    }

    public int hashCode() {
        String str = this.availableRewardSummary;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.availableRewardTitle.hashCode()) * 31;
        String str2 = this.clippedRewardSummary;
        int iHashCode2 = (((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.clippedRewardTitle.hashCode()) * 31;
        String str3 = this.summary;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "MperksCreditCard(availableRewardSummary=" + this.availableRewardSummary + ", availableRewardTitle=" + this.availableRewardTitle + ", clippedRewardSummary=" + this.clippedRewardSummary + ", clippedRewardTitle=" + this.clippedRewardTitle + ", summary=" + this.summary + ')';
    }

    public /* synthetic */ MperksCreditCard(String str, String str2, String str3, String str4, String str5, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? "" : str4, (i10 & 16) != 0 ? null : str5);
    }
}
