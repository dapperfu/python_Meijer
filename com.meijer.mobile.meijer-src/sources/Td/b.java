package Td;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import md.AbstractC15707a;
import md.C15708b;

/* loaded from: classes6.dex */
public final class b extends AbstractC15707a implements com.google.android.gms.common.api.k {
    public static final Parcelable.Creator<b> CREATOR = new c();

    /* renamed from: a, reason: collision with root package name */
    final int f36122a;

    /* renamed from: b, reason: collision with root package name */
    private int f36123b;

    /* renamed from: c, reason: collision with root package name */
    private Intent f36124c;

    public b() {
        this(2, 0, null);
    }

    b(int i10, int i11, Intent intent) {
        this.f36122a = i10;
        this.f36123b = i11;
        this.f36124c = intent;
    }

    @Override // com.google.android.gms.common.api.k
    public final Status a() {
        return this.f36123b == 0 ? Status.f65575f : Status.f65579j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f36122a;
        int iA = C15708b.a(parcel);
        C15708b.n(parcel, 1, i11);
        C15708b.n(parcel, 2, this.f36123b);
        C15708b.u(parcel, 3, this.f36124c, i10, false);
        C15708b.b(parcel, iA);
    }
}
