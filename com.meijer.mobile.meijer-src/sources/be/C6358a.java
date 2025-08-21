package be;

import android.os.Parcel;
import android.os.Parcelable;
import md.AbstractC15707a;
import md.C15708b;

/* renamed from: be.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6358a extends AbstractC15707a {
    public static final Parcelable.Creator<C6358a> CREATOR = new C6368k();

    /* renamed from: a, reason: collision with root package name */
    String f60268a;

    /* renamed from: b, reason: collision with root package name */
    String f60269b;

    public C6358a(String str, String str2) {
        this.f60268a = str;
        this.f60269b = str2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = C15708b.a(parcel);
        C15708b.w(parcel, 2, this.f60268a, false);
        C15708b.w(parcel, 3, this.f60269b, false);
        C15708b.b(parcel, iA);
    }
}
