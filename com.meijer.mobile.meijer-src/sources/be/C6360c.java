package be;

import android.os.Parcel;
import android.os.Parcelable;
import md.AbstractC15707a;
import md.C15708b;

/* renamed from: be.c, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6360c extends AbstractC15707a {
    public static final Parcelable.Creator<C6360c> CREATOR = new C6371n();

    /* renamed from: a, reason: collision with root package name */
    String f60273a;

    /* renamed from: b, reason: collision with root package name */
    C6361d f60274b;

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    C6363f f60275c;

    C6360c() {
    }

    C6360c(String str, C6361d c6361d, C6363f c6363f) {
        this.f60273a = str;
        this.f60274b = c6361d;
        this.f60275c = c6363f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = C15708b.a(parcel);
        C15708b.w(parcel, 2, this.f60273a, false);
        C15708b.u(parcel, 3, this.f60274b, i10, false);
        C15708b.u(parcel, 5, this.f60275c, i10, false);
        C15708b.b(parcel, iA);
    }
}
