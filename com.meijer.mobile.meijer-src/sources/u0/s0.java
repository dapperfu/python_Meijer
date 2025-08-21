package u0;

import V0.C5474k1;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.EditorInfo;
import androidx.compose.ui.platform.InterfaceC5982b1;
import androidx.compose.ui.platform.Q1;
import androidx.compose.ui.text.input.ImeOptions;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.C17778Q;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.math.MathKt;
import u0.q0;
import u1.TextLayoutResult;
import z1.InterfaceC18417E;
import z1.InterfaceC18426i;
import z1.TextFieldValue;

@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\rJU\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0018\u0010\u0016\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010\"\u001a\u00020\u00062\b\u0010 \u001a\u0004\u0018\u00010\u000e2\u0006\u0010!\u001a\u00020\u000e¢\u0006\u0004\b\"\u0010#J\u0015\u0010&\u001a\u00020\u00062\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J5\u0010/\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u000e2\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020$2\u0006\u0010.\u001a\u00020$¢\u0006\u0004\b/\u00100R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R(\u0010\u0016\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0004\u0012\u00020\u00060\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\"\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00060\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u00108R\u0018\u0010=\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0018\u0010A\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0018\u0010D\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010CR$\u0010J\u001a\u00020\u000e2\u0006\u0010E\u001a\u00020\u000e8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010KR\"\u0010O\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0M0L8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010NR\u001b\u0010S\u001a\u00020P8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010Q\u001a\u0004\bF\u0010RR$\u0010Z\u001a\u0004\u0018\u00010T8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\u0014\u0010]\u001a\u00020[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\\¨\u0006^"}, d2 = {"Lu0/s0;", "Landroidx/compose/ui/platform/b1;", "Landroid/view/View;", "view", "Lkotlin/Function1;", "LV0/k1;", "", "localToScreen", "Lu0/l0;", "inputMethodManager", "<init>", "(Landroid/view/View;Lkotlin/jvm/functions/Function1;Lu0/l0;)V", "k", "()V", "Lz1/M;", "value", "Lu0/q0$a;", "textInputNode", "Landroidx/compose/ui/text/input/ImeOptions;", "imeOptions", "", "Lz1/i;", "onEditCommand", "Landroidx/compose/ui/text/input/a;", "onImeActionPerformed", "l", "(Lz1/M;Lu0/q0$a;Landroidx/compose/ui/text/input/ImeOptions;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Landroid/view/inputmethod/EditorInfo;", "outAttributes", "Lu0/u0;", "g", "(Landroid/view/inputmethod/EditorInfo;)Lu0/u0;", "oldValue", "newValue", "m", "(Lz1/M;Lz1/M;)V", "Landroidx/compose/ui/geometry/Rect;", "rect", "j", "(Landroidx/compose/ui/geometry/Rect;)V", "textFieldValue", "Lz1/E;", "offsetMapping", "Lu1/v;", "textLayoutResult", "innerTextFieldBounds", "decorationBoxBounds", "n", "(Lz1/M;Lz1/E;Lu1/v;Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/geometry/Rect;)V", "a", "Landroid/view/View;", "i", "()Landroid/view/View;", "b", "Lu0/l0;", "c", "Lkotlin/jvm/functions/Function1;", "d", "Landroidx/compose/foundation/text/B;", "e", "Landroidx/compose/foundation/text/B;", "legacyTextFieldState", "Lw0/Q;", "f", "Lw0/Q;", "textFieldSelectionManager", "Landroidx/compose/ui/platform/Q1;", "Landroidx/compose/ui/platform/Q1;", "viewConfiguration", "<set-?>", "h", "Lz1/M;", "getState", "()Lz1/M;", "state", "Landroidx/compose/ui/text/input/ImeOptions;", "", "Ljava/lang/ref/WeakReference;", "Ljava/util/List;", "ics", "Landroid/view/inputmethod/BaseInputConnection;", "Lkotlin/Lazy;", "()Landroid/view/inputmethod/BaseInputConnection;", "baseInputConnection", "Landroid/graphics/Rect;", "Landroid/graphics/Rect;", "getFocusedRect$foundation_release", "()Landroid/graphics/Rect;", "setFocusedRect$foundation_release", "(Landroid/graphics/Rect;)V", "focusedRect", "Lu0/p0;", "Lu0/p0;", "cursorAnchorInfoController", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class s0 implements InterfaceC5982b1 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final View view;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final l0 inputMethodManager;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private androidx.compose.foundation.text.B legacyTextFieldState;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private C17778Q textFieldSelectionManager;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private Q1 viewConfiguration;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private Rect focusedRect;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final p0 cursorAnchorInfoController;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private Function1<? super List<? extends InterfaceC18426i>, Unit> onEditCommand = c.f163614f;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private Function1<? super androidx.compose.ui.text.input.a, Unit> onImeActionPerformed = d.f163615f;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private TextFieldValue state = new TextFieldValue("", androidx.compose.ui.text.y.INSTANCE.a(), (androidx.compose.ui.text.y) null, 4, (DefaultConstructorMarker) null);

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private ImeOptions imeOptions = ImeOptions.INSTANCE.a();

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private List<WeakReference<u0>> ics = new ArrayList();

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final Lazy baseInputConnection = LazyKt.a(LazyThreadSafetyMode.f143288c, new a());

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/view/inputmethod/BaseInputConnection;", "c", "()Landroid/view/inputmethod/BaseInputConnection;"}, k = 3, mv = {1, 9, 0})
    static final class a extends Lambda implements Function0<BaseInputConnection> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final BaseInputConnection invoke() {
            return new BaseInputConnection(s0.this.getView(), false);
        }
    }

    @Metadata(d1 = {"\u0000;\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0016ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ?\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001c\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001d"}, d2 = {"u0/s0$b", "Lu0/k0;", "", "Lz1/i;", "editCommands", "", "d", "(Ljava/util/List;)V", "Landroidx/compose/ui/text/input/a;", "imeAction", "c", "(I)V", "Landroid/view/KeyEvent;", "event", "a", "(Landroid/view/KeyEvent;)V", "", "immediate", "monitor", "includeInsertionMarker", "includeCharacterBounds", "includeEditorBounds", "includeLineBounds", "b", "(ZZZZZZ)V", "Lu0/u0;", "inputConnection", "e", "(Lu0/u0;)V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements k0 {
        b() {
        }

        @Override // u0.k0
        public void a(KeyEvent event) {
            s0.this.h().sendKeyEvent(event);
        }

        @Override // u0.k0
        public void b(boolean immediate, boolean monitor, boolean includeInsertionMarker, boolean includeCharacterBounds, boolean includeEditorBounds, boolean includeLineBounds) {
            s0.this.cursorAnchorInfoController.b(immediate, monitor, includeInsertionMarker, includeCharacterBounds, includeEditorBounds, includeLineBounds);
        }

        @Override // u0.k0
        public void c(int imeAction) {
            s0.this.onImeActionPerformed.invoke(androidx.compose.ui.text.input.a.j(imeAction));
        }

        @Override // u0.k0
        public void d(List<? extends InterfaceC18426i> editCommands) {
            s0.this.onEditCommand.invoke(editCommands);
        }

        @Override // u0.k0
        public void e(u0 inputConnection) {
            int size = s0.this.ics.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (Intrinsics.e(((WeakReference) s0.this.ics.get(i10)).get(), inputConnection)) {
                    s0.this.ics.remove(i10);
                    return;
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lz1/i;", "it", "", "a", "(Ljava/util/List;)V"}, k = 3, mv = {1, 9, 0})
    static final class c extends Lambda implements Function1<List<? extends InterfaceC18426i>, Unit> {

        /* renamed from: f, reason: collision with root package name */
        public static final c f163614f = new c();

        c() {
            super(1);
        }

        public final void a(List<? extends InterfaceC18426i> list) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends InterfaceC18426i> list) {
            a(list);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/text/input/a;", "it", "", "a", "(I)V"}, k = 3, mv = {1, 9, 0})
    static final class d extends Lambda implements Function1<androidx.compose.ui.text.input.a, Unit> {

        /* renamed from: f, reason: collision with root package name */
        public static final d f163615f = new d();

        d() {
            super(1);
        }

        public final void a(int i10) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.text.input.a aVar) {
            a(aVar.getValue());
            return Unit.f143329a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BaseInputConnection h() {
        return (BaseInputConnection) this.baseInputConnection.getValue();
    }

    private final void k() {
        this.inputMethodManager.d();
    }

    @Override // androidx.compose.ui.platform.InterfaceC5982b1
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public u0 a(EditorInfo outAttributes) {
        C17297A.c(outAttributes, this.state.h(), this.state.getSelection(), this.imeOptions, null, 8, null);
        r0.d(outAttributes);
        u0 u0Var = new u0(this.state, new b(), this.imeOptions.getAutoCorrect(), this.legacyTextFieldState, this.textFieldSelectionManager, this.viewConfiguration);
        this.ics.add(new WeakReference<>(u0Var));
        return u0Var;
    }

    /* renamed from: i, reason: from getter */
    public final View getView() {
        return this.view;
    }

    public final void j(androidx.compose.ui.geometry.Rect rect) {
        Rect rect2;
        this.focusedRect = new Rect(MathKt.d(rect.getLeft()), MathKt.d(rect.getTop()), MathKt.d(rect.l()), MathKt.d(rect.i()));
        if (!this.ics.isEmpty() || (rect2 = this.focusedRect) == null) {
            return;
        }
        this.view.requestRectangleOnScreen(new Rect(rect2));
    }

    public final void l(TextFieldValue value, q0.a textInputNode, ImeOptions imeOptions, Function1<? super List<? extends InterfaceC18426i>, Unit> onEditCommand, Function1<? super androidx.compose.ui.text.input.a, Unit> onImeActionPerformed) {
        this.state = value;
        this.imeOptions = imeOptions;
        this.onEditCommand = onEditCommand;
        this.onImeActionPerformed = onImeActionPerformed;
        this.legacyTextFieldState = textInputNode != null ? textInputNode.getLegacyTextFieldState() : null;
        this.textFieldSelectionManager = textInputNode != null ? textInputNode.getTextFieldSelectionManager() : null;
        this.viewConfiguration = textInputNode != null ? textInputNode.getViewConfiguration() : null;
    }

    public final void m(TextFieldValue oldValue, TextFieldValue newValue) {
        boolean z10 = (androidx.compose.ui.text.y.g(this.state.getSelection(), newValue.getSelection()) && Intrinsics.e(this.state.getComposition(), newValue.getComposition())) ? false : true;
        this.state = newValue;
        int size = this.ics.size();
        for (int i10 = 0; i10 < size; i10++) {
            u0 u0Var = this.ics.get(i10).get();
            if (u0Var != null) {
                u0Var.g(newValue);
            }
        }
        this.cursorAnchorInfoController.a();
        if (Intrinsics.e(oldValue, newValue)) {
            if (z10) {
                l0 l0Var = this.inputMethodManager;
                int iL = androidx.compose.ui.text.y.l(newValue.getSelection());
                int iK = androidx.compose.ui.text.y.k(newValue.getSelection());
                androidx.compose.ui.text.y composition = this.state.getComposition();
                int iL2 = composition != null ? androidx.compose.ui.text.y.l(composition.getPackedValue()) : -1;
                androidx.compose.ui.text.y composition2 = this.state.getComposition();
                l0Var.c(iL, iK, iL2, composition2 != null ? androidx.compose.ui.text.y.k(composition2.getPackedValue()) : -1);
                return;
            }
            return;
        }
        if (oldValue != null && (!Intrinsics.e(oldValue.h(), newValue.h()) || (androidx.compose.ui.text.y.g(oldValue.getSelection(), newValue.getSelection()) && !Intrinsics.e(oldValue.getComposition(), newValue.getComposition())))) {
            k();
            return;
        }
        int size2 = this.ics.size();
        for (int i11 = 0; i11 < size2; i11++) {
            u0 u0Var2 = this.ics.get(i11).get();
            if (u0Var2 != null) {
                u0Var2.h(this.state, this.inputMethodManager);
            }
        }
    }

    public final void n(TextFieldValue textFieldValue, InterfaceC18417E offsetMapping, TextLayoutResult textLayoutResult, androidx.compose.ui.geometry.Rect innerTextFieldBounds, androidx.compose.ui.geometry.Rect decorationBoxBounds) {
        this.cursorAnchorInfoController.d(textFieldValue, offsetMapping, textLayoutResult, innerTextFieldBounds, decorationBoxBounds);
    }

    public s0(View view, Function1<? super C5474k1, Unit> function1, l0 l0Var) {
        this.view = view;
        this.inputMethodManager = l0Var;
        this.cursorAnchorInfoController = new p0(function1, l0Var);
    }
}
