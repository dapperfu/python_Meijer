package od;

import android.os.Parcel;
import android.os.Parcelable;
import md.AbstractC15707a;
import md.C15708b;

/* renamed from: od.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C16106b extends AbstractC15707a {
    public static final Parcelable.Creator<C16106b> CREATOR = new C16113i();

    /* renamed from: a, reason: collision with root package name */
    private final boolean f153843a;

    /* renamed from: b, reason: collision with root package name */
    private final int f153844b;

    public boolean B() {
        return this.f153843a;
    }

    public int T() {
        return this.f153844b;
    }

    public C16106b(boolean z10, int i10) {
        this.f153843a = z10;
        this.f153844b = i10;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = C15708b.a(parcel);
        C15708b.c(parcel, 1, B());
        C15708b.n(parcel, 2, T());
        C15708b.b(parcel, iA);
    }
}
