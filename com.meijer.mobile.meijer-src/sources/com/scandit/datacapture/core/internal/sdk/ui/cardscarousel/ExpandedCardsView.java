package com.scandit.datacapture.core.internal.sdk.ui.cardscarousel;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AbsListView;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.fullstory.FS;
import com.scandit.datacapture.core.internal.sdk.ui.cardscarousel.CardsCarouselView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0002DEB'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000f\u001a\u00020\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u001b\u001a\u00020\u000e2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001a\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ1\u0010 \u001a\u00020\u000e2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%R?\u00100\u001a\u001f\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b'\u0012\b\b(\u0012\u0004\b\b()\u0012\u0004\u0012\u00020\u000e\u0018\u00010&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R*\u00108\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u0001018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R$\u0010@\u001a\u0004\u0018\u0001098\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u0011\u0010C\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bA\u0010B¨\u0006F"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/ui/cardscarousel/ExpandedCardsView;", "Landroid/widget/ListView;", "Landroid/widget/AbsListView$OnScrollListener;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "Lcom/scandit/datacapture/core/internal/sdk/ui/cardscarousel/CardData;", "newData", "", "setData", "(Ljava/util/List;)V", "scrollX", "scrollY", "", "clampedX", "clampedY", "onOverScrolled", "(IIZZ)V", "Landroid/widget/AbsListView;", "view", "scrollState", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", "firstVisibleItem", "visibleItemCount", "totalItemCount", "onScroll", "(Landroid/widget/AbsListView;III)V", "Landroid/view/MotionEvent;", "ev", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "offset", "a", "Lkotlin/jvm/functions/Function1;", "getOnScrolled", "()Lkotlin/jvm/functions/Function1;", "setOnScrolled", "(Lkotlin/jvm/functions/Function1;)V", "onScrolled", "Lkotlin/Function0;", "b", "Lkotlin/jvm/functions/Function0;", "getOnSwipeDownFromTop", "()Lkotlin/jvm/functions/Function0;", "setOnSwipeDownFromTop", "(Lkotlin/jvm/functions/Function0;)V", "onSwipeDownFromTop", "Lcom/scandit/datacapture/core/internal/sdk/ui/cardscarousel/CardsCarouselView$Listener;", "e", "Lcom/scandit/datacapture/core/internal/sdk/ui/cardscarousel/CardsCarouselView$Listener;", "getCardEventListener", "()Lcom/scandit/datacapture/core/internal/sdk/ui/cardscarousel/CardsCarouselView$Listener;", "setCardEventListener", "(Lcom/scandit/datacapture/core/internal/sdk/ui/cardscarousel/CardsCarouselView$Listener;)V", "cardEventListener", "getOffsetOfFirstVisiblePosition", "()I", "offsetOfFirstVisiblePosition", "com/scandit/datacapture/core/internal/sdk/ui/cardscarousel/w", "CardListenerForwarder", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class ExpandedCardsView extends ListView implements AbsListView.OnScrollListener {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private Function1 onScrolled;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private Function0 onSwipeDownFromTop;

    /* renamed from: c, reason: collision with root package name */
    private final ArrayList f126589c;

    /* renamed from: d, reason: collision with root package name */
    private final w f126590d;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private CardsCarouselView.Listener cardEventListener;

    /* renamed from: f, reason: collision with root package name */
    private final CardListenerForwarder f126592f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f126593g;

    /* renamed from: h, reason: collision with root package name */
    private final ExpandedCardsView$gestureListener$1 f126594h;

    /* renamed from: i, reason: collision with root package name */
    private final Lazy f126595i;

    public final class CardListenerForwarder implements CardsCarouselView.Listener {
        public CardListenerForwarder() {
        }

        @Override // com.scandit.datacapture.core.internal.sdk.ui.cardscarousel.CardsCarouselView.Listener
        public final Integer iconResForTextChange(String oldText, String newText) {
            Intrinsics.j(oldText, "oldText");
            Intrinsics.j(newText, "newText");
            CardsCarouselView.Listener cardEventListener = ExpandedCardsView.this.getCardEventListener();
            if (cardEventListener != null) {
                return cardEventListener.iconResForTextChange(oldText, newText);
            }
            return null;
        }

        @Override // com.scandit.datacapture.core.internal.sdk.ui.cardscarousel.CardsCarouselView.Listener
        public final void onCardIconTapped(CardData cardData, Integer num, String str) {
            Intrinsics.j(cardData, "cardData");
            CardsCarouselView.Listener cardEventListener = ExpandedCardsView.this.getCardEventListener();
            if (cardEventListener != null) {
                cardEventListener.onCardIconTapped(cardData, num, str);
            }
        }

        @Override // com.scandit.datacapture.core.internal.sdk.ui.cardscarousel.CardsCarouselView.Listener
        public final void onCardTapped(CardData cardData) {
            Intrinsics.j(cardData, "cardData");
            CardsCarouselView.Listener cardEventListener = ExpandedCardsView.this.getCardEventListener();
            if (cardEventListener != null) {
                cardEventListener.onCardTapped(cardData);
            }
        }

        @Override // com.scandit.datacapture.core.internal.sdk.ui.cardscarousel.CardsCarouselView.Listener
        public final void onEditableFieldFinishedEditing(CardData cardData, EditText editText) {
            Intrinsics.j(cardData, "cardData");
            Intrinsics.j(editText, "editText");
            CardsCarouselView.Listener cardEventListener = ExpandedCardsView.this.getCardEventListener();
            if (cardEventListener != null) {
                cardEventListener.onEditableFieldFinishedEditing(cardData, editText);
            }
        }

        @Override // com.scandit.datacapture.core.internal.sdk.ui.cardscarousel.CardsCarouselView.Listener
        public final void onEditableFieldTapped(CardData cardData, EditText editText) {
            Intrinsics.j(cardData, "cardData");
            Intrinsics.j(editText, "editText");
            CardsCarouselView.Listener cardEventListener = ExpandedCardsView.this.getCardEventListener();
            if (cardEventListener != null) {
                cardEventListener.onEditableFieldTapped(cardData, editText);
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ExpandedCardsView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.j(context, "context");
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView view, int scrollState) {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ExpandedCardsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.j(context, "context");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0031, code lost:
    
        if (((int) r4.getY()) < r0.getTop()) goto L10;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean dispatchTouchEvent(android.view.MotionEvent r4) {
        /*
            r3 = this;
            java.lang.String r0 = "ev"
            kotlin.jvm.internal.Intrinsics.j(r4, r0)
            kotlin.Lazy r0 = r3.f126595i
            java.lang.Object r0 = r0.getValue()
            android.view.GestureDetector r0 = (android.view.GestureDetector) r0
            r0.onTouchEvent(r4)
            int r0 = r3.getChildCount()
            r1 = 0
            if (r0 != 0) goto L18
            goto L33
        L18:
            int r0 = r3.getFirstVisiblePosition()
            if (r0 <= 0) goto L1f
            goto L34
        L1f:
            android.view.View r0 = r3.getChildAt(r1)
            java.lang.String r2 = "getChildAt(...)"
            kotlin.jvm.internal.Intrinsics.i(r0, r2)
            float r2 = r4.getY()
            int r2 = (int) r2
            int r0 = r0.getTop()
            if (r2 >= r0) goto L34
        L33:
            return r1
        L34:
            boolean r4 = super.dispatchTouchEvent(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scandit.datacapture.core.internal.sdk.ui.cardscarousel.ExpandedCardsView.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public final CardsCarouselView.Listener getCardEventListener() {
        return this.cardEventListener;
    }

    public final Function1<Integer, Unit> getOnScrolled() {
        return this.onScrolled;
    }

    public final Function0<Unit> getOnSwipeDownFromTop() {
        return this.onSwipeDownFromTop;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {
        Function1 function1 = this.onScrolled;
        if (function1 != null) {
            int paddingTop = 0;
            if (getChildCount() != 0) {
                View childAt = getChildAt(0);
                Intrinsics.i(childAt, "getChildAt(...)");
                paddingTop = getPaddingTop() + ((childAt.getHeight() * getFirstVisiblePosition()) - childAt.getTop());
            }
            function1.invoke(Integer.valueOf(paddingTop));
        }
    }

    public final void setCardEventListener(CardsCarouselView.Listener listener) {
        this.cardEventListener = listener;
    }

    public final void setData(List<? extends CardData> newData) {
        Intrinsics.j(newData, "newData");
        this.f126589c.clear();
        this.f126589c.addAll(newData);
        this.f126590d.notifyDataSetChanged();
    }

    public final void setOnScrolled(Function1<? super Integer, Unit> function1) {
        this.onScrolled = function1;
    }

    public final void setOnSwipeDownFromTop(Function0<Unit> function0) {
        this.onSwipeDownFromTop = function0;
    }

    public /* synthetic */ ExpandedCardsView(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    public static final void access$bind(ExpandedCardsView expandedCardsView, CardView cardView, CardData cardData) {
        expandedCardsView.getClass();
        cardView.setCardData(cardData);
    }

    public final int getOffsetOfFirstVisiblePosition() {
        if (getChildCount() == 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        Intrinsics.i(childAt, "getChildAt(...)");
        return childAt.getTop() - getPaddingTop();
    }

    @Override // android.widget.AbsListView, android.view.View
    protected void onOverScrolled(int scrollX, int scrollY, boolean clampedX, boolean clampedY) {
        boolean z10;
        super.onOverScrolled(scrollX, scrollY, clampedX, clampedY);
        if (scrollY == 0 && clampedY) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f126593g = z10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r4v7, types: [com.scandit.datacapture.core.internal.sdk.ui.cardscarousel.ExpandedCardsView$gestureListener$1] */
    @JvmOverloads
    public ExpandedCardsView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.j(context, "context");
        this.f126589c = new ArrayList();
        w wVar = new w(this);
        this.f126590d = wVar;
        this.f126592f = new CardListenerForwarder();
        setAdapter((ListAdapter) wVar);
        setVerticalFadingEdgeEnabled(true);
        setClipChildren(false);
        setClipToPadding(false);
        setStackFromBottom(true);
        setVerticalScrollBarEnabled(false);
        setDivider(null);
        CardsCarouselView.Companion companion = CardsCarouselView.Companion;
        setDividerHeight(companion.getSEPARATOR_HEIGHT$scandit_capture_core());
        setSelector(FS.Resources_getDrawable(context, R.color.transparent));
        setFadingEdgeLength(companion.getSEPARATOR_HEIGHT$scandit_capture_core());
        setPadding(companion.getSEPARATOR_HEIGHT$scandit_capture_core(), companion.getSEPARATOR_HEIGHT$scandit_capture_core(), companion.getSEPARATOR_HEIGHT$scandit_capture_core(), companion.getSEPARATOR_HEIGHT$scandit_capture_core());
        setOnScrollListener(this);
        this.f126594h = new GestureDetector.SimpleOnGestureListener() { // from class: com.scandit.datacapture.core.internal.sdk.ui.cardscarousel.ExpandedCardsView$gestureListener$1
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onFling(MotionEvent e12, MotionEvent e22, float velocityX, float velocityY) {
                Function0<Unit> onSwipeDownFromTop;
                Intrinsics.j(e22, "e2");
                if (e12 != null) {
                    float x10 = e22.getX() - e12.getX();
                    float y10 = e22.getY() - e12.getY();
                    if (Math.abs(y10) > Math.abs(x10 * 2) && y10 > 0.0f && this.f126597a.f126593g && (onSwipeDownFromTop = this.f126597a.getOnSwipeDownFromTop()) != null) {
                        onSwipeDownFromTop.invoke();
                    }
                }
                return super.onFling(e12, e22, velocityX, velocityY);
            }
        };
        this.f126595i = LazyKt.b(new x(context, this));
    }
}
