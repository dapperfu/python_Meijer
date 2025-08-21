package kotlin.coroutines.jvm.internal;

import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.jvm.JvmName;

@Metadata(d1 = {"\u0000>\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\tH\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\rH\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0001\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"", "primitive", "Ljava/lang/Boolean;", "a", "(Z)Ljava/lang/Boolean;", "", "Ljava/lang/Integer;", "d", "(I)Ljava/lang/Integer;", "", "Ljava/lang/Long;", "e", "(J)Ljava/lang/Long;", "", "Ljava/lang/Float;", "c", "(F)Ljava/lang/Float;", "", "Ljava/lang/Double;", "b", "(D)Ljava/lang/Double;", "kotlin-stdlib"}, k = 2, mv = {2, 1, 0}, xi = 48)
@JvmName
/* loaded from: classes8.dex */
public final class Boxing {
    @SinceKotlin
    @PublishedApi
    public static final Double b(double d10) {
        return new Double(d10);
    }

    @SinceKotlin
    @PublishedApi
    public static final Float c(float f10) {
        return new Float(f10);
    }

    @SinceKotlin
    @PublishedApi
    public static final Integer d(int i10) {
        return new Integer(i10);
    }

    @SinceKotlin
    @PublishedApi
    public static final Long e(long j10) {
        return new Long(j10);
    }

    @SinceKotlin
    @PublishedApi
    public static final Boolean a(boolean z10) {
        return Boolean.valueOf(z10);
    }
}
