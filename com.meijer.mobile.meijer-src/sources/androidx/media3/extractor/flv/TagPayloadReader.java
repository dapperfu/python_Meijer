package androidx.media3.extractor.flv;

import androidx.media3.common.ParserException;
import d3.D;
import x3.O;

/* loaded from: classes.dex */
abstract class TagPayloadReader {

    /* renamed from: a, reason: collision with root package name */
    protected final O f57511a;

    public static final class UnsupportedFormatException extends ParserException {
        public UnsupportedFormatException(String str) {
            super(str, null, false, 1);
        }
    }

    protected abstract boolean b(D d10) throws ParserException;

    protected abstract boolean c(D d10, long j10) throws ParserException;

    protected TagPayloadReader(O o10) {
        this.f57511a = o10;
    }

    public final boolean a(D d10, long j10) throws ParserException {
        if (b(d10) && c(d10, j10)) {
            return true;
        }
        return false;
    }
}
