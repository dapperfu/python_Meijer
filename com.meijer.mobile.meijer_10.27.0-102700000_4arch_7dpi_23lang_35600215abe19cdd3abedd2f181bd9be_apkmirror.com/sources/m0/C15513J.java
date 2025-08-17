package m0;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.layout.AbstractC5774a;
import java.util.List;
import java.util.Map;
import kotlin.EnumC13827z;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import qv.C16623P;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a#\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\"\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"", "initialFirstVisibleItemIndex", "initialFirstVisibleItemScrollOffset", "Lm0/I;", "b", "(IILandroidx/compose/runtime/Composer;II)Lm0/I;", "Lm0/u;", "a", "Lm0/u;", "EmptyLazyGridLayoutInfo", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: m0.J, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15513J {

    /* renamed from: a, reason: collision with root package name */
    private static final C15535u f149570a;

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0016X\u0096D¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\u00020\u00058\u0016X\u0096D¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR,\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00050\u000e8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u0012\u0004\b\u0014\u0010\u0004\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"m0/J$a", "Landroidx/compose/ui/layout/J;", "", "s", "()V", "", "a", "I", "getWidth", "()I", "width", "b", "getHeight", "height", "", "Landroidx/compose/ui/layout/a;", "c", "Ljava/util/Map;", "r", "()Ljava/util/Map;", "getAlignmentLines$annotations", "alignmentLines", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: m0.J$a */
    public static final class a implements androidx.compose.ui.layout.J {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int width;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int height;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final Map<AbstractC5774a, Integer> alignmentLines = MapsKt.k();

        @Override // androidx.compose.ui.layout.J
        public void s() {
        }

        @Override // androidx.compose.ui.layout.J
        /* renamed from: getHeight, reason: from getter */
        public int getF50998b() {
            return this.height;
        }

        @Override // androidx.compose.ui.layout.J
        /* renamed from: getWidth, reason: from getter */
        public int getF50997a() {
            return this.width;
        }

        @Override // androidx.compose.ui.layout.J
        public Map<AbstractC5774a, Integer> r() {
            return this.alignmentLines;
        }

        a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "it", "", "Lkotlin/Pair;", "LH1/b;", "a", "(I)Ljava/util/List;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: m0.J$b */
    static final class b extends Lambda implements Function1<Integer, List<? extends Pair<? extends Integer, ? extends H1.b>>> {

        /* renamed from: f, reason: collision with root package name */
        public static final b f149574f = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ List<? extends Pair<? extends Integer, ? extends H1.b>> invoke(Integer num) {
            return a(num.intValue());
        }

        public final List<Pair<Integer, H1.b>> a(int i10) {
            return CollectionsKt.m();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lm0/I;", "c", "()Lm0/I;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: m0.J$c */
    static final class c extends Lambda implements Function0<C15512I> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f149575f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f149576g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(int i10, int i11) {
            super(0);
            this.f149575f = i10;
            this.f149576g = i11;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final C15512I invoke() {
            return new C15512I(this.f149575f, this.f149576g);
        }
    }

    static {
        a aVar = new a();
        List listM = CollectionsKt.m();
        EnumC13827z enumC13827z = EnumC13827z.f130585a;
        f149570a = new C15535u(null, 0, false, 0.0f, aVar, 0.0f, false, C16623P.a(EmptyCoroutineContext.f142646a), H1.f.b(1.0f, 0.0f, 2, null), 0, b.f149574f, listM, 0, 0, 0, false, enumC13827z, 0, 0);
    }

    public static final C15512I b(int i10, int i11, Composer composer, int i12, int i13) {
        if ((i13 & 1) != 0) {
            i10 = 0;
        }
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if (ComposerKt.M()) {
            ComposerKt.U(29186956, i12, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridState (LazyGridState.kt:74)");
        }
        Object[] objArr = new Object[0];
        L0.k<C15512I, ?> kVarA = C15512I.INSTANCE.a();
        boolean z10 = ((((i12 & 14) ^ 6) > 4 && composer.d(i10)) || (i12 & 6) == 4) | ((((i12 & 112) ^ 48) > 32 && composer.d(i11)) || (i12 & 48) == 32);
        Object objB = composer.B();
        if (z10 || objB == Composer.INSTANCE.a()) {
            objB = new c(i10, i11);
            composer.t(objB);
        }
        C15512I c15512i = (C15512I) L0.c.c(objArr, kVarA, null, (Function0) objB, composer, 0, 4);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return c15512i;
    }
}
