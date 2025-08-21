package Zd;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import md.AbstractC15707a;
import md.C15708b;

/* loaded from: classes6.dex */
public final class v extends AbstractC15707a {
    public static final Parcelable.Creator<v> CREATOR = new w();

    /* renamed from: a, reason: collision with root package name */
    String f43773a;

    /* renamed from: b, reason: collision with root package name */
    Bundle f43774b;

    private v() {
    }

    v(String str, Bundle bundle) {
        this.f43773a = str;
        this.f43774b = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C15708b.a(parcel);
        C15708b.w(parcel, 2, this.f43773a, false);
        C15708b.e(parcel, 3, this.f43774b, false);
        C15708b.b(parcel, iA);
    }
}
