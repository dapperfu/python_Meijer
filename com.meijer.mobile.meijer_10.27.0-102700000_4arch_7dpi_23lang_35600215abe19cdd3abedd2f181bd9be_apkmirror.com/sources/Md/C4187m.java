package Md;

import android.os.Parcel;
import android.os.Parcelable;
import kd.AbstractC15136a;
import kd.C15137b;

/* renamed from: Md.m, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4187m extends AbstractC15136a {
    public static final Parcelable.Creator<C4187m> CREATOR = new b0();

    /* renamed from: a, reason: collision with root package name */
    private final String f19442a;

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        String str = this.f19442a;
        int iA = C15137b.a(parcel);
        C15137b.w(parcel, 2, str, false);
        C15137b.b(parcel, iA);
    }

    public C4187m(String str) {
        com.google.android.gms.common.internal.r.m(str, "json must not be null");
        this.f19442a = str;
    }
}
