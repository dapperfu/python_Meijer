package Qd;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import md.AbstractC15707a;
import md.C15708b;

/* renamed from: Qd.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4669a extends AbstractC15707a {
    public static final Parcelable.Creator<C4669a> CREATOR = new C4670b();

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f28057a;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        Bundle bundle = this.f28057a;
        int iA = C15708b.a(parcel);
        C15708b.e(parcel, 1, bundle, false);
        C15708b.b(parcel, iA);
    }

    public C4669a(Bundle bundle) {
        this.f28057a = bundle;
    }
}
