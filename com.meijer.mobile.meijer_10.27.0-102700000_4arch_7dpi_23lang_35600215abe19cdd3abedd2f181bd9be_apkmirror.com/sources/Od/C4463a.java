package Od;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import kd.AbstractC15136a;
import kd.C15137b;

/* renamed from: Od.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4463a extends AbstractC15136a {
    public static final Parcelable.Creator<C4463a> CREATOR = new C4464b();

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f23569a;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        Bundle bundle = this.f23569a;
        int iA = C15137b.a(parcel);
        C15137b.e(parcel, 1, bundle, false);
        C15137b.b(parcel, iA);
    }

    public C4463a(Bundle bundle) {
        this.f23569a = bundle;
    }
}
