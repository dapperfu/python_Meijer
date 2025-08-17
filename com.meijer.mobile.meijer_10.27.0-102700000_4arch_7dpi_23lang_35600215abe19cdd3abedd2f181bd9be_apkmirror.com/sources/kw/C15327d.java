package kw;

import java.io.EOFException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0003¨\u0006\u0010"}, d2 = {"Lkw/d;", "Lkw/I;", "<init>", "()V", "Lkw/e;", "source", "", "byteCount", "", "M1", "(Lkw/e;J)V", "flush", "Lkw/K;", "timeout", "()Lkw/K;", "close", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: kw.d, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
final class C15327d implements I {
    @Override // kw.I, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // kw.I, java.io.Flushable
    public void flush() {
    }

    @Override // kw.I
    public void M1(C15328e source, long byteCount) throws EOFException {
        Intrinsics.j(source, "source");
        source.skip(byteCount);
    }

    @Override // kw.I
    /* renamed from: timeout */
    public K getF148079a() {
        return K.f148056e;
    }
}
