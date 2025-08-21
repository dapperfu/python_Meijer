package com.meijer.mobile.meijer.activity.find;

import Ki.C;
import Ki.LocalThemeScope;
import V2.CreationExtras;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.o1;
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import androidx.view.ComponentActivity;
import androidx.view.f0;
import bk.AbstractC6392a;
import com.fullstory.compose.FullStoryAnnotationsKt;
import com.meijer.mobile.meijer.activity.find.ImageDetailActivity;
import com.meijer.mobile.meijer.activity.find.viewmodel.C12398n;
import com.meijer.mobile.meijer.activity.find.viewmodel.ProductImageViewModel;
import e.C13736d;
import e.C13737e;
import hi.InterfaceC14523a;
import ii.C14756c;
import ii.TrackingData;
import j0.InterfaceC14882C;
import java.util.ArrayList;
import java.util.List;
import kotlin.C17987a1;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import p1.C16338g;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u0014\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001b\u0010\u001a\u001a\u00020\u00158FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001f²\u0006\f\u0010\u001e\u001a\u00020\u001d8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/ImageDetailActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "", "currentItem", "n1", "(I)V", "Lhi/a;", "v", "Lhi/a;", "getAnalyticsEngine", "()Lhi/a;", "setAnalyticsEngine", "(Lhi/a;)V", "analyticsEngine", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/n;", "w", "Lkotlin/Lazy;", "o1", "()Lcom/meijer/mobile/meijer/activity/find/viewmodel/n;", "viewModel", "x", "a", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/n$b;", "viewState", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class ImageDetailActivity extends Hilt_ImageDetailActivity {

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: y, reason: collision with root package name */
    public static final int f107331y = 8;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    public InterfaceC14523a analyticsEngine;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final Lazy viewModel = new androidx.view.e0(Reflection.b(C12398n.class), new d(this), new c(this), new e(null, this));

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/ImageDetailActivity$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/l1;", "images", "", "position", "", "loadGrayScaleImage", "Landroid/content/Intent;", "a", "(Landroid/content/Context;Ljava/util/List;IZ)Landroid/content/Intent;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.find.ImageDetailActivity$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Intent a(Context context, List<ProductImageViewModel> images, int position, boolean loadGrayScaleImage) {
            Intrinsics.j(context, "context");
            Intrinsics.j(images, "images");
            Intent intentPutExtra = new Intent(context, (Class<?>) ImageDetailActivity.class).putParcelableArrayListExtra("com.meijer.intent.extra.IMAGES_LIST", new ArrayList<>(images)).putExtra("com.meijer.intent.extra.IMAGE_POSITION", position).putExtra("com.meijer.intent.extra.GRAY_SCALE_IMAGE", loadGrayScaleImage);
            Intrinsics.i(intentPutExtra, "putExtra(...)");
            return intentPutExtra;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class b implements Function2<Composer, Integer, Unit> {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ ImageDetailActivity f107335a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ z1<C12398n.ViewState> f107336b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.meijer.activity.find.ImageDetailActivity$b$a$a, reason: collision with other inner class name */
            static final class C1605a implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f107337a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ ImageDetailActivity f107338b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ z1<C12398n.ViewState> f107339c;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.meijer.mobile.meijer.activity.find.ImageDetailActivity$b$a$a$a, reason: collision with other inner class name */
                static final class C1606a implements Function2<Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f107340a;

                    C1606a(LocalThemeScope localThemeScope) {
                        this.f107340a = localThemeScope;
                    }

                    public final void a(Composer composer, int i10) {
                        if ((i10 & 3) == 2 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(-2138315227, i10, -1, "com.meijer.mobile.meijer.activity.find.ImageDetailActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ImageDetailActivity.kt:77)");
                        }
                        Dr.g.g(this.f107340a, C16338g.c(com.meijer.mobile.meijer.Y.f100576Nc, composer, 0), null, false, null, 0, null, 0, composer, LocalThemeScope.f17314g, 126);
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

                public final void b(Composer composer, int i10) {
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-861101723, i10, -1, "com.meijer.mobile.meijer.activity.find.ImageDetailActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (ImageDetailActivity.kt:76)");
                    }
                    LocalThemeScope localThemeScope = this.f107337a;
                    ComposableLambda composableLambdaC = ComposableLambdaKt.c(-2138315227, true, new C1606a(localThemeScope), composer, 54);
                    composer.startReplaceGroup(-1633490746);
                    boolean zD = composer.D(this.f107338b) | composer.V(this.f107339c);
                    final ImageDetailActivity imageDetailActivity = this.f107338b;
                    final z1<C12398n.ViewState> z1Var = this.f107339c;
                    Object objB = composer.B();
                    if (zD || objB == Composer.INSTANCE.a()) {
                        objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.find.g0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ImageDetailActivity.b.a.C1605a.c(imageDetailActivity, z1Var);
                            }
                        };
                        composer.t(objB);
                    }
                    composer.P();
                    Dr.g.f(localThemeScope, null, null, null, composableLambdaC, (Function0) objB, C.f.d.f17051e, 0.0f, false, AbstractC6392a.INSTANCE.d(Cj.o.f5080p, new Object[0]), composer, LocalThemeScope.f17314g | 24576 | (C.f.d.f17052f << 18) | (AbstractC6392a.f60445b << 27), 199);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                C1605a(LocalThemeScope localThemeScope, ImageDetailActivity imageDetailActivity, z1<C12398n.ViewState> z1Var) {
                    this.f107337a = localThemeScope;
                    this.f107338b = imageDetailActivity;
                    this.f107339c = z1Var;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    b(composer, num.intValue());
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit c(ImageDetailActivity imageDetailActivity, z1 z1Var) {
                    imageDetailActivity.n1(b.d(z1Var).getCurrentIndex());
                    return Unit.f143329a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.meijer.activity.find.ImageDetailActivity$b$a$b, reason: collision with other inner class name */
            static final class C1607b implements Function3<InterfaceC14882C, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f107341a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ ImageDetailActivity f107342b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ z1<C12398n.ViewState> f107343c;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.meijer.mobile.meijer.activity.find.ImageDetailActivity$b$a$b$a, reason: collision with other inner class name */
                /* synthetic */ class C1608a extends FunctionReferenceImpl implements Function1<C12398n.a, Unit> {
                    C1608a(Object obj) {
                        super(1, obj, C12398n.class, "onAction", "onAction(Lcom/meijer/mobile/meijer/activity/find/viewmodel/ImageDetailViewModel$Action;)V", 0);
                    }

                    public final void a(C12398n.a p02) {
                        Intrinsics.j(p02, "p0");
                        ((C12398n) this.receiver).o(p02);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(C12398n.a aVar) {
                        a(aVar);
                        return Unit.f143329a;
                    }
                }

                C1607b(LocalThemeScope localThemeScope, ImageDetailActivity imageDetailActivity, z1<C12398n.ViewState> z1Var) {
                    this.f107341a = localThemeScope;
                    this.f107342b = imageDetailActivity;
                    this.f107343c = z1Var;
                }

                public final void a(InterfaceC14882C contentPadding, Composer composer, int i10) {
                    Intrinsics.j(contentPadding, "contentPadding");
                    if ((i10 & 6) == 0) {
                        i10 |= composer.V(contentPadding) ? 4 : 2;
                    }
                    if ((i10 & 19) == 18 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-201731682, i10, -1, "com.meijer.mobile.meijer.activity.find.ImageDetailActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (ImageDetailActivity.kt:84)");
                    }
                    LocalThemeScope localThemeScope = this.f107341a;
                    Modifier modifierF = androidx.compose.foundation.layout.J.f(androidx.compose.foundation.layout.D.h(Modifier.INSTANCE, contentPadding), 0.0f, 1, null);
                    C12398n.ViewState viewStateD = b.d(this.f107343c);
                    C12398n c12398nO1 = this.f107342b.o1();
                    composer.startReplaceGroup(5004770);
                    boolean zD = composer.D(c12398nO1);
                    Object objB = composer.B();
                    if (zD || objB == Composer.INSTANCE.a()) {
                        objB = new C1608a(c12398nO1);
                        composer.t(objB);
                    }
                    composer.P();
                    C12221l0.c(localThemeScope, modifierF, viewStateD, (Function1) ((KFunction) objB), composer, LocalThemeScope.f17314g, 0);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14882C interfaceC14882C, Composer composer, Integer num) {
                    a(interfaceC14882C, composer, num.intValue());
                    return Unit.f143329a;
                }
            }

            a(ImageDetailActivity imageDetailActivity, z1<C12398n.ViewState> z1Var) {
                this.f107335a = imageDetailActivity;
                this.f107336b = z1Var;
            }

            public final void a(LocalThemeScope AdsTheme, Composer composer, int i10) {
                int i11;
                Intrinsics.j(AdsTheme, "$this$AdsTheme");
                if ((i10 & 6) == 0) {
                    i11 = i10 | ((i10 & 8) == 0 ? composer.V(AdsTheme) : composer.D(AdsTheme) ? 4 : 2);
                } else {
                    i11 = i10;
                }
                if ((i11 & 19) == 18 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1784574624, i11, -1, "com.meijer.mobile.meijer.activity.find.ImageDetailActivity.onCreate.<anonymous>.<anonymous> (ImageDetailActivity.kt:74)");
                }
                C17987a1.a(FullStoryAnnotationsKt.fsUnmask(Modifier.INSTANCE), null, ComposableLambdaKt.c(-861101723, true, new C1605a(AdsTheme, this.f107335a, this.f107336b), composer, 54), null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ComposableLambdaKt.c(-201731682, true, new C1607b(AdsTheme, this.f107335a, this.f107336b), composer, 54), composer, 384, 12582912, 131066);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
                a(localThemeScope, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        b() {
        }

        public final void c(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1991016465, i10, -1, "com.meijer.mobile.meijer.activity.find.ImageDetailActivity.onCreate.<anonymous> (ImageDetailActivity.kt:72)");
            }
            final z1 z1VarB = o1.b(ImageDetailActivity.this.o1().m(), null, composer, 0, 1);
            Ki.K.b(null, ComposableLambdaKt.c(-1784574624, true, new a(ImageDetailActivity.this, z1VarB), composer, 54), composer, 48, 1);
            composer.startReplaceGroup(-1633490746);
            boolean zD = composer.D(ImageDetailActivity.this) | composer.V(z1VarB);
            final ImageDetailActivity imageDetailActivity = ImageDetailActivity.this;
            Object objB = composer.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.find.f0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ImageDetailActivity.b.e(imageDetailActivity, z1VarB);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            C13736d.a(false, (Function0) objB, composer, 0, 1);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            c(composer, num.intValue());
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C12398n.ViewState d(z1<C12398n.ViewState> z1Var) {
            return z1Var.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit e(ImageDetailActivity imageDetailActivity, z1 z1Var) {
            imageDetailActivity.n1(d(z1Var).getCurrentIndex());
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class c extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f107344f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ComponentActivity componentActivity) {
            super(0);
            this.f107344f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f107344f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class d extends Lambda implements Function0<androidx.view.g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f107345f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentActivity componentActivity) {
            super(0);
            this.f107345f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.view.g0 invoke() {
            return this.f107345f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class e extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f107346f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f107347g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f107346f = function0;
            this.f107347g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f107346f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f107347g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p1(TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.v("product view");
        track.h("siteparentcategory", "product view");
        track.h("hier1", "products view: carousel image");
        return Unit.f143329a;
    }

    public final InterfaceC14523a getAnalyticsEngine() {
        InterfaceC14523a interfaceC14523a = this.analyticsEngine;
        if (interfaceC14523a != null) {
            return interfaceC14523a;
        }
        Intrinsics.x("analyticsEngine");
        return null;
    }

    public final C12398n o1() {
        return (C12398n) this.viewModel.getValue();
    }

    public final void n1(int currentItem) {
        if (getIntent().getIntExtra("com.meijer.intent.extra.IMAGE_POSITION", 0) != currentItem) {
            finish();
        } else {
            finishAfterTransition();
        }
    }

    @Override // com.meijer.mobile.meijer.activity.find.Hilt_ImageDetailActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        List<ProductImageViewModel> parcelableArrayListExtra;
        super.onCreate(savedInstanceState);
        int intExtra = getIntent().getIntExtra("com.meijer.intent.extra.IMAGE_POSITION", 0);
        boolean booleanExtra = getIntent().getBooleanExtra("com.meijer.intent.extra.GRAY_SCALE_IMAGE", false);
        Intent intent = getIntent();
        Intrinsics.i(intent, "getIntent(...)");
        if (Build.VERSION.SDK_INT >= 33) {
            parcelableArrayListExtra = intent.getParcelableArrayListExtra("com.meijer.intent.extra.IMAGES_LIST", ProductImageViewModel.class);
        } else {
            parcelableArrayListExtra = intent.getParcelableArrayListExtra("com.meijer.intent.extra.IMAGES_LIST");
        }
        if (parcelableArrayListExtra == null) {
            parcelableArrayListExtra = CollectionsKt.m();
        }
        o1().n(parcelableArrayListExtra, intExtra, booleanExtra);
        C13737e.b(this, null, ComposableLambdaKt.composableLambdaInstance(1991016465, true, new b()), 1, null);
        getAnalyticsEngine().b(C14756c.h("products view: carousel image"), new Function1() { // from class: com.meijer.mobile.meijer.activity.find.e0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ImageDetailActivity.p1((TrackingData) obj);
            }
        });
    }
}
