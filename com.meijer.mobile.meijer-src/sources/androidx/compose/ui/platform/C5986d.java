package androidx.compose.ui.platform;

import android.graphics.Rect;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import r1.C16820n;
import u1.TextLayoutResult;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000  2\u00020\u0001:\u0001\u0015B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ%\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0013\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0013\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0017\u0010\u0016R\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Landroidx/compose/ui/platform/d;", "Landroidx/compose/ui/platform/a;", "<init>", "()V", "", "lineNumber", "LF1/i;", "direction", "i", "(ILF1/i;)I", "", "text", "Lu1/v;", "layoutResult", "Lr1/n;", "node", "", "j", "(Ljava/lang/String;Lu1/v;Lr1/n;)V", "current", "", "a", "(I)[I", "b", "c", "Lu1/v;", "d", "Lr1/n;", "Landroid/graphics/Rect;", "e", "Landroid/graphics/Rect;", "tempRect", "f", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.ui.platform.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5986d extends AbstractC5977a {

    /* renamed from: h, reason: collision with root package name */
    private static C5986d f52284h;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private TextLayoutResult layoutResult;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private C16820n node;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private Rect tempRect;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: g, reason: collision with root package name */
    public static final int f52283g = 8;

    /* renamed from: i, reason: collision with root package name */
    private static final F1.i f52285i = F1.i.f8931b;

    /* renamed from: j, reason: collision with root package name */
    private static final F1.i f52286j = F1.i.f8930a;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/compose/ui/platform/d$a;", "", "<init>", "()V", "Landroidx/compose/ui/platform/d;", "a", "()Landroidx/compose/ui/platform/d;", "LF1/i;", "DirectionEnd", "LF1/i;", "DirectionStart", "pageInstance", "Landroidx/compose/ui/platform/d;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.platform.d$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final C5986d a() {
            if (C5986d.f52284h == null) {
                C5986d.f52284h = new C5986d(null);
            }
            C5986d c5986d = C5986d.f52284h;
            Intrinsics.h(c5986d, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.PageTextSegmentIterator");
            return c5986d;
        }
    }

    public /* synthetic */ C5986d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private C5986d() {
        this.tempRect = new Rect();
    }

    private final int i(int lineNumber, F1.i direction) {
        TextLayoutResult textLayoutResult = this.layoutResult;
        TextLayoutResult textLayoutResult2 = null;
        if (textLayoutResult == null) {
            Intrinsics.x("layoutResult");
            textLayoutResult = null;
        }
        int iU = textLayoutResult.u(lineNumber);
        TextLayoutResult textLayoutResult3 = this.layoutResult;
        if (textLayoutResult3 == null) {
            Intrinsics.x("layoutResult");
            textLayoutResult3 = null;
        }
        if (direction != textLayoutResult3.y(iU)) {
            TextLayoutResult textLayoutResult4 = this.layoutResult;
            if (textLayoutResult4 == null) {
                Intrinsics.x("layoutResult");
            } else {
                textLayoutResult2 = textLayoutResult4;
            }
            return textLayoutResult2.u(lineNumber);
        }
        TextLayoutResult textLayoutResult5 = this.layoutResult;
        if (textLayoutResult5 == null) {
            Intrinsics.x("layoutResult");
            textLayoutResult5 = null;
        }
        return TextLayoutResult.p(textLayoutResult5, lineNumber, false, 2, null) - 1;
    }

    @Override // androidx.compose.ui.platform.InterfaceC5992f
    public int[] a(int current) {
        int iN;
        TextLayoutResult textLayoutResult = null;
        if (d().length() <= 0 || current >= d().length()) {
            return null;
        }
        try {
            C16820n c16820n = this.node;
            if (c16820n == null) {
                Intrinsics.x("node");
                c16820n = null;
            }
            androidx.compose.ui.geometry.Rect rectI = c16820n.i();
            int iRound = Math.round(rectI.i() - rectI.getTop());
            int iF = RangesKt.f(0, current);
            TextLayoutResult textLayoutResult2 = this.layoutResult;
            if (textLayoutResult2 == null) {
                Intrinsics.x("layoutResult");
                textLayoutResult2 = null;
            }
            int iQ = textLayoutResult2.q(iF);
            TextLayoutResult textLayoutResult3 = this.layoutResult;
            if (textLayoutResult3 == null) {
                Intrinsics.x("layoutResult");
                textLayoutResult3 = null;
            }
            float fV = textLayoutResult3.v(iQ) + iRound;
            TextLayoutResult textLayoutResult4 = this.layoutResult;
            if (textLayoutResult4 == null) {
                Intrinsics.x("layoutResult");
                textLayoutResult4 = null;
            }
            TextLayoutResult textLayoutResult5 = this.layoutResult;
            if (textLayoutResult5 == null) {
                Intrinsics.x("layoutResult");
                textLayoutResult5 = null;
            }
            if (fV < textLayoutResult4.v(textLayoutResult5.n() - 1)) {
                TextLayoutResult textLayoutResult6 = this.layoutResult;
                if (textLayoutResult6 == null) {
                    Intrinsics.x("layoutResult");
                } else {
                    textLayoutResult = textLayoutResult6;
                }
                iN = textLayoutResult.r(fV);
            } else {
                TextLayoutResult textLayoutResult7 = this.layoutResult;
                if (textLayoutResult7 == null) {
                    Intrinsics.x("layoutResult");
                } else {
                    textLayoutResult = textLayoutResult7;
                }
                iN = textLayoutResult.n();
            }
            return c(iF, i(iN - 1, f52286j) + 1);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    @Override // androidx.compose.ui.platform.InterfaceC5992f
    public int[] b(int current) {
        int iR;
        TextLayoutResult textLayoutResult = null;
        if (d().length() <= 0 || current <= 0) {
            return null;
        }
        try {
            C16820n c16820n = this.node;
            if (c16820n == null) {
                Intrinsics.x("node");
                c16820n = null;
            }
            androidx.compose.ui.geometry.Rect rectI = c16820n.i();
            int iRound = Math.round(rectI.i() - rectI.getTop());
            int iK = RangesKt.k(d().length(), current);
            TextLayoutResult textLayoutResult2 = this.layoutResult;
            if (textLayoutResult2 == null) {
                Intrinsics.x("layoutResult");
                textLayoutResult2 = null;
            }
            int iQ = textLayoutResult2.q(iK);
            TextLayoutResult textLayoutResult3 = this.layoutResult;
            if (textLayoutResult3 == null) {
                Intrinsics.x("layoutResult");
                textLayoutResult3 = null;
            }
            float fV = textLayoutResult3.v(iQ) - iRound;
            if (fV > 0.0f) {
                TextLayoutResult textLayoutResult4 = this.layoutResult;
                if (textLayoutResult4 == null) {
                    Intrinsics.x("layoutResult");
                } else {
                    textLayoutResult = textLayoutResult4;
                }
                iR = textLayoutResult.r(fV);
            } else {
                iR = 0;
            }
            if (iK == d().length() && iR < iQ) {
                iR++;
            }
            return c(i(iR, f52285i), iK);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    public final void j(String text, TextLayoutResult layoutResult, C16820n node) {
        f(text);
        this.layoutResult = layoutResult;
        this.node = node;
    }
}
