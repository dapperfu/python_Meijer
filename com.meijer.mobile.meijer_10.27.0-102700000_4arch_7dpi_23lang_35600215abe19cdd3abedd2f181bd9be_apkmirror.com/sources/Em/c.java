package Em;

import Am.C2893i;
import Em.c;
import Ji.LocalThemeScope;
import Nh.C4345j;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.ui.Modifier;
import com.fullstory.compose.FullStoryAnnotationsKt;
import com.meijer.mobile.meijer.Y;
import j0.InterfaceC14814f;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.HttpUrl;
import p1.C16193g;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0088\u0001\u0010\u0014\u001a\u00020\r*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u000e\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2#\u0010\u0013\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\t¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\r0\u000fH\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001a'\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"LJi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "", "fromCheckoutFlow", "fromOrderReview", "hasCardsOnFile", "Lokhttp3/HttpUrl;", "aurusUrl", "", "Lcom/meijer/mobile/authentication/core/AccessToken;", "accessToken", "Lkotlin/Function0;", "", "onCloseClicked", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "data", "onDataReturned", "b", "(LJi/M;Landroidx/compose/ui/Modifier;ZZZLokhttp3/HttpUrl;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "e", "(ZZZ)I", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class c {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function3<InterfaceC14814f, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f9233a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f9234b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f9235c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f9236d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f9237e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ HttpUrl f9238f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f9239g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function1<String, Unit> f9240h;

        /* JADX WARN: Multi-variable type inference failed */
        a(LocalThemeScope localThemeScope, boolean z10, boolean z11, boolean z12, Function0<Unit> function0, HttpUrl httpUrl, String str, Function1<? super String, Unit> function1) {
            this.f9233a = localThemeScope;
            this.f9234b = z10;
            this.f9235c = z11;
            this.f9236d = z12;
            this.f9237e = function0;
            this.f9238f = httpUrl;
            this.f9239g = str;
            this.f9240h = function1;
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
                ComposerKt.U(492788530, i10, -1, "com.meijer.mobile.meijer.activity.checkout.payment.compose.AddNewAurusCardBottomSheetContent.<anonymous> (AddNewAurusCardBottomSheetContent.kt:44)");
            }
            C2893i.c(this.f9233a, null, C16193g.c(c.e(this.f9234b, this.f9235c, this.f9236d), composer, 0), this.f9237e, composer, LocalThemeScope.f15770g, 1);
            if (this.f9238f != null && this.f9239g != null) {
                Modifier modifierFsMask = FullStoryAnnotationsKt.fsMask(T0.e.b(Modifier.INSTANCE));
                HttpUrl httpUrl = this.f9238f;
                String str = this.f9239g;
                composer.startReplaceGroup(-1746271574);
                boolean zA = composer.a(this.f9234b) | composer.V(this.f9240h) | composer.V(this.f9237e);
                final boolean z10 = this.f9234b;
                final Function1<String, Unit> function1 = this.f9240h;
                final Function0<Unit> function0 = this.f9237e;
                Object objB = composer.B();
                if (zA || objB == Composer.INSTANCE.a()) {
                    objB = new Function1() { // from class: Em.b
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return c.a.c(z10, function1, function0, (String) obj);
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

    /* JADX WARN: Removed duplicated region for block: B:103:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(Ji.LocalThemeScope r20, androidx.compose.ui.Modifier r21, boolean r22, boolean r23, boolean r24, final okhttp3.HttpUrl r25, final java.lang.String r26, final kotlin.jvm.functions.Function0<kotlin.Unit> r27, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r28, androidx.compose.runtime.Composer r29, final int r30, final int r31) {
        /*
            Method dump skipped, instructions count: 467
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Em.c.b(Ji.M, androidx.compose.ui.Modifier, boolean, boolean, boolean, okhttp3.HttpUrl, java.lang.String, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(LocalThemeScope localThemeScope, Modifier modifier, boolean z10, boolean z11, boolean z12, HttpUrl httpUrl, String str, Function0 function0, Function1 function1, int i10, int i11, Composer composer, int i12) {
        b(localThemeScope, modifier, z10, z11, z12, httpUrl, str, function0, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int e(boolean z10, boolean z11, boolean z12) {
        return !z10 ? Y.f100069g0 : z11 ? Y.f99485Bb : z12 ? Y.f99719Nh : Y.f100069g0;
    }
}
