package Ih;

import androidx.compose.ui.text.AnnotatedString;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import z1.InterfaceC18354E;
import z1.TransformedText;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LIh/H;", "", "<init>", "()V", "Landroidx/compose/ui/text/AnnotatedString;", "text", "Lz1/U;", "a", "(Landroidx/compose/ui/text/AnnotatedString;)Lz1/U;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class H {

    /* renamed from: a, reason: collision with root package name */
    public static final H f13923a = new H();

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0005¨\u0006\u0007"}, d2 = {"Ih/H$a", "Lz1/E;", "", "offset", "b", "(I)I", "a", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements InterfaceC18354E {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f13924b;

        @Override // z1.InterfaceC18354E
        public int a(int offset) {
            return (offset < 0 || offset >= 2) ? (2 > offset || offset >= 5) ? (5 > offset || offset >= 10) ? (10 > offset || offset >= 15) ? this.f13924b.length() : offset - 4 : offset - 3 : offset - 1 : offset;
        }

        a(String str) {
            this.f13924b = str;
        }

        @Override // z1.InterfaceC18354E
        public int b(int offset) {
            if (offset <= 0) {
                return offset;
            }
            if (offset <= 2) {
                return offset + 1;
            }
            if (offset <= 5) {
                return offset + 3;
            }
            if (offset <= 9) {
                return offset + 4;
            }
            return 14;
        }
    }

    public final TransformedText a(AnnotatedString text) {
        Intrinsics.j(text, "text");
        int length = text.getText().length();
        int i10 = 0;
        String text2 = text.getText();
        if (length >= 10) {
            text2 = StringsKt.g1(text2, new IntRange(0, 9));
        }
        AnnotatedString.b bVar = new AnnotatedString.b(0, 1, null);
        int i11 = 0;
        while (i10 < text2.length()) {
            char cCharAt = text2.charAt(i10);
            int i12 = i11 + 1;
            if (i11 == 0) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append('(');
                sb2.append(cCharAt);
                bVar.g(sb2.toString());
            } else {
                bVar.append(cCharAt);
            }
            if (i11 == 2) {
                bVar.g(") ");
            }
            if (i11 == 5) {
                bVar.g("-");
            }
            i10++;
            i11 = i12;
        }
        return new TransformedText(bVar.q(), new a(text2));
    }

    private H() {
    }
}
