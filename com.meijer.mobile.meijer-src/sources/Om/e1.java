package Om;

import androidx.compose.ui.text.AnnotatedString;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import z1.InterfaceC18417E;
import z1.TransformedText;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LOm/e1;", "Lz1/W;", "<init>", "()V", "Landroidx/compose/ui/text/AnnotatedString;", "text", "Lz1/U;", "a", "(Landroidx/compose/ui/text/AnnotatedString;)Lz1/U;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
final class e1 implements z1.W {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"LOm/e1$a;", "Lz1/E;", "<init>", "()V", "", "offset", "b", "(I)I", "a", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements InterfaceC18417E {
        @Override // z1.InterfaceC18417E
        public int a(int offset) {
            return offset <= 2 ? offset : offset <= 5 ? offset - 1 : offset - 2;
        }

        @Override // z1.InterfaceC18417E
        public int b(int offset) {
            return offset <= 2 ? offset : offset <= 4 ? offset + 1 : offset + 2;
        }
    }

    @Override // z1.W
    public TransformedText a(AnnotatedString text) {
        Intrinsics.j(text, "text");
        return new TransformedText(new AnnotatedString(CollectionsKt.B0(StringsKt.H1(text.getText(), 2), ":", null, null, 0, null, null, 62, null), text.h(), text.f()), new a());
    }
}
