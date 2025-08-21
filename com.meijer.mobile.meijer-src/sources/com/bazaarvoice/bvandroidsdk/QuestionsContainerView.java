package com.bazaarvoice.bvandroidsdk;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import com.bazaarvoice.bvandroidsdk.BVConversationsClient;
import com.bazaarvoice.bvandroidsdk.BVEventValues;
import com.bazaarvoice.bvandroidsdk.EventView;

@Deprecated
/* loaded from: classes4.dex */
public final class QuestionsContainerView extends BVContainerView implements BVConversationsClient.DisplayLoader<QuestionAndAnswerRequest, QuestionAndAnswerResponse>, EventView.EventViewListener<QuestionsContainerView>, EventView.ProductView {
    private LoadCallDisplay call;
    private ConversationsAnalyticsManager convAnMan;
    private boolean onScreen;
    private String productId;

    public QuestionsContainerView(Context context) {
        super(context);
        this.onScreen = false;
    }

    @Override // com.bazaarvoice.bvandroidsdk.BVConversationsClient.DisplayLoader
    public void loadAsync(LoadCallDisplay<QuestionAndAnswerRequest, QuestionAndAnswerResponse> loadCallDisplay, ConversationsCallback<QuestionAndAnswerResponse> conversationsCallback) {
        this.call = loadCallDisplay;
        this.convAnMan = loadCallDisplay.getConversationsAnalyticsManager();
        this.productId = ((QuestionAndAnswerRequest) loadCallDisplay.getRequest()).getProductId();
        loadCallDisplay.loadAsync(conversationsCallback);
        trySendUsedFeatureInViewEvent();
    }

    @Override // com.bazaarvoice.bvandroidsdk.EventView.EventViewListener
    public void onFirstTimeOnScreen() {
        this.onScreen = true;
        trySendUsedFeatureInViewEvent();
    }

    @Override // com.bazaarvoice.bvandroidsdk.EventView.EventViewListener
    public void onVisibleOnScreenStateChanged(boolean z10) {
    }

    private void trySendUsedFeatureInViewEvent() {
        String str;
        ConversationsAnalyticsManager conversationsAnalyticsManager;
        if (!this.onScreen || (str = this.productId) == null || (conversationsAnalyticsManager = this.convAnMan) == null) {
            return;
        }
        conversationsAnalyticsManager.sendUsedFeatureInViewEvent(str, "QuestionsContainerView", BVEventValues.BVProductType.CONVERSATIONS_QANDA);
    }

    @Override // com.bazaarvoice.bvandroidsdk.EventView.ProductView
    public String getProductId() {
        return this.productId;
    }

    public QuestionsContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.onScreen = false;
    }

    @Override // com.bazaarvoice.bvandroidsdk.BVContainerView
    void init() {
        super.init();
        EventView.bind(this, this, this);
    }

    @Override // com.bazaarvoice.bvandroidsdk.BVContainerView, com.bazaarvoice.bvandroidsdk.BVViewEventListener
    public /* bridge */ /* synthetic */ void onAddedToViewHierarchy() {
        super.onAddedToViewHierarchy();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        LoadCallDisplay loadCallDisplay = this.call;
        if (loadCallDisplay != null) {
            loadCallDisplay.cancel();
            this.call = null;
        }
    }

    @Override // com.bazaarvoice.bvandroidsdk.BVContainerView, android.view.View
    public /* bridge */ /* synthetic */ void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // com.bazaarvoice.bvandroidsdk.BVContainerView, com.bazaarvoice.bvandroidsdk.BVViewEventListener
    public /* bridge */ /* synthetic */ void onTap() {
        super.onTap();
    }

    public QuestionsContainerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.onScreen = false;
    }

    public QuestionsContainerView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.onScreen = false;
    }

    @Override // com.bazaarvoice.bvandroidsdk.BVConversationsClient.DisplayLoader
    public void loadAsync(LoadCallDisplay<QuestionAndAnswerRequest, QuestionAndAnswerResponse> loadCallDisplay, ConversationsDisplayCallback<QuestionAndAnswerResponse> conversationsDisplayCallback) {
        this.call = loadCallDisplay;
        this.convAnMan = loadCallDisplay.getConversationsAnalyticsManager();
        this.productId = ((QuestionAndAnswerRequest) loadCallDisplay.getRequest()).getProductId();
        loadCallDisplay.loadAsync(conversationsDisplayCallback);
        trySendUsedFeatureInViewEvent();
    }
}
