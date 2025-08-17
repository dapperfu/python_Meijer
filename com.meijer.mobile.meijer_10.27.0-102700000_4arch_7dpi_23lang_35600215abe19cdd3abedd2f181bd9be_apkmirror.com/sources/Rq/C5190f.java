package Rq;

import Ji.LocalThemeScope;
import Nh.C4345j;
import Rq.C5190f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.ui.Modifier;
import com.fullstory.compose.FullStoryAnnotationsKt;
import j0.InterfaceC14814f;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.HttpUrl;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001at\u0010\u0012\u001a\u00020\u000b*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000e\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2#\u0010\u0011\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0007¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u000b0\rH\u0001¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"LJi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "", "fromCheckoutFlow", "Lokhttp3/HttpUrl;", "aurusUrl", "", "Lcom/meijer/mobile/authentication/core/AccessToken;", "accessToken", "Lkotlin/Function0;", "", "onCloseClicked", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "data", "onDataReturned", "b", "(LJi/M;Landroidx/compose/ui/Modifier;ZLokhttp3/HttpUrl;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: Rq.f, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C5190f {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Rq.f$a */
    static final class a implements Function3<InterfaceC14814f, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ HttpUrl f32781a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f32782b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f32783c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<String, Unit> f32784d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f32785e;

        /* JADX WARN: Multi-variable type inference failed */
        a(HttpUrl httpUrl, String str, boolean z10, Function1<? super String, Unit> function1, Function0<Unit> function0) {
            this.f32781a = httpUrl;
            this.f32782b = str;
            this.f32783c = z10;
            this.f32784d = function1;
            this.f32785e = function0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(boolean z10, Function1 function1, Function0 function0, String str) {
            if (z10) {
                function1.invoke(str);
            } else {
                function0.invoke();
            }
            return Unit.f142422a;
        }

        public final void b(InterfaceC14814f AdsColumn, Composer composer, int i10) {
            Intrinsics.j(AdsColumn, "$this$AdsColumn");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1966668987, i10, -1, "com.meijer.mobile.singlepagecheckout.payment.AddNewAurusCardBottomSheetContent.<anonymous> (AddNewAurusCardBottomSheetLayout.kt:39)");
            }
            if (this.f32781a != null && this.f32782b != null) {
                Modifier modifierFsMask = FullStoryAnnotationsKt.fsMask(T0.e.b(Modifier.INSTANCE));
                HttpUrl httpUrl = this.f32781a;
                String str = this.f32782b;
                composer.startReplaceGroup(-1746271574);
                boolean zA = composer.a(this.f32783c) | composer.V(this.f32784d) | composer.V(this.f32785e);
                final boolean z10 = this.f32783c;
                final Function1<String, Unit> function1 = this.f32784d;
                final Function0<Unit> function0 = this.f32785e;
                Object objB = composer.B();
                if (zA || objB == Composer.INSTANCE.a()) {
                    objB = new Function1() { // from class: Rq.e
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return C5190f.a.c(z10, function1, function0, (String) obj);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                C4345j.d(modifierFsMask, httpUrl, str, (Function1) objB, composer, 0, 0);
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14814f interfaceC14814f, Composer composer, Integer num) {
            b(interfaceC14814f, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0162  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final Ji.LocalThemeScope r22, androidx.compose.ui.Modifier r23, boolean r24, final okhttp3.HttpUrl r25, final java.lang.String r26, final kotlin.jvm.functions.Function0<kotlin.Unit> r27, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r28, androidx.compose.runtime.Composer r29, final int r30, final int r31) {
        /*
            Method dump skipped, instructions count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Rq.C5190f.b(Ji.M, androidx.compose.ui.Modifier, boolean, okhttp3.HttpUrl, java.lang.String, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(LocalThemeScope localThemeScope, Modifier modifier, boolean z10, HttpUrl httpUrl, String str, Function0 function0, Function1 function1, int i10, int i11, Composer composer, int i12) {
        b(localThemeScope, modifier, z10, httpUrl, str, function0, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }
}
