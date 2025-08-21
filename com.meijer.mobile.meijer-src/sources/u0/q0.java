package u0;

import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.platform.D1;
import androidx.compose.ui.platform.InterfaceC5991e1;
import androidx.compose.ui.platform.Q1;
import i0.C14592e;
import kotlin.C17778Q;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.C0;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\b \u0018\u00002\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bJ\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u0003J\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\f\u001a\u00020\u0006H&¢\u0006\u0004\b\f\u0010\u0003R(\u0010\u0012\u001a\u0004\u0018\u00010\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u00048\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lu0/q0;", "Lz1/I;", "<init>", "()V", "Lu0/q0$a;", "node", "", "j", "(Lu0/q0$a;)V", "l", "f", "c", "k", "<set-?>", "a", "Lu0/q0$a;", "i", "()Lu0/q0$a;", "textInputModifierNode", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public abstract class q0 implements z1.I {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private a textInputModifierNode;

    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J:\u0010\t\u001a\u0004\u0018\u00010\b2'\u0010\u0007\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002¢\u0006\u0002\b\u0006H&¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u00178&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001fÀ\u0006\u0001"}, d2 = {"Lu0/q0$a;", "", "Lkotlin/Function2;", "Landroidx/compose/ui/platform/e1;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "Lmv/C0;", "h1", "(Lkotlin/jvm/functions/Function2;)Lmv/C0;", "Landroidx/compose/ui/platform/D1;", "getSoftwareKeyboardController", "()Landroidx/compose/ui/platform/D1;", "softwareKeyboardController", "Landroidx/compose/ui/layout/LayoutCoordinates;", "B", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "layoutCoordinates", "Landroidx/compose/foundation/text/B;", "X1", "()Landroidx/compose/foundation/text/B;", "legacyTextFieldState", "Lw0/Q;", "u1", "()Lw0/Q;", "textFieldSelectionManager", "Landroidx/compose/ui/platform/Q1;", "getViewConfiguration", "()Landroidx/compose/ui/platform/Q1;", "viewConfiguration", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        LayoutCoordinates B();

        androidx.compose.foundation.text.B X1();

        D1 getSoftwareKeyboardController();

        Q1 getViewConfiguration();

        C0 h1(Function2<? super InterfaceC5991e1, ? super Continuation<?>, ? extends Object> block);

        C17778Q u1();
    }

    public abstract void k();

    @Override // z1.I
    public final void c() {
        D1 softwareKeyboardController;
        a aVar = this.textInputModifierNode;
        if (aVar == null || (softwareKeyboardController = aVar.getSoftwareKeyboardController()) == null) {
            return;
        }
        softwareKeyboardController.b();
    }

    @Override // z1.I
    public final void f() {
        D1 softwareKeyboardController;
        a aVar = this.textInputModifierNode;
        if (aVar == null || (softwareKeyboardController = aVar.getSoftwareKeyboardController()) == null) {
            return;
        }
        softwareKeyboardController.a();
    }

    /* renamed from: i, reason: from getter */
    protected final a getTextInputModifierNode() {
        return this.textInputModifierNode;
    }

    public final void j(a node) {
        if (!(this.textInputModifierNode == null)) {
            C14592e.c("Expected textInputModifierNode to be null");
        }
        this.textInputModifierNode = node;
    }

    public final void l(a node) {
        if (!(this.textInputModifierNode == node)) {
            C14592e.c("Expected textInputModifierNode to be " + node + " but was " + this.textInputModifierNode);
        }
        this.textInputModifierNode = null;
    }
}
