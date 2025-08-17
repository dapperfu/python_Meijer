package w1;

import java.lang.Character;
import java.text.BreakIterator;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import v1.C17455I;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u001f2\u00020\u0001:\u0001\u0018B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0015\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\u0013J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001a\u0010\u0013J\u0017\u0010\u001b\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001b\u0010\u0013J\u0015\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u001e\u0010\u001dJ\u0015\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u001f\u0010\u001dJ\u0015\u0010 \u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b \u0010\u001dJ\u0015\u0010!\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b!\u0010\u001dJ\u0015\u0010\"\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\"\u0010\u001dJ\u0015\u0010#\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b#\u0010\u0013J\u0015\u0010$\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b$\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010%\u001a\u0004\b&\u0010'R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010(R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010(R\u0014\u0010+\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010*¨\u0006,"}, d2 = {"Lw1/i;", "", "", "charSequence", "", "start", "end", "Ljava/util/Locale;", "locale", "<init>", "(Ljava/lang/CharSequence;IILjava/util/Locale;)V", "offset", "", "getPrevWordBeginningOnTwoWordsBoundary", "b", "(IZ)I", "getNextWordEndOnTwoWordBoundary", "c", "o", "(I)Z", "n", "h", "l", "", "a", "(I)V", "j", "k", "p", "(I)I", "q", "e", "d", "f", "g", "i", "m", "Ljava/lang/CharSequence;", "getCharSequence", "()Ljava/lang/CharSequence;", "I", "Ljava/text/BreakIterator;", "Ljava/text/BreakIterator;", "iterator", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: w1.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17749i {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: f, reason: collision with root package name */
    public static final int f165644f = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final CharSequence charSequence;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int start;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int end;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final BreakIterator iterator;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lw1/i$a;", "", "<init>", "()V", "", "cp", "", "a", "(I)Z", "WINDOW_WIDTH", "I", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: w1.i$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final boolean a(int cp2) {
            int type = Character.getType(cp2);
            if (type != 23 && type != 20 && type != 22 && type != 30 && type != 29 && type != 24 && type != 21) {
                return false;
            }
            return true;
        }
    }

    public final int d(int offset) {
        return c(offset, true);
    }

    public final int e(int offset) {
        return b(offset, true);
    }

    private final void a(int offset) {
        int i10 = this.start;
        boolean z10 = false;
        if (offset <= this.end && i10 <= offset) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        A1.a.a("Invalid offset: " + offset + ". Valid range is [" + this.start + " , " + this.end + ']');
    }

    private final boolean h(int offset) {
        int i10 = this.start + 1;
        if (offset > this.end || i10 > offset) {
            return false;
        }
        if (Character.isLetterOrDigit(Character.codePointBefore(this.charSequence, offset))) {
            return true;
        }
        int i11 = offset - 1;
        if (Character.isSurrogate(this.charSequence.charAt(i11))) {
            return true;
        }
        if (!androidx.emoji2.text.f.k()) {
            return false;
        }
        androidx.emoji2.text.f fVarC = androidx.emoji2.text.f.c();
        return fVarC.g() == 1 && fVarC.f(this.charSequence, i11) != -1;
    }

    private final boolean k(int offset) {
        int i10 = offset - 1;
        Character.UnicodeBlock unicodeBlockOf = Character.UnicodeBlock.of(this.charSequence.charAt(i10));
        Character.UnicodeBlock unicodeBlock = Character.UnicodeBlock.HIRAGANA;
        if (Intrinsics.e(unicodeBlockOf, unicodeBlock) && Intrinsics.e(Character.UnicodeBlock.of(this.charSequence.charAt(offset)), Character.UnicodeBlock.KATAKANA)) {
            return true;
        }
        return Intrinsics.e(Character.UnicodeBlock.of(this.charSequence.charAt(offset)), unicodeBlock) && Intrinsics.e(Character.UnicodeBlock.of(this.charSequence.charAt(i10)), Character.UnicodeBlock.KATAKANA);
    }

    private final boolean l(int offset) {
        int i10 = this.start;
        if (offset >= this.end || i10 > offset) {
            return false;
        }
        if (Character.isLetterOrDigit(Character.codePointAt(this.charSequence, offset)) || Character.isSurrogate(this.charSequence.charAt(offset))) {
            return true;
        }
        if (!androidx.emoji2.text.f.k()) {
            return false;
        }
        androidx.emoji2.text.f fVarC = androidx.emoji2.text.f.c();
        return fVarC.g() == 1 && fVarC.f(this.charSequence, offset) != -1;
    }

    public final boolean i(int offset) {
        int i10 = this.start + 1;
        if (offset > this.end || i10 > offset) {
            return false;
        }
        return INSTANCE.a(Character.codePointBefore(this.charSequence, offset));
    }

    public final boolean m(int offset) {
        int i10 = this.start;
        if (offset >= this.end || i10 > offset) {
            return false;
        }
        return INSTANCE.a(Character.codePointAt(this.charSequence, offset));
    }

    public C17749i(CharSequence charSequence, int i10, int i11, Locale locale) {
        boolean z10;
        this.charSequence = charSequence;
        if (i10 >= 0 && i10 <= charSequence.length()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            A1.a.a("input start index is outside the CharSequence");
        }
        if (!(i11 >= 0 && i11 <= charSequence.length())) {
            A1.a.a("input end index is outside the CharSequence");
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        this.iterator = wordInstance;
        this.start = Math.max(0, i10 - 50);
        this.end = Math.min(charSequence.length(), i11 + 50);
        wordInstance.setText(new C17455I(charSequence, i10, i11));
    }

    private final int b(int offset, boolean getPrevWordBeginningOnTwoWordsBoundary) {
        a(offset);
        if (l(offset)) {
            if (j(offset) && (!h(offset) || !getPrevWordBeginningOnTwoWordsBoundary)) {
                return offset;
            }
            return q(offset);
        }
        if (h(offset)) {
            return q(offset);
        }
        return -1;
    }

    private final int c(int offset, boolean getNextWordEndOnTwoWordBoundary) {
        a(offset);
        if (h(offset)) {
            if (j(offset) && (!l(offset) || !getNextWordEndOnTwoWordBoundary)) {
                return offset;
            }
            return p(offset);
        }
        if (l(offset)) {
            return p(offset);
        }
        return -1;
    }

    private final boolean j(int offset) {
        a(offset);
        if (this.iterator.isBoundary(offset)) {
            if (!l(offset) || !l(offset - 1) || !l(offset + 1)) {
                if (offset <= 0 || offset >= this.charSequence.length() - 1 || (!k(offset) && !k(offset + 1))) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    private final boolean n(int offset) {
        if (!m(offset) && i(offset)) {
            return true;
        }
        return false;
    }

    private final boolean o(int offset) {
        if (m(offset) && !i(offset)) {
            return true;
        }
        return false;
    }

    public final int f(int offset) {
        a(offset);
        while (offset != -1 && !o(offset)) {
            offset = q(offset);
        }
        return offset;
    }

    public final int g(int offset) {
        a(offset);
        while (offset != -1 && !n(offset)) {
            offset = p(offset);
        }
        return offset;
    }

    public final int p(int offset) {
        a(offset);
        int iFollowing = this.iterator.following(offset);
        if (l(iFollowing - 1) && l(iFollowing) && !k(iFollowing)) {
            return p(iFollowing);
        }
        return iFollowing;
    }

    public final int q(int offset) {
        a(offset);
        int iPreceding = this.iterator.preceding(offset);
        if (l(iPreceding) && h(iPreceding) && !k(iPreceding)) {
            return q(iPreceding);
        }
        return iPreceding;
    }
}
