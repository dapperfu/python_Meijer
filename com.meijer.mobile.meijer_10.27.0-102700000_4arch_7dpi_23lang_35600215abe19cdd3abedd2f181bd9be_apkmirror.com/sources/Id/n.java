package Id;

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.RemoteViews;
import kd.AbstractC15136a;
import kd.C15137b;

/* loaded from: classes6.dex */
public final class n extends AbstractC15136a {
    public static final Parcelable.Creator<n> CREATOR = new o();

    /* renamed from: a, reason: collision with root package name */
    String[] f13821a;

    /* renamed from: b, reason: collision with root package name */
    int[] f13822b;

    /* renamed from: c, reason: collision with root package name */
    RemoteViews f13823c;

    /* renamed from: d, reason: collision with root package name */
    byte[] f13824d;

    private n() {
    }

    public n(String[] strArr, int[] iArr, RemoteViews remoteViews, byte[] bArr) {
        this.f13821a = strArr;
        this.f13822b = iArr;
        this.f13823c = remoteViews;
        this.f13824d = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C15137b.a(parcel);
        C15137b.x(parcel, 1, this.f13821a, false);
        C15137b.o(parcel, 2, this.f13822b, false);
        C15137b.u(parcel, 3, this.f13823c, i10, false);
        C15137b.g(parcel, 4, this.f13824d, false);
        C15137b.b(parcel, iA);
    }
}
