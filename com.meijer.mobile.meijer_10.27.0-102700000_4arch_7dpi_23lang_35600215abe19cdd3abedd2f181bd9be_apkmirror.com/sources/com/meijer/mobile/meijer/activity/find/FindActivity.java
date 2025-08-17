package com.meijer.mobile.meijer.activity.find;

import Ji.C;
import Ji.LocalThemeScope;
import Jk.AppVersion;
import Kr.PermissionRequestDecorator;
import Kr.a;
import Oj.a;
import P0.e;
import V2.CreationExtras;
import Yq.StoreMapItem;
import ak.AbstractC5607a;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.res.Resources;
import android.location.Location;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.layout.C5662h;
import androidx.compose.foundation.layout.C5664j;
import androidx.compose.foundation.layout.C5665k;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.o1;
import androidx.compose.runtime.t1;
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import androidx.view.C6031t;
import androidx.view.ComponentActivity;
import androidx.view.f0;
import ck.C6408b;
import com.fullstory.compose.FullStoryAnnotationsKt;
import com.google.android.gms.maps.model.LatLng;
import com.meijer.mobile.meijer.activity.find.C12074a0;
import com.meijer.mobile.meijer.activity.find.FindActivity;
import com.meijer.mobile.meijer.activity.find.productdetail.K1;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import com.radiusnetworks.flybuy.sdk.pickup.PickupManager;
import com.radiusnetworks.flybuy.sdk.util.SingletonHolder;
import e.C13589e;
import g.AbstractC14147c;
import g.C14145a;
import g.InterfaceC14146b;
import gi.InterfaceC14261a;
import h.C14320g;
import hi.C14476c;
import j0.C14815g;
import j0.InterfaceC14794C;
import j0.InterfaceC14814f;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.C17917Z;
import kotlin.C17921a1;
import kotlin.C17927c1;
import kotlin.C17929d0;
import kotlin.C17932e0;
import kotlin.C17963o1;
import kotlin.EnumC17935f0;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KFunction;
import l0.C15339A;
import l0.C15340B;
import ok.StoreDetails;
import org.xmlpull.v1.XmlPullParserException;
import p1.C16193g;
import ps.AbstractC16373C;
import ps.C16372B;
import ps.C16381K;
import ps.C16382L;
import ps.C16395g;
import ps.DrawerLayoutDecorator;
import ps.HeaderDecorator;
import qv.C0;
import qv.C16648k;
import qv.InterfaceC16622O;
import tv.C17154h;
import tv.InterfaceC17153g;
import xk.C18064b;
import yl.AbstractC18227f;
import yr.C18286l;
import yr.C18299z;

@Metadata(d1 = {"\u0000Ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u0003J#\u0010\u0012\u001a\u00020\u00062\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eH\u0003¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0014\u001a\u00020\u00062\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eH\u0003¢\u0006\u0004\b\u0014\u0010\u0013J#\u0010\u0015\u001a\u00020\u00062\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eH\u0003¢\u0006\u0004\b\u0015\u0010\u0013J\u001f\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001d\u001a\u00020\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u001f\u0010\u0003J\u000f\u0010 \u001a\u00020\u0006H\u0014¢\u0006\u0004\b \u0010\u0003R\"\u0010(\u001a\u00020!8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u0016\u0010+\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\"\u00103\u001a\u00020,8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u0010;\u001a\u0002048\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010C\u001a\u00020<8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\"\u0010K\u001a\u00020D8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\"\u0010S\u001a\u00020L8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\u0018\u0010W\u001a\u0004\u0018\u00010T8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR\u001b\u0010]\u001a\u00020X8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\R\u001b\u0010b\u001a\u00020^8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b_\u0010Z\u001a\u0004\b`\u0010aR\u001b\u0010g\u001a\u00020c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bd\u0010Z\u001a\u0004\be\u0010fR\u001a\u0010k\u001a\b\u0012\u0004\u0012\u00020\u000f0h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010jR\u001a\u0010p\u001a\b\u0012\u0004\u0012\u00020m0l8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010oR \u0010s\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0q0l8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\br\u0010oR\u0014\u0010w\u001a\u00020t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bu\u0010vR\u0016\u0010{\u001a\u0004\u0018\u00010x8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\by\u0010zR\u0016\u0010~\u001a\u0004\u0018\u00010\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b|\u0010}R\u0015\u0010\u0018\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u007f\u0010\u0080\u0001¨\u0006\u0085\u0001²\u0006\u000e\u0010\u0082\u0001\u001a\u00030\u0081\u00018\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0084\u0001\u001a\u00030\u0083\u00018\nX\u008a\u0084\u0002"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/FindActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "Lg/a;", "result", "", "H1", "(Lg/a;)V", "LKr/a;", "resolution", "M1", "(LKr/a;)V", "x1", "", "", "", "permissions", "G1", "(Ljava/util/Map;)V", "L1", "K1", "LYq/d;", "storeMapItem", "isPickUpMode", "N1", "(LYq/d;Z)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "onPause", "Lgi/a;", "v", "Lgi/a;", "getAnalyticsEngine", "()Lgi/a;", "setAnalyticsEngine", "(Lgi/a;)V", "analyticsEngine", "w", "Z", "checkedPermissions", "LTq/j;", "x", "LTq/j;", "getStoreProvider", "()LTq/j;", "setStoreProvider", "(LTq/j;)V", "storeProvider", "LJk/a;", "y", "LJk/a;", "y1", "()LJk/a;", "setAppVersion", "(LJk/a;)V", "appVersion", "LCl/e;", "z", "LCl/e;", "getMeijerIntent", "()LCl/e;", "setMeijerIntent", "(LCl/e;)V", "meijerIntent", "Lcom/meijer/mobile/meijer/activity/find/m0;", "A", "Lcom/meijer/mobile/meijer/activity/find/m0;", "B1", "()Lcom/meijer/mobile/meijer/activity/find/m0;", "setLocationUpdatesProvider", "(Lcom/meijer/mobile/meijer/activity/find/m0;)V", "locationUpdatesProvider", "Lyl/k;", "B", "Lyl/k;", "getFeatureManager", "()Lyl/k;", "setFeatureManager", "(Lyl/k;)V", "featureManager", "Lqv/C0;", "C", "Lqv/C0;", "locationUpdatesJob", "Lps/g;", "D", "Lkotlin/Lazy;", "D1", "()Lps/g;", "navigationHelper", "Lps/L;", "E", "C1", "()Lps/L;", "navigationDrawerViewModel", "Lcom/meijer/mobile/meijer/activity/find/a0;", "F", "A1", "()Lcom/meijer/mobile/meijer/activity/find/a0;", "findStoreViewModel", "", "G", "Ljava/util/List;", "locationPermissions", "Lg/c;", "Landroid/content/Intent;", "H", "Lg/c;", "findStoreResultLauncher", "", "I", "permissionsResultLauncher", "", "z1", "()I", "deeplinkCode", "Landroid/net/Uri;", "F1", "()Landroid/net/Uri;", "uri", "E1", "()Ljava/lang/String;", "title", "I1", "()Z", "Lcom/meijer/mobile/meijer/activity/find/a0$b;", "viewState", "Lx0/c1;", "scaffoldState", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class FindActivity extends Hilt_FindActivity {

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    public C12098m0 locationUpdatesProvider;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    public yl.k featureManager;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private qv.C0 locationUpdatesJob;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private final Lazy navigationHelper = LazyKt.b(new Function0() { // from class: com.meijer.mobile.meijer.activity.find.M
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FindActivity.J1(this.f106495a);
        }
    });

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private final Lazy navigationDrawerViewModel = new androidx.view.e0(Reflection.b(C16382L.class), new g(this), new f(this), new h(null, this));

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private final Lazy findStoreViewModel = new androidx.view.e0(Reflection.b(C12074a0.class), new j(this), new i(this), new k(null, this));

    /* renamed from: G, reason: collision with root package name and from kotlin metadata */
    private final List<String> locationPermissions;

    /* renamed from: H, reason: collision with root package name and from kotlin metadata */
    private final AbstractC14147c<Intent> findStoreResultLauncher;

    /* renamed from: I, reason: collision with root package name and from kotlin metadata */
    private final AbstractC14147c<String[]> permissionsResultLauncher;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    public InterfaceC14261a analyticsEngine;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private boolean checkedPermissions;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    public Tq.j storeProvider;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    public AppVersion appVersion;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    public Cl.e meijerIntent;

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
            return new FunctionReferenceImpl(1, FindActivity.this, FindActivity.class, "handleStoreResult", "handleStoreResult(Landroidx/activity/result/ActivityResult;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // g.InterfaceC14146b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void a(C14145a p02) {
            Intrinsics.j(p02, "p0");
            FindActivity.this.H1(p02);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class b implements Function2<Composer, Integer, Unit> {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.FindActivity$onCreate$1$1$1", f = "FindActivity.kt", l = {207}, m = "invokeSuspend")
        static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f106411a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C15339A f106412b;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.f106412b, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C15339A c15339a, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f106412b = c15339a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f106411a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    C15339A c15339a = this.f106412b;
                    this.f106411a = 1;
                    if (C15339A.J(c15339a, 0, 0, this, 2, null) == objF) {
                        return objF;
                    }
                }
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.find.FindActivity$b$b, reason: collision with other inner class name */
        static final class C1590b implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC5730l0<C17927c1> f106413a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ FindActivity f106414b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ z1<C12074a0.ViewState> f106415c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ z1<HeaderDecorator> f106416d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ z1<DrawerLayoutDecorator> f106417e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ C15339A f106418f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ InterfaceC16622O f106419g;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.meijer.activity.find.FindActivity$b$b$a */
            static final class a implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ FindActivity f106420a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f106421b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ z1<C12074a0.ViewState> f106422c;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.meijer.mobile.meijer.activity.find.FindActivity$b$b$a$a, reason: collision with other inner class name */
                static final class C1591a implements Function2<Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f106423a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ FindActivity f106424b;

                    C1591a(LocalThemeScope localThemeScope, FindActivity findActivity) {
                        this.f106423a = localThemeScope;
                        this.f106424b = findActivity;
                    }

                    public final void a(Composer composer, int i10) {
                        if ((i10 & 3) == 2 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(1185997296, i10, -1, "com.meijer.mobile.meijer.activity.find.FindActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FindActivity.kt:219)");
                        }
                        LocalThemeScope localThemeScope = this.f106423a;
                        String strE1 = this.f106424b.E1();
                        composer.startReplaceGroup(1577071401);
                        if (strE1 == null) {
                            strE1 = C16193g.c(Vq.c.f37711H, composer, 0);
                        }
                        composer.P();
                        Dr.g.g(localThemeScope, strE1, null, false, null, 0, null, 0, composer, LocalThemeScope.f15770g, 126);
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

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.meijer.mobile.meijer.activity.find.FindActivity$b$b$a$b, reason: collision with other inner class name */
                static final class C1592b implements Function2<Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f106425a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ FindActivity f106426b;

                    C1592b(LocalThemeScope localThemeScope, FindActivity findActivity) {
                        this.f106425a = localThemeScope;
                        this.f106426b = findActivity;
                    }

                    public final void a(Composer composer, int i10) {
                        if ((i10 & 3) == 2 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(2024323961, i10, -1, "com.meijer.mobile.meijer.activity.find.FindActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FindActivity.kt:231)");
                        }
                        LocalThemeScope localThemeScope = this.f106425a;
                        String strE1 = this.f106426b.E1();
                        composer.startReplaceGroup(-244855256);
                        if (strE1 == null) {
                            strE1 = C16193g.c(Vq.c.f37742g, composer, 0);
                        }
                        composer.P();
                        Dr.g.g(localThemeScope, strE1, null, false, null, 0, null, 0, composer, LocalThemeScope.f15770g, 126);
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

                public final void c(Composer composer, int i10) {
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-235782891, i10, -1, "com.meijer.mobile.meijer.activity.find.FindActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (FindActivity.kt:216)");
                    }
                    if (this.f106420a.getFeatureManager().e(AbstractC18227f.K.f170550h)) {
                        composer.startReplaceGroup(-1936467885);
                        AbstractC5607a abstractC5607aD = AbstractC5607a.INSTANCE.d(Bj.o.f3035p, new Object[0]);
                        C.f.d dVar = C.f.d.f15507e;
                        LocalThemeScope localThemeScope = this.f106421b;
                        ComposableLambda composableLambdaC = ComposableLambdaKt.c(1185997296, true, new C1591a(localThemeScope, this.f106420a), composer, 54);
                        composer.startReplaceGroup(5004770);
                        boolean zD = composer.D(this.f106420a);
                        final FindActivity findActivity = this.f106420a;
                        Object objB = composer.B();
                        if (zD || objB == Composer.INSTANCE.a()) {
                            objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.find.N
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return FindActivity.b.C1590b.a.d(findActivity);
                                }
                            };
                            composer.t(objB);
                        }
                        composer.P();
                        Dr.g.f(localThemeScope, null, null, null, composableLambdaC, (Function0) objB, dVar, 0.0f, false, abstractC5607aD, composer, LocalThemeScope.f15770g | 24576 | (C.f.d.f15508f << 18) | (AbstractC5607a.f45514b << 27), 199);
                        composer.P();
                    } else {
                        composer.startReplaceGroup(-1935731883);
                        AbstractC5607a abstractC5607aD2 = b.d(this.f106422c).getSearchType() != ok.i.f153987e ? AbstractC5607a.INSTANCE.d(Bj.o.f3035p, new Object[0]) : AbstractC5607a.INSTANCE.d(ps.j0.f156554d, new Object[0]);
                        C.a.s sVar = C.a.s.f15358e;
                        LocalThemeScope localThemeScope2 = this.f106421b;
                        ComposableLambda composableLambdaC2 = ComposableLambdaKt.c(2024323961, true, new C1592b(localThemeScope2, this.f106420a), composer, 54);
                        composer.startReplaceGroup(5004770);
                        boolean zD2 = composer.D(this.f106420a);
                        final FindActivity findActivity2 = this.f106420a;
                        Object objB2 = composer.B();
                        if (zD2 || objB2 == Composer.INSTANCE.a()) {
                            objB2 = new Function0() { // from class: com.meijer.mobile.meijer.activity.find.O
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return FindActivity.b.C1590b.a.e(findActivity2);
                                }
                            };
                            composer.t(objB2);
                        }
                        composer.P();
                        Dr.g.f(localThemeScope2, null, null, null, composableLambdaC2, (Function0) objB2, sVar, 0.0f, false, abstractC5607aD2, composer, LocalThemeScope.f15770g | 24576 | (C.a.s.f15359f << 18) | (AbstractC5607a.f45514b << 27), 199);
                        composer.P();
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                a(FindActivity findActivity, LocalThemeScope localThemeScope, z1<C12074a0.ViewState> z1Var) {
                    this.f106420a = findActivity;
                    this.f106421b = localThemeScope;
                    this.f106422c = z1Var;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    c(composer, num.intValue());
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit d(FindActivity findActivity) {
                    findActivity.finishAfterTransition();
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit e(FindActivity findActivity) {
                    findActivity.D1().j();
                    return Unit.f142422a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.meijer.activity.find.FindActivity$b$b$b, reason: collision with other inner class name */
            static final class C1593b implements Function3<InterfaceC14814f, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ z1<HeaderDecorator> f106427a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ z1<DrawerLayoutDecorator> f106428b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ FindActivity f106429c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f106430d;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.meijer.mobile.meijer.activity.find.FindActivity$b$b$b$a */
                /* synthetic */ class a extends FunctionReferenceImpl implements Function1<AbstractC16373C, Unit> {
                    a(Object obj) {
                        super(1, obj, C16395g.class, "onNavigationRequest", "onNavigationRequest(Lcom/meijer/mobile/ui/navigation/DrawerNavigationRequest;)V", 0);
                    }

                    public final void a(AbstractC16373C p02) {
                        Intrinsics.j(p02, "p0");
                        ((C16395g) this.receiver).h(p02);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(AbstractC16373C abstractC16373C) {
                        a(abstractC16373C);
                        return Unit.f142422a;
                    }
                }

                C1593b(z1<HeaderDecorator> z1Var, z1<DrawerLayoutDecorator> z1Var2, FindActivity findActivity, LocalThemeScope localThemeScope) {
                    this.f106427a = z1Var;
                    this.f106428b = z1Var2;
                    this.f106429c = findActivity;
                    this.f106430d = localThemeScope;
                }

                public final void a(InterfaceC14814f Scaffold, Composer composer, int i10) throws XmlPullParserException, Resources.NotFoundException {
                    Intrinsics.j(Scaffold, "$this$Scaffold");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-1142180693, i10, -1, "com.meijer.mobile.meijer.activity.find.FindActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (FindActivity.kt:246)");
                    }
                    HeaderDecorator value = this.f106427a.getValue();
                    DrawerLayoutDecorator value2 = this.f106428b.getValue();
                    C16395g c16395gD1 = this.f106429c.D1();
                    composer.startReplaceGroup(5004770);
                    boolean zD = composer.D(c16395gD1);
                    Object objB = composer.B();
                    if (zD || objB == Composer.INSTANCE.a()) {
                        objB = new a(c16395gD1);
                        composer.t(objB);
                    }
                    composer.P();
                    AppVersion appVersionY1 = this.f106429c.y1();
                    C16372B.h(this.f106430d, value, value2, appVersionY1, null, (Function1) ((KFunction) objB), composer, LocalThemeScope.f15770g | (HeaderDecorator.f156340i << 3) | (DrawerLayoutDecorator.f156604h << 6), 8);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14814f interfaceC14814f, Composer composer, Integer num) throws XmlPullParserException, Resources.NotFoundException {
                    a(interfaceC14814f, composer, num.intValue());
                    return Unit.f142422a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.meijer.activity.find.FindActivity$b$b$c */
            static final class c implements Function3<InterfaceC14794C, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f106431a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ FindActivity f106432b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ C15339A f106433c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ z1<C12074a0.ViewState> f106434d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ InterfaceC16622O f106435e;

                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
                @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.FindActivity$onCreate$1$2$3$1$2$1$1$1", f = "FindActivity.kt", l = {292}, m = "invokeSuspend")
                /* renamed from: com.meijer.mobile.meijer.activity.find.FindActivity$b$b$c$a */
                static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

                    /* renamed from: a, reason: collision with root package name */
                    int f106436a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ C15339A f106437b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ StoreMapItem f106438c;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new a(this.f106437b, this.f106438c, continuation);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    a(C15339A c15339a, StoreMapItem storeMapItem, Continuation<? super a> continuation) {
                        super(2, continuation);
                        this.f106437b = c15339a;
                        this.f106438c = storeMapItem;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                        return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object objF = IntrinsicsKt.f();
                        int i10 = this.f106436a;
                        if (i10 != 0) {
                            if (i10 == 1) {
                                ResultKt.b(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            ResultKt.b(obj);
                            C15339A c15339a = this.f106437b;
                            int index = this.f106438c.getIndex();
                            this.f106436a = 1;
                            if (C15339A.l(c15339a, index, 0, this, 2, null) == objF) {
                                return objF;
                            }
                        }
                        return Unit.f142422a;
                    }
                }

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.meijer.mobile.meijer.activity.find.FindActivity$b$b$c$b, reason: collision with other inner class name */
                /* synthetic */ class C1594b extends FunctionReferenceImpl implements Function1<String, Unit> {
                    C1594b(Object obj) {
                        super(1, obj, C12074a0.class, "setSearchQuery", "setSearchQuery(Ljava/lang/String;)V", 0);
                    }

                    public final void a(String p02) {
                        Intrinsics.j(p02, "p0");
                        ((C12074a0) this.receiver).N(p02);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(String str) {
                        a(str);
                        return Unit.f142422a;
                    }
                }

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.meijer.mobile.meijer.activity.find.FindActivity$b$b$c$c, reason: collision with other inner class name */
                /* synthetic */ class C1595c extends FunctionReferenceImpl implements Function0<Unit> {
                    C1595c(Object obj) {
                        super(0, obj, C12074a0.class, "submitSearch", "submitSearch()V", 0);
                    }

                    public final void a() {
                        ((C12074a0) this.receiver).P();
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        a();
                        return Unit.f142422a;
                    }
                }

                c(LocalThemeScope localThemeScope, FindActivity findActivity, C15339A c15339a, z1<C12074a0.ViewState> z1Var, InterfaceC16622O interfaceC16622O) {
                    this.f106431a = localThemeScope;
                    this.f106432b = findActivity;
                    this.f106433c = c15339a;
                    this.f106434d = z1Var;
                    this.f106435e = interfaceC16622O;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit o(FindActivity findActivity, StoreMapItem storeMapItem) {
                    Intrinsics.j(storeMapItem, "storeMapItem");
                    findActivity.N1(storeMapItem, findActivity.I1());
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit r(FindActivity findActivity, z1 z1Var, Tq.k it) {
                    Intrinsics.j(it, "it");
                    findActivity.startActivity(Al.s.f693a.b(findActivity, it.getStoreId(), b.d(z1Var).getSearchType(), false));
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit s(InterfaceC16622O interfaceC16622O, C15339A c15339a, StoreMapItem item) {
                    Intrinsics.j(item, "item");
                    C16648k.d(interfaceC16622O, null, null, new a(c15339a, item, null), 3, null);
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit t(FindActivity findActivity, StoreMapItem storeMapItem) {
                    Intrinsics.j(storeMapItem, "storeMapItem");
                    findActivity.N1(storeMapItem, findActivity.I1());
                    return Unit.f142422a;
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14794C interfaceC14794C, Composer composer, Integer num) throws Resources.NotFoundException {
                    k(interfaceC14794C, composer, num.intValue());
                    return Unit.f142422a;
                }

                /* JADX WARN: Type inference failed for: r15v1 */
                /* JADX WARN: Type inference failed for: r15v2, types: [boolean, int] */
                /* JADX WARN: Type inference failed for: r15v22 */
                public final void k(InterfaceC14794C contentPadding, Composer composer, int i10) throws Resources.NotFoundException {
                    int i11;
                    z1<C12074a0.ViewState> z1Var;
                    e.Companion companion;
                    String str;
                    ?? r15;
                    LocalThemeScope localThemeScope;
                    Composer composer2 = composer;
                    Intrinsics.j(contentPadding, "contentPadding");
                    if ((i10 & 6) == 0) {
                        i11 = i10 | (composer2.V(contentPadding) ? 4 : 2);
                    } else {
                        i11 = i10;
                    }
                    if ((i11 & 19) == 18 && composer2.j()) {
                        composer2.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-796306162, i11, -1, "com.meijer.mobile.meijer.activity.find.FindActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (FindActivity.kt:255)");
                    }
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    Modifier modifierH = androidx.compose.foundation.layout.D.h(companion2, contentPadding);
                    LocalThemeScope localThemeScope2 = this.f106431a;
                    final FindActivity findActivity = this.f106432b;
                    final C15339A c15339a = this.f106433c;
                    final z1<C12074a0.ViewState> z1Var2 = this.f106434d;
                    final InterfaceC16622O interfaceC16622O = this.f106435e;
                    C5658d.m mVarH = C5658d.f48555a.h();
                    e.Companion companion3 = P0.e.INSTANCE;
                    MeasurePolicy measurePolicyA = C5665k.a(mVarH, companion3.k(), composer2, 0);
                    int iA = C5717f.a(composer2, 0);
                    InterfaceC5742s interfaceC5742sR = composer2.r();
                    Modifier modifierE = androidx.compose.ui.b.e(composer2, modifierH);
                    InterfaceC5811g.Companion companion4 = InterfaceC5811g.INSTANCE;
                    Function0<InterfaceC5811g> function0A = companion4.a();
                    if (composer2.k() == null) {
                        C5717f.c();
                    }
                    composer2.F();
                    if (composer2.h()) {
                        composer2.I(function0A);
                    } else {
                        composer2.s();
                    }
                    Composer composerA = D1.a(composer2);
                    D1.c(composerA, measurePolicyA, companion4.e());
                    D1.c(composerA, interfaceC5742sR, companion4.g());
                    Function2<InterfaceC5811g, Integer, Unit> function2B = companion4.b();
                    if (composerA.h() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                        composerA.t(Integer.valueOf(iA));
                        composerA.n(Integer.valueOf(iA), function2B);
                    }
                    D1.c(composerA, modifierE, companion4.f());
                    C14815g c14815g = C14815g.f139108a;
                    StoreDetails preferredStore = b.d(z1Var2).getPreferredStore();
                    composer2.startReplaceGroup(1154216985);
                    if (preferredStore == null) {
                        localThemeScope = localThemeScope2;
                        z1Var = z1Var2;
                        companion = companion3;
                        r15 = 0;
                        str = null;
                    } else {
                        Modifier modifierF = C18299z.f(companion2, "store_banner", null, 2, null);
                        boolean zE = findActivity.getFeatureManager().e(AbstractC18227f.K.f170550h);
                        composer2.startReplaceGroup(-1633490746);
                        boolean zD = composer2.D(findActivity) | composer2.V(z1Var2);
                        Object objB = composer2.B();
                        if (zD || objB == Composer.INSTANCE.a()) {
                            objB = new Function1() { // from class: com.meijer.mobile.meijer.activity.find.P
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return FindActivity.b.C1590b.c.r(findActivity, z1Var2, (Tq.k) obj);
                                }
                            };
                            composer2.t(objB);
                        }
                        composer2.P();
                        z1Var = z1Var2;
                        companion = companion3;
                        str = null;
                        r15 = 0;
                        Xq.e.e(localThemeScope2, modifierF, preferredStore, zE, (Function1) objB, composer2, LocalThemeScope.f15770g, 0);
                        localThemeScope = localThemeScope2;
                        composer2 = composer;
                        C17917Z.a(null, localThemeScope.getAdsColors().getAdsColorUIDivider().getColor(), 0.0f, 0.0f, composer2, 0, 13);
                    }
                    composer2.P();
                    Modifier modifierH2 = androidx.compose.foundation.layout.J.h(companion2, 0.0f, 1, str);
                    MeasurePolicy measurePolicyG = C5662h.g(companion.o(), r15);
                    int iA2 = C5717f.a(composer2, r15);
                    InterfaceC5742s interfaceC5742sR2 = composer2.r();
                    Modifier modifierE2 = androidx.compose.ui.b.e(composer2, modifierH2);
                    Function0<InterfaceC5811g> function0A2 = companion4.a();
                    if (composer2.k() == null) {
                        C5717f.c();
                    }
                    composer2.F();
                    if (composer2.h()) {
                        composer2.I(function0A2);
                    } else {
                        composer2.s();
                    }
                    Composer composerA2 = D1.a(composer2);
                    D1.c(composerA2, measurePolicyG, companion4.e());
                    D1.c(composerA2, interfaceC5742sR2, companion4.g());
                    Function2<InterfaceC5811g, Integer, Unit> function2B2 = companion4.b();
                    if (composerA2.h() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                        composerA2.t(Integer.valueOf(iA2));
                        composerA2.n(Integer.valueOf(iA2), function2B2);
                    }
                    D1.c(composerA2, modifierE2, companion4.f());
                    C5664j c5664j = C5664j.f48612a;
                    Modifier modifierH3 = androidx.compose.foundation.layout.J.h(C18299z.f(companion2, "store_map", str, 2, str), 0.0f, 1, str);
                    yl.k featureManager = findActivity.getFeatureManager();
                    AbstractC18227f.K k10 = AbstractC18227f.K.f170550h;
                    Modifier modifierI = androidx.compose.foundation.layout.J.i(modifierH3, featureManager.e(k10) ? H1.h.p(280) : H1.h.p(HttpResponseStatus.SUCCESS_OK));
                    List<StoreMapItem> listD = b.d(z1Var).d();
                    InterfaceC14794C interfaceC14794CE = androidx.compose.foundation.layout.D.e(0.0f, localThemeScope.getAdsSpacing().getTen().getDp(), 0.0f, 0.0f, 13, null);
                    composer2.startReplaceGroup(-1633490746);
                    boolean zD2 = composer2.D(interfaceC16622O) | composer2.V(c15339a);
                    Object objB2 = composer2.B();
                    if (zD2 || objB2 == Composer.INSTANCE.a()) {
                        objB2 = new Function1() { // from class: com.meijer.mobile.meijer.activity.find.Q
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return FindActivity.b.C1590b.c.s(interfaceC16622O, c15339a, (StoreMapItem) obj);
                            }
                        };
                        composer2.t(objB2);
                    }
                    Function1 function1 = (Function1) objB2;
                    composer2.P();
                    composer2.startReplaceGroup(5004770);
                    boolean zD3 = composer2.D(findActivity);
                    Object objB3 = composer2.B();
                    if (zD3 || objB3 == Composer.INSTANCE.a()) {
                        objB3 = new Function1() { // from class: com.meijer.mobile.meijer.activity.find.S
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return FindActivity.b.C1590b.c.t(findActivity, (StoreMapItem) obj);
                            }
                        };
                        composer2.t(objB3);
                    }
                    composer2.P();
                    int i12 = LocalThemeScope.f15770g;
                    final z1<C12074a0.ViewState> z1Var3 = z1Var;
                    LocalThemeScope localThemeScope3 = localThemeScope;
                    Xq.w.f(localThemeScope3, modifierI, listD, null, null, 10.0f, interfaceC14794CE, null, function1, (Function1) objB3, null, null, null, null, null, null, composer, i12 | 196608, 0, 32332);
                    String searchQuery = b.d(z1Var3).getSearchQuery();
                    String strC = C16193g.c(Vq.c.f37746i, composer, 0);
                    Modifier modifierM = androidx.compose.foundation.layout.D.m(C18299z.f(companion2, "store_searched_item_text", null, 2, null), localThemeScope3.getAdsSpacing().getFive().getDp(), H1.h.p(10), localThemeScope3.getAdsSpacing().getFive().getDp(), 0.0f, 8, null);
                    C12074a0 c12074a0A1 = findActivity.A1();
                    composer.startReplaceGroup(5004770);
                    boolean zD4 = composer.D(c12074a0A1);
                    Object objB4 = composer.B();
                    if (zD4 || objB4 == Composer.INSTANCE.a()) {
                        objB4 = new C1594b(c12074a0A1);
                        composer.t(objB4);
                    }
                    KFunction kFunction = (KFunction) objB4;
                    composer.P();
                    C12074a0 c12074a0A12 = findActivity.A1();
                    composer.startReplaceGroup(5004770);
                    boolean zD5 = composer.D(c12074a0A12);
                    Object objB5 = composer.B();
                    if (zD5 || objB5 == Composer.INSTANCE.a()) {
                        objB5 = new C1595c(c12074a0A12);
                        composer.t(objB5);
                    }
                    composer.P();
                    Er.n.b(localThemeScope3, searchQuery, strC, (Function1) kFunction, (Function0) ((KFunction) objB5), modifierM, null, null, findActivity.getFeatureManager().e(k10), C16193g.c(Vq.c.f37746i, composer, 0), composer, i12, 96);
                    Composer composer3 = composer;
                    composer3.v();
                    Oj.a storesLoadingState = b.d(z1Var3).getStoresLoadingState();
                    if (storesLoadingState instanceof a.Failed) {
                        composer3.startReplaceGroup(1424631351);
                        Modifier modifierF2 = C18299z.f(androidx.compose.foundation.layout.J.f(companion2, 0.0f, 1, null), "find_store_error_retry", null, 2, null);
                        String strA = C6408b.a(b.d(z1Var3).getStoresLoadingState().getMessage(), composer3, AbstractC5607a.f45514b);
                        String strC2 = C16193g.c(Bj.o.f3056z0, composer3, 0);
                        composer3.startReplaceGroup(5004770);
                        boolean zD6 = composer3.D(findActivity);
                        Object objB6 = composer3.B();
                        if (zD6 || objB6 == Composer.INSTANCE.a()) {
                            objB6 = new Function0() { // from class: com.meijer.mobile.meijer.activity.find.T
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return FindActivity.b.C1590b.c.l(findActivity);
                                }
                            };
                            composer3.t(objB6);
                        }
                        composer3.P();
                        C18286l.b(localThemeScope3, strA, strC2, modifierF2, (Function0) objB6, composer3, i12, 0);
                        composer3.P();
                    } else if (storesLoadingState instanceof a.NotLoading) {
                        composer3.startReplaceGroup(1425305136);
                        Modifier modifierF3 = C18299z.f(androidx.compose.foundation.layout.J.h(companion2, 0.0f, 1, null), "nearby_stores_list_view", null, 2, null);
                        AbstractC5607a resultLabel = b.d(z1Var3).getResultLabel();
                        List<StoreMapItem> listF = b.d(z1Var3).f();
                        List<StoreMapItem> listD2 = b.d(z1Var3).d();
                        PermissionRequestDecorator<Kr.a> permissionRequestDecoratorG = b.d(z1Var3).g();
                        boolean zI1 = findActivity.I1();
                        boolean zE2 = findActivity.getFeatureManager().e(k10);
                        composer3.startReplaceGroup(5004770);
                        boolean zD7 = composer3.D(findActivity);
                        Object objB7 = composer3.B();
                        if (zD7 || objB7 == Composer.INSTANCE.a()) {
                            objB7 = new Function1() { // from class: com.meijer.mobile.meijer.activity.find.U
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return FindActivity.b.C1590b.c.o(findActivity, (StoreMapItem) obj);
                                }
                            };
                            composer3.t(objB7);
                        }
                        Function1 function12 = (Function1) objB7;
                        composer3.P();
                        composer3.startReplaceGroup(-1633490746);
                        boolean zD8 = composer3.D(findActivity) | composer3.V(z1Var3);
                        Object objB8 = composer3.B();
                        if (zD8 || objB8 == Composer.INSTANCE.a()) {
                            objB8 = new Function0() { // from class: com.meijer.mobile.meijer.activity.find.V
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return FindActivity.b.C1590b.c.p(findActivity, z1Var3);
                                }
                            };
                            composer3.t(objB8);
                        }
                        Function0 function0 = (Function0) objB8;
                        composer3.P();
                        composer3.startReplaceGroup(5004770);
                        boolean zD9 = composer3.D(findActivity);
                        Object objB9 = composer3.B();
                        if (zD9 || objB9 == Composer.INSTANCE.a()) {
                            objB9 = new Function1() { // from class: com.meijer.mobile.meijer.activity.find.W
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return FindActivity.b.C1590b.c.q(findActivity, (Kr.a) obj);
                                }
                            };
                            composer3.t(objB9);
                        }
                        composer3.P();
                        Xq.o.u(localThemeScope3, modifierF3, resultLabel, listF, listD2, zI1, c15339a, zE2, permissionRequestDecoratorG, function12, function0, (Function1) objB9, composer3, (AbstractC5607a.f45514b << 6) | i12 | (PermissionRequestDecorator.f17508e << 24), 0, 0);
                        composer3 = composer3;
                        composer3.P();
                    } else if (storesLoadingState instanceof a.Loading) {
                        composer3.startReplaceGroup(1427047584);
                        K1.P(localThemeScope3, C18299z.f(androidx.compose.foundation.layout.J.f(companion2, 0.0f, 1, null), "find_store_loading", null, 2, null), b.d(z1Var3).getStoresLoadingState().getIsLoading(), null, composer3, i12, 4);
                        composer3 = composer3;
                        composer3.P();
                    } else {
                        if (!(storesLoadingState instanceof a.Paging)) {
                            composer3.startReplaceGroup(1154334087);
                            composer3.P();
                            throw new NoWhenBranchMatchedException();
                        }
                        composer3.startReplaceGroup(1427473617);
                        composer3.P();
                    }
                    composer3.v();
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit l(FindActivity findActivity) {
                    findActivity.A1().P();
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit p(FindActivity findActivity, z1 z1Var) {
                    findActivity.A1().D(b.d(z1Var).l());
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit q(FindActivity findActivity, Kr.a aVar) {
                    findActivity.M1(aVar);
                    return Unit.f142422a;
                }
            }

            C1590b(InterfaceC5730l0<C17927c1> interfaceC5730l0, FindActivity findActivity, z1<C12074a0.ViewState> z1Var, z1<HeaderDecorator> z1Var2, z1<DrawerLayoutDecorator> z1Var3, C15339A c15339a, InterfaceC16622O interfaceC16622O) {
                this.f106413a = interfaceC5730l0;
                this.f106414b = findActivity;
                this.f106415c = z1Var;
                this.f106416d = z1Var2;
                this.f106417e = z1Var3;
                this.f106418f = c15339a;
                this.f106419g = interfaceC16622O;
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
                    ComposerKt.U(-1116476336, i11, -1, "com.meijer.mobile.meijer.activity.find.FindActivity.onCreate.<anonymous>.<anonymous> (FindActivity.kt:210)");
                }
                C17921a1.a(C18299z.c(FullStoryAnnotationsKt.fsUnmask(Modifier.INSTANCE), false, 1, null), b.e(this.f106413a), ComposableLambdaKt.c(-235782891, true, new a(this.f106414b, AdsTheme, this.f106415c), composer, 54), null, null, null, 0, false, ComposableLambdaKt.c(-1142180693, true, new C1593b(this.f106416d, this.f106417e, this.f106414b, AdsTheme), composer, 54), b.e(this.f106413a).getDrawerState().e(), null, 0.0f, 0L, 0L, 0L, 0L, 0L, ComposableLambdaKt.c(-796306162, true, new c(AdsTheme, this.f106414b, this.f106418f, this.f106415c, this.f106419g), composer, 54), composer, 100663680, 12582912, 130296);
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

        b() {
        }

        public final void c(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(573176001, i10, -1, "com.meijer.mobile.meijer.activity.find.FindActivity.onCreate.<anonymous> (FindActivity.kt:183)");
            }
            z1 z1VarB = o1.b(FindActivity.this.C1().u(), null, composer, 0, 1);
            z1 z1VarB2 = o1.b(FindActivity.this.C1().v(), null, composer, 0, 1);
            C17932e0 c17932e0J = C17929d0.j(EnumC17935f0.f167889a, null, composer, 6, 2);
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = new C17963o1();
                composer.t(objB);
            }
            C17963o1 c17963o1 = (C17963o1) objB;
            composer.P();
            Object objB2 = composer.B();
            if (objB2 == companion.a()) {
                objB2 = androidx.compose.runtime.J.k(EmptyCoroutineContext.f142646a, composer);
                composer.t(objB2);
            }
            InterfaceC16622O interfaceC16622O = (InterfaceC16622O) objB2;
            z1 z1VarB3 = o1.b(FindActivity.this.A1().A(), null, composer, 0, 1);
            composer.startReplaceGroup(1849434622);
            Object objB3 = composer.B();
            if (objB3 == companion.a()) {
                objB3 = t1.e(new C17927c1(c17932e0J, c17963o1), null, 2, null);
                composer.t(objB3);
            }
            InterfaceC5730l0 interfaceC5730l0 = (InterfaceC5730l0) objB3;
            composer.P();
            C15339A c15339aB = C15340B.b(0, 0, composer, 0, 3);
            C16381K.b(FindActivity.this.D1(), c17932e0J, interfaceC16622O, composer, C16395g.f156492l);
            List<StoreDetails> listL = d(z1VarB3).l();
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(c15339aB);
            Object objB4 = composer.B();
            if (zV || objB4 == companion.a()) {
                objB4 = new a(c15339aB, null);
                composer.t(objB4);
            }
            composer.P();
            androidx.compose.runtime.J.g(listL, (Function2) objB4, composer, 0);
            Ji.K.b(null, ComposableLambdaKt.c(-1116476336, true, new C1590b(interfaceC5730l0, FindActivity.this, z1VarB3, z1VarB, z1VarB2, c15339aB, interfaceC16622O), composer, 54), composer, 48, 1);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            c(composer, num.intValue());
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C12074a0.ViewState d(z1<C12074a0.ViewState> z1Var) {
            return z1Var.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C17927c1 e(InterfaceC5730l0<C17927c1> interfaceC5730l0) {
            return interfaceC5730l0.getValue();
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ltv/g;", "Landroid/location/Location;", "", "it", "", "<anonymous>", "(Ltv/g;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.FindActivity$onPermissionCheckGranted$2", f = "FindActivity.kt", l = {}, m = "invokeSuspend")
    static final class d extends SuspendLambda implements Function3<InterfaceC17153g<? super Location>, Throwable, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f106442a;

        d(Continuation<? super d> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC17153g<? super Location> interfaceC17153g, Throwable th2, Continuation<? super Unit> continuation) {
            return FindActivity.this.new d(continuation).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f106442a == 0) {
                ResultKt.b(obj);
                FindActivity.this.locationUpdatesJob = null;
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class e implements InterfaceC14146b, FunctionAdapter {
        e() {
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC14146b) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.e(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, FindActivity.this, FindActivity.class, "handlePermissionsResult", "handlePermissionsResult(Ljava/util/Map;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // g.InterfaceC14146b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void a(Map<String, Boolean> p02) throws Exception {
            Intrinsics.j(p02, "p0");
            FindActivity.this.G1(p02);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class f extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f106445f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ComponentActivity componentActivity) {
            super(0);
            this.f106445f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f106445f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class g extends Lambda implements Function0<androidx.view.g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f106446f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ComponentActivity componentActivity) {
            super(0);
            this.f106446f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.view.g0 invoke() {
            return this.f106446f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class h extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f106447f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f106448g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f106447f = function0;
            this.f106448g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f106447f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f106448g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class i extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f106449f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(ComponentActivity componentActivity) {
            super(0);
            this.f106449f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f106449f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class j extends Lambda implements Function0<androidx.view.g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f106450f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(ComponentActivity componentActivity) {
            super(0);
            this.f106450f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.view.g0 invoke() {
            return this.f106450f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class k extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f106451f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f106452g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f106451f = function0;
            this.f106452g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f106451f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f106452g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, d2 = {"<anonymous>", "", "location", "Landroid/location/Location;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.FindActivity$onPermissionCheckGranted$1", f = "FindActivity.kt", l = {}, m = "invokeSuspend")
    static final class c extends SuspendLambda implements Function2<Location, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f106439a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f106440b;

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            c cVar = FindActivity.this.new c(continuation);
            cVar.f106440b = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Location location, Continuation<? super Unit> continuation) {
            return ((c) create(location, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            LatLng latLngC;
            IntrinsicsKt.f();
            if (this.f106439a == 0) {
                ResultKt.b(obj);
                Location location = (Location) this.f106440b;
                C12074a0 c12074a0A1 = FindActivity.this.A1();
                if (location != null) {
                    latLngC = Ds.i.c(location);
                } else {
                    latLngC = null;
                }
                c12074a0A1.K(latLngC);
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C12074a0 A1() {
        return (C12074a0) this.findStoreViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C16382L C1() {
        return (C16382L) this.navigationDrawerViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C16395g D1() {
        return (C16395g) this.navigationHelper.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"MissingPermission"})
    public final void G1(Map<String, Boolean> permissions) throws Exception {
        List<String> list = this.locationPermissions;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (!permissions.getOrDefault((String) it.next(), Boolean.FALSE).booleanValue()) {
                    K1(permissions);
                    return;
                }
            }
        }
        L1(permissions);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C16395g J1(FindActivity findActivity) {
        return new C16395g(findActivity);
    }

    @SuppressLint({"RestrictedApi"})
    private final void K1(Map<String, Boolean> permissions) throws Exception {
        uw.a.INSTANCE.d("LOCATION PERMISSION DENIED", new Object[0]);
        ((PickupManager) SingletonHolder.getInstance$default(PickupManager.INSTANCE, null, 1, null)).onPermissionChanged();
        qv.C0 c02 = this.locationUpdatesJob;
        if (c02 != null) {
            C0.a.a(c02, null, 1, null);
        }
        A1().L(permissions);
        A1().K(null);
    }

    @SuppressLint({"RestrictedApi"})
    private final void L1(Map<String, Boolean> permissions) throws Exception {
        uw.a.INSTANCE.a("LOCATION PERMISSION GRANTED by user", new Object[0]);
        this.checkedPermissions = false;
        ((PickupManager) SingletonHolder.getInstance$default(PickupManager.INSTANCE, null, 1, null)).onPermissionChanged();
        qv.C0 c02 = this.locationUpdatesJob;
        if (c02 != null) {
            C0.a.a(c02, null, 1, null);
        }
        this.locationUpdatesJob = C17154h.J(C17154h.N(C17154h.Z(C17154h.O(B1().b(), new c(null)), 1), new d(null)), C6031t.a(this));
        A1().L(permissions);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M1(Kr.a resolution) {
        if (resolution instanceof a.EnableLocationPermissions) {
            startActivity(getMeijerIntent().b(this));
        } else if (Intrinsics.e(resolution, a.b.f17507a)) {
            startActivity(Al.h.a());
        } else if (resolution != null) {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void x1() throws Exception {
        if (!this.checkedPermissions) {
            this.checkedPermissions = true;
            this.permissionsResultLauncher.a(this.locationPermissions.toArray(new String[0]));
            return;
        }
        List<String> list = this.locationPermissions;
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.f(MapsKt.f(CollectionsKt.x(list, 10)), 16));
        for (Object obj : list) {
            linkedHashMap.put(obj, Boolean.valueOf(C18064b.a(this, (String) obj)));
        }
        G1(linkedHashMap);
    }

    public final C12098m0 B1() {
        C12098m0 c12098m0 = this.locationUpdatesProvider;
        if (c12098m0 != null) {
            return c12098m0;
        }
        Intrinsics.y("locationUpdatesProvider");
        return null;
    }

    public final InterfaceC14261a getAnalyticsEngine() {
        InterfaceC14261a interfaceC14261a = this.analyticsEngine;
        if (interfaceC14261a != null) {
            return interfaceC14261a;
        }
        Intrinsics.y("analyticsEngine");
        return null;
    }

    public final yl.k getFeatureManager() {
        yl.k kVar = this.featureManager;
        if (kVar != null) {
            return kVar;
        }
        Intrinsics.y("featureManager");
        return null;
    }

    public final Cl.e getMeijerIntent() {
        Cl.e eVar = this.meijerIntent;
        if (eVar != null) {
            return eVar;
        }
        Intrinsics.y("meijerIntent");
        return null;
    }

    public final AppVersion y1() {
        AppVersion appVersion = this.appVersion;
        if (appVersion != null) {
            return appVersion;
        }
        Intrinsics.y("appVersion");
        return null;
    }

    public FindActivity() {
        this.locationPermissions = CollectionsKt.r("android.permission.ACCESS_FINE_LOCATION", Build.VERSION.SDK_INT >= 34 ? "android.permission.FOREGROUND_SERVICE_LOCATION" : null);
        this.findStoreResultLauncher = registerForActivityResult(new h.i(), new a());
        this.permissionsResultLauncher = registerForActivityResult(new C14320g(), new e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String E1() {
        return getIntent().getStringExtra("com.meijer.intent.extra.TOOLBAR_TITLE");
    }

    private final Uri F1() {
        Parcelable parcelable;
        Intent intent = getIntent();
        Intrinsics.i(intent, "getIntent(...)");
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable = (Parcelable) intent.getParcelableExtra("com.meijer.intent.extra.DEEP_LINK_URI", Uri.class);
        } else {
            Parcelable parcelableExtra = intent.getParcelableExtra("com.meijer.intent.extra.DEEP_LINK_URI");
            if (!(parcelableExtra instanceof Uri)) {
                parcelableExtra = null;
            }
            parcelable = (Uri) parcelableExtra;
        }
        return (Uri) parcelable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H1(C14145a result) {
        Parcelable parcelable;
        Intent data = result.getData();
        if (result.getResultCode() == -1 && data != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) data.getParcelableExtra("com.meijer.intent.extra.STORE_DETAILS", StoreDetails.class);
            } else {
                Parcelable parcelableExtra = data.getParcelableExtra("com.meijer.intent.extra.STORE_DETAILS");
                if (!(parcelableExtra instanceof StoreDetails)) {
                    parcelableExtra = null;
                }
                parcelable = (StoreDetails) parcelableExtra;
            }
            StoreDetails storeDetails = (StoreDetails) parcelable;
            boolean booleanExtra = getIntent().getBooleanExtra("com.meijer.intent.extra.EXIT_SEARCH", false);
            if (storeDetails != null && (A1().getSearchType() == ok.i.f153987e || booleanExtra)) {
                setResult(-1, data);
                finish();
            } else if (storeDetails != null) {
                A1().M(storeDetails);
                getIntent().putExtra("com.meijer.intent.extra.STORE_ID", storeDetails.getStoreId());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean I1() {
        return getIntent().getBooleanExtra("com.meijer.intent.extra.IS_PICK_UP_MODE", true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N1(StoreMapItem storeMapItem, boolean isPickUpMode) {
        ok.i searchType = storeMapItem.getSearchType();
        ok.i iVar = ok.i.f153985c;
        ok.i iVar2 = ok.i.f153984b;
        if (CollectionsKt.p(iVar, iVar2).contains(storeMapItem.getSearchType())) {
            if (!isPickUpMode || !storeMapItem.getIsPreferredStore()) {
                searchType = iVar;
            } else {
                searchType = iVar2;
            }
        }
        if (storeMapItem.getSearchType() == ok.i.f153987e && storeMapItem.getIsPreferredStore() && isPickUpMode) {
            searchType = ok.i.f153986d;
        }
        ok.i iVar3 = searchType;
        if (z1() != 0) {
            finish();
        }
        this.findStoreResultLauncher.a(Al.s.f693a.c(this, storeMapItem.getStore(), iVar3, z1(), F1()));
    }

    private final int z1() {
        return getIntent().getIntExtra("com.meijer.intent.extra.DASHBOARD_LINK", 0);
    }

    @Override // com.meijer.mobile.meijer.activity.find.Hilt_FindActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        Object serializableExtra;
        super.onCreate(savedInstanceState);
        getLifecycle().a(A1());
        C1().w(536871812);
        if (getIntent().hasExtra("com.meijer.intent.extra.FROM_NAV_MENU")) {
            getAnalyticsEngine().b(C14476c.a("event: search: menu find"), C14476c.c("search: menu find"), C14476c.g("menu"));
        }
        C12074a0 c12074a0A1 = A1();
        Intent intent = getIntent();
        Intrinsics.i(intent, "getIntent(...)");
        if (Build.VERSION.SDK_INT >= 33) {
            serializableExtra = intent.getSerializableExtra("com.meijer.intent.extra.SEARCH_TYPE", ok.i.class);
        } else {
            Object serializableExtra2 = intent.getSerializableExtra("com.meijer.intent.extra.SEARCH_TYPE");
            if (!(serializableExtra2 instanceof ok.i)) {
                serializableExtra2 = null;
            }
            serializableExtra = (ok.i) serializableExtra2;
        }
        c12074a0A1.O((ok.i) serializableExtra);
        A1().B(I1());
        C13589e.b(this, null, ComposableLambdaKt.composableLambdaInstance(573176001, true, new b()), 1, null);
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        qv.C0 c02 = this.locationUpdatesJob;
        if (c02 != null) {
            C0.a.a(c02, null, 1, null);
        }
        this.locationUpdatesJob = null;
    }

    @Override // android.app.Activity
    protected void onResume() throws Exception {
        super.onResume();
        x1();
    }
}
