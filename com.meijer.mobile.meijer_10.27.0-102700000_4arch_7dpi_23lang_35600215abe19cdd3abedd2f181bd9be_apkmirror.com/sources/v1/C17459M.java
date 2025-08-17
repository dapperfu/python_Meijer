package v1;

import android.text.Layout;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0018\n\u0002\b\u0002\n\u0002\u0010\u0019\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0013B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0016\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00062\b\b\u0001\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\b2\b\b\u0001\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u001a\u0010\u001bJ%\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010 \u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u0006¢\u0006\u0004\b \u0010\u0019J\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!2\u0006\u0010\u001f\u001a\u00020\u0006H\u0000¢\u0006\u0004\b#\u0010$J\u0015\u0010&\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020%¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010(\u001a\u0004\b)\u0010*R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00060+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010,R\u001c\u0010/\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010,R\u0014\u00102\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u00101R\u0018\u00105\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u00104R\u0017\u00109\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u00106\u001a\u0004\b7\u00108¨\u0006:"}, d2 = {"Lv1/M;", "", "Landroid/text/Layout;", "layout", "<init>", "(Landroid/text/Layout;)V", "", "offset", "", "primary", "", "b", "(IZ)F", "lineEnd", "lineStart", "k", "(II)I", "paragraphIndex", "Ljava/text/Bidi;", "a", "(I)Ljava/text/Bidi;", "upstream", "f", "(IZ)I", "h", "(I)I", "j", "(I)Z", "usePrimaryDirection", "c", "(IZZ)F", "lineIndex", "e", "", "Lv1/M$a;", "d", "(I)[Lv1/M$a;", "", "i", "(C)Z", "Landroid/text/Layout;", "getLayout", "()Landroid/text/Layout;", "", "Ljava/util/List;", "paragraphEnds", "", "paragraphBidi", "", "[Z", "bidiProcessedParagraphs", "", "[C", "tmpBuffer", "I", "getParagraphCount", "()I", "paragraphCount", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: v1.M, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17459M {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Layout layout;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List<Integer> paragraphEnds;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final List<Bidi> paragraphBidi;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean[] bidiProcessedParagraphs;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private char[] tmpBuffer;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final int paragraphCount;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, d2 = {"Lv1/M$a;", "", "", "start", "end", "", "isRtl", "<init>", "(IIZ)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "c", "Z", "()Z", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: v1.M$a, reason: from toString */
    public static final /* data */ class BidiRun {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final int start;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final int end;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isRtl;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BidiRun)) {
                return false;
            }
            BidiRun bidiRun = (BidiRun) other;
            return this.start == bidiRun.start && this.end == bidiRun.end && this.isRtl == bidiRun.isRtl;
        }

        /* renamed from: a, reason: from getter */
        public final int getEnd() {
            return this.end;
        }

        /* renamed from: b, reason: from getter */
        public final int getStart() {
            return this.start;
        }

        /* renamed from: c, reason: from getter */
        public final boolean getIsRtl() {
            return this.isRtl;
        }

        public int hashCode() {
            return (((Integer.hashCode(this.start) * 31) + Integer.hashCode(this.end)) * 31) + Boolean.hashCode(this.isRtl);
        }

        public String toString() {
            return "BidiRun(start=" + this.start + ", end=" + this.end + ", isRtl=" + this.isRtl + ')';
        }

        public BidiRun(int i10, int i11, boolean z10) {
            this.start = i10;
            this.end = i11;
            this.isRtl = z10;
        }
    }

    private final float b(int offset, boolean primary) {
        int iK = RangesKt.k(offset, this.layout.getLineEnd(this.layout.getLineForOffset(offset)));
        return primary ? this.layout.getPrimaryHorizontal(iK) : this.layout.getSecondaryHorizontal(iK);
    }

    public static /* synthetic */ int g(C17459M c17459m, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        return c17459m.f(i10, z10);
    }

    private final int k(int lineEnd, int lineStart) {
        while (lineEnd > lineStart && i(this.layout.getText().charAt(lineEnd - 1))) {
            lineEnd--;
        }
        return lineEnd;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.text.Bidi a(int r11) {
        /*
            r10 = this;
            boolean[] r0 = r10.bidiProcessedParagraphs
            boolean r0 = r0[r11]
            if (r0 == 0) goto Lf
            java.util.List<java.text.Bidi> r0 = r10.paragraphBidi
            java.lang.Object r11 = r0.get(r11)
            java.text.Bidi r11 = (java.text.Bidi) r11
            return r11
        Lf:
            r0 = 0
            if (r11 != 0) goto L14
            r1 = r0
            goto L22
        L14:
            java.util.List<java.lang.Integer> r1 = r10.paragraphEnds
            int r2 = r11 + (-1)
            java.lang.Object r1 = r1.get(r2)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
        L22:
            java.util.List<java.lang.Integer> r2 = r10.paragraphEnds
            java.lang.Object r2 = r2.get(r11)
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            int r8 = r2 - r1
            char[] r3 = r10.tmpBuffer
            if (r3 == 0) goto L3a
            int r4 = r3.length
            if (r4 >= r8) goto L38
            goto L3a
        L38:
            r4 = r3
            goto L3d
        L3a:
            char[] r3 = new char[r8]
            goto L38
        L3d:
            android.text.Layout r3 = r10.layout
            java.lang.CharSequence r3 = r3.getText()
            android.text.TextUtils.getChars(r3, r1, r2, r4, r0)
            boolean r0 = java.text.Bidi.requiresBidi(r4, r0, r8)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L60
            boolean r9 = r10.j(r11)
            java.text.Bidi r3 = new java.text.Bidi
            r6 = 0
            r7 = 0
            r5 = 0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            int r0 = r3.getRunCount()
            if (r0 != r2) goto L61
        L60:
            r3 = r1
        L61:
            java.util.List<java.text.Bidi> r0 = r10.paragraphBidi
            r0.set(r11, r3)
            boolean[] r0 = r10.bidiProcessedParagraphs
            r0[r11] = r2
            if (r3 == 0) goto L73
            char[] r11 = r10.tmpBuffer
            if (r4 != r11) goto L72
            r4 = r1
            goto L73
        L72:
            r4 = r11
        L73:
            r10.tmpBuffer = r4
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: v1.C17459M.a(int):java.text.Bidi");
    }

    public final float c(int offset, boolean usePrimaryDirection, boolean upstream) {
        int iK = offset;
        if (!upstream) {
            return b(offset, usePrimaryDirection);
        }
        int iA = C17458L.a(this.layout, iK, upstream);
        int lineStart = this.layout.getLineStart(iA);
        int lineEnd = this.layout.getLineEnd(iA);
        if (iK != lineStart && iK != lineEnd) {
            return b(offset, usePrimaryDirection);
        }
        if (iK == 0 || iK == this.layout.getText().length()) {
            return b(offset, usePrimaryDirection);
        }
        int iF = f(iK, upstream);
        boolean zJ = j(iF);
        int iK2 = k(lineEnd, lineStart);
        int iH = h(iF);
        int i10 = lineStart - iH;
        int i11 = iK2 - iH;
        Bidi bidiA = a(iF);
        Bidi bidiCreateLineBidi = bidiA != null ? bidiA.createLineBidi(i10, i11) : null;
        boolean z10 = false;
        if (bidiCreateLineBidi == null || bidiCreateLineBidi.getRunCount() == 1) {
            boolean zIsRtlCharAt = this.layout.isRtlCharAt(lineStart);
            if (usePrimaryDirection || zJ == zIsRtlCharAt) {
                zJ = !zJ;
            }
            if (iK == lineStart) {
                z10 = zJ;
            } else if (!zJ) {
                z10 = true;
            }
            Layout layout = this.layout;
            return z10 ? layout.getLineLeft(iA) : layout.getLineRight(iA);
        }
        int runCount = bidiCreateLineBidi.getRunCount();
        BidiRun[] bidiRunArr = new BidiRun[runCount];
        for (int i12 = 0; i12 < runCount; i12++) {
            bidiRunArr[i12] = new BidiRun(bidiCreateLineBidi.getRunStart(i12) + lineStart, bidiCreateLineBidi.getRunLimit(i12) + lineStart, bidiCreateLineBidi.getRunLevel(i12) % 2 == 1);
        }
        int runCount2 = bidiCreateLineBidi.getRunCount();
        byte[] bArr = new byte[runCount2];
        for (int i13 = 0; i13 < runCount2; i13++) {
            bArr[i13] = (byte) bidiCreateLineBidi.getRunLevel(i13);
        }
        Bidi.reorderVisually(bArr, 0, bidiRunArr, 0, runCount);
        int i14 = -1;
        if (iK == lineStart) {
            int i15 = 0;
            while (true) {
                if (i15 >= runCount) {
                    break;
                }
                if (bidiRunArr[i15].getStart() == iK) {
                    i14 = i15;
                    break;
                }
                i15++;
            }
            BidiRun bidiRun = bidiRunArr[i14];
            if (usePrimaryDirection || zJ == bidiRun.getIsRtl()) {
                zJ = !zJ;
            }
            return (i14 == 0 && zJ) ? this.layout.getLineLeft(iA) : (i14 != ArraysKt.m0(bidiRunArr) || zJ) ? zJ ? this.layout.getPrimaryHorizontal(bidiRunArr[i14 - 1].getStart()) : this.layout.getPrimaryHorizontal(bidiRunArr[i14 + 1].getStart()) : this.layout.getLineRight(iA);
        }
        if (iK > iK2) {
            iK = k(iK, lineStart);
        }
        int i16 = 0;
        while (true) {
            if (i16 >= runCount) {
                break;
            }
            if (bidiRunArr[i16].getEnd() == iK) {
                i14 = i16;
                break;
            }
            i16++;
        }
        BidiRun bidiRun2 = bidiRunArr[i14];
        if (!usePrimaryDirection && zJ != bidiRun2.getIsRtl()) {
            zJ = !zJ;
        }
        return (i14 == 0 && zJ) ? this.layout.getLineLeft(iA) : (i14 != ArraysKt.m0(bidiRunArr) || zJ) ? zJ ? this.layout.getPrimaryHorizontal(bidiRunArr[i14 - 1].getEnd()) : this.layout.getPrimaryHorizontal(bidiRunArr[i14 + 1].getEnd()) : this.layout.getLineRight(iA);
    }

    public final BidiRun[] d(int lineIndex) {
        Bidi bidiCreateLineBidi;
        int lineStart = this.layout.getLineStart(lineIndex);
        int lineEnd = this.layout.getLineEnd(lineIndex);
        int iG = g(this, lineStart, false, 2, null);
        int iH = h(iG);
        int i10 = lineStart - iH;
        int i11 = lineEnd - iH;
        Bidi bidiA = a(iG);
        if (bidiA == null || (bidiCreateLineBidi = bidiA.createLineBidi(i10, i11)) == null) {
            return new BidiRun[]{new BidiRun(lineStart, lineEnd, this.layout.isRtlCharAt(lineStart))};
        }
        int runCount = bidiCreateLineBidi.getRunCount();
        BidiRun[] bidiRunArr = new BidiRun[runCount];
        for (int i12 = 0; i12 < runCount; i12++) {
            int runStart = bidiCreateLineBidi.getRunStart(i12) + lineStart;
            int runLimit = bidiCreateLineBidi.getRunLimit(i12) + lineStart;
            boolean z10 = true;
            if (bidiCreateLineBidi.getRunLevel(i12) % 2 != 1) {
                z10 = false;
            }
            bidiRunArr[i12] = new BidiRun(runStart, runLimit, z10);
        }
        return bidiRunArr;
    }

    public final int e(int lineIndex) {
        return k(this.layout.getLineEnd(lineIndex), this.layout.getLineStart(lineIndex));
    }

    public final int f(int offset, boolean upstream) {
        int iL = CollectionsKt.l(this.paragraphEnds, Integer.valueOf(offset), 0, 0, 6, null);
        int i10 = iL < 0 ? -(iL + 1) : iL + 1;
        if (upstream && i10 > 0) {
            int i11 = i10 - 1;
            if (offset == this.paragraphEnds.get(i11).intValue()) {
                return i11;
            }
        }
        return i10;
    }

    public final int h(int paragraphIndex) {
        if (paragraphIndex == 0) {
            return 0;
        }
        return this.paragraphEnds.get(paragraphIndex - 1).intValue();
    }

    public final boolean i(char c10) {
        if (c10 == ' ' || c10 == '\n' || c10 == 5760) {
            return true;
        }
        return (Intrinsics.k(c10, 8192) >= 0 && Intrinsics.k(c10, 8202) <= 0 && c10 != 8199) || c10 == 8287 || c10 == 12288;
    }

    public final boolean j(int paragraphIndex) {
        return this.layout.getParagraphDirection(this.layout.getLineForOffset(h(paragraphIndex))) == -1;
    }

    public C17459M(Layout layout) {
        int length;
        this.layout = layout;
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        do {
            int iO0 = StringsKt.o0(this.layout.getText(), '\n', i10, false, 4, null);
            if (iO0 < 0) {
                length = this.layout.getText().length();
            } else {
                length = iO0 + 1;
            }
            i10 = length;
            arrayList.add(Integer.valueOf(i10));
        } while (i10 < this.layout.getText().length());
        this.paragraphEnds = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i11 = 0; i11 < size; i11++) {
            arrayList2.add(null);
        }
        this.paragraphBidi = arrayList2;
        this.bidiProcessedParagraphs = new boolean[this.paragraphEnds.size()];
        this.paragraphCount = this.paragraphEnds.size();
    }
}
