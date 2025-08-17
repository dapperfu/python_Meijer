package Yv;

import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kw.C15331h;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ-\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0017R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001aR\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001aR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001a¨\u0006\u001f"}, d2 = {"LYv/e;", "", "<init>", "()V", "", "inbound", "", "streamId", "length", "type", "flags", "", "c", "(ZIIII)Ljava/lang/String;", "", "windowSizeIncrement", "d", "(ZIIJ)Ljava/lang/String;", "b", "(I)Ljava/lang/String;", "a", "(II)Ljava/lang/String;", "Lkw/h;", "Lkw/h;", "CONNECTION_PREFACE", "", "[Ljava/lang/String;", "FRAME_NAMES", "FLAGS", "e", "BINARY", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f41862a = new e();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public static final C15331h CONNECTION_PREFACE = C15331h.INSTANCE.d("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final String[] FRAME_NAMES = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final String[] FLAGS = new String[64];

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final String[] BINARY;

    static {
        String[] strArr = new String[256];
        for (int i10 = 0; i10 < 256; i10++) {
            String binaryString = Integer.toBinaryString(i10);
            Intrinsics.i(binaryString, "toBinaryString(...)");
            strArr[i10] = StringsKt.P(Rv.k.j("%8s", binaryString), ' ', '0', false, 4, null);
        }
        BINARY = strArr;
        String[] strArr2 = FLAGS;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i11 = iArr[0];
        strArr2[i11 | 8] = strArr2[i11] + "|PADDED";
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i12 = 0; i12 < 3; i12++) {
            int i13 = iArr2[i12];
            int i14 = iArr[0];
            String[] strArr3 = FLAGS;
            int i15 = i14 | i13;
            strArr3[i15] = strArr3[i14] + '|' + strArr3[i13];
            strArr3[i15 | 8] = strArr3[i14] + '|' + strArr3[i13] + "|PADDED";
        }
        int length = FLAGS.length;
        for (int i16 = 0; i16 < length; i16++) {
            String[] strArr4 = FLAGS;
            if (strArr4[i16] == null) {
                strArr4[i16] = BINARY[i16];
            }
        }
    }

    public final String a(int type, int flags) {
        String str;
        if (flags == 0) {
            return "";
        }
        if (type != 2 && type != 3) {
            if (type == 4 || type == 6) {
                return flags == 1 ? "ACK" : BINARY[flags];
            }
            if (type != 7 && type != 8) {
                String[] strArr = FLAGS;
                if (flags < strArr.length) {
                    str = strArr[flags];
                    Intrinsics.g(str);
                } else {
                    str = BINARY[flags];
                }
                String str2 = str;
                return (type != 5 || (flags & 4) == 0) ? (type != 0 || (flags & 32) == 0) ? str2 : StringsKt.Q(str2, "PRIORITY", "COMPRESSED", false, 4, null) : StringsKt.Q(str2, "HEADERS", "PUSH_PROMISE", false, 4, null);
            }
        }
        return BINARY[flags];
    }

    public final String b(int type) {
        String[] strArr = FRAME_NAMES;
        return type < strArr.length ? strArr[type] : Rv.k.j("0x%02x", Integer.valueOf(type));
    }

    public final String d(boolean inbound, int streamId, int length, long windowSizeIncrement) {
        return Rv.k.j("%s 0x%08x %5d %-13s %d", inbound ? "<<" : ">>", Integer.valueOf(streamId), Integer.valueOf(length), b(8), Long.valueOf(windowSizeIncrement));
    }

    private e() {
    }

    public final String c(boolean inbound, int streamId, int length, int type, int flags) {
        String str;
        String strB = b(type);
        String strA = a(type, flags);
        if (inbound) {
            str = "<<";
        } else {
            str = ">>";
        }
        return Rv.k.j("%s 0x%08x %5d %-13s %s", str, Integer.valueOf(streamId), Integer.valueOf(length), strB, strA);
    }
}
