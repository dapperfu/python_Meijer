package in;

import Ki.LocalThemeScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.ui.Modifier;
import j0.InterfaceC14888I;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u001aS\u0010\r\u001a\u00020\b*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0011²\u0006\u000e\u0010\u000f\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\f\u001a\u00020\u000b8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0010\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "", "toolbarTitle", "", "isCloseNavigateButton", "Lkotlin/Function0;", "", "onBackPressed", "onCartPressed", "", "cartCount", "b", "(LKi/M;Landroidx/compose/ui/Modifier;Ljava/lang/String;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ILandroidx/compose/runtime/Composer;II)V", "isCloseNavigation", "lastAction", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: in.g, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C14814g {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: in.g$a */
    static final class a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f138576a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f138577b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f138578c;

        a(LocalThemeScope localThemeScope, int i10, Function0<Unit> function0) {
            this.f138576a = localThemeScope;
            this.f138577b = i10;
            this.f138578c = function0;
        }

        public final void a(InterfaceC14888I AdsTopBar, Composer composer, int i10) {
            Intrinsics.j(AdsTopBar, "$this$AdsTopBar");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1358834492, i10, -1, "com.meijer.mobile.meijer.activity.orders.decorators.compose.OrderDetailsAppBar.<anonymous> (OrderDetailsAppBar.kt:54)");
            }
            Dr.s.k(this.f138576a, Integer.valueOf(this.f138577b), null, this.f138578c, composer, LocalThemeScope.f17314g, 2);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14888I interfaceC14888I, Composer composer, Integer num) {
            a(interfaceC14888I, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: in.g$b */
    static final class b implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f138579a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f138580b;

        b(LocalThemeScope localThemeScope, String str) {
            this.f138579a = localThemeScope;
            this.f138580b = str;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-2008001514, i10, -1, "com.meijer.mobile.meijer.activity.orders.decorators.compose.OrderDetailsAppBar.<anonymous> (OrderDetailsAppBar.kt:41)");
            }
            Dr.g.g(this.f138579a, this.f138580b, null, false, null, 0, null, 0, composer, LocalThemeScope.f17314g, 126);
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

    /* JADX WARN: Removed duplicated region for block: B:101:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final Ki.LocalThemeScope r18, androidx.compose.ui.Modifier r19, final java.lang.String r20, boolean r21, final kotlin.jvm.functions.Function0<kotlin.Unit> r22, final kotlin.jvm.functions.Function0<kotlin.Unit> r23, final int r24, androidx.compose.runtime.Composer r25, final int r26, final int r27) {
        /*
            Method dump skipped, instructions count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: in.C14814g.b(Ki.M, androidx.compose.ui.Modifier, java.lang.String, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, int, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(LocalThemeScope localThemeScope, Modifier modifier, String str, boolean z10, Function0 function0, Function0 function02, int i10, int i11, int i12, Composer composer, int i13) {
        b(localThemeScope, modifier, str, z10, function0, function02, i10, composer, J0.a(i11 | 1), i12);
        return Unit.f143329a;
    }
}
