package androidx.compose.ui.focus;

import Z.T;
import android.view.KeyEvent;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import i1.RotaryScrollEvent;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b`\u0018\u00002\u00020\u0001J&\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ:\u0010\r\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u00042\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\nH&ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0010\u0010\u0011J2\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0011\u0010\u0017\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0017\u0010\u0018J*\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00192\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00060\u001bH&ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0019H&ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J'\u0010#\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020!2\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00060\u001bH&¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020\u000bH&¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020(H&¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020+H&¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u000fH&¢\u0006\u0004\b.\u0010\u0011R\u0014\u00102\u001a\u00020/8&X¦\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u0014\u00106\u001a\u0002038&X¦\u0004¢\u0006\u0006\u001a\u0004\b4\u00105R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u000208078&X¦\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0014\u0010?\u001a\u00020<8&X¦\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>R\u001e\u0010C\u001a\u0004\u0018\u00010\u000b8&@&X¦\u000e¢\u0006\f\u001a\u0004\b@\u0010A\"\u0004\bB\u0010'R\u001c\u0010H\u001a\u00020\u00068&@&X¦\u000e¢\u0006\f\u001a\u0004\bD\u0010E\"\u0004\bF\u0010Gø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006IÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/focus/s;", "Landroidx/compose/ui/focus/o;", "Landroidx/compose/ui/focus/f;", "focusDirection", "Landroidx/compose/ui/geometry/Rect;", "previouslyFocusedRect", "", "u", "(Landroidx/compose/ui/focus/f;Landroidx/compose/ui/geometry/Rect;)Z", "focusedRect", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/FocusTargetNode;", "onFound", "w", "(ILandroidx/compose/ui/geometry/Rect;Lkotlin/jvm/functions/Function1;)Ljava/lang/Boolean;", "", "s", "()V", "force", "refreshFocusEvents", "clearOwnerFocus", "n", "(ZZZI)Z", "q", "()Landroidx/compose/ui/geometry/Rect;", "Le1/b;", "keyEvent", "Lkotlin/Function0;", "onFocusedItem", "k", "(Landroid/view/KeyEvent;Lkotlin/jvm/functions/Function0;)Z", "g", "(Landroid/view/KeyEvent;)Z", "Li1/b;", "event", "c", "(Li1/b;Lkotlin/jvm/functions/Function0;)Z", "node", "i", "(Landroidx/compose/ui/focus/FocusTargetNode;)V", "Landroidx/compose/ui/focus/i;", "b", "(Landroidx/compose/ui/focus/i;)V", "Landroidx/compose/ui/focus/w;", "p", "(Landroidx/compose/ui/focus/w;)V", "j", "Landroidx/compose/ui/Modifier;", "a", "()Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/focus/J;", "d", "()Landroidx/compose/ui/focus/J;", "focusTransactionManager", "LZ/T;", "Landroidx/compose/ui/focus/n;", "t", "()LZ/T;", "listeners", "Landroidx/compose/ui/focus/E;", "o", "()Landroidx/compose/ui/focus/E;", "rootState", "h", "()Landroidx/compose/ui/focus/FocusTargetNode;", "r", "activeFocusTargetNode", "m", "()Z", "setFocusCaptured", "(Z)V", "isFocusCaptured", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface s extends InterfaceC5914o {

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "c", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    public static final class a extends Lambda implements Function0<Boolean> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f50897f = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    Modifier a();

    void b(InterfaceC5908i node);

    boolean c(RotaryScrollEvent event, Function0<Boolean> onFocusedItem);

    J d();

    boolean g(KeyEvent keyEvent);

    FocusTargetNode h();

    void i(FocusTargetNode node);

    void j();

    boolean k(KeyEvent keyEvent, Function0<Boolean> onFocusedItem);

    boolean m();

    boolean n(boolean force, boolean refreshFocusEvents, boolean clearOwnerFocus, int focusDirection);

    E o();

    void p(w node);

    Rect q();

    void r(FocusTargetNode focusTargetNode);

    void s();

    T<InterfaceC5913n> t();

    boolean u(C5905f focusDirection, Rect previouslyFocusedRect);

    Boolean w(int focusDirection, Rect focusedRect, Function1<? super FocusTargetNode, Boolean> onFound);

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ boolean f(s sVar, KeyEvent keyEvent, Function0 function0, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: dispatchKeyEvent-YhN2O0w");
        }
        if ((i10 & 2) != 0) {
            function0 = a.f50897f;
        }
        return sVar.k(keyEvent, function0);
    }
}
