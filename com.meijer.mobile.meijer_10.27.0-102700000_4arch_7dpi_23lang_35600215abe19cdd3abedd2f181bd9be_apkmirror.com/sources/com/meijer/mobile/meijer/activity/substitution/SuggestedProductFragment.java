package com.meijer.mobile.meijer.activity.substitution;

import Co.ProductFullDetails;
import Mn.F1;
import V2.CreationExtras;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.X;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.AbstractC6023l;
import androidx.view.C5994J;
import androidx.view.C6031t;
import androidx.view.InterfaceC6030s;
import androidx.view.f0;
import androidx.view.g0;
import com.google.android.material.card.MaterialCardView;
import com.meijer.mobile.core.design.widget.checkableimagebutton.CheckableImageButton;
import com.meijer.mobile.meijer.T;
import com.meijer.mobile.meijer.V;
import com.meijer.mobile.meijer.activity.substitution.D;
import com.meijer.mobile.meijer.activity.substitution.P;
import com.meijer.mobile.meijer.activity.substitution.SuggestedProductFragment;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinNothingValueException;
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
import qv.C16648k;
import qv.InterfaceC16622O;
import tr.C17135b;
import tv.InterfaceC17153g;

@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\b\u0001\u0018\u0000 \\2\u00020\u00012\u00020\u0002:\u0002$]B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J+\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0004J\u0017\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ/\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001e\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001f\u0010\u0004J\u001b\u0010$\u001a\u00020#2\n\u0010\"\u001a\u00060 j\u0002`!H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020\u000e2\b\u0010'\u001a\u0004\u0018\u00010&¢\u0006\u0004\b(\u0010)R\"\u00101\u001a\u00020*8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001b\u00107\u001a\u0002028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0018\u0010;\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010?\u001a\u00020<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u001c\u0010D\u001a\b\u0012\u0004\u0012\u00020A0@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u001e\u0010H\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\"\u0010P\u001a\u00020I8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\"\u0010X\u001a\u00020Q8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\u0014\u0010[\u001a\u0002088BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bY\u0010Z¨\u0006^"}, d2 = {"Lcom/meijer/mobile/meijer/activity/substitution/SuggestedProductFragment;", "Lcom/meijer/mobile/meijer/activity/fragment/MeijerFragment;", "Lcom/meijer/mobile/meijer/activity/substitution/P$a;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "onDestroyView", "Lcom/meijer/mobile/meijer/activity/substitution/H;", "item", "Y", "(Lcom/meijer/mobile/meijer/activity/substitution/H;)V", "LCo/h;", "productToAdd", "Lcom/meijer/mobile/core/design/widget/stepperview/a;", "controlState", "Landroid/graphics/Rect;", "stepperHitRect", "", "position", "P0", "(LCo/h;Lcom/meijer/mobile/core/design/widget/stepperview/a;Landroid/graphics/Rect;I)V", "k0", "onResume", "", "Lcom/meijer/mobile/core/model/common/ResourceId;", "forProduct", "", "a", "(Ljava/lang/String;)Z", "Landroid/view/MotionEvent;", "ev", "T", "(Landroid/view/MotionEvent;)V", "LAl/g;", "f", "LAl/g;", "getFeatureEntryPoint", "()LAl/g;", "setFeatureEntryPoint", "(LAl/g;)V", "featureEntryPoint", "Lcom/meijer/mobile/meijer/activity/substitution/D;", "g", "Lkotlin/Lazy;", "B0", "()Lcom/meijer/mobile/meijer/activity/substitution/D;", "viewModel", "LMn/F1;", "h", "LMn/F1;", "_binding", "Lnu/l;", "i", "Lnu/l;", "suggestedItemsSection", "Lnu/d;", "Lnu/g;", "j", "Lnu/d;", "suggestedProductsAdapter", "", "k", "Ljava/util/List;", "productSuggestions", "Lwr/f;", "l", "Lwr/f;", "A0", "()Lwr/f;", "setCartInteractor", "(Lwr/f;)V", "cartInteractor", "Lyl/k;", "m", "Lyl/k;", "getFeatureManager", "()Lyl/k;", "setFeatureManager", "(Lyl/k;)V", "featureManager", "z0", "()LMn/F1;", "binding", "n", "b", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class SuggestedProductFragment extends Hilt_SuggestedProductFragment implements P.a {

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: o, reason: collision with root package name */
    public static final int f112820o = 8;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public Al.g featureEntryPoint;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private F1 _binding;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private C15949d<nu.g> suggestedProductsAdapter;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private List<SuggestedItemDecorator> productSuggestions;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    public wr.f cartInteractor;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public yl.k featureManager;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Lazy viewModel = X.b(this, Reflection.b(D.class), new d(this), new e(null, this), new f(this));

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private nu.l suggestedItemsSection = new nu.l();

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/meijer/mobile/meijer/activity/substitution/SuggestedProductFragment$a;", "", "<init>", "()V", "Lcom/meijer/mobile/meijer/activity/substitution/SuggestedProductFragment;", "a", "()Lcom/meijer/mobile/meijer/activity/substitution/SuggestedProductFragment;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.substitution.SuggestedProductFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final SuggestedProductFragment a() {
            SuggestedProductFragment suggestedProductFragment = new SuggestedProductFragment();
            suggestedProductFragment.setArguments(new Bundle());
            return suggestedProductFragment;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/meijer/mobile/meijer/activity/substitution/SuggestedProductFragment$b;", "Lnu/h;", "Lnu/g;", "", "isRadioButtonSelected", "Lkotlin/Function0;", "", "onItemSelected", "<init>", "(ZLkotlin/jvm/functions/Function0;)V", "", "j", "()I", "viewHolder", "position", "b", "(Lnu/g;I)V", "e", "Z", "f", "Lkotlin/jvm/functions/Function0;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends nu.h<nu.g> {

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final boolean isRadioButtonSelected;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final Function0<Unit> onItemSelected;

        public b(boolean z10, Function0<Unit> onItemSelected) {
            Intrinsics.j(onItemSelected, "onItemSelected");
            this.isRadioButtonSelected = z10;
            this.onItemSelected = onItemSelected;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void w(b bVar, View view) {
            bVar.onItemSelected.invoke();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void x(b bVar, View view) {
            bVar.onItemSelected.invoke();
        }

        @Override // nu.h
        public void b(nu.g viewHolder, int position) {
            Intrinsics.j(viewHolder, "viewHolder");
            CheckableImageButton checkableImageButton = (CheckableImageButton) viewHolder.itemView.findViewById(T.f98976V1);
            checkableImageButton.setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.substitution.I
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SuggestedProductFragment.b.w(this.f112802a, view);
                }
            });
            checkableImageButton.setChecked(this.isRadioButtonSelected);
            ((MaterialCardView) viewHolder.itemView.findViewById(T.f99297y8)).setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.substitution.J
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SuggestedProductFragment.b.x(this.f112803a, view);
                }
            });
        }

        @Override // nu.h
        /* renamed from: j */
        public int getLayoutId() {
            return V.f99312A0;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.substitution.SuggestedProductFragment$onCreateView$2", f = "SuggestedProductFragment.kt", l = {BinsView.LABEL_WIDTH_DP}, m = "invokeSuspend")
    static final class c extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f112831a;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.substitution.SuggestedProductFragment$onCreateView$2$1", f = "SuggestedProductFragment.kt", l = {81}, m = "invokeSuspend")
        static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f112833a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ SuggestedProductFragment f112834b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.meijer.activity.substitution.SuggestedProductFragment$c$a$a, reason: collision with other inner class name */
            static final class C1788a<T> implements InterfaceC17153g {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ SuggestedProductFragment f112835a;

                C1788a(SuggestedProductFragment suggestedProductFragment) {
                    this.f112835a = suggestedProductFragment;
                }

                @Override // tv.InterfaceC17153g
                /* renamed from: d, reason: merged with bridge method [inline-methods] */
                public final Object emit(D.ViewState gVar, Continuation<? super Unit> continuation) {
                    this.f112835a.productSuggestions = gVar.f();
                    if (!gVar.f().isEmpty() || gVar.getLoadingState().getIsLoading()) {
                        FrameLayout noResultsView = this.f112835a.z0().f20010A;
                        Intrinsics.i(noResultsView, "noResultsView");
                        noResultsView.setVisibility(8);
                        RecyclerView suggestedItems = this.f112835a.z0().f20011B;
                        Intrinsics.i(suggestedItems, "suggestedItems");
                        suggestedItems.setVisibility(0);
                        List<SuggestedItemDecorator> listF = gVar.f();
                        SuggestedProductFragment suggestedProductFragment = this.f112835a;
                        ArrayList arrayList = new ArrayList(CollectionsKt.x(listF, 10));
                        Iterator<T> it = listF.iterator();
                        while (it.hasNext()) {
                            arrayList.add(new P((SuggestedItemDecorator) it.next(), suggestedProductFragment.getFeatureManager(), suggestedProductFragment));
                        }
                        final SuggestedProductFragment suggestedProductFragment2 = this.f112835a;
                        suggestedProductFragment2.suggestedItemsSection.R(arrayList);
                        if (suggestedProductFragment2.B0().getSubstitutionMode() == Pp.c.f28363a || suggestedProductFragment2.B0().getSubstitutionMode() == Pp.c.f28366d) {
                            suggestedProductFragment2.suggestedItemsSection.M(new b(gVar.getDoNotSubstituteSelected(), new Function0() { // from class: com.meijer.mobile.meijer.activity.substitution.K
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return SuggestedProductFragment.c.a.C1788a.g(suggestedProductFragment2);
                                }
                            }));
                        }
                    } else {
                        this.f112835a.z0().f20012z.setText(this.f112835a.B0().getSubstitutionMode() != Pp.c.f28365c ? C17135b.f162002U : C17135b.f162000T);
                        FrameLayout noResultsView2 = this.f112835a.z0().f20010A;
                        Intrinsics.i(noResultsView2, "noResultsView");
                        noResultsView2.setVisibility(0);
                        RecyclerView suggestedItems2 = this.f112835a.z0().f20011B;
                        Intrinsics.i(suggestedItems2, "suggestedItems");
                        suggestedItems2.setVisibility(8);
                        this.f112835a.suggestedItemsSection.t();
                    }
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit g(SuggestedProductFragment suggestedProductFragment) {
                    suggestedProductFragment.B0().W(D.b.c.f112638a);
                    return Unit.f142422a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(SuggestedProductFragment suggestedProductFragment, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f112834b = suggestedProductFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.f112834b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f112833a;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                } else {
                    ResultKt.b(obj);
                    tv.P<D.ViewState> pU = this.f112834b.B0().U();
                    C1788a c1788a = new C1788a(this.f112834b);
                    this.f112833a = 1;
                    if (pU.collect(c1788a, this) == objF) {
                        return objF;
                    }
                }
                throw new KotlinNothingValueException();
            }
        }

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SuggestedProductFragment.this.new c(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((c) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f112831a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC6030s viewLifecycleOwner = SuggestedProductFragment.this.getViewLifecycleOwner();
                Intrinsics.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                AbstractC6023l.b bVar = AbstractC6023l.b.f55278d;
                a aVar = new a(SuggestedProductFragment.this, null);
                this.f112831a = 1;
                if (C5994J.b(viewLifecycleOwner, bVar, aVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class d extends Lambda implements Function0<g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Fragment f112836f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f112836f = fragment;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final g0 invoke() {
            return this.f112836f.requireActivity().getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class e extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f112837f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Fragment f112838g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Function0 function0, Fragment fragment) {
            super(0);
            this.f112837f = function0;
            this.f112838g = fragment;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f112837f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f112838g.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class f extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Fragment f112839f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Fragment fragment) {
            super(0);
            this.f112839f = fragment;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f112839f.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final D B0() {
        return (D) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final F1 z0() {
        F1 f12 = this._binding;
        Intrinsics.g(f12);
        return f12;
    }

    public final wr.f A0() {
        wr.f fVar = this.cartInteractor;
        if (fVar != null) {
            return fVar;
        }
        Intrinsics.y("cartInteractor");
        return null;
    }

    @Override // com.meijer.mobile.meijer.activity.substitution.P.a
    public void P0(ProductFullDetails productToAdd, com.meijer.mobile.core.design.widget.stepperview.a controlState, Rect stepperHitRect, int position) {
        Intrinsics.j(productToAdd, "productToAdd");
        Intrinsics.j(controlState, "controlState");
        Intrinsics.j(stepperHitRect, "stepperHitRect");
        B0().W(new D.b.UpdateEntryAction(productToAdd, controlState.getValueState().getQuantity(), stepperHitRect, position));
    }

    @Override // com.meijer.mobile.meijer.activity.substitution.P.a
    public void Y(SuggestedItemDecorator item) {
        Intrinsics.j(item, "item");
        if (B0().getSubstitutionMode() == Pp.c.f28365c) {
            startActivity(Al.g.t(getFeatureEntryPoint(), item.getProduct(), false, false, null, 12, null));
        } else {
            B0().V(item);
        }
    }

    @Override // com.meijer.mobile.meijer.activity.substitution.P.a
    public boolean a(String forProduct) {
        Intrinsics.j(forProduct, "forProduct");
        return !A0().x(forProduct);
    }

    public final Al.g getFeatureEntryPoint() {
        Al.g gVar = this.featureEntryPoint;
        if (gVar != null) {
            return gVar;
        }
        Intrinsics.y("featureEntryPoint");
        return null;
    }

    public final yl.k getFeatureManager() {
        yl.k kVar = this.featureManager;
        if (kVar != null) {
            return kVar;
        }
        Intrinsics.y("featureManager");
        return null;
    }

    @Override // com.meijer.mobile.meijer.activity.substitution.P.a
    public void k0(ProductFullDetails productToAdd, com.meijer.mobile.core.design.widget.stepperview.a controlState, Rect stepperHitRect, int position) {
        Intrinsics.j(productToAdd, "productToAdd");
        Intrinsics.j(controlState, "controlState");
        Intrinsics.j(stepperHitRect, "stepperHitRect");
        B0().W(new D.b.StepperStateChangedAction(productToAdd, controlState.getValueState().getQuantity(), stepperHitRect));
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.j(inflater, "inflater");
        this._binding = F1.K0(inflater, container, false);
        RecyclerView recyclerView = z0().f20011B;
        recyclerView.setAdapter(this.suggestedProductsAdapter);
        recyclerView.addItemDecoration(new androidx.recyclerview.widget.i(recyclerView.getContext(), 1));
        InterfaceC6030s viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C16648k.d(C6031t.a(viewLifecycleOwner), null, null, new c(null), 3, null);
        View root = z0().getRoot();
        Intrinsics.i(root, "getRoot(...)");
        return root;
    }

    public SuggestedProductFragment() {
        C15949d<nu.g> c15949d = new C15949d<>();
        c15949d.c(this.suggestedItemsSection);
        this.suggestedProductsAdapter = c15949d;
    }

    public final void T(MotionEvent ev2) {
        int x10;
        D dB0 = B0();
        int y10 = 0;
        if (ev2 != null) {
            x10 = (int) ev2.getX();
        } else {
            x10 = 0;
        }
        if (ev2 != null) {
            y10 = (int) ev2.getY();
        }
        dB0.W(new D.b.CollapseQuantityStepperAction(x10, y10));
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this._binding = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        B0().j0();
    }
}
