package androidx.compose.ui.layout;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.math.MathKt;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a#\u0010\u0004\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\"\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t\"\u0017\u0010\f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\u000b\u0010\t¨\u0006\r"}, d2 = {"Landroidx/compose/ui/layout/a;", "", "position1", "position2", "c", "(Landroidx/compose/ui/layout/a;II)I", "Landroidx/compose/ui/layout/q;", "a", "Landroidx/compose/ui/layout/q;", "()Landroidx/compose/ui/layout/q;", "FirstBaseline", "b", "LastBaseline", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.layout.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5917b {

    /* renamed from: a, reason: collision with root package name */
    private static final C5932q f51276a = new C5932q(a.f51278b);

    /* renamed from: b, reason: collision with root package name */
    private static final C5932q f51277b = new C5932q(C1063b.f51279b);

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.layout.b$a */
    /* synthetic */ class a extends FunctionReferenceImpl implements Function2<Integer, Integer, Integer> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f51278b = new a();

        a() {
            super(2, MathKt.class, "min", "min(II)I", 1);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Integer invoke(Integer num, Integer num2) {
            return a(num.intValue(), num2.intValue());
        }

        public final Integer a(int i10, int i11) {
            return Integer.valueOf(Math.min(i10, i11));
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.layout.b$b, reason: collision with other inner class name */
    /* synthetic */ class C1063b extends FunctionReferenceImpl implements Function2<Integer, Integer, Integer> {

        /* renamed from: b, reason: collision with root package name */
        public static final C1063b f51279b = new C1063b();

        C1063b() {
            super(2, MathKt.class, "max", "max(II)I", 1);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Integer invoke(Integer num, Integer num2) {
            return a(num.intValue(), num2.intValue());
        }

        public final Integer a(int i10, int i11) {
            return Integer.valueOf(Math.max(i10, i11));
        }
    }

    public static final C5932q a() {
        return f51276a;
    }

    public static final C5932q b() {
        return f51277b;
    }

    public static final int c(AbstractC5916a abstractC5916a, int i10, int i11) {
        return abstractC5916a.a().invoke(Integer.valueOf(i10), Integer.valueOf(i11)).intValue();
    }
}
