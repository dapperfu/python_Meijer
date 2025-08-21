package v0;

import F1.t;
import V0.q1;
import androidx.compose.ui.layout.LayoutCoordinates;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import u1.TextLayoutResult;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0010\u0018\u0000 \u001b2\u00020\u0001:\u0001\u0010B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rJ%\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lv0/i;", "", "Landroidx/compose/ui/layout/LayoutCoordinates;", "layoutCoordinates", "Lu1/v;", "textLayoutResult", "<init>", "(Landroidx/compose/ui/layout/LayoutCoordinates;Lu1/v;)V", "", "start", "end", "LV0/q1;", "e", "(II)LV0/q1;", "b", "(Landroidx/compose/ui/layout/LayoutCoordinates;Lu1/v;)Lv0/i;", "a", "Landroidx/compose/ui/layout/LayoutCoordinates;", "d", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "Lu1/v;", "g", "()Lu1/v;", "", "f", "()Z", "shouldClip", "c", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: v0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C17583i {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: d, reason: collision with root package name */
    public static final int f165332d = 8;

    /* renamed from: e, reason: collision with root package name */
    private static final C17583i f165333e = new C17583i(null, null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final LayoutCoordinates layoutCoordinates;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final TextLayoutResult textLayoutResult;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lv0/i$a;", "", "<init>", "()V", "Lv0/i;", "Empty", "Lv0/i;", "a", "()Lv0/i;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: v0.i$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final C17583i a() {
            return C17583i.f165333e;
        }
    }

    public static /* synthetic */ C17583i c(C17583i c17583i, LayoutCoordinates layoutCoordinates, TextLayoutResult textLayoutResult, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copy");
        }
        if ((i10 & 1) != 0) {
            layoutCoordinates = c17583i.layoutCoordinates;
        }
        if ((i10 & 2) != 0) {
            textLayoutResult = c17583i.textLayoutResult;
        }
        return c17583i.b(layoutCoordinates, textLayoutResult);
    }

    public final C17583i b(LayoutCoordinates layoutCoordinates, TextLayoutResult textLayoutResult) {
        return new C17583i(layoutCoordinates, textLayoutResult);
    }

    /* renamed from: d, reason: from getter */
    public final LayoutCoordinates getLayoutCoordinates() {
        return this.layoutCoordinates;
    }

    public q1 e(int start, int end) {
        TextLayoutResult textLayoutResult = this.textLayoutResult;
        if (textLayoutResult != null) {
            return textLayoutResult.z(start, end);
        }
        return null;
    }

    public boolean f() {
        TextLayoutResult textLayoutResult = this.textLayoutResult;
        return (textLayoutResult == null || t.g(textLayoutResult.getLayoutInput().getOverflow(), t.INSTANCE.e()) || !textLayoutResult.i()) ? false : true;
    }

    /* renamed from: g, reason: from getter */
    public final TextLayoutResult getTextLayoutResult() {
        return this.textLayoutResult;
    }

    public C17583i(LayoutCoordinates layoutCoordinates, TextLayoutResult textLayoutResult) {
        this.layoutCoordinates = layoutCoordinates;
        this.textLayoutResult = textLayoutResult;
    }
}
