package Fv;

import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0019\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"LFv/P;", "LFv/N;", "LFv/v;", "reader", "", "buffer", "<init>", "(LFv/v;[C)V", "", "position", "Lkotlin/Pair;", "", "W", "(I)Lkotlin/Pair;", "X", "(I)I", "", "expected", "", "l", "(C)V", "e", "()Z", "", "j", "()B", "G", "K", "()I", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class P extends N {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(InterfaceC3611v reader, char[] buffer) {
        super(reader, buffer);
        Intrinsics.j(reader, "reader");
        Intrinsics.j(buffer, "buffer");
    }

    private final Pair<Integer, Boolean> W(int position) {
        int i10 = position + 2;
        char cCharAt = getSource().charAt(position + 1);
        if (cCharAt != '*') {
            if (cCharAt != '/') {
                return TuplesKt.a(Integer.valueOf(position), Boolean.FALSE);
            }
            int I10 = i10;
            while (position != -1) {
                int iP0 = StringsKt.p0(getSource(), '\n', I10, false, 4, null);
                if (iP0 != -1) {
                    return TuplesKt.a(Integer.valueOf(iP0 + 1), Boolean.TRUE);
                }
                I10 = I(getSource().length());
                position = I10;
            }
            return TuplesKt.a(-1, Boolean.TRUE);
        }
        boolean z10 = false;
        int iX = i10;
        while (position != -1) {
            int iQ0 = StringsKt.q0(getSource(), "*/", iX, false, 4, null);
            if (iQ0 != -1) {
                return TuplesKt.a(Integer.valueOf(iQ0 + 2), Boolean.TRUE);
            }
            if (getSource().charAt(getSource().length() - 1) == '*') {
                iX = X(getSource().length() - 1);
                if (z10) {
                    break;
                }
                z10 = true;
            } else {
                iX = I(getSource().length());
            }
            position = iX;
        }
        this.currentPosition = getSource().length();
        JsonReader.x(this, "Expected end of the block comment: \"*/\", but had EOF instead", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    @Override // Fv.N, Fv.JsonReader
    public int K() {
        int I10;
        int i10 = this.currentPosition;
        while (true) {
            I10 = I(i10);
            if (I10 == -1) {
                break;
            }
            char cCharAt = getSource().charAt(I10);
            if (cCharAt == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t') {
                i10 = I10 + 1;
            } else {
                if (cCharAt != '/' || I10 + 1 >= getSource().length()) {
                    break;
                }
                Pair<Integer, Boolean> pairW = W(I10);
                int iIntValue = pairW.a().intValue();
                if (!pairW.b().booleanValue()) {
                    I10 = iIntValue;
                    break;
                }
                i10 = iIntValue;
            }
        }
        this.currentPosition = I10;
        return I10;
    }

    private final int X(int position) {
        if (getSource().length() - position > this.threshold) {
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
    public byte G() {
        u();
        C3594d source = getSource();
        int iK = K();
        if (iK < source.length() && iK != -1) {
            this.currentPosition = iK;
            return C3592b.a(source.charAt(iK));
        }
        return (byte) 10;
    }

    @Override // Fv.N, Fv.JsonReader
    public boolean e() {
        u();
        int iK = K();
        if (iK < getSource().length() && iK != -1) {
            return E(getSource().charAt(iK));
        }
        return false;
    }

    @Override // Fv.N, Fv.JsonReader
    public byte j() {
        u();
        C3594d source = getSource();
        int iK = K();
        if (iK < source.length() && iK != -1) {
            this.currentPosition = iK + 1;
            return C3592b.a(source.charAt(iK));
        }
        return (byte) 10;
    }

    @Override // Fv.N, Fv.JsonReader
    public void l(char expected) {
        u();
        C3594d source = getSource();
        int iK = K();
        if (iK >= source.length() || iK == -1) {
            this.currentPosition = -1;
            Q(expected);
        }
        char cCharAt = source.charAt(iK);
        this.currentPosition = iK + 1;
        if (cCharAt == expected) {
            return;
        }
        Q(expected);
    }
}
