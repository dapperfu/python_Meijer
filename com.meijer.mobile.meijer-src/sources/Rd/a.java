package Rd;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.maps.android.BuildConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import md.AbstractC15707a;
import md.C15708b;

/* loaded from: classes6.dex */
public class a extends AbstractC15707a {

    /* renamed from: i, reason: collision with root package name */
    private static final byte[][] f32472i;

    /* renamed from: j, reason: collision with root package name */
    private static final a f32473j;

    /* renamed from: a, reason: collision with root package name */
    private final String f32478a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f32479b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[][] f32480c;

    /* renamed from: d, reason: collision with root package name */
    private final byte[][] f32481d;

    /* renamed from: e, reason: collision with root package name */
    private final byte[][] f32482e;

    /* renamed from: f, reason: collision with root package name */
    private final byte[][] f32483f;

    /* renamed from: g, reason: collision with root package name */
    private final int[] f32484g;

    /* renamed from: h, reason: collision with root package name */
    private final byte[][] f32485h;
    public static final Parcelable.Creator<a> CREATOR = new g();

    /* renamed from: k, reason: collision with root package name */
    private static final InterfaceC0736a f32474k = new c();

    /* renamed from: l, reason: collision with root package name */
    private static final InterfaceC0736a f32475l = new d();

    /* renamed from: m, reason: collision with root package name */
    private static final InterfaceC0736a f32476m = new e();

    /* renamed from: n, reason: collision with root package name */
    private static final InterfaceC0736a f32477n = new f();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Rd.a$a, reason: collision with other inner class name */
    interface InterfaceC0736a {
    }

    static {
        byte[][] bArr = new byte[0][];
        f32472i = bArr;
        f32473j = new a("", null, bArr, bArr, bArr, bArr, null, null);
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
            if (j.a(this.f32478a, aVar.f32478a) && Arrays.equals(this.f32479b, aVar.f32479b) && j.a(T(this.f32480c), T(aVar.f32480c)) && j.a(T(this.f32481d), T(aVar.f32481d)) && j.a(T(this.f32482e), T(aVar.f32482e)) && j.a(T(this.f32483f), T(aVar.f32483f)) && j.a(B(this.f32484g), B(aVar.f32484g)) && j.a(T(this.f32485h), T(aVar.f32485h))) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        String string;
        StringBuilder sb2 = new StringBuilder("ExperimentTokens");
        sb2.append("(");
        String str = this.f32478a;
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
        byte[] bArr = this.f32479b;
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
        b0(sb2, "GAIA", this.f32480c);
        sb2.append(", ");
        b0(sb2, "PSEUDO", this.f32481d);
        sb2.append(", ");
        b0(sb2, "ALWAYS", this.f32482e);
        sb2.append(", ");
        b0(sb2, "OTHER", this.f32483f);
        sb2.append(", ");
        int[] iArr = this.f32484g;
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
        b0(sb2, "directs", this.f32485h);
        sb2.append(")");
        return sb2.toString();
    }

    public a(String str, byte[] bArr, byte[][] bArr2, byte[][] bArr3, byte[][] bArr4, byte[][] bArr5, int[] iArr, byte[][] bArr6) {
        this.f32478a = str;
        this.f32479b = bArr;
        this.f32480c = bArr2;
        this.f32481d = bArr3;
        this.f32482e = bArr4;
        this.f32483f = bArr5;
        this.f32484g = iArr;
        this.f32485h = bArr6;
    }

    private static void b0(StringBuilder sb2, String str, byte[][] bArr) {
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
        int iA = C15708b.a(parcel);
        C15708b.w(parcel, 2, this.f32478a, false);
        C15708b.g(parcel, 3, this.f32479b, false);
        C15708b.h(parcel, 4, this.f32480c, false);
        C15708b.h(parcel, 5, this.f32481d, false);
        C15708b.h(parcel, 6, this.f32482e, false);
        C15708b.h(parcel, 7, this.f32483f, false);
        C15708b.o(parcel, 8, this.f32484g, false);
        C15708b.h(parcel, 9, this.f32485h, false);
        C15708b.b(parcel, iA);
    }
}
