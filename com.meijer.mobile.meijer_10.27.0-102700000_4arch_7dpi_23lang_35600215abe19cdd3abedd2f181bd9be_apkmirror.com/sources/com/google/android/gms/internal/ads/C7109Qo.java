package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import kd.AbstractC15136a;
import kd.C15137b;

/* renamed from: com.google.android.gms.internal.ads.Qo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7109Qo extends AbstractC15136a {
    public static final Parcelable.Creator<C7109Qo> CREATOR = new C7143Ro();

    /* renamed from: a, reason: collision with root package name */
    public final Mc.Y1 f69648a;

    /* renamed from: b, reason: collision with root package name */
    public final String f69649b;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        Mc.Y1 y12 = this.f69648a;
        int iA = C15137b.a(parcel);
        C15137b.u(parcel, 2, y12, i10, false);
        C15137b.w(parcel, 3, this.f69649b, false);
        C15137b.b(parcel, iA);
    }

    public C7109Qo(Mc.Y1 y12, String str) {
        this.f69648a = y12;
        this.f69649b = str;
    }
}
