package com.meijer.mobile.meijer.activity.orderoptions.fulfillmentslots;

import Bm.FulfillmentSlotDayDecorator;
import Bm.FulfillmentSlotTimeDecorator;
import Mn.AbstractC4297w;
import Mn.J1;
import Mn.J2;
import Mn.P1;
import Mn.Z0;
import V2.CreationExtras;
import ae.C5597b;
import ak.AbstractC5607a;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C6031t;
import androidx.view.ComponentActivity;
import androidx.view.e0;
import androidx.view.f0;
import androidx.view.g0;
import b2.C6187h;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;
import com.meijer.mobile.core.design.widget.calloutview.CalloutView;
import com.meijer.mobile.meijer.Q;
import com.meijer.mobile.meijer.S;
import com.meijer.mobile.meijer.V;
import com.meijer.mobile.meijer.Y;
import com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.FulfillmentSlotsViewState;
import com.meijer.mobile.meijer.activity.orderoptions.fulfillmentslots.OrderOptionsFulfillmentSlotsActivity;
import com.meijer.mobile.meijer.activity.orderoptions.fulfillmentslots.n;
import com.meijer.mobile.ui.legacy.progressview.ProgressView;
import is.C14760b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import nu.C15949d;
import ou.AbstractC16177a;
import tv.C17154h;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 92\u00020\u00012\u00020\u0002:\u0003:;<B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\tJ\u0019\u0010\r\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0018\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001c\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\"\u0010\u001cR\u0016\u0010'\u001a\u00020$8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010)\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010 R\u001c\u0010+\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b*\u0010\u001cR\u001c\u0010-\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b,\u0010\u001cR\u0016\u00101\u001a\u00020.8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00103\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010 R\u0014\u00105\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010 R\u0014\u00108\u001a\u0002068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u00107¨\u0006="}, d2 = {"Lcom/meijer/mobile/meijer/activity/orderoptions/fulfillmentslots/OrderOptionsFulfillmentSlotsActivity;", "Lcom/meijer/mobile/meijer/activity/MeijerActivity;", "LAj/b;", "<init>", "()V", "Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/E1;", "viewState", "", "J1", "(Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/E1;)V", "K1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "LMn/w;", "s", "LMn/w;", "binding", "Lcom/meijer/mobile/meijer/activity/orderoptions/fulfillmentslots/n;", "t", "Lkotlin/Lazy;", "L1", "()Lcom/meijer/mobile/meijer/activity/orderoptions/fulfillmentslots/n;", "orderOptionsFulfillmentSlotsViewModel", "Lnu/d;", "Lnu/g;", "u", "Lnu/d;", "timeSlotsAdapter", "Lnu/l;", "v", "Lnu/l;", "timeSlotsSection", "w", "daysAdapter", "Landroidx/recyclerview/widget/LinearLayoutManager;", "x", "Landroidx/recyclerview/widget/LinearLayoutManager;", "daysLayoutManager", "y", "daysCarouselSection", "z", "readOnlyMorningTimeSlotsAdapter", "A", "readOnlyAfternoonTimeSlotsAdapter", "Landroidx/recyclerview/widget/GridLayoutManager;", "B", "Landroidx/recyclerview/widget/GridLayoutManager;", "readOnlyTimeSlotsLayoutManager", "C", "readOnlyMorningTimeSlotsSection", "D", "readOnlyAfternoonTimeSlotsSection", "Landroidx/appcompat/widget/Toolbar;", "()Landroidx/appcompat/widget/Toolbar;", "toolbar", "E", "c", "b", "a", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class OrderOptionsFulfillmentSlotsActivity extends Hilt_OrderOptionsFulfillmentSlotsActivity implements Aj.b {

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: F, reason: collision with root package name */
    public static final int f109884F = 8;

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    private C15949d<nu.g> readOnlyAfternoonTimeSlotsAdapter;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private GridLayoutManager readOnlyTimeSlotsLayoutManager;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private AbstractC4297w binding;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private C15949d<nu.g> timeSlotsAdapter;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private C15949d<nu.g> daysAdapter;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private LinearLayoutManager daysLayoutManager;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private C15949d<nu.g> readOnlyMorningTimeSlotsAdapter;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final Lazy orderOptionsFulfillmentSlotsViewModel = new e0(Reflection.b(n.class), new f(this), new e(this), new g(null, this));

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final nu.l timeSlotsSection = new nu.l();

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final nu.l daysCarouselSection = new nu.l();

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private final nu.l readOnlyMorningTimeSlotsSection = new nu.l();

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private final nu.l readOnlyAfternoonTimeSlotsSection = new nu.l();

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/orderoptions/fulfillmentslots/OrderOptionsFulfillmentSlotsActivity$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "deliveryMode", "Lcom/meijer/mobile/meijer/activity/orderoptions/fulfillmentslots/a;", "fulfillmentStateDetails", "Landroid/content/Intent;", "a", "(Landroid/content/Context;Ljava/lang/String;Lcom/meijer/mobile/meijer/activity/orderoptions/fulfillmentslots/a;)Landroid/content/Intent;", "EXTRA_FULFILLMENT_DETAILS", "Ljava/lang/String;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.orderoptions.fulfillmentslots.OrderOptionsFulfillmentSlotsActivity$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final Intent a(Context context, String deliveryMode, FulfillmentStateDetails fulfillmentStateDetails) {
            Intrinsics.j(context, "context");
            Intrinsics.j(deliveryMode, "deliveryMode");
            Intrinsics.j(fulfillmentStateDetails, "fulfillmentStateDetails");
            Intent intentPutExtra = new Intent(context, (Class<?>) OrderOptionsFulfillmentSlotsActivity.class).putExtra("com.meijer.intent.extra.DELIVERY_MODE", deliveryMode).putExtra("com.meijer.mobile.meijer.activity.orderoptions.fulfillmentslots.EXTRA_FULFILLMENT_DETAILS", fulfillmentStateDetails);
            Intrinsics.i(intentPutExtra, "putExtra(...)");
            return intentPutExtra;
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u0010\u001a\u00020\u000f2\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/meijer/mobile/meijer/activity/orderoptions/fulfillmentslots/OrderOptionsFulfillmentSlotsActivity$b;", "Lou/a;", "LMn/J1;", "LBm/m;", "dayDecorator", "<init>", "(Lcom/meijer/mobile/meijer/activity/orderoptions/fulfillmentslots/OrderOptionsFulfillmentSlotsActivity;LBm/m;)V", "", "j", "()I", "", "i", "()J", "Lnu/h;", "other", "", "m", "(Lnu/h;)Z", "Landroid/view/View;", "view", "D", "(Landroid/view/View;)LMn/J1;", "viewBinding", "position", "", "B", "(LMn/J1;I)V", "e", "LBm/m;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public final class b extends AbstractC16177a<J1> {

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final FulfillmentSlotDayDecorator dayDecorator;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ OrderOptionsFulfillmentSlotsActivity f109898f;

        public b(OrderOptionsFulfillmentSlotsActivity orderOptionsFulfillmentSlotsActivity, FulfillmentSlotDayDecorator dayDecorator) {
            Intrinsics.j(dayDecorator, "dayDecorator");
            this.f109898f = orderOptionsFulfillmentSlotsActivity;
            this.dayDecorator = dayDecorator;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void C(b bVar, OrderOptionsFulfillmentSlotsActivity orderOptionsFulfillmentSlotsActivity, View view) {
            if (bVar.dayDecorator.K()) {
                orderOptionsFulfillmentSlotsActivity.L1().G(new n.a.SelectDay(bVar.dayDecorator));
            }
        }

        @Override // ou.AbstractC16177a
        @SuppressLint({"Recycle"})
        /* renamed from: B, reason: merged with bridge method [inline-methods] */
        public void u(J1 viewBinding, int position) throws Resources.NotFoundException {
            Intrinsics.j(viewBinding, "viewBinding");
            if (this.dayDecorator.getIsDaySelected()) {
                LinearLayoutManager linearLayoutManager = this.f109898f.daysLayoutManager;
                if (linearLayoutManager == null) {
                    Intrinsics.y("daysLayoutManager");
                    linearLayoutManager = null;
                }
                linearLayoutManager.O1(position);
            }
            TextView timeSlotDayTv = viewBinding.f20142A;
            Intrinsics.i(timeSlotDayTv, "timeSlotDayTv");
            bk.d.c(timeSlotDayTv, this.dayDecorator.A(), this.dayDecorator.B());
            TextView textView = viewBinding.f20142A;
            if (this.dayDecorator.getIsDaySelected()) {
                textView.setTypeface(C6187h.h(textView.getContext(), Bj.j.f2806d));
                TypedArray typedArrayObtainStyledAttributes = textView.getContext().obtainStyledAttributes(new TypedValue().data, new int[]{C5597b.f44537q});
                Intrinsics.i(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
                textView.setTextColor(typedArrayObtainStyledAttributes.getColor(typedArrayObtainStyledAttributes.getIndex(0), 0));
                textView.setBackground(Z1.b.e(textView.getContext(), S.f98715c));
                Unit unit = Unit.f142422a;
                typedArrayObtainStyledAttributes.recycle();
                ConstraintLayout constraintLayout = viewBinding.f20143z;
                constraintLayout.setBackground(Z1.b.e(constraintLayout.getContext(), S.f98721f));
            } else if (this.dayDecorator.K()) {
                textView.setTypeface(C6187h.h(textView.getContext(), Bj.j.f2804b));
                TypedArray typedArrayObtainStyledAttributes2 = textView.getContext().obtainStyledAttributes(new TypedValue().data, new int[]{C5597b.f44533o});
                Intrinsics.i(typedArrayObtainStyledAttributes2, "obtainStyledAttributes(...)");
                textView.setTextColor(typedArrayObtainStyledAttributes2.getColor(typedArrayObtainStyledAttributes2.getIndex(0), 0));
                textView.setBackground(Z1.b.e(textView.getContext(), S.f98713b));
                Unit unit2 = Unit.f142422a;
                typedArrayObtainStyledAttributes2.recycle();
                ConstraintLayout constraintLayout2 = viewBinding.f20143z;
                constraintLayout2.setBackground(Z1.b.e(constraintLayout2.getContext(), S.f98719e));
            } else {
                textView.setTypeface(C6187h.h(textView.getContext(), Bj.j.f2804b));
                TypedArray typedArrayObtainStyledAttributes3 = textView.getContext().obtainStyledAttributes(new TypedValue().data, new int[]{C5597b.f44533o});
                Intrinsics.i(typedArrayObtainStyledAttributes3, "obtainStyledAttributes(...)");
                textView.setTextColor(typedArrayObtainStyledAttributes3.getColor(typedArrayObtainStyledAttributes3.getIndex(0), 0));
                textView.setBackground(Z1.b.e(textView.getContext(), S.f98713b));
                Unit unit3 = Unit.f142422a;
                typedArrayObtainStyledAttributes3.recycle();
                ConstraintLayout constraintLayout3 = viewBinding.f20143z;
                constraintLayout3.setBackground(Z1.b.e(constraintLayout3.getContext(), S.f98719e));
            }
            if (this.dayDecorator.K()) {
                viewBinding.f20142A.setFocusable(true);
                viewBinding.f20142A.setClickable(true);
            } else {
                viewBinding.f20142A.setFocusable(false);
                viewBinding.f20142A.setClickable(false);
            }
            TextView textView2 = viewBinding.f20142A;
            final OrderOptionsFulfillmentSlotsActivity orderOptionsFulfillmentSlotsActivity = this.f109898f;
            textView2.setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.orderoptions.fulfillmentslots.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    OrderOptionsFulfillmentSlotsActivity.b.C(this.f109921a, orderOptionsFulfillmentSlotsActivity, view);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ou.AbstractC16177a
        /* renamed from: D, reason: merged with bridge method [inline-methods] */
        public J1 z(View view) {
            Intrinsics.j(view, "view");
            J1 j1K0 = J1.K0(view);
            Intrinsics.i(j1K0, "bind(...)");
            return j1K0;
        }

        @Override // nu.h
        public long i() {
            return this.dayDecorator.getTimeSlotDay().getDate().hashCode();
        }

        @Override // nu.h
        public int j() {
            return V.f99421t0;
        }

        @Override // nu.h
        public boolean m(nu.h<?> other) {
            Intrinsics.j(other, "other");
            return (other instanceof b) && Intrinsics.e(((b) other).dayDecorator, this.dayDecorator);
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0086\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0011\u001a\u00020\u00102\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lcom/meijer/mobile/meijer/activity/orderoptions/fulfillmentslots/OrderOptionsFulfillmentSlotsActivity$c;", "Lou/a;", "LMn/P1;", "LBm/q;", "slotDecorator", "", "slotCount", "<init>", "(Lcom/meijer/mobile/meijer/activity/orderoptions/fulfillmentslots/OrderOptionsFulfillmentSlotsActivity;LBm/q;I)V", "j", "()I", "", "i", "()J", "Lnu/h;", "other", "", "m", "(Lnu/h;)Z", "Landroid/view/View;", "view", "B", "(Landroid/view/View;)LMn/P1;", "viewBinding", "position", "", "A", "(LMn/P1;I)V", "e", "LBm/q;", "f", "I", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public final class c extends AbstractC16177a<P1> {

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final FulfillmentSlotTimeDecorator slotDecorator;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final int slotCount;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ OrderOptionsFulfillmentSlotsActivity f109901g;

        public c(OrderOptionsFulfillmentSlotsActivity orderOptionsFulfillmentSlotsActivity, FulfillmentSlotTimeDecorator slotDecorator, int i10) {
            Intrinsics.j(slotDecorator, "slotDecorator");
            this.f109901g = orderOptionsFulfillmentSlotsActivity;
            this.slotDecorator = slotDecorator;
            this.slotCount = i10;
        }

        @Override // ou.AbstractC16177a
        @SuppressLint({"Recycle"})
        /* renamed from: A, reason: merged with bridge method [inline-methods] */
        public void u(P1 viewBinding, int position) {
            Intrinsics.j(viewBinding, "viewBinding");
            boolean z10 = position != this.slotCount - 1;
            boolean z11 = (position + 1) % 3 != 0;
            TextView readOnlyTimeSlotTv = viewBinding.f20269A;
            Intrinsics.i(readOnlyTimeSlotTv, "readOnlyTimeSlotTv");
            bk.d.g(readOnlyTimeSlotTv, this.slotDecorator.d());
            View readOnlyTimeDivider = viewBinding.f20270z;
            Intrinsics.i(readOnlyTimeDivider, "readOnlyTimeDivider");
            readOnlyTimeDivider.setVisibility(z10 && z11 ? 0 : 8);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ou.AbstractC16177a
        /* renamed from: B, reason: merged with bridge method [inline-methods] */
        public P1 z(View view) {
            Intrinsics.j(view, "view");
            P1 p1K0 = P1.K0(view);
            Intrinsics.i(p1K0, "bind(...)");
            return p1K0;
        }

        @Override // nu.h
        public long i() {
            return Long.parseLong(this.slotDecorator.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String());
        }

        @Override // nu.h
        public int j() {
            return V.f99430w0;
        }

        @Override // nu.h
        public boolean m(nu.h<?> other) {
            Intrinsics.j(other, "other");
            return (other instanceof c) && ((c) other).slotDecorator.g(this.slotDecorator);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class e extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f109905f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ComponentActivity componentActivity) {
            super(0);
            this.f109905f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f109905f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class f extends Lambda implements Function0<g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f109906f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ComponentActivity componentActivity) {
            super(0);
            this.f109906f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final g0 invoke() {
            return this.f109906f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class g extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f109907f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f109908g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f109907f = function0;
            this.f109908g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f109907f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f109908g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/E1;", "viewState", "", "<anonymous>", "(Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/E1;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.orderoptions.fulfillmentslots.OrderOptionsFulfillmentSlotsActivity$onCreate$10", f = "OrderOptionsFulfillmentSlotsActivity.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class d extends SuspendLambda implements Function2<FulfillmentSlotsViewState, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f109902a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f109903b;

        d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            d dVar = OrderOptionsFulfillmentSlotsActivity.this.new d(continuation);
            dVar.f109903b = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(FulfillmentSlotsViewState fulfillmentSlotsViewState, Continuation<? super Unit> continuation) {
            return ((d) create(fulfillmentSlotsViewState, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f109902a == 0) {
                ResultKt.b(obj);
                FulfillmentSlotsViewState fulfillmentSlotsViewState = (FulfillmentSlotsViewState) this.f109903b;
                AbstractC4297w abstractC4297w = null;
                if (fulfillmentSlotsViewState.getIsLoading() || !fulfillmentSlotsViewState.F().e().isEmpty()) {
                    AbstractC4297w abstractC4297w2 = OrderOptionsFulfillmentSlotsActivity.this.binding;
                    if (abstractC4297w2 == null) {
                        Intrinsics.y("binding");
                    } else {
                        abstractC4297w = abstractC4297w2;
                    }
                    abstractC4297w.f21054E.W(fulfillmentSlotsViewState.getIsLoading());
                    OrderOptionsFulfillmentSlotsActivity.this.K1(fulfillmentSlotsViewState);
                    OrderOptionsFulfillmentSlotsActivity.this.J1(fulfillmentSlotsViewState);
                } else {
                    AbstractC4297w abstractC4297w3 = OrderOptionsFulfillmentSlotsActivity.this.binding;
                    if (abstractC4297w3 == null) {
                        Intrinsics.y("binding");
                        abstractC4297w3 = null;
                    }
                    abstractC4297w3.f21054E.P(Y.f100317s9, true);
                    AbstractC4297w abstractC4297w4 = OrderOptionsFulfillmentSlotsActivity.this.binding;
                    if (abstractC4297w4 == null) {
                        Intrinsics.y("binding");
                    } else {
                        abstractC4297w = abstractC4297w4;
                    }
                    TextView completeOrderTv = abstractC4297w.f21057H.f20234z;
                    Intrinsics.i(completeOrderTv, "completeOrderTv");
                    completeOrderTv.setVisibility(8);
                }
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J1(FulfillmentSlotsViewState viewState) {
        AbstractC4297w abstractC4297w = this.binding;
        if (abstractC4297w == null) {
            Intrinsics.y("binding");
            abstractC4297w = null;
        }
        Z0 z02 = abstractC4297w.f21050A;
        TextView daysSectionTv = z02.f20433B;
        Intrinsics.i(daysSectionTv, "daysSectionTv");
        bk.d.g(daysSectionTv, viewState.w());
        ConstraintLayout currentSelectionSection = z02.f20434z;
        Intrinsics.i(currentSelectionSection, "currentSelectionSection");
        currentSelectionSection.setVisibility(8);
        nu.l lVar = this.daysCarouselSection;
        List<FulfillmentSlotDayDecorator> listE = viewState.F().e();
        ArrayList arrayList = new ArrayList(CollectionsKt.x(listE, 10));
        Iterator<T> it = listE.iterator();
        while (it.hasNext()) {
            arrayList.add(new b(this, (FulfillmentSlotDayDecorator) it.next()));
        }
        lVar.R(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final n L1() {
        return (n) this.orderOptionsFulfillmentSlotsViewModel.getValue();
    }

    @Override // Aj.b
    public Toolbar v() {
        AbstractC4297w abstractC4297w = this.binding;
        if (abstractC4297w == null) {
            Intrinsics.y("binding");
            abstractC4297w = null;
        }
        MaterialToolbar toolbar = abstractC4297w.f21061L;
        Intrinsics.i(toolbar, "toolbar");
        return toolbar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K1(FulfillmentSlotsViewState viewState) {
        int i10;
        int i11;
        Object next;
        AbstractC5607a abstractC5607aG;
        AbstractC5607a abstractC5607aW;
        List<FulfillmentSlotTimeDecorator> listF;
        AbstractC5607a abstractC5607aD;
        List<FulfillmentSlotTimeDecorator> listV;
        AbstractC5607a abstractC5607aD2;
        List<FulfillmentSlotTimeDecorator> listV2;
        ArrayList arrayList;
        List<FulfillmentSlotTimeDecorator> listF2;
        String stringExtra = getIntent().getStringExtra("com.meijer.intent.extra.DELIVERY_MODE");
        AbstractC5607a.Companion companion = AbstractC5607a.INSTANCE;
        int i12 = Y.f99651K6;
        if (Intrinsics.e(stringExtra, "delivery")) {
            i10 = Y.f99499C6;
        } else {
            i10 = Y.f99537E6;
        }
        A(bk.d.a(this, companion.d(i12, companion.d(i10, new Object[0]))));
        AbstractC4297w abstractC4297w = this.binding;
        ArrayList arrayList2 = null;
        if (abstractC4297w == null) {
            Intrinsics.y("binding");
            abstractC4297w = null;
        }
        MaterialButton primaryActionButton = abstractC4297w.f21052C;
        Intrinsics.i(primaryActionButton, "primaryActionButton");
        primaryActionButton.setVisibility(8);
        AbstractC4297w abstractC4297w2 = this.binding;
        if (abstractC4297w2 == null) {
            Intrinsics.y("binding");
            abstractC4297w2 = null;
        }
        ConstraintLayout progressIndicatorView = abstractC4297w2.f21053D.f21048B;
        Intrinsics.i(progressIndicatorView, "progressIndicatorView");
        progressIndicatorView.setVisibility(8);
        AbstractC4297w abstractC4297w3 = this.binding;
        if (abstractC4297w3 == null) {
            Intrinsics.y("binding");
            abstractC4297w3 = null;
        }
        TextView completeOrderTv = abstractC4297w3.f21057H.f20234z;
        Intrinsics.i(completeOrderTv, "completeOrderTv");
        completeOrderTv.setVisibility(0);
        AbstractC4297w abstractC4297w4 = this.binding;
        if (abstractC4297w4 == null) {
            Intrinsics.y("binding");
            abstractC4297w4 = null;
        }
        TextView completeOrderTv2 = abstractC4297w4.f21057H.f20234z;
        Intrinsics.i(completeOrderTv2, "completeOrderTv");
        int i13 = Y.f99870Vg;
        if (Intrinsics.e(stringExtra, "delivery")) {
            i11 = Y.f99518D6;
        } else {
            i11 = Y.f99556F6;
        }
        bk.d.g(completeOrderTv2, companion.d(i13, companion.d(i11, new Object[0])));
        AbstractC4297w abstractC4297w5 = this.binding;
        if (abstractC4297w5 == null) {
            Intrinsics.y("binding");
            abstractC4297w5 = null;
        }
        CalloutView noSlotTodayCalloutview = abstractC4297w5.f21057H.f20233A;
        Intrinsics.i(noSlotTodayCalloutview, "noSlotTodayCalloutview");
        noSlotTodayCalloutview.setVisibility(8);
        AbstractC4297w abstractC4297w6 = this.binding;
        if (abstractC4297w6 == null) {
            Intrinsics.y("binding");
            abstractC4297w6 = null;
        }
        J2 j22 = abstractC4297w6.f21059J;
        ConstraintLayout timeSlotsReadOnlySectionContainer = j22.f20153J;
        Intrinsics.i(timeSlotsReadOnlySectionContainer, "timeSlotsReadOnlySectionContainer");
        timeSlotsReadOnlySectionContainer.setVisibility(0);
        Iterator<T> it = viewState.F().e().iterator();
        while (true) {
            if (it.hasNext()) {
                next = it.next();
                if (((FulfillmentSlotDayDecorator) next).getIsDaySelected()) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        FulfillmentSlotDayDecorator fulfillmentSlotDayDecorator = (FulfillmentSlotDayDecorator) next;
        TextView amTimesCount = j22.f20154z;
        Intrinsics.i(amTimesCount, "amTimesCount");
        if (fulfillmentSlotDayDecorator != null) {
            abstractC5607aG = fulfillmentSlotDayDecorator.G();
        } else {
            abstractC5607aG = null;
        }
        bk.d.g(amTimesCount, abstractC5607aG);
        TextView pmTimesCount = j22.f20148E;
        Intrinsics.i(pmTimesCount, "pmTimesCount");
        if (fulfillmentSlotDayDecorator != null) {
            abstractC5607aW = fulfillmentSlotDayDecorator.w();
        } else {
            abstractC5607aW = null;
        }
        bk.d.g(pmTimesCount, abstractC5607aW);
        nu.l lVar = this.readOnlyMorningTimeSlotsSection;
        if (fulfillmentSlotDayDecorator != null) {
            listF = fulfillmentSlotDayDecorator.F();
        } else {
            listF = null;
        }
        List<FulfillmentSlotTimeDecorator> list = listF;
        if (list != null && !list.isEmpty()) {
            RecyclerView amTimesList = j22.f20147D;
            Intrinsics.i(amTimesList, "amTimesList");
            amTimesList.setVisibility(0);
            TextView amTimesEmptyTv = j22.f20145B;
            Intrinsics.i(amTimesEmptyTv, "amTimesEmptyTv");
            amTimesEmptyTv.setVisibility(8);
            if (fulfillmentSlotDayDecorator != null && (listF2 = fulfillmentSlotDayDecorator.F()) != null) {
                List<FulfillmentSlotTimeDecorator> list2 = listF2;
                arrayList = new ArrayList(CollectionsKt.x(list2, 10));
                Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList.add(new c(this, (FulfillmentSlotTimeDecorator) it2.next(), fulfillmentSlotDayDecorator.F().size()));
                }
            } else {
                arrayList = null;
            }
            Intrinsics.g(arrayList);
            lVar.R(arrayList);
        } else {
            RecyclerView amTimesList2 = j22.f20147D;
            Intrinsics.i(amTimesList2, "amTimesList");
            amTimesList2.setVisibility(8);
            TextView amTimesEmptyTv2 = j22.f20145B;
            Intrinsics.i(amTimesEmptyTv2, "amTimesEmptyTv");
            amTimesEmptyTv2.setVisibility(0);
            TextView amTimesEmptyTv3 = j22.f20145B;
            Intrinsics.i(amTimesEmptyTv3, "amTimesEmptyTv");
            AbstractC5607a.Companion companion2 = AbstractC5607a.INSTANCE;
            int i14 = Y.f100396w8;
            if (Intrinsics.e(stringExtra, "delivery")) {
                abstractC5607aD = companion2.d(Y.f99518D6, new Object[0]);
            } else {
                abstractC5607aD = companion2.d(Y.f99556F6, new Object[0]);
            }
            bk.d.g(amTimesEmptyTv3, companion2.d(i14, abstractC5607aD));
        }
        nu.l lVar2 = this.readOnlyAfternoonTimeSlotsSection;
        if (fulfillmentSlotDayDecorator != null) {
            listV = fulfillmentSlotDayDecorator.v();
        } else {
            listV = null;
        }
        List<FulfillmentSlotTimeDecorator> list3 = listV;
        if (list3 != null && !list3.isEmpty()) {
            RecyclerView pmTimesList = j22.f20151H;
            Intrinsics.i(pmTimesList, "pmTimesList");
            pmTimesList.setVisibility(0);
            TextView pmTimesEmptyTv = j22.f20149F;
            Intrinsics.i(pmTimesEmptyTv, "pmTimesEmptyTv");
            pmTimesEmptyTv.setVisibility(8);
            if (fulfillmentSlotDayDecorator != null && (listV2 = fulfillmentSlotDayDecorator.v()) != null) {
                List<FulfillmentSlotTimeDecorator> list4 = listV2;
                arrayList2 = new ArrayList(CollectionsKt.x(list4, 10));
                Iterator<T> it3 = list4.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(new c(this, (FulfillmentSlotTimeDecorator) it3.next(), fulfillmentSlotDayDecorator.v().size()));
                }
            }
            Intrinsics.g(arrayList2);
            lVar2.R(arrayList2);
            return;
        }
        RecyclerView pmTimesList2 = j22.f20151H;
        Intrinsics.i(pmTimesList2, "pmTimesList");
        pmTimesList2.setVisibility(8);
        TextView pmTimesEmptyTv2 = j22.f20149F;
        Intrinsics.i(pmTimesEmptyTv2, "pmTimesEmptyTv");
        pmTimesEmptyTv2.setVisibility(0);
        TextView pmTimesEmptyTv3 = j22.f20149F;
        Intrinsics.i(pmTimesEmptyTv3, "pmTimesEmptyTv");
        AbstractC5607a.Companion companion3 = AbstractC5607a.INSTANCE;
        int i15 = Y.f99739P;
        if (Intrinsics.e(stringExtra, "delivery")) {
            abstractC5607aD2 = companion3.d(Y.f99518D6, new Object[0]);
        } else {
            abstractC5607aD2 = companion3.d(Y.f99556F6, new Object[0]);
        }
        bk.d.g(pmTimesEmptyTv3, companion3.d(i15, abstractC5607aD2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M1(OrderOptionsFulfillmentSlotsActivity orderOptionsFulfillmentSlotsActivity) {
        Parcelable parcelable;
        n nVarL1 = orderOptionsFulfillmentSlotsActivity.L1();
        String stringExtra = orderOptionsFulfillmentSlotsActivity.getIntent().getStringExtra("com.meijer.intent.extra.DELIVERY_MODE");
        Intent intent = orderOptionsFulfillmentSlotsActivity.getIntent();
        Intrinsics.i(intent, "getIntent(...)");
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable = (Parcelable) intent.getParcelableExtra("com.meijer.mobile.meijer.activity.orderoptions.fulfillmentslots.EXTRA_FULFILLMENT_DETAILS", FulfillmentStateDetails.class);
        } else {
            Parcelable parcelableExtra = intent.getParcelableExtra("com.meijer.mobile.meijer.activity.orderoptions.fulfillmentslots.EXTRA_FULFILLMENT_DETAILS");
            if (!(parcelableExtra instanceof FulfillmentStateDetails)) {
                parcelableExtra = null;
            }
            parcelable = (FulfillmentStateDetails) parcelableExtra;
        }
        nVarL1.G(new n.a.FetchFulfillmentSchedule(stringExtra, (FulfillmentStateDetails) parcelable));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit N1(OrderOptionsFulfillmentSlotsActivity orderOptionsFulfillmentSlotsActivity) {
        orderOptionsFulfillmentSlotsActivity.finishAfterTransition();
        return Unit.f142422a;
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        Parcelable parcelable;
        super.onCreate(savedInstanceState);
        AbstractC4297w abstractC4297wK0 = AbstractC4297w.K0(getLayoutInflater());
        this.binding = abstractC4297wK0;
        if (abstractC4297wK0 == null) {
            Intrinsics.y("binding");
            abstractC4297wK0 = null;
        }
        setContentView(Zr.a.j(abstractC4297wK0.getRoot(), false, 1, null));
        AbstractC4297w abstractC4297w = this.binding;
        if (abstractC4297w == null) {
            Intrinsics.y("binding");
            abstractC4297w = null;
        }
        abstractC4297w.f21054E.setProgressBarListener(new ProgressView.d() { // from class: com.meijer.mobile.meijer.activity.orderoptions.fulfillmentslots.b
            @Override // com.meijer.mobile.ui.legacy.progressview.ProgressView.d
            public final void B() {
                OrderOptionsFulfillmentSlotsActivity.M1(this.f109919a);
            }
        });
        n nVarL1 = L1();
        String stringExtra = getIntent().getStringExtra("com.meijer.intent.extra.DELIVERY_MODE");
        Intent intent = getIntent();
        Intrinsics.i(intent, "getIntent(...)");
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable = (Parcelable) intent.getParcelableExtra("com.meijer.mobile.meijer.activity.orderoptions.fulfillmentslots.EXTRA_FULFILLMENT_DETAILS", FulfillmentStateDetails.class);
        } else {
            Parcelable parcelableExtra = intent.getParcelableExtra("com.meijer.mobile.meijer.activity.orderoptions.fulfillmentslots.EXTRA_FULFILLMENT_DETAILS");
            if (!(parcelableExtra instanceof FulfillmentStateDetails)) {
                parcelableExtra = null;
            }
            parcelable = (FulfillmentStateDetails) parcelableExtra;
        }
        nVarL1.G(new n.a.FetchFulfillmentSchedule(stringExtra, (FulfillmentStateDetails) parcelable));
        Aj.b.O0(this, 0, 0, new Function0() { // from class: com.meijer.mobile.meijer.activity.orderoptions.fulfillmentslots.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OrderOptionsFulfillmentSlotsActivity.N1(this.f109920a);
            }
        }, 3, null);
        C15949d<nu.g> c15949d = new C15949d<>();
        c15949d.c(this.timeSlotsSection);
        this.timeSlotsAdapter = c15949d;
        C15949d<nu.g> c15949d2 = new C15949d<>();
        c15949d2.c(this.daysCarouselSection);
        this.daysAdapter = c15949d2;
        C15949d<nu.g> c15949d3 = new C15949d<>();
        c15949d3.c(this.readOnlyMorningTimeSlotsSection);
        this.readOnlyMorningTimeSlotsAdapter = c15949d3;
        C15949d<nu.g> c15949d4 = new C15949d<>();
        c15949d4.c(this.readOnlyAfternoonTimeSlotsSection);
        this.readOnlyAfternoonTimeSlotsAdapter = c15949d4;
        AbstractC4297w abstractC4297w2 = this.binding;
        if (abstractC4297w2 == null) {
            Intrinsics.y("binding");
            abstractC4297w2 = null;
        }
        RecyclerView recyclerView = abstractC4297w2.f21055F;
        C15949d<nu.g> c15949d5 = this.daysAdapter;
        if (c15949d5 == null) {
            Intrinsics.y("daysAdapter");
            c15949d5 = null;
        }
        recyclerView.setAdapter(c15949d5);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(recyclerView.getContext(), 0, false);
        this.daysLayoutManager = linearLayoutManager;
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.addItemDecoration(new C14760b(recyclerView.getResources().getDimensionPixelOffset(Q.f98663i), recyclerView.getResources().getDimensionPixelOffset(Q.f98663i) * 2, recyclerView.getResources().getDimensionPixelOffset(Q.f98663i) * 2, 0));
        AbstractC4297w abstractC4297w3 = this.binding;
        if (abstractC4297w3 == null) {
            Intrinsics.y("binding");
            abstractC4297w3 = null;
        }
        RecyclerView recyclerView2 = abstractC4297w3.f21059J.f20147D;
        C15949d<nu.g> c15949d6 = this.readOnlyMorningTimeSlotsAdapter;
        if (c15949d6 == null) {
            Intrinsics.y("readOnlyMorningTimeSlotsAdapter");
            c15949d6 = null;
        }
        recyclerView2.setAdapter(c15949d6);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(recyclerView2.getContext(), 3, 1, false);
        this.readOnlyTimeSlotsLayoutManager = gridLayoutManager;
        recyclerView2.setLayoutManager(gridLayoutManager);
        Intrinsics.g(recyclerView2);
        recyclerView2.setVisibility(0);
        AbstractC4297w abstractC4297w4 = this.binding;
        if (abstractC4297w4 == null) {
            Intrinsics.y("binding");
            abstractC4297w4 = null;
        }
        RecyclerView recyclerView3 = abstractC4297w4.f21059J.f20151H;
        C15949d<nu.g> c15949d7 = this.readOnlyAfternoonTimeSlotsAdapter;
        if (c15949d7 == null) {
            Intrinsics.y("readOnlyAfternoonTimeSlotsAdapter");
            c15949d7 = null;
        }
        recyclerView3.setAdapter(c15949d7);
        GridLayoutManager gridLayoutManager2 = new GridLayoutManager(recyclerView3.getContext(), 3, 1, false);
        this.readOnlyTimeSlotsLayoutManager = gridLayoutManager2;
        recyclerView3.setLayoutManager(gridLayoutManager2);
        Intrinsics.g(recyclerView3);
        recyclerView3.setVisibility(0);
        C17154h.J(C17154h.O(L1().F(), new d(null)), C6031t.a(this));
    }
}
