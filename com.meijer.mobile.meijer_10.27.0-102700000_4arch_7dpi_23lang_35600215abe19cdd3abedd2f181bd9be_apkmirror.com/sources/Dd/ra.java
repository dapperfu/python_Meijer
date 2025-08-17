package Dd;

import android.os.Parcel;
import android.os.Parcelable;
import kd.AbstractC15136a;
import kd.C15137b;

/* loaded from: classes6.dex */
public final class ra extends AbstractC15136a {
    public static final Parcelable.Creator<ra> CREATOR = new Ka();

    /* renamed from: a, reason: collision with root package name */
    private final String f6251a;

    /* renamed from: b, reason: collision with root package name */
    private final String f6252b;

    /* renamed from: c, reason: collision with root package name */
    private final int f6253c;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f6251a;
        int iA = C15137b.a(parcel);
        C15137b.w(parcel, 1, str, false);
        C15137b.w(parcel, 2, this.f6252b, false);
        C15137b.n(parcel, 3, this.f6253c);
        C15137b.b(parcel, iA);
    }

    public ra(String str, String str2, int i10) {
        this.f6251a = str;
        this.f6252b = str2;
        this.f6253c = i10;
    }
}
