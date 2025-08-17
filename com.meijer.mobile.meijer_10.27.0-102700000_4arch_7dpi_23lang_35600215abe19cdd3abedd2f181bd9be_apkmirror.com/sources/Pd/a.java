package Pd;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.maps.android.BuildConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kd.AbstractC15136a;
import kd.C15137b;

/* loaded from: classes6.dex */
public class a extends AbstractC15136a {

    /* renamed from: i, reason: collision with root package name */
    private static final byte[][] f25258i;

    /* renamed from: j, reason: collision with root package name */
    private static final a f25259j;

    /* renamed from: a, reason: collision with root package name */
    private final String f25264a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f25265b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[][] f25266c;

    /* renamed from: d, reason: collision with root package name */
    private final byte[][] f25267d;

    /* renamed from: e, reason: collision with root package name */
    private final byte[][] f25268e;

    /* renamed from: f, reason: collision with root package name */
    private final byte[][] f25269f;

    /* renamed from: g, reason: collision with root package name */
    private final int[] f25270g;

    /* renamed from: h, reason: collision with root package name */
    private final byte[][] f25271h;
    public static final Parcelable.Creator<a> CREATOR = new g();

    /* renamed from: k, reason: collision with root package name */
    private static final InterfaceC0444a f25260k = new c();

    /* renamed from: l, reason: collision with root package name */
    private static final InterfaceC0444a f25261l = new d();

    /* renamed from: m, reason: collision with root package name */
    private static final InterfaceC0444a f25262m = new e();

    /* renamed from: n, reason: collision with root package name */
    private static final InterfaceC0444a f25263n = new f();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Pd.a$a, reason: collision with other inner class name */
    interface InterfaceC0444a {
    }

    static {
        byte[][] bArr = new byte[0][];
        f25258i = bArr;
        f25259j = new a("", null, bArr, bArr, bArr, bArr, null, null);
    }

    private static List<Integer> B(int[] iArr) {
        if (iArr == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i10 : iArr) {
            arrayList.add(Integer.valueOf(i10));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private static List<String> T(byte[][] bArr) {
        if (bArr == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte[] bArr2 : bArr) {
            arrayList.add(Base64.encodeToString(bArr2, 3));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (j.a(this.f25264a, aVar.f25264a) && Arrays.equals(this.f25265b, aVar.f25265b) && j.a(T(this.f25266c), T(aVar.f25266c)) && j.a(T(this.f25267d), T(aVar.f25267d)) && j.a(T(this.f25268e), T(aVar.f25268e)) && j.a(T(this.f25269f), T(aVar.f25269f)) && j.a(B(this.f25270g), B(aVar.f25270g)) && j.a(T(this.f25271h), T(aVar.f25271h))) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        String string;
        StringBuilder sb2 = new StringBuilder("ExperimentTokens");
        sb2.append("(");
        String str = this.f25264a;
        if (str == null) {
            string = BuildConfig.TRAVIS;
        } else {
            StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 2);
            sb3.append("'");
            sb3.append(str);
            sb3.append("'");
            string = sb3.toString();
        }
        sb2.append(string);
        sb2.append(", ");
        byte[] bArr = this.f25265b;
        sb2.append("direct");
        sb2.append("=");
        if (bArr == null) {
            sb2.append(BuildConfig.TRAVIS);
        } else {
            sb2.append("'");
            sb2.append(Base64.encodeToString(bArr, 3));
            sb2.append("'");
        }
        sb2.append(", ");
        c0(sb2, "GAIA", this.f25266c);
        sb2.append(", ");
        c0(sb2, "PSEUDO", this.f25267d);
        sb2.append(", ");
        c0(sb2, "ALWAYS", this.f25268e);
        sb2.append(", ");
        c0(sb2, "OTHER", this.f25269f);
        sb2.append(", ");
        int[] iArr = this.f25270g;
        sb2.append("weak");
        sb2.append("=");
        if (iArr == null) {
            sb2.append(BuildConfig.TRAVIS);
        } else {
            sb2.append("(");
            int length = iArr.length;
            boolean z10 = true;
            int i10 = 0;
            while (i10 < length) {
                int i11 = iArr[i10];
                if (!z10) {
                    sb2.append(", ");
                }
                sb2.append(i11);
                i10++;
                z10 = false;
            }
            sb2.append(")");
        }
        sb2.append(", ");
        c0(sb2, "directs", this.f25271h);
        sb2.append(")");
        return sb2.toString();
    }

    public a(String str, byte[] bArr, byte[][] bArr2, byte[][] bArr3, byte[][] bArr4, byte[][] bArr5, int[] iArr, byte[][] bArr6) {
        this.f25264a = str;
        this.f25265b = bArr;
        this.f25266c = bArr2;
        this.f25267d = bArr3;
        this.f25268e = bArr4;
        this.f25269f = bArr5;
        this.f25270g = iArr;
        this.f25271h = bArr6;
    }

    private static void c0(StringBuilder sb2, String str, byte[][] bArr) {
        String str2;
        sb2.append(str);
        sb2.append("=");
        if (bArr == null) {
            str2 = BuildConfig.TRAVIS;
        } else {
            sb2.append("(");
            int length = bArr.length;
            boolean z10 = true;
            int i10 = 0;
            while (i10 < length) {
                byte[] bArr2 = bArr[i10];
                if (!z10) {
                    sb2.append(", ");
                }
                sb2.append("'");
                sb2.append(Base64.encodeToString(bArr2, 3));
                sb2.append("'");
                i10++;
                z10 = false;
            }
            str2 = ")";
        }
        sb2.append(str2);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = C15137b.a(parcel);
        C15137b.w(parcel, 2, this.f25264a, false);
        C15137b.g(parcel, 3, this.f25265b, false);
        C15137b.h(parcel, 4, this.f25266c, false);
        C15137b.h(parcel, 5, this.f25267d, false);
        C15137b.h(parcel, 6, this.f25268e, false);
        C15137b.h(parcel, 7, this.f25269f, false);
        C15137b.o(parcel, 8, this.f25270g, false);
        C15137b.h(parcel, 9, this.f25271h, false);
        C15137b.b(parcel, iA);
    }
}
