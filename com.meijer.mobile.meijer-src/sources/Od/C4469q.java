package Od;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamic.b;
import java.util.Objects;
import md.AbstractC15707a;
import md.C15708b;

/* renamed from: Od.q, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C4469q extends AbstractC15707a {
    public static final Parcelable.Creator<C4469q> CREATOR = new e0();

    /* renamed from: a, reason: collision with root package name */
    private final int f23652a;

    /* renamed from: b, reason: collision with root package name */
    private final int f23653b;

    /* renamed from: c, reason: collision with root package name */
    private final a f23654c;

    /* renamed from: Od.q$a */
    public static class a extends AbstractC15707a {
        public static final Parcelable.Creator<a> CREATOR = new W();

        /* renamed from: a, reason: collision with root package name */
        private String f23655a;

        /* renamed from: b, reason: collision with root package name */
        private C4455c f23656b;

        /* renamed from: c, reason: collision with root package name */
        private int f23657c;

        /* renamed from: d, reason: collision with root package name */
        private int f23658d;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f23657c != aVar.f23657c || !Objects.equals(this.f23655a, aVar.f23655a) || this.f23658d != aVar.f23658d) {
                return false;
            }
            C4455c c4455c = this.f23656b;
            if ((c4455c == null && aVar.f23656b != null) || (c4455c != null && aVar.f23656b == null)) {
                return false;
            }
            C4455c c4455c2 = aVar.f23656b;
            if (c4455c == null || c4455c2 == null) {
                return true;
            }
            return Objects.equals(com.google.android.gms.dynamic.d.c2(c4455c.a()), com.google.android.gms.dynamic.d.c2(c4455c2.a()));
        }

        public int B() {
            return this.f23657c;
        }

        public String T() {
            return this.f23655a;
        }

        public int b0() {
            return this.f23658d;
        }

        public int hashCode() {
            return Objects.hash(this.f23655a, this.f23656b, Integer.valueOf(this.f23657c));
        }

        a(String str, IBinder iBinder, int i10, int i11) {
            C4455c c4455c;
            this.f23657c = -5041134;
            this.f23658d = -16777216;
            this.f23655a = str;
            if (iBinder == null) {
                c4455c = null;
            } else {
                c4455c = new C4455c(b.a.a2(iBinder));
            }
            this.f23656b = c4455c;
            this.f23657c = i10;
            this.f23658d = i11;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            IBinder iBinderAsBinder;
            int iA = C15708b.a(parcel);
            C15708b.w(parcel, 2, T(), false);
            C4455c c4455c = this.f23656b;
            if (c4455c == null) {
                iBinderAsBinder = null;
            } else {
                iBinderAsBinder = c4455c.a().asBinder();
            }
            C15708b.m(parcel, 3, iBinderAsBinder, false);
            C15708b.n(parcel, 4, B());
            C15708b.n(parcel, 5, b0());
            C15708b.b(parcel, iA);
        }
    }

    public int B() {
        return this.f23652a;
    }

    public int T() {
        return this.f23653b;
    }

    public a b0() {
        return this.f23654c;
    }

    C4469q(int i10, int i11, a aVar) {
        this.f23652a = i10;
        this.f23653b = i11;
        this.f23654c = aVar;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = C15708b.a(parcel);
        C15708b.n(parcel, 2, B());
        C15708b.n(parcel, 3, T());
        C15708b.u(parcel, 4, b0(), i10, false);
        C15708b.b(parcel, iA);
    }
}
