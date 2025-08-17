package Vl;

import android.os.Parcel;
import android.os.Parcelable;
import io.constructor.data.local.PreferencesHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013J8\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0013J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u001e\u001a\u0004\b\u001f\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b!\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010$R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b%\u0010'¨\u0006("}, d2 = {"LVl/b;", "Landroid/os/Parcelable;", "", PreferencesHelper.PREF_ID, "type", "LVl/d;", "mperksCreditCard", "LVl/e;", "mperksData", "<init>", "(Ljava/lang/String;Ljava/lang/String;LVl/d;LVl/e;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "a", "(Ljava/lang/String;Ljava/lang/String;LVl/d;LVl/e;)LVl/b;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "b", "getType", "c", "LVl/d;", "()LVl/d;", "d", "LVl/e;", "()LVl/e;", "models_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Vl.b, reason: from toString */
/* loaded from: classes9.dex */
public final /* data */ class HomeMperks implements Parcelable {
    public static final Parcelable.Creator<HomeMperks> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String type;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final MperksCreditCard mperksCreditCard;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final MperksData mperksData;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Vl.b$a */
    public static final class a implements Parcelable.Creator<HomeMperks> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HomeMperks createFromParcel(Parcel parcel) {
            Intrinsics.j(parcel, "parcel");
            return new HomeMperks(parcel.readString(), parcel.readString(), MperksCreditCard.CREATOR.createFromParcel(parcel), MperksData.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final HomeMperks[] newArray(int i10) {
            return new HomeMperks[i10];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HomeMperks)) {
            return false;
        }
        HomeMperks homeMperks = (HomeMperks) other;
        return Intrinsics.e(this.id, homeMperks.id) && Intrinsics.e(this.type, homeMperks.type) && Intrinsics.e(this.mperksCreditCard, homeMperks.mperksCreditCard) && Intrinsics.e(this.mperksData, homeMperks.mperksData);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.j(dest, "dest");
        dest.writeString(this.id);
        dest.writeString(this.type);
        this.mperksCreditCard.writeToParcel(dest, flags);
        this.mperksData.writeToParcel(dest, flags);
    }

    public HomeMperks(String id2, String type, MperksCreditCard mperksCreditCard, MperksData mperksData) {
        Intrinsics.j(id2, "id");
        Intrinsics.j(type, "type");
        Intrinsics.j(mperksCreditCard, "mperksCreditCard");
        Intrinsics.j(mperksData, "mperksData");
        this.id = id2;
        this.type = type;
        this.mperksCreditCard = mperksCreditCard;
        this.mperksData = mperksData;
    }

    public static /* synthetic */ HomeMperks b(HomeMperks homeMperks, String str, String str2, MperksCreditCard dVar, MperksData mperksData, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = homeMperks.id;
        }
        if ((i10 & 2) != 0) {
            str2 = homeMperks.type;
        }
        if ((i10 & 4) != 0) {
            dVar = homeMperks.mperksCreditCard;
        }
        if ((i10 & 8) != 0) {
            mperksData = homeMperks.mperksData;
        }
        return homeMperks.a(str, str2, dVar, mperksData);
    }

    public final HomeMperks a(String id2, String type, MperksCreditCard mperksCreditCard, MperksData mperksData) {
        Intrinsics.j(id2, "id");
        Intrinsics.j(type, "type");
        Intrinsics.j(mperksCreditCard, "mperksCreditCard");
        Intrinsics.j(mperksData, "mperksData");
        return new HomeMperks(id2, type, mperksCreditCard, mperksData);
    }

    /* renamed from: c, reason: from getter */
    public final MperksCreditCard getMperksCreditCard() {
        return this.mperksCreditCard;
    }

    /* renamed from: d, reason: from getter */
    public final MperksData getMperksData() {
        return this.mperksData;
    }

    public int hashCode() {
        return (((((this.id.hashCode() * 31) + this.type.hashCode()) * 31) + this.mperksCreditCard.hashCode()) * 31) + this.mperksData.hashCode();
    }

    public String toString() {
        return "HomeMperks(id=" + this.id + ", type=" + this.type + ", mperksCreditCard=" + this.mperksCreditCard + ", mperksData=" + this.mperksData + ')';
    }
}
