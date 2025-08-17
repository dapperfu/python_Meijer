package c5;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmStatic;
import kotlin.ranges.RangesKt;
import m5.EnumC15558h;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\u000b\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\fJ?\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ?\u0010\u0010\u001a\u00020\r2\b\b\u0001\u0010\u0005\u001a\u00020\r2\b\b\u0001\u0010\u0006\u001a\u00020\r2\b\b\u0001\u0010\u0007\u001a\u00020\r2\b\b\u0001\u0010\b\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lc5/i;", "", "<init>", "()V", "", "srcWidth", "srcHeight", "dstWidth", "dstHeight", "Lm5/h;", "scale", "a", "(IIIILm5/h;)I", "", "c", "(IIIILm5/h;)D", "b", "(DDDDLm5/h;)D", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: c5.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6363i {

    /* renamed from: a, reason: collision with root package name */
    public static final C6363i f61486a = new C6363i();

    @JvmStatic
    public static final int a(int srcWidth, int srcHeight, int dstWidth, int dstHeight, EnumC15558h scale) {
        int iMin;
        int iHighestOneBit = Integer.highestOneBit(srcWidth / dstWidth);
        int iHighestOneBit2 = Integer.highestOneBit(srcHeight / dstHeight);
        int i10 = a.$EnumSwitchMapping$0[scale.ordinal()];
        if (i10 == 1) {
            iMin = Math.min(iHighestOneBit, iHighestOneBit2);
        } else {
            if (i10 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            iMin = Math.max(iHighestOneBit, iHighestOneBit2);
        }
        return RangesKt.f(iMin, 1);
    }

    @JvmStatic
    public static final double b(double srcWidth, double srcHeight, double dstWidth, double dstHeight, EnumC15558h scale) {
        double d10 = dstWidth / srcWidth;
        double d11 = dstHeight / srcHeight;
        int i10 = a.$EnumSwitchMapping$0[scale.ordinal()];
        if (i10 == 1) {
            return Math.max(d10, d11);
        }
        if (i10 == 2) {
            return Math.min(d10, d11);
        }
        throw new NoWhenBranchMatchedException();
    }

    @JvmStatic
    public static final double c(int srcWidth, int srcHeight, int dstWidth, int dstHeight, EnumC15558h scale) {
        double d10 = dstWidth / srcWidth;
        double d11 = dstHeight / srcHeight;
        int i10 = a.$EnumSwitchMapping$0[scale.ordinal()];
        if (i10 == 1) {
            return Math.max(d10, d11);
        }
        if (i10 == 2) {
            return Math.min(d10, d11);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: c5.i$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC15558h.values().length];
            try {
                iArr[EnumC15558h.f149847a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC15558h.f149848b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private C6363i() {
    }
}
