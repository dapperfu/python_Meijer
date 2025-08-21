package com.bazaarvoice.bvandroidsdk;

import android.graphics.Point;
import java.util.List;

/* loaded from: classes4.dex */
interface CurationsInfiniteContract {

    public interface Presenter {
        void onScroll(int i10, int i11);

        void start();
    }

    public interface View {
        void addFeedItems(List<CurationsFeedItem> list);
    }

    public interface ViewProps {
        int getCurationCellHeightRatio();

        int getCurationCellWidthRatio();

        int getCurationMaxFeedItemCount();

        int getCurationOrientation();

        int getCurationPageSize();

        int getCurationSpanCount();

        Point getScreenDimens();

        Point getViewDimens();

        boolean isCurationReverseLayout();
    }
}
