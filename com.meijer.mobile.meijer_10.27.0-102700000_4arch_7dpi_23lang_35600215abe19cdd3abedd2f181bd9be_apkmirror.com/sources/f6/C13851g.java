package f6;

import Q5.t;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

/* renamed from: f6.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C13851g {
    public static String a(InputStream inputStream) throws IOException {
        if (inputStream == null) {
            return null;
        }
        try {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i10 = inputStream.read(bArr, 0, 1024);
                        if (i10 == -1) {
                            String str = new String(byteArrayOutputStream.toByteArray(), StandardCharsets.UTF_8);
                            byteArrayOutputStream.close();
                            try {
                                inputStream.close();
                                return str;
                            } catch (IOException e10) {
                                t.e("MobileCore", "StreamUtils", "Unable to close InputStream," + e10.getLocalizedMessage(), new Object[0]);
                                return str;
                            }
                        }
                        byteArrayOutputStream.write(bArr, 0, i10);
                    }
                } catch (Throwable th2) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (IOException e11) {
                t.e("MobileCore", "StreamUtils", "Unable to convert InputStream to String," + e11.getLocalizedMessage(), new Object[0]);
                try {
                    inputStream.close();
                } catch (IOException e12) {
                    t.e("MobileCore", "StreamUtils", "Unable to close InputStream," + e12.getLocalizedMessage(), new Object[0]);
                }
                return null;
            }
        } catch (Throwable th4) {
            try {
                inputStream.close();
            } catch (IOException e13) {
                t.e("MobileCore", "StreamUtils", "Unable to close InputStream," + e13.getLocalizedMessage(), new Object[0]);
            }
            throw th4;
        }
    }
}
