package Ad;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import kd.AbstractC15136a;
import kd.C15137b;

/* loaded from: classes6.dex */
public final class w0 extends AbstractC15136a implements com.google.android.gms.common.api.k {

    /* renamed from: a, reason: collision with root package name */
    private final Status f292a;

    /* renamed from: b, reason: collision with root package name */
    public static final w0 f291b = new w0(Status.f64735f);
    public static final Parcelable.Creator<w0> CREATOR = new x0();

    @Override // com.google.android.gms.common.api.k
    public final Status a() {
        return this.f292a;
    }

    public w0(Status status) {
        this.f292a = status;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C15137b.a(parcel);
        C15137b.u(parcel, 1, this.f292a, i10, false);
        C15137b.b(parcel, iA);
    }
}
