package com.adobe.marketing.mobile.assurance.internal.ui;

import H1.d;
import H1.t;
import P0.e;
import V0.C5349s0;
import android.os.Bundle;
import android.view.Window;
import androidx.compose.foundation.layout.C5662h;
import androidx.compose.foundation.layout.C5664j;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.V0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.A;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import androidx.compose.ui.platform.C5892t0;
import androidx.compose.ui.platform.Q1;
import androidx.view.ComponentActivity;
import com.adobe.marketing.mobile.assurance.internal.C6419a;
import com.adobe.marketing.mobile.assurance.internal.C6423e;
import e.C13589e;
import j0.T;
import j4.j;
import kotlin.AbstractC14653B;
import kotlin.C17879F0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.t1;
import u5.C17223b;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0014¨\u0006\u0007"}, d2 = {"Lcom/adobe/marketing/mobile/assurance/internal/ui/AssuranceActivity;", "Landroidx/activity/ComponentActivity;", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "assurance_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class AssuranceActivity extends ComponentActivity {

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 5, 1})
    static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C6419a.b f62294g;

        @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
        /* renamed from: com.adobe.marketing.mobile.assurance.internal.ui.AssuranceActivity$a$a, reason: collision with other inner class name */
        static final class C1234a extends Lambda implements Function2<Composer, Integer, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ AssuranceActivity f62295f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ C6419a.b f62296g;

            @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.adobe.marketing.mobile.assurance.internal.ui.AssuranceActivity$a$a$a, reason: collision with other inner class name */
            static final class C1235a extends Lambda implements Function2<Composer, Integer, Unit> {

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ AssuranceActivity f62297f;

                /* renamed from: g, reason: collision with root package name */
                final /* synthetic */ C6419a.b f62298g;

                @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
                /* renamed from: com.adobe.marketing.mobile.assurance.internal.ui.AssuranceActivity$a$a$a$a, reason: collision with other inner class name */
                static final class C1236a extends Lambda implements Function0<Unit> {

                    /* renamed from: f, reason: collision with root package name */
                    final /* synthetic */ AssuranceActivity f62299f;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C1236a(AssuranceActivity assuranceActivity) {
                        super(0);
                        this.f62299f = assuranceActivity;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.f142422a;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        AssuranceActivity assuranceActivity = this.f62299f;
                        Window window = assuranceActivity.getWindow();
                        E5.a aVar = E5.a.f7617a;
                        window.setStatusBarColor(C5349s0.j(aVar.a()));
                        assuranceActivity.getWindow().setNavigationBarColor(C5349s0.j(aVar.a()));
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1235a(AssuranceActivity assuranceActivity, C6419a.b bVar) {
                    super(2);
                    this.f62297f = assuranceActivity;
                    this.f62298g = bVar;
                }

                public final void a(Composer composer, int i10) {
                    if ((i10 & 11) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-1050647502, i10, -1, "com.adobe.marketing.mobile.assurance.internal.ui.AssuranceActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (AssuranceActivity.kt:46)");
                    }
                    Modifier modifierF = J.f(T.c(Modifier.INSTANCE), 0.0f, 1, null);
                    e eVarM = e.INSTANCE.m();
                    AssuranceActivity assuranceActivity = this.f62297f;
                    C6419a.b bVar = this.f62298g;
                    composer.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyI = C5662h.i(eVarM, false, composer, 6);
                    composer.startReplaceableGroup(-1323940314);
                    d dVar = (d) composer.o(C5892t0.g());
                    t tVar = (t) composer.o(C5892t0.m());
                    Q1 q12 = (Q1) composer.o(C5892t0.t());
                    InterfaceC5811g.Companion aVar = InterfaceC5811g.INSTANCE;
                    Function0<InterfaceC5811g> function0A = aVar.a();
                    Function3<V0<InterfaceC5811g>, Composer, Integer, Unit> function3C = A.c(modifierF);
                    if (composer.k() == null) {
                        C5717f.c();
                    }
                    composer.F();
                    if (composer.h()) {
                        composer.I(function0A);
                    } else {
                        composer.s();
                    }
                    composer.G();
                    Composer composerA = D1.a(composer);
                    D1.c(composerA, measurePolicyI, aVar.e());
                    D1.c(composerA, dVar, aVar.c());
                    D1.c(composerA, tVar, aVar.d());
                    D1.c(composerA, q12, aVar.h());
                    composer.c();
                    function3C.invoke(V0.a(V0.b(composer)), composer, 0);
                    composer.startReplaceableGroup(2058660585);
                    C5664j c5664j = C5664j.f48612a;
                    composer.startReplaceableGroup(1157296644);
                    boolean zV = composer.V(assuranceActivity);
                    Object objB = composer.B();
                    if (zV || objB == Composer.INSTANCE.a()) {
                        objB = new C1236a(assuranceActivity);
                        composer.t(objB);
                    }
                    composer.U();
                    androidx.compose.runtime.J.i((Function0) objB, composer, 0);
                    C17223b.a(j.e(new AbstractC14653B[0], composer, 8), bVar, composer, 8, 0);
                    composer.U();
                    composer.v();
                    composer.U();
                    composer.U();
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1234a(AssuranceActivity assuranceActivity, C6419a.b bVar) {
                super(2);
                this.f62295f = assuranceActivity;
                this.f62296g = bVar;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 11) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1329664786, i10, -1, "com.adobe.marketing.mobile.assurance.internal.ui.AssuranceActivity.onCreate.<anonymous>.<anonymous> (AssuranceActivity.kt:41)");
                }
                t1.a(J.f(Modifier.INSTANCE, 0.0f, 1, null), null, E5.a.f7617a.a(), 0L, null, 0.0f, ComposableLambdaKt.composableLambda(composer, -1050647502, true, new C1235a(this.f62295f, this.f62296g)), composer, 1573254, 58);
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C6419a.b bVar) {
            super(2);
            this.f62294g = bVar;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 11) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-760466150, i10, -1, "com.adobe.marketing.mobile.assurance.internal.ui.AssuranceActivity.onCreate.<anonymous> (AssuranceActivity.kt:39)");
            }
            C17879F0.a(null, null, null, ComposableLambdaKt.composableLambda(composer, -1329664786, true, new C1234a(AssuranceActivity.this, this.f62294g)), composer, 3072, 7);
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

    @Override // androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        C13589e.b(this, null, ComposableLambdaKt.composableLambdaInstance(-760466150, true, new a(C6423e.appState.b().getValue())), 1, null);
    }
}
