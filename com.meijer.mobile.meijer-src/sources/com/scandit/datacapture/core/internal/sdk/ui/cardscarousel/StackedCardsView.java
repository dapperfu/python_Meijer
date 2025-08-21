package com.scandit.datacapture.core.internal.sdk.ui.cardscarousel;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import com.scandit.datacapture.core.internal.sdk.ui.animation.AnimationSpec;
import com.scandit.datacapture.core.internal.sdk.ui.animation.AnimationSpecKt;
import com.scandit.datacapture.core.internal.sdk.ui.cardscarousel.CardSubView;
import com.scandit.datacapture.core.internal.sdk.ui.cardscarousel.CardsCarouselView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001:\u0001HB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000e\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J/\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010 \u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u0012¢\u0006\u0004\b \u0010!J>\u0010*\u001a\u00020\r2!\u0010'\u001a\u001d\u0012\u0013\u0012\u00110#¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020\r0\"2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\r0(¢\u0006\u0004\b*\u0010+JX\u00100\u001a\u00020\r2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020\u00062\b\b\u0002\u0010/\u001a\u00020\u00062!\u0010'\u001a\u001d\u0012\u0013\u0012\u00110#¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020\r0\"2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\r0(¢\u0006\u0004\b0\u00101J#\u00102\u001a\u00020\r2\u0006\u0010/\u001a\u00020\u00062\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\r0(¢\u0006\u0004\b2\u00103R*\u0010:\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R$\u0010B\u001a\u0004\u0018\u00010;8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u0014\u0010E\u001a\u00020\u00068@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bC\u0010DR\u0014\u0010G\u001a\u00020\u00068@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bF\u0010D¨\u0006I"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/ui/cardscarousel/StackedCardsView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "Lcom/scandit/datacapture/core/internal/sdk/ui/cardscarousel/CardData;", "newData", "", "setData", "(Ljava/util/List;)V", "Landroid/view/MotionEvent;", "ev", "", "onInterceptTouchEvent", "(Landroid/view/MotionEvent;)Z", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "childCount", "drawingPosition", "getChildDrawingOrder", "(II)I", "collapsed", "setCollapsed", "(Z)V", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "input", "onAnimationUpdate", "Lkotlin/Function0;", "onAnimationEnd", "expand", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "Lkotlin/ranges/IntRange;", "visibleIndices", "offsetTop", "indexToShowOnTop", "collapse", "(Lkotlin/ranges/IntRange;IILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "animateMoveItemOnTop", "(ILkotlin/jvm/functions/Function0;)V", "a", "Lkotlin/jvm/functions/Function0;", "getOnScrolledUp", "()Lkotlin/jvm/functions/Function0;", "setOnScrolledUp", "(Lkotlin/jvm/functions/Function0;)V", "onScrolledUp", "Lcom/scandit/datacapture/core/internal/sdk/ui/cardscarousel/CardsCarouselView$Listener;", "e", "Lcom/scandit/datacapture/core/internal/sdk/ui/cardscarousel/CardsCarouselView$Listener;", "getCardEventListener", "()Lcom/scandit/datacapture/core/internal/sdk/ui/cardscarousel/CardsCarouselView$Listener;", "setCardEventListener", "(Lcom/scandit/datacapture/core/internal/sdk/ui/cardscarousel/CardsCarouselView$Listener;)V", "cardEventListener", "getTargetOffsetWhenExpanding$scandit_capture_core", "()I", "targetOffsetWhenExpanding", "getTargetOffsetWhenCollapsing$scandit_capture_core", "targetOffsetWhenCollapsing", "com/scandit/datacapture/core/internal/sdk/ui/cardscarousel/z", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class StackedCardsView extends FrameLayout {

    @Deprecated
    public static final float ALPHA_STEP = 0.25f;

    @Deprecated
    public static final long ANIMATION_DURATION = 500;

    @Deprecated
    public static final float ELEVATION_STEP = 0.75f;

    @Deprecated
    public static final int MAX_CARD_COUNT = 3;

    @Deprecated
    public static final float SCALE_OUT_OF_BOUNDS_CARDS = 0.85f;

    @Deprecated
    public static final float SCALE_STEP = 0.05f;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private Function0 onScrolledUp;

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList f126608b;

    /* renamed from: c, reason: collision with root package name */
    private Animator f126609c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f126610d;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private CardsCarouselView.Listener cardEventListener;

    /* renamed from: f, reason: collision with root package name */
    private final z f126612f;

    /* renamed from: g, reason: collision with root package name */
    private final GestureDetector f126613g;

    /* renamed from: h, reason: collision with root package name */
    private int f126614h;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public StackedCardsView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.j(context, "context");
    }

    private final int a() {
        CardData cardData = (CardData) CollectionsKt.v0(this.f126608b, 0);
        if (cardData != null) {
            return cardData.getCardHeight();
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int childCount, int drawingPosition) {
        return (childCount - drawingPosition) - 1;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public StackedCardsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.j(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(List list) {
        int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
        CardsCarouselView.Companion companion = CardsCarouselView.INSTANCE;
        int iMin = Math.min(RangesKt.f((int) Math.ceil((companion.getSEPARATOR_HEIGHT$scandit_capture_core() + height) / (companion.getSEPARATOR_HEIGHT$scandit_capture_core() + a())), 0), list.size());
        int childCount = getChildCount() - iMin;
        if (childCount > 0) {
            removeViews(iMin, childCount);
        }
        boolean z10 = this.f126610d;
        for (int i10 = 0; i10 < iMin; i10++) {
            CardView cardViewA = a(i10);
            AnimationSpecKt.applySpec(cardViewA, z10 ? a(i10, iMin) : new AnimationSpec(1.0f, CardView.INSTANCE.getELEVATION$scandit_capture_core(), 1.0f, (i10 * (CardsCarouselView.INSTANCE.getSEPARATOR_HEIGHT$scandit_capture_core() + a())) + 0));
            cardViewA.setCardData((CardData) list.get(i10));
        }
    }

    public static /* synthetic */ void collapse$default(StackedCardsView stackedCardsView, IntRange intRange, int i10, int i11, Function1 function1, Function0 function0, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        stackedCardsView.collapse(intRange, i10, i11, function1, function0);
    }

    public final void animateMoveItemOnTop(int indexToShowOnTop, Function0<Unit> onAnimationEnd) {
        Intrinsics.j(onAnimationEnd, "onAnimationEnd");
        if (this.f126610d) {
            if (indexToShowOnTop == 0) {
                onAnimationEnd.invoke();
                return;
            }
            int iK = RangesKt.k(this.f126608b.size(), 3);
            CardView cardViewA = a(0);
            cardViewA.setCardData((CardData) this.f126608b.get(indexToShowOnTop));
            AnimationSpecKt.applySpec(cardViewA, new AnimationSpec(0.0f, CardView.INSTANCE.getELEVATION$scandit_capture_core(), 1.0f, (getHeight() - (a() * 2)) - (CardsCarouselView.INSTANCE.getSEPARATOR_HEIGHT$scandit_capture_core() * (iK + 1))));
            int size = this.f126608b.size();
            int i10 = 0;
            while (i10 < size) {
                int i11 = i10 + 1;
                CardView cardViewA2 = a(i11);
                cardViewA2.setCardData((CardData) this.f126608b.get(i10));
                AnimationSpecKt.applySpec(cardViewA2, a(i10, iK));
                i10 = i11;
            }
            IntRange intRangeX = RangesKt.x(0, getChildCount());
            ArrayList arrayList = new ArrayList(CollectionsKt.x(intRangeX, 10));
            Iterator<Integer> it = intRangeX.iterator();
            while (it.hasNext()) {
                int iNextInt = ((IntIterator) it).nextInt();
                View childAt = getChildAt(iNextInt);
                Intrinsics.h(childAt, "null cannot be cast to non-null type com.scandit.datacapture.core.internal.sdk.ui.cardscarousel.CardView");
                arrayList.add(AnimationSpecKt.interpolateWith((CardView) childAt, a(iNextInt, iK)));
            }
            a(arrayList, A.f126501a, onAnimationEnd);
        }
    }

    public final void collapse(IntRange visibleIndices, int offsetTop, int indexToShowOnTop, Function1<? super Float, Unit> onAnimationUpdate, Function0<Unit> onAnimationEnd) {
        Intrinsics.j(visibleIndices, "visibleIndices");
        Intrinsics.j(onAnimationUpdate, "onAnimationUpdate");
        Intrinsics.j(onAnimationEnd, "onAnimationEnd");
        if (this.f126610d) {
            return;
        }
        this.f126610d = true;
        int i10 = 0;
        boolean z10 = indexToShowOnTop != visibleIndices.getFirst();
        List listL1 = CollectionsKt.l1(visibleIndices);
        if (z10) {
            listL1.add(0, Integer.valueOf(indexToShowOnTop));
        }
        int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
        CardsCarouselView.Companion companion = CardsCarouselView.INSTANCE;
        int iMin = Math.min(RangesKt.f((int) Math.ceil((companion.getSEPARATOR_HEIGHT$scandit_capture_core() + height) / (companion.getSEPARATOR_HEIGHT$scandit_capture_core() + a())), 0), this.f126608b.size());
        ArrayList arrayList = new ArrayList(CollectionsKt.x(listL1, 10));
        for (Object obj : listL1) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.w();
            }
            int iIntValue = ((Number) obj).intValue();
            CardView cardViewA = a(i10);
            int i12 = z10 ? i10 - 1 : i10;
            cardViewA.setCardData((CardData) this.f126608b.get(iIntValue));
            AnimationSpecKt.applySpec(cardViewA, new AnimationSpec((i10 == 0 && z10) ? 0.0f : 1.0f, CardView.INSTANCE.getELEVATION$scandit_capture_core(), 1.0f, (i12 * (CardsCarouselView.INSTANCE.getSEPARATOR_HEIGHT$scandit_capture_core() + a())) + offsetTop));
            arrayList.add(AnimationSpecKt.interpolateWith(cardViewA, a(i10, iMin)));
            i10 = i11;
            z10 = z10;
        }
        a(arrayList, onAnimationUpdate, onAnimationEnd);
    }

    public final void expand(Function1<? super Float, Unit> onAnimationUpdate, Function0<Unit> onAnimationEnd) {
        Intrinsics.j(onAnimationUpdate, "onAnimationUpdate");
        Intrinsics.j(onAnimationEnd, "onAnimationEnd");
        if (this.f126610d) {
            this.f126610d = false;
            int targetOffsetWhenExpanding$scandit_capture_core = getTargetOffsetWhenExpanding$scandit_capture_core();
            IntRange intRangeX = RangesKt.x(0, getChildCount());
            ArrayList arrayList = new ArrayList(CollectionsKt.x(intRangeX, 10));
            Iterator<Integer> it = intRangeX.iterator();
            while (it.hasNext()) {
                int iNextInt = ((IntIterator) it).nextInt();
                View childAt = getChildAt(iNextInt);
                Intrinsics.h(childAt, "null cannot be cast to non-null type com.scandit.datacapture.core.internal.sdk.ui.cardscarousel.CardView");
                getChildCount();
                arrayList.add(AnimationSpecKt.interpolateWith((CardView) childAt, new AnimationSpec(1.0f, CardView.INSTANCE.getELEVATION$scandit_capture_core(), 1.0f, (iNextInt * (CardsCarouselView.INSTANCE.getSEPARATOR_HEIGHT$scandit_capture_core() + a())) + targetOffsetWhenExpanding$scandit_capture_core)));
            }
            a(arrayList, onAnimationUpdate, onAnimationEnd);
        }
    }

    public final CardsCarouselView.Listener getCardEventListener() {
        return this.cardEventListener;
    }

    public final Function0<Unit> getOnScrolledUp() {
        return this.onScrolledUp;
    }

    public final int getTargetOffsetWhenCollapsing$scandit_capture_core() {
        this.f126614h = Math.max(this.f126614h, getHeight());
        return Math.max(0, (((this.f126614h - a()) - (CardsCarouselView.INSTANCE.getSEPARATOR_HEIGHT$scandit_capture_core() * (RangesKt.k(this.f126608b.size(), 3) - 1))) - getPaddingBottom()) - getPaddingTop());
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent ev2) {
        Intrinsics.j(ev2, "ev");
        return this.f126613g.onTouchEvent(ev2);
    }

    @Override // android.view.View
    protected void onSizeChanged(int w10, int h10, int oldw, int oldh) {
        a(this.f126608b);
    }

    public final void setCardEventListener(CardsCarouselView.Listener listener) {
        this.cardEventListener = listener;
    }

    public final void setCollapsed(boolean collapsed) {
        this.f126610d = collapsed;
        a(this.f126608b);
    }

    public final void setData(List<? extends CardData> newData) {
        Intrinsics.j(newData, "newData");
        this.f126608b.clear();
        this.f126608b.addAll(newData);
        a(newData);
    }

    public final void setOnScrolledUp(Function0<Unit> function0) {
        this.onScrolledUp = function0;
    }

    public /* synthetic */ StackedCardsView(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    public final int getTargetOffsetWhenExpanding$scandit_capture_core() {
        int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
        CardsCarouselView.Companion companion = CardsCarouselView.INSTANCE;
        return Math.max(0, (companion.getSEPARATOR_HEIGHT$scandit_capture_core() + height) - ((companion.getSEPARATOR_HEIGHT$scandit_capture_core() + a()) * this.f126608b.size()));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public StackedCardsView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.j(context, "context");
        setClipChildren(false);
        setClipToPadding(false);
        setChildrenDrawingOrderEnabled(true);
        CardsCarouselView.Companion companion = CardsCarouselView.INSTANCE;
        setPadding(companion.getSEPARATOR_HEIGHT$scandit_capture_core(), companion.getSEPARATOR_HEIGHT$scandit_capture_core(), companion.getSEPARATOR_HEIGHT$scandit_capture_core(), companion.getSEPARATOR_HEIGHT$scandit_capture_core());
        this.f126608b = new ArrayList();
        this.f126610d = true;
        this.f126612f = new z(this);
        this.f126613g = new GestureDetector(context, new GestureDetector.SimpleOnGestureListener() { // from class: com.scandit.datacapture.core.internal.sdk.ui.cardscarousel.StackedCardsView$gestureDetector$1
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onScroll(MotionEvent e12, MotionEvent e22, float distanceX, float distanceY) {
                Function0<Unit> onScrolledUp;
                Intrinsics.j(e22, "e2");
                boolean z10 = distanceY > 0.0f;
                StackedCardsView stackedCardsView = this.f126617a;
                if (z10 && (onScrolledUp = stackedCardsView.getOnScrolledUp()) != null) {
                    onScrolledUp.invoke();
                }
                return z10;
            }
        });
    }

    private final void a(final ArrayList arrayList, final Function1 function1, final Function0 function0) {
        Animator animator = this.f126609c;
        if (animator != null) {
            animator.cancel();
        }
        this.f126609c = null;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(500L);
        valueAnimatorOfFloat.setInterpolator(new PathInterpolator(0.4f, 0.0f, 0.2f, 1.0f));
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.scandit.datacapture.core.internal.sdk.ui.cardscarousel.I
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                StackedCardsView.a(arrayList, function1, valueAnimator);
            }
        });
        valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: com.scandit.datacapture.core.internal.sdk.ui.cardscarousel.StackedCardsView$animateChanges$1$2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                Intrinsics.j(animation, "animation");
                this.f126615a.f126609c = null;
                function0.invoke();
                StackedCardsView stackedCardsView = this.f126615a;
                stackedCardsView.a(stackedCardsView.f126608b);
            }
        });
        valueAnimatorOfFloat.start();
        this.f126609c = valueAnimatorOfFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Collection animations, Function1 onAnimationUpdate, ValueAnimator it) {
        Intrinsics.j(animations, "$animations");
        Intrinsics.j(onAnimationUpdate, "$onAnimationUpdate");
        Intrinsics.j(it, "it");
        Object animatedValue = it.getAnimatedValue();
        Intrinsics.h(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        Float f10 = (Float) animatedValue;
        f10.getClass();
        Iterator it2 = animations.iterator();
        while (it2.hasNext()) {
            ((Function1) it2.next()).invoke(f10);
        }
        onAnimationUpdate.invoke(f10);
    }

    private final AnimationSpec a(int i10, int i11) {
        int iMin = Math.min(i11, 3);
        if (i10 < iMin) {
            int i12 = (iMin - 1) - i10;
            float f10 = i10;
            return new AnimationSpec(1.0f - (0.25f * f10), CardView.INSTANCE.getELEVATION$scandit_capture_core() - (0.75f * f10), 1.0f - (f10 * 0.05f), (((getHeight() - a()) - (CardsCarouselView.INSTANCE.getSEPARATOR_HEIGHT$scandit_capture_core() * i12)) - getPaddingBottom()) - getPaddingTop());
        }
        return new AnimationSpec(0.0f, 0.0f, 0.85f, (getHeight() - a()) - getPaddingBottom());
    }

    private final CardView a(int i10) {
        CardSubView textCardView;
        if (i10 < getChildCount()) {
            View childAt = getChildAt(i10);
            Intrinsics.h(childAt, "null cannot be cast to non-null type com.scandit.datacapture.core.internal.sdk.ui.cardscarousel.CardView");
            return (CardView) childAt;
        }
        Context context = getContext();
        Intrinsics.i(context, "getContext(...)");
        CardSubView.Companion companion = CardSubView.INSTANCE;
        Context context2 = getContext();
        Intrinsics.i(context2, "getContext(...)");
        Class<?> cls = CollectionsKt.s0(this.f126608b).getClass();
        if (Intrinsics.e(cls, EditableCardData.class)) {
            textCardView = new EditableCardView(context2, false, 2, null);
        } else {
            if (!Intrinsics.e(cls, TextCardData.class)) {
                throw new IllegalStateException("Unsupported configuration type");
            }
            textCardView = new TextCardView(context2);
        }
        textCardView.setListener(this.f126612f);
        CardView cardView = new CardView(context, textCardView);
        cardView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        cardView.setClickable(true);
        addView(cardView, Math.min(i10, getChildCount()));
        return cardView;
    }
}
