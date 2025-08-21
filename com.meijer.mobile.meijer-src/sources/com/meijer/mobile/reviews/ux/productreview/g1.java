package com.meijer.mobile.reviews.ux.productreview;

import Ki.C;
import Ki.LocalThemeScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5866i0;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.layout.InterfaceC5926k;
import com.fullstory.compose.FullStoryAnnotationsKt;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;
import g1.InterfaceC14300c;
import j0.InterfaceC14888I;
import java.util.ArrayList;
import ki.q1;
import kotlin.AbstractC16037C;
import kotlin.C13931t;
import kotlin.InterfaceC16060u;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.C15809k;
import mv.InterfaceC15783O;
import qi.C16671b;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aK\u0010\f\u001a\u00020\n*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0007¢\u0006\u0004\b\f\u0010\r\u001a_\u0010\u0019\u001a\u00020\n2\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00152\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u0017H\u0003¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001c²\u0006\f\u0010\u001b\u001a\u00020\u00038\nX\u008a\u0084\u0002"}, d2 = {"LKi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "", "imagePosition", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "imagesURLs", "Lkotlin/Function0;", "", "onActionClose", "j", "(LKi/M;Landroidx/compose/ui/Modifier;ILjava/util/ArrayList;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "url", "contentDescription", "", "maxScale", "minScale", "Landroidx/compose/ui/layout/k;", "contentScale", "", "isZoomable", "Landroidx/compose/runtime/l0;", "isScrollable", "q", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;FFLandroidx/compose/ui/layout/k;ZLandroidx/compose/runtime/l0;Landroidx/compose/runtime/Composer;II)V", "imageSize", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class g1 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function3<ki.j1, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f116731a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f116732b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.reviews.ux.productreview.g1$a$a, reason: collision with other inner class name */
        static final class C1866a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f116733a;

            C1866a(LocalThemeScope localThemeScope) {
                this.f116733a = localThemeScope;
            }

            public final void a(InterfaceC14888I AdsButton, Composer composer, int i10) {
                Intrinsics.j(AdsButton, "$this$AdsButton");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-586534770, i10, -1, "com.meijer.mobile.reviews.ux.productreview.ImageGalleryScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ReviewGalleryActivity.kt:128)");
                }
                C16671b.b(this.f116733a, new q1.h.DrawableIcon(C.f.o.f17066e, null, null, null, 0.0f, null, null, 126, null), null, null, composer, LocalThemeScope.f17314g | (q1.h.DrawableIcon.f142322h << 3), 6);
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

        a(LocalThemeScope localThemeScope, Function0<Unit> function0) {
            this.f116731a = localThemeScope;
            this.f116732b = function0;
        }

        public final void a(ki.j1 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(1148889697, i10, -1, "com.meijer.mobile.reviews.ux.productreview.ImageGalleryScreen.<anonymous>.<anonymous>.<anonymous> (ReviewGalleryActivity.kt:124)");
            }
            oi.E0.b(this.f116731a, Assemble.getButtons().getEnabledButton(), this.f116732b, ComposableLambdaKt.c(-586534770, true, new C1866a(this.f116731a), composer, 54), composer, LocalThemeScope.f17314g | 3072 | (q1.d.StandardButton.f142229k << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(ki.j1 j1Var, Composer composer, Integer num) {
            a(j1Var, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements Function4<InterfaceC16060u, Integer, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList<String> f116734a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<Boolean> f116735b;

        b(ArrayList<String> arrayList, InterfaceC5872l0<Boolean> interfaceC5872l0) {
            this.f116734a = arrayList;
            this.f116735b = interfaceC5872l0;
        }

        public final void a(InterfaceC16060u HorizontalPager, int i10, Composer composer, int i11) {
            Intrinsics.j(HorizontalPager, "$this$HorizontalPager");
            if (ComposerKt.M()) {
                ComposerKt.U(1500469402, i11, -1, "com.meijer.mobile.reviews.ux.productreview.ImageGalleryScreen.<anonymous>.<anonymous> (ReviewGalleryActivity.kt:146)");
            }
            Modifier modifierFsExclude = FullStoryAnnotationsKt.fsExclude(Modifier.INSTANCE);
            String str = this.f116734a.get(i10);
            Intrinsics.i(str, "get(...)");
            g1.q(modifierFsExclude, str, "", 0.0f, 0.0f, null, false, this.f116735b, composer, 12583296, BinsView.TOTE_HEIGHT_DP);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC16060u interfaceC16060u, Integer num, Composer composer, Integer num2) {
            a(interfaceC16060u, num.intValue(), composer, num2.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.reviews.ux.productreview.ReviewGalleryActivityKt$ImageGalleryScreen$1$3$1$1$1", f = "ReviewGalleryActivity.kt", l = {176}, m = "invokeSuspend")
    static final class c extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f116736a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC16037C f116737b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f116738c;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new c(this.f116737b, this.f116738c, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(AbstractC16037C abstractC16037C, int i10, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f116737b = abstractC16037C;
            this.f116738c = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((c) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f116736a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                AbstractC16037C abstractC16037C = this.f116737b;
                int i11 = this.f116738c;
                this.f116736a = 1;
                if (AbstractC16037C.n(abstractC16037C, i11, 0.0f, null, this, 6, null) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class d implements PointerInputEventHandler {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f116739a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC5866i0 f116740b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<Boolean> f116741c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC5866i0 f116742d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC5866i0 f116743e;

        d(boolean z10, InterfaceC5866i0 interfaceC5866i0, InterfaceC5872l0<Boolean> interfaceC5872l0, InterfaceC5866i0 interfaceC5866i02, InterfaceC5866i0 interfaceC5866i03) {
            this.f116739a = z10;
            this.f116740b = interfaceC5866i0;
            this.f116741c = interfaceC5872l0;
            this.f116742d = interfaceC5866i02;
            this.f116743e = interfaceC5866i03;
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lg1/c;", "", "<anonymous>", "(Lg1/c;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.reviews.ux.productreview.ReviewGalleryActivityKt$ZoomableImage$4$1$1", f = "ReviewGalleryActivity.kt", l = {237, 239}, m = "invokeSuspend")
        @SourceDebugExtension
        static final class a extends RestrictedSuspendLambda implements Function2<InterfaceC14300c, Continuation<? super Unit>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f116744b;

            /* renamed from: c, reason: collision with root package name */
            private /* synthetic */ Object f116745c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC5866i0 f116746d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0<Boolean> f116747e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ InterfaceC5866i0 f116748f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ InterfaceC5866i0 f116749g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(InterfaceC5866i0 interfaceC5866i0, InterfaceC5872l0<Boolean> interfaceC5872l0, InterfaceC5866i0 interfaceC5866i02, InterfaceC5866i0 interfaceC5866i03, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f116746d = interfaceC5866i0;
                this.f116747e = interfaceC5872l0;
                this.f116748f = interfaceC5866i02;
                this.f116749g = interfaceC5866i03;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f116746d, this.f116747e, this.f116748f, this.f116749g, continuation);
                aVar.f116745c = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC14300c interfaceC14300c, Continuation<? super Unit> continuation) {
                return ((a) create(interfaceC14300c, continuation)).invokeSuspend(Unit.f143329a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:15:0x004a, code lost:
            
                if (r12 == r0) goto L16;
             */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004a -> B:17:0x004d). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r12) {
                /*
                    Method dump skipped, instructions count: 231
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.reviews.ux.productreview.g1.d.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(g1.J j10, Continuation<? super Unit> continuation) {
            if (!this.f116739a) {
                return Unit.f143329a;
            }
            Object objD = C13931t.d(j10, new a(this.f116740b, this.f116741c, this.f116742d, this.f116743e, null), continuation);
            return objD == IntrinsicsKt.f() ? objD : Unit.f143329a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x046a  */
    /* JADX WARN: Removed duplicated region for block: B:146:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0202  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void j(final Ki.LocalThemeScope r36, androidx.compose.ui.Modifier r37, final int r38, final java.util.ArrayList<java.lang.String> r39, final kotlin.jvm.functions.Function0<kotlin.Unit> r40, androidx.compose.runtime.Composer r41, final int r42, final int r43) {
        /*
            Method dump skipped, instructions count: 1147
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.reviews.ux.productreview.g1.j(Ki.M, androidx.compose.ui.Modifier, int, java.util.ArrayList, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u(Modifier modifier, String str, String str2, float f10, float f11, InterfaceC5926k interfaceC5926k, boolean z10, InterfaceC5872l0 interfaceC5872l0, int i10, int i11, Composer composer, int i12) {
        q(modifier, str, str2, f10, f11, interfaceC5926k, z10, interfaceC5872l0, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(r1.u semantics) {
        Intrinsics.j(semantics, "$this$semantics");
        r1.s.g0(semantics, "");
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(InterfaceC15783O interfaceC15783O, AbstractC16037C abstractC16037C, int i10) {
        C15809k.d(interfaceC15783O, null, null, new c(abstractC16037C, i10, null), 3, null);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(LocalThemeScope localThemeScope, Modifier modifier, int i10, ArrayList arrayList, Function0 function0, int i11, int i12, Composer composer, int i13) {
        j(localThemeScope, modifier, i10, arrayList, function0, composer, androidx.compose.runtime.J0.a(i11 | 1), i12);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:178:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x011f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void q(androidx.compose.ui.Modifier r40, final java.lang.String r41, final java.lang.String r42, float r43, float r44, androidx.compose.ui.layout.InterfaceC5926k r45, boolean r46, final androidx.compose.runtime.InterfaceC5872l0<java.lang.Boolean> r47, androidx.compose.runtime.Composer r48, final int r49, final int r50) {
        /*
            Method dump skipped, instructions count: 975
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.reviews.ux.productreview.g1.q(androidx.compose.ui.Modifier, java.lang.String, java.lang.String, float, float, androidx.compose.ui.layout.k, boolean, androidx.compose.runtime.l0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s() {
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(boolean z10, float f10, float f11, InterfaceC5866i0 interfaceC5866i0, InterfaceC5866i0 interfaceC5866i02, InterfaceC5866i0 interfaceC5866i03, androidx.compose.ui.graphics.e graphicsLayer) {
        Intrinsics.j(graphicsLayer, "$this$graphicsLayer");
        if (z10) {
            graphicsLayer.h(Math.max(f10, Math.min(f11, interfaceC5866i0.b())));
            graphicsLayer.m(Math.max(f10, Math.min(f11, interfaceC5866i0.b())));
            graphicsLayer.n(interfaceC5866i02.b());
            graphicsLayer.e(interfaceC5866i03.b());
        }
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int k(ArrayList arrayList) {
        return arrayList.size();
    }

    private static final int o(z1<Integer> z1Var) {
        return z1Var.getValue().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int p(z1 z1Var) {
        return o(z1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r(InterfaceC5866i0 interfaceC5866i0, InterfaceC5866i0 interfaceC5866i02, InterfaceC5866i0 interfaceC5866i03) {
        if (interfaceC5866i0.b() > 1.0f) {
            interfaceC5866i0.A(1.0f);
            interfaceC5866i02.A(1.0f);
            interfaceC5866i03.A(1.0f);
        } else {
            interfaceC5866i0.A(3.0f);
        }
        return Unit.f143329a;
    }
}
