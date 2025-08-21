package He;

import De.p;
import Je.f;
import com.google.android.gms.common.api.a;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;
import java.math.RoundingMode;

/* loaded from: classes6.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    static final byte[] f13522a = {9, 9, 9, 8, 8, 8, 7, 7, 7, 6, 6, 6, 6, 5, 5, 5, 4, 4, 4, 3, 3, 3, 3, 2, 2, 2, 1, 1, 1, 0, 0, 0, 0};

    /* renamed from: b, reason: collision with root package name */
    static final int[] f13523b = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};

    /* renamed from: c, reason: collision with root package name */
    static final int[] f13524c = {3, 31, 316, 3162, 31622, 316227, 3162277, 31622776, 316227766, a.e.API_PRIORITY_OTHER};

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f13525d = {1, 1, 2, 6, 24, BinsView.TOTE_HEIGHT_DP, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600};

    /* renamed from: e, reason: collision with root package name */
    static int[] f13526e = {a.e.API_PRIORITY_OTHER, a.e.API_PRIORITY_OTHER, 65536, 2345, 477, 193, 110, 75, 58, 49, 43, 39, 37, 35, 34, 34, 33};

    public static int a(int i10, int i11) {
        long j10 = i10 + i11;
        int i12 = (int) j10;
        e.b(j10 == ((long) i12), "checkedAdd", i10, i11);
        return i12;
    }

    public static boolean c(int i10) {
        return (i10 > 0) & ((i10 & (i10 + (-1))) == 0);
    }

    static int d(int i10, int i11) {
        return (~(~(i10 - i11))) >>> 31;
    }

    public static int f(int i10, int i11) {
        return f.k(i10 * i11);
    }

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f13527a;

        static {
            int[] iArr = new int[RoundingMode.values().length];
            f13527a = iArr;
            try {
                iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13527a[RoundingMode.DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13527a[RoundingMode.FLOOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13527a[RoundingMode.UP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13527a[RoundingMode.CEILING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f13527a[RoundingMode.HALF_DOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f13527a[RoundingMode.HALF_UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f13527a[RoundingMode.HALF_EVEN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public static int e(int i10, RoundingMode roundingMode) {
        e.f("x", i10);
        switch (a.f13527a[roundingMode.ordinal()]) {
            case 1:
                e.g(c(i10));
                break;
            case 2:
            case 3:
                break;
            case 4:
            case 5:
                return 32 - Integer.numberOfLeadingZeros(i10 - 1);
            case 6:
            case 7:
            case 8:
                int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(i10);
                return (31 - iNumberOfLeadingZeros) + d((-1257966797) >>> iNumberOfLeadingZeros, i10);
            default:
                throw new AssertionError();
        }
        return 31 - Integer.numberOfLeadingZeros(i10);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int b(int i10, int i11, RoundingMode roundingMode) {
        boolean z10;
        p.q(roundingMode);
        if (i11 != 0) {
            int i12 = i10 / i11;
            int i13 = i10 - (i11 * i12);
            if (i13 == 0) {
                return i12;
            }
            boolean z11 = true;
            int i14 = ((i10 ^ i11) >> 31) | 1;
            switch (a.f13527a[roundingMode.ordinal()]) {
                case 1:
                    if (i13 != 0) {
                        z11 = false;
                    }
                    e.g(z11);
                    return i12;
                case 2:
                    return i12;
                case 3:
                    if (i14 >= 0) {
                        return i12;
                    }
                    return i12 + i14;
                case 4:
                    return i12 + i14;
                case 5:
                    if (i14 <= 0) {
                        return i12;
                    }
                    return i12 + i14;
                case 6:
                case 7:
                case 8:
                    int iAbs = Math.abs(i13);
                    int iAbs2 = iAbs - (Math.abs(i11) - iAbs);
                    if (iAbs2 == 0) {
                        if (roundingMode != RoundingMode.HALF_UP) {
                            if (roundingMode == RoundingMode.HALF_EVEN) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if ((i12 & 1) == 0) {
                                z11 = false;
                            }
                            if (!(z10 & z11)) {
                                return i12;
                            }
                        }
                    } else if (iAbs2 <= 0) {
                        return i12;
                    }
                    return i12 + i14;
                default:
                    throw new AssertionError();
            }
        }
        throw new ArithmeticException("/ by zero");
    }
}
