package Eh;

import android.os.Parcel;
import android.os.Parcelable;
import io.constructor.data.local.PreferencesHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import sk.EnumC17080a;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0013J\u001a\u0010\u001a\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001c\u0010!R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b#\u0010%\u001a\u0004\b\u001f\u0010&¨\u0006'"}, d2 = {"LEh/D;", "Landroid/os/Parcelable;", "", PreferencesHelper.PREF_ID, "", "accountId", "", "isSuccess", "Lsk/a;", "errorType", "<init>", "(IJZLsk/a;)V", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "I", "c", "b", "J", "()J", "Z", "d", "()Z", "Lsk/a;", "()Lsk/a;", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Eh.D, reason: from toString */
/* loaded from: classes8.dex */
public final /* data */ class UpdateConfirmationResponse implements Parcelable {
    public static final Parcelable.Creator<UpdateConfirmationResponse> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int id;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final long accountId;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isSuccess;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final EnumC17080a errorType;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Eh.D$a */
    public static final class a implements Parcelable.Creator<UpdateConfirmationResponse> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final UpdateConfirmationResponse createFromParcel(Parcel parcel) {
            Intrinsics.j(parcel, "parcel");
            return new UpdateConfirmationResponse(parcel.readInt(), parcel.readLong(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : EnumC17080a.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final UpdateConfirmationResponse[] newArray(int i10) {
            return new UpdateConfirmationResponse[i10];
        }
    }

    public UpdateConfirmationResponse(int i10, long j10, boolean z10, EnumC17080a enumC17080a) {
        this.id = i10;
        this.accountId = j10;
        this.isSuccess = z10;
        this.errorType = enumC17080a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpdateConfirmationResponse)) {
            return false;
        }
        UpdateConfirmationResponse updateConfirmationResponse = (UpdateConfirmationResponse) other;
        return this.id == updateConfirmationResponse.id && this.accountId == updateConfirmationResponse.accountId && this.isSuccess == updateConfirmationResponse.isSuccess && this.errorType == updateConfirmationResponse.errorType;
    }

    /* renamed from: a, reason: from getter */
    public final long getAccountId() {
        return this.accountId;
    }

    /* renamed from: b, reason: from getter */
    public final EnumC17080a getErrorType() {
        return this.errorType;
    }

    /* renamed from: c, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: d, reason: from getter */
    public final boolean getIsSuccess() {
        return this.isSuccess;
    }

    public int hashCode() {
        int iHashCode = ((((Integer.hashCode(this.id) * 31) + Long.hashCode(this.accountId)) * 31) + Boolean.hashCode(this.isSuccess)) * 31;
        EnumC17080a enumC17080a = this.errorType;
        return iHashCode + (enumC17080a == null ? 0 : enumC17080a.hashCode());
    }

    public String toString() {
        return "UpdateConfirmationResponse(id=" + this.id + ", accountId=" + this.accountId + ", isSuccess=" + this.isSuccess + ", errorType=" + this.errorType + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.j(dest, "dest");
        dest.writeInt(this.id);
        dest.writeLong(this.accountId);
        dest.writeInt(this.isSuccess ? 1 : 0);
        EnumC17080a enumC17080a = this.errorType;
        if (enumC17080a == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(enumC17080a.name());
        }
    }

    public /* synthetic */ UpdateConfirmationResponse(int i10, long j10, boolean z10, EnumC17080a enumC17080a, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i10, (i11 & 2) != 0 ? 0L : j10, z10, enumC17080a);
    }
}
