package com.bazaarvoice.bvandroidsdk;

import P6.d;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.Display;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bazaarvoice.bvandroidsdk.CurationsInfiniteContract;
import java.util.List;

/* loaded from: classes4.dex */
public class CurationsInfiniteRecyclerView extends BVRecyclerView {
    private static final int DEFAULT_HEIGHT_RATIO = 1;
    private static final int DEFAULT_MAX_FEED_ITEM_COUNT = 360430;
    private static final int DEFAULT_ORIENTATION = 1;
    private static final int DEFAULT_PAGE_SIZE = 100;
    private static final boolean DEFAULT_REVERSE_LAYOUT = false;
    private static final int DEFAULT_SPAN_COUNT = 1;
    private static final int DEFAULT_WIDTH_RATIO = 1;
    private static final String WIDGET_ID = "CurationsInfiniteRecyclerView";
    private BVCurations curations;
    private CurationsAnalyticsManager curationsAnalyticsManager;
    private CurationsInfiniteAdapter curationsInfiniteAdapter;
    private OnFeedItemClickListener feedItemClickListener;
    private CurationsImageLoader imageLoader;
    private OnPageLoadListener pageLoadListener;
    private CurationsInfiniteContract.Presenter presenter;
    private CurationsFeedRequest request;
    private CurationsViewDelegate viewDelegate;
    private CurationsViewPropDelegate viewPropDelegate;

    private static final class CurationsViewDelegate implements CurationsInfiniteContract.View {
        private CurationsInfiniteAdapter curationsInfiniteAdapter;

        private CurationsViewDelegate() {
        }

        @Override // com.bazaarvoice.bvandroidsdk.CurationsInfiniteContract.View
        public void addFeedItems(List<CurationsFeedItem> list) {
            this.curationsInfiniteAdapter.update(list);
        }

        public void setCurationsInfiniteAdapter(CurationsInfiniteAdapter curationsInfiniteAdapter) {
            this.curationsInfiniteAdapter = curationsInfiniteAdapter;
        }
    }

    private static class CurationsViewPropDelegate implements CurationsInfiniteContract.ViewProps {
        private int curationCellHeightRatio;
        private int curationCellWidthRatio;
        private int curationMaxFeedItemCount;
        private int curationOrientation;
        private int curationPageSize;
        private boolean curationReverseLayout;
        private int curationSpanCount;
        private Point screenDimens;
        private Point viewDimens;

        private CurationsViewPropDelegate() {
        }

        @Override // com.bazaarvoice.bvandroidsdk.CurationsInfiniteContract.ViewProps
        public int getCurationCellHeightRatio() {
            return this.curationCellHeightRatio;
        }

        @Override // com.bazaarvoice.bvandroidsdk.CurationsInfiniteContract.ViewProps
        public int getCurationCellWidthRatio() {
            return this.curationCellWidthRatio;
        }

        @Override // com.bazaarvoice.bvandroidsdk.CurationsInfiniteContract.ViewProps
        public int getCurationMaxFeedItemCount() {
            return this.curationMaxFeedItemCount;
        }

        @Override // com.bazaarvoice.bvandroidsdk.CurationsInfiniteContract.ViewProps
        public int getCurationOrientation() {
            return this.curationOrientation;
        }

        @Override // com.bazaarvoice.bvandroidsdk.CurationsInfiniteContract.ViewProps
        public int getCurationPageSize() {
            return this.curationPageSize;
        }

        @Override // com.bazaarvoice.bvandroidsdk.CurationsInfiniteContract.ViewProps
        public int getCurationSpanCount() {
            return this.curationSpanCount;
        }

        @Override // com.bazaarvoice.bvandroidsdk.CurationsInfiniteContract.ViewProps
        public Point getScreenDimens() {
            return this.screenDimens;
        }

        @Override // com.bazaarvoice.bvandroidsdk.CurationsInfiniteContract.ViewProps
        public Point getViewDimens() {
            return this.viewDimens;
        }

        @Override // com.bazaarvoice.bvandroidsdk.CurationsInfiniteContract.ViewProps
        public boolean isCurationReverseLayout() {
            return this.curationReverseLayout;
        }

        public void setCurationCellHeightRatio(int i10) {
            this.curationCellHeightRatio = i10;
        }

        public void setCurationCellWidthRatio(int i10) {
            this.curationCellWidthRatio = i10;
        }

        public void setCurationMaxFeedItemCount(int i10) {
            this.curationMaxFeedItemCount = i10;
        }

        public void setCurationOrientation(int i10) {
            this.curationOrientation = i10;
        }

        public void setCurationPageSize(int i10) {
            this.curationPageSize = i10;
        }

        public void setCurationReverseLayout(boolean z10) {
            this.curationReverseLayout = z10;
        }

        public void setCurationSpanCount(int i10) {
            this.curationSpanCount = i10;
        }

        public void setScreenDimens(Point point) {
            this.screenDimens = point;
        }

        public void setViewDimens(Point point) {
            this.viewDimens = point;
        }
    }

    static final class ImageSize {
        private final int heightPixels;
        private final int widthPixels;

        int getHeightPixels() {
            return this.heightPixels;
        }

        int getWidthPixels() {
            return this.widthPixels;
        }

        ImageSize(int i10, int i11) {
            this.widthPixels = i10;
            this.heightPixels = i11;
        }
    }

    public interface OnFeedItemClickListener {
        void onClick(CurationsFeedItem curationsFeedItem);
    }

    public interface OnPageLoadListener {
        void onPageLoadFailure(int i10, Throwable th2);

        void onPageLoadSuccess(int i10, int i11);
    }

    public CurationsInfiniteRecyclerView(Context context) {
        super(context);
    }

    private static class CurationsScrollListener extends RecyclerView.u {
        private static final String TAG = "CurScrollListener";
        private final LinearLayoutManager linearLayoutManager;
        private final CurationsInfiniteContract.Presenter presenter;

        CurationsScrollListener(LinearLayoutManager linearLayoutManager, CurationsInfiniteContract.Presenter presenter) {
            this.linearLayoutManager = linearLayoutManager;
            this.presenter = presenter;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void onScrollStateChanged(RecyclerView recyclerView, int i10) {
            super.onScrollStateChanged(recyclerView, i10);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void onScrolled(RecyclerView recyclerView, int i10, int i11) {
            super.onScrolled(recyclerView, i10, i11);
            if (this.linearLayoutManager.F2() == 1) {
                i10 = i11;
            }
            this.presenter.onScroll(i10, this.linearLayoutManager.u2());
        }
    }

    public CurationsInfiniteRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private String getExternalId() {
        CurationsFeedRequest curationsFeedRequest = this.request;
        return curationsFeedRequest == null ? "" : curationsFeedRequest.externalId;
    }

    private static Point getScreenDimensions(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        return point;
    }

    private void parseAttributes(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d.f25699x);
        int integer = typedArrayObtainStyledAttributes.getInteger(d.f25648C, 100);
        int integer2 = typedArrayObtainStyledAttributes.getInteger(d.f25701z, 1);
        int integer3 = typedArrayObtainStyledAttributes.getInteger(d.f25700y, 1);
        int integer4 = typedArrayObtainStyledAttributes.getInteger(d.f25650E, 1);
        int integer5 = typedArrayObtainStyledAttributes.getInteger(d.f25647B, 1);
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(d.f25649D, false);
        int integer6 = typedArrayObtainStyledAttributes.getInteger(d.f25646A, DEFAULT_MAX_FEED_ITEM_COUNT);
        this.viewPropDelegate.setCurationPageSize(integer);
        this.viewPropDelegate.setCurationCellWidthRatio(integer2);
        this.viewPropDelegate.setCurationCellHeightRatio(integer3);
        this.viewPropDelegate.setCurationSpanCount(integer4);
        this.viewPropDelegate.setCurationOrientation(integer5);
        this.viewPropDelegate.setCurationReverseLayout(z10);
        this.viewPropDelegate.setCurationMaxFeedItemCount(integer6);
        typedArrayObtainStyledAttributes.recycle();
    }

    public void load() {
        if (this.request == null) {
            throw new IllegalStateException("Request must not be null");
        }
        if (this.imageLoader == null) {
            throw new IllegalStateException("Must call recyclerView.setImageLoader(...) first");
        }
        if (getLayoutManager() == null) {
            setLayoutManager(new GridLayoutManager(getContext(), this.viewPropDelegate.getCurationSpanCount(), this.viewPropDelegate.getCurationOrientation(), this.viewPropDelegate.isCurationReverseLayout()));
        }
        if (getAdapter() == null) {
            setAdapter(new CurationsInfiniteAdapter(this.viewPropDelegate, this.imageLoader, this.feedItemClickListener));
        }
        this.presenter = new CurationsInfinitePresenter(this.viewDelegate, this.viewPropDelegate, this.curations, this.pageLoadListener, this.request);
        addOnScrollListener(new CurationsScrollListener((LinearLayoutManager) getLayoutManager(), this.presenter));
        getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.bazaarvoice.bvandroidsdk.CurationsInfiniteRecyclerView.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                CurationsInfiniteRecyclerView curationsInfiniteRecyclerView = CurationsInfiniteRecyclerView.this;
                curationsInfiniteRecyclerView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                CurationsInfiniteRecyclerView.this.viewPropDelegate.setViewDimens(new Point(curationsInfiniteRecyclerView.getWidth(), curationsInfiniteRecyclerView.getHeight()));
                CurationsInfiniteRecyclerView.this.presenter.start();
            }
        });
    }

    @Override // com.bazaarvoice.bvandroidsdk.BVRecyclerView, com.bazaarvoice.bvandroidsdk.BVViewEventListener
    public void onAddedToViewHierarchy() {
        this.curationsAnalyticsManager.sendBvViewGroupAddedToHierarchyEvent(WIDGET_ID, ReportingGroup.RECYCLERVIEW);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setAdapter(RecyclerView.h hVar) {
        if (!(hVar instanceof CurationsInfiniteAdapter)) {
            throw new IllegalStateException("Adapter must be a CurationsInfiniteAdapter");
        }
        CurationsInfiniteAdapter curationsInfiniteAdapter = (CurationsInfiniteAdapter) hVar;
        this.curationsInfiniteAdapter = curationsInfiniteAdapter;
        this.viewDelegate.setCurationsInfiniteAdapter(curationsInfiniteAdapter);
        super.setAdapter(hVar);
    }

    public CurationsInfiniteRecyclerView setCellHeightRatio(int i10) {
        this.viewPropDelegate.setCurationCellHeightRatio(i10);
        return this;
    }

    public CurationsInfiniteRecyclerView setCellWidthRatio(int i10) {
        this.viewPropDelegate.setCurationCellWidthRatio(i10);
        return this;
    }

    public CurationsInfiniteRecyclerView setImageLoader(CurationsImageLoader curationsImageLoader) {
        this.imageLoader = curationsImageLoader;
        return this;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setLayoutManager(RecyclerView.p pVar) {
        if (!(pVar instanceof LinearLayoutManager)) {
            throw new IllegalStateException("LayoutManager must be of type LinearLayoutManager or extend it (e.g. GridLayoutManager)");
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) pVar;
        this.viewPropDelegate.setCurationSpanCount(linearLayoutManager instanceof GridLayoutManager ? ((GridLayoutManager) linearLayoutManager).p3() : 1);
        this.viewPropDelegate.setCurationOrientation(linearLayoutManager.F2());
        this.viewPropDelegate.setCurationReverseLayout(linearLayoutManager.G2());
        super.setLayoutManager(pVar);
    }

    public CurationsInfiniteRecyclerView setMaxFeedItemCount(int i10) {
        this.viewPropDelegate.setCurationMaxFeedItemCount(i10);
        return this;
    }

    public CurationsInfiniteRecyclerView setOnFeedItemClickListener(OnFeedItemClickListener onFeedItemClickListener) {
        this.feedItemClickListener = onFeedItemClickListener;
        return this;
    }

    public CurationsInfiniteRecyclerView setOnPageLoadListener(OnPageLoadListener onPageLoadListener) {
        this.pageLoadListener = onPageLoadListener;
        return this;
    }

    public CurationsInfiniteRecyclerView setOrientation(int i10) {
        this.viewPropDelegate.setCurationOrientation(i10);
        return this;
    }

    public CurationsInfiniteRecyclerView setRequest(CurationsFeedRequest curationsFeedRequest) {
        this.request = curationsFeedRequest;
        return this;
    }

    public CurationsInfiniteRecyclerView setSpanCount(int i10) {
        this.viewPropDelegate.setCurationSpanCount(i10);
        return this;
    }

    public CurationsInfiniteRecyclerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }

    static ImageSize getImageSize(CurationsInfiniteContract.ViewProps viewProps) {
        String str;
        Point viewDimens = viewProps.getViewDimens();
        int i10 = viewDimens.x;
        int i11 = viewDimens.y;
        boolean zIsVertical = isVertical(viewProps);
        int curationSpanCount = viewProps.getCurationSpanCount();
        if (!zIsVertical) {
            i10 = i11;
        }
        if (i10 == 0) {
            if (zIsVertical) {
                str = "horizontal";
            } else {
                str = "vertical";
            }
            throw new IllegalStateException(String.format("Must define the %s dimension", str));
        }
        int i12 = i10 / curationSpanCount;
        int curationCellWidthRatio = viewProps.getCurationCellWidthRatio();
        int curationCellHeightRatio = viewProps.getCurationCellHeightRatio();
        if (zIsVertical) {
            return new ImageSize(i12, (curationCellHeightRatio * i12) / curationCellWidthRatio);
        }
        return new ImageSize((curationCellWidthRatio * i12) / curationCellHeightRatio, i12);
    }

    static boolean isVertical(CurationsInfiniteContract.ViewProps viewProps) {
        if (viewProps.getCurationOrientation() == 1) {
            return true;
        }
        return false;
    }

    @Override // com.bazaarvoice.bvandroidsdk.EventView.ProductView
    public String getProductId() {
        return getExternalId();
    }

    @Override // com.bazaarvoice.bvandroidsdk.BVRecyclerView
    protected void init(Context context, AttributeSet attributeSet) {
        super.init(context, attributeSet);
        this.curationsAnalyticsManager = new CurationsAnalyticsManager(BVSDK.getInstance());
        this.curations = new BVCurations();
        setHasFixedSize(true);
        this.viewDelegate = new CurationsViewDelegate();
        CurationsViewPropDelegate curationsViewPropDelegate = new CurationsViewPropDelegate();
        this.viewPropDelegate = curationsViewPropDelegate;
        curationsViewPropDelegate.setScreenDimens(getScreenDimensions(getContext()));
        parseAttributes(context, attributeSet);
    }

    @Override // com.bazaarvoice.bvandroidsdk.BVRecyclerView, androidx.recyclerview.widget.RecyclerView, android.view.View
    public /* bridge */ /* synthetic */ void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // com.bazaarvoice.bvandroidsdk.BVRecyclerView, com.bazaarvoice.bvandroidsdk.EventView.EventViewListener
    public /* bridge */ /* synthetic */ void onFirstTimeOnScreen() {
        super.onFirstTimeOnScreen();
    }

    @Override // com.bazaarvoice.bvandroidsdk.BVRecyclerView, com.bazaarvoice.bvandroidsdk.BVViewEventListener
    public /* bridge */ /* synthetic */ void onTap() {
        super.onTap();
    }

    @Override // com.bazaarvoice.bvandroidsdk.BVRecyclerView, com.bazaarvoice.bvandroidsdk.BVViewGroupEventListener
    public void onViewGroupInteractedWith() {
        if (isNestedScrollingEnabled()) {
            this.curationsAnalyticsManager.sendUsedFeatureEventScrolled(getExternalId());
        }
    }

    @Override // com.bazaarvoice.bvandroidsdk.BVRecyclerView, com.bazaarvoice.bvandroidsdk.EventView.EventViewListener
    public /* bridge */ /* synthetic */ void onVisibleOnScreenStateChanged(boolean z10) {
        super.onVisibleOnScreenStateChanged(z10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean startNestedScroll(int i10) {
        if (!isNestedScrollingEnabled()) {
            this.curationsAnalyticsManager.sendUsedFeatureEventScrolled(getExternalId());
        }
        return super.startNestedScroll(i10);
    }
}
