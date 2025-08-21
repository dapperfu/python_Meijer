package od;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import md.AbstractC15707a;
import md.C15708b;

/* renamed from: od.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C16109e extends AbstractC15707a {
    public static final Parcelable.Creator<C16109e> CREATOR = new C16114j();

    /* renamed from: a, reason: collision with root package name */
    private final PendingIntent f153845a;

    public PendingIntent B() {
        return this.f153845a;
    }

    public C16109e(PendingIntent pendingIntent) {
        this.f153845a = pendingIntent;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = C15708b.a(parcel);
        C15708b.u(parcel, 1, B(), i10, false);
        C15708b.b(parcel, iA);
    }
}
