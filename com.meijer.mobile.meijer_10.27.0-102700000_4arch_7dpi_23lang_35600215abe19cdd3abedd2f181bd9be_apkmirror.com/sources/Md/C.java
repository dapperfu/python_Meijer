package Md;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Pair;
import kd.AbstractC15136a;
import kd.C15137b;

/* loaded from: classes6.dex */
public final class C extends AbstractC15136a {
    public static final Parcelable.Creator<C> CREATOR = new M();

    /* renamed from: a, reason: collision with root package name */
    private final float f19378a;

    /* renamed from: b, reason: collision with root package name */
    private final int f19379b;

    /* renamed from: c, reason: collision with root package name */
    private final int f19380c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f19381d;

    /* renamed from: e, reason: collision with root package name */
    private final C4198y f19382e;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private float f19383a;

        /* renamed from: b, reason: collision with root package name */
        private int f19384b;

        /* renamed from: c, reason: collision with root package name */
        private int f19385c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f19386d;

        /* renamed from: e, reason: collision with root package name */
        private C4198y f19387e;

        public C a() {
            return new C(this.f19383a, this.f19384b, this.f19385c, this.f19386d, this.f19387e);
        }

        public final a b(boolean z10) {
            this.f19386d = z10;
            return this;
        }

        public final a c(float f10) {
            this.f19383a = f10;
            return this;
        }

        public a(C c10) {
            this.f19383a = c10.c0();
            Pair pairQ0 = c10.q0();
            this.f19384b = ((Integer) pairQ0.first).intValue();
            this.f19385c = ((Integer) pairQ0.second).intValue();
            this.f19386d = c10.T();
            this.f19387e = c10.B();
        }
    }

    public C4198y B() {
        return this.f19382e;
    }

    public boolean T() {
        return this.f19381d;
    }

    public final float c0() {
        return this.f19378a;
    }

    public final Pair q0() {
        return new Pair(Integer.valueOf(this.f19379b), Integer.valueOf(this.f19380c));
    }

    C(float f10, int i10, int i11, boolean z10, C4198y c4198y) {
        this.f19378a = f10;
        this.f19379b = i10;
        this.f19380c = i11;
        this.f19381d = z10;
        this.f19382e = c4198y;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C15137b.a(parcel);
        C15137b.k(parcel, 2, this.f19378a);
        C15137b.n(parcel, 3, this.f19379b);
        C15137b.n(parcel, 4, this.f19380c);
        C15137b.c(parcel, 5, T());
        C15137b.u(parcel, 6, B(), i10, false);
        C15137b.b(parcel, iA);
    }
}
