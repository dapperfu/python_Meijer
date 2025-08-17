package F1;

import H1.v;
import H1.w;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0011B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0016"}, d2 = {"LF1/q;", "", "LH1/v;", "firstLine", "restLine", "<init>", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "J", "b", "()J", "c", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: F1.q, reason: from toString */
/* loaded from: classes.dex */
public final class TextIndent {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: d, reason: collision with root package name */
    private static final TextIndent f10199d = new TextIndent(0, 0, 3, null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final long firstLine;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final long restLine;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"LF1/q$a;", "", "<init>", "()V", "LF1/q;", "None", "LF1/q;", "a", "()LF1/q;", "getNone$annotations", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: F1.q$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final TextIndent a() {
            return TextIndent.f10199d;
        }
    }

    public /* synthetic */ TextIndent(long j10, long j11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextIndent)) {
            return false;
        }
        TextIndent textIndent = (TextIndent) other;
        return v.e(this.firstLine, textIndent.firstLine) && v.e(this.restLine, textIndent.restLine);
    }

    private TextIndent(long j10, long j11) {
        this.firstLine = j10;
        this.restLine = j11;
    }

    /* renamed from: b, reason: from getter */
    public final long getFirstLine() {
        return this.firstLine;
    }

    /* renamed from: c, reason: from getter */
    public final long getRestLine() {
        return this.restLine;
    }

    public int hashCode() {
        return (v.i(this.firstLine) * 31) + v.i(this.restLine);
    }

    public String toString() {
        return "TextIndent(firstLine=" + ((Object) v.j(this.firstLine)) + ", restLine=" + ((Object) v.j(this.restLine)) + ')';
    }

    public /* synthetic */ TextIndent(long j10, long j11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? w.i(0) : j10, (i10 & 2) != 0 ? w.i(0) : j11, null);
    }
}
