package com.meijer.mobile.widget;

import Mn.P2;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0012\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u001a\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/meijer/mobile/widget/UnauthFooterViewNewHomeScreen;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "G", "()V", "Lyo/k;", "z", "Lyo/k;", "getUserManager", "()Lyo/k;", "setUserManager", "(Lyo/k;)V", "userManager", "LPj/g;", "A", "LPj/g;", "getListener", "()LPj/g;", "setListener", "(LPj/g;)V", "listener", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class UnauthFooterViewNewHomeScreen extends Hilt_UnauthFooterViewNewHomeScreen {

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    private Pj.g listener;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    public yo.k userManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnauthFooterViewNewHomeScreen(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.j(context, "context");
        G();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H(UnauthFooterViewNewHomeScreen unauthFooterViewNewHomeScreen, View view) {
        Pj.g gVar = unauthFooterViewNewHomeScreen.listener;
        if (gVar != null) {
            gVar.onSignIn();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I(UnauthFooterViewNewHomeScreen unauthFooterViewNewHomeScreen, View view) {
        Pj.g gVar = unauthFooterViewNewHomeScreen.listener;
        if (gVar != null) {
            gVar.onCreateAccount();
        }
    }

    public final Pj.g getListener() {
        return this.listener;
    }

    public final yo.k getUserManager() {
        yo.k kVar = this.userManager;
        if (kVar != null) {
            return kVar;
        }
        Intrinsics.y("userManager");
        return null;
    }

    public final void setListener(Pj.g gVar) {
        this.listener = gVar;
    }

    public final void setUserManager(yo.k kVar) {
        Intrinsics.j(kVar, "<set-?>");
        this.userManager = kVar;
    }

    private final void G() {
        P2 p2K0 = P2.K0(dj.c.b(this), this, true);
        p2K0.f20273z.setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.widget.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UnauthFooterViewNewHomeScreen.H(this.f119582a, view);
            }
        });
        p2K0.f20271A.setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.widget.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UnauthFooterViewNewHomeScreen.I(this.f119583a, view);
            }
        });
    }
}
