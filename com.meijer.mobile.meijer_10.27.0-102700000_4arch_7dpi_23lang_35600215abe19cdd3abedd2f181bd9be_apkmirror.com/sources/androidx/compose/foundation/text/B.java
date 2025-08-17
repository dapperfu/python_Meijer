package androidx.compose.foundation.text;

import V0.C5346q0;
import V0.o1;
import androidx.compose.runtime.H0;
import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.t1;
import androidx.compose.ui.focus.InterfaceC5772o;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.platform.D1;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.y;
import kotlin.AbstractC18142l;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import z1.C18365k;
import z1.TextFieldValue;

@Metadata(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJl\u0010!\u001a\u00020\u00192\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00172\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fø\u0001\u0000¢\u0006\u0004\b!\u0010\"R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u00106\u001a\u0002018\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R$\u0010>\u001a\u0004\u0018\u0001078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R+\u0010D\u001a\u00020\n2\u0006\u0010?\u001a\u00020\n8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\b@\u0010\f\"\u0004\bB\u0010CR1\u0010K\u001a\u00020E2\u0006\u0010?\u001a\u00020E8F@FX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bF\u0010A\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\u0018\u0010N\u001a\u0004\u0018\u00010L8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010MR\u001c\u0010R\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010P0O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010AR$\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR+\u0010]\u001a\u00020X2\u0006\u0010?\u001a\u00020X8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bY\u0010A\u001a\u0004\b8\u0010Z\"\u0004\b[\u0010\\R+\u0010a\u001a\u00020\n2\u0006\u0010?\u001a\u00020\n8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b^\u0010A\u001a\u0004\b_\u0010\f\"\u0004\b`\u0010CR+\u0010d\u001a\u00020\n2\u0006\u0010?\u001a\u00020\n8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bG\u0010A\u001a\u0004\bb\u0010\f\"\u0004\bc\u0010CR+\u0010h\u001a\u00020\n2\u0006\u0010?\u001a\u00020\n8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\be\u0010A\u001a\u0004\bf\u0010\f\"\u0004\bg\u0010CR+\u0010l\u001a\u00020\n2\u0006\u0010?\u001a\u00020\n8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bi\u0010A\u001a\u0004\bj\u0010\f\"\u0004\bk\u0010CR$\u0010o\u001a\u00020\n2\u0006\u0010?\u001a\u00020\n8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b4\u0010m\u001a\u0004\bn\u0010\fR+\u0010r\u001a\u00020\n2\u0006\u0010?\u001a\u00020\n8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b+\u0010A\u001a\u0004\bp\u0010\f\"\u0004\bq\u0010CR\u0014\u0010v\u001a\u00020s8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010uR+\u0010y\u001a\u00020\n2\u0006\u0010?\u001a\u00020\n8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bw\u0010A\u001a\u0004\b-\u0010\f\"\u0004\bx\u0010CR+\u0010{\u001a\u00020\n2\u0006\u0010?\u001a\u00020\n8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bj\u0010A\u001a\u0004\bQ\u0010\f\"\u0004\bz\u0010CR\"\u0010}\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010|R#\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00178\u0006¢\u0006\f\n\u0004\bf\u0010|\u001a\u0004\bi\u0010~R$\u0010\u0080\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u007f\u0012\u0004\u0012\u00020\u00190\u00178\u0006¢\u0006\f\n\u0004\bb\u0010|\u001a\u0004\be\u0010~R\u001b\u0010\u0084\u0001\u001a\u00030\u0081\u00018\u0006¢\u0006\u000e\n\u0005\b%\u0010\u0082\u0001\u001a\u0005\bF\u0010\u0083\u0001R,\u0010 \u001a\u00020\u001f8\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0016\n\u0005\bT\u0010\u0085\u0001\u001a\u0005\bt\u0010\u0086\u0001\"\u0006\b\u0087\u0001\u0010\u0088\u0001R7\u0010\u008b\u0001\u001a\u00030\u0089\u00012\u0007\u0010?\u001a\u00030\u0089\u00018F@FX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0015\n\u0004\b\u000b\u0010A\u001a\u0005\bw\u0010\u0086\u0001\"\u0006\b\u008a\u0001\u0010\u0088\u0001R7\u0010\u008d\u0001\u001a\u00030\u0089\u00012\u0007\u0010?\u001a\u00030\u0089\u00018F@FX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0015\n\u0004\bp\u0010A\u001a\u0005\b2\u0010\u0086\u0001\"\u0006\b\u008c\u0001\u0010\u0088\u0001R-\u0010\u0091\u0001\u001a\u0004\u0018\u00010L2\t\u0010\u008e\u0001\u001a\u0004\u0018\u00010L8F@FX\u0086\u000e¢\u0006\u000f\u001a\u0005\bY\u0010\u008f\u0001\"\u0006\b\u0085\u0001\u0010\u0090\u0001R-\u0010\u0095\u0001\u001a\u0004\u0018\u00010P2\t\u0010\u008e\u0001\u001a\u0004\u0018\u00010P8F@FX\u0086\u000e¢\u0006\u000f\u001a\u0005\b^\u0010\u0092\u0001\"\u0006\b\u0093\u0001\u0010\u0094\u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0096\u0001"}, d2 = {"Landroidx/compose/foundation/text/B;", "", "Landroidx/compose/foundation/text/N;", "textDelegate", "Landroidx/compose/runtime/H0;", "recomposeScope", "Landroidx/compose/ui/platform/D1;", "keyboardController", "<init>", "(Landroidx/compose/foundation/text/N;Landroidx/compose/runtime/H0;Landroidx/compose/ui/platform/D1;)V", "", "z", "()Z", "Landroidx/compose/ui/text/AnnotatedString;", "untransformedText", "visualText", "Landroidx/compose/ui/text/z;", "textStyle", "softWrap", "LH1/d;", "density", "Ly1/l$b;", "fontFamilyResolver", "Lkotlin/Function1;", "Lz1/M;", "", "onValueChange", "Landroidx/compose/foundation/text/z;", "keyboardActions", "Landroidx/compose/ui/focus/o;", "focusManager", "LV0/q0;", "selectionBackgroundColor", "R", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/z;ZLH1/d;Ly1/l$b;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/text/z;Landroidx/compose/ui/focus/o;J)V", "a", "Landroidx/compose/foundation/text/N;", "x", "()Landroidx/compose/foundation/text/N;", "setTextDelegate", "(Landroidx/compose/foundation/text/N;)V", "b", "Landroidx/compose/runtime/H0;", "q", "()Landroidx/compose/runtime/H0;", "c", "Landroidx/compose/ui/platform/D1;", "j", "()Landroidx/compose/ui/platform/D1;", "Lz1/k;", "d", "Lz1/k;", "p", "()Lz1/k;", "processor", "Lz1/T;", "e", "Lz1/T;", "h", "()Lz1/T;", "H", "(Lz1/T;)V", "inputSession", "<set-?>", "f", "Landroidx/compose/runtime/l0;", "F", "(Z)V", "hasFocus", "LH1/h;", "g", "m", "()F", "L", "(F)V", "minHeightForSingleLineField", "Landroidx/compose/ui/layout/LayoutCoordinates;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "_layoutCoordinates", "Landroidx/compose/runtime/l0;", "Landroidx/compose/foundation/text/h0;", "i", "layoutResultState", "Landroidx/compose/ui/text/AnnotatedString;", "y", "()Landroidx/compose/ui/text/AnnotatedString;", "setUntransformedText", "(Landroidx/compose/ui/text/AnnotatedString;)V", "Landroidx/compose/foundation/text/o;", "k", "()Landroidx/compose/foundation/text/o;", "E", "(Landroidx/compose/foundation/text/o;)V", "handleState", "l", "u", "O", "showFloatingToolbar", "w", "Q", "showSelectionHandleStart", "n", "v", "P", "showSelectionHandleEnd", "o", "t", "N", "showCursorHandle", "Z", "B", "isLayoutResultStale", "A", "G", "isInTouchMode", "Landroidx/compose/foundation/text/x;", "r", "Landroidx/compose/foundation/text/x;", "keyboardActionRunner", "s", "C", "autofillHighlightOn", "I", "justAutofilled", "Lkotlin/jvm/functions/Function1;", "onValueChangeOriginal", "()Lkotlin/jvm/functions/Function1;", "Landroidx/compose/ui/text/input/a;", "onImeActionPerformed", "LV0/o1;", "LV0/o1;", "()LV0/o1;", "highlightPaint", "J", "()J", "setSelectionBackgroundColor-8_81llA", "(J)V", "Landroidx/compose/ui/text/y;", "M", "selectionPreviewHighlightRange", "D", "deletionPreviewHighlightRange", "value", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "layoutCoordinates", "()Landroidx/compose/foundation/text/h0;", "K", "(Landroidx/compose/foundation/text/h0;)V", "layoutResult", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class B {

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5730l0 deletionPreviewHighlightRange;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private N textDelegate;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final H0 recomposeScope;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final D1 keyboardController;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final C18365k processor = new C18365k();

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private z1.T inputSession;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5730l0 hasFocus;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5730l0 minHeightForSingleLineField;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private LayoutCoordinates _layoutCoordinates;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5730l0<h0> layoutResultState;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private AnnotatedString untransformedText;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5730l0 handleState;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5730l0 showFloatingToolbar;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5730l0 showSelectionHandleStart;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5730l0 showSelectionHandleEnd;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5730l0 showCursorHandle;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private boolean isLayoutResultStale;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5730l0 isInTouchMode;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final C5691x keyboardActionRunner;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5730l0 autofillHighlightOn;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5730l0 justAutofilled;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private Function1<? super TextFieldValue, Unit> onValueChangeOriginal;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final Function1<TextFieldValue, Unit> onValueChange;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final Function1<androidx.compose.ui.text.input.a, Unit> onImeActionPerformed;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final o1 highlightPaint;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private long selectionBackgroundColor;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5730l0 selectionPreviewHighlightRange;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/text/input/a;", "imeAction", "", "a", "(I)V"}, k = 3, mv = {1, 9, 0})
    static final class a extends Lambda implements Function1<androidx.compose.ui.text.input.a, Unit> {
        a() {
            super(1);
        }

        public final void a(int i10) {
            B.this.keyboardActionRunner.d(i10);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.text.input.a aVar) {
            a(aVar.getValue());
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lz1/M;", "it", "", "a", "(Lz1/M;)V"}, k = 3, mv = {1, 9, 0})
    static final class b extends Lambda implements Function1<TextFieldValue, Unit> {
        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue) {
            a(textFieldValue);
            return Unit.f142422a;
        }

        public final void a(TextFieldValue textFieldValue) {
            String text;
            String strH = textFieldValue.h();
            AnnotatedString untransformedText = B.this.getUntransformedText();
            if (untransformedText != null) {
                text = untransformedText.getText();
            } else {
                text = null;
            }
            if (!Intrinsics.e(strH, text)) {
                B.this.E(EnumC5683o.f49697a);
                if (B.this.i()) {
                    B.this.I(false);
                } else {
                    B.this.C(false);
                }
            }
            B b10 = B.this;
            y.Companion companion = androidx.compose.ui.text.y.INSTANCE;
            b10.M(companion.a());
            B.this.D(companion.a());
            B.this.onValueChangeOriginal.invoke(textFieldValue);
            B.this.getRecomposeScope().invalidate();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lz1/M;", "it", "", "a", "(Lz1/M;)V"}, k = 3, mv = {1, 9, 0})
    static final class c extends Lambda implements Function1<TextFieldValue, Unit> {

        /* renamed from: f, reason: collision with root package name */
        public static final c f49012f = new c();

        c() {
            super(1);
        }

        public final void a(TextFieldValue textFieldValue) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue) {
            a(textFieldValue);
            return Unit.f142422a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean A() {
        return ((Boolean) this.isInTouchMode.getValue()).booleanValue();
    }

    /* renamed from: B, reason: from getter */
    public final boolean getIsLayoutResultStale() {
        return this.isLayoutResultStale;
    }

    public final void C(boolean z10) {
        this.autofillHighlightOn.setValue(Boolean.valueOf(z10));
    }

    public final void D(long j10) {
        this.deletionPreviewHighlightRange.setValue(androidx.compose.ui.text.y.b(j10));
    }

    public final void E(EnumC5683o enumC5683o) {
        this.handleState.setValue(enumC5683o);
    }

    public final void F(boolean z10) {
        this.hasFocus.setValue(Boolean.valueOf(z10));
    }

    public final void G(boolean z10) {
        this.isInTouchMode.setValue(Boolean.valueOf(z10));
    }

    public final void H(z1.T t10) {
        this.inputSession = t10;
    }

    public final void I(boolean z10) {
        this.justAutofilled.setValue(Boolean.valueOf(z10));
    }

    public final void J(LayoutCoordinates layoutCoordinates) {
        this._layoutCoordinates = layoutCoordinates;
    }

    public final void K(h0 h0Var) {
        this.layoutResultState.setValue(h0Var);
        this.isLayoutResultStale = false;
    }

    public final void L(float f10) {
        this.minHeightForSingleLineField.setValue(H1.h.l(f10));
    }

    public final void M(long j10) {
        this.selectionPreviewHighlightRange.setValue(androidx.compose.ui.text.y.b(j10));
    }

    public final void N(boolean z10) {
        this.showCursorHandle.setValue(Boolean.valueOf(z10));
    }

    public final void O(boolean z10) {
        this.showFloatingToolbar.setValue(Boolean.valueOf(z10));
    }

    public final void P(boolean z10) {
        this.showSelectionHandleEnd.setValue(Boolean.valueOf(z10));
    }

    public final void Q(boolean z10) {
        this.showSelectionHandleStart.setValue(Boolean.valueOf(z10));
    }

    public final void R(AnnotatedString untransformedText, AnnotatedString visualText, TextStyle textStyle, boolean softWrap, H1.d density, AbstractC18142l.b fontFamilyResolver, Function1<? super TextFieldValue, Unit> onValueChange, C5693z keyboardActions, InterfaceC5772o focusManager, long selectionBackgroundColor) {
        this.onValueChangeOriginal = onValueChange;
        this.selectionBackgroundColor = selectionBackgroundColor;
        C5691x c5691x = this.keyboardActionRunner;
        c5691x.f(keyboardActions);
        c5691x.e(focusManager);
        this.untransformedText = untransformedText;
        N nC = O.c(this.textDelegate, visualText, textStyle, density, fontFamilyResolver, softWrap, 0, 0, 0, CollectionsKt.m(), 448, null);
        if (this.textDelegate != nC) {
            this.isLayoutResultStale = true;
        }
        this.textDelegate = nC;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean c() {
        return ((Boolean) this.autofillHighlightOn.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long d() {
        return ((androidx.compose.ui.text.y) this.deletionPreviewHighlightRange.getValue()).getPackedValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final EnumC5683o e() {
        return (EnumC5683o) this.handleState.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean f() {
        return ((Boolean) this.hasFocus.getValue()).booleanValue();
    }

    /* renamed from: g, reason: from getter */
    public final o1 getHighlightPaint() {
        return this.highlightPaint;
    }

    /* renamed from: h, reason: from getter */
    public final z1.T getInputSession() {
        return this.inputSession;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean i() {
        return ((Boolean) this.justAutofilled.getValue()).booleanValue();
    }

    /* renamed from: j, reason: from getter */
    public final D1 getKeyboardController() {
        return this.keyboardController;
    }

    public final LayoutCoordinates k() {
        LayoutCoordinates layoutCoordinates = this._layoutCoordinates;
        if (layoutCoordinates == null || !layoutCoordinates.isAttached()) {
            return null;
        }
        return layoutCoordinates;
    }

    public final h0 l() {
        return this.layoutResultState.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final float m() {
        return ((H1.h) this.minHeightForSingleLineField.getValue()).getValue();
    }

    public final Function1<androidx.compose.ui.text.input.a, Unit> n() {
        return this.onImeActionPerformed;
    }

    public final Function1<TextFieldValue, Unit> o() {
        return this.onValueChange;
    }

    /* renamed from: p, reason: from getter */
    public final C18365k getProcessor() {
        return this.processor;
    }

    /* renamed from: q, reason: from getter */
    public final H0 getRecomposeScope() {
        return this.recomposeScope;
    }

    /* renamed from: r, reason: from getter */
    public final long getSelectionBackgroundColor() {
        return this.selectionBackgroundColor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long s() {
        return ((androidx.compose.ui.text.y) this.selectionPreviewHighlightRange.getValue()).getPackedValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean t() {
        return ((Boolean) this.showCursorHandle.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean u() {
        return ((Boolean) this.showFloatingToolbar.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean v() {
        return ((Boolean) this.showSelectionHandleEnd.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean w() {
        return ((Boolean) this.showSelectionHandleStart.getValue()).booleanValue();
    }

    /* renamed from: x, reason: from getter */
    public final N getTextDelegate() {
        return this.textDelegate;
    }

    /* renamed from: y, reason: from getter */
    public final AnnotatedString getUntransformedText() {
        return this.untransformedText;
    }

    public B(N n10, H0 h02, D1 d12) {
        this.textDelegate = n10;
        this.recomposeScope = h02;
        this.keyboardController = d12;
        Boolean bool = Boolean.FALSE;
        this.hasFocus = t1.e(bool, null, 2, null);
        this.minHeightForSingleLineField = t1.e(H1.h.l(H1.h.p(0)), null, 2, null);
        this.layoutResultState = t1.e(null, null, 2, null);
        this.handleState = t1.e(EnumC5683o.f49697a, null, 2, null);
        this.showFloatingToolbar = t1.e(bool, null, 2, null);
        this.showSelectionHandleStart = t1.e(bool, null, 2, null);
        this.showSelectionHandleEnd = t1.e(bool, null, 2, null);
        this.showCursorHandle = t1.e(bool, null, 2, null);
        this.isLayoutResultStale = true;
        this.isInTouchMode = t1.e(Boolean.TRUE, null, 2, null);
        this.keyboardActionRunner = new C5691x(d12);
        this.autofillHighlightOn = t1.e(bool, null, 2, null);
        this.justAutofilled = t1.e(bool, null, 2, null);
        this.onValueChangeOriginal = c.f49012f;
        this.onValueChange = new b();
        this.onImeActionPerformed = new a();
        this.highlightPaint = V0.P.a();
        this.selectionBackgroundColor = C5346q0.INSTANCE.j();
        y.Companion companion = androidx.compose.ui.text.y.INSTANCE;
        this.selectionPreviewHighlightRange = t1.e(androidx.compose.ui.text.y.b(companion.a()), null, 2, null);
        this.deletionPreviewHighlightRange = t1.e(androidx.compose.ui.text.y.b(companion.a()), null, 2, null);
    }

    public final boolean z() {
        if (androidx.compose.ui.text.y.h(s()) && androidx.compose.ui.text.y.h(d())) {
            return false;
        }
        return true;
    }
}
