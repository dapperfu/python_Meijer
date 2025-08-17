package md;

import android.os.Parcel;
import android.os.Parcelable;
import kd.AbstractC15136a;
import kd.C15137b;

/* renamed from: md.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C15601g extends AbstractC15136a {
    public static final Parcelable.Creator<C15601g> CREATOR = new C15606l();

    /* renamed from: a, reason: collision with root package name */
    private final int f150065a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f150066b;

    public C15601g(int i10) {
        this(i10, false);
    }

    public C15601g(int i10, boolean z10) {
        this.f150065a = i10;
        this.f150066b = z10;
    }

    public int B() {
        return this.f150065a;
    }

    public final boolean T() {
        return this.f150066b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = C15137b.a(parcel);
        C15137b.n(parcel, 1, B());
        C15137b.c(parcel, 2, this.f150066b);
        C15137b.b(parcel, iA);
    }
}
