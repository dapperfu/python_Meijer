package com.meijer.mobile.meijer.activity.settings.addresses;

import Dn.AddressPrediction;
import Dn.C;
import Jd.C3778l;
import Jd.InterfaceC3769c;
import Mn.AbstractC4201a;
import Mn.AbstractC4255l0;
import Mn.AbstractC4263n0;
import Td.AbstractC5232j;
import Td.InterfaceC5229g;
import V2.CreationExtras;
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
import androidx.view.C6031t;
import androidx.view.ComponentActivity;
import androidx.view.e0;
import androidx.view.f0;
import androidx.view.g0;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.material.card.MaterialCardView;
import com.meijer.mobile.meijer.V;
import com.meijer.mobile.meijer.activity.settings.addresses.AddressSearchActivity;
import com.meijer.mobile.widget.DebouncingAutoCompleteTextView;
import g.AbstractC14147c;
import g.InterfaceC14146b;
import g2.C14193b;
import h.C14320g;
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
import nu.C15949d;
import ou.AbstractC16177a;
import tv.C17154h;
import xk.C18064b;
import ys.C18301b;

@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\b\b\u0001\u0018\u0000 O2\u00020\u00012\u00020\u0002:\u0003PQRB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\u0004J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0003¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u0010\u001a\u00020\u00052\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0014\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0017\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J1\u0010\u001e\u001a\u00020\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\b2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ1\u0010!\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001aH\u0016¢\u0006\u0004\b!\u0010\u001fJ\u000f\u0010\"\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\"\u0010\u0004J\u000f\u0010#\u001a\u00020\u0005H\u0014¢\u0006\u0004\b#\u0010\u0004R\u0016\u0010&\u001a\u00020$8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010%R\u0016\u0010)\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010+\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010(R\u001b\u00101\u001a\u00020,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001c\u00106\u001a\b\u0012\u0004\u0012\u000203028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u0010:\u001a\u0002078\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010>\u001a\u00020;8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010@\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010(R.\u0010I\u001a\u0004\u0018\u00010A2\b\u0010B\u001a\u0004\u0018\u00010A8\u0000@AX\u0080\u000e¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR \u0010N\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0K0J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010M¨\u0006S"}, d2 = {"Lcom/meijer/mobile/meijer/activity/settings/addresses/AddressSearchActivity;", "Lcom/meijer/mobile/meijer/activity/MeijerActivity;", "Landroid/text/TextWatcher;", "<init>", "()V", "", "O1", "L1", "", "query", "P1", "(Ljava/lang/CharSequence;)V", "", "", "", "permissions", "N1", "(Ljava/util/Map;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/text/Editable;", "afterTextChanged", "(Landroid/text/Editable;)V", "s", "", "start", "count", "after", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", "before", "onTextChanged", "onResume", "onDestroy", "LMn/a;", "LMn/a;", "binding", "t", "Z", "checkedPermissions", "u", "locationEnabled", "LDn/C;", "v", "Lkotlin/Lazy;", "M1", "()LDn/C;", "viewModel", "Lnu/d;", "Lnu/g;", "w", "Lnu/d;", "suggestionsAdapter", "Lnu/l;", "x", "Lnu/l;", "suggestionsSection", "LJd/c;", "y", "LJd/c;", "fusedLocationClient", "z", "shouldClearSearchTextUponReturn", "Landroid/location/LocationManager;", "value", "A", "Landroid/location/LocationManager;", "getLocationManager$Meijer_playstoreRelease", "()Landroid/location/LocationManager;", "U1", "(Landroid/location/LocationManager;)V", "locationManager", "Lg/c;", "", "B", "Lg/c;", "permissionsResultLauncher", "C", "c", "b", "a", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class AddressSearchActivity extends Hilt_AddressSearchActivity implements TextWatcher {

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: D, reason: collision with root package name */
    public static final int f111769D = 8;

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    private LocationManager locationManager;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private AbstractC4201a binding;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private boolean checkedPermissions;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private boolean locationEnabled;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private C15949d<nu.g> suggestionsAdapter;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private nu.l suggestionsSection;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private InterfaceC3769c fusedLocationClient;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private boolean shouldClearSearchTextUponReturn;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final Lazy viewModel = new e0(Reflection.b(C.class), new h(this), new g(this), new i(null, this));

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final AbstractC14147c<String[]> permissionsResultLauncher = registerForActivityResult(new C14320g(), new f());

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/meijer/mobile/meijer/activity/settings/addresses/AddressSearchActivity$a;", "Lnu/h;", "Lnu/g;", "<init>", "()V", "", "j", "()I", "groupieViewHolder", "position", "", "b", "(Lnu/g;I)V", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends nu.h<nu.g> {
        @Override // nu.h
        public void b(nu.g groupieViewHolder, int position) {
            Intrinsics.j(groupieViewHolder, "groupieViewHolder");
        }

        @Override // nu.h
        public int j() {
            return V.f99438z0;
        }
    }

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\r\u001a\u00020\f2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lcom/meijer/mobile/meijer/activity/settings/addresses/AddressSearchActivity$b;", "Lou/a;", "LMn/n0;", "LDn/A;", "addressPrediction", "<init>", "(Lcom/meijer/mobile/meijer/activity/settings/addresses/AddressSearchActivity;LDn/A;)V", "", "i", "()J", "Lnu/h;", "other", "", "m", "(Lnu/h;)Z", "", "j", "()I", "Landroid/view/View;", "view", "D", "(Landroid/view/View;)LMn/n0;", "viewBinding", "position", "", "B", "(LMn/n0;I)V", "e", "LDn/A;", "Lcom/meijer/mobile/meijer/activity/settings/addresses/u;", "f", "Lcom/meijer/mobile/meijer/activity/settings/addresses/u;", "decorator", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class b extends AbstractC16177a<AbstractC4263n0> {

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final AddressPrediction addressPrediction;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final AddressSearchDecorator decorator;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ AddressSearchActivity f111782g;

        public b(AddressSearchActivity addressSearchActivity, AddressPrediction addressPrediction) {
            Intrinsics.j(addressPrediction, "addressPrediction");
            this.f111782g = addressSearchActivity;
            this.addressPrediction = addressPrediction;
            this.decorator = AddressSearchDecorator.INSTANCE.a(addressPrediction);
        }

        @Override // ou.AbstractC16177a
        /* renamed from: B, reason: merged with bridge method [inline-methods] */
        public void u(AbstractC4263n0 viewBinding, int position) {
            Intrinsics.j(viewBinding, "viewBinding");
            TextView suggestionText = viewBinding.f20806B;
            Intrinsics.i(suggestionText, "suggestionText");
            bk.d.g(suggestionText, this.decorator.getFormattedAddress());
            MaterialCardView materialCardView = viewBinding.f20807z;
            final AddressSearchActivity addressSearchActivity = this.f111782g;
            materialCardView.setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.settings.addresses.r
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AddressSearchActivity.b.C(addressSearchActivity, this, view);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ou.AbstractC16177a
        /* renamed from: D, reason: merged with bridge method [inline-methods] */
        public AbstractC4263n0 z(View view) {
            Intrinsics.j(view, "view");
            AbstractC4263n0 abstractC4263n0K0 = AbstractC4263n0.K0(view);
            Intrinsics.i(abstractC4263n0K0, "bind(...)");
            return abstractC4263n0K0;
        }

        @Override // nu.h
        public long i() {
            return this.addressPrediction.getPlaceId().hashCode();
        }

        @Override // nu.h
        public int j() {
            return V.f99323G;
        }

        @Override // nu.h
        public boolean m(nu.h<?> other) {
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
            return new FunctionReferenceImpl(1, AddressSearchActivity.this, AddressSearchActivity.class, "handlePermissionsResult", "handlePermissionsResult(Ljava/util/Map;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // g.InterfaceC14146b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void a(Map<String, Boolean> p02) {
            Intrinsics.j(p02, "p0");
            AddressSearchActivity.this.N1(p02);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class g extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f111790f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ComponentActivity componentActivity) {
            super(0);
            this.f111790f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f111790f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class h extends Lambda implements Function0<g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f111791f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ComponentActivity componentActivity) {
            super(0);
            this.f111791f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final g0 invoke() {
            return this.f111791f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class i extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f111792f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f111793g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f111792f = function0;
            this.f111793g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f111792f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f111793g.getDefaultViewModelCreationExtras() : creationExtras;
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
        if (string == null || StringsKt.r0(string)) {
            query = null;
        }
        if (query != null) {
            M1().A(C.c.b.f6750a);
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence s10, int start, int count, int after) {
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LDn/C$f;", "event", "", "<anonymous>", "(LDn/C$f;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.settings.addresses.AddressSearchActivity$onCreate$6", f = "AddressSearchActivity.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class d extends SuspendLambda implements Function2<C.ViewState, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f111783a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f111784b;

        d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            d dVar = AddressSearchActivity.this.new d(continuation);
            dVar.f111784b = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C.ViewState viewState, Continuation<? super Unit> continuation) {
            return ((d) create(viewState, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f111783a == 0) {
                ResultKt.b(obj);
                C.ViewState viewState = (C.ViewState) this.f111784b;
                List listI0 = CollectionsKt.i0(viewState.c());
                int i10 = 8;
                AbstractC4201a abstractC4201a = null;
                if (!listI0.isEmpty()) {
                    AbstractC4201a abstractC4201a2 = AddressSearchActivity.this.binding;
                    if (abstractC4201a2 == null) {
                        Intrinsics.y("binding");
                        abstractC4201a2 = null;
                    }
                    Editable text = abstractC4201a2.f20457B.f20776C.getText();
                    Intrinsics.i(text, "getText(...)");
                    if (text.length() > 0) {
                        nu.l lVar = AddressSearchActivity.this.suggestionsSection;
                        if (lVar == null) {
                            Intrinsics.y("suggestionsSection");
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
                        AbstractC4201a abstractC4201a3 = AddressSearchActivity.this.binding;
                        if (abstractC4201a3 == null) {
                            Intrinsics.y("binding");
                            abstractC4201a3 = null;
                        }
                        abstractC4201a3.f20459D.scrollToPosition(0);
                        AbstractC4201a abstractC4201a4 = AddressSearchActivity.this.binding;
                        if (abstractC4201a4 == null) {
                            Intrinsics.y("binding");
                            abstractC4201a4 = null;
                        }
                        LinearLayout addManuallyLayout = abstractC4201a4.f20456A;
                        Intrinsics.i(addManuallyLayout, "addManuallyLayout");
                        if (viewState.getAllowManualAdd()) {
                            i10 = 0;
                        }
                        addManuallyLayout.setVisibility(i10);
                        AbstractC4201a abstractC4201a5 = AddressSearchActivity.this.binding;
                        if (abstractC4201a5 == null) {
                            Intrinsics.y("binding");
                        } else {
                            abstractC4201a = abstractC4201a5;
                        }
                        abstractC4201a.f20459D.announceForAccessibility(AddressSearchActivity.this.getString(C18301b.f171290p));
                    }
                } else {
                    nu.l lVar2 = AddressSearchActivity.this.suggestionsSection;
                    if (lVar2 == null) {
                        Intrinsics.y("suggestionsSection");
                        lVar2 = null;
                    }
                    lVar2.t();
                    AbstractC4201a abstractC4201a6 = AddressSearchActivity.this.binding;
                    if (abstractC4201a6 == null) {
                        Intrinsics.y("binding");
                    } else {
                        abstractC4201a = abstractC4201a6;
                    }
                    LinearLayout addManuallyLayout2 = abstractC4201a.f20456A;
                    Intrinsics.i(addManuallyLayout2, "addManuallyLayout");
                    if (viewState.getAllowManualAdd()) {
                        i10 = 0;
                    }
                    addManuallyLayout2.setVisibility(i10);
                }
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LDn/C$d;", "event", "", "<anonymous>", "(LDn/C$d;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.settings.addresses.AddressSearchActivity$onCreate$7", f = "AddressSearchActivity.kt", l = {}, m = "invokeSuspend")
    static final class e extends SuspendLambda implements Function2<C.d, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f111786a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f111787b;

        e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            e eVar = AddressSearchActivity.this.new e(continuation);
            eVar.f111787b = obj;
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C.d dVar, Continuation<? super Unit> continuation) {
            return ((e) create(dVar, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f111786a == 0) {
                ResultKt.b(obj);
                C.d dVar = (C.d) this.f111787b;
                if (dVar instanceof C.d.AddressSuggestionListSuccessEvent) {
                    uw.a.INSTANCE.a("Address Suggestion List Success", new Object[0]);
                } else if (dVar instanceof C.d.AddressAutoFillEvent) {
                    AbstractC4201a abstractC4201a = AddressSearchActivity.this.binding;
                    AbstractC4201a abstractC4201a2 = null;
                    if (abstractC4201a == null) {
                        Intrinsics.y("binding");
                        abstractC4201a = null;
                    }
                    abstractC4201a.f20457B.f20776C.getText().clear();
                    AbstractC4201a abstractC4201a3 = AddressSearchActivity.this.binding;
                    if (abstractC4201a3 == null) {
                        Intrinsics.y("binding");
                    } else {
                        abstractC4201a2 = abstractC4201a3;
                    }
                    DebouncingAutoCompleteTextView searchFieldView = abstractC4201a2.f20457B.f20776C;
                    Intrinsics.i(searchFieldView, "searchFieldView");
                    bk.d.g(searchFieldView, ((C.d.AddressAutoFillEvent) dVar).getAutoFillAddressSelection());
                } else if (dVar instanceof C.d.C0101d) {
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
                return Unit.f142422a;
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
            uw.a.INSTANCE.a("LOCATION PERMISSION GRANTED by user", new Object[0]);
        } else {
            uw.a.INSTANCE.d("LOCATION PERMISSION DENIED", new Object[0]);
        }
    }

    private final void O1() {
        LocationManager locationManager = this.locationManager;
        this.locationEnabled = locationManager != null ? C14193b.a(locationManager) : false;
    }

    @SuppressLint({"MissingPermission"})
    private final void P1(final CharSequence query) {
        InterfaceC3769c interfaceC3769c = this.fusedLocationClient;
        if (interfaceC3769c == null) {
            Intrinsics.y("fusedLocationClient");
            interfaceC3769c = null;
        }
        AbstractC5232j<Location> abstractC5232jL = interfaceC3769c.l();
        final Function1 function1 = new Function1() { // from class: com.meijer.mobile.meijer.activity.settings.addresses.n
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AddressSearchActivity.Q1(this.f111844a, query, (Location) obj);
            }
        };
        abstractC5232jL.g(new InterfaceC5229g() { // from class: com.meijer.mobile.meijer.activity.settings.addresses.o
            @Override // Td.InterfaceC5229g
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
        nu.l lVar = addressSearchActivity.suggestionsSection;
        if (lVar == null) {
            Intrinsics.y("suggestionsSection");
            lVar = null;
        }
        lVar.t();
        addressSearchActivity.M1().A(new C.c.SearchStartedAction(charSequence.toString(), latLngBoundsX));
        return Unit.f142422a;
    }

    public final void U1(LocationManager locationManager) {
        this.locationManager = locationManager;
    }

    @Override // com.meijer.mobile.meijer.activity.MeijerActivity, com.meijer.mobile.meijer.activity.Hilt_MeijerActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        AbstractC4201a abstractC4201a = this.binding;
        if (abstractC4201a == null) {
            Intrinsics.y("binding");
            abstractC4201a = null;
        }
        abstractC4201a.f20457B.f20776C.removeTextChangedListener(this);
        super.onDestroy();
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence query, int start, int before, int count) {
        if (query == null || StringsKt.r0(query)) {
            M1().A(C.c.b.f6750a);
            return;
        }
        if (C18064b.a(this, "android.permission.ACCESS_FINE_LOCATION") && this.locationEnabled) {
            P1(query);
            return;
        }
        LatLngBounds latLngBoundsX = M1().x();
        nu.l lVar = this.suggestionsSection;
        if (lVar == null) {
            Intrinsics.y("suggestionsSection");
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
        addressSearchActivity.M1().A(C.c.d.f6752a);
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AbstractC4201a abstractC4201aK0 = AbstractC4201a.K0(getLayoutInflater());
        this.binding = abstractC4201aK0;
        if (abstractC4201aK0 == null) {
            Intrinsics.y("binding");
            abstractC4201aK0 = null;
        }
        setContentView(Zr.a.j(abstractC4201aK0.getRoot(), false, 1, null));
        AbstractC4201a abstractC4201a = this.binding;
        if (abstractC4201a == null) {
            Intrinsics.y("binding");
            abstractC4201a = null;
        }
        Zr.a.g(abstractC4201a.f20459D, false, 1, null);
        AbstractC4201a abstractC4201a2 = this.binding;
        if (abstractC4201a2 == null) {
            Intrinsics.y("binding");
            abstractC4201a2 = null;
        }
        Zr.a.g(abstractC4201a2.f20457B.f20776C, false, 1, null);
        this.fusedLocationClient = C3778l.a(this);
        O1();
        L1();
        AbstractC4201a abstractC4201a3 = this.binding;
        if (abstractC4201a3 == null) {
            Intrinsics.y("binding");
            abstractC4201a3 = null;
        }
        abstractC4201a3.f20457B.f20776C.requestFocus();
        AbstractC4201a abstractC4201a4 = this.binding;
        if (abstractC4201a4 == null) {
            Intrinsics.y("binding");
            abstractC4201a4 = null;
        }
        abstractC4201a4.f20460z.setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.settings.addresses.p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AddressSearchActivity.S1(this.f111847a, view);
            }
        });
        nu.l lVar = new nu.l();
        lVar.O(true);
        lVar.M(new a());
        this.suggestionsSection = lVar;
        AbstractC4201a abstractC4201a5 = this.binding;
        if (abstractC4201a5 == null) {
            Intrinsics.y("binding");
            abstractC4201a5 = null;
        }
        abstractC4201a5.f20457B.f20775B.setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.settings.addresses.q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AddressSearchActivity.T1(this.f111848a, view);
            }
        });
        C15949d<nu.g> c15949d = new C15949d<>();
        nu.l lVar2 = this.suggestionsSection;
        if (lVar2 == null) {
            Intrinsics.y("suggestionsSection");
            lVar2 = null;
        }
        c15949d.c(lVar2);
        this.suggestionsAdapter = c15949d;
        AbstractC4201a abstractC4201a6 = this.binding;
        if (abstractC4201a6 == null) {
            Intrinsics.y("binding");
            abstractC4201a6 = null;
        }
        RecyclerView recyclerView = abstractC4201a6.f20459D;
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        C15949d<nu.g> c15949d2 = this.suggestionsAdapter;
        if (c15949d2 == null) {
            Intrinsics.y("suggestionsAdapter");
            c15949d2 = null;
        }
        recyclerView.setAdapter(c15949d2);
        recyclerView.addItemDecoration(new androidx.recyclerview.widget.i(this, 1));
        AbstractC4201a abstractC4201a7 = this.binding;
        if (abstractC4201a7 == null) {
            Intrinsics.y("binding");
            abstractC4201a7 = null;
        }
        abstractC4201a7.f20457B.f20776C.addTextChangedListener(this);
        C17154h.J(C17154h.O(M1().y(), new d(null)), C6031t.a(this));
        C17154h.J(C17154h.O(M1().getEvents(), new e(null)), C6031t.a(this));
    }

    @Override // com.meijer.mobile.meijer.activity.MeijerActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        O1();
        AbstractC4201a abstractC4201a = null;
        if (this.shouldClearSearchTextUponReturn) {
            this.shouldClearSearchTextUponReturn = false;
            AbstractC4201a abstractC4201a2 = this.binding;
            if (abstractC4201a2 == null) {
                Intrinsics.y("binding");
            } else {
                abstractC4201a = abstractC4201a2;
            }
            abstractC4201a.f20457B.f20776C.getText().clear();
            return;
        }
        AbstractC4201a abstractC4201a3 = this.binding;
        if (abstractC4201a3 == null) {
            Intrinsics.y("binding");
        } else {
            abstractC4201a = abstractC4201a3;
        }
        AbstractC4255l0 abstractC4255l0 = abstractC4201a.f20457B;
        DebouncingAutoCompleteTextView debouncingAutoCompleteTextView = abstractC4255l0.f20776C;
        debouncingAutoCompleteTextView.setText(debouncingAutoCompleteTextView.getText());
        DebouncingAutoCompleteTextView debouncingAutoCompleteTextView2 = abstractC4255l0.f20776C;
        debouncingAutoCompleteTextView2.setSelection(debouncingAutoCompleteTextView2.length());
        Intrinsics.g(abstractC4255l0);
    }
}
