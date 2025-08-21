package Fd;

import android.os.Parcel;
import android.os.Parcelable;
import md.AbstractC15707a;
import md.C15708b;

/* loaded from: classes6.dex */
public final class oa extends AbstractC15707a {
    public static final Parcelable.Creator<oa> CREATOR = new Ia();

    /* renamed from: a, reason: collision with root package name */
    private final String f10240a;

    /* renamed from: b, reason: collision with root package name */
    private final String f10241b;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f10240a;
        int iA = C15708b.a(parcel);
        C15708b.w(parcel, 1, str, false);
        C15708b.w(parcel, 2, this.f10241b, false);
        C15708b.b(parcel, iA);
    }

    public oa(String str, String str2) {
        this.f10240a = str;
        this.f10241b = str2;
    }
}
