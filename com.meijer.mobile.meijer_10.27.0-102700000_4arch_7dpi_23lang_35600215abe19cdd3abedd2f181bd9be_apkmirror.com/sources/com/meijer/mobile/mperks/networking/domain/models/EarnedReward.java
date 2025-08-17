package com.meijer.mobile.mperks.networking.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b2\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0003\u0010\u000e\u001a\u00020\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\u0089\u0001\u00106\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\u000e\u001a\u00020\u0003HÆ\u0001J\u0006\u00107\u001a\u000208J\u0013\u00109\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u00010<HÖ\u0003J\t\u0010=\u001a\u000208HÖ\u0001J\t\u0010>\u001a\u00020\u0005HÖ\u0001J\u0016\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u000208R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0016\"\u0004\b\u001a\u0010\u0018R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0016\"\u0004\b\u001c\u0010\u0018R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0016\"\u0004\b\u001e\u0010\u0018R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0016\"\u0004\b \u0010\u0018R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0016\"\u0004\b\"\u0010\u0018R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0016\"\u0004\b$\u0010\u0018R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0016\"\u0004\b&\u0010\u0018R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0016\"\u0004\b(\u0010\u0018R\u001a\u0010\u000e\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0012\"\u0004\b*\u0010\u0014¨\u0006D"}, d2 = {"Lcom/meijer/mobile/mperks/networking/domain/models/EarnedReward;", "Landroid/os/Parcelable;", "meijerOfferId", "", "imageUrl", "", "title", "description", "termsAndConditions", "redeemByDate", "transactionDate", "earnDate", "redeemedDate", "rewardProgram", "logixOfferId", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "getMeijerOfferId", "()J", "setMeijerOfferId", "(J)V", "getImageUrl", "()Ljava/lang/String;", "setImageUrl", "(Ljava/lang/String;)V", "getTitle", "setTitle", "getDescription", "setDescription", "getTermsAndConditions", "setTermsAndConditions", "getRedeemByDate", "setRedeemByDate", "getTransactionDate", "setTransactionDate", "getEarnDate", "setEarnDate", "getRedeemedDate", "setRedeemedDate", "getRewardProgram", "setRewardProgram", "getLogixOfferId", "setLogixOfferId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "networking_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class EarnedReward implements Parcelable {
    public static final Parcelable.Creator<EarnedReward> CREATOR = new Creator();
    private String description;
    private String earnDate;
    private String imageUrl;
    private long logixOfferId;
    private long meijerOfferId;
    private String redeemByDate;
    private String redeemedDate;
    private String rewardProgram;
    private String termsAndConditions;
    private String title;
    private String transactionDate;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<EarnedReward> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EarnedReward createFromParcel(Parcel parcel) {
            Intrinsics.j(parcel, "parcel");
            return new EarnedReward(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EarnedReward[] newArray(int i10) {
            return new EarnedReward[i10];
        }
    }

    public EarnedReward() {
        this(0L, null, null, null, null, null, null, null, null, null, 0L, 2047, null);
    }

    /* renamed from: component1, reason: from getter */
    public final long getMeijerOfferId() {
        return this.meijerOfferId;
    }

    /* renamed from: component10, reason: from getter */
    public final String getRewardProgram() {
        return this.rewardProgram;
    }

    /* renamed from: component11, reason: from getter */
    public final long getLogixOfferId() {
        return this.logixOfferId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component4, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component5, reason: from getter */
    public final String getTermsAndConditions() {
        return this.termsAndConditions;
    }

    /* renamed from: component6, reason: from getter */
    public final String getRedeemByDate() {
        return this.redeemByDate;
    }

    /* renamed from: component7, reason: from getter */
    public final String getTransactionDate() {
        return this.transactionDate;
    }

    /* renamed from: component8, reason: from getter */
    public final String getEarnDate() {
        return this.earnDate;
    }

    /* renamed from: component9, reason: from getter */
    public final String getRedeemedDate() {
        return this.redeemedDate;
    }

    public final EarnedReward copy(@g(name = "meijerOfferId") long meijerOfferId, @g(name = "imageUrl") String imageUrl, @g(name = "title") String title, @g(name = "description") String description, @g(name = "termsAndConditions") String termsAndConditions, @g(name = "expirationDate") String redeemByDate, @g(name = "transactionDate") String transactionDate, @g(name = "earnDate") String earnDate, @g(name = "redeemDate") String redeemedDate, @g(name = "rewardProgram") String rewardProgram, @g(name = "logixOfferId") long logixOfferId) {
        return new EarnedReward(meijerOfferId, imageUrl, title, description, termsAndConditions, redeemByDate, transactionDate, earnDate, redeemedDate, rewardProgram, logixOfferId);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EarnedReward)) {
            return false;
        }
        EarnedReward earnedReward = (EarnedReward) other;
        return this.meijerOfferId == earnedReward.meijerOfferId && Intrinsics.e(this.imageUrl, earnedReward.imageUrl) && Intrinsics.e(this.title, earnedReward.title) && Intrinsics.e(this.description, earnedReward.description) && Intrinsics.e(this.termsAndConditions, earnedReward.termsAndConditions) && Intrinsics.e(this.redeemByDate, earnedReward.redeemByDate) && Intrinsics.e(this.transactionDate, earnedReward.transactionDate) && Intrinsics.e(this.earnDate, earnedReward.earnDate) && Intrinsics.e(this.redeemedDate, earnedReward.redeemedDate) && Intrinsics.e(this.rewardProgram, earnedReward.rewardProgram) && this.logixOfferId == earnedReward.logixOfferId;
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.meijerOfferId) * 31;
        String str = this.imageUrl;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.title;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.description;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.termsAndConditions;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.redeemByDate;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.transactionDate;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.earnDate;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.redeemedDate;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.rewardProgram;
        return ((iHashCode9 + (str9 != null ? str9.hashCode() : 0)) * 31) + Long.hashCode(this.logixOfferId);
    }

    public String toString() {
        return "EarnedReward(meijerOfferId=" + this.meijerOfferId + ", imageUrl=" + this.imageUrl + ", title=" + this.title + ", description=" + this.description + ", termsAndConditions=" + this.termsAndConditions + ", redeemByDate=" + this.redeemByDate + ", transactionDate=" + this.transactionDate + ", earnDate=" + this.earnDate + ", redeemedDate=" + this.redeemedDate + ", rewardProgram=" + this.rewardProgram + ", logixOfferId=" + this.logixOfferId + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.j(dest, "dest");
        dest.writeLong(this.meijerOfferId);
        dest.writeString(this.imageUrl);
        dest.writeString(this.title);
        dest.writeString(this.description);
        dest.writeString(this.termsAndConditions);
        dest.writeString(this.redeemByDate);
        dest.writeString(this.transactionDate);
        dest.writeString(this.earnDate);
        dest.writeString(this.redeemedDate);
        dest.writeString(this.rewardProgram);
        dest.writeLong(this.logixOfferId);
    }

    public EarnedReward(@g(name = "meijerOfferId") long j10, @g(name = "imageUrl") String str, @g(name = "title") String str2, @g(name = "description") String str3, @g(name = "termsAndConditions") String str4, @g(name = "expirationDate") String str5, @g(name = "transactionDate") String str6, @g(name = "earnDate") String str7, @g(name = "redeemDate") String str8, @g(name = "rewardProgram") String str9, @g(name = "logixOfferId") long j11) {
        this.meijerOfferId = j10;
        this.imageUrl = str;
        this.title = str2;
        this.description = str3;
        this.termsAndConditions = str4;
        this.redeemByDate = str5;
        this.transactionDate = str6;
        this.earnDate = str7;
        this.redeemedDate = str8;
        this.rewardProgram = str9;
        this.logixOfferId = j11;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getEarnDate() {
        return this.earnDate;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final long getLogixOfferId() {
        return this.logixOfferId;
    }

    public final long getMeijerOfferId() {
        return this.meijerOfferId;
    }

    public final String getRedeemByDate() {
        return this.redeemByDate;
    }

    public final String getRedeemedDate() {
        return this.redeemedDate;
    }

    public final String getRewardProgram() {
        return this.rewardProgram;
    }

    public final String getTermsAndConditions() {
        return this.termsAndConditions;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getTransactionDate() {
        return this.transactionDate;
    }

    public final void setDescription(String str) {
        this.description = str;
    }

    public final void setEarnDate(String str) {
        this.earnDate = str;
    }

    public final void setImageUrl(String str) {
        this.imageUrl = str;
    }

    public final void setLogixOfferId(long j10) {
        this.logixOfferId = j10;
    }

    public final void setMeijerOfferId(long j10) {
        this.meijerOfferId = j10;
    }

    public final void setRedeemByDate(String str) {
        this.redeemByDate = str;
    }

    public final void setRedeemedDate(String str) {
        this.redeemedDate = str;
    }

    public final void setRewardProgram(String str) {
        this.rewardProgram = str;
    }

    public final void setTermsAndConditions(String str) {
        this.termsAndConditions = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final void setTransactionDate(String str) {
        this.transactionDate = str;
    }

    public /* synthetic */ EarnedReward(long j10, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, long j11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 0L : j10, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : str2, (i10 & 8) != 0 ? null : str3, (i10 & 16) != 0 ? null : str4, (i10 & 32) != 0 ? null : str5, (i10 & 64) != 0 ? null : str6, (i10 & 128) != 0 ? null : str7, (i10 & 256) != 0 ? null : str8, (i10 & 512) == 0 ? str9 : null, (i10 & 1024) != 0 ? 0L : j11);
    }
}
