package androidx.compose.ui.text;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0015B\u0013\b\u0016\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006B\u001d\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\tJ\u001a\u0010\u000b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0003\u001a\u00020\u00028F¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u0012\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\b\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u000f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001c"}, d2 = {"Landroidx/compose/ui/text/p;", "", "", "includeFontPadding", "<init>", "(Z)V", "()V", "Landroidx/compose/ui/text/e;", "emojiSupportMatch", "(IZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "d", "(Landroidx/compose/ui/text/p;)Landroidx/compose/ui/text/p;", "a", "Z", "c", "()Z", "getIncludeFontPadding$annotations", "b", "I", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.text.p, reason: from toString */
/* loaded from: classes.dex */
public final class PlatformParagraphStyle {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: d, reason: collision with root package name */
    private static final PlatformParagraphStyle f52789d = new PlatformParagraphStyle();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean includeFontPadding;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int emojiSupportMatch;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/text/p$a;", "", "<init>", "()V", "Landroidx/compose/ui/text/p;", "Default", "Landroidx/compose/ui/text/p;", "a", "()Landroidx/compose/ui/text/p;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.text.p$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final PlatformParagraphStyle a() {
            return PlatformParagraphStyle.f52789d;
        }
    }

    public /* synthetic */ PlatformParagraphStyle(int i10, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, z10);
    }

    public final PlatformParagraphStyle d(PlatformParagraphStyle other) {
        return other == null ? this : other;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlatformParagraphStyle)) {
            return false;
        }
        PlatformParagraphStyle platformParagraphStyle = (PlatformParagraphStyle) other;
        return this.includeFontPadding == platformParagraphStyle.includeFontPadding && e.g(this.emojiSupportMatch, platformParagraphStyle.emojiSupportMatch);
    }

    public PlatformParagraphStyle(boolean z10) {
        this.includeFontPadding = z10;
        this.emojiSupportMatch = e.INSTANCE.b();
    }

    /* renamed from: b, reason: from getter */
    public final int getEmojiSupportMatch() {
        return this.emojiSupportMatch;
    }

    /* renamed from: c, reason: from getter */
    public final boolean getIncludeFontPadding() {
        return this.includeFontPadding;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.includeFontPadding) * 31) + e.h(this.emojiSupportMatch);
    }

    public String toString() {
        return "PlatformParagraphStyle(includeFontPadding=" + this.includeFontPadding + ", emojiSupportMatch=" + ((Object) e.i(this.emojiSupportMatch)) + ')';
    }

    private PlatformParagraphStyle(int i10, boolean z10) {
        this.includeFontPadding = z10;
        this.emojiSupportMatch = i10;
    }

    public PlatformParagraphStyle() {
        this(e.INSTANCE.b(), false, null);
    }
}
