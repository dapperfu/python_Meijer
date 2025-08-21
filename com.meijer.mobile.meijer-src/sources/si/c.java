package si;

import ki.q1;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import u1.TextLayoutResult;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b`\u0018\u0000 \u00102\u00020\u00012\u00020\u0002:\u0001\u0010J3\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0001"}, d2 = {"Lsi/c;", "Lsi/b;", "Lsi/q;", "Lki/q1$j;", "template", "", "text", "Lkotlin/Function1;", "Lu1/v;", "", "onTextLayout", "m", "(Lki/q1$j;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "", "v", "()I", "a", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface c extends InterfaceC17076b, q {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final /* synthetic */ Companion INSTANCE = Companion.f160398a;

    default int v() {
        return 0;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lsi/c$a;", "", "<init>", "()V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: si.c$a, reason: from kotlin metadata */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f160398a = new Companion();

        private Companion() {
        }
    }

    default void m(q1.Label template, String text, Function1<? super TextLayoutResult, Unit> onTextLayout) {
        Intrinsics.j(template, "template");
        Intrinsics.j(text, "text");
        Intrinsics.j(onTextLayout, "onTextLayout");
        try {
            G().p(Integer.valueOf(v()), new p(template, getLocalThemeScope(), text, null, onTextLayout, null, 40, null));
        } catch (TypeCastException e10) {
            throw new TypeNotPresentException("If you expose the label, you must also implement UsesLabel in the composer!!", e10.getCause());
        }
    }
}
