package Xd;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import kd.AbstractC15136a;
import kd.C15137b;

/* loaded from: classes6.dex */
public final class v extends AbstractC15136a {
    public static final Parcelable.Creator<v> CREATOR = new w();

    /* renamed from: a, reason: collision with root package name */
    String f39295a;

    /* renamed from: b, reason: collision with root package name */
    Bundle f39296b;

    private v() {
    }

    v(String str, Bundle bundle) {
        this.f39295a = str;
        this.f39296b = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C15137b.a(parcel);
        C15137b.w(parcel, 2, this.f39295a, false);
        C15137b.e(parcel, 3, this.f39296b, false);
        C15137b.b(parcel, iA);
    }
}
