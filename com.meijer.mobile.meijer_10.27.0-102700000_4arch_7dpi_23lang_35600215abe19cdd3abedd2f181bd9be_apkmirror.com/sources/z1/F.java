package z1;

import com.medallia.digital.mobilesdk.l3;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\f\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0012\u001a\u0004\b\u0013\u0010\u0011\"\u0004\b\u0014\u0010\u0005R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0019R\u0016\u0010\u001c\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u0011\u0010\u001e\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u001d¨\u0006 "}, d2 = {"Lz1/F;", "", "", "text", "<init>", "(Ljava/lang/String;)V", "", "start", "end", "", "c", "(IILjava/lang/String;)V", "index", "", "a", "(I)C", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getText", "setText", "Lz1/o;", "b", "Lz1/o;", "buffer", "I", "bufStart", "d", "bufEnd", "()I", "length", "e", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class F {

    /* renamed from: f, reason: collision with root package name */
    public static final int f171415f = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private String text;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private C18369o buffer;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int bufStart = -1;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int bufEnd = -1;

    public final void c(int start, int end, String text) {
        if (!(start <= end)) {
            A1.a.a("start index must be less than or equal to end index: " + start + " > " + end);
        }
        if (!(start >= 0)) {
            A1.a.a("start must be non-negative, but was " + start);
        }
        C18369o c18369o = this.buffer;
        if (c18369o != null) {
            int i10 = this.bufStart;
            int i11 = start - i10;
            int i12 = end - i10;
            if (i11 >= 0 && i12 <= c18369o.e()) {
                c18369o.g(i11, i12, text);
                return;
            }
            this.text = toString();
            this.buffer = null;
            this.bufStart = -1;
            this.bufEnd = -1;
            c(start, end, text);
            return;
        }
        int iMax = Math.max(l3.f92484c, text.length() + 128);
        char[] cArr = new char[iMax];
        int iMin = Math.min(start, 64);
        int iMin2 = Math.min(this.text.length() - end, 64);
        int i13 = start - iMin;
        C18371q.a(this.text, cArr, 0, i13, start);
        int i14 = iMax - iMin2;
        int i15 = iMin2 + end;
        C18371q.a(this.text, cArr, i14, end, i15);
        C18370p.b(text, cArr, iMin);
        this.buffer = new C18369o(cArr, iMin + text.length(), i14);
        this.bufStart = i13;
        this.bufEnd = i15;
    }

    public final char a(int index) {
        C18369o c18369o = this.buffer;
        if (c18369o == null) {
            return this.text.charAt(index);
        }
        if (index < this.bufStart) {
            return this.text.charAt(index);
        }
        int iE = c18369o.e();
        int i10 = this.bufStart;
        return index < iE + i10 ? c18369o.d(index - i10) : this.text.charAt(index - ((iE - this.bufEnd) + i10));
    }

    public final int b() {
        C18369o c18369o = this.buffer;
        return c18369o == null ? this.text.length() : (this.text.length() - (this.bufEnd - this.bufStart)) + c18369o.e();
    }

    public String toString() {
        C18369o c18369o = this.buffer;
        if (c18369o == null) {
            return this.text;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) this.text, 0, this.bufStart);
        c18369o.a(sb2);
        String str = this.text;
        sb2.append((CharSequence) str, this.bufEnd, str.length());
        return sb2.toString();
    }

    public F(String str) {
        this.text = str;
    }
}
