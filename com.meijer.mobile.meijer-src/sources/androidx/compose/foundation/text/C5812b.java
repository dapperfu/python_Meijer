package androidx.compose.foundation.text;

import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.f0;
import androidx.compose.ui.node.InterfaceC5953g;
import androidx.compose.ui.text.AnnotatedString;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import u1.Placeholder;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\u001aa\u0010\r\u001a:\u0012\u0014\u0012\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\t0\u0006\u0012 \u0012\u001e\u0012\u001a\u0012\u0018\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\n0\u0007j\u0002`\f0\u00060\u0005*\u00020\u00002\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u0013\u0010\u0010\u001a\u00020\u000f*\u00020\u0000H\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a;\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00002\"\u0010\u0013\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\n0\u0007j\u0002`\f0\u0006H\u0001¢\u0006\u0004\b\u0014\u0010\u0015\"L\u0010\u0017\u001a:\u0012\u0014\u0012\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\t0\u0006\u0012 \u0012\u001e\u0012\u001a\u0012\u0018\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\n0\u0007j\u0002`\f0\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0016*0\b\u0000\u0010\u0018\"\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\n0\u00072\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\n0\u0007*\u0018\b\u0000\u0010\u0019\"\b\u0012\u0004\u0012\u00020\b0\u00072\b\u0012\u0004\u0012\u00020\b0\u0007¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/text/AnnotatedString;", "", "", "Landroidx/compose/foundation/text/r;", "inlineContent", "Lkotlin/Pair;", "", "Landroidx/compose/ui/text/AnnotatedString$d;", "Lu1/i;", "Landroidx/compose/foundation/text/PlaceholderRange;", "Lkotlin/Function1;", "", "Landroidx/compose/foundation/text/InlineContentRange;", "c", "(Landroidx/compose/ui/text/AnnotatedString;Ljava/util/Map;)Lkotlin/Pair;", "", "b", "(Landroidx/compose/ui/text/AnnotatedString;)Z", "text", "inlineContents", "a", "(Landroidx/compose/ui/text/AnnotatedString;Ljava/util/List;Landroidx/compose/runtime/Composer;I)V", "Lkotlin/Pair;", "EmptyInlineContent", "InlineContentRange", "PlaceholderRange", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.foundation.text.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5812b {

    /* renamed from: a, reason: collision with root package name */
    private static final Pair<List<AnnotatedString.Range<Placeholder>>, List<AnnotatedString.Range<Function3<String, Composer, Integer, Unit>>>> f49573a = new Pair<>(CollectionsKt.m(), CollectionsKt.m());

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/layout/K;", "", "Landroidx/compose/ui/layout/I;", "children", "LH1/b;", "constrains", "Landroidx/compose/ui/layout/J;", "d", "(Landroidx/compose/ui/layout/K;Ljava/util/List;J)Landroidx/compose/ui/layout/J;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: androidx.compose.foundation.text.b$a */
    static final class a implements MeasurePolicy {

        /* renamed from: a, reason: collision with root package name */
        public static final a f49574a = new a();

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/f0$a;", "", "a", "(Landroidx/compose/ui/layout/f0$a;)V"}, k = 3, mv = {1, 9, 0})
        @SourceDebugExtension
        /* renamed from: androidx.compose.foundation.text.b$a$a, reason: collision with other inner class name */
        static final class C1037a extends Lambda implements Function1<f0.a, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ List<androidx.compose.ui.layout.f0> f49575f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C1037a(List<? extends androidx.compose.ui.layout.f0> list) {
                super(1);
                this.f49575f = list;
            }

            public final void a(f0.a aVar) {
                List<androidx.compose.ui.layout.f0> list = this.f49575f;
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    f0.a.l(aVar, list.get(i10), 0, 0, 0.0f, 4, null);
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(f0.a aVar) {
                a(aVar);
                return Unit.f143329a;
            }
        }

        a() {
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public final androidx.compose.ui.layout.J d(androidx.compose.ui.layout.K k10, List<? extends androidx.compose.ui.layout.I> list, long j10) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add(list.get(i10).k0(j10));
            }
            return androidx.compose.ui.layout.K.G0(k10, H1.b.l(j10), H1.b.k(j10), null, new C1037a(arrayList), 4, null);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.b$b, reason: collision with other inner class name */
    static final class C1038b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ AnnotatedString f49576f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ List<AnnotatedString.Range<Function3<String, Composer, Integer, Unit>>> f49577g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f49578h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1038b(AnnotatedString annotatedString, List<AnnotatedString.Range<Function3<String, Composer, Integer, Unit>>> list, int i10) {
            super(2);
            this.f49576f = annotatedString;
            this.f49577g = list;
            this.f49578h = i10;
        }

        public final void a(Composer composer, int i10) {
            C5812b.a(this.f49576f, this.f49577g, composer, J0.a(this.f49578h | 1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    public static final void a(AnnotatedString annotatedString, List<AnnotatedString.Range<Function3<String, Composer, Integer, Unit>>> list, Composer composer, int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1794596951);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.V(annotatedString) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.D(list) ? 32 : 16;
        }
        int i12 = 0;
        if (composerStartRestartGroup.p((i11 & 19) != 18, i11 & 1)) {
            if (ComposerKt.M()) {
                ComposerKt.U(-1794596951, i11, -1, "androidx.compose.foundation.text.InlineChildren (AnnotatedStringResolveInlineContent.kt:67)");
            }
            int size = list.size();
            int i13 = 0;
            while (i13 < size) {
                AnnotatedString.Range<Function3<String, Composer, Integer, Unit>> range = list.get(i13);
                Function3<String, Composer, Integer, Unit> function3A = range.a();
                int start = range.getStart();
                int end = range.getEnd();
                a aVar = a.f49574a;
                Modifier.Companion companion = Modifier.INSTANCE;
                int iA = C5859f.a(composerStartRestartGroup, i12);
                InterfaceC5884s interfaceC5884sR = composerStartRestartGroup.r();
                Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, companion);
                InterfaceC5953g.Companion companion2 = InterfaceC5953g.INSTANCE;
                Function0<InterfaceC5953g> function0A = companion2.a();
                if (composerStartRestartGroup.k() == null) {
                    C5859f.c();
                }
                composerStartRestartGroup.F();
                if (composerStartRestartGroup.h()) {
                    composerStartRestartGroup.I(function0A);
                } else {
                    composerStartRestartGroup.s();
                }
                Composer composerA = D1.a(composerStartRestartGroup);
                int i14 = i12;
                D1.c(composerA, aVar, companion2.e());
                D1.c(composerA, interfaceC5884sR, companion2.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
                if (composerA.h() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                D1.c(composerA, modifierE, companion2.f());
                function3A.invoke(annotatedString.subSequence(start, end).getText(), composerStartRestartGroup, Integer.valueOf(i14));
                composerStartRestartGroup.v();
                i13++;
                i12 = i14;
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        } else {
            composerStartRestartGroup.K();
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new C1038b(annotatedString, list, i10));
        }
    }

    public static final Pair<List<AnnotatedString.Range<Placeholder>>, List<AnnotatedString.Range<Function3<String, Composer, Integer, Unit>>>> c(AnnotatedString annotatedString, Map<String, r> map) {
        if (map == null || map.isEmpty()) {
            return f49573a;
        }
        List<AnnotatedString.Range<String>> listK = annotatedString.k("androidx.compose.foundation.text.inlineContent", 0, annotatedString.getText().length());
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size = listK.size();
        for (int i10 = 0; i10 < size; i10++) {
            AnnotatedString.Range<String> range = listK.get(i10);
            r rVar = map.get(range.g());
            if (rVar != null) {
                arrayList.add(new AnnotatedString.Range(rVar.getPlaceholder(), range.h(), range.f()));
                arrayList2.add(new AnnotatedString.Range(rVar.a(), range.h(), range.f()));
            }
        }
        return new Pair<>(arrayList, arrayList2);
    }

    public static final boolean b(AnnotatedString annotatedString) {
        return annotatedString.p("androidx.compose.foundation.text.inlineContent", 0, annotatedString.getText().length());
    }
}
