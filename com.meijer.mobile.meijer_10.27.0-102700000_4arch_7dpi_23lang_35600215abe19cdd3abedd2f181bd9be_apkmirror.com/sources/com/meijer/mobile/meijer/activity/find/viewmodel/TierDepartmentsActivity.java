package com.meijer.mobile.meijer.activity.find.viewmodel;

import Co.Department;
import Mn.AbstractC4266o;
import Rn.a;
import V2.CreationExtras;
import ak.AbstractC5607a;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.view.C6031t;
import androidx.view.ComponentActivity;
import androidx.view.f0;
import androidx.viewpager2.widget.ViewPager2;
import ce.C6386a;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.d;
import com.meijer.mobile.meijer.activity.cart.CartActivity;
import com.meijer.mobile.meijer.activity.find.SearchProductActivity;
import com.meijer.mobile.meijer.activity.find.viewmodel.C12229d;
import com.meijer.mobile.meijer.activity.find.viewmodel.C12258i;
import com.meijer.mobile.meijer.activity.find.viewmodel.DepartmentItemDecorator;
import hi.C14476c;
import hi.TrackingData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
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
import mk.l;
import nu.C15949d;
import tr.C17134a;
import tv.C17154h;
import yl.AbstractC18227f;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0014¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u0004J\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0014\u001a\u00020\u00072\b\b\u0002\u0010\u0013\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0014\u0010\u0012J\u000f\u0010\u0015\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0015\u0010\u0004J\u000f\u0010\u0016\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0016\u0010\u0004J?\u0010\u001b\u001a\u0004\u0018\u00010\u000f2\"\u0010\u0019\u001a\u001e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u0017j\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f`\u00182\b\u0010\u001a\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 JG\u0010&\u001a\"\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0017j\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f\u0018\u0001`\u00182\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!2\b\u0010%\u001a\u0004\u0018\u00010$H\u0002¢\u0006\u0004\b&\u0010'J\u0019\u0010)\u001a\u0004\u0018\u00010\u000f2\u0006\u0010(\u001a\u00020\u000fH\u0002¢\u0006\u0004\b)\u0010*R\u001b\u00100\u001a\u00020+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0016\u00104\u001a\u0002018\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b2\u00103R\u001c\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u0010:\u001a\u0002078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u001b\u0010?\u001a\u00020;8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b<\u0010-\u001a\u0004\b=\u0010>R\u0014\u0010B\u001a\u00020@8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u0010AR\u0014\u0010E\u001a\u0002078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bC\u0010DR\u0016\u0010H\u001a\u0004\u0018\u00010\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bF\u0010GR\u0016\u0010K\u001a\u0004\u0018\u00010\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bI\u0010JR\u0016\u0010M\u001a\u0004\u0018\u00010\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bL\u0010J¨\u0006N"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/TierDepartmentsActivity;", "Lcom/meijer/mobile/meijer/activity/MeijerActivity;", "LAj/b;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "e2", "LCo/b;", "department", "m2", "(LCo/b;)V", "", "departmentId", "T1", "(Ljava/lang/String;)V", "deepLinkUri", "f2", "d2", "c2", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "breadcrumbs", "carouselTitle", "n2", "(Ljava/util/HashMap;Ljava/lang/String;)Ljava/lang/String;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/d$a$a;", "action", "k2", "(Lcom/meijer/mobile/meijer/activity/find/viewmodel/d$a$a;)V", "Lnu/d;", "Lnu/g;", "breadcrumbsAdapter", "Lmk/l$c;", "productQueryIntent", "W1", "(Lnu/d;Lmk/l$c;)Ljava/util/HashMap;", "title", "S1", "(Ljava/lang/String;)Ljava/lang/String;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/i;", "s", "Lkotlin/Lazy;", "Y1", "()Lcom/meijer/mobile/meijer/activity/find/viewmodel/i;", "departmentTierViewModel", "LMn/o;", "t", "LMn/o;", "binding", "u", "Lnu/d;", "", "v", "Z", "showAllDeepLink", "Lce/a;", "w", "V1", "()Lce/a;", "cartBadge", "Landroidx/appcompat/widget/Toolbar;", "()Landroidx/appcompat/widget/Toolbar;", "toolbar", "Z1", "()Z", "loadRootDepartment", "a2", "()LCo/b;", "loadSubdepartment", "b2", "()Ljava/lang/String;", "marketingDeeplink", "X1", "departmentCarouselAnalytics", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class TierDepartmentsActivity extends Hilt_TierDepartmentsActivity implements Aj.b {

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private AbstractC4266o binding;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private C15949d<nu.g> breadcrumbsAdapter;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final Lazy departmentTierViewModel = new androidx.view.e0(Reflection.b(C12258i.class), new g(this), new f(this), new h(null, this));

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private boolean showAllDeepLink = true;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final Lazy cartBadge = LazyKt.b(new Function0() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.R1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return TierDepartmentsActivity.R1(this.f108096a);
        }
    });

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DepartmentItemDecorator.b.values().length];
            try {
                iArr[DepartmentItemDecorator.b.f108417a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DepartmentItemDecorator.b.f108418b.ordinal()] = 2;
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
            Toolbar toolbarV = TierDepartmentsActivity.this.v();
            AbstractC5607a.Companion companion = AbstractC5607a.INSTANCE;
            int i10 = Bj.o.f2969E0;
            C15949d c15949d = TierDepartmentsActivity.this.breadcrumbsAdapter;
            if (c15949d == null) {
                Intrinsics.y("breadcrumbsAdapter");
                c15949d = null;
            }
            nu.h hVarJ = c15949d.j(position);
            Intrinsics.h(hVarJ, "null cannot be cast to non-null type com.meijer.mobile.meijer.activity.find.viewmodel.DepartmentListPage");
            bk.k.a(toolbarV, companion.d(i10, ((C12249f) hVarJ).C()));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/i$f;", "viewState", "", "<anonymous>", "(Lcom/meijer/mobile/meijer/activity/find/viewmodel/i$f;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.TierDepartmentsActivity$onCreate$8", f = "TierDepartmentsActivity.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class d extends SuspendLambda implements Function2<C12258i.ViewState, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f108110a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f108111b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* synthetic */ class a extends FunctionReferenceImpl implements Function1<C12229d.a.GoTo, Unit> {
            a(Object obj) {
                super(1, obj, TierDepartmentsActivity.class, "onDepartmentItemSelected", "onDepartmentItemSelected(Lcom/meijer/mobile/meijer/activity/find/viewmodel/DepartmentItem$Action$GoTo;)V", 0);
            }

            public final void a(C12229d.a.GoTo p02) {
                Intrinsics.j(p02, "p0");
                ((TierDepartmentsActivity) this.receiver).k2(p02);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C12229d.a.GoTo goTo) {
                a(goTo);
                return Unit.f142422a;
            }
        }

        d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            d dVar = TierDepartmentsActivity.this.new d(continuation);
            dVar.f108111b = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C12258i.ViewState viewState, Continuation<? super Unit> continuation) {
            return ((d) create(viewState, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Uri uri;
            Parcelable parcelable;
            IntrinsicsKt.f();
            if (this.f108110a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            C12258i.ViewState viewState = (C12258i.ViewState) this.f108111b;
            if (viewState.getCartDecorator().getIsAvailable()) {
                C6386a c6386aV1 = TierDepartmentsActivity.this.V1();
                c6386aV1.R(viewState.getCartDecorator().getItemCount());
                c6386aV1.setVisible(c6386aV1.z() && c6386aV1.o() > 0, true);
                Qj.a.a(TierDepartmentsActivity.this.v(), com.meijer.mobile.meijer.T.f99051c4, c6386aV1);
            }
            C12258i.LoadingState networkCallInProgress = viewState.getNetworkCallInProgress();
            TierDepartmentsActivity tierDepartmentsActivity = TierDepartmentsActivity.this;
            AbstractC4266o abstractC4266o = tierDepartmentsActivity.binding;
            AbstractC4266o abstractC4266o2 = null;
            if (abstractC4266o == null) {
                Intrinsics.y("binding");
                abstractC4266o = null;
            }
            abstractC4266o.f20828C.U(networkCallInProgress.getMessage(), networkCallInProgress.getIsLoading());
            if (networkCallInProgress.getIsLoading()) {
                AbstractC4266o abstractC4266o3 = tierDepartmentsActivity.binding;
                if (abstractC4266o3 == null) {
                    Intrinsics.y("binding");
                    abstractC4266o3 = null;
                }
                View root = abstractC4266o3.f20827B.getRoot();
                Intrinsics.i(root, "getRoot(...)");
                root.setVisibility(8);
                AbstractC4266o abstractC4266o4 = tierDepartmentsActivity.binding;
                if (abstractC4266o4 == null) {
                    Intrinsics.y("binding");
                    abstractC4266o4 = null;
                }
                ViewPager2 departmentPager = abstractC4266o4.f20826A;
                Intrinsics.i(departmentPager, "departmentPager");
                departmentPager.setVisibility(8);
            }
            C15949d c15949d = TierDepartmentsActivity.this.breadcrumbsAdapter;
            if (c15949d == null) {
                Intrinsics.y("breadcrumbsAdapter");
                c15949d = null;
            }
            List<DepartmentItemDecorator> listC = viewState.c();
            TierDepartmentsActivity tierDepartmentsActivity2 = TierDepartmentsActivity.this;
            ArrayList arrayList = new ArrayList(CollectionsKt.x(listC, 10));
            Iterator<T> it = listC.iterator();
            while (it.hasNext()) {
                arrayList.add(new C12249f((DepartmentItemDecorator) it.next(), new a(tierDepartmentsActivity2), viewState.c(), tierDepartmentsActivity2.a2()));
            }
            c15949d.x(arrayList);
            String strB2 = TierDepartmentsActivity.this.b2();
            if (strB2 != null && strB2.length() != 0 && !viewState.c().isEmpty() && !viewState.getNetworkCallInProgress().getIsLoading() && TierDepartmentsActivity.this.showAllDeepLink) {
                TierDepartmentsActivity.this.showAllDeepLink = false;
                TierDepartmentsActivity tierDepartmentsActivity3 = TierDepartmentsActivity.this;
                Al.g featureEntryPoint = tierDepartmentsActivity3.getFeatureEntryPoint();
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
                tierDepartmentsActivity3.startActivity(Al.g.k(featureEntryPoint, department2, strA, null, uri, null, 20, null));
            }
            AbstractC4266o abstractC4266o5 = TierDepartmentsActivity.this.binding;
            if (abstractC4266o5 == null) {
                Intrinsics.y("binding");
            } else {
                abstractC4266o2 = abstractC4266o5;
            }
            ViewPager2 viewPager2 = abstractC4266o2.f20826A;
            Intrinsics.g(viewPager2);
            viewPager2.setVisibility(viewState.c().isEmpty() ? 8 : 0);
            viewPager2.j(CollectionsKt.o(viewState.c()), true);
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class f extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f108116f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ComponentActivity componentActivity) {
            super(0);
            this.f108116f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f108116f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class g extends Lambda implements Function0<androidx.view.g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f108117f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ComponentActivity componentActivity) {
            super(0);
            this.f108117f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.view.g0 invoke() {
            return this.f108117f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class h extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f108118f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f108119g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f108118f = function0;
            this.f108119g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f108118f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f108119g.getDefaultViewModelCreationExtras() : creationExtras;
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
        return StringsKt.w1(string, ":", null, 2, null);
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/i$d;", "event", "", "<anonymous>", "(Lcom/meijer/mobile/meijer/activity/find/viewmodel/i$d;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.TierDepartmentsActivity$onCreate$9", f = "TierDepartmentsActivity.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class e extends SuspendLambda implements Function2<C12258i.d, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f108113a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f108114b;

        e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            e eVar = TierDepartmentsActivity.this.new e(continuation);
            eVar.f108114b = obj;
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C12258i.d dVar, Continuation<? super Unit> continuation) {
            return ((e) create(dVar, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f108113a == 0) {
                ResultKt.b(obj);
                C12258i.d dVar = (C12258i.d) this.f108114b;
                if (dVar instanceof C12258i.d.DepartmentErrorEvent) {
                    AbstractC4266o abstractC4266o = TierDepartmentsActivity.this.binding;
                    AbstractC4266o abstractC4266o2 = null;
                    if (abstractC4266o == null) {
                        Intrinsics.y("binding");
                        abstractC4266o = null;
                    }
                    abstractC4266o.f20827B.f20811D.setText(((C12258i.d.DepartmentErrorEvent) dVar).getRetrofitException().c(TierDepartmentsActivity.this));
                    AbstractC4266o abstractC4266o3 = TierDepartmentsActivity.this.binding;
                    if (abstractC4266o3 == null) {
                        Intrinsics.y("binding");
                    } else {
                        abstractC4266o2 = abstractC4266o3;
                    }
                    View root = abstractC4266o2.f20827B.getRoot();
                    Intrinsics.i(root, "getRoot(...)");
                    root.setVisibility(0);
                    return Unit.f142422a;
                }
                throw new NoWhenBranchMatchedException();
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    private final String S1(String title) {
        if (StringsKt.c0(title, "L1", false, 2, null)) {
            return "category_l1";
        }
        if (StringsKt.c0(title, "L2", false, 2, null)) {
            return "category_l2";
        }
        if (StringsKt.c0(title, "L3", false, 2, null)) {
            return "category_l3";
        }
        if (StringsKt.c0(title, "L4", false, 2, null)) {
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
    public final C6386a V1() {
        return (C6386a) this.cartBadge.getValue();
    }

    private final C12258i Y1() {
        return (C12258i) this.departmentTierViewModel.getValue();
    }

    private final void c2() {
        startActivity(new Intent(this, (Class<?>) CartActivity.class));
    }

    private final void d2() {
        startActivity(new Intent(this, (Class<?>) SearchProductActivity.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e2() {
        AbstractC4266o abstractC4266o = this.binding;
        if (abstractC4266o == null) {
            Intrinsics.y("binding");
            abstractC4266o = null;
        }
        ViewPager2 viewPager2 = abstractC4266o.f20826A;
        if (viewPager2.getCurrentItem() > 0) {
            viewPager2.j(viewPager2.getCurrentItem() - 1, true);
        } else {
            finish();
        }
        Y1().C();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h2(TierDepartmentsActivity tierDepartmentsActivity, a.AbstractC0730a item) {
        Intrinsics.j(item, "item");
        if (Intrinsics.e(item, a.AbstractC0730a.C0731a.f32566a)) {
            tierDepartmentsActivity.d2();
        } else {
            if (!Intrinsics.e(item, a.AbstractC0730a.b.f32567a)) {
                throw new NoWhenBranchMatchedException();
            }
            tierDepartmentsActivity.c2();
        }
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i2(TierDepartmentsActivity tierDepartmentsActivity, TabLayout.f tab, int i10) {
        Intrinsics.j(tab, "tab");
        C15949d<nu.g> c15949d = tierDepartmentsActivity.breadcrumbsAdapter;
        if (c15949d == null) {
            Intrinsics.y("breadcrumbsAdapter");
            c15949d = null;
        }
        nu.h hVarJ = c15949d.j(i10);
        Intrinsics.h(hVarJ, "null cannot be cast to non-null type com.meijer.mobile.meijer.activity.find.viewmodel.DepartmentListPage");
        tab.r(((C12249f) hVarJ).C());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l2(C12229d.a.GoTo goTo, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.h("tier", goTo.getDepartmentItemDecorator().getDepartment().getId());
        track.h("tierName", goTo.getDepartmentItemDecorator().getDepartment().getName());
        return Unit.f142422a;
    }

    @Override // Aj.b
    public Toolbar v() {
        AbstractC4266o abstractC4266o = this.binding;
        if (abstractC4266o == null) {
            Intrinsics.y("binding");
            abstractC4266o = null;
        }
        MaterialToolbar toolbar = abstractC4266o.f20829D;
        Intrinsics.i(toolbar, "toolbar");
        return toolbar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C6386a R1(TierDepartmentsActivity tierDepartmentsActivity) {
        C6386a c6386aE = C6386a.e(tierDepartmentsActivity);
        c6386aE.V(false);
        c6386aE.N(C17134a.f161960c);
        Intrinsics.i(c6386aE, "apply(...)");
        return c6386aE;
    }

    private final void T1(String departmentId) {
        Y1().A(new C12258i.c.FetchDepartmentByDepartmentId(departmentId));
    }

    private final HashMap<String, String> W1(C15949d<nu.g> breadcrumbsAdapter, l.Department productQueryIntent) {
        String strS1;
        C12249f c12249f = null;
        if (breadcrumbsAdapter.i() <= 0) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        nu.h hVarJ = breadcrumbsAdapter.j(0);
        if (hVarJ instanceof C12249f) {
            c12249f = (C12249f) hVarJ;
        }
        if (c12249f != null) {
            for (DepartmentItemDecorator departmentItemDecorator : c12249f.B()) {
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
        Y1().A(new C12258i.c.FindDepartmentByName(deepLinkUri));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g2(TierDepartmentsActivity tierDepartmentsActivity) {
        tierDepartmentsActivity.e2();
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k2(final C12229d.a.GoTo action) {
        l.Department department;
        String strN2;
        int i10 = a.$EnumSwitchMapping$0[action.getDepartmentItemDecorator().getDestination().ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                String stringExtra = getIntent().getStringExtra("homePageCarouselAnalytics");
                C15949d<nu.g> c15949d = this.breadcrumbsAdapter;
                String strN22 = null;
                if (c15949d == null) {
                    Intrinsics.y("breadcrumbsAdapter");
                    c15949d = null;
                }
                mk.l lVarE = action.getDepartmentItemDecorator().getDepartment().e();
                if (lVarE instanceof l.Department) {
                    department = (l.Department) lVarE;
                } else {
                    department = null;
                }
                HashMap<String, String> mapW1 = W1(c15949d, department);
                Al.g featureEntryPoint = getFeatureEntryPoint();
                mk.l lVarE2 = action.getDepartmentItemDecorator().getDepartment().e();
                if (mapW1 != null) {
                    strN22 = n2(mapW1, X1());
                }
                Intent intentK = Al.g.k(featureEntryPoint, lVarE2, null, mapW1, null, strN22, 10, null);
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
        getAnalyticsEngine().h(C14476c.a("Event:NextSubDepartment"), new Function1() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.S1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TierDepartmentsActivity.l2(action, (TrackingData) obj);
            }
        });
        Y1().A(new C12258i.c.PopulateSubDepartmentsAction(action.getDepartmentItemDecorator().getDepartment()));
    }

    private final void m2(Department department) {
        Toolbar toolbarV = v();
        toolbarV.setTitle(department.getName());
        zj.c.b(toolbarV, false, 1, null);
        Y1().A(new C12258i.c.PopulateSubDepartmentsAction(department));
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        String id2;
        List<Department> listF;
        super.onCreate(savedInstanceState);
        getOnBackPressedDispatcher().i(this, new b());
        AbstractC4266o abstractC4266oK0 = AbstractC4266o.K0(getLayoutInflater());
        this.binding = abstractC4266oK0;
        if (abstractC4266oK0 == null) {
            Intrinsics.y("binding");
            abstractC4266oK0 = null;
        }
        int i10 = 0;
        setContentView(Zr.a.j(abstractC4266oK0.getRoot(), false, 1, null));
        if (a2() != null) {
            bk.c.b(this, 0, Bj.d.f2593b, Bj.d.f2594c, 0, 8, null);
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
        Aj.b.O0(this, 0, 0, new Function0() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.N1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TierDepartmentsActivity.g2(this.f108088a);
            }
        }, 3, null);
        Qj.a.a(v(), com.meijer.mobile.meijer.T.f99051c4, V1());
        v().setOnMenuItemClickListener(new Rn.a(new Function1() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.O1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TierDepartmentsActivity.h2(this.f108090a, (a.AbstractC0730a) obj);
            }
        }));
        this.breadcrumbsAdapter = new C15949d<>();
        AbstractC4266o abstractC4266o = this.binding;
        if (abstractC4266o == null) {
            Intrinsics.y("binding");
            abstractC4266o = null;
        }
        TabLayout departmentBreadcrumbs = abstractC4266o.f20830z;
        Intrinsics.i(departmentBreadcrumbs, "departmentBreadcrumbs");
        if (!getFeatureManager().e(AbstractC18227f.C18236j.f170584h)) {
            i10 = 8;
        }
        departmentBreadcrumbs.setVisibility(i10);
        AbstractC4266o abstractC4266o2 = this.binding;
        if (abstractC4266o2 == null) {
            Intrinsics.y("binding");
            abstractC4266o2 = null;
        }
        ViewPager2 viewPager2 = abstractC4266o2.f20826A;
        C15949d<nu.g> c15949d = this.breadcrumbsAdapter;
        if (c15949d == null) {
            Intrinsics.y("breadcrumbsAdapter");
            c15949d = null;
        }
        viewPager2.setAdapter(c15949d);
        AbstractC4266o abstractC4266o3 = this.binding;
        if (abstractC4266o3 == null) {
            Intrinsics.y("binding");
            abstractC4266o3 = null;
        }
        TabLayout tabLayout = abstractC4266o3.f20830z;
        AbstractC4266o abstractC4266o4 = this.binding;
        if (abstractC4266o4 == null) {
            Intrinsics.y("binding");
            abstractC4266o4 = null;
        }
        new com.google.android.material.tabs.d(tabLayout, abstractC4266o4.f20826A, new d.b() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.P1
            @Override // com.google.android.material.tabs.d.b
            public final void onConfigureTab(TabLayout.f fVar, int i11) {
                TierDepartmentsActivity.i2(this.f108092a, fVar, i11);
            }
        }).a();
        AbstractC4266o abstractC4266o5 = this.binding;
        if (abstractC4266o5 == null) {
            Intrinsics.y("binding");
            abstractC4266o5 = null;
        }
        abstractC4266o5.f20827B.f20809B.setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.Q1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TierDepartmentsActivity.j2(this.f108094a, view);
            }
        });
        AbstractC4266o abstractC4266o6 = this.binding;
        if (abstractC4266o6 == null) {
            Intrinsics.y("binding");
            abstractC4266o6 = null;
        }
        abstractC4266o6.f20826A.g(new c());
        C17154h.J(C17154h.O(Y1().y(), new d(null)), C6031t.a(this));
        C17154h.J(C17154h.O(Y1().getEvents(), new e(null)), C6031t.a(this));
    }
}
