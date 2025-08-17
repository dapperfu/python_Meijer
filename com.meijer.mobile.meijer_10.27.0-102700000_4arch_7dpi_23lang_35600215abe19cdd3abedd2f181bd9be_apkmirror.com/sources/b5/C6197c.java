package b5;

import V0.C5347r0;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.I;
import androidx.compose.ui.layout.InterfaceC5784k;
import androidx.compose.ui.layout.J;
import androidx.compose.ui.layout.K;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.f0;
import androidx.compose.ui.node.InterfaceC5811g;
import androidx.recyclerview.widget.RecyclerView;
import b5.C6197c;
import b5.C6200f;
import coil.compose.ContentPainterElement;
import com.google.android.libraries.places.api.model.PlaceTypes;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import l5.C15372h;
import m5.InterfaceC15560j;

@Metadata(d1 = {"\u0000~\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aé\u0001\u0010\"\u001a\u00020\u000e2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f2\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f2\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f2\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010!\u001a\u00020 H\u0007¢\u0006\u0004\b\"\u0010#\u001a«\u0001\u0010'\u001a\u00020\u000e2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0014\b\u0002\u0010%\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020$0\f2\u0016\b\u0002\u0010&\u001a\u0010\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f2\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010!\u001a\u00020 H\u0007¢\u0006\u0004\b'\u0010(\u001a\u0085\u0001\u0010+\u001a\u00020\u000e2\u0006\u0010*\u001a\u00020)2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020$0\f2\u0014\u0010&\u001a\u0010\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0003¢\u0006\u0004\b+\u0010,\u001aS\u0010/\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010.\u001a\u00020-2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001f\u001a\u00020\u001eH\u0003¢\u0006\u0004\b/\u00100¨\u00061"}, d2 = {"", "model", "", "contentDescription", "LZ4/h;", "imageLoader", "Landroidx/compose/ui/Modifier;", "modifier", "LZ0/c;", "placeholder", "error", "fallback", "Lkotlin/Function1;", "Lb5/f$b$c;", "", "onLoading", "Lb5/f$b$d;", "onSuccess", "Lb5/f$b$b;", "onError", "LP0/e;", "alignment", "Landroidx/compose/ui/layout/k;", "contentScale", "", "alpha", "LV0/r0;", "colorFilter", "LV0/b1;", "filterQuality", "", "clipToBounds", "Lb5/p;", "modelEqualityDelegate", "d", "(Ljava/lang/Object;Ljava/lang/String;LZ4/h;Landroidx/compose/ui/Modifier;LZ0/c;LZ0/c;LZ0/c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;LP0/e;Landroidx/compose/ui/layout/k;FLV0/r0;IZLb5/p;Landroidx/compose/runtime/Composer;III)V", "Lb5/f$b;", "transform", "onState", "e", "(Ljava/lang/Object;Ljava/lang/String;LZ4/h;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;LP0/e;Landroidx/compose/ui/layout/k;FLV0/r0;IZLb5/p;Landroidx/compose/runtime/Composer;III)V", "Lb5/i;", "state", "c", "(Lb5/i;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;LP0/e;Landroidx/compose/ui/layout/k;FLV0/r0;IZLandroidx/compose/runtime/Composer;II)V", "Lb5/f;", PlaceTypes.PAINTER, "g", "(Landroidx/compose/ui/Modifier;Lb5/f;Ljava/lang/String;LP0/e;Landroidx/compose/ui/layout/k;FLV0/r0;ZLandroidx/compose/runtime/Composer;I)V", "coil-compose-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: b5.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6197c {

    @Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002\"\u000e\b\u0001\u0010\u0003\u0018\u0001*\u0006\u0012\u0002\b\u00030\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "T", "", "E", "Landroidx/compose/runtime/Applier;", "invoke", "()Ljava/lang/Object;", "androidx/compose/runtime/ComposablesKt$ReusableComposeNode$1", "androidx/compose/ui/layout/LayoutKt$Layout$$inlined$ReusableComposeNode$1"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: b5.c$a */
    public static final class a extends Lambda implements Function0<InterfaceC5811g> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f59805f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function0 function0) {
            super(0);
            this.f59805f = function0;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.g, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final InterfaceC5811g invoke() {
            return this.f59805f.invoke();
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: b5.c$b */
    static final class b implements MeasurePolicy {

        /* renamed from: a, reason: collision with root package name */
        public static final b f59806a = new b();

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit b(f0.a aVar) {
            return Unit.f142422a;
        }

        b() {
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public final J d(K k10, List<? extends I> list, long j10) {
            return K.G0(k10, H1.b.n(j10), H1.b.m(j10), null, new Function1() { // from class: b5.d
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C6197c.b.b((f0.a) obj);
                }
            }, 4, null);
        }
    }

    private static final void c(i iVar, final String str, final Modifier modifier, final Function1<? super C6200f.b, ? extends C6200f.b> function1, final Function1<? super C6200f.b, Unit> function12, final P0.e eVar, final InterfaceC5784k interfaceC5784k, final float f10, final C5347r0 c5347r0, final int i10, final boolean z10, Composer composer, final int i11, final int i12) {
        final i iVar2;
        int i13;
        Function1<? super C6200f.b, ? extends C6200f.b> function13;
        Function1<? super C6200f.b, Unit> function14;
        int i14;
        Composer composerStartRestartGroup = composer.startRestartGroup(-421592773);
        if ((i11 & 14) == 0) {
            iVar2 = iVar;
            i13 = (composerStartRestartGroup.V(iVar2) ? 4 : 2) | i11;
        } else {
            iVar2 = iVar;
            i13 = i11;
        }
        if ((i11 & 112) == 0) {
            i13 |= composerStartRestartGroup.V(str) ? 32 : 16;
        }
        if ((i11 & 896) == 0) {
            i13 |= composerStartRestartGroup.V(modifier) ? 256 : 128;
        }
        if ((i11 & 7168) == 0) {
            function13 = function1;
            i13 |= composerStartRestartGroup.D(function13) ? RecyclerView.m.FLAG_MOVED : 1024;
        } else {
            function13 = function1;
        }
        if ((i11 & 57344) == 0) {
            function14 = function12;
            i13 |= composerStartRestartGroup.D(function14) ? 16384 : 8192;
        } else {
            function14 = function12;
        }
        if ((i11 & 458752) == 0) {
            i13 |= composerStartRestartGroup.V(eVar) ? 131072 : 65536;
        }
        if ((i11 & 3670016) == 0) {
            i13 |= composerStartRestartGroup.V(interfaceC5784k) ? 1048576 : 524288;
        }
        if ((i11 & 29360128) == 0) {
            i13 |= composerStartRestartGroup.b(f10) ? 8388608 : 4194304;
        }
        if ((234881024 & i11) == 0) {
            i13 |= composerStartRestartGroup.V(c5347r0) ? 67108864 : 33554432;
        }
        if ((i11 & 1879048192) == 0) {
            i13 |= composerStartRestartGroup.d(i10) ? 536870912 : 268435456;
        }
        int i15 = i13;
        if ((i12 & 14) == 0) {
            i14 = i12 | (composerStartRestartGroup.a(z10) ? 4 : 2);
        } else {
            i14 = i12;
        }
        if ((i15 & 1533916891) == 306783378 && (i14 & 11) == 2 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            C15372h c15372hM = F.m(iVar2.getModel(), interfaceC5784k, composerStartRestartGroup, ((i15 >> 15) & 112) | 8);
            int i16 = i15 >> 3;
            int i17 = i15 >> 6;
            int i18 = i17 & 57344;
            C6200f c6200fC = h.c(c15372hM, iVar2.getImageLoader(), function13, function14, interfaceC5784k, i10, iVar2.getModelEqualityDelegate(), composerStartRestartGroup, (i16 & 7168) | (i16 & 896) | 72 | i18 | ((i15 >> 12) & 458752), 0);
            InterfaceC15560j sizeResolver = c15372hM.getSizeResolver();
            g(sizeResolver instanceof l ? modifier.then((Modifier) sizeResolver) : modifier, c6200fC, str, eVar, interfaceC5784k, f10, c5347r0, z10, composerStartRestartGroup, ((i15 << 3) & 896) | (i17 & 7168) | i18 | (i17 & 458752) | (i17 & 3670016) | ((i14 << 21) & 29360128));
            composerStartRestartGroup = composerStartRestartGroup;
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: b5.a
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C6197c.f(iVar2, str, modifier, function1, function12, eVar, interfaceC5784k, f10, c5347r0, i10, z10, i11, i12, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void d(Object obj, String str, Z4.h hVar, Modifier modifier, Z0.c cVar, Z0.c cVar2, Z0.c cVar3, Function1<? super C6200f.b.Loading, Unit> function1, Function1<? super C6200f.b.Success, Unit> function12, Function1<? super C6200f.b.Error, Unit> function13, P0.e eVar, InterfaceC5784k interfaceC5784k, float f10, C5347r0 c5347r0, int i10, boolean z10, p pVar, Composer composer, int i11, int i12, int i13) {
        composer.startReplaceableGroup(-1481548872);
        Modifier modifier2 = (i13 & 8) != 0 ? Modifier.INSTANCE : modifier;
        Z0.c cVar4 = (i13 & 16) != 0 ? null : cVar;
        Z0.c cVar5 = (i13 & 32) != 0 ? null : cVar2;
        Z0.c cVar6 = (i13 & 64) != 0 ? cVar5 : cVar3;
        Function1<? super C6200f.b.Loading, Unit> function14 = (i13 & 128) != 0 ? null : function1;
        Function1<? super C6200f.b.Success, Unit> function15 = (i13 & 256) != 0 ? null : function12;
        Function1<? super C6200f.b.Error, Unit> function16 = (i13 & 512) != 0 ? null : function13;
        P0.e eVarE = (i13 & 1024) != 0 ? P0.e.INSTANCE.e() : eVar;
        InterfaceC5784k interfaceC5784kE = (i13 & RecyclerView.m.FLAG_MOVED) != 0 ? InterfaceC5784k.INSTANCE.e() : interfaceC5784k;
        float f11 = (i13 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? 1.0f : f10;
        int i14 = i12 << 15;
        c(new i(obj, (i13 & 65536) != 0 ? q.a() : pVar, hVar), str, modifier2, F.q(cVar4, cVar5, cVar6), F.j(function14, function15, function16), eVarE, interfaceC5784kE, f11, (i13 & 8192) == 0 ? c5347r0 : null, (i13 & 16384) != 0 ? X0.f.INSTANCE.b() : i10, (32768 & i13) != 0 ? true : z10, composer, (i11 & 112) | ((i11 >> 3) & 896) | (458752 & i14) | (3670016 & i14) | (29360128 & i14) | (234881024 & i14) | (i14 & 1879048192), (i12 >> 15) & 14);
        composer.U();
    }

    public static final void e(Object obj, String str, Z4.h hVar, Modifier modifier, Function1<? super C6200f.b, ? extends C6200f.b> function1, Function1<? super C6200f.b, Unit> function12, P0.e eVar, InterfaceC5784k interfaceC5784k, float f10, C5347r0 c5347r0, int i10, boolean z10, p pVar, Composer composer, int i11, int i12, int i13) {
        composer.startReplaceableGroup(2032051394);
        int i14 = i11 >> 3;
        c(new i(obj, (i13 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? q.a() : pVar, hVar), str, (i13 & 8) != 0 ? Modifier.INSTANCE : modifier, (i13 & 16) != 0 ? C6200f.INSTANCE.a() : function1, (i13 & 32) != 0 ? null : function12, (i13 & 64) != 0 ? P0.e.INSTANCE.e() : eVar, (i13 & 128) != 0 ? InterfaceC5784k.INSTANCE.e() : interfaceC5784k, (i13 & 256) != 0 ? 1.0f : f10, (i13 & 512) != 0 ? null : c5347r0, (i13 & 1024) != 0 ? X0.f.INSTANCE.b() : i10, (i13 & RecyclerView.m.FLAG_MOVED) != 0 ? true : z10, composer, (i11 & 112) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | (3670016 & i14) | (29360128 & i14) | (i14 & 234881024) | ((i12 << 27) & 1879048192), (i12 >> 3) & 14);
        composer.U();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(i iVar, String str, Modifier modifier, Function1 function1, Function1 function12, P0.e eVar, InterfaceC5784k interfaceC5784k, float f10, C5347r0 c5347r0, int i10, boolean z10, int i11, int i12, Composer composer, int i13) {
        c(iVar, str, modifier, function1, function12, eVar, interfaceC5784k, f10, c5347r0, i10, z10, composer, J0.a(i11 | 1), J0.a(i12));
        return Unit.f142422a;
    }

    private static final void g(final Modifier modifier, final C6200f c6200f, final String str, final P0.e eVar, final InterfaceC5784k interfaceC5784k, final float f10, final C5347r0 c5347r0, final boolean z10, Composer composer, final int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(777774312);
        if ((i10 & 14) == 0) {
            i11 = (composerStartRestartGroup.V(modifier) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= composerStartRestartGroup.V(c6200f) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= composerStartRestartGroup.V(str) ? 256 : 128;
        }
        if ((i10 & 7168) == 0) {
            i11 |= composerStartRestartGroup.V(eVar) ? RecyclerView.m.FLAG_MOVED : 1024;
        }
        if ((57344 & i10) == 0) {
            i11 |= composerStartRestartGroup.V(interfaceC5784k) ? 16384 : 8192;
        }
        if ((458752 & i10) == 0) {
            i11 |= composerStartRestartGroup.b(f10) ? 131072 : 65536;
        }
        if ((3670016 & i10) == 0) {
            i11 |= composerStartRestartGroup.V(c5347r0) ? 1048576 : 524288;
        }
        if ((29360128 & i10) == 0) {
            i11 |= composerStartRestartGroup.a(z10) ? 8388608 : 4194304;
        }
        if ((i11 & 23967451) == 4793490 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            Modifier modifierF = F.f(modifier, str);
            if (z10) {
                modifierF = T0.e.b(modifierF);
            }
            Modifier modifierThen = modifierF.then(new ContentPainterElement(c6200f, eVar, interfaceC5784k, f10, c5347r0));
            b bVar = b.f59806a;
            composerStartRestartGroup.startReplaceableGroup(544976794);
            int iA = C5717f.a(composerStartRestartGroup, 0);
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, modifierThen);
            InterfaceC5742s interfaceC5742sR = composerStartRestartGroup.r();
            InterfaceC5811g.Companion companion = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion.a();
            composerStartRestartGroup.startReplaceableGroup(1405779621);
            if (composerStartRestartGroup.k() == null) {
                C5717f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.h()) {
                composerStartRestartGroup.I(new a(function0A));
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA = D1.a(composerStartRestartGroup);
            D1.c(composerA, bVar, companion.e());
            D1.c(composerA, interfaceC5742sR, companion.g());
            D1.c(composerA, modifierE, companion.f());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion.b();
            if (composerA.h() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            composerStartRestartGroup.v();
            composerStartRestartGroup.U();
            composerStartRestartGroup.U();
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: b5.b
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C6197c.h(modifier, c6200f, str, eVar, interfaceC5784k, f10, c5347r0, z10, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(Modifier modifier, C6200f c6200f, String str, P0.e eVar, InterfaceC5784k interfaceC5784k, float f10, C5347r0 c5347r0, boolean z10, int i10, Composer composer, int i11) {
        g(modifier, c6200f, str, eVar, interfaceC5784k, f10, c5347r0, z10, composer, J0.a(i10 | 1));
        return Unit.f142422a;
    }
}
