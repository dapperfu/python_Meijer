package Dd;

import android.os.Parcel;
import android.os.Parcelable;
import kd.AbstractC15136a;
import kd.C15137b;

/* renamed from: Dd.na, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3236na extends AbstractC15136a {
    public static final Parcelable.Creator<C3236na> CREATOR = new Ha();

    /* renamed from: a, reason: collision with root package name */
    private final int f6191a;

    /* renamed from: b, reason: collision with root package name */
    private final String f6192b;

    public C3236na(int i10, String str) {
        this.f6191a = i10;
        this.f6192b = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C15137b.a(parcel);
        C15137b.n(parcel, 1, this.f6191a);
        C15137b.w(parcel, 2, this.f6192b, false);
        C15137b.b(parcel, iA);
    }
}
