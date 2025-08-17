package com.meijer.mobile.meijer.activity.enrollment;

import Hk.Validation;
import Hk.c;
import V2.CreationExtras;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.Toolbar;
import androidx.view.C6031t;
import androidx.view.ComponentActivity;
import androidx.view.e0;
import androidx.view.f0;
import androidx.view.g0;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.textfield.TextInputEditText;
import com.meijer.mobile.core.design.widget.checkoutprogressstepperview.ProgressIndicatorView;
import com.meijer.mobile.core.design.widget.enhancedtextinputlayoutview.EnhancedTextInputLayoutView;
import com.meijer.mobile.meijer.Y;
import com.meijer.mobile.meijer.activity.enrollment.n;
import je.C14886b;
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
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference0Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty0;
import tv.C17154h;
import yr.Q;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 42\u00020\u00012\u00020\u0002:\u00017B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0014¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u0004J\u000f\u0010\u000f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\u0004J\u000f\u0010\u0010\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0010\u0010\u0004J\u000f\u0010\u0011\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0011\u0010\u0004J\u000f\u0010\u0012\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0012\u0010\u0004J\u000f\u0010\u0013\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0013\u0010\u0004J\u0017\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0014H\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0014H\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0014H\u0003¢\u0006\u0004\b\u0019\u0010\u0017J\u0019\u0010\u001c\u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001e\u0010\u0004J\u0017\u0010!\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b#\u0010\u0017J\u000f\u0010$\u001a\u00020\u0007H\u0002¢\u0006\u0004\b$\u0010\u0004R\u0016\u0010(\u001a\u00020%8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b&\u0010'R\u001b\u0010.\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0016\u00102\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00106\u001a\u0002038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u00105¨\u00068"}, d2 = {"Lcom/meijer/mobile/meijer/activity/enrollment/PhoneEnrollmentActivity;", "Lcom/meijer/mobile/meijer/activity/MeijerActivity;", "LAj/b;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "", "errorString", "h2", "(Ljava/lang/String;)V", "j2", "n2", "g2", "q2", "X1", "Y1", "Lcom/meijer/mobile/meijer/activity/enrollment/v;", "viewState", "i2", "(Lcom/meijer/mobile/meijer/activity/enrollment/v;)V", "k2", "f2", "Lcom/meijer/mobile/meijer/activity/enrollment/n$d;", "fields", "b2", "(Lcom/meijer/mobile/meijer/activity/enrollment/n$d;)V", "a2", "Lcom/meijer/mobile/core/design/widget/enhancedtextinputlayoutview/EnhancedTextInputLayoutView;", "enhancedTextInputLayoutView", "m2", "(Lcom/meijer/mobile/core/design/widget/enhancedtextinputlayoutview/EnhancedTextInputLayoutView;)V", "l2", "s2", "LMn/G;", "s", "LMn/G;", "binding", "Lcom/meijer/mobile/meijer/activity/enrollment/n;", "t", "Lkotlin/Lazy;", "Z1", "()Lcom/meijer/mobile/meijer/activity/enrollment/n;", "viewModel", "", "u", "Z", "submitAttempted", "Landroidx/appcompat/widget/Toolbar;", "v", "()Landroidx/appcompat/widget/Toolbar;", "toolbar", "a", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class PhoneEnrollmentActivity extends Hilt_PhoneEnrollmentActivity implements Aj.b {

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: w, reason: collision with root package name */
    public static final int f105905w = 8;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private Mn.G binding;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final Lazy viewModel = new e0(Reflection.b(n.class), new g(this), new f(this), new h(null, this));

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private boolean submitAttempted;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/meijer/mobile/meijer/activity/enrollment/PhoneEnrollmentActivity$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "a", "(Landroid/content/Context;)Landroid/content/Intent;", "", "MPERKS_PHONE_NUMBER_INVALID_ERROR", "Ljava/lang/String;", "MPERKS_PHONE_NUMBER_IN_USE_ERROR", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.enrollment.PhoneEnrollmentActivity$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final Intent a(Context context) {
            Intrinsics.j(context, "context");
            return new Intent(context, (Class<?>) PhoneEnrollmentActivity.class);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[n.d.values().length];
            try {
                iArr[n.d.f105997a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[n.d.f105998b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class f extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f105912f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ComponentActivity componentActivity) {
            super(0);
            this.f105912f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f105912f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class g extends Lambda implements Function0<g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f105913f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ComponentActivity componentActivity) {
            super(0);
            this.f105913f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final g0 invoke() {
            return this.f105913f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class h extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f105914f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f105915g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f105914f = function0;
            this.f105915g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f105914f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f105915g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J1\u0010\r\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJ1\u0010\u0010\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u000e¨\u0006\u0011"}, d2 = {"androidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1", "Landroid/text/TextWatcher;", "Landroid/text/Editable;", "s", "", "afterTextChanged", "(Landroid/text/Editable;)V", "", "text", "", "start", "count", "after", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", "before", "onTextChanged", "core-ktx_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class i implements TextWatcher {
        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence text, int start, int count, int after) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence text, int start, int before, int count) {
        }

        public i() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable s10) throws NumberFormatException {
            String string;
            if (PhoneEnrollmentActivity.this.submitAttempted) {
                PhoneEnrollmentActivity.this.X1();
            }
            if (s10 == null || (string = s10.toString()) == null) {
                return;
            }
            PhoneEnrollmentActivity.this.Z1().x(new n.a.SetPhoneNumber(string));
            Mn.G g10 = PhoneEnrollmentActivity.this.binding;
            Mn.G g11 = null;
            if (g10 == null) {
                Intrinsics.y("binding");
                g10 = null;
            }
            CharSequence charSequenceA = Ds.g.a(g10.f20022G.getText());
            Intrinsics.i(charSequenceA, "formatForDisplay(...)");
            String string2 = charSequenceA.toString();
            Mn.G g12 = PhoneEnrollmentActivity.this.binding;
            if (g12 == null) {
                Intrinsics.y("binding");
                g12 = null;
            }
            if (!Intrinsics.e(string2, String.valueOf(g12.f20022G.getText()))) {
                Mn.G g13 = PhoneEnrollmentActivity.this.binding;
                if (g13 == null) {
                    Intrinsics.y("binding");
                    g13 = null;
                }
                g13.f20022G.setText(charSequenceA);
            }
            Mn.G g14 = PhoneEnrollmentActivity.this.binding;
            if (g14 == null) {
                Intrinsics.y("binding");
                g14 = null;
            }
            TextInputEditText textInputEditText = g14.f20022G;
            Mn.G g15 = PhoneEnrollmentActivity.this.binding;
            if (g15 == null) {
                Intrinsics.y("binding");
            } else {
                g11 = g15;
            }
            textInputEditText.setSelection(String.valueOf(g11.f20022G.getText()).length());
            if (PhoneEnrollmentActivity.this.submitAttempted) {
                PhoneEnrollmentActivity.this.Z1().x(n.a.l.f105984a);
            }
        }
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J1\u0010\r\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJ1\u0010\u0010\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u000e¨\u0006\u0011"}, d2 = {"androidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1", "Landroid/text/TextWatcher;", "Landroid/text/Editable;", "s", "", "afterTextChanged", "(Landroid/text/Editable;)V", "", "text", "", "start", "count", "after", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", "before", "onTextChanged", "core-ktx_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class j implements TextWatcher {
        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence text, int start, int count, int after) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence text, int start, int before, int count) {
        }

        public j() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable s10) throws NumberFormatException {
            String string;
            if (PhoneEnrollmentActivity.this.submitAttempted) {
                PhoneEnrollmentActivity.this.Y1();
            }
            if (s10 == null || (string = s10.toString()) == null) {
                return;
            }
            PhoneEnrollmentActivity.this.Z1().x(new n.a.SetPinNumber(string));
            if (PhoneEnrollmentActivity.this.submitAttempted) {
                PhoneEnrollmentActivity.this.Z1().x(n.a.m.f105985a);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d2(PhoneEnrollmentActivity phoneEnrollmentActivity, View view) throws NumberFormatException {
        phoneEnrollmentActivity.submitAttempted = true;
        phoneEnrollmentActivity.a2();
        phoneEnrollmentActivity.Z1().x(n.a.i.f105977a);
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/meijer/mobile/meijer/activity/enrollment/n$c;", "event", "", "<anonymous>", "(Lcom/meijer/mobile/meijer/activity/enrollment/n$c;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.enrollment.PhoneEnrollmentActivity$onCreate$4", f = "PhoneEnrollmentActivity.kt", l = {}, m = "invokeSuspend")
    static final class c extends SuspendLambda implements Function2<n.c, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f105909a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f105910b;

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            c cVar = PhoneEnrollmentActivity.this.new c(continuation);
            cVar.f105910b = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(n.c cVar, Continuation<? super Unit> continuation) {
            return ((c) create(cVar, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws NumberFormatException {
            String string;
            String string2;
            IntrinsicsKt.f();
            if (this.f105909a == 0) {
                ResultKt.b(obj);
                n.c cVar = (n.c) this.f105910b;
                Mn.G g10 = null;
                if (cVar instanceof n.c.C1578c) {
                    n nVarZ1 = PhoneEnrollmentActivity.this.Z1();
                    Mn.G g11 = PhoneEnrollmentActivity.this.binding;
                    if (g11 == null) {
                        Intrinsics.y("binding");
                        g11 = null;
                    }
                    Editable text = g11.f20022G.getText();
                    if (text != null) {
                        string = text.toString();
                    } else {
                        string = null;
                    }
                    Intrinsics.g(string);
                    Mn.G g12 = PhoneEnrollmentActivity.this.binding;
                    if (g12 == null) {
                        Intrinsics.y("binding");
                        g12 = null;
                    }
                    Editable text2 = g12.f20024I.getText();
                    if (text2 != null) {
                        string2 = text2.toString();
                    } else {
                        string2 = null;
                    }
                    Mn.G g13 = PhoneEnrollmentActivity.this.binding;
                    if (g13 == null) {
                        Intrinsics.y("binding");
                        g13 = null;
                    }
                    boolean zIsChecked = g13.f20036U.isChecked();
                    Mn.G g14 = PhoneEnrollmentActivity.this.binding;
                    if (g14 == null) {
                        Intrinsics.y("binding");
                    } else {
                        g10 = g14;
                    }
                    nVarZ1.x(new n.a.SetMperksAccountDetails(string, string2, zIsChecked, g10.f20040Y.isChecked()));
                    PhoneEnrollmentActivity phoneEnrollmentActivity = PhoneEnrollmentActivity.this;
                    phoneEnrollmentActivity.startActivity(StoreActivity.INSTANCE.a(phoneEnrollmentActivity));
                } else if (cVar instanceof n.c.SetupProgressIndicatorEvent) {
                    PhoneEnrollmentActivity.this.l2(((n.c.SetupProgressIndicatorEvent) cVar).getPhoneEnrollmentViewState());
                } else if (cVar instanceof n.c.ErrorFocusEvent) {
                    n.c.ErrorFocusEvent errorFocusEvent = (n.c.ErrorFocusEvent) cVar;
                    PhoneEnrollmentActivity.this.b2(errorFocusEvent.getMperksPhoneField());
                    PhoneEnrollmentActivity.this.f2(errorFocusEvent.getPhoneEnrollmentViewState());
                } else if (cVar instanceof n.c.SetPhoneNumberFieldErrors) {
                    PhoneEnrollmentActivity.this.i2(((n.c.SetPhoneNumberFieldErrors) cVar).getPhoneEnrollmentViewState());
                } else if (cVar instanceof n.c.SetPinFieldErrors) {
                    PhoneEnrollmentActivity.this.k2(((n.c.SetPinFieldErrors) cVar).getPhoneEnrollmentViewState());
                } else if (cVar instanceof n.c.SetFieldErrors) {
                    PhoneEnrollmentActivity.this.f2(((n.c.SetFieldErrors) cVar).getPhoneEnrollmentViewState());
                } else if (cVar instanceof n.c.a) {
                    n nVarZ12 = PhoneEnrollmentActivity.this.Z1();
                    Mn.G g15 = PhoneEnrollmentActivity.this.binding;
                    if (g15 == null) {
                        Intrinsics.y("binding");
                        g15 = null;
                    }
                    String strValueOf = String.valueOf(g15.f20022G.getText());
                    Mn.G g16 = PhoneEnrollmentActivity.this.binding;
                    if (g16 == null) {
                        Intrinsics.y("binding");
                    } else {
                        g10 = g16;
                    }
                    nVarZ12.x(new n.a.ValidatePhoneNumber(strValueOf, g10.f20036U.isChecked()));
                } else if (cVar instanceof n.c.e) {
                    PhoneEnrollmentActivity.this.j2();
                } else if (cVar instanceof n.c.d) {
                    PhoneEnrollmentActivity.this.g2();
                } else if (cVar instanceof n.c.PhoneRetrofitError) {
                    PhoneEnrollmentActivity.this.h2(((n.c.PhoneRetrofitError) cVar).getErrorMessage().c(PhoneEnrollmentActivity.this));
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void X1() {
        Mn.G g10 = this.binding;
        if (g10 == null) {
            Intrinsics.y("binding");
            g10 = null;
        }
        g10.f20023H.setError((CharSequence) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Y1() {
        Mn.G g10 = this.binding;
        if (g10 == null) {
            Intrinsics.y("binding");
            g10 = null;
        }
        g10.f20025J.setError((CharSequence) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final n Z1() {
        return (n) this.viewModel.getValue();
    }

    private final void a2() {
        InputMethodManager inputMethodManager = (InputMethodManager) Z1.b.j(this, InputMethodManager.class);
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(getWindow().getDecorView().getWindowToken(), 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"RestrictedApi"})
    public final void b2(n.d fields) {
        if (fields == null) {
            return;
        }
        int i10 = b.$EnumSwitchMapping$0[fields.ordinal()];
        Mn.G g10 = null;
        if (i10 == 1) {
            Mn.G g11 = this.binding;
            if (g11 == null) {
                Intrinsics.y("binding");
                g11 = null;
            }
            g11.f20023H.clearFocus();
            Mn.G g12 = this.binding;
            if (g12 == null) {
                Intrinsics.y("binding");
                g12 = null;
            }
            g12.f20023H.requestFocus();
            Mn.G g13 = this.binding;
            if (g13 == null) {
                Intrinsics.y("binding");
                g13 = null;
            }
            g13.f20023H.setFocusableInTouchMode(true);
            Mn.G g14 = this.binding;
            if (g14 == null) {
                Intrinsics.y("binding");
            } else {
                g10 = g14;
            }
            EnhancedTextInputLayoutView mperksPhoneInputLayout = g10.f20023H;
            Intrinsics.i(mperksPhoneInputLayout, "mperksPhoneInputLayout");
            m2(mperksPhoneInputLayout);
            return;
        }
        if (i10 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        Mn.G g15 = this.binding;
        if (g15 == null) {
            Intrinsics.y("binding");
            g15 = null;
        }
        g15.f20025J.clearFocus();
        Mn.G g16 = this.binding;
        if (g16 == null) {
            Intrinsics.y("binding");
            g16 = null;
        }
        g16.f20025J.requestFocus();
        Mn.G g17 = this.binding;
        if (g17 == null) {
            Intrinsics.y("binding");
            g17 = null;
        }
        g17.f20025J.setFocusableInTouchMode(true);
        Mn.G g18 = this.binding;
        if (g18 == null) {
            Intrinsics.y("binding");
        } else {
            g10 = g18;
        }
        EnhancedTextInputLayoutView mperksPinInputLayout = g10.f20025J;
        Intrinsics.i(mperksPinInputLayout, "mperksPinInputLayout");
        m2(mperksPinInputLayout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h2(String errorString) {
        Mn.G g10 = this.binding;
        if (g10 == null) {
            Intrinsics.y("binding");
            g10 = null;
        }
        g10.f20023H.setError(errorString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j2() {
        Mn.G g10 = this.binding;
        if (g10 == null) {
            Intrinsics.y("binding");
            g10 = null;
        }
        g10.f20023H.setError("We found an account associated with this number. Please sign in or enter a different number.");
        n2();
    }

    private final void m2(EnhancedTextInputLayoutView enhancedTextInputLayoutView) {
        InputMethodManager inputMethodManager = (InputMethodManager) Z1.b.j(this, InputMethodManager.class);
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(enhancedTextInputLayoutView, 1);
        }
    }

    private final void n2() {
        new C14886b(this, Bj.p.f3057a).setTitle(Y.f100034e5).setCancelable(true).setMessage(Y.f100014d5).setPositiveButton(Bj.o.f2971F0, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.enrollment.h
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                PhoneEnrollmentActivity.o2(this.f105947a, dialogInterface, i10);
            }
        }).setNegativeButton(Y.f100451z3, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.enrollment.i
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                PhoneEnrollmentActivity.p2(dialogInterface, i10);
            }
        }).show();
    }

    private final void q2() {
        new C14886b(this, Bj.p.f3057a).setTitle(Y.f100074g5).setCancelable(true).setMessage(Y.f100054f5).setPositiveButton(Q.f170986b, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.enrollment.j
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                PhoneEnrollmentActivity.r2(dialogInterface, i10);
            }
        }).show();
    }

    private final void s2() {
        Mn.G g10 = this.binding;
        Mn.G g11 = null;
        if (g10 == null) {
            Intrinsics.y("binding");
            g10 = null;
        }
        TextInputEditText mperksPhoneEntry = g10.f20022G;
        Intrinsics.i(mperksPhoneEntry, "mperksPhoneEntry");
        mperksPhoneEntry.addTextChangedListener(new i());
        Mn.G g12 = this.binding;
        if (g12 == null) {
            Intrinsics.y("binding");
            g12 = null;
        }
        TextInputEditText mperksPinEntry = g12.f20024I;
        Intrinsics.i(mperksPinEntry, "mperksPinEntry");
        mperksPinEntry.addTextChangedListener(new j());
        Mn.G g13 = this.binding;
        if (g13 == null) {
            Intrinsics.y("binding");
            g13 = null;
        }
        g13.f20036U.setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.enrollment.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws NumberFormatException {
                PhoneEnrollmentActivity.t2(this.f105945a, view);
            }
        });
        Mn.G g14 = this.binding;
        if (g14 == null) {
            Intrinsics.y("binding");
        } else {
            g11 = g14;
        }
        g11.f20040Y.setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.enrollment.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws NumberFormatException {
                PhoneEnrollmentActivity.u2(this.f105946a, view);
            }
        });
    }

    @Override // Aj.b
    public Toolbar v() {
        Mn.G g10 = this.binding;
        if (g10 == null) {
            Intrinsics.y("binding");
            g10 = null;
        }
        MaterialToolbar toolbar = g10.f20038W;
        Intrinsics.i(toolbar, "toolbar");
        return toolbar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c2(PhoneEnrollmentActivity phoneEnrollmentActivity) {
        if (!phoneEnrollmentActivity.onNavigateUp()) {
            phoneEnrollmentActivity.finish();
        }
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e2(PhoneEnrollmentActivity phoneEnrollmentActivity, View view) throws NumberFormatException {
        String string;
        String string2;
        n nVarZ1 = phoneEnrollmentActivity.Z1();
        Mn.G g10 = phoneEnrollmentActivity.binding;
        Mn.G g11 = null;
        if (g10 == null) {
            Intrinsics.y("binding");
            g10 = null;
        }
        Editable text = g10.f20022G.getText();
        if (text != null) {
            string = text.toString();
        } else {
            string = null;
        }
        Mn.G g12 = phoneEnrollmentActivity.binding;
        if (g12 == null) {
            Intrinsics.y("binding");
            g12 = null;
        }
        Editable text2 = g12.f20024I.getText();
        if (text2 != null) {
            string2 = text2.toString();
        } else {
            string2 = null;
        }
        Mn.G g13 = phoneEnrollmentActivity.binding;
        if (g13 == null) {
            Intrinsics.y("binding");
            g13 = null;
        }
        boolean zIsChecked = g13.f20036U.isChecked();
        Mn.G g14 = phoneEnrollmentActivity.binding;
        if (g14 == null) {
            Intrinsics.y("binding");
        } else {
            g11 = g14;
        }
        nVarZ1.x(new n.a.StoreExistingMperksDetails(string, string2, zIsChecked, g11.f20040Y.isChecked()));
        phoneEnrollmentActivity.startActivity(Al.k.b(phoneEnrollmentActivity, false, null, null, null, null, null, 126, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"RestrictedApi"})
    public final void f2(PhoneEnrollmentViewState viewState) {
        i2(viewState);
        k2(viewState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g2() {
        q2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"RestrictedApi"})
    public final void i2(PhoneEnrollmentViewState viewState) {
        Validation<String> validationK = viewState.k();
        Mn.G g10 = null;
        if (validationK.getIsValid()) {
            validationK = null;
        }
        if (validationK != null) {
            if (!validationK.c().contains(new c.Invalid((String) new PropertyReference0Impl(new PropertyReference0Impl(viewState) { // from class: com.meijer.mobile.meijer.activity.enrollment.PhoneEnrollmentActivity.e
                @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
                public Object get() {
                    return ((PhoneEnrollmentViewState) this.receiver).k();
                }
            }) { // from class: com.meijer.mobile.meijer.activity.enrollment.PhoneEnrollmentActivity.d
                @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
                public Object get() {
                    return ((KProperty0) this.receiver).getName();
                }
            }.get(), null, null, 6, null))) {
                validationK = null;
            }
            if (validationK != null) {
                Mn.G g11 = this.binding;
                if (g11 == null) {
                    Intrinsics.y("binding");
                } else {
                    g10 = g11;
                }
                g10.f20023H.setError("Please enter a 10-digit US phone number.");
                return;
            }
            Mn.G g12 = this.binding;
            if (g12 == null) {
                Intrinsics.y("binding");
            } else {
                g10 = g12;
            }
            g10.f20023H.setError("Please enter a 10-digit US phone number.");
            return;
        }
        Mn.G g13 = this.binding;
        if (g13 == null) {
            Intrinsics.y("binding");
            g13 = null;
        }
        g13.f20023H.setError((CharSequence) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"RestrictedApi"})
    public final void k2(PhoneEnrollmentViewState viewState) {
        Validation<String> validationL = viewState.l();
        String message = null;
        if (validationL.getIsValid()) {
            validationL = null;
        }
        if (validationL != null) {
            if (validationL.c().isEmpty()) {
                validationL = null;
            }
            if (validationL != null) {
                Mn.G g10 = this.binding;
                if (g10 == null) {
                    Intrinsics.y("binding");
                    g10 = null;
                }
                EnhancedTextInputLayoutView enhancedTextInputLayoutView = g10.f20025J;
                Hk.c cVar = (Hk.c) CollectionsKt.u0(validationL.c());
                if (cVar != null) {
                    message = cVar.getMessage();
                }
                enhancedTextInputLayoutView.setError(message);
                return;
            }
        }
        Mn.G g11 = this.binding;
        if (g11 == null) {
            Intrinsics.y("binding");
            g11 = null;
        }
        g11.f20025J.setError((CharSequence) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l2(PhoneEnrollmentViewState viewState) {
        Mn.G g10 = null;
        if (viewState.m().isEmpty()) {
            viewState = null;
        }
        if (viewState != null) {
            Mn.G g11 = this.binding;
            if (g11 == null) {
                Intrinsics.y("binding");
                g11 = null;
            }
            ProgressIndicatorView progressIndicatorView = g11.f20033R.f21049z;
            progressIndicatorView.setPadding((int) Ds.p.b(this, viewState.getHorizontalPaddingInDp()), progressIndicatorView.getPaddingTop(), (int) Ds.p.b(this, viewState.getHorizontalPaddingInDp()), progressIndicatorView.getPaddingBottom());
            progressIndicatorView.d(viewState.m(), viewState.getCurrentStep());
            Mn.G g12 = this.binding;
            if (g12 == null) {
                Intrinsics.y("binding");
            } else {
                g10 = g12;
            }
            g10.f20033R.f21047A.setVisibility(4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o2(PhoneEnrollmentActivity phoneEnrollmentActivity, DialogInterface dialogInterface, int i10) {
        dialogInterface.dismiss();
        phoneEnrollmentActivity.startActivity(Al.k.b(phoneEnrollmentActivity, false, null, null, null, null, null, 126, null));
        phoneEnrollmentActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p2(DialogInterface dialogInterface, int i10) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r2(DialogInterface dialogInterface, int i10) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t2(PhoneEnrollmentActivity phoneEnrollmentActivity, View view) throws NumberFormatException {
        n nVarZ1 = phoneEnrollmentActivity.Z1();
        Mn.G g10 = phoneEnrollmentActivity.binding;
        if (g10 == null) {
            Intrinsics.y("binding");
            g10 = null;
        }
        nVarZ1.x(new n.a.SetTextAdStatus(g10.f20036U.isChecked()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u2(PhoneEnrollmentActivity phoneEnrollmentActivity, View view) throws NumberFormatException {
        n nVarZ1 = phoneEnrollmentActivity.Z1();
        Mn.G g10 = phoneEnrollmentActivity.binding;
        if (g10 == null) {
            Intrinsics.y("binding");
            g10 = null;
        }
        nVarZ1.x(new n.a.SetWeeklyAdStatus(g10.f20040Y.isChecked()));
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) throws NumberFormatException {
        super.onCreate(savedInstanceState);
        Mn.G gK0 = Mn.G.K0(getLayoutInflater());
        this.binding = gK0;
        if (gK0 == null) {
            Intrinsics.y("binding");
            gK0 = null;
        }
        setContentView(Zr.a.j(gK0.getRoot(), false, 1, null));
        Z1().x(n.a.C1577a.f105963a);
        Aj.b.O0(this, 0, 0, new Function0() { // from class: com.meijer.mobile.meijer.activity.enrollment.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PhoneEnrollmentActivity.c2(this.f105942a);
            }
        }, 3, null);
        Mn.G g10 = this.binding;
        if (g10 == null) {
            Intrinsics.y("binding");
            g10 = null;
        }
        g10.f20017B.setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.enrollment.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws NumberFormatException {
                PhoneEnrollmentActivity.d2(this.f105943a, view);
            }
        });
        Mn.G g11 = this.binding;
        if (g11 == null) {
            Intrinsics.y("binding");
            g11 = null;
        }
        g11.f20021F.setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.enrollment.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws NumberFormatException {
                PhoneEnrollmentActivity.e2(this.f105944a, view);
            }
        });
        C17154h.J(C17154h.O(Z1().w(), new c(null)), C6031t.a(this));
        Z1().x(n.a.h.f105976a);
        s2();
    }
}
