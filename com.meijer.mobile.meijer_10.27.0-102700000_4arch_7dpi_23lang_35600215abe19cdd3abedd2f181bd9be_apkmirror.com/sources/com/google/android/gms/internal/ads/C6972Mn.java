package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.google.android.gms.dynamic.b;
import java.util.Map;
import kd.AbstractC15136a;
import kd.C15137b;

/* renamed from: com.google.android.gms.internal.ads.Mn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6972Mn extends AbstractC15136a {
    public static final Parcelable.Creator<C6972Mn> CREATOR = new C7006Nn();

    /* renamed from: a, reason: collision with root package name */
    public final View f68710a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f68711b;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        View view = this.f68710a;
        int iA = C15137b.a(parcel);
        C15137b.m(parcel, 1, com.google.android.gms.dynamic.d.F2(view).asBinder(), false);
        C15137b.m(parcel, 2, com.google.android.gms.dynamic.d.F2(this.f68711b).asBinder(), false);
        C15137b.b(parcel, iA);
    }

    public C6972Mn(IBinder iBinder, IBinder iBinder2) {
        this.f68710a = (View) com.google.android.gms.dynamic.d.b2(b.a.a2(iBinder));
        this.f68711b = (Map) com.google.android.gms.dynamic.d.b2(b.a.a2(iBinder2));
    }
}
