package Fv;

import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0019\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0010\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010#\u001a\u00020\b2\u0006\u0010!\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020\bH\u0016¢\u0006\u0004\b#\u0010$J\u001f\u0010&\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020\b2\u0006\u0010%\u001a\u00020\bH\u0016¢\u0006\u0004\b&\u0010'J\u001f\u0010*\u001a\u00020\n2\u0006\u0010(\u001a\u00020\b2\u0006\u0010)\u001a\u00020\bH\u0014¢\u0006\u0004\b*\u0010+J!\u0010.\u001a\u0004\u0018\u00010\u001e2\u0006\u0010,\u001a\u00020\u001e2\u0006\u0010-\u001a\u00020\rH\u0016¢\u0006\u0004\b.\u0010/J\r\u00100\u001a\u00020\n¢\u0006\u0004\b0\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u00101\u001a\u0004\b2\u00103R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0016\u00109\u001a\u00020\b8\u0004@\u0004X\u0085\u000e¢\u0006\u0006\n\u0004\b8\u0010\u0011R\u001a\u0010?\u001a\u00020:8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>¨\u0006@"}, d2 = {"LFv/N;", "LFv/a;", "LFv/v;", "reader", "", "buffer", "<init>", "(LFv/v;[C)V", "", "unprocessedCount", "", "U", "(I)V", "", "e", "()Z", "position", "I", "(I)I", "", "j", "()B", "", "expected", "l", "(C)V", "K", "()I", "u", "()V", "", "i", "()Ljava/lang/String;", "char", "startPos", "T", "(CI)I", "endPos", "L", "(II)Ljava/lang/String;", "fromIndex", "toIndex", "d", "(II)V", "keyToMatch", "isLenient", "F", "(Ljava/lang/String;Z)Ljava/lang/String;", "V", "LFv/v;", "getReader", "()LFv/v;", "f", "[C", "getBuffer", "()[C", "g", "threshold", "LFv/d;", "h", "LFv/d;", "S", "()LFv/d;", "source", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
public class N extends JsonReader {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC3611v reader;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final char[] buffer;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @JvmField
    protected int threshold;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final C3594d source;

    @Override // Fv.JsonReader
    public String F(String keyToMatch, boolean isLenient) {
        Intrinsics.j(keyToMatch, "keyToMatch");
        return null;
    }

    public N(InterfaceC3611v reader, char[] buffer) {
        Intrinsics.j(reader, "reader");
        Intrinsics.j(buffer, "buffer");
        this.reader = reader;
        this.buffer = buffer;
        this.threshold = 128;
        this.source = new C3594d(buffer);
        U(0);
    }

    @Override // Fv.JsonReader
    public int K() {
        int I10;
        char cCharAt;
        int i10 = this.currentPosition;
        while (true) {
            I10 = I(i10);
            if (I10 == -1 || !((cCharAt = getSource().charAt(I10)) == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t')) {
                break;
            }
            i10 = I10 + 1;
        }
        this.currentPosition = I10;
        return I10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Fv.JsonReader
    /* renamed from: S, reason: from getter */
    public C3594d getSource() {
        return this.source;
    }

    public final void V() {
        C3598h.f11046c.c(this.buffer);
    }

    @Override // Fv.JsonReader
    public String i() {
        l('\"');
        int i10 = this.currentPosition;
        int iT = T('\"', i10);
        if (iT == -1) {
            int I10 = I(i10);
            if (I10 != -1) {
                return p(getSource(), this.currentPosition, I10);
            }
            JsonReader.z(this, (byte) 1, false, 2, null);
            throw new KotlinNothingValueException();
        }
        for (int i11 = i10; i11 < iT; i11++) {
            if (getSource().charAt(i11) == '\\') {
                return p(getSource(), this.currentPosition, i11);
            }
        }
        this.currentPosition = iT + 1;
        return L(i10, iT);
    }

    @Override // Fv.JsonReader
    public void u() {
        int length = getSource().length() - this.currentPosition;
        if (length > this.threshold) {
            return;
        }
        U(length);
    }

    private final void U(int unprocessedCount) {
        char[] buffer = getSource().getBuffer();
        if (unprocessedCount != 0) {
            int i10 = this.currentPosition;
            ArraysKt.k(buffer, buffer, 0, i10, i10 + unprocessedCount);
        }
        int length = getSource().length();
        while (true) {
            if (unprocessedCount == length) {
                break;
            }
            int iA = this.reader.a(buffer, unprocessedCount, length - unprocessedCount);
            if (iA == -1) {
                getSource().f(unprocessedCount);
                this.threshold = -1;
                break;
            }
            unprocessedCount += iA;
        }
        this.currentPosition = 0;
    }

    @Override // Fv.JsonReader
    public int I(int position) {
        if (position < getSource().length()) {
            return position;
        }
        this.currentPosition = position;
        u();
        if (this.currentPosition == 0 && getSource().length() != 0) {
            return 0;
        }
        return -1;
    }

    @Override // Fv.JsonReader
    public String L(int startPos, int endPos) {
        return getSource().e(startPos, endPos);
    }

    public int T(char c10, int startPos) {
        C3594d source = getSource();
        int length = source.length();
        while (startPos < length) {
            if (source.charAt(startPos) == c10) {
                return startPos;
            }
            startPos++;
        }
        return -1;
    }

    @Override // Fv.JsonReader
    protected void d(int fromIndex, int toIndex) {
        StringBuilder escapedString = getEscapedString();
        escapedString.append(getSource().getBuffer(), fromIndex, toIndex - fromIndex);
        Intrinsics.i(escapedString, "append(...)");
    }

    @Override // Fv.JsonReader
    public boolean e() {
        u();
        int i10 = this.currentPosition;
        while (true) {
            int I10 = I(i10);
            if (I10 != -1) {
                char cCharAt = getSource().charAt(I10);
                if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                    this.currentPosition = I10;
                    return E(cCharAt);
                }
                i10 = I10 + 1;
            } else {
                this.currentPosition = I10;
                return false;
            }
        }
    }

    @Override // Fv.JsonReader
    public byte j() {
        u();
        C3594d source = getSource();
        int i10 = this.currentPosition;
        while (true) {
            int I10 = I(i10);
            if (I10 != -1) {
                int i11 = I10 + 1;
                byte bA = C3592b.a(source.charAt(I10));
                if (bA != 3) {
                    this.currentPosition = i11;
                    return bA;
                }
                i10 = i11;
            } else {
                this.currentPosition = I10;
                return (byte) 10;
            }
        }
    }

    @Override // Fv.JsonReader
    public void l(char expected) {
        u();
        C3594d source = getSource();
        int i10 = this.currentPosition;
        while (true) {
            int I10 = I(i10);
            if (I10 != -1) {
                int i11 = I10 + 1;
                char cCharAt = source.charAt(I10);
                if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                    this.currentPosition = i11;
                    if (cCharAt == expected) {
                        return;
                    } else {
                        Q(expected);
                    }
                }
                i10 = i11;
            } else {
                this.currentPosition = I10;
                Q(expected);
                return;
            }
        }
    }
}
