package Md;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.fullstory.FS;
import com.google.android.gms.common.internal.C6535q;
import com.google.android.gms.dynamic.b;
import kd.AbstractC15136a;
import kd.C15137b;

/* renamed from: Md.f, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C4180f extends AbstractC15136a {
    public static final Parcelable.Creator<C4180f> CREATOR = new U();

    /* renamed from: d, reason: collision with root package name */
    private static final String f19412d = "f";

    /* renamed from: a, reason: collision with root package name */
    private final int f19413a;

    /* renamed from: b, reason: collision with root package name */
    private final C4177c f19414b;

    /* renamed from: c, reason: collision with root package name */
    private final Float f19415c;

    protected C4180f(int i10) {
        this(i10, (C4177c) null, (Float) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4180f)) {
            return false;
        }
        C4180f c4180f = (C4180f) obj;
        return this.f19413a == c4180f.f19413a && C6535q.a(this.f19414b, c4180f.f19414b) && C6535q.a(this.f19415c, c4180f.f19415c);
    }

    C4180f(int i10, IBinder iBinder, Float f10) {
        this(i10, iBinder == null ? null : new C4177c(b.a.a2(iBinder)), f10);
    }

    final C4180f B() {
        int i10 = this.f19413a;
        if (i10 == 0) {
            return new C4179e();
        }
        if (i10 == 1) {
            return new C4197x();
        }
        if (i10 == 2) {
            return new C4196w();
        }
        if (i10 == 3) {
            C4177c c4177c = this.f19414b;
            com.google.android.gms.common.internal.r.q(c4177c != null, "bitmapDescriptor must not be null");
            Float f10 = this.f19415c;
            com.google.android.gms.common.internal.r.q(f10 != null, "bitmapRefWidth must not be null");
            return new C4183i(c4177c, f10.floatValue());
        }
        FS.log_w(f19412d, "Unknown Cap type: " + i10);
        return this;
    }

    public int hashCode() {
        return C6535q.b(Integer.valueOf(this.f19413a), this.f19414b, this.f19415c);
    }

    public String toString() {
        return "[Cap: type=" + this.f19413a + "]";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f19413a;
        int iA = C15137b.a(parcel);
        C15137b.n(parcel, 2, i11);
        C4177c c4177c = this.f19414b;
        C15137b.m(parcel, 3, c4177c == null ? null : c4177c.a().asBinder(), false);
        C15137b.l(parcel, 4, this.f19415c, false);
        C15137b.b(parcel, iA);
    }

    private C4180f(int i10, C4177c c4177c, Float f10) {
        boolean z10 = f10 != null && f10.floatValue() > 0.0f;
        if (i10 == 3) {
            z = c4177c != null && z10;
            i10 = 3;
        }
        com.google.android.gms.common.internal.r.b(z, String.format("Invalid Cap: type=%s bitmapDescriptor=%s bitmapRefWidth=%s", Integer.valueOf(i10), c4177c, f10));
        this.f19413a = i10;
        this.f19414b = c4177c;
        this.f19415c = f10;
    }

    protected C4180f(C4177c c4177c, float f10) {
        this(3, c4177c, Float.valueOf(f10));
    }
}
