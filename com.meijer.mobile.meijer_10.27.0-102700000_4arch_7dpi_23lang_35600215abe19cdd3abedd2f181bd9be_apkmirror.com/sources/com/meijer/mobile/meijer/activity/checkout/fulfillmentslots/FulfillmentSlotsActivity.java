package com.meijer.mobile.meijer.activity.checkout.fulfillmentslots;

import Ji.LocalThemeScope;
import V2.CreationExtras;
import ak.AbstractC5607a;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.C5892t0;
import androidx.compose.ui.platform.W1;
import androidx.view.ComponentActivity;
import androidx.view.f0;
import com.fullstory.FS;
import com.meijer.mobile.meijer.activity.checkout.contactinformation.DeliveryContactInformationFormActivity;
import com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.FulfillmentSlotsActivity;
import com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.q1;
import com.meijer.mobile.meijer.activity.checkout.pickupperson.PickupPersonFormActivity;
import com.meijer.mobile.meijer.activity.checkout.review.CheckoutActivity;
import e.C13588d;
import e.C13589e;
import j0.InterfaceC14812d;
import java.util.List;
import kotlin.C17891L0;
import kotlin.C17893M0;
import kotlin.EnumC17895N0;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import li.C15417h;
import p1.C16193g;
import qv.C16648k;
import qv.InterfaceC16622O;
import tr.C17135b;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 %2\u00020\u0001:\u0002&'B\u0007¢\u0006\u0004\b\u0002\u0010\u0003Jc\u0010\u0010\u001a\u00020\t*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t0\u00072\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0012\u0010\u0003J\u0017\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0018\u001a\u00020\t2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\tH\u0014¢\u0006\u0004\b\u001a\u0010\u0003R\u001b\u0010 \u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010$\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006)²\u0006\u0010\u0010(\u001a\u0004\u0018\u00010\b8\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/FulfillmentSlotsActivity;", "Lcom/meijer/mobile/meijer/activity/MeijerActivity;", "<init>", "()V", "LJi/M;", "Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/E1;", "viewState", "Lkotlin/Function1;", "Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/a;", "", "onOpenSheet", "", "onTimeSlotSetCanProceedToNextStepInCheckout", "isTimeslotRedesigned", "isBopasEnabled", "isBunchaEnabled", "H1", "(LJi/M;Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/E1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZZZLandroidx/compose/runtime/Composer;II)V", "T1", "isBopasSlot", "S1", "(Z)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/q1;", "s", "Lkotlin/Lazy;", "R1", "()Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/q1;", "viewModel", "Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/FulfillmentSlotsActivity$b;", "t", "Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/FulfillmentSlotsActivity$b;", "activityExtra", "u", "a", "b", "bottomSheetType", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class FulfillmentSlotsActivity extends Hilt_FulfillmentSlotsActivity {

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: v, reason: collision with root package name */
    public static final int f102605v = 8;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final Lazy viewModel = new androidx.view.e0(Reflection.b(q1.class), new f(this), new e(this), new g(null, this));

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private FulfillmentSlotsActivityExtras activityExtra;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/FulfillmentSlotsActivity$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/FulfillmentSlotsActivity$b;", "extras", "Landroid/content/Intent;", "a", "(Landroid/content/Context;Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/FulfillmentSlotsActivity$b;)Landroid/content/Intent;", "", "EXTRA_TIME_SLOTS", "Ljava/lang/String;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.FulfillmentSlotsActivity$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ Intent b(Companion companion, Context context, FulfillmentSlotsActivityExtras fulfillmentSlotsActivityExtras, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                boolean z10 = false;
                fulfillmentSlotsActivityExtras = new FulfillmentSlotsActivityExtras(z10, z10, 3, null);
            }
            return companion.a(context, fulfillmentSlotsActivityExtras);
        }

        @JvmStatic
        public final Intent a(Context context, FulfillmentSlotsActivityExtras extras) {
            Intrinsics.j(context, "context");
            Intrinsics.j(extras, "extras");
            Intent intentPutExtra = new Intent(context, (Class<?>) FulfillmentSlotsActivity.class).putExtra("com.meijer.mobile.meijer.activity.checkout.timeslots.EXTRA_TIME_SLOTS", extras);
            Intrinsics.i(intentPutExtra, "putExtra(...)");
            return intentPutExtra;
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ$\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ\u001a\u0010\u0018\u001a\u00020\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/FulfillmentSlotsActivity$b;", "Landroid/os/Parcelable;", "", "isEditMode", "hasSelectedTimeSlot", "<init>", "(ZZ)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "a", "(ZZ)Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/FulfillmentSlotsActivity$b;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "d", "()Z", "b", "c", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.FulfillmentSlotsActivity$b, reason: from toString */
    public static final /* data */ class FulfillmentSlotsActivityExtras implements Parcelable {
        public static final Parcelable.Creator<FulfillmentSlotsActivityExtras> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isEditMode;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean hasSelectedTimeSlot;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.FulfillmentSlotsActivity$b$a */
        public static final class a implements Parcelable.Creator<FulfillmentSlotsActivityExtras> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final FulfillmentSlotsActivityExtras createFromParcel(Parcel parcel) {
                Intrinsics.j(parcel, "parcel");
                return new FulfillmentSlotsActivityExtras(parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final FulfillmentSlotsActivityExtras[] newArray(int i10) {
                return new FulfillmentSlotsActivityExtras[i10];
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public FulfillmentSlotsActivityExtras() {
            boolean z10 = false;
            this(z10, z10, 3, null);
        }

        public static /* synthetic */ FulfillmentSlotsActivityExtras b(FulfillmentSlotsActivityExtras fulfillmentSlotsActivityExtras, boolean z10, boolean z11, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = fulfillmentSlotsActivityExtras.isEditMode;
            }
            if ((i10 & 2) != 0) {
                z11 = fulfillmentSlotsActivityExtras.hasSelectedTimeSlot;
            }
            return fulfillmentSlotsActivityExtras.a(z10, z11);
        }

        public final FulfillmentSlotsActivityExtras a(boolean isEditMode, boolean hasSelectedTimeSlot) {
            return new FulfillmentSlotsActivityExtras(isEditMode, hasSelectedTimeSlot);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FulfillmentSlotsActivityExtras)) {
                return false;
            }
            FulfillmentSlotsActivityExtras fulfillmentSlotsActivityExtras = (FulfillmentSlotsActivityExtras) other;
            return this.isEditMode == fulfillmentSlotsActivityExtras.isEditMode && this.hasSelectedTimeSlot == fulfillmentSlotsActivityExtras.hasSelectedTimeSlot;
        }

        public int hashCode() {
            return (Boolean.hashCode(this.isEditMode) * 31) + Boolean.hashCode(this.hasSelectedTimeSlot);
        }

        public String toString() {
            return "FulfillmentSlotsActivityExtras(isEditMode=" + this.isEditMode + ", hasSelectedTimeSlot=" + this.hasSelectedTimeSlot + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.j(dest, "dest");
            dest.writeInt(this.isEditMode ? 1 : 0);
            dest.writeInt(this.hasSelectedTimeSlot ? 1 : 0);
        }

        public FulfillmentSlotsActivityExtras(boolean z10, boolean z11) {
            this.isEditMode = z10;
            this.hasSelectedTimeSlot = z11;
        }

        /* renamed from: c, reason: from getter */
        public final boolean getHasSelectedTimeSlot() {
            return this.hasSelectedTimeSlot;
        }

        /* renamed from: d, reason: from getter */
        public final boolean getIsEditMode() {
            return this.isEditMode;
        }

        public /* synthetic */ FulfillmentSlotsActivityExtras(boolean z10, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class c extends FunctionReferenceImpl implements Function0<Unit> {
        c(Object obj) {
            super(0, obj, FulfillmentSlotsActivity.class, "updateActivityExtra", "updateActivityExtra()V", 0);
        }

        public final void a() {
            ((FulfillmentSlotsActivity) this.receiver).T1();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class d implements Function2<Composer, Integer, Unit> {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function0<qv.C0> f102611a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ FulfillmentSlotsActivity f102612b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C17893M0 f102613c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC5730l0<EnumC11823a> f102614d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ List<BottomSheetContentDecorator> f102615e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ androidx.compose.runtime.z1<FulfillmentSlotsViewState> f102616f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ InterfaceC16622O f102617g;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.FulfillmentSlotsActivity$d$a$a, reason: collision with other inner class name */
            static final class C1448a implements Function3<InterfaceC14812d, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ boolean f102618a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f102619b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ List<BottomSheetContentDecorator> f102620c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ androidx.compose.runtime.z1<FulfillmentSlotsViewState> f102621d;

                C1448a(boolean z10, LocalThemeScope localThemeScope, List<BottomSheetContentDecorator> list, androidx.compose.runtime.z1<FulfillmentSlotsViewState> z1Var) {
                    this.f102618a = z10;
                    this.f102619b = localThemeScope;
                    this.f102620c = list;
                    this.f102621d = z1Var;
                }

                public final void a(InterfaceC14812d AcresBottomSheet, Composer composer, int i10) {
                    Intrinsics.j(AcresBottomSheet, "$this$AcresBottomSheet");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(2045901977, i10, -1, "com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.FulfillmentSlotsActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (FulfillmentSlotsActivity.kt:165)");
                    }
                    if (this.f102618a) {
                        composer.startReplaceGroup(-415050538);
                        Am.p0.b(this.f102619b, null, d.o(this.f102621d).B(), composer, LocalThemeScope.f15770g, 1);
                        composer.P();
                    } else {
                        composer.startReplaceGroup(-414835429);
                        C11851k.h(this.f102619b, null, this.f102620c, composer, LocalThemeScope.f15770g, 1);
                        composer.P();
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14812d interfaceC14812d, Composer composer, Integer num) {
                    a(interfaceC14812d, composer, num.intValue());
                    return Unit.f142422a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            static final class b implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ FulfillmentSlotsActivity f102622a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f102623b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ InterfaceC16622O f102624c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ C17893M0 f102625d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ androidx.compose.runtime.z1<FulfillmentSlotsViewState> f102626e;

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ InterfaceC5730l0<EnumC11823a> f102627f;

                b(FulfillmentSlotsActivity fulfillmentSlotsActivity, LocalThemeScope localThemeScope, InterfaceC16622O interfaceC16622O, C17893M0 c17893m0, androidx.compose.runtime.z1<FulfillmentSlotsViewState> z1Var, InterfaceC5730l0<EnumC11823a> interfaceC5730l0) {
                    this.f102622a = fulfillmentSlotsActivity;
                    this.f102623b = localThemeScope;
                    this.f102624c = interfaceC16622O;
                    this.f102625d = c17893m0;
                    this.f102626e = z1Var;
                    this.f102627f = interfaceC5730l0;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit d(InterfaceC16622O interfaceC16622O, C17893M0 c17893m0, InterfaceC5730l0 interfaceC5730l0, EnumC11823a sheetType) {
                    Intrinsics.j(sheetType, "sheetType");
                    d.r(interfaceC16622O, c17893m0, interfaceC5730l0, sheetType);
                    return Unit.f142422a;
                }

                public final void c(Composer composer, int i10) {
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(841492118, i10, -1, "com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.FulfillmentSlotsActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (FulfillmentSlotsActivity.kt:177)");
                    }
                    FulfillmentSlotsActivity fulfillmentSlotsActivity = this.f102622a;
                    LocalThemeScope localThemeScope = this.f102623b;
                    FulfillmentSlotsViewState fulfillmentSlotsViewStateO = d.o(this.f102626e);
                    composer.startReplaceGroup(-1746271574);
                    boolean zD = composer.D(this.f102624c) | composer.D(this.f102625d);
                    final InterfaceC16622O interfaceC16622O = this.f102624c;
                    final C17893M0 c17893m0 = this.f102625d;
                    final InterfaceC5730l0<EnumC11823a> interfaceC5730l0 = this.f102627f;
                    Object objB = composer.B();
                    if (zD || objB == Composer.INSTANCE.a()) {
                        objB = new Function1() { // from class: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.g0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return FulfillmentSlotsActivity.d.a.b.d(interfaceC16622O, c17893m0, interfaceC5730l0, (EnumC11823a) obj);
                            }
                        };
                        composer.t(objB);
                    }
                    Function1 function1 = (Function1) objB;
                    composer.P();
                    composer.startReplaceGroup(5004770);
                    boolean zD2 = composer.D(this.f102622a);
                    final FulfillmentSlotsActivity fulfillmentSlotsActivity2 = this.f102622a;
                    Object objB2 = composer.B();
                    if (zD2 || objB2 == Composer.INSTANCE.a()) {
                        objB2 = new Function1() { // from class: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.h0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return FulfillmentSlotsActivity.d.a.b.e(fulfillmentSlotsActivity2, ((Boolean) obj).booleanValue());
                            }
                        };
                        composer.t(objB2);
                    }
                    composer.P();
                    fulfillmentSlotsActivity.H1(localThemeScope, fulfillmentSlotsViewStateO, function1, (Function1) objB2, false, false, false, composer, LocalThemeScope.f15770g, 56);
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
                public static final Unit e(FulfillmentSlotsActivity fulfillmentSlotsActivity, boolean z10) {
                    fulfillmentSlotsActivity.S1(z10);
                    return Unit.f142422a;
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            a(Function0<? extends qv.C0> function0, FulfillmentSlotsActivity fulfillmentSlotsActivity, C17893M0 c17893m0, InterfaceC5730l0<EnumC11823a> interfaceC5730l0, List<BottomSheetContentDecorator> list, androidx.compose.runtime.z1<FulfillmentSlotsViewState> z1Var, InterfaceC16622O interfaceC16622O) {
                this.f102611a = function0;
                this.f102612b = fulfillmentSlotsActivity;
                this.f102613c = c17893m0;
                this.f102614d = interfaceC5730l0;
                this.f102615e = list;
                this.f102616f = z1Var;
                this.f102617g = interfaceC16622O;
            }

            public final void d(LocalThemeScope AdsTheme, Composer composer, int i10) {
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
                    ComposerKt.U(-1009902442, i11, -1, "com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.FulfillmentSlotsActivity.onCreate.<anonymous>.<anonymous> (FulfillmentSlotsActivity.kt:135)");
                }
                final boolean z10 = d.k(this.f102614d) == EnumC11823a.f102868a;
                String strC = C16193g.c(z10 ? C17135b.f162010a0 : com.meijer.mobile.meijer.Y.f99480B6, composer, 0);
                composer.startReplaceGroup(146376747);
                Function0 function0 = null;
                String strC2 = z10 ? C16193g.c(C17135b.f162008Z, composer, 0) : null;
                composer.P();
                String strC3 = C16193g.c(z10 ? C17135b.f162007Y : C17135b.f162005W, composer, 0);
                composer.startReplaceGroup(146398223);
                String strC4 = z10 ? C16193g.c(C17135b.f162006X, composer, 0) : null;
                composer.P();
                composer.startReplaceGroup(146403570);
                if (z10) {
                    composer.startReplaceGroup(-1633490746);
                    boolean zV = composer.V(this.f102611a) | composer.D(this.f102612b);
                    final Function0<qv.C0> function02 = this.f102611a;
                    final FulfillmentSlotsActivity fulfillmentSlotsActivity = this.f102612b;
                    Object objB = composer.B();
                    if (zV || objB == Composer.INSTANCE.a()) {
                        objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.d0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return FulfillmentSlotsActivity.d.a.e(function02, fulfillmentSlotsActivity);
                            }
                        };
                        composer.t(objB);
                    }
                    function0 = (Function0) objB;
                    composer.P();
                }
                Function0 function03 = function0;
                composer.P();
                composer.startReplaceGroup(146431180);
                float fP = !z10 ? H1.h.p((int) (((W1) composer.o(C5892t0.u())).a() & 4294967295L)) : H1.h.INSTANCE.c();
                composer.P();
                C17893M0 c17893m0 = this.f102613c;
                composer.startReplaceGroup(-1746271574);
                boolean zV2 = composer.V(this.f102611a) | composer.a(z10) | composer.D(this.f102612b);
                final Function0<qv.C0> function04 = this.f102611a;
                final FulfillmentSlotsActivity fulfillmentSlotsActivity2 = this.f102612b;
                Object objB2 = composer.B();
                if (zV2 || objB2 == Composer.INSTANCE.a()) {
                    objB2 = new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.e0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return FulfillmentSlotsActivity.d.a.f(function04, z10, fulfillmentSlotsActivity2);
                        }
                    };
                    composer.t(objB2);
                }
                Function0 function05 = (Function0) objB2;
                composer.P();
                composer.startReplaceGroup(5004770);
                boolean zV3 = composer.V(this.f102611a);
                final Function0<qv.C0> function06 = this.f102611a;
                Object objB3 = composer.B();
                if (zV3 || objB3 == Composer.INSTANCE.a()) {
                    objB3 = new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.f0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return FulfillmentSlotsActivity.d.a.g(function06);
                        }
                    };
                    composer.t(objB3);
                }
                composer.P();
                C15417h.j(AdsTheme, null, c17893m0, strC, strC2, strC3, strC4, function05, function03, null, (Function0) objB3, false, 0.0f, 0.0f, fP, ComposableLambdaKt.c(2045901977, true, new C1448a(z10, AdsTheme, this.f102615e, this.f102616f), composer, 54), false, ComposableLambdaKt.c(841492118, true, new b(this.f102612b, AdsTheme, this.f102617g, this.f102613c, this.f102616f, this.f102614d), composer, 54), composer, LocalThemeScope.f15770g | (i11 & 14) | (C17893M0.f167209e << 6), 12779520, 40193);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
                d(localThemeScope, composer, num.intValue());
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit e(Function0 function0, FulfillmentSlotsActivity fulfillmentSlotsActivity) {
                function0.invoke();
                fulfillmentSlotsActivity.R1().e0(q1.g.C1457g.f103080a);
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit f(Function0 function0, boolean z10, FulfillmentSlotsActivity fulfillmentSlotsActivity) {
                function0.invoke();
                if (z10) {
                    fulfillmentSlotsActivity.R1().e0(q1.g.e.f103078a);
                }
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit g(Function0 function0) {
                function0.invoke();
                return Unit.f142422a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.FulfillmentSlotsActivity$onCreate$2$closeSheet$1$1$1", f = "FulfillmentSlotsActivity.kt", l = {124}, m = "invokeSuspend")
        static final class b extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f102628a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C17893M0 f102629b;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new b(this.f102629b, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(C17893M0 c17893m0, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f102629b = c17893m0;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((b) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f102628a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    C17893M0 c17893m0 = this.f102629b;
                    this.f102628a = 1;
                    if (c17893m0.i(this) == objF) {
                        return objF;
                    }
                }
                return Unit.f142422a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.FulfillmentSlotsActivity$onCreate$2$openSheet$1", f = "FulfillmentSlotsActivity.kt", l = {118}, m = "invokeSuspend")
        static final class c extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f102630a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ EnumC11823a f102631b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C17893M0 f102632c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC5730l0<EnumC11823a> f102633d;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new c(this.f102631b, this.f102632c, this.f102633d, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(EnumC11823a enumC11823a, C17893M0 c17893m0, InterfaceC5730l0<EnumC11823a> interfaceC5730l0, Continuation<? super c> continuation) {
                super(2, continuation);
                this.f102631b = enumC11823a;
                this.f102632c = c17893m0;
                this.f102633d = interfaceC5730l0;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((c) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f102630a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    d.l(this.f102633d, this.f102631b);
                    C17893M0 c17893m0 = this.f102632c;
                    this.f102630a = 1;
                    if (c17893m0.l(this) == objF) {
                        return objF;
                    }
                }
                return Unit.f142422a;
            }
        }

        d() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void r(InterfaceC16622O interfaceC16622O, C17893M0 c17893m0, InterfaceC5730l0<EnumC11823a> interfaceC5730l0, EnumC11823a enumC11823a) {
            C16648k.d(interfaceC16622O, null, null, new c(enumC11823a, c17893m0, interfaceC5730l0, null), 3, null);
        }

        public final void g(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(121705413, i10, -1, "com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.FulfillmentSlotsActivity.onCreate.<anonymous> (FulfillmentSlotsActivity.kt:72)");
            }
            AbstractC5607a.Companion companion = AbstractC5607a.INSTANCE;
            List listP = CollectionsKt.p(new BottomSheetContentDecorator(companion.d(com.meijer.mobile.meijer.Y.f99461A6, new Object[0]), CollectionsKt.p(new ContentRowData(com.meijer.mobile.meijer.Y.f99764Q5, Integer.valueOf(com.meijer.mobile.meijer.S.f98733l)), new ContentRowData(com.meijer.mobile.meijer.Y.f99783R5, Integer.valueOf(com.meijer.mobile.meijer.S.f98732k0)))), new BottomSheetContentDecorator(companion.d(com.meijer.mobile.meijer.Y.f100434y6, new Object[0]), CollectionsKt.p(new ContentRowData(com.meijer.mobile.meijer.Y.f100003ce, Integer.valueOf(com.meijer.mobile.meijer.S.f98733l)), new ContentRowData(com.meijer.mobile.meijer.Y.f100023de, Integer.valueOf(com.meijer.mobile.meijer.S.f98735m)), new ContentRowData(com.meijer.mobile.meijer.Y.f100043ee, Integer.valueOf(com.meijer.mobile.meijer.S.f98737n)))));
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            Composer.Companion companion2 = Composer.INSTANCE;
            if (objB == companion2.a()) {
                objB = androidx.compose.runtime.t1.e(EnumC11823a.f102869b, null, 2, null);
                composer.t(objB);
            }
            InterfaceC5730l0 interfaceC5730l0 = (InterfaceC5730l0) objB;
            composer.P();
            composer.startReplaceGroup(1849434622);
            FulfillmentSlotsActivity fulfillmentSlotsActivity = FulfillmentSlotsActivity.this;
            Object objB2 = composer.B();
            if (objB2 == companion2.a()) {
                objB2 = fulfillmentSlotsActivity.R1().a0().c();
                composer.t(objB2);
            }
            composer.P();
            androidx.compose.runtime.z1 z1VarB = androidx.compose.runtime.o1.b((tv.P) objB2, null, composer, 0, 1);
            Object objB3 = composer.B();
            if (objB3 == companion2.a()) {
                objB3 = androidx.compose.runtime.J.k(EmptyCoroutineContext.f142646a, composer);
                composer.t(objB3);
            }
            final InterfaceC16622O interfaceC16622O = (InterfaceC16622O) objB3;
            final C17893M0 c17893m0J = C17891L0.j(EnumC17895N0.f167226a, null, null, true, composer, 3078, 6);
            composer.startReplaceGroup(-1746271574);
            boolean zD = composer.D(FulfillmentSlotsActivity.this) | composer.D(interfaceC16622O) | composer.D(c17893m0J);
            final FulfillmentSlotsActivity fulfillmentSlotsActivity2 = FulfillmentSlotsActivity.this;
            Object objB4 = composer.B();
            if (zD || objB4 == companion2.a()) {
                objB4 = new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.b0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return FulfillmentSlotsActivity.d.p(fulfillmentSlotsActivity2, interfaceC16622O, c17893m0J);
                    }
                };
                composer.t(objB4);
            }
            final Function0 function0 = (Function0) objB4;
            composer.P();
            composer.startReplaceGroup(-1746271574);
            boolean zD2 = composer.D(c17893m0J) | composer.V(function0) | composer.D(FulfillmentSlotsActivity.this);
            final FulfillmentSlotsActivity fulfillmentSlotsActivity3 = FulfillmentSlotsActivity.this;
            Object objB5 = composer.B();
            if (zD2 || objB5 == companion2.a()) {
                objB5 = new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.c0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return FulfillmentSlotsActivity.d.q(c17893m0J, function0, fulfillmentSlotsActivity3);
                    }
                };
                composer.t(objB5);
            }
            composer.P();
            C13588d.a(false, (Function0) objB5, composer, 0, 1);
            Ji.K.b(null, ComposableLambdaKt.c(-1009902442, true, new a(function0, FulfillmentSlotsActivity.this, c17893m0J, interfaceC5730l0, listP, z1VarB, interfaceC16622O), composer, 54), composer, 48, 1);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            g(composer, num.intValue());
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final EnumC11823a k(InterfaceC5730l0<EnumC11823a> interfaceC5730l0) {
            return interfaceC5730l0.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void l(InterfaceC5730l0<EnumC11823a> interfaceC5730l0, EnumC11823a enumC11823a) {
            interfaceC5730l0.setValue(enumC11823a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final FulfillmentSlotsViewState o(androidx.compose.runtime.z1<FulfillmentSlotsViewState> z1Var) {
            return z1Var.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final qv.C0 p(FulfillmentSlotsActivity fulfillmentSlotsActivity, InterfaceC16622O interfaceC16622O, C17893M0 c17893m0) {
            Ds.p.d(fulfillmentSlotsActivity.getWindow());
            return C16648k.d(interfaceC16622O, null, null, new b(c17893m0, null), 3, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit q(C17893M0 c17893m0, Function0 function0, FulfillmentSlotsActivity fulfillmentSlotsActivity) {
            if (c17893m0.k()) {
                function0.invoke();
            } else {
                fulfillmentSlotsActivity.finish();
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class e extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f102634f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ComponentActivity componentActivity) {
            super(0);
            this.f102634f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f102634f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class f extends Lambda implements Function0<androidx.view.g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f102635f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ComponentActivity componentActivity) {
            super(0);
            this.f102635f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.view.g0 invoke() {
            return this.f102635f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class g extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f102636f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f102637g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f102636f = function0;
            this.f102637g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f102636f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f102637g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:113:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:171:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void H1(final Ji.LocalThemeScope r22, final com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.FulfillmentSlotsViewState r23, kotlin.jvm.functions.Function1<? super com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.EnumC11823a, kotlin.Unit> r24, final kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r25, boolean r26, boolean r27, boolean r28, androidx.compose.runtime.Composer r29, final int r30, final int r31) {
        /*
            Method dump skipped, instructions count: 712
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.FulfillmentSlotsActivity.H1(Ji.M, com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.E1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, boolean, boolean, boolean, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit I1(FulfillmentSlotsActivity fulfillmentSlotsActivity, LocalThemeScope localThemeScope, FulfillmentSlotsViewState fulfillmentSlotsViewState, Function1 function1, Function1 function12, boolean z10, boolean z11, boolean z12, int i10, int i11, Composer composer, int i12) {
        fulfillmentSlotsActivity.H1(localThemeScope, fulfillmentSlotsViewState, function1, function12, z10, z11, z12, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J1(EnumC11823a it) {
        Intrinsics.j(it, "it");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit K1(Function1 function1) {
        function1.invoke(EnumC11823a.f102869b);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit L1(Function1 function1) {
        function1.invoke(EnumC11823a.f102868a);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final q1 R1() {
        return (q1) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S1(boolean isBopasSlot) {
        Intent intentB;
        if (this.activityExtra.getIsEditMode()) {
            intentB = CheckoutActivity.Companion.b(CheckoutActivity.INSTANCE, this, null, 2, null);
        } else {
            if (!Intrinsics.e(R1().a0().c().getValue().getFulfillmentMode(), "delivery")) {
                intentB = PickupPersonFormActivity.Companion.b(PickupPersonFormActivity.INSTANCE, this, false, isBopasSlot, 2, null);
                startActivity(intentB);
            }
            intentB = DeliveryContactInformationFormActivity.Companion.b(DeliveryContactInformationFormActivity.INSTANCE, this, false, 2, null);
        }
        startActivity(intentB);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T1() {
        this.activityExtra = FulfillmentSlotsActivityExtras.b(this.activityExtra, false, false, 1, null);
    }

    public FulfillmentSlotsActivity() {
        boolean z10 = false;
        this.activityExtra = new FulfillmentSlotsActivityExtras(z10, z10, 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit M1(FulfillmentSlotsActivity fulfillmentSlotsActivity) {
        fulfillmentSlotsActivity.finishAfterTransition();
        return Unit.f142422a;
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        Parcelable parcelable;
        super.onCreate(savedInstanceState);
        getLifecycle().a(R1());
        Intent intent = getIntent();
        if (intent != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) intent.getParcelableExtra("com.meijer.mobile.meijer.activity.checkout.timeslots.EXTRA_TIME_SLOTS", FulfillmentSlotsActivityExtras.class);
            } else {
                Parcelable parcelableExtra = intent.getParcelableExtra("com.meijer.mobile.meijer.activity.checkout.timeslots.EXTRA_TIME_SLOTS");
                if (!(parcelableExtra instanceof FulfillmentSlotsActivityExtras)) {
                    parcelableExtra = null;
                }
                parcelable = (FulfillmentSlotsActivityExtras) parcelableExtra;
            }
            FulfillmentSlotsActivityExtras fulfillmentSlotsActivityExtras = (FulfillmentSlotsActivityExtras) parcelable;
            if (fulfillmentSlotsActivityExtras != null) {
                this.activityExtra = fulfillmentSlotsActivityExtras;
            }
        }
        C13589e.b(this, null, ComposableLambdaKt.composableLambdaInstance(121705413, true, new d()), 1, null);
    }

    @Override // com.meijer.mobile.meijer.activity.MeijerActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        FS.page("Checkout | Select Time slot").start();
    }
}
