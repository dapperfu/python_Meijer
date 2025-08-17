package ed;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C6535q;
import com.google.android.gms.internal.clearcut.i2;
import com.google.android.gms.internal.clearcut.t2;
import ed.C13642a;
import java.util.Arrays;
import kd.AbstractC15136a;
import kd.C15137b;

/* renamed from: ed.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C13647f extends AbstractC15136a {
    public static final Parcelable.Creator<C13647f> CREATOR = new C13648g();

    /* renamed from: a, reason: collision with root package name */
    public t2 f128698a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f128699b;

    /* renamed from: c, reason: collision with root package name */
    private int[] f128700c;

    /* renamed from: d, reason: collision with root package name */
    private String[] f128701d;

    /* renamed from: e, reason: collision with root package name */
    private int[] f128702e;

    /* renamed from: f, reason: collision with root package name */
    private byte[][] f128703f;

    /* renamed from: g, reason: collision with root package name */
    private Pd.a[] f128704g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f128705h;

    /* renamed from: i, reason: collision with root package name */
    public final i2 f128706i;

    public C13647f(t2 t2Var, i2 i2Var, C13642a.c cVar, C13642a.c cVar2, int[] iArr, String[] strArr, int[] iArr2, byte[][] bArr, Pd.a[] aVarArr, boolean z10) {
        this.f128698a = t2Var;
        this.f128706i = i2Var;
        this.f128700c = iArr;
        this.f128701d = null;
        this.f128702e = iArr2;
        this.f128703f = null;
        this.f128704g = null;
        this.f128705h = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C13647f) {
            C13647f c13647f = (C13647f) obj;
            if (C6535q.a(this.f128698a, c13647f.f128698a) && Arrays.equals(this.f128699b, c13647f.f128699b) && Arrays.equals(this.f128700c, c13647f.f128700c) && Arrays.equals(this.f128701d, c13647f.f128701d) && C6535q.a(this.f128706i, c13647f.f128706i) && C6535q.a(null, null) && C6535q.a(null, null) && Arrays.equals(this.f128702e, c13647f.f128702e) && Arrays.deepEquals(this.f128703f, c13647f.f128703f) && Arrays.equals(this.f128704g, c13647f.f128704g) && this.f128705h == c13647f.f128705h) {
                return true;
            }
        }
        return false;
    }

    C13647f(t2 t2Var, byte[] bArr, int[] iArr, String[] strArr, int[] iArr2, byte[][] bArr2, boolean z10, Pd.a[] aVarArr) {
        this.f128698a = t2Var;
        this.f128699b = bArr;
        this.f128700c = iArr;
        this.f128701d = strArr;
        this.f128706i = null;
        this.f128702e = iArr2;
        this.f128703f = bArr2;
        this.f128704g = aVarArr;
        this.f128705h = z10;
    }

    public final int hashCode() {
        return C6535q.b(this.f128698a, this.f128699b, this.f128700c, this.f128701d, this.f128706i, null, null, this.f128702e, this.f128703f, this.f128704g, Boolean.valueOf(this.f128705h));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LogEventParcelable[");
        sb2.append(this.f128698a);
        sb2.append(", LogEventBytes: ");
        byte[] bArr = this.f128699b;
        sb2.append(bArr == null ? null : new String(bArr));
        sb2.append(", TestCodes: ");
        sb2.append(Arrays.toString(this.f128700c));
        sb2.append(", MendelPackages: ");
        sb2.append(Arrays.toString(this.f128701d));
        sb2.append(", LogEvent: ");
        sb2.append(this.f128706i);
        sb2.append(", ExtensionProducer: ");
        sb2.append((Object) null);
        sb2.append(", VeProducer: ");
        sb2.append((Object) null);
        sb2.append(", ExperimentIDs: ");
        sb2.append(Arrays.toString(this.f128702e));
        sb2.append(", ExperimentTokens: ");
        sb2.append(Arrays.toString(this.f128703f));
        sb2.append(", ExperimentTokensParcelables: ");
        sb2.append(Arrays.toString(this.f128704g));
        sb2.append(", AddPhenotypeExperimentTokens: ");
        sb2.append(this.f128705h);
        sb2.append("]");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C15137b.a(parcel);
        C15137b.u(parcel, 2, this.f128698a, i10, false);
        C15137b.g(parcel, 3, this.f128699b, false);
        C15137b.o(parcel, 4, this.f128700c, false);
        C15137b.x(parcel, 5, this.f128701d, false);
        C15137b.o(parcel, 6, this.f128702e, false);
        C15137b.h(parcel, 7, this.f128703f, false);
        C15137b.c(parcel, 8, this.f128705h);
        C15137b.z(parcel, 9, this.f128704g, i10, false);
        C15137b.b(parcel, iA);
    }
}
