package Jd;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import kd.AbstractC15136a;
import kd.C15137b;

/* loaded from: classes6.dex */
public final class o extends AbstractC15136a implements com.google.android.gms.common.api.k {
    public static final Parcelable.Creator<o> CREATOR = new x();

    /* renamed from: a, reason: collision with root package name */
    private final Status f14849a;

    /* renamed from: b, reason: collision with root package name */
    private final p f14850b;

    public p B() {
        return this.f14850b;
    }

    @Override // com.google.android.gms.common.api.k
    public Status a() {
        return this.f14849a;
    }

    public o(Status status, p pVar) {
        this.f14849a = status;
        this.f14850b = pVar;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = C15137b.a(parcel);
        C15137b.u(parcel, 1, a(), i10, false);
        C15137b.u(parcel, 2, B(), i10, false);
        C15137b.b(parcel, iA);
    }
}
