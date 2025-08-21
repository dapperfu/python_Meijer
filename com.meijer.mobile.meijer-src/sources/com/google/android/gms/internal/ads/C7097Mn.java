package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.google.android.gms.dynamic.b;
import java.util.Map;
import md.AbstractC15707a;
import md.C15708b;

/* renamed from: com.google.android.gms.internal.ads.Mn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7097Mn extends AbstractC15707a {
    public static final Parcelable.Creator<C7097Mn> CREATOR = new C7131Nn();

    /* renamed from: a, reason: collision with root package name */
    public final View f69550a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f69551b;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        View view = this.f69550a;
        int iA = C15708b.a(parcel);
        C15708b.m(parcel, 1, com.google.android.gms.dynamic.d.I2(view).asBinder(), false);
        C15708b.m(parcel, 2, com.google.android.gms.dynamic.d.I2(this.f69551b).asBinder(), false);
        C15708b.b(parcel, iA);
    }

    public C7097Mn(IBinder iBinder, IBinder iBinder2) {
        this.f69550a = (View) com.google.android.gms.dynamic.d.c2(b.a.a2(iBinder));
        this.f69551b = (Map) com.google.android.gms.dynamic.d.c2(b.a.a2(iBinder2));
    }
}
