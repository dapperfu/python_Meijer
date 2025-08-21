package id;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C6660q;
import md.AbstractC15707a;
import md.C15708b;

/* renamed from: id.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C14720c extends AbstractC15707a {
    public static final Parcelable.Creator<C14720c> CREATOR = new n();

    /* renamed from: a, reason: collision with root package name */
    private final String f137526a;

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    private final int f137527b;

    /* renamed from: c, reason: collision with root package name */
    private final long f137528c;

    public C14720c(String str, int i10, long j10) {
        this.f137526a = str;
        this.f137527b = i10;
        this.f137528c = j10;
    }

    public C14720c(String str, long j10) {
        this.f137526a = str;
        this.f137528c = j10;
        this.f137527b = -1;
    }

    public long B() {
        long j10 = this.f137528c;
        return j10 == -1 ? this.f137527b : j10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C14720c) {
            C14720c c14720c = (C14720c) obj;
            if (((getName() != null && getName().equals(c14720c.getName())) || (getName() == null && c14720c.getName() == null)) && B() == c14720c.B()) {
                return true;
            }
        }
        return false;
    }

    public String getName() {
        return this.f137526a;
    }

    public final int hashCode() {
        return C6660q.b(getName(), Long.valueOf(B()));
    }

    public final String toString() {
        C6660q.a aVarC = C6660q.c(this);
        aVarC.a("name", getName());
        aVarC.a("version", Long.valueOf(B()));
        return aVarC.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C15708b.a(parcel);
        C15708b.w(parcel, 1, getName(), false);
        C15708b.n(parcel, 2, this.f137527b);
        C15708b.s(parcel, 3, B());
        C15708b.b(parcel, iA);
    }
}
