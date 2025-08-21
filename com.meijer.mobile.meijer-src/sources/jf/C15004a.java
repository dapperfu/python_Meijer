package jf;

import com.google.android.gms.common.api.a;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;
import java.math.RoundingMode;

/* renamed from: jf.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C15004a {

    /* renamed from: a, reason: collision with root package name */
    static final byte[] f140412a = {9, 9, 9, 8, 8, 8, 7, 7, 7, 6, 6, 6, 6, 5, 5, 5, 4, 4, 4, 3, 3, 3, 3, 2, 2, 2, 1, 1, 1, 0, 0, 0, 0};

    /* renamed from: b, reason: collision with root package name */
    static final int[] f140413b = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};

    /* renamed from: c, reason: collision with root package name */
    static final int[] f140414c = {3, 31, 316, 3162, 31622, 316227, 3162277, 31622776, 316227766, a.e.API_PRIORITY_OTHER};

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f140415d = {1, 1, 2, 6, 24, BinsView.TOTE_HEIGHT_DP, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600};

    /* renamed from: e, reason: collision with root package name */
    static int[] f140416e = {a.e.API_PRIORITY_OTHER, a.e.API_PRIORITY_OTHER, 65536, 2345, 477, 193, 110, 75, 58, 49, 43, 39, 37, 35, 34, 34, 33};

    public static boolean a(int i10) {
        return (i10 > 0) & ((i10 & (i10 + (-1))) == 0);
    }

    static int b(int i10, int i11) {
        return (~(~(i10 - i11))) >>> 31;
    }

    /* renamed from: jf.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C2222a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f140417a;

        static {
            int[] iArr = new int[RoundingMode.values().length];
            f140417a = iArr;
            try {
                iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f140417a[RoundingMode.DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f140417a[RoundingMode.FLOOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f140417a[RoundingMode.UP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f140417a[RoundingMode.CEILING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f140417a[RoundingMode.HALF_DOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f140417a[RoundingMode.HALF_UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f140417a[RoundingMode.HALF_EVEN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public static int c(int i10, RoundingMode roundingMode) {
        b.a("x", i10);
        switch (C2222a.f140417a[roundingMode.ordinal()]) {
            case 1:
                b.b(a(i10));
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
                return (31 - iNumberOfLeadingZeros) + b((-1257966797) >>> iNumberOfLeadingZeros, i10);
            default:
                throw new AssertionError();
        }
        return 31 - Integer.numberOfLeadingZeros(i10);
    }
}
