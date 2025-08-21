package com.meijer.mobile.meijer.activity.enrollment.storeLocation;

import Nn.AbstractC4252j0;
import V2.CreationExtras;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.app.c;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.AbstractC6165l;
import androidx.view.C6136J;
import androidx.view.C6173t;
import androidx.view.ComponentActivity;
import androidx.view.e0;
import androidx.view.f0;
import androidx.view.g0;
import com.google.android.material.appbar.MaterialToolbar;
import com.meijer.mobile.core.design.widget.checkoutprogressstepperview.ProgressIndicatorView;
import com.meijer.mobile.meijer.Y;
import com.meijer.mobile.meijer.activity.enrollment.profile.ProfileEnrollmentViewState;
import com.meijer.mobile.meijer.activity.enrollment.storeLocation.a;
import com.meijer.mobile.widget.MeijerEditText;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import mv.C15809k;
import mv.InterfaceC15783O;
import pv.InterfaceC16562g;
import pv.P;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 82\u00020\u00012\u00020\u0002:\u00019B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0015¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\u0004J\u0017\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010R(\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00118\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0014\u001a\u0004\b\u001c\u0010\u0016R\u0017\u0010#\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010&\u001a\u00020\u001e8\u0006X\u0086D¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b%\u0010\"R\u0016\u0010*\u001a\u00020'8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010.\u001a\u00020+8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b,\u0010-R\u001b\u00104\u001a\u00020/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0014\u00107\u001a\u0002058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u00106¨\u0006:"}, d2 = {"Lcom/meijer/mobile/meijer/activity/enrollment/storeLocation/StoreListActivity;", "Lcom/meijer/mobile/meijer/activity/MeijerActivity;", "LBj/b;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "W1", "Q1", "Z1", "", "didCreateAccountFail", "X1", "(Z)V", "", "Lcom/meijer/mobile/meijer/activity/enrollment/profile/v$a;", "s", "Ljava/util/List;", "getSteps", "()Ljava/util/List;", "setSteps", "(Ljava/util/List;)V", "steps", "", "t", "getStepLabels", "stepLabels", "", "u", "I", "getCurrentStep", "()I", "currentStep", "v", "getHorizontalPaddingInDp", "horizontalPaddingInDp", "LNn/j0;", "w", "LNn/j0;", "binding", "Lcom/meijer/mobile/meijer/activity/enrollment/storeLocation/k;", "x", "Lcom/meijer/mobile/meijer/activity/enrollment/storeLocation/k;", "storeAdapter", "Lcom/meijer/mobile/meijer/activity/enrollment/storeLocation/o;", "y", "Lkotlin/Lazy;", "P1", "()Lcom/meijer/mobile/meijer/activity/enrollment/storeLocation/o;", "storeListViewModel", "Landroidx/appcompat/widget/Toolbar;", "()Landroidx/appcompat/widget/Toolbar;", "toolbar", "z", "a", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class StoreListActivity extends Hilt_StoreListActivity implements Bj.b {

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private List<ProfileEnrollmentViewState.CreateAccountLabelFlowRequirement> steps;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final List<String> stepLabels;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final int currentStep;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final int horizontalPaddingInDp;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private AbstractC4252j0 binding;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private k storeAdapter;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final Lazy storeListViewModel;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: A, reason: collision with root package name */
    public static final int f107050A = 8;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/meijer/mobile/meijer/activity/enrollment/storeLocation/StoreListActivity$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "a", "(Landroid/content/Context;)Landroid/content/Intent;", "", "IS_FIRST_SIGN_IN", "Ljava/lang/String;", "IS_LOCATION_USED", "MPERKS_APP_CREATION", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.enrollment.storeLocation.StoreListActivity$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final Intent a(Context context) {
            Intrinsics.j(context, "context");
            return new Intent(context, (Class<?>) StoreListActivity.class);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.enrollment.storeLocation.StoreListActivity$onCreate$7", f = "StoreListActivity.kt", l = {149}, m = "invokeSuspend")
    static final class b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f107059a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f107061c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f107062d;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.enrollment.storeLocation.StoreListActivity$onCreate$7$1", f = "StoreListActivity.kt", l = {BinsView.TOTE_WIDTH_DP}, m = "invokeSuspend")
        static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f107063a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ StoreListActivity f107064b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f107065c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f107066d;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.meijer.activity.enrollment.storeLocation.StoreListActivity$b$a$a, reason: collision with other inner class name */
            static final class C1593a<T> implements InterfaceC16562g {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ StoreListActivity f107067a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ String f107068b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ String f107069c;

                C1593a(StoreListActivity storeListActivity, String str, String str2) {
                    this.f107067a = storeListActivity;
                    this.f107068b = str;
                    this.f107069c = str2;
                }

                /* JADX WARN: Removed duplicated region for block: B:61:0x014b  */
                @Override // pv.InterfaceC16562g
                /* renamed from: g, reason: merged with bridge method [inline-methods] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(com.meijer.mobile.meijer.activity.enrollment.storeLocation.m r11, kotlin.coroutines.Continuation<? super kotlin.Unit> r12) {
                    /*
                        Method dump skipped, instructions count: 775
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.enrollment.storeLocation.StoreListActivity.b.a.C1593a.emit(com.meijer.mobile.meijer.activity.enrollment.storeLocation.m, kotlin.coroutines.Continuation):java.lang.Object");
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final void h(StoreListActivity storeListActivity) {
                    AbstractC4252j0 abstractC4252j0 = storeListActivity.binding;
                    if (abstractC4252j0 == null) {
                        Intrinsics.x("binding");
                        abstractC4252j0 = null;
                    }
                    abstractC4252j0.f22042L.requestFocus();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final void i(StoreListActivity storeListActivity) {
                    AbstractC4252j0 abstractC4252j0 = storeListActivity.binding;
                    if (abstractC4252j0 == null) {
                        Intrinsics.x("binding");
                        abstractC4252j0 = null;
                    }
                    abstractC4252j0.f22031A.requestFocus();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(StoreListActivity storeListActivity, String str, String str2, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f107064b = storeListActivity;
                this.f107065c = str;
                this.f107066d = str2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.f107064b, this.f107065c, this.f107066d, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f107063a;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                } else {
                    ResultKt.b(obj);
                    P<m> pU = this.f107064b.P1().u();
                    C1593a c1593a = new C1593a(this.f107064b, this.f107065c, this.f107066d);
                    this.f107063a = 1;
                    if (pU.collect(c1593a, this) == objF) {
                        return objF;
                    }
                }
                throw new KotlinNothingValueException();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, String str2, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f107061c = str;
            this.f107062d = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return StoreListActivity.this.new b(this.f107061c, this.f107062d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f107059a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                StoreListActivity storeListActivity = StoreListActivity.this;
                AbstractC6165l.b bVar = AbstractC6165l.b.f55502d;
                a aVar = new a(storeListActivity, this.f107061c, this.f107062d, null);
                this.f107059a = 1;
                if (C6136J.b(storeListActivity, bVar, aVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class c extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f107070f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ComponentActivity componentActivity) {
            super(0);
            this.f107070f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f107070f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class d extends Lambda implements Function0<g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f107071f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentActivity componentActivity) {
            super(0);
            this.f107071f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final g0 invoke() {
            return this.f107071f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class e extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f107072f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f107073g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f107072f = function0;
            this.f107073g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f107072f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f107073g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J1\u0010\r\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJ1\u0010\u0010\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u000e¨\u0006\u0011"}, d2 = {"androidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1", "Landroid/text/TextWatcher;", "Landroid/text/Editable;", "s", "", "afterTextChanged", "(Landroid/text/Editable;)V", "", "text", "", "start", "count", "after", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", "before", "onTextChanged", "core-ktx_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class f implements TextWatcher {
        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence text, int start, int count, int after) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence text, int start, int before, int count) {
        }

        public f() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable s10) {
            String string;
            if (s10 == null || (string = s10.toString()) == null) {
                return;
            }
            AbstractC4252j0 abstractC4252j0 = StoreListActivity.this.binding;
            if (abstractC4252j0 == null) {
                Intrinsics.x("binding");
                abstractC4252j0 = null;
            }
            ImageButton searchClear = abstractC4252j0.f22043M.f21401z;
            Intrinsics.i(searchClear, "searchClear");
            searchClear.setVisibility(StringsKt.s0(string) ? 4 : 0);
        }
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J1\u0010\r\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJ1\u0010\u0010\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u000e¨\u0006\u0011"}, d2 = {"androidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1", "Landroid/text/TextWatcher;", "Landroid/text/Editable;", "s", "", "afterTextChanged", "(Landroid/text/Editable;)V", "", "text", "", "start", "count", "after", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", "before", "onTextChanged", "core-ktx_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class g implements TextWatcher {
        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable s10) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence text, int start, int count, int after) {
        }

        public g() {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence text, int start, int before, int count) {
            AbstractC4252j0 abstractC4252j0 = StoreListActivity.this.binding;
            if (abstractC4252j0 == null) {
                Intrinsics.x("binding");
                abstractC4252j0 = null;
            }
            Ds.p.e(abstractC4252j0.f22043M.f21398A);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final o P1() {
        return (o) this.storeListViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q1() {
        Object systemService = getSystemService("input_method");
        Intrinsics.h(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).hideSoftInputFromWindow(getWindow().getDecorView().getWindowToken(), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean U1(StoreListActivity storeListActivity, TextView textView, int i10, KeyEvent keyEvent) {
        k kVar = storeListActivity.storeAdapter;
        AbstractC4252j0 abstractC4252j0 = null;
        if (kVar == null) {
            Intrinsics.x("storeAdapter");
            kVar = null;
        }
        kVar.notifyDataSetChanged();
        o oVarP1 = storeListActivity.P1();
        AbstractC4252j0 abstractC4252j02 = storeListActivity.binding;
        if (abstractC4252j02 == null) {
            Intrinsics.x("binding");
        } else {
            abstractC4252j0 = abstractC4252j02;
        }
        oVarP1.x(new a.SearchWithZipOrAddress(String.valueOf(abstractC4252j0.f22043M.f21398A.getText())));
        storeListActivity.P1().x(new a.TrackState(false));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void V1(StoreListActivity storeListActivity, View view) {
        AbstractC4252j0 abstractC4252j0 = storeListActivity.binding;
        AbstractC4252j0 abstractC4252j02 = null;
        if (abstractC4252j0 == null) {
            Intrinsics.x("binding");
            abstractC4252j0 = null;
        }
        abstractC4252j0.f22043M.f21398A.setText((CharSequence) null);
        AbstractC4252j0 abstractC4252j03 = storeListActivity.binding;
        if (abstractC4252j03 == null) {
            Intrinsics.x("binding");
        } else {
            abstractC4252j02 = abstractC4252j03;
        }
        Ds.p.e(abstractC4252j02.f22043M.f21398A);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void W1() {
        AbstractC4252j0 abstractC4252j0 = this.binding;
        AbstractC4252j0 abstractC4252j02 = null;
        if (abstractC4252j0 == null) {
            Intrinsics.x("binding");
            abstractC4252j0 = null;
        }
        ProgressIndicatorView progressIndicatorView = abstractC4252j0.f22035E.f22381z;
        progressIndicatorView.setPadding((int) Ds.p.b(this, this.horizontalPaddingInDp), progressIndicatorView.getPaddingTop(), (int) Ds.p.b(this, this.horizontalPaddingInDp), progressIndicatorView.getPaddingBottom());
        progressIndicatorView.d(this.stepLabels, this.currentStep);
        AbstractC4252j0 abstractC4252j03 = this.binding;
        if (abstractC4252j03 == null) {
            Intrinsics.x("binding");
        } else {
            abstractC4252j02 = abstractC4252j03;
        }
        abstractC4252j02.f22035E.f22379A.setVisibility(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void X1(boolean didCreateAccountFail) {
        c.a aVar = new c.a(this);
        String string = didCreateAccountFail ? getString(Y.f100870d) : getString(Y.f100476I7);
        Intrinsics.g(string);
        aVar.setTitle(string).setMessage(Y.f100950h).setPositiveButton(Y.f101159r9, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.enrollment.storeLocation.g
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                StoreListActivity.Y1(this.f107089a, dialogInterface, i10);
            }
        });
        androidx.appcompat.app.c cVarCreate = aVar.create();
        Intrinsics.i(cVarCreate, "create(...)");
        cVarCreate.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Y1(StoreListActivity storeListActivity, DialogInterface dialogInterface, int i10) {
        AbstractC4252j0 abstractC4252j0 = storeListActivity.binding;
        AbstractC4252j0 abstractC4252j02 = null;
        if (abstractC4252j0 == null) {
            Intrinsics.x("binding");
            abstractC4252j0 = null;
        }
        abstractC4252j0.f22038H.setVisibility(0);
        AbstractC4252j0 abstractC4252j03 = storeListActivity.binding;
        if (abstractC4252j03 == null) {
            Intrinsics.x("binding");
        } else {
            abstractC4252j02 = abstractC4252j03;
        }
        abstractC4252j02.f22036F.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Z1() {
        AbstractC4252j0 abstractC4252j0 = this.binding;
        AbstractC4252j0 abstractC4252j02 = null;
        if (abstractC4252j0 == null) {
            Intrinsics.x("binding");
            abstractC4252j0 = null;
        }
        MeijerEditText searchField = abstractC4252j0.f22043M.f21398A;
        Intrinsics.i(searchField, "searchField");
        searchField.addTextChangedListener(new f());
        AbstractC4252j0 abstractC4252j03 = this.binding;
        if (abstractC4252j03 == null) {
            Intrinsics.x("binding");
        } else {
            abstractC4252j02 = abstractC4252j03;
        }
        MeijerEditText searchField2 = abstractC4252j02.f22043M.f21398A;
        Intrinsics.i(searchField2, "searchField");
        searchField2.addTextChangedListener(new g());
    }

    @Override // Bj.b
    public Toolbar y() {
        AbstractC4252j0 abstractC4252j0 = this.binding;
        if (abstractC4252j0 == null) {
            Intrinsics.x("binding");
            abstractC4252j0 = null;
        }
        MaterialToolbar toolbar = abstractC4252j0.f22044N;
        Intrinsics.i(toolbar, "toolbar");
        return toolbar;
    }

    public StoreListActivity() {
        int i10 = 0;
        List<ProfileEnrollmentViewState.CreateAccountLabelFlowRequirement> listP = CollectionsKt.p(new ProfileEnrollmentViewState.CreateAccountLabelFlowRequirement(ProfileEnrollmentViewState.b.f107037a, "1. Profile", true), new ProfileEnrollmentViewState.CreateAccountLabelFlowRequirement(ProfileEnrollmentViewState.b.f107038b, "2. mPerks", true), new ProfileEnrollmentViewState.CreateAccountLabelFlowRequirement(ProfileEnrollmentViewState.b.f107039c, "3. Store", false));
        this.steps = listP;
        List<ProfileEnrollmentViewState.CreateAccountLabelFlowRequirement> list = listP;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((ProfileEnrollmentViewState.CreateAccountLabelFlowRequirement) it.next()).getStepLabel());
        }
        this.stepLabels = arrayList;
        List<ProfileEnrollmentViewState.CreateAccountLabelFlowRequirement> list2 = this.steps;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.x(list2, 10));
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Boolean.valueOf(((ProfileEnrollmentViewState.CreateAccountLabelFlowRequirement) it2.next()).getCompleted()));
        }
        Iterator it3 = arrayList2.iterator();
        while (true) {
            if (it3.hasNext()) {
                if (!((Boolean) it3.next()).booleanValue()) {
                    break;
                } else {
                    i10++;
                }
            } else {
                i10 = -1;
                break;
            }
        }
        this.currentStep = i10;
        this.horizontalPaddingInDp = 40;
        this.storeListViewModel = new e0(Reflection.b(o.class), new d(this), new c(this), new e(null, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit R1(StoreListActivity storeListActivity) {
        if (!storeListActivity.onNavigateUp()) {
            storeListActivity.finish();
        }
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S1(StoreListActivity storeListActivity, View view) {
        storeListActivity.P1().x(a.d.f107080a);
        AbstractC4252j0 abstractC4252j0 = storeListActivity.binding;
        if (abstractC4252j0 == null) {
            Intrinsics.x("binding");
            abstractC4252j0 = null;
        }
        abstractC4252j0.f22035E.f22379A.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T1(StoreListActivity storeListActivity, View view) {
        storeListActivity.P1().x(a.g.f107083a);
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    @SuppressLint({"NotifyDataSetChanged"})
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AbstractC4252j0 abstractC4252j0M0 = AbstractC4252j0.M0(getLayoutInflater());
        this.binding = abstractC4252j0M0;
        if (abstractC4252j0M0 == null) {
            Intrinsics.x("binding");
            abstractC4252j0M0 = null;
        }
        setContentView(Zr.a.j(abstractC4252j0M0.getRoot(), false, 1, null));
        U0(Y.f100872d1);
        Drawable navigationIcon = y().getNavigationIcon();
        if (navigationIcon != null) {
            navigationIcon.setVisible(false, false);
        }
        this.storeAdapter = new k(P1());
        if (getIntent().getBooleanExtra("isLocationUsed", false)) {
            P1().x(new a.TrackState(true));
        }
        Bj.b.o(this, 0, 0, new Function0() { // from class: com.meijer.mobile.meijer.activity.enrollment.storeLocation.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return StoreListActivity.R1(this.f107084a);
            }
        }, 3, null);
        String stringExtra = getIntent().getStringExtra("latitude");
        String stringExtra2 = getIntent().getStringExtra("longitude");
        AbstractC4252j0 abstractC4252j0 = this.binding;
        if (abstractC4252j0 == null) {
            Intrinsics.x("binding");
            abstractC4252j0 = null;
        }
        abstractC4252j0.f22041K.f21346z.setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.enrollment.storeLocation.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StoreListActivity.S1(this.f107085a, view);
            }
        });
        AbstractC4252j0 abstractC4252j02 = this.binding;
        if (abstractC4252j02 == null) {
            Intrinsics.x("binding");
            abstractC4252j02 = null;
        }
        RecyclerView recyclerView = abstractC4252j02.f22042L;
        k kVar = this.storeAdapter;
        if (kVar == null) {
            Intrinsics.x("storeAdapter");
            kVar = null;
        }
        recyclerView.setAdapter(kVar);
        recyclerView.addItemDecoration(new androidx.recyclerview.widget.i(recyclerView.getContext(), 1));
        AbstractC4252j0 abstractC4252j03 = this.binding;
        if (abstractC4252j03 == null) {
            Intrinsics.x("binding");
            abstractC4252j03 = null;
        }
        abstractC4252j03.f22045O.setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.enrollment.storeLocation.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StoreListActivity.T1(this.f107086a, view);
            }
        });
        AbstractC4252j0 abstractC4252j04 = this.binding;
        if (abstractC4252j04 == null) {
            Intrinsics.x("binding");
            abstractC4252j04 = null;
        }
        Ds.p.e(abstractC4252j04.f22043M.f21398A);
        AbstractC4252j0 abstractC4252j05 = this.binding;
        if (abstractC4252j05 == null) {
            Intrinsics.x("binding");
            abstractC4252j05 = null;
        }
        abstractC4252j05.f22043M.f21398A.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.meijer.mobile.meijer.activity.enrollment.storeLocation.e
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
                return StoreListActivity.U1(this.f107087a, textView, i10, keyEvent);
            }
        });
        AbstractC4252j0 abstractC4252j06 = this.binding;
        if (abstractC4252j06 == null) {
            Intrinsics.x("binding");
            abstractC4252j06 = null;
        }
        abstractC4252j06.f22043M.f21401z.setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.enrollment.storeLocation.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StoreListActivity.V1(this.f107088a, view);
            }
        });
        if (stringExtra != null && stringExtra.length() != 0 && stringExtra2 != null && stringExtra2.length() != 0) {
            P1().x(new a.FetchStoresWithLocationPermission(Double.parseDouble(stringExtra), Double.parseDouble(stringExtra2)));
        } else {
            P1().x(new a.SearchWithZipOrAddress(""));
        }
        C15809k.d(C6173t.a(this), null, null, new b(stringExtra, stringExtra2, null), 3, null);
    }
}
