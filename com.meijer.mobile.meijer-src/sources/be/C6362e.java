package be;

import android.os.Parcel;
import android.os.Parcelable;
import md.AbstractC15707a;
import md.C15708b;

/* renamed from: be.e, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6362e extends AbstractC15707a {
    public static final Parcelable.Creator<C6362e> CREATOR = new C6372o();

    /* renamed from: a, reason: collision with root package name */
    String f60282a;

    /* renamed from: b, reason: collision with root package name */
    String f60283b;

    public C6362e(String str, String str2) {
        this.f60282a = str;
        this.f60283b = str2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = C15708b.a(parcel);
        C15708b.w(parcel, 2, this.f60282a, false);
        C15708b.w(parcel, 3, this.f60283b, false);
        C15708b.b(parcel, iA);
    }
}
