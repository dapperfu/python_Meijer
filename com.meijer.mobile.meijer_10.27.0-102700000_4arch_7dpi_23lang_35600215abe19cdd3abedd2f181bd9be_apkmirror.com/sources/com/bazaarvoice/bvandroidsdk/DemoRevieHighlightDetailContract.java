package com.bazaarvoice.bvandroidsdk;

/* loaded from: classes4.dex */
public interface DemoRevieHighlightDetailContract {

    public interface UserActionsListener {
        void loadReviewHighlights(boolean z10);
    }

    public interface View {
        void showDialogWithMessage(String str);

        void showReviewHighlights(ReviewHighlights reviewHighlights);
    }
}
