package Md;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamic.b;
import java.util.Objects;
import kd.AbstractC15136a;
import kd.C15137b;

/* renamed from: Md.q, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C4191q extends AbstractC15136a {
    public static final Parcelable.Creator<C4191q> CREATOR = new e0();

    /* renamed from: a, reason: collision with root package name */
    private final int f19465a;

    /* renamed from: b, reason: collision with root package name */
    private final int f19466b;

    /* renamed from: c, reason: collision with root package name */
    private final a f19467c;

    /* renamed from: Md.q$a */
    public static class a extends AbstractC15136a {
        public static final Parcelable.Creator<a> CREATOR = new W();

        /* renamed from: a, reason: collision with root package name */
        private String f19468a;

        /* renamed from: b, reason: collision with root package name */
        private C4177c f19469b;

        /* renamed from: c, reason: collision with root package name */
        private int f19470c;

        /* renamed from: d, reason: collision with root package name */
        private int f19471d;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f19470c != aVar.f19470c || !Objects.equals(this.f19468a, aVar.f19468a) || this.f19471d != aVar.f19471d) {
                return false;
            }
            C4177c c4177c = this.f19469b;
            if ((c4177c == null && aVar.f19469b != null) || (c4177c != null && aVar.f19469b == null)) {
                return false;
            }
            C4177c c4177c2 = aVar.f19469b;
            if (c4177c == null || c4177c2 == null) {
                return true;
            }
            return Objects.equals(com.google.android.gms.dynamic.d.b2(c4177c.a()), com.google.android.gms.dynamic.d.b2(c4177c2.a()));
        }

        public int B() {
            return this.f19470c;
        }

        public String T() {
            return this.f19468a;
        }

        public int c0() {
            return this.f19471d;
        }

        public int hashCode() {
            return Objects.hash(this.f19468a, this.f19469b, Integer.valueOf(this.f19470c));
        }

        a(String str, IBinder iBinder, int i10, int i11) {
            C4177c c4177c;
            this.f19470c = -5041134;
            this.f19471d = -16777216;
            this.f19468a = str;
            if (iBinder == null) {
                c4177c = null;
            } else {
                c4177c = new C4177c(b.a.a2(iBinder));
            }
            this.f19469b = c4177c;
            this.f19470c = i10;
            this.f19471d = i11;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            IBinder iBinderAsBinder;
            int iA = C15137b.a(parcel);
            C15137b.w(parcel, 2, T(), false);
            C4177c c4177c = this.f19469b;
            if (c4177c == null) {
                iBinderAsBinder = null;
            } else {
                iBinderAsBinder = c4177c.a().asBinder();
            }
            C15137b.m(parcel, 3, iBinderAsBinder, false);
            C15137b.n(parcel, 4, B());
            C15137b.n(parcel, 5, c0());
            C15137b.b(parcel, iA);
        }
    }

    public int B() {
        return this.f19465a;
    }

    public int T() {
        return this.f19466b;
    }

    public a c0() {
        return this.f19467c;
    }

    C4191q(int i10, int i11, a aVar) {
        this.f19465a = i10;
        this.f19466b = i11;
        this.f19467c = aVar;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = C15137b.a(parcel);
        C15137b.n(parcel, 2, B());
        C15137b.n(parcel, 3, T());
        C15137b.u(parcel, 4, c0(), i10, false);
        C15137b.b(parcel, iA);
    }
}
