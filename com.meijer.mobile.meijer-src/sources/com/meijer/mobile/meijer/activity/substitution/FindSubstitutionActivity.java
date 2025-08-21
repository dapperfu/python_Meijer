package com.meijer.mobile.meijer.activity.substitution;

import Ao.S;
import Co.ProductFullDetails;
import Nn.AbstractC4294u;
import V2.CreationExtras;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.view.AbstractC6165l;
import androidx.view.C6136J;
import androidx.view.C6173t;
import androidx.view.ComponentActivity;
import androidx.view.e0;
import androidx.view.f0;
import androidx.view.g0;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.snackbar.Snackbar;
import com.meijer.mobile.meijer.Y;
import com.meijer.mobile.meijer.activity.substitution.D;
import com.meijer.mobile.meijer.activity.substitution.FindSubstitutionActivity;
import com.meijer.mobile.meijer.activity.substitution.P;
import ek.C13806b;
import g.AbstractC14276c;
import g.C14274a;
import g.InterfaceC14275b;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import ju.C15069d;
import kotlin.Deprecated;
import kotlin.Function;
import kotlin.KotlinNothingValueException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import le.C15485b;
import mv.C15809k;
import mv.InterfaceC15783O;
import pv.C16563h;
import pv.InterfaceC16553F;
import pv.InterfaceC16562g;
import tr.C17284b;
import vs.CartProductListDecorator;
import vs.ProductListDecorator;
import zl.AbstractC18503f;

@Metadata(d1 = {"\u0000È\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\u0005J\u000f\u0010\f\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\u0005J)\u0010\u0013\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0017\u001a\u00020\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001b\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\bH\u0017¢\u0006\u0004\b\u001d\u0010\u0005J\u0017\u0010 \u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J/\u0010*\u001a\u00020\b2\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+J/\u0010,\u001a\u00020\b2\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b,\u0010+R\u0016\u00100\u001a\u00020-8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b.\u0010/R\u001b\u00106\u001a\u0002018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0016\u0010:\u001a\u0002078\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b8\u00109R\u001c\u0010?\u001a\b\u0012\u0004\u0012\u00020<0;8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010C\u001a\u00020@8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bA\u0010BR\"\u0010K\u001a\u00020D8\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\u001a\u0010P\u001a\b\u0012\u0004\u0012\u00020M0L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u001b\u0010U\u001a\u00020Q8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bR\u00103\u001a\u0004\bS\u0010TR\u001b\u0010Y\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bV\u00103\u001a\u0004\bW\u0010XR\u001b\u0010^\u001a\u00020Z8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b[\u00103\u001a\u0004\b\\\u0010]R\u001b\u0010c\u001a\u00020_8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b`\u00103\u001a\u0004\ba\u0010bR\u001d\u0010f\u001a\u0004\u0018\u00010_8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bd\u00103\u001a\u0004\be\u0010bR\u001d\u0010i\u001a\u0004\u0018\u00010_8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bg\u00103\u001a\u0004\bh\u0010bR\u0014\u0010l\u001a\u00020j8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bN\u0010k¨\u0006m"}, d2 = {"Lcom/meijer/mobile/meijer/activity/substitution/FindSubstitutionActivity;", "Lcom/meijer/mobile/meijer/activity/MeijerActivity;", "Lcom/meijer/mobile/meijer/activity/substitution/P$a;", "LBj/b;", "<init>", "()V", "Lg/a;", "result", "", "l2", "(Lg/a;)V", "n2", "U1", "Lnk/i;", "original", "Lnk/f;", "alternative", "", "overrideAlreadyInCart", "o2", "(Lnk/i;Lnk/f;Z)V", "Landroid/view/MotionEvent;", "ev", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onBackPressed", "Lcom/meijer/mobile/meijer/activity/substitution/H;", "item", "Z", "(Lcom/meijer/mobile/meijer/activity/substitution/H;)V", "LCo/h;", "productToAdd", "Lcom/meijer/mobile/core/design/widget/stepperview/a;", "controlState", "Landroid/graphics/Rect;", "stepperHitRect", "", "position", "Q0", "(LCo/h;Lcom/meijer/mobile/core/design/widget/stepperview/a;Landroid/graphics/Rect;I)V", "n0", "LNn/u;", "s", "LNn/u;", "binding", "Lcom/meijer/mobile/meijer/activity/substitution/D;", "t", "Lkotlin/Lazy;", "e2", "()Lcom/meijer/mobile/meijer/activity/substitution/D;", "viewModel", "Lju/l;", "u", "Lju/l;", "suggestionsSection", "Lju/d;", "Lju/g;", "v", "Lju/d;", "suggestionsAdapter", "Lcom/meijer/mobile/meijer/activity/substitution/Q;", "w", "Lcom/meijer/mobile/meijer/activity/substitution/Q;", "suggestedProductsPageAdapter", "LTq/j;", "x", "LTq/j;", "c2", "()LTq/j;", "setStoreProvider$Meijer_playstoreRelease", "(LTq/j;)V", "storeProvider", "Lg/c;", "Landroid/content/Intent;", "y", "Lg/c;", "searchResultLauncher", "Lvs/b;", "z", "a2", "()Lvs/b;", "itemToSubstitute", "A", "Z1", "()LCo/h;", "itemToFindSimilar", "LPp/c;", "B", "d2", "()LPp/c;", "substitutionMode", "", "C", "X1", "()Ljava/lang/String;", "analyticsSourcePageName", "D", "b2", "schoolName", "E", "Y1", "classroomName", "Landroidx/appcompat/widget/Toolbar;", "()Landroidx/appcompat/widget/Toolbar;", "toolbar", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class FindSubstitutionActivity extends Hilt_FindSubstitutionActivity implements P.a, Bj.b {

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private AbstractC4294u binding;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private ju.l suggestionsSection;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private C15069d<ju.g> suggestionsAdapter;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private Q suggestedProductsPageAdapter;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    public Tq.j storeProvider;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final Lazy viewModel = new e0(Reflection.b(D.class), new f(this), new e(this), new g(null, this));

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final AbstractC14276c<Intent> searchResultLauncher = registerForActivityResult(new h.i(), new d());

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final Lazy itemToSubstitute = LazyKt.b(new Function0() { // from class: com.meijer.mobile.meijer.activity.substitution.g
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FindSubstitutionActivity.g2(this.f113722a);
        }
    });

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    private final Lazy itemToFindSimilar = LazyKt.b(new Function0() { // from class: com.meijer.mobile.meijer.activity.substitution.h
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FindSubstitutionActivity.f2(this.f113723a);
        }
    });

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final Lazy substitutionMode = LazyKt.b(new Function0() { // from class: com.meijer.mobile.meijer.activity.substitution.i
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FindSubstitutionActivity.p2(this.f113724a);
        }
    });

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private final Lazy analyticsSourcePageName = LazyKt.b(new Function0() { // from class: com.meijer.mobile.meijer.activity.substitution.j
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FindSubstitutionActivity.V1(this.f113725a);
        }
    });

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private final Lazy schoolName = LazyKt.b(new Function0() { // from class: com.meijer.mobile.meijer.activity.substitution.k
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FindSubstitutionActivity.m2(this.f113726a);
        }
    });

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private final Lazy classroomName = LazyKt.b(new Function0() { // from class: com.meijer.mobile.meijer.activity.substitution.l
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FindSubstitutionActivity.W1(this.f113727a);
        }
    });

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Pp.c.values().length];
            try {
                iArr[Pp.c.f26248d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Pp.c.f26245a.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Pp.c.f26246b.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Pp.c.f26247c.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.substitution.FindSubstitutionActivity$onCreate$9", f = "FindSubstitutionActivity.kt", l = {280}, m = "invokeSuspend")
    static final class c extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f113616a;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.substitution.FindSubstitutionActivity$onCreate$9$1", f = "FindSubstitutionActivity.kt", l = {}, m = "invokeSuspend")
        static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f113618a;

            /* renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f113619b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ FindSubstitutionActivity f113620c;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.meijer.activity.substitution.FindSubstitutionActivity$onCreate$9$1$1", f = "FindSubstitutionActivity.kt", l = {282}, m = "invokeSuspend")
            /* renamed from: com.meijer.mobile.meijer.activity.substitution.FindSubstitutionActivity$c$a$a, reason: collision with other inner class name */
            static final class C1794a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f113621a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ FindSubstitutionActivity f113622b;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @SourceDebugExtension
                /* renamed from: com.meijer.mobile.meijer.activity.substitution.FindSubstitutionActivity$c$a$a$a, reason: collision with other inner class name */
                static final class C1795a<T> implements InterfaceC16562g {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ FindSubstitutionActivity f113623a;

                    C1795a(FindSubstitutionActivity findSubstitutionActivity) {
                        this.f113623a = findSubstitutionActivity;
                    }

                    @Override // pv.InterfaceC16562g
                    /* renamed from: g, reason: merged with bridge method [inline-methods] */
                    public final Object emit(D.e eVar, Continuation<? super Unit> continuation) throws Resources.NotFoundException {
                        if (eVar instanceof D.e.ShowErrorMessageEvent) {
                            D.e.ShowErrorMessageEvent showErrorMessageEvent = (D.e.ShowErrorMessageEvent) eVar;
                            new C15485b(this.f113623a).setTitle(showErrorMessageEvent.getTitle()).setMessage(showErrorMessageEvent.getBody()).setPositiveButton(yr.Q.f171761b, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.substitution.p
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i10) {
                                    FindSubstitutionActivity.c.a.C1794a.C1795a.h(dialogInterface, i10);
                                }
                            }).show();
                        } else if (eVar instanceof D.e.SuccessfullySubstituted) {
                            this.f113623a.n2();
                            this.f113623a.getAnalyticsEngine().k(S.f1688a.c(this.f113623a.X1(), ((D.e.SuccessfullySubstituted) eVar).getTrackingData()));
                        } else {
                            AbstractC4294u abstractC4294u = null;
                            if (eVar instanceof D.e.AddToCartSuccessEvent) {
                                AbstractC4294u abstractC4294u2 = this.f113623a.binding;
                                if (abstractC4294u2 == null) {
                                    Intrinsics.x("binding");
                                } else {
                                    abstractC4294u = abstractC4294u2;
                                }
                                D.e.AddToCartSuccessEvent addToCartSuccessEvent = (D.e.AddToCartSuccessEvent) eVar;
                                Snackbar snackbarQ0 = Snackbar.q0(abstractC4294u.getRoot(), addToCartSuccessEvent.getMessageResId(), 0);
                                int actionResId = addToCartSuccessEvent.getActionResId();
                                final FindSubstitutionActivity findSubstitutionActivity = this.f113623a;
                                snackbarQ0.t0(actionResId, new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.substitution.q
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        FindSubstitutionActivity.c.a.C1794a.C1795a.i(findSubstitutionActivity, view);
                                    }
                                }).c0();
                            } else if (eVar instanceof D.e.UpdateToCartFailedEvent) {
                                AbstractC4294u abstractC4294u3 = this.f113623a.binding;
                                if (abstractC4294u3 == null) {
                                    Intrinsics.x("binding");
                                    abstractC4294u3 = null;
                                }
                                View root = abstractC4294u3.getRoot();
                                String string = this.f113623a.getResources().getString(((D.e.UpdateToCartFailedEvent) eVar).getMessageResId());
                                Intrinsics.i(string, "getString(...)");
                                Snackbar snackbarR0 = Snackbar.r0(root, m2.b.a(string, 0, null, null), 0);
                                Intrinsics.i(snackbarR0, "make(...)");
                                Wj.b.b(snackbarR0).c0();
                            } else if (!Intrinsics.e(eVar, D.e.b.f113504a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                        }
                        return Unit.f143329a;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final void h(DialogInterface dialogInterface, int i10) {
                        dialogInterface.dismiss();
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final void i(FindSubstitutionActivity findSubstitutionActivity, View view) {
                        findSubstitutionActivity.startActivity(findSubstitutionActivity.getFeatureEntryPoint().d());
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1794a(FindSubstitutionActivity findSubstitutionActivity, Continuation<? super C1794a> continuation) {
                    super(2, continuation);
                    this.f113622b = findSubstitutionActivity;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C1794a(this.f113622b, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                    return ((C1794a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object objF = IntrinsicsKt.f();
                    int i10 = this.f113621a;
                    if (i10 != 0) {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.b(obj);
                    } else {
                        ResultKt.b(obj);
                        InterfaceC16553F<D.e> events = this.f113622b.e2().getEvents();
                        C1795a c1795a = new C1795a(this.f113622b);
                        this.f113621a = 1;
                        if (events.collect(c1795a, this) == objF) {
                            return objF;
                        }
                    }
                    throw new KotlinNothingValueException();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(FindSubstitutionActivity findSubstitutionActivity, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f113620c = findSubstitutionActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f113620c, continuation);
                aVar.f113619b = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.f();
                if (this.f113618a == 0) {
                    ResultKt.b(obj);
                    C15809k.d((InterfaceC15783O) this.f113619b, null, null, new C1794a(this.f113620c, null), 3, null);
                    return Unit.f143329a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FindSubstitutionActivity.this.new c(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((c) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f113616a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                FindSubstitutionActivity findSubstitutionActivity = FindSubstitutionActivity.this;
                AbstractC6165l.b bVar = AbstractC6165l.b.f55502d;
                a aVar = new a(findSubstitutionActivity, null);
                this.f113616a = 1;
                if (C6136J.b(findSubstitutionActivity, bVar, aVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class d implements InterfaceC14275b, FunctionAdapter {
        d() {
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC14275b) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.e(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, FindSubstitutionActivity.this, FindSubstitutionActivity.class, "onSearchResult", "onSearchResult(Landroidx/activity/result/ActivityResult;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // g.InterfaceC14275b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void a(C14274a p02) {
            Intrinsics.j(p02, "p0");
            FindSubstitutionActivity.this.l2(p02);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class e extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f113625f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ComponentActivity componentActivity) {
            super(0);
            this.f113625f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f113625f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class f extends Lambda implements Function0<g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f113626f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ComponentActivity componentActivity) {
            super(0);
            this.f113626f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final g0 invoke() {
            return this.f113626f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class g extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f113627f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f113628g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f113627f = function0;
            this.f113628g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f113627f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f113628g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Override // com.meijer.mobile.meijer.activity.substitution.P.a
    public void Q0(ProductFullDetails productToAdd, com.meijer.mobile.core.design.widget.stepperview.a controlState, Rect stepperHitRect, int position) {
        Intrinsics.j(productToAdd, "productToAdd");
        Intrinsics.j(controlState, "controlState");
        Intrinsics.j(stepperHitRect, "stepperHitRect");
    }

    @Override // com.meijer.mobile.meijer.activity.substitution.P.a
    public void n0(ProductFullDetails productToAdd, com.meijer.mobile.core.design.widget.stepperview.a controlState, Rect stepperHitRect, int position) {
        Intrinsics.j(productToAdd, "productToAdd");
        Intrinsics.j(controlState, "controlState");
        Intrinsics.j(stepperHitRect, "stepperHitRect");
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/meijer/mobile/meijer/activity/substitution/D$g;", "viewState", "", "<anonymous>", "(Lcom/meijer/mobile/meijer/activity/substitution/D$g;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.substitution.FindSubstitutionActivity$onCreate$8", f = "FindSubstitutionActivity.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class b extends SuspendLambda implements Function2<D.ViewState, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f113613a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f113614b;

        b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            b bVar = FindSubstitutionActivity.this.new b(continuation);
            bVar.f113614b = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(D.ViewState viewState, Continuation<? super Unit> continuation) {
            return ((b) create(viewState, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit k(FindSubstitutionActivity findSubstitutionActivity) {
            findSubstitutionActivity.onBackPressed();
            ck.c.b(findSubstitutionActivity, 0, 0, 0, 0, 8, null);
            return Unit.f143329a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            boolean z10;
            IntrinsicsKt.f();
            if (this.f113613a == 0) {
                ResultKt.b(obj);
                D.ViewState viewState = (D.ViewState) this.f113614b;
                AbstractC4294u abstractC4294u = FindSubstitutionActivity.this.binding;
                AbstractC4294u abstractC4294u2 = null;
                if (abstractC4294u == null) {
                    Intrinsics.x("binding");
                    abstractC4294u = null;
                }
                abstractC4294u.f22339P.W(viewState.getLoadingState().getIsLoading());
                AbstractC4294u abstractC4294u3 = FindSubstitutionActivity.this.binding;
                if (abstractC4294u3 == null) {
                    Intrinsics.x("binding");
                    abstractC4294u3 = null;
                }
                MaterialButton materialButton = abstractC4294u3.f22342S;
                boolean z11 = true;
                int i10 = 0;
                if (!viewState.getItemSelected() && !viewState.getDoNotSubstituteSelected()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                materialButton.setEnabled(z10);
                if (viewState.f().size() == 1) {
                    FindSubstitutionActivity.this.U1();
                }
                final FindSubstitutionActivity findSubstitutionActivity = FindSubstitutionActivity.this;
                Bj.b.o(findSubstitutionActivity, 0, 0, new Function0() { // from class: com.meijer.mobile.meijer.activity.substitution.o
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return FindSubstitutionActivity.b.k(findSubstitutionActivity);
                    }
                }, 3, null);
                AbstractC4294u abstractC4294u4 = FindSubstitutionActivity.this.binding;
                if (abstractC4294u4 == null) {
                    Intrinsics.x("binding");
                } else {
                    abstractC4294u2 = abstractC4294u4;
                }
                TextView textView = abstractC4294u2.f22332I;
                FindSubstitutionActivity findSubstitutionActivity2 = FindSubstitutionActivity.this;
                textView.setText(findSubstitutionActivity2.getString(C17284b.f163332l0, findSubstitutionActivity2.a2().getFormattedQuantity()));
                Intrinsics.g(textView);
                if (findSubstitutionActivity2.d2() != Pp.c.f26246b) {
                    z11 = false;
                }
                if (!z11) {
                    i10 = 8;
                }
                textView.setVisibility(i10);
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void U1() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
        AbstractC4294u abstractC4294u = this.binding;
        AbstractC4294u abstractC4294u2 = null;
        if (abstractC4294u == null) {
            Intrinsics.x("binding");
            abstractC4294u = null;
        }
        ConstraintLayout substitutionScreen = abstractC4294u.f22340Q;
        Intrinsics.i(substitutionScreen, "substitutionScreen");
        AbstractC4294u abstractC4294u3 = this.binding;
        if (abstractC4294u3 == null) {
            Intrinsics.x("binding");
            abstractC4294u3 = null;
        }
        cVar.g(abstractC4294u3.f22340Q);
        AbstractC4294u abstractC4294u4 = this.binding;
        if (abstractC4294u4 == null) {
            Intrinsics.x("binding");
        } else {
            abstractC4294u2 = abstractC4294u4;
        }
        cVar.e(abstractC4294u2.f22343T.getId(), 4);
        cVar.c(substitutionScreen);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String X1() {
        return (String) this.analyticsSourcePageName.getValue();
    }

    private final String Y1() {
        return (String) this.classroomName.getValue();
    }

    private final ProductFullDetails Z1() {
        return (ProductFullDetails) this.itemToFindSimilar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CartProductListDecorator a2() {
        return (CartProductListDecorator) this.itemToSubstitute.getValue();
    }

    private final String b2() {
        return (String) this.schoolName.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Pp.c d2() {
        return (Pp.c) this.substitutionMode.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final D e2() {
        return (D) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k2(FindSubstitutionActivity findSubstitutionActivity, View view) {
        Intent intentG;
        AbstractC14276c<Intent> abstractC14276c = findSubstitutionActivity.searchResultLauncher;
        if (findSubstitutionActivity.getFeatureManager().e(AbstractC18503f.t0.f172905h)) {
            intentG = Bl.h.c(findSubstitutionActivity, findSubstitutionActivity.d2().b(), null, null, false, null, 60, null);
            intentG.putExtra("selected.product", findSubstitutionActivity.a2());
        } else {
            intentG = Bl.h.g(findSubstitutionActivity, findSubstitutionActivity.d2().b(), null, null, false, null, 60, null);
            intentG.putExtra("selected.product", findSubstitutionActivity.a2());
        }
        abstractC14276c.a(intentG);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n2() {
        Intent intent = new Intent();
        intent.putExtra("com.meijer.mobile.meijer.activity.substitution.intent.extra.substitutionmode", d2());
        if (d2() == Pp.c.f26248d) {
            setResult(867530912, intent);
        } else {
            setResult(8675309, intent);
        }
        finish();
    }

    @Override // com.meijer.mobile.meijer.activity.substitution.P.a
    public void Z(SuggestedItemDecorator item) {
        Intrinsics.j(item, "item");
        e2().V(item);
    }

    public final Tq.j c2() {
        Tq.j jVar = this.storeProvider;
        if (jVar != null) {
            return jVar;
        }
        Intrinsics.x("storeProvider");
        return null;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent ev2) {
        Q q10 = this.suggestedProductsPageAdapter;
        if (q10 == null) {
            Intrinsics.x("suggestedProductsPageAdapter");
            q10 = null;
        }
        q10.h(ev2);
        return super.dispatchTouchEvent(ev2);
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    @Deprecated
    public void onBackPressed() {
        AbstractC4294u abstractC4294u = this.binding;
        AbstractC4294u abstractC4294u2 = null;
        if (abstractC4294u == null) {
            Intrinsics.x("binding");
            abstractC4294u = null;
        }
        Group itemToSubstituteGroup = abstractC4294u.f22325B;
        Intrinsics.i(itemToSubstituteGroup, "itemToSubstituteGroup");
        itemToSubstituteGroup.setVisibility(0);
        AbstractC4294u abstractC4294u3 = this.binding;
        if (abstractC4294u3 == null) {
            Intrinsics.x("binding");
            abstractC4294u3 = null;
        }
        ViewPager2 viewPager2 = abstractC4294u3.f22343T;
        if (viewPager2.getCurrentItem() > 0) {
            viewPager2.j(viewPager2.getCurrentItem() - 1, false);
            return;
        }
        AbstractC4294u abstractC4294u4 = this.binding;
        if (abstractC4294u4 == null) {
            Intrinsics.x("binding");
        } else {
            abstractC4294u2 = abstractC4294u4;
        }
        if (abstractC4294u2.f22342S.isEnabled()) {
            new C15485b(this).setTitle(C17284b.f163289N0).setMessage(d2() == Pp.c.f26245a ? C17284b.f163285L0 : C17284b.f163287M0).setPositiveButton(Y.f100558Md, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.substitution.e
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    FindSubstitutionActivity.h2(this.f113720a, dialogInterface, i10);
                }
            }).setNegativeButton(C17284b.f163283K0, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.substitution.f
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    FindSubstitutionActivity.i2(this.f113721a, dialogInterface, i10);
                }
            }).show();
        } else {
            setResult(867530913);
            super.onBackPressed();
        }
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AbstractC4294u abstractC4294uM0 = AbstractC4294u.M0(getLayoutInflater());
        this.binding = abstractC4294uM0;
        if (abstractC4294uM0 == null) {
            Intrinsics.x("binding");
            abstractC4294uM0 = null;
        }
        setContentView(Zr.a.j(abstractC4294uM0.getRoot(), false, 1, null));
        AbstractC4294u abstractC4294u = this.binding;
        if (abstractC4294u == null) {
            Intrinsics.x("binding");
            abstractC4294u = null;
        }
        MaterialToolbar materialToolbar = abstractC4294u.f22333J;
        int i10 = a.$EnumSwitchMapping$0[d2().ordinal()];
        if (i10 == 1) {
            materialToolbar.setTitle(C17284b.f163298S);
        } else if (i10 == 2) {
            materialToolbar.setTitle(C17284b.f163311b);
        } else if (i10 == 3) {
            materialToolbar.setTitle(C17284b.f163328j0);
        } else {
            if (i10 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            materialToolbar.setTitle(C17284b.f163326i0);
        }
        if (d2() == Pp.c.f26245a || d2() == Pp.c.f26248d) {
            AbstractC4294u abstractC4294u2 = this.binding;
            if (abstractC4294u2 == null) {
                Intrinsics.x("binding");
                abstractC4294u2 = null;
            }
            abstractC4294u2.f22342S.setText(C17284b.f163338o0);
            AbstractC4294u abstractC4294u3 = this.binding;
            if (abstractC4294u3 == null) {
                Intrinsics.x("binding");
                abstractC4294u3 = null;
            }
            abstractC4294u3.f22327D.setText(C17284b.f163354w0);
            AbstractC4294u abstractC4294u4 = this.binding;
            if (abstractC4294u4 == null) {
                Intrinsics.x("binding");
                abstractC4294u4 = null;
            }
            abstractC4294u4.f22326C.setText(C17284b.f163356x0);
        } else {
            AbstractC4294u abstractC4294u5 = this.binding;
            if (abstractC4294u5 == null) {
                Intrinsics.x("binding");
                abstractC4294u5 = null;
            }
            abstractC4294u5.f22342S.setText(C17284b.f163291O0);
            AbstractC4294u abstractC4294u6 = this.binding;
            if (abstractC4294u6 == null) {
                Intrinsics.x("binding");
                abstractC4294u6 = null;
            }
            abstractC4294u6.f22327D.setText(C17284b.f163267C0);
            AbstractC4294u abstractC4294u7 = this.binding;
            if (abstractC4294u7 == null) {
                Intrinsics.x("binding");
                abstractC4294u7 = null;
            }
            abstractC4294u7.f22326C.setText(C17284b.f163265B0);
        }
        if (d2() == Pp.c.f26246b) {
            AbstractC4294u abstractC4294u8 = this.binding;
            if (abstractC4294u8 == null) {
                Intrinsics.x("binding");
                abstractC4294u8 = null;
            }
            MaterialButton substitutionSearch = abstractC4294u8.f22341R;
            Intrinsics.i(substitutionSearch, "substitutionSearch");
            substitutionSearch.setVisibility(0);
            AbstractC4294u abstractC4294u9 = this.binding;
            if (abstractC4294u9 == null) {
                Intrinsics.x("binding");
                abstractC4294u9 = null;
            }
            View substitutionDivider3 = abstractC4294u9.f22336M;
            Intrinsics.i(substitutionDivider3, "substitutionDivider3");
            substitutionDivider3.setVisibility(0);
            AbstractC4294u abstractC4294u10 = this.binding;
            if (abstractC4294u10 == null) {
                Intrinsics.x("binding");
                abstractC4294u10 = null;
            }
            View substitutionDivider2 = abstractC4294u10.f22335L;
            Intrinsics.i(substitutionDivider2, "substitutionDivider2");
            substitutionDivider2.setVisibility(0);
        }
        Pp.c cVarD2 = d2();
        Pp.c cVar = Pp.c.f26247c;
        if (cVarD2 == cVar) {
            AbstractC4294u abstractC4294u11 = this.binding;
            if (abstractC4294u11 == null) {
                Intrinsics.x("binding");
                abstractC4294u11 = null;
            }
            abstractC4294u11.f22328E.setContent(C12655a.f113692a.b());
            AbstractC4294u abstractC4294u12 = this.binding;
            if (abstractC4294u12 == null) {
                Intrinsics.x("binding");
                abstractC4294u12 = null;
            }
            abstractC4294u12.f22324A.setVisibility(8);
            AbstractC4294u abstractC4294u13 = this.binding;
            if (abstractC4294u13 == null) {
                Intrinsics.x("binding");
                abstractC4294u13 = null;
            }
            ComposeView stockStatus = abstractC4294u13.f22328E;
            Intrinsics.i(stockStatus, "stockStatus");
            stockStatus.setVisibility(0);
        }
        this.suggestedProductsPageAdapter = new Q(this, getFeatureManager().e(AbstractC18503f.T.f172859h));
        ju.l lVar = new ju.l();
        lVar.O(true);
        this.suggestionsSection = lVar;
        C15069d<ju.g> c15069d = new C15069d<>();
        ju.l lVar2 = this.suggestionsSection;
        if (lVar2 == null) {
            Intrinsics.x("suggestionsSection");
            lVar2 = null;
        }
        c15069d.c(lVar2);
        this.suggestionsAdapter = c15069d;
        AbstractC4294u abstractC4294u14 = this.binding;
        if (abstractC4294u14 == null) {
            Intrinsics.x("binding");
            abstractC4294u14 = null;
        }
        ViewPager2 viewPager2 = abstractC4294u14.f22343T;
        Q q10 = this.suggestedProductsPageAdapter;
        if (q10 == null) {
            Intrinsics.x("suggestedProductsPageAdapter");
            q10 = null;
        }
        viewPager2.setAdapter(q10);
        AbstractC4294u abstractC4294u15 = this.binding;
        if (abstractC4294u15 == null) {
            Intrinsics.x("binding");
            abstractC4294u15 = null;
        }
        abstractC4294u15.f22341R.setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.substitution.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FindSubstitutionActivity.k2(this.f113728a, view);
            }
        });
        AbstractC4294u abstractC4294u16 = this.binding;
        if (abstractC4294u16 == null) {
            Intrinsics.x("binding");
            abstractC4294u16 = null;
        }
        abstractC4294u16.f22338O.setText(d2() != cVar ? a2().getProduct().getName() : Z1().getName());
        AbstractC4294u abstractC4294u17 = this.binding;
        if (abstractC4294u17 == null) {
            Intrinsics.x("binding");
            abstractC4294u17 = null;
        }
        abstractC4294u17.f22331H.setText(d2() != cVar ? a2().getProduct().getPrice().getFormattedValue() : Z1().getPrice().getFormattedValue());
        if (d2() != cVar) {
            e2().T(a2(), c2().g(), d2());
        } else {
            e2().O(Z1(), c2().g(), d2(), b2(), Y1());
        }
        AbstractC4294u abstractC4294u18 = this.binding;
        if (abstractC4294u18 == null) {
            Intrinsics.x("binding");
            abstractC4294u18 = null;
        }
        ImageView substitutionProductImage = abstractC4294u18.f22337N;
        Intrinsics.i(substitutionProductImage, "substitutionProductImage");
        C13806b.f(substitutionProductImage, d2() != cVar ? a2().w() : ProductListDecorator.Companion.b(ProductListDecorator.INSTANCE, Z1(), null, null, null, false, null, null, false, null, null, null, false, null, null, false, 0, 65534, null).getThumbnailUrl(), null, null, 6, null);
        AbstractC4294u abstractC4294u19 = this.binding;
        if (abstractC4294u19 == null) {
            Intrinsics.x("binding");
            abstractC4294u19 = null;
        }
        abstractC4294u19.f22342S.setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.substitution.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FindSubstitutionActivity.j2(this.f113729a, view);
            }
        });
        C16563h.J(C16563h.O(e2().U(), new b(null)), C6173t.a(this));
        C15809k.d(C6173t.a(this), null, null, new c(null), 3, null);
    }

    @Override // Bj.b
    public Toolbar y() {
        AbstractC4294u abstractC4294u = this.binding;
        if (abstractC4294u == null) {
            Intrinsics.x("binding");
            abstractC4294u = null;
        }
        MaterialToolbar substituteToolbar = abstractC4294u.f22333J;
        Intrinsics.i(substituteToolbar, "substituteToolbar");
        return substituteToolbar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String V1(FindSubstitutionActivity findSubstitutionActivity) {
        String stringExtra = findSubstitutionActivity.getIntent().getStringExtra("com.meijer.mobile.meijer.activity.substitution.intent.extra.sourcePageName");
        Intrinsics.g(stringExtra);
        return stringExtra;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String W1(FindSubstitutionActivity findSubstitutionActivity) {
        return findSubstitutionActivity.getIntent().getStringExtra("com.meijer.mobile.meijer.activity.substitution.intent.extra.classroomName");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProductFullDetails f2(FindSubstitutionActivity findSubstitutionActivity) {
        Object obj;
        Intent intent = findSubstitutionActivity.getIntent();
        Intrinsics.i(intent, "getIntent(...)");
        if (Build.VERSION.SDK_INT >= 33) {
            obj = (Parcelable) intent.getParcelableExtra("com.meijer.mobile.meijer.activity.substitution.intent.extra.itemToFindSimilar", ProductFullDetails.class);
        } else {
            Parcelable parcelableExtra = intent.getParcelableExtra("com.meijer.mobile.meijer.activity.substitution.intent.extra.itemToFindSimilar");
            if (!(parcelableExtra instanceof ProductFullDetails)) {
                parcelableExtra = null;
            }
            obj = (ProductFullDetails) parcelableExtra;
        }
        Intrinsics.g(obj);
        return (ProductFullDetails) obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CartProductListDecorator g2(FindSubstitutionActivity findSubstitutionActivity) {
        Parcelable parcelable;
        Intent intent = findSubstitutionActivity.getIntent();
        Intrinsics.i(intent, "getIntent(...)");
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable = (Parcelable) intent.getParcelableExtra("com.meijer.mobile.meijer.activity.substitution.intent.extra.itemToSubstitute", CartProductListDecorator.class);
        } else {
            Parcelable parcelableExtra = intent.getParcelableExtra("com.meijer.mobile.meijer.activity.substitution.intent.extra.itemToSubstitute");
            if (!(parcelableExtra instanceof CartProductListDecorator)) {
                parcelableExtra = null;
            }
            parcelable = (CartProductListDecorator) parcelableExtra;
        }
        CartProductListDecorator cartProductListDecorator = (CartProductListDecorator) parcelable;
        if (cartProductListDecorator == null) {
            return new CartProductListDecorator(0, null, null, null, null, false, false, 0.0d, false, null, null, null, null, 0.0d, null, null, false, 131071, null);
        }
        return cartProductListDecorator;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h2(FindSubstitutionActivity findSubstitutionActivity, DialogInterface dialogInterface, int i10) {
        ProductFullDetails product;
        Object next;
        dialogInterface.dismiss();
        CartProductListDecorator cartProductListDecoratorA2 = findSubstitutionActivity.a2();
        Iterator<T> it = findSubstitutionActivity.e2().U().getValue().f().iterator();
        while (true) {
            product = null;
            if (it.hasNext()) {
                next = it.next();
                if (((SuggestedItemDecorator) next).getIsSelected()) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        SuggestedItemDecorator suggestedItemDecorator = (SuggestedItemDecorator) next;
        if (suggestedItemDecorator != null) {
            product = suggestedItemDecorator.getProduct();
        }
        findSubstitutionActivity.o2(cartProductListDecoratorA2, product, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i2(FindSubstitutionActivity findSubstitutionActivity, DialogInterface dialogInterface, int i10) {
        findSubstitutionActivity.setResult(867530913);
        findSubstitutionActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j2(FindSubstitutionActivity findSubstitutionActivity, View view) {
        ProductFullDetails product;
        Object next;
        CartProductListDecorator cartProductListDecoratorA2 = findSubstitutionActivity.a2();
        Iterator<T> it = findSubstitutionActivity.e2().U().getValue().f().iterator();
        while (true) {
            product = null;
            if (it.hasNext()) {
                next = it.next();
                if (((SuggestedItemDecorator) next).getIsSelected()) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        SuggestedItemDecorator suggestedItemDecorator = (SuggestedItemDecorator) next;
        if (suggestedItemDecorator != null) {
            product = suggestedItemDecorator.getProduct();
        }
        findSubstitutionActivity.o2(cartProductListDecoratorA2, product, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l2(C14274a result) {
        if (result.getResultCode() == -1) {
            n2();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String m2(FindSubstitutionActivity findSubstitutionActivity) {
        return findSubstitutionActivity.getIntent().getStringExtra("com.meijer.mobile.meijer.activity.substitution.intent.extra.schoolName");
    }

    private final void o2(nk.i original, nk.f alternative, boolean overrideAlreadyInCart) {
        if (d2() == Pp.c.f26246b) {
            e2().i0(overrideAlreadyInCart);
        } else {
            e2().g0(original, alternative);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pp.c p2(FindSubstitutionActivity findSubstitutionActivity) {
        Object serializableExtra;
        if (Intrinsics.e(findSubstitutionActivity.getIntent().getStringExtra("com.meijer.mobile.meijer.activity.substitution.intent.extra.substitutionmode"), "SubstitutionMode.OutOfStockFindSimilar")) {
            return Pp.c.f26247c;
        }
        Intent intent = findSubstitutionActivity.getIntent();
        Intrinsics.i(intent, "getIntent(...)");
        if (Build.VERSION.SDK_INT >= 33) {
            serializableExtra = intent.getSerializableExtra("com.meijer.mobile.meijer.activity.substitution.intent.extra.substitutionmode", Pp.c.class);
        } else {
            Serializable serializableExtra2 = intent.getSerializableExtra("com.meijer.mobile.meijer.activity.substitution.intent.extra.substitutionmode");
            if (!(serializableExtra2 instanceof Pp.c)) {
                serializableExtra2 = null;
            }
            serializableExtra = (Pp.c) serializableExtra2;
        }
        Intrinsics.g(serializableExtra);
        return (Pp.c) serializableExtra;
    }
}
