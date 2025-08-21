package Fd;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C6660q;
import md.AbstractC15707a;
import md.C15708b;

/* renamed from: Fd.i, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3387i extends AbstractC15707a {
    public static final Parcelable.Creator<C3387i> CREATOR = new C3399j();

    /* renamed from: a, reason: collision with root package name */
    public int f10118a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f10119b;

    public C3387i() {
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3387i)) {
            return false;
        }
        C3387i c3387i = (C3387i) obj;
        return this.f10118a == c3387i.f10118a && C6660q.a(Boolean.valueOf(this.f10119b), Boolean.valueOf(c3387i.f10119b));
    }

    public C3387i(int i10, boolean z10) {
        this.f10118a = i10;
        this.f10119b = z10;
    }

    public final int hashCode() {
        return C6660q.b(Integer.valueOf(this.f10118a), Boolean.valueOf(this.f10119b));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C15708b.a(parcel);
        C15708b.n(parcel, 2, this.f10118a);
        C15708b.c(parcel, 3, this.f10119b);
        C15708b.b(parcel, iA);
    }
}
