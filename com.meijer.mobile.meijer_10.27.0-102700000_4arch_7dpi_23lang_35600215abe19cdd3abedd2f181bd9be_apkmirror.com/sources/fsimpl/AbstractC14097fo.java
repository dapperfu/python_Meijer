package fsimpl;

import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.security.GeneralSecurityException;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.spec.GCMParameterSpec;

/* renamed from: fsimpl.fo, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public abstract class AbstractC14097fo {

    /* renamed from: a, reason: collision with root package name */
    protected final Key f132271a;

    AbstractC14097fo(Key key) {
        this.f132271a = key;
    }

    private static int a(ReadableByteChannel readableByteChannel, WritableByteChannel writableByteChannel) throws IOException {
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(RecyclerView.m.FLAG_MOVED);
        int i10 = 0;
        while (true) {
            int i11 = readableByteChannel.read(byteBufferAllocateDirect);
            if (i11 == -1) {
                break;
            }
            i10 += i11;
            byteBufferAllocateDirect.flip();
            writableByteChannel.write(byteBufferAllocateDirect);
            byteBufferAllocateDirect.compact();
        }
        byteBufferAllocateDirect.flip();
        while (byteBufferAllocateDirect.hasRemaining()) {
            writableByteChannel.write(byteBufferAllocateDirect);
        }
        return i10;
    }

    private int a(Cipher cipher) {
        return ((GCMParameterSpec) cipher.getParameters().getParameterSpec(GCMParameterSpec.class)).getTLen();
    }

    private InputStream a(InputStream inputStream) throws GeneralSecurityException {
        try {
            int i10 = inputStream.read();
            if (i10 != 0) {
                throw new GeneralSecurityException("Unsupported encryption version " + i10);
            }
            int i11 = inputStream.read() * 8;
            if (i11 < 1) {
                throw new GeneralSecurityException("Invalid tag length: " + i11);
            }
            int i12 = inputStream.read();
            if (i12 < 1) {
                throw new GeneralSecurityException("Invalid iv length: " + i12);
            }
            byte[] bArr = new byte[i12];
            int i13 = inputStream.read(bArr);
            if (i13 != i12) {
                throw new GeneralSecurityException("Unable to read full iv length of " + i12 + ", only read " + i13);
            }
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(2, a(), new GCMParameterSpec(i11, bArr));
            return new CipherInputStream(inputStream, cipher);
        } catch (GeneralSecurityException e10) {
            throw e10;
        } catch (Throwable th2) {
            throw new GeneralSecurityException("Exception initializing decryption stream", th2);
        }
    }

    private OutputStream a(OutputStream outputStream) throws GeneralSecurityException {
        try {
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(1, a(), C14096fn.f132268a);
            byte[] iv2 = cipher.getIV();
            int length = iv2.length;
            if (length < 1) {
                throw new GeneralSecurityException("Invalid iv length: " + length);
            }
            int iA = a(cipher);
            outputStream.write(0);
            outputStream.write(iA / 8);
            outputStream.write(length);
            outputStream.write(iv2);
            outputStream.flush();
            return new CipherOutputStream(outputStream, cipher);
        } catch (GeneralSecurityException e10) {
            throw e10;
        } catch (Throwable th2) {
            throw new GeneralSecurityException("Exception initializing encryption stream", th2);
        }
    }

    public int a(InputStream inputStream, OutputStream outputStream) throws IllegalAccessException, GeneralSecurityException, IOException, IllegalArgumentException, InvocationTargetException {
        OutputStream outputStreamA = a(outputStream);
        try {
            int iA = a(Channels.newChannel(inputStream), Channels.newChannel(outputStreamA));
            if (outputStreamA != null) {
                outputStreamA.close();
            }
            return iA;
        } catch (Throwable th2) {
            if (outputStreamA != null) {
                try {
                    outputStreamA.close();
                } catch (Throwable th3) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
                }
            }
            throw th2;
        }
    }

    protected Key a() {
        return this.f132271a;
    }

    public int b(InputStream inputStream, OutputStream outputStream) throws IllegalAccessException, GeneralSecurityException, IOException, IllegalArgumentException, InvocationTargetException {
        InputStream inputStreamA = a(inputStream);
        try {
            int iA = a(Channels.newChannel(inputStreamA), Channels.newChannel(outputStream));
            if (inputStreamA != null) {
                inputStreamA.close();
            }
            return iA;
        } catch (Throwable th2) {
            if (inputStreamA != null) {
                try {
                    inputStreamA.close();
                } catch (Throwable th3) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
                }
            }
            throw th2;
        }
    }
}
