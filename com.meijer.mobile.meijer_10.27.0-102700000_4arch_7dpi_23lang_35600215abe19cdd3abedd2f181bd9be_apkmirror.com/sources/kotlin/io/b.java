package kotlin.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a#\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\b\u0010\t\u001a#\u0010\u000b\u001a\u00020\u0007*\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u001b\u0010\u000f\u001a\n \u000e*\u0004\u0018\u00010\r0\r*\u00020\u0001H\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Ljava/io/File;", "Ljava/nio/charset/Charset;", "charset", "", "e", "(Ljava/io/File;Ljava/nio/charset/Charset;)Ljava/lang/String;", "text", "", "g", "(Ljava/io/File;Ljava/lang/String;Ljava/nio/charset/Charset;)V", "Ljava/io/OutputStream;", "i", "(Ljava/io/OutputStream;Ljava/lang/String;Ljava/nio/charset/Charset;)V", "Ljava/nio/charset/CharsetEncoder;", "kotlin.jvm.PlatformType", "d", "(Ljava/nio/charset/Charset;)Ljava/nio/charset/CharsetEncoder;", "", "chunkSize", "encoder", "Ljava/nio/ByteBuffer;", "c", "(ILjava/nio/charset/CharsetEncoder;)Ljava/nio/ByteBuffer;", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/io/FilesKt")
@SourceDebugExtension
/* loaded from: classes6.dex */
public class b extends a {
    public static final ByteBuffer c(int i10, CharsetEncoder encoder) {
        Intrinsics.j(encoder, "encoder");
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i10 * ((int) Math.ceil(encoder.maxBytesPerChar())));
        Intrinsics.i(byteBufferAllocate, "allocate(...)");
        return byteBufferAllocate;
    }

    public static final CharsetEncoder d(Charset charset) {
        Intrinsics.j(charset, "<this>");
        CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        return charsetEncoderNewEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
    }

    public static final String e(File file, Charset charset) {
        Intrinsics.j(file, "<this>");
        Intrinsics.j(charset, "charset");
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        try {
            String strD = TextStreamsKt.d(inputStreamReader);
            CloseableKt.a(inputStreamReader, null);
            return strD;
        } finally {
        }
    }

    public static /* synthetic */ String f(File file, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        return e(file, charset);
    }

    public static final void g(File file, String text, Charset charset) {
        Intrinsics.j(file, "<this>");
        Intrinsics.j(text, "text");
        Intrinsics.j(charset, "charset");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            i(fileOutputStream, text, charset);
            Unit unit = Unit.f142422a;
            CloseableKt.a(fileOutputStream, null);
        } finally {
        }
    }

    public static /* synthetic */ void h(File file, String str, Charset charset, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            charset = Charsets.UTF_8;
        }
        g(file, str, charset);
    }

    public static final void i(OutputStream outputStream, String text, Charset charset) throws IOException {
        Intrinsics.j(outputStream, "<this>");
        Intrinsics.j(text, "text");
        Intrinsics.j(charset, "charset");
        if (text.length() < 16384) {
            byte[] bytes = text.getBytes(charset);
            Intrinsics.i(bytes, "getBytes(...)");
            outputStream.write(bytes);
            return;
        }
        CharsetEncoder charsetEncoderD = d(charset);
        CharBuffer charBufferAllocate = CharBuffer.allocate(8192);
        Intrinsics.g(charsetEncoderD);
        ByteBuffer byteBufferC = c(8192, charsetEncoderD);
        int i10 = 0;
        int i11 = 0;
        while (i10 < text.length()) {
            int iMin = Math.min(8192 - i11, text.length() - i10);
            int i12 = i10 + iMin;
            char[] cArrArray = charBufferAllocate.array();
            Intrinsics.i(cArrArray, "array(...)");
            text.getChars(i10, i12, cArrArray, i11);
            charBufferAllocate.limit(iMin + i11);
            i11 = 1;
            if (!charsetEncoderD.encode(charBufferAllocate, byteBufferC, i12 == text.length()).isUnderflow()) {
                throw new IllegalStateException("Check failed.");
            }
            outputStream.write(byteBufferC.array(), 0, byteBufferC.position());
            if (charBufferAllocate.position() != charBufferAllocate.limit()) {
                charBufferAllocate.put(0, charBufferAllocate.get());
            } else {
                i11 = 0;
            }
            charBufferAllocate.clear();
            byteBufferC.clear();
            i10 = i12;
        }
    }
}
