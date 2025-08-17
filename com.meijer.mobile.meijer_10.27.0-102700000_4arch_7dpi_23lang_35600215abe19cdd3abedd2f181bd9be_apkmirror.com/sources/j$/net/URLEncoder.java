package j$.net;

import fsimpl.C14045dq;
import java.io.CharArrayWriter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;
import java.util.BitSet;
import java.util.Objects;

/* loaded from: classes3.dex */
public class URLEncoder {

    /* renamed from: a, reason: collision with root package name */
    public static final BitSet f138593a = new BitSet(256);

    static {
        for (int i10 = 97; i10 <= 122; i10++) {
            f138593a.set(i10);
        }
        for (int i11 = 65; i11 <= 90; i11++) {
            f138593a.set(i11);
        }
        for (int i12 = 48; i12 <= 57; i12++) {
            f138593a.set(i12);
        }
        BitSet bitSet = f138593a;
        bitSet.set(32);
        bitSet.set(45);
        bitSet.set(95);
        bitSet.set(46);
        bitSet.set(42);
        if (System.getSecurityManager() == null) {
            System.getProperty("file.encoding");
        }
    }

    public static String encode(String str, String str2) throws UnsupportedEncodingException {
        if (str2 == null) {
            throw new NullPointerException("charsetName");
        }
        try {
            return encode(str, Charset.forName(str2));
        } catch (IllegalCharsetNameException | UnsupportedCharsetException unused) {
            throw new UnsupportedEncodingException(str2);
        }
    }

    public static String encode(String str, Charset charset) {
        BitSet bitSet;
        int i10;
        char cCharAt;
        Objects.requireNonNull(charset, "charset");
        StringBuilder sb2 = new StringBuilder(str.length());
        CharArrayWriter charArrayWriter = new CharArrayWriter();
        int i11 = 0;
        boolean z10 = false;
        while (i11 < str.length()) {
            char cCharAt2 = str.charAt(i11);
            if (f138593a.get(cCharAt2)) {
                if (cCharAt2 == ' ') {
                    cCharAt2 = '+';
                    z10 = true;
                }
                sb2.append(cCharAt2);
                i11++;
            } else {
                do {
                    charArrayWriter.write(cCharAt2);
                    if (cCharAt2 >= 55296 && cCharAt2 <= 56319 && (i10 = i11 + 1) < str.length() && (cCharAt = str.charAt(i10)) >= 56320 && cCharAt <= 57343) {
                        charArrayWriter.write(cCharAt);
                        i11 = i10;
                    }
                    i11++;
                    if (i11 >= str.length()) {
                        break;
                    }
                    bitSet = f138593a;
                    cCharAt2 = str.charAt(i11);
                } while (!bitSet.get(cCharAt2));
                charArrayWriter.flush();
                byte[] bytes = new String(charArrayWriter.toCharArray()).getBytes(charset);
                for (int i12 = 0; i12 < bytes.length; i12++) {
                    sb2.append('%');
                    char cForDigit = Character.forDigit((bytes[i12] >> 4) & 15, 16);
                    if (Character.isLetter(cForDigit)) {
                        cForDigit = (char) (cForDigit - ' ');
                    }
                    sb2.append(cForDigit);
                    char cForDigit2 = Character.forDigit(bytes[i12] & C14045dq.MULTIPLY, 16);
                    if (Character.isLetter(cForDigit2)) {
                        cForDigit2 = (char) (cForDigit2 - ' ');
                    }
                    sb2.append(cForDigit2);
                }
                charArrayWriter.reset();
                z10 = true;
            }
        }
        return z10 ? sb2.toString() : str;
    }
}
