package Dd;

import android.os.Parcel;
import android.os.Parcelable;
import kd.AbstractC15136a;
import kd.C15137b;

/* renamed from: Dd.x7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3343x7 extends AbstractC15136a {
    public static final Parcelable.Creator<C3343x7> CREATOR = new C3141g();

    /* renamed from: a, reason: collision with root package name */
    public String f6333a;

    /* renamed from: b, reason: collision with root package name */
    public String f6334b;

    public C3343x7() {
    }

    public C3343x7(String str, String str2) {
        this.f6333a = str;
        this.f6334b = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C15137b.a(parcel);
        C15137b.w(parcel, 2, this.f6333a, false);
        C15137b.w(parcel, 3, this.f6334b, false);
        C15137b.b(parcel, iA);
    }
}
