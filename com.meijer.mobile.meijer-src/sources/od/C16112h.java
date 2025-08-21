package od;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.r;
import md.AbstractC15707a;
import md.C15708b;

/* renamed from: od.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C16112h extends AbstractC15707a {
    public static final Parcelable.Creator<C16112h> CREATOR = new C16117m();

    /* renamed from: a, reason: collision with root package name */
    private final int f153854a;

    /* renamed from: b, reason: collision with root package name */
    private final int f153855b;

    /* renamed from: c, reason: collision with root package name */
    private final Long f153856c;

    /* renamed from: d, reason: collision with root package name */
    private final Long f153857d;

    /* renamed from: e, reason: collision with root package name */
    private final int f153858e;

    /* renamed from: f, reason: collision with root package name */
    private final a f153859f;

    /* renamed from: od.h$a */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final long f153860a;

        /* renamed from: b, reason: collision with root package name */
        private final long f153861b;

        a(long j10, long j11) {
            r.o(j11);
            this.f153860a = j10;
            this.f153861b = j11;
        }
    }

    public int B() {
        return this.f153858e;
    }

    public int T() {
        return this.f153855b;
    }

    public int b0() {
        return this.f153854a;
    }

    public C16112h(int i10, int i11, Long l10, Long l11, int i12) {
        a aVar;
        this.f153854a = i10;
        this.f153855b = i11;
        this.f153856c = l10;
        this.f153857d = l11;
        this.f153858e = i12;
        if (l10 != null && l11 != null && l11.longValue() != 0) {
            aVar = new a(l10.longValue(), l11.longValue());
        } else {
            aVar = null;
        }
        this.f153859f = aVar;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = C15708b.a(parcel);
        C15708b.n(parcel, 1, b0());
        C15708b.n(parcel, 2, T());
        C15708b.t(parcel, 3, this.f153856c, false);
        C15708b.t(parcel, 4, this.f153857d, false);
        C15708b.n(parcel, 5, B());
        C15708b.b(parcel, iA);
    }
}
