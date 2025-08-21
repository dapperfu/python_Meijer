package z1;

import V0.C5474k1;
import androidx.compose.ui.geometry.Rect;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import u1.TextLayoutResult;

@Deprecated
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJI\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\b0\u00162\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000b¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001f\u001a\u00020\r2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u001e\u001a\u00020\u0010¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0011\u0010%\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\"\u0010$¨\u0006&"}, d2 = {"Lz1/T;", "", "Lz1/O;", "textInputService", "Lz1/I;", "platformTextInputService", "<init>", "(Lz1/O;Lz1/I;)V", "", "a", "()V", "Landroidx/compose/ui/geometry/Rect;", "rect", "", "c", "(Landroidx/compose/ui/geometry/Rect;)Z", "Lz1/M;", "textFieldValue", "Lz1/E;", "offsetMapping", "Lu1/v;", "textLayoutResult", "Lkotlin/Function1;", "LV0/k1;", "textFieldToRootTransform", "innerTextFieldBounds", "decorationBoxBounds", "e", "(Lz1/M;Lz1/E;Lu1/v;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/geometry/Rect;)Z", "oldValue", "newValue", "d", "(Lz1/M;Lz1/M;)Z", "Lz1/O;", "b", "Lz1/I;", "()Z", "isOpen", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class T {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final O textInputService;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final I platformTextInputService;

    public final void a() {
        this.textInputService.g(this);
    }

    public final boolean b() {
        return Intrinsics.e(this.textInputService.a(), this);
    }

    public T(O o10, I i10) {
        this.textInputService = o10;
        this.platformTextInputService = i10;
    }

    public final boolean c(Rect rect) {
        boolean zB = b();
        if (zB) {
            this.platformTextInputService.h(rect);
        }
        return zB;
    }

    public final boolean d(TextFieldValue oldValue, TextFieldValue newValue) {
        boolean zB = b();
        if (zB) {
            this.platformTextInputService.e(oldValue, newValue);
        }
        return zB;
    }

    public final boolean e(TextFieldValue textFieldValue, InterfaceC18417E offsetMapping, TextLayoutResult textLayoutResult, Function1<? super C5474k1, Unit> textFieldToRootTransform, Rect innerTextFieldBounds, Rect decorationBoxBounds) {
        boolean zB = b();
        if (zB) {
            this.platformTextInputService.g(textFieldValue, offsetMapping, textLayoutResult, textFieldToRootTransform, innerTextFieldBounds, decorationBoxBounds);
        }
        return zB;
    }
}
