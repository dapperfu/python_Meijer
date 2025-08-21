package kotlin;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u0000 \f2\u00020\u0001:\u0001\fJ\u001b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\rø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0001"}, d2 = {"Ly1/J;", "", "Ly1/l;", "fontFamily", "b", "(Ly1/l;)Ly1/l;", "Ly1/B;", "fontWeight", "c", "(Ly1/B;)Ly1/B;", "Ly1/w;", "fontStyle", "a", "(I)I", "Ly1/x;", "fontSynthesis", "d", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: y1.J, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC18243J {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f171071a;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Ly1/J$a;", "", "<init>", "()V", "Ly1/J;", "b", "Ly1/J;", "a", "()Ly1/J;", "Default", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: y1.J$a, reason: from kotlin metadata */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f171071a = new Companion();

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final InterfaceC18243J Default = new C2753a();

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"y1/J$a$a", "Ly1/J;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: y1.J$a$a, reason: collision with other inner class name */
        public static final class C2753a implements InterfaceC18243J {
            C2753a() {
            }
        }

        public final InterfaceC18243J a() {
            return Default;
        }

        private Companion() {
        }
    }

    default int a(int fontStyle) {
        return fontStyle;
    }

    default AbstractC18269l b(AbstractC18269l fontFamily) {
        return fontFamily;
    }

    default FontWeight c(FontWeight fontWeight) {
        return fontWeight;
    }

    default int d(int fontSynthesis) {
        return fontSynthesis;
    }
}
