package N4;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000V\n\u0002\u0010\u0018\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0013\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00022\u0006\u0010\u0001\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00022\u0006\u0010\u0001\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\r\u001a\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00022\u0006\u0010\u0001\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00022\u0006\u0010\u0001\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00022\u0006\u0010\u0001\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019\"\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"", "value", "", "", "h", "([Z)[Ljava/lang/Boolean;", "", "", "i", "([B)[Ljava/lang/Byte;", "", "", "l", "([I)[Ljava/lang/Integer;", "", "", "m", "([J)[Ljava/lang/Long;", "", "", "k", "([F)[Ljava/lang/Float;", "", "", "j", "([D)[Ljava/lang/Double;", "", "a", "Ljava/lang/String;", "TAG", "work-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: N4.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4317e {

    /* renamed from: a, reason: collision with root package name */
    private static final String f21402a;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean[] h(boolean[] zArr) {
        int length = zArr.length;
        Boolean[] boolArr = new Boolean[length];
        for (int i10 = 0; i10 < length; i10++) {
            boolArr[i10] = Boolean.valueOf(zArr[i10]);
        }
        return boolArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Byte[] i(byte[] bArr) {
        int length = bArr.length;
        Byte[] bArr2 = new Byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            bArr2[i10] = Byte.valueOf(bArr[i10]);
        }
        return bArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Double[] j(double[] dArr) {
        int length = dArr.length;
        Double[] dArr2 = new Double[length];
        for (int i10 = 0; i10 < length; i10++) {
            dArr2[i10] = Double.valueOf(dArr[i10]);
        }
        return dArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Float[] k(float[] fArr) {
        int length = fArr.length;
        Float[] fArr2 = new Float[length];
        for (int i10 = 0; i10 < length; i10++) {
            fArr2[i10] = Float.valueOf(fArr[i10]);
        }
        return fArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer[] l(int[] iArr) {
        int length = iArr.length;
        Integer[] numArr = new Integer[length];
        for (int i10 = 0; i10 < length; i10++) {
            numArr[i10] = Integer.valueOf(iArr[i10]);
        }
        return numArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Long[] m(long[] jArr) {
        int length = jArr.length;
        Long[] lArr = new Long[length];
        for (int i10 = 0; i10 < length; i10++) {
            lArr[i10] = Long.valueOf(jArr[i10]);
        }
        return lArr;
    }

    static {
        String strI = AbstractC4333v.i("Data");
        Intrinsics.i(strI, "tagWithPrefix(\"Data\")");
        f21402a = strI;
    }
}
