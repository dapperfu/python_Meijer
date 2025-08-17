package j$.net;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;
import java.util.BitSet;

/* loaded from: classes3.dex */
public class URLDecoder {
    public static boolean b(char c10) {
        if ('0' <= c10 && c10 <= '9') {
            return true;
        }
        if ('a' > c10 || c10 > 'f') {
            return 'A' <= c10 && c10 <= 'F';
        }
        return true;
    }

    static {
        BitSet bitSet = URLEncoder.f138593a;
    }

    public static String decode(String str, String str2) throws UnsupportedEncodingException {
        if (str2.isEmpty()) {
            throw new UnsupportedEncodingException("URLDecoder: empty string enc parameter");
        }
        try {
            return a(str, Charset.forName(str2));
        } catch (IllegalCharsetNameException | UnsupportedCharsetException unused) {
            throw new UnsupportedEncodingException(str2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b5, code lost:
    
        throw new java.lang.IllegalArgumentException("URLDecoder: Illegal hex characters in escape (%) pattern : " + r12.substring(r4, r4 + 3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b6, code lost:
    
        if (r4 >= r0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b8, code lost:
    
        if (r6 == '%') goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c2, code lost:
    
        throw new java.lang.IllegalArgumentException("URLDecoder: Incomplete trailing escape (%) pattern");
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c3, code lost:
    
        r1.append(new java.lang.String(r3, 0, r5, r13));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(java.lang.String r12, java.nio.charset.Charset r13) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.net.URLDecoder.a(java.lang.String, java.nio.charset.Charset):java.lang.String");
    }
}
