package gd;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C6660q;
import md.AbstractC15707a;
import md.C15708b;

/* renamed from: gd.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C14349d extends AbstractC15707a {
    public static final Parcelable.Creator<C14349d> CREATOR = new C14350e();

    /* renamed from: a, reason: collision with root package name */
    private final boolean f134163a;

    /* renamed from: b, reason: collision with root package name */
    private final long f134164b;

    /* renamed from: c, reason: collision with root package name */
    private final long f134165c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C14349d) {
            C14349d c14349d = (C14349d) obj;
            if (this.f134163a == c14349d.f134163a && this.f134164b == c14349d.f134164b && this.f134165c == c14349d.f134165c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C6660q.b(Boolean.valueOf(this.f134163a), Long.valueOf(this.f134164b), Long.valueOf(this.f134165c));
    }

    public final String toString() {
        return "CollectForDebugParcelable[skipPersistentStorage: " + this.f134163a + ",collectForDebugStartTimeMillis: " + this.f134164b + ",collectForDebugExpiryTimeMillis: " + this.f134165c + "]";
    }

    public C14349d(boolean z10, long j10, long j11) {
        this.f134163a = z10;
        this.f134164b = j10;
        this.f134165c = j11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C15708b.a(parcel);
        C15708b.c(parcel, 1, this.f134163a);
        C15708b.s(parcel, 2, this.f134165c);
        C15708b.s(parcel, 3, this.f134164b);
        C15708b.b(parcel, iA);
    }
}
