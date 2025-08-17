package com.meijer.mobile.meijer.activity.orderoptions;

import Dh.AccountAddress;
import Jd.C3778l;
import Jd.InterfaceC3769c;
import Ji.C;
import Ji.K;
import Ji.LocalThemeScope;
import Ji.Q;
import Td.AbstractC5232j;
import Td.InterfaceC5227e;
import Td.InterfaceC5229g;
import V2.CreationExtras;
import ak.AbstractC5607a;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.location.Location;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.foundation.layout.D;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import androidx.view.ComponentActivity;
import androidx.view.e0;
import androidx.view.f0;
import androidx.view.g0;
import com.google.android.gms.location.LocationAvailability;
import com.meijer.mobile.meijer.Y;
import com.meijer.mobile.meijer.activity.cart.ChangeFulfillmentPreviewActivity;
import com.meijer.mobile.meijer.activity.orderoptions.OrderOptionsActivity;
import com.meijer.mobile.meijer.activity.orderoptions.fulfillmentslots.FulfillmentStateDetails;
import com.meijer.mobile.meijer.activity.orderoptions.fulfillmentslots.OrderOptionsFulfillmentSlotsActivity;
import com.meijer.mobile.meijer.activity.orderoptions.y;
import com.meijer.mobile.meijer.activity.settings.addresses.AddressDetailsActivity;
import com.meijer.mobile.meijer.activity.settings.addresses.AddressSearchActivity;
import com.meijer.mobile.meijer.activity.settings.addresses.SearchDeliveryAddressActivity;
import e.C13589e;
import ej.CartChanges;
import en.C13699B;
import g.AbstractC14147c;
import g.C14145a;
import g.InterfaceC14146b;
import g2.C14193b;
import h.C14320g;
import hi.AbstractC14482i;
import hi.C14476c;
import j0.InterfaceC14794C;
import j0.InterfaceC14800I;
import j0.InterfaceC14814f;
import java.util.Locale;
import java.util.Map;
import je.C14886b;
import ji.InterfaceC14971y;
import ji.j1;
import ji.q1;
import kotlin.C17917Z;
import kotlin.C17963o1;
import kotlin.EnumC17957m1;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import ok.StoreDetails;
import p1.C16193g;
import qv.C16623P;
import qv.C16639f0;
import qv.C16648k;
import qv.InterfaceC16622O;
import tk.AbstractC17116a;
import tv.C17154h;
import tv.InterfaceC17152f;
import yl.AbstractC18227f;

@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 M2\u00020\u0001:\u0001NB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\t\u0010\u0003J#\u0010\u000e\u001a\u00020\u00062\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0013\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0019\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001a\u0010\u0018J\u0019\u0010\u001d\u001a\u00020\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0014¢\u0006\u0004\b\u001d\u0010\u001eR\u001b\u0010$\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0016\u0010(\u001a\u00020%8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010+\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010-\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010*R$\u00103\u001a\u0010\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u000200\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R$\u00107\u001a\u0010\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u000200\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R.\u0010@\u001a\u0004\u0018\u0001082\b\u00109\u001a\u0004\u0018\u0001088\u0000@AX\u0080\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u001a\u0010E\u001a\b\u0012\u0004\u0012\u00020B0A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u001a\u0010G\u001a\b\u0012\u0004\u0012\u00020B0A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010DR\u001a\u0010I\u001a\b\u0012\u0004\u0012\u00020B0A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010DR \u0010L\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0J0A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010D¨\u0006Q²\u0006\f\u0010P\u001a\u00020O8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/meijer/mobile/meijer/activity/orderoptions/OrderOptionsActivity;", "Lcom/meijer/mobile/meijer/activity/MeijerActivity;", "<init>", "()V", "Lok/h;", "storeDetails", "", "g2", "(Lok/h;)V", "h2", "", "", "", "permissions", "b2", "(Ljava/util/Map;)V", "f2", "()Z", "deliveryModeCode", "i2", "(Ljava/lang/String;)V", "Lg/a;", "result", "a2", "(Lg/a;)V", "Y1", "Z1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Lcom/meijer/mobile/meijer/activity/orderoptions/y;", "s", "Lkotlin/Lazy;", "X1", "()Lcom/meijer/mobile/meijer/activity/orderoptions/y;", "orderOptionsViewModel", "LJd/c;", "t", "LJd/c;", "fusedLocationClient", "u", "Z", "newPickupOptionSelected", "v", "newDeliveryOptionSelected", "Ltk/a$b;", "Lej/n;", "Lej/e;", "w", "Ltk/a$b;", "cancelFulfillmentChange", "Ltk/a$a;", "x", "Ltk/a$a;", "acceptFulfillmentChange", "Landroid/location/LocationManager;", "value", "y", "Landroid/location/LocationManager;", "getLocationManager$Meijer_playstoreRelease", "()Landroid/location/LocationManager;", "l2", "(Landroid/location/LocationManager;)V", "locationManager", "Lg/c;", "Landroid/content/Intent;", "z", "Lg/c;", "newDeliveryAddressResultLauncher", "A", "findStoreResultLauncher", "B", "fulfillmentChangeResultLauncher", "", "C", "permissionsResultLauncher", "D", "a", "Lcom/meijer/mobile/meijer/activity/orderoptions/y$g;", "orderOptionsViewState", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class OrderOptionsActivity extends Hilt_OrderOptionsActivity {

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: E, reason: collision with root package name */
    public static final int f109823E = 8;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private InterfaceC3769c fusedLocationClient;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private boolean newPickupOptionSelected;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private boolean newDeliveryOptionSelected;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private AbstractC17116a.Cancel<ej.n, CartChanges> cancelFulfillmentChange;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private AbstractC17116a.Accept<ej.n, CartChanges> acceptFulfillmentChange;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private LocationManager locationManager;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final Lazy orderOptionsViewModel = new e0(Reflection.b(y.class), new h(this), new g(this), new i(null, this));

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final AbstractC14147c<Intent> newDeliveryAddressResultLauncher = registerForActivityResult(new h.i(), new d());

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    private final AbstractC14147c<Intent> findStoreResultLauncher = registerForActivityResult(new h.i(), new b());

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final AbstractC14147c<Intent> fulfillmentChangeResultLauncher = registerForActivityResult(new h.i(), new c());

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private final AbstractC14147c<String[]> permissionsResultLauncher = registerForActivityResult(new C14320g(), new f());

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0012R\u0014\u0010\u0018\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0012R\u0014\u0010\u0019\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0012¨\u0006\u001a"}, d2 = {"Lcom/meijer/mobile/meijer/activity/orderoptions/OrderOptionsActivity$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "a", "(Landroid/content/Context;)Landroid/content/Intent;", "", "previousPageName", "b", "(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;", "", "ACCEPT_FULFILLMENT_CHANGE", "I", "CANCEL_FULFILLMENT_CHANGE", "EXTRA_PREVIOUS_PAGE_NAME", "Ljava/lang/String;", "FULFILLMENT_TYPE_KEY", "FULFILLMENT_DELIVERY", "FULFILLMENT_PICK_UP", "EXTRA_ADDRESS_SAVED_TO_ACCOUNT_ADDRESSES", "EXTRA_ADDRESS_SERVICE_TIER", "EXTRA_DELIVERY_ADDRESS", "EXTRA_IS_ADDRESS_REMOVED", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.orderoptions.OrderOptionsActivity$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final Intent a(Context context) {
            Intrinsics.j(context, "context");
            return new Intent(context, (Class<?>) OrderOptionsActivity.class);
        }

        @JvmStatic
        public final Intent b(Context context, String previousPageName) {
            Intrinsics.j(context, "context");
            Intrinsics.j(previousPageName, "previousPageName");
            Intent intentPutExtra = new Intent(context, (Class<?>) OrderOptionsActivity.class).putExtra("com.meijer.intent.extra.OrderOptionsActivity.EXTRA_PREVIOUS_PAGE_NAME", previousPageName);
            Intrinsics.i(intentPutExtra, "putExtra(...)");
            return intentPutExtra;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class b implements InterfaceC14146b, FunctionAdapter {
        b() {
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC14146b) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.e(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, OrderOptionsActivity.this, OrderOptionsActivity.class, "handleFindStoreResult", "handleFindStoreResult(Landroidx/activity/result/ActivityResult;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // g.InterfaceC14146b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void a(C14145a p02) {
            Intrinsics.j(p02, "p0");
            OrderOptionsActivity.this.Y1(p02);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class c implements InterfaceC14146b, FunctionAdapter {
        c() {
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC14146b) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.e(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, OrderOptionsActivity.this, OrderOptionsActivity.class, "handleFulfillmentChangeResult", "handleFulfillmentChangeResult(Landroidx/activity/result/ActivityResult;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // g.InterfaceC14146b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void a(C14145a p02) {
            Intrinsics.j(p02, "p0");
            OrderOptionsActivity.this.Z1(p02);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class d implements InterfaceC14146b, FunctionAdapter {
        d() {
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC14146b) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.e(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, OrderOptionsActivity.this, OrderOptionsActivity.class, "handleNewDeliveryAddressResult", "handleNewDeliveryAddressResult(Landroidx/activity/result/ActivityResult;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // g.InterfaceC14146b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void a(C14145a p02) {
            Intrinsics.j(p02, "p0");
            OrderOptionsActivity.this.a2(p02);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class e implements Function2<Composer, Integer, Unit> {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ OrderOptionsActivity f109839a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.meijer.activity.orderoptions.OrderOptionsActivity$e$a$a, reason: collision with other inner class name */
            static final class C1666a implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f109840a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ OrderOptionsActivity f109841b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ y.OrderOptionsViewState f109842c;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.meijer.mobile.meijer.activity.orderoptions.OrderOptionsActivity$e$a$a$a, reason: collision with other inner class name */
                static final class C1667a implements Function2<Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f109843a;

                    C1667a(LocalThemeScope localThemeScope) {
                        this.f109843a = localThemeScope;
                    }

                    public final void a(Composer composer, int i10) {
                        if ((i10 & 3) == 2 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(1528375604, i10, -1, "com.meijer.mobile.meijer.activity.orderoptions.OrderOptionsActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OrderOptionsActivity.kt:146)");
                        }
                        Dr.g.g(this.f109843a, C16193g.c(Hl.h.f12786d0, composer, 0), null, false, null, 0, null, 0, composer, LocalThemeScope.f15770g, 126);
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

                public final void b(Composer composer, int i10) {
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(2138063988, i10, -1, "com.meijer.mobile.meijer.activity.orderoptions.OrderOptionsActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OrderOptionsActivity.kt:143)");
                    }
                    AbstractC5607a abstractC5607aD = AbstractC5607a.INSTANCE.d(Y.f100169l1, new Object[0]);
                    C.f.o oVar = C.f.o.f15522e;
                    LocalThemeScope localThemeScope = this.f109840a;
                    ComposableLambda composableLambdaC = ComposableLambdaKt.c(1528375604, true, new C1667a(localThemeScope), composer, 54);
                    composer.startReplaceGroup(-1633490746);
                    boolean zD = composer.D(this.f109841b) | composer.D(this.f109842c);
                    final OrderOptionsActivity orderOptionsActivity = this.f109841b;
                    final y.OrderOptionsViewState gVar = this.f109842c;
                    Object objB = composer.B();
                    if (zD || objB == Composer.INSTANCE.a()) {
                        objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.orderoptions.g
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return OrderOptionsActivity.e.a.C1666a.c(orderOptionsActivity, gVar);
                            }
                        };
                        composer.t(objB);
                    }
                    composer.P();
                    Dr.g.f(localThemeScope, null, null, null, composableLambdaC, (Function0) objB, oVar, 0.0f, false, abstractC5607aD, composer, LocalThemeScope.f15770g | 24576 | (C.f.o.f15523f << 18) | (AbstractC5607a.f45514b << 27), 199);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                C1666a(LocalThemeScope localThemeScope, OrderOptionsActivity orderOptionsActivity, y.OrderOptionsViewState gVar) {
                    this.f109840a = localThemeScope;
                    this.f109841b = orderOptionsActivity;
                    this.f109842c = gVar;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    b(composer, num.intValue());
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit c(OrderOptionsActivity orderOptionsActivity, y.OrderOptionsViewState gVar) {
                    if (orderOptionsActivity.newPickupOptionSelected && gVar.getIsEditedByUser()) {
                        orderOptionsActivity.i2("pickup");
                    } else if (orderOptionsActivity.newDeliveryOptionSelected && gVar.getIsEditedByUser()) {
                        orderOptionsActivity.i2("delivery");
                    } else {
                        orderOptionsActivity.finish();
                    }
                    return Unit.f142422a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            static final class b implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ OrderOptionsActivity f109844a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ y.OrderOptionsViewState f109845b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f109846c;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.meijer.mobile.meijer.activity.orderoptions.OrderOptionsActivity$e$a$b$a, reason: collision with other inner class name */
                static final class C1668a implements Function3<InterfaceC14814f, Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f109847a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ y.OrderOptionsViewState f109848b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ OrderOptionsActivity f109849c;

                    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.meijer.mobile.meijer.activity.orderoptions.OrderOptionsActivity$e$a$b$a$a, reason: collision with other inner class name */
                    static final class C1669a implements Function3<j1, Composer, Integer, Unit> {

                        /* renamed from: a, reason: collision with root package name */
                        final /* synthetic */ y.OrderOptionsViewState f109850a;

                        /* renamed from: b, reason: collision with root package name */
                        final /* synthetic */ LocalThemeScope f109851b;

                        /* renamed from: c, reason: collision with root package name */
                        final /* synthetic */ OrderOptionsActivity f109852c;

                        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                        /* renamed from: com.meijer.mobile.meijer.activity.orderoptions.OrderOptionsActivity$e$a$b$a$a$a, reason: collision with other inner class name */
                        static final class C1670a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

                            /* renamed from: a, reason: collision with root package name */
                            final /* synthetic */ LocalThemeScope f109853a;

                            /* renamed from: b, reason: collision with root package name */
                            final /* synthetic */ j1 f109854b;

                            C1670a(LocalThemeScope localThemeScope, j1 j1Var) {
                                this.f109853a = localThemeScope;
                                this.f109854b = j1Var;
                            }

                            public final void a(InterfaceC14800I AdsButton, Composer composer, int i10) {
                                Intrinsics.j(AdsButton, "$this$AdsButton");
                                if ((i10 & 17) == 16 && composer.j()) {
                                    composer.K();
                                    return;
                                }
                                if (ComposerKt.M()) {
                                    ComposerKt.U(-1985519054, i10, -1, "com.meijer.mobile.meijer.activity.orderoptions.OrderOptionsActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OrderOptionsActivity.kt:224)");
                                }
                                LocalThemeScope localThemeScope = this.f109853a;
                                q1.Label enabledLabel = this.f109854b.getLabels().getEnabledLabel();
                                String upperCase = C16193g.c(Y.f99662Kh, composer, 0).toUpperCase(Locale.ROOT);
                                Intrinsics.i(upperCase, "toUpperCase(...)");
                                ri.j.h(localThemeScope, enabledLabel, upperCase, null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
                                if (ComposerKt.M()) {
                                    ComposerKt.T();
                                }
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14800I interfaceC14800I, Composer composer, Integer num) {
                                a(interfaceC14800I, composer, num.intValue());
                                return Unit.f142422a;
                            }
                        }

                        C1669a(y.OrderOptionsViewState gVar, LocalThemeScope localThemeScope, OrderOptionsActivity orderOptionsActivity) {
                            this.f109850a = gVar;
                            this.f109851b = localThemeScope;
                            this.f109852c = orderOptionsActivity;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
                        /* JADX WARN: Removed duplicated region for block: B:25:0x0077  */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final void b(ji.j1 r22, androidx.compose.runtime.Composer r23, int r24) {
                            /*
                                Method dump skipped, instructions count: 280
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.orderoptions.OrderOptionsActivity.e.a.b.C1668a.C1669a.b(ji.j1, androidx.compose.runtime.Composer, int):void");
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(j1 j1Var, Composer composer, Integer num) {
                            b(j1Var, composer, num.intValue());
                            return Unit.f142422a;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit c(OrderOptionsActivity orderOptionsActivity) {
                            orderOptionsActivity.X1().Y(y.e.r.f110036a);
                            return Unit.f142422a;
                        }
                    }

                    C1668a(LocalThemeScope localThemeScope, y.OrderOptionsViewState gVar, OrderOptionsActivity orderOptionsActivity) {
                        this.f109847a = localThemeScope;
                        this.f109848b = gVar;
                        this.f109849c = orderOptionsActivity;
                    }

                    public final void a(InterfaceC14814f AdsColumn, Composer composer, int i10) {
                        Intrinsics.j(AdsColumn, "$this$AdsColumn");
                        if ((i10 & 17) == 16 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(-415401053, i10, -1, "com.meijer.mobile.meijer.activity.orderoptions.OrderOptionsActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OrderOptionsActivity.kt:199)");
                        }
                        C17917Z.a(D.m(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, this.f109847a.getAdsSpacing().getFive().getDp(), 7, null), this.f109847a.getAdsColors().getAdsColorUIDivider().getColor(), 0.0f, 0.0f, composer, 0, 12);
                        LocalThemeScope localThemeScope = this.f109847a;
                        Q.e(localThemeScope, InterfaceC14971y.a.d.f140292a, ComposableLambdaKt.c(-232810305, true, new C1669a(this.f109848b, localThemeScope, this.f109849c), composer, 54), composer, LocalThemeScope.f15770g | 384 | (InterfaceC14971y.a.d.f140293b << 3));
                        if (ComposerKt.M()) {
                            ComposerKt.T();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14814f interfaceC14814f, Composer composer, Integer num) {
                        a(interfaceC14814f, composer, num.intValue());
                        return Unit.f142422a;
                    }
                }

                b(OrderOptionsActivity orderOptionsActivity, y.OrderOptionsViewState gVar, LocalThemeScope localThemeScope) {
                    this.f109844a = orderOptionsActivity;
                    this.f109845b = gVar;
                    this.f109846c = localThemeScope;
                }

                /* JADX WARN: Removed duplicated region for block: B:28:0x006f  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void b(androidx.compose.runtime.Composer r12, int r13) {
                    /*
                        Method dump skipped, instructions count: 390
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.orderoptions.OrderOptionsActivity.e.a.b.b(androidx.compose.runtime.Composer, int):void");
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    b(composer, num.intValue());
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit c(OrderOptionsActivity orderOptionsActivity) {
                    orderOptionsActivity.X1().Y(y.e.r.f110036a);
                    return Unit.f142422a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            static final class c implements Function3<InterfaceC14794C, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f109855a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ y.OrderOptionsViewState f109856b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ OrderOptionsActivity f109857c;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.meijer.mobile.meijer.activity.orderoptions.OrderOptionsActivity$e$a$c$a, reason: collision with other inner class name */
                /* synthetic */ class C1671a extends FunctionReferenceImpl implements Function1<y.e, Unit> {
                    C1671a(Object obj) {
                        super(1, obj, y.class, "onAction", "onAction(Lcom/meijer/mobile/meijer/activity/orderoptions/OrderOptionsViewModel$OrderOptionsAction;)V", 0);
                    }

                    public final void a(y.e p02) {
                        Intrinsics.j(p02, "p0");
                        ((y) this.receiver).Y(p02);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(y.e eVar) {
                        a(eVar);
                        return Unit.f142422a;
                    }
                }

                c(LocalThemeScope localThemeScope, y.OrderOptionsViewState gVar, OrderOptionsActivity orderOptionsActivity) {
                    this.f109855a = localThemeScope;
                    this.f109856b = gVar;
                    this.f109857c = orderOptionsActivity;
                }

                public final void a(InterfaceC14794C contentPadding, Composer composer, int i10) {
                    Intrinsics.j(contentPadding, "contentPadding");
                    if ((i10 & 6) == 0) {
                        i10 |= composer.V(contentPadding) ? 4 : 2;
                    }
                    if ((i10 & 19) == 18 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(1447979053, i10, -1, "com.meijer.mobile.meijer.activity.orderoptions.OrderOptionsActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OrderOptionsActivity.kt:238)");
                    }
                    LocalThemeScope localThemeScope = this.f109855a;
                    Modifier modifierH = D.h(Modifier.INSTANCE, contentPadding);
                    y.OrderOptionsViewState gVar = this.f109856b;
                    boolean zE = this.f109857c.getFeatureManager().e(AbstractC18227f.K.f170550h);
                    y yVarX1 = this.f109857c.X1();
                    composer.startReplaceGroup(5004770);
                    boolean zD = composer.D(yVarX1);
                    Object objB = composer.B();
                    if (zD || objB == Composer.INSTANCE.a()) {
                        objB = new C1671a(yVarX1);
                        composer.t(objB);
                    }
                    composer.P();
                    C13699B.h(localThemeScope, modifierH, gVar, zE, (Function1) ((KFunction) objB), composer, LocalThemeScope.f15770g, 0);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14794C interfaceC14794C, Composer composer, Integer num) {
                    a(interfaceC14794C, composer, num.intValue());
                    return Unit.f142422a;
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.meijer.activity.orderoptions.OrderOptionsActivity$onCreate$1$1$2$1", f = "OrderOptionsActivity.kt", l = {256}, m = "invokeSuspend")
            static final class d extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f109858a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ OrderOptionsActivity f109859b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ C17963o1 f109860c;

                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/meijer/mobile/meijer/activity/orderoptions/y$f;", "event", "", "<anonymous>", "(Lcom/meijer/mobile/meijer/activity/orderoptions/y$f;)V"}, k = 3, mv = {2, 1, 0})
                @DebugMetadata(c = "com.meijer.mobile.meijer.activity.orderoptions.OrderOptionsActivity$onCreate$1$1$2$1$1", f = "OrderOptionsActivity.kt", l = {}, m = "invokeSuspend")
                @SourceDebugExtension
                /* renamed from: com.meijer.mobile.meijer.activity.orderoptions.OrderOptionsActivity$e$a$d$a, reason: collision with other inner class name */
                static final class C1672a extends SuspendLambda implements Function2<y.f, Continuation<? super Unit>, Object> {

                    /* renamed from: a, reason: collision with root package name */
                    int f109861a;

                    /* renamed from: b, reason: collision with root package name */
                    /* synthetic */ Object f109862b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ OrderOptionsActivity f109863c;

                    /* renamed from: d, reason: collision with root package name */
                    final /* synthetic */ C17963o1 f109864d;

                    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
                    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.orderoptions.OrderOptionsActivity$onCreate$1$1$2$1$1$1", f = "OrderOptionsActivity.kt", l = {260}, m = "invokeSuspend")
                    /* renamed from: com.meijer.mobile.meijer.activity.orderoptions.OrderOptionsActivity$e$a$d$a$a, reason: collision with other inner class name */
                    static final class C1673a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

                        /* renamed from: a, reason: collision with root package name */
                        int f109865a;

                        /* renamed from: b, reason: collision with root package name */
                        final /* synthetic */ C17963o1 f109866b;

                        /* renamed from: c, reason: collision with root package name */
                        final /* synthetic */ OrderOptionsActivity f109867c;

                        /* renamed from: d, reason: collision with root package name */
                        final /* synthetic */ y.f f109868d;

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            return new C1673a(this.f109866b, this.f109867c, this.f109868d, continuation);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C1673a(C17963o1 c17963o1, OrderOptionsActivity orderOptionsActivity, y.f fVar, Continuation<? super C1673a> continuation) {
                            super(2, continuation);
                            this.f109866b = c17963o1;
                            this.f109867c = orderOptionsActivity;
                            this.f109868d = fVar;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                            return ((C1673a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            Object objF = IntrinsicsKt.f();
                            int i10 = this.f109865a;
                            if (i10 != 0) {
                                if (i10 == 1) {
                                    ResultKt.b(obj);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                ResultKt.b(obj);
                                C17963o1 c17963o1 = this.f109866b;
                                String string = this.f109867c.getString(((y.f.FailEvent) this.f109868d).getMessageResId());
                                Intrinsics.i(string, "getString(...)");
                                EnumC17957m1 enumC17957m1 = EnumC17957m1.f168343b;
                                this.f109865a = 1;
                                if (C17963o1.e(c17963o1, string, null, enumC17957m1, this, 2, null) == objF) {
                                    return objF;
                                }
                            }
                            return Unit.f142422a;
                        }
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C1672a c1672a = new C1672a(this.f109863c, this.f109864d, continuation);
                        c1672a.f109862b = obj;
                        return c1672a;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    /* renamed from: q, reason: merged with bridge method [inline-methods] */
                    public final Object invoke(y.f fVar, Continuation<? super Unit> continuation) {
                        return ((C1672a) create(fVar, continuation)).invokeSuspend(Unit.f142422a);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C1672a(OrderOptionsActivity orderOptionsActivity, C17963o1 c17963o1, Continuation<? super C1672a> continuation) {
                        super(2, continuation);
                        this.f109863c = orderOptionsActivity;
                        this.f109864d = c17963o1;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final void r(OrderOptionsActivity orderOptionsActivity, DialogInterface dialogInterface, int i10) {
                        dialogInterface.dismiss();
                        orderOptionsActivity.finish();
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final void s(DialogInterface dialogInterface, int i10) {
                        dialogInterface.dismiss();
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final void t(OrderOptionsActivity orderOptionsActivity, y.f fVar, DialogInterface dialogInterface, int i10) {
                        y.f.ShowFulfillmentModeChallengeEvent nVar = (y.f.ShowFulfillmentModeChallengeEvent) fVar;
                        orderOptionsActivity.X1().Y(new y.e.FulfillmentModeChallengeResult(nVar.getChallenge().a(), nVar.getIsPickupStoreChallenge()));
                        dialogInterface.dismiss();
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final void u(OrderOptionsActivity orderOptionsActivity, y.f fVar, DialogInterface dialogInterface, int i10) {
                        y.f.ShowFulfillmentModeChallengeEvent nVar = (y.f.ShowFulfillmentModeChallengeEvent) fVar;
                        orderOptionsActivity.X1().Y(new y.e.FulfillmentModeChallengeResult(nVar.getChallenge().b(), nVar.getIsPickupStoreChallenge()));
                        dialogInterface.dismiss();
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final void v(DialogInterface dialogInterface, int i10) {
                        dialogInterface.dismiss();
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final void x(DialogInterface dialogInterface, int i10) {
                        dialogInterface.dismiss();
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Intent intentPutExtra;
                        IntrinsicsKt.f();
                        if (this.f109861a == 0) {
                            ResultKt.b(obj);
                            final y.f fVar = (y.f) this.f109862b;
                            if (fVar instanceof y.f.FailEvent) {
                                C16648k.d(C16623P.a(C16639f0.c()), null, null, new C1673a(this.f109864d, this.f109863c, fVar, null), 3, null);
                            } else if (fVar instanceof y.f.ShowError) {
                                y.f.ShowError mVar = (y.f.ShowError) fVar;
                                C14886b message = new C14886b(this.f109863c).setCancelable(false).setTitle(bk.d.a(this.f109863c, mVar.getTitle())).setMessage(bk.d.a(this.f109863c, mVar.getMessage()));
                                String strA = bk.d.a(this.f109863c, mVar.getPositiveButtonText());
                                final OrderOptionsActivity orderOptionsActivity = this.f109863c;
                                message.setPositiveButton(strA, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.orderoptions.j
                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i10) {
                                        OrderOptionsActivity.e.a.d.C1672a.r(orderOptionsActivity, dialogInterface, i10);
                                    }
                                }).show();
                            } else if (fVar instanceof y.f.NavigateToStoreDetailsEvent) {
                                y.f.NavigateToStoreDetailsEvent jVar = (y.f.NavigateToStoreDetailsEvent) fVar;
                                this.f109863c.findStoreResultLauncher.a(Al.s.d(this.f109863c, jVar.getStoreId(), jVar.getStoreName(), ok.i.f153986d, false, 16, null));
                            } else if (fVar instanceof y.f.NavigateToStoreSearchEvent) {
                                this.f109863c.findStoreResultLauncher.a(Al.s.f(this.f109863c, ok.i.f153987e, null, true, false, 0, null, ((y.f.NavigateToStoreSearchEvent) fVar).getIsPickUpMode(), 116, null));
                            } else if (fVar instanceof y.f.NavigateToAddressSearchEvent) {
                                if (this.f109863c.getFeatureManager().e(AbstractC18227f.K.f170550h)) {
                                    this.f109863c.newDeliveryAddressResultLauncher.a(SearchDeliveryAddressActivity.INSTANCE.a(this.f109863c, true, ((y.f.NavigateToAddressSearchEvent) fVar).getSavedAddressCount()));
                                } else {
                                    this.f109863c.newDeliveryAddressResultLauncher.a(AddressSearchActivity.INSTANCE.a(this.f109863c, true, ((y.f.NavigateToAddressSearchEvent) fVar).getSavedAddressCount()));
                                }
                            } else if (fVar instanceof y.f.NavigateToAddressDetailScreenEvent) {
                                y.f.NavigateToAddressDetailScreenEvent c1677f = (y.f.NavigateToAddressDetailScreenEvent) fVar;
                                this.f109863c.newDeliveryAddressResultLauncher.a(AddressDetailsActivity.INSTANCE.a(this.f109863c, c1677f.getAccountAddress(), true, Boxing.d(c1677f.getSavedAddressCount())));
                            } else if (fVar instanceof y.f.NavigateToStoreDetailScreenEvent) {
                                OrderOptionsActivity orderOptionsActivity2 = this.f109863c;
                                y.f.NavigateToStoreDetailScreenEvent iVar = (y.f.NavigateToStoreDetailScreenEvent) fVar;
                                orderOptionsActivity2.startActivity(Al.s.a(orderOptionsActivity2, iVar.getStoreId(), iVar.getStoreName(), iVar.getStoreSearchType(), false));
                            } else if (fVar instanceof y.f.NavigateToFulfillmentSlotsEvent) {
                                OrderOptionsActivity orderOptionsActivity3 = this.f109863c;
                                y.f.NavigateToFulfillmentSlotsEvent hVar = (y.f.NavigateToFulfillmentSlotsEvent) fVar;
                                orderOptionsActivity3.startActivity(OrderOptionsFulfillmentSlotsActivity.INSTANCE.a(orderOptionsActivity3, hVar.getDeliveryMode(), FulfillmentStateDetails.INSTANCE.a(hVar.getStoreId(), hVar.getPointOfService(), hVar.getDeliveryAddress())));
                            } else if (fVar instanceof y.f.p) {
                                new C14886b(this.f109863c).setTitle(Hl.h.f12768P).setCancelable(false).setMessage(Hl.h.f12767O).setNegativeButton(yr.Q.f170986b, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.orderoptions.k
                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i10) {
                                        OrderOptionsActivity.e.a.d.C1672a.s(dialogInterface, i10);
                                    }
                                }).show();
                            } else if (fVar instanceof y.f.ShowFulfillmentModeChallengeEvent) {
                                y.f.ShowFulfillmentModeChallengeEvent nVar = (y.f.ShowFulfillmentModeChallengeEvent) fVar;
                                C14886b message2 = new C14886b(this.f109863c).setTitle(nVar.getTitle()).setCancelable(false).setMessage(nVar.getMessage());
                                int i10 = Y.f99474B0;
                                final OrderOptionsActivity orderOptionsActivity4 = this.f109863c;
                                C14886b positiveButton = message2.setPositiveButton(i10, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.orderoptions.l
                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i11) {
                                        OrderOptionsActivity.e.a.d.C1672a.t(orderOptionsActivity4, fVar, dialogInterface, i11);
                                    }
                                });
                                int i11 = Bj.o.f3039r;
                                final OrderOptionsActivity orderOptionsActivity5 = this.f109863c;
                                positiveButton.setNegativeButton(i11, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.orderoptions.m
                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i12) {
                                        OrderOptionsActivity.e.a.d.C1672a.u(orderOptionsActivity5, fVar, dialogInterface, i12);
                                    }
                                }).show();
                            } else if (fVar instanceof y.f.l) {
                                this.f109863c.h2();
                            } else if (fVar instanceof y.f.ShowNoDeliveryStoresNearbyDialogEvent) {
                                new C14886b(this.f109863c).setCancelable(false).setMessage(((y.f.ShowNoDeliveryStoresNearbyDialogEvent) fVar).getMessage()).setPositiveButton(yr.Q.f170986b, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.orderoptions.n
                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i12) {
                                        OrderOptionsActivity.e.a.d.C1672a.v(dialogInterface, i12);
                                    }
                                }).show();
                            } else if (fVar instanceof y.f.a) {
                                this.f109863c.finish();
                            } else if (fVar instanceof y.f.DisplaySaveChangesDialog) {
                                y.f.DisplaySaveChangesDialog bVar = (y.f.DisplaySaveChangesDialog) fVar;
                                if (bVar.getShouldDisplayDialog()) {
                                    this.f109863c.i2(bVar.getDeliveryModeCode());
                                } else {
                                    this.f109863c.finish();
                                }
                            } else if (fVar instanceof y.f.FulfillmentChangeCallout) {
                                y.f.FulfillmentChangeCallout dVar = (y.f.FulfillmentChangeCallout) fVar;
                                this.f109863c.cancelFulfillmentChange = dVar.getCartChangesResource().b();
                                this.f109863c.acceptFulfillmentChange = dVar.getCartChangesResource().a();
                                CartChanges cartChangesB = dVar.getData();
                                if (cartChangesB != null) {
                                    Intent intentA = ChangeFulfillmentPreviewActivity.INSTANCE.a(this.f109863c, cartChangesB);
                                    if (intentA != null && (intentPutExtra = intentA.putExtra("fulfillmentType", dVar.getFulfillmentMode())) != null) {
                                        this.f109863c.fulfillmentChangeResultLauncher.a(intentPutExtra);
                                    }
                                }
                            } else if (fVar instanceof y.f.GenericFailureEvent) {
                                y.f.GenericFailureEvent eVar = (y.f.GenericFailureEvent) fVar;
                                new C14886b(this.f109863c).setCancelable(false).setTitle(eVar.getMessageTitleId()).setMessage(eVar.getMessageResId()).setPositiveButton(yr.Q.f170986b, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.orderoptions.o
                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i12) {
                                        OrderOptionsActivity.e.a.d.C1672a.x(dialogInterface, i12);
                                    }
                                }).show();
                            } else {
                                throw new NoWhenBranchMatchedException();
                            }
                            return Unit.f142422a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new d(this.f109859b, this.f109860c, continuation);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                d(OrderOptionsActivity orderOptionsActivity, C17963o1 c17963o1, Continuation<? super d> continuation) {
                    super(2, continuation);
                    this.f109859b = orderOptionsActivity;
                    this.f109860c = c17963o1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                    return ((d) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object objF = IntrinsicsKt.f();
                    int i10 = this.f109858a;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            ResultKt.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.b(obj);
                        InterfaceC17152f<y.f> interfaceC17152fS = this.f109859b.X1().S();
                        C1672a c1672a = new C1672a(this.f109859b, this.f109860c, null);
                        this.f109858a = 1;
                        if (C17154h.k(interfaceC17152fS, c1672a, this) == objF) {
                            return objF;
                        }
                    }
                    return Unit.f142422a;
                }
            }

            a(OrderOptionsActivity orderOptionsActivity) {
                this.f109839a = orderOptionsActivity;
            }

            /* JADX WARN: Removed duplicated region for block: B:32:0x00fe  */
            /* JADX WARN: Removed duplicated region for block: B:42:0x011e  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void b(Ji.LocalThemeScope r35, androidx.compose.runtime.Composer r36, int r37) {
                /*
                    Method dump skipped, instructions count: 406
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.orderoptions.OrderOptionsActivity.e.a.b(Ji.M, androidx.compose.runtime.Composer, int):void");
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
                b(localThemeScope, composer, num.intValue());
                return Unit.f142422a;
            }

            private static final y.OrderOptionsViewState c(z1<y.OrderOptionsViewState> z1Var) {
                return z1Var.getValue();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit d(OrderOptionsActivity orderOptionsActivity) {
                orderOptionsActivity.X1().Y(y.e.c.f110014a);
                return Unit.f142422a;
            }
        }

        e() {
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1145359126, i10, -1, "com.meijer.mobile.meijer.activity.orderoptions.OrderOptionsActivity.onCreate.<anonymous> (OrderOptionsActivity.kt:134)");
            }
            K.b(null, ComposableLambdaKt.c(-65590407, true, new a(OrderOptionsActivity.this), composer, 54), composer, 48, 1);
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
    /* synthetic */ class f implements InterfaceC14146b, FunctionAdapter {
        f() {
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC14146b) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.e(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, OrderOptionsActivity.this, OrderOptionsActivity.class, "handlePermissionsResult", "handlePermissionsResult(Ljava/util/Map;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // g.InterfaceC14146b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void a(Map<String, Boolean> p02) {
            Intrinsics.j(p02, "p0");
            OrderOptionsActivity.this.b2(p02);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class g extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f109870f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ComponentActivity componentActivity) {
            super(0);
            this.f109870f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f109870f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class h extends Lambda implements Function0<g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f109871f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ComponentActivity componentActivity) {
            super(0);
            this.f109871f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final g0 invoke() {
            return this.f109871f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class i extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f109872f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f109873g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f109872f = function0;
            this.f109873g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f109872f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f109873g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final y X1() {
        return (y) this.orderOptionsViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"MissingPermission"})
    public final void b2(final Map<String, Boolean> permissions) {
        InterfaceC3769c interfaceC3769c = this.fusedLocationClient;
        if (interfaceC3769c == null) {
            Intrinsics.y("fusedLocationClient");
            interfaceC3769c = null;
        }
        interfaceC3769c.o().c(new InterfaceC5227e() { // from class: com.meijer.mobile.meijer.activity.orderoptions.a
            @Override // Td.InterfaceC5227e
            public final void onComplete(AbstractC5232j abstractC5232j) {
                OrderOptionsActivity.c2(permissions, this, abstractC5232j);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c2(Map map, final OrderOptionsActivity orderOptionsActivity, AbstractC5232j locationAvailabilityTask) {
        Intrinsics.j(locationAvailabilityTask, "locationAvailabilityTask");
        if (!locationAvailabilityTask.r() || !Intrinsics.e(map.get("android.permission.ACCESS_FINE_LOCATION"), Boolean.TRUE) || !orderOptionsActivity.f2() || !((LocationAvailability) locationAvailabilityTask.n()).B()) {
            orderOptionsActivity.X1().Y(y.e.m.f110029a);
            return;
        }
        InterfaceC3769c interfaceC3769c = orderOptionsActivity.fusedLocationClient;
        if (interfaceC3769c == null) {
            Intrinsics.y("fusedLocationClient");
            interfaceC3769c = null;
        }
        AbstractC5232j<Location> abstractC5232jL = interfaceC3769c.l();
        final Function1 function1 = new Function1() { // from class: com.meijer.mobile.meijer.activity.orderoptions.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderOptionsActivity.d2(this.f109876a, (Location) obj);
            }
        };
        abstractC5232jL.g(new InterfaceC5229g() { // from class: com.meijer.mobile.meijer.activity.orderoptions.c
            @Override // Td.InterfaceC5229g
            public final void onSuccess(Object obj) {
                OrderOptionsActivity.e2(function1, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d2(OrderOptionsActivity orderOptionsActivity, Location location) {
        if (location != null) {
            orderOptionsActivity.X1().Y(new y.e.PopulateNearbyStores(location.getLatitude(), location.getLongitude()));
        } else {
            orderOptionsActivity.X1().Y(y.e.m.f110029a);
        }
        return Unit.f142422a;
    }

    private final boolean f2() {
        LocationManager locationManager = this.locationManager;
        if (locationManager != null) {
            return C14193b.a(locationManager);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"NewApi"})
    public final void h2() {
        this.permissionsResultLauncher.a(new String[]{"android.permission.ACCESS_FINE_LOCATION"});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i2(String deliveryModeCode) {
        new C14886b(this).setTitle(Hl.h.f12772T).setCancelable(false).setMessage(Intrinsics.e(deliveryModeCode, "delivery") ? Hl.h.f12771S : Hl.h.f12773U).setPositiveButton(Y.f100386vi, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.orderoptions.d
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                OrderOptionsActivity.j2(this.f109878a, dialogInterface, i10);
            }
        }).setNegativeButton(Y.f99710N8, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.orderoptions.e
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                OrderOptionsActivity.k2(this.f109879a, dialogInterface, i10);
            }
        }).show();
    }

    public final void l2(LocationManager locationManager) {
        this.locationManager = locationManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Y1(C14145a result) {
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
            if (storeDetails != null) {
                X1().Y(new y.e.UpdatedNewSelectPickupStore(storeDetails));
                getAnalyticsEngine().b(C14476c.a("Search for new store success"), new AbstractC14482i[0]);
                g2(storeDetails);
                return;
            }
            return;
        }
        if (data == null) {
            getAnalyticsEngine().b(C14476c.a("Search for new store canceled"), new AbstractC14482i[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Z1(C14145a result) {
        AbstractC17116a abstractC17116a;
        if (result.getResultCode() == 3132) {
            abstractC17116a = this.acceptFulfillmentChange;
        } else {
            abstractC17116a = this.cancelFulfillmentChange;
        }
        y yVarX1 = X1();
        Intrinsics.g(abstractC17116a);
        yVarX1.Y(new y.e.FulfillmentModeChallengeResult(abstractC17116a, true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a2(C14145a result) {
        AccountAddress accountAddress;
        Boolean boolValueOf;
        Parcelable parcelable;
        Intent data = result.getData();
        if (result.getResultCode() == -1 && data != null) {
            Bundle extras = data.getExtras();
            if (extras != null && extras.getBoolean("com.meijer.intent.extra.AddressDetailsActivity.IS_ADDRESS_REMOVED")) {
                X1().Y(y.e.d.f110015a);
                return;
            }
            Bundle extras2 = data.getExtras();
            String string = null;
            if (extras2 != null) {
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable = (Parcelable) extras2.getParcelable("com.meijer.intent.extra.AddressDetailsActivity.EXTRA_DELIVERY_ADDRESS", AccountAddress.class);
                } else {
                    Parcelable parcelable2 = extras2.getParcelable("com.meijer.intent.extra.AddressDetailsActivity.EXTRA_DELIVERY_ADDRESS");
                    if (!(parcelable2 instanceof AccountAddress)) {
                        parcelable2 = null;
                    }
                    parcelable = (AccountAddress) parcelable2;
                }
                accountAddress = (AccountAddress) parcelable;
            } else {
                accountAddress = null;
            }
            Intrinsics.g(accountAddress);
            Bundle extras3 = data.getExtras();
            boolean zBooleanValue = false;
            if (extras3 != null) {
                boolValueOf = Boolean.valueOf(extras3.getBoolean("com.meijer.intent.extra.AddressDetailsActivity.EXTRA_ADDRESS_SAVED_TO_ACCOUNT_ADDRESSES", false));
            } else {
                boolValueOf = null;
            }
            Bundle extras4 = data.getExtras();
            if (extras4 != null) {
                string = extras4.getString("com.meijer.intent.extra.AddressDetailsActivity.EXTRA_ADDRESS_SERVICE_TIER");
            }
            y yVarX1 = X1();
            if (boolValueOf != null) {
                zBooleanValue = boolValueOf.booleanValue();
            }
            yVarX1.Y(new y.e.AccountAddressToDeliveryAddress(accountAddress, zBooleanValue, string));
            return;
        }
        if (data == null) {
            X1().Y(y.e.b.f110013a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e2(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    private final void g2(StoreDetails storeDetails) {
        X1().Y(new y.e.SetPickupStore(storeDetails, true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j2(OrderOptionsActivity orderOptionsActivity, DialogInterface dialogInterface, int i10) {
        orderOptionsActivity.X1().Y(y.e.r.f110036a);
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k2(OrderOptionsActivity orderOptionsActivity, DialogInterface dialogInterface, int i10) {
        dialogInterface.dismiss();
        orderOptionsActivity.finish();
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.fusedLocationClient = C3778l.a(this);
        if (getIntent().hasExtra("com.meijer.intent.extra.OrderOptionsActivity.EXTRA_PREVIOUS_PAGE_NAME")) {
            y yVarX1 = X1();
            String stringExtra = getIntent().getStringExtra("com.meijer.intent.extra.OrderOptionsActivity.EXTRA_PREVIOUS_PAGE_NAME");
            if (stringExtra == null) {
                stringExtra = "";
            }
            yVarX1.Y(new y.e.SetPreviousPageName(stringExtra));
        }
        C13589e.b(this, null, ComposableLambdaKt.composableLambdaInstance(-1145359126, true, new e()), 1, null);
    }
}
