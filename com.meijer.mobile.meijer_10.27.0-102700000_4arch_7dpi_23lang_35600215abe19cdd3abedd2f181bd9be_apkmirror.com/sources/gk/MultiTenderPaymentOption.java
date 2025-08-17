package gk;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0010J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u001d\u0010&\u001a\u00020 8\u0006¢\u0006\u0012\n\u0004\b!\u0010\"\u0012\u0004\b$\u0010%\u001a\u0004\b!\u0010#¨\u0006'"}, d2 = {"Lgk/e;", "Landroid/os/Parcelable;", "Lgk/f;", "creditDebitPaymentOption", "Lgk/d;", "ebtPaymentOption", "<init>", "(Lgk/f;Lgk/d;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lgk/f;", "()Lgk/f;", "b", "Lgk/d;", "()Lgk/d;", "Lgk/i;", "c", "Lgk/i;", "()Lgk/i;", "getSelectedTender$annotations", "()V", "selectedTender", "models_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: gk.e, reason: from toString */
/* loaded from: classes7.dex */
public final /* data */ class MultiTenderPaymentOption implements Parcelable {
    public static final Parcelable.Creator<MultiTenderPaymentOption> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final PaymentOption creditDebitPaymentOption;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final EbtPaymentOption ebtPaymentOption;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final i selectedTender;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: gk.e$a */
    public static final class a implements Parcelable.Creator<MultiTenderPaymentOption> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MultiTenderPaymentOption createFromParcel(Parcel parcel) {
            Intrinsics.j(parcel, "parcel");
            return new MultiTenderPaymentOption(PaymentOption.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : EbtPaymentOption.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final MultiTenderPaymentOption[] newArray(int i10) {
            return new MultiTenderPaymentOption[i10];
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
        if (!(other instanceof MultiTenderPaymentOption)) {
            return false;
        }
        MultiTenderPaymentOption multiTenderPaymentOption = (MultiTenderPaymentOption) other;
        return Intrinsics.e(this.creditDebitPaymentOption, multiTenderPaymentOption.creditDebitPaymentOption) && Intrinsics.e(this.ebtPaymentOption, multiTenderPaymentOption.ebtPaymentOption);
    }

    public MultiTenderPaymentOption(PaymentOption creditDebitPaymentOption, EbtPaymentOption ebtPaymentOption) {
        i iVar;
        Intrinsics.j(creditDebitPaymentOption, "creditDebitPaymentOption");
        this.creditDebitPaymentOption = creditDebitPaymentOption;
        this.ebtPaymentOption = ebtPaymentOption;
        this.selectedTender = (ebtPaymentOption == null || (iVar = i.f133768d) == null) ? i.f133766b : iVar;
    }

    /* renamed from: a, reason: from getter */
    public final PaymentOption getCreditDebitPaymentOption() {
        return this.creditDebitPaymentOption;
    }

    /* renamed from: b, reason: from getter */
    public final EbtPaymentOption getEbtPaymentOption() {
        return this.ebtPaymentOption;
    }

    /* renamed from: c, reason: from getter */
    public final i getSelectedTender() {
        return this.selectedTender;
    }

    public int hashCode() {
        int iHashCode = this.creditDebitPaymentOption.hashCode() * 31;
        EbtPaymentOption ebtPaymentOption = this.ebtPaymentOption;
        return iHashCode + (ebtPaymentOption == null ? 0 : ebtPaymentOption.hashCode());
    }

    public String toString() {
        return "MultiTenderPaymentOption(creditDebitPaymentOption=" + this.creditDebitPaymentOption + ", ebtPaymentOption=" + this.ebtPaymentOption + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.j(dest, "dest");
        this.creditDebitPaymentOption.writeToParcel(dest, flags);
        EbtPaymentOption ebtPaymentOption = this.ebtPaymentOption;
        if (ebtPaymentOption == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            ebtPaymentOption.writeToParcel(dest, flags);
        }
    }
}
