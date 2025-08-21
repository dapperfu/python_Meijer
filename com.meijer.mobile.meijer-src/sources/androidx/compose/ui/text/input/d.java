package androidx.compose.ui.text.input;

import V0.C5474k1;
import android.graphics.Rect;
import android.view.Choreographer;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.ui.text.y;
import g1.InterfaceC14305h;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import u1.TextLayoutResult;
import z1.C18422e;
import z1.C18436t;
import z1.I;
import z1.InterfaceC18417E;
import z1.InterfaceC18426i;
import z1.InterfaceC18435s;
import z1.TextFieldValue;
import z1.r;

@Deprecated
@Metadata(d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001-B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u0016¢\u0006\u0004\b\u001f\u0010 JM\u0010+\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#2\u0018\u0010(\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0&\u0012\u0004\u0012\u00020\u00100%2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u00100%H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0010H\u0016¢\u0006\u0004\b-\u0010\u0014J\u000f\u0010.\u001a\u00020\u0010H\u0016¢\u0006\u0004\b.\u0010\u0014J\u000f\u0010/\u001a\u00020\u0010H\u0016¢\u0006\u0004\b/\u0010\u0014J\u000f\u00100\u001a\u00020\u0010H\u0016¢\u0006\u0004\b0\u0010\u0014J!\u00103\u001a\u00020\u00102\b\u00101\u001a\u0004\u0018\u00010!2\u0006\u00102\u001a\u00020!H\u0016¢\u0006\u0004\b3\u00104J\u0017\u00107\u001a\u00020\u00102\u0006\u00106\u001a\u000205H\u0017¢\u0006\u0004\b7\u00108JK\u0010B\u001a\u00020\u00102\u0006\u00109\u001a\u00020!2\u0006\u0010;\u001a\u00020:2\u0006\u0010=\u001a\u00020<2\u0012\u0010?\u001a\u000e\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020\u00100%2\u0006\u0010@\u001a\u0002052\u0006\u0010A\u001a\u000205H\u0016¢\u0006\u0004\bB\u0010CR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b-\u0010D\u001a\u0004\bE\u0010FR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010GR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010HR\u0016\u0010J\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010IR(\u0010(\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0&\u0012\u0004\u0012\u00020\u00100%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010KR\"\u0010*\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u00100%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010KR$\u0010P\u001a\u00020!2\u0006\u0010L\u001a\u00020!8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bB\u0010M\u001a\u0004\bN\u0010OR\u0016\u0010$\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u0010QR\"\u0010W\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020T0S0R8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR\u001b\u0010]\u001a\u00020X8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\R\u0018\u0010a\u001a\u0004\u0018\u00010^8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010`R\u0014\u0010e\u001a\u00020b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010dR\u001a\u0010i\u001a\b\u0012\u0004\u0012\u00020\u000e0f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010hR\u0018\u0010m\u001a\u0004\u0018\u00010j8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010l¨\u0006n"}, d2 = {"Landroidx/compose/ui/text/input/d;", "Lz1/I;", "Landroid/view/View;", "view", "Lg1/h;", "rootPositionCalculator", "Lz1/s;", "inputMethodManager", "Ljava/util/concurrent/Executor;", "inputCommandProcessorExecutor", "<init>", "(Landroid/view/View;Lg1/h;Lz1/s;Ljava/util/concurrent/Executor;)V", "positionCalculator", "(Landroid/view/View;Lg1/h;)V", "Landroidx/compose/ui/text/input/d$a;", "command", "", "v", "(Landroidx/compose/ui/text/input/d$a;)V", "s", "()V", "u", "", "visible", "x", "(Z)V", "Landroid/view/inputmethod/EditorInfo;", "outAttrs", "Landroid/view/inputmethod/InputConnection;", "o", "(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;", "r", "()Z", "Lz1/M;", "value", "Landroidx/compose/ui/text/input/ImeOptions;", "imeOptions", "Lkotlin/Function1;", "", "Lz1/i;", "onEditCommand", "Landroidx/compose/ui/text/input/a;", "onImeActionPerformed", "d", "(Lz1/M;Landroidx/compose/ui/text/input/ImeOptions;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "a", "b", "f", "c", "oldValue", "newValue", "e", "(Lz1/M;Lz1/M;)V", "Landroidx/compose/ui/geometry/Rect;", "rect", "h", "(Landroidx/compose/ui/geometry/Rect;)V", "textFieldValue", "Lz1/E;", "offsetMapping", "Lu1/v;", "textLayoutResult", "LV0/k1;", "textFieldToRootTransform", "innerTextFieldBounds", "decorationBoxBounds", "g", "(Lz1/M;Lz1/E;Lu1/v;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/geometry/Rect;)V", "Landroid/view/View;", "q", "()Landroid/view/View;", "Lz1/s;", "Ljava/util/concurrent/Executor;", "Z", "editorHasFocus", "Lkotlin/jvm/functions/Function1;", "<set-?>", "Lz1/M;", "getState$ui_release", "()Lz1/M;", "state", "Landroidx/compose/ui/text/input/ImeOptions;", "", "Ljava/lang/ref/WeakReference;", "Landroidx/compose/ui/text/input/c;", "i", "Ljava/util/List;", "ics", "Landroid/view/inputmethod/BaseInputConnection;", "j", "Lkotlin/Lazy;", "p", "()Landroid/view/inputmethod/BaseInputConnection;", "baseInputConnection", "Landroid/graphics/Rect;", "k", "Landroid/graphics/Rect;", "focusedRect", "Lz1/e;", "l", "Lz1/e;", "cursorAnchorInfoController", "LD0/c;", "m", "LD0/c;", "textInputCommandQueue", "Ljava/lang/Runnable;", "n", "Ljava/lang/Runnable;", "frameCallback", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class d implements I {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final View view;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC18435s inputMethodManager;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Executor inputCommandProcessorExecutor;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean editorHasFocus;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private Function1<? super List<? extends InterfaceC18426i>, Unit> onEditCommand;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private Function1<? super androidx.compose.ui.text.input.a, Unit> onImeActionPerformed;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private TextFieldValue state;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private ImeOptions imeOptions;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private List<WeakReference<androidx.compose.ui.text.input.c>> ics;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final Lazy baseInputConnection;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private Rect focusedRect;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final C18422e cursorAnchorInfoController;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final D0.c<a> textInputCommandQueue;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private Runnable frameCallback;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/text/input/d$a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f52759a = new a("StartInput", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final a f52760b = new a("StopInput", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final a f52761c = new a("ShowKeyboard", 2);

        /* renamed from: d, reason: collision with root package name */
        public static final a f52762d = new a("HideKeyboard", 3);

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ a[] f52763e;

        /* renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f52764f;

        private static final /* synthetic */ a[] a() {
            return new a[]{f52759a, f52760b, f52761c, f52762d};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f52763e.clone();
        }

        static {
            a[] aVarArrA = a();
            f52763e = aVarArrA;
            f52764f = EnumEntriesKt.a(aVarArrA);
        }

        private a(String str, int i10) {
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.f52759a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.f52760b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.f52761c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a.f52762d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/view/inputmethod/BaseInputConnection;", "c", "()Landroid/view/inputmethod/BaseInputConnection;"}, k = 3, mv = {1, 9, 0})
    static final class c extends Lambda implements Function0<BaseInputConnection> {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final BaseInputConnection invoke() {
            return new BaseInputConnection(d.this.getView(), false);
        }
    }

    @Metadata(d1 = {"\u0000;\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0016ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ?\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001c\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001d"}, d2 = {"androidx/compose/ui/text/input/d$d", "Lz1/r;", "", "Lz1/i;", "editCommands", "", "d", "(Ljava/util/List;)V", "Landroidx/compose/ui/text/input/a;", "imeAction", "c", "(I)V", "Landroid/view/KeyEvent;", "event", "a", "(Landroid/view/KeyEvent;)V", "", "immediate", "monitor", "includeInsertionMarker", "includeCharacterBounds", "includeEditorBounds", "includeLineBounds", "b", "(ZZZZZZ)V", "Landroidx/compose/ui/text/input/c;", "inputConnection", "e", "(Landroidx/compose/ui/text/input/c;)V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.text.input.d$d, reason: collision with other inner class name */
    public static final class C1087d implements r {
        C1087d() {
        }

        @Override // z1.r
        public void a(KeyEvent event) {
            d.this.p().sendKeyEvent(event);
        }

        @Override // z1.r
        public void b(boolean immediate, boolean monitor, boolean includeInsertionMarker, boolean includeCharacterBounds, boolean includeEditorBounds, boolean includeLineBounds) {
            d.this.cursorAnchorInfoController.b(immediate, monitor, includeInsertionMarker, includeCharacterBounds, includeEditorBounds, includeLineBounds);
        }

        @Override // z1.r
        public void c(int imeAction) {
            d.this.onImeActionPerformed.invoke(androidx.compose.ui.text.input.a.j(imeAction));
        }

        @Override // z1.r
        public void d(List<? extends InterfaceC18426i> editCommands) {
            d.this.onEditCommand.invoke(editCommands);
        }

        @Override // z1.r
        public void e(androidx.compose.ui.text.input.c inputConnection) {
            int size = d.this.ics.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (Intrinsics.e(((WeakReference) d.this.ics.get(i10)).get(), inputConnection)) {
                    d.this.ics.remove(i10);
                    return;
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lz1/i;", "it", "", "a", "(Ljava/util/List;)V"}, k = 3, mv = {1, 9, 0})
    static final class e extends Lambda implements Function1<List<? extends InterfaceC18426i>, Unit> {

        /* renamed from: f, reason: collision with root package name */
        public static final e f52767f = new e();

        e() {
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
    static final class f extends Lambda implements Function1<androidx.compose.ui.text.input.a, Unit> {

        /* renamed from: f, reason: collision with root package name */
        public static final f f52768f = new f();

        f() {
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

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lz1/i;", "it", "", "a", "(Ljava/util/List;)V"}, k = 3, mv = {1, 9, 0})
    static final class g extends Lambda implements Function1<List<? extends InterfaceC18426i>, Unit> {

        /* renamed from: f, reason: collision with root package name */
        public static final g f52769f = new g();

        g() {
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
    static final class h extends Lambda implements Function1<androidx.compose.ui.text.input.a, Unit> {

        /* renamed from: f, reason: collision with root package name */
        public static final h f52770f = new h();

        h() {
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

    public d(View view, InterfaceC14305h interfaceC14305h, InterfaceC18435s interfaceC18435s, Executor executor) {
        this.view = view;
        this.inputMethodManager = interfaceC18435s;
        this.inputCommandProcessorExecutor = executor;
        this.onEditCommand = e.f52767f;
        this.onImeActionPerformed = f.f52768f;
        this.state = new TextFieldValue("", y.INSTANCE.a(), (y) null, 4, (DefaultConstructorMarker) null);
        this.imeOptions = ImeOptions.INSTANCE.a();
        this.ics = new ArrayList();
        this.baseInputConnection = LazyKt.a(LazyThreadSafetyMode.f143288c, new c());
        this.cursorAnchorInfoController = new C18422e(interfaceC14305h, interfaceC18435s);
        this.textInputCommandQueue = new D0.c<>(new a[16], 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(d dVar) {
        dVar.frameCallback = null;
        dVar.s();
    }

    @Override // z1.I
    public void b() {
        this.editorHasFocus = false;
        this.onEditCommand = g.f52769f;
        this.onImeActionPerformed = h.f52770f;
        this.focusedRect = null;
        v(a.f52760b);
    }

    @Override // z1.I
    public void d(TextFieldValue value, ImeOptions imeOptions, Function1<? super List<? extends InterfaceC18426i>, Unit> onEditCommand, Function1<? super androidx.compose.ui.text.input.a, Unit> onImeActionPerformed) {
        this.editorHasFocus = true;
        this.state = value;
        this.imeOptions = imeOptions;
        this.onEditCommand = onEditCommand;
        this.onImeActionPerformed = onImeActionPerformed;
        v(a.f52759a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BaseInputConnection p() {
        return (BaseInputConnection) this.baseInputConnection.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void s() {
        View viewFindFocus;
        if (!this.view.isFocused() && (viewFindFocus = this.view.getRootView().findFocus()) != null && viewFindFocus.onCheckIsTextEditor()) {
            this.textInputCommandQueue.k();
            return;
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        D0.c<a> cVar = this.textInputCommandQueue;
        a[] aVarArr = cVar.content;
        int size = cVar.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            t(aVarArr[i10], objectRef, objectRef2);
        }
        this.textInputCommandQueue.k();
        if (Intrinsics.e(objectRef.f143742a, Boolean.TRUE)) {
            u();
        }
        Boolean bool = (Boolean) objectRef2.f143742a;
        if (bool != null) {
            x(bool.booleanValue());
        }
        if (Intrinsics.e(objectRef.f143742a, Boolean.FALSE)) {
            u();
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [T, java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r3v2, types: [T, java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r3v3, types: [T, java.lang.Boolean] */
    private static final void t(a aVar, Ref.ObjectRef<Boolean> objectRef, Ref.ObjectRef<Boolean> objectRef2) {
        int i10 = b.$EnumSwitchMapping$0[aVar.ordinal()];
        if (i10 == 1) {
            ?? r32 = Boolean.TRUE;
            objectRef.f143742a = r32;
            objectRef2.f143742a = r32;
        } else if (i10 == 2) {
            ?? r33 = Boolean.FALSE;
            objectRef.f143742a = r33;
            objectRef2.f143742a = r33;
        } else if ((i10 == 3 || i10 == 4) && !Intrinsics.e(objectRef.f143742a, Boolean.FALSE)) {
            objectRef2.f143742a = Boolean.valueOf(aVar == a.f52761c);
        }
    }

    private final void u() {
        this.inputMethodManager.d();
    }

    private final void v(a command) {
        this.textInputCommandQueue.c(command);
        if (this.frameCallback == null) {
            Runnable runnable = new Runnable() { // from class: z1.P
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.compose.ui.text.input.d.w(this.f172232a);
                }
            };
            this.inputCommandProcessorExecutor.execute(runnable);
            this.frameCallback = runnable;
        }
    }

    private final void x(boolean visible) {
        if (visible) {
            this.inputMethodManager.f();
        } else {
            this.inputMethodManager.g();
        }
    }

    @Override // z1.I
    public void a() {
        v(a.f52759a);
    }

    @Override // z1.I
    public void c() {
        v(a.f52762d);
    }

    @Override // z1.I
    public void e(TextFieldValue oldValue, TextFieldValue newValue) {
        boolean z10 = (y.g(this.state.getSelection(), newValue.getSelection()) && Intrinsics.e(this.state.getComposition(), newValue.getComposition())) ? false : true;
        this.state = newValue;
        int size = this.ics.size();
        for (int i10 = 0; i10 < size; i10++) {
            androidx.compose.ui.text.input.c cVar = this.ics.get(i10).get();
            if (cVar != null) {
                cVar.f(newValue);
            }
        }
        this.cursorAnchorInfoController.a();
        if (Intrinsics.e(oldValue, newValue)) {
            if (z10) {
                InterfaceC18435s interfaceC18435s = this.inputMethodManager;
                int iL = y.l(newValue.getSelection());
                int iK = y.k(newValue.getSelection());
                y composition = this.state.getComposition();
                int iL2 = composition != null ? y.l(composition.getPackedValue()) : -1;
                y composition2 = this.state.getComposition();
                interfaceC18435s.c(iL, iK, iL2, composition2 != null ? y.k(composition2.getPackedValue()) : -1);
                return;
            }
            return;
        }
        if (oldValue != null && (!Intrinsics.e(oldValue.h(), newValue.h()) || (y.g(oldValue.getSelection(), newValue.getSelection()) && !Intrinsics.e(oldValue.getComposition(), newValue.getComposition())))) {
            u();
            return;
        }
        int size2 = this.ics.size();
        for (int i11 = 0; i11 < size2; i11++) {
            androidx.compose.ui.text.input.c cVar2 = this.ics.get(i11).get();
            if (cVar2 != null) {
                cVar2.g(this.state, this.inputMethodManager);
            }
        }
    }

    @Override // z1.I
    public void f() {
        v(a.f52761c);
    }

    @Override // z1.I
    public void g(TextFieldValue textFieldValue, InterfaceC18417E offsetMapping, TextLayoutResult textLayoutResult, Function1<? super C5474k1, Unit> textFieldToRootTransform, androidx.compose.ui.geometry.Rect innerTextFieldBounds, androidx.compose.ui.geometry.Rect decorationBoxBounds) {
        this.cursorAnchorInfoController.d(textFieldValue, offsetMapping, textLayoutResult, textFieldToRootTransform, innerTextFieldBounds, decorationBoxBounds);
    }

    @Override // z1.I
    @Deprecated
    public void h(androidx.compose.ui.geometry.Rect rect) {
        Rect rect2;
        this.focusedRect = new Rect(MathKt.d(rect.getLeft()), MathKt.d(rect.getTop()), MathKt.d(rect.l()), MathKt.d(rect.i()));
        if (!this.ics.isEmpty() || (rect2 = this.focusedRect) == null) {
            return;
        }
        this.view.requestRectangleOnScreen(new Rect(rect2));
    }

    public final InputConnection o(EditorInfo outAttrs) {
        if (!this.editorHasFocus) {
            return null;
        }
        androidx.compose.ui.text.input.e.h(outAttrs, this.imeOptions, this.state);
        androidx.compose.ui.text.input.e.i(outAttrs);
        androidx.compose.ui.text.input.c cVar = new androidx.compose.ui.text.input.c(this.state, new C1087d(), this.imeOptions.getAutoCorrect());
        this.ics.add(new WeakReference<>(cVar));
        return cVar;
    }

    /* renamed from: q, reason: from getter */
    public final View getView() {
        return this.view;
    }

    /* renamed from: r, reason: from getter */
    public final boolean getEditorHasFocus() {
        return this.editorHasFocus;
    }

    public /* synthetic */ d(View view, InterfaceC14305h interfaceC14305h, InterfaceC18435s interfaceC18435s, Executor executor, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(view, interfaceC14305h, interfaceC18435s, (i10 & 8) != 0 ? androidx.compose.ui.text.input.e.d(Choreographer.getInstance()) : executor);
    }

    public d(View view, InterfaceC14305h interfaceC14305h) {
        this(view, interfaceC14305h, new C18436t(view), null, 8, null);
    }
}
