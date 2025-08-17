package A0;

import U0.k;
import androidx.compose.ui.Modifier;
import kotlin.C6292E;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a%\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/Modifier;", "LA0/g;", "state", "", "scale", "a", "(Landroidx/compose/ui/Modifier;LA0/g;Z)Landroidx/compose/ui/Modifier;", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class d {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LX0/c;", "", "a", "(LX0/c;)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    static final class a extends Lambda implements Function1<X0.c, Unit> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f45f = new a();

        a() {
            super(1);
        }

        public final void a(X0.c cVar) {
            int iB = androidx.compose.ui.graphics.b.INSTANCE.b();
            X0.d drawContext = cVar.getDrawContext();
            long jB = drawContext.b();
            drawContext.g().save();
            try {
                drawContext.getTransform().c(-3.4028235E38f, 0.0f, Float.MAX_VALUE, Float.MAX_VALUE, iB);
                cVar.a2();
            } finally {
                drawContext.g().i();
                drawContext.h(jB);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(X0.c cVar) {
            a(cVar);
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/e;", "", "a", "(Landroidx/compose/ui/graphics/e;)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    static final class b extends Lambda implements Function1<androidx.compose.ui.graphics.e, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ g f46f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f47g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(g gVar, boolean z10) {
            super(1);
            this.f46f = gVar;
            this.f47g = z10;
        }

        public final void a(androidx.compose.ui.graphics.e eVar) {
            eVar.e(this.f46f.i() - k.g(eVar.getSize()));
            if (!this.f47g || this.f46f.k()) {
                return;
            }
            float fA = C6292E.e().a(this.f46f.i() / this.f46f.l());
            if (fA < 0.0f) {
                fA = 0.0f;
            }
            if (fA > 1.0f) {
                fA = 1.0f;
            }
            eVar.h(fA);
            eVar.m(fA);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.graphics.e eVar) {
            a(eVar);
            return Unit.f142422a;
        }
    }

    public static final Modifier a(Modifier modifier, g gVar, boolean z10) {
        return androidx.compose.ui.graphics.d.a(androidx.compose.ui.draw.b.d(modifier, a.f45f), new b(gVar, z10));
    }
}
