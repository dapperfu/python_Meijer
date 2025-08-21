package H1;

import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\u001a \u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a\u001a\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0001ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\"\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004H\u0001ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a*\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\"\u001e\u0010\u001a\u001a\u00020\u0004*\u00020\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017\"\u001e\u0010\u001d\u001a\u00020\u0004*\u00020\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001b\u0010\u0017\"\u001e\u0010\u001a\u001a\u00020\u0004*\u00020\u001e8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0018\u0010!\u001a\u0004\b\u001f\u0010 \"\u001e\u0010\u001d\u001a\u00020\u0004*\u00020\u001e8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001c\u0010!\u001a\u0004\b\"\u0010 \"\u001e\u0010\u001a\u001a\u00020\u0004*\u00020#8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0018\u0010&\u001a\u0004\b$\u0010%\"\u001e\u0010\u001d\u001a\u00020\u0004*\u00020#8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001c\u0010&\u001a\u0004\b'\u0010%\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006("}, d2 = {"", "value", "LH1/x;", "type", "LH1/v;", "a", "(FJ)J", "", "unitType", "v", "k", "(JF)J", "", "b", "(J)V", "c", "(JJ)V", "start", "stop", "fraction", "j", "(JJF)J", "h", "(F)J", "getSp$annotations", "(F)V", "sp", "e", "getEm$annotations", "em", "", "g", "(D)J", "(D)V", "d", "", "i", "(I)J", "(I)V", "f", "ui-unit_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class w {
    public static final long a(float f10, long j10) {
        return k(j10, f10);
    }

    @PublishedApi
    public static final void b(long j10) {
        boolean z10;
        if (v.f(j10) == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            m.a("Cannot perform operation for Unspecified type.");
        }
    }

    @PublishedApi
    public static final void c(long j10, long j11) {
        boolean z10;
        if (v.f(j10) == 0 || v.f(j11) == 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            m.a("Cannot perform operation for Unspecified type.");
        }
        if (!x.g(v.g(j10), v.g(j11))) {
            m.a("Cannot perform operation for " + ((Object) x.i(v.g(j10))) + " and " + ((Object) x.i(v.g(j11))));
        }
    }

    public static final long j(long j10, long j11, float f10) {
        c(j10, j11);
        return k(v.f(j10), J1.b.b(v.h(j10), v.h(j11), f10));
    }

    @PublishedApi
    public static final long k(long j10, float f10) {
        return v.c(j10 | (Float.floatToRawIntBits(f10) & 4294967295L));
    }

    public static final long d(double d10) {
        return k(8589934592L, (float) d10);
    }

    public static final long e(float f10) {
        return k(8589934592L, f10);
    }

    public static final long f(int i10) {
        return k(8589934592L, i10);
    }

    public static final long g(double d10) {
        return k(4294967296L, (float) d10);
    }

    public static final long h(float f10) {
        return k(4294967296L, f10);
    }

    public static final long i(int i10) {
        return k(4294967296L, i10);
    }
}
