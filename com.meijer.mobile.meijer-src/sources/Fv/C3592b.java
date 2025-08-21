package Fv;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\bH\u0000¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"", "token", "", "c", "(B)Ljava/lang/String;", "", "a", "(C)B", "", "b", "(I)C", "kotlinx-serialization-json"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* renamed from: Fv.b, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C3592b {
    public static final String c(byte b10) {
        return b10 == 1 ? "quotation mark '\"'" : b10 == 2 ? "string escape sequence '\\'" : b10 == 4 ? "comma ','" : b10 == 5 ? "colon ':'" : b10 == 6 ? "start of the object '{'" : b10 == 7 ? "end of the object '}'" : b10 == 8 ? "start of the array '['" : b10 == 9 ? "end of the array ']'" : b10 == 10 ? "end of the input" : b10 == Byte.MAX_VALUE ? "invalid token" : "valid token";
    }

    public static final byte a(char c10) {
        if (c10 < '~') {
            return C3599i.CHAR_TO_TOKEN[c10];
        }
        return (byte) 0;
    }

    public static final char b(int i10) {
        if (i10 < 117) {
            return C3599i.ESCAPE_2_CHAR[i10];
        }
        return (char) 0;
    }
}
