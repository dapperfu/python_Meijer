package Od;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.fullstory.FS;
import com.google.android.gms.common.internal.C6660q;
import com.google.android.gms.dynamic.b;
import md.AbstractC15707a;
import md.C15708b;

/* renamed from: Od.f, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C4458f extends AbstractC15707a {
    public static final Parcelable.Creator<C4458f> CREATOR = new U();

    /* renamed from: d, reason: collision with root package name */
    private static final String f23599d = "f";

    /* renamed from: a, reason: collision with root package name */
    private final int f23600a;

    /* renamed from: b, reason: collision with root package name */
    private final C4455c f23601b;

    /* renamed from: c, reason: collision with root package name */
    private final Float f23602c;

    protected C4458f(int i10) {
        this(i10, (C4455c) null, (Float) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4458f)) {
            return false;
        }
        C4458f c4458f = (C4458f) obj;
        return this.f23600a == c4458f.f23600a && C6660q.a(this.f23601b, c4458f.f23601b) && C6660q.a(this.f23602c, c4458f.f23602c);
    }

    C4458f(int i10, IBinder iBinder, Float f10) {
        this(i10, iBinder == null ? null : new C4455c(b.a.a2(iBinder)), f10);
    }

    final C4458f B() {
        int i10 = this.f23600a;
        if (i10 == 0) {
            return new C4457e();
        }
        if (i10 == 1) {
            return new C4475x();
        }
        if (i10 == 2) {
            return new C4474w();
        }
        if (i10 == 3) {
            C4455c c4455c = this.f23601b;
            com.google.android.gms.common.internal.r.q(c4455c != null, "bitmapDescriptor must not be null");
            Float f10 = this.f23602c;
            com.google.android.gms.common.internal.r.q(f10 != null, "bitmapRefWidth must not be null");
            return new C4461i(c4455c, f10.floatValue());
        }
        FS.log_w(f23599d, "Unknown Cap type: " + i10);
        return this;
    }

    public int hashCode() {
        return C6660q.b(Integer.valueOf(this.f23600a), this.f23601b, this.f23602c);
    }

    public String toString() {
        return "[Cap: type=" + this.f23600a + "]";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f23600a;
        int iA = C15708b.a(parcel);
        C15708b.n(parcel, 2, i11);
        C4455c c4455c = this.f23601b;
        C15708b.m(parcel, 3, c4455c == null ? null : c4455c.a().asBinder(), false);
        C15708b.l(parcel, 4, this.f23602c, false);
        C15708b.b(parcel, iA);
    }

    private C4458f(int i10, C4455c c4455c, Float f10) {
        boolean z10 = f10 != null && f10.floatValue() > 0.0f;
        if (i10 == 3) {
            z = c4455c != null && z10;
            i10 = 3;
        }
        com.google.android.gms.common.internal.r.b(z, String.format("Invalid Cap: type=%s bitmapDescriptor=%s bitmapRefWidth=%s", Integer.valueOf(i10), c4455c, f10));
        this.f23600a = i10;
        this.f23601b = c4455c;
        this.f23602c = f10;
    }

    protected C4458f(C4455c c4455c, float f10) {
        this(3, c4455c, Float.valueOf(f10));
    }
}
