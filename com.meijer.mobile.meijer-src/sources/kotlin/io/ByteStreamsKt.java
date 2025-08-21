package kotlin.io;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\t\u001a\u00020\b*\u00020\u0000H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Ljava/io/InputStream;", "Ljava/io/OutputStream;", "out", "", "bufferSize", "", "a", "(Ljava/io/InputStream;Ljava/io/OutputStream;I)J", "", "c", "(Ljava/io/InputStream;)[B", "kotlin-stdlib"}, k = 2, mv = {2, 1, 0}, xi = 48)
@JvmName
/* loaded from: classes10.dex */
public final class ByteStreamsKt {
    public static final long a(InputStream inputStream, OutputStream out, int i10) throws IOException {
        Intrinsics.j(inputStream, "<this>");
        Intrinsics.j(out, "out");
        byte[] bArr = new byte[i10];
        int i11 = inputStream.read(bArr);
        long j10 = 0;
        while (i11 >= 0) {
            out.write(bArr, 0, i11);
            j10 += i11;
            i11 = inputStream.read(bArr);
        }
        return j10;
    }

    public static /* synthetic */ long b(InputStream inputStream, OutputStream outputStream, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 8192;
        }
        return a(inputStream, outputStream, i10);
    }

    @SinceKotlin
    public static final byte[] c(InputStream inputStream) {
        Intrinsics.j(inputStream, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
        b(inputStream, byteArrayOutputStream, 0, 2, null);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Intrinsics.i(byteArray, "toByteArray(...)");
        return byteArray;
    }
}
