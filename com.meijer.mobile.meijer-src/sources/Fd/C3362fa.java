package Fd;

import android.os.Parcel;
import android.os.Parcelable;
import md.AbstractC15707a;
import md.C15708b;

/* renamed from: Fd.fa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3362fa extends AbstractC15707a {
    public static final Parcelable.Creator<C3362fa> CREATOR = new C3350ea();

    /* renamed from: a, reason: collision with root package name */
    private final int f10089a;

    /* renamed from: b, reason: collision with root package name */
    private final String[] f10090b;

    public C3362fa(int i10, String[] strArr) {
        this.f10089a = i10;
        this.f10090b = strArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C15708b.a(parcel);
        C15708b.n(parcel, 1, this.f10089a);
        C15708b.x(parcel, 2, this.f10090b, false);
        C15708b.b(parcel, iA);
    }
}
