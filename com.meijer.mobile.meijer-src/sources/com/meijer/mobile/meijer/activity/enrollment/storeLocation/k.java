package com.meijer.mobile.meijer.activity.enrollment.storeLocation;

import Nn.AbstractC4234f2;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h;
import b2.C6327h;
import com.fullstory.FS;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.meijer.mobile.meijer.S;
import com.meijer.mobile.meijer.Y;
import com.meijer.mobile.meijer.activity.enrollment.storeLocation.a;
import com.meijer.mobile.meijer.activity.enrollment.storeLocation.k;
import com.meijer.mobile.meijer.activity.enrollment.storeLocation.m;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0002\u0015\u0013B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\f\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0011\u001a\u00020\u00102\n\u0010\u000e\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\"\u0010\u001a\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/meijer/mobile/meijer/activity/enrollment/storeLocation/k;", "Landroidx/recyclerview/widget/q;", "Lcom/meijer/mobile/meijer/activity/enrollment/storeLocation/m$d$a;", "Lcom/meijer/mobile/meijer/activity/enrollment/storeLocation/k$b;", "Lcom/meijer/mobile/meijer/activity/enrollment/storeLocation/o;", "storeListViewModel", "<init>", "(Lcom/meijer/mobile/meijer/activity/enrollment/storeLocation/o;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "g", "(Landroid/view/ViewGroup;I)Lcom/meijer/mobile/meijer/activity/enrollment/storeLocation/k$b;", "holder", "position", "", "c", "(Lcom/meijer/mobile/meijer/activity/enrollment/storeLocation/k$b;I)V", "a", "Lcom/meijer/mobile/meijer/activity/enrollment/storeLocation/o;", "b", "I", "()I", "h", "(I)V", "selectedPosition", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class k extends androidx.recyclerview.widget.q<m.d.StoreDetailsItemState, b> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final o storeListViewModel;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int selectedPosition;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/meijer/mobile/meijer/activity/enrollment/storeLocation/k$a;", "Landroidx/recyclerview/widget/h$f;", "Lcom/meijer/mobile/meijer/activity/enrollment/storeLocation/m$d$a;", "<init>", "()V", "oldItem", "newItem", "", "b", "(Lcom/meijer/mobile/meijer/activity/enrollment/storeLocation/m$d$a;Lcom/meijer/mobile/meijer/activity/enrollment/storeLocation/m$d$a;)Z", "a", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends h.f<m.d.StoreDetailsItemState> {
        @Override // androidx.recyclerview.widget.h.f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean areContentsTheSame(m.d.StoreDetailsItemState oldItem, m.d.StoreDetailsItemState newItem) {
            Intrinsics.j(oldItem, "oldItem");
            Intrinsics.j(newItem, "newItem");
            return Intrinsics.e(oldItem, newItem);
        }

        @Override // androidx.recyclerview.widget.h.f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public boolean areItemsTheSame(m.d.StoreDetailsItemState oldItem, m.d.StoreDetailsItemState newItem) {
            Intrinsics.j(oldItem, "oldItem");
            Intrinsics.j(newItem, "newItem");
            return Intrinsics.e(newItem, oldItem);
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/meijer/mobile/meijer/activity/enrollment/storeLocation/k$b;", "Landroidx/recyclerview/widget/RecyclerView$F;", "LNn/f2;", "binding", "Lcom/meijer/mobile/meijer/activity/enrollment/storeLocation/o;", "storeListViewModel", "<init>", "(Lcom/meijer/mobile/meijer/activity/enrollment/storeLocation/k;LNn/f2;Lcom/meijer/mobile/meijer/activity/enrollment/storeLocation/o;)V", "Lcom/meijer/mobile/meijer/activity/enrollment/storeLocation/m$d$a;", PlaceTypes.STORE, "", "position", "", "d", "(Lcom/meijer/mobile/meijer/activity/enrollment/storeLocation/m$d$a;I)V", "a", "LNn/f2;", "b", "Lcom/meijer/mobile/meijer/activity/enrollment/storeLocation/o;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public final class b extends RecyclerView.F {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final AbstractC4234f2 binding;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final o storeListViewModel;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ k f107096c;

        @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"com/meijer/mobile/meijer/activity/enrollment/storeLocation/k$b$a", "Landroid/view/View$AccessibilityDelegate;", "Landroid/view/View;", "host", "Landroid/view/accessibility/AccessibilityNodeInfo;", "info", "", "onInitializeAccessibilityNodeInfo", "(Landroid/view/View;Landroid/view/accessibility/AccessibilityNodeInfo;)V", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a extends View.AccessibilityDelegate {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ k f107097a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f107098b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ b f107099c;

            a(k kVar, int i10, b bVar) {
                this.f107097a = kVar;
                this.f107098b = i10;
                this.f107099c = bVar;
            }

            @Override // android.view.View.AccessibilityDelegate
            public void onInitializeAccessibilityNodeInfo(View host, AccessibilityNodeInfo info) {
                Intrinsics.j(host, "host");
                Intrinsics.j(info, "info");
                super.onInitializeAccessibilityNodeInfo(host, info);
                if (this.f107097a.getSelectedPosition() == this.f107098b) {
                    info.setText(this.f107099c.binding.getRoot().getResources().getString(Y.f100521Ke));
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(k kVar, AbstractC4234f2 binding, o storeListViewModel) {
            super(binding.getRoot());
            Intrinsics.j(binding, "binding");
            Intrinsics.j(storeListViewModel, "storeListViewModel");
            this.f107096c = kVar;
            this.binding = binding;
            this.storeListViewModel = storeListViewModel;
        }

        public final void d(final m.d.StoreDetailsItemState store, final int position) throws Resources.NotFoundException {
            String str;
            List listB1;
            Intrinsics.j(store, "store");
            AbstractC4234f2 abstractC4234f2 = this.binding;
            abstractC4234f2.f21941A.setText(String.valueOf(position + 1));
            abstractC4234f2.f21947G.setText(store.getName());
            abstractC4234f2.f21943C.setText(store.getAddress());
            abstractC4234f2.f21944D.setText(this.binding.getRoot().getResources().getString(Y.f100446Gf, store.getCity(), store.getState(), store.getZipCode()));
            TextView textView = abstractC4234f2.f21945E;
            Resources resources = this.binding.getRoot().getResources();
            int i10 = Y.f100484If;
            StringCompanionObject stringCompanionObject = StringCompanionObject.f143748a;
            String str2 = String.format("%.1f", Arrays.copyOf(new Object[]{store.getDistance()}, 1));
            Intrinsics.i(str2, "format(...)");
            textView.setText(resources.getString(i10, str2));
            TextView textView2 = abstractC4234f2.f21946F;
            Resources resources2 = this.binding.getRoot().getResources();
            int i11 = Y.f100938g7;
            String hours = store.getHours();
            if (hours == null || (listB1 = StringsKt.b1(hours, new String[]{","}, false, 0, 6, null)) == null || (str = (String) listB1.get(0)) == null) {
                str = "";
            }
            String string = resources2.getString(i11, str);
            Intrinsics.i(string, "getString(...)");
            textView2.setText(m2.b.a(string, 0, null, null));
            FS.setAccessibilityDelegate(this.binding.f21948z, new a(this.f107096c, position, this));
            if (this.f107096c.getSelectedPosition() == position) {
                AbstractC4234f2 abstractC4234f22 = this.binding;
                abstractC4234f22.f21942B.setBackground(C6327h.f(abstractC4234f22.getRoot().getResources(), S.f99605s0, null));
            } else {
                this.binding.f21942B.setBackground(null);
            }
            CardView cardView = this.binding.f21948z;
            final k kVar = this.f107096c;
            cardView.setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.enrollment.storeLocation.l
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    k.b.e(kVar, position, this, store, view);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e(k kVar, int i10, b bVar, m.d.StoreDetailsItemState storeDetailsItemState, View view) {
            if (kVar.getSelectedPosition() == i10) {
                kVar.notifyDataSetChanged();
                return;
            }
            kVar.h(i10);
            kVar.notifyDataSetChanged();
            bVar.storeListViewModel.x(new a.UpdateSelectedStore(storeDetailsItemState));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(o storeListViewModel) {
        super(new a());
        Intrinsics.j(storeListViewModel, "storeListViewModel");
        this.storeListViewModel = storeListViewModel;
        this.selectedPosition = -1;
    }

    /* renamed from: a, reason: from getter */
    public final int getSelectedPosition() {
        return this.selectedPosition;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(b holder, int position) throws Resources.NotFoundException {
        Intrinsics.j(holder, "holder");
        m.d.StoreDetailsItemState storeDetailsItemState = getCurrentList().get(position);
        Intrinsics.i(storeDetailsItemState, "get(...)");
        holder.d(storeDetailsItemState, position);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public b onCreateViewHolder(ViewGroup parent, int viewType) {
        Intrinsics.j(parent, "parent");
        AbstractC4234f2 abstractC4234f2M0 = AbstractC4234f2.M0(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.g(abstractC4234f2M0);
        return new b(this, abstractC4234f2M0, this.storeListViewModel);
    }

    public final void h(int i10) {
        this.selectedPosition = i10;
    }
}
