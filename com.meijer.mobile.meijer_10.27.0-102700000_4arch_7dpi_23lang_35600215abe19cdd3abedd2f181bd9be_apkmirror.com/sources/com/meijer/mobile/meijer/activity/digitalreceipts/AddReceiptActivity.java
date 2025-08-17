package com.meijer.mobile.meijer.activity.digitalreceipts;

import Ji.C;
import Ji.LocalThemeScope;
import ak.AbstractC5607a;
import android.content.Intent;
import android.os.Bundle;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import com.fullstory.compose.FullStoryAnnotationsKt;
import com.meijer.mobile.meijer.activity.digitalreceipts.AddReceiptActivity;
import com.meijer.mobile.mperks.ux.j0;
import e.C13589e;
import g.AbstractC14147c;
import g.C14145a;
import g.InterfaceC14146b;
import gi.InterfaceC14261a;
import hi.AbstractC14482i;
import hi.C14476c;
import hi.TrackingData;
import j0.InterfaceC14794C;
import kotlin.C17921a1;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p1.C16193g;
import yr.C18299z;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u0014\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/meijer/mobile/meijer/activity/digitalreceipts/AddReceiptActivity;", "Lcom/meijer/mobile/mperks/ux/MperksFeatureActivity;", "<init>", "()V", "Lg/a;", "result", "", "z1", "(Lg/a;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Lgi/a;", "D", "Lgi/a;", "getAnalyticsEngine", "()Lgi/a;", "setAnalyticsEngine", "(Lgi/a;)V", "analyticsEngine", "Lg/c;", "Landroid/content/Intent;", "E", "Lg/c;", "fuelFormSubmitResultLauncher", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class AddReceiptActivity extends Hilt_AddReceiptActivity {

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    public InterfaceC14261a analyticsEngine;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private final AbstractC14147c<Intent> fuelFormSubmitResultLauncher = registerForActivityResult(new h.i(), new a());

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class a implements InterfaceC14146b, FunctionAdapter {
        a() {
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC14146b) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.e(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, AddReceiptActivity.this, AddReceiptActivity.class, "handleFuelFormSubmitResult", "handleFuelFormSubmitResult(Landroidx/activity/result/ActivityResult;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // g.InterfaceC14146b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void a(C14145a p02) {
            Intrinsics.j(p02, "p0");
            AddReceiptActivity.this.z1(p02);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements Function2<Composer, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f105448b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f105449c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ AddReceiptActivity f105450a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ boolean f105451b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f105452c;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.meijer.activity.digitalreceipts.AddReceiptActivity$b$a$a, reason: collision with other inner class name */
            static final class C1545a implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f105453a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ AddReceiptActivity f105454b;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.meijer.mobile.meijer.activity.digitalreceipts.AddReceiptActivity$b$a$a$a, reason: collision with other inner class name */
                static final class C1546a implements Function2<Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f105455a;

                    C1546a(LocalThemeScope localThemeScope) {
                        this.f105455a = localThemeScope;
                    }

                    public final void a(Composer composer, int i10) {
                        if ((i10 & 3) == 2 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(1772399581, i10, -1, "com.meijer.mobile.meijer.activity.digitalreceipts.AddReceiptActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AddReceiptActivity.kt:65)");
                        }
                        Dr.g.g(this.f105455a, C16193g.c(com.meijer.mobile.meijer.Y.f100267q, composer, 0), null, false, null, 0, null, 0, composer, LocalThemeScope.f15770g, 126);
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

                public final void b(Composer composer, int i10) {
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(2038601885, i10, -1, "com.meijer.mobile.meijer.activity.digitalreceipts.AddReceiptActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (AddReceiptActivity.kt:63)");
                    }
                    AbstractC5607a abstractC5607aD = AbstractC5607a.INSTANCE.d(j0.f114269w, new Object[0]);
                    C.f.d dVar = C.f.d.f15507e;
                    LocalThemeScope localThemeScope = this.f105453a;
                    ComposableLambda composableLambdaC = ComposableLambdaKt.c(1772399581, true, new C1546a(localThemeScope), composer, 54);
                    composer.startReplaceGroup(5004770);
                    boolean zD = composer.D(this.f105454b);
                    final AddReceiptActivity addReceiptActivity = this.f105454b;
                    Object objB = composer.B();
                    if (zD || objB == Composer.INSTANCE.a()) {
                        objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.digitalreceipts.a
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return AddReceiptActivity.b.a.C1545a.c(addReceiptActivity);
                            }
                        };
                        composer.t(objB);
                    }
                    composer.P();
                    Dr.g.f(localThemeScope, null, null, null, composableLambdaC, (Function0) objB, dVar, 0.0f, false, abstractC5607aD, composer, LocalThemeScope.f15770g | 24576 | (C.f.d.f15508f << 18) | (AbstractC5607a.f45514b << 27), 199);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                C1545a(LocalThemeScope localThemeScope, AddReceiptActivity addReceiptActivity) {
                    this.f105453a = localThemeScope;
                    this.f105454b = addReceiptActivity;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    b(composer, num.intValue());
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit c(AddReceiptActivity addReceiptActivity) {
                    addReceiptActivity.finish();
                    return Unit.f142422a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.meijer.activity.digitalreceipts.AddReceiptActivity$b$a$b, reason: collision with other inner class name */
            static final class C1547b implements Function3<InterfaceC14794C, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f105456a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ AddReceiptActivity f105457b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ boolean f105458c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ int f105459d;

                C1547b(LocalThemeScope localThemeScope, AddReceiptActivity addReceiptActivity, boolean z10, int i10) {
                    this.f105456a = localThemeScope;
                    this.f105457b = addReceiptActivity;
                    this.f105458c = z10;
                    this.f105459d = i10;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit g(TrackingData track) {
                    Intrinsics.j(track, "$this$track");
                    track.n("Add Receipt");
                    return Unit.f142422a;
                }

                public final void d(InterfaceC14794C it, Composer composer, int i10) {
                    Intrinsics.j(it, "it");
                    if ((i10 & 6) == 0) {
                        i10 |= composer.V(it) ? 4 : 2;
                    }
                    if ((i10 & 19) == 18 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(1650825348, i10, -1, "com.meijer.mobile.meijer.activity.digitalreceipts.AddReceiptActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (AddReceiptActivity.kt:74)");
                    }
                    LocalThemeScope localThemeScope = this.f105456a;
                    Modifier modifierH = androidx.compose.foundation.layout.D.h(Modifier.INSTANCE, it);
                    composer.startReplaceGroup(-1746271574);
                    boolean zD = composer.D(this.f105457b) | composer.a(this.f105458c) | composer.d(this.f105459d);
                    final AddReceiptActivity addReceiptActivity = this.f105457b;
                    final boolean z10 = this.f105458c;
                    final int i11 = this.f105459d;
                    Object objB = composer.B();
                    if (zD || objB == Composer.INSTANCE.a()) {
                        objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.digitalreceipts.b
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return AddReceiptActivity.b.a.C1547b.e(addReceiptActivity, z10, i11);
                            }
                        };
                        composer.t(objB);
                    }
                    Function0 function0 = (Function0) objB;
                    composer.P();
                    composer.startReplaceGroup(5004770);
                    boolean zD2 = composer.D(this.f105457b);
                    final AddReceiptActivity addReceiptActivity2 = this.f105457b;
                    Object objB2 = composer.B();
                    if (zD2 || objB2 == Composer.INSTANCE.a()) {
                        objB2 = new Function0() { // from class: com.meijer.mobile.meijer.activity.digitalreceipts.c
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return AddReceiptActivity.b.a.C1547b.f(addReceiptActivity2);
                            }
                        };
                        composer.t(objB2);
                    }
                    composer.P();
                    Qm.c.c(localThemeScope, modifierH, function0, (Function0) objB2, composer, LocalThemeScope.f15770g, 0);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14794C interfaceC14794C, Composer composer, Integer num) {
                    d(interfaceC14794C, composer, num.intValue());
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit e(AddReceiptActivity addReceiptActivity, boolean z10, int i10) {
                    addReceiptActivity.startActivity(Al.d.i(addReceiptActivity, z10, i10));
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit f(AddReceiptActivity addReceiptActivity) {
                    addReceiptActivity.fuelFormSubmitResultLauncher.a(Al.d.e(addReceiptActivity));
                    addReceiptActivity.getAnalyticsEngine().h(C14476c.a("Fuel Receipt Submission Initiated"), new Function1() { // from class: com.meijer.mobile.meijer.activity.digitalreceipts.d
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AddReceiptActivity.b.a.C1547b.g((TrackingData) obj);
                        }
                    });
                    return Unit.f142422a;
                }
            }

            a(AddReceiptActivity addReceiptActivity, boolean z10, int i10) {
                this.f105450a = addReceiptActivity;
                this.f105451b = z10;
                this.f105452c = i10;
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
                    ComposerKt.U(1911027458, i11, -1, "com.meijer.mobile.meijer.activity.digitalreceipts.AddReceiptActivity.onCreate.<anonymous>.<anonymous> (AddReceiptActivity.kt:58)");
                }
                C17921a1.a(C18299z.c(FullStoryAnnotationsKt.fsUnmask(Modifier.INSTANCE), false, 1, null), null, ComposableLambdaKt.c(2038601885, true, new C1545a(AdsTheme, this.f105450a), composer, 54), null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, AdsTheme.getAdsColors().getAdsColorUIBackground02().getColor(), 0L, ComposableLambdaKt.c(1650825348, true, new C1547b(AdsTheme, this.f105450a, this.f105451b, this.f105452c), composer, 54), composer, 384, 12582912, 98298);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
                a(localThemeScope, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        b(boolean z10, int i10) {
            this.f105448b = z10;
            this.f105449c = i10;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1876196209, i10, -1, "com.meijer.mobile.meijer.activity.digitalreceipts.AddReceiptActivity.onCreate.<anonymous> (AddReceiptActivity.kt:57)");
            }
            Ji.K.b(null, ComposableLambdaKt.c(1911027458, true, new a(AddReceiptActivity.this, this.f105448b, this.f105449c), composer, 54), composer, 48, 1);
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

    public final InterfaceC14261a getAnalyticsEngine() {
        InterfaceC14261a interfaceC14261a = this.analyticsEngine;
        if (interfaceC14261a != null) {
            return interfaceC14261a;
        }
        Intrinsics.y("analyticsEngine");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z1(C14145a result) {
        if (result.getResultCode() == 0) {
            finish();
        }
    }

    @Override // com.meijer.mobile.mperks.ux.Hilt_MperksFeatureActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        boolean booleanExtra = getIntent().getBooleanExtra("com.meijer.intent.extra.EXTRA_IS_FROM_MPERKS4", false);
        int intExtra = getIntent().getIntExtra("com.meijer.intent.extra.EXTRA_POINTS_BALANCE_MPERKS4", 0);
        getAnalyticsEngine().b(C14476c.h("Add Receipt"), new AbstractC14482i[0]);
        C13589e.b(this, null, ComposableLambdaKt.composableLambdaInstance(1876196209, true, new b(booleanExtra, intExtra)), 1, null);
    }
}
