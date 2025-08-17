package fsimpl;

import com.fullstory.instrumentation.init.Initialization;
import com.fullstory.rust.RustInterface;
import com.fullstory.util.Log;
import com.google.maps.internal.HttpHeaders;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.security.GeneralSecurityException;

/* renamed from: fsimpl.eh, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C14063eh implements InterfaceC14069en {

    /* renamed from: a, reason: collision with root package name */
    private final RustInterface f132139a;

    public C14063eh(RustInterface rustInterface) {
        this.f132139a = rustInterface;
    }

    private HttpURLConnection a(URL url) throws ProtocolException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("Content-Type", "application/octet-stream");
        httpURLConnection.setRequestProperty("charset", "utf-8");
        httpURLConnection.setRequestProperty(HttpHeaders.USER_AGENT, Initialization.f64338a);
        httpURLConnection.setUseCaches(false);
        return httpURLConnection;
    }

    private void a(InputStream inputStream) {
        if (inputStream == null) {
            return;
        }
        while (inputStream.read(new byte[1024]) != -1) {
        }
    }

    private void a(HttpURLConnection httpURLConnection, long j10, long j11) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        int responseCode = httpURLConnection.getResponseCode();
        fS.a(this.f132139a, httpURLConnection, j10, j11, responseCode);
        if (responseCode != 200) {
            InputStream errorStream = httpURLConnection.getErrorStream();
            try {
                a(errorStream);
                if (errorStream != null) {
                    errorStream.close();
                }
                throw new C14068em(httpURLConnection.getResponseCode(), "Didn't get a 200 response: " + httpURLConnection.getResponseCode() + " " + httpURLConnection.getResponseMessage());
            } catch (Throwable th2) {
                if (errorStream != null) {
                    try {
                        errorStream.close();
                    } catch (Throwable th3) {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
                    }
                }
                throw th2;
            }
        }
        InputStream inputStream = httpURLConnection.getInputStream();
        try {
            a(inputStream);
            if (inputStream != null) {
                inputStream.close();
            }
        } catch (Throwable th4) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable th5) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th4, th5);
                }
            }
            throw th4;
        }
    }

    @Override // fsimpl.InterfaceC14069en
    public void a(File file, String str, URL url, String str2, boolean z10) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        OutputStream outputStream;
        long jB;
        long jNanoTime = System.nanoTime();
        HttpURLConnection httpURLConnectionA = a(url);
        if (str2 != null) {
            httpURLConnectionA.setRequestProperty("Content-Type", str2);
        }
        if (z10) {
            AbstractC14097fo abstractC14097foA = C14096fn.a();
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    outputStream = httpURLConnectionA.getOutputStream();
                    try {
                        Log.d("Uploading encrypted bytes from " + file.getName() + " to " + url);
                        jB = abstractC14097foA.b(fileInputStream, outputStream);
                        Log.d("Uploaded " + jB + " bytes from " + file.getName() + " to " + url);
                        if (outputStream != null) {
                            outputStream.close();
                        }
                        fileInputStream.close();
                    } finally {
                        if (outputStream == null) {
                            throw th;
                        }
                        try {
                            outputStream.close();
                            throw th;
                        } catch (Throwable th2) {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                        }
                    }
                } finally {
                }
            } catch (GeneralSecurityException e10) {
                Log.d("Unable to read encrypted file, aborting without rethrowing", e10);
                return;
            } catch (Throwable th3) {
                Log.d("Unable to read encrypted file", th3);
                throw new IOException("Unable to read encrypted file", th3);
            }
        } else {
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                FileChannel channel = fileInputStream2.getChannel();
                try {
                    outputStream = httpURLConnectionA.getOutputStream();
                    try {
                        long length = file.length();
                        Log.d("Uploading " + length + " bytes from " + file.getName() + " to " + url);
                        channel.transferTo(0L, length, Channels.newChannel(outputStream));
                        if (outputStream != null) {
                            outputStream.close();
                        }
                        if (channel != null) {
                            channel.close();
                        }
                        fileInputStream2.close();
                        jB = length;
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        }
        a(httpURLConnectionA, jB, jNanoTime);
    }
}
