package com.meijer.mobile.meijer.activity.find;

import Ki.C;
import Ki.LocalThemeScope;
import Kk.AppVersion;
import Kr.PermissionRequestDecorator;
import Kr.a;
import P0.e;
import Pj.a;
import V2.CreationExtras;
import Yq.StoreMapItem;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.res.Resources;
import android.location.Location;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5804h;
import androidx.compose.foundation.layout.C5806j;
import androidx.compose.foundation.layout.C5807k;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.o1;
import androidx.compose.runtime.t1;
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import androidx.view.C6173t;
import androidx.view.ComponentActivity;
import androidx.view.f0;
import bk.AbstractC6392a;
import com.fullstory.compose.FullStoryAnnotationsKt;
import com.google.android.gms.maps.model.LatLng;
import com.meijer.mobile.meijer.activity.find.C12199a0;
import com.meijer.mobile.meijer.activity.find.FindActivity;
import com.meijer.mobile.meijer.activity.find.productdetail.K1;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import com.radiusnetworks.flybuy.sdk.pickup.PickupManager;
import com.radiusnetworks.flybuy.sdk.util.SingletonHolder;
import dk.C13698b;
import e.C13737e;
import g.AbstractC14276c;
import g.C14274a;
import g.InterfaceC14275b;
import h.C14433g;
import hi.InterfaceC14523a;
import ii.C14756c;
import j0.C14903g;
import j0.InterfaceC14882C;
import j0.InterfaceC14902f;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.C17983Z;
import kotlin.C17987a1;
import kotlin.C17993c1;
import kotlin.C17995d0;
import kotlin.C17998e0;
import kotlin.C18029o1;
import kotlin.EnumC18001f0;
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
import l0.C15429A;
import l0.C15430B;
import mv.C0;
import mv.C15809k;
import mv.InterfaceC15783O;
import org.xmlpull.v1.XmlPullParserException;
import p1.C16338g;
import pk.StoreDetails;
import ps.AbstractC16499C;
import ps.C16498B;
import ps.C16507K;
import ps.C16508L;
import ps.C16521g;
import ps.DrawerLayoutDecorator;
import ps.HeaderDecorator;
import pv.C16563h;
import pv.InterfaceC16562g;
import yk.C18326b;
import yr.C18357l;
import yr.C18370z;
import zl.AbstractC18503f;

@Metadata(d1 = {"\u0000Ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u0003J#\u0010\u0012\u001a\u00020\u00062\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eH\u0003¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0014\u001a\u00020\u00062\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eH\u0003¢\u0006\u0004\b\u0014\u0010\u0013J#\u0010\u0015\u001a\u00020\u00062\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eH\u0003¢\u0006\u0004\b\u0015\u0010\u0013J\u001f\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001d\u001a\u00020\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u001f\u0010\u0003J\u000f\u0010 \u001a\u00020\u0006H\u0014¢\u0006\u0004\b \u0010\u0003R\"\u0010(\u001a\u00020!8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u0016\u0010+\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\"\u00103\u001a\u00020,8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u0010;\u001a\u0002048\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010C\u001a\u00020<8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\"\u0010K\u001a\u00020D8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\"\u0010S\u001a\u00020L8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\u0018\u0010W\u001a\u0004\u0018\u00010T8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR\u001b\u0010]\u001a\u00020X8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\R\u001b\u0010b\u001a\u00020^8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b_\u0010Z\u001a\u0004\b`\u0010aR\u001b\u0010g\u001a\u00020c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bd\u0010Z\u001a\u0004\be\u0010fR\u001a\u0010k\u001a\b\u0012\u0004\u0012\u00020\u000f0h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010jR\u001a\u0010p\u001a\b\u0012\u0004\u0012\u00020m0l8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010oR \u0010s\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0q0l8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\br\u0010oR\u0014\u0010w\u001a\u00020t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bu\u0010vR\u0016\u0010{\u001a\u0004\u0018\u00010x8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\by\u0010zR\u0016\u0010~\u001a\u0004\u0018\u00010\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b|\u0010}R\u0015\u0010\u0018\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u007f\u0010\u0080\u0001¨\u0006\u0085\u0001²\u0006\u000e\u0010\u0082\u0001\u001a\u00030\u0081\u00018\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0084\u0001\u001a\u00030\u0083\u00018\nX\u008a\u0084\u0002"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/FindActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "Lg/a;", "result", "", "H1", "(Lg/a;)V", "LKr/a;", "resolution", "M1", "(LKr/a;)V", "x1", "", "", "", "permissions", "G1", "(Ljava/util/Map;)V", "L1", "K1", "LYq/d;", "storeMapItem", "isPickUpMode", "N1", "(LYq/d;Z)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "onPause", "Lhi/a;", "v", "Lhi/a;", "getAnalyticsEngine", "()Lhi/a;", "setAnalyticsEngine", "(Lhi/a;)V", "analyticsEngine", "w", "Z", "checkedPermissions", "LTq/j;", "x", "LTq/j;", "getStoreProvider", "()LTq/j;", "setStoreProvider", "(LTq/j;)V", "storeProvider", "LKk/a;", "y", "LKk/a;", "y1", "()LKk/a;", "setAppVersion", "(LKk/a;)V", "appVersion", "LDl/e;", "z", "LDl/e;", "getMeijerIntent", "()LDl/e;", "setMeijerIntent", "(LDl/e;)V", "meijerIntent", "Lcom/meijer/mobile/meijer/activity/find/m0;", "A", "Lcom/meijer/mobile/meijer/activity/find/m0;", "B1", "()Lcom/meijer/mobile/meijer/activity/find/m0;", "setLocationUpdatesProvider", "(Lcom/meijer/mobile/meijer/activity/find/m0;)V", "locationUpdatesProvider", "Lzl/k;", "B", "Lzl/k;", "getFeatureManager", "()Lzl/k;", "setFeatureManager", "(Lzl/k;)V", "featureManager", "Lmv/C0;", "C", "Lmv/C0;", "locationUpdatesJob", "Lps/g;", "D", "Lkotlin/Lazy;", "D1", "()Lps/g;", "navigationHelper", "Lps/L;", "E", "C1", "()Lps/L;", "navigationDrawerViewModel", "Lcom/meijer/mobile/meijer/activity/find/a0;", "F", "A1", "()Lcom/meijer/mobile/meijer/activity/find/a0;", "findStoreViewModel", "", "G", "Ljava/util/List;", "locationPermissions", "Lg/c;", "Landroid/content/Intent;", "H", "Lg/c;", "findStoreResultLauncher", "", "I", "permissionsResultLauncher", "", "z1", "()I", "deeplinkCode", "Landroid/net/Uri;", "F1", "()Landroid/net/Uri;", "uri", "E1", "()Ljava/lang/String;", "title", "I1", "()Z", "Lcom/meijer/mobile/meijer/activity/find/a0$b;", "viewState", "Lx0/c1;", "scaffoldState", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class FindActivity extends Hilt_FindActivity {

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    public C12223m0 locationUpdatesProvider;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    public zl.k featureManager;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private mv.C0 locationUpdatesJob;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private final Lazy navigationHelper = LazyKt.b(new Function0() { // from class: com.meijer.mobile.meijer.activity.find.M
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FindActivity.J1(this.f107351a);
        }
    });

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private final Lazy navigationDrawerViewModel = new androidx.view.e0(Reflection.b(C16508L.class), new g(this), new f(this), new h(null, this));

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private final Lazy findStoreViewModel = new androidx.view.e0(Reflection.b(C12199a0.class), new j(this), new i(this), new k(null, this));

    /* renamed from: G, reason: collision with root package name and from kotlin metadata */
    private final List<String> locationPermissions;

    /* renamed from: H, reason: collision with root package name and from kotlin metadata */
    private final AbstractC14276c<Intent> findStoreResultLauncher;

    /* renamed from: I, reason: collision with root package name and from kotlin metadata */
    private final AbstractC14276c<String[]> permissionsResultLauncher;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    public InterfaceC14523a analyticsEngine;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private boolean checkedPermissions;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    public Tq.j storeProvider;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    public AppVersion appVersion;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    public Dl.e meijerIntent;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class a implements InterfaceC14275b, FunctionAdapter {
        a() {
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC14275b) && (obj instanceof FunctionAdapter)) {
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

        @Override // g.InterfaceC14275b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void a(C14274a p02) {
            Intrinsics.j(p02, "p0");
            FindActivity.this.H1(p02);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class b implements Function2<Composer, Integer, Unit> {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.FindActivity$onCreate$1$1$1", f = "FindActivity.kt", l = {207}, m = "invokeSuspend")
        static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f107267a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C15429A f107268b;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.f107268b, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C15429A c15429a, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f107268b = c15429a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f107267a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    C15429A c15429a = this.f107268b;
                    this.f107267a = 1;
                    if (C15429A.J(c15429a, 0, 0, this, 2, null) == objF) {
                        return objF;
                    }
                }
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.find.FindActivity$b$b, reason: collision with other inner class name */
        static final class C1599b implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0<C17993c1> f107269a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ FindActivity f107270b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ z1<C12199a0.ViewState> f107271c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ z1<HeaderDecorator> f107272d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ z1<DrawerLayoutDecorator> f107273e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ C15429A f107274f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ InterfaceC15783O f107275g;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.meijer.activity.find.FindActivity$b$b$a */
            static final class a implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ FindActivity f107276a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f107277b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ z1<C12199a0.ViewState> f107278c;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.meijer.mobile.meijer.activity.find.FindActivity$b$b$a$a, reason: collision with other inner class name */
                static final class C1600a implements Function2<Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f107279a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ FindActivity f107280b;

                    C1600a(LocalThemeScope localThemeScope, FindActivity findActivity) {
                        this.f107279a = localThemeScope;
                        this.f107280b = findActivity;
                    }

                    public final void a(Composer composer, int i10) {
                        if ((i10 & 3) == 2 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(1185997296, i10, -1, "com.meijer.mobile.meijer.activity.find.FindActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FindActivity.kt:219)");
                        }
                        LocalThemeScope localThemeScope = this.f107279a;
                        String strE1 = this.f107280b.E1();
                        composer.startReplaceGroup(1577071401);
                        if (strE1 == null) {
                            strE1 = C16338g.c(Vq.c.f40138H, composer, 0);
                        }
                        composer.P();
                        Dr.g.g(localThemeScope, strE1, null, false, null, 0, null, 0, composer, LocalThemeScope.f17314g, 126);
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

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.meijer.mobile.meijer.activity.find.FindActivity$b$b$a$b, reason: collision with other inner class name */
                static final class C1601b implements Function2<Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f107281a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ FindActivity f107282b;

                    C1601b(LocalThemeScope localThemeScope, FindActivity findActivity) {
                        this.f107281a = localThemeScope;
                        this.f107282b = findActivity;
                    }

                    public final void a(Composer composer, int i10) {
                        if ((i10 & 3) == 2 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(2024323961, i10, -1, "com.meijer.mobile.meijer.activity.find.FindActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FindActivity.kt:231)");
                        }
                        LocalThemeScope localThemeScope = this.f107281a;
                        String strE1 = this.f107282b.E1();
                        composer.startReplaceGroup(-244855256);
                        if (strE1 == null) {
                            strE1 = C16338g.c(Vq.c.f40169g, composer, 0);
                        }
                        composer.P();
                        Dr.g.g(localThemeScope, strE1, null, false, null, 0, null, 0, composer, LocalThemeScope.f17314g, 126);
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

                public final void c(Composer composer, int i10) {
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-235782891, i10, -1, "com.meijer.mobile.meijer.activity.find.FindActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (FindActivity.kt:216)");
                    }
                    if (this.f107276a.getFeatureManager().e(AbstractC18503f.K.f172850h)) {
                        composer.startReplaceGroup(-1936467885);
                        AbstractC6392a abstractC6392aD = AbstractC6392a.INSTANCE.d(Cj.o.f5080p, new Object[0]);
                        C.f.d dVar = C.f.d.f17051e;
                        LocalThemeScope localThemeScope = this.f107277b;
                        ComposableLambda composableLambdaC = ComposableLambdaKt.c(1185997296, true, new C1600a(localThemeScope, this.f107276a), composer, 54);
                        composer.startReplaceGroup(5004770);
                        boolean zD = composer.D(this.f107276a);
                        final FindActivity findActivity = this.f107276a;
                        Object objB = composer.B();
                        if (zD || objB == Composer.INSTANCE.a()) {
                            objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.find.N
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return FindActivity.b.C1599b.a.d(findActivity);
                                }
                            };
                            composer.t(objB);
                        }
                        composer.P();
                        Dr.g.f(localThemeScope, null, null, null, composableLambdaC, (Function0) objB, dVar, 0.0f, false, abstractC6392aD, composer, LocalThemeScope.f17314g | 24576 | (C.f.d.f17052f << 18) | (AbstractC6392a.f60445b << 27), 199);
                        composer.P();
                    } else {
                        composer.startReplaceGroup(-1935731883);
                        AbstractC6392a abstractC6392aD2 = b.d(this.f107278c).getSearchType() != pk.i.f156747e ? AbstractC6392a.INSTANCE.d(Cj.o.f5080p, new Object[0]) : AbstractC6392a.INSTANCE.d(ps.j0.f157327d, new Object[0]);
                        C.a.s sVar = C.a.s.f16902e;
                        LocalThemeScope localThemeScope2 = this.f107277b;
                        ComposableLambda composableLambdaC2 = ComposableLambdaKt.c(2024323961, true, new C1601b(localThemeScope2, this.f107276a), composer, 54);
                        composer.startReplaceGroup(5004770);
                        boolean zD2 = composer.D(this.f107276a);
                        final FindActivity findActivity2 = this.f107276a;
                        Object objB2 = composer.B();
                        if (zD2 || objB2 == Composer.INSTANCE.a()) {
                            objB2 = new Function0() { // from class: com.meijer.mobile.meijer.activity.find.O
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return FindActivity.b.C1599b.a.e(findActivity2);
                                }
                            };
                            composer.t(objB2);
                        }
                        composer.P();
                        Dr.g.f(localThemeScope2, null, null, null, composableLambdaC2, (Function0) objB2, sVar, 0.0f, false, abstractC6392aD2, composer, LocalThemeScope.f17314g | 24576 | (C.a.s.f16903f << 18) | (AbstractC6392a.f60445b << 27), 199);
                        composer.P();
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                a(FindActivity findActivity, LocalThemeScope localThemeScope, z1<C12199a0.ViewState> z1Var) {
                    this.f107276a = findActivity;
                    this.f107277b = localThemeScope;
                    this.f107278c = z1Var;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    c(composer, num.intValue());
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit d(FindActivity findActivity) {
                    findActivity.finishAfterTransition();
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit e(FindActivity findActivity) {
                    findActivity.D1().j();
                    return Unit.f143329a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.meijer.activity.find.FindActivity$b$b$b, reason: collision with other inner class name */
            static final class C1602b implements Function3<InterfaceC14902f, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ z1<HeaderDecorator> f107283a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ z1<DrawerLayoutDecorator> f107284b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ FindActivity f107285c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f107286d;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.meijer.mobile.meijer.activity.find.FindActivity$b$b$b$a */
                /* synthetic */ class a extends FunctionReferenceImpl implements Function1<AbstractC16499C, Unit> {
                    a(Object obj) {
                        super(1, obj, C16521g.class, "onNavigationRequest", "onNavigationRequest(Lcom/meijer/mobile/ui/navigation/DrawerNavigationRequest;)V", 0);
                    }

                    public final void a(AbstractC16499C p02) {
                        Intrinsics.j(p02, "p0");
                        ((C16521g) this.receiver).h(p02);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(AbstractC16499C abstractC16499C) {
                        a(abstractC16499C);
                        return Unit.f143329a;
                    }
                }

                C1602b(z1<HeaderDecorator> z1Var, z1<DrawerLayoutDecorator> z1Var2, FindActivity findActivity, LocalThemeScope localThemeScope) {
                    this.f107283a = z1Var;
                    this.f107284b = z1Var2;
                    this.f107285c = findActivity;
                    this.f107286d = localThemeScope;
                }

                public final void a(InterfaceC14902f Scaffold, Composer composer, int i10) throws XmlPullParserException, Resources.NotFoundException {
                    Intrinsics.j(Scaffold, "$this$Scaffold");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-1142180693, i10, -1, "com.meijer.mobile.meijer.activity.find.FindActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (FindActivity.kt:246)");
                    }
                    HeaderDecorator value = this.f107283a.getValue();
                    DrawerLayoutDecorator value2 = this.f107284b.getValue();
                    C16521g c16521gD1 = this.f107285c.D1();
                    composer.startReplaceGroup(5004770);
                    boolean zD = composer.D(c16521gD1);
                    Object objB = composer.B();
                    if (zD || objB == Composer.INSTANCE.a()) {
                        objB = new a(c16521gD1);
                        composer.t(objB);
                    }
                    composer.P();
                    AppVersion appVersionY1 = this.f107285c.y1();
                    C16498B.h(this.f107286d, value, value2, appVersionY1, null, (Function1) ((KFunction) objB), composer, LocalThemeScope.f17314g | (HeaderDecorator.f157113i << 3) | (DrawerLayoutDecorator.f157377h << 6), 8);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14902f interfaceC14902f, Composer composer, Integer num) throws XmlPullParserException, Resources.NotFoundException {
                    a(interfaceC14902f, composer, num.intValue());
                    return Unit.f143329a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.meijer.activity.find.FindActivity$b$b$c */
            static final class c implements Function3<InterfaceC14882C, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f107287a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ FindActivity f107288b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ C15429A f107289c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ z1<C12199a0.ViewState> f107290d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ InterfaceC15783O f107291e;

                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
                @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.FindActivity$onCreate$1$2$3$1$2$1$1$1", f = "FindActivity.kt", l = {292}, m = "invokeSuspend")
                /* renamed from: com.meijer.mobile.meijer.activity.find.FindActivity$b$b$c$a */
                static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

                    /* renamed from: a, reason: collision with root package name */
                    int f107292a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ C15429A f107293b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ StoreMapItem f107294c;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new a(this.f107293b, this.f107294c, continuation);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    a(C15429A c15429a, StoreMapItem storeMapItem, Continuation<? super a> continuation) {
                        super(2, continuation);
                        this.f107293b = c15429a;
                        this.f107294c = storeMapItem;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                        return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object objF = IntrinsicsKt.f();
                        int i10 = this.f107292a;
                        if (i10 != 0) {
                            if (i10 == 1) {
                                ResultKt.b(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            ResultKt.b(obj);
                            C15429A c15429a = this.f107293b;
                            int index = this.f107294c.getIndex();
                            this.f107292a = 1;
                            if (C15429A.l(c15429a, index, 0, this, 2, null) == objF) {
                                return objF;
                            }
                        }
                        return Unit.f143329a;
                    }
                }

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.meijer.mobile.meijer.activity.find.FindActivity$b$b$c$b, reason: collision with other inner class name */
                /* synthetic */ class C1603b extends FunctionReferenceImpl implements Function1<String, Unit> {
                    C1603b(Object obj) {
                        super(1, obj, C12199a0.class, "setSearchQuery", "setSearchQuery(Ljava/lang/String;)V", 0);
                    }

                    public final void a(String p02) {
                        Intrinsics.j(p02, "p0");
                        ((C12199a0) this.receiver).N(p02);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(String str) {
                        a(str);
                        return Unit.f143329a;
                    }
                }

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.meijer.mobile.meijer.activity.find.FindActivity$b$b$c$c, reason: collision with other inner class name */
                /* synthetic */ class C1604c extends FunctionReferenceImpl implements Function0<Unit> {
                    C1604c(Object obj) {
                        super(0, obj, C12199a0.class, "submitSearch", "submitSearch()V", 0);
                    }

                    public final void a() {
                        ((C12199a0) this.receiver).P();
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        a();
                        return Unit.f143329a;
                    }
                }

                c(LocalThemeScope localThemeScope, FindActivity findActivity, C15429A c15429a, z1<C12199a0.ViewState> z1Var, InterfaceC15783O interfaceC15783O) {
                    this.f107287a = localThemeScope;
                    this.f107288b = findActivity;
                    this.f107289c = c15429a;
                    this.f107290d = z1Var;
                    this.f107291e = interfaceC15783O;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit o(FindActivity findActivity, StoreMapItem storeMapItem) {
                    Intrinsics.j(storeMapItem, "storeMapItem");
                    findActivity.N1(storeMapItem, findActivity.I1());
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit r(FindActivity findActivity, z1 z1Var, Tq.k it) {
                    Intrinsics.j(it, "it");
                    findActivity.startActivity(Bl.s.f3151a.b(findActivity, it.getStoreId(), b.d(z1Var).getSearchType(), false));
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit s(InterfaceC15783O interfaceC15783O, C15429A c15429a, StoreMapItem item) {
                    Intrinsics.j(item, "item");
                    C15809k.d(interfaceC15783O, null, null, new a(c15429a, item, null), 3, null);
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit t(FindActivity findActivity, StoreMapItem storeMapItem) {
                    Intrinsics.j(storeMapItem, "storeMapItem");
                    findActivity.N1(storeMapItem, findActivity.I1());
                    return Unit.f143329a;
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14882C interfaceC14882C, Composer composer, Integer num) throws Resources.NotFoundException {
                    k(interfaceC14882C, composer, num.intValue());
                    return Unit.f143329a;
                }

                /* JADX WARN: Type inference failed for: r15v1 */
                /* JADX WARN: Type inference failed for: r15v2, types: [boolean, int] */
                /* JADX WARN: Type inference failed for: r15v22 */
                public final void k(InterfaceC14882C contentPadding, Composer composer, int i10) throws Resources.NotFoundException {
                    int i11;
                    z1<C12199a0.ViewState> z1Var;
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
                    LocalThemeScope localThemeScope2 = this.f107287a;
                    final FindActivity findActivity = this.f107288b;
                    final C15429A c15429a = this.f107289c;
                    final z1<C12199a0.ViewState> z1Var2 = this.f107290d;
                    final InterfaceC15783O interfaceC15783O = this.f107291e;
                    C5800d.m mVarH = C5800d.f48779a.h();
                    e.Companion companion3 = P0.e.INSTANCE;
                    MeasurePolicy measurePolicyA = C5807k.a(mVarH, companion3.k(), composer2, 0);
                    int iA = C5859f.a(composer2, 0);
                    InterfaceC5884s interfaceC5884sR = composer2.r();
                    Modifier modifierE = androidx.compose.ui.b.e(composer2, modifierH);
                    InterfaceC5953g.Companion companion4 = InterfaceC5953g.INSTANCE;
                    Function0<InterfaceC5953g> function0A = companion4.a();
                    if (composer2.k() == null) {
                        C5859f.c();
                    }
                    composer2.F();
                    if (composer2.h()) {
                        composer2.I(function0A);
                    } else {
                        composer2.s();
                    }
                    Composer composerA = D1.a(composer2);
                    D1.c(composerA, measurePolicyA, companion4.e());
                    D1.c(composerA, interfaceC5884sR, companion4.g());
                    Function2<InterfaceC5953g, Integer, Unit> function2B = companion4.b();
                    if (composerA.h() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                        composerA.t(Integer.valueOf(iA));
                        composerA.n(Integer.valueOf(iA), function2B);
                    }
                    D1.c(composerA, modifierE, companion4.f());
                    C14903g c14903g = C14903g.f139698a;
                    StoreDetails preferredStore = b.d(z1Var2).getPreferredStore();
                    composer2.startReplaceGroup(1154216985);
                    if (preferredStore == null) {
                        localThemeScope = localThemeScope2;
                        z1Var = z1Var2;
                        companion = companion3;
                        r15 = 0;
                        str = null;
                    } else {
                        Modifier modifierF = C18370z.f(companion2, "store_banner", null, 2, null);
                        boolean zE = findActivity.getFeatureManager().e(AbstractC18503f.K.f172850h);
                        composer2.startReplaceGroup(-1633490746);
                        boolean zD = composer2.D(findActivity) | composer2.V(z1Var2);
                        Object objB = composer2.B();
                        if (zD || objB == Composer.INSTANCE.a()) {
                            objB = new Function1() { // from class: com.meijer.mobile.meijer.activity.find.P
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return FindActivity.b.C1599b.c.r(findActivity, z1Var2, (Tq.k) obj);
                                }
                            };
                            composer2.t(objB);
                        }
                        composer2.P();
                        z1Var = z1Var2;
                        companion = companion3;
                        str = null;
                        r15 = 0;
                        Xq.e.e(localThemeScope2, modifierF, preferredStore, zE, (Function1) objB, composer2, LocalThemeScope.f17314g, 0);
                        localThemeScope = localThemeScope2;
                        composer2 = composer;
                        C17983Z.a(null, localThemeScope.getAdsColors().getAdsColorUIDivider().getColor(), 0.0f, 0.0f, composer2, 0, 13);
                    }
                    composer2.P();
                    Modifier modifierH2 = androidx.compose.foundation.layout.J.h(companion2, 0.0f, 1, str);
                    MeasurePolicy measurePolicyG = C5804h.g(companion.o(), r15);
                    int iA2 = C5859f.a(composer2, r15);
                    InterfaceC5884s interfaceC5884sR2 = composer2.r();
                    Modifier modifierE2 = androidx.compose.ui.b.e(composer2, modifierH2);
                    Function0<InterfaceC5953g> function0A2 = companion4.a();
                    if (composer2.k() == null) {
                        C5859f.c();
                    }
                    composer2.F();
                    if (composer2.h()) {
                        composer2.I(function0A2);
                    } else {
                        composer2.s();
                    }
                    Composer composerA2 = D1.a(composer2);
                    D1.c(composerA2, measurePolicyG, companion4.e());
                    D1.c(composerA2, interfaceC5884sR2, companion4.g());
                    Function2<InterfaceC5953g, Integer, Unit> function2B2 = companion4.b();
                    if (composerA2.h() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                        composerA2.t(Integer.valueOf(iA2));
                        composerA2.n(Integer.valueOf(iA2), function2B2);
                    }
                    D1.c(composerA2, modifierE2, companion4.f());
                    C5806j c5806j = C5806j.f48836a;
                    Modifier modifierH3 = androidx.compose.foundation.layout.J.h(C18370z.f(companion2, "store_map", str, 2, str), 0.0f, 1, str);
                    zl.k featureManager = findActivity.getFeatureManager();
                    AbstractC18503f.K k10 = AbstractC18503f.K.f172850h;
                    Modifier modifierI = androidx.compose.foundation.layout.J.i(modifierH3, featureManager.e(k10) ? H1.h.p(280) : H1.h.p(HttpResponseStatus.SUCCESS_OK));
                    List<StoreMapItem> listD = b.d(z1Var).d();
                    InterfaceC14882C interfaceC14882CE = androidx.compose.foundation.layout.D.e(0.0f, localThemeScope.getAdsSpacing().getTen().getDp(), 0.0f, 0.0f, 13, null);
                    composer2.startReplaceGroup(-1633490746);
                    boolean zD2 = composer2.D(interfaceC15783O) | composer2.V(c15429a);
                    Object objB2 = composer2.B();
                    if (zD2 || objB2 == Composer.INSTANCE.a()) {
                        objB2 = new Function1() { // from class: com.meijer.mobile.meijer.activity.find.Q
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return FindActivity.b.C1599b.c.s(interfaceC15783O, c15429a, (StoreMapItem) obj);
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
                                return FindActivity.b.C1599b.c.t(findActivity, (StoreMapItem) obj);
                            }
                        };
                        composer2.t(objB3);
                    }
                    composer2.P();
                    int i12 = LocalThemeScope.f17314g;
                    final z1<C12199a0.ViewState> z1Var3 = z1Var;
                    LocalThemeScope localThemeScope3 = localThemeScope;
                    Xq.w.f(localThemeScope3, modifierI, listD, null, null, 10.0f, interfaceC14882CE, null, function1, (Function1) objB3, null, null, null, null, null, null, composer, i12 | 196608, 0, 32332);
                    String searchQuery = b.d(z1Var3).getSearchQuery();
                    String strC = C16338g.c(Vq.c.f40173i, composer, 0);
                    Modifier modifierM = androidx.compose.foundation.layout.D.m(C18370z.f(companion2, "store_searched_item_text", null, 2, null), localThemeScope3.getAdsSpacing().getFive().getDp(), H1.h.p(10), localThemeScope3.getAdsSpacing().getFive().getDp(), 0.0f, 8, null);
                    C12199a0 c12199a0A1 = findActivity.A1();
                    composer.startReplaceGroup(5004770);
                    boolean zD4 = composer.D(c12199a0A1);
                    Object objB4 = composer.B();
                    if (zD4 || objB4 == Composer.INSTANCE.a()) {
                        objB4 = new C1603b(c12199a0A1);
                        composer.t(objB4);
                    }
                    KFunction kFunction = (KFunction) objB4;
                    composer.P();
                    C12199a0 c12199a0A12 = findActivity.A1();
                    composer.startReplaceGroup(5004770);
                    boolean zD5 = composer.D(c12199a0A12);
                    Object objB5 = composer.B();
                    if (zD5 || objB5 == Composer.INSTANCE.a()) {
                        objB5 = new C1604c(c12199a0A12);
                        composer.t(objB5);
                    }
                    composer.P();
                    Er.n.b(localThemeScope3, searchQuery, strC, (Function1) kFunction, (Function0) ((KFunction) objB5), modifierM, null, null, findActivity.getFeatureManager().e(k10), C16338g.c(Vq.c.f40173i, composer, 0), composer, i12, 96);
                    Composer composer3 = composer;
                    composer3.v();
                    Pj.a storesLoadingState = b.d(z1Var3).getStoresLoadingState();
                    if (storesLoadingState instanceof a.Failed) {
                        composer3.startReplaceGroup(1424631351);
                        Modifier modifierF2 = C18370z.f(androidx.compose.foundation.layout.J.f(companion2, 0.0f, 1, null), "find_store_error_retry", null, 2, null);
                        String strA = C13698b.a(b.d(z1Var3).getStoresLoadingState().getMessage(), composer3, AbstractC6392a.f60445b);
                        String strC2 = C16338g.c(Cj.o.f5101z0, composer3, 0);
                        composer3.startReplaceGroup(5004770);
                        boolean zD6 = composer3.D(findActivity);
                        Object objB6 = composer3.B();
                        if (zD6 || objB6 == Composer.INSTANCE.a()) {
                            objB6 = new Function0() { // from class: com.meijer.mobile.meijer.activity.find.T
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return FindActivity.b.C1599b.c.l(findActivity);
                                }
                            };
                            composer3.t(objB6);
                        }
                        composer3.P();
                        C18357l.b(localThemeScope3, strA, strC2, modifierF2, (Function0) objB6, composer3, i12, 0);
                        composer3.P();
                    } else if (storesLoadingState instanceof a.NotLoading) {
                        composer3.startReplaceGroup(1425305136);
                        Modifier modifierF3 = C18370z.f(androidx.compose.foundation.layout.J.h(companion2, 0.0f, 1, null), "nearby_stores_list_view", null, 2, null);
                        AbstractC6392a resultLabel = b.d(z1Var3).getResultLabel();
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
                                    return FindActivity.b.C1599b.c.o(findActivity, (StoreMapItem) obj);
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
                                    return FindActivity.b.C1599b.c.p(findActivity, z1Var3);
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
                                    return FindActivity.b.C1599b.c.q(findActivity, (Kr.a) obj);
                                }
                            };
                            composer3.t(objB9);
                        }
                        composer3.P();
                        Xq.o.u(localThemeScope3, modifierF3, resultLabel, listF, listD2, zI1, c15429a, zE2, permissionRequestDecoratorG, function12, function0, (Function1) objB9, composer3, (AbstractC6392a.f60445b << 6) | i12 | (PermissionRequestDecorator.f17669e << 24), 0, 0);
                        composer3 = composer3;
                        composer3.P();
                    } else if (storesLoadingState instanceof a.Loading) {
                        composer3.startReplaceGroup(1427047584);
                        K1.P(localThemeScope3, C18370z.f(androidx.compose.foundation.layout.J.f(companion2, 0.0f, 1, null), "find_store_loading", null, 2, null), b.d(z1Var3).getStoresLoadingState().getIsLoading(), null, composer3, i12, 4);
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
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit p(FindActivity findActivity, z1 z1Var) {
                    findActivity.A1().D(b.d(z1Var).l());
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit q(FindActivity findActivity, Kr.a aVar) {
                    findActivity.M1(aVar);
                    return Unit.f143329a;
                }
            }

            C1599b(InterfaceC5872l0<C17993c1> interfaceC5872l0, FindActivity findActivity, z1<C12199a0.ViewState> z1Var, z1<HeaderDecorator> z1Var2, z1<DrawerLayoutDecorator> z1Var3, C15429A c15429a, InterfaceC15783O interfaceC15783O) {
                this.f107269a = interfaceC5872l0;
                this.f107270b = findActivity;
                this.f107271c = z1Var;
                this.f107272d = z1Var2;
                this.f107273e = z1Var3;
                this.f107274f = c15429a;
                this.f107275g = interfaceC15783O;
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
                C17987a1.a(C18370z.c(FullStoryAnnotationsKt.fsUnmask(Modifier.INSTANCE), false, 1, null), b.e(this.f107269a), ComposableLambdaKt.c(-235782891, true, new a(this.f107270b, AdsTheme, this.f107271c), composer, 54), null, null, null, 0, false, ComposableLambdaKt.c(-1142180693, true, new C1602b(this.f107272d, this.f107273e, this.f107270b, AdsTheme), composer, 54), b.e(this.f107269a).getDrawerState().e(), null, 0.0f, 0L, 0L, 0L, 0L, 0L, ComposableLambdaKt.c(-796306162, true, new c(AdsTheme, this.f107270b, this.f107274f, this.f107271c, this.f107275g), composer, 54), composer, 100663680, 12582912, 130296);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
                a(localThemeScope, composer, num.intValue());
                return Unit.f143329a;
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
            C17998e0 c17998e0J = C17995d0.j(EnumC18001f0.f168977a, null, composer, 6, 2);
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = new C18029o1();
                composer.t(objB);
            }
            C18029o1 c18029o1 = (C18029o1) objB;
            composer.P();
            Object objB2 = composer.B();
            if (objB2 == companion.a()) {
                objB2 = androidx.compose.runtime.J.k(EmptyCoroutineContext.f143553a, composer);
                composer.t(objB2);
            }
            InterfaceC15783O interfaceC15783O = (InterfaceC15783O) objB2;
            z1 z1VarB3 = o1.b(FindActivity.this.A1().A(), null, composer, 0, 1);
            composer.startReplaceGroup(1849434622);
            Object objB3 = composer.B();
            if (objB3 == companion.a()) {
                objB3 = t1.e(new C17993c1(c17998e0J, c18029o1), null, 2, null);
                composer.t(objB3);
            }
            InterfaceC5872l0 interfaceC5872l0 = (InterfaceC5872l0) objB3;
            composer.P();
            C15429A c15429aB = C15430B.b(0, 0, composer, 0, 3);
            C16507K.b(FindActivity.this.D1(), c17998e0J, interfaceC15783O, composer, C16521g.f157265l);
            List<StoreDetails> listL = d(z1VarB3).l();
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(c15429aB);
            Object objB4 = composer.B();
            if (zV || objB4 == companion.a()) {
                objB4 = new a(c15429aB, null);
                composer.t(objB4);
            }
            composer.P();
            androidx.compose.runtime.J.g(listL, (Function2) objB4, composer, 0);
            Ki.K.b(null, ComposableLambdaKt.c(-1116476336, true, new C1599b(interfaceC5872l0, FindActivity.this, z1VarB3, z1VarB, z1VarB2, c15429aB, interfaceC15783O), composer, 54), composer, 48, 1);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            c(composer, num.intValue());
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C12199a0.ViewState d(z1<C12199a0.ViewState> z1Var) {
            return z1Var.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C17993c1 e(InterfaceC5872l0<C17993c1> interfaceC5872l0) {
            return interfaceC5872l0.getValue();
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lpv/g;", "Landroid/location/Location;", "", "it", "", "<anonymous>", "(Lpv/g;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.FindActivity$onPermissionCheckGranted$2", f = "FindActivity.kt", l = {}, m = "invokeSuspend")
    static final class d extends SuspendLambda implements Function3<InterfaceC16562g<? super Location>, Throwable, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f107298a;

        d(Continuation<? super d> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC16562g<? super Location> interfaceC16562g, Throwable th2, Continuation<? super Unit> continuation) {
            return FindActivity.this.new d(continuation).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f107298a == 0) {
                ResultKt.b(obj);
                FindActivity.this.locationUpdatesJob = null;
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class e implements InterfaceC14275b, FunctionAdapter {
        e() {
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC14275b) && (obj instanceof FunctionAdapter)) {
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

        @Override // g.InterfaceC14275b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void a(Map<String, Boolean> p02) throws Exception {
            Intrinsics.j(p02, "p0");
            FindActivity.this.G1(p02);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class f extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f107301f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ComponentActivity componentActivity) {
            super(0);
            this.f107301f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f107301f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class g extends Lambda implements Function0<androidx.view.g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f107302f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ComponentActivity componentActivity) {
            super(0);
            this.f107302f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.view.g0 invoke() {
            return this.f107302f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class h extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f107303f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f107304g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f107303f = function0;
            this.f107304g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f107303f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f107304g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class i extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f107305f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(ComponentActivity componentActivity) {
            super(0);
            this.f107305f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f107305f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class j extends Lambda implements Function0<androidx.view.g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f107306f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(ComponentActivity componentActivity) {
            super(0);
            this.f107306f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.view.g0 invoke() {
            return this.f107306f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class k extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f107307f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f107308g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f107307f = function0;
            this.f107308g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f107307f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f107308g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, d2 = {"<anonymous>", "", "location", "Landroid/location/Location;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.FindActivity$onPermissionCheckGranted$1", f = "FindActivity.kt", l = {}, m = "invokeSuspend")
    static final class c extends SuspendLambda implements Function2<Location, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f107295a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f107296b;

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            c cVar = FindActivity.this.new c(continuation);
            cVar.f107296b = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Location location, Continuation<? super Unit> continuation) {
            return ((c) create(location, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            LatLng latLngC;
            IntrinsicsKt.f();
            if (this.f107295a == 0) {
                ResultKt.b(obj);
                Location location = (Location) this.f107296b;
                C12199a0 c12199a0A1 = FindActivity.this.A1();
                if (location != null) {
                    latLngC = Ds.i.c(location);
                } else {
                    latLngC = null;
                }
                c12199a0A1.K(latLngC);
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C12199a0 A1() {
        return (C12199a0) this.findStoreViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C16508L C1() {
        return (C16508L) this.navigationDrawerViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C16521g D1() {
        return (C16521g) this.navigationHelper.getValue();
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
    public static final C16521g J1(FindActivity findActivity) {
        return new C16521g(findActivity);
    }

    @SuppressLint({"RestrictedApi"})
    private final void K1(Map<String, Boolean> permissions) throws Exception {
        qw.a.INSTANCE.d("LOCATION PERMISSION DENIED", new Object[0]);
        ((PickupManager) SingletonHolder.getInstance$default(PickupManager.INSTANCE, null, 1, null)).onPermissionChanged();
        mv.C0 c02 = this.locationUpdatesJob;
        if (c02 != null) {
            C0.a.a(c02, null, 1, null);
        }
        A1().L(permissions);
        A1().K(null);
    }

    @SuppressLint({"RestrictedApi"})
    private final void L1(Map<String, Boolean> permissions) throws Exception {
        qw.a.INSTANCE.a("LOCATION PERMISSION GRANTED by user", new Object[0]);
        this.checkedPermissions = false;
        ((PickupManager) SingletonHolder.getInstance$default(PickupManager.INSTANCE, null, 1, null)).onPermissionChanged();
        mv.C0 c02 = this.locationUpdatesJob;
        if (c02 != null) {
            C0.a.a(c02, null, 1, null);
        }
        this.locationUpdatesJob = C16563h.J(C16563h.N(C16563h.Z(C16563h.O(B1().b(), new c(null)), 1), new d(null)), C6173t.a(this));
        A1().L(permissions);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M1(Kr.a resolution) {
        if (resolution instanceof a.EnableLocationPermissions) {
            startActivity(getMeijerIntent().b(this));
        } else if (Intrinsics.e(resolution, a.b.f17668a)) {
            startActivity(Bl.h.a());
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
            linkedHashMap.put(obj, Boolean.valueOf(C18326b.a(this, (String) obj)));
        }
        G1(linkedHashMap);
    }

    public final C12223m0 B1() {
        C12223m0 c12223m0 = this.locationUpdatesProvider;
        if (c12223m0 != null) {
            return c12223m0;
        }
        Intrinsics.x("locationUpdatesProvider");
        return null;
    }

    public final InterfaceC14523a getAnalyticsEngine() {
        InterfaceC14523a interfaceC14523a = this.analyticsEngine;
        if (interfaceC14523a != null) {
            return interfaceC14523a;
        }
        Intrinsics.x("analyticsEngine");
        return null;
    }

    public final zl.k getFeatureManager() {
        zl.k kVar = this.featureManager;
        if (kVar != null) {
            return kVar;
        }
        Intrinsics.x("featureManager");
        return null;
    }

    public final Dl.e getMeijerIntent() {
        Dl.e eVar = this.meijerIntent;
        if (eVar != null) {
            return eVar;
        }
        Intrinsics.x("meijerIntent");
        return null;
    }

    public final AppVersion y1() {
        AppVersion appVersion = this.appVersion;
        if (appVersion != null) {
            return appVersion;
        }
        Intrinsics.x("appVersion");
        return null;
    }

    public FindActivity() {
        this.locationPermissions = CollectionsKt.r("android.permission.ACCESS_FINE_LOCATION", Build.VERSION.SDK_INT >= 34 ? "android.permission.FOREGROUND_SERVICE_LOCATION" : null);
        this.findStoreResultLauncher = registerForActivityResult(new h.i(), new a());
        this.permissionsResultLauncher = registerForActivityResult(new C14433g(), new e());
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
    public final void H1(C14274a result) {
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
            if (storeDetails != null && (A1().getSearchType() == pk.i.f156747e || booleanExtra)) {
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
        pk.i searchType = storeMapItem.getSearchType();
        pk.i iVar = pk.i.f156745c;
        pk.i iVar2 = pk.i.f156744b;
        if (CollectionsKt.p(iVar, iVar2).contains(storeMapItem.getSearchType())) {
            if (!isPickUpMode || !storeMapItem.getIsPreferredStore()) {
                searchType = iVar;
            } else {
                searchType = iVar2;
            }
        }
        if (storeMapItem.getSearchType() == pk.i.f156747e && storeMapItem.getIsPreferredStore() && isPickUpMode) {
            searchType = pk.i.f156746d;
        }
        pk.i iVar3 = searchType;
        if (z1() != 0) {
            finish();
        }
        this.findStoreResultLauncher.a(Bl.s.f3151a.c(this, storeMapItem.getStore(), iVar3, z1(), F1()));
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
            getAnalyticsEngine().h(C14756c.a("event: search: menu find"), C14756c.c("search: menu find"), C14756c.g("menu"));
        }
        C12199a0 c12199a0A1 = A1();
        Intent intent = getIntent();
        Intrinsics.i(intent, "getIntent(...)");
        if (Build.VERSION.SDK_INT >= 33) {
            serializableExtra = intent.getSerializableExtra("com.meijer.intent.extra.SEARCH_TYPE", pk.i.class);
        } else {
            Object serializableExtra2 = intent.getSerializableExtra("com.meijer.intent.extra.SEARCH_TYPE");
            if (!(serializableExtra2 instanceof pk.i)) {
                serializableExtra2 = null;
            }
            serializableExtra = (pk.i) serializableExtra2;
        }
        c12199a0A1.O((pk.i) serializableExtra);
        A1().B(I1());
        C13737e.b(this, null, ComposableLambdaKt.composableLambdaInstance(573176001, true, new b()), 1, null);
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        mv.C0 c02 = this.locationUpdatesJob;
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
