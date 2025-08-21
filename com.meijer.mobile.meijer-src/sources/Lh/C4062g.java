package Lh;

import Eh.AccountChip;
import Ki.LocalThemeScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import l0.InterfaceC15433c;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u001aI\u0010\f\u001a\u00020\n*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u0010²\u0006\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "", "LEh/c;", "chips", "Landroidx/compose/ui/Modifier;", "modifier", "", "isAccountOverviewRow", "Lkotlin/Function1;", "LGh/a;", "", "onNavigationRequest", "c", "(LKi/M;Ljava/util/List;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "lastAction", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: Lh.g, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4062g {

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Void;"}, k = 3, mv = {2, 1, 0})
    /* renamed from: Lh.g$a */
    public static final class a extends Lambda implements Function1 {

        /* renamed from: f, reason: collision with root package name */
        public static final a f18679f = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(AccountChip accountChip) {
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
    /* renamed from: Lh.g$b */
    public static final class b extends Lambda implements Function1<Integer, Object> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1 f18680f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ List f18681g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Function1 function1, List list) {
            super(1);
            this.f18680f = function1;
            this.f18681g = list;
        }

        public final Object a(int i10) {
            return this.f18680f.invoke(this.f18681g.get(i10));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Ll0/c;", "", "it", "", "a", "(Ll0/c;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {2, 1, 0})
    @SourceDebugExtension
    /* renamed from: Lh.g$c */
    public static final class c extends Lambda implements Function4<InterfaceC15433c, Integer, Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List f18682f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f18683g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f18684h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function1 f18685i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(List list, LocalThemeScope localThemeScope, boolean z10, Function1 function1) {
            super(4);
            this.f18682f = list;
            this.f18683g = localThemeScope;
            this.f18684h = z10;
            this.f18685i = function1;
        }

        public final void a(InterfaceC15433c interfaceC15433c, int i10, Composer composer, int i11) {
            int i12;
            if ((i11 & 6) == 0) {
                i12 = (composer.V(interfaceC15433c) ? 4 : 2) | i11;
            } else {
                i12 = i11;
            }
            if ((i11 & 48) == 0) {
                i12 |= composer.d(i10) ? 32 : 16;
            }
            if (!composer.p((i12 & 147) != 146, i12 & 1)) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-632812321, i12, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
            }
            AccountChip accountChip = (AccountChip) this.f18682f.get(i10);
            composer.startReplaceGroup(1802561105);
            C4056d.d(this.f18683g, accountChip, null, this.f18684h, this.f18685i, composer, LocalThemeScope.f17314g, 2);
            composer.P();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15433c interfaceC15433c, Integer num, Composer composer, Integer num2) {
            a(interfaceC15433c, num.intValue(), composer, num2.intValue());
            return Unit.f143329a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0161  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(final Ki.LocalThemeScope r20, final java.util.List<Eh.AccountChip> r21, androidx.compose.ui.Modifier r22, boolean r23, final kotlin.jvm.functions.Function1<? super Gh.a, kotlin.Unit> r24, androidx.compose.runtime.Composer r25, final int r26, final int r27) {
        /*
            Method dump skipped, instructions count: 375
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Lh.C4062g.c(Ki.M, java.util.List, androidx.compose.ui.Modifier, boolean, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(List list, LocalThemeScope localThemeScope, boolean z10, Function1 function1, l0.w LazyRow) {
        Intrinsics.j(LazyRow, "$this$LazyRow");
        LazyRow.i(list.size(), null, new b(a.f18679f, list), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new c(list, localThemeScope, z10, function1)));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(LocalThemeScope localThemeScope, List list, Modifier modifier, boolean z10, Function1 function1, int i10, int i11, Composer composer, int i12) {
        c(localThemeScope, list, modifier, z10, function1, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }
}
