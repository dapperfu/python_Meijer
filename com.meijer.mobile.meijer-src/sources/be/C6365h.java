package be;

import android.os.Parcel;
import android.os.Parcelable;
import md.AbstractC15707a;
import md.C15708b;

/* renamed from: be.h, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6365h extends AbstractC15707a {
    public static final Parcelable.Creator<C6365h> CREATOR = new r();

    /* renamed from: a, reason: collision with root package name */
    String f60288a;

    /* renamed from: b, reason: collision with root package name */
    String f60289b;

    /* renamed from: c, reason: collision with root package name */
    C6363f f60290c;

    /* renamed from: d, reason: collision with root package name */
    @Deprecated
    C6364g f60291d;

    /* renamed from: e, reason: collision with root package name */
    @Deprecated
    C6364g f60292e;

    C6365h(String str, String str2, C6363f c6363f, C6364g c6364g, C6364g c6364g2) {
        this.f60288a = str;
        this.f60289b = str2;
        this.f60290c = c6363f;
        this.f60291d = c6364g;
        this.f60292e = c6364g2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = C15708b.a(parcel);
        C15708b.w(parcel, 2, this.f60288a, false);
        C15708b.w(parcel, 3, this.f60289b, false);
        C15708b.u(parcel, 4, this.f60290c, i10, false);
        C15708b.u(parcel, 5, this.f60291d, i10, false);
        C15708b.u(parcel, 6, this.f60292e, i10, false);
        C15708b.b(parcel, iA);
    }
}
