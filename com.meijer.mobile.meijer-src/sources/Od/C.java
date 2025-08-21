package Od;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Pair;
import md.AbstractC15707a;
import md.C15708b;

/* loaded from: classes6.dex */
public final class C extends AbstractC15707a {
    public static final Parcelable.Creator<C> CREATOR = new M();

    /* renamed from: a, reason: collision with root package name */
    private final float f23565a;

    /* renamed from: b, reason: collision with root package name */
    private final int f23566b;

    /* renamed from: c, reason: collision with root package name */
    private final int f23567c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f23568d;

    /* renamed from: e, reason: collision with root package name */
    private final C4476y f23569e;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private float f23570a;

        /* renamed from: b, reason: collision with root package name */
        private int f23571b;

        /* renamed from: c, reason: collision with root package name */
        private int f23572c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f23573d;

        /* renamed from: e, reason: collision with root package name */
        private C4476y f23574e;

        public C a() {
            return new C(this.f23570a, this.f23571b, this.f23572c, this.f23573d, this.f23574e);
        }

        public final a b(boolean z10) {
            this.f23573d = z10;
            return this;
        }

        public final a c(float f10) {
            this.f23570a = f10;
            return this;
        }

        public a(C c10) {
            this.f23570a = c10.b0();
            Pair pairR0 = c10.r0();
            this.f23571b = ((Integer) pairR0.first).intValue();
            this.f23572c = ((Integer) pairR0.second).intValue();
            this.f23573d = c10.T();
            this.f23574e = c10.B();
        }
    }

    public C4476y B() {
        return this.f23569e;
    }

    public boolean T() {
        return this.f23568d;
    }

    public final float b0() {
        return this.f23565a;
    }

    public final Pair r0() {
        return new Pair(Integer.valueOf(this.f23566b), Integer.valueOf(this.f23567c));
    }

    C(float f10, int i10, int i11, boolean z10, C4476y c4476y) {
        this.f23565a = f10;
        this.f23566b = i10;
        this.f23567c = i11;
        this.f23568d = z10;
        this.f23569e = c4476y;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C15708b.a(parcel);
        C15708b.k(parcel, 2, this.f23565a);
        C15708b.n(parcel, 3, this.f23566b);
        C15708b.n(parcel, 4, this.f23567c);
        C15708b.c(parcel, 5, T());
        C15708b.u(parcel, 6, B(), i10, false);
        C15708b.b(parcel, iA);
    }
}
