package Ur;

import Fq.ShoppingListItem;
import Ki.K;
import Ki.LocalThemeScope;
import Pk.Coupon;
import Tr.CouponsListChange;
import Ur.d;
import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.E;
import androidx.compose.runtime.F;
import androidx.compose.runtime.J;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h;
import com.fullstory.FS;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.meijer.mobile.core.models.coupon.CouponAd;
import dl.C13702d;
import ek.C13806b;
import fl.C14018c;
import gi.GoogleAdAnalytics;
import gi.GoogleAdData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.RangesKt;
import kotlin.sequences.SequencesKt;
import sr.p;

@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0018\n\u0002\u0010!\n\u0002\b\t\b\u0007\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u0001:\r_\u0012jg\u0017NfXP[0]RB?\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001b\u0010!\u001a\u00020\r2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e¢\u0006\u0004\b!\u0010\"J\u001d\u0010%\u001a\u00020\r2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u001eH\u0007¢\u0006\u0004\b%\u0010\"J\u0019\u0010'\u001a\u00020\r2\b\u0010&\u001a\u0004\u0018\u00010#H\u0007¢\u0006\u0004\b'\u0010(J\u001d\u0010+\u001a\u00020\r2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u001eH\u0007¢\u0006\u0004\b+\u0010\"J\u001b\u0010.\u001a\u00020\r2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020,0\u001e¢\u0006\u0004\b.\u0010\"J\u0015\u00100\u001a\u00020\u00142\u0006\u0010/\u001a\u00020\u001f¢\u0006\u0004\b0\u00101J\u001f\u00105\u001a\u00020\u00022\u0006\u00103\u001a\u0002022\u0006\u00104\u001a\u00020\u0014H\u0016¢\u0006\u0004\b5\u00106J\u001f\u00108\u001a\u00020\r2\u0006\u00107\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0014H\u0016¢\u0006\u0004\b8\u00109J\u0017\u0010:\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0014H\u0016¢\u0006\u0004\b:\u0010\u001dJ\u000f\u0010;\u001a\u00020\u0014H\u0016¢\u0006\u0004\b;\u0010<J\u0015\u0010=\u001a\u00020#2\u0006\u0010\u0019\u001a\u00020\u0014¢\u0006\u0004\b=\u0010>J\u001b\u0010B\u001a\u0004\u0018\u00010A2\b\u0010@\u001a\u0004\u0018\u00010?H\u0007¢\u0006\u0004\bB\u0010CJ\u0015\u0010E\u001a\u00020\u00142\u0006\u0010D\u001a\u00020A¢\u0006\u0004\bE\u0010FJ\u0017\u0010G\u001a\u00020\r2\b\u0010@\u001a\u0004\u0018\u00010?¢\u0006\u0004\bG\u0010HJ\u0017\u0010K\u001a\u00020\u00142\b\u0010J\u001a\u0004\u0018\u00010I¢\u0006\u0004\bK\u0010LJ\u0017\u0010N\u001a\u00020\r2\u0006\u0010M\u001a\u00020)H\u0001¢\u0006\u0004\bN\u0010OR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR$\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\b\b\u0010ZR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u0018\u0010a\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010`R\u001a\u0010d\u001a\b\u0012\u0004\u0012\u00020\u001f0b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010cR\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020)0b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010cR\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020#0b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010cR\u0014\u0010i\u001a\u00020\u00148\u0002X\u0082D¢\u0006\u0006\n\u0004\bg\u0010h¨\u0006k"}, d2 = {"LUr/d;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Landroidx/recyclerview/widget/RecyclerView$F;", "LQk/c;", "pageType", "LUr/d$f;", "listener", "", "isLoggedIn", "Ldl/d;", "couponsRepository", "Lkotlin/Function1;", "Lgi/a;", "", "onGoogleAdClicked", "<init>", "(LQk/c;LUr/d$f;ZLdl/d;Lkotlin/jvm/functions/Function1;)V", "notify", "l", "(Z)V", "", "from", "adjustment", "k", "(II)V", "position", "t", "(I)V", "q", "(I)I", "", "Lcom/meijer/mobile/core/models/coupon/CouponAd;", "ads", "u", "(Ljava/util/List;)V", "LUr/d$j;", "items", "x", "introItem", "w", "(LUr/d$j;)V", "Lgi/d;", "googleAds", "v", "LFq/c;", "shoppingList", "r", "ad", "n", "(Lcom/meijer/mobile/core/models/coupon/CouponAd;)I", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$F;", "holder", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$F;I)V", "getItemViewType", "getItemCount", "()I", "o", "(I)LUr/d$j;", "LPk/a;", "coupon", "LUr/d$l;", "s", "(LPk/a;)LUr/d$l;", "removal", "y", "(LUr/d$l;)I", "z", "(LPk/a;)V", "", "value", "p", "(Ljava/lang/Object;)I", "adData", "g", "(Lgi/d;Landroidx/compose/runtime/Composer;I)V", "a", "LQk/c;", "b", "LUr/d$f;", "getListener", "()LUr/d$f;", "setListener", "(LUr/d$f;)V", "c", "Z", "()Z", "d", "Ldl/d;", "e", "Lkotlin/jvm/functions/Function1;", "f", "LUr/d$j;", "intro", "", "Ljava/util/List;", "couponAds", "h", "i", "j", "I", "adInterval", "m", "coupon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class d extends RecyclerView.h<RecyclerView.F> {

    /* renamed from: l, reason: collision with root package name */
    public static final int f37649l = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Qk.c pageType;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private f listener;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean isLoggedIn;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final C13702d couponsRepository;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Function1<GoogleAdAnalytics, Unit> onGoogleAdClicked;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private j intro;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final List<CouponAd> couponAds;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final List<GoogleAdData> googleAds;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final List<j> items;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final int adInterval;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R$\u0010\u001b\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0017\u0010 \u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"LUr/d$a;", "LUr/d$k;", "Landroid/view/View;", "view", "LUr/d$f;", "listener", "<init>", "(Landroid/view/View;LUr/d$f;)V", "LUr/d$j;", "item", "", "d", "(LUr/d$j;)V", "adView", "g", "(Landroid/view/View;)V", "b", "LUr/d$f;", "getListener", "()LUr/d$f;", "Lcom/meijer/mobile/core/models/coupon/CouponAd;", "c", "Lcom/meijer/mobile/core/models/coupon/CouponAd;", "getAd", "()Lcom/meijer/mobile/core/models/coupon/CouponAd;", "setAd", "(Lcom/meijer/mobile/core/models/coupon/CouponAd;)V", "ad", "LRr/g;", "LRr/g;", "getBinding", "()LRr/g;", "binding", "coupon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends k {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final f listener;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private CouponAd ad;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final Rr.g binding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View view, f fVar) {
            super(view);
            Intrinsics.j(view, "view");
            this.listener = fVar;
            Rr.g gVarM0 = Rr.g.M0(view);
            Intrinsics.i(gVarM0, "bind(...)");
            this.binding = gVarM0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void h(a aVar, View adView) {
            Intrinsics.j(adView, "adView");
            aVar.g(adView);
        }

        @Override // Ur.d.k
        public void d(j item) {
            Intrinsics.j(item, "item");
            e(item);
            Object obj = item.value;
            Intrinsics.h(obj, "null cannot be cast to non-null type com.meijer.mobile.core.models.coupon.CouponAd");
            CouponAd couponAd = (CouponAd) obj;
            this.ad = couponAd;
            if ((couponAd != null ? couponAd.getImageURL() : null) != null) {
                AppCompatImageView viewAdImage = this.binding.f34018z;
                Intrinsics.i(viewAdImage, "viewAdImage");
                CouponAd couponAd2 = this.ad;
                C13806b.f(viewAdImage, couponAd2 != null ? couponAd2.getImageURL() : null, null, null, 6, null);
            }
            AppCompatImageView appCompatImageView = this.binding.f34018z;
            CouponAd couponAd3 = this.ad;
            Intrinsics.g(couponAd3);
            String imageDescription = couponAd3.getImageDescription();
            if (imageDescription == null) {
                CouponAd couponAd4 = this.ad;
                Intrinsics.g(couponAd4);
                imageDescription = couponAd4.getTitle();
            }
            appCompatImageView.setContentDescription(imageDescription);
            this.binding.f34018z.setOnClickListener(new View.OnClickListener() { // from class: Ur.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    d.a.h(this.f37647a, view);
                }
            });
        }

        public final void g(View adView) {
            Intrinsics.j(adView, "adView");
            f fVar = this.listener;
            if (fVar != null) {
                CouponAd couponAd = this.ad;
                Intrinsics.g(couponAd);
                fVar.E(couponAd, adView);
            }
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\"\u0010\u0017\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"LUr/d$c;", "LUr/d$k;", "Landroid/view/View;", "view", "", "introTitleResId", "introDescResId", "<init>", "(Landroid/view/View;II)V", "LUr/d$j;", "item", "", "d", "(LUr/d$j;)V", "b", "I", "c", "LRr/a;", "LRr/a;", "getBinding", "()LRr/a;", "setBinding", "(LRr/a;)V", "binding", "coupon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c extends k {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int introTitleResId;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final int introDescResId;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private Rr.a binding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(View view, int i10, int i11) {
            super(view);
            Intrinsics.j(view, "view");
            this.introTitleResId = i10;
            this.introDescResId = i11;
            Rr.a aVarM0 = Rr.a.M0(view);
            Intrinsics.i(aVarM0, "bind(...)");
            this.binding = aVarM0;
            TextView introTitle = aVarM0.f33999A;
            Intrinsics.i(introTitle, "introTitle");
            Aj.c.a(introTitle, true);
        }

        @Override // Ur.d.k
        public void d(j item) {
            Intrinsics.j(item, "item");
            e(item);
            this.binding.f33999A.setText(this.introTitleResId);
            this.binding.f34000z.setText(this.introDescResId);
        }
    }

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B+\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u000eJ\u000f\u0010\u0012\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0012\u0010\u000eJ\u0017\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\f¢\u0006\u0004\b\u001b\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010$R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R$\u00100\u001a\u0004\u0018\u00010)8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/¨\u00061"}, d2 = {"LUr/d$d;", "LUr/d$k;", "Landroid/view/View;", "view", "LQk/c;", "pageType", "LUr/d$f;", "listener", "", "isLoggedIn", "<init>", "(Landroid/view/View;LQk/c;LUr/d$f;Z)V", "", "k", "()V", "q", "p", "n", "m", "LUr/d$j;", "item", "d", "(LUr/d$j;)V", "", "titleLineCount", "o", "(I)V", "l", "b", "LQk/c;", "getPageType", "()LQk/c;", "c", "LUr/d$f;", "getListener", "()LUr/d$f;", "Z", "LRr/i;", "e", "LRr/i;", "binding", "LPk/a;", "f", "LPk/a;", "getCoupon", "()LPk/a;", "setCoupon", "(LPk/a;)V", "coupon", "coupon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Ur.d$d, reason: collision with other inner class name */
    public static final class C0826d extends k {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Qk.c pageType;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final f listener;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final boolean isLoggedIn;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final Rr.i binding;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private Coupon coupon;

        @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001JW\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Ur/d$d$a", "Landroid/view/View$OnLayoutChangeListener;", "Landroid/view/View;", "v", "", "left", "top", "right", "bottom", "oldLeft", "oldTop", "oldRight", "oldBottom", "", "onLayoutChange", "(Landroid/view/View;IIIIIIII)V", "coupon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ur.d$d$a */
        public static final class a implements View.OnLayoutChangeListener {
            a() {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View v10, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                Intrinsics.j(v10, "v");
                C0826d.this.binding.f34027F.removeOnLayoutChangeListener(this);
                C0826d c0826d = C0826d.this;
                c0826d.o(c0826d.binding.f34027F.getLineCount());
            }
        }

        public final void o(int titleLineCount) {
            if (titleLineCount < 2) {
                this.binding.f34023B.setMaxLines(3);
            } else {
                this.binding.f34023B.setMaxLines(2);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0826d(View view, Qk.c pageType, f fVar, boolean z10) {
            super(view);
            Intrinsics.j(view, "view");
            Intrinsics.j(pageType, "pageType");
            this.pageType = pageType;
            this.listener = fVar;
            this.isLoggedIn = z10;
            Rr.i iVarM0 = Rr.i.M0(view);
            Intrinsics.i(iVarM0, "bind(...)");
            this.binding = iVarM0;
            iVarM0.f34022A.setOnClickListener(new View.OnClickListener() { // from class: Ur.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    d.C0826d.h(this.f37696a, view2);
                }
            });
            iVarM0.f34029z.setOnClickListener(new View.OnClickListener() { // from class: Ur.f
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    d.C0826d.i(this.f37697a, view2);
                }
            });
        }

        private final void k() {
            try {
                ImageView couponImage = this.binding.f34026E;
                Intrinsics.i(couponImage, "couponImage");
                Coupon coupon = this.coupon;
                String imageURL = coupon != null ? coupon.getImageURL() : null;
                if (imageURL == null) {
                    imageURL = "";
                }
                C13806b.f(couponImage, imageURL, null, null, 6, null);
            } catch (IllegalArgumentException e10) {
                qw.a.INSTANCE.f(e10, "Could not load coupon", new Object[0]);
                FS.Resources_setImageResource(this.binding.f34026E, Cj.i.f4726O1);
            }
        }

        private final void m() {
            if (this.listener == null || getAdapterPosition() == -1) {
                return;
            }
            Coupon coupon = this.coupon;
            Intrinsics.g(coupon);
            if (C14018c.f(coupon)) {
                return;
            }
            List<? extends View> listS = CollectionsKt.s(this.binding.f34026E);
            ConstraintLayout couponContainer = this.binding.f34022A;
            Intrinsics.i(couponContainer, "couponContainer");
            listS.add(couponContainer);
            f fVar = this.listener;
            Coupon coupon2 = this.coupon;
            Intrinsics.g(coupon2);
            fVar.U(coupon2, listS);
        }

        private final void n() {
            Coupon coupon = this.coupon;
            Intrinsics.g(coupon);
            if (coupon.x()) {
                f fVar = this.listener;
                Intrinsics.g(fVar);
                Coupon coupon2 = this.coupon;
                Intrinsics.g(coupon2);
                fVar.y(coupon2);
                return;
            }
            Coupon coupon3 = this.coupon;
            Intrinsics.g(coupon3);
            coupon3.I(true);
            p();
            f fVar2 = this.listener;
            Intrinsics.g(fVar2);
            fVar2.d0(new CouponsListChange(CouponsListChange.a.f36744a, this.coupon));
            Coupon coupon4 = this.coupon;
            Intrinsics.g(coupon4);
            if (coupon4.getIsShowLargeImage()) {
                m();
            }
        }

        private final void p() {
            if (C14018c.g(this.coupon)) {
                this.binding.f34029z.setVisibility(4);
                return;
            }
            Coupon coupon = this.coupon;
            Intrinsics.g(coupon);
            if (coupon.x()) {
                this.binding.f34029z.setText(Nr.g.f22695j0);
                this.binding.f34029z.setBackgroundResource(Nr.c.f22613b);
                androidx.core.widget.k.p(this.binding.f34029z, Nr.h.f22729b);
            } else {
                this.binding.f34029z.setText(Nr.g.f22696k);
                this.binding.f34029z.setBackgroundResource(Nr.c.f22612a);
                androidx.core.widget.k.p(this.binding.f34029z, Nr.h.f22728a);
            }
            this.binding.f34029z.setVisibility(0);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0057  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private final void q() {
            /*
                Method dump skipped, instructions count: 258
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: Ur.d.C0826d.q():void");
        }

        @Override // Ur.d.k
        public void d(j item) {
            Intrinsics.j(item, "item");
            e(item);
            Object obj = item.value;
            Intrinsics.h(obj, "null cannot be cast to non-null type com.meijer.mobile.coupon.model.common.Coupon");
            this.coupon = (Coupon) obj;
            q();
            k();
        }

        public final void l() {
            if (this.isLoggedIn) {
                n();
                return;
            }
            f fVar = this.listener;
            if (fVar != null) {
                fVar.Y(Nr.g.f22706p);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void h(C0826d c0826d, View view) {
            c0826d.m();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void i(C0826d c0826d, View view) {
            c0826d.l();
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0010R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0012¨\u0006\u0013"}, d2 = {"LUr/d$e;", "Landroidx/recyclerview/widget/h$b;", "", "LUr/d$j;", "oldList", "newList", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "", "e", "()I", "d", "oldItemPosition", "newItemPosition", "", "b", "(II)Z", "a", "Ljava/util/List;", "coupon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class e extends h.b {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final List<j> oldList;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final List<j> newList;

        public e(List<j> oldList, List<j> newList) {
            Intrinsics.j(oldList, "oldList");
            Intrinsics.j(newList, "newList");
            this.oldList = oldList;
            this.newList = newList;
        }

        @Override // androidx.recyclerview.widget.h.b
        public boolean a(int oldItemPosition, int newItemPosition) {
            return Intrinsics.e(this.oldList.get(oldItemPosition), this.newList.get(newItemPosition));
        }

        @Override // androidx.recyclerview.widget.h.b
        public boolean b(int oldItemPosition, int newItemPosition) {
            return Intrinsics.e(this.oldList.get(oldItemPosition).value, this.newList.get(newItemPosition).value);
        }

        @Override // androidx.recyclerview.widget.h.b
        public int d() {
            return this.newList.size();
        }

        @Override // androidx.recyclerview.widget.h.b
        public int e() {
            return this.oldList.size();
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH&¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\nH&¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\n2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H&¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\u001b\u0010\u001cø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001dÀ\u0006\u0001"}, d2 = {"LUr/d$f;", "", "LTr/B;", "couponsListChange", "", "d0", "(LTr/B;)V", "LPk/a;", "coupon", "", "Landroid/view/View;", "transitionViews", "U", "(LPk/a;Ljava/util/List;)V", "Lcom/meijer/mobile/core/models/coupon/CouponAd;", "couponAd", "transitionView", "E", "(Lcom/meijer/mobile/core/models/coupon/CouponAd;Landroid/view/View;)V", "", "messageResourceId", "Y", "(I)V", "", "url", "k", "(Landroid/view/View;Ljava/lang/String;)V", "y", "(LPk/a;)V", "coupon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface f {
        void E(CouponAd couponAd, View transitionView);

        void U(Coupon coupon, List<? extends View> transitionViews);

        void Y(int messageResourceId);

        void d0(CouponsListChange couponsListChange);

        void k(View transitionView, String url);

        void y(Coupon coupon);
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LUr/d$g;", "Landroidx/recyclerview/widget/RecyclerView$F;", "Landroidx/compose/ui/platform/ComposeView;", "composeView", "<init>", "(LUr/d;Landroidx/compose/ui/platform/ComposeView;)V", "", "position", "", "b", "(I)V", "a", "Landroidx/compose/ui/platform/ComposeView;", "coupon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class g extends RecyclerView.F {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final ComposeView composeView;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ d f37675b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ d f37676a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f37677b;

            a(d dVar, int i10) {
                this.f37676a = dVar;
                this.f37677b = i10;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1715638757, i10, -1, "com.meijer.mobile.ui.coupon.legacy.adapters.CouponsAdapter.GoogleAdViewHolder.bind.<anonymous> (CouponsAdapter.kt:555)");
                }
                if (!this.f37676a.googleAds.isEmpty()) {
                    int i11 = this.f37677b;
                    if (i11 == 0) {
                        composer.startReplaceGroup(-538591738);
                        d dVar = this.f37676a;
                        dVar.g((GoogleAdData) dVar.googleAds.get(0), composer, GoogleAdData.f134248f);
                        composer.P();
                    } else if (i11 == 4) {
                        composer.startReplaceGroup(-538588954);
                        d dVar2 = this.f37676a;
                        dVar2.g((GoogleAdData) dVar2.googleAds.get(1), composer, GoogleAdData.f134248f);
                        composer.P();
                    } else if (i11 != 8) {
                        composer.startReplaceGroup(483750461);
                        composer.P();
                    } else {
                        composer.startReplaceGroup(-538586202);
                        d dVar3 = this.f37676a;
                        dVar3.g((GoogleAdData) dVar3.googleAds.get(2), composer, GoogleAdData.f134248f);
                        composer.P();
                    }
                }
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                a(composer, num.intValue());
                return Unit.f143329a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(d dVar, ComposeView composeView) {
            super(composeView);
            Intrinsics.j(composeView, "composeView");
            this.f37675b = dVar;
            this.composeView = composeView;
        }

        public final void b(int position) {
            this.composeView.setContent(ComposableLambdaKt.composableLambdaInstance(1715638757, true, new a(this.f37675b, position)));
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class h implements Function3<LocalThemeScope, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ GoogleAdData f37678a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ d f37679b;

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Ur/d$h$a", "Landroidx/compose/runtime/E;", "", "dispose", "()V", "runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        public static final class a implements E {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ AdManagerAdView f37680a;

            public a(AdManagerAdView adManagerAdView) {
                this.f37680a = adManagerAdView;
            }

            @Override // androidx.compose.runtime.E
            public void dispose() {
                Intrinsics.h(this.f37680a, "null cannot be cast to non-null type android.view.ViewGroup");
                AdManagerAdView adManagerAdView = this.f37680a;
                adManagerAdView.removeView(adManagerAdView);
            }
        }

        h(GoogleAdData googleAdData, d dVar) {
            this.f37678a = googleAdData;
            this.f37679b = dVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final E c(AdManagerAdView adManagerAdView, F DisposableEffect) {
            Intrinsics.j(DisposableEffect, "$this$DisposableEffect");
            return new a(adManagerAdView);
        }

        public final void b(LocalThemeScope AdsTheme, Composer composer, int i10) {
            int i11;
            Intrinsics.j(AdsTheme, "$this$AdsTheme");
            if ((i10 & 6) == 0) {
                i11 = ((i10 & 8) == 0 ? composer.V(AdsTheme) : composer.D(AdsTheme) ? 4 : 2) | i10;
            } else {
                i11 = i10;
            }
            if ((i11 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-379220300, i11, -1, "com.meijer.mobile.ui.coupon.legacy.adapters.CouponsAdapter.GoogleComposeAdView.<anonymous> (CouponsAdapter.kt:570)");
            }
            final AdManagerAdView adManagerAdViewS = p.S(this.f37678a, this.f37679b.onGoogleAdClicked, null, composer, GoogleAdData.f134248f, 4);
            if (adManagerAdViewS != null) {
                Unit unit = Unit.f143329a;
                composer.startReplaceGroup(5004770);
                boolean zD = composer.D(adManagerAdViewS);
                Object objB = composer.B();
                if (zD || objB == Composer.INSTANCE.a()) {
                    objB = new Function1() { // from class: Ur.g
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return d.h.c(adManagerAdViewS, (F) obj);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                J.c(unit, (Function1) objB, composer, 6);
                p.o(AdsTheme, null, adManagerAdViewS, composer, (i11 & 14) | LocalThemeScope.f17314g, 1);
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
            b(localThemeScope, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"LUr/d$i;", "LUr/d$k;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "LUr/d$j;", "item", "", "d", "(LUr/d$j;)V", "LRr/c;", "b", "LRr/c;", "getBinding", "()LRr/c;", "binding", "coupon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class i extends k {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Rr.c binding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(View view) {
            super(view);
            Intrinsics.j(view, "view");
            Rr.c cVarM0 = Rr.c.M0(view);
            Intrinsics.i(cVarM0, "bind(...)");
            this.binding = cVarM0;
        }

        @Override // Ur.d.k
        public void d(j item) {
            Intrinsics.j(item, "item");
            e(item);
            Object obj = item.value;
            Intrinsics.h(obj, "null cannot be cast to non-null type com.meijer.mobile.ui.coupon.legacy.adapters.CouponsAdapter.Section");
            Section section = (Section) obj;
            if (section.getNameResId() <= 0) {
                this.binding.f34005A.setText(section.getName());
            } else {
                this.binding.f34005A.setText(section.getNameResId());
            }
            TextView textView = this.binding.f34006z;
            StringCompanionObject stringCompanionObject = StringCompanionObject.f143748a;
            String str = String.format("(%s)", Arrays.copyOf(new Object[]{Integer.valueOf(section.getSize())}, 1));
            Intrinsics.i(str, "format(...)");
            textView.setText(str);
        }
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0007\u0018\u0000 (2\u00020\u0001:\u0001\u001dB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0006\u0010\rB\u001b\b\u0016\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0006\u0010\u0010B\u001b\b\u0016\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0006\u0010\u0013B\u0019\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0014B#\b\u0016\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0015B\u0011\b\u0012\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0006\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020\u00018\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0011\u0010&\u001a\u00020$8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010%R\u0011\u0010'\u001a\u00020$8F¢\u0006\u0006\u001a\u0004\b\"\u0010%R\u0011\u0010)\u001a\u00020$8F¢\u0006\u0006\u001a\u0004\b(\u0010%R\u0011\u0010*\u001a\u00020$8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010%R\u0011\u0010,\u001a\u00020$8F¢\u0006\u0006\u001a\u0004\b+\u0010%R\u0011\u0010.\u001a\u00020$8F¢\u0006\u0006\u001a\u0004\b-\u0010%¨\u0006/"}, d2 = {"LUr/d$j;", "", "LPk/a;", "coupon", "", "index", "<init>", "(LPk/a;I)V", "LUr/d$m;", "section", "(LUr/d$m;)V", "LVr/e;", "specialOffersViewModel", "(LVr/e;)V", "Lcom/meijer/mobile/core/models/coupon/CouponAd;", "ad", "(LUr/d$m;Lcom/meijer/mobile/core/models/coupon/CouponAd;)V", "Lgi/d;", "googleAd", "(LUr/d$m;Lgi/d;)V", "(LUr/d$m;LPk/a;)V", "(LUr/d$m;LPk/a;I)V", "", "type", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "a", "LUr/d$m;", "b", "Ljava/lang/Object;", "value", "c", "I", "", "()Z", "isCouponAd", "isGoogleAd", "d", "isIntro", "isCoupon", "e", "isSection", "f", "isSpecialOfferBanner", "coupon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class j {

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: e, reason: collision with root package name */
        public static final int f37683e = 8;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @JvmField
        public final Section section;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @JvmField
        public final Object value;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @JvmField
        public final int index;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LUr/d$j$a;", "", "<init>", "()V", "LUr/d$j;", "a", "()LUr/d$j;", "", "ITEM_TYPE_INTRO", "Ljava/lang/String;", "coupon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ur.d$j$a, reason: from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final j a() {
                return new j("intro", (DefaultConstructorMarker) null);
            }
        }

        public /* synthetic */ j(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public j(Coupon coupon, int i10) {
            this(null, coupon, i10);
            Intrinsics.j(coupon, "coupon");
        }

        public final boolean a() {
            return this.value instanceof Coupon;
        }

        public final boolean b() {
            return this.value instanceof CouponAd;
        }

        public final boolean c() {
            return this.value instanceof GoogleAdData;
        }

        public final boolean d() {
            Object obj = this.value;
            return (obj instanceof String) && obj == "intro";
        }

        public final boolean e() {
            return this.value instanceof Section;
        }

        public final boolean f() {
            return this.value instanceof Vr.e;
        }

        public int hashCode() {
            Section section = this.section;
            return ((((section != null ? section.hashCode() : 0) * 31) + this.value.hashCode()) * 31) + this.index;
        }

        public j(Section section) {
            Intrinsics.j(section, "section");
            this.section = section;
            this.value = section;
            this.index = -1;
        }

        public String toString() {
            if (b()) {
                return "Ad: " + this.value;
            }
            if (c()) {
                return "GoogleAd: " + this.value;
            }
            if (a()) {
                if (this.section == null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Coupon: ");
                    Object obj = this.value;
                    Intrinsics.h(obj, "null cannot be cast to non-null type com.meijer.mobile.coupon.model.common.Coupon");
                    sb2.append(((Coupon) obj).getTitle());
                    sb2.append(" (");
                    sb2.append(this.index);
                    sb2.append(')');
                    return sb2.toString();
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Coupon: ");
                sb3.append(this.section.getName());
                sb3.append('/');
                Object obj2 = this.value;
                Intrinsics.h(obj2, "null cannot be cast to non-null type com.meijer.mobile.coupon.model.common.Coupon");
                sb3.append(((Coupon) obj2).getTitle());
                sb3.append(" (");
                sb3.append(this.index);
                sb3.append('/');
                sb3.append(this.section.getSize());
                sb3.append(')');
                return sb3.toString();
            }
            if (e()) {
                return "Section: " + this.value;
            }
            if (d()) {
                return "Intro: " + this.value;
            }
            return "Unknown: " + this.value;
        }

        public j(Vr.e specialOffersViewModel) {
            Intrinsics.j(specialOffersViewModel, "specialOffersViewModel");
            this.section = null;
            this.value = specialOffersViewModel;
            this.index = 0;
        }

        public j(Section section, CouponAd ad2) {
            Intrinsics.j(ad2, "ad");
            this.section = section;
            this.value = ad2;
            this.index = -1;
        }

        public j(Section section, GoogleAdData googleAd) {
            Intrinsics.j(googleAd, "googleAd");
            this.section = section;
            this.value = googleAd;
            this.index = -1;
        }

        public j(Section section, Coupon coupon) {
            Intrinsics.j(section, "section");
            Intrinsics.j(coupon, "coupon");
            this.section = section;
            this.value = coupon;
            this.index = section.getSize();
            section.d(section.getSize() + 1);
        }

        public j(Section section, Coupon coupon, int i10) {
            Intrinsics.j(coupon, "coupon");
            this.section = section;
            this.value = coupon;
            this.index = i10;
        }

        private j(String str) {
            this.section = null;
            this.value = str;
            this.index = -1;
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\b'\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nR$\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\nR\u0011\u0010\u0007\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u0012"}, d2 = {"LUr/d$k;", "Landroidx/recyclerview/widget/RecyclerView$F;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "LUr/d$j;", "item", "", "d", "(LUr/d$j;)V", "a", "LUr/d$j;", "get_item", "()LUr/d$j;", "e", "_item", "c", "coupon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class k extends RecyclerView.F {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private j _item;

        public abstract void d(j item);

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(View itemView) {
            super(itemView);
            Intrinsics.j(itemView, "itemView");
        }

        public final j c() {
            j jVar = this._item;
            Intrinsics.g(jVar);
            return jVar;
        }

        protected final void e(j jVar) {
            this._item = jVar;
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0011\u0010\u0019\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0018¨\u0006\u001a"}, d2 = {"LUr/d$l;", "", "", "position", "LUr/d$j;", "item", "<init>", "(ILUr/d$j;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "c", "b", "LUr/d$j;", "()LUr/d$j;", "LPk/a;", "()LPk/a;", "coupon", "coupon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Ur.d$l, reason: from toString */
    public static final /* data */ class Removal {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final int position;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final j item;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Removal)) {
                return false;
            }
            Removal removal = (Removal) other;
            return this.position == removal.position && Intrinsics.e(this.item, removal.item);
        }

        public Removal(int i10, j item) {
            Intrinsics.j(item, "item");
            this.position = i10;
            this.item = item;
        }

        public final Coupon a() {
            Object obj = this.item.value;
            Intrinsics.h(obj, "null cannot be cast to non-null type com.meijer.mobile.coupon.model.common.Coupon");
            return (Coupon) obj;
        }

        /* renamed from: b, reason: from getter */
        public final j getItem() {
            return this.item;
        }

        /* renamed from: c, reason: from getter */
        public final int getPosition() {
            return this.position;
        }

        public int hashCode() {
            return (Integer.hashCode(this.position) * 31) + this.item.hashCode();
        }

        public String toString() {
            return "Removal(position=" + this.position + ", item=" + this.item + ')';
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B)\b\u0007\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\rR\"\u0010\u0006\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0016\u0010\r\"\u0004\b\u0017\u0010\t¨\u0006\u0018"}, d2 = {"LUr/d$m;", "", "", "name", "", "nameResId", "size", "<init>", "(Ljava/lang/String;II)V", "(I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "I", "c", "d", "coupon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Ur.d$m, reason: from toString */
    public static final /* data */ class Section {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String name;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final int nameResId;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private int size;

        @JvmOverloads
        public Section() {
            this(null, 0, 0, 7, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Section)) {
                return false;
            }
            Section section = (Section) other;
            return Intrinsics.e(this.name, section.name) && this.nameResId == section.nameResId && this.size == section.size;
        }

        @JvmOverloads
        public Section(String str, int i10, int i11) {
            this.name = str;
            this.nameResId = i10;
            this.size = i11;
        }

        /* renamed from: a, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* renamed from: b, reason: from getter */
        public final int getNameResId() {
            return this.nameResId;
        }

        /* renamed from: c, reason: from getter */
        public final int getSize() {
            return this.size;
        }

        public final void d(int i10) {
            this.size = i10;
        }

        public int hashCode() {
            String str = this.name;
            return ((((str == null ? 0 : str.hashCode()) * 31) + Integer.hashCode(this.nameResId)) * 31) + Integer.hashCode(this.size);
        }

        public String toString() {
            return "Section(name=" + this.name + ", nameResId=" + this.nameResId + ", size=" + this.size + ')';
        }

        public /* synthetic */ Section(String str, int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? 0 : i10, (i12 & 4) != 0 ? 0 : i11);
        }

        public Section(int i10) {
            this(null, i10, 0, 4, null);
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001d\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\r\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010!\u001a\u0004\u0018\u00010\u001e8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"LUr/d$n;", "LUr/d$k;", "Landroid/view/View;", "view", "LUr/d$f;", "listener", "Ldl/d;", "couponsRepository", "<init>", "(Landroid/view/View;LUr/d$f;Ldl/d;)V", "LUr/d$j;", "item", "", "d", "(LUr/d$j;)V", "k", "()V", "b", "Landroid/view/View;", "getView", "()Landroid/view/View;", "c", "LUr/d$f;", "getListener", "()LUr/d$f;", "LRr/e;", "LRr/e;", "getBinding", "()LRr/e;", "binding", "", "j", "()Ljava/lang/String;", "imageUrl", "coupon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class n extends k {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final View view;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final f listener;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final Rr.e binding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(View view, f fVar, C13702d couponsRepository) {
            super(view);
            Intrinsics.j(view, "view");
            Intrinsics.j(couponsRepository, "couponsRepository");
            this.view = view;
            this.listener = fVar;
            Rr.e eVarM0 = Rr.e.M0(view);
            Intrinsics.i(eVarM0, "bind(...)");
            this.binding = eVarM0;
            eVarM0.O0(new Vr.e(null, couponsRepository));
            eVarM0.f34011A.setOnClickListener(new View.OnClickListener() { // from class: Ur.h
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    d.n.h(this.f37699a, view2);
                }
            });
            eVarM0.f34012B.setOnClickListener(new View.OnClickListener() { // from class: Ur.i
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    d.n.i(this.f37700a, view2);
                }
            });
        }

        @Override // Ur.d.k
        public void d(j item) {
            Intrinsics.j(item, "item");
            e(item);
        }

        public final void k() {
            f fVar = this.listener;
            if (fVar != null) {
                ImageView specialOffersBannerImage = this.binding.f34011A;
                Intrinsics.i(specialOffersBannerImage, "specialOffersBannerImage");
                fVar.k(specialOffersBannerImage, j());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void h(n nVar, View view) {
            nVar.k();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void i(n nVar, View view) {
            nVar.k();
        }

        public final String j() {
            Object obj = c().value;
            Intrinsics.h(obj, "null cannot be cast to non-null type com.meijer.mobile.ui.coupon.legacy.specialoffers.SpecialOffersViewModel");
            return ((Vr.e) obj).getImageUrl();
        }
    }

    private final int q(int position) {
        Integer next;
        Iterator<Integer> it = RangesKt.t(position, 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (this.items.get(next.intValue()).e()) {
                break;
            }
        }
        Integer num = next;
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(Qk.c pageType, f fVar, boolean z10, C13702d couponsRepository, Function1<? super GoogleAdAnalytics, Unit> onGoogleAdClicked) {
        Intrinsics.j(pageType, "pageType");
        Intrinsics.j(couponsRepository, "couponsRepository");
        Intrinsics.j(onGoogleAdClicked, "onGoogleAdClicked");
        this.pageType = pageType;
        this.listener = fVar;
        this.isLoggedIn = z10;
        this.couponsRepository = couponsRepository;
        this.onGoogleAdClicked = onGoogleAdClicked;
        this.couponAds = new ArrayList();
        this.googleAds = new ArrayList();
        this.items = new ArrayList();
        this.adInterval = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(d dVar, GoogleAdData googleAdData, int i10, Composer composer, int i11) {
        dVar.g(googleAdData, composer, J0.a(i10 | 1));
        return Unit.f143329a;
    }

    private final void k(int from, int adjustment) {
        int size = this.items.size();
        while (from < size) {
            j jVar = this.items.get(from);
            if (jVar.a()) {
                List<j> list = this.items;
                Object obj = jVar.value;
                Intrinsics.h(obj, "null cannot be cast to non-null type com.meijer.mobile.coupon.model.common.Coupon");
                list.set(from, new j((Coupon) obj, jVar.index + adjustment));
                notifyItemChanged(from);
            }
            from++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Object] */
    @SuppressLint({"NotifyDataSetChanged"})
    private final void l(boolean notify) {
        Section next;
        List listX = SequencesKt.X(SequencesKt.U(SequencesKt.q(0, new Function1() { // from class: Ur.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return d.m(this.f37646a, ((Integer) obj).intValue());
            }
        }), RangesKt.k(3, this.googleAds.size())));
        int iIntValue = listX.isEmpty() ? 9 : ((Number) CollectionsKt.D0(listX)).intValue() + this.adInterval;
        ArrayList arrayList = new ArrayList();
        List<j> list = this.items;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (((j) obj).a()) {
                arrayList2.add(obj);
            }
        }
        List<j> list2 = this.items;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : list2) {
            if (((j) obj2).e()) {
                arrayList3.add(obj2);
            }
        }
        ArrayList arrayList4 = new ArrayList(CollectionsKt.x(arrayList3, 10));
        Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            Object obj3 = ((j) it.next()).value;
            Intrinsics.h(obj3, "null cannot be cast to non-null type com.meijer.mobile.ui.coupon.legacy.adapters.CouponsAdapter.Section");
            arrayList4.add((Section) obj3);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int size = listX.size() + arrayList2.size() + this.couponAds.size();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        Section section = null;
        for (int i14 = 0; i14 < size; i14++) {
            if (listX.contains(Integer.valueOf(i14)) && i10 < this.googleAds.size()) {
                arrayList.add(new j((Section) null, this.googleAds.get(i10)));
                i10++;
            } else if (i14 >= iIntValue && (i14 - iIntValue) % this.adInterval == 0 && i11 < this.couponAds.size()) {
                arrayList.add(new j((Section) null, this.couponAds.get(i11)));
                i11++;
            } else if (i12 < arrayList2.size()) {
                if (section == null || i13 >= section.getSize()) {
                    Iterator it2 = arrayList4.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            next = 0;
                            break;
                        }
                        next = it2.next();
                        Iterator it3 = it2;
                        if (Intrinsics.e((Section) next, ((j) arrayList2.get(i12)).section)) {
                            break;
                        } else {
                            it2 = it3;
                        }
                    }
                    section = next;
                    if (section != null && !linkedHashSet.contains(section)) {
                        arrayList.add(new j(section));
                        linkedHashSet.add(section);
                        i13 = 0;
                    }
                }
                arrayList.add(arrayList2.get(i12));
                i13++;
                i12++;
            }
        }
        this.items.clear();
        this.items.addAll(arrayList);
        if (this.intro != null && !this.items.isEmpty() && this.intro != this.items.get(0)) {
            List<j> list3 = this.items;
            j jVar = this.intro;
            Intrinsics.g(jVar);
            list3.add(0, jVar);
            if (notify) {
                notifyItemInserted(0);
            }
        } else if (this.intro == null && !this.items.isEmpty() && this.items.get(0).d()) {
            this.items.remove(0);
            if (notify) {
                notifyItemRemoved(0);
            }
        }
        if (notify) {
            notifyDataSetChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer m(d dVar, int i10) {
        return Integer.valueOf(i10 + dVar.adInterval);
    }

    public final void g(final GoogleAdData adData, Composer composer, final int i10) {
        int i11;
        Intrinsics.j(adData, "adData");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1650490011);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(adData) : composerStartRestartGroup.D(adData) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.D(this) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-1650490011, i11, -1, "com.meijer.mobile.ui.coupon.legacy.adapters.CouponsAdapter.GoogleComposeAdView (CouponsAdapter.kt:568)");
            }
            K.b(null, ComposableLambdaKt.c(-379220300, true, new h(adData, this), composerStartRestartGroup, 54), composerStartRestartGroup, 48, 1);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Ur.a
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return d.h(this.f37643a, adData, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: getItemCount */
    public int getTotalNumberOfTabs() {
        return this.items.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int position) {
        j jVar = this.items.get(position);
        if (jVar.d()) {
            return Nr.d.f22630o;
        }
        if (jVar.b()) {
            return Nr.d.f22628m;
        }
        if (jVar.e()) {
            return Nr.d.f22629n;
        }
        if (jVar.c()) {
            return 1;
        }
        return jVar.f() ? Nr.d.f22631p : Nr.e.f22636e;
    }

    public final int n(CouponAd ad2) {
        Intrinsics.j(ad2, "ad");
        return this.couponAds.indexOf(ad2);
    }

    public final j o(int position) {
        return this.items.get(position);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(RecyclerView.F holder, int position) {
        Intrinsics.j(holder, "holder");
        j jVar = (j) CollectionsKt.v0(this.items, position);
        if (jVar == null) {
            return;
        }
        if (holder instanceof g) {
            ((g) holder).b(position);
            return;
        }
        if (holder instanceof k) {
            ((k) holder).d(jVar);
            return;
        }
        qw.a.INSTANCE.z("CouponAdapter").d("Unknown or invalid item at position: " + position, new Object[0]);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public RecyclerView.F onCreateViewHolder(ViewGroup parent, int viewType) {
        Intrinsics.j(parent, "parent");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(parent.getContext());
        if (viewType == 1) {
            Context context = parent.getContext();
            Intrinsics.i(context, "getContext(...)");
            ComposeView composeView = new ComposeView(context, null, 0, 6, null);
            composeView.setBackgroundColor(parent.getContext().getColor(R.color.white));
            return new g(this, composeView);
        }
        if (viewType == Nr.d.f22630o) {
            View viewInflate = layoutInflaterFrom.inflate(Nr.e.f22632a, parent, false);
            Intrinsics.i(viewInflate, "inflate(...)");
            return new c(viewInflate, Nr.g.f22687f0, Nr.g.f22685e0);
        }
        if (viewType == Nr.d.f22628m) {
            View viewInflate2 = layoutInflaterFrom.inflate(Nr.e.f22635d, parent, false);
            Intrinsics.i(viewInflate2, "inflate(...)");
            return new a(viewInflate2, this.listener);
        }
        if (viewType == Nr.d.f22629n) {
            View viewInflate3 = layoutInflaterFrom.inflate(Nr.e.f22633b, parent, false);
            Intrinsics.i(viewInflate3, "inflate(...)");
            return new i(viewInflate3);
        }
        if (viewType == Nr.d.f22631p) {
            View viewInflate4 = layoutInflaterFrom.inflate(Nr.e.f22634c, parent, false);
            Intrinsics.i(viewInflate4, "inflate(...)");
            return new n(viewInflate4, this.listener, this.couponsRepository);
        }
        View viewInflate5 = layoutInflaterFrom.inflate(viewType, parent, false);
        Intrinsics.i(viewInflate5, "inflate(...)");
        return new C0826d(viewInflate5, this.pageType, this.listener, this.isLoggedIn);
    }

    public final int p(Object value) {
        Integer next;
        if (value == null) {
            return -1;
        }
        Iterator<Integer> it = CollectionsKt.n(this.items).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.e(this.items.get(next.intValue()).value, value)) {
                break;
            }
        }
        Integer num = next;
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    public final void r(List<ShoppingListItem> shoppingList) {
        boolean z10;
        Intrinsics.j(shoppingList, "shoppingList");
        int size = this.items.size();
        for (int i10 = 0; i10 < size; i10++) {
            j jVarO = o(i10);
            if (jVarO.a()) {
                Object obj = jVarO.value;
                Intrinsics.h(obj, "null cannot be cast to non-null type com.meijer.mobile.coupon.model.common.Coupon");
                Coupon coupon = (Coupon) obj;
                Iterator<ShoppingListItem> it = shoppingList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (Fq.d.b(it.next(), coupon)) {
                            z10 = true;
                            break;
                        }
                    } else {
                        z10 = false;
                        break;
                    }
                }
                if (coupon.getIsAddedToShoppingList() != z10) {
                    coupon.G(z10);
                    notifyItemChanged(i10);
                }
            }
        }
    }

    public final void u(List<CouponAd> ads) {
        Intrinsics.j(ads, "ads");
        this.couponAds.clear();
        this.couponAds.addAll(ads);
        l(true);
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void v(List<GoogleAdData> googleAds) {
        Intrinsics.j(googleAds, "googleAds");
        this.googleAds.addAll(googleAds);
        l(true);
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void w(j introItem) {
        this.intro = introItem;
        l(true);
        notifyDataSetChanged();
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void x(List<j> items) {
        Intrinsics.j(items, "items");
        h.e eVarB = androidx.recyclerview.widget.h.b(new e(this.items, items));
        Intrinsics.i(eVarB, "calculateDiff(...)");
        this.items.clear();
        this.items.addAll(items);
        eVarB.c(this);
    }

    public final int y(Removal removal) {
        Intrinsics.j(removal, "removal");
        int position = removal.getPosition();
        j item = removal.getItem();
        Section section = item.section;
        if (section == null) {
            this.items.add(position, item);
            notifyItemInserted(position);
            k(position, 1);
        } else if (section.getSize() == 1) {
            Section section2 = new Section(item.section.getName(), item.section.getNameResId(), 0, 4, null);
            this.items.add(position, new j(section2));
            notifyItemInserted(position);
            position++;
            List<j> list = this.items;
            Object obj = item.value;
            Intrinsics.h(obj, "null cannot be cast to non-null type com.meijer.mobile.coupon.model.common.Coupon");
            list.add(position, new j(section2, (Coupon) obj));
            notifyItemInserted(position);
        } else {
            this.items.add(position, item);
            notifyItemInserted(position);
            t(position);
        }
        l(true);
        return position;
    }

    private final void t(int position) {
        int iQ = q(position);
        Object obj = this.items.get(iQ).value;
        Intrinsics.h(obj, "null cannot be cast to non-null type com.meijer.mobile.ui.coupon.legacy.adapters.CouponsAdapter.Section");
        Section section = (Section) obj;
        Section section2 = new Section(section.getName(), section.getNameResId(), 0, 4, null);
        this.items.set(iQ, new j(section2));
        notifyItemChanged(iQ);
        int size = this.items.size();
        for (int i10 = iQ + 1; i10 < size; i10++) {
            j jVar = this.items.get(i10);
            if (jVar.a()) {
                List<j> list = this.items;
                Object obj2 = jVar.value;
                Intrinsics.h(obj2, "null cannot be cast to non-null type com.meijer.mobile.coupon.model.common.Coupon");
                list.set(i10, new j(section2, (Coupon) obj2));
                notifyItemChanged(i10);
            } else if (jVar.b()) {
                List<j> list2 = this.items;
                Object obj3 = jVar.value;
                Intrinsics.h(obj3, "null cannot be cast to non-null type com.meijer.mobile.core.models.coupon.CouponAd");
                list2.set(i10, new j(section2, (CouponAd) obj3));
                notifyItemChanged(i10);
            } else {
                return;
            }
        }
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final Removal s(Coupon coupon) {
        int iP = p(coupon);
        if (iP != -1) {
            List listM1 = CollectionsKt.m1(this.items);
            j jVarRemove = this.items.remove(iP);
            Section section = jVarRemove.section;
            if (section == null) {
                k(iP, -1);
            } else if (section.getSize() == 1) {
                this.items.remove(iP - 1);
            } else {
                t(iP - 1);
            }
            l(false);
            h.e eVarB = androidx.recyclerview.widget.h.b(new e(listM1, this.items));
            Intrinsics.i(eVarB, "calculateDiff(...)");
            eVarB.c(this);
            notifyItemRangeChanged(iP, this.items.size() - iP);
            return new Removal(iP, jVarRemove);
        }
        return null;
    }

    public final void z(Coupon coupon) {
        int iP = p(coupon);
        if (iP != -1) {
            j jVarO = o(iP);
            List<j> list = this.items;
            Section section = jVarO.section;
            Intrinsics.g(coupon);
            list.set(iP, new j(section, coupon, jVarO.index));
            notifyItemChanged(iP);
        }
    }
}
