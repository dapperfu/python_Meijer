package Z;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\b\u0087@\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0000\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n\u0088\u0001\b\u0092\u0001\u00020\u0007¨\u0006\u000b"}, d2 = {"LZ/i;", "", "", "first", "second", "a", "(FF)J", "", "packedValue", "b", "(J)J", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
@SourceDebugExtension
/* renamed from: Z.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5611i {
    public static long b(long j10) {
        return j10;
    }

    public static long a(float f10, float f11) {
        return b((Float.floatToRawIntBits(f11) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32));
    }
}
