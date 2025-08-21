package z1;

import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u0019\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001e\u001a\u00020\f2\n\u0010\u001d\u001a\u00060\u001bj\u0002`\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u0004¢\u0006\u0004\b \u0010\nJ\u000f\u0010!\u001a\u00020\u0017H\u0016¢\u0006\u0004\b!\u0010\"R\u0016\u0010$\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010#R\u0016\u0010&\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010%R\u0016\u0010'\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010#R\u0016\u0010(\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010#¨\u0006)"}, d2 = {"Lz1/o;", "", "", "initBuffer", "", "initGapStart", "initGapEnd", "<init>", "([CII)V", "c", "()I", "requestSize", "", "f", "(I)V", "start", "end", "b", "(II)V", "index", "", "d", "(I)C", "", "text", "g", "(IILjava/lang/String;)V", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "builder", "a", "(Ljava/lang/StringBuilder;)V", "e", "toString", "()Ljava/lang/String;", "I", "capacity", "[C", "buffer", "gapStart", "gapEnd", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: z1.o, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C18432o {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int capacity;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private char[] buffer;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int gapStart;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int gapEnd;

    private final void b(int start, int end) {
        int i10 = this.gapStart;
        if (start < i10 && end <= i10) {
            int i11 = i10 - end;
            char[] cArr = this.buffer;
            ArraysKt.k(cArr, cArr, this.gapEnd - i11, end, i10);
            this.gapStart = start;
            this.gapEnd -= i11;
            return;
        }
        if (start < i10 && end >= i10) {
            this.gapEnd = end + c();
            this.gapStart = start;
            return;
        }
        int iC = start + c();
        int iC2 = end + c();
        int i12 = this.gapEnd;
        char[] cArr2 = this.buffer;
        ArraysKt.k(cArr2, cArr2, this.gapStart, i12, iC);
        this.gapStart += iC - i12;
        this.gapEnd = iC2;
    }

    private final int c() {
        return this.gapEnd - this.gapStart;
    }

    public final void a(StringBuilder builder) {
        builder.append(this.buffer, 0, this.gapStart);
        Intrinsics.i(builder, "append(...)");
        char[] cArr = this.buffer;
        int i10 = this.gapEnd;
        builder.append(cArr, i10, this.capacity - i10);
        Intrinsics.i(builder, "append(...)");
    }

    public final char d(int index) {
        int i10 = this.gapStart;
        return index < i10 ? this.buffer[index] : this.buffer[(index - i10) + this.gapEnd];
    }

    public final int e() {
        return this.capacity - c();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) sb2);
        return sb2.toString();
    }

    public C18432o(char[] cArr, int i10, int i11) {
        this.capacity = cArr.length;
        this.buffer = cArr;
        this.gapStart = i10;
        this.gapEnd = i11;
    }

    private final void f(int requestSize) {
        if (requestSize <= c()) {
            return;
        }
        int iC = requestSize - c();
        int i10 = this.capacity;
        do {
            i10 *= 2;
        } while (i10 - this.capacity < iC);
        char[] cArr = new char[i10];
        ArraysKt.k(this.buffer, cArr, 0, 0, this.gapStart);
        int i11 = this.capacity;
        int i12 = this.gapEnd;
        int i13 = i11 - i12;
        int i14 = i10 - i13;
        ArraysKt.k(this.buffer, cArr, i14, i12, i13 + i12);
        this.buffer = cArr;
        this.capacity = i10;
        this.gapEnd = i14;
    }

    public final void g(int start, int end, String text) {
        f(text.length() - (end - start));
        b(start, end);
        C18433p.b(text, this.buffer, this.gapStart);
        this.gapStart += text.length();
    }
}
