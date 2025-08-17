package Qm;

import Bj.o;
import Ji.C;
import Ji.LocalThemeScope;
import Rm.p;
import ak.AbstractC5607a;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.pdf.PdfRenderer;
import android.os.ParcelFileDescriptor;
import android.view.Display;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageView;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import ck.C6408b;
import com.meijer.mobile.meijer.S;
import com.meijer.mobile.meijer.Y;
import com.meijer.mobile.widget.ZoomableImageView;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;
import d0.C13457y;
import j0.C14802K;
import j0.InterfaceC14794C;
import java.io.File;
import ji.q1;
import kotlin.C17917Z;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p1.C16190d;
import p1.C16193g;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\u001aZ\u0010\u000e\u001a\u00020\n*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032!\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\fH\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001aL\u0010\u0010\u001a\u00020\n*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032!\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0005H\u0003¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001b\u0010\u0014\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0012H\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001a#\u0010\u0016\u001a\u00020\n2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0016\u0010\u0017\u001aF\u0010\u0018\u001a\u00020\n2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0002\u001a\u00020\u00012!\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0005H\u0003¢\u0006\u0004\b\u0018\u0010\u0019\u001a!\u0010\u001a\u001a\u00020\n*\u00020\u00002\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\fH\u0003¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u001f\u0010\u001c\u001a\u00020\n*\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0003¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006 ²\u0006\u000e\u0010\u001f\u001a\u00020\u001e8\n@\nX\u008a\u008e\u0002"}, d2 = {"LJi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "LRm/p$c;", "viewState", "Lkotlin/Function1;", "LRm/p$b;", "Lkotlin/ParameterName;", "name", "action", "", "onError", "Lkotlin/Function0;", "onBackPressed", "x", "(LJi/M;Landroidx/compose/ui/Modifier;LRm/p$c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "v", "(LJi/M;Landroidx/compose/ui/Modifier;LRm/p$c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lak/a;", "errorMessage", "l", "(LJi/M;Lak/a;Landroidx/compose/runtime/Composer;I)V", "n", "(LRm/p$c;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "q", "(LRm/p$c;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "j", "(LJi/M;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "t", "(LJi/M;LRm/p$c;Landroidx/compose/runtime/Composer;II)V", "", "lastAction", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class m {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f30886a;

        a(LocalThemeScope localThemeScope) {
            this.f30886a = localThemeScope;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-444668483, i10, -1, "com.meijer.mobile.meijer.activity.digitalreceipts.screens.AppBar.<anonymous> (ReceiptDetailScreen.kt:207)");
            }
            Dr.g.g(this.f30886a, C16193g.c(Y.f99885Wc, composer, 0), null, false, null, 0, null, 0, composer, LocalThemeScope.f15770g, 126);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f30887a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f30888b;

        b(LocalThemeScope localThemeScope, Function0<Unit> function0) {
            this.f30887a = localThemeScope;
            this.f30888b = function0;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-791780959, i10, -1, "com.meijer.mobile.meijer.activity.digitalreceipts.screens.ReceiptDetailScreen.<anonymous> (ReceiptDetailScreen.kt:71)");
            }
            m.j(this.f30887a, this.f30888b, composer, LocalThemeScope.f15770g);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c implements Function3<InterfaceC14794C, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f30889a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ p.ViewState f30890b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<p.b, Unit> f30891c;

        /* JADX WARN: Multi-variable type inference failed */
        c(LocalThemeScope localThemeScope, p.ViewState cVar, Function1<? super p.b, Unit> function1) {
            this.f30889a = localThemeScope;
            this.f30890b = cVar;
            this.f30891c = function1;
        }

        public final void a(InterfaceC14794C paddingValues, Composer composer, int i10) {
            Intrinsics.j(paddingValues, "paddingValues");
            if ((i10 & 6) == 0) {
                i10 |= composer.V(paddingValues) ? 4 : 2;
            }
            if ((i10 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-995982822, i10, -1, "com.meijer.mobile.meijer.activity.digitalreceipts.screens.ReceiptDetailScreen.<anonymous> (ReceiptDetailScreen.kt:73)");
            }
            m.v(this.f30889a, D.h(Modifier.INSTANCE, paddingValues), this.f30890b, this.f30891c, composer, LocalThemeScope.f15770g, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14794C interfaceC14794C, Composer composer, Integer num) {
            a(interfaceC14794C, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(final LocalThemeScope localThemeScope, final Function0<Unit> function0, Composer composer, final int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(949031165);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.D(function0) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(949031165, i11, -1, "com.meijer.mobile.meijer.activity.digitalreceipts.screens.AppBar (ReceiptDetailScreen.kt:204)");
            }
            Dr.g.f(localThemeScope, null, null, null, ComposableLambdaKt.c(-444668483, true, new a(localThemeScope), composerStartRestartGroup, 54), function0, C.f.d.f15507e, 0.0f, false, AbstractC5607a.INSTANCE.d(o.f3035p, new Object[0]), composerStartRestartGroup, ((i11 << 12) & 458752) | LocalThemeScope.f15770g | 24576 | (i11 & 14) | (C.f.d.f15508f << 18) | (AbstractC5607a.f45514b << 27), 199);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Qm.e
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return m.k(localThemeScope, function0, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(LocalThemeScope localThemeScope, Function0 function0, int i10, Composer composer, int i11) {
        j(localThemeScope, function0, composer, J0.a(i10 | 1));
        return Unit.f142422a;
    }

    private static final void l(LocalThemeScope localThemeScope, final AbstractC5607a abstractC5607a, Composer composer, final int i10) {
        int i11;
        final LocalThemeScope localThemeScope2 = localThemeScope;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1800963448);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope2) : composerStartRestartGroup.D(localThemeScope2) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= (i10 & 64) == 0 ? composerStartRestartGroup.V(abstractC5607a) : composerStartRestartGroup.D(abstractC5607a) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-1800963448, i11, -1, "com.meijer.mobile.meijer.activity.digitalreceipts.screens.DisplayErrorScreen (ReceiptDetailScreen.kt:111)");
            }
            Z0.c cVarC = C16190d.c(S.f98730j0, composerStartRestartGroup, 0);
            Modifier.Companion companion = Modifier.INSTANCE;
            C13457y.a(cVarC, null, J.i(companion, H1.h.p(280)), null, null, 0.0f, null, composerStartRestartGroup, 432, BinsView.TOTE_HEIGHT_DP);
            float f10 = 20;
            C14802K.a(J.i(companion, H1.h.p(f10)), composerStartRestartGroup, 6);
            q1.Label label = new q1.Label(null, null, null, null, 0, false, 0, localThemeScope2.getAdsTypography().getHeadings().getFive(), null, 383, null);
            String strC = C16193g.c(Y.f99601Hd, composerStartRestartGroup, 0);
            int i12 = LocalThemeScope.f15770g;
            int i13 = i11 & 14;
            int i14 = q1.Label.f140080j;
            ri.j.h(localThemeScope2, label, strC, null, composerStartRestartGroup, i12 | i13 | (i14 << 3), 4);
            float f11 = 40;
            C17917Z.a(D.l(companion, H1.h.p(f11), H1.h.p(24), H1.h.p(f11), H1.h.p(f10)), 0L, 0.0f, 0.0f, composerStartRestartGroup, 0, 14);
            localThemeScope2 = localThemeScope;
            ri.j.h(localThemeScope2, new q1.Label(D.k(companion, H1.h.p(28), 0.0f, 2, null), null, null, F1.j.h(F1.j.INSTANCE.a()), 0, false, 0, localThemeScope.getAdsTypography().getBody().getTwo(), null, 374, null), C6408b.a(abstractC5607a, composerStartRestartGroup, AbstractC5607a.f45514b | ((i11 >> 3) & 14)), null, composerStartRestartGroup, i12 | i13 | (i14 << 3), 4);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Qm.i
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return m.m(localThemeScope2, abstractC5607a, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(LocalThemeScope localThemeScope, AbstractC5607a abstractC5607a, int i10, Composer composer, int i11) {
        l(localThemeScope, abstractC5607a, composer, J0.a(i10 | 1));
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    @android.annotation.SuppressLint({"SetJavaScriptEnabled", "ComposableStringLiteral"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void n(final Rm.p.ViewState r16, androidx.compose.ui.Modifier r17, androidx.compose.runtime.Composer r18, final int r19, final int r20) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Qm.m.n(Rm.p$c, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(WebView it) {
        Intrinsics.j(it, "it");
        WebSettings settings = it.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setAllowFileAccess(false);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p(p.ViewState cVar, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        n(cVar, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ZoomableImageView r(File file, Function1 function1, Context context) {
        Intrinsics.j(context, "context");
        ZoomableImageView zoomableImageView = new ZoomableImageView(context);
        zoomableImageView.setFocusable(true);
        zoomableImageView.setScaleType(ImageView.ScaleType.CENTER);
        try {
            Object systemService = context.getSystemService("window");
            Intrinsics.h(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getSize(point);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(point.x, point.y, Bitmap.Config.ARGB_8888);
            new PdfRenderer(ParcelFileDescriptor.open(file, 268435456)).openPage(0).render(bitmapCreateBitmap, null, null, 1);
            zoomableImageView.setImageBitmap(bitmapCreateBitmap);
            return zoomableImageView;
        } catch (Exception e10) {
            uw.a.INSTANCE.e(e10);
            function1.invoke(p.b.C0728b.f32536b);
            return zoomableImageView;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s(p.ViewState cVar, Modifier modifier, Function1 function1, int i10, int i11, Composer composer, int i12) {
        q(cVar, modifier, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void t(final Ji.LocalThemeScope r32, Rm.p.ViewState r33, androidx.compose.runtime.Composer r34, final int r35, final int r36) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Qm.m.t(Ji.M, Rm.p$c, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u(LocalThemeScope localThemeScope, p.ViewState cVar, int i10, int i11, Composer composer, int i12) {
        t(localThemeScope, cVar, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void v(final Ji.LocalThemeScope r17, androidx.compose.ui.Modifier r18, Rm.p.ViewState r19, final kotlin.jvm.functions.Function1<? super Rm.p.b, kotlin.Unit> r20, androidx.compose.runtime.Composer r21, final int r22, final int r23) {
        /*
            Method dump skipped, instructions count: 421
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Qm.m.v(Ji.M, androidx.compose.ui.Modifier, Rm.p$c, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit w(LocalThemeScope localThemeScope, Modifier modifier, p.ViewState cVar, Function1 function1, int i10, int i11, Composer composer, int i12) {
        v(localThemeScope, modifier, cVar, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void x(final Ji.LocalThemeScope r34, androidx.compose.ui.Modifier r35, Rm.p.ViewState r36, final kotlin.jvm.functions.Function1<? super Rm.p.b, kotlin.Unit> r37, final kotlin.jvm.functions.Function0<kotlin.Unit> r38, androidx.compose.runtime.Composer r39, final int r40, final int r41) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Qm.m.x(Ji.M, androidx.compose.ui.Modifier, Rm.p$c, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit y(LocalThemeScope localThemeScope, Modifier modifier, p.ViewState cVar, Function1 function1, Function0 function0, int i10, int i11, Composer composer, int i12) {
        x(localThemeScope, modifier, cVar, function1, function0, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    private static final void q(final p.ViewState cVar, Modifier modifier, final Function1<? super p.b, Unit> function1, Composer composer, final int i10, final int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        final File fileE;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1502036632);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            if (composerStartRestartGroup.D(cVar)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i10;
        } else {
            i12 = i10;
        }
        int i16 = i11 & 2;
        if (i16 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            if (composerStartRestartGroup.V(modifier)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            if (composerStartRestartGroup.D(function1)) {
                i15 = 256;
            } else {
                i15 = 128;
            }
            i12 |= i15;
        }
        if ((i12 & 147) == 146 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (i16 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1502036632, i12, -1, "com.meijer.mobile.meijer.activity.digitalreceipts.screens.DisplayNextGenReceipt (ReceiptDetailScreen.kt:169)");
            }
            if (cVar != null) {
                fileE = cVar.getPdfFile();
            } else {
                fileE = null;
            }
            if (fileE != null) {
                boolean z10 = true;
                Modifier modifierF = J.f(modifier, 0.0f, 1, null);
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                boolean zD = composerStartRestartGroup.D(fileE);
                if ((i12 & 896) != 256) {
                    z10 = false;
                }
                boolean z11 = zD | z10;
                Object objB = composerStartRestartGroup.B();
                if (z11 || objB == Composer.INSTANCE.a()) {
                    objB = new Function1() { // from class: Qm.k
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return m.r(fileE, function1, (Context) obj);
                        }
                    };
                    composerStartRestartGroup.t(objB);
                }
                composerStartRestartGroup.P();
                androidx.compose.ui.viewinterop.e.a((Function1) objB, modifierF, null, composerStartRestartGroup, 0, 4);
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        final Modifier modifier2 = modifier;
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Qm.l
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return m.s(cVar, modifier2, function1, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
