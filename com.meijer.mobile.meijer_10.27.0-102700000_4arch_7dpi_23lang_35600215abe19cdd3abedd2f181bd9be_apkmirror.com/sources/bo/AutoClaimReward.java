package bo;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b \b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0013¢\u0006\u0004\b\u0018\u0010\u0019Jt\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0019J\u001a\u0010!\u001a\u00020\n2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010\u001d\"\u0004\b+\u0010,R\"\u0010\u0006\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010)\u001a\u0004\b-\u0010\u001d\"\u0004\b.\u0010,R\"\u0010\u0007\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010)\u001a\u0004\b/\u0010\u001d\"\u0004\b0\u0010,R\"\u0010\b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010)\u001a\u0004\b1\u0010\u001d\"\u0004\b2\u0010,R\"\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010)\u001a\u0004\b3\u0010\u001d\"\u0004\b4\u0010,R\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u00105\u001a\u0004\b\u000b\u00106\"\u0004\b7\u00108R\"\u0010\f\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u00105\u001a\u0004\b:\u00106\"\u0004\b;\u00108R\"\u0010\r\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u00105\u001a\u0004\b9\u00106\"\u0004\b<\u00108R\"\u0010\u000e\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u00105\u001a\u0004\b=\u00106\"\u0004\b>\u00108¨\u0006?"}, d2 = {"Lbo/a;", "Landroid/os/Parcelable;", "", "autoClaimAmount", "", "autoClaimType", "imageURL", "title", "description", "termsAndConditions", "", "isEnabled", "isSelected", "isLoading", "isShowSwitchButtons", "<init>", "(DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZ)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "a", "(DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZ)Lbo/a;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "D", "c", "()D", "setAutoClaimAmount", "(D)V", "b", "Ljava/lang/String;", "d", "setAutoClaimType", "(Ljava/lang/String;)V", "f", "setImageURL", "getTitle", "setTitle", "e", "setDescription", "g", "setTermsAndConditions", "Z", "()Z", "setEnabled", "(Z)V", "h", "i", "setSelected", "setLoading", "j", "setShowSwitchButtons", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: bo.a, reason: case insensitive filesystem and from toString */
/* loaded from: classes9.dex */
public final /* data */ class AutoClaimReward implements Parcelable {
    public static final Parcelable.Creator<AutoClaimReward> CREATOR = new C1191a();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private double autoClaimAmount;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private String autoClaimType;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private String imageURL;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private String title;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private String description;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private String termsAndConditions;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private boolean isEnabled;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private boolean isSelected;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private boolean isLoading;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private boolean isShowSwitchButtons;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: bo.a$a, reason: collision with other inner class name */
    public static final class C1191a implements Parcelable.Creator<AutoClaimReward> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AutoClaimReward createFromParcel(Parcel parcel) {
            boolean z10;
            boolean z11;
            boolean z12;
            Intrinsics.j(parcel, "parcel");
            double d10 = parcel.readDouble();
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
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
            return new AutoClaimReward(d10, string, string2, string3, string4, string5, z13, z14, z11, z12);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AutoClaimReward[] newArray(int i10) {
            return new AutoClaimReward[i10];
        }
    }

    public AutoClaimReward(double d10, String autoClaimType, String imageURL, String title, String description, String termsAndConditions, boolean z10, boolean z11, boolean z12, boolean z13) {
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
        dest.writeString(this.autoClaimType);
        dest.writeString(this.imageURL);
        dest.writeString(this.title);
        dest.writeString(this.description);
        dest.writeString(this.termsAndConditions);
        dest.writeInt(this.isEnabled ? 1 : 0);
        dest.writeInt(this.isSelected ? 1 : 0);
        dest.writeInt(this.isLoading ? 1 : 0);
        dest.writeInt(this.isShowSwitchButtons ? 1 : 0);
    }

    public static /* synthetic */ AutoClaimReward b(AutoClaimReward autoClaimReward, double d10, String str, String str2, String str3, String str4, String str5, boolean z10, boolean z11, boolean z12, boolean z13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            d10 = autoClaimReward.autoClaimAmount;
        }
        double d11 = d10;
        if ((i10 & 2) != 0) {
            str = autoClaimReward.autoClaimType;
        }
        return autoClaimReward.a(d11, str, (i10 & 4) != 0 ? autoClaimReward.imageURL : str2, (i10 & 8) != 0 ? autoClaimReward.title : str3, (i10 & 16) != 0 ? autoClaimReward.description : str4, (i10 & 32) != 0 ? autoClaimReward.termsAndConditions : str5, (i10 & 64) != 0 ? autoClaimReward.isEnabled : z10, (i10 & 128) != 0 ? autoClaimReward.isSelected : z11, (i10 & 256) != 0 ? autoClaimReward.isLoading : z12, (i10 & 512) != 0 ? autoClaimReward.isShowSwitchButtons : z13);
    }

    public final AutoClaimReward a(double autoClaimAmount, String autoClaimType, String imageURL, String title, String description, String termsAndConditions, boolean isEnabled, boolean isSelected, boolean isLoading, boolean isShowSwitchButtons) {
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
    public final String getAutoClaimType() {
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

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ AutoClaimReward(double r15, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, boolean r22, boolean r23, boolean r24, boolean r25, int r26, kotlin.jvm.internal.DefaultConstructorMarker r27) {
        /*
            r14 = this;
            r0 = r26
            r1 = r0 & 64
            if (r1 == 0) goto L9
            r1 = 1
            r10 = r1
            goto Lb
        L9:
            r10 = r22
        Lb:
            r1 = r0 & 128(0x80, float:1.8E-43)
            r2 = 0
            if (r1 == 0) goto L12
            r11 = r2
            goto L14
        L12:
            r11 = r23
        L14:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L1a
            r12 = r2
            goto L1c
        L1a:
            r12 = r24
        L1c:
            r0 = r0 & 512(0x200, float:7.17E-43)
            if (r0 == 0) goto L2e
            r13 = r2
            r3 = r15
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r9 = r21
            r2 = r14
            goto L3c
        L2e:
            r13 = r25
            r2 = r14
            r3 = r15
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r9 = r21
        L3c:
            r2.<init>(r3, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bo.AutoClaimReward.<init>(double, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
