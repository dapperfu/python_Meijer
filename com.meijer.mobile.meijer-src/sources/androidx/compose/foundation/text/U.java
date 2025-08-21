package androidx.compose.foundation.text;

import androidx.compose.ui.text.TextStyle;
import kotlin.AbstractC18269l;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import u1.InterfaceC17341f;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a;\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\f\"\u001a\u0010\u0010\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/text/z;", "style", "LH1/d;", "density", "Ly1/l$b;", "fontFamilyResolver", "", "text", "", "maxLines", "LH1/r;", "a", "(Landroidx/compose/ui/text/z;LH1/d;Ly1/l$b;Ljava/lang/String;I)J", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "EmptyTextReplacement", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class U {

    /* renamed from: a, reason: collision with root package name */
    private static final String f49492a = StringsKt.M("H", 10);

    public static /* synthetic */ long b(TextStyle textStyle, H1.d dVar, AbstractC18269l.b bVar, String str, int i10, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            str = f49492a;
        }
        if ((i11 & 16) != 0) {
            i10 = 1;
        }
        return a(textStyle, dVar, bVar, str, i10);
    }

    public static final String c() {
        return f49492a;
    }

    public static final long a(TextStyle textStyle, H1.d dVar, AbstractC18269l.b bVar, String str, int i10) {
        InterfaceC17341f interfaceC17341fA = androidx.compose.ui.text.m.a(str, textStyle, H1.c.b(0, 0, 0, 0, 15, null), dVar, bVar, (64 & 32) != 0 ? CollectionsKt.m() : CollectionsKt.m(), (64 & 64) != 0 ? CollectionsKt.m() : null, (64 & 128) != 0 ? Integer.MAX_VALUE : i10, (64 & 256) != 0 ? F1.t.INSTANCE.a() : F1.t.INSTANCE.a());
        return H1.r.c((O.a(interfaceC17341fA.e()) << 32) | (O.a(interfaceC17341fA.getHeight()) & 4294967295L));
    }
}
