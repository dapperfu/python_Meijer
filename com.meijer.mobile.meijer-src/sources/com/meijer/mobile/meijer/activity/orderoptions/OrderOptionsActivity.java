package com.meijer.mobile.meijer.activity.orderoptions;

import Eh.AccountAddress;
import Ki.C;
import Ki.K;
import Ki.LocalThemeScope;
import Ki.Q;
import Ld.C4022l;
import Ld.InterfaceC4013c;
import V2.CreationExtras;
import Vd.AbstractC5516j;
import Vd.InterfaceC5511e;
import Vd.InterfaceC5513g;
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
import bk.AbstractC6392a;
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
import e.C13737e;
import fj.CartChanges;
import fn.C14031B;
import g.AbstractC14276c;
import g.C14274a;
import g.InterfaceC14275b;
import g2.C14322b;
import h.C14433g;
import ii.AbstractC14762i;
import ii.C14756c;
import j0.InterfaceC14882C;
import j0.InterfaceC14888I;
import j0.InterfaceC14902f;
import java.util.Locale;
import java.util.Map;
import ki.InterfaceC15205y;
import ki.j1;
import ki.q1;
import kotlin.C17983Z;
import kotlin.C18029o1;
import kotlin.EnumC18023m1;
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
import le.C15485b;
import mv.C15784P;
import mv.C15800f0;
import mv.C15809k;
import mv.InterfaceC15783O;
import p1.C16338g;
import pk.StoreDetails;
import pv.C16563h;
import pv.InterfaceC16561f;
import uk.AbstractC17440a;
import zl.AbstractC18503f;

@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 M2\u00020\u0001:\u0001NB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\t\u0010\u0003J#\u0010\u000e\u001a\u00020\u00062\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0013\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0019\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001a\u0010\u0018J\u0019\u0010\u001d\u001a\u00020\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0014¢\u0006\u0004\b\u001d\u0010\u001eR\u001b\u0010$\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0016\u0010(\u001a\u00020%8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010+\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010-\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010*R$\u00103\u001a\u0010\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u000200\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R$\u00107\u001a\u0010\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u000200\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R.\u0010@\u001a\u0004\u0018\u0001082\b\u00109\u001a\u0004\u0018\u0001088\u0000@AX\u0080\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u001a\u0010E\u001a\b\u0012\u0004\u0012\u00020B0A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u001a\u0010G\u001a\b\u0012\u0004\u0012\u00020B0A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010DR\u001a\u0010I\u001a\b\u0012\u0004\u0012\u00020B0A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010DR \u0010L\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0J0A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010D¨\u0006Q²\u0006\f\u0010P\u001a\u00020O8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/meijer/mobile/meijer/activity/orderoptions/OrderOptionsActivity;", "Lcom/meijer/mobile/meijer/activity/MeijerActivity;", "<init>", "()V", "Lpk/h;", "storeDetails", "", "g2", "(Lpk/h;)V", "h2", "", "", "", "permissions", "b2", "(Ljava/util/Map;)V", "f2", "()Z", "deliveryModeCode", "i2", "(Ljava/lang/String;)V", "Lg/a;", "result", "a2", "(Lg/a;)V", "Y1", "Z1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Lcom/meijer/mobile/meijer/activity/orderoptions/y;", "s", "Lkotlin/Lazy;", "X1", "()Lcom/meijer/mobile/meijer/activity/orderoptions/y;", "orderOptionsViewModel", "LLd/c;", "t", "LLd/c;", "fusedLocationClient", "u", "Z", "newPickupOptionSelected", "v", "newDeliveryOptionSelected", "Luk/a$b;", "Lfj/n;", "Lfj/e;", "w", "Luk/a$b;", "cancelFulfillmentChange", "Luk/a$a;", "x", "Luk/a$a;", "acceptFulfillmentChange", "Landroid/location/LocationManager;", "value", "y", "Landroid/location/LocationManager;", "getLocationManager$Meijer_playstoreRelease", "()Landroid/location/LocationManager;", "l2", "(Landroid/location/LocationManager;)V", "locationManager", "Lg/c;", "Landroid/content/Intent;", "z", "Lg/c;", "newDeliveryAddressResultLauncher", "A", "findStoreResultLauncher", "B", "fulfillmentChangeResultLauncher", "", "C", "permissionsResultLauncher", "D", "a", "Lcom/meijer/mobile/meijer/activity/orderoptions/y$g;", "orderOptionsViewState", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class OrderOptionsActivity extends Hilt_OrderOptionsActivity {

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: E, reason: collision with root package name */
    public static final int f110684E = 8;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private InterfaceC4013c fusedLocationClient;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private boolean newPickupOptionSelected;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private boolean newDeliveryOptionSelected;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private AbstractC17440a.Cancel<fj.n, CartChanges> cancelFulfillmentChange;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private AbstractC17440a.Accept<fj.n, CartChanges> acceptFulfillmentChange;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private LocationManager locationManager;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final Lazy orderOptionsViewModel = new e0(Reflection.b(y.class), new h(this), new g(this), new i(null, this));

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final AbstractC14276c<Intent> newDeliveryAddressResultLauncher = registerForActivityResult(new h.i(), new d());

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    private final AbstractC14276c<Intent> findStoreResultLauncher = registerForActivityResult(new h.i(), new b());

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final AbstractC14276c<Intent> fulfillmentChangeResultLauncher = registerForActivityResult(new h.i(), new c());

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private final AbstractC14276c<String[]> permissionsResultLauncher = registerForActivityResult(new C14433g(), new f());

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
    /* synthetic */ class b implements InterfaceC14275b, FunctionAdapter {
        b() {
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC14275b) && (obj instanceof FunctionAdapter)) {
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

        @Override // g.InterfaceC14275b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void a(C14274a p02) {
            Intrinsics.j(p02, "p0");
            OrderOptionsActivity.this.Y1(p02);
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
            return new FunctionReferenceImpl(1, OrderOptionsActivity.this, OrderOptionsActivity.class, "handleFulfillmentChangeResult", "handleFulfillmentChangeResult(Landroidx/activity/result/ActivityResult;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // g.InterfaceC14275b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void a(C14274a p02) {
            Intrinsics.j(p02, "p0");
            OrderOptionsActivity.this.Z1(p02);
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
            return new FunctionReferenceImpl(1, OrderOptionsActivity.this, OrderOptionsActivity.class, "handleNewDeliveryAddressResult", "handleNewDeliveryAddressResult(Landroidx/activity/result/ActivityResult;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // g.InterfaceC14275b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void a(C14274a p02) {
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
            final /* synthetic */ OrderOptionsActivity f110700a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.meijer.activity.orderoptions.OrderOptionsActivity$e$a$a, reason: collision with other inner class name */
            static final class C1675a implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f110701a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ OrderOptionsActivity f110702b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ y.OrderOptionsViewState f110703c;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.meijer.mobile.meijer.activity.orderoptions.OrderOptionsActivity$e$a$a$a, reason: collision with other inner class name */
                static final class C1676a implements Function2<Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f110704a;

                    C1676a(LocalThemeScope localThemeScope) {
                        this.f110704a = localThemeScope;
                    }

                    public final void a(Composer composer, int i10) {
                        if ((i10 & 3) == 2 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(1528375604, i10, -1, "com.meijer.mobile.meijer.activity.orderoptions.OrderOptionsActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OrderOptionsActivity.kt:146)");
                        }
                        Dr.g.g(this.f110704a, C16338g.c(Il.h.f14937d0, composer, 0), null, false, null, 0, null, 0, composer, LocalThemeScope.f17314g, 126);
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

                public final void b(Composer composer, int i10) {
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(2138063988, i10, -1, "com.meijer.mobile.meijer.activity.orderoptions.OrderOptionsActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OrderOptionsActivity.kt:143)");
                    }
                    AbstractC6392a abstractC6392aD = AbstractC6392a.INSTANCE.d(Y.f101031l1, new Object[0]);
                    C.f.o oVar = C.f.o.f17066e;
                    LocalThemeScope localThemeScope = this.f110701a;
                    ComposableLambda composableLambdaC = ComposableLambdaKt.c(1528375604, true, new C1676a(localThemeScope), composer, 54);
                    composer.startReplaceGroup(-1633490746);
                    boolean zD = composer.D(this.f110702b) | composer.D(this.f110703c);
                    final OrderOptionsActivity orderOptionsActivity = this.f110702b;
                    final y.OrderOptionsViewState gVar = this.f110703c;
                    Object objB = composer.B();
                    if (zD || objB == Composer.INSTANCE.a()) {
                        objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.orderoptions.g
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return OrderOptionsActivity.e.a.C1675a.c(orderOptionsActivity, gVar);
                            }
                        };
                        composer.t(objB);
                    }
                    composer.P();
                    Dr.g.f(localThemeScope, null, null, null, composableLambdaC, (Function0) objB, oVar, 0.0f, false, abstractC6392aD, composer, LocalThemeScope.f17314g | 24576 | (C.f.o.f17067f << 18) | (AbstractC6392a.f60445b << 27), 199);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                C1675a(LocalThemeScope localThemeScope, OrderOptionsActivity orderOptionsActivity, y.OrderOptionsViewState gVar) {
                    this.f110701a = localThemeScope;
                    this.f110702b = orderOptionsActivity;
                    this.f110703c = gVar;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    b(composer, num.intValue());
                    return Unit.f143329a;
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
                    return Unit.f143329a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            static final class b implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ OrderOptionsActivity f110705a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ y.OrderOptionsViewState f110706b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f110707c;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.meijer.mobile.meijer.activity.orderoptions.OrderOptionsActivity$e$a$b$a, reason: collision with other inner class name */
                static final class C1677a implements Function3<InterfaceC14902f, Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f110708a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ y.OrderOptionsViewState f110709b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ OrderOptionsActivity f110710c;

                    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.meijer.mobile.meijer.activity.orderoptions.OrderOptionsActivity$e$a$b$a$a, reason: collision with other inner class name */
                    static final class C1678a implements Function3<j1, Composer, Integer, Unit> {

                        /* renamed from: a, reason: collision with root package name */
                        final /* synthetic */ y.OrderOptionsViewState f110711a;

                        /* renamed from: b, reason: collision with root package name */
                        final /* synthetic */ LocalThemeScope f110712b;

                        /* renamed from: c, reason: collision with root package name */
                        final /* synthetic */ OrderOptionsActivity f110713c;

                        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                        /* renamed from: com.meijer.mobile.meijer.activity.orderoptions.OrderOptionsActivity$e$a$b$a$a$a, reason: collision with other inner class name */
                        static final class C1679a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

                            /* renamed from: a, reason: collision with root package name */
                            final /* synthetic */ LocalThemeScope f110714a;

                            /* renamed from: b, reason: collision with root package name */
                            final /* synthetic */ j1 f110715b;

                            C1679a(LocalThemeScope localThemeScope, j1 j1Var) {
                                this.f110714a = localThemeScope;
                                this.f110715b = j1Var;
                            }

                            public final void a(InterfaceC14888I AdsButton, Composer composer, int i10) {
                                Intrinsics.j(AdsButton, "$this$AdsButton");
                                if ((i10 & 17) == 16 && composer.j()) {
                                    composer.K();
                                    return;
                                }
                                if (ComposerKt.M()) {
                                    ComposerKt.U(-1985519054, i10, -1, "com.meijer.mobile.meijer.activity.orderoptions.OrderOptionsActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OrderOptionsActivity.kt:224)");
                                }
                                LocalThemeScope localThemeScope = this.f110714a;
                                q1.Label enabledLabel = this.f110715b.getLabels().getEnabledLabel();
                                String upperCase = C16338g.c(Y.f100619Ph, composer, 0).toUpperCase(Locale.ROOT);
                                Intrinsics.i(upperCase, "toUpperCase(...)");
                                si.j.h(localThemeScope, enabledLabel, upperCase, null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
                                if (ComposerKt.M()) {
                                    ComposerKt.T();
                                }
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14888I interfaceC14888I, Composer composer, Integer num) {
                                a(interfaceC14888I, composer, num.intValue());
                                return Unit.f143329a;
                            }
                        }

                        C1678a(y.OrderOptionsViewState gVar, LocalThemeScope localThemeScope, OrderOptionsActivity orderOptionsActivity) {
                            this.f110711a = gVar;
                            this.f110712b = localThemeScope;
                            this.f110713c = orderOptionsActivity;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
                        /* JADX WARN: Removed duplicated region for block: B:25:0x0077  */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final void b(ki.j1 r22, androidx.compose.runtime.Composer r23, int r24) {
                            /*
                                Method dump skipped, instructions count: 280
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.orderoptions.OrderOptionsActivity.e.a.b.C1677a.C1678a.b(ki.j1, androidx.compose.runtime.Composer, int):void");
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(j1 j1Var, Composer composer, Integer num) {
                            b(j1Var, composer, num.intValue());
                            return Unit.f143329a;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit c(OrderOptionsActivity orderOptionsActivity) {
                            orderOptionsActivity.X1().Y(y.e.r.f110897a);
                            return Unit.f143329a;
                        }
                    }

                    C1677a(LocalThemeScope localThemeScope, y.OrderOptionsViewState gVar, OrderOptionsActivity orderOptionsActivity) {
                        this.f110708a = localThemeScope;
                        this.f110709b = gVar;
                        this.f110710c = orderOptionsActivity;
                    }

                    public final void a(InterfaceC14902f AdsColumn, Composer composer, int i10) {
                        Intrinsics.j(AdsColumn, "$this$AdsColumn");
                        if ((i10 & 17) == 16 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(-415401053, i10, -1, "com.meijer.mobile.meijer.activity.orderoptions.OrderOptionsActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OrderOptionsActivity.kt:199)");
                        }
                        C17983Z.a(D.m(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, this.f110708a.getAdsSpacing().getFive().getDp(), 7, null), this.f110708a.getAdsColors().getAdsColorUIDivider().getColor(), 0.0f, 0.0f, composer, 0, 12);
                        LocalThemeScope localThemeScope = this.f110708a;
                        Q.e(localThemeScope, InterfaceC15205y.a.d.f142547a, ComposableLambdaKt.c(-232810305, true, new C1678a(this.f110709b, localThemeScope, this.f110710c), composer, 54), composer, LocalThemeScope.f17314g | 384 | (InterfaceC15205y.a.d.f142548b << 3));
                        if (ComposerKt.M()) {
                            ComposerKt.T();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14902f interfaceC14902f, Composer composer, Integer num) {
                        a(interfaceC14902f, composer, num.intValue());
                        return Unit.f143329a;
                    }
                }

                b(OrderOptionsActivity orderOptionsActivity, y.OrderOptionsViewState gVar, LocalThemeScope localThemeScope) {
                    this.f110705a = orderOptionsActivity;
                    this.f110706b = gVar;
                    this.f110707c = localThemeScope;
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
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit c(OrderOptionsActivity orderOptionsActivity) {
                    orderOptionsActivity.X1().Y(y.e.r.f110897a);
                    return Unit.f143329a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            static final class c implements Function3<InterfaceC14882C, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f110716a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ y.OrderOptionsViewState f110717b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ OrderOptionsActivity f110718c;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.meijer.mobile.meijer.activity.orderoptions.OrderOptionsActivity$e$a$c$a, reason: collision with other inner class name */
                /* synthetic */ class C1680a extends FunctionReferenceImpl implements Function1<y.e, Unit> {
                    C1680a(Object obj) {
                        super(1, obj, y.class, "onAction", "onAction(Lcom/meijer/mobile/meijer/activity/orderoptions/OrderOptionsViewModel$OrderOptionsAction;)V", 0);
                    }

                    public final void a(y.e p02) {
                        Intrinsics.j(p02, "p0");
                        ((y) this.receiver).Y(p02);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(y.e eVar) {
                        a(eVar);
                        return Unit.f143329a;
                    }
                }

                c(LocalThemeScope localThemeScope, y.OrderOptionsViewState gVar, OrderOptionsActivity orderOptionsActivity) {
                    this.f110716a = localThemeScope;
                    this.f110717b = gVar;
                    this.f110718c = orderOptionsActivity;
                }

                public final void a(InterfaceC14882C contentPadding, Composer composer, int i10) {
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
                    LocalThemeScope localThemeScope = this.f110716a;
                    Modifier modifierH = D.h(Modifier.INSTANCE, contentPadding);
                    y.OrderOptionsViewState gVar = this.f110717b;
                    boolean zE = this.f110718c.getFeatureManager().e(AbstractC18503f.K.f172850h);
                    y yVarX1 = this.f110718c.X1();
                    composer.startReplaceGroup(5004770);
                    boolean zD = composer.D(yVarX1);
                    Object objB = composer.B();
                    if (zD || objB == Composer.INSTANCE.a()) {
                        objB = new C1680a(yVarX1);
                        composer.t(objB);
                    }
                    composer.P();
                    C14031B.h(localThemeScope, modifierH, gVar, zE, (Function1) ((KFunction) objB), composer, LocalThemeScope.f17314g, 0);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14882C interfaceC14882C, Composer composer, Integer num) {
                    a(interfaceC14882C, composer, num.intValue());
                    return Unit.f143329a;
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.meijer.activity.orderoptions.OrderOptionsActivity$onCreate$1$1$2$1", f = "OrderOptionsActivity.kt", l = {256}, m = "invokeSuspend")
            static final class d extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f110719a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ OrderOptionsActivity f110720b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ C18029o1 f110721c;

                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/meijer/mobile/meijer/activity/orderoptions/y$f;", "event", "", "<anonymous>", "(Lcom/meijer/mobile/meijer/activity/orderoptions/y$f;)V"}, k = 3, mv = {2, 1, 0})
                @DebugMetadata(c = "com.meijer.mobile.meijer.activity.orderoptions.OrderOptionsActivity$onCreate$1$1$2$1$1", f = "OrderOptionsActivity.kt", l = {}, m = "invokeSuspend")
                @SourceDebugExtension
                /* renamed from: com.meijer.mobile.meijer.activity.orderoptions.OrderOptionsActivity$e$a$d$a, reason: collision with other inner class name */
                static final class C1681a extends SuspendLambda implements Function2<y.f, Continuation<? super Unit>, Object> {

                    /* renamed from: a, reason: collision with root package name */
                    int f110722a;

                    /* renamed from: b, reason: collision with root package name */
                    /* synthetic */ Object f110723b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ OrderOptionsActivity f110724c;

                    /* renamed from: d, reason: collision with root package name */
                    final /* synthetic */ C18029o1 f110725d;

                    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
                    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.orderoptions.OrderOptionsActivity$onCreate$1$1$2$1$1$1", f = "OrderOptionsActivity.kt", l = {260}, m = "invokeSuspend")
                    /* renamed from: com.meijer.mobile.meijer.activity.orderoptions.OrderOptionsActivity$e$a$d$a$a, reason: collision with other inner class name */
                    static final class C1682a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

                        /* renamed from: a, reason: collision with root package name */
                        int f110726a;

                        /* renamed from: b, reason: collision with root package name */
                        final /* synthetic */ C18029o1 f110727b;

                        /* renamed from: c, reason: collision with root package name */
                        final /* synthetic */ OrderOptionsActivity f110728c;

                        /* renamed from: d, reason: collision with root package name */
                        final /* synthetic */ y.f f110729d;

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            return new C1682a(this.f110727b, this.f110728c, this.f110729d, continuation);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C1682a(C18029o1 c18029o1, OrderOptionsActivity orderOptionsActivity, y.f fVar, Continuation<? super C1682a> continuation) {
                            super(2, continuation);
                            this.f110727b = c18029o1;
                            this.f110728c = orderOptionsActivity;
                            this.f110729d = fVar;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                            return ((C1682a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            Object objF = IntrinsicsKt.f();
                            int i10 = this.f110726a;
                            if (i10 != 0) {
                                if (i10 == 1) {
                                    ResultKt.b(obj);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                ResultKt.b(obj);
                                C18029o1 c18029o1 = this.f110727b;
                                String string = this.f110728c.getString(((y.f.FailEvent) this.f110729d).getMessageResId());
                                Intrinsics.i(string, "getString(...)");
                                EnumC18023m1 enumC18023m1 = EnumC18023m1.f169431b;
                                this.f110726a = 1;
                                if (C18029o1.e(c18029o1, string, null, enumC18023m1, this, 2, null) == objF) {
                                    return objF;
                                }
                            }
                            return Unit.f143329a;
                        }
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C1681a c1681a = new C1681a(this.f110724c, this.f110725d, continuation);
                        c1681a.f110723b = obj;
                        return c1681a;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    /* renamed from: q, reason: merged with bridge method [inline-methods] */
                    public final Object invoke(y.f fVar, Continuation<? super Unit> continuation) {
                        return ((C1681a) create(fVar, continuation)).invokeSuspend(Unit.f143329a);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C1681a(OrderOptionsActivity orderOptionsActivity, C18029o1 c18029o1, Continuation<? super C1681a> continuation) {
                        super(2, continuation);
                        this.f110724c = orderOptionsActivity;
                        this.f110725d = c18029o1;
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
                        if (this.f110722a == 0) {
                            ResultKt.b(obj);
                            final y.f fVar = (y.f) this.f110723b;
                            if (fVar instanceof y.f.FailEvent) {
                                C15809k.d(C15784P.a(C15800f0.c()), null, null, new C1682a(this.f110725d, this.f110724c, fVar, null), 3, null);
                            } else if (fVar instanceof y.f.ShowError) {
                                y.f.ShowError mVar = (y.f.ShowError) fVar;
                                C15485b message = new C15485b(this.f110724c).setCancelable(false).setTitle(ck.d.a(this.f110724c, mVar.getTitle())).setMessage(ck.d.a(this.f110724c, mVar.getMessage()));
                                String strA = ck.d.a(this.f110724c, mVar.getPositiveButtonText());
                                final OrderOptionsActivity orderOptionsActivity = this.f110724c;
                                message.setPositiveButton(strA, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.orderoptions.j
                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i10) {
                                        OrderOptionsActivity.e.a.d.C1681a.r(orderOptionsActivity, dialogInterface, i10);
                                    }
                                }).show();
                            } else if (fVar instanceof y.f.NavigateToStoreDetailsEvent) {
                                y.f.NavigateToStoreDetailsEvent jVar = (y.f.NavigateToStoreDetailsEvent) fVar;
                                this.f110724c.findStoreResultLauncher.a(Bl.s.d(this.f110724c, jVar.getStoreId(), jVar.getStoreName(), pk.i.f156746d, false, 16, null));
                            } else if (fVar instanceof y.f.NavigateToStoreSearchEvent) {
                                this.f110724c.findStoreResultLauncher.a(Bl.s.f(this.f110724c, pk.i.f156747e, null, true, false, 0, null, ((y.f.NavigateToStoreSearchEvent) fVar).getIsPickUpMode(), 116, null));
                            } else if (fVar instanceof y.f.NavigateToAddressSearchEvent) {
                                if (this.f110724c.getFeatureManager().e(AbstractC18503f.K.f172850h)) {
                                    this.f110724c.newDeliveryAddressResultLauncher.a(SearchDeliveryAddressActivity.INSTANCE.a(this.f110724c, true, ((y.f.NavigateToAddressSearchEvent) fVar).getSavedAddressCount()));
                                } else {
                                    this.f110724c.newDeliveryAddressResultLauncher.a(AddressSearchActivity.INSTANCE.a(this.f110724c, true, ((y.f.NavigateToAddressSearchEvent) fVar).getSavedAddressCount()));
                                }
                            } else if (fVar instanceof y.f.NavigateToAddressDetailScreenEvent) {
                                y.f.NavigateToAddressDetailScreenEvent c1686f = (y.f.NavigateToAddressDetailScreenEvent) fVar;
                                this.f110724c.newDeliveryAddressResultLauncher.a(AddressDetailsActivity.INSTANCE.a(this.f110724c, c1686f.getAccountAddress(), true, Boxing.d(c1686f.getSavedAddressCount())));
                            } else if (fVar instanceof y.f.NavigateToStoreDetailScreenEvent) {
                                OrderOptionsActivity orderOptionsActivity2 = this.f110724c;
                                y.f.NavigateToStoreDetailScreenEvent iVar = (y.f.NavigateToStoreDetailScreenEvent) fVar;
                                orderOptionsActivity2.startActivity(Bl.s.a(orderOptionsActivity2, iVar.getStoreId(), iVar.getStoreName(), iVar.getStoreSearchType(), false));
                            } else if (fVar instanceof y.f.NavigateToFulfillmentSlotsEvent) {
                                OrderOptionsActivity orderOptionsActivity3 = this.f110724c;
                                y.f.NavigateToFulfillmentSlotsEvent hVar = (y.f.NavigateToFulfillmentSlotsEvent) fVar;
                                orderOptionsActivity3.startActivity(OrderOptionsFulfillmentSlotsActivity.INSTANCE.a(orderOptionsActivity3, hVar.getDeliveryMode(), FulfillmentStateDetails.INSTANCE.a(hVar.getStoreId(), hVar.getPointOfService(), hVar.getDeliveryAddress())));
                            } else if (fVar instanceof y.f.p) {
                                new C15485b(this.f110724c).setTitle(Il.h.f14919P).setCancelable(false).setMessage(Il.h.f14918O).setNegativeButton(yr.Q.f171761b, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.orderoptions.k
                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i10) {
                                        OrderOptionsActivity.e.a.d.C1681a.s(dialogInterface, i10);
                                    }
                                }).show();
                            } else if (fVar instanceof y.f.ShowFulfillmentModeChallengeEvent) {
                                y.f.ShowFulfillmentModeChallengeEvent nVar = (y.f.ShowFulfillmentModeChallengeEvent) fVar;
                                C15485b message2 = new C15485b(this.f110724c).setTitle(nVar.getTitle()).setCancelable(false).setMessage(nVar.getMessage());
                                int i10 = Y.f100332B0;
                                final OrderOptionsActivity orderOptionsActivity4 = this.f110724c;
                                C15485b positiveButton = message2.setPositiveButton(i10, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.orderoptions.l
                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i11) {
                                        OrderOptionsActivity.e.a.d.C1681a.t(orderOptionsActivity4, fVar, dialogInterface, i11);
                                    }
                                });
                                int i11 = Cj.o.f5084r;
                                final OrderOptionsActivity orderOptionsActivity5 = this.f110724c;
                                positiveButton.setNegativeButton(i11, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.orderoptions.m
                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i12) {
                                        OrderOptionsActivity.e.a.d.C1681a.u(orderOptionsActivity5, fVar, dialogInterface, i12);
                                    }
                                }).show();
                            } else if (fVar instanceof y.f.l) {
                                this.f110724c.h2();
                            } else if (fVar instanceof y.f.ShowNoDeliveryStoresNearbyDialogEvent) {
                                new C15485b(this.f110724c).setCancelable(false).setMessage(((y.f.ShowNoDeliveryStoresNearbyDialogEvent) fVar).getMessage()).setPositiveButton(yr.Q.f171761b, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.orderoptions.n
                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i12) {
                                        OrderOptionsActivity.e.a.d.C1681a.v(dialogInterface, i12);
                                    }
                                }).show();
                            } else if (fVar instanceof y.f.a) {
                                this.f110724c.finish();
                            } else if (fVar instanceof y.f.DisplaySaveChangesDialog) {
                                y.f.DisplaySaveChangesDialog bVar = (y.f.DisplaySaveChangesDialog) fVar;
                                if (bVar.getShouldDisplayDialog()) {
                                    this.f110724c.i2(bVar.getDeliveryModeCode());
                                } else {
                                    this.f110724c.finish();
                                }
                            } else if (fVar instanceof y.f.FulfillmentChangeCallout) {
                                y.f.FulfillmentChangeCallout dVar = (y.f.FulfillmentChangeCallout) fVar;
                                this.f110724c.cancelFulfillmentChange = dVar.getCartChangesResource().b();
                                this.f110724c.acceptFulfillmentChange = dVar.getCartChangesResource().a();
                                CartChanges cartChangesB = dVar.getData();
                                if (cartChangesB != null) {
                                    Intent intentA = ChangeFulfillmentPreviewActivity.INSTANCE.a(this.f110724c, cartChangesB);
                                    if (intentA != null && (intentPutExtra = intentA.putExtra("fulfillmentType", dVar.getFulfillmentMode())) != null) {
                                        this.f110724c.fulfillmentChangeResultLauncher.a(intentPutExtra);
                                    }
                                }
                            } else if (fVar instanceof y.f.GenericFailureEvent) {
                                y.f.GenericFailureEvent eVar = (y.f.GenericFailureEvent) fVar;
                                new C15485b(this.f110724c).setCancelable(false).setTitle(eVar.getMessageTitleId()).setMessage(eVar.getMessageResId()).setPositiveButton(yr.Q.f171761b, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.orderoptions.o
                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i12) {
                                        OrderOptionsActivity.e.a.d.C1681a.x(dialogInterface, i12);
                                    }
                                }).show();
                            } else {
                                throw new NoWhenBranchMatchedException();
                            }
                            return Unit.f143329a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new d(this.f110720b, this.f110721c, continuation);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                d(OrderOptionsActivity orderOptionsActivity, C18029o1 c18029o1, Continuation<? super d> continuation) {
                    super(2, continuation);
                    this.f110720b = orderOptionsActivity;
                    this.f110721c = c18029o1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                    return ((d) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object objF = IntrinsicsKt.f();
                    int i10 = this.f110719a;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            ResultKt.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.b(obj);
                        InterfaceC16561f<y.f> interfaceC16561fS = this.f110720b.X1().S();
                        C1681a c1681a = new C1681a(this.f110720b, this.f110721c, null);
                        this.f110719a = 1;
                        if (C16563h.k(interfaceC16561fS, c1681a, this) == objF) {
                            return objF;
                        }
                    }
                    return Unit.f143329a;
                }
            }

            a(OrderOptionsActivity orderOptionsActivity) {
                this.f110700a = orderOptionsActivity;
            }

            /* JADX WARN: Removed duplicated region for block: B:32:0x00fe  */
            /* JADX WARN: Removed duplicated region for block: B:42:0x011e  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void b(Ki.LocalThemeScope r35, androidx.compose.runtime.Composer r36, int r37) {
                /*
                    Method dump skipped, instructions count: 406
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.orderoptions.OrderOptionsActivity.e.a.b(Ki.M, androidx.compose.runtime.Composer, int):void");
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
                b(localThemeScope, composer, num.intValue());
                return Unit.f143329a;
            }

            private static final y.OrderOptionsViewState c(z1<y.OrderOptionsViewState> z1Var) {
                return z1Var.getValue();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit d(OrderOptionsActivity orderOptionsActivity) {
                orderOptionsActivity.X1().Y(y.e.c.f110875a);
                return Unit.f143329a;
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
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class f implements InterfaceC14275b, FunctionAdapter {
        f() {
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC14275b) && (obj instanceof FunctionAdapter)) {
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

        @Override // g.InterfaceC14275b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void a(Map<String, Boolean> p02) {
            Intrinsics.j(p02, "p0");
            OrderOptionsActivity.this.b2(p02);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class g extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f110731f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ComponentActivity componentActivity) {
            super(0);
            this.f110731f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f110731f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class h extends Lambda implements Function0<g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f110732f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ComponentActivity componentActivity) {
            super(0);
            this.f110732f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final g0 invoke() {
            return this.f110732f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class i extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f110733f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f110734g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f110733f = function0;
            this.f110734g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f110733f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f110734g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final y X1() {
        return (y) this.orderOptionsViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"MissingPermission"})
    public final void b2(final Map<String, Boolean> permissions) {
        InterfaceC4013c interfaceC4013c = this.fusedLocationClient;
        if (interfaceC4013c == null) {
            Intrinsics.x("fusedLocationClient");
            interfaceC4013c = null;
        }
        interfaceC4013c.o().c(new InterfaceC5511e() { // from class: com.meijer.mobile.meijer.activity.orderoptions.a
            @Override // Vd.InterfaceC5511e
            public final void onComplete(AbstractC5516j abstractC5516j) {
                OrderOptionsActivity.c2(permissions, this, abstractC5516j);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c2(Map map, final OrderOptionsActivity orderOptionsActivity, AbstractC5516j locationAvailabilityTask) {
        Intrinsics.j(locationAvailabilityTask, "locationAvailabilityTask");
        if (!locationAvailabilityTask.r() || !Intrinsics.e(map.get("android.permission.ACCESS_FINE_LOCATION"), Boolean.TRUE) || !orderOptionsActivity.f2() || !((LocationAvailability) locationAvailabilityTask.n()).B()) {
            orderOptionsActivity.X1().Y(y.e.m.f110890a);
            return;
        }
        InterfaceC4013c interfaceC4013c = orderOptionsActivity.fusedLocationClient;
        if (interfaceC4013c == null) {
            Intrinsics.x("fusedLocationClient");
            interfaceC4013c = null;
        }
        AbstractC5516j<Location> abstractC5516jM = interfaceC4013c.m();
        final Function1 function1 = new Function1() { // from class: com.meijer.mobile.meijer.activity.orderoptions.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderOptionsActivity.d2(this.f110737a, (Location) obj);
            }
        };
        abstractC5516jM.g(new InterfaceC5513g() { // from class: com.meijer.mobile.meijer.activity.orderoptions.c
            @Override // Vd.InterfaceC5513g
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
            orderOptionsActivity.X1().Y(y.e.m.f110890a);
        }
        return Unit.f143329a;
    }

    private final boolean f2() {
        LocationManager locationManager = this.locationManager;
        if (locationManager != null) {
            return C14322b.a(locationManager);
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
        new C15485b(this).setTitle(Il.h.f14923T).setCancelable(false).setMessage(Intrinsics.e(deliveryModeCode, "delivery") ? Il.h.f14922S : Il.h.f14924U).setPositiveButton(Y.f100330Ai, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.orderoptions.d
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                OrderOptionsActivity.j2(this.f110739a, dialogInterface, i10);
            }
        }).setNegativeButton(Y.f100629Q8, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.orderoptions.e
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                OrderOptionsActivity.k2(this.f110740a, dialogInterface, i10);
            }
        }).show();
    }

    public final void l2(LocationManager locationManager) {
        this.locationManager = locationManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Y1(C14274a result) {
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
                getAnalyticsEngine().h(C14756c.a("Search for new store success"), new AbstractC14762i[0]);
                g2(storeDetails);
                return;
            }
            return;
        }
        if (data == null) {
            getAnalyticsEngine().h(C14756c.a("Search for new store canceled"), new AbstractC14762i[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Z1(C14274a result) {
        AbstractC17440a abstractC17440a;
        if (result.getResultCode() == 3132) {
            abstractC17440a = this.acceptFulfillmentChange;
        } else {
            abstractC17440a = this.cancelFulfillmentChange;
        }
        y yVarX1 = X1();
        Intrinsics.g(abstractC17440a);
        yVarX1.Y(new y.e.FulfillmentModeChallengeResult(abstractC17440a, true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a2(C14274a result) {
        AccountAddress accountAddress;
        Boolean boolValueOf;
        Parcelable parcelable;
        Intent data = result.getData();
        if (result.getResultCode() == -1 && data != null) {
            Bundle extras = data.getExtras();
            if (extras != null && extras.getBoolean("com.meijer.intent.extra.AddressDetailsActivity.IS_ADDRESS_REMOVED")) {
                X1().Y(y.e.d.f110876a);
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
            X1().Y(y.e.b.f110874a);
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
        orderOptionsActivity.X1().Y(y.e.r.f110897a);
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
        this.fusedLocationClient = C4022l.a(this);
        if (getIntent().hasExtra("com.meijer.intent.extra.OrderOptionsActivity.EXTRA_PREVIOUS_PAGE_NAME")) {
            y yVarX1 = X1();
            String stringExtra = getIntent().getStringExtra("com.meijer.intent.extra.OrderOptionsActivity.EXTRA_PREVIOUS_PAGE_NAME");
            if (stringExtra == null) {
                stringExtra = "";
            }
            yVarX1.Y(new y.e.SetPreviousPageName(stringExtra));
        }
        C13737e.b(this, null, ComposableLambdaKt.composableLambdaInstance(-1145359126, true, new e()), 1, null);
    }
}
