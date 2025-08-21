package Ld;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import md.AbstractC15707a;
import md.C15708b;

/* loaded from: classes6.dex */
public final class o extends AbstractC15707a implements com.google.android.gms.common.api.k {
    public static final Parcelable.Creator<o> CREATOR = new x();

    /* renamed from: a, reason: collision with root package name */
    private final Status f18186a;

    /* renamed from: b, reason: collision with root package name */
    private final p f18187b;

    public p B() {
        return this.f18187b;
    }

    @Override // com.google.android.gms.common.api.k
    public Status a() {
        return this.f18186a;
    }

    public o(Status status, p pVar) {
        this.f18186a = status;
        this.f18187b = pVar;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = C15708b.a(parcel);
        C15708b.u(parcel, 1, a(), i10, false);
        C15708b.u(parcel, 2, B(), i10, false);
        C15708b.b(parcel, iA);
    }
}
