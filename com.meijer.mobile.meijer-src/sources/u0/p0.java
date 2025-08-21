package u0;

import V0.C5474k1;
import android.graphics.Matrix;
import android.view.inputmethod.CursorAnchorInfo;
import androidx.compose.ui.geometry.Rect;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import u1.TextLayoutResult;
import z1.InterfaceC18417E;
import z1.TextFieldValue;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ=\u0010\u0013\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u0014J5\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001b¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u0004¢\u0006\u0004\b \u0010\u000bR \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\"R\u0014\u0010$\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010#R\u0016\u0010&\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010%R\u0016\u0010(\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010%R\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010%R\u0016\u0010\u0010\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010%R\u0016\u0010\u0011\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010%R\u0016\u0010\u0012\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010%R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00104R\u0014\u00109\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u001a\u0010<\u001a\u00020\u00038\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010@\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006A"}, d2 = {"Lu0/p0;", "", "Lkotlin/Function1;", "LV0/k1;", "", "localToScreen", "Lu0/l0;", "inputMethodManager", "<init>", "(Lkotlin/jvm/functions/Function1;Lu0/l0;)V", "c", "()V", "", "immediate", "monitor", "includeInsertionMarker", "includeCharacterBounds", "includeEditorBounds", "includeLineBounds", "b", "(ZZZZZZ)V", "Lz1/M;", "textFieldValue", "Lz1/E;", "offsetMapping", "Lu1/v;", "textLayoutResult", "Landroidx/compose/ui/geometry/Rect;", "innerTextFieldBounds", "decorationBoxBounds", "d", "(Lz1/M;Lz1/E;Lu1/v;Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/geometry/Rect;)V", "a", "Lkotlin/jvm/functions/Function1;", "Lu0/l0;", "Ljava/lang/Object;", "lock", "Z", "monitorEnabled", "e", "hasPendingImmediateRequest", "f", "g", "h", "i", "j", "Lz1/M;", "k", "Lu1/v;", "l", "Lz1/E;", "m", "Landroidx/compose/ui/geometry/Rect;", "n", "Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "o", "Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "builder", "p", "[F", "matrix", "Landroid/graphics/Matrix;", "q", "Landroid/graphics/Matrix;", "androidMatrix", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class p0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Function1<C5474k1, Unit> localToScreen;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final l0 inputMethodManager;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean monitorEnabled;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean hasPendingImmediateRequest;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean includeInsertionMarker;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean includeCharacterBounds;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private boolean includeEditorBounds;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private boolean includeLineBounds;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private TextFieldValue textFieldValue;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private TextLayoutResult textLayoutResult;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private InterfaceC18417E offsetMapping;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private Rect innerTextFieldBounds;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private Rect decorationBoxBounds;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Object lock = new Object();

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final CursorAnchorInfo.Builder builder = new CursorAnchorInfo.Builder();

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final float[] matrix = C5474k1.c(null, 1, null);

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final Matrix androidMatrix = new Matrix();

    private final void c() {
        if (!this.inputMethodManager.a() || this.textFieldValue == null || this.offsetMapping == null || this.textLayoutResult == null || this.innerTextFieldBounds == null || this.decorationBoxBounds == null) {
            return;
        }
        C5474k1.h(this.matrix);
        this.localToScreen.invoke(C5474k1.a(this.matrix));
        float[] fArr = this.matrix;
        Rect rect = this.decorationBoxBounds;
        Intrinsics.g(rect);
        float f10 = -rect.getLeft();
        Rect rect2 = this.decorationBoxBounds;
        Intrinsics.g(rect2);
        C5474k1.n(fArr, f10, -rect2.getTop(), 0.0f);
        V0.N.a(this.androidMatrix, this.matrix);
        l0 l0Var = this.inputMethodManager;
        CursorAnchorInfo.Builder builder = this.builder;
        TextFieldValue textFieldValue = this.textFieldValue;
        Intrinsics.g(textFieldValue);
        InterfaceC18417E interfaceC18417E = this.offsetMapping;
        Intrinsics.g(interfaceC18417E);
        TextLayoutResult textLayoutResult = this.textLayoutResult;
        Intrinsics.g(textLayoutResult);
        Matrix matrix = this.androidMatrix;
        Rect rect3 = this.innerTextFieldBounds;
        Intrinsics.g(rect3);
        Rect rect4 = this.decorationBoxBounds;
        Intrinsics.g(rect4);
        l0Var.e(o0.b(builder, textFieldValue, interfaceC18417E, textLayoutResult, matrix, rect3, rect4, this.includeInsertionMarker, this.includeCharacterBounds, this.includeEditorBounds, this.includeLineBounds));
        this.hasPendingImmediateRequest = false;
    }

    public final void a() {
        synchronized (this.lock) {
            this.textFieldValue = null;
            this.offsetMapping = null;
            this.textLayoutResult = null;
            this.innerTextFieldBounds = null;
            this.decorationBoxBounds = null;
            Unit unit = Unit.f143329a;
        }
    }

    public final void b(boolean immediate, boolean monitor, boolean includeInsertionMarker, boolean includeCharacterBounds, boolean includeEditorBounds, boolean includeLineBounds) {
        synchronized (this.lock) {
            try {
                this.includeInsertionMarker = includeInsertionMarker;
                this.includeCharacterBounds = includeCharacterBounds;
                this.includeEditorBounds = includeEditorBounds;
                this.includeLineBounds = includeLineBounds;
                if (immediate) {
                    this.hasPendingImmediateRequest = true;
                    if (this.textFieldValue != null) {
                        c();
                    }
                }
                this.monitorEnabled = monitor;
                Unit unit = Unit.f143329a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d(TextFieldValue textFieldValue, InterfaceC18417E offsetMapping, TextLayoutResult textLayoutResult, Rect innerTextFieldBounds, Rect decorationBoxBounds) {
        synchronized (this.lock) {
            try {
                this.textFieldValue = textFieldValue;
                this.offsetMapping = offsetMapping;
                this.textLayoutResult = textLayoutResult;
                this.innerTextFieldBounds = innerTextFieldBounds;
                this.decorationBoxBounds = decorationBoxBounds;
                if (this.hasPendingImmediateRequest || this.monitorEnabled) {
                    c();
                }
                Unit unit = Unit.f143329a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public p0(Function1<? super C5474k1, Unit> function1, l0 l0Var) {
        this.localToScreen = function1;
        this.inputMethodManager = l0Var;
    }
}
