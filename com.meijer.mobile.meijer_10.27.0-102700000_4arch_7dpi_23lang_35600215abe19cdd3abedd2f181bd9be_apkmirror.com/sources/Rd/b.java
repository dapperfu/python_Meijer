package Rd;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import kd.AbstractC15136a;
import kd.C15137b;

/* loaded from: classes6.dex */
public final class b extends AbstractC15136a implements com.google.android.gms.common.api.k {
    public static final Parcelable.Creator<b> CREATOR = new c();

    /* renamed from: a, reason: collision with root package name */
    final int f32122a;

    /* renamed from: b, reason: collision with root package name */
    private int f32123b;

    /* renamed from: c, reason: collision with root package name */
    private Intent f32124c;

    public b() {
        this(2, 0, null);
    }

    b(int i10, int i11, Intent intent) {
        this.f32122a = i10;
        this.f32123b = i11;
        this.f32124c = intent;
    }

    @Override // com.google.android.gms.common.api.k
    public final Status a() {
        return this.f32123b == 0 ? Status.f64735f : Status.f64739j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f32122a;
        int iA = C15137b.a(parcel);
        C15137b.n(parcel, 1, i11);
        C15137b.n(parcel, 2, this.f32123b);
        C15137b.u(parcel, 3, this.f32124c, i10, false);
        C15137b.b(parcel, iA);
    }
}
