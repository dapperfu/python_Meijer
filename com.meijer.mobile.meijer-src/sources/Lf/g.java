package Lf;

import android.util.Base64;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.UUID;

/* loaded from: classes8.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    private static final byte f18426a = Byte.parseByte("01110000", 2);

    /* renamed from: b, reason: collision with root package name */
    private static final byte f18427b = Byte.parseByte("00001111", 2);

    private static String b(byte[] bArr) {
        return new String(Base64.encode(bArr, 11), Charset.defaultCharset()).substring(0, 22);
    }

    private static byte[] c(UUID uuid, byte[] bArr) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        byteBufferWrap.putLong(uuid.getMostSignificantBits());
        byteBufferWrap.putLong(uuid.getLeastSignificantBits());
        return byteBufferWrap.array();
    }

    public String a() {
        byte[] bArrC = c(UUID.randomUUID(), new byte[17]);
        byte b10 = bArrC[0];
        bArrC[16] = b10;
        bArrC[0] = (byte) ((b10 & f18427b) | f18426a);
        return b(bArrC);
    }
}
