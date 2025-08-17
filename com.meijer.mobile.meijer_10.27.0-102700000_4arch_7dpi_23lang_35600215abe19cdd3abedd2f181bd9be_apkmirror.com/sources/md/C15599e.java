package md;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import kd.AbstractC15136a;
import kd.C15137b;

/* renamed from: md.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C15599e extends AbstractC15136a {
    public static final Parcelable.Creator<C15599e> CREATOR = new C15604j();

    /* renamed from: a, reason: collision with root package name */
    private final PendingIntent f150058a;

    public PendingIntent B() {
        return this.f150058a;
    }

    public C15599e(PendingIntent pendingIntent) {
        this.f150058a = pendingIntent;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = C15137b.a(parcel);
        C15137b.u(parcel, 1, B(), i10, false);
        C15137b.b(parcel, iA);
    }
}
