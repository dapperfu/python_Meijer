package Dd;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C6535q;
import kd.AbstractC15136a;
import kd.C15137b;

/* renamed from: Dd.i, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3165i extends AbstractC15136a {
    public static final Parcelable.Creator<C3165i> CREATOR = new C3177j();

    /* renamed from: a, reason: collision with root package name */
    public int f6085a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f6086b;

    public C3165i() {
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3165i)) {
            return false;
        }
        C3165i c3165i = (C3165i) obj;
        return this.f6085a == c3165i.f6085a && C6535q.a(Boolean.valueOf(this.f6086b), Boolean.valueOf(c3165i.f6086b));
    }

    public C3165i(int i10, boolean z10) {
        this.f6085a = i10;
        this.f6086b = z10;
    }

    public final int hashCode() {
        return C6535q.b(Integer.valueOf(this.f6085a), Boolean.valueOf(this.f6086b));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C15137b.a(parcel);
        C15137b.n(parcel, 2, this.f6085a);
        C15137b.c(parcel, 3, this.f6086b);
        C15137b.b(parcel, iA);
    }
}
