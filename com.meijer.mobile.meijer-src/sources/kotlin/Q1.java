package kotlin;

import F1.LineHeightStyle;
import androidx.compose.runtime.F0;
import androidx.compose.runtime.r;
import androidx.compose.ui.text.TextStyle;
import kotlin.AbstractC18269l;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\"\u001a\u0010\n\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u001a\u0010\u000e\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r\" \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/text/z;", "Ly1/l;", "default", "d", "(Landroidx/compose/ui/text/z;Ly1/l;)Landroidx/compose/ui/text/z;", "LF1/h;", "a", "LF1/h;", "getDefaultLineHeightStyle", "()LF1/h;", "DefaultLineHeightStyle", "b", "Landroidx/compose/ui/text/z;", "()Landroidx/compose/ui/text/z;", "DefaultTextStyle", "Landroidx/compose/runtime/F0;", "Lx0/P1;", "c", "Landroidx/compose/runtime/F0;", "()Landroidx/compose/runtime/F0;", "LocalTypography", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Q1 {

    /* renamed from: a, reason: collision with root package name */
    private static final LineHeightStyle f168473a;

    /* renamed from: b, reason: collision with root package name */
    private static final TextStyle f168474b;

    /* renamed from: c, reason: collision with root package name */
    private static final F0<Typography> f168475c;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lx0/P1;", "c", "()Lx0/P1;"}, k = 3, mv = {1, 9, 0})
    static final class a extends Lambda implements Function0<Typography> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f168476f = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Typography invoke() {
            return new Typography(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
        }
    }

    static {
        LineHeightStyle lineHeightStyle = new LineHeightStyle(LineHeightStyle.a.INSTANCE.a(), LineHeightStyle.d.INSTANCE.b(), (DefaultConstructorMarker) null);
        f168473a = lineHeightStyle;
        f168474b = TextStyle.c(TextStyle.INSTANCE.a(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, C17973U.a(), lineHeightStyle, 0, 0, null, 15204351, null);
        f168475c = r.f(a.f168476f);
    }

    public static final TextStyle b() {
        return f168474b;
    }

    public static final F0<Typography> c() {
        return f168475c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextStyle d(TextStyle textStyle, AbstractC18269l abstractC18269l) {
        if (textStyle.j() != null) {
            return textStyle;
        }
        return TextStyle.c(textStyle, 0L, 0L, null, null, null, abstractC18269l, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777183, null);
    }
}
