package com.meijer.mobile.meijer.activity.substitution;

import Co.ProductFullDetails;
import Nn.F1;
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
import androidx.view.AbstractC6165l;
import androidx.view.C6136J;
import androidx.view.C6173t;
import androidx.view.InterfaceC6172s;
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
import ju.C15069d;
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
import mv.C15809k;
import mv.InterfaceC15783O;
import pv.InterfaceC16562g;
import tr.C17284b;

@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\b\u0001\u0018\u0000 \\2\u00020\u00012\u00020\u0002:\u0002$]B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J+\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0004J\u0017\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ/\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001e\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001f\u0010\u0004J\u001b\u0010$\u001a\u00020#2\n\u0010\"\u001a\u00060 j\u0002`!H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020\u000e2\b\u0010'\u001a\u0004\u0018\u00010&¢\u0006\u0004\b(\u0010)R\"\u00101\u001a\u00020*8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001b\u00107\u001a\u0002028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0018\u0010;\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010?\u001a\u00020<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u001c\u0010D\u001a\b\u0012\u0004\u0012\u00020A0@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u001e\u0010H\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\"\u0010P\u001a\u00020I8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\"\u0010X\u001a\u00020Q8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\u0014\u0010[\u001a\u0002088BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bY\u0010Z¨\u0006^"}, d2 = {"Lcom/meijer/mobile/meijer/activity/substitution/SuggestedProductFragment;", "Lcom/meijer/mobile/meijer/activity/fragment/MeijerFragment;", "Lcom/meijer/mobile/meijer/activity/substitution/P$a;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "onDestroyView", "Lcom/meijer/mobile/meijer/activity/substitution/H;", "item", "Z", "(Lcom/meijer/mobile/meijer/activity/substitution/H;)V", "LCo/h;", "productToAdd", "Lcom/meijer/mobile/core/design/widget/stepperview/a;", "controlState", "Landroid/graphics/Rect;", "stepperHitRect", "", "position", "Q0", "(LCo/h;Lcom/meijer/mobile/core/design/widget/stepperview/a;Landroid/graphics/Rect;I)V", "n0", "onResume", "", "Lcom/meijer/mobile/core/model/common/ResourceId;", "forProduct", "", "a", "(Ljava/lang/String;)Z", "Landroid/view/MotionEvent;", "ev", "X", "(Landroid/view/MotionEvent;)V", "LBl/g;", "f", "LBl/g;", "getFeatureEntryPoint", "()LBl/g;", "setFeatureEntryPoint", "(LBl/g;)V", "featureEntryPoint", "Lcom/meijer/mobile/meijer/activity/substitution/D;", "g", "Lkotlin/Lazy;", "E0", "()Lcom/meijer/mobile/meijer/activity/substitution/D;", "viewModel", "LNn/F1;", "h", "LNn/F1;", "_binding", "Lju/l;", "i", "Lju/l;", "suggestedItemsSection", "Lju/d;", "Lju/g;", "j", "Lju/d;", "suggestedProductsAdapter", "", "k", "Ljava/util/List;", "productSuggestions", "Lwr/f;", "l", "Lwr/f;", "D0", "()Lwr/f;", "setCartInteractor", "(Lwr/f;)V", "cartInteractor", "Lzl/k;", "m", "Lzl/k;", "getFeatureManager", "()Lzl/k;", "setFeatureManager", "(Lzl/k;)V", "featureManager", "C0", "()LNn/F1;", "binding", "n", "b", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class SuggestedProductFragment extends Hilt_SuggestedProductFragment implements P.a {

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: o, reason: collision with root package name */
    public static final int f113672o = 8;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public Bl.g featureEntryPoint;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private F1 _binding;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private C15069d<ju.g> suggestedProductsAdapter;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private List<SuggestedItemDecorator> productSuggestions;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    public wr.f cartInteractor;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public zl.k featureManager;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Lazy viewModel = X.b(this, Reflection.b(D.class), new d(this), new e(null, this), new f(this));

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private ju.l suggestedItemsSection = new ju.l();

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

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/meijer/mobile/meijer/activity/substitution/SuggestedProductFragment$b;", "Lju/h;", "Lju/g;", "", "isRadioButtonSelected", "Lkotlin/Function0;", "", "onItemSelected", "<init>", "(ZLkotlin/jvm/functions/Function0;)V", "", "j", "()I", "viewHolder", "position", "b", "(Lju/g;I)V", "e", "Z", "f", "Lkotlin/jvm/functions/Function0;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends ju.h<ju.g> {

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

        @Override // ju.h
        public void b(ju.g viewHolder, int position) {
            Intrinsics.j(viewHolder, "viewHolder");
            CheckableImageButton checkableImageButton = (CheckableImageButton) viewHolder.itemView.findViewById(T.f99832V1);
            checkableImageButton.setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.substitution.I
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SuggestedProductFragment.b.w(this.f113654a, view);
                }
            });
            checkableImageButton.setChecked(this.isRadioButtonSelected);
            ((MaterialCardView) viewHolder.itemView.findViewById(T.f100142x8)).setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.substitution.J
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SuggestedProductFragment.b.x(this.f113655a, view);
                }
            });
        }

        @Override // ju.h
        /* renamed from: j */
        public int getLayoutId() {
            return V.f100168A0;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.substitution.SuggestedProductFragment$onCreateView$2", f = "SuggestedProductFragment.kt", l = {BinsView.LABEL_WIDTH_DP}, m = "invokeSuspend")
    static final class c extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f113683a;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.substitution.SuggestedProductFragment$onCreateView$2$1", f = "SuggestedProductFragment.kt", l = {81}, m = "invokeSuspend")
        static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f113685a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ SuggestedProductFragment f113686b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.meijer.activity.substitution.SuggestedProductFragment$c$a$a, reason: collision with other inner class name */
            static final class C1796a<T> implements InterfaceC16562g {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ SuggestedProductFragment f113687a;

                C1796a(SuggestedProductFragment suggestedProductFragment) {
                    this.f113687a = suggestedProductFragment;
                }

                @Override // pv.InterfaceC16562g
                /* renamed from: d, reason: merged with bridge method [inline-methods] */
                public final Object emit(D.ViewState gVar, Continuation<? super Unit> continuation) {
                    this.f113687a.productSuggestions = gVar.f();
                    if (!gVar.f().isEmpty() || gVar.getLoadingState().getIsLoading()) {
                        FrameLayout noResultsView = this.f113687a.C0().f21342A;
                        Intrinsics.i(noResultsView, "noResultsView");
                        noResultsView.setVisibility(8);
                        RecyclerView suggestedItems = this.f113687a.C0().f21343B;
                        Intrinsics.i(suggestedItems, "suggestedItems");
                        suggestedItems.setVisibility(0);
                        List<SuggestedItemDecorator> listF = gVar.f();
                        SuggestedProductFragment suggestedProductFragment = this.f113687a;
                        ArrayList arrayList = new ArrayList(CollectionsKt.x(listF, 10));
                        Iterator<T> it = listF.iterator();
                        while (it.hasNext()) {
                            arrayList.add(new P((SuggestedItemDecorator) it.next(), suggestedProductFragment.getFeatureManager(), suggestedProductFragment));
                        }
                        final SuggestedProductFragment suggestedProductFragment2 = this.f113687a;
                        suggestedProductFragment2.suggestedItemsSection.R(arrayList);
                        if (suggestedProductFragment2.E0().getSubstitutionMode() == Pp.c.f26245a || suggestedProductFragment2.E0().getSubstitutionMode() == Pp.c.f26248d) {
                            suggestedProductFragment2.suggestedItemsSection.M(new b(gVar.getDoNotSubstituteSelected(), new Function0() { // from class: com.meijer.mobile.meijer.activity.substitution.K
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return SuggestedProductFragment.c.a.C1796a.g(suggestedProductFragment2);
                                }
                            }));
                        }
                    } else {
                        this.f113687a.C0().f21344z.setText(this.f113687a.E0().getSubstitutionMode() != Pp.c.f26247c ? C17284b.f163302U : C17284b.f163300T);
                        FrameLayout noResultsView2 = this.f113687a.C0().f21342A;
                        Intrinsics.i(noResultsView2, "noResultsView");
                        noResultsView2.setVisibility(0);
                        RecyclerView suggestedItems2 = this.f113687a.C0().f21343B;
                        Intrinsics.i(suggestedItems2, "suggestedItems");
                        suggestedItems2.setVisibility(8);
                        this.f113687a.suggestedItemsSection.t();
                    }
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit g(SuggestedProductFragment suggestedProductFragment) {
                    suggestedProductFragment.E0().W(D.b.c.f113490a);
                    return Unit.f143329a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(SuggestedProductFragment suggestedProductFragment, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f113686b = suggestedProductFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.f113686b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f113685a;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                } else {
                    ResultKt.b(obj);
                    pv.P<D.ViewState> pU = this.f113686b.E0().U();
                    C1796a c1796a = new C1796a(this.f113686b);
                    this.f113685a = 1;
                    if (pU.collect(c1796a, this) == objF) {
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
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((c) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f113683a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC6172s viewLifecycleOwner = SuggestedProductFragment.this.getViewLifecycleOwner();
                Intrinsics.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                AbstractC6165l.b bVar = AbstractC6165l.b.f55502d;
                a aVar = new a(SuggestedProductFragment.this, null);
                this.f113683a = 1;
                if (C6136J.b(viewLifecycleOwner, bVar, aVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class d extends Lambda implements Function0<g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Fragment f113688f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f113688f = fragment;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final g0 invoke() {
            return this.f113688f.requireActivity().getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class e extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f113689f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Fragment f113690g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Function0 function0, Fragment fragment) {
            super(0);
            this.f113689f = function0;
            this.f113690g = fragment;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f113689f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f113690g.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class f extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Fragment f113691f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Fragment fragment) {
            super(0);
            this.f113691f = fragment;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f113691f.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final F1 C0() {
        F1 f12 = this._binding;
        Intrinsics.g(f12);
        return f12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final D E0() {
        return (D) this.viewModel.getValue();
    }

    public final wr.f D0() {
        wr.f fVar = this.cartInteractor;
        if (fVar != null) {
            return fVar;
        }
        Intrinsics.x("cartInteractor");
        return null;
    }

    @Override // com.meijer.mobile.meijer.activity.substitution.P.a
    public void Q0(ProductFullDetails productToAdd, com.meijer.mobile.core.design.widget.stepperview.a controlState, Rect stepperHitRect, int position) {
        Intrinsics.j(productToAdd, "productToAdd");
        Intrinsics.j(controlState, "controlState");
        Intrinsics.j(stepperHitRect, "stepperHitRect");
        E0().W(new D.b.UpdateEntryAction(productToAdd, controlState.getValueState().getQuantity(), stepperHitRect, position));
    }

    @Override // com.meijer.mobile.meijer.activity.substitution.P.a
    public void Z(SuggestedItemDecorator item) {
        Intrinsics.j(item, "item");
        if (E0().getSubstitutionMode() == Pp.c.f26247c) {
            startActivity(Bl.g.t(getFeatureEntryPoint(), item.getProduct(), false, false, null, 12, null));
        } else {
            E0().V(item);
        }
    }

    @Override // com.meijer.mobile.meijer.activity.substitution.P.a
    public boolean a(String forProduct) {
        Intrinsics.j(forProduct, "forProduct");
        return !D0().x(forProduct);
    }

    public final Bl.g getFeatureEntryPoint() {
        Bl.g gVar = this.featureEntryPoint;
        if (gVar != null) {
            return gVar;
        }
        Intrinsics.x("featureEntryPoint");
        return null;
    }

    public final zl.k getFeatureManager() {
        zl.k kVar = this.featureManager;
        if (kVar != null) {
            return kVar;
        }
        Intrinsics.x("featureManager");
        return null;
    }

    @Override // com.meijer.mobile.meijer.activity.substitution.P.a
    public void n0(ProductFullDetails productToAdd, com.meijer.mobile.core.design.widget.stepperview.a controlState, Rect stepperHitRect, int position) {
        Intrinsics.j(productToAdd, "productToAdd");
        Intrinsics.j(controlState, "controlState");
        Intrinsics.j(stepperHitRect, "stepperHitRect");
        E0().W(new D.b.StepperStateChangedAction(productToAdd, controlState.getValueState().getQuantity(), stepperHitRect));
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.j(inflater, "inflater");
        this._binding = F1.M0(inflater, container, false);
        RecyclerView recyclerView = C0().f21343B;
        recyclerView.setAdapter(this.suggestedProductsAdapter);
        recyclerView.addItemDecoration(new androidx.recyclerview.widget.i(recyclerView.getContext(), 1));
        InterfaceC6172s viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C15809k.d(C6173t.a(viewLifecycleOwner), null, null, new c(null), 3, null);
        View root = C0().getRoot();
        Intrinsics.i(root, "getRoot(...)");
        return root;
    }

    public SuggestedProductFragment() {
        C15069d<ju.g> c15069d = new C15069d<>();
        c15069d.c(this.suggestedItemsSection);
        this.suggestedProductsAdapter = c15069d;
    }

    public final void X(MotionEvent ev2) {
        int x10;
        D dE0 = E0();
        int y10 = 0;
        if (ev2 != null) {
            x10 = (int) ev2.getX();
        } else {
            x10 = 0;
        }
        if (ev2 != null) {
            y10 = (int) ev2.getY();
        }
        dE0.W(new D.b.CollapseQuantityStepperAction(x10, y10));
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this._binding = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        E0().j0();
    }
}
