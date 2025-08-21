package androidx.compose.ui.platform;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import u1.TextLayoutResult;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0013B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0011\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0011\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0014R\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/platform/c;", "Landroidx/compose/ui/platform/a;", "<init>", "()V", "", "lineNumber", "LF1/i;", "direction", "i", "(ILF1/i;)I", "", "text", "Lu1/v;", "layoutResult", "", "j", "(Ljava/lang/String;Lu1/v;)V", "current", "", "a", "(I)[I", "b", "c", "Lu1/v;", "d", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.platform.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5983c extends AbstractC5977a {

    /* renamed from: f, reason: collision with root package name */
    private static C5983c f52262f;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private TextLayoutResult layoutResult;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: e, reason: collision with root package name */
    public static final int f52261e = 8;

    /* renamed from: g, reason: collision with root package name */
    private static final F1.i f52263g = F1.i.f8931b;

    /* renamed from: h, reason: collision with root package name */
    private static final F1.i f52264h = F1.i.f8930a;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/compose/ui/platform/c$a;", "", "<init>", "()V", "Landroidx/compose/ui/platform/c;", "a", "()Landroidx/compose/ui/platform/c;", "LF1/i;", "DirectionEnd", "LF1/i;", "DirectionStart", "lineInstance", "Landroidx/compose/ui/platform/c;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.platform.c$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final C5983c a() {
            if (C5983c.f52262f == null) {
                C5983c.f52262f = new C5983c(null);
            }
            C5983c c5983c = C5983c.f52262f;
            Intrinsics.h(c5983c, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.LineTextSegmentIterator");
            return c5983c;
        }
    }

    public /* synthetic */ C5983c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private C5983c() {
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
        int iQ;
        if (d().length() <= 0 || current >= d().length()) {
            return null;
        }
        if (current < 0) {
            TextLayoutResult textLayoutResult = this.layoutResult;
            if (textLayoutResult == null) {
                Intrinsics.x("layoutResult");
                textLayoutResult = null;
            }
            iQ = textLayoutResult.q(0);
        } else {
            TextLayoutResult textLayoutResult2 = this.layoutResult;
            if (textLayoutResult2 == null) {
                Intrinsics.x("layoutResult");
                textLayoutResult2 = null;
            }
            int iQ2 = textLayoutResult2.q(current);
            if (i(iQ2, f52263g) == current) {
                iQ = iQ2;
            } else {
                iQ = iQ2 + 1;
            }
        }
        TextLayoutResult textLayoutResult3 = this.layoutResult;
        if (textLayoutResult3 == null) {
            Intrinsics.x("layoutResult");
            textLayoutResult3 = null;
        }
        if (iQ >= textLayoutResult3.n()) {
            return null;
        }
        return c(i(iQ, f52263g), i(iQ, f52264h) + 1);
    }

    @Override // androidx.compose.ui.platform.InterfaceC5992f
    public int[] b(int current) {
        int iQ;
        if (d().length() <= 0 || current <= 0) {
            return null;
        }
        if (current > d().length()) {
            TextLayoutResult textLayoutResult = this.layoutResult;
            if (textLayoutResult == null) {
                Intrinsics.x("layoutResult");
                textLayoutResult = null;
            }
            iQ = textLayoutResult.q(d().length());
        } else {
            TextLayoutResult textLayoutResult2 = this.layoutResult;
            if (textLayoutResult2 == null) {
                Intrinsics.x("layoutResult");
                textLayoutResult2 = null;
            }
            int iQ2 = textLayoutResult2.q(current);
            if (i(iQ2, f52264h) + 1 == current) {
                iQ = iQ2;
            } else {
                iQ = iQ2 - 1;
            }
        }
        if (iQ < 0) {
            return null;
        }
        return c(i(iQ, f52263g), i(iQ, f52264h) + 1);
    }

    public final void j(String text, TextLayoutResult layoutResult) {
        f(text);
        this.layoutResult = layoutResult;
    }
}
