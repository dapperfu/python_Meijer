package com.meijer.mobile.meijer.activity.shoppinglist.view;

import Mn.AbstractC4256l1;
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

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fR\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/meijer/mobile/meijer/activity/shoppinglist/view/EmptyShoppingListView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "D", "", "hasList", "setHasFavoritesList", "(Z)V", "Lcom/meijer/mobile/meijer/activity/shoppinglist/view/d;", "listener", "setListener", "(Lcom/meijer/mobile/meijer/activity/shoppinglist/view/d;)V", "x", "Lcom/meijer/mobile/meijer/activity/shoppinglist/view/d;", "LMn/l1;", "y", "LMn/l1;", "binding", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class EmptyShoppingListView extends ConstraintLayout {

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private d listener;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private AbstractC4256l1 binding;

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
        AbstractC4256l1 abstractC4256l1 = this.binding;
        AbstractC4256l1 abstractC4256l12 = null;
        if (abstractC4256l1 == null) {
            Intrinsics.y("binding");
            abstractC4256l1 = null;
        }
        Group buildFavoritesContainer = abstractC4256l1.f20779B;
        Intrinsics.i(buildFavoritesContainer, "buildFavoritesContainer");
        buildFavoritesContainer.setVisibility(!hasList ? 0 : 8);
        AbstractC4256l1 abstractC4256l13 = this.binding;
        if (abstractC4256l13 == null) {
            Intrinsics.y("binding");
        } else {
            abstractC4256l12 = abstractC4256l13;
        }
        Button addFromFavorites = abstractC4256l12.f20782z;
        Intrinsics.i(addFromFavorites, "addFromFavorites");
        addFromFavorites.setVisibility(hasList ? 0 : 8);
    }

    public final void setListener(d listener) {
        this.listener = listener;
    }

    private final void D(Context context) throws Resources.NotFoundException {
        this.binding = AbstractC4256l1.K0(LayoutInflater.from(context), this, true);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        int dimensionPixelSize = getResources().getDimensionPixelSize(Q.f98655a);
        setPadding(0, dimensionPixelSize, 0, dimensionPixelSize);
        AbstractC4256l1 abstractC4256l1 = this.binding;
        AbstractC4256l1 abstractC4256l12 = null;
        if (abstractC4256l1 == null) {
            Intrinsics.y("binding");
            abstractC4256l1 = null;
        }
        abstractC4256l1.f20778A.setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.shoppinglist.view.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EmptyShoppingListView.E(this.f112529a, view);
            }
        });
        AbstractC4256l1 abstractC4256l13 = this.binding;
        if (abstractC4256l13 == null) {
            Intrinsics.y("binding");
            abstractC4256l13 = null;
        }
        abstractC4256l13.f20782z.setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.shoppinglist.view.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EmptyShoppingListView.F(this.f112530a, view);
            }
        });
        if (!isInEditMode()) {
            AbstractC4256l1 abstractC4256l14 = this.binding;
            if (abstractC4256l14 == null) {
                Intrinsics.y("binding");
            } else {
                abstractC4256l12 = abstractC4256l14;
            }
            abstractC4256l12.f20778A.setPaintFlags(8);
        }
    }
}
