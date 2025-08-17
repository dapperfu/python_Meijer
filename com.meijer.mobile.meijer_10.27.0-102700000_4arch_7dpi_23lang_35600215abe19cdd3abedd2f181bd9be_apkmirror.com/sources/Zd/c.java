package Zd;

import android.os.Parcel;
import android.os.Parcelable;
import kd.AbstractC15136a;
import kd.C15137b;

/* loaded from: classes6.dex */
public final class c extends AbstractC15136a {
    public static final Parcelable.Creator<c> CREATOR = new n();

    /* renamed from: a, reason: collision with root package name */
    String f42606a;

    /* renamed from: b, reason: collision with root package name */
    d f42607b;

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    f f42608c;

    c() {
    }

    c(String str, d dVar, f fVar) {
        this.f42606a = str;
        this.f42607b = dVar;
        this.f42608c = fVar;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = C15137b.a(parcel);
        C15137b.w(parcel, 2, this.f42606a, false);
        C15137b.u(parcel, 3, this.f42607b, i10, false);
        C15137b.u(parcel, 5, this.f42608c, i10, false);
        C15137b.b(parcel, iA);
    }
}
