package androidx.compose.foundation.text;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.SpanStyle;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\f\u001a\u00020\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\"\u0010\u0012\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010\"\u0004\b\u0011\u0010\u0005¨\u0006\u0013"}, d2 = {"Landroidx/compose/foundation/text/K;", "", "Landroidx/compose/ui/text/AnnotatedString;", "initialText", "<init>", "(Landroidx/compose/ui/text/AnnotatedString;)V", "Landroidx/compose/ui/text/AnnotatedString$d;", "Landroidx/compose/ui/text/f;", "linkRange", "Landroidx/compose/ui/text/s;", "newStyle", "", "b", "(Landroidx/compose/ui/text/AnnotatedString$d;Landroidx/compose/ui/text/s;)V", "a", "Landroidx/compose/ui/text/AnnotatedString;", "()Landroidx/compose/ui/text/AnnotatedString;", "setStyledText", "styledText", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class K {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final AnnotatedString initialText;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private AnnotatedString styledText;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00002\u000e\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/text/AnnotatedString$d;", "Landroidx/compose/ui/text/AnnotatedString$a;", "it", "a", "(Landroidx/compose/ui/text/AnnotatedString$d;)Landroidx/compose/ui/text/AnnotatedString$d;"}, k = 3, mv = {1, 9, 0})
    static final class a extends Lambda implements Function1<AnnotatedString.Range<? extends AnnotatedString.a>, AnnotatedString.Range<? extends AnnotatedString.a>> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Ref.BooleanRef f49452f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ AnnotatedString.Range<androidx.compose.ui.text.f> f49453g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ SpanStyle f49454h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Ref.BooleanRef booleanRef, AnnotatedString.Range<androidx.compose.ui.text.f> range, SpanStyle spanStyle) {
            super(1);
            this.f49452f = booleanRef;
            this.f49453g = range;
            this.f49454h = spanStyle;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AnnotatedString.Range<? extends AnnotatedString.a> invoke(AnnotatedString.Range<? extends AnnotatedString.a> range) {
            AnnotatedString.Range<? extends AnnotatedString.a> range2;
            if (this.f49452f.f143735a && (range.g() instanceof SpanStyle) && range.h() == this.f49453g.h() && range.f() == this.f49453g.f()) {
                SpanStyle spanStyle = this.f49454h;
                if (spanStyle == null) {
                    spanStyle = new SpanStyle(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65535, null);
                }
                range2 = new AnnotatedString.Range<>(spanStyle, range.h(), range.f());
            } else {
                range2 = range;
            }
            this.f49452f.f143735a = Intrinsics.e(this.f49453g, range);
            return range2;
        }
    }

    /* renamed from: a, reason: from getter */
    public final AnnotatedString getStyledText() {
        return this.styledText;
    }

    public final void b(AnnotatedString.Range<androidx.compose.ui.text.f> linkRange, SpanStyle newStyle) {
        this.styledText = this.initialText.q(new a(new Ref.BooleanRef(), linkRange, newStyle));
    }

    public K(AnnotatedString annotatedString) {
        this.initialText = annotatedString;
        this.styledText = annotatedString;
    }
}
