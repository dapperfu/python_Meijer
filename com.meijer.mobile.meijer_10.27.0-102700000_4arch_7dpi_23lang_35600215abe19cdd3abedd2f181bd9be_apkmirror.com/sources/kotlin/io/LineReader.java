package kotlin.io;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u0019\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0018\u001a\u00060\u0014j\u0002`\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lkotlin/io/LineReader;", "", "<init>", "()V", "", "b", "[B", "bytes", "", "c", "[C", "chars", "Ljava/nio/ByteBuffer;", "d", "Ljava/nio/ByteBuffer;", "byteBuf", "Ljava/nio/CharBuffer;", "e", "Ljava/nio/CharBuffer;", "charBuf", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "f", "Ljava/lang/StringBuilder;", "sb", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class LineReader {

    /* renamed from: a, reason: collision with root package name */
    public static final LineReader f142725a = new LineReader();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final byte[] bytes;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final char[] chars;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final ByteBuffer byteBuf;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final CharBuffer charBuf;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static final StringBuilder sb;

    static {
        byte[] bArr = new byte[32];
        bytes = bArr;
        char[] cArr = new char[32];
        chars = cArr;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        Intrinsics.i(byteBufferWrap, "wrap(...)");
        byteBuf = byteBufferWrap;
        CharBuffer charBufferWrap = CharBuffer.wrap(cArr);
        Intrinsics.i(charBufferWrap, "wrap(...)");
        charBuf = charBufferWrap;
        sb = new StringBuilder();
    }

    private LineReader() {
    }
}
