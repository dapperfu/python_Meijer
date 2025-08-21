package Kd;

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.RemoteViews;
import md.AbstractC15707a;
import md.C15708b;

/* loaded from: classes6.dex */
public final class n extends AbstractC15707a {
    public static final Parcelable.Creator<n> CREATOR = new o();

    /* renamed from: a, reason: collision with root package name */
    String[] f16567a;

    /* renamed from: b, reason: collision with root package name */
    int[] f16568b;

    /* renamed from: c, reason: collision with root package name */
    RemoteViews f16569c;

    /* renamed from: d, reason: collision with root package name */
    byte[] f16570d;

    private n() {
    }

    public n(String[] strArr, int[] iArr, RemoteViews remoteViews, byte[] bArr) {
        this.f16567a = strArr;
        this.f16568b = iArr;
        this.f16569c = remoteViews;
        this.f16570d = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C15708b.a(parcel);
        C15708b.x(parcel, 1, this.f16567a, false);
        C15708b.o(parcel, 2, this.f16568b, false);
        C15708b.u(parcel, 3, this.f16569c, i10, false);
        C15708b.g(parcel, 4, this.f16570d, false);
        C15708b.b(parcel, iA);
    }
}
