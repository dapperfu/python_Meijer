package com.meijer.mobile.meijer.activity.checkout.outofstock;

import Nn.n3;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h;
import com.meijer.mobile.meijer.activity.checkout.outofstock.a;
import com.meijer.mobile.meijer.activity.checkout.outofstock.j;
import com.meijer.mobile.meijer.activity.checkout.outofstock.l;
import ek.C13806b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import tr.C17284b;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0014\u0011B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/outofstock/j;", "Landroidx/recyclerview/widget/q;", "Lcom/meijer/mobile/meijer/activity/checkout/outofstock/l$b$b;", "Lcom/meijer/mobile/meijer/activity/checkout/outofstock/j$b;", "Lcom/meijer/mobile/meijer/activity/checkout/outofstock/o;", "outOfStockViewModel", "<init>", "(Lcom/meijer/mobile/meijer/activity/checkout/outofstock/o;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "c", "(Landroid/view/ViewGroup;I)Lcom/meijer/mobile/meijer/activity/checkout/outofstock/j$b;", "holder", "position", "", "a", "(Lcom/meijer/mobile/meijer/activity/checkout/outofstock/j$b;I)V", "Lcom/meijer/mobile/meijer/activity/checkout/outofstock/o;", "b", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class j extends androidx.recyclerview.widget.q<l.b.OutOfStockItemState, b> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final o outOfStockViewModel;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/outofstock/j$a;", "Landroidx/recyclerview/widget/h$f;", "Lcom/meijer/mobile/meijer/activity/checkout/outofstock/l$b$b;", "<init>", "()V", "oldItem", "newItem", "", "b", "(Lcom/meijer/mobile/meijer/activity/checkout/outofstock/l$b$b;Lcom/meijer/mobile/meijer/activity/checkout/outofstock/l$b$b;)Z", "a", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends h.f<l.b.OutOfStockItemState> {
        @Override // androidx.recyclerview.widget.h.f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean areContentsTheSame(l.b.OutOfStockItemState oldItem, l.b.OutOfStockItemState newItem) {
            Intrinsics.j(oldItem, "oldItem");
            Intrinsics.j(newItem, "newItem");
            return Intrinsics.e(oldItem, newItem);
        }

        @Override // androidx.recyclerview.widget.h.f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public boolean areItemsTheSame(l.b.OutOfStockItemState oldItem, l.b.OutOfStockItemState newItem) {
            Intrinsics.j(oldItem, "oldItem");
            Intrinsics.j(newItem, "newItem");
            return Intrinsics.e(newItem.getCode(), oldItem.getCode());
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/outofstock/j$b;", "Landroidx/recyclerview/widget/RecyclerView$F;", "LNn/n3;", "binding", "Lcom/meijer/mobile/meijer/activity/checkout/outofstock/o;", "outOfStockViewModel", "<init>", "(LNn/n3;Lcom/meijer/mobile/meijer/activity/checkout/outofstock/o;)V", "Lcom/meijer/mobile/meijer/activity/checkout/outofstock/l$b$b;", "item", "", "c", "(Lcom/meijer/mobile/meijer/activity/checkout/outofstock/l$b$b;)V", "a", "LNn/n3;", "b", "Lcom/meijer/mobile/meijer/activity/checkout/outofstock/o;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends RecyclerView.F {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final n3 binding;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final o outOfStockViewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(n3 binding, o outOfStockViewModel) {
            super(binding.getRoot());
            Intrinsics.j(binding, "binding");
            Intrinsics.j(outOfStockViewModel, "outOfStockViewModel");
            this.binding = binding;
            this.outOfStockViewModel = outOfStockViewModel;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void d(b bVar, l.b.OutOfStockItemState outOfStockItemState, View view) {
            bVar.outOfStockViewModel.x(new a.SearchForReplacement(outOfStockItemState));
        }

        public final void c(final l.b.OutOfStockItemState item) {
            Intrinsics.j(item, "item");
            this.binding.f22149C.setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.checkout.outofstock.k
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    j.b.d(this.f104351a, item, view);
                }
            });
            n3 n3Var = this.binding;
            TextView textView = n3Var.f22151E;
            textView.setText(n3Var.getRoot().getResources().getString(C17284b.f163332l0, item.getOldQuantity()));
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            Intrinsics.h(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
            ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = 8;
            textView.setLayoutParams(bVar);
            ImageView productImage = this.binding.f22152F;
            Intrinsics.i(productImage, "productImage");
            C13806b.f(productImage, item.getImageUrl(), null, null, 6, null);
            this.binding.f22153G.setText(item.getName());
            this.binding.f22150D.setText(item.getFullDetails().getPrice().getFormattedValue());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(o outOfStockViewModel) {
        super(new a());
        Intrinsics.j(outOfStockViewModel, "outOfStockViewModel");
        this.outOfStockViewModel = outOfStockViewModel;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(b holder, int position) {
        Intrinsics.j(holder, "holder");
        l.b.OutOfStockItemState outOfStockItemState = getCurrentList().get(position);
        Intrinsics.i(outOfStockItemState, "get(...)");
        holder.c(outOfStockItemState);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public b onCreateViewHolder(ViewGroup parent, int viewType) {
        Intrinsics.j(parent, "parent");
        n3 n3VarM0 = n3.M0(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.g(n3VarM0);
        return new b(n3VarM0, this.outOfStockViewModel);
    }
}
