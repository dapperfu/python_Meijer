package Fd;

import android.os.Parcel;
import android.os.Parcelable;
import md.AbstractC15707a;
import md.C15708b;

/* loaded from: classes6.dex */
public final class ra extends AbstractC15707a {
    public static final Parcelable.Creator<ra> CREATOR = new Ka();

    /* renamed from: a, reason: collision with root package name */
    private final String f10284a;

    /* renamed from: b, reason: collision with root package name */
    private final String f10285b;

    /* renamed from: c, reason: collision with root package name */
    private final int f10286c;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f10284a;
        int iA = C15708b.a(parcel);
        C15708b.w(parcel, 1, str, false);
        C15708b.w(parcel, 2, this.f10285b, false);
        C15708b.n(parcel, 3, this.f10286c);
        C15708b.b(parcel, iA);
    }

    public ra(String str, String str2, int i10) {
        this.f10284a = str;
        this.f10285b = str2;
        this.f10286c = i10;
    }
}
