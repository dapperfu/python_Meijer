package com.bazaarvoice.bvandroidsdk;

import android.graphics.Point;
import com.bazaarvoice.bvandroidsdk.BVEventValues;
import com.bazaarvoice.bvandroidsdk.CurationsFeedRequest;
import com.bazaarvoice.bvandroidsdk.CurationsInfiniteContract;
import com.bazaarvoice.bvandroidsdk.CurationsInfiniteRecyclerView;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
class CurationsInfinitePresenter implements CurationsInfiniteContract.Presenter {
    private static final float LOAD_MORE_THRESHOLD_PERCENTAGE = 0.2f;
    private static final String TAG = "CurInfPresenter";
    private final BVCurations curations;
    private final CurationsInfiniteRecyclerView.OnPageLoadListener pageLoadListener;
    private PagingFeedCallback pagingCb;
    private final CurationsFeedRequest request;
    private final CurationsInfiniteContract.View view;
    private final CurationsInfiniteContract.ViewProps viewProps;
    private List<CurationsFeedItem> feedItems = new ArrayList();
    private int pageIndex = 0;
    private boolean updateInProgress = false;
    private boolean loadedAllFeedItems = false;

    private static abstract class CurationsPagingFeedCallback implements CurationsFeedCallback {
        private final int pageIndex;

        protected int getPageIndex() {
            return this.pageIndex;
        }

        CurationsPagingFeedCallback(int i10) {
            this.pageIndex = i10;
        }
    }

    private static final class PagingFeedCallback extends CurationsPagingFeedCallback {
        private final int expectedPageSize;
        private final CurationsInfiniteRecyclerView.OnPageLoadListener pageLoadListener;
        private final CurationsInfinitePresenter presenter;

        @Override // com.bazaarvoice.bvandroidsdk.CurationsFeedCallback
        public void onFailure(Throwable th2) {
            BVSDK.getInstance().getBvPixel().track(new BVErrorReport(BVEventValues.BVProductType.CURATIONS, this.presenter.request.getClass().getSimpleName(), new BazaarException(th2.getMessage(), th2)));
            this.presenter.failed();
            CurationsInfiniteRecyclerView.OnPageLoadListener onPageLoadListener = this.pageLoadListener;
            if (onPageLoadListener != null) {
                onPageLoadListener.onPageLoadFailure(getPageIndex(), th2);
            }
        }

        @Override // com.bazaarvoice.bvandroidsdk.CurationsFeedCallback
        public void onSuccess(List<CurationsFeedItem> list) {
            this.presenter.updateContent(this.expectedPageSize, list);
            CurationsInfiniteRecyclerView.OnPageLoadListener onPageLoadListener = this.pageLoadListener;
            if (onPageLoadListener != null) {
                onPageLoadListener.onPageLoadSuccess(getPageIndex(), list.size());
            }
        }

        PagingFeedCallback(int i10, CurationsInfiniteRecyclerView.OnPageLoadListener onPageLoadListener, CurationsInfinitePresenter curationsInfinitePresenter, int i11) {
            super(i10);
            this.pageLoadListener = onPageLoadListener;
            this.presenter = curationsInfinitePresenter;
            this.expectedPageSize = i11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void failed() {
        this.updateInProgress = false;
    }

    private void loadMore() {
        loadMore(this.viewProps.getCurationPageSize());
    }

    private static int inverseSpanCount(int i10, int i11) {
        return (i10 + 100) / i11;
    }

    private void loadMore(int i10) {
        this.updateInProgress = true;
        CurationsFeedRequest.Builder builderLimit = this.request.newBuilder().limit(Integer.valueOf(i10));
        if (this.feedItems.size() > 0) {
            List<CurationsFeedItem> list = this.feedItems;
            builderLimit.before(Long.valueOf(list.get(list.size() - 1).getTimestamp().longValue() - 1));
        }
        builderLimit.hasPhotoOrVideo(Boolean.TRUE);
        int i11 = this.pageIndex;
        this.pageIndex = i11 + 1;
        this.pagingCb = new PagingFeedCallback(i11, this.pageLoadListener, this, i10);
        this.curations.getCurationsFeedItems(builderLimit.build(), this.pagingCb);
    }

    private static int normalizeBySpanCount(int i10, int i11) {
        return (i10 / i11) + (i10 % i11 != 0 ? 1 : 0);
    }

    private boolean shouldLoadMore(int i10, int i11) {
        return !this.loadedAllFeedItems && this.feedItems.size() < this.viewProps.getCurationMaxFeedItemCount() && i10 > 0 && !this.updateInProgress && normalizeBySpanCount((this.feedItems.size() - 1) - i11, this.viewProps.getCurationSpanCount()) <= normalizeBySpanCount(getLoadMoreThreshold(this.viewProps), this.viewProps.getCurationSpanCount());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateContent(int i10, List<CurationsFeedItem> list) {
        this.feedItems.addAll(list);
        this.view.addFeedItems(list);
        if (list.size() < i10) {
            this.loadedAllFeedItems = true;
        }
        this.updateInProgress = false;
    }

    @Override // com.bazaarvoice.bvandroidsdk.CurationsInfiniteContract.Presenter
    public void start() {
        loadMore(getInitialPageSize(this.viewProps));
    }

    CurationsInfinitePresenter(CurationsInfiniteContract.View view, CurationsInfiniteContract.ViewProps viewProps, BVCurations bVCurations, CurationsInfiniteRecyclerView.OnPageLoadListener onPageLoadListener, CurationsFeedRequest curationsFeedRequest) {
        this.view = view;
        this.viewProps = viewProps;
        this.curations = bVCurations;
        this.pageLoadListener = onPageLoadListener;
        this.request = curationsFeedRequest;
    }

    private static int getInitialPageSize(CurationsInfiniteContract.ViewProps viewProps) {
        return Math.max(getPageSizeForFullScreen(viewProps), viewProps.getCurationPageSize());
    }

    private static int getLoadMoreThreshold(CurationsInfiniteContract.ViewProps viewProps) {
        return (int) (viewProps.getCurationPageSize() * 0.2f);
    }

    private static int getPageSizeForFullScreen(CurationsInfiniteContract.ViewProps viewProps) {
        int i10;
        int widthPixels;
        Point screenDimens = viewProps.getScreenDimens();
        CurationsInfiniteRecyclerView.ImageSize imageSize = CurationsInfiniteRecyclerView.getImageSize(viewProps);
        boolean zIsVertical = CurationsInfiniteRecyclerView.isVertical(viewProps);
        if (zIsVertical) {
            i10 = screenDimens.y;
        } else {
            i10 = screenDimens.x;
        }
        if (zIsVertical) {
            widthPixels = imageSize.getHeightPixels();
        } else {
            widthPixels = imageSize.getWidthPixels();
        }
        return inverseSpanCount(i10, widthPixels) * viewProps.getCurationSpanCount();
    }

    @Override // com.bazaarvoice.bvandroidsdk.CurationsInfiniteContract.Presenter
    public void onScroll(int i10, int i11) {
        if (shouldLoadMore(i10, i11)) {
            loadMore();
        }
    }
}
