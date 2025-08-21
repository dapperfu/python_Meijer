package androidx.emoji2.text;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import androidx.emoji2.text.f;
import androidx.emoji2.text.n;
import com.google.android.gms.common.api.a;
import java.util.Arrays;
import java.util.Set;

/* loaded from: classes.dex */
final class i {

    /* renamed from: a, reason: collision with root package name */
    private final f.j f54834a;

    /* renamed from: b, reason: collision with root package name */
    private final n f54835b;

    /* renamed from: c, reason: collision with root package name */
    private f.e f54836c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f54837d;

    /* renamed from: e, reason: collision with root package name */
    private final int[] f54838e;

    private static class b implements c<r> {

        /* renamed from: a, reason: collision with root package name */
        public r f54839a;

        /* renamed from: b, reason: collision with root package name */
        private final f.j f54840b;

        @Override // androidx.emoji2.text.i.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public r getResult() {
            return this.f54839a;
        }

        b(r rVar, f.j jVar) {
            this.f54839a = rVar;
            this.f54840b = jVar;
        }

        @Override // androidx.emoji2.text.i.c
        public boolean a(CharSequence charSequence, int i10, int i11, p pVar) {
            Spannable spannableString;
            if (pVar.k()) {
                return true;
            }
            if (this.f54839a == null) {
                if (charSequence instanceof Spannable) {
                    spannableString = (Spannable) charSequence;
                } else {
                    spannableString = new SpannableString(charSequence);
                }
                this.f54839a = new r(spannableString);
            }
            this.f54839a.setSpan(this.f54840b.a(pVar), i10, i11, 33);
            return true;
        }
    }

    private interface c<T> {
        boolean a(CharSequence charSequence, int i10, int i11, p pVar);

        T getResult();
    }

    private static class d implements c<d> {

        /* renamed from: a, reason: collision with root package name */
        private final int f54841a;

        /* renamed from: b, reason: collision with root package name */
        public int f54842b = -1;

        /* renamed from: c, reason: collision with root package name */
        public int f54843c = -1;

        @Override // androidx.emoji2.text.i.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public d getResult() {
            return this;
        }

        @Override // androidx.emoji2.text.i.c
        public boolean a(CharSequence charSequence, int i10, int i11, p pVar) {
            int i12 = this.f54841a;
            if (i10 > i12 || i12 >= i11) {
                return i11 <= i12;
            }
            this.f54842b = i10;
            this.f54843c = i11;
            return false;
        }

        d(int i10) {
            this.f54841a = i10;
        }
    }

    static final class f {

        /* renamed from: a, reason: collision with root package name */
        private int f54845a = 1;

        /* renamed from: b, reason: collision with root package name */
        private final n.a f54846b;

        /* renamed from: c, reason: collision with root package name */
        private n.a f54847c;

        /* renamed from: d, reason: collision with root package name */
        private n.a f54848d;

        /* renamed from: e, reason: collision with root package name */
        private int f54849e;

        /* renamed from: f, reason: collision with root package name */
        private int f54850f;

        /* renamed from: g, reason: collision with root package name */
        private final boolean f54851g;

        /* renamed from: h, reason: collision with root package name */
        private final int[] f54852h;

        private static boolean d(int i10) {
            return i10 == 65039;
        }

        private static boolean f(int i10) {
            return i10 == 65038;
        }

        private int g() {
            this.f54845a = 1;
            this.f54847c = this.f54846b;
            this.f54850f = 0;
            return 1;
        }

        private boolean h() {
            if (this.f54847c.b().j() || d(this.f54849e)) {
                return true;
            }
            if (this.f54851g) {
                if (this.f54852h == null) {
                    return true;
                }
                if (Arrays.binarySearch(this.f54852h, this.f54847c.b().b(0)) < 0) {
                    return true;
                }
            }
            return false;
        }

        int a(int i10) {
            n.a aVarA = this.f54847c.a(i10);
            int iG = 2;
            if (this.f54845a != 2) {
                if (aVarA == null) {
                    iG = g();
                } else {
                    this.f54845a = 2;
                    this.f54847c = aVarA;
                    this.f54850f = 1;
                }
            } else if (aVarA != null) {
                this.f54847c = aVarA;
                this.f54850f++;
            } else if (f(i10)) {
                iG = g();
            } else if (!d(i10)) {
                if (this.f54847c.b() != null) {
                    iG = 3;
                    if (this.f54850f != 1 || h()) {
                        this.f54848d = this.f54847c;
                        g();
                    } else {
                        iG = g();
                    }
                } else {
                    iG = g();
                }
            }
            this.f54849e = i10;
            return iG;
        }

        p b() {
            return this.f54847c.b();
        }

        p c() {
            return this.f54848d.b();
        }

        boolean e() {
            if (this.f54845a != 2 || this.f54847c.b() == null) {
                return false;
            }
            return this.f54850f > 1 || h();
        }

        f(n.a aVar, boolean z10, int[] iArr) {
            this.f54846b = aVar;
            this.f54847c = aVar;
            this.f54851g = z10;
            this.f54852h = iArr;
        }
    }

    static boolean d(InputConnection inputConnection, Editable editable, int i10, int i11, boolean z10) {
        int iMax;
        int iMin;
        if (editable != null && inputConnection != null && i10 >= 0 && i11 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (g(selectionStart, selectionEnd)) {
                return false;
            }
            if (z10) {
                iMax = a.a(editable, selectionStart, Math.max(i10, 0));
                iMin = a.b(editable, selectionEnd, Math.max(i11, 0));
                if (iMax == -1 || iMin == -1) {
                    return false;
                }
            } else {
                iMax = Math.max(selectionStart - i10, 0);
                iMin = Math.min(selectionEnd + i11, editable.length());
            }
            j[] jVarArr = (j[]) editable.getSpans(iMax, iMin, j.class);
            if (jVarArr != null && jVarArr.length > 0) {
                for (j jVar : jVarArr) {
                    int spanStart = editable.getSpanStart(jVar);
                    int spanEnd = editable.getSpanEnd(jVar);
                    iMax = Math.min(spanStart, iMax);
                    iMin = Math.max(spanEnd, iMin);
                }
                int iMax2 = Math.max(iMax, 0);
                int iMin2 = Math.min(iMin, editable.length());
                inputConnection.beginBatchEdit();
                editable.delete(iMax2, iMin2);
                inputConnection.endBatchEdit();
                return true;
            }
        }
        return false;
    }

    private static boolean g(int i10, int i11) {
        return i10 == -1 || i11 == -1 || i10 != i11;
    }

    private static final class a {
        static int a(CharSequence charSequence, int i10, int i11) {
            int length = charSequence.length();
            if (i10 < 0 || length < i10 || i11 < 0) {
                return -1;
            }
            while (true) {
                boolean z10 = false;
                while (i11 != 0) {
                    i10--;
                    if (i10 < 0) {
                        if (z10) {
                            return -1;
                        }
                        return 0;
                    }
                    char cCharAt = charSequence.charAt(i10);
                    if (z10) {
                        if (!Character.isHighSurrogate(cCharAt)) {
                            return -1;
                        }
                        i11--;
                    } else if (!Character.isSurrogate(cCharAt)) {
                        i11--;
                    } else {
                        if (Character.isHighSurrogate(cCharAt)) {
                            return -1;
                        }
                        z10 = true;
                    }
                }
                return i10;
            }
        }

        static int b(CharSequence charSequence, int i10, int i11) {
            int length = charSequence.length();
            if (i10 < 0 || length < i10 || i11 < 0) {
                return -1;
            }
            while (true) {
                boolean z10 = false;
                while (i11 != 0) {
                    if (i10 >= length) {
                        if (z10) {
                            return -1;
                        }
                        return length;
                    }
                    char cCharAt = charSequence.charAt(i10);
                    if (z10) {
                        if (!Character.isLowSurrogate(cCharAt)) {
                            return -1;
                        }
                        i11--;
                        i10++;
                    } else if (!Character.isSurrogate(cCharAt)) {
                        i11--;
                        i10++;
                    } else {
                        if (Character.isLowSurrogate(cCharAt)) {
                            return -1;
                        }
                        i10++;
                        z10 = true;
                    }
                }
                return i10;
            }
        }
    }

    private static class e implements c<e> {

        /* renamed from: a, reason: collision with root package name */
        private final String f54844a;

        @Override // androidx.emoji2.text.i.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public e getResult() {
            return this;
        }

        e(String str) {
            this.f54844a = str;
        }

        @Override // androidx.emoji2.text.i.c
        public boolean a(CharSequence charSequence, int i10, int i11, p pVar) {
            if (!TextUtils.equals(charSequence.subSequence(i10, i11), this.f54844a)) {
                return true;
            }
            pVar.l(true);
            return false;
        }
    }

    static boolean e(Editable editable, int i10, KeyEvent keyEvent) {
        if (!(i10 != 67 ? i10 != 112 ? false : a(editable, keyEvent, true) : a(editable, keyEvent, false))) {
            return false;
        }
        MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
        return true;
    }

    private <T> T k(CharSequence charSequence, int i10, int i11, int i12, boolean z10, c<T> cVar) {
        int iCharCount;
        f fVar = new f(this.f54835b.f(), this.f54837d, this.f54838e);
        int i13 = 0;
        boolean zA = true;
        int iCodePointAt = Character.codePointAt(charSequence, i10);
        loop0: while (true) {
            iCharCount = i10;
            while (i10 < i11 && i13 < i12 && zA) {
                int iA = fVar.a(iCodePointAt);
                if (iA == 1) {
                    iCharCount += Character.charCount(Character.codePointAt(charSequence, iCharCount));
                    if (iCharCount < i11) {
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount);
                    }
                    i10 = iCharCount;
                } else if (iA == 2) {
                    i10 += Character.charCount(iCodePointAt);
                    if (i10 < i11) {
                        iCodePointAt = Character.codePointAt(charSequence, i10);
                    }
                } else if (iA == 3) {
                    if (z10 || !f(charSequence, iCharCount, i10, fVar.c())) {
                        zA = cVar.a(charSequence, iCharCount, i10, fVar.c());
                        i13++;
                    }
                }
            }
            break loop0;
        }
        if (fVar.e() && i13 < i12 && zA && (z10 || !f(charSequence, iCharCount, i10, fVar.b()))) {
            cVar.a(charSequence, iCharCount, i10, fVar.b());
        }
        return cVar.getResult();
    }

    int b(CharSequence charSequence, int i10) {
        if (i10 < 0 || i10 >= charSequence.length()) {
            return -1;
        }
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            j[] jVarArr = (j[]) spanned.getSpans(i10, i10 + 1, j.class);
            if (jVarArr.length > 0) {
                return spanned.getSpanEnd(jVarArr[0]);
            }
        }
        return ((d) k(charSequence, Math.max(0, i10 - 16), Math.min(charSequence.length(), i10 + 16), a.e.API_PRIORITY_OTHER, true, new d(i10))).f54843c;
    }

    int c(CharSequence charSequence, int i10) {
        if (i10 < 0 || i10 >= charSequence.length()) {
            return -1;
        }
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            j[] jVarArr = (j[]) spanned.getSpans(i10, i10 + 1, j.class);
            if (jVarArr.length > 0) {
                return spanned.getSpanStart(jVarArr[0]);
            }
        }
        return ((d) k(charSequence, Math.max(0, i10 - 16), Math.min(charSequence.length(), i10 + 16), a.e.API_PRIORITY_OTHER, true, new d(i10))).f54842b;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x003c A[Catch: all -> 0x002a, TRY_ENTER, TryCatch #2 {all -> 0x002a, blocks: (B:7:0x000e, B:10:0x0013, B:12:0x0017, B:14:0x0024, B:22:0x003c, B:24:0x0044, B:26:0x0047, B:28:0x004b, B:30:0x0057, B:31:0x005a, B:41:0x0078), top: B:69:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004b A[Catch: all -> 0x002a, TryCatch #2 {all -> 0x002a, blocks: (B:7:0x000e, B:10:0x0013, B:12:0x0017, B:14:0x0024, B:22:0x003c, B:24:0x0044, B:26:0x0047, B:28:0x004b, B:30:0x0057, B:31:0x005a, B:41:0x0078), top: B:69:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0069 A[Catch: all -> 0x00b0, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00b0, blocks: (B:35:0x0069, B:44:0x0085, B:19:0x0031), top: B:65:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    java.lang.CharSequence j(java.lang.CharSequence r11, int r12, int r13, int r14, boolean r15) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r1 = r11 instanceof androidx.emoji2.text.o
            if (r1 == 0) goto La
            r0 = r11
            androidx.emoji2.text.o r0 = (androidx.emoji2.text.o) r0
            r0.a()
        La:
            java.lang.Class<androidx.emoji2.text.j> r0 = androidx.emoji2.text.j.class
            if (r1 != 0) goto L31
            boolean r2 = r11 instanceof android.text.Spannable     // Catch: java.lang.Throwable -> L2a
            if (r2 == 0) goto L13
            goto L31
        L13:
            boolean r2 = r11 instanceof android.text.Spanned     // Catch: java.lang.Throwable -> L2a
            if (r2 == 0) goto L2f
            r2 = r11
            android.text.Spanned r2 = (android.text.Spanned) r2     // Catch: java.lang.Throwable -> L2a
            int r3 = r12 + (-1)
            int r4 = r13 + 1
            int r2 = r2.nextSpanTransition(r3, r4, r0)     // Catch: java.lang.Throwable -> L2a
            if (r2 > r13) goto L2f
            androidx.emoji2.text.r r2 = new androidx.emoji2.text.r     // Catch: java.lang.Throwable -> L2a
            r2.<init>(r11)     // Catch: java.lang.Throwable -> L2a
            goto L39
        L2a:
            r0 = move-exception
            r12 = r0
            r3 = r11
            goto Lb7
        L2f:
            r2 = 0
            goto L39
        L31:
            androidx.emoji2.text.r r2 = new androidx.emoji2.text.r     // Catch: java.lang.Throwable -> Lb0
            r3 = r11
            android.text.Spannable r3 = (android.text.Spannable) r3     // Catch: java.lang.Throwable -> Lb0
            r2.<init>(r3)     // Catch: java.lang.Throwable -> Lb0
        L39:
            r3 = 0
            if (r2 == 0) goto L65
            java.lang.Object[] r4 = r2.getSpans(r12, r13, r0)     // Catch: java.lang.Throwable -> L2a
            androidx.emoji2.text.j[] r4 = (androidx.emoji2.text.j[]) r4     // Catch: java.lang.Throwable -> L2a
            if (r4 == 0) goto L65
            int r5 = r4.length     // Catch: java.lang.Throwable -> L2a
            if (r5 <= 0) goto L65
            int r5 = r4.length     // Catch: java.lang.Throwable -> L2a
            r6 = r3
        L49:
            if (r6 >= r5) goto L65
            r7 = r4[r6]     // Catch: java.lang.Throwable -> L2a
            int r8 = r2.getSpanStart(r7)     // Catch: java.lang.Throwable -> L2a
            int r9 = r2.getSpanEnd(r7)     // Catch: java.lang.Throwable -> L2a
            if (r8 == r13) goto L5a
            r2.removeSpan(r7)     // Catch: java.lang.Throwable -> L2a
        L5a:
            int r12 = java.lang.Math.min(r8, r12)     // Catch: java.lang.Throwable -> L2a
            int r13 = java.lang.Math.max(r9, r13)     // Catch: java.lang.Throwable -> L2a
            int r6 = r6 + 1
            goto L49
        L65:
            r4 = r12
            r5 = r13
            if (r4 == r5) goto L6f
            int r12 = r11.length()     // Catch: java.lang.Throwable -> Lb0
            if (r4 < r12) goto L71
        L6f:
            r3 = r11
            goto Lb3
        L71:
            r12 = 2147483647(0x7fffffff, float:NaN)
            if (r14 == r12) goto L84
            if (r2 == 0) goto L84
            int r12 = r2.length()     // Catch: java.lang.Throwable -> L2a
            java.lang.Object[] r12 = r2.getSpans(r3, r12, r0)     // Catch: java.lang.Throwable -> L2a
            androidx.emoji2.text.j[] r12 = (androidx.emoji2.text.j[]) r12     // Catch: java.lang.Throwable -> L2a
            int r12 = r12.length     // Catch: java.lang.Throwable -> L2a
            int r14 = r14 - r12
        L84:
            r6 = r14
            androidx.emoji2.text.i$b r8 = new androidx.emoji2.text.i$b     // Catch: java.lang.Throwable -> Lb0
            androidx.emoji2.text.f$j r12 = r10.f54834a     // Catch: java.lang.Throwable -> Lb0
            r8.<init>(r2, r12)     // Catch: java.lang.Throwable -> Lb0
            r2 = r10
            r3 = r11
            r7 = r15
            java.lang.Object r11 = r2.k(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> La4
            androidx.emoji2.text.r r11 = (androidx.emoji2.text.r) r11     // Catch: java.lang.Throwable -> La4
            if (r11 == 0) goto La7
            android.text.Spannable r11 = r11.b()     // Catch: java.lang.Throwable -> La4
            if (r1 == 0) goto La3
            r12 = r3
            androidx.emoji2.text.o r12 = (androidx.emoji2.text.o) r12
            r12.d()
        La3:
            return r11
        La4:
            r0 = move-exception
        La5:
            r12 = r0
            goto Lb7
        La7:
            if (r1 == 0) goto Laf
        La9:
            r11 = r3
            androidx.emoji2.text.o r11 = (androidx.emoji2.text.o) r11
            r11.d()
        Laf:
            return r3
        Lb0:
            r0 = move-exception
            r3 = r11
            goto La5
        Lb3:
            if (r1 == 0) goto Lb6
            goto La9
        Lb6:
            return r3
        Lb7:
            if (r1 == 0) goto Lbf
            r11 = r3
            androidx.emoji2.text.o r11 = (androidx.emoji2.text.o) r11
            r11.d()
        Lbf:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.i.j(java.lang.CharSequence, int, int, int, boolean):java.lang.CharSequence");
    }

    i(n nVar, f.j jVar, f.e eVar, boolean z10, int[] iArr, Set<int[]> set) {
        this.f54834a = jVar;
        this.f54835b = nVar;
        this.f54836c = eVar;
        this.f54837d = z10;
        this.f54838e = iArr;
        i(set);
    }

    private static boolean a(Editable editable, KeyEvent keyEvent, boolean z10) {
        j[] jVarArr;
        if (h(keyEvent)) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (!g(selectionStart, selectionEnd) && (jVarArr = (j[]) editable.getSpans(selectionStart, selectionEnd, j.class)) != null && jVarArr.length > 0) {
            for (j jVar : jVarArr) {
                int spanStart = editable.getSpanStart(jVar);
                int spanEnd = editable.getSpanEnd(jVar);
                if ((z10 && spanStart == selectionStart) || ((!z10 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    private boolean f(CharSequence charSequence, int i10, int i11, p pVar) {
        if (pVar.d() == 0) {
            pVar.m(this.f54836c.a(charSequence, i10, i11, pVar.h()));
        }
        if (pVar.d() == 2) {
            return true;
        }
        return false;
    }

    private static boolean h(KeyEvent keyEvent) {
        return !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState());
    }

    private void i(Set<int[]> set) {
        if (!set.isEmpty()) {
            for (int[] iArr : set) {
                String str = new String(iArr, 0, iArr.length);
                k(str, 0, str.length(), 1, true, new e(str));
            }
        }
    }
}
