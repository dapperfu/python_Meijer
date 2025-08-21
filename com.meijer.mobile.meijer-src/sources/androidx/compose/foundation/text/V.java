package androidx.compose.foundation.text;

import android.view.InputDevice;
import android.view.KeyEvent;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.C5905f;
import androidx.compose.ui.focus.InterfaceC5914o;
import androidx.compose.ui.platform.D1;
import e1.C13750b;
import e1.C13751c;
import e1.C13752d;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a#\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001e\u0010\u000b\u001a\u00020\n*\u00020\u00072\u0006\u0010\t\u001a\u00020\bH\u0002ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\r"}, d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/text/B;", "state", "Landroidx/compose/ui/focus/o;", "focusManager", "b", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/text/B;Landroidx/compose/ui/focus/o;)Landroidx/compose/ui/Modifier;", "Le1/b;", "", "keyCode", "", "c", "(Landroid/view/KeyEvent;I)Z", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class V {

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Le1/b;", "keyEvent", "", "a", "(Landroid/view/KeyEvent;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    static final class a extends Lambda implements Function1<C13750b, Boolean> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC5914o f49493f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ B f49494g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC5914o interfaceC5914o, B b10) {
            super(1);
            this.f49493f = interfaceC5914o;
            this.f49494g = b10;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(C13750b c13750b) {
            return a(c13750b.getNativeKeyEvent());
        }

        public final Boolean a(KeyEvent keyEvent) {
            InputDevice device = keyEvent.getDevice();
            boolean zE = false;
            if (device != null && device.supportsSource(513) && !device.isVirtual() && C13751c.e(C13752d.b(keyEvent), C13751c.INSTANCE.a()) && keyEvent.getSource() != 257) {
                if (V.c(keyEvent, 19)) {
                    zE = this.f49493f.e(C5905f.INSTANCE.h());
                } else if (V.c(keyEvent, 20)) {
                    zE = this.f49493f.e(C5905f.INSTANCE.a());
                } else if (V.c(keyEvent, 21)) {
                    zE = this.f49493f.e(C5905f.INSTANCE.d());
                } else if (V.c(keyEvent, 22)) {
                    zE = this.f49493f.e(C5905f.INSTANCE.g());
                } else if (V.c(keyEvent, 23)) {
                    D1 keyboardController = this.f49494g.getKeyboardController();
                    if (keyboardController != null) {
                        keyboardController.a();
                    }
                    zE = true;
                }
            }
            return Boolean.valueOf(zE);
        }
    }

    public static final Modifier b(Modifier modifier, B b10, InterfaceC5914o interfaceC5914o) {
        return androidx.compose.ui.input.key.b.b(modifier, new a(interfaceC5914o, b10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(KeyEvent keyEvent, int i10) {
        if (e1.f.b(C13752d.a(keyEvent)) == i10) {
            return true;
        }
        return false;
    }
}
