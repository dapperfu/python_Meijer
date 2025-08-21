package be;

import android.os.Parcel;
import android.os.Parcelable;
import md.AbstractC15707a;
import md.C15708b;

/* renamed from: be.g, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6364g extends AbstractC15707a {
    public static final Parcelable.Creator<C6364g> CREATOR = new C6374q();

    /* renamed from: a, reason: collision with root package name */
    String f60286a;

    /* renamed from: b, reason: collision with root package name */
    String f60287b;

    C6364g() {
    }

    public C6364g(String str, String str2) {
        this.f60286a = str;
        this.f60287b = str2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = C15708b.a(parcel);
        C15708b.w(parcel, 2, this.f60286a, false);
        C15708b.w(parcel, 3, this.f60287b, false);
        C15708b.b(parcel, iA);
    }
}
