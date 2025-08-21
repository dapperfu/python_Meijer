package com.meijer.mobile.meijer.activity.shoppinglist.view;

import Nn.AbstractC4261l1;
import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.meijer.mobile.meijer.Q;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fR\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/meijer/mobile/meijer/activity/shoppinglist/view/EmptyShoppingListView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "D", "", "hasList", "setHasFavoritesList", "(Z)V", "Lcom/meijer/mobile/meijer/activity/shoppinglist/view/d;", "listener", "setListener", "(Lcom/meijer/mobile/meijer/activity/shoppinglist/view/d;)V", "x", "Lcom/meijer/mobile/meijer/activity/shoppinglist/view/d;", "LNn/l1;", "y", "LNn/l1;", "binding", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class EmptyShoppingListView extends ConstraintLayout {

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private d listener;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private AbstractC4261l1 binding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmptyShoppingListView(Context context) throws Resources.NotFoundException {
        super(context, null);
        Intrinsics.j(context, "context");
        D(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E(EmptyShoppingListView emptyShoppingListView, View view) {
        d dVar = emptyShoppingListView.listener;
        if (dVar != null) {
            dVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F(EmptyShoppingListView emptyShoppingListView, View view) {
        d dVar = emptyShoppingListView.listener;
        if (dVar != null) {
            dVar.a();
        }
    }

    public final void setHasFavoritesList(boolean hasList) {
        AbstractC4261l1 abstractC4261l1 = this.binding;
        AbstractC4261l1 abstractC4261l12 = null;
        if (abstractC4261l1 == null) {
            Intrinsics.x("binding");
            abstractC4261l1 = null;
        }
        Group buildFavoritesContainer = abstractC4261l1.f22111B;
        Intrinsics.i(buildFavoritesContainer, "buildFavoritesContainer");
        buildFavoritesContainer.setVisibility(!hasList ? 0 : 8);
        AbstractC4261l1 abstractC4261l13 = this.binding;
        if (abstractC4261l13 == null) {
            Intrinsics.x("binding");
        } else {
            abstractC4261l12 = abstractC4261l13;
        }
        Button addFromFavorites = abstractC4261l12.f22114z;
        Intrinsics.i(addFromFavorites, "addFromFavorites");
        addFromFavorites.setVisibility(hasList ? 0 : 8);
    }

    public final void setListener(d listener) {
        this.listener = listener;
    }

    private final void D(Context context) throws Resources.NotFoundException {
        this.binding = AbstractC4261l1.M0(LayoutInflater.from(context), this, true);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        int dimensionPixelSize = getResources().getDimensionPixelSize(Q.f99512a);
        setPadding(0, dimensionPixelSize, 0, dimensionPixelSize);
        AbstractC4261l1 abstractC4261l1 = this.binding;
        AbstractC4261l1 abstractC4261l12 = null;
        if (abstractC4261l1 == null) {
            Intrinsics.x("binding");
            abstractC4261l1 = null;
        }
        abstractC4261l1.f22110A.setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.shoppinglist.view.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EmptyShoppingListView.E(this.f113381a, view);
            }
        });
        AbstractC4261l1 abstractC4261l13 = this.binding;
        if (abstractC4261l13 == null) {
            Intrinsics.x("binding");
            abstractC4261l13 = null;
        }
        abstractC4261l13.f22114z.setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.shoppinglist.view.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EmptyShoppingListView.F(this.f113382a, view);
            }
        });
        if (!isInEditMode()) {
            AbstractC4261l1 abstractC4261l14 = this.binding;
            if (abstractC4261l14 == null) {
                Intrinsics.x("binding");
            } else {
                abstractC4261l12 = abstractC4261l14;
            }
            abstractC4261l12.f22110A.setPaintFlags(8);
        }
    }
}
