package Fd;

import android.os.Parcel;
import android.os.Parcelable;
import md.AbstractC15707a;
import md.C15708b;

/* renamed from: Fd.x7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3565x7 extends AbstractC15707a {
    public static final Parcelable.Creator<C3565x7> CREATOR = new C3363g();

    /* renamed from: a, reason: collision with root package name */
    public String f10366a;

    /* renamed from: b, reason: collision with root package name */
    public String f10367b;

    public C3565x7() {
    }

    public C3565x7(String str, String str2) {
        this.f10366a = str;
        this.f10367b = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C15708b.a(parcel);
        C15708b.w(parcel, 2, this.f10366a, false);
        C15708b.w(parcel, 3, this.f10367b, false);
        C15708b.b(parcel, iA);
    }
}
