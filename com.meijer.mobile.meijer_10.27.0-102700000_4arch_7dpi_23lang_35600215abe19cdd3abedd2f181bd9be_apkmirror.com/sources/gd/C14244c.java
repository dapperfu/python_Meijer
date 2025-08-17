package gd;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C6535q;
import kd.AbstractC15136a;
import kd.C15137b;

/* renamed from: gd.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C14244c extends AbstractC15136a {
    public static final Parcelable.Creator<C14244c> CREATOR = new n();

    /* renamed from: a, reason: collision with root package name */
    private final String f133310a;

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    private final int f133311b;

    /* renamed from: c, reason: collision with root package name */
    private final long f133312c;

    public C14244c(String str, int i10, long j10) {
        this.f133310a = str;
        this.f133311b = i10;
        this.f133312c = j10;
    }

    public C14244c(String str, long j10) {
        this.f133310a = str;
        this.f133312c = j10;
        this.f133311b = -1;
    }

    public long B() {
        long j10 = this.f133312c;
        return j10 == -1 ? this.f133311b : j10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C14244c) {
            C14244c c14244c = (C14244c) obj;
            if (((getName() != null && getName().equals(c14244c.getName())) || (getName() == null && c14244c.getName() == null)) && B() == c14244c.B()) {
                return true;
            }
        }
        return false;
    }

    public String getName() {
        return this.f133310a;
    }

    public final int hashCode() {
        return C6535q.b(getName(), Long.valueOf(B()));
    }

    public final String toString() {
        C6535q.a aVarC = C6535q.c(this);
        aVarC.a("name", getName());
        aVarC.a("version", Long.valueOf(B()));
        return aVarC.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C15137b.a(parcel);
        C15137b.w(parcel, 1, getName(), false);
        C15137b.n(parcel, 2, this.f133311b);
        C15137b.s(parcel, 3, B());
        C15137b.b(parcel, iA);
    }
}
