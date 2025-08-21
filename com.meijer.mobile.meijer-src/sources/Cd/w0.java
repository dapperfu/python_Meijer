package Cd;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import md.AbstractC15707a;
import md.C15708b;

/* loaded from: classes6.dex */
public final class w0 extends AbstractC15707a implements com.google.android.gms.common.api.k {

    /* renamed from: a, reason: collision with root package name */
    private final Status f4288a;

    /* renamed from: b, reason: collision with root package name */
    public static final w0 f4287b = new w0(Status.f65575f);
    public static final Parcelable.Creator<w0> CREATOR = new x0();

    @Override // com.google.android.gms.common.api.k
    public final Status a() {
        return this.f4288a;
    }

    public w0(Status status) {
        this.f4288a = status;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C15708b.a(parcel);
        C15708b.u(parcel, 1, this.f4288a, i10, false);
        C15708b.b(parcel, iA);
    }
}
