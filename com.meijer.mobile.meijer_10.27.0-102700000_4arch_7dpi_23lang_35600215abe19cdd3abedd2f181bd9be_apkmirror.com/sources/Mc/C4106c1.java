package Mc;

import android.os.Parcel;
import android.os.Parcelable;
import kd.AbstractC15136a;
import kd.C15137b;

/* renamed from: Mc.c1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4106c1 extends AbstractC15136a {
    public static final Parcelable.Creator<C4106c1> CREATOR = new C4109d1();

    /* renamed from: a, reason: collision with root package name */
    public final int f19211a;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f19211a;
        int iA = C15137b.a(parcel);
        C15137b.n(parcel, 2, i11);
        C15137b.b(parcel, iA);
    }

    public C4106c1(int i10) {
        this.f19211a = i10;
    }
}
