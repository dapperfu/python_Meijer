package kotlin.time;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\t\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u0003\u0010\u0004\"\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007\"\u0014\u0010\t\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0007\"\u0014\u0010\u000b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0007\"\u0014\u0010\r\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0007¨\u0006\u000e"}, d2 = {"Lkotlin/time/Instant;", "instant", "", "b", "(Lkotlin/time/Instant;)Ljava/lang/String;", "", "a", "[I", "POWERS_OF_TEN", "asciiDigitPositionsInIsoStringAfterYear", "c", "colonsInIsoOffsetString", "d", "asciiDigitsInIsoOffsetString", "kotlin-stdlib"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class InstantKt {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f147522a = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f147523b = {1, 2, 4, 5, 7, 8, 10, 11, 13, 14};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f147524c = {3, 6};

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f147525d = {1, 2, 4, 5, 7, 8};

    /* JADX INFO: Access modifiers changed from: private */
    @ExperimentalTime
    public static final String b(Instant instant) throws IOException {
        int[] iArr;
        StringBuilder sb2 = new StringBuilder();
        UnboundLocalDateTime unboundLocalDateTimeA = UnboundLocalDateTime.INSTANCE.a(instant);
        int iG = unboundLocalDateTimeA.getYear();
        int i10 = 0;
        if (Math.abs(iG) < 1000) {
            StringBuilder sb3 = new StringBuilder();
            if (iG >= 0) {
                sb3.append(iG + 10000);
                Intrinsics.i(sb3.deleteCharAt(0), "deleteCharAt(...)");
            } else {
                sb3.append(iG - 10000);
                Intrinsics.i(sb3.deleteCharAt(1), "deleteCharAt(...)");
            }
            sb2.append((CharSequence) sb3);
        } else {
            if (iG >= 10000) {
                sb2.append('+');
            }
            sb2.append(iG);
        }
        sb2.append('-');
        c(sb2, sb2, unboundLocalDateTimeA.getMonth());
        sb2.append('-');
        c(sb2, sb2, unboundLocalDateTimeA.getDay());
        sb2.append('T');
        c(sb2, sb2, unboundLocalDateTimeA.getHour());
        sb2.append(':');
        c(sb2, sb2, unboundLocalDateTimeA.getMinute());
        sb2.append(':');
        c(sb2, sb2, unboundLocalDateTimeA.getSecond());
        if (unboundLocalDateTimeA.getNanosecond() != 0) {
            sb2.append('.');
            while (true) {
                int iE = unboundLocalDateTimeA.getNanosecond();
                iArr = f147522a;
                int i11 = i10 + 1;
                if (iE % iArr[i11] != 0) {
                    break;
                }
                i10 = i11;
            }
            int i12 = i10 - (i10 % 3);
            String strValueOf = String.valueOf((unboundLocalDateTimeA.getNanosecond() / iArr[i12]) + iArr[9 - i12]);
            Intrinsics.h(strValueOf, "null cannot be cast to non-null type java.lang.String");
            String strSubstring = strValueOf.substring(1);
            Intrinsics.i(strSubstring, "substring(...)");
            sb2.append(strSubstring);
        }
        sb2.append('Z');
        return sb2.toString();
    }

    private static final void c(Appendable appendable, StringBuilder sb2, int i10) throws IOException {
        if (i10 < 10) {
            appendable.append('0');
        }
        sb2.append(i10);
    }
}
