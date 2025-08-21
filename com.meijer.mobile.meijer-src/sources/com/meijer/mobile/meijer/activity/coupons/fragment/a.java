package com.meijer.mobile.meijer.activity.coupons.fragment;

import Qk.c;
import android.content.Context;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.L;
import com.meijer.mobile.meijer.activity.coupons.fragment.CouponsFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ'\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001f\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010 R\u001c\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010'\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010+\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006,"}, d2 = {"Lcom/meijer/mobile/meijer/activity/coupons/fragment/a;", "Landroidx/fragment/app/L;", "Landroid/content/Context;", "context", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "<init>", "(Landroid/content/Context;Landroidx/fragment/app/FragmentManager;)V", "", "position", "LQk/c;", "x", "(I)LQk/c;", "d", "()I", "", "f", "(I)Ljava/lang/CharSequence;", "Lcom/meijer/mobile/meijer/activity/coupons/fragment/CouponsFragment;", "w", "(I)Lcom/meijer/mobile/meijer/activity/coupons/fragment/CouponsFragment;", "Landroid/view/ViewGroup;", "container", "", "h", "(Landroid/view/ViewGroup;I)Ljava/lang/Object;", "object", "", "a", "(Landroid/view/ViewGroup;ILjava/lang/Object;)V", "fragment", "o", "Landroid/content/Context;", "", "i", "[Lcom/meijer/mobile/meijer/activity/coupons/fragment/CouponsFragment;", "fragments", "j", "I", "lastPosition", "", "k", "Z", "isFirstTrackState", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class a extends L {

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final CouponsFragment[] fragments;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private int lastPosition;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private boolean isFirstTrackState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, FragmentManager fragmentManager) {
        super(fragmentManager);
        Intrinsics.j(context, "context");
        Intrinsics.j(fragmentManager, "fragmentManager");
        this.context = context;
        this.fragments = new CouponsFragment[2];
        this.lastPosition = -1;
        this.isFirstTrackState = true;
    }

    private final c x(int position) {
        if (position == 0) {
            return c.f31040d;
        }
        if (position == 1) {
            return c.f31041e;
        }
        throw new IllegalArgumentException("invalid position: " + position);
    }

    @Override // androidx.fragment.app.L, androidx.viewpager.widget.a
    public void a(ViewGroup container, int position, Object object) {
        Intrinsics.j(container, "container");
        Intrinsics.j(object, "object");
        super.a(container, position, object);
        this.fragments[position] = null;
    }

    @Override // androidx.viewpager.widget.a
    public int d() {
        return this.fragments.length;
    }

    @Override // androidx.viewpager.widget.a
    public CharSequence f(int position) {
        String string = this.context.getString(x(position).getTitleResourceId());
        Intrinsics.i(string, "getString(...)");
        return string;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.L, androidx.viewpager.widget.a
    public Object h(ViewGroup container, int position) {
        Intrinsics.j(container, "container");
        Object objH = super.h(container, position);
        Intrinsics.i(objH, "instantiateItem(...)");
        this.fragments[position] = objH;
        return objH;
    }

    @Override // androidx.fragment.app.L, androidx.viewpager.widget.a
    public void o(ViewGroup container, int position, Object fragment) {
        Intrinsics.j(container, "container");
        Intrinsics.j(fragment, "fragment");
        super.o(container, position, fragment);
        if (position != this.lastPosition) {
            CouponsFragment couponsFragment = this.fragments[position];
            Intrinsics.g(couponsFragment);
            couponsFragment.k1(x(position), this.isFirstTrackState);
            this.lastPosition = position;
            if (this.isFirstTrackState) {
                this.isFirstTrackState = false;
            }
        }
    }

    @Override // androidx.fragment.app.L
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public CouponsFragment t(int position) {
        return CouponsFragment.Companion.b(CouponsFragment.INSTANCE, x(position), null, null, 6, null);
    }
}
