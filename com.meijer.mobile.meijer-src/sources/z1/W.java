package z1;

import androidx.compose.ui.text.AnnotatedString;
import kotlin.Metadata;
import z1.W;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bç\u0080\u0001\u0018\u0000 \u00072\u00020\u0001:\u0001\u0005J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lz1/W;", "", "Landroidx/compose/ui/text/AnnotatedString;", "text", "Lz1/U;", "a", "(Landroidx/compose/ui/text/AnnotatedString;)Lz1/U;", "z3", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface W {

    /* renamed from: z3, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f172240a;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lz1/W$a;", "", "<init>", "()V", "Lz1/W;", "b", "Lz1/W;", "c", "()Lz1/W;", "getNone$annotations", "None", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: z1.W$a, reason: from kotlin metadata */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f172240a = new Companion();

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final W None = new W() { // from class: z1.V
            @Override // z1.W
            public final TransformedText a(AnnotatedString annotatedString) {
                return W.Companion.b(annotatedString);
            }
        };

        /* JADX INFO: Access modifiers changed from: private */
        public static final TransformedText b(AnnotatedString annotatedString) {
            return new TransformedText(annotatedString, InterfaceC18417E.INSTANCE.a());
        }

        public final W c() {
            return None;
        }

        private Companion() {
        }
    }

    TransformedText a(AnnotatedString text);
}
