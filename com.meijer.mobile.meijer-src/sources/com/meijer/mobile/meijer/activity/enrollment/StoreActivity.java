package com.meijer.mobile.meijer.activity.enrollment;

import Ld.C4022l;
import Ld.InterfaceC4013c;
import Nn.AbstractC4242h0;
import V2.CreationExtras;
import Vd.AbstractC5516j;
import Vd.InterfaceC5513g;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.view.C6173t;
import androidx.view.ComponentActivity;
import androidx.view.e0;
import androidx.view.f0;
import androidx.view.g0;
import com.google.android.material.appbar.MaterialToolbar;
import com.meijer.mobile.core.design.widget.checkoutprogressstepperview.ProgressIndicatorView;
import com.meijer.mobile.meijer.Y;
import com.meijer.mobile.meijer.activity.enrollment.G;
import com.meijer.mobile.meijer.activity.enrollment.profile.ProfileEnrollmentViewState;
import com.meijer.mobile.meijer.activity.enrollment.storeLocation.StoreListActivity;
import g.AbstractC14276c;
import g.InterfaceC14275b;
import g2.C14322b;
import h.C14433g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Function;
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
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import pv.C16563h;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 E2\u00020\u00012\u00020\u0002:\u0001FB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ#\u0010\r\u001a\u00020\u00052\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00070\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u000f\u0010\u0004J\u000f\u0010\u0010\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0010\u0010\u0004J\u0019\u0010\u0013\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0015\u0010\u0004R(\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001d\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00168\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0019\u001a\u0004\b \u0010\u001bR\u0017\u0010'\u001a\u00020\"8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010*\u001a\u00020\"8\u0006X\u0086D¢\u0006\f\n\u0004\b(\u0010$\u001a\u0004\b)\u0010&R\u0016\u0010.\u001a\u00020+8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b,\u0010-R\u001b\u00104\u001a\u00020/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0016\u00108\u001a\u0002058\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u0010<\u001a\u0004\u0018\u0001098\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b:\u0010;R \u0010A\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0>0=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010D\u001a\u00020B8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u0010C¨\u0006G"}, d2 = {"Lcom/meijer/mobile/meijer/activity/enrollment/StoreActivity;", "Lcom/meijer/mobile/meijer/activity/MeijerActivity;", "LBj/b;", "<init>", "()V", "", "U1", "", "P1", "()Z", "", "", "permissions", "O1", "(Ljava/util/Map;)V", "K1", "T1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onStop", "", "Lcom/meijer/mobile/meijer/activity/enrollment/profile/v$a;", "s", "Ljava/util/List;", "getSteps", "()Ljava/util/List;", "setSteps", "(Ljava/util/List;)V", "steps", "t", "getStepLabels", "stepLabels", "", "u", "I", "getCurrentStep", "()I", "currentStep", "v", "getHorizontalPaddingInDp", "horizontalPaddingInDp", "LNn/h0;", "w", "LNn/h0;", "binding", "Lcom/meijer/mobile/meijer/activity/enrollment/G;", "x", "Lkotlin/Lazy;", "N1", "()Lcom/meijer/mobile/meijer/activity/enrollment/G;", "storeViewModel", "LLd/c;", "y", "LLd/c;", "fusedLocationClient", "Landroid/location/LocationManager;", "z", "Landroid/location/LocationManager;", "locationManager", "Lg/c;", "", "A", "Lg/c;", "requestLocationPermissionLauncher", "Landroidx/appcompat/widget/Toolbar;", "()Landroidx/appcompat/widget/Toolbar;", "toolbar", "B", "a", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class StoreActivity extends Hilt_StoreActivity implements Bj.b {

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: C, reason: collision with root package name */
    public static final int f106774C = 8;

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    private final AbstractC14276c<String[]> requestLocationPermissionLauncher;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private List<ProfileEnrollmentViewState.CreateAccountLabelFlowRequirement> steps;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final List<String> stepLabels;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final int currentStep;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final int horizontalPaddingInDp;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private AbstractC4242h0 binding;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final Lazy storeViewModel;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private InterfaceC4013c fusedLocationClient;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public LocationManager locationManager;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/meijer/mobile/meijer/activity/enrollment/StoreActivity$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "a", "(Landroid/content/Context;)Landroid/content/Intent;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.enrollment.StoreActivity$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final Intent a(Context context) {
            Intrinsics.j(context, "context");
            return new Intent(context, (Class<?>) StoreActivity.class);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class c implements InterfaceC14275b, FunctionAdapter {
        c() {
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC14275b) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.e(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, StoreActivity.this, StoreActivity.class, "handlePermissionsResult", "handlePermissionsResult(Ljava/util/Map;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // g.InterfaceC14275b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void a(Map<String, Boolean> p02) {
            Intrinsics.j(p02, "p0");
            StoreActivity.this.O1(p02);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class d extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f106788f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentActivity componentActivity) {
            super(0);
            this.f106788f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f106788f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class e extends Lambda implements Function0<g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f106789f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ComponentActivity componentActivity) {
            super(0);
            this.f106789f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final g0 invoke() {
            return this.f106789f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class f extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f106790f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f106791g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f106790f = function0;
            this.f106791g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f106790f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f106791g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/meijer/mobile/meijer/activity/enrollment/G$b;", "event", "", "<anonymous>", "(Lcom/meijer/mobile/meijer/activity/enrollment/G$b;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.enrollment.StoreActivity$onCreate$4", f = "StoreActivity.kt", l = {}, m = "invokeSuspend")
    static final class b extends SuspendLambda implements Function2<G.b, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f106784a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f106785b;

        b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            b bVar = StoreActivity.this.new b(continuation);
            bVar.f106785b = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(G.b bVar, Continuation<? super Unit> continuation) {
            return ((b) create(bVar, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f106784a == 0) {
                ResultKt.b(obj);
                G.b bVar = (G.b) this.f106785b;
                if (bVar instanceof G.b.c) {
                    StoreActivity.this.T1();
                } else if (bVar instanceof G.b.a) {
                    if (!C.f106724b) {
                        C.f106723a = false;
                    }
                    StoreActivity storeActivity = StoreActivity.this;
                    storeActivity.startActivity(StoreListActivity.INSTANCE.a(storeActivity).putExtra("isLocationUsed", C.f106723a));
                    C.f106724b = false;
                    C.f106723a = false;
                } else if (bVar instanceof G.b.SetupProgressIndicatorEvent) {
                    StoreActivity.this.U1();
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @SuppressLint({"MissingPermission"})
    private final void K1() {
        InterfaceC4013c interfaceC4013c = this.fusedLocationClient;
        if (interfaceC4013c == null) {
            Intrinsics.x("fusedLocationClient");
            interfaceC4013c = null;
        }
        AbstractC5516j<Location> abstractC5516jM = interfaceC4013c.m();
        final Function1 function1 = new Function1() { // from class: com.meijer.mobile.meijer.activity.enrollment.x
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return StoreActivity.L1(this.f107179a, (Location) obj);
            }
        };
        abstractC5516jM.g(new InterfaceC5513g() { // from class: com.meijer.mobile.meijer.activity.enrollment.y
            @Override // Vd.InterfaceC5513g
            public final void onSuccess(Object obj) {
                StoreActivity.M1(function1, obj);
            }
        });
    }

    private final G N1() {
        return (G) this.storeViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O1(Map<String, Boolean> permissions) {
        if (Intrinsics.e(permissions.get("android.permission.ACCESS_FINE_LOCATION"), Boolean.TRUE) && P1()) {
            K1();
            return;
        }
        startActivity(StoreListActivity.INSTANCE.a(this).putExtra("search_stores", "search_stores").putExtra("isLocationUsed", C.f106723a));
        C.f106724b = false;
        C.f106723a = false;
    }

    private final boolean P1() {
        LocationManager locationManager = this.locationManager;
        if (locationManager != null) {
            return C14322b.a(locationManager);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T1() {
        this.requestLocationPermissionLauncher.a(new String[]{"android.permission.ACCESS_FINE_LOCATION"});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void U1() {
        AbstractC4242h0 abstractC4242h0 = this.binding;
        AbstractC4242h0 abstractC4242h02 = null;
        if (abstractC4242h0 == null) {
            Intrinsics.x("binding");
            abstractC4242h0 = null;
        }
        ProgressIndicatorView progressIndicatorView = abstractC4242h0.f21979B.f22381z;
        progressIndicatorView.setPadding((int) Ds.p.b(this, this.horizontalPaddingInDp), progressIndicatorView.getPaddingTop(), (int) Ds.p.b(this, this.horizontalPaddingInDp), progressIndicatorView.getPaddingBottom());
        progressIndicatorView.d(this.stepLabels, this.currentStep);
        AbstractC4242h0 abstractC4242h03 = this.binding;
        if (abstractC4242h03 == null) {
            Intrinsics.x("binding");
        } else {
            abstractC4242h02 = abstractC4242h03;
        }
        abstractC4242h02.f21979B.f22379A.setVisibility(4);
    }

    @Override // Bj.b
    public Toolbar y() {
        AbstractC4242h0 abstractC4242h0 = this.binding;
        if (abstractC4242h0 == null) {
            Intrinsics.x("binding");
            abstractC4242h0 = null;
        }
        MaterialToolbar toolbar = abstractC4242h0.f21989L;
        Intrinsics.i(toolbar, "toolbar");
        return toolbar;
    }

    public StoreActivity() {
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
        this.storeViewModel = new e0(Reflection.b(G.class), new e(this), new d(this), new f(null, this));
        this.requestLocationPermissionLauncher = registerForActivityResult(new C14433g(), new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit L1(StoreActivity storeActivity, Location location) {
        if (!C.f106724b) {
            C.f106723a = true;
        }
        Bundle bundle = new Bundle();
        if (location != null) {
            bundle.putString("latitude", String.valueOf(location.getLatitude()));
        }
        if (location != null) {
            bundle.putString("longitude", String.valueOf(location.getLongitude()));
        }
        bundle.putBoolean("isLocationUsed", C.f106723a);
        storeActivity.startActivity(StoreListActivity.INSTANCE.a(storeActivity).putExtras(bundle));
        C.f106724b = false;
        C.f106723a = false;
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M1(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Q1(StoreActivity storeActivity) {
        if (!storeActivity.onNavigateUp()) {
            storeActivity.finish();
        }
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R1(StoreActivity storeActivity, View view) {
        storeActivity.N1().p(G.a.C1584a.f106733a);
        C.f106724b = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S1(StoreActivity storeActivity, View view) {
        storeActivity.N1().p(G.a.c.f106735a);
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AbstractC4242h0 abstractC4242h0M0 = AbstractC4242h0.M0(getLayoutInflater());
        this.binding = abstractC4242h0M0;
        if (abstractC4242h0M0 == null) {
            Intrinsics.x("binding");
            abstractC4242h0M0 = null;
        }
        setContentView(Zr.a.j(abstractC4242h0M0.getRoot(), false, 1, null));
        U0(Y.f100872d1);
        Drawable navigationIcon = y().getNavigationIcon();
        if (navigationIcon != null) {
            navigationIcon.setVisible(false, false);
        }
        Bj.b.o(this, 0, 0, new Function0() { // from class: com.meijer.mobile.meijer.activity.enrollment.z
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return StoreActivity.Q1(this.f107181a);
            }
        }, 3, null);
        N1().p(G.a.d.f106736a);
        this.fusedLocationClient = C4022l.a(this);
        AbstractC4242h0 abstractC4242h0 = this.binding;
        if (abstractC4242h0 == null) {
            Intrinsics.x("binding");
            abstractC4242h0 = null;
        }
        abstractC4242h0.f21982E.setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.enrollment.A
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StoreActivity.R1(this.f106721a, view);
            }
        });
        AbstractC4242h0 abstractC4242h02 = this.binding;
        if (abstractC4242h02 == null) {
            Intrinsics.x("binding");
            abstractC4242h02 = null;
        }
        abstractC4242h02.f21983F.setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.enrollment.B
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StoreActivity.S1(this.f106722a, view);
            }
        });
        C16563h.J(C16563h.O(N1().getEvents(), new b(null)), C6173t.a(this));
        N1().p(G.a.b.f106734a);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStop() {
        super.onStop();
        C.f106723a = false;
        C.f106724b = false;
    }
}
