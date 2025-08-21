package Fv;

import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\bJ\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"LFv/W;", "LFv/U;", "", "source", "<init>", "(Ljava/lang/String;)V", "", "j", "()B", "", "e", "()Z", "", "expected", "", "l", "(C)V", "G", "", "K", "()I", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class W extends U {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(String source) {
        super(source);
        Intrinsics.j(source, "source");
    }

    @Override // Fv.U, Fv.JsonReader
    public int K() {
        int i10;
        int iP0 = this.currentPosition;
        if (iP0 == -1) {
            return iP0;
        }
        String strD = D();
        while (iP0 < strD.length()) {
            char cCharAt = strD.charAt(iP0);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                if (cCharAt != '/' || (i10 = iP0 + 1) >= strD.length()) {
                    break;
                }
                char cCharAt2 = strD.charAt(i10);
                if (cCharAt2 == '*') {
                    int iQ0 = StringsKt.q0(strD, "*/", iP0 + 2, false, 4, null);
                    if (iQ0 == -1) {
                        this.currentPosition = strD.length();
                        JsonReader.x(this, "Expected end of the block comment: \"*/\", but had EOF instead", 0, null, 6, null);
                        throw new KotlinNothingValueException();
                    }
                    iP0 = iQ0 + 2;
                } else {
                    if (cCharAt2 != '/') {
                        break;
                    }
                    iP0 = StringsKt.p0(strD, '\n', iP0 + 2, false, 4, null);
                    iP0 = iP0 == -1 ? strD.length() : iP0 + 1;
                }
            }
        }
        this.currentPosition = iP0;
        return iP0;
    }

    @Override // Fv.JsonReader
    public byte G() {
        String strD = D();
        int iK = K();
        if (iK < strD.length() && iK != -1) {
            this.currentPosition = iK;
            return C3592b.a(strD.charAt(iK));
        }
        return (byte) 10;
    }

    @Override // Fv.U, Fv.JsonReader
    public boolean e() {
        int iK = K();
        if (iK < D().length() && iK != -1) {
            return E(D().charAt(iK));
        }
        return false;
    }

    @Override // Fv.U, Fv.JsonReader
    public byte j() {
        String strD = D();
        int iK = K();
        if (iK < strD.length() && iK != -1) {
            this.currentPosition = iK + 1;
            return C3592b.a(strD.charAt(iK));
        }
        return (byte) 10;
    }

    @Override // Fv.U, Fv.JsonReader
    public void l(char expected) {
        String strD = D();
        int iK = K();
        if (iK >= strD.length() || iK == -1) {
            this.currentPosition = -1;
            Q(expected);
        }
        char cCharAt = strD.charAt(iK);
        this.currentPosition = iK + 1;
        if (cCharAt == expected) {
            return;
        }
        Q(expected);
    }
}
