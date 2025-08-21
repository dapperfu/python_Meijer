package kotlin.collections;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000v\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\u0016\n\u0002\b\u0004\n\u0002\u0010\u0019\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a%\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002*\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b\u001a-\u0010\u000e\u001a\u00020\u0006*\u00020\t2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000f\u001aS\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001a9\u0010\u0017\u001a\u00020\u0016*\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u00162\b\b\u0002\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0017\u0010\u0018\u001a9\u0010\u0019\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0019\u0010\u001a\u001a9\u0010\u001c\u001a\u00020\u001b*\u00020\u001b2\u0006\u0010\u0010\u001a\u00020\u001b2\b\b\u0002\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u001c\u0010\u001d\u001a9\u0010\u001e\u001a\u00020\t*\u00020\t2\u0006\u0010\u0010\u001a\u00020\t2\b\b\u0002\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u001e\u0010\u001f\u001a9\u0010!\u001a\u00020 *\u00020 2\u0006\u0010\u0010\u001a\u00020 2\b\b\u0002\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u0006H\u0007¢\u0006\u0004\b!\u0010\"\u001a5\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0001¢\u0006\u0004\b#\u0010$\u001a#\u0010%\u001a\u00020\u0016*\u00020\u00162\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0001¢\u0006\u0004\b%\u0010&\u001a#\u0010'\u001a\u00020\t*\u00020\t2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0001¢\u0006\u0004\b'\u0010(\u001a9\u0010*\u001a\u00020)\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u000b\u001a\u00028\u00002\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b*\u0010+\u001a-\u0010-\u001a\u00020)*\u00020\u00162\u0006\u0010\u000b\u001a\u00020,2\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b-\u0010.\u001a-\u0010/\u001a\u00020)*\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b/\u00100\u001a-\u00102\u001a\u00020)*\u00020\u001b2\u0006\u0010\u000b\u001a\u0002012\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b2\u00103\u001a-\u00106\u001a\u00020)*\u0002042\u0006\u0010\u000b\u001a\u0002052\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b6\u00107\u001a-\u00109\u001a\u00020)*\u00020 2\u0006\u0010\u000b\u001a\u0002082\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b9\u0010:\u001a.\u0010;\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u000b\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b;\u0010<\u001a\u001c\u0010=\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b=\u0010>\u001a6\u0010@\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u000e\u0010?\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001H\u0086\u0002¢\u0006\u0004\b@\u0010A\u001a\u001c\u0010B\u001a\u00020\u0005*\u00020\u00052\u0006\u0010?\u001a\u00020\u0005H\u0086\u0002¢\u0006\u0004\bB\u0010C\u001a\u0011\u0010D\u001a\u00020)*\u00020\u0005¢\u0006\u0004\bD\u0010E\u001a\u001f\u0010F\u001a\u00020)\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\bF\u0010G\u001a%\u0010H\u001a\u00020)*\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u0006¢\u0006\u0004\bH\u0010I\u001a;\u0010M\u001a\u00020)\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u001a\u0010L\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000Jj\n\u0012\u0006\b\u0000\u0012\u00028\u0000`K¢\u0006\u0004\bM\u0010N\u001aO\u0010O\u001a\u00020)\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u001a\u0010L\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000Jj\n\u0012\u0006\b\u0000\u0012\u00028\u0000`K2\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u0006¢\u0006\u0004\bO\u0010P¨\u0006Q"}, d2 = {"T", "", "", "g", "([Ljava/lang/Object;)Ljava/util/List;", "", "", "f", "([I)Ljava/util/List;", "", "", "element", "fromIndex", "toIndex", "h", "([FFII)I", "destination", "destinationOffset", "startIndex", "endIndex", "o", "([Ljava/lang/Object;[Ljava/lang/Object;III)[Ljava/lang/Object;", "", "j", "([B[BIII)[B", "m", "([I[IIII)[I", "", "n", "([J[JIII)[J", "l", "([F[FIII)[F", "", "k", "([C[CIII)[C", "w", "([Ljava/lang/Object;II)[Ljava/lang/Object;", "u", "([BII)[B", "v", "([FII)[F", "", "B", "([Ljava/lang/Object;Ljava/lang/Object;II)V", "", "x", "([BBII)V", "z", "([IIII)V", "", "A", "([JJII)V", "", "", "C", "([ZZII)V", "", "y", "([CCII)V", "J", "([Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;", "H", "([II)[I", "elements", "K", "([Ljava/lang/Object;[Ljava/lang/Object;)[Ljava/lang/Object;", "I", "([I[I)[I", "L", "([I)V", "N", "([Ljava/lang/Object;)V", "M", "([III)V", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "comparator", "O", "([Ljava/lang/Object;Ljava/util/Comparator;)V", "P", "([Ljava/lang/Object;Ljava/util/Comparator;II)V", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/collections/ArraysKt")
@SourceDebugExtension
/* loaded from: classes6.dex */
public class ArraysKt___ArraysJvmKt extends C15314e {
    public static void A(long[] jArr, long j10, int i10, int i11) {
        Intrinsics.j(jArr, "<this>");
        Arrays.fill(jArr, i10, i11, j10);
    }

    public static <T> void B(T[] tArr, T t10, int i10, int i11) {
        Intrinsics.j(tArr, "<this>");
        Arrays.fill(tArr, i10, i11, t10);
    }

    public static final void C(boolean[] zArr, boolean z10, int i10, int i11) {
        Intrinsics.j(zArr, "<this>");
        Arrays.fill(zArr, i10, i11, z10);
    }

    public static /* synthetic */ void D(int[] iArr, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = iArr.length;
        }
        z(iArr, i10, i11, i12);
    }

    public static /* synthetic */ void E(long[] jArr, long j10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = jArr.length;
        }
        A(jArr, j10, i10, i11);
    }

    public static /* synthetic */ void F(Object[] objArr, Object obj, int i10, int i11, int i12, Object obj2) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = objArr.length;
        }
        B(objArr, obj, i10, i11);
    }

    public static /* synthetic */ void G(boolean[] zArr, boolean z10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = zArr.length;
        }
        C(zArr, z10, i10, i11);
    }

    public static int[] H(int[] iArr, int i10) {
        Intrinsics.j(iArr, "<this>");
        int length = iArr.length;
        int[] iArrCopyOf = Arrays.copyOf(iArr, length + 1);
        iArrCopyOf[length] = i10;
        Intrinsics.g(iArrCopyOf);
        return iArrCopyOf;
    }

    public static int[] I(int[] iArr, int[] elements) {
        Intrinsics.j(iArr, "<this>");
        Intrinsics.j(elements, "elements");
        int length = iArr.length;
        int length2 = elements.length;
        int[] iArrCopyOf = Arrays.copyOf(iArr, length + length2);
        System.arraycopy(elements, 0, iArrCopyOf, length, length2);
        Intrinsics.g(iArrCopyOf);
        return iArrCopyOf;
    }

    public static <T> T[] J(T[] tArr, T t10) {
        Intrinsics.j(tArr, "<this>");
        int length = tArr.length;
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, length + 1);
        tArr2[length] = t10;
        Intrinsics.g(tArr2);
        return tArr2;
    }

    public static <T> T[] K(T[] tArr, T[] elements) {
        Intrinsics.j(tArr, "<this>");
        Intrinsics.j(elements, "elements");
        int length = tArr.length;
        int length2 = elements.length;
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, length + length2);
        System.arraycopy(elements, 0, tArr2, length, length2);
        Intrinsics.g(tArr2);
        return tArr2;
    }

    public static void L(int[] iArr) {
        Intrinsics.j(iArr, "<this>");
        if (iArr.length > 1) {
            Arrays.sort(iArr);
        }
    }

    public static void M(int[] iArr, int i10, int i11) {
        Intrinsics.j(iArr, "<this>");
        Arrays.sort(iArr, i10, i11);
    }

    public static final <T> void N(T[] tArr) {
        Intrinsics.j(tArr, "<this>");
        if (tArr.length > 1) {
            Arrays.sort(tArr);
        }
    }

    public static final <T> void O(T[] tArr, Comparator<? super T> comparator) {
        Intrinsics.j(tArr, "<this>");
        Intrinsics.j(comparator, "comparator");
        if (tArr.length > 1) {
            Arrays.sort(tArr, comparator);
        }
    }

    public static <T> void P(T[] tArr, Comparator<? super T> comparator, int i10, int i11) {
        Intrinsics.j(tArr, "<this>");
        Intrinsics.j(comparator, "comparator");
        Arrays.sort(tArr, i10, i11, comparator);
    }

    public static List<Integer> f(int[] iArr) {
        Intrinsics.j(iArr, "<this>");
        return new ArraysKt___ArraysJvmKt$asList$3(iArr);
    }

    public static <T> List<T> g(T[] tArr) {
        Intrinsics.j(tArr, "<this>");
        List<T> listA = g.a(tArr);
        Intrinsics.i(listA, "asList(...)");
        return listA;
    }

    public static final int h(float[] fArr, float f10, int i10, int i11) {
        Intrinsics.j(fArr, "<this>");
        return Arrays.binarySearch(fArr, i10, i11, f10);
    }

    public static /* synthetic */ int i(float[] fArr, float f10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = fArr.length;
        }
        return h(fArr, f10, i10, i11);
    }

    @SinceKotlin
    public static byte[] j(byte[] bArr, byte[] destination, int i10, int i11, int i12) {
        Intrinsics.j(bArr, "<this>");
        Intrinsics.j(destination, "destination");
        System.arraycopy(bArr, i11, destination, i10, i12 - i11);
        return destination;
    }

    @SinceKotlin
    public static char[] k(char[] cArr, char[] destination, int i10, int i11, int i12) {
        Intrinsics.j(cArr, "<this>");
        Intrinsics.j(destination, "destination");
        System.arraycopy(cArr, i11, destination, i10, i12 - i11);
        return destination;
    }

    @SinceKotlin
    public static float[] l(float[] fArr, float[] destination, int i10, int i11, int i12) {
        Intrinsics.j(fArr, "<this>");
        Intrinsics.j(destination, "destination");
        System.arraycopy(fArr, i11, destination, i10, i12 - i11);
        return destination;
    }

    @SinceKotlin
    public static int[] m(int[] iArr, int[] destination, int i10, int i11, int i12) {
        Intrinsics.j(iArr, "<this>");
        Intrinsics.j(destination, "destination");
        System.arraycopy(iArr, i11, destination, i10, i12 - i11);
        return destination;
    }

    @SinceKotlin
    public static long[] n(long[] jArr, long[] destination, int i10, int i11, int i12) {
        Intrinsics.j(jArr, "<this>");
        Intrinsics.j(destination, "destination");
        System.arraycopy(jArr, i11, destination, i10, i12 - i11);
        return destination;
    }

    @SinceKotlin
    public static <T> T[] o(T[] tArr, T[] destination, int i10, int i11, int i12) {
        Intrinsics.j(tArr, "<this>");
        Intrinsics.j(destination, "destination");
        System.arraycopy(tArr, i11, destination, i10, i12 - i11);
        return destination;
    }

    public static /* synthetic */ byte[] p(byte[] bArr, byte[] bArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = bArr.length;
        }
        return j(bArr, bArr2, i10, i11, i12);
    }

    public static /* synthetic */ float[] q(float[] fArr, float[] fArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = fArr.length;
        }
        return l(fArr, fArr2, i10, i11, i12);
    }

    public static /* synthetic */ int[] r(int[] iArr, int[] iArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = iArr.length;
        }
        return m(iArr, iArr2, i10, i11, i12);
    }

    public static /* synthetic */ long[] s(long[] jArr, long[] jArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = jArr.length;
        }
        return n(jArr, jArr2, i10, i11, i12);
    }

    public static /* synthetic */ Object[] t(Object[] objArr, Object[] objArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = objArr.length;
        }
        return o(objArr, objArr2, i10, i11, i12);
    }

    @SinceKotlin
    @PublishedApi
    @JvmName
    public static byte[] u(byte[] bArr, int i10, int i11) {
        Intrinsics.j(bArr, "<this>");
        C15313d.c(i11, bArr.length);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i10, i11);
        Intrinsics.i(bArrCopyOfRange, "copyOfRange(...)");
        return bArrCopyOfRange;
    }

    @SinceKotlin
    @PublishedApi
    @JvmName
    public static float[] v(float[] fArr, int i10, int i11) {
        Intrinsics.j(fArr, "<this>");
        C15313d.c(i11, fArr.length);
        float[] fArrCopyOfRange = Arrays.copyOfRange(fArr, i10, i11);
        Intrinsics.i(fArrCopyOfRange, "copyOfRange(...)");
        return fArrCopyOfRange;
    }

    @SinceKotlin
    @PublishedApi
    @JvmName
    public static <T> T[] w(T[] tArr, int i10, int i11) {
        Intrinsics.j(tArr, "<this>");
        C15313d.c(i11, tArr.length);
        T[] tArr2 = (T[]) Arrays.copyOfRange(tArr, i10, i11);
        Intrinsics.i(tArr2, "copyOfRange(...)");
        return tArr2;
    }

    public static void x(byte[] bArr, byte b10, int i10, int i11) {
        Intrinsics.j(bArr, "<this>");
        Arrays.fill(bArr, i10, i11, b10);
    }

    public static void y(char[] cArr, char c10, int i10, int i11) {
        Intrinsics.j(cArr, "<this>");
        Arrays.fill(cArr, i10, i11, c10);
    }

    public static final void z(int[] iArr, int i10, int i11, int i12) {
        Intrinsics.j(iArr, "<this>");
        Arrays.fill(iArr, i11, i12, i10);
    }
}
