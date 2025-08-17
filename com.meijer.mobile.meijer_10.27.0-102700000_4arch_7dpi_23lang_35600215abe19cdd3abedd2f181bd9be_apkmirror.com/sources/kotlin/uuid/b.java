package kotlin.uuid;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.HexExtensionsKt;

@Metadata(d1 = {"\u0000*\n\u0002\u0010\t\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u001a3\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\b\u0010\t\u001a\u001b\u0010\f\u001a\u00020\u0007*\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\nH\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0017\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\nH\u0001¢\u0006\u0004\b\u0013\u0010\u0011\u001a\u001b\u0010\u0015\u001a\u00020\n*\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"", "", "dst", "", "dstOffset", "startIndex", "endIndex", "", "f", "(J[BIII)V", "", "index", "e", "(Ljava/lang/String;I)V", "hexDashString", "Lkotlin/uuid/Uuid;", "i", "(Ljava/lang/String;)Lkotlin/uuid/Uuid;", "hexString", "h", "maxLength", "g", "(Ljava/lang/String;I)Ljava/lang/String;", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/uuid/UuidKt")
@SourceDebugExtension
/* loaded from: classes13.dex */
class b extends a {
    public static final void e(String str, int i10) {
        Intrinsics.j(str, "<this>");
        if (str.charAt(i10) == '-') {
            return;
        }
        throw new IllegalArgumentException(("Expected '-' (hyphen) at index " + i10 + ", but was '" + str.charAt(i10) + '\'').toString());
    }

    @ExperimentalUuidApi
    public static final void f(long j10, byte[] dst, int i10, int i11, int i12) {
        Intrinsics.j(dst, "dst");
        int i13 = 7 - i11;
        int i14 = 8 - i12;
        if (i14 > i13) {
            return;
        }
        while (true) {
            int i15 = HexExtensionsKt.e()[(int) ((j10 >> (i13 << 3)) & 255)];
            int i16 = i10 + 1;
            dst[i10] = (byte) (i15 >> 8);
            i10 += 2;
            dst[i16] = (byte) i15;
            if (i13 == i14) {
                return;
            } else {
                i13--;
            }
        }
    }

    @ExperimentalUuidApi
    public static final Uuid h(String hexString) {
        Intrinsics.j(hexString, "hexString");
        return Uuid.f147542c.a(HexExtensionsKt.g(hexString, 0, 16, null, 4, null), HexExtensionsKt.g(hexString, 16, 32, null, 4, null));
    }

    @ExperimentalUuidApi
    public static final Uuid i(String hexDashString) {
        Intrinsics.j(hexDashString, "hexDashString");
        long jG = HexExtensionsKt.g(hexDashString, 0, 8, null, 4, null);
        e(hexDashString, 8);
        long jG2 = HexExtensionsKt.g(hexDashString, 9, 13, null, 4, null);
        e(hexDashString, 13);
        long jG3 = HexExtensionsKt.g(hexDashString, 14, 18, null, 4, null);
        e(hexDashString, 18);
        long jG4 = HexExtensionsKt.g(hexDashString, 19, 23, null, 4, null);
        e(hexDashString, 23);
        return Uuid.f147542c.a((jG2 << 16) | (jG << 32) | jG3, (jG4 << 48) | HexExtensionsKt.g(hexDashString, 24, 36, null, 4, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String g(String str, int i10) {
        if (str.length() <= i10) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        Intrinsics.h(str, "null cannot be cast to non-null type java.lang.String");
        String strSubstring = str.substring(0, i10);
        Intrinsics.i(strSubstring, "substring(...)");
        sb2.append(strSubstring);
        sb2.append("...");
        return sb2.toString();
    }
}
