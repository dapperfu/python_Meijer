package com.meijer.mobile.mperks.networking.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u000b\u001a\u00020\u0003J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0003R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0018"}, d2 = {"Lcom/meijer/mobile/mperks/networking/domain/models/Summary;", "Landroid/os/Parcelable;", "earnedCount", "", "<init>", "(I)V", "getEarnedCount", "()I", "setEarnedCount", "component1", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "networking_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class Summary implements Parcelable {
    public static final Parcelable.Creator<Summary> CREATOR = new Creator();
    private int earnedCount;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Summary> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Summary createFromParcel(Parcel parcel) {
            Intrinsics.j(parcel, "parcel");
            return new Summary(parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Summary[] newArray(int i10) {
            return new Summary[i10];
        }
    }

    public Summary() {
        this(0, 1, null);
    }

    public static /* synthetic */ Summary copy$default(Summary summary, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = summary.earnedCount;
        }
        return summary.copy(i10);
    }

    /* renamed from: component1, reason: from getter */
    public final int getEarnedCount() {
        return this.earnedCount;
    }

    public final Summary copy(@g(name = "earnedCount") int earnedCount) {
        return new Summary(earnedCount);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Summary) && this.earnedCount == ((Summary) other).earnedCount;
    }

    public int hashCode() {
        return Integer.hashCode(this.earnedCount);
    }

    public String toString() {
        return "Summary(earnedCount=" + this.earnedCount + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.j(dest, "dest");
        dest.writeInt(this.earnedCount);
    }

    public Summary(@g(name = "earnedCount") int i10) {
        this.earnedCount = i10;
    }

    public final int getEarnedCount() {
        return this.earnedCount;
    }

    public final void setEarnedCount(int i10) {
        this.earnedCount = i10;
    }

    public /* synthetic */ Summary(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i10);
    }
}
