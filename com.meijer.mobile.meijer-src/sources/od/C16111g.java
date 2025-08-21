package od;

import android.os.Parcel;
import android.os.Parcelable;
import md.AbstractC15707a;
import md.C15708b;

/* renamed from: od.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C16111g extends AbstractC15707a {
    public static final Parcelable.Creator<C16111g> CREATOR = new C16116l();

    /* renamed from: a, reason: collision with root package name */
    private final int f153852a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f153853b;

    public C16111g(int i10) {
        this(i10, false);
    }

    public C16111g(int i10, boolean z10) {
        this.f153852a = i10;
        this.f153853b = z10;
    }

    public int B() {
        return this.f153852a;
    }

    public final boolean T() {
        return this.f153853b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = C15708b.a(parcel);
        C15708b.n(parcel, 1, B());
        C15708b.c(parcel, 2, this.f153853b);
        C15708b.b(parcel, iA);
    }
}
