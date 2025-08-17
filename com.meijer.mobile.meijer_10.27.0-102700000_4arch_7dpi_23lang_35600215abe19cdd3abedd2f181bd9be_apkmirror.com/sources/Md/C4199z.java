package Md;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C6535q;
import kd.AbstractC15136a;
import kd.C15137b;

/* renamed from: Md.z, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C4199z extends AbstractC15136a {
    public static final Parcelable.Creator<C4199z> CREATOR = new k0();

    /* renamed from: a, reason: collision with root package name */
    public final String f19501a;

    /* renamed from: b, reason: collision with root package name */
    public final float f19502b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4199z)) {
            return false;
        }
        C4199z c4199z = (C4199z) obj;
        return this.f19501a.equals(c4199z.f19501a) && Float.floatToIntBits(this.f19502b) == Float.floatToIntBits(c4199z.f19502b);
    }

    public int hashCode() {
        return C6535q.b(this.f19501a, Float.valueOf(this.f19502b));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        String str = this.f19501a;
        int iA = C15137b.a(parcel);
        C15137b.w(parcel, 2, str, false);
        C15137b.k(parcel, 3, this.f19502b);
        C15137b.b(parcel, iA);
    }

    public C4199z(String str, float f10) {
        this.f19501a = str;
        this.f19502b = (((double) f10) <= 0.0d ? (f10 % 360.0f) + 360.0f : f10) % 360.0f;
    }

    public String toString() {
        return C6535q.c(this).a("panoId", this.f19501a).a("bearing", Float.valueOf(this.f19502b)).toString();
    }
}
