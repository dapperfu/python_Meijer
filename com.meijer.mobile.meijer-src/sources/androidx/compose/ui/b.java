package androidx.compose.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.L0;
import androidx.compose.ui.platform.N0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.TypeIntrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aE\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0019\b\u0002\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00042\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u0001¢\u0006\u0002\b\u0004¢\u0006\u0004\b\u0007\u0010\b\u001a\u001b\u0010\u000b\u001a\u00020\u0000*\u00020\t2\u0006\u0010\n\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a\u001b\u0010\r\u001a\u00020\u0000*\u00020\t2\u0006\u0010\n\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\r\u0010\f\u001a\u001b\u0010\u000e\u001a\u00020\u0000*\u00020\t2\u0006\u0010\n\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/Modifier;", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/N0;", "", "Lkotlin/ExtensionFunctionType;", "inspectorInfo", "factory", "b", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/runtime/Composer;", "modifier", "e", "(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;", "d", "f", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class b {

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/Modifier$b;", "it", "", "invoke", "(Landroidx/compose/ui/Modifier$b;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    static final class a extends Lambda implements Function1<Modifier.b, Boolean> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f50755f = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Modifier.b bVar) {
            return Boolean.valueOf(!(bVar instanceof androidx.compose.ui.a));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/Modifier;", "acc", "Landroidx/compose/ui/Modifier$b;", "element", "a", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier$b;)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.ui.b$b, reason: collision with other inner class name */
    static final class C1058b extends Lambda implements Function2<Modifier, Modifier.b, Modifier> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Composer f50756f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1058b(Composer composer) {
            super(2);
            this.f50756f = composer;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Modifier invoke(Modifier modifier, Modifier.b bVar) {
            boolean z10 = bVar instanceof androidx.compose.ui.a;
            Modifier modifierD = bVar;
            if (z10) {
                Function3<Modifier, Composer, Integer, Modifier> function3B = ((androidx.compose.ui.a) bVar).b();
                Intrinsics.h(function3B, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function3<androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, kotlin.Int, androidx.compose.ui.Modifier>");
                modifierD = b.d(this.f50756f, (Modifier) ((Function3) TypeIntrinsics.f(function3B, 3)).invoke(Modifier.INSTANCE, this.f50756f, 0));
            }
            return modifier.then(modifierD);
        }
    }

    public static final Modifier b(Modifier modifier, Function1<? super N0, Unit> function1, Function3<? super Modifier, ? super Composer, ? super Integer, ? extends Modifier> function3) {
        return modifier.then(new androidx.compose.ui.a(function1, function3));
    }

    public static /* synthetic */ Modifier c(Modifier modifier, Function1 function1, Function3 function3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            function1 = L0.a();
        }
        return b(modifier, function1, function3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier d(Composer composer, Modifier modifier) {
        if (modifier.all(a.f50755f)) {
            return modifier;
        }
        composer.startReplaceableGroup(1219399079);
        Modifier modifier2 = (Modifier) modifier.foldIn(Modifier.INSTANCE, new C1058b(composer));
        composer.U();
        return modifier2;
    }

    public static final Modifier f(Composer composer, Modifier modifier) {
        return modifier == Modifier.INSTANCE ? modifier : e(composer, new CompositionLocalMapInjectionElement(composer.r()).then(modifier));
    }

    @JvmName
    public static final Modifier e(Composer composer, Modifier modifier) {
        composer.startReplaceGroup(439770924);
        Modifier modifierD = d(composer, modifier);
        composer.P();
        return modifierD;
    }
}
