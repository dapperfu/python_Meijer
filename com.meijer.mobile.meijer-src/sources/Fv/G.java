package Fv;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\f\n\u0002\b\n\n\u0002\u0010\u0019\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001e\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001f\u0010\u0003J\u000f\u0010 \u001a\u00020\u0007H\u0016¢\u0006\u0004\b \u0010!R\u0016\u0010$\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010#R\u0016\u0010&\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010%¨\u0006'"}, d2 = {"LFv/G;", "LFv/x;", "<init>", "()V", "", "firstEscapedChar", "currentSize", "", "string", "", "d", "(IILjava/lang/String;)V", "expected", "e", "(I)V", "oldSize", "additional", "f", "(II)I", "", "value", "writeLong", "(J)V", "", "char", "a", "(C)V", "text", "c", "(Ljava/lang/String;)V", "b", "g", "toString", "()Ljava/lang/String;", "", "[C", "array", "I", "size", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class G implements InterfaceC3613x {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private char[] array = C3596f.f11043c.d();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int size;

    private final int f(int oldSize, int additional) {
        int i10 = additional + oldSize;
        char[] cArr = this.array;
        if (cArr.length <= i10) {
            char[] cArrCopyOf = Arrays.copyOf(cArr, RangesKt.f(i10, oldSize * 2));
            Intrinsics.i(cArrCopyOf, "copyOf(...)");
            this.array = cArrCopyOf;
        }
        return oldSize;
    }

    @Override // Fv.InterfaceC3613x
    public void a(char c10) {
        e(1);
        char[] cArr = this.array;
        int i10 = this.size;
        this.size = i10 + 1;
        cArr[i10] = c10;
    }

    private final void e(int expected) {
        f(this.size, expected);
    }

    @Override // Fv.InterfaceC3613x
    public void b(String text) {
        Intrinsics.j(text, "text");
        e(text.length() + 2);
        char[] cArr = this.array;
        int i10 = this.size;
        int i11 = i10 + 1;
        cArr[i10] = '\"';
        int length = text.length();
        text.getChars(0, length, cArr, i11);
        int i12 = length + i11;
        for (int i13 = i11; i13 < i12; i13++) {
            char c10 = cArr[i13];
            if (c10 < X.a().length && X.a()[c10] != 0) {
                d(i13 - i11, i13, text);
                return;
            }
        }
        cArr[i12] = '\"';
        this.size = i12 + 1;
    }

    @Override // Fv.InterfaceC3613x
    public void c(String text) {
        Intrinsics.j(text, "text");
        int length = text.length();
        if (length == 0) {
            return;
        }
        e(length);
        text.getChars(0, text.length(), this.array, this.size);
        this.size += length;
    }

    public void g() {
        C3596f.f11043c.c(this.array);
    }

    public String toString() {
        return new String(this.array, 0, this.size);
    }

    private final void d(int firstEscapedChar, int currentSize, String string) {
        byte b10;
        int length = string.length();
        while (firstEscapedChar < length) {
            int iF = f(currentSize, 2);
            char cCharAt = string.charAt(firstEscapedChar);
            if (cCharAt >= X.a().length || (b10 = X.a()[cCharAt]) == 0) {
                int i10 = iF + 1;
                this.array[iF] = cCharAt;
                currentSize = i10;
                firstEscapedChar++;
            } else {
                if (b10 == 1) {
                    String str = X.b()[cCharAt];
                    Intrinsics.g(str);
                    int iF2 = f(iF, str.length());
                    str.getChars(0, str.length(), this.array, iF2);
                    currentSize = iF2 + str.length();
                    this.size = currentSize;
                } else {
                    char[] cArr = this.array;
                    cArr[iF] = '\\';
                    cArr[iF + 1] = (char) b10;
                    currentSize = iF + 2;
                    this.size = currentSize;
                }
                firstEscapedChar++;
            }
        }
        int iF3 = f(currentSize, 1);
        this.array[iF3] = '\"';
        this.size = iF3 + 1;
    }

    @Override // Fv.InterfaceC3613x
    public void writeLong(long value) {
        c(String.valueOf(value));
    }
}
