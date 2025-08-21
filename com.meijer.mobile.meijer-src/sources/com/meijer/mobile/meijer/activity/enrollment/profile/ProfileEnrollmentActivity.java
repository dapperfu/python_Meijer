package com.meijer.mobile.meijer.activity.enrollment.profile;

import Ik.Validation;
import Ik.c;
import Ki.K;
import Ki.LocalThemeScope;
import Nn.M;
import V2.CreationExtras;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.view.C6173t;
import androidx.view.ComponentActivity;
import androidx.view.e0;
import androidx.view.f0;
import androidx.view.g0;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.textfield.TextInputEditText;
import com.meijer.mobile.core.design.widget.checkoutprogressstepperview.ProgressIndicatorView;
import com.meijer.mobile.core.design.widget.enhancedtextinputlayoutview.EnhancedTextInputLayoutView;
import com.meijer.mobile.meijer.P;
import com.meijer.mobile.meijer.Y;
import com.meijer.mobile.meijer.activity.enrollment.PhoneEnrollmentActivity;
import com.meijer.mobile.meijer.activity.enrollment.profile.ProfileEnrollmentActivity;
import com.meijer.mobile.meijer.activity.enrollment.profile.q;
import e.C13737e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import ki.q1;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference0Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty0;
import le.C15485b;
import pv.C16563h;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0005H\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0004J\u0017\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\u0004J\u0017\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001b\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001d\u0010\u001aJ\u0017\u0010\u001e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0003¢\u0006\u0004\b\u001e\u0010\fJ\u0017\u0010\u001f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0003¢\u0006\u0004\b\u001f\u0010\fJ\u0017\u0010 \u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0003¢\u0006\u0004\b \u0010\fJ\u0017\u0010!\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0003¢\u0006\u0004\b!\u0010\fJ\u0017\u0010\"\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0003¢\u0006\u0004\b\"\u0010\fJ\u0019\u0010%\u001a\u00020\u00062\b\u0010$\u001a\u0004\u0018\u00010#H\u0014¢\u0006\u0004\b%\u0010&R\u0016\u0010*\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u001b\u00100\u001a\u00020+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0016\u00104\u001a\u0002018\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00108\u001a\u0002058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u00107¨\u00069"}, d2 = {"Lcom/meijer/mobile/meijer/activity/enrollment/profile/ProfileEnrollmentActivity;", "Lcom/meijer/mobile/meijer/activity/MeijerActivity;", "LBj/b;", "<init>", "()V", "LKi/M;", "", "L1", "(LKi/M;Landroidx/compose/runtime/Composer;I)V", "Lcom/meijer/mobile/meijer/activity/enrollment/profile/v;", "viewState", "q2", "(Lcom/meijer/mobile/meijer/activity/enrollment/profile/v;)V", "Lcom/meijer/mobile/meijer/activity/enrollment/profile/q$c;", "profileInfoField", "c2", "(Lcom/meijer/mobile/meijer/activity/enrollment/profile/q$c;)V", "b2", "Lcom/meijer/mobile/core/design/widget/enhancedtextinputlayoutview/EnhancedTextInputLayoutView;", "enhancedTextInputLayoutView", "u2", "(Lcom/meijer/mobile/core/design/widget/enhancedtextinputlayoutview/EnhancedTextInputLayoutView;)V", "v2", "", "email", "j2", "(Ljava/lang/String;)V", "r2", "error", "h2", "l2", "m2", "i2", "n2", "k2", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "", "s", "Z", "attemptedSubmit", "Lcom/meijer/mobile/meijer/activity/enrollment/profile/q;", "t", "Lkotlin/Lazy;", "a2", "()Lcom/meijer/mobile/meijer/activity/enrollment/profile/q;", "viewModel", "LNn/M;", "u", "LNn/M;", "binding", "Landroidx/appcompat/widget/Toolbar;", "y", "()Landroidx/appcompat/widget/Toolbar;", "toolbar", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class ProfileEnrollmentActivity extends Hilt_ProfileEnrollmentActivity implements Bj.b {

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private boolean attemptedSubmit;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final Lazy viewModel = new e0(Reflection.b(q.class), new k(this), new j(this), new l(null, this));

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private M binding;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[q.c.values().length];
            try {
                iArr[q.c.f106990a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[q.c.f106991b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[q.c.f106992c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[q.c.f106993d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements Function2<Composer, Integer, Unit> {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ ProfileEnrollmentActivity f106914a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.meijer.activity.enrollment.profile.ProfileEnrollmentActivity$b$a$a, reason: collision with other inner class name */
            static final class C1589a implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ ProfileEnrollmentActivity f106915a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f106916b;

                C1589a(ProfileEnrollmentActivity profileEnrollmentActivity, LocalThemeScope localThemeScope) {
                    this.f106915a = profileEnrollmentActivity;
                    this.f106916b = localThemeScope;
                }

                public final void a(Composer composer, int i10) {
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(872141098, i10, -1, "com.meijer.mobile.meijer.activity.enrollment.profile.ProfileEnrollmentActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ProfileEnrollmentActivity.kt:88)");
                    }
                    this.f106915a.L1(this.f106916b, composer, LocalThemeScope.f17314g);
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

            a(ProfileEnrollmentActivity profileEnrollmentActivity) {
                this.f106914a = profileEnrollmentActivity;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final M d(ProfileEnrollmentActivity profileEnrollmentActivity, LocalThemeScope localThemeScope, LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
                Intrinsics.j(layoutInflater, "<unused var>");
                Intrinsics.j(viewGroup, "<unused var>");
                M m10 = profileEnrollmentActivity.binding;
                if (m10 == null) {
                    Intrinsics.x("binding");
                    m10 = null;
                }
                m10.f21536P.setContent(ComposableLambdaKt.composableLambdaInstance(872141098, true, new C1589a(profileEnrollmentActivity, localThemeScope)));
                M m11 = profileEnrollmentActivity.binding;
                if (m11 != null) {
                    return m11;
                }
                Intrinsics.x("binding");
                return null;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit e(M AndroidViewBinding) {
                Intrinsics.j(AndroidViewBinding, "$this$AndroidViewBinding");
                return Unit.f143329a;
            }

            public final void c(final LocalThemeScope AdsTheme, Composer composer, int i10) {
                Intrinsics.j(AdsTheme, "$this$AdsTheme");
                if ((i10 & 6) == 0) {
                    i10 |= (i10 & 8) == 0 ? composer.V(AdsTheme) : composer.D(AdsTheme) ? 4 : 2;
                }
                if ((i10 & 19) == 18 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-398084892, i10, -1, "com.meijer.mobile.meijer.activity.enrollment.profile.ProfileEnrollmentActivity.onCreate.<anonymous>.<anonymous> (ProfileEnrollmentActivity.kt:82)");
                }
                composer.startReplaceGroup(-1633490746);
                boolean zD = ((i10 & 14) == 4 || ((i10 & 8) != 0 && composer.D(AdsTheme))) | composer.D(this.f106914a);
                final ProfileEnrollmentActivity profileEnrollmentActivity = this.f106914a;
                Object objB = composer.B();
                if (zD || objB == Composer.INSTANCE.a()) {
                    objB = new Function3() { // from class: com.meijer.mobile.meijer.activity.enrollment.profile.l
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            return ProfileEnrollmentActivity.b.a.d(profileEnrollmentActivity, AdsTheme, (LayoutInflater) obj, (ViewGroup) obj2, ((Boolean) obj3).booleanValue());
                        }
                    };
                    composer.t(objB);
                }
                Function3 function3 = (Function3) objB;
                composer.P();
                composer.startReplaceGroup(1849434622);
                Object objB2 = composer.B();
                if (objB2 == Composer.INSTANCE.a()) {
                    objB2 = new Function1() { // from class: com.meijer.mobile.meijer.activity.enrollment.profile.m
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ProfileEnrollmentActivity.b.a.e((M) obj);
                        }
                    };
                    composer.t(objB2);
                }
                composer.P();
                androidx.compose.ui.viewinterop.a.a(function3, null, (Function1) objB2, composer, 384, 2);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
                c(localThemeScope, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        b() {
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1941093461, i10, -1, "com.meijer.mobile.meijer.activity.enrollment.profile.ProfileEnrollmentActivity.onCreate.<anonymous> (ProfileEnrollmentActivity.kt:81)");
            }
            K.b(null, ComposableLambdaKt.c(-398084892, true, new a(ProfileEnrollmentActivity.this), composer, 54), composer, 48, 1);
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

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class j extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f106920f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(ComponentActivity componentActivity) {
            super(0);
            this.f106920f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f106920f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class k extends Lambda implements Function0<g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f106921f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(ComponentActivity componentActivity) {
            super(0);
            this.f106921f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final g0 invoke() {
            return this.f106921f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class l extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f106922f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f106923g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f106922f = function0;
            this.f106923g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f106922f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f106923g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J1\u0010\r\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJ1\u0010\u0010\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u000e¨\u0006\u0011"}, d2 = {"androidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1", "Landroid/text/TextWatcher;", "Landroid/text/Editable;", "s", "", "afterTextChanged", "(Landroid/text/Editable;)V", "", "text", "", "start", "count", "after", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", "before", "onTextChanged", "core-ktx_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class m implements TextWatcher {
        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence text, int start, int count, int after) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence text, int start, int before, int count) {
        }

        public m() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable s10) {
            String string;
            if (ProfileEnrollmentActivity.this.attemptedSubmit) {
                M m10 = ProfileEnrollmentActivity.this.binding;
                if (m10 == null) {
                    Intrinsics.x("binding");
                    m10 = null;
                }
                m10.f21527G.setError((CharSequence) null);
            }
            if (s10 == null || (string = s10.toString()) == null) {
                return;
            }
            ProfileEnrollmentActivity.this.a2().D(new q.a.SetFirstName(string));
            if (ProfileEnrollmentActivity.this.attemptedSubmit) {
                ProfileEnrollmentActivity.this.a2().D(q.a.p.f106973a);
            }
        }
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J1\u0010\r\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJ1\u0010\u0010\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u000e¨\u0006\u0011"}, d2 = {"androidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1", "Landroid/text/TextWatcher;", "Landroid/text/Editable;", "s", "", "afterTextChanged", "(Landroid/text/Editable;)V", "", "text", "", "start", "count", "after", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", "before", "onTextChanged", "core-ktx_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class n implements TextWatcher {
        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence text, int start, int count, int after) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence text, int start, int before, int count) {
        }

        public n() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable s10) {
            String string;
            if (ProfileEnrollmentActivity.this.attemptedSubmit) {
                M m10 = ProfileEnrollmentActivity.this.binding;
                if (m10 == null) {
                    Intrinsics.x("binding");
                    m10 = null;
                }
                m10.f21529I.setError((CharSequence) null);
            }
            if (s10 == null || (string = s10.toString()) == null) {
                return;
            }
            ProfileEnrollmentActivity.this.a2().D(new q.a.SetLastName(string));
            if (ProfileEnrollmentActivity.this.attemptedSubmit) {
                ProfileEnrollmentActivity.this.a2().D(q.a.C1591q.f106974a);
            }
        }
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J1\u0010\r\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJ1\u0010\u0010\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u000e¨\u0006\u0011"}, d2 = {"androidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1", "Landroid/text/TextWatcher;", "Landroid/text/Editable;", "s", "", "afterTextChanged", "(Landroid/text/Editable;)V", "", "text", "", "start", "count", "after", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", "before", "onTextChanged", "core-ktx_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class o implements TextWatcher {
        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence text, int start, int count, int after) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence text, int start, int before, int count) {
        }

        public o() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable s10) {
            String string;
            if (ProfileEnrollmentActivity.this.attemptedSubmit) {
                M m10 = ProfileEnrollmentActivity.this.binding;
                if (m10 == null) {
                    Intrinsics.x("binding");
                    m10 = null;
                }
                m10.f21521A.setError((CharSequence) null);
            }
            if (s10 == null || (string = s10.toString()) == null) {
                return;
            }
            ProfileEnrollmentActivity.this.a2().D(new q.a.SetEmailAddress(string));
            if (ProfileEnrollmentActivity.this.attemptedSubmit) {
                ProfileEnrollmentActivity.this.a2().D(q.a.o.f106972a);
            }
        }
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J1\u0010\r\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJ1\u0010\u0010\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u000e¨\u0006\u0011"}, d2 = {"androidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1", "Landroid/text/TextWatcher;", "Landroid/text/Editable;", "s", "", "afterTextChanged", "(Landroid/text/Editable;)V", "", "text", "", "start", "count", "after", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", "before", "onTextChanged", "core-ktx_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class p implements TextWatcher {
        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence text, int start, int count, int after) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence text, int start, int before, int count) {
        }

        public p() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable s10) {
            String string;
            if (ProfileEnrollmentActivity.this.attemptedSubmit) {
                M m10 = ProfileEnrollmentActivity.this.binding;
                if (m10 == null) {
                    Intrinsics.x("binding");
                    m10 = null;
                }
                m10.f21533M.setError((CharSequence) null);
            }
            if (s10 == null || (string = s10.toString()) == null) {
                return;
            }
            ProfileEnrollmentActivity.this.a2().D(new q.a.SetPassword(string));
            if (ProfileEnrollmentActivity.this.attemptedSubmit) {
                ProfileEnrollmentActivity.this.a2().D(q.a.r.f106975a);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d2(ProfileEnrollmentActivity profileEnrollmentActivity, View view) {
        profileEnrollmentActivity.attemptedSubmit = true;
        profileEnrollmentActivity.b2();
        profileEnrollmentActivity.a2().D(q.a.k.f106966a);
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/meijer/mobile/meijer/activity/enrollment/profile/q$b;", "event", "", "<anonymous>", "(Lcom/meijer/mobile/meijer/activity/enrollment/profile/q$b;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.enrollment.profile.ProfileEnrollmentActivity$onCreate$5", f = "ProfileEnrollmentActivity.kt", l = {}, m = "invokeSuspend")
    static final class c extends SuspendLambda implements Function2<q.b, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f106917a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f106918b;

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            c cVar = ProfileEnrollmentActivity.this.new c(continuation);
            cVar.f106918b = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(q.b bVar, Continuation<? super Unit> continuation) {
            return ((c) create(bVar, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String string;
            String string2;
            String string3;
            IntrinsicsKt.f();
            if (this.f106917a == 0) {
                ResultKt.b(obj);
                q.b bVar = (q.b) this.f106918b;
                String string4 = null;
                if (bVar instanceof q.b.e) {
                    q qVarA2 = ProfileEnrollmentActivity.this.a2();
                    M m10 = ProfileEnrollmentActivity.this.binding;
                    if (m10 == null) {
                        Intrinsics.x("binding");
                        m10 = null;
                    }
                    Editable text = m10.f21524D.getText();
                    if (text != null) {
                        string = text.toString();
                    } else {
                        string = null;
                    }
                    M m11 = ProfileEnrollmentActivity.this.binding;
                    if (m11 == null) {
                        Intrinsics.x("binding");
                        m11 = null;
                    }
                    Editable text2 = m11.f21525E.getText();
                    if (text2 != null) {
                        string2 = text2.toString();
                    } else {
                        string2 = null;
                    }
                    M m12 = ProfileEnrollmentActivity.this.binding;
                    if (m12 == null) {
                        Intrinsics.x("binding");
                        m12 = null;
                    }
                    Editable text3 = m12.f21523C.getText();
                    if (text3 != null) {
                        string3 = text3.toString();
                    } else {
                        string3 = null;
                    }
                    M m13 = ProfileEnrollmentActivity.this.binding;
                    if (m13 == null) {
                        Intrinsics.x("binding");
                        m13 = null;
                    }
                    Editable text4 = m13.f21526F.getText();
                    if (text4 != null) {
                        string4 = text4.toString();
                    }
                    qVarA2.D(new q.a.SetProfileInformationToAccount(string, string2, string3, string4));
                    ProfileEnrollmentActivity profileEnrollmentActivity = ProfileEnrollmentActivity.this;
                    profileEnrollmentActivity.startActivity(PhoneEnrollmentActivity.INSTANCE.a(profileEnrollmentActivity));
                } else if (bVar instanceof q.b.l) {
                    ProfileEnrollmentActivity.this.getMeijerIntent().g0(ProfileEnrollmentActivity.this);
                } else if (bVar instanceof q.b.SetupProgressIndicatorEvent) {
                    ProfileEnrollmentActivity.this.q2(((q.b.SetupProgressIndicatorEvent) bVar).getProfileEnrollmentViewState());
                } else if (bVar instanceof q.b.ErrorFocusEvent) {
                    q.b.ErrorFocusEvent errorFocusEvent = (q.b.ErrorFocusEvent) bVar;
                    ProfileEnrollmentActivity.this.c2(errorFocusEvent.getProfileEnrollmentField());
                    ProfileEnrollmentActivity.this.k2(errorFocusEvent.getProfileEnrollmentViewState());
                } else if (bVar instanceof q.b.SetFirstNameFieldErrors) {
                    ProfileEnrollmentActivity.this.l2(((q.b.SetFirstNameFieldErrors) bVar).getProfileEnrollmentViewState());
                } else if (bVar instanceof q.b.SetLastNameFieldErrors) {
                    ProfileEnrollmentActivity.this.m2(((q.b.SetLastNameFieldErrors) bVar).getProfileEnrollmentViewState());
                } else if (bVar instanceof q.b.SetEmailFieldErrors) {
                    ProfileEnrollmentActivity.this.i2(((q.b.SetEmailFieldErrors) bVar).getProfileEnrollmentViewState());
                } else if (bVar instanceof q.b.SetPasswordFieldErrors) {
                    ProfileEnrollmentActivity.this.n2(((q.b.SetPasswordFieldErrors) bVar).getProfileEnrollmentViewState());
                } else if (bVar instanceof q.b.SetFieldErrors) {
                    ProfileEnrollmentActivity.this.k2(((q.b.SetFieldErrors) bVar).getProfileEnrollmentViewState());
                } else if (bVar instanceof q.b.a) {
                    q qVarA22 = ProfileEnrollmentActivity.this.a2();
                    M m14 = ProfileEnrollmentActivity.this.binding;
                    if (m14 == null) {
                        Intrinsics.x("binding");
                        m14 = null;
                    }
                    Editable text5 = m14.f21523C.getText();
                    if (text5 != null) {
                        string4 = text5.toString();
                    }
                    qVarA22.D(new q.a.ValidateEmailAddress(string4));
                } else if (bVar instanceof q.b.EmailInUseError) {
                    ProfileEnrollmentActivity.this.j2(((q.b.EmailInUseError) bVar).getEmail());
                    ProfileEnrollmentActivity.this.a2().D(q.a.C1590a.f106950a);
                } else if (bVar instanceof q.b.EmailRetrofitError) {
                    ProfileEnrollmentActivity.this.h2(((q.b.EmailRetrofitError) bVar).getErrorMessage().b(ProfileEnrollmentActivity.this));
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L1(final LocalThemeScope localThemeScope, Composer composer, final int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(1585368382);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(1585368382, i11, -1, "com.meijer.mobile.meijer.activity.enrollment.profile.ProfileEnrollmentActivity.HelloHeader (ProfileEnrollmentActivity.kt:254)");
            }
            q1.Label label = new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getThree(), null, 383, null);
            String string = ((Context) composerStartRestartGroup.o(AndroidCompositionLocals_androidKt.g())).getString(Y.f100836b5);
            Intrinsics.i(string, "getString(...)");
            si.j.h(localThemeScope, label, string, null, composerStartRestartGroup, (q1.Label.f142335j << 3) | (i11 & 14) | LocalThemeScope.f17314g, 4);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: com.meijer.mobile.meijer.activity.enrollment.profile.k
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ProfileEnrollmentActivity.M1(this.f106935a, localThemeScope, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit M1(ProfileEnrollmentActivity profileEnrollmentActivity, LocalThemeScope localThemeScope, int i10, Composer composer, int i11) {
        profileEnrollmentActivity.L1(localThemeScope, composer, J0.a(i10 | 1));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final q a2() {
        return (q) this.viewModel.getValue();
    }

    private final void b2() {
        Object systemService = getSystemService("input_method");
        Intrinsics.h(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).hideSoftInputFromWindow(getWindow().getDecorView().getWindowToken(), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"RestrictedApi"})
    public final void c2(q.c profileInfoField) {
        if (profileInfoField == null) {
            return;
        }
        int i10 = a.$EnumSwitchMapping$0[profileInfoField.ordinal()];
        M m10 = null;
        if (i10 == 1) {
            M m11 = this.binding;
            if (m11 == null) {
                Intrinsics.x("binding");
                m11 = null;
            }
            m11.f21527G.clearFocus();
            M m12 = this.binding;
            if (m12 == null) {
                Intrinsics.x("binding");
                m12 = null;
            }
            m12.f21527G.requestFocus();
            M m13 = this.binding;
            if (m13 == null) {
                Intrinsics.x("binding");
                m13 = null;
            }
            m13.f21527G.setFocusableInTouchMode(true);
            M m14 = this.binding;
            if (m14 == null) {
                Intrinsics.x("binding");
            } else {
                m10 = m14;
            }
            EnhancedTextInputLayoutView firstNameInputLayout = m10.f21527G;
            Intrinsics.i(firstNameInputLayout, "firstNameInputLayout");
            u2(firstNameInputLayout);
            return;
        }
        if (i10 == 2) {
            M m15 = this.binding;
            if (m15 == null) {
                Intrinsics.x("binding");
                m15 = null;
            }
            m15.f21529I.clearFocus();
            M m16 = this.binding;
            if (m16 == null) {
                Intrinsics.x("binding");
                m16 = null;
            }
            m16.f21529I.requestFocus();
            M m17 = this.binding;
            if (m17 == null) {
                Intrinsics.x("binding");
                m17 = null;
            }
            m17.f21529I.setFocusableInTouchMode(true);
            M m18 = this.binding;
            if (m18 == null) {
                Intrinsics.x("binding");
            } else {
                m10 = m18;
            }
            EnhancedTextInputLayoutView lastNameInputLayout = m10.f21529I;
            Intrinsics.i(lastNameInputLayout, "lastNameInputLayout");
            u2(lastNameInputLayout);
            return;
        }
        if (i10 == 3) {
            M m19 = this.binding;
            if (m19 == null) {
                Intrinsics.x("binding");
                m19 = null;
            }
            m19.f21521A.clearFocus();
            M m20 = this.binding;
            if (m20 == null) {
                Intrinsics.x("binding");
                m20 = null;
            }
            m20.f21521A.requestFocus();
            M m21 = this.binding;
            if (m21 == null) {
                Intrinsics.x("binding");
                m21 = null;
            }
            m21.f21521A.setFocusableInTouchMode(true);
            M m22 = this.binding;
            if (m22 == null) {
                Intrinsics.x("binding");
            } else {
                m10 = m22;
            }
            EnhancedTextInputLayoutView emailAddressInputLayout = m10.f21521A;
            Intrinsics.i(emailAddressInputLayout, "emailAddressInputLayout");
            u2(emailAddressInputLayout);
            return;
        }
        if (i10 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        M m23 = this.binding;
        if (m23 == null) {
            Intrinsics.x("binding");
            m23 = null;
        }
        m23.f21533M.clearFocus();
        M m24 = this.binding;
        if (m24 == null) {
            Intrinsics.x("binding");
            m24 = null;
        }
        m24.f21533M.requestFocus();
        M m25 = this.binding;
        if (m25 == null) {
            Intrinsics.x("binding");
            m25 = null;
        }
        m25.f21533M.setFocusableInTouchMode(true);
        M m26 = this.binding;
        if (m26 == null) {
            Intrinsics.x("binding");
        } else {
            m10 = m26;
        }
        EnhancedTextInputLayoutView passwordInputLayout = m10.f21533M;
        Intrinsics.i(passwordInputLayout, "passwordInputLayout");
        u2(passwordInputLayout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h2(String error) {
        M m10 = this.binding;
        if (m10 == null) {
            Intrinsics.x("binding");
            m10 = null;
        }
        m10.f21521A.setError(error);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j2(String email) {
        M m10 = this.binding;
        if (m10 == null) {
            Intrinsics.x("binding");
            m10 = null;
        }
        m10.f21521A.setError(getString(Y.f100995j5));
        r2(email);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence o2(c.Invalid it) {
        Intrinsics.j(it, "it");
        return it.getMessage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence p2(Ik.c it) {
        Intrinsics.j(it, "it");
        return it.getMessage();
    }

    private final void r2(final String email) {
        new C15485b(this, Cj.p.f5102a).setTitle(Y.f100976i5).setCancelable(true).setMessage(Y.f100956h5).setPositiveButton(Cj.o.f5016F0, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.enrollment.profile.i
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                ProfileEnrollmentActivity.s2(this.f106933a, email, dialogInterface, i10);
            }
        }).setNegativeButton(Y.f101313z3, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.enrollment.profile.j
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                ProfileEnrollmentActivity.t2(dialogInterface, i10);
            }
        }).show();
    }

    private final void u2(EnhancedTextInputLayoutView enhancedTextInputLayoutView) {
        InputMethodManager inputMethodManager = (InputMethodManager) Z1.b.j(this, InputMethodManager.class);
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(enhancedTextInputLayoutView, 1);
        }
    }

    private final void v2() {
        M m10 = this.binding;
        M m11 = null;
        if (m10 == null) {
            Intrinsics.x("binding");
            m10 = null;
        }
        TextInputEditText entryFirstName = m10.f21524D;
        Intrinsics.i(entryFirstName, "entryFirstName");
        entryFirstName.addTextChangedListener(new m());
        M m12 = this.binding;
        if (m12 == null) {
            Intrinsics.x("binding");
            m12 = null;
        }
        TextInputEditText entryLastName = m12.f21525E;
        Intrinsics.i(entryLastName, "entryLastName");
        entryLastName.addTextChangedListener(new n());
        M m13 = this.binding;
        if (m13 == null) {
            Intrinsics.x("binding");
            m13 = null;
        }
        TextInputEditText entryEmailAddress = m13.f21523C;
        Intrinsics.i(entryEmailAddress, "entryEmailAddress");
        entryEmailAddress.addTextChangedListener(new o());
        M m14 = this.binding;
        if (m14 == null) {
            Intrinsics.x("binding");
        } else {
            m11 = m14;
        }
        TextInputEditText entryPassword = m11.f21526F;
        Intrinsics.i(entryPassword, "entryPassword");
        entryPassword.addTextChangedListener(new p());
    }

    @Override // Bj.b
    public Toolbar y() {
        M m10 = this.binding;
        if (m10 == null) {
            Intrinsics.x("binding");
            m10 = null;
        }
        MaterialToolbar toolbar = m10.f21542V;
        Intrinsics.i(toolbar, "toolbar");
        return toolbar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e2(ProfileEnrollmentActivity profileEnrollmentActivity) {
        if (!profileEnrollmentActivity.onNavigateUp()) {
            profileEnrollmentActivity.finish();
        }
        ck.c.b(profileEnrollmentActivity, 1, 0, 0, 0, 8, null);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f2(ProfileEnrollmentActivity profileEnrollmentActivity, View view) {
        String string;
        String string2;
        String string3;
        q qVarA2 = profileEnrollmentActivity.a2();
        M m10 = profileEnrollmentActivity.binding;
        String string4 = null;
        if (m10 == null) {
            Intrinsics.x("binding");
            m10 = null;
        }
        Editable text = m10.f21524D.getText();
        if (text != null) {
            string = text.toString();
        } else {
            string = null;
        }
        M m11 = profileEnrollmentActivity.binding;
        if (m11 == null) {
            Intrinsics.x("binding");
            m11 = null;
        }
        Editable text2 = m11.f21525E.getText();
        if (text2 != null) {
            string2 = text2.toString();
        } else {
            string2 = null;
        }
        M m12 = profileEnrollmentActivity.binding;
        if (m12 == null) {
            Intrinsics.x("binding");
            m12 = null;
        }
        Editable text3 = m12.f21523C.getText();
        if (text3 != null) {
            string3 = text3.toString();
        } else {
            string3 = null;
        }
        M m13 = profileEnrollmentActivity.binding;
        if (m13 == null) {
            Intrinsics.x("binding");
            m13 = null;
        }
        Editable text4 = m13.f21526F.getText();
        if (text4 != null) {
            string4 = text4.toString();
        }
        qVarA2.D(new q.a.StoreExistingFieldValues(string, string2, string3, string4));
        profileEnrollmentActivity.startActivity(Bl.k.b(profileEnrollmentActivity, false, null, null, null, null, null, 126, null));
        profileEnrollmentActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g2(ProfileEnrollmentActivity profileEnrollmentActivity, View view) {
        profileEnrollmentActivity.a2().D(q.a.j.f106965a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"RestrictedApi"})
    public final void i2(ProfileEnrollmentViewState viewState) {
        Validation<String> validationI = viewState.i();
        M m10 = null;
        if (validationI.getIsValid()) {
            validationI = null;
        }
        if (validationI != null) {
            if (!validationI.c().contains(new c.Invalid((String) new PropertyReference0Impl(new PropertyReference0Impl(viewState) { // from class: com.meijer.mobile.meijer.activity.enrollment.profile.ProfileEnrollmentActivity.e
                @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
                public Object get() {
                    return ((ProfileEnrollmentViewState) this.receiver).i();
                }
            }) { // from class: com.meijer.mobile.meijer.activity.enrollment.profile.ProfileEnrollmentActivity.d
                @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
                public Object get() {
                    return ((KProperty0) this.receiver).getName();
                }
            }.get(), null, null, 6, null))) {
                validationI = null;
            }
            if (validationI != null) {
                M m11 = this.binding;
                if (m11 == null) {
                    Intrinsics.x("binding");
                } else {
                    m10 = m11;
                }
                m10.f21521A.setError(getString(Y.f100451H1));
                return;
            }
            M m12 = this.binding;
            if (m12 == null) {
                Intrinsics.x("binding");
            } else {
                m10 = m12;
            }
            m10.f21521A.setError(getString(Y.f100470I1));
            return;
        }
        M m13 = this.binding;
        if (m13 == null) {
            Intrinsics.x("binding");
            m13 = null;
        }
        m13.f21521A.setError((CharSequence) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"RestrictedApi"})
    public final void k2(ProfileEnrollmentViewState viewState) {
        l2(viewState);
        m2(viewState);
        i2(viewState);
        n2(viewState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"RestrictedApi"})
    public final void l2(ProfileEnrollmentViewState viewState) {
        Validation<String> validationJ = viewState.j();
        M m10 = null;
        if (validationJ.getIsValid()) {
            validationJ = null;
        }
        if (validationJ != null) {
            if (!validationJ.c().contains(new c.Invalid((String) new PropertyReference0Impl(new PropertyReference0Impl(viewState) { // from class: com.meijer.mobile.meijer.activity.enrollment.profile.ProfileEnrollmentActivity.g
                @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
                public Object get() {
                    return ((ProfileEnrollmentViewState) this.receiver).j();
                }
            }) { // from class: com.meijer.mobile.meijer.activity.enrollment.profile.ProfileEnrollmentActivity.f
                @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
                public Object get() {
                    return ((KProperty0) this.receiver).getName();
                }
            }.get(), null, null, 6, null))) {
                validationJ = null;
            }
            if (validationJ != null) {
                M m11 = this.binding;
                if (m11 == null) {
                    Intrinsics.x("binding");
                } else {
                    m10 = m11;
                }
                m10.f21527G.setError(getString(Y.f101015k5));
                return;
            }
            M m12 = this.binding;
            if (m12 == null) {
                Intrinsics.x("binding");
            } else {
                m10 = m12;
            }
            m10.f21527G.setError(getString(Y.f101015k5));
            return;
        }
        M m13 = this.binding;
        if (m13 == null) {
            Intrinsics.x("binding");
            m13 = null;
        }
        m13.f21527G.setError((CharSequence) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"RestrictedApi"})
    public final void m2(ProfileEnrollmentViewState viewState) {
        Validation<String> validationL = viewState.l();
        M m10 = null;
        if (validationL.getIsValid()) {
            validationL = null;
        }
        if (validationL != null) {
            if (!validationL.c().contains(new c.Invalid((String) new PropertyReference0Impl(new PropertyReference0Impl(viewState) { // from class: com.meijer.mobile.meijer.activity.enrollment.profile.ProfileEnrollmentActivity.i
                @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
                public Object get() {
                    return ((ProfileEnrollmentViewState) this.receiver).l();
                }
            }) { // from class: com.meijer.mobile.meijer.activity.enrollment.profile.ProfileEnrollmentActivity.h
                @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
                public Object get() {
                    return ((KProperty0) this.receiver).getName();
                }
            }.get(), null, null, 6, null))) {
                validationL = null;
            }
            if (validationL != null) {
                M m11 = this.binding;
                if (m11 == null) {
                    Intrinsics.x("binding");
                } else {
                    m10 = m11;
                }
                m10.f21529I.setError(getString(Y.f101035l5));
                return;
            }
            M m12 = this.binding;
            if (m12 == null) {
                Intrinsics.x("binding");
            } else {
                m10 = m12;
            }
            m10.f21529I.setError(getString(Y.f101035l5));
            return;
        }
        M m13 = this.binding;
        if (m13 == null) {
            Intrinsics.x("binding");
            m13 = null;
        }
        m13.f21529I.setError((CharSequence) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"RestrictedApi"})
    public final void n2(ProfileEnrollmentViewState viewState) {
        Validation<String> validationM = viewState.m();
        M m10 = null;
        if (validationM.getIsValid()) {
            validationM = null;
        }
        if (validationM != null) {
            List<Ik.c> listC = validationM.c();
            if (!(listC instanceof Collection) || !listC.isEmpty()) {
                Iterator<T> it = listC.iterator();
                while (it.hasNext()) {
                    if (!(((Ik.c) it.next()) instanceof c.Invalid)) {
                        List<Ik.c> listC2 = validationM.c();
                        if (!(listC2 instanceof Collection) || !listC2.isEmpty()) {
                            Iterator<T> it2 = listC2.iterator();
                            while (it2.hasNext()) {
                                if (!(((Ik.c) it2.next()) instanceof c.Empty)) {
                                    M m11 = this.binding;
                                    if (m11 == null) {
                                        Intrinsics.x("binding");
                                    } else {
                                        m10 = m11;
                                    }
                                    m10.f21533M.setError("Please enter a valid password.");
                                    return;
                                }
                            }
                        }
                        M m12 = this.binding;
                        if (m12 == null) {
                            Intrinsics.x("binding");
                        } else {
                            m10 = m12;
                        }
                        m10.f21533M.setError(CollectionsKt.B0(validationM.c(), "", null, null, 0, null, new Function1() { // from class: com.meijer.mobile.meijer.activity.enrollment.profile.h
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return ProfileEnrollmentActivity.p2((Ik.c) obj);
                            }
                        }, 30, null));
                        return;
                    }
                }
            }
            List<Ik.c> listC3 = validationM.c();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listC3) {
                if (obj instanceof c.Invalid) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.size() == 1) {
                M m13 = this.binding;
                if (m13 == null) {
                    Intrinsics.x("binding");
                } else {
                    m10 = m13;
                }
                m10.f21533M.setError(CollectionsKt.B0(arrayList, "", null, null, 0, null, new Function1() { // from class: com.meijer.mobile.meijer.activity.enrollment.profile.g
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return ProfileEnrollmentActivity.o2((c.Invalid) obj2);
                    }
                }, 30, null));
                return;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.x(arrayList, 10));
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                arrayList2.add(((c.Invalid) it3.next()).getMessage());
            }
            Ds.c.b(spannableStringBuilder, (String[]) arrayList2.toArray(new String[0]), false, 24, 32);
            M m14 = this.binding;
            if (m14 == null) {
                Intrinsics.x("binding");
            } else {
                m10 = m14;
            }
            m10.f21533M.setError(spannableStringBuilder);
            return;
        }
        M m15 = this.binding;
        if (m15 == null) {
            Intrinsics.x("binding");
            m15 = null;
        }
        m15.f21533M.setError((CharSequence) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q2(ProfileEnrollmentViewState viewState) {
        M m10 = null;
        if (viewState.n().isEmpty()) {
            viewState = null;
        }
        if (viewState != null) {
            M m11 = this.binding;
            if (m11 == null) {
                Intrinsics.x("binding");
                m11 = null;
            }
            ProgressIndicatorView progressIndicatorView = m11.f21539S.f22381z;
            progressIndicatorView.setPadding((int) Ds.p.b(this, viewState.getHorizontalPaddingInDp()), progressIndicatorView.getPaddingTop(), (int) Ds.p.b(this, viewState.getHorizontalPaddingInDp()), progressIndicatorView.getPaddingBottom());
            progressIndicatorView.d(viewState.n(), viewState.getCurrentStep());
            M m12 = this.binding;
            if (m12 == null) {
                Intrinsics.x("binding");
            } else {
                m10 = m12;
            }
            m10.f21539S.f22379A.setVisibility(4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s2(ProfileEnrollmentActivity profileEnrollmentActivity, String str, DialogInterface dialogInterface, int i10) {
        dialogInterface.dismiss();
        profileEnrollmentActivity.startActivity(Bl.k.b(profileEnrollmentActivity, false, null, null, null, null, str, 62, null));
        profileEnrollmentActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t2(DialogInterface dialogInterface, int i10) {
        dialogInterface.dismiss();
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        M mM0 = M.M0(getLayoutInflater());
        this.binding = mM0;
        if (mM0 == null) {
            Intrinsics.x("binding");
            mM0 = null;
        }
        setContentView(Zr.a.j(mM0.getRoot(), false, 1, null));
        U0(Y.f100698U1);
        Drawable navigationIcon = y().getNavigationIcon();
        if (navigationIcon != null) {
            navigationIcon.setVisible(false, false);
        }
        a2().D(q.a.b.f106951a);
        M m10 = this.binding;
        if (m10 == null) {
            Intrinsics.x("binding");
            m10 = null;
        }
        m10.f21532L.setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.enrollment.profile.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProfileEnrollmentActivity.d2(this.f106929a, view);
            }
        });
        Bj.b.o(this, 0, 0, new Function0() { // from class: com.meijer.mobile.meijer.activity.enrollment.profile.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ProfileEnrollmentActivity.e2(this.f106930a);
            }
        }, 3, null);
        C13737e.b(this, null, ComposableLambdaKt.composableLambdaInstance(1941093461, true, new b()), 1, null);
        M m11 = this.binding;
        if (m11 == null) {
            Intrinsics.x("binding");
            m11 = null;
        }
        m11.f21530J.setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.enrollment.profile.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProfileEnrollmentActivity.f2(this.f106931a, view);
            }
        });
        C16563h.J(C16563h.O(a2().B(), new c(null)), C6173t.a(this));
        M m12 = this.binding;
        if (m12 == null) {
            Intrinsics.x("binding");
            m12 = null;
        }
        m12.f21541U.setLinkTextColor(getResources().getColor(Cj.g.f4661c, null));
        m12.f21541U.setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.enrollment.profile.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProfileEnrollmentActivity.g2(this.f106932a, view);
            }
        });
        m12.f21522B.setTextColor(getResources().getColor(P.f99506b, null));
        m12.f21530J.setTextColor(getResources().getColor(Cj.g.f4661c, null));
        m12.f21533M.setHintText(getString(Y.f100856c5));
        a2().D(q.a.i.f106964a);
        v2();
    }
}
