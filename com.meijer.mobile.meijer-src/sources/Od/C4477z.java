package Od;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C6660q;
import md.AbstractC15707a;
import md.C15708b;

/* renamed from: Od.z, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C4477z extends AbstractC15707a {
    public static final Parcelable.Creator<C4477z> CREATOR = new k0();

    /* renamed from: a, reason: collision with root package name */
    public final String f23688a;

    /* renamed from: b, reason: collision with root package name */
    public final float f23689b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4477z)) {
            return false;
        }
        C4477z c4477z = (C4477z) obj;
        return this.f23688a.equals(c4477z.f23688a) && Float.floatToIntBits(this.f23689b) == Float.floatToIntBits(c4477z.f23689b);
    }

    public int hashCode() {
        return C6660q.b(this.f23688a, Float.valueOf(this.f23689b));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        String str = this.f23688a;
        int iA = C15708b.a(parcel);
        C15708b.w(parcel, 2, str, false);
        C15708b.k(parcel, 3, this.f23689b);
        C15708b.b(parcel, iA);
    }

    public C4477z(String str, float f10) {
        this.f23688a = str;
        this.f23689b = (((double) f10) <= 0.0d ? (f10 % 360.0f) + 360.0f : f10) % 360.0f;
    }

    public String toString() {
        return C6660q.c(this).a("panoId", this.f23688a).a("bearing", Float.valueOf(this.f23689b)).toString();
    }
}
