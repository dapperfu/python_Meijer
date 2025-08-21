package androidx.compose.foundation.layout;

import P0.e;
import Z.C5616n;
import androidx.compose.foundation.layout.AbstractC5809m;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.o;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.f0;
import com.google.android.gms.common.api.a;
import j0.C14881B;
import j0.C14884E;
import j0.C14886G;
import j0.C14905i;
import j0.C14912p;
import j0.C14914r;
import j0.InterfaceC14913q;
import j0.RowColumnParentData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u001an\u0010\u0012\u001a\u00020\u000f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u0017\u0010\u0011\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0002\b\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001ad\u0010\u0014\u001a\u00020\u000f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\u0017\u0010\u0011\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0002\b\u0010H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001a?\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001b\u001a]\u0010&\u001a\u00020%2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\b2\u0006\u0010#\u001a\u00020\b2\u0006\u0010$\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0017H\u0002¢\u0006\u0004\b&\u0010'\u001a\\\u00104\u001a\u000203*\u00020(2\u0006\u0010*\u001a\u00020)2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020,0+2\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020.2\u0006\u00102\u001a\u0002012\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0017H\u0000ø\u0001\u0000¢\u0006\u0004\b4\u00105\u001a%\u00108\u001a\u0004\u0018\u00010,*\b\u0012\u0004\u0012\u00020,0+2\b\u00107\u001a\u0004\u0018\u000106H\u0002¢\u0006\u0004\b8\u00109\u001a#\u0010=\u001a\u00020\b*\u00020\u001d2\u0006\u0010;\u001a\u00020:2\u0006\u0010<\u001a\u00020\bH\u0000¢\u0006\u0004\b=\u0010>\u001a#\u0010@\u001a\u00020\b*\u00020\u001d2\u0006\u0010;\u001a\u00020:2\u0006\u0010?\u001a\u00020\bH\u0000¢\u0006\u0004\b@\u0010>\u001a<\u0010D\u001a\u00020%*\u00020,2\u0006\u0010*\u001a\u00020)2\u0006\u00102\u001a\u00020A2\u0014\u0010C\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010B\u0012\u0004\u0012\u00020\u000f0\rH\u0000ø\u0001\u0000¢\u0006\u0004\bD\u0010E\u001aT\u0010L\u001a\u000203*\u00020(2\u0006\u00102\u001a\u0002012\u0006\u0010F\u001a\u00020\b2\u0006\u0010G\u001a\u00020\b2\u0006\u0010!\u001a\u00020\u001f2\f\u0010I\u001a\b\u0012\u0004\u0012\u0002030H2\u0006\u0010J\u001a\u00020)2\u0006\u0010K\u001a\u00020\u001fH\u0000ø\u0001\u0000¢\u0006\u0004\bL\u0010M\"\u001a\u0010R\u001a\u00020N8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010O\u001a\u0004\bP\u0010Q\"\u001a\u0010T\u001a\u00020N8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010O\u001a\u0004\bS\u0010Q\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006U"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/foundation/layout/d$e;", "horizontalArrangement", "Landroidx/compose/foundation/layout/d$m;", "verticalArrangement", "LP0/e$c;", "itemVerticalAlignment", "", "maxItemsInEachRow", "maxLines", "Landroidx/compose/foundation/layout/u;", "overflow", "Lkotlin/Function1;", "Lj0/q;", "", "Lkotlin/ExtensionFunctionType;", "content", "a", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/d$e;Landroidx/compose/foundation/layout/d$m;LP0/e$c;IILandroidx/compose/foundation/layout/u;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "b", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/d$e;Landroidx/compose/foundation/layout/d$m;LP0/e$c;IILkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "maxItemsInMainAxis", "Landroidx/compose/foundation/layout/r;", "overflowState", "Landroidx/compose/ui/layout/N;", "j", "(Landroidx/compose/foundation/layout/d$e;Landroidx/compose/foundation/layout/d$m;LP0/e$c;IILandroidx/compose/foundation/layout/r;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/N;", "", "Landroidx/compose/ui/layout/r;", "children", "", "mainAxisSizes", "crossAxisSizes", "mainAxisAvailable", "mainAxisSpacing", "crossAxisSpacing", "LZ/n;", "f", "(Ljava/util/List;[I[IIIIIILandroidx/compose/foundation/layout/r;)J", "Landroidx/compose/ui/layout/K;", "Landroidx/compose/foundation/layout/s;", "measurePolicy", "", "Landroidx/compose/ui/layout/I;", "measurablesIterator", "LH1/h;", "mainAxisSpacingDp", "crossAxisSpacingDp", "Lj0/B;", "constraints", "Landroidx/compose/ui/layout/J;", "d", "(Landroidx/compose/ui/layout/K;Landroidx/compose/foundation/layout/s;Ljava/util/Iterator;FFJIILandroidx/compose/foundation/layout/r;)Landroidx/compose/ui/layout/J;", "Lj0/p;", "info", "k", "(Ljava/util/Iterator;Lj0/p;)Landroidx/compose/ui/layout/I;", "", "isHorizontal", "crossAxisSize", "g", "(Landroidx/compose/ui/layout/r;ZI)I", "mainAxisSize", "e", "LH1/b;", "Landroidx/compose/ui/layout/f0;", "storePlaceable", "h", "(Landroidx/compose/ui/layout/I;Landroidx/compose/foundation/layout/s;JLkotlin/jvm/functions/Function1;)J", "mainAxisTotalSize", "crossAxisTotalSize", "LD0/c;", "items", "measureHelper", "outPosition", "i", "(Landroidx/compose/ui/layout/K;JII[ILD0/c;Landroidx/compose/foundation/layout/s;[I)Landroidx/compose/ui/layout/J;", "Landroidx/compose/foundation/layout/m;", "Landroidx/compose/foundation/layout/m;", "getCROSS_AXIS_ALIGNMENT_TOP", "()Landroidx/compose/foundation/layout/m;", "CROSS_AXIS_ALIGNMENT_TOP", "getCROSS_AXIS_ALIGNMENT_START", "CROSS_AXIS_ALIGNMENT_START", "foundation-layout_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC5809m f48872a;

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC5809m f48873b;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Modifier f48874f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C5800d.e f48875g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ C5800d.m f48876h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ e.c f48877i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f48878j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f48879k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ u f48880l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ Function3<InterfaceC14913q, Composer, Integer, Unit> f48881m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f48882n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ int f48883o;

        public final void a(Composer composer, int i10) {
            p.a(this.f48874f, this.f48875g, this.f48876h, this.f48877i, this.f48878j, this.f48879k, this.f48880l, this.f48881m, composer, J0.a(this.f48882n | 1), this.f48883o);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Modifier modifier, C5800d.e eVar, C5800d.m mVar, e.c cVar, int i10, int i11, u uVar, Function3<? super InterfaceC14913q, ? super Composer, ? super Integer, Unit> function3, int i12, int i13) {
            super(2);
            this.f48874f = modifier;
            this.f48875g = eVar;
            this.f48876h = mVar;
            this.f48877i = cVar;
            this.f48878j = i10;
            this.f48879k = i11;
            this.f48880l = uVar;
            this.f48881m = function3;
            this.f48882n = i12;
            this.f48883o = i13;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Modifier f48884f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C5800d.e f48885g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ C5800d.m f48886h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ e.c f48887i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f48888j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f48889k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Function3<InterfaceC14913q, Composer, Integer, Unit> f48890l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f48891m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f48892n;

        public final void a(Composer composer, int i10) {
            p.b(this.f48884f, this.f48885g, this.f48886h, this.f48887i, this.f48888j, this.f48889k, this.f48890l, composer, J0.a(this.f48891m | 1), this.f48892n);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Modifier modifier, C5800d.e eVar, C5800d.m mVar, e.c cVar, int i10, int i11, Function3<? super InterfaceC14913q, ? super Composer, ? super Integer, Unit> function3, int i12, int i13) {
            super(2);
            this.f48884f = modifier;
            this.f48885g = eVar;
            this.f48886h = mVar;
            this.f48887i = cVar;
            this.f48888j = i10;
            this.f48889k = i11;
            this.f48890l = function3;
            this.f48891m = i12;
            this.f48892n = i13;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
    static final class c extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function3<InterfaceC14913q, Composer, Integer, Unit> f48893f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(Function3<? super InterfaceC14913q, ? super Composer, ? super Integer, Unit> function3) {
            super(2);
            this.f48893f = function3;
        }

        public final void a(Composer composer, int i10) {
            if (!composer.p((i10 & 3) != 2, i10 & 1)) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(702094978, i10, -1, "androidx.compose.foundation.layout.FlowRow.<anonymous>.<anonymous> (FlowLayout.kt:112)");
            }
            this.f48893f.invoke(C14914r.f139730b, composer, 6);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/layout/f0;", "placeable", "", "a", "(Landroidx/compose/ui/layout/f0;)V"}, k = 3, mv = {1, 9, 0})
    static final class d extends Lambda implements Function1<f0, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef<f0> f48894f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Ref.ObjectRef<f0> objectRef) {
            super(1);
            this.f48894f = objectRef;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(f0 f0Var) {
            this.f48894f.f143742a = f0Var;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(f0 f0Var) {
            a(f0Var);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/layout/f0;", "placeable", "", "a", "(Landroidx/compose/ui/layout/f0;)V"}, k = 3, mv = {1, 9, 0})
    static final class e extends Lambda implements Function1<f0, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef<f0> f48895f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Ref.ObjectRef<f0> objectRef) {
            super(1);
            this.f48895f = objectRef;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(f0 f0Var) {
            this.f48895f.f143742a = f0Var;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(f0 f0Var) {
            a(f0Var);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/f0$a;", "", "a", "(Landroidx/compose/ui/layout/f0$a;)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    static final class f extends Lambda implements Function1<f0.a, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ D0.c<androidx.compose.ui.layout.J> f48896f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(D0.c<androidx.compose.ui.layout.J> cVar) {
            super(1);
            this.f48896f = cVar;
        }

        public final void a(f0.a aVar) {
            D0.c<androidx.compose.ui.layout.J> cVar = this.f48896f;
            androidx.compose.ui.layout.J[] jArr = cVar.content;
            int size = cVar.getSize();
            for (int i10 = 0; i10 < size; i10++) {
                jArr[i10].s();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(f0.a aVar) {
            a(aVar);
            return Unit.f143329a;
        }
    }

    static {
        AbstractC5809m.Companion companion = AbstractC5809m.INSTANCE;
        e.Companion companion2 = P0.e.INSTANCE;
        f48872a = companion.c(companion2.l());
        f48873b = companion.b(companion2.k());
    }

    /* JADX WARN: Removed duplicated region for block: B:142:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:170:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0109  */
    @kotlin.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(androidx.compose.ui.Modifier r24, androidx.compose.foundation.layout.C5800d.e r25, androidx.compose.foundation.layout.C5800d.m r26, P0.e.c r27, int r28, int r29, androidx.compose.foundation.layout.u r30, kotlin.jvm.functions.Function3<? super j0.InterfaceC14913q, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r31, androidx.compose.runtime.Composer r32, int r33, int r34) {
        /*
            Method dump skipped, instructions count: 685
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.p.a(androidx.compose.ui.Modifier, androidx.compose.foundation.layout.d$e, androidx.compose.foundation.layout.d$m, P0.e$c, int, int, androidx.compose.foundation.layout.u, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(androidx.compose.ui.Modifier r21, androidx.compose.foundation.layout.C5800d.e r22, androidx.compose.foundation.layout.C5800d.m r23, P0.e.c r24, int r25, int r26, kotlin.jvm.functions.Function3<? super j0.InterfaceC14913q, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r27, androidx.compose.runtime.Composer r28, int r29, int r30) {
        /*
            Method dump skipped, instructions count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.p.b(androidx.compose.ui.Modifier, androidx.compose.foundation.layout.d$e, androidx.compose.foundation.layout.d$m, P0.e$c, int, int, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final androidx.compose.ui.layout.J d(androidx.compose.ui.layout.K k10, s sVar, Iterator<? extends androidx.compose.ui.layout.I> it, float f10, float f11, long j10, int i10, int i11, FlowLayoutOverflowState flowLayoutOverflowState) {
        int i12;
        o.a aVarA;
        Z.K k11;
        int i13;
        int i14;
        androidx.compose.ui.layout.K k12;
        s sVar2;
        int[] iArr;
        int[] iArr2;
        long j11;
        int f51588b;
        int f51587a;
        int i15;
        Z.K k13;
        C5616n c5616nA;
        Z.J j12;
        Z.J j13;
        int i16;
        int i17;
        o.a aVar;
        int i18;
        int i19;
        int i20;
        androidx.compose.ui.layout.K k14 = k10;
        s sVar3 = sVar;
        Iterator<? extends androidx.compose.ui.layout.I> it2 = it;
        D0.c cVar = new D0.c(new androidx.compose.ui.layout.J[16], 0);
        int iL = H1.b.l(j10);
        int iN = H1.b.n(j10);
        int iK = H1.b.k(j10);
        Z.K kC = Z.r.c();
        ArrayList arrayList = new ArrayList();
        int iCeil = (int) Math.ceil(k14.I1(f10));
        int iCeil2 = (int) Math.ceil(k14.I1(f11));
        long jA = C14881B.a(0, iL, 0, iK);
        long jF = C14881B.f(C14881B.e(jA, 0, 0, 0, 0, 14, null), sVar3.getIsHorizontal() ? j0.y.f139753a : j0.y.f139754b);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        C14912p c14912p = it2 instanceof C14905i ? new C14912p(0, 0, k14.K(iL), k14.K(iK), null) : null;
        androidx.compose.ui.layout.I iK2 = !it2.hasNext() ? null : k(it2, c14912p);
        C5616n c5616nA2 = iK2 != null ? C5616n.a(h(iK2, sVar3, jF, new e(objectRef))) : null;
        Integer numValueOf = c5616nA2 != null ? Integer.valueOf(C5616n.e(c5616nA2.getPackedValue())) : null;
        Integer numValueOf2 = c5616nA2 != null ? Integer.valueOf(C5616n.f(c5616nA2.getPackedValue())) : null;
        Integer num = numValueOf;
        androidx.compose.ui.layout.I i21 = iK2;
        Z.J j14 = new Z.J(0, 1, null);
        Z.J j15 = new Z.J(0, 1, null);
        C14912p c14912p2 = c14912p;
        o oVar = new o(i10, flowLayoutOverflowState, j10, i11, iCeil, iCeil2, null);
        int i22 = iCeil;
        o.b bVarB = oVar.b(it2.hasNext(), 0, C5616n.b(iL, iK), c5616nA2, 0, 0, 0, false, false);
        if (bVarB.getIsLastItemInContainer()) {
            aVarA = oVar.a(bVarB, c5616nA2 != null, -1, 0, iL, 0);
            i12 = iL;
        } else {
            i12 = iL;
            aVarA = null;
        }
        Integer numValueOf3 = num;
        o.a aVar2 = aVarA;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        o.b bVar = bVarB;
        int i27 = 0;
        int i28 = iN;
        Z.J j16 = j14;
        int i29 = iK;
        int i30 = 0;
        int i31 = i12;
        androidx.compose.ui.layout.I iK3 = i21;
        while (!bVar.getIsLastItemInContainer() && iK3 != null) {
            Intrinsics.g(numValueOf3);
            int iIntValue = numValueOf3.intValue();
            Intrinsics.g(numValueOf2);
            Z.J j17 = j15;
            int i32 = i12;
            int i33 = i24 + iIntValue;
            int iMax = Math.max(i23, numValueOf2.intValue());
            int i34 = i31 - iIntValue;
            int i35 = i30 + 1;
            int i36 = i28;
            flowLayoutOverflowState.k(i35);
            arrayList.add(iK3);
            kC.r(i30, objectRef.f143742a);
            int i37 = i35 - i25;
            boolean z10 = i37 < i10;
            if (c14912p2 != null) {
                if (z10) {
                    i15 = i37;
                    i18 = i27;
                } else {
                    i15 = i37;
                    i18 = i27 + 1;
                }
                int i38 = z10 ? i15 : 0;
                if (z10) {
                    int i39 = i34 - i22;
                    i19 = i39 < 0 ? 0 : i39;
                } else {
                    i19 = i32;
                }
                float fK = k14.K(i19);
                if (z10) {
                    k13 = kC;
                    i20 = i29;
                } else {
                    int i40 = (i29 - iMax) - iCeil2;
                    k13 = kC;
                    i20 = i40 < 0 ? 0 : i40;
                }
                c14912p2.a(i18, i38, fK, k14.K(i20));
            } else {
                i15 = i37;
                k13 = kC;
            }
            iK3 = !it2.hasNext() ? null : k(it2, c14912p2);
            objectRef.f143742a = null;
            C5616n c5616nA3 = iK3 != null ? C5616n.a(h(iK3, sVar3, jF, new d(objectRef))) : null;
            Integer numValueOf4 = c5616nA3 != null ? Integer.valueOf(C5616n.e(c5616nA3.getPackedValue()) + i22) : null;
            numValueOf2 = c5616nA3 != null ? Integer.valueOf(C5616n.f(c5616nA3.getPackedValue())) : null;
            boolean zHasNext = it2.hasNext();
            int i41 = i27;
            long jB = C5616n.b(i34, i29);
            if (c5616nA3 == null) {
                c5616nA = null;
            } else {
                Intrinsics.g(numValueOf4);
                int iIntValue2 = numValueOf4.intValue();
                Intrinsics.g(numValueOf2);
                c5616nA = C5616n.a(C5616n.b(iIntValue2, numValueOf2.intValue()));
            }
            o.b bVarB2 = oVar.b(zHasNext, i15, jB, c5616nA, i41, i26, iMax, false, false);
            if (bVarB2.getIsLastItemInLine()) {
                int iMin = Math.min(Math.max(i36, i33), i32);
                int i42 = i26 + iMax;
                o.a aVarA2 = oVar.a(bVarB2, c5616nA3 != null, i41, i42, i34, i15);
                j12 = j17;
                j12.k(iMax);
                int i43 = (iK - i42) - iCeil2;
                Z.J j18 = j16;
                j18.k(i35);
                i27 = i41 + 1;
                i26 = i42 + iCeil2;
                i31 = i32;
                i32 = i31;
                numValueOf3 = numValueOf4 != null ? Integer.valueOf(numValueOf4.intValue() - i22) : null;
                i25 = i35;
                i16 = i43;
                aVar = aVarA2;
                i28 = iMin;
                j13 = j18;
                i17 = 0;
                i33 = 0;
            } else {
                j12 = j17;
                j13 = j16;
                numValueOf3 = numValueOf4;
                i31 = i34;
                i27 = i41;
                i28 = i36;
                i16 = i29;
                i17 = iMax;
                aVar = aVar2;
            }
            aVar2 = aVar;
            j16 = j13;
            i23 = i17;
            i29 = i16;
            i30 = i35;
            bVar = bVarB2;
            it2 = it;
            j15 = j12;
            kC = k13;
            i24 = i33;
            i12 = i32;
        }
        Z.K k15 = kC;
        int i44 = i28;
        Z.J j19 = j15;
        Z.J j20 = j16;
        if (aVar2 != null) {
            arrayList.add(aVar2.getEllipsis());
            k11 = k15;
            k11.r(arrayList.size() - 1, aVar2.getPlaceable());
            int i45 = j20._size - 1;
            if (aVar2.getPlaceEllipsisOnLastContentLine()) {
                int i46 = j20._size - 1;
                j19.p(i45, Math.max(j19.e(i45), C5616n.f(aVar2.getEllipsisSize())));
                j20.p(i46, j20.i() + 1);
            } else {
                j19.k(C5616n.f(aVar2.getEllipsisSize()));
                j20.k(j20.i() + 1);
            }
        } else {
            k11 = k15;
        }
        int size = arrayList.size();
        f0[] f0VarArr = new f0[size];
        for (int i47 = 0; i47 < size; i47++) {
            f0VarArr[i47] = k11.b(i47);
        }
        int i48 = j20._size;
        int[] iArr3 = new int[i48];
        int[] iArr4 = new int[i48];
        int[] iArr5 = j20.content;
        int iMax2 = i44;
        int i49 = 0;
        int i50 = 0;
        int i51 = 0;
        f0[] f0VarArr2 = f0VarArr;
        while (i50 < i48) {
            int i52 = iArr5[i50];
            Z.J j21 = j19;
            int iE = j21.e(i50);
            int[] iArr6 = iArr3;
            f0[] f0VarArr3 = f0VarArr2;
            s sVar4 = sVar3;
            ArrayList arrayList2 = arrayList;
            int i53 = i22;
            androidx.compose.ui.layout.J jA2 = C14886G.a(sVar4, iMax2, H1.b.m(jA), H1.b.l(jA), iE, i53, k14, arrayList2, f0VarArr3, i49, i52, iArr6, i50);
            if (sVar.getIsHorizontal()) {
                f51588b = jA2.getWidth();
                f51587a = jA2.getHeight();
            } else {
                f51588b = jA2.getHeight();
                f51587a = jA2.getWidth();
            }
            iArr4[i50] = f51587a;
            i51 += f51587a;
            iMax2 = Math.max(iMax2, f51588b);
            cVar.c(jA2);
            i50++;
            arrayList = arrayList2;
            f0VarArr2 = f0VarArr3;
            i49 = i52;
            iArr3 = iArr6;
            j19 = j21;
            i22 = i53;
            k14 = k10;
            sVar3 = sVar;
        }
        int[] iArr7 = iArr3;
        if (cVar.getSize() == 0) {
            i13 = 0;
            i14 = 0;
            k12 = k10;
            sVar2 = sVar;
            j11 = j10;
            iArr = iArr7;
            iArr2 = iArr4;
        } else {
            i13 = iMax2;
            i14 = i51;
            k12 = k10;
            sVar2 = sVar;
            iArr = iArr7;
            iArr2 = iArr4;
            j11 = j10;
        }
        return i(k12, j11, i13, i14, iArr2, cVar, sVar2, iArr);
    }

    public static final int e(androidx.compose.ui.layout.r rVar, boolean z10, int i10) {
        return z10 ? rVar.W(i10) : rVar.d0(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long f(List<? extends androidx.compose.ui.layout.r> list, int[] iArr, int[] iArr2, int i10, int i11, int i12, int i13, int i14, FlowLayoutOverflowState flowLayoutOverflowState) {
        if (list.isEmpty()) {
            return C5616n.b(0, 0);
        }
        o oVar = new o(i13, flowLayoutOverflowState, C14881B.a(0, i10, 0, a.e.API_PRIORITY_OTHER), i14, i11, i12, null);
        androidx.compose.ui.layout.r rVar = (androidx.compose.ui.layout.r) CollectionsKt.v0(list, 0);
        int i15 = rVar != null ? iArr2[0] : 0;
        int i16 = rVar != null ? iArr[0] : 0;
        int i17 = 0;
        if (oVar.b(list.size() > 1, 0, C5616n.b(i10, a.e.API_PRIORITY_OTHER), rVar == null ? null : C5616n.a(C5616n.b(i16, i15)), 0, 0, 0, false, false).getIsLastItemInContainer()) {
            C5616n c5616nF = flowLayoutOverflowState.f(rVar != null, 0, 0);
            return C5616n.b(c5616nF != null ? C5616n.f(c5616nF.getPackedValue()) : 0, 0);
        }
        int size = list.size();
        int i18 = i10;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        while (true) {
            if (i19 >= size) {
                break;
            }
            int i24 = i18 - i16;
            int i25 = i19 + 1;
            int iMax = Math.max(i23, i15);
            androidx.compose.ui.layout.r rVar2 = (androidx.compose.ui.layout.r) CollectionsKt.v0(list, i25);
            int i26 = rVar2 != null ? iArr2[i25] : 0;
            int i27 = rVar2 != null ? iArr[i25] + i11 : 0;
            int i28 = i25 - i21;
            int i29 = i22;
            int i30 = i26;
            int i31 = i27;
            o.b bVarB = oVar.b(i19 + 2 < list.size(), i28, C5616n.b(i24, a.e.API_PRIORITY_OTHER), rVar2 == null ? null : C5616n.a(C5616n.b(i27, i26)), i29, i17, iMax, false, false);
            if (bVarB.getIsLastItemInLine()) {
                int iF = i17 + iMax + i12;
                o.a aVarA = oVar.a(bVarB, rVar2 != null, i29, iF, i24, i28);
                int i32 = i31 - i11;
                i22 = i29 + 1;
                if (bVarB.getIsLastItemInContainer()) {
                    if (aVarA != null) {
                        long ellipsisSize = aVarA.getEllipsisSize();
                        if (!aVarA.getPlaceEllipsisOnLastContentLine()) {
                            iF += C5616n.f(ellipsisSize) + i12;
                        }
                    }
                    i17 = iF;
                    i20 = i25;
                } else {
                    i23 = 0;
                    i17 = iF;
                    i16 = i32;
                    i21 = i25;
                    i18 = i10;
                }
            } else {
                i18 = i24;
                i22 = i29;
                i23 = iMax;
                i16 = i31;
            }
            i19 = i25;
            i20 = i19;
            i15 = i30;
        }
        return C5616n.b(i17 - i12, i20);
    }

    public static final int g(androidx.compose.ui.layout.r rVar, boolean z10, int i10) {
        return z10 ? rVar.d0(i10) : rVar.W(i10);
    }

    public static final androidx.compose.ui.layout.N j(C5800d.e eVar, C5800d.m mVar, e.c cVar, int i10, int i11, FlowLayoutOverflowState flowLayoutOverflowState, Composer composer, int i12) {
        if (ComposerKt.M()) {
            ComposerKt.U(-2010142641, i12, -1, "androidx.compose.foundation.layout.rowMeasurementMultiContentHelper (FlowLayout.kt:484)");
        }
        boolean zV = ((((i12 & 14) ^ 6) > 4 && composer.V(eVar)) || (i12 & 6) == 4) | ((((i12 & 112) ^ 48) > 32 && composer.V(mVar)) || (i12 & 48) == 32) | ((((i12 & 896) ^ 384) > 256 && composer.V(cVar)) || (i12 & 384) == 256) | ((((i12 & 7168) ^ 3072) > 2048 && composer.d(i10)) || (i12 & 3072) == 2048) | ((((57344 & i12) ^ 24576) > 16384 && composer.d(i11)) || (i12 & 24576) == 16384) | composer.V(flowLayoutOverflowState);
        Object objB = composer.B();
        if (zV || objB == Composer.INSTANCE.a()) {
            FlowMeasurePolicy tVar = new FlowMeasurePolicy(true, eVar, mVar, eVar.getSpacing(), AbstractC5809m.INSTANCE.c(cVar), mVar.getSpacing(), i10, i11, flowLayoutOverflowState, null);
            composer.t(tVar);
            objB = tVar;
        }
        FlowMeasurePolicy tVar2 = (FlowMeasurePolicy) objB;
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return tVar2;
    }

    private static final androidx.compose.ui.layout.I k(Iterator<? extends androidx.compose.ui.layout.I> it, C14912p c14912p) {
        try {
            if (!(it instanceof C14905i)) {
                return it.next();
            }
            Intrinsics.g(c14912p);
            return ((C14905i) it).c(c14912p);
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    public static final long h(androidx.compose.ui.layout.I i10, s sVar, long j10, Function1<? super f0, Unit> function1) {
        if (C14884E.e(C14884E.c(i10)) == 0.0f) {
            RowColumnParentData rowColumnParentDataC = C14884E.c(i10);
            if (rowColumnParentDataC != null) {
                rowColumnParentDataC.c();
            }
            f0 f0VarK0 = i10.k0(j10);
            function1.invoke(f0VarK0);
            return C5616n.b(sVar.h(f0VarK0), sVar.k(f0VarK0));
        }
        int iG = g(i10, sVar.getIsHorizontal(), a.e.API_PRIORITY_OTHER);
        return C5616n.b(iG, e(i10, sVar.getIsHorizontal(), iG));
    }

    public static final androidx.compose.ui.layout.J i(androidx.compose.ui.layout.K k10, long j10, int i10, int i11, int[] iArr, D0.c<androidx.compose.ui.layout.J> cVar, s sVar, int[] iArr2) {
        int i12;
        int iK;
        int i13;
        int i14;
        boolean zB = sVar.getIsHorizontal();
        C5800d.m mVarS = sVar.getVerticalArrangement();
        C5800d.e eVarR = sVar.getHorizontalArrangement();
        if (zB) {
            int iE0 = i11 + (k10.E0(mVarS.getSpacing()) * (cVar.getSize() - 1));
            int iM = H1.b.m(j10);
            iK = H1.b.k(j10);
            if (iE0 < iM) {
                iE0 = iM;
            }
            if (iE0 <= iK) {
                iK = iE0;
            }
            mVarS.b(k10, iK, iArr, iArr2);
        } else {
            int iE02 = i11 + (k10.E0(eVarR.getSpacing()) * (cVar.getSize() - 1));
            int iM2 = H1.b.m(j10);
            int iK2 = H1.b.k(j10);
            if (iE02 < iM2) {
                iE02 = iM2;
            }
            if (iE02 > iK2) {
                i12 = iK2;
            } else {
                i12 = iE02;
            }
            eVarR.c(k10, i12, iArr, k10.getLayoutDirection(), iArr2);
            iK = i12;
        }
        int iN = H1.b.n(j10);
        int iL = H1.b.l(j10);
        if (i10 < iN) {
            i10 = iN;
        }
        if (i10 <= iL) {
            iL = i10;
        }
        if (zB) {
            i14 = iL;
            i13 = iK;
        } else {
            i13 = iL;
            i14 = iK;
        }
        return androidx.compose.ui.layout.K.G0(k10, i14, i13, null, new f(cVar), 4, null);
    }
}
