package j4;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.google.android.libraries.places.api.model.PlaceTypes;
import j4.d;
import j4.e;
import java.util.Iterator;
import java.util.List;
import kotlin.C14660d;
import kotlin.C14664h;
import kotlin.C14669m;
import kotlin.C14674r;
import kotlin.C14675s;
import kotlin.Deprecated;
import kotlin.InterfaceC6163b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aO\u0010\f\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0007¢\u0006\u0004\b\f\u0010\r\u001a\u0080\u0002\u0010\u0019\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032(\b\u0002\u0010\u0012\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010\b¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u00112(\b\u0002\u0010\u0014\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0018\u00010\b¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u00112(\b\u0002\u0010\u0015\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010\b¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u00112(\b\u0002\u0010\u0016\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0018\u00010\b¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u00112\u001d\u0010\u000b\u001a\u0019\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0017¢\u0006\u0002\b\u0011¢\u0006\u0004\b\u0019\u0010\u001a\u001aî\u0001\u0010\u001d\u001a\u00020\n*\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032#\b\u0002\u0010\u0012\u001a\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010\b¢\u0006\u0002\b\u00112#\b\u0002\u0010\u0014\u001a\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0018\u00010\b¢\u0006\u0002\b\u00112#\b\u0002\u0010\u0015\u001a\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010\b¢\u0006\u0002\b\u00112#\b\u0002\u0010\u0016\u001a\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0018\u00010\b¢\u0006\u0002\b\u00112\u0017\u0010\u001c\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u0011¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Li4/s;", "", PlaceTypes.ROUTE, "", "Li4/d;", "arguments", "Li4/m;", "deepLinks", "Lkotlin/Function1;", "Li4/h;", "", "content", "b", "(Li4/s;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function3;)V", "Landroidx/compose/animation/d;", "Landroidx/compose/animation/h;", "Lkotlin/jvm/JvmSuppressWildcards;", "Lkotlin/ExtensionFunctionType;", "enterTransition", "Landroidx/compose/animation/j;", "exitTransition", "popEnterTransition", "popExitTransition", "Lkotlin/Function2;", "Lb0/b;", "a", "(Li4/s;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "startDestination", "builder", "e", "(Li4/s;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "navigation-compose_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class i {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u000b\u0010\u0003\u001a\u00070\u0001¢\u0006\u0002\b\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lb0/b;", "Li4/h;", "Lkotlin/jvm/JvmSuppressWildcards;", "entry", "", "a", "(Lb0/b;Li4/h;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends Lambda implements Function4<InterfaceC6163b, C14664h, Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function3<C14664h, Composer, Integer, Unit> f139307f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Function3<? super C14664h, ? super Composer, ? super Integer, Unit> function3) {
            super(4);
            this.f139307f = function3;
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC6163b interfaceC6163b, C14664h c14664h, Composer composer, Integer num) {
            a(interfaceC6163b, c14664h, composer, num.intValue());
            return Unit.f142422a;
        }

        public final void a(InterfaceC6163b interfaceC6163b, C14664h c14664h, Composer composer, int i10) {
            if (ComposerKt.M()) {
                ComposerKt.U(484185514, i10, -1, "androidx.navigation.compose.composable.<anonymous> (NavGraphBuilder.kt:52)");
            }
            this.f139307f.invoke(c14664h, composer, 8);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
    }

    public static final void a(C14675s c14675s, String str, List<C14660d> list, List<C14669m> list2, Function1<androidx.compose.animation.d<C14664h>, androidx.compose.animation.h> function1, Function1<androidx.compose.animation.d<C14664h>, androidx.compose.animation.j> function12, Function1<androidx.compose.animation.d<C14664h>, androidx.compose.animation.h> function13, Function1<androidx.compose.animation.d<C14664h>, androidx.compose.animation.j> function14, Function4<? super InterfaceC6163b, ? super C14664h, ? super Composer, ? super Integer, Unit> function4) {
        e.b bVar = new e.b((e) c14675s.getProvider().d(e.class), function4);
        bVar.F(str);
        for (C14660d c14660d : list) {
            bVar.f(c14660d.getName(), c14660d.getArgument());
        }
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            bVar.h((C14669m) it.next());
        }
        bVar.N(function1);
        bVar.P(function12);
        bVar.Q(function13);
        bVar.R(function14);
        c14675s.c(bVar);
    }

    @Deprecated
    public static final /* synthetic */ void b(C14675s c14675s, String str, List list, List list2, Function3 function3) {
        e.b bVar = new e.b((e) c14675s.getProvider().d(e.class), ComposableLambdaKt.composableLambdaInstance(484185514, true, new a(function3)));
        bVar.F(str);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C14660d c14660d = (C14660d) it.next();
            bVar.f(c14660d.getName(), c14660d.getArgument());
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            bVar.h((C14669m) it2.next());
        }
        c14675s.c(bVar);
    }

    public static /* synthetic */ void c(C14675s c14675s, String str, List list, List list2, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function4 function4, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            list = CollectionsKt.m();
        }
        List list3 = list;
        if ((i10 & 4) != 0) {
            list2 = CollectionsKt.m();
        }
        List list4 = list2;
        Function1 function15 = (i10 & 8) != 0 ? null : function1;
        Function1 function16 = (i10 & 16) != 0 ? null : function12;
        a(c14675s, str, list3, list4, function15, function16, (i10 & 32) != 0 ? function15 : function13, (i10 & 64) != 0 ? function16 : function14, function4);
    }

    public static /* synthetic */ void d(C14675s c14675s, String str, List list, List list2, Function3 function3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            list = CollectionsKt.m();
        }
        if ((i10 & 4) != 0) {
            list2 = CollectionsKt.m();
        }
        b(c14675s, str, list, list2, function3);
    }

    public static final void e(C14675s c14675s, String str, String str2, List<C14660d> list, List<C14669m> list2, Function1<? super androidx.compose.animation.d<C14664h>, ? extends androidx.compose.animation.h> function1, Function1<? super androidx.compose.animation.d<C14664h>, ? extends androidx.compose.animation.j> function12, Function1<? super androidx.compose.animation.d<C14664h>, ? extends androidx.compose.animation.h> function13, Function1<? super androidx.compose.animation.d<C14664h>, ? extends androidx.compose.animation.j> function14, Function1<? super C14675s, Unit> function15) {
        C14675s c14675s2 = new C14675s(c14675s.getProvider(), str, str2);
        function15.invoke(c14675s2);
        C14674r c14674rD = c14675s2.a();
        for (C14660d c14660d : list) {
            c14674rD.f(c14660d.getName(), c14660d.getArgument());
        }
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            c14674rD.h((C14669m) it.next());
        }
        if (c14674rD instanceof d.a) {
            d.a aVar = (d.a) c14674rD;
            aVar.c0(function1);
            aVar.d0(function12);
            aVar.e0(function13);
            aVar.f0(function14);
        }
        c14675s.c(c14674rD);
    }

    public static /* synthetic */ void f(C14675s c14675s, String str, String str2, List list, List list2, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function1 function15, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            list = CollectionsKt.m();
        }
        List list3 = list;
        List listM = (i10 & 8) != 0 ? CollectionsKt.m() : list2;
        Function1 function16 = (i10 & 16) != 0 ? null : function1;
        Function1 function17 = (i10 & 32) != 0 ? null : function12;
        e(c14675s, str, str2, list3, listM, function16, function17, (i10 & 64) != 0 ? function16 : function13, (i10 & 128) != 0 ? function17 : function14, function15);
    }
}
