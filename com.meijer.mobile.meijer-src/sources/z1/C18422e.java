package z1;

import V0.C5474k1;
import android.graphics.Matrix;
import android.view.inputmethod.CursorAnchorInfo;
import androidx.compose.ui.geometry.Rect;
import g1.InterfaceC14305h;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import u1.TextLayoutResult;

@Deprecated
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ=\u0010\u0012\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u0013JI\u0010 \u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\b0\u001a2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\b¢\u0006\u0004\b\"\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010$R\u0014\u0010&\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010%R\u0016\u0010(\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010'R\u0016\u0010*\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010'R\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010'R\u0016\u0010\u000f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010'R\u0016\u0010\u0010\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010'R\u0016\u0010\u0011\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010'R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\"\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\b0\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u00108R\u0014\u0010=\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u001a\u0010@\u001a\u00020\u001b8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010D\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010C\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006E"}, d2 = {"Lz1/e;", "", "Lg1/h;", "rootPositionCalculator", "Lz1/s;", "inputMethodManager", "<init>", "(Lg1/h;Lz1/s;)V", "", "c", "()V", "", "immediate", "monitor", "includeInsertionMarker", "includeCharacterBounds", "includeEditorBounds", "includeLineBounds", "b", "(ZZZZZZ)V", "Lz1/M;", "textFieldValue", "Lz1/E;", "offsetMapping", "Lu1/v;", "textLayoutResult", "Lkotlin/Function1;", "LV0/k1;", "textFieldToRootTransform", "Landroidx/compose/ui/geometry/Rect;", "innerTextFieldBounds", "decorationBoxBounds", "d", "(Lz1/M;Lz1/E;Lu1/v;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/geometry/Rect;)V", "a", "Lg1/h;", "Lz1/s;", "Ljava/lang/Object;", "lock", "Z", "monitorEnabled", "e", "hasPendingImmediateRequest", "f", "g", "h", "i", "j", "Lz1/M;", "k", "Lu1/v;", "l", "Lz1/E;", "m", "Lkotlin/jvm/functions/Function1;", "n", "Landroidx/compose/ui/geometry/Rect;", "o", "Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "p", "Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "builder", "q", "[F", "matrix", "Landroid/graphics/Matrix;", "r", "Landroid/graphics/Matrix;", "androidMatrix", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: z1.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C18422e {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC14305h rootPositionCalculator;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC18435s inputMethodManager;

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

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private Rect innerTextFieldBounds;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private Rect decorationBoxBounds;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Object lock = new Object();

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private Function1<? super C5474k1, Unit> textFieldToRootTransform = b.f172265f;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final CursorAnchorInfo.Builder builder = new CursorAnchorInfo.Builder();

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final float[] matrix = C5474k1.c(null, 1, null);

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final Matrix androidMatrix = new Matrix();

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LV0/k1;", "it", "", "a", "([F)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: z1.e$a */
    static final class a extends Lambda implements Function1<C5474k1, Unit> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f172264f = new a();

        a() {
            super(1);
        }

        public final void a(float[] fArr) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C5474k1 c5474k1) {
            a(c5474k1.getValues());
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LV0/k1;", "it", "", "a", "([F)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: z1.e$b */
    static final class b extends Lambda implements Function1<C5474k1, Unit> {

        /* renamed from: f, reason: collision with root package name */
        public static final b f172265f = new b();

        b() {
            super(1);
        }

        public final void a(float[] fArr) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C5474k1 c5474k1) {
            a(c5474k1.getValues());
            return Unit.f143329a;
        }
    }

    private final void c() {
        if (this.inputMethodManager.a()) {
            this.textFieldToRootTransform.invoke(C5474k1.a(this.matrix));
            this.rootPositionCalculator.p(this.matrix);
            V0.N.a(this.androidMatrix, this.matrix);
            InterfaceC18435s interfaceC18435s = this.inputMethodManager;
            CursorAnchorInfo.Builder builder = this.builder;
            TextFieldValue textFieldValue = this.textFieldValue;
            Intrinsics.g(textFieldValue);
            InterfaceC18417E interfaceC18417E = this.offsetMapping;
            Intrinsics.g(interfaceC18417E);
            TextLayoutResult textLayoutResult = this.textLayoutResult;
            Intrinsics.g(textLayoutResult);
            Matrix matrix = this.androidMatrix;
            Rect rect = this.innerTextFieldBounds;
            Intrinsics.g(rect);
            Rect rect2 = this.decorationBoxBounds;
            Intrinsics.g(rect2);
            interfaceC18435s.e(C18421d.b(builder, textFieldValue, interfaceC18417E, textLayoutResult, matrix, rect, rect2, this.includeInsertionMarker, this.includeCharacterBounds, this.includeEditorBounds, this.includeLineBounds));
            this.hasPendingImmediateRequest = false;
        }
    }

    public final void a() {
        synchronized (this.lock) {
            this.textFieldValue = null;
            this.offsetMapping = null;
            this.textLayoutResult = null;
            this.textFieldToRootTransform = a.f172264f;
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

    public final void d(TextFieldValue textFieldValue, InterfaceC18417E offsetMapping, TextLayoutResult textLayoutResult, Function1<? super C5474k1, Unit> textFieldToRootTransform, Rect innerTextFieldBounds, Rect decorationBoxBounds) {
        synchronized (this.lock) {
            try {
                this.textFieldValue = textFieldValue;
                this.offsetMapping = offsetMapping;
                this.textLayoutResult = textLayoutResult;
                this.textFieldToRootTransform = textFieldToRootTransform;
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

    public C18422e(InterfaceC14305h interfaceC14305h, InterfaceC18435s interfaceC18435s) {
        this.rootPositionCalculator = interfaceC14305h;
        this.inputMethodManager = interfaceC18435s;
    }
}
