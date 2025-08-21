package gd;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C6660q;
import com.google.android.gms.internal.clearcut.i2;
import com.google.android.gms.internal.clearcut.t2;
import gd.C14346a;
import java.util.Arrays;
import md.AbstractC15707a;
import md.C15708b;

/* renamed from: gd.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C14351f extends AbstractC15707a {
    public static final Parcelable.Creator<C14351f> CREATOR = new C14352g();

    /* renamed from: a, reason: collision with root package name */
    public t2 f134166a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f134167b;

    /* renamed from: c, reason: collision with root package name */
    private int[] f134168c;

    /* renamed from: d, reason: collision with root package name */
    private String[] f134169d;

    /* renamed from: e, reason: collision with root package name */
    private int[] f134170e;

    /* renamed from: f, reason: collision with root package name */
    private byte[][] f134171f;

    /* renamed from: g, reason: collision with root package name */
    private Rd.a[] f134172g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f134173h;

    /* renamed from: i, reason: collision with root package name */
    public final i2 f134174i;

    public C14351f(t2 t2Var, i2 i2Var, C14346a.c cVar, C14346a.c cVar2, int[] iArr, String[] strArr, int[] iArr2, byte[][] bArr, Rd.a[] aVarArr, boolean z10) {
        this.f134166a = t2Var;
        this.f134174i = i2Var;
        this.f134168c = iArr;
        this.f134169d = null;
        this.f134170e = iArr2;
        this.f134171f = null;
        this.f134172g = null;
        this.f134173h = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C14351f) {
            C14351f c14351f = (C14351f) obj;
            if (C6660q.a(this.f134166a, c14351f.f134166a) && Arrays.equals(this.f134167b, c14351f.f134167b) && Arrays.equals(this.f134168c, c14351f.f134168c) && Arrays.equals(this.f134169d, c14351f.f134169d) && C6660q.a(this.f134174i, c14351f.f134174i) && C6660q.a(null, null) && C6660q.a(null, null) && Arrays.equals(this.f134170e, c14351f.f134170e) && Arrays.deepEquals(this.f134171f, c14351f.f134171f) && Arrays.equals(this.f134172g, c14351f.f134172g) && this.f134173h == c14351f.f134173h) {
                return true;
            }
        }
        return false;
    }

    C14351f(t2 t2Var, byte[] bArr, int[] iArr, String[] strArr, int[] iArr2, byte[][] bArr2, boolean z10, Rd.a[] aVarArr) {
        this.f134166a = t2Var;
        this.f134167b = bArr;
        this.f134168c = iArr;
        this.f134169d = strArr;
        this.f134174i = null;
        this.f134170e = iArr2;
        this.f134171f = bArr2;
        this.f134172g = aVarArr;
        this.f134173h = z10;
    }

    public final int hashCode() {
        return C6660q.b(this.f134166a, this.f134167b, this.f134168c, this.f134169d, this.f134174i, null, null, this.f134170e, this.f134171f, this.f134172g, Boolean.valueOf(this.f134173h));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LogEventParcelable[");
        sb2.append(this.f134166a);
        sb2.append(", LogEventBytes: ");
        byte[] bArr = this.f134167b;
        sb2.append(bArr == null ? null : new String(bArr));
        sb2.append(", TestCodes: ");
        sb2.append(Arrays.toString(this.f134168c));
        sb2.append(", MendelPackages: ");
        sb2.append(Arrays.toString(this.f134169d));
        sb2.append(", LogEvent: ");
        sb2.append(this.f134174i);
        sb2.append(", ExtensionProducer: ");
        sb2.append((Object) null);
        sb2.append(", VeProducer: ");
        sb2.append((Object) null);
        sb2.append(", ExperimentIDs: ");
        sb2.append(Arrays.toString(this.f134170e));
        sb2.append(", ExperimentTokens: ");
        sb2.append(Arrays.toString(this.f134171f));
        sb2.append(", ExperimentTokensParcelables: ");
        sb2.append(Arrays.toString(this.f134172g));
        sb2.append(", AddPhenotypeExperimentTokens: ");
        sb2.append(this.f134173h);
        sb2.append("]");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C15708b.a(parcel);
        C15708b.u(parcel, 2, this.f134166a, i10, false);
        C15708b.g(parcel, 3, this.f134167b, false);
        C15708b.o(parcel, 4, this.f134168c, false);
        C15708b.x(parcel, 5, this.f134169d, false);
        C15708b.o(parcel, 6, this.f134170e, false);
        C15708b.h(parcel, 7, this.f134171f, false);
        C15708b.c(parcel, 8, this.f134173h);
        C15708b.z(parcel, 9, this.f134172g, i10, false);
        C15708b.b(parcel, iA);
    }
}
