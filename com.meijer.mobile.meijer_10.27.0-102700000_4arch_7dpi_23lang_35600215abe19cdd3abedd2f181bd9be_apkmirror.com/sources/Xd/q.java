package Xd;

import android.os.Parcel;
import android.os.Parcelable;
import kd.AbstractC15136a;
import kd.C15137b;

@Deprecated
/* loaded from: classes6.dex */
public final class q extends AbstractC15136a {
    public static final Parcelable.Creator<q> CREATOR = new r();

    /* renamed from: a, reason: collision with root package name */
    final String f39290a;

    /* renamed from: b, reason: collision with root package name */
    final String f39291b;

    /* renamed from: c, reason: collision with root package name */
    final int f39292c;

    /* renamed from: d, reason: collision with root package name */
    final int f39293d;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f39290a;
        int iA = C15137b.a(parcel);
        C15137b.w(parcel, 2, str, false);
        C15137b.w(parcel, 3, this.f39291b, false);
        C15137b.n(parcel, 4, this.f39292c);
        C15137b.n(parcel, 5, this.f39293d);
        C15137b.b(parcel, iA);
    }

    public q(String str, String str2, int i10, int i11) {
        this.f39290a = str;
        this.f39291b = str2;
        this.f39292c = i10;
        this.f39293d = i11;
    }
}
