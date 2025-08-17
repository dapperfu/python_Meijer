package kotlin;

import U0.f;
import androidx.compose.foundation.text.g0;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.y;
import kotlin.Metadata;
import kotlin.Selection;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import u1.C17207A;
import u1.TextLayoutResult;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0014H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0011\u0010\u0019\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020#2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020#2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b&\u0010%J\u0017\u0010'\u001a\u00020#2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b'\u0010%J\u001d\u0010)\u001a\u00020(2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u001eH\u0016¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020#2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b-\u0010%R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010.\u001a\u0004\b/\u00100R\u001c\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u00101R\u001c\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u00101R\u0014\u00104\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u00103R\u0018\u00106\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u00105R\u0016\u00108\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u00107R\u0018\u0010;\u001a\u00020\u001e*\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006<"}, d2 = {"Lw0/k;", "Lw0/n;", "", "selectableId", "Lkotlin/Function0;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinatesCallback", "Lu1/v;", "layoutResultCallback", "<init>", "(JLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "Lw0/D;", "builder", "", "e", "(Lw0/D;)V", "Lw0/p;", "j", "()Lw0/p;", "selection", "", "isStartHandle", "LU0/f;", "c", "(Lw0/p;Z)J", "B", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "Landroidx/compose/ui/text/AnnotatedString;", "getText", "()Landroidx/compose/ui/text/AnnotatedString;", "", "offset", "Landroidx/compose/ui/geometry/Rect;", "f", "(I)Landroidx/compose/ui/geometry/Rect;", "", "d", "(I)F", "a", "h", "Landroidx/compose/ui/text/y;", "k", "(I)J", "g", "()I", "b", "J", "i", "()J", "Lkotlin/jvm/functions/Function0;", "", "Ljava/lang/Object;", "lock", "Lu1/v;", "_previousTextLayoutResult", "I", "_previousLastVisibleOffset", "l", "(Lu1/v;)I", "lastVisibleOffset", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: w0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17725k implements InterfaceC17728n {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long selectableId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Function0<LayoutCoordinates> coordinatesCallback;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Function0<TextLayoutResult> layoutResultCallback;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private TextLayoutResult _previousTextLayoutResult;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Object lock = this;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int _previousLastVisibleOffset = -1;

    private final int l(TextLayoutResult textLayoutResult) {
        int i10;
        int iN;
        synchronized (this.lock) {
            try {
                if (this._previousTextLayoutResult != textLayoutResult) {
                    if (!textLayoutResult.f() || textLayoutResult.getMultiParagraph().getDidExceedMaxLines()) {
                        iN = textLayoutResult.n() - 1;
                    } else {
                        int iK = RangesKt.k(textLayoutResult.r((int) (textLayoutResult.getSize() & 4294967295L)), textLayoutResult.n() - 1);
                        while (iK >= 0 && textLayoutResult.v(iK) >= ((int) (textLayoutResult.getSize() & 4294967295L))) {
                            iK--;
                        }
                        iN = RangesKt.f(iK, 0);
                    }
                    this._previousLastVisibleOffset = textLayoutResult.o(iN, true);
                    this._previousTextLayoutResult = textLayoutResult;
                }
                i10 = this._previousLastVisibleOffset;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i10;
    }

    @Override // kotlin.InterfaceC17728n
    public LayoutCoordinates B() {
        LayoutCoordinates layoutCoordinatesInvoke = this.coordinatesCallback.invoke();
        if (layoutCoordinatesInvoke == null || !layoutCoordinatesInvoke.isAttached()) {
            return null;
        }
        return layoutCoordinatesInvoke;
    }

    @Override // kotlin.InterfaceC17728n
    public float a(int offset) {
        int iQ;
        TextLayoutResult textLayoutResultInvoke = this.layoutResultCallback.invoke();
        if (textLayoutResultInvoke != null && (iQ = textLayoutResultInvoke.q(offset)) < textLayoutResultInvoke.n()) {
            return textLayoutResultInvoke.t(iQ);
        }
        return -1.0f;
    }

    @Override // kotlin.InterfaceC17728n
    public float b(int offset) {
        TextLayoutResult textLayoutResultInvoke = this.layoutResultCallback.invoke();
        if (textLayoutResultInvoke != null) {
            return g0.b(textLayoutResultInvoke, offset);
        }
        return 0.0f;
    }

    @Override // kotlin.InterfaceC17728n
    public long c(Selection selection, boolean isStartHandle) {
        if ((isStartHandle && selection.getStart().getSelectableId() != getSelectableId()) || (!isStartHandle && selection.getEnd().getSelectableId() != getSelectableId())) {
            return U0.f.INSTANCE.b();
        }
        if (B() == null) {
            return U0.f.INSTANCE.b();
        }
        TextLayoutResult textLayoutResultInvoke = this.layoutResultCallback.invoke();
        if (textLayoutResultInvoke == null) {
            return U0.f.INSTANCE.b();
        }
        return C17714X.b(textLayoutResultInvoke, RangesKt.o((isStartHandle ? selection.getStart() : selection.getEnd()).getOffset(), 0, l(textLayoutResultInvoke)), isStartHandle, selection.getHandlesCrossed());
    }

    @Override // kotlin.InterfaceC17728n
    public float d(int offset) {
        int iQ;
        TextLayoutResult textLayoutResultInvoke = this.layoutResultCallback.invoke();
        if (textLayoutResultInvoke != null && (iQ = textLayoutResultInvoke.q(offset)) < textLayoutResultInvoke.n()) {
            return textLayoutResultInvoke.s(iQ);
        }
        return -1.0f;
    }

    @Override // kotlin.InterfaceC17728n
    public Rect f(int offset) {
        TextLayoutResult textLayoutResultInvoke = this.layoutResultCallback.invoke();
        if (textLayoutResultInvoke == null) {
            return Rect.INSTANCE.a();
        }
        int length = textLayoutResultInvoke.getLayoutInput().getText().length();
        return length < 1 ? Rect.INSTANCE.a() : textLayoutResultInvoke.d(RangesKt.o(offset, 0, length - 1));
    }

    @Override // kotlin.InterfaceC17728n
    public int g() {
        TextLayoutResult textLayoutResultInvoke = this.layoutResultCallback.invoke();
        if (textLayoutResultInvoke == null) {
            return 0;
        }
        return l(textLayoutResultInvoke);
    }

    @Override // kotlin.InterfaceC17728n
    public AnnotatedString getText() {
        TextLayoutResult textLayoutResultInvoke = this.layoutResultCallback.invoke();
        return textLayoutResultInvoke == null ? new AnnotatedString("", null, 2, null) : textLayoutResultInvoke.getLayoutInput().getText();
    }

    @Override // kotlin.InterfaceC17728n
    public float h(int offset) {
        int iQ;
        TextLayoutResult textLayoutResultInvoke = this.layoutResultCallback.invoke();
        if (textLayoutResultInvoke == null || (iQ = textLayoutResultInvoke.q(offset)) >= textLayoutResultInvoke.n()) {
            return -1.0f;
        }
        float fV = textLayoutResultInvoke.v(iQ);
        return ((textLayoutResultInvoke.m(iQ) - fV) / 2) + fV;
    }

    @Override // kotlin.InterfaceC17728n
    /* renamed from: i, reason: from getter */
    public long getSelectableId() {
        return this.selectableId;
    }

    @Override // kotlin.InterfaceC17728n
    public Selection j() {
        TextLayoutResult textLayoutResultInvoke = this.layoutResultCallback.invoke();
        if (textLayoutResultInvoke == null) {
            return null;
        }
        int length = textLayoutResultInvoke.getLayoutInput().getText().length();
        return new Selection(new Selection.AnchorInfo(textLayoutResultInvoke.c(0), 0, getSelectableId()), new Selection.AnchorInfo(textLayoutResultInvoke.c(Math.max(length - 1, 0)), length, getSelectableId()), false);
    }

    @Override // kotlin.InterfaceC17728n
    public long k(int offset) {
        TextLayoutResult textLayoutResultInvoke = this.layoutResultCallback.invoke();
        if (textLayoutResultInvoke == null) {
            return y.INSTANCE.a();
        }
        int iL = l(textLayoutResultInvoke);
        if (iL < 1) {
            return y.INSTANCE.a();
        }
        int iQ = textLayoutResultInvoke.q(RangesKt.o(offset, 0, iL - 1));
        return C17207A.b(textLayoutResultInvoke.u(iQ), textLayoutResultInvoke.o(iQ, true));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C17725k(long j10, Function0<? extends LayoutCoordinates> function0, Function0<TextLayoutResult> function02) {
        this.selectableId = j10;
        this.coordinatesCallback = function0;
        this.layoutResultCallback = function02;
    }

    @Override // kotlin.InterfaceC17728n
    public void e(C17695D builder) {
        TextLayoutResult textLayoutResultInvoke;
        long jP;
        LayoutCoordinates layoutCoordinatesB = B();
        if (layoutCoordinatesB == null || (textLayoutResultInvoke = this.layoutResultCallback.invoke()) == null) {
            return;
        }
        LayoutCoordinates containerCoordinates = builder.getContainerCoordinates();
        f.Companion companion = U0.f.INSTANCE;
        long J10 = containerCoordinates.J(layoutCoordinatesB, companion.c());
        long jP2 = U0.f.p(builder.getCurrentPosition(), J10);
        if ((builder.getPreviousHandlePosition() & 9223372034707292159L) == 9205357640488583168L) {
            jP = companion.b();
        } else {
            jP = U0.f.p(builder.getPreviousHandlePosition(), J10);
        }
        C17726l.a(builder, textLayoutResultInvoke, jP2, jP, getSelectableId());
    }
}
