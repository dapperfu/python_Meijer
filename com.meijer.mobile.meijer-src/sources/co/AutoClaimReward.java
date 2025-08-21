package co;

import android.os.Parcel;
import android.os.Parcelable;
import co.AbstractC6530b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0014¢\u0006\u0004\b\u0019\u0010\u001aJt\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u001aJ\u001a\u0010\"\u001a\u00020\u000b2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b%\u0010+\u001a\u0004\b,\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b)\u0010+\u001a\u0004\b-\u0010\u001eR\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b.\u0010+\u001a\u0004\b.\u0010\u001eR\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b,\u0010+\u001a\u0004\b/\u0010\u001eR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b\f\u00101R\u0017\u0010\r\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b2\u00100\u001a\u0004\b3\u00101R\u0017\u0010\u000e\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b3\u00100\u001a\u0004\b2\u00101R\u0017\u0010\u000f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b4\u00100\u001a\u0004\b4\u00101¨\u00065"}, d2 = {"Lco/a;", "Landroid/os/Parcelable;", "", "autoClaimAmount", "Lco/b;", "autoClaimType", "", "imageURL", "title", "description", "termsAndConditions", "", "isEnabled", "isSelected", "isLoading", "isShowSwitchButtons", "<init>", "(DLco/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZ)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "a", "(DLco/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZ)Lco/a;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "D", "c", "()D", "b", "Lco/b;", "d", "()Lco/b;", "Ljava/lang/String;", "f", "getTitle", "e", "g", "Z", "()Z", "h", "i", "j", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: co.a, reason: case insensitive filesystem and from toString */
/* loaded from: classes10.dex */
public final /* data */ class AutoClaimReward implements Parcelable {
    public static final Parcelable.Creator<AutoClaimReward> CREATOR = new C1232a();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final double autoClaimAmount;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6530b autoClaimType;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String imageURL;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String title;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String description;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String termsAndConditions;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isEnabled;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isSelected;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isLoading;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isShowSwitchButtons;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: co.a$a, reason: collision with other inner class name */
    public static final class C1232a implements Parcelable.Creator<AutoClaimReward> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AutoClaimReward createFromParcel(Parcel parcel) {
            boolean z10;
            boolean z11;
            boolean z12;
            Intrinsics.j(parcel, "parcel");
            double d10 = parcel.readDouble();
            AbstractC6530b abstractC6530b = (AbstractC6530b) parcel.readParcelable(AutoClaimReward.class.getClassLoader());
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            boolean z13 = false;
            boolean z14 = true;
            if (parcel.readInt() != 0) {
                z10 = false;
                z13 = true;
            } else {
                z10 = false;
            }
            if (parcel.readInt() != 0) {
                z11 = true;
            } else {
                z11 = true;
                z14 = z10;
            }
            if (parcel.readInt() != 0) {
                z12 = z11;
            } else {
                z12 = z11;
                z11 = z10;
            }
            if (parcel.readInt() == 0) {
                z12 = z10;
            }
            return new AutoClaimReward(d10, abstractC6530b, string, string2, string3, string4, z13, z14, z11, z12);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AutoClaimReward[] newArray(int i10) {
            return new AutoClaimReward[i10];
        }
    }

    public AutoClaimReward() {
        this(0.0d, null, null, null, null, null, false, false, false, false, 1023, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AutoClaimReward)) {
            return false;
        }
        AutoClaimReward autoClaimReward = (AutoClaimReward) other;
        return Double.compare(this.autoClaimAmount, autoClaimReward.autoClaimAmount) == 0 && Intrinsics.e(this.autoClaimType, autoClaimReward.autoClaimType) && Intrinsics.e(this.imageURL, autoClaimReward.imageURL) && Intrinsics.e(this.title, autoClaimReward.title) && Intrinsics.e(this.description, autoClaimReward.description) && Intrinsics.e(this.termsAndConditions, autoClaimReward.termsAndConditions) && this.isEnabled == autoClaimReward.isEnabled && this.isSelected == autoClaimReward.isSelected && this.isLoading == autoClaimReward.isLoading && this.isShowSwitchButtons == autoClaimReward.isShowSwitchButtons;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.j(dest, "dest");
        dest.writeDouble(this.autoClaimAmount);
        dest.writeParcelable(this.autoClaimType, flags);
        dest.writeString(this.imageURL);
        dest.writeString(this.title);
        dest.writeString(this.description);
        dest.writeString(this.termsAndConditions);
        dest.writeInt(this.isEnabled ? 1 : 0);
        dest.writeInt(this.isSelected ? 1 : 0);
        dest.writeInt(this.isLoading ? 1 : 0);
        dest.writeInt(this.isShowSwitchButtons ? 1 : 0);
    }

    public AutoClaimReward(double d10, AbstractC6530b autoClaimType, String imageURL, String title, String description, String termsAndConditions, boolean z10, boolean z11, boolean z12, boolean z13) {
        Intrinsics.j(autoClaimType, "autoClaimType");
        Intrinsics.j(imageURL, "imageURL");
        Intrinsics.j(title, "title");
        Intrinsics.j(description, "description");
        Intrinsics.j(termsAndConditions, "termsAndConditions");
        this.autoClaimAmount = d10;
        this.autoClaimType = autoClaimType;
        this.imageURL = imageURL;
        this.title = title;
        this.description = description;
        this.termsAndConditions = termsAndConditions;
        this.isEnabled = z10;
        this.isSelected = z11;
        this.isLoading = z12;
        this.isShowSwitchButtons = z13;
    }

    public static /* synthetic */ AutoClaimReward b(AutoClaimReward autoClaimReward, double d10, AbstractC6530b abstractC6530b, String str, String str2, String str3, String str4, boolean z10, boolean z11, boolean z12, boolean z13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            d10 = autoClaimReward.autoClaimAmount;
        }
        double d11 = d10;
        if ((i10 & 2) != 0) {
            abstractC6530b = autoClaimReward.autoClaimType;
        }
        return autoClaimReward.a(d11, abstractC6530b, (i10 & 4) != 0 ? autoClaimReward.imageURL : str, (i10 & 8) != 0 ? autoClaimReward.title : str2, (i10 & 16) != 0 ? autoClaimReward.description : str3, (i10 & 32) != 0 ? autoClaimReward.termsAndConditions : str4, (i10 & 64) != 0 ? autoClaimReward.isEnabled : z10, (i10 & 128) != 0 ? autoClaimReward.isSelected : z11, (i10 & 256) != 0 ? autoClaimReward.isLoading : z12, (i10 & 512) != 0 ? autoClaimReward.isShowSwitchButtons : z13);
    }

    public final AutoClaimReward a(double autoClaimAmount, AbstractC6530b autoClaimType, String imageURL, String title, String description, String termsAndConditions, boolean isEnabled, boolean isSelected, boolean isLoading, boolean isShowSwitchButtons) {
        Intrinsics.j(autoClaimType, "autoClaimType");
        Intrinsics.j(imageURL, "imageURL");
        Intrinsics.j(title, "title");
        Intrinsics.j(description, "description");
        Intrinsics.j(termsAndConditions, "termsAndConditions");
        return new AutoClaimReward(autoClaimAmount, autoClaimType, imageURL, title, description, termsAndConditions, isEnabled, isSelected, isLoading, isShowSwitchButtons);
    }

    /* renamed from: c, reason: from getter */
    public final double getAutoClaimAmount() {
        return this.autoClaimAmount;
    }

    /* renamed from: d, reason: from getter */
    public final AbstractC6530b getAutoClaimType() {
        return this.autoClaimType;
    }

    /* renamed from: e, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: f, reason: from getter */
    public final String getImageURL() {
        return this.imageURL;
    }

    /* renamed from: g, reason: from getter */
    public final String getTermsAndConditions() {
        return this.termsAndConditions;
    }

    public final String getTitle() {
        return this.title;
    }

    /* renamed from: h, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public int hashCode() {
        return (((((((((((((((((Double.hashCode(this.autoClaimAmount) * 31) + this.autoClaimType.hashCode()) * 31) + this.imageURL.hashCode()) * 31) + this.title.hashCode()) * 31) + this.description.hashCode()) * 31) + this.termsAndConditions.hashCode()) * 31) + Boolean.hashCode(this.isEnabled)) * 31) + Boolean.hashCode(this.isSelected)) * 31) + Boolean.hashCode(this.isLoading)) * 31) + Boolean.hashCode(this.isShowSwitchButtons);
    }

    /* renamed from: i, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    /* renamed from: j, reason: from getter */
    public final boolean getIsShowSwitchButtons() {
        return this.isShowSwitchButtons;
    }

    public String toString() {
        return "AutoClaimReward(autoClaimAmount=" + this.autoClaimAmount + ", autoClaimType=" + this.autoClaimType + ", imageURL=" + this.imageURL + ", title=" + this.title + ", description=" + this.description + ", termsAndConditions=" + this.termsAndConditions + ", isEnabled=" + this.isEnabled + ", isSelected=" + this.isSelected + ", isLoading=" + this.isLoading + ", isShowSwitchButtons=" + this.isShowSwitchButtons + ')';
    }

    public /* synthetic */ AutoClaimReward(double d10, AbstractC6530b abstractC6530b, String str, String str2, String str3, String str4, boolean z10, boolean z11, boolean z12, boolean z13, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 0.0d : d10, (i10 & 2) != 0 ? new AbstractC6530b.Unknown(null, 1, null) : abstractC6530b, (i10 & 4) != 0 ? "" : str, (i10 & 8) != 0 ? "" : str2, (i10 & 16) != 0 ? "" : str3, (i10 & 32) != 0 ? "" : str4, (i10 & 64) != 0 ? true : z10, (i10 & 128) != 0 ? false : z11, (i10 & 256) != 0 ? false : z12, (i10 & 512) != 0 ? false : z13);
    }
}
