package Zd;

import android.os.Parcel;
import android.os.Parcelable;
import kd.AbstractC15136a;
import kd.C15137b;

/* loaded from: classes6.dex */
public final class h extends AbstractC15136a {
    public static final Parcelable.Creator<h> CREATOR = new r();

    /* renamed from: a, reason: collision with root package name */
    String f42621a;

    /* renamed from: b, reason: collision with root package name */
    String f42622b;

    /* renamed from: c, reason: collision with root package name */
    f f42623c;

    /* renamed from: d, reason: collision with root package name */
    @Deprecated
    g f42624d;

    /* renamed from: e, reason: collision with root package name */
    @Deprecated
    g f42625e;

    h(String str, String str2, f fVar, g gVar, g gVar2) {
        this.f42621a = str;
        this.f42622b = str2;
        this.f42623c = fVar;
        this.f42624d = gVar;
        this.f42625e = gVar2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = C15137b.a(parcel);
        C15137b.w(parcel, 2, this.f42621a, false);
        C15137b.w(parcel, 3, this.f42622b, false);
        C15137b.u(parcel, 4, this.f42623c, i10, false);
        C15137b.u(parcel, 5, this.f42624d, i10, false);
        C15137b.u(parcel, 6, this.f42625e, i10, false);
        C15137b.b(parcel, iA);
    }
}
