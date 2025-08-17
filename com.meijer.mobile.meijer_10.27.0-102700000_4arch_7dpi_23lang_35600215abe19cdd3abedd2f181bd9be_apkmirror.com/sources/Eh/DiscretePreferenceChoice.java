package Eh;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mg.InterfaceC15617c;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000fJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u000f\"\u0004\b\u001b\u0010\u001cR$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0018\u0010\u0011\"\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"LEh/b;", "Landroid/os/Parcelable;", "", "choiceId", "", "choiceValue", "<init>", "(ILjava/lang/String;)V", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getChoiceId", "setChoiceId", "(I)V", "b", "Ljava/lang/String;", "setChoiceValue", "(Ljava/lang/String;)V", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Eh.b, reason: from toString */
/* loaded from: classes7.dex */
public final /* data */ class DiscretePreferenceChoice implements Parcelable {
    public static final Parcelable.Creator<DiscretePreferenceChoice> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @InterfaceC15617c("digitalPreferenceDiscreteChoiceId")
    private int choiceId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @InterfaceC15617c("digitalPreferenceDiscreteChoiceValue")
    private String choiceValue;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Eh.b$a */
    public static final class a implements Parcelable.Creator<DiscretePreferenceChoice> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DiscretePreferenceChoice createFromParcel(Parcel parcel) {
            Intrinsics.j(parcel, "parcel");
            return new DiscretePreferenceChoice(parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final DiscretePreferenceChoice[] newArray(int i10) {
            return new DiscretePreferenceChoice[i10];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DiscretePreferenceChoice() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DiscretePreferenceChoice)) {
            return false;
        }
        DiscretePreferenceChoice discretePreferenceChoice = (DiscretePreferenceChoice) other;
        return this.choiceId == discretePreferenceChoice.choiceId && Intrinsics.e(this.choiceValue, discretePreferenceChoice.choiceValue);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.j(dest, "dest");
        dest.writeInt(this.choiceId);
        dest.writeString(this.choiceValue);
    }

    public DiscretePreferenceChoice(int i10, String str) {
        this.choiceId = i10;
        this.choiceValue = str;
    }

    /* renamed from: a, reason: from getter */
    public final String getChoiceValue() {
        return this.choiceValue;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.choiceId) * 31;
        String str = this.choiceValue;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "DiscretePreferenceChoice(choiceId=" + this.choiceId + ", choiceValue=" + this.choiceValue + ')';
    }

    public /* synthetic */ DiscretePreferenceChoice(int i10, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i10, (i11 & 2) != 0 ? null : str);
    }
}
