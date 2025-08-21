package Ci;

import Ki.LocalThemeScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import ki.q1;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\rR\u0014\u0010\u0014\u001a\u00020\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001d8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006!À\u0006\u0001"}, d2 = {"LCi/a;", "LJi/b;", "Lkotlin/Function1;", "Landroidx/compose/ui/Modifier;", "", "a", "()Lkotlin/jvm/functions/Function3;", "Lki/q1$k;", "b", "()Lki/q1$k;", "template", "", "getTitle", "()Ljava/lang/String;", "title", "getDescription", "description", "LCi/o;", "y", "()LCi/o;", "loadingStatus", "", "k", "()Z", "isVertical", "LKi/M;", "c", "()LKi/M;", "localThemeScope", "Lkotlin/Function0;", "getContent", "()Lkotlin/jvm/functions/Function2;", "content", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface a extends Ji.b {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Ci.a$a, reason: collision with other inner class name */
    static final class C0091a implements Function3<Modifier, Composer, Integer, Unit> {
        C0091a() {
        }

        public final void a(Modifier it, Composer composer, int i10) {
            Intrinsics.j(it, "it");
            if ((i10 & 6) == 0) {
                i10 |= composer.V(it) ? 4 : 2;
            }
            if ((i10 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1221931717, i10, -1, "com.meijer.mobile.android_acres_library.composables.loading.LoadingComposer.getComposer.<anonymous> (LoadingComposer.kt:40)");
            }
            if (m.j(a.this.y())) {
                composer.startReplaceGroup(-1750306260);
                Function2<Composer, Integer, Unit> content = a.this.getContent();
                if (content != null) {
                    content.invoke(composer, 0);
                }
                composer.P();
            } else if (a.this.y() != o.f4633e) {
                composer.startReplaceGroup(1575200140);
                q1.k kVarB = a.this.b();
                if (kVarB instanceof q1.k.Large) {
                    composer.startReplaceGroup(1575268743);
                    i.l(a.this, it, composer, (i10 << 3) & 112);
                    composer.P();
                } else if (kVarB instanceof q1.k.LargeV2) {
                    composer.startReplaceGroup(1575383877);
                    i.n(a.this, it, composer, (i10 << 3) & 112);
                    composer.P();
                } else {
                    if (!(kVarB instanceof q1.k.Small)) {
                        composer.startReplaceGroup(-1750301866);
                        composer.P();
                        throw new NoWhenBranchMatchedException();
                    }
                    composer.startReplaceGroup(1575503785);
                    if (a.this.k()) {
                        composer.startReplaceGroup(1575541047);
                        i.t(a.this, it, composer, (i10 << 3) & 112);
                        composer.P();
                    } else {
                        composer.startReplaceGroup(1575626111);
                        i.r(a.this, it, composer, (i10 << 3) & 112);
                        composer.P();
                    }
                    composer.P();
                }
                composer.P();
            } else {
                composer.startReplaceGroup(1575758791);
                composer.P();
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Modifier modifier, Composer composer, Integer num) {
            a(modifier, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    q1.k b();

    /* renamed from: c */
    LocalThemeScope getLocalThemeScope();

    Function2<Composer, Integer, Unit> getContent();

    String getDescription();

    String getTitle();

    boolean k();

    o y();

    @Override // Ji.b
    default Function3<Modifier, Composer, Integer, Unit> a() {
        return ComposableLambdaKt.composableLambdaInstance(-1221931717, true, new C0091a());
    }
}
