package com.meijer.mobile.meijer.activity.find.viewmodel;

import Co.Department;
import Nn.AbstractC4271o;
import Sn.a;
import V2.CreationExtras;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.view.C6173t;
import androidx.view.ComponentActivity;
import androidx.view.f0;
import androidx.viewpager2.widget.ViewPager2;
import bk.AbstractC6392a;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.d;
import com.meijer.mobile.meijer.activity.cart.CartActivity;
import com.meijer.mobile.meijer.activity.find.SearchProductActivity;
import com.meijer.mobile.meijer.activity.find.viewmodel.C12354d;
import com.meijer.mobile.meijer.activity.find.viewmodel.C12383i;
import com.meijer.mobile.meijer.activity.find.viewmodel.DepartmentItemDecorator;
import ee.C13790a;
import ii.C14756c;
import ii.TrackingData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import ju.C15069d;
import kotlin.Lazy;
import kotlin.LazyKt;
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
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import nk.l;
import pv.C16563h;
import tr.C17283a;
import zl.AbstractC18503f;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0014¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u0004J\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0014\u001a\u00020\u00072\b\b\u0002\u0010\u0013\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0014\u0010\u0012J\u000f\u0010\u0015\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0015\u0010\u0004J\u000f\u0010\u0016\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0016\u0010\u0004J?\u0010\u001b\u001a\u0004\u0018\u00010\u000f2\"\u0010\u0019\u001a\u001e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u0017j\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f`\u00182\b\u0010\u001a\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 JG\u0010&\u001a\"\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0017j\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f\u0018\u0001`\u00182\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!2\b\u0010%\u001a\u0004\u0018\u00010$H\u0002¢\u0006\u0004\b&\u0010'J\u0019\u0010)\u001a\u0004\u0018\u00010\u000f2\u0006\u0010(\u001a\u00020\u000fH\u0002¢\u0006\u0004\b)\u0010*R\u001b\u00100\u001a\u00020+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0016\u00104\u001a\u0002018\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b2\u00103R\u001c\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u0010:\u001a\u0002078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u001b\u0010?\u001a\u00020;8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b<\u0010-\u001a\u0004\b=\u0010>R\u0014\u0010C\u001a\u00020@8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bA\u0010BR\u0014\u0010F\u001a\u0002078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0016\u0010I\u001a\u0004\u0018\u00010\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bG\u0010HR\u0016\u0010L\u001a\u0004\u0018\u00010\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u0016\u0010N\u001a\u0004\u0018\u00010\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bM\u0010K¨\u0006O"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/TierDepartmentsActivity;", "Lcom/meijer/mobile/meijer/activity/MeijerActivity;", "LBj/b;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "e2", "LCo/b;", "department", "m2", "(LCo/b;)V", "", "departmentId", "T1", "(Ljava/lang/String;)V", "deepLinkUri", "f2", "d2", "c2", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "breadcrumbs", "carouselTitle", "n2", "(Ljava/util/HashMap;Ljava/lang/String;)Ljava/lang/String;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/d$a$a;", "action", "k2", "(Lcom/meijer/mobile/meijer/activity/find/viewmodel/d$a$a;)V", "Lju/d;", "Lju/g;", "breadcrumbsAdapter", "Lnk/l$c;", "productQueryIntent", "W1", "(Lju/d;Lnk/l$c;)Ljava/util/HashMap;", "title", "S1", "(Ljava/lang/String;)Ljava/lang/String;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/i;", "s", "Lkotlin/Lazy;", "Y1", "()Lcom/meijer/mobile/meijer/activity/find/viewmodel/i;", "departmentTierViewModel", "LNn/o;", "t", "LNn/o;", "binding", "u", "Lju/d;", "", "v", "Z", "showAllDeepLink", "Lee/a;", "w", "V1", "()Lee/a;", "cartBadge", "Landroidx/appcompat/widget/Toolbar;", "y", "()Landroidx/appcompat/widget/Toolbar;", "toolbar", "Z1", "()Z", "loadRootDepartment", "a2", "()LCo/b;", "loadSubdepartment", "b2", "()Ljava/lang/String;", "marketingDeeplink", "X1", "departmentCarouselAnalytics", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class TierDepartmentsActivity extends Hilt_TierDepartmentsActivity implements Bj.b {

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private AbstractC4271o binding;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private C15069d<ju.g> breadcrumbsAdapter;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final Lazy departmentTierViewModel = new androidx.view.e0(Reflection.b(C12383i.class), new g(this), new f(this), new h(null, this));

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private boolean showAllDeepLink = true;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final Lazy cartBadge = LazyKt.b(new Function0() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.R1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return TierDepartmentsActivity.R1(this.f108954a);
        }
    });

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DepartmentItemDecorator.b.values().length];
            try {
                iArr[DepartmentItemDecorator.b.f109275a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DepartmentItemDecorator.b.f109276b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/meijer/mobile/meijer/activity/find/viewmodel/TierDepartmentsActivity$b", "Landroidx/activity/F;", "", "handleOnBackPressed", "()V", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends androidx.view.F {
        b() {
            super(true);
        }

        @Override // androidx.view.F
        public void handleOnBackPressed() {
            TierDepartmentsActivity.this.e2();
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/meijer/mobile/meijer/activity/find/viewmodel/TierDepartmentsActivity$c", "Landroidx/viewpager2/widget/ViewPager2$i;", "", "position", "", "onPageSelected", "(I)V", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c extends ViewPager2.i {
        c() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.i
        public void onPageSelected(int position) {
            Toolbar toolbarY = TierDepartmentsActivity.this.y();
            AbstractC6392a.Companion companion = AbstractC6392a.INSTANCE;
            int i10 = Cj.o.f5014E0;
            C15069d c15069d = TierDepartmentsActivity.this.breadcrumbsAdapter;
            if (c15069d == null) {
                Intrinsics.x("breadcrumbsAdapter");
                c15069d = null;
            }
            ju.h hVarJ = c15069d.j(position);
            Intrinsics.h(hVarJ, "null cannot be cast to non-null type com.meijer.mobile.meijer.activity.find.viewmodel.DepartmentListPage");
            ck.k.a(toolbarY, companion.d(i10, ((C12374f) hVarJ).C()));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/i$f;", "viewState", "", "<anonymous>", "(Lcom/meijer/mobile/meijer/activity/find/viewmodel/i$f;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.TierDepartmentsActivity$onCreate$8", f = "TierDepartmentsActivity.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class d extends SuspendLambda implements Function2<C12383i.ViewState, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f108968a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f108969b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* synthetic */ class a extends FunctionReferenceImpl implements Function1<C12354d.a.GoTo, Unit> {
            a(Object obj) {
                super(1, obj, TierDepartmentsActivity.class, "onDepartmentItemSelected", "onDepartmentItemSelected(Lcom/meijer/mobile/meijer/activity/find/viewmodel/DepartmentItem$Action$GoTo;)V", 0);
            }

            public final void a(C12354d.a.GoTo p02) {
                Intrinsics.j(p02, "p0");
                ((TierDepartmentsActivity) this.receiver).k2(p02);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C12354d.a.GoTo goTo) {
                a(goTo);
                return Unit.f143329a;
            }
        }

        d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            d dVar = TierDepartmentsActivity.this.new d(continuation);
            dVar.f108969b = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C12383i.ViewState viewState, Continuation<? super Unit> continuation) {
            return ((d) create(viewState, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Uri uri;
            Parcelable parcelable;
            IntrinsicsKt.f();
            if (this.f108968a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            C12383i.ViewState viewState = (C12383i.ViewState) this.f108969b;
            if (viewState.getCartDecorator().getIsAvailable()) {
                C13790a c13790aV1 = TierDepartmentsActivity.this.V1();
                c13790aV1.R(viewState.getCartDecorator().getItemCount());
                c13790aV1.setVisible(c13790aV1.z() && c13790aV1.o() > 0, true);
                Rj.a.a(TierDepartmentsActivity.this.y(), com.meijer.mobile.meijer.T.f99907c4, c13790aV1);
            }
            C12383i.LoadingState networkCallInProgress = viewState.getNetworkCallInProgress();
            TierDepartmentsActivity tierDepartmentsActivity = TierDepartmentsActivity.this;
            AbstractC4271o abstractC4271o = tierDepartmentsActivity.binding;
            AbstractC4271o abstractC4271o2 = null;
            if (abstractC4271o == null) {
                Intrinsics.x("binding");
                abstractC4271o = null;
            }
            abstractC4271o.f22160C.U(networkCallInProgress.getMessage(), networkCallInProgress.getIsLoading());
            if (networkCallInProgress.getIsLoading()) {
                AbstractC4271o abstractC4271o3 = tierDepartmentsActivity.binding;
                if (abstractC4271o3 == null) {
                    Intrinsics.x("binding");
                    abstractC4271o3 = null;
                }
                View root = abstractC4271o3.f22159B.getRoot();
                Intrinsics.i(root, "getRoot(...)");
                root.setVisibility(8);
                AbstractC4271o abstractC4271o4 = tierDepartmentsActivity.binding;
                if (abstractC4271o4 == null) {
                    Intrinsics.x("binding");
                    abstractC4271o4 = null;
                }
                ViewPager2 departmentPager = abstractC4271o4.f22158A;
                Intrinsics.i(departmentPager, "departmentPager");
                departmentPager.setVisibility(8);
            }
            C15069d c15069d = TierDepartmentsActivity.this.breadcrumbsAdapter;
            if (c15069d == null) {
                Intrinsics.x("breadcrumbsAdapter");
                c15069d = null;
            }
            List<DepartmentItemDecorator> listC = viewState.c();
            TierDepartmentsActivity tierDepartmentsActivity2 = TierDepartmentsActivity.this;
            ArrayList arrayList = new ArrayList(CollectionsKt.x(listC, 10));
            Iterator<T> it = listC.iterator();
            while (it.hasNext()) {
                arrayList.add(new C12374f((DepartmentItemDecorator) it.next(), new a(tierDepartmentsActivity2), viewState.c(), tierDepartmentsActivity2.a2()));
            }
            c15069d.x(arrayList);
            String strB2 = TierDepartmentsActivity.this.b2();
            if (strB2 != null && strB2.length() != 0 && !viewState.c().isEmpty() && !viewState.getNetworkCallInProgress().getIsLoading() && TierDepartmentsActivity.this.showAllDeepLink) {
                TierDepartmentsActivity.this.showAllDeepLink = false;
                TierDepartmentsActivity tierDepartmentsActivity3 = TierDepartmentsActivity.this;
                Bl.g featureEntryPoint = tierDepartmentsActivity3.getFeatureEntryPoint();
                Department department = ((DepartmentItemDecorator) CollectionsKt.s0(viewState.c())).getDepartment();
                l.Department department2 = new l.Department(department.getId(), department.getName());
                String strB22 = TierDepartmentsActivity.this.b2();
                String strA = strB22 != null ? T1.a(strB22) : null;
                Intent intent = TierDepartmentsActivity.this.getIntent();
                if (intent != null) {
                    if (Build.VERSION.SDK_INT >= 33) {
                        parcelable = (Parcelable) intent.getParcelableExtra("product_sort_filter_deeplink", Uri.class);
                    } else {
                        Parcelable parcelableExtra = intent.getParcelableExtra("product_sort_filter_deeplink");
                        if (!(parcelableExtra instanceof Uri)) {
                            parcelableExtra = null;
                        }
                        parcelable = (Uri) parcelableExtra;
                    }
                    uri = (Uri) parcelable;
                } else {
                    uri = null;
                }
                tierDepartmentsActivity3.startActivity(Bl.g.k(featureEntryPoint, department2, strA, null, uri, null, false, 52, null));
            }
            AbstractC4271o abstractC4271o5 = TierDepartmentsActivity.this.binding;
            if (abstractC4271o5 == null) {
                Intrinsics.x("binding");
            } else {
                abstractC4271o2 = abstractC4271o5;
            }
            ViewPager2 viewPager2 = abstractC4271o2.f22158A;
            Intrinsics.g(viewPager2);
            viewPager2.setVisibility(viewState.c().isEmpty() ? 8 : 0);
            viewPager2.j(CollectionsKt.o(viewState.c()), true);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class f extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f108974f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ComponentActivity componentActivity) {
            super(0);
            this.f108974f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f108974f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class g extends Lambda implements Function0<androidx.view.g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f108975f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ComponentActivity componentActivity) {
            super(0);
            this.f108975f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.view.g0 invoke() {
            return this.f108975f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class h extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f108976f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f108977g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f108976f = function0;
            this.f108977g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f108976f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f108977g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j2(TierDepartmentsActivity tierDepartmentsActivity, View view) {
        U1(tierDepartmentsActivity, null, 1, null);
    }

    private final String n2(HashMap<String, String> breadcrumbs, String carouselTitle) {
        if (carouselTitle == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(carouselTitle);
        Iterator<Map.Entry<String, String>> it = breadcrumbs.entrySet().iterator();
        while (it.hasNext()) {
            sb2.append(it.next().getValue());
            sb2.append(":");
        }
        String string = sb2.toString();
        Intrinsics.i(string, "toString(...)");
        return StringsKt.A1(string, ":", null, 2, null);
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/i$d;", "event", "", "<anonymous>", "(Lcom/meijer/mobile/meijer/activity/find/viewmodel/i$d;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.TierDepartmentsActivity$onCreate$9", f = "TierDepartmentsActivity.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class e extends SuspendLambda implements Function2<C12383i.d, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f108971a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f108972b;

        e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            e eVar = TierDepartmentsActivity.this.new e(continuation);
            eVar.f108972b = obj;
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C12383i.d dVar, Continuation<? super Unit> continuation) {
            return ((e) create(dVar, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f108971a == 0) {
                ResultKt.b(obj);
                C12383i.d dVar = (C12383i.d) this.f108972b;
                if (dVar instanceof C12383i.d.DepartmentErrorEvent) {
                    AbstractC4271o abstractC4271o = TierDepartmentsActivity.this.binding;
                    AbstractC4271o abstractC4271o2 = null;
                    if (abstractC4271o == null) {
                        Intrinsics.x("binding");
                        abstractC4271o = null;
                    }
                    abstractC4271o.f22159B.f22143D.setText(((C12383i.d.DepartmentErrorEvent) dVar).getRetrofitException().c(TierDepartmentsActivity.this));
                    AbstractC4271o abstractC4271o3 = TierDepartmentsActivity.this.binding;
                    if (abstractC4271o3 == null) {
                        Intrinsics.x("binding");
                    } else {
                        abstractC4271o2 = abstractC4271o3;
                    }
                    View root = abstractC4271o2.f22159B.getRoot();
                    Intrinsics.i(root, "getRoot(...)");
                    root.setVisibility(0);
                    return Unit.f143329a;
                }
                throw new NoWhenBranchMatchedException();
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    private final String S1(String title) {
        if (StringsKt.d0(title, "L1", false, 2, null)) {
            return "category_l1";
        }
        if (StringsKt.d0(title, "L2", false, 2, null)) {
            return "category_l2";
        }
        if (StringsKt.d0(title, "L3", false, 2, null)) {
            return "category_l3";
        }
        if (StringsKt.d0(title, "L4", false, 2, null)) {
            return "category_l4";
        }
        return null;
    }

    static /* synthetic */ void U1(TierDepartmentsActivity tierDepartmentsActivity, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "";
        }
        tierDepartmentsActivity.T1(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C13790a V1() {
        return (C13790a) this.cartBadge.getValue();
    }

    private final C12383i Y1() {
        return (C12383i) this.departmentTierViewModel.getValue();
    }

    private final void c2() {
        startActivity(new Intent(this, (Class<?>) CartActivity.class));
    }

    private final void d2() {
        startActivity(new Intent(this, (Class<?>) SearchProductActivity.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e2() {
        AbstractC4271o abstractC4271o = this.binding;
        if (abstractC4271o == null) {
            Intrinsics.x("binding");
            abstractC4271o = null;
        }
        ViewPager2 viewPager2 = abstractC4271o.f22158A;
        if (viewPager2.getCurrentItem() > 0) {
            viewPager2.j(viewPager2.getCurrentItem() - 1, true);
        } else {
            finish();
        }
        Y1().C();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h2(TierDepartmentsActivity tierDepartmentsActivity, a.AbstractC0780a item) {
        Intrinsics.j(item, "item");
        if (Intrinsics.e(item, a.AbstractC0780a.C0781a.f34922a)) {
            tierDepartmentsActivity.d2();
        } else {
            if (!Intrinsics.e(item, a.AbstractC0780a.b.f34923a)) {
                throw new NoWhenBranchMatchedException();
            }
            tierDepartmentsActivity.c2();
        }
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i2(TierDepartmentsActivity tierDepartmentsActivity, TabLayout.f tab, int i10) {
        Intrinsics.j(tab, "tab");
        C15069d<ju.g> c15069d = tierDepartmentsActivity.breadcrumbsAdapter;
        if (c15069d == null) {
            Intrinsics.x("breadcrumbsAdapter");
            c15069d = null;
        }
        ju.h hVarJ = c15069d.j(i10);
        Intrinsics.h(hVarJ, "null cannot be cast to non-null type com.meijer.mobile.meijer.activity.find.viewmodel.DepartmentListPage");
        tab.r(((C12374f) hVarJ).C());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l2(C12354d.a.GoTo goTo, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.h("tier", goTo.getDepartmentItemDecorator().getDepartment().getId());
        track.h("tierName", goTo.getDepartmentItemDecorator().getDepartment().getName());
        return Unit.f143329a;
    }

    @Override // Bj.b
    public Toolbar y() {
        AbstractC4271o abstractC4271o = this.binding;
        if (abstractC4271o == null) {
            Intrinsics.x("binding");
            abstractC4271o = null;
        }
        MaterialToolbar toolbar = abstractC4271o.f22161D;
        Intrinsics.i(toolbar, "toolbar");
        return toolbar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C13790a R1(TierDepartmentsActivity tierDepartmentsActivity) {
        C13790a c13790aE = C13790a.e(tierDepartmentsActivity);
        c13790aE.V(false);
        c13790aE.N(C17283a.f163260c);
        Intrinsics.i(c13790aE, "apply(...)");
        return c13790aE;
    }

    private final void T1(String departmentId) {
        Y1().A(new C12383i.c.FetchDepartmentByDepartmentId(departmentId));
    }

    private final HashMap<String, String> W1(C15069d<ju.g> breadcrumbsAdapter, l.Department productQueryIntent) {
        String strS1;
        C12374f c12374f = null;
        if (breadcrumbsAdapter.i() <= 0) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ju.h hVarJ = breadcrumbsAdapter.j(0);
        if (hVarJ instanceof C12374f) {
            c12374f = (C12374f) hVarJ;
        }
        if (c12374f != null) {
            for (DepartmentItemDecorator departmentItemDecorator : c12374f.B()) {
                String strS12 = S1(departmentItemDecorator.getDepartment().getId());
                if (strS12 != null) {
                    linkedHashMap.put(strS12, departmentItemDecorator.getDepartment().getName());
                }
            }
            if (productQueryIntent != null && (strS1 = S1(productQueryIntent.getId())) != null) {
                linkedHashMap.put(strS1, productQueryIntent.getName());
            }
        }
        return linkedHashMap;
    }

    private final String X1() {
        Intent intent = getIntent();
        if (intent != null) {
            return intent.getStringExtra("broseDepartmentCarouselAnalytics");
        }
        return null;
    }

    private final boolean Z1() {
        return getIntent().getBooleanExtra("com.meijer.mobile.meijer.activity.find.viewmodel.DepartmentTierActivity.EXTRA_DEPARTMENT_TIER_ROOT", false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Department a2() {
        Parcelable parcelable;
        Intent intent = getIntent();
        if (intent != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) intent.getParcelableExtra("com.meijer.mobile.meijer.activity.find.viewmodel.DepartmentTierActivity.EXTRA_LOAD_SUBDEPARTMENT", l.Department.class);
            } else {
                Parcelable parcelableExtra = intent.getParcelableExtra("com.meijer.mobile.meijer.activity.find.viewmodel.DepartmentTierActivity.EXTRA_LOAD_SUBDEPARTMENT");
                if (!(parcelableExtra instanceof l.Department)) {
                    parcelableExtra = null;
                }
                parcelable = (l.Department) parcelableExtra;
            }
            l.Department department = (l.Department) parcelable;
            if (department != null) {
                return new Department(null, null, department.getId(), department.getName(), null, false, null, null, 243, null);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String b2() {
        Intent intent = getIntent();
        if (intent != null) {
            return intent.getStringExtra("com.meijer.mobile.meijer.activity.find.viewmodel.TierDepartmentsActivity.EXTRA_MARKETING_DEEPLINK");
        }
        return null;
    }

    private final void f2(String deepLinkUri) {
        Y1().A(new C12383i.c.FindDepartmentByName(deepLinkUri));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g2(TierDepartmentsActivity tierDepartmentsActivity) {
        tierDepartmentsActivity.e2();
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k2(final C12354d.a.GoTo action) {
        l.Department department;
        String strN2;
        int i10 = a.$EnumSwitchMapping$0[action.getDepartmentItemDecorator().getDestination().ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                String stringExtra = getIntent().getStringExtra("homePageCarouselAnalytics");
                C15069d<ju.g> c15069d = this.breadcrumbsAdapter;
                String strN22 = null;
                if (c15069d == null) {
                    Intrinsics.x("breadcrumbsAdapter");
                    c15069d = null;
                }
                nk.l lVarE = action.getDepartmentItemDecorator().getDepartment().e();
                if (lVarE instanceof l.Department) {
                    department = (l.Department) lVarE;
                } else {
                    department = null;
                }
                HashMap<String, String> mapW1 = W1(c15069d, department);
                Bl.g featureEntryPoint = getFeatureEntryPoint();
                nk.l lVarE2 = action.getDepartmentItemDecorator().getDepartment().e();
                if (mapW1 != null) {
                    strN22 = n2(mapW1, X1());
                }
                Intent intentK = Bl.g.k(featureEntryPoint, lVarE2, null, mapW1, null, strN22, false, 42, null);
                if (stringExtra != null) {
                    if (mapW1 != null && (strN2 = n2(mapW1, stringExtra)) != null) {
                        stringExtra = strN2;
                    }
                    intentK.putExtra("homePageCarouselAnalytics", stringExtra);
                }
                startActivity(intentK);
                return;
            }
            throw new NoWhenBranchMatchedException();
        }
        getAnalyticsEngine().b(C14756c.a("Event:NextSubDepartment"), new Function1() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.S1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TierDepartmentsActivity.l2(action, (TrackingData) obj);
            }
        });
        Y1().A(new C12383i.c.PopulateSubDepartmentsAction(action.getDepartmentItemDecorator().getDepartment()));
    }

    private final void m2(Department department) {
        Toolbar toolbarY = y();
        toolbarY.setTitle(department.getName());
        Aj.c.b(toolbarY, false, 1, null);
        Y1().A(new C12383i.c.PopulateSubDepartmentsAction(department));
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        String id2;
        List<Department> listF;
        super.onCreate(savedInstanceState);
        getOnBackPressedDispatcher().i(this, new b());
        AbstractC4271o abstractC4271oM0 = AbstractC4271o.M0(getLayoutInflater());
        this.binding = abstractC4271oM0;
        if (abstractC4271oM0 == null) {
            Intrinsics.x("binding");
            abstractC4271oM0 = null;
        }
        int i10 = 0;
        setContentView(Zr.a.j(abstractC4271oM0.getRoot(), false, 1, null));
        if (a2() != null) {
            ck.c.b(this, 0, Cj.d.f4638b, Cj.d.f4639c, 0, 8, null);
        }
        String strB2 = b2();
        if (strB2 != null && strB2.length() != 0) {
            f2(String.valueOf(b2()));
        } else if (a2() != null) {
            Department departmentA2 = a2();
            if (departmentA2 != null && (listF = departmentA2.f()) != null && (!listF.isEmpty())) {
                Department departmentA22 = a2();
                if (departmentA22 != null) {
                    m2(departmentA22);
                }
            } else {
                Department departmentA23 = a2();
                if (departmentA23 != null) {
                    id2 = departmentA23.getId();
                } else {
                    id2 = null;
                }
                if (id2 == null) {
                    id2 = "";
                }
                T1(id2);
            }
        } else if (Z1()) {
            U1(this, null, 1, null);
        } else {
            U1(this, null, 1, null);
        }
        Bj.b.o(this, 0, 0, new Function0() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.N1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TierDepartmentsActivity.g2(this.f108946a);
            }
        }, 3, null);
        Rj.a.a(y(), com.meijer.mobile.meijer.T.f99907c4, V1());
        y().setOnMenuItemClickListener(new Sn.a(new Function1() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.O1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TierDepartmentsActivity.h2(this.f108948a, (a.AbstractC0780a) obj);
            }
        }));
        this.breadcrumbsAdapter = new C15069d<>();
        AbstractC4271o abstractC4271o = this.binding;
        if (abstractC4271o == null) {
            Intrinsics.x("binding");
            abstractC4271o = null;
        }
        TabLayout departmentBreadcrumbs = abstractC4271o.f22162z;
        Intrinsics.i(departmentBreadcrumbs, "departmentBreadcrumbs");
        if (!getFeatureManager().e(AbstractC18503f.C18512j.f172884h)) {
            i10 = 8;
        }
        departmentBreadcrumbs.setVisibility(i10);
        AbstractC4271o abstractC4271o2 = this.binding;
        if (abstractC4271o2 == null) {
            Intrinsics.x("binding");
            abstractC4271o2 = null;
        }
        ViewPager2 viewPager2 = abstractC4271o2.f22158A;
        C15069d<ju.g> c15069d = this.breadcrumbsAdapter;
        if (c15069d == null) {
            Intrinsics.x("breadcrumbsAdapter");
            c15069d = null;
        }
        viewPager2.setAdapter(c15069d);
        AbstractC4271o abstractC4271o3 = this.binding;
        if (abstractC4271o3 == null) {
            Intrinsics.x("binding");
            abstractC4271o3 = null;
        }
        TabLayout tabLayout = abstractC4271o3.f22162z;
        AbstractC4271o abstractC4271o4 = this.binding;
        if (abstractC4271o4 == null) {
            Intrinsics.x("binding");
            abstractC4271o4 = null;
        }
        new com.google.android.material.tabs.d(tabLayout, abstractC4271o4.f22158A, new d.b() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.P1
            @Override // com.google.android.material.tabs.d.b
            public final void onConfigureTab(TabLayout.f fVar, int i11) {
                TierDepartmentsActivity.i2(this.f108950a, fVar, i11);
            }
        }).a();
        AbstractC4271o abstractC4271o5 = this.binding;
        if (abstractC4271o5 == null) {
            Intrinsics.x("binding");
            abstractC4271o5 = null;
        }
        abstractC4271o5.f22159B.f22141B.setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.Q1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TierDepartmentsActivity.j2(this.f108952a, view);
            }
        });
        AbstractC4271o abstractC4271o6 = this.binding;
        if (abstractC4271o6 == null) {
            Intrinsics.x("binding");
            abstractC4271o6 = null;
        }
        abstractC4271o6.f22158A.g(new c());
        C16563h.J(C16563h.O(Y1().y(), new d(null)), C6173t.a(this));
        C16563h.J(C16563h.O(Y1().getEvents(), new e(null)), C6173t.a(this));
    }
}
