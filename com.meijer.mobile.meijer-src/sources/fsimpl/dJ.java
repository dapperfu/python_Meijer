package fsimpl;

import com.fullstory.instrumentation.init.Initialization;
import com.fullstory.util.Log;
import com.google.maps.internal.HttpHeaders;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;

/* loaded from: classes15.dex */
public class dJ {
    public static dK a(byte[] bArr, String str, String str2) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setRequestProperty("Content-Type", str2);
            httpURLConnection.setRequestProperty("charset", "utf-8");
            httpURLConnection.setRequestProperty(HttpHeaders.USER_AGENT, Initialization.f65178a);
            httpURLConnection.setUseCaches(false);
            if (bArr.length > 0) {
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setRequestMethod("POST");
                OutputStream outputStream = httpURLConnection.getOutputStream();
                try {
                    Channels.newChannel(outputStream).write(ByteBuffer.wrap(bArr));
                    if (outputStream != null) {
                        outputStream.close();
                    }
                } finally {
                }
            } else {
                httpURLConnection.setRequestMethod("GET");
            }
            int responseCode = httpURLConnection.getResponseCode();
            InputStream inputStream = httpURLConnection.getInputStream();
            try {
                dN dNVar = new dN(responseCode, a(inputStream));
                if (inputStream != null) {
                    inputStream.close();
                }
                return dNVar;
            } finally {
            }
        } catch (Throwable th2) {
            Log.v("HTTP exception", th2);
            return new dM(th2);
        }
    }

    private static byte[] a(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int i10 = inputStream.read(bArr);
            if (i10 == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i10);
        }
    }
}
