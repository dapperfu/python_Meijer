package com.meijer.mobile.meijer.activity.settings.addresses;

import En.AddressPrediction;
import En.C;
import Ld.C4022l;
import Ld.InterfaceC4013c;
import Nn.AbstractC4206a;
import Nn.AbstractC4260l0;
import Nn.AbstractC4268n0;
import V2.CreationExtras;
import Vd.AbstractC5516j;
import Vd.InterfaceC5513g;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C6173t;
import androidx.view.ComponentActivity;
import androidx.view.e0;
import androidx.view.f0;
import androidx.view.g0;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.material.card.MaterialCardView;
import com.meijer.mobile.meijer.V;
import com.meijer.mobile.meijer.activity.settings.addresses.AddressSearchActivity;
import com.meijer.mobile.widget.DebouncingAutoCompleteTextView;
import g.AbstractC14276c;
import g.InterfaceC14275b;
import g2.C14322b;
import h.C14433g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ju.C15069d;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
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
import kotlin.text.StringsKt;
import ku.AbstractC15424a;
import pv.C16563h;
import yk.C18326b;
import ys.C18372b;

@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\b\b\u0001\u0018\u0000 O2\u00020\u00012\u00020\u0002:\u0003PQRB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\u0004J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0003¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u0010\u001a\u00020\u00052\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0014\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0017\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J1\u0010\u001e\u001a\u00020\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\b2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ1\u0010!\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001aH\u0016¢\u0006\u0004\b!\u0010\u001fJ\u000f\u0010\"\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\"\u0010\u0004J\u000f\u0010#\u001a\u00020\u0005H\u0014¢\u0006\u0004\b#\u0010\u0004R\u0016\u0010&\u001a\u00020$8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010%R\u0016\u0010)\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010+\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010(R\u001b\u00101\u001a\u00020,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001c\u00106\u001a\b\u0012\u0004\u0012\u000203028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u0010:\u001a\u0002078\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010>\u001a\u00020;8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010@\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010(R.\u0010I\u001a\u0004\u0018\u00010A2\b\u0010B\u001a\u0004\u0018\u00010A8\u0000@AX\u0080\u000e¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR \u0010N\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0K0J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010M¨\u0006S"}, d2 = {"Lcom/meijer/mobile/meijer/activity/settings/addresses/AddressSearchActivity;", "Lcom/meijer/mobile/meijer/activity/MeijerActivity;", "Landroid/text/TextWatcher;", "<init>", "()V", "", "O1", "L1", "", "query", "P1", "(Ljava/lang/CharSequence;)V", "", "", "", "permissions", "N1", "(Ljava/util/Map;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/text/Editable;", "afterTextChanged", "(Landroid/text/Editable;)V", "s", "", "start", "count", "after", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", "before", "onTextChanged", "onResume", "onDestroy", "LNn/a;", "LNn/a;", "binding", "t", "Z", "checkedPermissions", "u", "locationEnabled", "LEn/C;", "v", "Lkotlin/Lazy;", "M1", "()LEn/C;", "viewModel", "Lju/d;", "Lju/g;", "w", "Lju/d;", "suggestionsAdapter", "Lju/l;", "x", "Lju/l;", "suggestionsSection", "LLd/c;", "y", "LLd/c;", "fusedLocationClient", "z", "shouldClearSearchTextUponReturn", "Landroid/location/LocationManager;", "value", "A", "Landroid/location/LocationManager;", "getLocationManager$Meijer_playstoreRelease", "()Landroid/location/LocationManager;", "U1", "(Landroid/location/LocationManager;)V", "locationManager", "Lg/c;", "", "B", "Lg/c;", "permissionsResultLauncher", "C", "c", "b", "a", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class AddressSearchActivity extends Hilt_AddressSearchActivity implements TextWatcher {

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: D, reason: collision with root package name */
    public static final int f112638D = 8;

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    private LocationManager locationManager;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private AbstractC4206a binding;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private boolean checkedPermissions;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private boolean locationEnabled;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private C15069d<ju.g> suggestionsAdapter;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private ju.l suggestionsSection;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private InterfaceC4013c fusedLocationClient;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private boolean shouldClearSearchTextUponReturn;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final Lazy viewModel = new e0(Reflection.b(C.class), new h(this), new g(this), new i(null, this));

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final AbstractC14276c<String[]> permissionsResultLauncher = registerForActivityResult(new C14433g(), new f());

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/meijer/mobile/meijer/activity/settings/addresses/AddressSearchActivity$a;", "Lju/h;", "Lju/g;", "<init>", "()V", "", "j", "()I", "groupieViewHolder", "position", "", "b", "(Lju/g;I)V", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends ju.h<ju.g> {
        @Override // ju.h
        public void b(ju.g groupieViewHolder, int position) {
            Intrinsics.j(groupieViewHolder, "groupieViewHolder");
        }

        @Override // ju.h
        public int j() {
            return V.f100294z0;
        }
    }

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\r\u001a\u00020\f2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lcom/meijer/mobile/meijer/activity/settings/addresses/AddressSearchActivity$b;", "Lku/a;", "LNn/n0;", "LEn/A;", "addressPrediction", "<init>", "(Lcom/meijer/mobile/meijer/activity/settings/addresses/AddressSearchActivity;LEn/A;)V", "", "i", "()J", "Lju/h;", "other", "", "m", "(Lju/h;)Z", "", "j", "()I", "Landroid/view/View;", "view", "D", "(Landroid/view/View;)LNn/n0;", "viewBinding", "position", "", "B", "(LNn/n0;I)V", "e", "LEn/A;", "Lcom/meijer/mobile/meijer/activity/settings/addresses/u;", "f", "Lcom/meijer/mobile/meijer/activity/settings/addresses/u;", "decorator", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class b extends AbstractC15424a<AbstractC4268n0> {

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final AddressPrediction addressPrediction;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final AddressSearchDecorator decorator;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ AddressSearchActivity f112651g;

        public b(AddressSearchActivity addressSearchActivity, AddressPrediction addressPrediction) {
            Intrinsics.j(addressPrediction, "addressPrediction");
            this.f112651g = addressSearchActivity;
            this.addressPrediction = addressPrediction;
            this.decorator = AddressSearchDecorator.INSTANCE.a(addressPrediction);
        }

        @Override // ku.AbstractC15424a
        /* renamed from: B, reason: merged with bridge method [inline-methods] */
        public void u(AbstractC4268n0 viewBinding, int position) {
            Intrinsics.j(viewBinding, "viewBinding");
            TextView suggestionText = viewBinding.f22138B;
            Intrinsics.i(suggestionText, "suggestionText");
            ck.d.g(suggestionText, this.decorator.getFormattedAddress());
            MaterialCardView materialCardView = viewBinding.f22139z;
            final AddressSearchActivity addressSearchActivity = this.f112651g;
            materialCardView.setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.settings.addresses.r
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AddressSearchActivity.b.C(addressSearchActivity, this, view);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ku.AbstractC15424a
        /* renamed from: D, reason: merged with bridge method [inline-methods] */
        public AbstractC4268n0 z(View view) {
            Intrinsics.j(view, "view");
            AbstractC4268n0 abstractC4268n0M0 = AbstractC4268n0.M0(view);
            Intrinsics.i(abstractC4268n0M0, "bind(...)");
            return abstractC4268n0M0;
        }

        @Override // ju.h
        public long i() {
            return this.addressPrediction.getPlaceId().hashCode();
        }

        @Override // ju.h
        public int j() {
            return V.f100179G;
        }

        @Override // ju.h
        public boolean m(ju.h<?> other) {
            Intrinsics.j(other, "other");
            if (super.m(other)) {
                return true;
            }
            return (other instanceof b) && Intrinsics.e(((b) other).decorator, this.decorator);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void C(AddressSearchActivity addressSearchActivity, b bVar, View view) {
            addressSearchActivity.M1().A(new C.c.AutoFillSearchAction(bVar.decorator.getFormattedAddress()));
            addressSearchActivity.M1().A(new C.c.CompleteSearchAction(bVar.addressPrediction));
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/meijer/mobile/meijer/activity/settings/addresses/AddressSearchActivity$c;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "fromOrderOptions", "", "accountAddressSize", "Landroid/content/Intent;", "a", "(Landroid/content/Context;ZI)Landroid/content/Intent;", "", "EXTRA_FROM_ORDER_OPTIONS", "Ljava/lang/String;", "EXTRA_ACCOUNT_ADDRESS_SIZE", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.settings.addresses.AddressSearchActivity$c, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final Intent a(Context context, boolean fromOrderOptions, int accountAddressSize) {
            Intrinsics.j(context, "context");
            Intent intentPutExtra = new Intent(context, (Class<?>) AddressSearchActivity.class).putExtra("com.meijer.mobile.meijer.activity.settings.addresses.AddressSearchActivity.EXTRA_FROM_ORDER_OPTIONS", fromOrderOptions).putExtra("com.meijer.mobile.meijer.activity.settings.addresses.AddressSearchActivity.EXTRA_ACCOUNT_ADDRESS_SIZE", accountAddressSize);
            Intrinsics.i(intentPutExtra, "putExtra(...)");
            return intentPutExtra;
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
            return new FunctionReferenceImpl(1, AddressSearchActivity.this, AddressSearchActivity.class, "handlePermissionsResult", "handlePermissionsResult(Ljava/util/Map;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // g.InterfaceC14275b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void a(Map<String, Boolean> p02) {
            Intrinsics.j(p02, "p0");
            AddressSearchActivity.this.N1(p02);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class g extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f112659f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ComponentActivity componentActivity) {
            super(0);
            this.f112659f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f112659f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class h extends Lambda implements Function0<g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f112660f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ComponentActivity componentActivity) {
            super(0);
            this.f112660f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final g0 invoke() {
            return this.f112660f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class i extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f112661f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f112662g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f112661f = function0;
            this.f112662g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f112661f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f112662g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S1(AddressSearchActivity addressSearchActivity, View view) {
        addressSearchActivity.shouldClearSearchTextUponReturn = true;
        Intent intentA = AddressDetailsActivity.INSTANCE.a(addressSearchActivity, null, addressSearchActivity.getIntent().getBooleanExtra("com.meijer.mobile.meijer.activity.settings.addresses.AddressSearchActivity.EXTRA_FROM_ORDER_OPTIONS", false), Integer.valueOf(addressSearchActivity.getIntent().getIntExtra("com.meijer.mobile.meijer.activity.settings.addresses.AddressSearchActivity.EXTRA_ACCOUNT_ADDRESS_SIZE", 0)));
        if (addressSearchActivity.getIntent().getBooleanExtra("com.meijer.mobile.meijer.activity.settings.addresses.AddressSearchActivity.EXTRA_FROM_ORDER_OPTIONS", false)) {
            intentA = intentA.addFlags(33554432);
        }
        addressSearchActivity.startActivity(intentA);
        addressSearchActivity.finish();
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable query) {
        String string = query != null ? query.toString() : null;
        if (string == null || StringsKt.s0(string)) {
            query = null;
        }
        if (query != null) {
            M1().A(C.c.b.f7776a);
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence s10, int start, int count, int after) {
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LEn/C$f;", "event", "", "<anonymous>", "(LEn/C$f;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.settings.addresses.AddressSearchActivity$onCreate$6", f = "AddressSearchActivity.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class d extends SuspendLambda implements Function2<C.ViewState, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f112652a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f112653b;

        d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            d dVar = AddressSearchActivity.this.new d(continuation);
            dVar.f112653b = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C.ViewState viewState, Continuation<? super Unit> continuation) {
            return ((d) create(viewState, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f112652a == 0) {
                ResultKt.b(obj);
                C.ViewState viewState = (C.ViewState) this.f112653b;
                List listI0 = CollectionsKt.i0(viewState.c());
                int i10 = 8;
                AbstractC4206a abstractC4206a = null;
                if (!listI0.isEmpty()) {
                    AbstractC4206a abstractC4206a2 = AddressSearchActivity.this.binding;
                    if (abstractC4206a2 == null) {
                        Intrinsics.x("binding");
                        abstractC4206a2 = null;
                    }
                    Editable text = abstractC4206a2.f21789B.f22108C.getText();
                    Intrinsics.i(text, "getText(...)");
                    if (text.length() > 0) {
                        ju.l lVar = AddressSearchActivity.this.suggestionsSection;
                        if (lVar == null) {
                            Intrinsics.x("suggestionsSection");
                            lVar = null;
                        }
                        List list = listI0;
                        AddressSearchActivity addressSearchActivity = AddressSearchActivity.this;
                        ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(new b(addressSearchActivity, (AddressPrediction) it.next()));
                        }
                        lVar.R(arrayList);
                        AbstractC4206a abstractC4206a3 = AddressSearchActivity.this.binding;
                        if (abstractC4206a3 == null) {
                            Intrinsics.x("binding");
                            abstractC4206a3 = null;
                        }
                        abstractC4206a3.f21791D.scrollToPosition(0);
                        AbstractC4206a abstractC4206a4 = AddressSearchActivity.this.binding;
                        if (abstractC4206a4 == null) {
                            Intrinsics.x("binding");
                            abstractC4206a4 = null;
                        }
                        LinearLayout addManuallyLayout = abstractC4206a4.f21788A;
                        Intrinsics.i(addManuallyLayout, "addManuallyLayout");
                        if (viewState.getAllowManualAdd()) {
                            i10 = 0;
                        }
                        addManuallyLayout.setVisibility(i10);
                        AbstractC4206a abstractC4206a5 = AddressSearchActivity.this.binding;
                        if (abstractC4206a5 == null) {
                            Intrinsics.x("binding");
                        } else {
                            abstractC4206a = abstractC4206a5;
                        }
                        abstractC4206a.f21791D.announceForAccessibility(AddressSearchActivity.this.getString(C18372b.f172065p));
                    }
                } else {
                    ju.l lVar2 = AddressSearchActivity.this.suggestionsSection;
                    if (lVar2 == null) {
                        Intrinsics.x("suggestionsSection");
                        lVar2 = null;
                    }
                    lVar2.t();
                    AbstractC4206a abstractC4206a6 = AddressSearchActivity.this.binding;
                    if (abstractC4206a6 == null) {
                        Intrinsics.x("binding");
                    } else {
                        abstractC4206a = abstractC4206a6;
                    }
                    LinearLayout addManuallyLayout2 = abstractC4206a.f21788A;
                    Intrinsics.i(addManuallyLayout2, "addManuallyLayout");
                    if (viewState.getAllowManualAdd()) {
                        i10 = 0;
                    }
                    addManuallyLayout2.setVisibility(i10);
                }
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LEn/C$d;", "event", "", "<anonymous>", "(LEn/C$d;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.settings.addresses.AddressSearchActivity$onCreate$7", f = "AddressSearchActivity.kt", l = {}, m = "invokeSuspend")
    static final class e extends SuspendLambda implements Function2<C.d, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f112655a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f112656b;

        e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            e eVar = AddressSearchActivity.this.new e(continuation);
            eVar.f112656b = obj;
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C.d dVar, Continuation<? super Unit> continuation) {
            return ((e) create(dVar, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f112655a == 0) {
                ResultKt.b(obj);
                C.d dVar = (C.d) this.f112656b;
                if (dVar instanceof C.d.AddressSuggestionListSuccessEvent) {
                    qw.a.INSTANCE.a("Address Suggestion List Success", new Object[0]);
                } else if (dVar instanceof C.d.AddressAutoFillEvent) {
                    AbstractC4206a abstractC4206a = AddressSearchActivity.this.binding;
                    AbstractC4206a abstractC4206a2 = null;
                    if (abstractC4206a == null) {
                        Intrinsics.x("binding");
                        abstractC4206a = null;
                    }
                    abstractC4206a.f21789B.f22108C.getText().clear();
                    AbstractC4206a abstractC4206a3 = AddressSearchActivity.this.binding;
                    if (abstractC4206a3 == null) {
                        Intrinsics.x("binding");
                    } else {
                        abstractC4206a2 = abstractC4206a3;
                    }
                    DebouncingAutoCompleteTextView searchFieldView = abstractC4206a2.f21789B.f22108C;
                    Intrinsics.i(searchFieldView, "searchFieldView");
                    ck.d.g(searchFieldView, ((C.d.AddressAutoFillEvent) dVar).getAutoFillAddressSelection());
                } else if (dVar instanceof C.d.C0154d) {
                    Boxing.a(AddressSearchActivity.this.onNavigateUp());
                } else if (dVar instanceof C.d.CompleteSearchEvent) {
                    AddressSearchActivity.this.shouldClearSearchTextUponReturn = true;
                    Intent intentA = AddressDetailsActivity.INSTANCE.a(AddressSearchActivity.this, ((C.d.CompleteSearchEvent) dVar).getPredictedAddressSelection(), AddressSearchActivity.this.getIntent().getBooleanExtra("com.meijer.mobile.meijer.activity.settings.addresses.AddressSearchActivity.EXTRA_FROM_ORDER_OPTIONS", false), Boxing.d(AddressSearchActivity.this.getIntent().getIntExtra("com.meijer.mobile.meijer.activity.settings.addresses.AddressSearchActivity.EXTRA_ACCOUNT_ADDRESS_SIZE", 0)));
                    AddressSearchActivity addressSearchActivity = AddressSearchActivity.this;
                    if (addressSearchActivity.getIntent().getBooleanExtra("com.meijer.mobile.meijer.activity.settings.addresses.AddressSearchActivity.EXTRA_FROM_ORDER_OPTIONS", false)) {
                        intentA = intentA.addFlags(33554432);
                    }
                    addressSearchActivity.startActivity(intentA);
                    AddressSearchActivity.this.finish();
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    private final void L1() {
        if (this.checkedPermissions) {
            return;
        }
        this.checkedPermissions = true;
        this.permissionsResultLauncher.a(new String[]{"android.permission.ACCESS_FINE_LOCATION"});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C M1() {
        return (C) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N1(Map<String, Boolean> permissions) {
        if (Intrinsics.e(permissions.get("android.permission.ACCESS_FINE_LOCATION"), Boolean.TRUE)) {
            qw.a.INSTANCE.a("LOCATION PERMISSION GRANTED by user", new Object[0]);
        } else {
            qw.a.INSTANCE.d("LOCATION PERMISSION DENIED", new Object[0]);
        }
    }

    private final void O1() {
        LocationManager locationManager = this.locationManager;
        this.locationEnabled = locationManager != null ? C14322b.a(locationManager) : false;
    }

    @SuppressLint({"MissingPermission"})
    private final void P1(final CharSequence query) {
        InterfaceC4013c interfaceC4013c = this.fusedLocationClient;
        if (interfaceC4013c == null) {
            Intrinsics.x("fusedLocationClient");
            interfaceC4013c = null;
        }
        AbstractC5516j<Location> abstractC5516jM = interfaceC4013c.m();
        final Function1 function1 = new Function1() { // from class: com.meijer.mobile.meijer.activity.settings.addresses.n
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AddressSearchActivity.Q1(this.f112713a, query, (Location) obj);
            }
        };
        abstractC5516jM.g(new InterfaceC5513g() { // from class: com.meijer.mobile.meijer.activity.settings.addresses.o
            @Override // Vd.InterfaceC5513g
            public final void onSuccess(Object obj) {
                AddressSearchActivity.R1(function1, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Q1(AddressSearchActivity addressSearchActivity, CharSequence charSequence, Location location) {
        LatLngBounds latLngBoundsX;
        if (location == null || (latLngBoundsX = Ds.i.a(location, 40000.0d)) == null) {
            latLngBoundsX = addressSearchActivity.M1().x();
        }
        ju.l lVar = addressSearchActivity.suggestionsSection;
        if (lVar == null) {
            Intrinsics.x("suggestionsSection");
            lVar = null;
        }
        lVar.t();
        addressSearchActivity.M1().A(new C.c.SearchStartedAction(charSequence.toString(), latLngBoundsX));
        return Unit.f143329a;
    }

    public final void U1(LocationManager locationManager) {
        this.locationManager = locationManager;
    }

    @Override // com.meijer.mobile.meijer.activity.MeijerActivity, com.meijer.mobile.meijer.activity.Hilt_MeijerActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        AbstractC4206a abstractC4206a = this.binding;
        if (abstractC4206a == null) {
            Intrinsics.x("binding");
            abstractC4206a = null;
        }
        abstractC4206a.f21789B.f22108C.removeTextChangedListener(this);
        super.onDestroy();
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence query, int start, int before, int count) {
        if (query == null || StringsKt.s0(query)) {
            M1().A(C.c.b.f7776a);
            return;
        }
        if (C18326b.a(this, "android.permission.ACCESS_FINE_LOCATION") && this.locationEnabled) {
            P1(query);
            return;
        }
        LatLngBounds latLngBoundsX = M1().x();
        ju.l lVar = this.suggestionsSection;
        if (lVar == null) {
            Intrinsics.x("suggestionsSection");
            lVar = null;
        }
        lVar.t();
        M1().A(new C.c.SearchStartedAction(query.toString(), latLngBoundsX));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R1(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T1(AddressSearchActivity addressSearchActivity, View view) {
        addressSearchActivity.M1().A(C.c.d.f7778a);
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AbstractC4206a abstractC4206aM0 = AbstractC4206a.M0(getLayoutInflater());
        this.binding = abstractC4206aM0;
        if (abstractC4206aM0 == null) {
            Intrinsics.x("binding");
            abstractC4206aM0 = null;
        }
        setContentView(Zr.a.j(abstractC4206aM0.getRoot(), false, 1, null));
        AbstractC4206a abstractC4206a = this.binding;
        if (abstractC4206a == null) {
            Intrinsics.x("binding");
            abstractC4206a = null;
        }
        Zr.a.g(abstractC4206a.f21791D, false, 1, null);
        AbstractC4206a abstractC4206a2 = this.binding;
        if (abstractC4206a2 == null) {
            Intrinsics.x("binding");
            abstractC4206a2 = null;
        }
        Zr.a.g(abstractC4206a2.f21789B.f22108C, false, 1, null);
        this.fusedLocationClient = C4022l.a(this);
        O1();
        L1();
        AbstractC4206a abstractC4206a3 = this.binding;
        if (abstractC4206a3 == null) {
            Intrinsics.x("binding");
            abstractC4206a3 = null;
        }
        abstractC4206a3.f21789B.f22108C.requestFocus();
        AbstractC4206a abstractC4206a4 = this.binding;
        if (abstractC4206a4 == null) {
            Intrinsics.x("binding");
            abstractC4206a4 = null;
        }
        abstractC4206a4.f21792z.setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.settings.addresses.p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AddressSearchActivity.S1(this.f112716a, view);
            }
        });
        ju.l lVar = new ju.l();
        lVar.O(true);
        lVar.M(new a());
        this.suggestionsSection = lVar;
        AbstractC4206a abstractC4206a5 = this.binding;
        if (abstractC4206a5 == null) {
            Intrinsics.x("binding");
            abstractC4206a5 = null;
        }
        abstractC4206a5.f21789B.f22107B.setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.settings.addresses.q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AddressSearchActivity.T1(this.f112717a, view);
            }
        });
        C15069d<ju.g> c15069d = new C15069d<>();
        ju.l lVar2 = this.suggestionsSection;
        if (lVar2 == null) {
            Intrinsics.x("suggestionsSection");
            lVar2 = null;
        }
        c15069d.c(lVar2);
        this.suggestionsAdapter = c15069d;
        AbstractC4206a abstractC4206a6 = this.binding;
        if (abstractC4206a6 == null) {
            Intrinsics.x("binding");
            abstractC4206a6 = null;
        }
        RecyclerView recyclerView = abstractC4206a6.f21791D;
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        C15069d<ju.g> c15069d2 = this.suggestionsAdapter;
        if (c15069d2 == null) {
            Intrinsics.x("suggestionsAdapter");
            c15069d2 = null;
        }
        recyclerView.setAdapter(c15069d2);
        recyclerView.addItemDecoration(new androidx.recyclerview.widget.i(this, 1));
        AbstractC4206a abstractC4206a7 = this.binding;
        if (abstractC4206a7 == null) {
            Intrinsics.x("binding");
            abstractC4206a7 = null;
        }
        abstractC4206a7.f21789B.f22108C.addTextChangedListener(this);
        C16563h.J(C16563h.O(M1().y(), new d(null)), C6173t.a(this));
        C16563h.J(C16563h.O(M1().getEvents(), new e(null)), C6173t.a(this));
    }

    @Override // com.meijer.mobile.meijer.activity.MeijerActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        O1();
        AbstractC4206a abstractC4206a = null;
        if (this.shouldClearSearchTextUponReturn) {
            this.shouldClearSearchTextUponReturn = false;
            AbstractC4206a abstractC4206a2 = this.binding;
            if (abstractC4206a2 == null) {
                Intrinsics.x("binding");
            } else {
                abstractC4206a = abstractC4206a2;
            }
            abstractC4206a.f21789B.f22108C.getText().clear();
            return;
        }
        AbstractC4206a abstractC4206a3 = this.binding;
        if (abstractC4206a3 == null) {
            Intrinsics.x("binding");
        } else {
            abstractC4206a = abstractC4206a3;
        }
        AbstractC4260l0 abstractC4260l0 = abstractC4206a.f21789B;
        DebouncingAutoCompleteTextView debouncingAutoCompleteTextView = abstractC4260l0.f22108C;
        debouncingAutoCompleteTextView.setText(debouncingAutoCompleteTextView.getText());
        DebouncingAutoCompleteTextView debouncingAutoCompleteTextView2 = abstractC4260l0.f22108C;
        debouncingAutoCompleteTextView2.setSelection(debouncingAutoCompleteTextView2.length());
        Intrinsics.g(abstractC4260l0);
    }
}
